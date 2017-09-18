/**
 * ObjectMappingField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ObjectMappingField  implements java.io.Serializable {
    private java.lang.String inputField;

    private java.lang.String outputField;

    public ObjectMappingField() {
    }

    public ObjectMappingField(
           java.lang.String inputField,
           java.lang.String outputField) {
           this.inputField = inputField;
           this.outputField = outputField;
    }


    /**
     * Gets the inputField value for this ObjectMappingField.
     * 
     * @return inputField
     */
    public java.lang.String getInputField() {
        return inputField;
    }


    /**
     * Sets the inputField value for this ObjectMappingField.
     * 
     * @param inputField
     */
    public void setInputField(java.lang.String inputField) {
        this.inputField = inputField;
    }


    /**
     * Gets the outputField value for this ObjectMappingField.
     * 
     * @return outputField
     */
    public java.lang.String getOutputField() {
        return outputField;
    }


    /**
     * Sets the outputField value for this ObjectMappingField.
     * 
     * @param outputField
     */
    public void setOutputField(java.lang.String outputField) {
        this.outputField = outputField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectMappingField)) return false;
        ObjectMappingField other = (ObjectMappingField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputField==null && other.getInputField()==null) || 
             (this.inputField!=null &&
              this.inputField.equals(other.getInputField()))) &&
            ((this.outputField==null && other.getOutputField()==null) || 
             (this.outputField!=null &&
              this.outputField.equals(other.getOutputField())));
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
        if (getInputField() != null) {
            _hashCode += getInputField().hashCode();
        }
        if (getOutputField() != null) {
            _hashCode += getOutputField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectMappingField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectMappingField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inputField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
