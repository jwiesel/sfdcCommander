/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import com.sforce.soap.partner.DescribeGlobalResult;
import com.sforce.soap.partner.DescribeGlobalSObjectResult;
import com.sforce.soap.partner.DescribeSObjectResult;
import com.sforce.soap.partner.Field;
import com.sforce.soap.partner.SoapBindingStub;
import com.sforce.soap.partner.fault.InvalidSObjectFault;
import com.sforce.soap.partner.fault.UnexpectedErrorFault;

import de.sfdccommander.controller.connection.SfdcConnectionPool;
import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class XlsRenderer {
    /**
     * Config for renderings.
     */
    private final CommanderConfig tmpConfig;
    private SfdcConnectionPool connPool;

    static SoapBindingStub binding;

    final short CONTENT_HEADER = 4;
    final short SHEET_TITLE = 0;
    final short SHEET_HEADER = 2;
    private CellStyle heading1Cs;
    private CellStyle heading2Cs;
    private CellStyle heading3Cs;
    /**
     * Size of heading 1.
     */
    private final short H1_SIZE = 12;
    /**
     * Size of heading 2.
     */
    private final short H2_SIZE = 11;
    /**
     * Size of heading 3.
     */
    private final short H3_SIZE = 10;

    private final SfdcCommander commander;

    /**
     * @param aConfig
     *            Config for renderings.
     */
    public XlsRenderer(final CommanderConfig aConfig) {
        this.tmpConfig = aConfig;
        commander = SfdcCommander.getInstance();
    }

    /**
     * @param path
     *            File path to delete.
     * @return if path has been deleted.
     */
    public static boolean deleteDirectory(final File path) {
        if (path.exists()) {
            File[] files = path.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    deleteDirectory(files[i]);
                } else {
                    files[i].delete();
                }
            }
        }
        return (path.delete());
    }

    public void generatePartnerOutput() throws CommanderException {
        connPool = SfdcConnectionPool.getInstance();

        // prepare XLS output folder
        File outputFolder = new File(tmpConfig.getXlsPath() + "/"
                + tmpConfig.getSourceSfdcConfig().getSystemName());
        if (outputFolder.exists()) {
            deleteDirectory(outputFolder);
        }
        outputFolder.mkdirs();

        commander.info("Generating XLS output.");

        binding = connPool.getBinding(tmpConfig.getSourceSfdcConfig());

        // run the different examples
        DescribeGlobalResult global;
        try {
            global = binding.describeGlobal();
            for (DescribeGlobalSObjectResult objectGlobalResult : global
                    .getSobjects()) {
                renderObjectXls(objectGlobalResult, outputFolder);
            }
            commander.info("XLS output successfully generated.");
        } catch (UnexpectedErrorFault e) {
            throw new CommanderException(
                    "Could not describe salesforce metadata to render object-schema as xls-file.",
                    e);
        } catch (RemoteException e) {
            throw new CommanderException(
                    "Could not describe salesforce metadata to render object-schema as xls-file.",
                    e);
        }

    }

    /**
     * @param aObject
     * @param outputFolder
     * @throws CommanderException
     */
    public final void renderObjectXls(final DescribeGlobalSObjectResult aObject,
            final File outputFolder) throws CommanderException {

        commander.info("Generating xls for object: " + aObject.getName());

        DescribeSObjectResult tmpDescribeSObject;
        try {
            tmpDescribeSObject = binding.describeSObject(aObject.getName());

            HSSFWorkbook wb = new HSSFWorkbook();

            HSSFFont fontHeading1;
            HSSFFont fontHeading2;
            HSSFFont fontHeading3;
            fontHeading1 = wb.createFont();
            fontHeading2 = wb.createFont();
            fontHeading3 = wb.createFont();

            heading1Cs = wb.createCellStyle();
            heading2Cs = wb.createCellStyle();
            heading3Cs = wb.createCellStyle();

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

            HSSFSheet sheet = wb.createSheet("SCHEMA");
            HSSFRow row;
            HSSFCell cell;

            createSheetTitle(sheet, "Salesforce.com Object Field List");

            createSheetHeaderLine(sheet, SHEET_HEADER,
                    tmpDescribeSObject.getName());

            createContentHeader(sheet, "Name", "Label", "Required?", "Unique?",
                    "External Id?", "Case Sensitive?", "Type", "Length",
                    "Precision", "Scale");

            // fe
            for (int i = 0; i < tmpDescribeSObject.getFields().length; i++) {
                row = sheet.createRow((short) i + CONTENT_HEADER + 1);
                Field currentField = tmpDescribeSObject.getFields()[i];
                row.createCell(0).setCellValue(currentField.getName());
                row.createCell(1).setCellValue(currentField.getLabel());
                boolean required = false;
                if (!currentField.isNillable()) {
                    required = true;
                }
                Boolean externalId = new Boolean(false);
                if (currentField.getExternalId() != null) {
                    externalId = currentField.getExternalId();
                }
                row.createCell(2)
                        .setCellValue(new Boolean(required).toString());
                row.createCell(3).setCellValue(
                        new Boolean(currentField.isUnique()).toString());
                row.createCell(4).setCellValue(externalId.toString());
                row.createCell(5).setCellValue(
                        new Boolean(currentField.isCaseSensitive()).toString());
                row.createCell(6)
                        .setCellValue(currentField.getType().toString());
                row.createCell(7).setCellValue(currentField.getLength());
                row.createCell(8).setCellValue(currentField.getPrecision());
                row.createCell(9).setCellValue(currentField.getScale());
            }
            autoSizeColumns(sheet, 0, 9);

            saveFile(wb, outputFolder.getAbsolutePath() + "/"
                    + tmpDescribeSObject.getName() + ".xls");
        } catch (InvalidSObjectFault e) {
            throw new CommanderException(
                    "Could not describe salesforce object as it seems to be invalid: "
                            + aObject.getName(),
                    e);
        } catch (UnexpectedErrorFault e) {
            throw new CommanderException(
                    "Could not describe salesforce object: "
                            + aObject.getName(),
                    e);
        } catch (RemoteException e) {
            throw new CommanderException(
                    "Could not describe salesforce object: "
                            + aObject.getName(),
                    e);
        } catch (IOException e) {
            commander.info(e.getMessage());
        }
    }

    /**
     * @param sheet
     * @param strings
     */
    public final void createContentHeader(final HSSFSheet sheet,
            final String... strings) {
        HSSFRow row;
        HSSFCell cell;
        row = sheet.createRow(CONTENT_HEADER);

        for (int i = 0; i < strings.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(strings[i]);
            cell.setCellStyle(heading3Cs);
        }
        sheet.createFreezePane(0, CONTENT_HEADER + 1);
        sheet.setAutoFilter(new CellRangeAddress(CONTENT_HEADER, CONTENT_HEADER,
                0, strings.length - 1));
    }

    /**
     * @param sheet
     * @param line
     * @param strings
     */
    public final void createSheetHeaderLine(final HSSFSheet sheet,
            final int line, final String... strings) {
        HSSFRow row;
        HSSFCell cell;
        row = sheet.createRow(line);

        for (int i = 0; i < strings.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(strings[i]);
            cell.setCellStyle(heading2Cs);
        }
    }

    /**
     * @param sheet
     * @param title
     */
    public final void createSheetTitle(final HSSFSheet sheet,
            final String title) {
        HSSFRow row;
        HSSFCell cell;
        row = sheet.createRow(SHEET_TITLE);
        cell = row.createCell(0);
        cell.setCellValue(title);
        cell.setCellStyle(heading1Cs);
    }

    /**
     * @param sheet
     * @param start
     * @param end
     */
    public final void autoSizeColumns(final HSSFSheet sheet, final int start,
            final int end) {
        for (int i = start; i <= end; i++) {
            sheet.autoSizeColumn((short) i);
        }
    }

    /**
     * @param wb
     * @param outputFileName
     * @throws IOException
     * @throws ExcelException
     */
    public final void saveFile(final HSSFWorkbook wb,
            final String outputFileName) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(outputFileName);
        wb.write(fileOut);
        fileOut.close();

    }
}
