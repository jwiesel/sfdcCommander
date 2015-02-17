/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class MetadataExporter {

    /**
     * 
     */
    private final CommanderConfig tmpConfig;

    /**
     * @param aConfig
     *            SFDC Config to get Metadata.
     */
    public MetadataExporter(final CommanderConfig aConfig) {
        tmpConfig = aConfig;
    }

    /**
     * Method to export SFDC entities.
     */
    public final void getEntities() throws BuildException {
        SfdcCommander commander = SfdcCommander.getInstance();
        // Include Properties via code!
        File buildFile = new File("config/build.xml");
        Project p = new Project();
        p.setUserProperty("ant.file", buildFile.getAbsolutePath());
        p.setUserProperty(CommanderConfig.SF_USERNAME,
                tmpConfig.getSfUsername());
        p.setUserProperty(CommanderConfig.SF_PASSWORD,
                tmpConfig.getSfPassword());
        p.setUserProperty(CommanderConfig.SF_SERVERURL,
                tmpConfig.getSfServerurl());
        p.setUserProperty(CommanderConfig.SF_PACKAGE, tmpConfig.getSfPackage());
        p.setUserProperty(CommanderConfig.SF_SYSTEMNAME,
                tmpConfig.getSfSystemname());
        p.setUserProperty(CommanderConfig.SF_POLL_WAIT_MILLIS,
                getWaitTime(tmpConfig.getSfTimeoutSeconds()));
        p.init();
        ProjectHelper helper = ProjectHelper.getProjectHelper();
        p.addReference("ant.projectHelper", helper);
        helper.parse(p, buildFile);
        // TODO: To be changed to log4j
        DefaultLogger consoleLogger = new DefaultLogger();
        consoleLogger.setErrorPrintStream(System.err);
        consoleLogger.setOutputPrintStream(System.out);
        consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
        p.addBuildListener(consoleLogger);
        p.executeTarget("retrieveUnpackaged");
    }

    /**
     * @param secondsString
     *            Duration in seconds for waiting (based on default of 20
     *            polls).
     * @return Milliseconds for each poll.
     */
    public final String getWaitTime(final String secondsString) {
        final int MULTIPLIER_FOR_20_POLLS = 50;
        final int DEFAULT_WAITING_SECONDS = 200;
        int waitTime;
        int seconds;
        if (secondsString == null || secondsString.equals("")) {
            seconds = DEFAULT_WAITING_SECONDS;
        } else {
            seconds = Integer.parseInt(secondsString);
        }

        waitTime = seconds * MULTIPLIER_FOR_20_POLLS;

        return waitTime + "";
    }
}
