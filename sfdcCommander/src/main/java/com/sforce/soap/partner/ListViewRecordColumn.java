/**
 * ListViewRecordColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class ListViewRecordColumn  implements java.io.Serializable {
    private java.lang.String fieldNameOrPath;

    private java.lang.String value;

    public ListViewRecordColumn() {
    }

    public ListViewRecordColumn(
           java.lang.String fieldNameOrPath,
           java.lang.String value) {
           this.fieldNameOrPath = fieldNameOrPath;
           this.value = value;
    }


    /**
     * Gets the fieldNameOrPath value for this ListViewRecordColumn.
     * 
     * @return fieldNameOrPath
     */
    public java.lang.String getFieldNameOrPath() {
        return fieldNameOrPath;
    }


    /**
     * Sets the fieldNameOrPath value for this ListViewRecordColumn.
     * 
     * @param fieldNameOrPath
     */
    public void setFieldNameOrPath(java.lang.String fieldNameOrPath) {
        this.fieldNameOrPath = fieldNameOrPath;
    }


    /**
     * Gets the value value for this ListViewRecordColumn.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ListViewRecordColumn.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListViewRecordColumn)) return false;
        ListViewRecordColumn other = (ListViewRecordColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldNameOrPath==null && other.getFieldNameOrPath()==null) || 
             (this.fieldNameOrPath!=null &&
              this.fieldNameOrPath.equals(other.getFieldNameOrPath()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getFieldNameOrPath() != null) {
            _hashCode += getFieldNameOrPath().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListViewRecordColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewRecordColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNameOrPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldNameOrPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
