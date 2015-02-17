/**
 * 
 */
package de.sfdccommander.model;

/**
 * @author jochen
 * 
 */
public class CommanderConfig {

    /**
     * 
     */
    public static final String SF_SYSTEMNAME = "sf.systemname";

    /**
     * 
     */
    public static final String SF_USERNAME = "sf.username";

    /**
     * 
     */
    public static final String SF_PASSWORD = "sf.password";

    /**
     * 
     */
    public static final String SF_SERVERURL = "sf.serverurl";

    /**
     * 
     */
    public static final String SF_PACKAGE = "sf.package";

    /**
     * 
     */
    public static final String SF_POLL_WAIT_MILLIS = "sf.pollwaitmillis";

    /**
     * 
     */
    public static final String SF_TIMEOUT_SECONDS = "sf.timeoutseconds";

    /**
     * 
     */
    public static final String HTTP_PROXY_HOST = "http.proxyHost";

    /**
     * 
     */
    public static final String HTTP_PROXY_PORT = "http.proxyPort";

    /**
     * 
     */
    public static final String SVN_REPOSITORY = "svn.repository";

    /**
     * 
     */
    public static final String SVN_USER = "svn.user";

    /**
     * 
     */
    public static final String SVN_PASSWORD = "svn.password";

    /**
     * 
     */
    public static final String RENDER_PATH = "render.path";

    /**
     * 
     */
    public static final String XLS_PATH = "xls.path";

    /**
     * 
     */
    public static final String BACKUP_PATH = "backup.path";

    /**
     * 
     */
    public static final String SF_TARGET_SYSTEMNAME = "target.systemname";

    /**
     * 
     */
    public static final String SF_TARGET_USERNAME = "target.username";

    /**
     * 
     */
    public static final String SF_TARGET_PASSWORD = "target.password";

    /**
     * 
     */
    public static final String SF_TARGET_SERVERURL = "target.serverurl";

    /**
     * 
     */
    private String sfSystemname;
    /**
     * 
     */
    private String sfUsername;
    /**
     * 
     */
    private String sfPassword;
    /**
     * 
     */
    private String sfServerurl;
    /**
     * 
     */
    private String sfPackage;
    /**
     * 
     */
    private String sfTimeoutSeconds;
    /**
     * 
     */
    private String httpProxyHost;
    /**
     * 
     */
    private String httpProxyPort;

    /**
     * 
     */
    private String svnRepository;
    /**
     * 
     */
    private String svnUser;
    /**
     * 
     */
    private String svnPassword;
    /**
     * 
     */
    private String renderPath;
    /**
     * 
     */
    private String xlsPath;
    /**
     * 
     */
    private String backupPath;
    /**
     * 
     */
    private String sfTargetSystemname;
    /**
     * 
     */
    private String sfTargetUsername;
    /**
     * 
     */
    private String sfTargetPassword;
    /**
     * 
     */
    private String sfTargetServerurl;

    /**
     * @return the sfSystemname
     */
    public final String getSfSystemname() {
        return sfSystemname;
    }

    /**
     * @param aSfSystemname
     *            the sfSystemname to set
     */
    public final void setSfSystemname(final String aSfSystemname) {
        sfSystemname = aSfSystemname;
    }

    /**
     * @return the sfUsername
     */
    public final String getSfUsername() {
        return sfUsername;
    }

    /**
     * @param aSfUsername
     *            the sfUsername to set
     */
    public final void setSfUsername(final String aSfUsername) {
        sfUsername = aSfUsername;
    }

    /**
     * @return the sfPassword
     */
    public final String getSfPassword() {
        return sfPassword;
    }

    /**
     * @param aSfPassword
     *            the sfPassword to set
     */
    public final void setSfPassword(final String aSfPassword) {
        sfPassword = aSfPassword;
    }

    /**
     * @return the sfServerurl
     */
    public final String getSfServerurl() {
        return sfServerurl;
    }

    /**
     * @param aSfServerurl
     *            the sfServerurl to set
     */
    public final void setSfServerurl(final String aSfServerurl) {
        sfServerurl = aSfServerurl;
    }

    /**
     * @return the sfPackage
     */
    public final String getSfPackage() {
        return sfPackage;
    }

    /**
     * @param aSfPackage
     *            the sfPackage to set
     */
    public final void setSfPackage(final String aSfPackage) {
        sfPackage = aSfPackage;
    }

