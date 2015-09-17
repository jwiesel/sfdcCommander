/**
 * NameSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class NameSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean enableMiddleName;

    private java.lang.Boolean enableNameSuffix;

    public NameSettings() {
    }

    public NameSettings(
           java.lang.String fullName,
           java.lang.Boolean enableMiddleName,
           java.lang.Boolean enableNameSuffix) {
        super(
            fullName);
        this.enableMiddleName = enableMiddleName;
        this.enableNameSuffix = enableNameSuffix;
    }


    /**
     * Gets the enableMiddleName value for this NameSettings.
     * 
     * @return enableMiddleName
     */
    public java.lang.Boolean getEnableMiddleName() {
        return enableMiddleName;
    }


    /**
     * Sets the enableMiddleName value for this NameSettings.
     * 
     * @param enableMiddleName
     */
    public void setEnableMiddleName(java.lang.Boolean enableMiddleName) {
        this.enableMiddleName = enableMiddleName;
    }


    /**
     * Gets the enableNameSuffix value for this NameSettings.
     * 
     * @return enableNameSuffix
     */
    public java.lang.Boolean getEnableNameSuffix() {
        return enableNameSuffix;
    }


    /**
     * Sets the enableNameSuffix value for this NameSettings.
     * 
     * @param enableNameSuffix
     */
    public void setEnableNameSuffix(java.lang.Boolean enableNameSuffix) {
        this.enableNameSuffix = enableNameSuffix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameSettings)) return false;
        NameSettings other = (NameSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enableMiddleName==null && other.getEnableMiddleName()==null) || 
             (this.enableMiddleName!=null &&
              this.enableMiddleName.equals(other.getEnableMiddleName()))) &&
            ((this.enableNameSuffix==null && other.getEnableNameSuffix()==null) || 
             (this.enableNameSuffix!=null &&
              this.enableNameSuffix.equals(other.getEnableNameSuffix())));
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
        if (getEnableMiddleName() != null) {
            _hashCode += getEnableMiddleName().hashCode();
        }
        if (getEnableNameSuffix() != null) {
            _hashCode += getEnableNameSuffix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NameSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableMiddleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableMiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableNameSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableNameSuffix"));
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
