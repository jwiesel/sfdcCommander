/**
 * 
 */
package de.sfdccommander.controller;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.CommanderConfig;

/**
 * @author jochen
 *
 */
public class CommanderPropertiesHandlerTest {

    @Test
    public void loadPropertiesTest() throws CommanderException {
        CommanderPropertiesHandler propHandler = new CommanderPropertiesHandler(
                "src/test/resources/Test.properties");
        CommanderConfig config = propHandler.loadProperties();
        Assert.assertEquals(config.getSourceSfdcConfig().getSystemName(),
                "MyDevelopmentOrg");
        Assert.assertEquals(config.getSourceSfdcConfig().getUsername(),
                "user@devAccount.com");
        Assert.assertEquals(config.getSourceSfdcConfig().getPassword(),
                "MyPasswordAndSecurityToken");
        Assert.assertEquals(config.getHttpProxyHost(), "TestProxyHost");
        Assert.assertEquals(config.getHttpProxyPort(), "8080");
        Assert.assertEquals(config.getSvnConfig().getSvnRepository(),
                "https://my.svn.server/repository/");
        Assert.assertEquals(config.getSvnConfig().getSvnUser(), "svnUsername");
        Assert.assertEquals(config.getSvnConfig().getSvnPassword(),
                "svnPassword");
        Assert.assertEquals(config.getRenderPath(), "c:/html/");
        Assert.assertEquals(config.getXlsPath(), "c:/xls/");
        Assert.assertEquals(config.getBackupPath(), "c:/sfdcBackup/");
        Assert.assertEquals(config.getTargetSfdcConfig().getSystemName(),
                "MyTargetOrg");
        Assert.assertEquals(config.getTargetSfdcConfig().getUsername(),
                "user@testAccount.com");
        Assert.assertEquals(config.getTargetSfdcConfig().getPassword(),
                "TargetPasswordAndSecurityToken");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void loadPropertiesTest2() throws CommanderException {
        CommanderPropertiesHandler propHandler = new CommanderPropertiesHandler(
                "src/test/resources/NotExisting.properties");
        thrown.expect(CommanderException.class);
        CommanderConfig config = propHandler.loadProperties();
    }

}
