/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.rmi.RemoteException;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.controller.helper.DeleteDirVisitor;
import de.sfdccommander.model.SfdcConfig;
import de.sfdccommander.viewer.SfdcCommander;
import de.sfdccommander.viewer.Translations;
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
        SfdcCommander commander = SfdcCommander.getInstance();
        String systemName = config.getSystemName();
        // Remove metadata folder
        File metadataFolder = new File(systemName);
        if (metadataFolder.exists()) {
            try {
                Files.walkFileTree(metadataFolder.toPath(),
                        new DeleteDirVisitor());
            } catch (IOException e) {
                throw new CommanderException(
                        "Could not delete folder: " + metadataFolder, e);
            }
        }
        // Download new metadata as zip-files
        MetadataRetriever retriever;
        retriever = new MetadataRetriever(config);
        retriever.setSystemName(systemName);
        try {
            int packages = retriever.retrieveZips();
            // extract zip-files
            for (int i = 1; i <= packages; i++) {
                String filename = systemName + i + ".zip";
                ZipFile sourceZip = new ZipFile(filename);
                sourceZip.extractAll(systemName);
                File sourceFile = new File(filename);
                sourceFile.delete();
                File unpackagedFolder = new File(
                        systemName + File.separator + "unpackaged");
                File packageXml = new File(unpackagedFolder.getAbsolutePath()
                        + File.separator + "package.xml");
                packageXml.renameTo(new File(unpackagedFolder.getAbsolutePath()
                        + File.separator + "package" + i + ".xml"));
            }
            commander.info(Translations.SEPARATOR);
            commander.info("Metadata download successfully completed.");
        } catch (CommanderException e) {
            throw new CommanderException(
                    "Could not download zip-File from your Org.", e);
        } catch (ZipException e) {
            throw new CommanderException("Could not extract zip-File.", e);
        }

    }

}
