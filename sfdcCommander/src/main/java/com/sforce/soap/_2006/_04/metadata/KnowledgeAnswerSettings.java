/**
 * KnowledgeAnswerSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class KnowledgeAnswerSettings  implements java.io.Serializable {
    private java.lang.String assignTo;

    private java.lang.String defaultArticleType;

    private java.lang.Boolean enableArticleCreation;

    public KnowledgeAnswerSettings() {
    }

    public KnowledgeAnswerSettings(
           java.lang.String assignTo,
           java.lang.String defaultArticleType,
           java.lang.Boolean enableArticleCreation) {
           this.assignTo = assignTo;
           this.defaultArticleType = defaultArticleType;
           this.enableArticleCreation = enableArticleCreation;
    }


    /**
     * Gets the assignTo value for this KnowledgeAnswerSettings.
     * 
     * @return assignTo
     */
    public java.lang.String getAssignTo() {
        return assignTo;
    }


    /**
     * Sets the assignTo value for this KnowledgeAnswerSettings.
     * 
     * @param assignTo
     */
    public void setAssignTo(java.lang.String assignTo) {
        this.assignTo = assignTo;
    }


    /**
     * Gets the defaultArticleType value for this KnowledgeAnswerSettings.
     * 
     * @return defaultArticleType
     */
    public java.lang.String getDefaultArticleType() {
        return defaultArticleType;
    }


    /**
     * Sets the defaultArticleType value for this KnowledgeAnswerSettings.
     * 
     * @param defaultArticleType
     */
    public void setDefaultArticleType(java.lang.String defaultArticleType) {
        this.defaultArticleType = defaultArticleType;
    }


    /**
     * Gets the enableArticleCreation value for this KnowledgeAnswerSettings.
     * 
     * @return enableArticleCreation
     */
    public java.lang.Boolean getEnableArticleCreation() {
        return enableArticleCreation;
    }


    /**
     * Sets the enableArticleCreation value for this KnowledgeAnswerSettings.
     * 
     * @param enableArticleCreation
     */
    public void setEnableArticleCreation(java.lang.Boolean enableArticleCreation) {
        this.enableArticleCreation = enableArticleCreation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KnowledgeAnswerSettings)) return false;
        KnowledgeAnswerSettings other = (KnowledgeAnswerSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assignTo==null && other.getAssignTo()==null) || 
             (this.assignTo!=null &&
              this.assignTo.equals(other.getAssignTo()))) &&
            ((this.defaultArticleType==null && other.getDefaultArticleType()==null) || 
             (this.defaultArticleType!=null &&
              this.defaultArticleType.equals(other.getDefaultArticleType()))) &&
            ((this.enableArticleCreation==null && other.getEnableArticleCreation()==null) || 
             (this.enableArticleCreation!=null &&
              this.enableArticleCreation.equals(other.getEnableArticleCreation())));
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
        if (getAssignTo() != null) {
            _hashCode += getAssignTo().hashCode();
        }
        if (getDefaultArticleType() != null) {
            _hashCode += getDefaultArticleType().hashCode();
        }
        if (getEnableArticleCreation() != null) {
            _hashCode += getEnableArticleCreation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KnowledgeAnswerSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeAnswerSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultArticleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultArticleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
