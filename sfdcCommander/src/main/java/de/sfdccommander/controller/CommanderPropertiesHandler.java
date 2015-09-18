/**
 * 
 */
package de.sfdccommander.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.sfdccommander.model.CommanderConfig;

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
     */
    public final CommanderConfig loadProperties() {
        Properties properties = new Properties();
        CommanderConfig config = new CommanderConfig();
        InputStream fis = null;
        try {
            fis = new FileInputStream(tmpPropFile);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            Logger.getLogger(this.getClass())
                    .error("Could not find " + tmpPropFile, e);
        } catch (IOException e) {
            Logger.getLogger(this.getClass())
                    .error("Could not open " + tmpPropFile, e);
        }

        config.setSfSystemname(
                properties.getProperty(CommanderConfig.SF_SYSTEMNAME));
        config.setSfUsername(
                properties.getProperty(CommanderConfig.SF_USERNAME));
        config.setSfPassword(
                properties.getProperty(CommanderConfig.SF_PASSWORD));
        config.setSvnRepository(
                properties.getProperty(CommanderConfig.SVN_REPOSITORY));
        config.setSvnUser(properties.getProperty(CommanderConfig.SVN_USER));
        config.setSvnPassword(
                properties.getProperty(CommanderConfig.SVN_PASSWORD));
        config.setRenderPath(
                properties.getProperty(CommanderConfig.RENDER_PATH));
        config.setBackupPath(
                properties.getProperty(CommanderConfig.BACKUP_PATH));
        config.setXlsPath(properties.getProperty(CommanderConfig.XLS_PATH));
        config.setSfTargetSystemname(
                properties.getProperty(CommanderConfig.SF_TARGET_SYSTEMNAME));
        config.setSfTargetUsername(
                properties.getProperty(CommanderConfig.SF_TARGET_USERNAME));
        config.setSfTargetPassword(
                properties.getProperty(CommanderConfig.SF_TARGET_PASSWORD));
        config.setHttpProxyHost(
                properties.getProperty(CommanderConfig.HTTP_PROXY_HOST));
        config.setHttpProxyPort(
                properties.getProperty(CommanderConfig.HTTP_PROXY_PORT));
        return config;
    }
}
