/**
 * 
 */
package de.sfdccommander.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.sforce.soap.partner.DescribeGlobalResult;
import com.sforce.soap.partner.DescribeGlobalSObjectResult;
import com.sforce.soap.partner.DescribeSObjectResult;
import com.sforce.soap.partner.Field;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;

import de.sfdccommander.controller.connection.SfdcConnectionPool;
import de.sfdccommander.controller.helper.CharacterEncoder;
import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class ObjectExporter {

    private final CommanderConfig tmpConfig;

    static PartnerConnection connection;

    private SfdcCommander commander;

    private SfdcConnectionPool connPool;

    public ObjectExporter(CommanderConfig aConfig) {
        tmpConfig = aConfig;
    }

    public void exportObjects() {
        commander = SfdcCommander.getInstance();
        connPool = SfdcConnectionPool.getInstance();

        // ConnectorConfig connectorConfig = new ConnectorConfig();
        // connectorConfig.setUsername(tmpConfig.getSfUsername());
        // connectorConfig.setPassword(tmpConfig.getSfPassword());
        // connectorConfig.setAuthEndpoint(tmpConfig.getSfServerurl()
        // + "/services/Soap/u/26.0");
        // if (!tmpConfig.getHttpProxyPort().equals("")) {
        // connectorConfig.setProxy(tmpConfig.getHttpProxyHost(),
        // Integer.parseInt(tmpConfig.getHttpProxyPort()));
        // }
        // // connectorConfig.setTraceMessage(true);
        // // connectorConfig.setPrettyPrintXml(true);

        try {

            // connection = Connector.newConnection(connectorConfig);

            // // display some current settings
            // commander.notify("Auth EndPoint: "
            // + connectorConfig.getAuthEndpoint());
            // commander.notify("Service EndPoint: "
            // + connectorConfig.getServiceEndpoint());
            // commander.notify("Username: " + connectorConfig.getUsername());
            // commander.notify("SessionId: " + connectorConfig.getSessionId());
            connection = connPool.getConnection(tmpConfig);

            DescribeGlobalResult global;
            global = connection.describeGlobal();
            for (DescribeGlobalSObjectResult objectGlobalResult : global
                    .getSobjects()) {
                renderObjectXml(objectGlobalResult);
            }
        } catch (ConnectionException e1) {
            commander.notify(e1.getMessage());
        }

    }

    public void renderObjectXml(DescribeGlobalSObjectResult aObject)
            throws ConnectionException {
        SfdcCommander commander = SfdcCommander.getInstance();
        File objectFile = new File(tmpConfig.getSfSystemname() + "/objects/"
                + aObject.getName() + ".object");

        if (objectFile.exists()) {
            try {
                // Read file with MetadataInfo
                InputStreamReader isr = new InputStreamReader(
                        new FileInputStream(objectFile), "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String actLine;
                StringBuffer originalFile = new StringBuffer();
                while ((actLine = br.readLine()) != null) {
                    originalFile.append(actLine + "\r\n");
                }
                br.close();
                isr.close();
                String cuttedFile = originalFile.substring(0,
                        originalFile.length() - 17);

                // Add salesforce standard fields
                DescribeSObjectResult tmpDescribeSObject = connection
                        .describeSObject(aObject.getName());
                commander.notify("Generating enhanced XML for object: "
                        + tmpDescribeSObject.getName());
                OutputStreamWriter writer = new OutputStreamWriter(
                        new FileOutputStream(objectFile), "UTF-8");
                writer.write(cuttedFile);
                for (Field field : tmpDescribeSObject.getFields()) {
                    if (!field.isCustom()) {
                        if (!field.getType().name().equals("picklist")) {
                            writer.write(renderField(field));
                        }
                    }
                }
                writer.write(("</CustomObject>"));
                writer.close();

            } catch (IOException ioe) {
                commander.logException("Failed to enhance file.", ioe);
            }
        }

    }

    private String renderField(Field aField) {
        StringBuffer fieldXml = new StringBuffer();

        fieldXml.append("<fields>\r\n");

        fieldXml.append("<fullName>"
                + CharacterEncoder.encode(aField.getName()) + "</fullName>\r\n");
        fieldXml.append("<label>" + CharacterEncoder.encode(aField.getLabel())
                + "</label>\r\n");
        fieldXml.append("<required>true</required>\r\n");
        fieldXml.append("<externalId>" + aField.getExternalId()
                + "</externalId>\r\n");
        fieldXml.append("<unique>" + aField.getUnique() + "</unique>\r\n");
        fieldXml.append("<type>" + aField.getType() + "</type>\r\n");
        if (aField.getScale() != 0) {
            fieldXml.append("<scale>" + aField.getScale() + "</scale>\r\n");
        }
        if (aField.getPrecision() != 0) {
            fieldXml.append("<precision>" + aField.getPrecision()
                    + "</precision>\r\n");
        }
        if (aField.getLength() != 0) {
            fieldXml.append("<length>" + aField.getLength() + "</length>\r\n");
        }
        if (aField.getReferenceTo().length > 0) {
            fieldXml.append("<referenceTo>"
                    + CharacterEncoder.encode(aField.getReferenceTo()[0])
                    + "</referenceTo>\r\n");
        }
        if (aField.getRelationshipName() != null) {
            fieldXml.append("<relationshipName>"
                    + CharacterEncoder.encode(aField.getRelationshipName())
                    + "</relationshipName>\r\n");
        }
        if (aField.getInlineHelpText() != null) {
            fieldXml.append("<inlineHelpText>" + aField.getInlineHelpText()
                    + "</inlineHelpText>\r\n");
        }
        fieldXml.append("<description>Standard Field: Please review the salesforce.com documentation</description>\r\n");

        fieldXml.append("</fields>\r\n");
        return fieldXml.toString();
    }
}
