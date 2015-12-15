/**
 * 
 */
package de.sfdccommander.controller.helper;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/**
 * FileFilter for dx files (*.dx).
 * 
 * @author jochen
 * 
 */
public class PropertiesFileFilter extends FileFilter {

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.filechooser.FileFilter#accept(java.io.File)
     */
    @Override
    public final boolean accept(final File aF) {
        if (aF.isDirectory()) {
            return true;
        } else {
            String fileExtension = "properties";
            return FileTypeFilter.typeOfFile(aF, fileExtension);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.filechooser.FileFilter#getDescription()
     */
    @Override
    public final String getDescription() {
        return "Properties-Files (*.properties)";
    }

}
