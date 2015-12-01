/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.sfdccommander.controller.helper.CommanderException;

/**
 * @author jochen
 *
 */
public class HtmlRendererTest {

    @Test
    public void mergeFilesTest() throws IOException, CommanderException,
            ParserConfigurationException, SAXException {
        HtmlRenderer renderer = new HtmlRenderer("SampleOrg",
                "/a/destination/folder");
        File resourceFolder = new File("src/test/resources/roles");
        File tmpFolder = new File("src/test/resources/mergeFilesTest");
        File testFile1 = new File(tmpFolder.getAbsolutePath() + "/CEO.role");
        File testFile2 = new File(tmpFolder.getAbsolutePath() + "/CFO.role");
        tmpFolder.mkdir();
        Files.copy(Paths.get(resourceFolder.getAbsolutePath() + "/CEO.role"),
                testFile1.toPath());
        Files.copy(Paths.get(resourceFolder.getAbsolutePath() + "/CFO.role"),
                testFile2.toPath());

        renderer.mergeFiles("roles", tmpFolder);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        File allRoles = new File(
                tmpFolder.getAbsolutePath() + "/all_roles.xml");
        Document doc = dBuilder.parse(allRoles);
        Element rootElement = doc.getDocumentElement();
        Assert.assertEquals("roles", rootElement.getNodeName());
        Assert.assertEquals("http://soap.sforce.com/2006/04/metadata",
                rootElement.getNamespaceURI());
        NodeList roles = rootElement.getChildNodes();
        int j = 0;
        for (int i = 0; i < roles.getLength(); i++) {
            if (roles.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Assert.assertEquals("Role", roles.item(i).getNodeName());
                j++;
            }
        }
        Assert.assertEquals(2, j);

        // Cleanup
        allRoles.delete();
        tmpFolder.delete();
        Assert.assertFalse(tmpFolder.exists());
    }

    @Test
    public void renderTest() throws CommanderException {
        File indexTransformer = new File("config/transformer/index.xsl");
        File indexSource = new File("src/test/resources/lists.xml");
        File indexOutput = new File("src/test/resources/index.html");
        indexOutput.delete();
        HtmlRenderer renderer = new HtmlRenderer("", "");
        renderer.render(indexTransformer, indexSource, indexOutput);
        Assert.assertTrue(indexOutput.isFile());
    }

    @Test
    public void generateFileListTest() throws CommanderException, SAXException,
            IOException, ParserConfigurationException {
        File resourceFolder = new File("src/test/resources/roles");
        File targetFolder = new File("src/test/resources/lists");
        targetFolder.mkdirs();
        HtmlRenderer renderer = new HtmlRenderer("", "");
        renderer.generateFileList("roles", resourceFolder, targetFolder);

        File generatedFileList = new File("src/test/resources/lists/roles.xml");
        Assert.assertTrue(generatedFileList.exists());

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(generatedFileList);
        Element rootElement = doc.getDocumentElement();
        Assert.assertEquals("Files", rootElement.getNodeName());
        Assert.assertEquals("http://soap.sforce.com/2006/04/metadata",
                rootElement.getNamespaceURI());
        NodeList files = rootElement.getElementsByTagName("file");
        Assert.assertEquals(2, files.getLength());

        // Cleanup
        generatedFileList.delete();
        targetFolder.delete();
        Assert.assertFalse(targetFolder.exists());
    }

}
