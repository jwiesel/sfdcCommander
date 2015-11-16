/**
 * 
 */
package de.sfdccommander.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceConstants;
import org.custommonkey.xmlunit.examples.RecursiveElementNameAndTextQualifier;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class XmlComparer {

    private static final String IGNORE_NODE = "#text";
    SfdcCommander commander;

    public XmlComparer() {
        commander = SfdcCommander.getInstance();
    }

    public void compareXml(FileReader firstXml, FileReader secondXml)
            throws CommanderException {
        commander.info("Comparing Orgs");
        Diff diff = null;
        try {
            diff = new Diff(firstXml, secondXml);
            // Ignore Order
            diff.overrideElementQualifier(
                    new RecursiveElementNameAndTextQualifier());
            diff.overrideDifferenceListener(
                    new IgnoreNamedElementsDifferenceListener());
            DetailedDiff detailedDiff = new DetailedDiff(diff);
            List<Difference> diffList = detailedDiff.getAllDifferences();
            for (Difference actDiff : diffList) {
                if (actDiff
                        .getId() != DifferenceConstants.CHILD_NODELIST_SEQUENCE_ID) {
                    if (actDiff.getControlNodeDetail()
                            .getXpathLocation() == null) {
                        // added node
                        commander
                                .info("Node of Type '"
                                        + actDiff.getTestNodeDetail().getNode()
                                                .getNodeName()
                                        + "' added at '"
                                        + actDiff.getTestNodeDetail().getNode()
                                                .getParentNode().getNodeName()
                                        + "'");
                        commander.info("Details:");
                        NodeList tmpChildNodes = actDiff.getTestNodeDetail()
                                .getNode().getChildNodes();
                        for (int i = 0; i < tmpChildNodes.getLength(); i++) {
                            if (!tmpChildNodes.item(i).getNodeName()
                                    .equals(IGNORE_NODE)) {
                                commander.info(
                                        tmpChildNodes.item(i).getNodeName()
                                                + " : " + tmpChildNodes.item(i)
                                                        .getTextContent());
                            }
                        }

                    } else if (actDiff.getTestNodeDetail()
                            .getXpathLocation() == null) {
                        // removed node
                        commander.info(
                                "Node removed:" + actDiff.getControlNodeDetail()
                                        .getNode().getNodeName());

                    } else {
                        // changed node
                        commander.info("Node changed:"
                                + actDiff.getControlNodeDetail().getNode()
                                        .getParentNode().getNodeName()
                                + " : From: "
                                + actDiff.getControlNodeDetail().getNode()
                                        .getTextContent()
                                + " : To: " + actDiff.getTestNodeDetail()
                                        .getNode().getTextContent());
                    }
                }

            }
            commander.info("Comparison completed");
        } catch (SAXException e) {
            throw new CommanderException("Could not generate diff", e);
        } catch (IOException e) {
            throw new CommanderException(
                    "Could not open files to generate diff.", e);
        }

    }
}
