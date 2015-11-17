/**
 * 
 */
package de.sfdccommander.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

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
                        for (File xmlFile : sourceFolder
                                .listFiles(new XmlFileNameFilter())) {
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
                            for (File codeFile : sourceFolder
                                    .listFiles(new CodeFileNameFilter())) {
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
     *            entity for merge process.
     * @param sourceFolder
     *            source folder for merge process.
     * @throws CommanderException
     */
    public final void mergeFiles(final String entity, final File sourceFolder)
            throws CommanderException {

        File allRecordsFile = new File(sourceFolder.getAbsolutePath() + "/"
                + "all_" + entity + ".xml");

        try {
            FileOutputStream fos = new FileOutputStream(allRecordsFile);

            fos.write(("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n")
                    .getBytes());
            fos.write(("<" + entity
                    + " xmlns=\"http://soap.sforce.com/2006/04/metadata\">\r\n")
                            .getBytes());

            String actLine;
            for (File recordFile : sourceFolder.listFiles()) {
                if (!recordFile.getAbsolutePath()
                        .equals(allRecordsFile.getAbsolutePath())) {
                    InputStreamReader isr = new InputStreamReader(
                            new FileInputStream(recordFile));
                    BufferedReader br = new BufferedReader(isr);

                    // Read first line with xml version
                    actLine = br.readLine();
                    while ((actLine = br.readLine()) != null) {
                        if (actLine.contains(
                                " xmlns=\"http://soap.sforce.com/2006/04/metadata\"")) {
                            fos.write(actLine.replace(
                                    " xmlns=\"http://soap.sforce.com/2006/04/metadata\"",
                                    "").concat("\r\n").getBytes());
                        } else {
                            fos.write(actLine.concat("\r\n").getBytes());
                        }

                    }
                    br.close();
                    recordFile.delete();
                }
            }
            fos.write(("</" + entity + ">").getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            throw new CommanderException(
                    "Could not find either " + allRecordsFile.getAbsolutePath()
                            + " or one of the entity files.",
                    e);
        } catch (IOException e) {
            throw new CommanderException(
                    "Could not write " + allRecordsFile.getAbsolutePath()
                            + " or read one of the entity files.",
                    e);
        }
    }

    public void generateFileList(final String entity, final File sourceFolder,
            final File targetFolder) throws CommanderException {
        File output = null;
        try {
            output = new File(
                    targetFolder.getAbsolutePath() + "/" + entity + ".xml");
            FileOutputStream fos = new FileOutputStream(output);

            fos.write(("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n")
                    .getBytes());
            fos.write(
                    ("<Files xmlns=\"http://soap.sforce.com/2006/04/metadata\">\r\n")
                            .getBytes());
            fos.write(("<entity>" + entity + "</entity>\r\n").getBytes());
            fos.write(("<system>" + systemName + "</system>\r\n").getBytes());

            String cutFileName;
            for (File actFile : sourceFolder
                    .listFiles(new XmlFileNameFilter())) {
                cutFileName = actFile.getName().substring(0,
                        actFile.getName().lastIndexOf("."));
                fos.write(("<file>" + cutFileName + "</file>\r\n").getBytes());
            }

            fos.write(("</Files>").getBytes());
            fos.close();
        } catch (IOException e) {
            throw new CommanderException(
                    "Could not generate file-list " + output.getAbsolutePath(),
                    e);
        }

    }

}
