/**
 * 
 */
package de.sfdccommander.controller.helper;

/**
 * @author jochen
 * 
 */
public class CharacterEncoder {

    public static String encode(String inputValue) {
        String outputValue;
        String tmpValue = inputValue;

        tmpValue = tmpValue.replace("&", "&amp;");
        tmpValue = tmpValue.replace("<", "&lt;");
        tmpValue = tmpValue.replace(">", "&gt;");
        tmpValue = tmpValue.replace("\"", "&quot;");
        tmpValue = tmpValue.replace("'", "&apos;");

        outputValue = tmpValue;
        return outputValue;
    }
}
