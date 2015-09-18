/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.rmi.RemoteException;

import de.sfdccommander.model.CommanderConfig;
import net.lingala.zip4j.core.ZipFile;

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
     * 
     * @throws Exception
     * @throws RemoteException
     */
    public final void getEntities() {
        MetadataRetriever retriever;
        retriever = new MetadataRetriever(tmpConfig.getSfTargetUsername(),
                tmpConfig.getSfPassword());
        retriever.setSystemName(tmpConfig.getSfSystemname());
        try {
            retriever.retrieveZip();
            // Export ZIP
            ZipFile sourceZip = new ZipFile(tmpConfig.getSfSystemname() + ".zip");
            sourceZip.extractAll(tmpConfig.getSfSystemname());
            File sourceFile = new File(tmpConfig.getSfSystemname() + ".zip");
            sourceFile.delete();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
