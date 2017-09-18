/**
 * QuickActionSendEmailOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class QuickActionSendEmailOptions  implements java.io.Serializable {
    private java.lang.String defaultEmailTemplateName;

    private boolean ignoreDefaultEmailTemplateSubject;

    public QuickActionSendEmailOptions() {
    }

    public QuickActionSendEmailOptions(
           java.lang.String defaultEmailTemplateName,
           boolean ignoreDefaultEmailTemplateSubject) {
           this.defaultEmailTemplateName = defaultEmailTemplateName;
           this.ignoreDefaultEmailTemplateSubject = ignoreDefaultEmailTemplateSubject;
    }


    /**
     * Gets the defaultEmailTemplateName value for this QuickActionSendEmailOptions.
     * 
     * @return defaultEmailTemplateName
     */
    public java.lang.String getDefaultEmailTemplateName() {
        return defaultEmailTemplateName;
    }


    /**
     * Sets the defaultEmailTemplateName value for this QuickActionSendEmailOptions.
     * 
     * @param defaultEmailTemplateName
     */
    public void setDefaultEmailTemplateName(java.lang.String defaultEmailTemplateName) {
        this.defaultEmailTemplateName = defaultEmailTemplateName;
    }


    /**
     * Gets the ignoreDefaultEmailTemplateSubject value for this QuickActionSendEmailOptions.
     * 
     * @return ignoreDefaultEmailTemplateSubject
     */
    public boolean isIgnoreDefaultEmailTemplateSubject() {
        return ignoreDefaultEmailTemplateSubject;
    }


    /**
     * Sets the ignoreDefaultEmailTemplateSubject value for this QuickActionSendEmailOptions.
     * 
     * @param ignoreDefaultEmailTemplateSubject
     */
    public void setIgnoreDefaultEmailTemplateSubject(boolean ignoreDefaultEmailTemplateSubject) {
        this.ignoreDefaultEmailTemplateSubject = ignoreDefaultEmailTemplateSubject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuickActionSendEmailOptions)) return false;
        QuickActionSendEmailOptions other = (QuickActionSendEmailOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultEmailTemplateName==null && other.getDefaultEmailTemplateName()==null) || 
             (this.defaultEmailTemplateName!=null &&
              this.defaultEmailTemplateName.equals(other.getDefaultEmailTemplateName()))) &&
            this.ignoreDefaultEmailTemplateSubject == other.isIgnoreDefaultEmailTemplateSubject();
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
        if (getDefaultEmailTemplateName() != null) {
            _hashCode += getDefaultEmailTemplateName().hashCode();
        }
        _hashCode += (isIgnoreDefaultEmailTemplateSubject() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuickActionSendEmailOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionSendEmailOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEmailTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultEmailTemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreDefaultEmailTemplateSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ignoreDefaultEmailTemplateSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
