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
    private SfdcConfig sourceSfdcConfig;

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
    private SvnConfig svnConfig;

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
    private SfdcConfig targetSfdcConfig;

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

    /**
     * @return the svnConfig
     */
    public SvnConfig getSvnConfig() {
        return svnConfig;
    }

    /**
     * @param aSvnConfig
     *            the svnConfig to set
     */
    public void setSvnConfig(SvnConfig aSvnConfig) {
        svnConfig = aSvnConfig;
    }

    /**
     * @return the sourceSfdcConfig
     */
    public SfdcConfig getSourceSfdcConfig() {
        return sourceSfdcConfig;
    }

    /**
     * @param aSourceSfdcConfig
     *            the sourceSfdcConfig to set
     */
    public void setSourceSfdcConfig(SfdcConfig aSourceSfdcConfig) {
        sourceSfdcConfig = aSourceSfdcConfig;
    }

    /**
     * @return the targetSfdcConfig
     */
    public SfdcConfig getTargetSfdcConfig() {
        return targetSfdcConfig;
    }

    /**
     * @param aTargetSfdcConfig
     *            the targetSfdcConfig to set
     */
    public void setTargetSfdcConfig(SfdcConfig aTargetSfdcConfig) {
        targetSfdcConfig = aTargetSfdcConfig;
    }

}
