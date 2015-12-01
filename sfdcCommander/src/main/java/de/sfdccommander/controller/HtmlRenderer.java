/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import de.sfdccommander.controller.helper.CodeFileNameFilter;
import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.controller.helper.CopyDirVisitor;
import de.sfdccommander.controller.helper.DeleteDirVisitor;
import de.sfdccommander.controller.helper.XmlFileNameFilter;
import de.sfdccommander.controller.helper.XsltFileNameFilter;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class HtmlRenderer {

    /**
     * System name renderings.
     */
    private final String systemName;

    /**
     * render path for html output.
     */
    private final String renderPath;

    /**
     * 
     */
    private SfdcCommander commander;

    /**
     * @param aConfig
     *            Config for renderings.
     */
    public HtmlRenderer(String aSystemName, String aRenderPath) {
        this.systemName = aSystemName;
        this.renderPath = aRenderPath;
    }

    public void generateOutput() throws CommanderException {
        commander = SfdcCommander.getInstance();
        File[] transformFiles;

        File transformerFolder = new File("config/transformer");

        // prepare HTML output folder
        File outputFolder = new File(renderPath + "/" + systemName);
        if (outputFolder.exists()) {
            try {
                // delete output folder
                Files.walkFileTree(outputFolder.toPath(),
                        new DeleteDirVisitor());
            } catch (IOException e) {
                throw new CommanderException(
                        "Could not delete folder: " + outputFolder, e);
            }
        }
        outputFolder.mkdirs();

        if (transformerFolder.isDirectory()) {

            // copy css, images, fonts and js
            String[] helperFolder = { "css", "images", "script", "fonts" };

            for (String folder : helperFolder) {
                Path fromPath = Paths.get(
                        transformerFolder.getAbsolutePath() + "/" + folder);
                Path toPath = Paths
                        .get(outputFolder.getAbsolutePath() + "/" + folder);
                try {
                    Files.walkFileTree(fromPath,
                            new CopyDirVisitor(fromPath, toPath));
                } catch (IOException e) {
                    throw new CommanderException("Could not copy folder "
                            + fromPath.toString() + " to " + toPath.toString());
                }
            }

            // copy documents if available
            File documentsFolder = new File(
                    systemName + "/unpackaged/documents");
            if (documentsFolder.exists()) {
                commander.info("Copying documents");
                try {
                    Files.walkFileTree(documentsFolder.toPath(),
                            new CopyDirVisitor(documentsFolder.toPath(),
                                    outputFolder.toPath()));
                } catch (IOException e) {
                    throw new CommanderException("Could not copy folder "
                            + documentsFolder.getAbsolutePath() + " to "
                            + outputFolder.getAbsolutePath());
                }
            }

            // get xslt files
            transformFiles = transformerFolder
                    .listFiles(new XsltFileNameFilter());
            Arrays.sort(transformFiles);
            for (File transformer : transformFiles) {
                // create folder for current transformation file
                String tmpTransformerName = transformer.getName().substring(0,
                        transformer.getName().lastIndexOf("."));
                File tmpOutputFolder = new File(outputFolder.getAbsolutePath()
                        + "/" + tmpTransformerName);
                tmpOutputFolder.mkdirs();

                // get folder with sfdc source files
                File sourceFolder = new File(
                        systemName + "/unpackaged/" + tmpTransformerName);

                File targetFolder;

                if (sourceFolder.exists()) {
                    // join roles and territories
                    if (tmpTransformerName.equals("roles")
                            || tmpTransformerName.equals("territories")) {
                        mergeFiles(tmpTransformerName, sourceFolder);
                    }
                    if (!tmpTransformerName.equals("lists")) {
                        commander.info("Generating output for "
                                + transformer.getName());
                        targetFolder = new File(
                                systemName + "/unpackaged/lists");
                        targetFolder.mkdirs();
                        generateFileList(tmpTransformerName, sourceFolder,
                                targetFolder);
                        // generate html files
                        File[] xmlFileList = sourceFolder
                                .listFiles(new XmlFileNameFilter());
                        Arrays.sort(xmlFileList);
                        for (File xmlFile : xmlFileList) {
                            render(transformer, xmlFile,
                                    new File(tmpOutputFolder.getAbsolutePath()
                                            + "/"
                                            + xmlFile.getName().substring(0,
                                                    xmlFile.getName()
                                                            .lastIndexOf("."))
                                            + ".html"));
                        }
                        if (tmpTransformerName.equals("triggers")
                                || tmpTransformerName.equals("classes")
                                || tmpTransformerName.equals("pages")
                                || tmpTransformerName.equals("scontrols")) {
                            File[] codeFileList = sourceFolder
                                    .listFiles(new CodeFileNameFilter());
                            Arrays.sort(codeFileList);
                            for (File codeFile : codeFileList) {
                                File codeTargetFile = new File(
                                        tmpOutputFolder.getAbsolutePath() + "/"
                                                + codeFile.getName());
                                try {
                                    Files.copy(codeFile.toPath(),
                                            codeTargetFile.toPath());
                                } catch (IOException e) {
                                    throw new CommanderException(
                                            "Could not copy file "
                                                    + codeFile.getAbsolutePath()
                                                    + " to "
                                                    + codeTargetFile
                                                            .getAbsolutePath(),
                                            e);
                                }
                            }
                        }
                    }

                }
            }
            // Generate Lists
            File listFolder = new File(systemName + "/unpackaged/lists");
            generateFileList("lists", listFolder, new File(systemName));
            File listTransformer = new File(
                    transformerFolder.getAbsolutePath() + "/lists.xslt");
            for (File xmlFile : listFolder.listFiles()) {
                render(listTransformer, xmlFile,
                        new File(outputFolder.getAbsolutePath() + "/lists/"
                                + xmlFile.getName().substring(0,
                                        xmlFile.getName().lastIndexOf("."))
                        + ".html"));
            }

            // Generate Index
            File indexTransformer = new File(
                    transformerFolder.getAbsolutePath() + "/index.xsl");
            File indexSource = new File(systemName + "/lists.xml");
            File indexOutput = new File(
                    outputFolder.getAbsolutePath() + "/index.html");
            render(indexTransformer, indexSource, indexOutput);
            commander.info("Output generated");
        }
    }

    /**
     * @param xslFile
     *            Transformation file for rendering.
     * @param xmlFile
     *            data file for rendering.
     * @param htmlFile
     *            output file for rendering.
     * @throws CommanderException
     */
    public final void render(final File xslFile, final File xmlFile,
            final File htmlFile) throws CommanderException {

        TransformerFactory tfactory = TransformerFactory.newInstance();
        try {
            FileOutputStream fos = new FileOutputStream(htmlFile);

            // Create a transformer for the stylesheet.
            Transformer transformer;
            transformer = tfactory.newTransformer(new StreamSource(xslFile));

            // Transform the source XML to System.out.
            transformer.transform(new StreamSource(xmlFile),
                    new StreamResult(fos));
            fos.close();
        } catch (TransformerConfigurationException e) {
            throw new CommanderException("Could not configure transformer "
                    + xslFile.getAbsolutePath(), e);
        } catch (TransformerException e) {
            throw new CommanderException(
                    "Could not transform file " + xmlFile.getAbsolutePath(), e);
        } catch (FileNotFoundException e) {
            throw new CommanderException(
                    "Could not create new file " + htmlFile.getAbsolutePath()
                            + ". another blocked file or folder might already exist.",
                    e);
        } catch (IOException e) {
            throw new CommanderException(
                    "Could not save file " + htmlFile.getAbsolutePath(), e);
        }
    }

    /**
     * @param entity
     *            Entity which should be merged (e.g. roles)
     * @param sourceFolder
     *            Source folder of entity files (e.g. contains CEO.role)
     * @throws CommanderException
     *             Exception if merge did not work.
     */
    public void mergeFiles(String entity, File sourceFolder)
            throws CommanderException {

        File allRecordsFile = new File(sourceFolder.getAbsolutePath() + "/"
                + "all_" + entity + ".xml");
        DocumentBuilderFactory docFactory = DocumentBuilderFactory
                .newInstance();
        docFactory.setNamespaceAware(true);
        try {
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();

            Element rootElement = doc.createElement(entity);
            rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns",
                    "http://soap.sforce.com/2006/04/metadata");
            doc.appendChild(rootElement);
            File[] recordFileList = sourceFolder.listFiles();
            Arrays.sort(recordFileList);
            for (File recordFile : recordFileList) {
                if (!recordFile.getAbsolutePath()
                        .equals(allRecordsFile.getAbsolutePath())) {
                    Document entryDoc = docBuilder.parse(recordFile);
                    Node importNode = doc
                            .importNode(entryDoc.getDocumentElement(), true);
                    rootElement.appendChild(importNode);
                    recordFile.delete();
                }
            }
            TransformerFactory transformerFactory = TransformerFactory
                    .newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(doc),
                    new StreamResult(allRecordsFile));
        } catch (ParserConfigurationException e) {
            throw new CommanderException(
                    "Could not configure document builder for "
                            + allRecordsFile.getAbsolutePath(),
                    e);
        } catch (SAXException e) {
            throw new CommanderException(
                    "Could not parse one of the xml files in "
                            + sourceFolder.getAbsolutePath(),
                    e);
        } catch (IOException e) {
            throw new CommanderException(
                    "Could not open one of the xml files in "
                            + sourceFolder.getAbsolutePath(),
                    e);
        } catch (TransformerConfigurationException e) {
            throw new CommanderException(
                    "Could not configure xml-transformer for "
                            + allRecordsFile.getAbsolutePath(),
                    e);
        } catch (TransformerException e) {
            new CommanderException("Could not transform xml-result into file "
                    + allRecordsFile.getAbsolutePath(), e);
        }
    }

    public void generateFileList(final String entity, final File sourceFolder,
            final File targetFolder) throws CommanderException {
        File generatedFileList = new File(
                targetFolder.getAbsolutePath() + "/" + entity + ".xml");
        DocumentBuilderFactory docFactory = DocumentBuilderFactory
                .newInstance();
        docFactory.setNamespaceAware(true);
        try {
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();

            Element rootElement = doc.createElement("Files");
            rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns",
                    "http://soap.sforce.com/2006/04/metadata");
            doc.appendChild(rootElement);
            Element entityElement = doc.createElement("entity");
            entityElement.appendChild(doc.createTextNode(entity));
            entityElement.setAttributeNS("http://www.w3.org/2000/xmlns/",
                    "xmlns", "http://soap.sforce.com/2006/04/metadata");
            rootElement.appendChild(entityElement);
            File[] fileList = sourceFolder.listFiles(new XmlFileNameFilter());
            Arrays.sort(fileList);
            for (File actFile : fileList) {
                Element newFileElement = doc.createElement("file");
                newFileElement.appendChild(doc.createTextNode(actFile.getName()
                        .substring(0, actFile.getName().lastIndexOf("."))));
                newFileElement.setAttributeNS("http://www.w3.org/2000/xmlns/",
                        "xmlns", "http://soap.sforce.com/2006/04/metadata");
                rootElement.appendChild(newFileElement);
            }

            TransformerFactory transformerFactory = TransformerFactory
                    .newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(doc),
                    new StreamResult(generatedFileList));
        } catch (ParserConfigurationException e) {
            throw new CommanderException(
                    "Could not configure document builder for "
                            + generatedFileList.getAbsolutePath(),
                    e);
        } catch (TransformerException e) {
            new CommanderException("Could not transform xml-result into file "
                    + generatedFileList.getAbsolutePath(), e);
        }
    }

}
