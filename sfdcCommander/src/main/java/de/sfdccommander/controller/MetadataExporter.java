/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.rmi.RemoteException;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.SfdcConfig;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

/**
 * @author jochen
 * 
 */
public class MetadataExporter {

    /**
     * 
     */
    private final SfdcConfig config;

    /**
     * @param aConfig
     *            SFDC Config to get Metadata.
     */
    public MetadataExporter(final SfdcConfig aConfig) {
        config = aConfig;
    }

    /**
     * Method to export SFDC entities.
     * 
     * @throws CommanderException
     * 
     * @throws Exception
     * @throws RemoteException
     */
    public final void getEntities() throws CommanderException {
        MetadataRetriever retriever;
        retriever = new MetadataRetriever(config);
        String systemName = config.getSystemName();
        retriever.setSystemName(systemName);
        try {
            retriever.retrieveZip();
            // Export ZIP
            ZipFile sourceZip = new ZipFile(systemName + ".zip");
            sourceZip.extractAll(systemName);
            File sourceFile = new File(systemName + ".zip");
            sourceFile.delete();
        } catch (CommanderException e) {
            throw new CommanderException(
                    "Could not download zip-File from your Org.", e);
        } catch (ZipException e) {
            throw new CommanderException("Could not extract zip-File.", e);
        }

    }

}
