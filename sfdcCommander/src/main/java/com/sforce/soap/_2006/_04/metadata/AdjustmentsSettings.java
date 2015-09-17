/**
 * AdjustmentsSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AdjustmentsSettings  implements java.io.Serializable {
    private boolean enableAdjustments;

    private boolean enableOwnerAdjustments;

    public AdjustmentsSettings() {
    }

    public AdjustmentsSettings(
           boolean enableAdjustments,
           boolean enableOwnerAdjustments) {
           this.enableAdjustments = enableAdjustments;
           this.enableOwnerAdjustments = enableOwnerAdjustments;
    }


    /**
     * Gets the enableAdjustments value for this AdjustmentsSettings.
     * 
     * @return enableAdjustments
     */
    public boolean isEnableAdjustments() {
        return enableAdjustments;
    }


    /**
     * Sets the enableAdjustments value for this AdjustmentsSettings.
     * 
     * @param enableAdjustments
     */
    public void setEnableAdjustments(boolean enableAdjustments) {
        this.enableAdjustments = enableAdjustments;
    }


    /**
     * Gets the enableOwnerAdjustments value for this AdjustmentsSettings.
     * 
     * @return enableOwnerAdjustments
     */
    public boolean isEnableOwnerAdjustments() {
        return enableOwnerAdjustments;
    }


    /**
     * Sets the enableOwnerAdjustments value for this AdjustmentsSettings.
     * 
     * @param enableOwnerAdjustments
     */
    public void setEnableOwnerAdjustments(boolean enableOwnerAdjustments) {
        this.enableOwnerAdjustments = enableOwnerAdjustments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustmentsSettings)) return false;
        AdjustmentsSettings other = (AdjustmentsSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enableAdjustments == other.isEnableAdjustments() &&
            this.enableOwnerAdjustments == other.isEnableOwnerAdjustments();
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
        _hashCode += (isEnableAdjustments() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableOwnerAdjustments() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustmentsSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AdjustmentsSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAdjustments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAdjustments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableOwnerAdjustments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableOwnerAdjustments"));
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
