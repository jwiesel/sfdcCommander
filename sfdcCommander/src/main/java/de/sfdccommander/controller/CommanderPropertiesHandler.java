/**
 * 
 */
package de.sfdccommander.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.model.SfdcConfig;
import de.sfdccommander.model.SvnConfig;

/**
 * @author jochen
 * 
 */
public class CommanderPropertiesHandler {

    /**
     * 
     */
    private final String tmpPropFile;

    /**
     * @param aPropFile
     *            Path to properties file for sfdcCommander.
     */
    public CommanderPropertiesHandler(final String aPropFile) {
        this.tmpPropFile = aPropFile;
    }

    /**
     * @return CommanderConfiguration for task execution.
     * @throws CommanderException
     *             If config file cannot be loaded, an exception is thrown.
     */
    public final CommanderConfig loadProperties() throws CommanderException {
        Properties properties = new Properties();
        CommanderConfig config = new CommanderConfig();
        InputStream fis = null;
        try {
            fis = new FileInputStream(tmpPropFile);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new CommanderException(
                    "Could not find configuration file: " + tmpPropFile, e);
        } catch (IOException e) {
            throw new CommanderException(
                    "Could not open configuration file: " + tmpPropFile, e);
        }

        SfdcConfig sourceSfdcConfig = new SfdcConfig();
        sourceSfdcConfig.setSystemName(
                properties.getProperty(CommanderConfig.SF_SYSTEMNAME));
        sourceSfdcConfig.setUsername(
                properties.getProperty(CommanderConfig.SF_USERNAME));
        sourceSfdcConfig.setPassword(
                properties.getProperty(CommanderConfig.SF_PASSWORD));
        config.setSourceSfdcConfig(sourceSfdcConfig);
        SvnConfig svnConfig = new SvnConfig();
        svnConfig.setSvnRepository(
                properties.getProperty(CommanderConfig.SVN_REPOSITORY));
        svnConfig.setSvnUser(properties.getProperty(CommanderConfig.SVN_USER));
        svnConfig.setSvnPassword(
                properties.getProperty(CommanderConfig.SVN_PASSWORD));
        config.setSvnConfig(svnConfig);
        config.setRenderPath(
                properties.getProperty(CommanderConfig.RENDER_PATH));
        config.setBackupPath(
                properties.getProperty(CommanderConfig.BACKUP_PATH));
        config.setXlsPath(properties.getProperty(CommanderConfig.XLS_PATH));
        SfdcConfig targetSfdcConfig = new SfdcConfig();
        targetSfdcConfig.setSystemName(
                properties.getProperty(CommanderConfig.SF_TARGET_SYSTEMNAME));
        targetSfdcConfig.setUsername(
                properties.getProperty(CommanderConfig.SF_TARGET_USERNAME));
        targetSfdcConfig.setPassword(
                properties.getProperty(CommanderConfig.SF_TARGET_PASSWORD));
        config.setTargetSfdcConfig(targetSfdcConfig);
        config.setHttpProxyHost(
                properties.getProperty(CommanderConfig.HTTP_PROXY_HOST));
        config.setHttpProxyPort(
                properties.getProperty(CommanderConfig.HTTP_PROXY_PORT));
        return config;
    }
}
