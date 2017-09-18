/**
 * CustomSite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomSite  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean active;

    private boolean allowHomePage;

    private java.lang.Boolean allowStandardAnswersPages;

    private boolean allowStandardIdeasPages;

    private boolean allowStandardLookups;

    private boolean allowStandardPortalPages;

    private boolean allowStandardSearch;

    private java.lang.String analyticsTrackingCode;

    private java.lang.String authorizationRequiredPage;

    private java.lang.String bandwidthExceededPage;

    private java.lang.String changePasswordPage;

    private java.lang.String chatterAnswersForgotPasswordConfirmPage;

    private java.lang.String chatterAnswersForgotPasswordPage;

    private java.lang.String chatterAnswersHelpPage;

    private java.lang.String chatterAnswersLoginPage;

    private java.lang.String chatterAnswersRegistrationPage;

    private com.sforce.soap._2006._04.metadata.SiteClickjackProtectionLevel clickjackProtectionLevel;

    private com.sforce.soap._2006._04.metadata.SiteWebAddress[] customWebAddresses;

    private java.lang.String description;

    private java.lang.String favoriteIcon;

    private java.lang.String fileNotFoundPage;

    private java.lang.String forgotPasswordPage;

    private java.lang.String genericErrorPage;

    private java.lang.String guestProfile;

    private java.lang.String inMaintenancePage;

    private java.lang.String inactiveIndexPage;

    private java.lang.String indexPage;

    private java.lang.String masterLabel;

    private java.lang.String myProfilePage;

    private java.lang.String portal;

    private boolean requireHttps;

    private boolean requireInsecurePortalAccess;

    private java.lang.String robotsTxtPage;

    private java.lang.String rootComponent;

    private java.lang.String selfRegPage;

    private java.lang.String serverIsDown;

    private java.lang.String siteAdmin;

    private com.sforce.soap._2006._04.metadata.SiteRedirectMapping[] siteRedirectMappings;

    private java.lang.String siteTemplate;

    private com.sforce.soap._2006._04.metadata.SiteType siteType;

    private java.lang.String subdomain;

    private java.lang.String urlPathPrefix;

    public CustomSite() {
    }

    public CustomSite(
           java.lang.String fullName,
           boolean active,
           boolean allowHomePage,
           java.lang.Boolean allowStandardAnswersPages,
           boolean allowStandardIdeasPages,
           boolean allowStandardLookups,
           boolean allowStandardPortalPages,
           boolean allowStandardSearch,
           java.lang.String analyticsTrackingCode,
           java.lang.String authorizationRequiredPage,
           java.lang.String bandwidthExceededPage,
           java.lang.String changePasswordPage,
           java.lang.String chatterAnswersForgotPasswordConfirmPage,
           java.lang.String chatterAnswersForgotPasswordPage,
           java.lang.String chatterAnswersHelpPage,
           java.lang.String chatterAnswersLoginPage,
           java.lang.String chatterAnswersRegistrationPage,
           com.sforce.soap._2006._04.metadata.SiteClickjackProtectionLevel clickjackProtectionLevel,
           com.sforce.soap._2006._04.metadata.SiteWebAddress[] customWebAddresses,
           java.lang.String description,
           java.lang.String favoriteIcon,
           java.lang.String fileNotFoundPage,
           java.lang.String forgotPasswordPage,
           java.lang.String genericErrorPage,
           java.lang.String guestProfile,
           java.lang.String inMaintenancePage,
           java.lang.String inactiveIndexPage,
           java.lang.String indexPage,
           java.lang.String masterLabel,
           java.lang.String myProfilePage,
           java.lang.String portal,
           boolean requireHttps,
           boolean requireInsecurePortalAccess,
           java.lang.String robotsTxtPage,
           java.lang.String rootComponent,
           java.lang.String selfRegPage,
           java.lang.String serverIsDown,
           java.lang.String siteAdmin,
           com.sforce.soap._2006._04.metadata.SiteRedirectMapping[] siteRedirectMappings,
           java.lang.String siteTemplate,
           com.sforce.soap._2006._04.metadata.SiteType siteType,
           java.lang.String subdomain,
           java.lang.String urlPathPrefix) {
        super(
            fullName);
        this.active = active;
        this.allowHomePage = allowHomePage;
        this.allowStandardAnswersPages = allowStandardAnswersPages;
        this.allowStandardIdeasPages = allowStandardIdeasPages;
        this.allowStandardLookups = allowStandardLookups;
        this.allowStandardPortalPages = allowStandardPortalPages;
        this.allowStandardSearch = allowStandardSearch;
        this.analyticsTrackingCode = analyticsTrackingCode;
        this.authorizationRequiredPage = authorizationRequiredPage;
        this.bandwidthExceededPage = bandwidthExceededPage;
        this.changePasswordPage = changePasswordPage;
        this.chatterAnswersForgotPasswordConfirmPage = chatterAnswersForgotPasswordConfirmPage;
        this.chatterAnswersForgotPasswordPage = chatterAnswersForgotPasswordPage;
        this.chatterAnswersHelpPage = chatterAnswersHelpPage;
        this.chatterAnswersLoginPage = chatterAnswersLoginPage;
        this.chatterAnswersRegistrationPage = chatterAnswersRegistrationPage;
        this.clickjackProtectionLevel = clickjackProtectionLevel;
        this.customWebAddresses = customWebAddresses;
        this.description = description;
        this.favoriteIcon = favoriteIcon;
        this.fileNotFoundPage = fileNotFoundPage;
        this.forgotPasswordPage = forgotPasswordPage;
        this.genericErrorPage = genericErrorPage;
        this.guestProfile = guestProfile;
        this.inMaintenancePage = inMaintenancePage;
        this.inactiveIndexPage = inactiveIndexPage;
        this.indexPage = indexPage;
        this.masterLabel = masterLabel;
        this.myProfilePage = myProfilePage;
        this.portal = portal;
        this.requireHttps = requireHttps;
        this.requireInsecurePortalAccess = requireInsecurePortalAccess;
        this.robotsTxtPage = robotsTxtPage;
        this.rootComponent = rootComponent;
        this.selfRegPage = selfRegPage;
        this.serverIsDown = serverIsDown;
        this.siteAdmin = siteAdmin;
        this.siteRedirectMappings = siteRedirectMappings;
        this.siteTemplate = siteTemplate;
        this.siteType = siteType;
        this.subdomain = subdomain;
        this.urlPathPrefix = urlPathPrefix;
    }


    /**
     * Gets the active value for this CustomSite.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this CustomSite.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the allowHomePage value for this CustomSite.
     * 
     * @return allowHomePage
     */
    public boolean isAllowHomePage() {
        return allowHomePage;
    }


    /**
     * Sets the allowHomePage value for this CustomSite.
     * 
     * @param allowHomePage
     */
    public void setAllowHomePage(boolean allowHomePage) {
        this.allowHomePage = allowHomePage;
    }


    /**
     * Gets the allowStandardAnswersPages value for this CustomSite.
     * 
     * @return allowStandardAnswersPages
     */
    public java.lang.Boolean getAllowStandardAnswersPages() {
        return allowStandardAnswersPages;
    }


    /**
     * Sets the allowStandardAnswersPages value for this CustomSite.
     * 
     * @param allowStandardAnswersPages
     */
    public void setAllowStandardAnswersPages(java.lang.Boolean allowStandardAnswersPages) {
        this.allowStandardAnswersPages = allowStandardAnswersPages;
    }


    /**
     * Gets the allowStandardIdeasPages value for this CustomSite.
     * 
     * @return allowStandardIdeasPages
     */
    public boolean isAllowStandardIdeasPages() {
        return allowStandardIdeasPages;
    }


    /**
     * Sets the allowStandardIdeasPages value for this CustomSite.
     * 
     * @param allowStandardIdeasPages
     */
    public void setAllowStandardIdeasPages(boolean allowStandardIdeasPages) {
        this.allowStandardIdeasPages = allowStandardIdeasPages;
    }


    /**
     * Gets the allowStandardLookups value for this CustomSite.
     * 
     * @return allowStandardLookups
     */
    public boolean isAllowStandardLookups() {
        return allowStandardLookups;
    }


    /**
     * Sets the allowStandardLookups value for this CustomSite.
     * 
     * @param allowStandardLookups
     */
    public void setAllowStandardLookups(boolean allowStandardLookups) {
        this.allowStandardLookups = allowStandardLookups;
    }


    /**
     * Gets the allowStandardPortalPages value for this CustomSite.
     * 
     * @return allowStandardPortalPages
     */
    public boolean isAllowStandardPortalPages() {
        return allowStandardPortalPages;
    }


    /**
     * Sets the allowStandardPortalPages value for this CustomSite.
     * 
     * @param allowStandardPortalPages
     */
    public void setAllowStandardPortalPages(boolean allowStandardPortalPages) {
        this.allowStandardPortalPages = allowStandardPortalPages;
    }


    /**
     * Gets the allowStandardSearch value for this CustomSite.
     * 
     * @return allowStandardSearch
     */
    public boolean isAllowStandardSearch() {
        return allowStandardSearch;
    }


    /**
     * Sets the allowStandardSearch value for this CustomSite.
     * 
     * @param allowStandardSearch
     */
    public void setAllowStandardSearch(boolean allowStandardSearch) {
        this.allowStandardSearch = allowStandardSearch;
    }


    /**
     * Gets the analyticsTrackingCode value for this CustomSite.
     * 
     * @return analyticsTrackingCode
     */
    public java.lang.String getAnalyticsTrackingCode() {
        return analyticsTrackingCode;
    }


    /**
     * Sets the analyticsTrackingCode value for this CustomSite.
     * 
     * @param analyticsTrackingCode
     */
    public void setAnalyticsTrackingCode(java.lang.String analyticsTrackingCode) {
        this.analyticsTrackingCode = analyticsTrackingCode;
    }


    /**
     * Gets the authorizationRequiredPage value for this CustomSite.
     * 
     * @return authorizationRequiredPage
     */
    public java.lang.String getAuthorizationRequiredPage() {
        return authorizationRequiredPage;
    }


    /**
     * Sets the authorizationRequiredPage value for this CustomSite.
     * 
     * @param authorizationRequiredPage
     */
    public void setAuthorizationRequiredPage(java.lang.String authorizationRequiredPage) {
        this.authorizationRequiredPage = authorizationRequiredPage;
    }


    /**
     * Gets the bandwidthExceededPage value for this CustomSite.
     * 
     * @return bandwidthExceededPage
     */
    public java.lang.String getBandwidthExceededPage() {
        return bandwidthExceededPage;
    }


    /**
     * Sets the bandwidthExceededPage value for this CustomSite.
     * 
     * @param bandwidthExceededPage
     */
    public void setBandwidthExceededPage(java.lang.String bandwidthExceededPage) {
        this.bandwidthExceededPage = bandwidthExceededPage;
    }


    /**
     * Gets the changePasswordPage value for this CustomSite.
     * 
     * @return changePasswordPage
     */
    public java.lang.String getChangePasswordPage() {
        return changePasswordPage;
    }


    /**
     * Sets the changePasswordPage value for this CustomSite.
     * 
     * @param changePasswordPage
     */
    public void setChangePasswordPage(java.lang.String changePasswordPage) {
        this.changePasswordPage = changePasswordPage;
    }


    /**
     * Gets the chatterAnswersForgotPasswordConfirmPage value for this CustomSite.
     * 
     * @return chatterAnswersForgotPasswordConfirmPage
     */
    public java.lang.String getChatterAnswersForgotPasswordConfirmPage() {
        return chatterAnswersForgotPasswordConfirmPage;
    }


    /**
     * Sets the chatterAnswersForgotPasswordConfirmPage value for this CustomSite.
     * 
     * @param chatterAnswersForgotPasswordConfirmPage
     */
    public void setChatterAnswersForgotPasswordConfirmPage(java.lang.String chatterAnswersForgotPasswordConfirmPage) {
        this.chatterAnswersForgotPasswordConfirmPage = chatterAnswersForgotPasswordConfirmPage;
    }


    /**
     * Gets the chatterAnswersForgotPasswordPage value for this CustomSite.
     * 
     * @return chatterAnswersForgotPasswordPage
     */
    public java.lang.String getChatterAnswersForgotPasswordPage() {
        return chatterAnswersForgotPasswordPage;
    }


    /**
     * Sets the chatterAnswersForgotPasswordPage value for this CustomSite.
     * 
     * @param chatterAnswersForgotPasswordPage
     */
    public void setChatterAnswersForgotPasswordPage(java.lang.String chatterAnswersForgotPasswordPage) {
        this.chatterAnswersForgotPasswordPage = chatterAnswersForgotPasswordPage;
    }


    /**
     * Gets the chatterAnswersHelpPage value for this CustomSite.
     * 
     * @return chatterAnswersHelpPage
     */
    public java.lang.String getChatterAnswersHelpPage() {
        return chatterAnswersHelpPage;
    }


    /**
     * Sets the chatterAnswersHelpPage value for this CustomSite.
     * 
     * @param chatterAnswersHelpPage
     */
    public void setChatterAnswersHelpPage(java.lang.String chatterAnswersHelpPage) {
        this.chatterAnswersHelpPage = chatterAnswersHelpPage;
    }


    /**
     * Gets the chatterAnswersLoginPage value for this CustomSite.
     * 
     * @return chatterAnswersLoginPage
     */
    public java.lang.String getChatterAnswersLoginPage() {
        return chatterAnswersLoginPage;
    }


    /**
     * Sets the chatterAnswersLoginPage value for this CustomSite.
     * 
     * @param chatterAnswersLoginPage
     */
    public void setChatterAnswersLoginPage(java.lang.String chatterAnswersLoginPage) {
        this.chatterAnswersLoginPage = chatterAnswersLoginPage;
    }


    /**
     * Gets the chatterAnswersRegistrationPage value for this CustomSite.
     * 
     * @return chatterAnswersRegistrationPage
     */
    public java.lang.String getChatterAnswersRegistrationPage() {
        return chatterAnswersRegistrationPage;
    }


    /**
     * Sets the chatterAnswersRegistrationPage value for this CustomSite.
     * 
     * @param chatterAnswersRegistrationPage
     */
    public void setChatterAnswersRegistrationPage(java.lang.String chatterAnswersRegistrationPage) {
        this.chatterAnswersRegistrationPage = chatterAnswersRegistrationPage;
    }


    /**
     * Gets the clickjackProtectionLevel value for this CustomSite.
     * 
     * @return clickjackProtectionLevel
     */
    public com.sforce.soap._2006._04.metadata.SiteClickjackProtectionLevel getClickjackProtectionLevel() {
        return clickjackProtectionLevel;
    }


    /**
     * Sets the clickjackProtectionLevel value for this CustomSite.
     * 
     * @param clickjackProtectionLevel
     */
    public void setClickjackProtectionLevel(com.sforce.soap._2006._04.metadata.SiteClickjackProtectionLevel clickjackProtectionLevel) {
        this.clickjackProtectionLevel = clickjackProtectionLevel;
    }


    /**
     * Gets the customWebAddresses value for this CustomSite.
     * 
     * @return customWebAddresses
     */
    public com.sforce.soap._2006._04.metadata.SiteWebAddress[] getCustomWebAddresses() {
        return customWebAddresses;
    }


    /**
     * Sets the customWebAddresses value for this CustomSite.
     * 
     * @param customWebAddresses
     */
    public void setCustomWebAddresses(com.sforce.soap._2006._04.metadata.SiteWebAddress[] customWebAddresses) {
        this.customWebAddresses = customWebAddresses;
    }

    public com.sforce.soap._2006._04.metadata.SiteWebAddress getCustomWebAddresses(int i) {
        return this.customWebAddresses[i];
    }

    public void setCustomWebAddresses(int i, com.sforce.soap._2006._04.metadata.SiteWebAddress _value) {
        this.customWebAddresses[i] = _value;
    }


    /**
     * Gets the description value for this CustomSite.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomSite.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the favoriteIcon value for this CustomSite.
     * 
     * @return favoriteIcon
     */
    public java.lang.String getFavoriteIcon() {
        return favoriteIcon;
    }


    /**
     * Sets the favoriteIcon value for this CustomSite.
     * 
     * @param favoriteIcon
     */
    public void setFavoriteIcon(java.lang.String favoriteIcon) {
        this.favoriteIcon = favoriteIcon;
    }


    /**
     * Gets the fileNotFoundPage value for this CustomSite.
     * 
     * @return fileNotFoundPage
     */
    public java.lang.String getFileNotFoundPage() {
        return fileNotFoundPage;
    }


    /**
     * Sets the fileNotFoundPage value for this CustomSite.
     * 
     * @param fileNotFoundPage
     */
    public void setFileNotFoundPage(java.lang.String fileNotFoundPage) {
        this.fileNotFoundPage = fileNotFoundPage;
    }


    /**
     * Gets the forgotPasswordPage value for this CustomSite.
     * 
     * @return forgotPasswordPage
     */
    public java.lang.String getForgotPasswordPage() {
        return forgotPasswordPage;
    }


    /**
     * Sets the forgotPasswordPage value for this CustomSite.
     * 
     * @param forgotPasswordPage
     */
    public void setForgotPasswordPage(java.lang.String forgotPasswordPage) {
        this.forgotPasswordPage = forgotPasswordPage;
    }


    /**
     * Gets the genericErrorPage value for this CustomSite.
     * 
     * @return genericErrorPage
     */
    public java.lang.String getGenericErrorPage() {
        return genericErrorPage;
    }


    /**
     * Sets the genericErrorPage value for this CustomSite.
     * 
     * @param genericErrorPage
     */
    public void setGenericErrorPage(java.lang.String genericErrorPage) {
        this.genericErrorPage = genericErrorPage;
    }


    /**
     * Gets the guestProfile value for this CustomSite.
     * 
     * @return guestProfile
     */
    public java.lang.String getGuestProfile() {
        return guestProfile;
    }


    /**
     * Sets the guestProfile value for this CustomSite.
     * 
     * @param guestProfile
     */
    public void setGuestProfile(java.lang.String guestProfile) {
        this.guestProfile = guestProfile;
    }


    /**
     * Gets the inMaintenancePage value for this CustomSite.
     * 
     * @return inMaintenancePage
     */
    public java.lang.String getInMaintenancePage() {
        return inMaintenancePage;
    }


    /**
     * Sets the inMaintenancePage value for this CustomSite.
     * 
     * @param inMaintenancePage
     */
    public void setInMaintenancePage(java.lang.String inMaintenancePage) {
        this.inMaintenancePage = inMaintenancePage;
    }


    /**
     * Gets the inactiveIndexPage value for this CustomSite.
     * 
     * @return inactiveIndexPage
     */
    public java.lang.String getInactiveIndexPage() {
        return inactiveIndexPage;
    }


    /**
     * Sets the inactiveIndexPage value for this CustomSite.
     * 
     * @param inactiveIndexPage
     */
    public void setInactiveIndexPage(java.lang.String inactiveIndexPage) {
        this.inactiveIndexPage = inactiveIndexPage;
    }


    /**
     * Gets the indexPage value for this CustomSite.
     * 
     * @return indexPage
     */
    public java.lang.String getIndexPage() {
        return indexPage;
    }


    /**
     * Sets the indexPage value for this CustomSite.
     * 
     * @param indexPage
     */
    public void setIndexPage(java.lang.String indexPage) {
        this.indexPage = indexPage;
    }


    /**
     * Gets the masterLabel value for this CustomSite.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this CustomSite.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the myProfilePage value for this CustomSite.
     * 
     * @return myProfilePage
     */
    public java.lang.String getMyProfilePage() {
        return myProfilePage;
    }


    /**
     * Sets the myProfilePage value for this CustomSite.
     * 
     * @param myProfilePage
     */
    public void setMyProfilePage(java.lang.String myProfilePage) {
        this.myProfilePage = myProfilePage;
    }


    /**
     * Gets the portal value for this CustomSite.
     * 
     * @return portal
     */
    public java.lang.String getPortal() {
        return portal;
    }


    /**
     * Sets the portal value for this CustomSite.
     * 
     * @param portal
     */
    public void setPortal(java.lang.String portal) {
        this.portal = portal;
    }


    /**
     * Gets the requireHttps value for this CustomSite.
     * 
     * @return requireHttps
     */
    public boolean isRequireHttps() {
        return requireHttps;
    }


    /**
     * Sets the requireHttps value for this CustomSite.
     * 
     * @param requireHttps
     */
    public void setRequireHttps(boolean requireHttps) {
        this.requireHttps = requireHttps;
    }


    /**
     * Gets the requireInsecurePortalAccess value for this CustomSite.
     * 
     * @return requireInsecurePortalAccess
     */
    public boolean isRequireInsecurePortalAccess() {
        return requireInsecurePortalAccess;
    }


    /**
     * Sets the requireInsecurePortalAccess value for this CustomSite.
     * 
     * @param requireInsecurePortalAccess
     */
    public void setRequireInsecurePortalAccess(boolean requireInsecurePortalAccess) {
        this.requireInsecurePortalAccess = requireInsecurePortalAccess;
    }


    /**
     * Gets the robotsTxtPage value for this CustomSite.
     * 
     * @return robotsTxtPage
     */
    public java.lang.String getRobotsTxtPage() {
        return robotsTxtPage;
    }


    /**
     * Sets the robotsTxtPage value for this CustomSite.
     * 
     * @param robotsTxtPage
     */
    public void setRobotsTxtPage(java.lang.String robotsTxtPage) {
        this.robotsTxtPage = robotsTxtPage;
    }


    /**
     * Gets the rootComponent value for this CustomSite.
     * 
     * @return rootComponent
     */
    public java.lang.String getRootComponent() {
        return rootComponent;
    }


    /**
     * Sets the rootComponent value for this CustomSite.
     * 
     * @param rootComponent
     */
    public void setRootComponent(java.lang.String rootComponent) {
        this.rootComponent = rootComponent;
    }


    /**
     * Gets the selfRegPage value for this CustomSite.
     * 
     * @return selfRegPage
     */
    public java.lang.String getSelfRegPage() {
        return selfRegPage;
    }


    /**
     * Sets the selfRegPage value for this CustomSite.
     * 
     * @param selfRegPage
     */
    public void setSelfRegPage(java.lang.String selfRegPage) {
        this.selfRegPage = selfRegPage;
    }


    /**
     * Gets the serverIsDown value for this CustomSite.
     * 
     * @return serverIsDown
     */
    public java.lang.String getServerIsDown() {
        return serverIsDown;
    }


    /**
     * Sets the serverIsDown value for this CustomSite.
     * 
     * @param serverIsDown
     */
    public void setServerIsDown(java.lang.String serverIsDown) {
        this.serverIsDown = serverIsDown;
    }


    /**
     * Gets the siteAdmin value for this CustomSite.
     * 
     * @return siteAdmin
     */
    public java.lang.String getSiteAdmin() {
        return siteAdmin;
    }


    /**
     * Sets the siteAdmin value for this CustomSite.
     * 
     * @param siteAdmin
     */
    public void setSiteAdmin(java.lang.String siteAdmin) {
        this.siteAdmin = siteAdmin;
    }


    /**
     * Gets the siteRedirectMappings value for this CustomSite.
     * 
     * @return siteRedirectMappings
     */
    public com.sforce.soap._2006._04.metadata.SiteRedirectMapping[] getSiteRedirectMappings() {
        return siteRedirectMappings;
    }


    /**
     * Sets the siteRedirectMappings value for this CustomSite.
     * 
     * @param siteRedirectMappings
     */
    public void setSiteRedirectMappings(com.sforce.soap._2006._04.metadata.SiteRedirectMapping[] siteRedirectMappings) {
        this.siteRedirectMappings = siteRedirectMappings;
    }

    public com.sforce.soap._2006._04.metadata.SiteRedirectMapping getSiteRedirectMappings(int i) {
        return this.siteRedirectMappings[i];
    }

    public void setSiteRedirectMappings(int i, com.sforce.soap._2006._04.metadata.SiteRedirectMapping _value) {
        this.siteRedirectMappings[i] = _value;
    }


    /**
     * Gets the siteTemplate value for this CustomSite.
     * 
     * @return siteTemplate
     */
    public java.lang.String getSiteTemplate() {
        return siteTemplate;
    }


    /**
     * Sets the siteTemplate value for this CustomSite.
     * 
     * @param siteTemplate
     */
    public void setSiteTemplate(java.lang.String siteTemplate) {
        this.siteTemplate = siteTemplate;
    }


    /**
     * Gets the siteType value for this CustomSite.
     * 
     * @return siteType
     */
    public com.sforce.soap._2006._04.metadata.SiteType getSiteType() {
        return siteType;
    }


    /**
     * Sets the siteType value for this CustomSite.
     * 
     * @param siteType
     */
    public void setSiteType(com.sforce.soap._2006._04.metadata.SiteType siteType) {
        this.siteType = siteType;
    }


    /**
     * Gets the subdomain value for this CustomSite.
     * 
     * @return subdomain
     */
    public java.lang.String getSubdomain() {
        return subdomain;
    }


    /**
     * Sets the subdomain value for this CustomSite.
     * 
     * @param subdomain
     */
    public void setSubdomain(java.lang.String subdomain) {
        this.subdomain = subdomain;
    }


    /**
     * Gets the urlPathPrefix value for this CustomSite.
     * 
     * @return urlPathPrefix
     */
    public java.lang.String getUrlPathPrefix() {
        return urlPathPrefix;
    }


    /**
     * Sets the urlPathPrefix value for this CustomSite.
     * 
     * @param urlPathPrefix
     */
    public void setUrlPathPrefix(java.lang.String urlPathPrefix) {
        this.urlPathPrefix = urlPathPrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomSite)) return false;
        CustomSite other = (CustomSite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            this.allowHomePage == other.isAllowHomePage() &&
            ((this.allowStandardAnswersPages==null && other.getAllowStandardAnswersPages()==null) || 
             (this.allowStandardAnswersPages!=null &&
              this.allowStandardAnswersPages.equals(other.getAllowStandardAnswersPages()))) &&
            this.allowStandardIdeasPages == other.isAllowStandardIdeasPages() &&
            this.allowStandardLookups == other.isAllowStandardLookups() &&
            this.allowStandardPortalPages == other.isAllowStandardPortalPages() &&
            this.allowStandardSearch == other.isAllowStandardSearch() &&
            ((this.analyticsTrackingCode==null && other.getAnalyticsTrackingCode()==null) || 
             (this.analyticsTrackingCode!=null &&
              this.analyticsTrackingCode.equals(other.getAnalyticsTrackingCode()))) &&
            ((this.authorizationRequiredPage==null && other.getAuthorizationRequiredPage()==null) || 
             (this.authorizationRequiredPage!=null &&
              this.authorizationRequiredPage.equals(other.getAuthorizationRequiredPage()))) &&
            ((this.bandwidthExceededPage==null && other.getBandwidthExceededPage()==null) || 
             (this.bandwidthExceededPage!=null &&
              this.bandwidthExceededPage.equals(other.getBandwidthExceededPage()))) &&
            ((this.changePasswordPage==null && other.getChangePasswordPage()==null) || 
             (this.changePasswordPage!=null &&
              this.changePasswordPage.equals(other.getChangePasswordPage()))) &&
            ((this.chatterAnswersForgotPasswordConfirmPage==null && other.getChatterAnswersForgotPasswordConfirmPage()==null) || 
             (this.chatterAnswersForgotPasswordConfirmPage!=null &&
              this.chatterAnswersForgotPasswordConfirmPage.equals(other.getChatterAnswersForgotPasswordConfirmPage()))) &&
            ((this.chatterAnswersForgotPasswordPage==null && other.getChatterAnswersForgotPasswordPage()==null) || 
             (this.chatterAnswersForgotPasswordPage!=null &&
              this.chatterAnswersForgotPasswordPage.equals(other.getChatterAnswersForgotPasswordPage()))) &&
            ((this.chatterAnswersHelpPage==null && other.getChatterAnswersHelpPage()==null) || 
             (this.chatterAnswersHelpPage!=null &&
              this.chatterAnswersHelpPage.equals(other.getChatterAnswersHelpPage()))) &&
            ((this.chatterAnswersLoginPage==null && other.getChatterAnswersLoginPage()==null) || 
             (this.chatterAnswersLoginPage!=null &&
              this.chatterAnswersLoginPage.equals(other.getChatterAnswersLoginPage()))) &&
            ((this.chatterAnswersRegistrationPage==null && other.getChatterAnswersRegistrationPage()==null) || 
             (this.chatterAnswersRegistrationPage!=null &&
              this.chatterAnswersRegistrationPage.equals(other.getChatterAnswersRegistrationPage()))) &&
            ((this.clickjackProtectionLevel==null && other.getClickjackProtectionLevel()==null) || 
             (this.clickjackProtectionLevel!=null &&
              this.clickjackProtectionLevel.equals(other.getClickjackProtectionLevel()))) &&
            ((this.customWebAddresses==null && other.getCustomWebAddresses()==null) || 
             (this.customWebAddresses!=null &&
              java.util.Arrays.equals(this.customWebAddresses, other.getCustomWebAddresses()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.favoriteIcon==null && other.getFavoriteIcon()==null) || 
             (this.favoriteIcon!=null &&
              this.favoriteIcon.equals(other.getFavoriteIcon()))) &&
            ((this.fileNotFoundPage==null && other.getFileNotFoundPage()==null) || 
             (this.fileNotFoundPage!=null &&
              this.fileNotFoundPage.equals(other.getFileNotFoundPage()))) &&
            ((this.forgotPasswordPage==null && other.getForgotPasswordPage()==null) || 
             (this.forgotPasswordPage!=null &&
              this.forgotPasswordPage.equals(other.getForgotPasswordPage()))) &&
            ((this.genericErrorPage==null && other.getGenericErrorPage()==null) || 
             (this.genericErrorPage!=null &&
              this.genericErrorPage.equals(other.getGenericErrorPage()))) &&
            ((this.guestProfile==null && other.getGuestProfile()==null) || 
             (this.guestProfile!=null &&
              this.guestProfile.equals(other.getGuestProfile()))) &&
            ((this.inMaintenancePage==null && other.getInMaintenancePage()==null) || 
             (this.inMaintenancePage!=null &&
              this.inMaintenancePage.equals(other.getInMaintenancePage()))) &&
            ((this.inactiveIndexPage==null && other.getInactiveIndexPage()==null) || 
             (this.inactiveIndexPage!=null &&
              this.inactiveIndexPage.equals(other.getInactiveIndexPage()))) &&
            ((this.indexPage==null && other.getIndexPage()==null) || 
             (this.indexPage!=null &&
              this.indexPage.equals(other.getIndexPage()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.myProfilePage==null && other.getMyProfilePage()==null) || 
             (this.myProfilePage!=null &&
              this.myProfilePage.equals(other.getMyProfilePage()))) &&
            ((this.portal==null && other.getPortal()==null) || 
             (this.portal!=null &&
              this.portal.equals(other.getPortal()))) &&
            this.requireHttps == other.isRequireHttps() &&
            this.requireInsecurePortalAccess == other.isRequireInsecurePortalAccess() &&
            ((this.robotsTxtPage==null && other.getRobotsTxtPage()==null) || 
             (this.robotsTxtPage!=null &&
              this.robotsTxtPage.equals(other.getRobotsTxtPage()))) &&
            ((this.rootComponent==null && other.getRootComponent()==null) || 
             (this.rootComponent!=null &&
              this.rootComponent.equals(other.getRootComponent()))) &&
            ((this.selfRegPage==null && other.getSelfRegPage()==null) || 
             (this.selfRegPage!=null &&
              this.selfRegPage.equals(other.getSelfRegPage()))) &&
            ((this.serverIsDown==null && other.getServerIsDown()==null) || 
             (this.serverIsDown!=null &&
              this.serverIsDown.equals(other.getServerIsDown()))) &&
            ((this.siteAdmin==null && other.getSiteAdmin()==null) || 
             (this.siteAdmin!=null &&
              this.siteAdmin.equals(other.getSiteAdmin()))) &&
            ((this.siteRedirectMappings==null && other.getSiteRedirectMappings()==null) || 
             (this.siteRedirectMappings!=null &&
              java.util.Arrays.equals(this.siteRedirectMappings, other.getSiteRedirectMappings()))) &&
            ((this.siteTemplate==null && other.getSiteTemplate()==null) || 
             (this.siteTemplate!=null &&
              this.siteTemplate.equals(other.getSiteTemplate()))) &&
            ((this.siteType==null && other.getSiteType()==null) || 
             (this.siteType!=null &&
              this.siteType.equals(other.getSiteType()))) &&
            ((this.subdomain==null && other.getSubdomain()==null) || 
             (this.subdomain!=null &&
              this.subdomain.equals(other.getSubdomain()))) &&
            ((this.urlPathPrefix==null && other.getUrlPathPrefix()==null) || 
             (this.urlPathPrefix!=null &&
              this.urlPathPrefix.equals(other.getUrlPathPrefix())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowHomePage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAllowStandardAnswersPages() != null) {
            _hashCode += getAllowStandardAnswersPages().hashCode();
        }
        _hashCode += (isAllowStandardIdeasPages() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowStandardLookups() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowStandardPortalPages() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowStandardSearch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAnalyticsTrackingCode() != null) {
            _hashCode += getAnalyticsTrackingCode().hashCode();
        }
        if (getAuthorizationRequiredPage() != null) {
            _hashCode += getAuthorizationRequiredPage().hashCode();
        }
        if (getBandwidthExceededPage() != null) {
            _hashCode += getBandwidthExceededPage().hashCode();
        }
        if (getChangePasswordPage() != null) {
            _hashCode += getChangePasswordPage().hashCode();
        }
        if (getChatterAnswersForgotPasswordConfirmPage() != null) {
            _hashCode += getChatterAnswersForgotPasswordConfirmPage().hashCode();
        }
        if (getChatterAnswersForgotPasswordPage() != null) {
            _hashCode += getChatterAnswersForgotPasswordPage().hashCode();
        }
        if (getChatterAnswersHelpPage() != null) {
            _hashCode += getChatterAnswersHelpPage().hashCode();
        }
        if (getChatterAnswersLoginPage() != null) {
            _hashCode += getChatterAnswersLoginPage().hashCode();
        }
        if (getChatterAnswersRegistrationPage() != null) {
            _hashCode += getChatterAnswersRegistrationPage().hashCode();
        }
        if (getClickjackProtectionLevel() != null) {
            _hashCode += getClickjackProtectionLevel().hashCode();
        }
        if (getCustomWebAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomWebAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomWebAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFavoriteIcon() != null) {
            _hashCode += getFavoriteIcon().hashCode();
        }
        if (getFileNotFoundPage() != null) {
            _hashCode += getFileNotFoundPage().hashCode();
        }
        if (getForgotPasswordPage() != null) {
            _hashCode += getForgotPasswordPage().hashCode();
        }
        if (getGenericErrorPage() != null) {
            _hashCode += getGenericErrorPage().hashCode();
        }
        if (getGuestProfile() != null) {
            _hashCode += getGuestProfile().hashCode();
        }
        if (getInMaintenancePage() != null) {
            _hashCode += getInMaintenancePage().hashCode();
        }
        if (getInactiveIndexPage() != null) {
            _hashCode += getInactiveIndexPage().hashCode();
        }
        if (getIndexPage() != null) {
            _hashCode += getIndexPage().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getMyProfilePage() != null) {
            _hashCode += getMyProfilePage().hashCode();
        }
        if (getPortal() != null) {
            _hashCode += getPortal().hashCode();
        }
        _hashCode += (isRequireHttps() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRequireInsecurePortalAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRobotsTxtPage() != null) {
            _hashCode += getRobotsTxtPage().hashCode();
        }
        if (getRootComponent() != null) {
            _hashCode += getRootComponent().hashCode();
        }
        if (getSelfRegPage() != null) {
            _hashCode += getSelfRegPage().hashCode();
        }
        if (getServerIsDown() != null) {
            _hashCode += getServerIsDown().hashCode();
        }
        if (getSiteAdmin() != null) {
            _hashCode += getSiteAdmin().hashCode();
        }
        if (getSiteRedirectMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSiteRedirectMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiteRedirectMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSiteTemplate() != null) {
            _hashCode += getSiteTemplate().hashCode();
        }
        if (getSiteType() != null) {
            _hashCode += getSiteType().hashCode();
        }
        if (getSubdomain() != null) {
            _hashCode += getSubdomain().hashCode();
        }
        if (getUrlPathPrefix() != null) {
            _hashCode += getUrlPathPrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomSite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomSite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowHomePage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowHomePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStandardAnswersPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowStandardAnswersPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStandardIdeasPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowStandardIdeasPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStandardLookups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowStandardLookups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStandardPortalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowStandardPortalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStandardSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowStandardSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analyticsTrackingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "analyticsTrackingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationRequiredPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "authorizationRequiredPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthExceededPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bandwidthExceededPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePasswordPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "changePasswordPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterAnswersForgotPasswordConfirmPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterAnswersForgotPasswordConfirmPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterAnswersForgotPasswordPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterAnswersForgotPasswordPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterAnswersHelpPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterAnswersHelpPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterAnswersLoginPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterAnswersLoginPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterAnswersRegistrationPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterAnswersRegistrationPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickjackProtectionLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "clickjackProtectionLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteClickjackProtectionLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customWebAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customWebAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteWebAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoriteIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "favoriteIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNotFoundPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fileNotFoundPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgotPasswordPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forgotPasswordPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericErrorPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "genericErrorPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "guestProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inMaintenancePage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inMaintenancePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactiveIndexPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inactiveIndexPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "indexPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myProfilePage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "myProfilePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "portal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireHttps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "requireHttps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireInsecurePortalAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "requireInsecurePortalAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("robotsTxtPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "robotsTxtPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rootComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "selfRegPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverIsDown");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "serverIsDown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "siteAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteRedirectMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "siteRedirectMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteRedirectMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "siteTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "siteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "subdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlPathPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "urlPathPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
