/**
 * CaseSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CaseSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String caseAssignNotificationTemplate;

    private java.lang.String caseCloseNotificationTemplate;

    private java.lang.String caseCommentNotificationTemplate;

    private java.lang.String caseCreateNotificationTemplate;

    private com.sforce.soap._2006._04.metadata.FeedItemSettings[] caseFeedItemSettings;

    private java.lang.Boolean closeCaseThroughStatusChange;

    private java.lang.String defaultCaseOwner;

    private java.lang.String defaultCaseOwnerType;

    private java.lang.String defaultCaseUser;

    private java.lang.String emailActionDefaultsHandlerClass;

    private com.sforce.soap._2006._04.metadata.EmailToCaseSettings emailToCase;

    private java.lang.Boolean enableCaseFeed;

    private java.lang.Boolean enableDraftEmails;

    private java.lang.Boolean enableEarlyEscalationRuleTriggers;

    private java.lang.Boolean enableEmailActionDefaultsHandler;

    private java.lang.Boolean enableSuggestedArticlesApplication;

    private java.lang.Boolean enableSuggestedArticlesCustomerPortal;

    private java.lang.Boolean enableSuggestedArticlesPartnerPortal;

    private java.lang.Boolean enableSuggestedSolutions;

    private java.lang.Boolean keepRecordTypeOnAssignmentRule;

    private java.lang.Boolean notifyContactOnCaseComment;

    private java.lang.Boolean notifyDefaultCaseOwner;

    private java.lang.Boolean notifyOwnerOnCaseComment;

    private java.lang.Boolean notifyOwnerOnCaseOwnerChange;

    private java.lang.Boolean showFewerCloseActions;

    private java.lang.Boolean useSystemEmailAddress;

    private com.sforce.soap._2006._04.metadata.WebToCaseSettings webToCase;

    public CaseSettings() {
    }

    public CaseSettings(
           java.lang.String fullName,
           java.lang.String caseAssignNotificationTemplate,
           java.lang.String caseCloseNotificationTemplate,
           java.lang.String caseCommentNotificationTemplate,
           java.lang.String caseCreateNotificationTemplate,
           com.sforce.soap._2006._04.metadata.FeedItemSettings[] caseFeedItemSettings,
           java.lang.Boolean closeCaseThroughStatusChange,
           java.lang.String defaultCaseOwner,
           java.lang.String defaultCaseOwnerType,
           java.lang.String defaultCaseUser,
           java.lang.String emailActionDefaultsHandlerClass,
           com.sforce.soap._2006._04.metadata.EmailToCaseSettings emailToCase,
           java.lang.Boolean enableCaseFeed,
           java.lang.Boolean enableDraftEmails,
           java.lang.Boolean enableEarlyEscalationRuleTriggers,
           java.lang.Boolean enableEmailActionDefaultsHandler,
           java.lang.Boolean enableSuggestedArticlesApplication,
           java.lang.Boolean enableSuggestedArticlesCustomerPortal,
           java.lang.Boolean enableSuggestedArticlesPartnerPortal,
           java.lang.Boolean enableSuggestedSolutions,
           java.lang.Boolean keepRecordTypeOnAssignmentRule,
           java.lang.Boolean notifyContactOnCaseComment,
           java.lang.Boolean notifyDefaultCaseOwner,
           java.lang.Boolean notifyOwnerOnCaseComment,
           java.lang.Boolean notifyOwnerOnCaseOwnerChange,
           java.lang.Boolean showFewerCloseActions,
           java.lang.Boolean useSystemEmailAddress,
           com.sforce.soap._2006._04.metadata.WebToCaseSettings webToCase) {
        super(
            fullName);
        this.caseAssignNotificationTemplate = caseAssignNotificationTemplate;
        this.caseCloseNotificationTemplate = caseCloseNotificationTemplate;
        this.caseCommentNotificationTemplate = caseCommentNotificationTemplate;
        this.caseCreateNotificationTemplate = caseCreateNotificationTemplate;
        this.caseFeedItemSettings = caseFeedItemSettings;
        this.closeCaseThroughStatusChange = closeCaseThroughStatusChange;
        this.defaultCaseOwner = defaultCaseOwner;
        this.defaultCaseOwnerType = defaultCaseOwnerType;
        this.defaultCaseUser = defaultCaseUser;
        this.emailActionDefaultsHandlerClass = emailActionDefaultsHandlerClass;
        this.emailToCase = emailToCase;
        this.enableCaseFeed = enableCaseFeed;
        this.enableDraftEmails = enableDraftEmails;
        this.enableEarlyEscalationRuleTriggers = enableEarlyEscalationRuleTriggers;
        this.enableEmailActionDefaultsHandler = enableEmailActionDefaultsHandler;
        this.enableSuggestedArticlesApplication = enableSuggestedArticlesApplication;
        this.enableSuggestedArticlesCustomerPortal = enableSuggestedArticlesCustomerPortal;
        this.enableSuggestedArticlesPartnerPortal = enableSuggestedArticlesPartnerPortal;
        this.enableSuggestedSolutions = enableSuggestedSolutions;
        this.keepRecordTypeOnAssignmentRule = keepRecordTypeOnAssignmentRule;
        this.notifyContactOnCaseComment = notifyContactOnCaseComment;
        this.notifyDefaultCaseOwner = notifyDefaultCaseOwner;
        this.notifyOwnerOnCaseComment = notifyOwnerOnCaseComment;
        this.notifyOwnerOnCaseOwnerChange = notifyOwnerOnCaseOwnerChange;
        this.showFewerCloseActions = showFewerCloseActions;
        this.useSystemEmailAddress = useSystemEmailAddress;
        this.webToCase = webToCase;
    }


    /**
     * Gets the caseAssignNotificationTemplate value for this CaseSettings.
     * 
     * @return caseAssignNotificationTemplate
     */
    public java.lang.String getCaseAssignNotificationTemplate() {
        return caseAssignNotificationTemplate;
    }


    /**
     * Sets the caseAssignNotificationTemplate value for this CaseSettings.
     * 
     * @param caseAssignNotificationTemplate
     */
    public void setCaseAssignNotificationTemplate(java.lang.String caseAssignNotificationTemplate) {
        this.caseAssignNotificationTemplate = caseAssignNotificationTemplate;
    }


    /**
     * Gets the caseCloseNotificationTemplate value for this CaseSettings.
     * 
     * @return caseCloseNotificationTemplate
     */
    public java.lang.String getCaseCloseNotificationTemplate() {
        return caseCloseNotificationTemplate;
    }


    /**
     * Sets the caseCloseNotificationTemplate value for this CaseSettings.
     * 
     * @param caseCloseNotificationTemplate
     */
    public void setCaseCloseNotificationTemplate(java.lang.String caseCloseNotificationTemplate) {
        this.caseCloseNotificationTemplate = caseCloseNotificationTemplate;
    }


    /**
     * Gets the caseCommentNotificationTemplate value for this CaseSettings.
     * 
     * @return caseCommentNotificationTemplate
     */
    public java.lang.String getCaseCommentNotificationTemplate() {
        return caseCommentNotificationTemplate;
    }


    /**
     * Sets the caseCommentNotificationTemplate value for this CaseSettings.
     * 
     * @param caseCommentNotificationTemplate
     */
    public void setCaseCommentNotificationTemplate(java.lang.String caseCommentNotificationTemplate) {
        this.caseCommentNotificationTemplate = caseCommentNotificationTemplate;
    }


    /**
     * Gets the caseCreateNotificationTemplate value for this CaseSettings.
     * 
     * @return caseCreateNotificationTemplate
     */
    public java.lang.String getCaseCreateNotificationTemplate() {
        return caseCreateNotificationTemplate;
    }


    /**
     * Sets the caseCreateNotificationTemplate value for this CaseSettings.
     * 
     * @param caseCreateNotificationTemplate
     */
    public void setCaseCreateNotificationTemplate(java.lang.String caseCreateNotificationTemplate) {
        this.caseCreateNotificationTemplate = caseCreateNotificationTemplate;
    }


    /**
     * Gets the caseFeedItemSettings value for this CaseSettings.
     * 
     * @return caseFeedItemSettings
     */
    public com.sforce.soap._2006._04.metadata.FeedItemSettings[] getCaseFeedItemSettings() {
        return caseFeedItemSettings;
    }


    /**
     * Sets the caseFeedItemSettings value for this CaseSettings.
     * 
     * @param caseFeedItemSettings
     */
    public void setCaseFeedItemSettings(com.sforce.soap._2006._04.metadata.FeedItemSettings[] caseFeedItemSettings) {
        this.caseFeedItemSettings = caseFeedItemSettings;
    }

    public com.sforce.soap._2006._04.metadata.FeedItemSettings getCaseFeedItemSettings(int i) {
        return this.caseFeedItemSettings[i];
    }

    public void setCaseFeedItemSettings(int i, com.sforce.soap._2006._04.metadata.FeedItemSettings _value) {
        this.caseFeedItemSettings[i] = _value;
    }


    /**
     * Gets the closeCaseThroughStatusChange value for this CaseSettings.
     * 
     * @return closeCaseThroughStatusChange
     */
    public java.lang.Boolean getCloseCaseThroughStatusChange() {
        return closeCaseThroughStatusChange;
    }


    /**
     * Sets the closeCaseThroughStatusChange value for this CaseSettings.
     * 
     * @param closeCaseThroughStatusChange
     */
    public void setCloseCaseThroughStatusChange(java.lang.Boolean closeCaseThroughStatusChange) {
        this.closeCaseThroughStatusChange = closeCaseThroughStatusChange;
    }


    /**
     * Gets the defaultCaseOwner value for this CaseSettings.
     * 
     * @return defaultCaseOwner
     */
    public java.lang.String getDefaultCaseOwner() {
        return defaultCaseOwner;
    }


    /**
     * Sets the defaultCaseOwner value for this CaseSettings.
     * 
     * @param defaultCaseOwner
     */
    public void setDefaultCaseOwner(java.lang.String defaultCaseOwner) {
        this.defaultCaseOwner = defaultCaseOwner;
    }


    /**
     * Gets the defaultCaseOwnerType value for this CaseSettings.
     * 
     * @return defaultCaseOwnerType
     */
    public java.lang.String getDefaultCaseOwnerType() {
        return defaultCaseOwnerType;
    }


    /**
     * Sets the defaultCaseOwnerType value for this CaseSettings.
     * 
     * @param defaultCaseOwnerType
     */
    public void setDefaultCaseOwnerType(java.lang.String defaultCaseOwnerType) {
        this.defaultCaseOwnerType = defaultCaseOwnerType;
    }


    /**
     * Gets the defaultCaseUser value for this CaseSettings.
     * 
     * @return defaultCaseUser
     */
    public java.lang.String getDefaultCaseUser() {
        return defaultCaseUser;
    }


    /**
     * Sets the defaultCaseUser value for this CaseSettings.
     * 
     * @param defaultCaseUser
     */
    public void setDefaultCaseUser(java.lang.String defaultCaseUser) {
        this.defaultCaseUser = defaultCaseUser;
    }


    /**
     * Gets the emailActionDefaultsHandlerClass value for this CaseSettings.
     * 
     * @return emailActionDefaultsHandlerClass
     */
    public java.lang.String getEmailActionDefaultsHandlerClass() {
        return emailActionDefaultsHandlerClass;
    }


    /**
     * Sets the emailActionDefaultsHandlerClass value for this CaseSettings.
     * 
     * @param emailActionDefaultsHandlerClass
     */
    public void setEmailActionDefaultsHandlerClass(java.lang.String emailActionDefaultsHandlerClass) {
        this.emailActionDefaultsHandlerClass = emailActionDefaultsHandlerClass;
    }


    /**
     * Gets the emailToCase value for this CaseSettings.
     * 
     * @return emailToCase
     */
    public com.sforce.soap._2006._04.metadata.EmailToCaseSettings getEmailToCase() {
        return emailToCase;
    }


    /**
     * Sets the emailToCase value for this CaseSettings.
     * 
     * @param emailToCase
     */
    public void setEmailToCase(com.sforce.soap._2006._04.metadata.EmailToCaseSettings emailToCase) {
        this.emailToCase = emailToCase;
    }


    /**
     * Gets the enableCaseFeed value for this CaseSettings.
     * 
     * @return enableCaseFeed
     */
    public java.lang.Boolean getEnableCaseFeed() {
        return enableCaseFeed;
    }


    /**
     * Sets the enableCaseFeed value for this CaseSettings.
     * 
     * @param enableCaseFeed
     */
    public void setEnableCaseFeed(java.lang.Boolean enableCaseFeed) {
        this.enableCaseFeed = enableCaseFeed;
    }


    /**
     * Gets the enableDraftEmails value for this CaseSettings.
     * 
     * @return enableDraftEmails
     */
    public java.lang.Boolean getEnableDraftEmails() {
        return enableDraftEmails;
    }


    /**
     * Sets the enableDraftEmails value for this CaseSettings.
     * 
     * @param enableDraftEmails
     */
    public void setEnableDraftEmails(java.lang.Boolean enableDraftEmails) {
        this.enableDraftEmails = enableDraftEmails;
    }


    /**
     * Gets the enableEarlyEscalationRuleTriggers value for this CaseSettings.
     * 
     * @return enableEarlyEscalationRuleTriggers
     */
    public java.lang.Boolean getEnableEarlyEscalationRuleTriggers() {
        return enableEarlyEscalationRuleTriggers;
    }


    /**
     * Sets the enableEarlyEscalationRuleTriggers value for this CaseSettings.
     * 
     * @param enableEarlyEscalationRuleTriggers
     */
    public void setEnableEarlyEscalationRuleTriggers(java.lang.Boolean enableEarlyEscalationRuleTriggers) {
        this.enableEarlyEscalationRuleTriggers = enableEarlyEscalationRuleTriggers;
    }


    /**
     * Gets the enableEmailActionDefaultsHandler value for this CaseSettings.
     * 
     * @return enableEmailActionDefaultsHandler
     */
    public java.lang.Boolean getEnableEmailActionDefaultsHandler() {
        return enableEmailActionDefaultsHandler;
    }


    /**
     * Sets the enableEmailActionDefaultsHandler value for this CaseSettings.
     * 
     * @param enableEmailActionDefaultsHandler
     */
    public void setEnableEmailActionDefaultsHandler(java.lang.Boolean enableEmailActionDefaultsHandler) {
        this.enableEmailActionDefaultsHandler = enableEmailActionDefaultsHandler;
    }


    /**
     * Gets the enableSuggestedArticlesApplication value for this CaseSettings.
     * 
     * @return enableSuggestedArticlesApplication
     */
    public java.lang.Boolean getEnableSuggestedArticlesApplication() {
        return enableSuggestedArticlesApplication;
    }


    /**
     * Sets the enableSuggestedArticlesApplication value for this CaseSettings.
     * 
     * @param enableSuggestedArticlesApplication
     */
    public void setEnableSuggestedArticlesApplication(java.lang.Boolean enableSuggestedArticlesApplication) {
        this.enableSuggestedArticlesApplication = enableSuggestedArticlesApplication;
    }


    /**
     * Gets the enableSuggestedArticlesCustomerPortal value for this CaseSettings.
     * 
     * @return enableSuggestedArticlesCustomerPortal
     */
    public java.lang.Boolean getEnableSuggestedArticlesCustomerPortal() {
        return enableSuggestedArticlesCustomerPortal;
    }


    /**
     * Sets the enableSuggestedArticlesCustomerPortal value for this CaseSettings.
     * 
     * @param enableSuggestedArticlesCustomerPortal
     */
    public void setEnableSuggestedArticlesCustomerPortal(java.lang.Boolean enableSuggestedArticlesCustomerPortal) {
        this.enableSuggestedArticlesCustomerPortal = enableSuggestedArticlesCustomerPortal;
    }


    /**
     * Gets the enableSuggestedArticlesPartnerPortal value for this CaseSettings.
     * 
     * @return enableSuggestedArticlesPartnerPortal
     */
    public java.lang.Boolean getEnableSuggestedArticlesPartnerPortal() {
        return enableSuggestedArticlesPartnerPortal;
    }


    /**
     * Sets the enableSuggestedArticlesPartnerPortal value for this CaseSettings.
     * 
     * @param enableSuggestedArticlesPartnerPortal
     */
    public void setEnableSuggestedArticlesPartnerPortal(java.lang.Boolean enableSuggestedArticlesPartnerPortal) {
        this.enableSuggestedArticlesPartnerPortal = enableSuggestedArticlesPartnerPortal;
    }


    /**
     * Gets the enableSuggestedSolutions value for this CaseSettings.
     * 
     * @return enableSuggestedSolutions
     */
    public java.lang.Boolean getEnableSuggestedSolutions() {
        return enableSuggestedSolutions;
    }


    /**
     * Sets the enableSuggestedSolutions value for this CaseSettings.
     * 
     * @param enableSuggestedSolutions
     */
    public void setEnableSuggestedSolutions(java.lang.Boolean enableSuggestedSolutions) {
        this.enableSuggestedSolutions = enableSuggestedSolutions;
    }


    /**
     * Gets the keepRecordTypeOnAssignmentRule value for this CaseSettings.
     * 
     * @return keepRecordTypeOnAssignmentRule
     */
    public java.lang.Boolean getKeepRecordTypeOnAssignmentRule() {
        return keepRecordTypeOnAssignmentRule;
    }


    /**
     * Sets the keepRecordTypeOnAssignmentRule value for this CaseSettings.
     * 
     * @param keepRecordTypeOnAssignmentRule
     */
    public void setKeepRecordTypeOnAssignmentRule(java.lang.Boolean keepRecordTypeOnAssignmentRule) {
        this.keepRecordTypeOnAssignmentRule = keepRecordTypeOnAssignmentRule;
    }


    /**
     * Gets the notifyContactOnCaseComment value for this CaseSettings.
     * 
     * @return notifyContactOnCaseComment
     */
    public java.lang.Boolean getNotifyContactOnCaseComment() {
        return notifyContactOnCaseComment;
    }


    /**
     * Sets the notifyContactOnCaseComment value for this CaseSettings.
     * 
     * @param notifyContactOnCaseComment
     */
    public void setNotifyContactOnCaseComment(java.lang.Boolean notifyContactOnCaseComment) {
        this.notifyContactOnCaseComment = notifyContactOnCaseComment;
    }


    /**
     * Gets the notifyDefaultCaseOwner value for this CaseSettings.
     * 
     * @return notifyDefaultCaseOwner
     */
    public java.lang.Boolean getNotifyDefaultCaseOwner() {
        return notifyDefaultCaseOwner;
    }


    /**
     * Sets the notifyDefaultCaseOwner value for this CaseSettings.
     * 
     * @param notifyDefaultCaseOwner
     */
    public void setNotifyDefaultCaseOwner(java.lang.Boolean notifyDefaultCaseOwner) {
        this.notifyDefaultCaseOwner = notifyDefaultCaseOwner;
    }


    /**
     * Gets the notifyOwnerOnCaseComment value for this CaseSettings.
     * 
     * @return notifyOwnerOnCaseComment
     */
    public java.lang.Boolean getNotifyOwnerOnCaseComment() {
        return notifyOwnerOnCaseComment;
    }


    /**
     * Sets the notifyOwnerOnCaseComment value for this CaseSettings.
     * 
     * @param notifyOwnerOnCaseComment
     */
    public void setNotifyOwnerOnCaseComment(java.lang.Boolean notifyOwnerOnCaseComment) {
        this.notifyOwnerOnCaseComment = notifyOwnerOnCaseComment;
    }


    /**
     * Gets the notifyOwnerOnCaseOwnerChange value for this CaseSettings.
     * 
     * @return notifyOwnerOnCaseOwnerChange
     */
    public java.lang.Boolean getNotifyOwnerOnCaseOwnerChange() {
        return notifyOwnerOnCaseOwnerChange;
    }


    /**
     * Sets the notifyOwnerOnCaseOwnerChange value for this CaseSettings.
     * 
     * @param notifyOwnerOnCaseOwnerChange
     */
    public void setNotifyOwnerOnCaseOwnerChange(java.lang.Boolean notifyOwnerOnCaseOwnerChange) {
        this.notifyOwnerOnCaseOwnerChange = notifyOwnerOnCaseOwnerChange;
    }


    /**
     * Gets the showFewerCloseActions value for this CaseSettings.
     * 
     * @return showFewerCloseActions
     */
    public java.lang.Boolean getShowFewerCloseActions() {
        return showFewerCloseActions;
    }


    /**
     * Sets the showFewerCloseActions value for this CaseSettings.
     * 
     * @param showFewerCloseActions
     */
    public void setShowFewerCloseActions(java.lang.Boolean showFewerCloseActions) {
        this.showFewerCloseActions = showFewerCloseActions;
    }


    /**
     * Gets the useSystemEmailAddress value for this CaseSettings.
     * 
     * @return useSystemEmailAddress
     */
    public java.lang.Boolean getUseSystemEmailAddress() {
        return useSystemEmailAddress;
    }


    /**
     * Sets the useSystemEmailAddress value for this CaseSettings.
     * 
     * @param useSystemEmailAddress
     */
    public void setUseSystemEmailAddress(java.lang.Boolean useSystemEmailAddress) {
        this.useSystemEmailAddress = useSystemEmailAddress;
    }


    /**
     * Gets the webToCase value for this CaseSettings.
     * 
     * @return webToCase
     */
    public com.sforce.soap._2006._04.metadata.WebToCaseSettings getWebToCase() {
        return webToCase;
    }


    /**
     * Sets the webToCase value for this CaseSettings.
     * 
     * @param webToCase
     */
    public void setWebToCase(com.sforce.soap._2006._04.metadata.WebToCaseSettings webToCase) {
        this.webToCase = webToCase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseSettings)) return false;
        CaseSettings other = (CaseSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.caseAssignNotificationTemplate==null && other.getCaseAssignNotificationTemplate()==null) || 
             (this.caseAssignNotificationTemplate!=null &&
              this.caseAssignNotificationTemplate.equals(other.getCaseAssignNotificationTemplate()))) &&
            ((this.caseCloseNotificationTemplate==null && other.getCaseCloseNotificationTemplate()==null) || 
             (this.caseCloseNotificationTemplate!=null &&
              this.caseCloseNotificationTemplate.equals(other.getCaseCloseNotificationTemplate()))) &&
            ((this.caseCommentNotificationTemplate==null && other.getCaseCommentNotificationTemplate()==null) || 
             (this.caseCommentNotificationTemplate!=null &&
              this.caseCommentNotificationTemplate.equals(other.getCaseCommentNotificationTemplate()))) &&
            ((this.caseCreateNotificationTemplate==null && other.getCaseCreateNotificationTemplate()==null) || 
             (this.caseCreateNotificationTemplate!=null &&
              this.caseCreateNotificationTemplate.equals(other.getCaseCreateNotificationTemplate()))) &&
            ((this.caseFeedItemSettings==null && other.getCaseFeedItemSettings()==null) || 
             (this.caseFeedItemSettings!=null &&
              java.util.Arrays.equals(this.caseFeedItemSettings, other.getCaseFeedItemSettings()))) &&
            ((this.closeCaseThroughStatusChange==null && other.getCloseCaseThroughStatusChange()==null) || 
             (this.closeCaseThroughStatusChange!=null &&
              this.closeCaseThroughStatusChange.equals(other.getCloseCaseThroughStatusChange()))) &&
            ((this.defaultCaseOwner==null && other.getDefaultCaseOwner()==null) || 
             (this.defaultCaseOwner!=null &&
              this.defaultCaseOwner.equals(other.getDefaultCaseOwner()))) &&
            ((this.defaultCaseOwnerType==null && other.getDefaultCaseOwnerType()==null) || 
             (this.defaultCaseOwnerType!=null &&
              this.defaultCaseOwnerType.equals(other.getDefaultCaseOwnerType()))) &&
            ((this.defaultCaseUser==null && other.getDefaultCaseUser()==null) || 
             (this.defaultCaseUser!=null &&
              this.defaultCaseUser.equals(other.getDefaultCaseUser()))) &&
            ((this.emailActionDefaultsHandlerClass==null && other.getEmailActionDefaultsHandlerClass()==null) || 
             (this.emailActionDefaultsHandlerClass!=null &&
              this.emailActionDefaultsHandlerClass.equals(other.getEmailActionDefaultsHandlerClass()))) &&
            ((this.emailToCase==null && other.getEmailToCase()==null) || 
             (this.emailToCase!=null &&
              this.emailToCase.equals(other.getEmailToCase()))) &&
            ((this.enableCaseFeed==null && other.getEnableCaseFeed()==null) || 
             (this.enableCaseFeed!=null &&
              this.enableCaseFeed.equals(other.getEnableCaseFeed()))) &&
            ((this.enableDraftEmails==null && other.getEnableDraftEmails()==null) || 
             (this.enableDraftEmails!=null &&
              this.enableDraftEmails.equals(other.getEnableDraftEmails()))) &&
            ((this.enableEarlyEscalationRuleTriggers==null && other.getEnableEarlyEscalationRuleTriggers()==null) || 
             (this.enableEarlyEscalationRuleTriggers!=null &&
              this.enableEarlyEscalationRuleTriggers.equals(other.getEnableEarlyEscalationRuleTriggers()))) &&
            ((this.enableEmailActionDefaultsHandler==null && other.getEnableEmailActionDefaultsHandler()==null) || 
             (this.enableEmailActionDefaultsHandler!=null &&
              this.enableEmailActionDefaultsHandler.equals(other.getEnableEmailActionDefaultsHandler()))) &&
            ((this.enableSuggestedArticlesApplication==null && other.getEnableSuggestedArticlesApplication()==null) || 
             (this.enableSuggestedArticlesApplication!=null &&
              this.enableSuggestedArticlesApplication.equals(other.getEnableSuggestedArticlesApplication()))) &&
            ((this.enableSuggestedArticlesCustomerPortal==null && other.getEnableSuggestedArticlesCustomerPortal()==null) || 
             (this.enableSuggestedArticlesCustomerPortal!=null &&
              this.enableSuggestedArticlesCustomerPortal.equals(other.getEnableSuggestedArticlesCustomerPortal()))) &&
            ((this.enableSuggestedArticlesPartnerPortal==null && other.getEnableSuggestedArticlesPartnerPortal()==null) || 
             (this.enableSuggestedArticlesPartnerPortal!=null &&
              this.enableSuggestedArticlesPartnerPortal.equals(other.getEnableSuggestedArticlesPartnerPortal()))) &&
            ((this.enableSuggestedSolutions==null && other.getEnableSuggestedSolutions()==null) || 
             (this.enableSuggestedSolutions!=null &&
              this.enableSuggestedSolutions.equals(other.getEnableSuggestedSolutions()))) &&
            ((this.keepRecordTypeOnAssignmentRule==null && other.getKeepRecordTypeOnAssignmentRule()==null) || 
             (this.keepRecordTypeOnAssignmentRule!=null &&
              this.keepRecordTypeOnAssignmentRule.equals(other.getKeepRecordTypeOnAssignmentRule()))) &&
            ((this.notifyContactOnCaseComment==null && other.getNotifyContactOnCaseComment()==null) || 
             (this.notifyContactOnCaseComment!=null &&
              this.notifyContactOnCaseComment.equals(other.getNotifyContactOnCaseComment()))) &&
            ((this.notifyDefaultCaseOwner==null && other.getNotifyDefaultCaseOwner()==null) || 
             (this.notifyDefaultCaseOwner!=null &&
              this.notifyDefaultCaseOwner.equals(other.getNotifyDefaultCaseOwner()))) &&
            ((this.notifyOwnerOnCaseComment==null && other.getNotifyOwnerOnCaseComment()==null) || 
             (this.notifyOwnerOnCaseComment!=null &&
              this.notifyOwnerOnCaseComment.equals(other.getNotifyOwnerOnCaseComment()))) &&
            ((this.notifyOwnerOnCaseOwnerChange==null && other.getNotifyOwnerOnCaseOwnerChange()==null) || 
             (this.notifyOwnerOnCaseOwnerChange!=null &&
              this.notifyOwnerOnCaseOwnerChange.equals(other.getNotifyOwnerOnCaseOwnerChange()))) &&
            ((this.showFewerCloseActions==null && other.getShowFewerCloseActions()==null) || 
             (this.showFewerCloseActions!=null &&
              this.showFewerCloseActions.equals(other.getShowFewerCloseActions()))) &&
            ((this.useSystemEmailAddress==null && other.getUseSystemEmailAddress()==null) || 
             (this.useSystemEmailAddress!=null &&
              this.useSystemEmailAddress.equals(other.getUseSystemEmailAddress()))) &&
            ((this.webToCase==null && other.getWebToCase()==null) || 
             (this.webToCase!=null &&
              this.webToCase.equals(other.getWebToCase())));
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
        if (getCaseAssignNotificationTemplate() != null) {
            _hashCode += getCaseAssignNotificationTemplate().hashCode();
        }
        if (getCaseCloseNotificationTemplate() != null) {
            _hashCode += getCaseCloseNotificationTemplate().hashCode();
        }
        if (getCaseCommentNotificationTemplate() != null) {
            _hashCode += getCaseCommentNotificationTemplate().hashCode();
        }
        if (getCaseCreateNotificationTemplate() != null) {
            _hashCode += getCaseCreateNotificationTemplate().hashCode();
        }
        if (getCaseFeedItemSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseFeedItemSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseFeedItemSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCloseCaseThroughStatusChange() != null) {
            _hashCode += getCloseCaseThroughStatusChange().hashCode();
        }
        if (getDefaultCaseOwner() != null) {
            _hashCode += getDefaultCaseOwner().hashCode();
        }
        if (getDefaultCaseOwnerType() != null) {
            _hashCode += getDefaultCaseOwnerType().hashCode();
        }
        if (getDefaultCaseUser() != null) {
            _hashCode += getDefaultCaseUser().hashCode();
        }
        if (getEmailActionDefaultsHandlerClass() != null) {
            _hashCode += getEmailActionDefaultsHandlerClass().hashCode();
        }
        if (getEmailToCase() != null) {
            _hashCode += getEmailToCase().hashCode();
        }
        if (getEnableCaseFeed() != null) {
            _hashCode += getEnableCaseFeed().hashCode();
        }
        if (getEnableDraftEmails() != null) {
            _hashCode += getEnableDraftEmails().hashCode();
        }
        if (getEnableEarlyEscalationRuleTriggers() != null) {
            _hashCode += getEnableEarlyEscalationRuleTriggers().hashCode();
        }
        if (getEnableEmailActionDefaultsHandler() != null) {
            _hashCode += getEnableEmailActionDefaultsHandler().hashCode();
        }
        if (getEnableSuggestedArticlesApplication() != null) {
            _hashCode += getEnableSuggestedArticlesApplication().hashCode();
        }
        if (getEnableSuggestedArticlesCustomerPortal() != null) {
            _hashCode += getEnableSuggestedArticlesCustomerPortal().hashCode();
        }
        if (getEnableSuggestedArticlesPartnerPortal() != null) {
            _hashCode += getEnableSuggestedArticlesPartnerPortal().hashCode();
        }
        if (getEnableSuggestedSolutions() != null) {
            _hashCode += getEnableSuggestedSolutions().hashCode();
        }
        if (getKeepRecordTypeOnAssignmentRule() != null) {
            _hashCode += getKeepRecordTypeOnAssignmentRule().hashCode();
        }
        if (getNotifyContactOnCaseComment() != null) {
            _hashCode += getNotifyContactOnCaseComment().hashCode();
        }
        if (getNotifyDefaultCaseOwner() != null) {
            _hashCode += getNotifyDefaultCaseOwner().hashCode();
        }
        if (getNotifyOwnerOnCaseComment() != null) {
            _hashCode += getNotifyOwnerOnCaseComment().hashCode();
        }
        if (getNotifyOwnerOnCaseOwnerChange() != null) {
            _hashCode += getNotifyOwnerOnCaseOwnerChange().hashCode();
        }
        if (getShowFewerCloseActions() != null) {
            _hashCode += getShowFewerCloseActions().hashCode();
        }
        if (getUseSystemEmailAddress() != null) {
            _hashCode += getUseSystemEmailAddress().hashCode();
        }
        if (getWebToCase() != null) {
            _hashCode += getWebToCase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAssignNotificationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseAssignNotificationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCloseNotificationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseCloseNotificationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCommentNotificationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseCommentNotificationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCreateNotificationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseCreateNotificationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseFeedItemSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseFeedItemSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeCaseThroughStatusChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "closeCaseThroughStatusChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCaseOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultCaseOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCaseOwnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultCaseOwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCaseUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultCaseUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailActionDefaultsHandlerClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailActionDefaultsHandlerClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailToCase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailToCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCaseFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCaseFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableDraftEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableDraftEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableEarlyEscalationRuleTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableEarlyEscalationRuleTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableEmailActionDefaultsHandler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableEmailActionDefaultsHandler"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSuggestedArticlesApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSuggestedArticlesApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSuggestedArticlesCustomerPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSuggestedArticlesCustomerPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSuggestedArticlesPartnerPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSuggestedArticlesPartnerPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSuggestedSolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSuggestedSolutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keepRecordTypeOnAssignmentRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "keepRecordTypeOnAssignmentRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyContactOnCaseComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyContactOnCaseComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyDefaultCaseOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyDefaultCaseOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyOwnerOnCaseComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyOwnerOnCaseComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyOwnerOnCaseOwnerChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyOwnerOnCaseOwnerChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showFewerCloseActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showFewerCloseActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSystemEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "useSystemEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webToCase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "webToCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebToCaseSettings"));
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
