/**
 * Portal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Portal  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean active;

    private java.lang.String admin;

    private java.lang.String defaultLanguage;

    private java.lang.String description;

    private java.lang.String emailSenderAddress;

    private java.lang.String emailSenderName;

    private java.lang.Boolean enableSelfCloseCase;

    private java.lang.String footerDocument;

    private java.lang.String forgotPassTemplate;

    private java.lang.String headerDocument;

    private java.lang.Boolean isSelfRegistrationActivated;

    private java.lang.String loginHeaderDocument;

    private java.lang.String logoDocument;

    private java.lang.String logoutUrl;

    private java.lang.String newCommentTemplate;

    private java.lang.String newPassTemplate;

    private java.lang.String newUserTemplate;

    private java.lang.String ownerNotifyTemplate;

    private java.lang.String selfRegNewUserUrl;

    private java.lang.String selfRegUserDefaultProfile;

    private com.sforce.soap._2006._04.metadata.PortalRoles selfRegUserDefaultRole;

    private java.lang.String selfRegUserTemplate;

    private java.lang.Boolean showActionConfirmation;

    private java.lang.String stylesheetDocument;

    private com.sforce.soap._2006._04.metadata.PortalType type;

    public Portal() {
    }

    public Portal(
           java.lang.String fullName,
           boolean active,
           java.lang.String admin,
           java.lang.String defaultLanguage,
           java.lang.String description,
           java.lang.String emailSenderAddress,
           java.lang.String emailSenderName,
           java.lang.Boolean enableSelfCloseCase,
           java.lang.String footerDocument,
           java.lang.String forgotPassTemplate,
           java.lang.String headerDocument,
           java.lang.Boolean isSelfRegistrationActivated,
           java.lang.String loginHeaderDocument,
           java.lang.String logoDocument,
           java.lang.String logoutUrl,
           java.lang.String newCommentTemplate,
           java.lang.String newPassTemplate,
           java.lang.String newUserTemplate,
           java.lang.String ownerNotifyTemplate,
           java.lang.String selfRegNewUserUrl,
           java.lang.String selfRegUserDefaultProfile,
           com.sforce.soap._2006._04.metadata.PortalRoles selfRegUserDefaultRole,
           java.lang.String selfRegUserTemplate,
           java.lang.Boolean showActionConfirmation,
           java.lang.String stylesheetDocument,
           com.sforce.soap._2006._04.metadata.PortalType type) {
        super(
            fullName);
        this.active = active;
        this.admin = admin;
        this.defaultLanguage = defaultLanguage;
        this.description = description;
        this.emailSenderAddress = emailSenderAddress;
        this.emailSenderName = emailSenderName;
        this.enableSelfCloseCase = enableSelfCloseCase;
        this.footerDocument = footerDocument;
        this.forgotPassTemplate = forgotPassTemplate;
        this.headerDocument = headerDocument;
        this.isSelfRegistrationActivated = isSelfRegistrationActivated;
        this.loginHeaderDocument = loginHeaderDocument;
        this.logoDocument = logoDocument;
        this.logoutUrl = logoutUrl;
        this.newCommentTemplate = newCommentTemplate;
        this.newPassTemplate = newPassTemplate;
        this.newUserTemplate = newUserTemplate;
        this.ownerNotifyTemplate = ownerNotifyTemplate;
        this.selfRegNewUserUrl = selfRegNewUserUrl;
        this.selfRegUserDefaultProfile = selfRegUserDefaultProfile;
        this.selfRegUserDefaultRole = selfRegUserDefaultRole;
        this.selfRegUserTemplate = selfRegUserTemplate;
        this.showActionConfirmation = showActionConfirmation;
        this.stylesheetDocument = stylesheetDocument;
        this.type = type;
    }


    /**
     * Gets the active value for this Portal.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Portal.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the admin value for this Portal.
     * 
     * @return admin
     */
    public java.lang.String getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this Portal.
     * 
     * @param admin
     */
    public void setAdmin(java.lang.String admin) {
        this.admin = admin;
    }


    /**
     * Gets the defaultLanguage value for this Portal.
     * 
     * @return defaultLanguage
     */
    public java.lang.String getDefaultLanguage() {
        return defaultLanguage;
    }


    /**
     * Sets the defaultLanguage value for this Portal.
     * 
     * @param defaultLanguage
     */
    public void setDefaultLanguage(java.lang.String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }


    /**
     * Gets the description value for this Portal.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Portal.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emailSenderAddress value for this Portal.
     * 
     * @return emailSenderAddress
     */
    public java.lang.String getEmailSenderAddress() {
        return emailSenderAddress;
    }


    /**
     * Sets the emailSenderAddress value for this Portal.
     * 
     * @param emailSenderAddress
     */
    public void setEmailSenderAddress(java.lang.String emailSenderAddress) {
        this.emailSenderAddress = emailSenderAddress;
    }


    /**
     * Gets the emailSenderName value for this Portal.
     * 
     * @return emailSenderName
     */
    public java.lang.String getEmailSenderName() {
        return emailSenderName;
    }


    /**
     * Sets the emailSenderName value for this Portal.
     * 
     * @param emailSenderName
     */
    public void setEmailSenderName(java.lang.String emailSenderName) {
        this.emailSenderName = emailSenderName;
    }


    /**
     * Gets the enableSelfCloseCase value for this Portal.
     * 
     * @return enableSelfCloseCase
     */
    public java.lang.Boolean getEnableSelfCloseCase() {
        return enableSelfCloseCase;
    }


    /**
     * Sets the enableSelfCloseCase value for this Portal.
     * 
     * @param enableSelfCloseCase
     */
    public void setEnableSelfCloseCase(java.lang.Boolean enableSelfCloseCase) {
        this.enableSelfCloseCase = enableSelfCloseCase;
    }


    /**
     * Gets the footerDocument value for this Portal.
     * 
     * @return footerDocument
     */
    public java.lang.String getFooterDocument() {
        return footerDocument;
    }


    /**
     * Sets the footerDocument value for this Portal.
     * 
     * @param footerDocument
     */
    public void setFooterDocument(java.lang.String footerDocument) {
        this.footerDocument = footerDocument;
    }


    /**
     * Gets the forgotPassTemplate value for this Portal.
     * 
     * @return forgotPassTemplate
     */
    public java.lang.String getForgotPassTemplate() {
        return forgotPassTemplate;
    }


    /**
     * Sets the forgotPassTemplate value for this Portal.
     * 
     * @param forgotPassTemplate
     */
    public void setForgotPassTemplate(java.lang.String forgotPassTemplate) {
        this.forgotPassTemplate = forgotPassTemplate;
    }


    /**
     * Gets the headerDocument value for this Portal.
     * 
     * @return headerDocument
     */
    public java.lang.String getHeaderDocument() {
        return headerDocument;
    }


    /**
     * Sets the headerDocument value for this Portal.
     * 
     * @param headerDocument
     */
    public void setHeaderDocument(java.lang.String headerDocument) {
        this.headerDocument = headerDocument;
    }


    /**
     * Gets the isSelfRegistrationActivated value for this Portal.
     * 
     * @return isSelfRegistrationActivated
     */
    public java.lang.Boolean getIsSelfRegistrationActivated() {
        return isSelfRegistrationActivated;
    }


    /**
     * Sets the isSelfRegistrationActivated value for this Portal.
     * 
     * @param isSelfRegistrationActivated
     */
    public void setIsSelfRegistrationActivated(java.lang.Boolean isSelfRegistrationActivated) {
        this.isSelfRegistrationActivated = isSelfRegistrationActivated;
    }


    /**
     * Gets the loginHeaderDocument value for this Portal.
     * 
     * @return loginHeaderDocument
     */
    public java.lang.String getLoginHeaderDocument() {
        return loginHeaderDocument;
    }


    /**
     * Sets the loginHeaderDocument value for this Portal.
     * 
     * @param loginHeaderDocument
     */
    public void setLoginHeaderDocument(java.lang.String loginHeaderDocument) {
        this.loginHeaderDocument = loginHeaderDocument;
    }


    /**
     * Gets the logoDocument value for this Portal.
     * 
     * @return logoDocument
     */
    public java.lang.String getLogoDocument() {
        return logoDocument;
    }


    /**
     * Sets the logoDocument value for this Portal.
     * 
     * @param logoDocument
     */
    public void setLogoDocument(java.lang.String logoDocument) {
        this.logoDocument = logoDocument;
    }


    /**
     * Gets the logoutUrl value for this Portal.
     * 
     * @return logoutUrl
     */
    public java.lang.String getLogoutUrl() {
        return logoutUrl;
    }


    /**
     * Sets the logoutUrl value for this Portal.
     * 
     * @param logoutUrl
     */
    public void setLogoutUrl(java.lang.String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }


    /**
     * Gets the newCommentTemplate value for this Portal.
     * 
     * @return newCommentTemplate
     */
    public java.lang.String getNewCommentTemplate() {
        return newCommentTemplate;
    }


    /**
     * Sets the newCommentTemplate value for this Portal.
     * 
     * @param newCommentTemplate
     */
    public void setNewCommentTemplate(java.lang.String newCommentTemplate) {
        this.newCommentTemplate = newCommentTemplate;
    }


    /**
     * Gets the newPassTemplate value for this Portal.
     * 
     * @return newPassTemplate
     */
    public java.lang.String getNewPassTemplate() {
        return newPassTemplate;
    }


    /**
     * Sets the newPassTemplate value for this Portal.
     * 
     * @param newPassTemplate
     */
    public void setNewPassTemplate(java.lang.String newPassTemplate) {
        this.newPassTemplate = newPassTemplate;
    }


    /**
     * Gets the newUserTemplate value for this Portal.
     * 
     * @return newUserTemplate
     */
    public java.lang.String getNewUserTemplate() {
        return newUserTemplate;
    }


    /**
     * Sets the newUserTemplate value for this Portal.
     * 
     * @param newUserTemplate
     */
    public void setNewUserTemplate(java.lang.String newUserTemplate) {
        this.newUserTemplate = newUserTemplate;
    }


    /**
     * Gets the ownerNotifyTemplate value for this Portal.
     * 
     * @return ownerNotifyTemplate
     */
    public java.lang.String getOwnerNotifyTemplate() {
        return ownerNotifyTemplate;
    }


    /**
     * Sets the ownerNotifyTemplate value for this Portal.
     * 
     * @param ownerNotifyTemplate
     */
    public void setOwnerNotifyTemplate(java.lang.String ownerNotifyTemplate) {
        this.ownerNotifyTemplate = ownerNotifyTemplate;
    }


    /**
     * Gets the selfRegNewUserUrl value for this Portal.
     * 
     * @return selfRegNewUserUrl
     */
    public java.lang.String getSelfRegNewUserUrl() {
        return selfRegNewUserUrl;
    }


    /**
     * Sets the selfRegNewUserUrl value for this Portal.
     * 
     * @param selfRegNewUserUrl
     */
    public void setSelfRegNewUserUrl(java.lang.String selfRegNewUserUrl) {
        this.selfRegNewUserUrl = selfRegNewUserUrl;
    }


    /**
     * Gets the selfRegUserDefaultProfile value for this Portal.
     * 
     * @return selfRegUserDefaultProfile
     */
    public java.lang.String getSelfRegUserDefaultProfile() {
        return selfRegUserDefaultProfile;
    }


    /**
     * Sets the selfRegUserDefaultProfile value for this Portal.
     * 
     * @param selfRegUserDefaultProfile
     */
    public void setSelfRegUserDefaultProfile(java.lang.String selfRegUserDefaultProfile) {
        this.selfRegUserDefaultProfile = selfRegUserDefaultProfile;
    }


    /**
     * Gets the selfRegUserDefaultRole value for this Portal.
     * 
     * @return selfRegUserDefaultRole
     */
    public com.sforce.soap._2006._04.metadata.PortalRoles getSelfRegUserDefaultRole() {
        return selfRegUserDefaultRole;
    }


    /**
     * Sets the selfRegUserDefaultRole value for this Portal.
     * 
     * @param selfRegUserDefaultRole
     */
    public void setSelfRegUserDefaultRole(com.sforce.soap._2006._04.metadata.PortalRoles selfRegUserDefaultRole) {
        this.selfRegUserDefaultRole = selfRegUserDefaultRole;
    }


    /**
     * Gets the selfRegUserTemplate value for this Portal.
     * 
     * @return selfRegUserTemplate
     */
    public java.lang.String getSelfRegUserTemplate() {
        return selfRegUserTemplate;
    }


    /**
     * Sets the selfRegUserTemplate value for this Portal.
     * 
     * @param selfRegUserTemplate
     */
    public void setSelfRegUserTemplate(java.lang.String selfRegUserTemplate) {
        this.selfRegUserTemplate = selfRegUserTemplate;
    }


    /**
     * Gets the showActionConfirmation value for this Portal.
     * 
     * @return showActionConfirmation
     */
    public java.lang.Boolean getShowActionConfirmation() {
        return showActionConfirmation;
    }


    /**
     * Sets the showActionConfirmation value for this Portal.
     * 
     * @param showActionConfirmation
     */
    public void setShowActionConfirmation(java.lang.Boolean showActionConfirmation) {
        this.showActionConfirmation = showActionConfirmation;
    }


    /**
     * Gets the stylesheetDocument value for this Portal.
     * 
     * @return stylesheetDocument
     */
    public java.lang.String getStylesheetDocument() {
        return stylesheetDocument;
    }


    /**
     * Sets the stylesheetDocument value for this Portal.
     * 
     * @param stylesheetDocument
     */
    public void setStylesheetDocument(java.lang.String stylesheetDocument) {
        this.stylesheetDocument = stylesheetDocument;
    }


    /**
     * Gets the type value for this Portal.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.PortalType getType() {
        return type;
    }


    /**
     * Sets the type value for this Portal.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.PortalType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Portal)) return false;
        Portal other = (Portal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            ((this.admin==null && other.getAdmin()==null) || 
             (this.admin!=null &&
              this.admin.equals(other.getAdmin()))) &&
            ((this.defaultLanguage==null && other.getDefaultLanguage()==null) || 
             (this.defaultLanguage!=null &&
              this.defaultLanguage.equals(other.getDefaultLanguage()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.emailSenderAddress==null && other.getEmailSenderAddress()==null) || 
             (this.emailSenderAddress!=null &&
              this.emailSenderAddress.equals(other.getEmailSenderAddress()))) &&
            ((this.emailSenderName==null && other.getEmailSenderName()==null) || 
             (this.emailSenderName!=null &&
              this.emailSenderName.equals(other.getEmailSenderName()))) &&
            ((this.enableSelfCloseCase==null && other.getEnableSelfCloseCase()==null) || 
             (this.enableSelfCloseCase!=null &&
              this.enableSelfCloseCase.equals(other.getEnableSelfCloseCase()))) &&
            ((this.footerDocument==null && other.getFooterDocument()==null) || 
             (this.footerDocument!=null &&
              this.footerDocument.equals(other.getFooterDocument()))) &&
            ((this.forgotPassTemplate==null && other.getForgotPassTemplate()==null) || 
             (this.forgotPassTemplate!=null &&
              this.forgotPassTemplate.equals(other.getForgotPassTemplate()))) &&
            ((this.headerDocument==null && other.getHeaderDocument()==null) || 
             (this.headerDocument!=null &&
              this.headerDocument.equals(other.getHeaderDocument()))) &&
            ((this.isSelfRegistrationActivated==null && other.getIsSelfRegistrationActivated()==null) || 
             (this.isSelfRegistrationActivated!=null &&
              this.isSelfRegistrationActivated.equals(other.getIsSelfRegistrationActivated()))) &&
            ((this.loginHeaderDocument==null && other.getLoginHeaderDocument()==null) || 
             (this.loginHeaderDocument!=null &&
              this.loginHeaderDocument.equals(other.getLoginHeaderDocument()))) &&
            ((this.logoDocument==null && other.getLogoDocument()==null) || 
             (this.logoDocument!=null &&
              this.logoDocument.equals(other.getLogoDocument()))) &&
            ((this.logoutUrl==null && other.getLogoutUrl()==null) || 
             (this.logoutUrl!=null &&
              this.logoutUrl.equals(other.getLogoutUrl()))) &&
            ((this.newCommentTemplate==null && other.getNewCommentTemplate()==null) || 
             (this.newCommentTemplate!=null &&
              this.newCommentTemplate.equals(other.getNewCommentTemplate()))) &&
            ((this.newPassTemplate==null && other.getNewPassTemplate()==null) || 
             (this.newPassTemplate!=null &&
              this.newPassTemplate.equals(other.getNewPassTemplate()))) &&
            ((this.newUserTemplate==null && other.getNewUserTemplate()==null) || 
             (this.newUserTemplate!=null &&
              this.newUserTemplate.equals(other.getNewUserTemplate()))) &&
            ((this.ownerNotifyTemplate==null && other.getOwnerNotifyTemplate()==null) || 
             (this.ownerNotifyTemplate!=null &&
              this.ownerNotifyTemplate.equals(other.getOwnerNotifyTemplate()))) &&
            ((this.selfRegNewUserUrl==null && other.getSelfRegNewUserUrl()==null) || 
             (this.selfRegNewUserUrl!=null &&
              this.selfRegNewUserUrl.equals(other.getSelfRegNewUserUrl()))) &&
            ((this.selfRegUserDefaultProfile==null && other.getSelfRegUserDefaultProfile()==null) || 
             (this.selfRegUserDefaultProfile!=null &&
              this.selfRegUserDefaultProfile.equals(other.getSelfRegUserDefaultProfile()))) &&
            ((this.selfRegUserDefaultRole==null && other.getSelfRegUserDefaultRole()==null) || 
             (this.selfRegUserDefaultRole!=null &&
              this.selfRegUserDefaultRole.equals(other.getSelfRegUserDefaultRole()))) &&
            ((this.selfRegUserTemplate==null && other.getSelfRegUserTemplate()==null) || 
             (this.selfRegUserTemplate!=null &&
              this.selfRegUserTemplate.equals(other.getSelfRegUserTemplate()))) &&
            ((this.showActionConfirmation==null && other.getShowActionConfirmation()==null) || 
             (this.showActionConfirmation!=null &&
              this.showActionConfirmation.equals(other.getShowActionConfirmation()))) &&
            ((this.stylesheetDocument==null && other.getStylesheetDocument()==null) || 
             (this.stylesheetDocument!=null &&
              this.stylesheetDocument.equals(other.getStylesheetDocument()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAdmin() != null) {
            _hashCode += getAdmin().hashCode();
        }
        if (getDefaultLanguage() != null) {
            _hashCode += getDefaultLanguage().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmailSenderAddress() != null) {
            _hashCode += getEmailSenderAddress().hashCode();
        }
        if (getEmailSenderName() != null) {
            _hashCode += getEmailSenderName().hashCode();
        }
        if (getEnableSelfCloseCase() != null) {
            _hashCode += getEnableSelfCloseCase().hashCode();
        }
        if (getFooterDocument() != null) {
            _hashCode += getFooterDocument().hashCode();
        }
        if (getForgotPassTemplate() != null) {
            _hashCode += getForgotPassTemplate().hashCode();
        }
        if (getHeaderDocument() != null) {
            _hashCode += getHeaderDocument().hashCode();
        }
        if (getIsSelfRegistrationActivated() != null) {
            _hashCode += getIsSelfRegistrationActivated().hashCode();
        }
        if (getLoginHeaderDocument() != null) {
            _hashCode += getLoginHeaderDocument().hashCode();
        }
        if (getLogoDocument() != null) {
            _hashCode += getLogoDocument().hashCode();
        }
        if (getLogoutUrl() != null) {
            _hashCode += getLogoutUrl().hashCode();
        }
        if (getNewCommentTemplate() != null) {
            _hashCode += getNewCommentTemplate().hashCode();
        }
        if (getNewPassTemplate() != null) {
            _hashCode += getNewPassTemplate().hashCode();
        }
        if (getNewUserTemplate() != null) {
            _hashCode += getNewUserTemplate().hashCode();
        }
        if (getOwnerNotifyTemplate() != null) {
            _hashCode += getOwnerNotifyTemplate().hashCode();
        }
        if (getSelfRegNewUserUrl() != null) {
            _hashCode += getSelfRegNewUserUrl().hashCode();
        }
        if (getSelfRegUserDefaultProfile() != null) {
            _hashCode += getSelfRegUserDefaultProfile().hashCode();
        }
        if (getSelfRegUserDefaultRole() != null) {
            _hashCode += getSelfRegUserDefaultRole().hashCode();
        }
        if (getSelfRegUserTemplate() != null) {
            _hashCode += getSelfRegUserTemplate().hashCode();
        }
        if (getShowActionConfirmation() != null) {
            _hashCode += getShowActionConfirmation().hashCode();
        }
        if (getStylesheetDocument() != null) {
            _hashCode += getStylesheetDocument().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Portal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Portal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "admin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSenderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailSenderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSenderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailSenderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSelfCloseCase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSelfCloseCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footerDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "footerDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgotPassTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forgotPassTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "headerDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSelfRegistrationActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isSelfRegistrationActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginHeaderDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "loginHeaderDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logoDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoutUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logoutUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCommentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "newCommentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "newPassTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUserTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "newUserTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerNotifyTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ownerNotifyTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegNewUserUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "selfRegNewUserUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegUserDefaultProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "selfRegUserDefaultProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegUserDefaultRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "selfRegUserDefaultRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PortalRoles"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegUserTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "selfRegUserTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showActionConfirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showActionConfirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stylesheetDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "stylesheetDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PortalType"));
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
