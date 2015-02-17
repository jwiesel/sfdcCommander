/**
 * 
 */
package de.sfdccommander.controller;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 * @author jochen
 * 
 */
public class StyleManager {

    /**
     * HSSFWorkbook which should be formated.
     */
    private final HSSFWorkbook wb;

    private CellStyle heading1Cs;
    private CellStyle heading2Cs;
    private CellStyle heading3Cs;
    private CellStyle equalCs;
    private CellStyle notEqualCs;
    private CellStyle greenCs;
    private CellStyle yellowCs;

    /**
     * Size of heading 1.
     */
    private final short H1_SIZE = 16;
    /**
     * Size of heading 2.
     */
    private final short H2_SIZE = 12;
    /**
     * Size of heading 3.
     */
    private final short H3_SIZE = 10;

    /**
     * @param aWb
     *            HSSFWorkbook which should be formated.
     */
    public StyleManager(final HSSFWorkbook aWb) {
        this.wb = aWb;
        initializeComponents();
    }

    /**
     * Initialize components.
     */
    public final void initializeComponents() {
        HSSFFont fontHeading1;
        HSSFFont fontHeading2;
        HSSFFont fontHeading3;
        HSSFFont greenFont;
        HSSFFont yellowFont;

        heading1Cs = wb.createCellStyle();
        heading2Cs = wb.createCellStyle();
        heading3Cs = wb.createCellStyle();
        equalCs = wb.createCellStyle();
        notEqualCs = wb.createCellStyle();
        greenCs = wb.createCellStyle();
        yellowCs = wb.createCellStyle();

        fontHeading1 = wb.createFont();
        fontHeading2 = wb.createFont();
        fontHeading3 = wb.createFont();
        greenFont = wb.createFont();
        yellowFont = wb.createFont();

        fontHeading1.setFontHeightInPoints(H1_SIZE);
        fontHeading1.setItalic(true);
        fontHeading1.setBoldweight(Font.BOLDWEIGHT_BOLD);
        fontHeading1.setColor(IndexedColors.DARK_BLUE.getIndex());
        heading1Cs.setFont(fontHeading1);

        fontHeading2.setFontHeightInPoints(H2_SIZE);
        fontHeading2.setItalic(true);
        heading2Cs.setFont(fontHeading2);

        fontHeading3.setFontHeightInPoints(H3_SIZE);
        fontHeading3.setBoldweight(Font.BOLDWEIGHT_BOLD);
        heading3Cs.setFont(fontHeading3);
        heading3Cs.setBorderBottom((short) 1);

        equalCs.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        equalCs.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        notEqualCs.setFillForegroundColor(IndexedColors.RED.getIndex());
        notEqualCs.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        greenFont.setColor(IndexedColors.GREEN.getIndex());
        greenCs.setFont(greenFont);

        yellowFont.setColor(IndexedColors.DARK_YELLOW.getIndex());
        yellowCs.setFont(yellowFont);
    }

    /**
     * @param style
     *            ExcelStyle for Cell view
     * @return CellStyle based on ExcelStyle
     */
    public final CellStyle getCellStyle(final ExcelStyle style) {
        CellStyle result = null;
        switch (style) {
        case H1:
            result = heading1Cs;
            break;
        case H2:
            result = heading2Cs;
            break;
        case H3:
            result = heading3Cs;
            break;
        case EQUAL:
            result = equalCs;
            break;
        case NOT_EQUAL:
            result = notEqualCs;
            break;
        case F_YELLOW:
            result = yellowCs;
            break;
        case F_GREEN:
            result = greenCs;
            break;
        default:
            break;
        }
        return result;

    }

}
