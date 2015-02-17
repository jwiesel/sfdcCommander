/**
 * 
 */
package de.sfdccommander.controller.helper;

import java.io.File;
import java.io.FilenameFilter;

/**
 * FileFilter for dx files (*.dx).
 * 
 * @author jochen
 * 
 */
public class XsltFileNameFilter implements FilenameFilter {

    @Override
    public boolean accept(final File aDir, final String aName) {
        String fileExtension = "xslt";
        return FileTypeFilter.typeOfFile(new File(aDir.getAbsolutePath() + "/"
                + aName), fileExtension);
    }
}
