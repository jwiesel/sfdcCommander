/**
 * 
 */
package de.sfdccommander.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.log4j.Logger;
import org.apache.tools.ant.BuildException;

import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class StartModeDispatcher {

    private static final String NO_UI_MODE = "The UI-Mode of sfdcCommander is not yet available. Please execute the application via command-line with parameter '-help'.";

    /**
     * 
     */
    private final String[] tmpArgs;

    /**
     * 
     */
    private static final String EXPORT_SRC = "-exportsrc";
    /**
     * 
     */
    private static final String VERSIONIZE = "-versionize";
    /**
     * 
     */
    private static final String RENDER = "-render";

    /**
     * 
     */
    private static final String RENDERXLS = "-renderxls";

    /**
     * 
     */
    private static final String EXPORT_DATA = "-exportdata";

    private static final String COMPARE_CONFIG = "-comparesrc";

    /**
     * @param aArgs
     *            Command line arguments
     */
    public StartModeDispatcher(final String[] aArgs) {
        this.tmpArgs = aArgs;
    }

    public static final String SYSTEM_LOOK_NOT_LOADED = "Could not get System Look&Feel";

    /**
     * 
     */
    public final void dispatch() {
        SfdcCommander commander = SfdcCommander.getInstance();
        Logger.getLogger(this.getClass()).info("Parameters entered:");
        for (String arg : tmpArgs) {
            Logger.getLogger(this.getClass()).debug(arg);
        }

        if (tmpArgs.length == 0) {
            // Start UI Mode
            commander
                    .notify(NO_UI_MODE);
            try {
                String cn = UIManager.getSystemLookAndFeelClassName();
                UIManager.setLookAndFeel(cn);
            } catch (ClassNotFoundException e) {
                Logger.getLogger(this.getClass()).error(SYSTEM_LOOK_NOT_LOADED);
            } catch (InstantiationException e) {
                Logger.getLogger(this.getClass()).error(SYSTEM_LOOK_NOT_LOADED);
            } catch (IllegalAccessException e) {
                Logger.getLogger(this.getClass()).error(SYSTEM_LOOK_NOT_LOADED);
            } catch (UnsupportedLookAndFeelException e) {
                Logger.getLogger(this.getClass()).error(SYSTEM_LOOK_NOT_LOADED);
            }
            JOptionPane
                    .showMessageDialog(
                            null,
                            NO_UI_MODE);
        } else if (tmpArgs.length == 2) {
            // check parameters for command line mode
            commander.notify("sfdcCommander");
            String command = tmpArgs[0];
            // TODO: load config + error if not found
            CommanderPropertiesHandler propHandler = new CommanderPropertiesHandler(
                    tmpArgs[1]);
            CommanderConfig config = propHandler.loadProperties();
            if (!config.getHttpProxyHost().equals("")) {
                System.setProperty(CommanderConfig.HTTP_PROXY_HOST,
                        config.getHttpProxyHost());
            }
            if (!config.getHttpProxyPort().equals("")) {
                System.setProperty(CommanderConfig.HTTP_PROXY_PORT,
                        config.getHttpProxyPort());
            }

            if (command.equals(EXPORT_SRC)) {
                // Extract salesforce config
                MetadataExporter exporter = new MetadataExporter(config);
                exporter.getEntities();
            } else if (command.equals(COMPARE_CONFIG)) {
                XmlComparer comparer = new XmlComparer();
                // TODO Test only
                try {
                    comparer.compareXml(new FileReader("AccountOld.object"),
                            new FileReader("AccountNew.object"));
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else if (command.equals(VERSIONIZE)) {
                // Extract and put config from Salesforce under version control
                MetadataExporter exporter = new MetadataExporter(config);
                try {
                    exporter.getEntities();
                } catch (BuildException be) {
                    commander.notify(be.getMessage());
                }
            } else if (command.equals(RENDER)) {
                // Extract and render salesforce configuration
                MetadataExporter exporter = new MetadataExporter(config);
                ObjectExporter objExporter = new ObjectExporter(config);
                try {
                    // TODO: kommentar entfernen!
                    exporter.getEntities();
                    objExporter.exportObjects();
                    HtmlRenderer renderer = new HtmlRenderer(config);
                    renderer.generateOutput();
                } catch (BuildException be) {
                    commander.logException(be.getMessage(), be);
                }
            } else if (command.equals(RENDERXLS)) {
                // Extract and render salesforce configuration to MS Excel
                XlsRenderer renderer = new XlsRenderer(config);
                renderer.generatePartnerOutput();
            } else if (command.equals(EXPORT_DATA)) {
                DatabaseHandler dbHandler = new DatabaseHandler(config);
                dbHandler.backupOrganization();
            } else {
                // Command not found, display help
                commander.notify("Unknown command.");
                displayHelp();
            }
        } else {
            // Command not found, display help
            commander.notify("sfdcCommander");
            commander.notify("Unknown command.");
            displayHelp();
        }
    }

    /**
     * Display help page for command line mode.
     */
    public final void displayHelp() {
        SfdcCommander commander = SfdcCommander.getInstance();
        commander.notify("sfdcCommander: Help page");
        commander.notify("");
        commander
                .notify("Syntax: java -jar sfdcCommander <command> <propertiesFilePath>");
        commander.notify("");
        commander.notify("Commands: <command>");
        commander
                .notify("The command which should be executed by sfdcCommander");
        commander.notify(EXPORT_SRC
                + ": Extract salesforce.com configuration to local harddrive.");
        commander
                .notify(EXPORT_DATA
                        + ": Backup salesforce.com data in a local database to avoid data loss due to faulty data deletions.");
        commander
                .notify(RENDER
                        + ": Extract salesforce.com configuration and render the entities to get a system overview.");
        commander
                .notify(RENDERXLS
                        + ": Extract salesforce.com schema and render the entities to MS Excel to get a system overview.");
        commander
                .notify(VERSIONIZE
                        + ": Extract salesforce configuration and put it under version control");
        commander
                .notify("-deploy: Extract salesforce.com configuration and deploy it to another salesforce org.");
        commander.notify("");
        commander.notify("Properties File: <propertiesFilePath>");
        commander
                .notify("The properties that sfdcCommander should use for command execution.");
        commander.notify("");
        commander
                .notify("Example: 'java -jar sfdcCommander -extract c:\\commander.properties'");
    }
}
