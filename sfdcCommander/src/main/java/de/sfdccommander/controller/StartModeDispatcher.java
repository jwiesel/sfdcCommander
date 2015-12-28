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
import de.sfdccommander.viewer.Translations;
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
        options.addOption("h", Translations.HELP, false,
                Translations.HELP_DESC);
        options.addOption("c", Translations.CONFIG, true,
                "The commander configuration.");
        options.addOption("s", Translations.EXPORT_SRC, false,
                Translations.EXPORT_SRC_DESC);
        options.addOption("d", Translations.EXPORT_DATA, false,
                Translations.EXPORT_DATA_DESC);
        options.addOption("r", Translations.RENDER, false,
                Translations.RENDER_DESC);
        options.addOption("x", Translations.RENDERXLS, false,
                Translations.RENDERXLS_DESC);
        options.addOption("v", Translations.VERSIONIZE, false,
                Translations.VERSIONIZE_DESC);
        options.addOption("o", Translations.COMPARE_CONFIG, false,
                Translations.COMPARE_CONFIG_DESC);

        SfdcCommander commander = SfdcCommander.getInstance();
        commander.info("Starting sfdcCommander...");
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
                                cmd.getOptionValue(Translations.CONFIG));
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
