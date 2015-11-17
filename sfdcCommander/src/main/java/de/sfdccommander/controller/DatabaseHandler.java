/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sforce.soap.partner.DescribeGlobalResult;
import com.sforce.soap.partner.DescribeGlobalSObjectResult;
import com.sforce.soap.partner.DescribeSObjectResult;
import com.sforce.soap.partner.Field;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.SoapBindingStub;
import com.sforce.soap.partner.fault.UnexpectedErrorFault;
import com.sforce.soap.partner.sobject.SObject;

import de.sfdccommander.controller.connection.SfdcConnectionPool;
import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.SfdcConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class DatabaseHandler {

    /**
     * 
     */
    private final SfdcConfig config;

    /**
     * 
     */
    private final String backupPath;

    /**
     * 
     */
    private SfdcCommander commander;

    /**
     * 
     */
    private SfdcConnectionPool connPool;

    /**
     * 
     */
    static SoapBindingStub sfBinding;

    public DatabaseHandler(SfdcConfig aConfig, String aBackupPath) {
        this.config = aConfig;
        this.backupPath = aBackupPath;
    }

    public void backupOrganization() throws CommanderException {
        commander = SfdcCommander.getInstance();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");

        commander.info("Generating Backup for Organization: "
                + config.getSystemName());

        File backupFolder = new File(backupPath + config.getSystemName());
        backupFolder.mkdirs();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection dbConnection = DriverManager.getConnection(
                    "jdbc:sqlite:" + backupFolder.getAbsolutePath()
                            + File.separator + config.getSystemName() + "_"
                            + sdf.format(date) + ".sqlite");

            connPool = SfdcConnectionPool.getInstance();
            sfBinding = connPool.getBinding(config);

            // run the different examples
            DescribeGlobalResult global;
            global = sfBinding.describeGlobal();
            String createTableStatement;
            String dropTableStatement;
            String soqlSelect;
            String insertStatement;
            Statement tmpStatement = dbConnection.createStatement();
            tmpStatement.setQueryTimeout(30);
            for (DescribeGlobalSObjectResult objectGlobalResult : global
                    .getSobjects()) {
                // create tables and download data
                DescribeSObjectResult tmpDescribeSObject = sfBinding
                        .describeSObject(objectGlobalResult.getName());
                if (tmpDescribeSObject.isQueryable()) {
                    if (!tmpDescribeSObject.getName()
                            .equals("ContentDocumentLink")
                            && !tmpDescribeSObject.getName()
                                    .equals("UserProfileFeed")
                            && !tmpDescribeSObject.getName()
                                    .equals("UserRecordAccess")
                            && !tmpDescribeSObject.getName().equals("Vote")) {
                        commander.info(
                                "Object: " + tmpDescribeSObject.getName());
                        commander.info("Preparing database table.");
                        Field[] fields = tmpDescribeSObject.getFields();
                        dropTableStatement = generateDropTableStatement(
                                tmpDescribeSObject.getName());
                        tmpStatement.execute(dropTableStatement);
                        createTableStatement = generateCreateTableStatement(
                                tmpDescribeSObject.getName(), fields);
                        tmpStatement.execute(createTableStatement);
                        soqlSelect = generateSOQLSelectQuery(
                                tmpDescribeSObject.getName(), fields);
                        commander.info("Downloading data...");
                        commander.info("");
                        QueryResult queryResults = sfBinding
                                .queryAll(soqlSelect);
                        if (queryResults.getSize() > 0) {
                            for (SObject tmpSObject : queryResults
                                    .getRecords()) {
                                insertStatement = generateInsertStatementForSObject(
                                        tmpSObject,
                                        tmpDescribeSObject.getName(), fields);
                                tmpStatement.execute(insertStatement);
                            }
                        }
                    }
                }
            }
            tmpStatement.close();
            dbConnection.close();

            commander.info("Backup sucessfully created.");

        } catch (ClassNotFoundException e) {
            throw new CommanderException(
                    "Could not find class org.sqlite.JDBC to backup org to SQLITE.",
                    e);
        } catch (SQLException e) {
            throw new CommanderException(e);
        } catch (UnexpectedErrorFault e) {
            throw new CommanderException(e);
        } catch (RemoteException e) {
            throw new CommanderException(e);
        }
    }

    private String generateCreateTableStatement(String aObjectName,
            Field[] aFields) {
        StringBuffer createStatement = new StringBuffer();
        createStatement.append("CREATE TABLE `" + aObjectName + "` (");
        for (Field field : aFields) {
            // TODO Change type or remove method
            createStatement.append("`" + field.getName() + "` "
                    + convertSfdcFieldType("text") + ",");
        }
        createStatement.setLength(createStatement.length() - 1);
        createStatement.append(");");

        commander.debug(createStatement.toString());
        return createStatement.toString();
    }

    private String generateDropTableStatement(String aObjectName) {
        String tmpStatement = "DROP TABLE IF EXISTS `" + aObjectName + "`;";
        commander.debug(tmpStatement);
        return tmpStatement;
    }

    private String convertSfdcFieldType(String sfdcFieldType) {
        String dbFieldType = "text";

        return dbFieldType;
    }

    private String generateSOQLSelectQuery(String aObjectName,
            Field[] aFields) {
        StringBuffer soqlQuery = new StringBuffer();
        soqlQuery.append("SELECT ");
        for (Field field : aFields) {
            soqlQuery.append(field.getName() + ", ");
        }
        soqlQuery.setLength(soqlQuery.length() - 2);
        soqlQuery.append(" FROM " + aObjectName);
        commander.debug(soqlQuery.toString());
        return soqlQuery.toString();
    }

    private String generateInsertStatementForSObject(SObject aSObject,
            String aObjectName, Field[] aFields) {
        StringBuffer insertStatement = new StringBuffer();
        insertStatement.append("INSERT INTO `" + aObjectName + "` (");
        // Field List
        for (Field field : aFields) {
            insertStatement.append("`" + field.getName() + "`, ");
        }
        insertStatement.setLength(insertStatement.length() - 2);
        // Values
        insertStatement.append(") VALUES (");
        // for (Field field : aFields) {
        // String test = (aSObject.getField(field) + "").replace("\'", "\'\'");
        // insertStatement.append("'" + test + "', ");
        // }
        for (int i = 0; i < aFields.length; i++) {
            String test = (aSObject.get_any()[i].getValue() + "").replace("\'",
                    "\'\'");
            insertStatement.append("'" + test + "', ");
        }
        insertStatement.setLength(insertStatement.length() - 2);
        insertStatement.append(");");
        commander.debug(insertStatement.toString());
        return insertStatement.toString();
    }

}
