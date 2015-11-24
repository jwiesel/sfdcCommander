/**
 * 
 */
package de.sfdccommander.model;

/**
 * @author jochen
 * 
 */
public class SfdcConfig {

    /**
     * SFDC User.
     */
    private String username;
    /**
     * SFDC Password.
     */
    private String password;

    private String loginUrl;

    /**
     * SFDC System Name.
     */
    private String systemName;

    /**
     * @return the username
     */
    public final String getUsername() {
        return username;
    }

    /**
     * @param aUsername
     *            the username to set
     */
    public final void setUsername(final String aUsername) {
        username = aUsername;
    }

    /**
     * @return the password
     */
    public final String getPassword() {
        return password;
    }

    /**
     * @param aPassword
     *            the password to set
     */
    public final void setPassword(final String aPassword) {
        password = aPassword;
    }

    /**
     * @return the systemName
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * @param aSystemName
     *            the systemName to set
     */
    public void setSystemName(String aSystemName) {
        systemName = aSystemName;
    }

    /**
     * @return the loginUrl
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    /**
     * @param aLoginUrl
     *            the loginUrl to set
     */
    public void setLoginUrl(String aLoginUrl) {
        loginUrl = aLoginUrl;
        if (loginUrl.endsWith("/")) {
            loginUrl = loginUrl.substring(0, loginUrl.length() - 1);
        }
    }

}
