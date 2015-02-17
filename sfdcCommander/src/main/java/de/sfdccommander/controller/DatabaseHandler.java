/**
 * 
 */
package de.sfdccommander.controller;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sforce.soap.partner.DescribeGlobalResult;
import com.sforce.soap.partner.DescribeGlobalSObjectResult;
import com.sforce.soap.partner.DescribeSObjectResult;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;

import de.sfdccommander.controller.connection.SfdcConnectionPool;
import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen
 * 
 */
public class DatabaseHandler {

    private final CommanderConfig config;

    private SfdcCommander commander;

    private SfdcConnectionPool connPool;

    static PartnerConnection sfdcConnection;

    public DatabaseHandler(CommanderConfig aConfig) {
        config = aConfig;
    }

    public void backupOrganization() {
        commander = SfdcCommander.getInstance();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");

        commander.notify("Generating Backup for Organization: "
                + config.getSfSystemname());

        File backupFolder = new File(config.getBackupPath()
                + config.getSfSystemname());
        backupFolder.mkdirs();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection dbConnection = DriverManager
                    .getConnection("jdbc:sqlite:"
                            + backupFolder.getAbsolutePath() + File.separator
                            + config.getSfSystemname() + "_" + sdf.format(date)
                            + ".sqlite");

            connPool = SfdcConnectionPool.getInstance();
            sfdcConnection = connPool.getConnection(config);

            // run the different examples
            DescribeGlobalResult global;
            global = sfdcConnection.describeGlobal();
            String createTableStatement;
            String dropTableStatement;
            String soqlSelect;
            String insertStatement;
            Statement tmpStatement = dbConnection.createStatement();
            tmpStatement.setQueryTimeout(30);
            for (DescribeGlobalSObjectResult objectGlobalResult : global
                    .getSobjects()) {
                // create tables and download data
                DescribeSObjectResult tmpDescribeSObject = sfdcConnection
                        .describeSObject(objectGlobalResult.getName());
                if (tmpDescribeSObject.getQueryable()) {
                    if (!tmpDescribeSObject.getName().equals(
                            "ContentDocumentLink")
                            && !tmpDescribeSObject.getName().equals(
                                    "UserProfileFeed")
                            && !tmpDescribeSObject.getName().equals(
                                    "UserRecordAccess")
                            && !tmpDescribeSObject.getName().equals("Vote")) {
                        commander.notify("Object: "
                                + tmpDescribeSObject.getName());
                        commander.notify("Preparing database table.");
                        List<String> fields = getFieldList(tmpDescribeSObject);
                        dropTableStatement = generateDropTableStatement(tmpDescribeSObject
                                .getName());
                        tmpStatement.execute(dropTableStatement);
                        createTableStatement = generateCreateTableStatement(
                                tmpDescribeSObject.getName(), fields);
                        tmpStatement.execute(createTableStatement);
                        soqlSelect = generateSOQLSelectQuery(
                                tmpDescribeSObject.getName(), fields);
                        commander.notify("Downloading data...");
                        commander.notify("");
                        QueryResult queryResults = sfdcConnection
                                .queryAll(soqlSelect);
                        if (queryResults.getSize() > 0) {
                            for (SObject tmpSObject : queryResults.getRecords()) {
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

            commander.notify("Backup sucessfully created.");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ConnectionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private String generateCreateTableStatement(String aObjectName,
            List<String> aFieldList) {
        StringBuffer createStatement = new StringBuffer();
        createStatement.append("CREATE TABLE `" + aObjectName + "` (");
        for (String field : aFieldList) {
            // TODO Change type or remove method
            createStatement.append("`" + field + "` "
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
            List<String> aFieldList) {
        StringBuffer soqlQuery = new StringBuffer();
        soqlQuery.append("SELECT ");
        for (String field : aFieldList) {
            soqlQuery.append(field + ", ");
        }
        soqlQuery.setLength(soqlQuery.length() - 2);
        soqlQuery.append(" FROM " + aObjectName);
        commander.debug(soqlQuery.toString());
        return soqlQuery.toString();
    }

    private String generateInsertStatementForSObject(SObject aSObject,
            String aObjectName, List<String> aFieldList) {
        StringBuffer insertStatement = new StringBuffer();
        insertStatement.append("INSERT INTO `" + aObjectName + "` (");
        // Field List
        for (String field : aFieldList) {
            insertStatement.append("`" + field + "`, ");
        }
        insertStatement.setLength(insertStatement.length() - 2);
        // Values
        insertStatement.append(") VALUES (");
        for (String field : aFieldList) {
            String test = (aSObject.getField(field) + "").replace("\'", "\'\'");
            insertStatement.append("'" + test + "', ");
        }
        insertStatement.setLength(insertStatement.length() - 2);
        insertStatement.append(");");
        commander.debug(insertStatement.toString());
        return insertStatement.toString();
    }

    private List<String> getFieldList(DescribeSObjectResult aObject) {
        List<String> fieldList = new ArrayList<String>();
        for (int i = 0; i < aObject.getFields().length; i++) {
            fieldList.add(aObject.getFields()[i].getName());
        }
        return fieldList;
    }
}
