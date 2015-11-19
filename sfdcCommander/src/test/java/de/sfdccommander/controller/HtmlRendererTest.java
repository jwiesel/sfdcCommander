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
        tmpFolder.mkdir();
        Files.copy(Paths.get(resourceFolder.getAbsolutePath() + "/CEO.role"),
                Paths.get(tmpFolder.getAbsolutePath() + "/CEO.role"));
        Files.copy(Paths.get(resourceFolder.getAbsolutePath() + "/CFO.role"),
                Paths.get(tmpFolder.getAbsolutePath() + "/CFO.role"));

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
    }

}