    /**
     * @return the svnRepository
     */
    public final String getSvnRepository() {
        return svnRepository;
    }

    /**
     * @param aSvnRepository
     *            the svnRepository to set
     */
    public final void setSvnRepository(final String aSvnRepository) {
        svnRepository = aSvnRepository;
    }

    /**
     * @return the svnUser
     */
    public final String getSvnUser() {
        return svnUser;
    }

    /**
     * @param aSvnUser
     *            the svnUser to set
     */
    public final void setSvnUser(final String aSvnUser) {
        svnUser = aSvnUser;
    }

    /**
     * @return the svnPassword
     */
    public final String getSvnPassword() {
        return svnPassword;
    }

    /**
     * @param aSvnPassword
     *            the svnPassword to set
     */
    public final void setSvnPassword(final String aSvnPassword) {
        svnPassword = aSvnPassword;
    }

    /**
     * @return the renderPath
     */
    public final String getRenderPath() {
        return renderPath;
    }

    /**
     * @param aRenderPath
     *            the renderPath to set
     */
    public final void setRenderPath(final String aRenderPath) {
        renderPath = aRenderPath;
    }

    /**
     * @return the sfTargetSystemname
     */
    public final String getSfTargetSystemname() {
        return sfTargetSystemname;
    }

    /**
     * @param aSfTargetSystemname
     *            the sfTargetSystemname to set
     */
    public final void setSfTargetSystemname(final String aSfTargetSystemname) {
        sfTargetSystemname = aSfTargetSystemname;
    }

    /**
     * @return the sfTargetUsername
     */
    public final String getSfTargetUsername() {
        return sfTargetUsername;
    }

    /**
     * @param aSfTargetUsername
     *            the sfTargetUsername to set
     */
    public final void setSfTargetUsername(final String aSfTargetUsername) {
        sfTargetUsername = aSfTargetUsername;
    }

    /**
     * @return the sfTargetPassword
     */
    public final String getSfTargetPassword() {
        return sfTargetPassword;
    }

    /**
     * @param aSfTargetPassword
     *            the sfTargetPassword to set
     */
    public final void setSfTargetPassword(final String aSfTargetPassword) {
        sfTargetPassword = aSfTargetPassword;
    }

    /**
     * @return the sfTargetServerurl
     */
    public final String getSfTargetServerurl() {
        return sfTargetServerurl;
    }

    /**
     * @param aSfTargetServerurl
     *            the sfTargetServerurl to set
     */
    public final void setSfTargetServerurl(final String aSfTargetServerurl) {
        sfTargetServerurl = aSfTargetServerurl;
    }

    /**
     * @return the sfTimeoutSeconds
     */
    public final String getSfTimeoutSeconds() {
        return sfTimeoutSeconds;
    }

    /**
     * @param aSfTimeoutSeconds
     *            the sfTimeoutSeconds to set
     */
    public final void setSfTimeoutSeconds(String aSfTimeoutSeconds) {
        sfTimeoutSeconds = aSfTimeoutSeconds;
    }

    /**
     * @return the httpProxyHost
     */
    public final String getHttpProxyHost() {
        return httpProxyHost;
    }

    /**
     * @param aHttpProxyHost
     *            the httpProxyHost to set
     */
    public final void setHttpProxyHost(String aHttpProxyHost) {
        httpProxyHost = aHttpProxyHost;
    }

    /**
     * @return the httpProxyPort
     */
    public final String getHttpProxyPort() {
        return httpProxyPort;
    }

    /**
     * @param aHttpProxyPort
     *            the httpProxyPort to set
     */
    public final void setHttpProxyPort(String aHttpProxyPort) {
        httpProxyPort = aHttpProxyPort;
    }

    /**
     * @return the xlsPath
     */
    public final String getXlsPath() {
        return xlsPath;
    }

    /**
     * @param aXlsPath
     *            the xlsPath to set
     */
    public final void setXlsPath(String aXlsPath) {
        xlsPath = aXlsPath;
    }

    /**
     * @return the backupPath
     */
    public final String getBackupPath() {
        return backupPath;
    }

    /**
     * @param aBackupPath
     *            the backupPath to set
     */
    public final void setBackupPath(String aBackupPath) {
        backupPath = aBackupPath;
    }

}
