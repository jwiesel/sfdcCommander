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
public class XmlFileNameFilter implements FilenameFilter {

    @Override
    public final boolean accept(final File aDir, final String aName) {
        boolean accept = true;
        String extension = aName.substring(aName.lastIndexOf(".") + 1)
                .toLowerCase();
        for (String codeExtension : CodeFileNameFilter.extensions) {
            if (extension.equals(codeExtension)) {
                accept = false;
                break;
            }
        }

        return accept;
    }

}
