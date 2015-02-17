/**
 * 
 */
package de.sfdccommander.controller.helper;

import java.io.File;

/**
 * @author jochen
 * 
 */
public final class FileTypeFilter {

    /**
     * Default private constructor.
     */
    private FileTypeFilter() {

    }

    /**
     * Check if file extension equal to expected extension.
     * 
     * @param file
     *            file with extension
     * @param fileExtension
     *            expected file extension
     * @return if file extension equal to expected extension
     */
    public static boolean typeOfFile(final File file, final String fileExtension) {
        boolean accept = false;
        try {
            String filePath = file.getPath();
            if (filePath
                    .toLowerCase()
                    .substring(filePath.length() - (fileExtension.length() + 1))
                    .equals("." + fileExtension)) {
                accept = true;
            }
        } catch (StringIndexOutOfBoundsException sioobe) {
            accept = true;
        }
        return accept;
    }
}
