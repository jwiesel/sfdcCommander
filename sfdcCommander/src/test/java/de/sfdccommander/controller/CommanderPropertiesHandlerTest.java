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
        Assert.assertEquals("MyDevelopmentOrg",
                config.getSourceSfdcConfig().getSystemName());
        Assert.assertEquals("user@devAccount.com",
                config.getSourceSfdcConfig().getUsername());
        Assert.assertEquals("MyPasswordAndSecurityToken",
                config.getSourceSfdcConfig().getPassword());
        Assert.assertEquals("https://login.salesforce.com",
                config.getSourceSfdcConfig().getLoginUrl());
        Assert.assertEquals("TestProxyHost", config.getHttpProxyHost());
        Assert.assertEquals("8080", config.getHttpProxyPort());
        Assert.assertEquals("https://my.svn.server/repository/",
                config.getSvnConfig().getSvnRepository());
        Assert.assertEquals("svnUsername", config.getSvnConfig().getSvnUser());
        Assert.assertEquals("svnPassword",
                config.getSvnConfig().getSvnPassword());
        Assert.assertEquals("c:/html/", config.getRenderPath());
        Assert.assertEquals("c:/xls/", config.getXlsPath());
        Assert.assertEquals("c:/sfdcBackup/", config.getBackupPath());
        Assert.assertEquals("MyTargetOrg",
                config.getTargetSfdcConfig().getSystemName());
        Assert.assertEquals("user@testAccount.com",
                config.getTargetSfdcConfig().getUsername());
        Assert.assertEquals("TargetPasswordAndSecurityToken",
                config.getTargetSfdcConfig().getPassword());
        Assert.assertEquals("https://test.salesforce.com",
                config.getTargetSfdcConfig().getLoginUrl());
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
