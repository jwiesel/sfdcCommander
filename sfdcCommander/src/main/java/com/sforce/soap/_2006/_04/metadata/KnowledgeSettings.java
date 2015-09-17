/**
 * KnowledgeSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class KnowledgeSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.KnowledgeAnswerSettings answers;

    private com.sforce.soap._2006._04.metadata.KnowledgeCaseSettings cases;

    private java.lang.String defaultLanguage;

    private java.lang.Boolean enableChatterQuestionKBDeflection;

    private java.lang.Boolean enableCreateEditOnArticlesTab;

    private java.lang.Boolean enableExternalMediaContent;

    private java.lang.Boolean enableKnowledge;

    private com.sforce.soap._2006._04.metadata.KnowledgeLanguage[] languages;

    private java.lang.Boolean showArticleSummariesCustomerPortal;

    private java.lang.Boolean showArticleSummariesInternalApp;

    private java.lang.Boolean showArticleSummariesPartnerPortal;

    private java.lang.Boolean showValidationStatusField;

    public KnowledgeSettings() {
    }

    public KnowledgeSettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.KnowledgeAnswerSettings answers,
           com.sforce.soap._2006._04.metadata.KnowledgeCaseSettings cases,
           java.lang.String defaultLanguage,
           java.lang.Boolean enableChatterQuestionKBDeflection,
           java.lang.Boolean enableCreateEditOnArticlesTab,
           java.lang.Boolean enableExternalMediaContent,
           java.lang.Boolean enableKnowledge,
           com.sforce.soap._2006._04.metadata.KnowledgeLanguage[] languages,
           java.lang.Boolean showArticleSummariesCustomerPortal,
           java.lang.Boolean showArticleSummariesInternalApp,
           java.lang.Boolean showArticleSummariesPartnerPortal,
           java.lang.Boolean showValidationStatusField) {
        super(
            fullName);
        this.answers = answers;
        this.cases = cases;
        this.defaultLanguage = defaultLanguage;
        this.enableChatterQuestionKBDeflection = enableChatterQuestionKBDeflection;
        this.enableCreateEditOnArticlesTab = enableCreateEditOnArticlesTab;
        this.enableExternalMediaContent = enableExternalMediaContent;
        this.enableKnowledge = enableKnowledge;
        this.languages = languages;
        this.showArticleSummariesCustomerPortal = showArticleSummariesCustomerPortal;
        this.showArticleSummariesInternalApp = showArticleSummariesInternalApp;
        this.showArticleSummariesPartnerPortal = showArticleSummariesPartnerPortal;
        this.showValidationStatusField = showValidationStatusField;
    }


    /**
     * Gets the answers value for this KnowledgeSettings.
     * 
     * @return answers
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeAnswerSettings getAnswers() {
        return answers;
    }


    /**
     * Sets the answers value for this KnowledgeSettings.
     * 
     * @param answers
     */
    public void setAnswers(com.sforce.soap._2006._04.metadata.KnowledgeAnswerSettings answers) {
        this.answers = answers;
    }


    /**
     * Gets the cases value for this KnowledgeSettings.
     * 
     * @return cases
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeCaseSettings getCases() {
        return cases;
    }


    /**
     * Sets the cases value for this KnowledgeSettings.
     * 
     * @param cases
     */
    public void setCases(com.sforce.soap._2006._04.metadata.KnowledgeCaseSettings cases) {
        this.cases = cases;
    }


    /**
     * Gets the defaultLanguage value for this KnowledgeSettings.
     * 
     * @return defaultLanguage
     */
    public java.lang.String getDefaultLanguage() {
        return defaultLanguage;
    }


    /**
     * Sets the defaultLanguage value for this KnowledgeSettings.
     * 
     * @param defaultLanguage
     */
    public void setDefaultLanguage(java.lang.String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }


    /**
     * Gets the enableChatterQuestionKBDeflection value for this KnowledgeSettings.
     * 
     * @return enableChatterQuestionKBDeflection
     */
    public java.lang.Boolean getEnableChatterQuestionKBDeflection() {
        return enableChatterQuestionKBDeflection;
    }


    /**
     * Sets the enableChatterQuestionKBDeflection value for this KnowledgeSettings.
     * 
     * @param enableChatterQuestionKBDeflection
     */
    public void setEnableChatterQuestionKBDeflection(java.lang.Boolean enableChatterQuestionKBDeflection) {
        this.enableChatterQuestionKBDeflection = enableChatterQuestionKBDeflection;
    }


    /**
     * Gets the enableCreateEditOnArticlesTab value for this KnowledgeSettings.
     * 
     * @return enableCreateEditOnArticlesTab
     */
    public java.lang.Boolean getEnableCreateEditOnArticlesTab() {
        return enableCreateEditOnArticlesTab;
    }


    /**
     * Sets the enableCreateEditOnArticlesTab value for this KnowledgeSettings.
     * 
     * @param enableCreateEditOnArticlesTab
     */
    public void setEnableCreateEditOnArticlesTab(java.lang.Boolean enableCreateEditOnArticlesTab) {
        this.enableCreateEditOnArticlesTab = enableCreateEditOnArticlesTab;
    }


    /**
     * Gets the enableExternalMediaContent value for this KnowledgeSettings.
     * 
     * @return enableExternalMediaContent
     */
    public java.lang.Boolean getEnableExternalMediaContent() {
        return enableExternalMediaContent;
    }


    /**
     * Sets the enableExternalMediaContent value for this KnowledgeSettings.
     * 
     * @param enableExternalMediaContent
     */
    public void setEnableExternalMediaContent(java.lang.Boolean enableExternalMediaContent) {
        this.enableExternalMediaContent = enableExternalMediaContent;
    }


    /**
     * Gets the enableKnowledge value for this KnowledgeSettings.
     * 
     * @return enableKnowledge
     */
    public java.lang.Boolean getEnableKnowledge() {
        return enableKnowledge;
    }


    /**
     * Sets the enableKnowledge value for this KnowledgeSettings.
     * 
     * @param enableKnowledge
     */
    public void setEnableKnowledge(java.lang.Boolean enableKnowledge) {
        this.enableKnowledge = enableKnowledge;
    }


    /**
     * Gets the languages value for this KnowledgeSettings.
     * 
     * @return languages
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeLanguage[] getLanguages() {
        return languages;
    }


    /**
     * Sets the languages value for this KnowledgeSettings.
     * 
     * @param languages
     */
    public void setLanguages(com.sforce.soap._2006._04.metadata.KnowledgeLanguage[] languages) {
        this.languages = languages;
    }


    /**
     * Gets the showArticleSummariesCustomerPortal value for this KnowledgeSettings.
     * 
     * @return showArticleSummariesCustomerPortal
     */
    public java.lang.Boolean getShowArticleSummariesCustomerPortal() {
        return showArticleSummariesCustomerPortal;
    }


    /**
     * Sets the showArticleSummariesCustomerPortal value for this KnowledgeSettings.
     * 
     * @param showArticleSummariesCustomerPortal
     */
    public void setShowArticleSummariesCustomerPortal(java.lang.Boolean showArticleSummariesCustomerPortal) {
        this.showArticleSummariesCustomerPortal = showArticleSummariesCustomerPortal;
    }


    /**
     * Gets the showArticleSummariesInternalApp value for this KnowledgeSettings.
     * 
     * @return showArticleSummariesInternalApp
     */
    public java.lang.Boolean getShowArticleSummariesInternalApp() {
        return showArticleSummariesInternalApp;
    }


    /**
     * Sets the showArticleSummariesInternalApp value for this KnowledgeSettings.
     * 
     * @param showArticleSummariesInternalApp
     */
    public void setShowArticleSummariesInternalApp(java.lang.Boolean showArticleSummariesInternalApp) {
        this.showArticleSummariesInternalApp = showArticleSummariesInternalApp;
    }


    /**
     * Gets the showArticleSummariesPartnerPortal value for this KnowledgeSettings.
     * 
     * @return showArticleSummariesPartnerPortal
     */
    public java.lang.Boolean getShowArticleSummariesPartnerPortal() {
        return showArticleSummariesPartnerPortal;
    }


    /**
     * Sets the showArticleSummariesPartnerPortal value for this KnowledgeSettings.
     * 
     * @param showArticleSummariesPartnerPortal
     */
    public void setShowArticleSummariesPartnerPortal(java.lang.Boolean showArticleSummariesPartnerPortal) {
        this.showArticleSummariesPartnerPortal = showArticleSummariesPartnerPortal;
    }


    /**
     * Gets the showValidationStatusField value for this KnowledgeSettings.
     * 
     * @return showValidationStatusField
     */
    public java.lang.Boolean getShowValidationStatusField() {
        return showValidationStatusField;
    }


    /**
     * Sets the showValidationStatusField value for this KnowledgeSettings.
     * 
     * @param showValidationStatusField
     */
    public void setShowValidationStatusField(java.lang.Boolean showValidationStatusField) {
        this.showValidationStatusField = showValidationStatusField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KnowledgeSettings)) return false;
        KnowledgeSettings other = (KnowledgeSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.answers==null && other.getAnswers()==null) || 
             (this.answers!=null &&
              this.answers.equals(other.getAnswers()))) &&
            ((this.cases==null && other.getCases()==null) || 
             (this.cases!=null &&
              this.cases.equals(other.getCases()))) &&
            ((this.defaultLanguage==null && other.getDefaultLanguage()==null) || 
             (this.defaultLanguage!=null &&
              this.defaultLanguage.equals(other.getDefaultLanguage()))) &&
            ((this.enableChatterQuestionKBDeflection==null && other.getEnableChatterQuestionKBDeflection()==null) || 
             (this.enableChatterQuestionKBDeflection!=null &&
              this.enableChatterQuestionKBDeflection.equals(other.getEnableChatterQuestionKBDeflection()))) &&
            ((this.enableCreateEditOnArticlesTab==null && other.getEnableCreateEditOnArticlesTab()==null) || 
             (this.enableCreateEditOnArticlesTab!=null &&
              this.enableCreateEditOnArticlesTab.equals(other.getEnableCreateEditOnArticlesTab()))) &&
            ((this.enableExternalMediaContent==null && other.getEnableExternalMediaContent()==null) || 
             (this.enableExternalMediaContent!=null &&
              this.enableExternalMediaContent.equals(other.getEnableExternalMediaContent()))) &&
            ((this.enableKnowledge==null && other.getEnableKnowledge()==null) || 
             (this.enableKnowledge!=null &&
              this.enableKnowledge.equals(other.getEnableKnowledge()))) &&
            ((this.languages==null && other.getLanguages()==null) || 
             (this.languages!=null &&
              java.util.Arrays.equals(this.languages, other.getLanguages()))) &&
            ((this.showArticleSummariesCustomerPortal==null && other.getShowArticleSummariesCustomerPortal()==null) || 
             (this.showArticleSummariesCustomerPortal!=null &&
              this.showArticleSummariesCustomerPortal.equals(other.getShowArticleSummariesCustomerPortal()))) &&
            ((this.showArticleSummariesInternalApp==null && other.getShowArticleSummariesInternalApp()==null) || 
             (this.showArticleSummariesInternalApp!=null &&
              this.showArticleSummariesInternalApp.equals(other.getShowArticleSummariesInternalApp()))) &&
            ((this.showArticleSummariesPartnerPortal==null && other.getShowArticleSummariesPartnerPortal()==null) || 
             (this.showArticleSummariesPartnerPortal!=null &&
              this.showArticleSummariesPartnerPortal.equals(other.getShowArticleSummariesPartnerPortal()))) &&
            ((this.showValidationStatusField==null && other.getShowValidationStatusField()==null) || 
             (this.showValidationStatusField!=null &&
              this.showValidationStatusField.equals(other.getShowValidationStatusField())));
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
        if (getAnswers() != null) {
            _hashCode += getAnswers().hashCode();
        }
        if (getCases() != null) {
            _hashCode += getCases().hashCode();
        }
        if (getDefaultLanguage() != null) {
            _hashCode += getDefaultLanguage().hashCode();
        }
        if (getEnableChatterQuestionKBDeflection() != null) {
            _hashCode += getEnableChatterQuestionKBDeflection().hashCode();
        }
        if (getEnableCreateEditOnArticlesTab() != null) {
            _hashCode += getEnableCreateEditOnArticlesTab().hashCode();
        }
        if (getEnableExternalMediaContent() != null) {
            _hashCode += getEnableExternalMediaContent().hashCode();
        }
        if (getEnableKnowledge() != null) {
            _hashCode += getEnableKnowledge().hashCode();
        }
        if (getLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShowArticleSummariesCustomerPortal() != null) {
            _hashCode += getShowArticleSummariesCustomerPortal().hashCode();
        }
        if (getShowArticleSummariesInternalApp() != null) {
            _hashCode += getShowArticleSummariesInternalApp().hashCode();
        }
        if (getShowArticleSummariesPartnerPortal() != null) {
            _hashCode += getShowArticleSummariesPartnerPortal().hashCode();
        }
        if (getShowValidationStatusField() != null) {
            _hashCode += getShowValidationStatusField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KnowledgeSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "answers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeAnswerSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "cases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeCaseSettings"));
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
        elemField.setFieldName("enableChatterQuestionKBDeflection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableChatterQuestionKBDeflection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCreateEditOnArticlesTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCreateEditOnArticlesTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableExternalMediaContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableExternalMediaContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "languages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "language"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showArticleSummariesCustomerPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showArticleSummariesCustomerPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showArticleSummariesInternalApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showArticleSummariesInternalApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showArticleSummariesPartnerPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showArticleSummariesPartnerPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showValidationStatusField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showValidationStatusField"));
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
