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

    /**
     * SFDC URL.
     */
    private String url;

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
     * @return the url
     */
    public final String getUrl() {
        return url;
    }

    /**
     * @param url
     *            the url to set
     */
    public final void setUrl(final String aUrl) {
        this.url = aUrl;
    }

}
