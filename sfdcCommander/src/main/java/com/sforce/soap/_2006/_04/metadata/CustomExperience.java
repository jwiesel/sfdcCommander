/**
 * CustomExperience.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomExperience  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean allowInternalUserLogin;

    private com.sforce.soap._2006._04.metadata.CustomExperienceBranding branding;

    private java.lang.String changePasswordEmailTemplate;

    private java.lang.String emailFooterLogo;

    private java.lang.String emailFooterText;

    private java.lang.String emailSenderAddress;

    private java.lang.String emailSenderName;

    private boolean enableErrorPageOverridesForVisualforce;

    private java.lang.String forgotPasswordEmailTemplate;

    private java.lang.String picassoSite;

    private java.lang.String sObjectType;

    private boolean sendWelcomeEmail;

    private java.lang.String site;

    private boolean siteAsContainerEnabled;

    private com.sforce.soap._2006._04.metadata.CustomExperienceTabSet tabs;

    private java.lang.String urlPathPrefix;

    private java.lang.String welcomeEmailTemplate;

    public CustomExperience() {
    }

    public CustomExperience(
           java.lang.String fullName,
           boolean allowInternalUserLogin,
           com.sforce.soap._2006._04.metadata.CustomExperienceBranding branding,
           java.lang.String changePasswordEmailTemplate,
           java.lang.String emailFooterLogo,
           java.lang.String emailFooterText,
           java.lang.String emailSenderAddress,
           java.lang.String emailSenderName,
           boolean enableErrorPageOverridesForVisualforce,
           java.lang.String forgotPasswordEmailTemplate,
           java.lang.String picassoSite,
           java.lang.String sObjectType,
           boolean sendWelcomeEmail,
           java.lang.String site,
           boolean siteAsContainerEnabled,
           com.sforce.soap._2006._04.metadata.CustomExperienceTabSet tabs,
           java.lang.String urlPathPrefix,
           java.lang.String welcomeEmailTemplate) {
        super(
            fullName);
        this.allowInternalUserLogin = allowInternalUserLogin;
        this.branding = branding;
        this.changePasswordEmailTemplate = changePasswordEmailTemplate;
        this.emailFooterLogo = emailFooterLogo;
        this.emailFooterText = emailFooterText;
        this.emailSenderAddress = emailSenderAddress;
        this.emailSenderName = emailSenderName;
        this.enableErrorPageOverridesForVisualforce = enableErrorPageOverridesForVisualforce;
        this.forgotPasswordEmailTemplate = forgotPasswordEmailTemplate;
        this.picassoSite = picassoSite;
        this.sObjectType = sObjectType;
        this.sendWelcomeEmail = sendWelcomeEmail;
        this.site = site;
        this.siteAsContainerEnabled = siteAsContainerEnabled;
        this.tabs = tabs;
        this.urlPathPrefix = urlPathPrefix;
        this.welcomeEmailTemplate = welcomeEmailTemplate;
    }


    /**
     * Gets the allowInternalUserLogin value for this CustomExperience.
     * 
     * @return allowInternalUserLogin
     */
    public boolean isAllowInternalUserLogin() {
        return allowInternalUserLogin;
    }


    /**
     * Sets the allowInternalUserLogin value for this CustomExperience.
     * 
     * @param allowInternalUserLogin
     */
    public void setAllowInternalUserLogin(boolean allowInternalUserLogin) {
        this.allowInternalUserLogin = allowInternalUserLogin;
    }


    /**
     * Gets the branding value for this CustomExperience.
     * 
     * @return branding
     */
    public com.sforce.soap._2006._04.metadata.CustomExperienceBranding getBranding() {
        return branding;
    }


    /**
     * Sets the branding value for this CustomExperience.
     * 
     * @param branding
     */
    public void setBranding(com.sforce.soap._2006._04.metadata.CustomExperienceBranding branding) {
        this.branding = branding;
    }


    /**
     * Gets the changePasswordEmailTemplate value for this CustomExperience.
     * 
     * @return changePasswordEmailTemplate
     */
    public java.lang.String getChangePasswordEmailTemplate() {
        return changePasswordEmailTemplate;
    }


    /**
     * Sets the changePasswordEmailTemplate value for this CustomExperience.
     * 
     * @param changePasswordEmailTemplate
     */
    public void setChangePasswordEmailTemplate(java.lang.String changePasswordEmailTemplate) {
        this.changePasswordEmailTemplate = changePasswordEmailTemplate;
    }


    /**
     * Gets the emailFooterLogo value for this CustomExperience.
     * 
     * @return emailFooterLogo
     */
    public java.lang.String getEmailFooterLogo() {
        return emailFooterLogo;
    }


    /**
     * Sets the emailFooterLogo value for this CustomExperience.
     * 
     * @param emailFooterLogo
     */
    public void setEmailFooterLogo(java.lang.String emailFooterLogo) {
        this.emailFooterLogo = emailFooterLogo;
    }


    /**
     * Gets the emailFooterText value for this CustomExperience.
     * 
     * @return emailFooterText
     */
    public java.lang.String getEmailFooterText() {
        return emailFooterText;
    }


    /**
     * Sets the emailFooterText value for this CustomExperience.
     * 
     * @param emailFooterText
     */
    public void setEmailFooterText(java.lang.String emailFooterText) {
        this.emailFooterText = emailFooterText;
    }


    /**
     * Gets the emailSenderAddress value for this CustomExperience.
     * 
     * @return emailSenderAddress
     */
    public java.lang.String getEmailSenderAddress() {
        return emailSenderAddress;
    }


    /**
     * Sets the emailSenderAddress value for this CustomExperience.
     * 
     * @param emailSenderAddress
     */
    public void setEmailSenderAddress(java.lang.String emailSenderAddress) {
        this.emailSenderAddress = emailSenderAddress;
    }


    /**
     * Gets the emailSenderName value for this CustomExperience.
     * 
     * @return emailSenderName
     */
    public java.lang.String getEmailSenderName() {
        return emailSenderName;
    }


    /**
     * Sets the emailSenderName value for this CustomExperience.
     * 
     * @param emailSenderName
     */
    public void setEmailSenderName(java.lang.String emailSenderName) {
        this.emailSenderName = emailSenderName;
    }


    /**
     * Gets the enableErrorPageOverridesForVisualforce value for this CustomExperience.
     * 
     * @return enableErrorPageOverridesForVisualforce
     */
    public boolean isEnableErrorPageOverridesForVisualforce() {
        return enableErrorPageOverridesForVisualforce;
    }


    /**
     * Sets the enableErrorPageOverridesForVisualforce value for this CustomExperience.
     * 
     * @param enableErrorPageOverridesForVisualforce
     */
    public void setEnableErrorPageOverridesForVisualforce(boolean enableErrorPageOverridesForVisualforce) {
        this.enableErrorPageOverridesForVisualforce = enableErrorPageOverridesForVisualforce;
    }


    /**
     * Gets the forgotPasswordEmailTemplate value for this CustomExperience.
     * 
     * @return forgotPasswordEmailTemplate
     */
    public java.lang.String getForgotPasswordEmailTemplate() {
        return forgotPasswordEmailTemplate;
    }


    /**
     * Sets the forgotPasswordEmailTemplate value for this CustomExperience.
     * 
     * @param forgotPasswordEmailTemplate
     */
    public void setForgotPasswordEmailTemplate(java.lang.String forgotPasswordEmailTemplate) {
        this.forgotPasswordEmailTemplate = forgotPasswordEmailTemplate;
    }


    /**
     * Gets the picassoSite value for this CustomExperience.
     * 
     * @return picassoSite
     */
    public java.lang.String getPicassoSite() {
        return picassoSite;
    }


    /**
     * Sets the picassoSite value for this CustomExperience.
     * 
     * @param picassoSite
     */
    public void setPicassoSite(java.lang.String picassoSite) {
        this.picassoSite = picassoSite;
    }


    /**
     * Gets the sObjectType value for this CustomExperience.
     * 
     * @return sObjectType
     */
    public java.lang.String getSObjectType() {
        return sObjectType;
    }


    /**
     * Sets the sObjectType value for this CustomExperience.
     * 
     * @param sObjectType
     */
    public void setSObjectType(java.lang.String sObjectType) {
        this.sObjectType = sObjectType;
    }


    /**
     * Gets the sendWelcomeEmail value for this CustomExperience.
     * 
     * @return sendWelcomeEmail
     */
    public boolean isSendWelcomeEmail() {
        return sendWelcomeEmail;
    }


    /**
     * Sets the sendWelcomeEmail value for this CustomExperience.
     * 
     * @param sendWelcomeEmail
     */
    public void setSendWelcomeEmail(boolean sendWelcomeEmail) {
        this.sendWelcomeEmail = sendWelcomeEmail;
    }


    /**
     * Gets the site value for this CustomExperience.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this CustomExperience.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }


    /**
     * Gets the siteAsContainerEnabled value for this CustomExperience.
     * 
     * @return siteAsContainerEnabled
     */
    public boolean isSiteAsContainerEnabled() {
        return siteAsContainerEnabled;
    }


    /**
     * Sets the siteAsContainerEnabled value for this CustomExperience.
     * 
     * @param siteAsContainerEnabled
     */
    public void setSiteAsContainerEnabled(boolean siteAsContainerEnabled) {
        this.siteAsContainerEnabled = siteAsContainerEnabled;
    }


    /**
     * Gets the tabs value for this CustomExperience.
     * 
     * @return tabs
     */
    public com.sforce.soap._2006._04.metadata.CustomExperienceTabSet getTabs() {
        return tabs;
    }


    /**
     * Sets the tabs value for this CustomExperience.
     * 
     * @param tabs
     */
    public void setTabs(com.sforce.soap._2006._04.metadata.CustomExperienceTabSet tabs) {
        this.tabs = tabs;
    }


    /**
     * Gets the urlPathPrefix value for this CustomExperience.
     * 
     * @return urlPathPrefix
     */
    public java.lang.String getUrlPathPrefix() {
        return urlPathPrefix;
    }


    /**
     * Sets the urlPathPrefix value for this CustomExperience.
     * 
     * @param urlPathPrefix
     */
    public void setUrlPathPrefix(java.lang.String urlPathPrefix) {
        this.urlPathPrefix = urlPathPrefix;
    }


    /**
     * Gets the welcomeEmailTemplate value for this CustomExperience.
     * 
     * @return welcomeEmailTemplate
     */
    public java.lang.String getWelcomeEmailTemplate() {
        return welcomeEmailTemplate;
    }


    /**
     * Sets the welcomeEmailTemplate value for this CustomExperience.
     * 
     * @param welcomeEmailTemplate
     */
    public void setWelcomeEmailTemplate(java.lang.String welcomeEmailTemplate) {
        this.welcomeEmailTemplate = welcomeEmailTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomExperience)) return false;
        CustomExperience other = (CustomExperience) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.allowInternalUserLogin == other.isAllowInternalUserLogin() &&
            ((this.branding==null && other.getBranding()==null) || 
             (this.branding!=null &&
              this.branding.equals(other.getBranding()))) &&
            ((this.changePasswordEmailTemplate==null && other.getChangePasswordEmailTemplate()==null) || 
             (this.changePasswordEmailTemplate!=null &&
              this.changePasswordEmailTemplate.equals(other.getChangePasswordEmailTemplate()))) &&
            ((this.emailFooterLogo==null && other.getEmailFooterLogo()==null) || 
             (this.emailFooterLogo!=null &&
              this.emailFooterLogo.equals(other.getEmailFooterLogo()))) &&
            ((this.emailFooterText==null && other.getEmailFooterText()==null) || 
             (this.emailFooterText!=null &&
              this.emailFooterText.equals(other.getEmailFooterText()))) &&
            ((this.emailSenderAddress==null && other.getEmailSenderAddress()==null) || 
             (this.emailSenderAddress!=null &&
              this.emailSenderAddress.equals(other.getEmailSenderAddress()))) &&
            ((this.emailSenderName==null && other.getEmailSenderName()==null) || 
             (this.emailSenderName!=null &&
              this.emailSenderName.equals(other.getEmailSenderName()))) &&
            this.enableErrorPageOverridesForVisualforce == other.isEnableErrorPageOverridesForVisualforce() &&
            ((this.forgotPasswordEmailTemplate==null && other.getForgotPasswordEmailTemplate()==null) || 
             (this.forgotPasswordEmailTemplate!=null &&
              this.forgotPasswordEmailTemplate.equals(other.getForgotPasswordEmailTemplate()))) &&
            ((this.picassoSite==null && other.getPicassoSite()==null) || 
             (this.picassoSite!=null &&
              this.picassoSite.equals(other.getPicassoSite()))) &&
            ((this.sObjectType==null && other.getSObjectType()==null) || 
             (this.sObjectType!=null &&
              this.sObjectType.equals(other.getSObjectType()))) &&
            this.sendWelcomeEmail == other.isSendWelcomeEmail() &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            this.siteAsContainerEnabled == other.isSiteAsContainerEnabled() &&
            ((this.tabs==null && other.getTabs()==null) || 
             (this.tabs!=null &&
              this.tabs.equals(other.getTabs()))) &&
            ((this.urlPathPrefix==null && other.getUrlPathPrefix()==null) || 
             (this.urlPathPrefix!=null &&
              this.urlPathPrefix.equals(other.getUrlPathPrefix()))) &&
            ((this.welcomeEmailTemplate==null && other.getWelcomeEmailTemplate()==null) || 
             (this.welcomeEmailTemplate!=null &&
              this.welcomeEmailTemplate.equals(other.getWelcomeEmailTemplate())));
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
        _hashCode += (isAllowInternalUserLogin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBranding() != null) {
            _hashCode += getBranding().hashCode();
        }
        if (getChangePasswordEmailTemplate() != null) {
            _hashCode += getChangePasswordEmailTemplate().hashCode();
        }
        if (getEmailFooterLogo() != null) {
            _hashCode += getEmailFooterLogo().hashCode();
        }
        if (getEmailFooterText() != null) {
            _hashCode += getEmailFooterText().hashCode();
        }
        if (getEmailSenderAddress() != null) {
            _hashCode += getEmailSenderAddress().hashCode();
        }
        if (getEmailSenderName() != null) {
            _hashCode += getEmailSenderName().hashCode();
        }
        _hashCode += (isEnableErrorPageOverridesForVisualforce() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getForgotPasswordEmailTemplate() != null) {
            _hashCode += getForgotPasswordEmailTemplate().hashCode();
        }
        if (getPicassoSite() != null) {
            _hashCode += getPicassoSite().hashCode();
        }
        if (getSObjectType() != null) {
            _hashCode += getSObjectType().hashCode();
        }
        _hashCode += (isSendWelcomeEmail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        _hashCode += (isSiteAsContainerEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTabs() != null) {
            _hashCode += getTabs().hashCode();
        }
        if (getUrlPathPrefix() != null) {
            _hashCode += getUrlPathPrefix().hashCode();
        }
        if (getWelcomeEmailTemplate() != null) {
            _hashCode += getWelcomeEmailTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomExperience.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomExperience"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowInternalUserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowInternalUserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "branding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomExperienceBranding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePasswordEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "changePasswordEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFooterLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailFooterLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFooterText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailFooterText"));
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
        elemField.setFieldName("enableErrorPageOverridesForVisualforce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableErrorPageOverridesForVisualforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgotPasswordEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forgotPasswordEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picassoSite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picassoSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendWelcomeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sendWelcomeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteAsContainerEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "siteAsContainerEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomExperienceTabSet"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("welcomeEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "welcomeEmailTemplate"));
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
