/**
 * 
 */
package de.sfdccommander.controller.helper;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author jochen
 * 
 */
public class CodeFileNameFilter implements FilenameFilter {

    /**
     * 
     */
    public static final String[] extensions = { "trigger", "cls", "page", "scf" };

    @Override
    public final boolean accept(final File aDir, final String aName) {
        boolean accept = false;
        String extension = aName.substring(aName.lastIndexOf(".") + 1)
                .toLowerCase();

        for (String codeExtension : extensions) {
            if (extension.equals(codeExtension)) {
                accept = true;
                break;
            }
        }
        return accept;
    }

}
