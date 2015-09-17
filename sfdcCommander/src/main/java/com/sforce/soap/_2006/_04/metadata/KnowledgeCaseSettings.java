/**
 * KnowledgeCaseSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class KnowledgeCaseSettings  implements java.io.Serializable {
    private java.lang.String articlePDFCreationProfile;

    private java.lang.String[] articlePublicSharingSites;

    private java.lang.String[] articlePublicSharingSitesChatterAnswers;

    private java.lang.String assignTo;

    private java.lang.String customizationClass;

    private java.lang.String defaultContributionArticleType;

    private com.sforce.soap._2006._04.metadata.KnowledgeCaseEditor editor;

    private java.lang.Boolean enableArticleCreation;

    private java.lang.Boolean enableArticlePublicSharingSites;

    private java.lang.Boolean useProfileForPDFCreation;

    public KnowledgeCaseSettings() {
    }

    public KnowledgeCaseSettings(
           java.lang.String articlePDFCreationProfile,
           java.lang.String[] articlePublicSharingSites,
           java.lang.String[] articlePublicSharingSitesChatterAnswers,
           java.lang.String assignTo,
           java.lang.String customizationClass,
           java.lang.String defaultContributionArticleType,
           com.sforce.soap._2006._04.metadata.KnowledgeCaseEditor editor,
           java.lang.Boolean enableArticleCreation,
           java.lang.Boolean enableArticlePublicSharingSites,
           java.lang.Boolean useProfileForPDFCreation) {
           this.articlePDFCreationProfile = articlePDFCreationProfile;
           this.articlePublicSharingSites = articlePublicSharingSites;
           this.articlePublicSharingSitesChatterAnswers = articlePublicSharingSitesChatterAnswers;
           this.assignTo = assignTo;
           this.customizationClass = customizationClass;
           this.defaultContributionArticleType = defaultContributionArticleType;
           this.editor = editor;
           this.enableArticleCreation = enableArticleCreation;
           this.enableArticlePublicSharingSites = enableArticlePublicSharingSites;
           this.useProfileForPDFCreation = useProfileForPDFCreation;
    }


    /**
     * Gets the articlePDFCreationProfile value for this KnowledgeCaseSettings.
     * 
     * @return articlePDFCreationProfile
     */
    public java.lang.String getArticlePDFCreationProfile() {
        return articlePDFCreationProfile;
    }


    /**
     * Sets the articlePDFCreationProfile value for this KnowledgeCaseSettings.
     * 
     * @param articlePDFCreationProfile
     */
    public void setArticlePDFCreationProfile(java.lang.String articlePDFCreationProfile) {
        this.articlePDFCreationProfile = articlePDFCreationProfile;
    }


    /**
     * Gets the articlePublicSharingSites value for this KnowledgeCaseSettings.
     * 
     * @return articlePublicSharingSites
     */
    public java.lang.String[] getArticlePublicSharingSites() {
        return articlePublicSharingSites;
    }


    /**
     * Sets the articlePublicSharingSites value for this KnowledgeCaseSettings.
     * 
     * @param articlePublicSharingSites
     */
    public void setArticlePublicSharingSites(java.lang.String[] articlePublicSharingSites) {
        this.articlePublicSharingSites = articlePublicSharingSites;
    }


    /**
     * Gets the articlePublicSharingSitesChatterAnswers value for this KnowledgeCaseSettings.
     * 
     * @return articlePublicSharingSitesChatterAnswers
     */
    public java.lang.String[] getArticlePublicSharingSitesChatterAnswers() {
        return articlePublicSharingSitesChatterAnswers;
    }


    /**
     * Sets the articlePublicSharingSitesChatterAnswers value for this KnowledgeCaseSettings.
     * 
     * @param articlePublicSharingSitesChatterAnswers
     */
    public void setArticlePublicSharingSitesChatterAnswers(java.lang.String[] articlePublicSharingSitesChatterAnswers) {
        this.articlePublicSharingSitesChatterAnswers = articlePublicSharingSitesChatterAnswers;
    }


    /**
     * Gets the assignTo value for this KnowledgeCaseSettings.
     * 
     * @return assignTo
     */
    public java.lang.String getAssignTo() {
        return assignTo;
    }


    /**
     * Sets the assignTo value for this KnowledgeCaseSettings.
     * 
     * @param assignTo
     */
    public void setAssignTo(java.lang.String assignTo) {
        this.assignTo = assignTo;
    }


    /**
     * Gets the customizationClass value for this KnowledgeCaseSettings.
     * 
     * @return customizationClass
     */
    public java.lang.String getCustomizationClass() {
        return customizationClass;
    }


    /**
     * Sets the customizationClass value for this KnowledgeCaseSettings.
     * 
     * @param customizationClass
     */
    public void setCustomizationClass(java.lang.String customizationClass) {
        this.customizationClass = customizationClass;
    }


    /**
     * Gets the defaultContributionArticleType value for this KnowledgeCaseSettings.
     * 
     * @return defaultContributionArticleType
     */
    public java.lang.String getDefaultContributionArticleType() {
        return defaultContributionArticleType;
    }


    /**
     * Sets the defaultContributionArticleType value for this KnowledgeCaseSettings.
     * 
     * @param defaultContributionArticleType
     */
    public void setDefaultContributionArticleType(java.lang.String defaultContributionArticleType) {
        this.defaultContributionArticleType = defaultContributionArticleType;
    }


    /**
     * Gets the editor value for this KnowledgeCaseSettings.
     * 
     * @return editor
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeCaseEditor getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this KnowledgeCaseSettings.
     * 
     * @param editor
     */
    public void setEditor(com.sforce.soap._2006._04.metadata.KnowledgeCaseEditor editor) {
        this.editor = editor;
    }


    /**
     * Gets the enableArticleCreation value for this KnowledgeCaseSettings.
     * 
     * @return enableArticleCreation
     */
    public java.lang.Boolean getEnableArticleCreation() {
        return enableArticleCreation;
    }


    /**
     * Sets the enableArticleCreation value for this KnowledgeCaseSettings.
     * 
     * @param enableArticleCreation
     */
    public void setEnableArticleCreation(java.lang.Boolean enableArticleCreation) {
        this.enableArticleCreation = enableArticleCreation;
    }


    /**
     * Gets the enableArticlePublicSharingSites value for this KnowledgeCaseSettings.
     * 
     * @return enableArticlePublicSharingSites
     */
    public java.lang.Boolean getEnableArticlePublicSharingSites() {
        return enableArticlePublicSharingSites;
    }


    /**
     * Sets the enableArticlePublicSharingSites value for this KnowledgeCaseSettings.
     * 
     * @param enableArticlePublicSharingSites
     */
    public void setEnableArticlePublicSharingSites(java.lang.Boolean enableArticlePublicSharingSites) {
        this.enableArticlePublicSharingSites = enableArticlePublicSharingSites;
    }


    /**
     * Gets the useProfileForPDFCreation value for this KnowledgeCaseSettings.
     * 
     * @return useProfileForPDFCreation
     */
    public java.lang.Boolean getUseProfileForPDFCreation() {
        return useProfileForPDFCreation;
    }


    /**
     * Sets the useProfileForPDFCreation value for this KnowledgeCaseSettings.
     * 
     * @param useProfileForPDFCreation
     */
    public void setUseProfileForPDFCreation(java.lang.Boolean useProfileForPDFCreation) {
        this.useProfileForPDFCreation = useProfileForPDFCreation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KnowledgeCaseSettings)) return false;
        KnowledgeCaseSettings other = (KnowledgeCaseSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.articlePDFCreationProfile==null && other.getArticlePDFCreationProfile()==null) || 
             (this.articlePDFCreationProfile!=null &&
              this.articlePDFCreationProfile.equals(other.getArticlePDFCreationProfile()))) &&
            ((this.articlePublicSharingSites==null && other.getArticlePublicSharingSites()==null) || 
             (this.articlePublicSharingSites!=null &&
              java.util.Arrays.equals(this.articlePublicSharingSites, other.getArticlePublicSharingSites()))) &&
            ((this.articlePublicSharingSitesChatterAnswers==null && other.getArticlePublicSharingSitesChatterAnswers()==null) || 
             (this.articlePublicSharingSitesChatterAnswers!=null &&
              java.util.Arrays.equals(this.articlePublicSharingSitesChatterAnswers, other.getArticlePublicSharingSitesChatterAnswers()))) &&
            ((this.assignTo==null && other.getAssignTo()==null) || 
             (this.assignTo!=null &&
              this.assignTo.equals(other.getAssignTo()))) &&
            ((this.customizationClass==null && other.getCustomizationClass()==null) || 
             (this.customizationClass!=null &&
              this.customizationClass.equals(other.getCustomizationClass()))) &&
            ((this.defaultContributionArticleType==null && other.getDefaultContributionArticleType()==null) || 
             (this.defaultContributionArticleType!=null &&
              this.defaultContributionArticleType.equals(other.getDefaultContributionArticleType()))) &&
            ((this.editor==null && other.getEditor()==null) || 
             (this.editor!=null &&
              this.editor.equals(other.getEditor()))) &&
            ((this.enableArticleCreation==null && other.getEnableArticleCreation()==null) || 
             (this.enableArticleCreation!=null &&
              this.enableArticleCreation.equals(other.getEnableArticleCreation()))) &&
            ((this.enableArticlePublicSharingSites==null && other.getEnableArticlePublicSharingSites()==null) || 
             (this.enableArticlePublicSharingSites!=null &&
              this.enableArticlePublicSharingSites.equals(other.getEnableArticlePublicSharingSites()))) &&
            ((this.useProfileForPDFCreation==null && other.getUseProfileForPDFCreation()==null) || 
             (this.useProfileForPDFCreation!=null &&
              this.useProfileForPDFCreation.equals(other.getUseProfileForPDFCreation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getArticlePDFCreationProfile() != null) {
            _hashCode += getArticlePDFCreationProfile().hashCode();
        }
        if (getArticlePublicSharingSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArticlePublicSharingSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArticlePublicSharingSites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArticlePublicSharingSitesChatterAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArticlePublicSharingSitesChatterAnswers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArticlePublicSharingSitesChatterAnswers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignTo() != null) {
            _hashCode += getAssignTo().hashCode();
        }
        if (getCustomizationClass() != null) {
            _hashCode += getCustomizationClass().hashCode();
        }
        if (getDefaultContributionArticleType() != null) {
            _hashCode += getDefaultContributionArticleType().hashCode();
        }
        if (getEditor() != null) {
            _hashCode += getEditor().hashCode();
        }
        if (getEnableArticleCreation() != null) {
            _hashCode += getEnableArticleCreation().hashCode();
        }
        if (getEnableArticlePublicSharingSites() != null) {
            _hashCode += getEnableArticlePublicSharingSites().hashCode();
        }
        if (getUseProfileForPDFCreation() != null) {
            _hashCode += getUseProfileForPDFCreation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KnowledgeCaseSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeCaseSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articlePDFCreationProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "articlePDFCreationProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articlePublicSharingSites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "articlePublicSharingSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articlePublicSharingSitesChatterAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "articlePublicSharingSitesChatterAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizationClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customizationClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultContributionArticleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultContributionArticleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeCaseEditor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableArticleCreation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableArticleCreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableArticlePublicSharingSites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableArticlePublicSharingSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useProfileForPDFCreation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "useProfileForPDFCreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
