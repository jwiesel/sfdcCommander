/**
 * 
 */
package de.sfdccommander.model;

/**
 * @author jochen
 *
 */
public class SvnConfig {

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
     * @return the svnRepository
     */
    public final String getSvnRepository() {
        return svnRepository;
    }

    /**
     * @param aSvnRepository
     *            the svnRepository to set
     */
    public final void setSvnRepository(String aSvnRepository) {
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
    public final void setSvnUser(String aSvnUser) {
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
    public final void setSvnPassword(String aSvnPassword) {
        svnPassword = aSvnPassword;
    }

}
