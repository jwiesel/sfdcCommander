/**
 * 
 */
package de.sfdccommander.controller;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jochen
 *
 */
public class DatabaseHandlerTest {

    @Test
    public void generateDropTableStatementTest() {
        DatabaseHandler dbHandler = new DatabaseHandler(null, null);
        String dropStmt = dbHandler.generateDropTableStatement("objects");
        Assert.assertEquals("DROP TABLE IF EXISTS `objects`;", dropStmt);
    }
}
