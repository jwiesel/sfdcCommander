/**
 * 
 */
package de.sfdccommander.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.CommanderConfig;

/**
 * @author jochen
 *
 */
public class Tasks {

    /**
     * 
     */
    public Tasks() {
    }

    public static void exportSrc(CommanderConfig aConfig)
            throws CommanderException {
        // Extract salesforce config
        MetadataExporter exporter = new MetadataExporter(
                aConfig.getSourceSfdcConfig());
        exporter.getEntities();
    }

    public static void render(CommanderConfig aConfig)
            throws CommanderException {
        // Extract and render salesforce configuration
        MetadataExporter exporter = new MetadataExporter(
                aConfig.getSourceSfdcConfig());
        ObjectExporter objExporter = new ObjectExporter(
                aConfig.getSourceSfdcConfig());
        exporter.getEntities();
        objExporter.exportObjects();
        HtmlRenderer renderer = new HtmlRenderer(
                aConfig.getSourceSfdcConfig().getSystemName(),
                aConfig.getRenderPath());
        renderer.generateOutput();
    }

    public static void compare(CommanderConfig aConfig)
            throws CommanderException {
        XmlComparer comparer = new XmlComparer();
        // TODO Test only
        try {
            comparer.compareXml(new FileReader("AccountOld.object"),
                    new FileReader("AccountNew.object"));
        } catch (FileNotFoundException e) {
            // TODO: Add application logic
        }
    }

    public static void versionize(CommanderConfig aConfig)
            throws CommanderException {
        // Extract and put config from Salesforce under
        // version
        // control
        MetadataExporter exporter = new MetadataExporter(
                aConfig.getSourceSfdcConfig());
        exporter.getEntities();
    }

    public static void renderXls(CommanderConfig aConfig)
            throws CommanderException {
        // Extract and render salesforce configuration to MS
        // Excel
        XlsRenderer renderer = new XlsRenderer(aConfig);
        renderer.generatePartnerOutput();
    }

    public static void exportData(CommanderConfig aConfig)
            throws CommanderException {
        DatabaseHandler dbHandler = new DatabaseHandler(
                aConfig.getSourceSfdcConfig(), aConfig.getBackupPath());
        dbHandler.backupOrganization();
    }

}
