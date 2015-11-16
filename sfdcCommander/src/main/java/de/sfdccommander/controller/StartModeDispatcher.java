/**
 * 
 */
package de.sfdccommander.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.log4j.Logger;

import de.sfdccommander.controller.helper.CommanderException;
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
    private Options options = null;
    /**
     * 
     */
    private static final String EXPORT_SRC = "exportsrc";
    /**
     * 
     */
    private static final String VERSIONIZE = "versionize";
    /**
     * 
     */
    private static final String RENDER = "render";
    /**
     * 
     */
    private static final String RENDERXLS = "renderxls";
    /**
     * 
     */
    private static final String EXPORT_DATA = "exportdata";
    /**
     * 
     */
    private static final String COMPARE_CONFIG = "comparesrc";
    /**
     * 
     */
    private static final String HELP = "help";
    /**
     * 
     */
    private static final String CONFIG = "config";
    /**
     * 
     */
    public static final String SYSTEM_LOOK_NOT_LOADED = "Could not get System Look&Feel";

    /**
     * @param aArgs
     *            Command line arguments
     */
    public StartModeDispatcher(final String[] aArgs) {
        this.tmpArgs = aArgs;
    }

    /**
     * 
     */
    public final void dispatch() {
        options = new Options();
        options.addOption("h", HELP, false, "Show help text.");
        options.addOption("c", CONFIG, true, "The commander configuration.");
        options.addOption("s", EXPORT_SRC, false,
                "Extract salesforce.com configuration to local harddrive.");
        options.addOption("d", EXPORT_DATA, false,
                "Backup salesforce.com data in a local database to avoid data loss due to faulty data deletions.");
        options.addOption("r", RENDER, false,
                "Extract salesforce.com configuration and render the entities to get a system overview.");
        options.addOption("x", RENDERXLS, false,
                "Extract salesforce.com schema and render the entities to MS Excel to get a system overview.");
        options.addOption("v", VERSIONIZE, false,
                "Extract salesforce configuration and put it under version control");
        options.addOption("o", COMPARE_CONFIG, false,
                "Compare system configurations.");

        SfdcCommander commander = SfdcCommander.getInstance();
        commander.info("sfdcCommander");
        commander.debug("Parameters entered:" + Arrays.toString(tmpArgs));

        if (tmpArgs.length == 0) {
            // Start UI Mode
            commander.info(NO_UI_MODE);
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
            JOptionPane.showMessageDialog(null, NO_UI_MODE);
        } else {
            // check parameters for command line mode
            CommandLineParser parser = new BasicParser();
            CommandLine cmd = null;
            try {
                cmd = parser.parse(options, tmpArgs);

                if (cmd.hasOption("h")) {
                    displayCliHelp();
                }
                if (cmd.hasOption("c")) {
                    try {
                        CommanderPropertiesHandler propHandler = new CommanderPropertiesHandler(
                                cmd.getOptionValue(CONFIG));
                        CommanderConfig config = propHandler.loadProperties();
                        if (!config.getHttpProxyHost().equals("")) {
                            System.setProperty(CommanderConfig.HTTP_PROXY_HOST,
                                    config.getHttpProxyHost());
                        }
                        if (!config.getHttpProxyPort().equals("")) {
                            System.setProperty(CommanderConfig.HTTP_PROXY_PORT,
                                    config.getHttpProxyPort());
                        }
                        if (cmd.hasOption("s")) {
                            // Extract salesforce config
                            MetadataExporter exporter = new MetadataExporter(
                                    config);
                            exporter.getEntities();

                        } else if (cmd.hasOption("o")) {
                            XmlComparer comparer = new XmlComparer();
                            // TODO Test only
                            try {
                                comparer.compareXml(
                                        new FileReader("AccountOld.object"),
                                        new FileReader("AccountNew.object"));
                            } catch (FileNotFoundException e) {
                                // TODO: Add application logic
                            }
                        } else if (cmd.hasOption("v")) {
                            // Extract and put config from Salesforce under
                            // version
                            // control
                            MetadataExporter exporter = new MetadataExporter(
                                    config);
                            exporter.getEntities();
                        } else if (cmd.hasOption("r")) {
                            // Extract and render salesforce configuration
                            MetadataExporter exporter = new MetadataExporter(
                                    config);
                            ObjectExporter objExporter = new ObjectExporter(
                                    config);
                            exporter.getEntities();
                            objExporter.exportObjects();
                            HtmlRenderer renderer = new HtmlRenderer(config);
                            renderer.generateOutput();
                        } else if (cmd.hasOption("x")) {
                            // Extract and render salesforce configuration to MS
                            // Excel
                            XlsRenderer renderer = new XlsRenderer(config);
                            renderer.generatePartnerOutput();
                        } else if (cmd.hasOption("d")) {
                            DatabaseHandler dbHandler = new DatabaseHandler(
                                    config);
                            dbHandler.backupOrganization();
                        } else {
                            commander.info("Missing command");
                            displayCliHelp();
                        }
                    } catch (CommanderException e) {
                        commander.error(e.getMessage(), e);

                    }
                } else {
                    commander.info("Missing parameter c");
                    displayCliHelp();
                }

            } catch (ParseException e) {
                commander.error("Could not parse command line parameters", e);
                displayCliHelp();
            }
        }
    }

    /**
     * 
     */
    private void displayCliHelp() {
        // This prints out some help
        HelpFormatter formater = new HelpFormatter();

        formater.printHelp("Main", options);
        System.exit(0);
    }
}
