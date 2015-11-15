/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Map;

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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sforce.soap.partner.DescribeGlobalResult;
import com.sforce.soap.partner.DescribeGlobalSObjectResult;
import com.sforce.soap.partner.DescribeSObjectResult;
import com.sforce.soap.partner.Field;
import com.sforce.soap.partner.SoapBindingStub;
import com.sforce.soap.partner.fault.InvalidSObjectFault;
import com.sforce.soap.partner.fault.UnexpectedErrorFault;

import de.sfdccommander.controller.connection.SfdcConnectionPool;
import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.model.CustomObjectFieldMap;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class ObjectExporter {

    private final CommanderConfig tmpConfig;

    static SoapBindingStub binding;

    private SfdcCommander commander;

    private SfdcConnectionPool connPool;

    public ObjectExporter(CommanderConfig aConfig) {
        tmpConfig = aConfig;
    }

    public void exportObjects() {
        commander = SfdcCommander.getInstance();
        connPool = SfdcConnectionPool.getInstance();

        binding = connPool.getBinding(tmpConfig);

        DescribeGlobalResult global;
        try {
            global = binding.describeGlobal();
            for (DescribeGlobalSObjectResult objectGlobalResult : global
                    .getSobjects()) {
                renderObjectXml(objectGlobalResult);
            }
        } catch (UnexpectedErrorFault e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void renderObjectXml(DescribeGlobalSObjectResult aObject) {
        SfdcCommander commander = SfdcCommander.getInstance();
        File objectFile = new File(tmpConfig.getSfSystemname()
                + "/unpackaged/objects/" + aObject.getName() + ".object");

        if (objectFile.exists()) {
            try {
                // read xml-file
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory
                        .newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(objectFile);
                Element customObjectElement = doc.getDocumentElement();

                // Add salesforce standard fields
                DescribeSObjectResult tmpDescribeSObject = binding
                        .describeSObject(aObject.getName());
                commander.info("Generating enhanced XML for object: "
                        + tmpDescribeSObject.getName());
                for (Field field : tmpDescribeSObject.getFields()) {
                    if (!field.isCustom()) {
                        if (!field.getType().toString().equals("picklist")) {
                            customObjectElement
                                    .appendChild(getFieldElement(doc, field));
                        }
                    }
                }
                // update xml-file
                TransformerFactory transformerFactory = TransformerFactory
                        .newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                addXmlNamespace(doc.getDocumentElement());
                DOMSource source = new DOMSource(doc);

                StreamResult result = new StreamResult(objectFile);
                // StreamResult result = new StreamResult(System.out);
                transformer.transform(source, result);

            } catch (ParserConfigurationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SAXException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (TransformerConfigurationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (TransformerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvalidSObjectFault e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (UnexpectedErrorFault e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (RemoteException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    private Element getFieldElement(Document aDoc, Field aField) {
        Element field = aDoc.createElement("fields");

        CustomObjectFieldMap map = new CustomObjectFieldMap(aField);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Element element = aDoc.createElement(entry.getKey());
            element.appendChild(aDoc.createTextNode(entry.getValue()));
            field.appendChild(element);
        }
        return field;
    }

    public static void addXmlNamespace(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node currentNode = nodeList.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                // calls this method for all the children which is Element
                Element element = (Element) currentNode;
                element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns",
                        "http://soap.sforce.com/2006/04/metadata");
                addXmlNamespace(currentNode);
            }
        }
    }

}
