/**
 * 
 */
package de.sfdccommander.controller;

import java.util.Arrays;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.SfdcCommander;
import de.sfdccommander.viewer.Window;

/**
 * @author jochen
 * 
 */

public class StartModeDispatcher {

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
            Window window = Window.getInstance();
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
                        if (cmd.hasOption("s")) {
                            Tasks.exportSrc(config);
                        } else if (cmd.hasOption("o")) {
                            Tasks.compare(config);
                        } else if (cmd.hasOption("v")) {
                            Tasks.versionize(config);
                        } else if (cmd.hasOption("r")) {
                            Tasks.render(config);
                        } else if (cmd.hasOption("x")) {
                            Tasks.renderXls(config);
                        } else if (cmd.hasOption("d")) {
                            Tasks.exportData(config);
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
