/**
 * Community.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Community  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.String chatterAnswersFacebookSsoUrl;

    private java.lang.String communityFeedPage;

    private java.lang.String dataCategoryName;

    private java.lang.String description;

    private java.lang.String emailFooterDocument;

    private java.lang.String emailHeaderDocument;

    private java.lang.String emailNotificationUrl;

    private java.lang.Boolean enableChatterAnswers;

    private java.lang.Boolean enablePrivateQuestions;

    private java.lang.String expertsGroup;

    private java.lang.String portal;

    private com.sforce.soap._2006._04.metadata.ReputationLevels reputationLevels;

    private java.lang.Boolean showInPortal;

    private java.lang.String site;

    public Community() {
    }

    public Community(
           java.lang.String fullName,
           java.lang.Boolean active,
           java.lang.String chatterAnswersFacebookSsoUrl,
           java.lang.String communityFeedPage,
           java.lang.String dataCategoryName,
           java.lang.String description,
           java.lang.String emailFooterDocument,
           java.lang.String emailHeaderDocument,
           java.lang.String emailNotificationUrl,
           java.lang.Boolean enableChatterAnswers,
           java.lang.Boolean enablePrivateQuestions,
           java.lang.String expertsGroup,
           java.lang.String portal,
           com.sforce.soap._2006._04.metadata.ReputationLevels reputationLevels,
           java.lang.Boolean showInPortal,
           java.lang.String site) {
        super(
            fullName);
        this.active = active;
        this.chatterAnswersFacebookSsoUrl = chatterAnswersFacebookSsoUrl;
        this.communityFeedPage = communityFeedPage;
        this.dataCategoryName = dataCategoryName;
        this.description = description;
        this.emailFooterDocument = emailFooterDocument;
        this.emailHeaderDocument = emailHeaderDocument;
        this.emailNotificationUrl = emailNotificationUrl;
        this.enableChatterAnswers = enableChatterAnswers;
        this.enablePrivateQuestions = enablePrivateQuestions;
        this.expertsGroup = expertsGroup;
        this.portal = portal;
        this.reputationLevels = reputationLevels;
        this.showInPortal = showInPortal;
        this.site = site;
    }


    /**
     * Gets the active value for this Community.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this Community.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the chatterAnswersFacebookSsoUrl value for this Community.
     * 
     * @return chatterAnswersFacebookSsoUrl
     */
    public java.lang.String getChatterAnswersFacebookSsoUrl() {
        return chatterAnswersFacebookSsoUrl;
    }


    /**
     * Sets the chatterAnswersFacebookSsoUrl value for this Community.
     * 
     * @param chatterAnswersFacebookSsoUrl
     */
    public void setChatterAnswersFacebookSsoUrl(java.lang.String chatterAnswersFacebookSsoUrl) {
        this.chatterAnswersFacebookSsoUrl = chatterAnswersFacebookSsoUrl;
    }


    /**
     * Gets the communityFeedPage value for this Community.
     * 
     * @return communityFeedPage
     */
    public java.lang.String getCommunityFeedPage() {
        return communityFeedPage;
    }


    /**
     * Sets the communityFeedPage value for this Community.
     * 
     * @param communityFeedPage
     */
    public void setCommunityFeedPage(java.lang.String communityFeedPage) {
        this.communityFeedPage = communityFeedPage;
    }


    /**
     * Gets the dataCategoryName value for this Community.
     * 
     * @return dataCategoryName
     */
    public java.lang.String getDataCategoryName() {
        return dataCategoryName;
    }


    /**
     * Sets the dataCategoryName value for this Community.
     * 
     * @param dataCategoryName
     */
    public void setDataCategoryName(java.lang.String dataCategoryName) {
        this.dataCategoryName = dataCategoryName;
    }


    /**
     * Gets the description value for this Community.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Community.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emailFooterDocument value for this Community.
     * 
     * @return emailFooterDocument
     */
    public java.lang.String getEmailFooterDocument() {
        return emailFooterDocument;
    }


    /**
     * Sets the emailFooterDocument value for this Community.
     * 
     * @param emailFooterDocument
     */
    public void setEmailFooterDocument(java.lang.String emailFooterDocument) {
        this.emailFooterDocument = emailFooterDocument;
    }


    /**
     * Gets the emailHeaderDocument value for this Community.
     * 
     * @return emailHeaderDocument
     */
    public java.lang.String getEmailHeaderDocument() {
        return emailHeaderDocument;
    }


    /**
     * Sets the emailHeaderDocument value for this Community.
     * 
     * @param emailHeaderDocument
     */
    public void setEmailHeaderDocument(java.lang.String emailHeaderDocument) {
        this.emailHeaderDocument = emailHeaderDocument;
    }


    /**
     * Gets the emailNotificationUrl value for this Community.
     * 
     * @return emailNotificationUrl
     */
    public java.lang.String getEmailNotificationUrl() {
        return emailNotificationUrl;
    }


    /**
     * Sets the emailNotificationUrl value for this Community.
     * 
     * @param emailNotificationUrl
     */
    public void setEmailNotificationUrl(java.lang.String emailNotificationUrl) {
        this.emailNotificationUrl = emailNotificationUrl;
    }


    /**
     * Gets the enableChatterAnswers value for this Community.
     * 
     * @return enableChatterAnswers
     */
    public java.lang.Boolean getEnableChatterAnswers() {
        return enableChatterAnswers;
    }


    /**
     * Sets the enableChatterAnswers value for this Community.
     * 
     * @param enableChatterAnswers
     */
    public void setEnableChatterAnswers(java.lang.Boolean enableChatterAnswers) {
        this.enableChatterAnswers = enableChatterAnswers;
    }


    /**
     * Gets the enablePrivateQuestions value for this Community.
     * 
     * @return enablePrivateQuestions
     */
    public java.lang.Boolean getEnablePrivateQuestions() {
        return enablePrivateQuestions;
    }


    /**
     * Sets the enablePrivateQuestions value for this Community.
     * 
     * @param enablePrivateQuestions
     */
    public void setEnablePrivateQuestions(java.lang.Boolean enablePrivateQuestions) {
        this.enablePrivateQuestions = enablePrivateQuestions;
    }


    /**
     * Gets the expertsGroup value for this Community.
     * 
     * @return expertsGroup
     */
    public java.lang.String getExpertsGroup() {
        return expertsGroup;
    }


    /**
     * Sets the expertsGroup value for this Community.
     * 
     * @param expertsGroup
     */
    public void setExpertsGroup(java.lang.String expertsGroup) {
        this.expertsGroup = expertsGroup;
    }


    /**
     * Gets the portal value for this Community.
     * 
     * @return portal
     */
    public java.lang.String getPortal() {
        return portal;
    }


    /**
     * Sets the portal value for this Community.
     * 
     * @param portal
     */
    public void setPortal(java.lang.String portal) {
        this.portal = portal;
    }


    /**
     * Gets the reputationLevels value for this Community.
     * 
     * @return reputationLevels
     */
    public com.sforce.soap._2006._04.metadata.ReputationLevels getReputationLevels() {
        return reputationLevels;
    }


    /**
     * Sets the reputationLevels value for this Community.
     * 
     * @param reputationLevels
     */
    public void setReputationLevels(com.sforce.soap._2006._04.metadata.ReputationLevels reputationLevels) {
        this.reputationLevels = reputationLevels;
    }


    /**
     * Gets the showInPortal value for this Community.
     * 
     * @return showInPortal
     */
    public java.lang.Boolean getShowInPortal() {
        return showInPortal;
    }


    /**
     * Sets the showInPortal value for this Community.
     * 
     * @param showInPortal
     */
    public void setShowInPortal(java.lang.Boolean showInPortal) {
        this.showInPortal = showInPortal;
    }


    /**
     * Gets the site value for this Community.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this Community.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Community)) return false;
        Community other = (Community) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.chatterAnswersFacebookSsoUrl==null && other.getChatterAnswersFacebookSsoUrl()==null) || 
             (this.chatterAnswersFacebookSsoUrl!=null &&
              this.chatterAnswersFacebookSsoUrl.equals(other.getChatterAnswersFacebookSsoUrl()))) &&
            ((this.communityFeedPage==null && other.getCommunityFeedPage()==null) || 
             (this.communityFeedPage!=null &&
              this.communityFeedPage.equals(other.getCommunityFeedPage()))) &&
            ((this.dataCategoryName==null && other.getDataCategoryName()==null) || 
             (this.dataCategoryName!=null &&
              this.dataCategoryName.equals(other.getDataCategoryName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.emailFooterDocument==null && other.getEmailFooterDocument()==null) || 
             (this.emailFooterDocument!=null &&
              this.emailFooterDocument.equals(other.getEmailFooterDocument()))) &&
            ((this.emailHeaderDocument==null && other.getEmailHeaderDocument()==null) || 
             (this.emailHeaderDocument!=null &&
              this.emailHeaderDocument.equals(other.getEmailHeaderDocument()))) &&
            ((this.emailNotificationUrl==null && other.getEmailNotificationUrl()==null) || 
             (this.emailNotificationUrl!=null &&
              this.emailNotificationUrl.equals(other.getEmailNotificationUrl()))) &&
            ((this.enableChatterAnswers==null && other.getEnableChatterAnswers()==null) || 
             (this.enableChatterAnswers!=null &&
              this.enableChatterAnswers.equals(other.getEnableChatterAnswers()))) &&
            ((this.enablePrivateQuestions==null && other.getEnablePrivateQuestions()==null) || 
             (this.enablePrivateQuestions!=null &&
              this.enablePrivateQuestions.equals(other.getEnablePrivateQuestions()))) &&
            ((this.expertsGroup==null && other.getExpertsGroup()==null) || 
             (this.expertsGroup!=null &&
              this.expertsGroup.equals(other.getExpertsGroup()))) &&
            ((this.portal==null && other.getPortal()==null) || 
             (this.portal!=null &&
              this.portal.equals(other.getPortal()))) &&
            ((this.reputationLevels==null && other.getReputationLevels()==null) || 
             (this.reputationLevels!=null &&
              this.reputationLevels.equals(other.getReputationLevels()))) &&
            ((this.showInPortal==null && other.getShowInPortal()==null) || 
             (this.showInPortal!=null &&
              this.showInPortal.equals(other.getShowInPortal()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getChatterAnswersFacebookSsoUrl() != null) {
            _hashCode += getChatterAnswersFacebookSsoUrl().hashCode();
        }
        if (getCommunityFeedPage() != null) {
            _hashCode += getCommunityFeedPage().hashCode();
        }
        if (getDataCategoryName() != null) {
            _hashCode += getDataCategoryName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmailFooterDocument() != null) {
            _hashCode += getEmailFooterDocument().hashCode();
        }
        if (getEmailHeaderDocument() != null) {
            _hashCode += getEmailHeaderDocument().hashCode();
        }
        if (getEmailNotificationUrl() != null) {
            _hashCode += getEmailNotificationUrl().hashCode();
        }
        if (getEnableChatterAnswers() != null) {
            _hashCode += getEnableChatterAnswers().hashCode();
        }
        if (getEnablePrivateQuestions() != null) {
            _hashCode += getEnablePrivateQuestions().hashCode();
        }
        if (getExpertsGroup() != null) {
            _hashCode += getExpertsGroup().hashCode();
        }
        if (getPortal() != null) {
            _hashCode += getPortal().hashCode();
        }
        if (getReputationLevels() != null) {
            _hashCode += getReputationLevels().hashCode();
        }
        if (getShowInPortal() != null) {
            _hashCode += getShowInPortal().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Community.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Community"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterAnswersFacebookSsoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterAnswersFacebookSsoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityFeedPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "communityFeedPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataCategoryName"));
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
        elemField.setFieldName("emailFooterDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailFooterDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailHeaderDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailHeaderDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailNotificationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailNotificationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableChatterAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableChatterAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablePrivateQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enablePrivateQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expertsGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "expertsGroup"));
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
        elemField.setFieldName("reputationLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reputationLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReputationLevels"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showInPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showInPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site"));
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
