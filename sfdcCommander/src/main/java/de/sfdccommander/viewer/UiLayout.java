/**
 * 
 */
package de.sfdccommander.viewer;

/**
 * Constants which represent the layout of the user interface.
 * 
 * @author jochen
 * 
 */
public final class UiLayout {

    /**
     * Default private constructor.
     */
    private UiLayout() {

    }

    public static final int LABEL_WIDTH = 100;
    public static final int FIELD_WIDTH = 335;

    public static final int WINDOW_WIDTH = 750;
    public static final int WINDOW_HEIGHT = 300;

    public static final int HELP_WINDOW_WIDTH = 650;
    public static final int HELP_WINDOW_HEIGHT = 550;

    public static final String LABEL_FIELD_COLUMN_LAYOUT = "[" + LABEL_WIDTH
            + "] 20 [" + FIELD_WIDTH + "]";
    public static final String LABEL_FIELD_ROW_INSET_LAYOUT = "wrap 2";
    public static final String W1_ROW_LAYOUT = "wrap 1";
    public static final String W2_ROW_LAYOUT = "wrap 2";
    public static final String W3_ROW_LAYOUT = "wrap 3";

    public static final String WGS = "wrap, grow, span";
    public static final String GX_BUTTON = "gap 10, growx";
    public static final String GX_SEPERATOR_BUTTON = "gaptop 10, gapbottom 10, growx";
    public static final String WGS_BUTTON = "gaptop 20, gapbottom 20, wrap, growx, span";
    public static final String LABEL_GAP = "gap 5";
    public static final String G = "grow";
    public static final String GX = "growx";
    public static final String SGX = "split, growx";

}
