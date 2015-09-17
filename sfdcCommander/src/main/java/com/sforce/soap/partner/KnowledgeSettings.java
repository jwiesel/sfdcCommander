/**
 * KnowledgeSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class KnowledgeSettings  implements java.io.Serializable {
    private java.lang.String defaultLanguage;

    private boolean knowledgeEnabled;

    private com.sforce.soap.partner.KnowledgeLanguageItem[] languages;

    public KnowledgeSettings() {
    }

    public KnowledgeSettings(
           java.lang.String defaultLanguage,
           boolean knowledgeEnabled,
           com.sforce.soap.partner.KnowledgeLanguageItem[] languages) {
           this.defaultLanguage = defaultLanguage;
           this.knowledgeEnabled = knowledgeEnabled;
           this.languages = languages;
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
     * Gets the knowledgeEnabled value for this KnowledgeSettings.
     * 
     * @return knowledgeEnabled
     */
    public boolean isKnowledgeEnabled() {
        return knowledgeEnabled;
    }


    /**
     * Sets the knowledgeEnabled value for this KnowledgeSettings.
     * 
     * @param knowledgeEnabled
     */
    public void setKnowledgeEnabled(boolean knowledgeEnabled) {
        this.knowledgeEnabled = knowledgeEnabled;
    }


    /**
     * Gets the languages value for this KnowledgeSettings.
     * 
     * @return languages
     */
    public com.sforce.soap.partner.KnowledgeLanguageItem[] getLanguages() {
        return languages;
    }


    /**
     * Sets the languages value for this KnowledgeSettings.
     * 
     * @param languages
     */
    public void setLanguages(com.sforce.soap.partner.KnowledgeLanguageItem[] languages) {
        this.languages = languages;
    }

    public com.sforce.soap.partner.KnowledgeLanguageItem getLanguages(int i) {
        return this.languages[i];
    }

    public void setLanguages(int i, com.sforce.soap.partner.KnowledgeLanguageItem _value) {
        this.languages[i] = _value;
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
        _equals = true && 
            ((this.defaultLanguage==null && other.getDefaultLanguage()==null) || 
             (this.defaultLanguage!=null &&
              this.defaultLanguage.equals(other.getDefaultLanguage()))) &&
            this.knowledgeEnabled == other.isKnowledgeEnabled() &&
            ((this.languages==null && other.getLanguages()==null) || 
             (this.languages!=null &&
              java.util.Arrays.equals(this.languages, other.getLanguages())));
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
        if (getDefaultLanguage() != null) {
            _hashCode += getDefaultLanguage().hashCode();
        }
        _hashCode += (isKnowledgeEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KnowledgeSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "KnowledgeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "defaultLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("knowledgeEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "knowledgeEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "languages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "KnowledgeLanguageItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
