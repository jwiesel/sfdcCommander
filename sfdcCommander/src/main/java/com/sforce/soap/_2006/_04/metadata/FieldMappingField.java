/**
 * FieldMappingField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FieldMappingField  implements java.io.Serializable {
    private java.lang.String dataServiceField;

    private java.lang.String dataServiceObjectName;

    private int priority;

    public FieldMappingField() {
    }

    public FieldMappingField(
           java.lang.String dataServiceField,
           java.lang.String dataServiceObjectName,
           int priority) {
           this.dataServiceField = dataServiceField;
           this.dataServiceObjectName = dataServiceObjectName;
           this.priority = priority;
    }


    /**
     * Gets the dataServiceField value for this FieldMappingField.
     * 
     * @return dataServiceField
     */
    public java.lang.String getDataServiceField() {
        return dataServiceField;
    }


    /**
     * Sets the dataServiceField value for this FieldMappingField.
     * 
     * @param dataServiceField
     */
    public void setDataServiceField(java.lang.String dataServiceField) {
        this.dataServiceField = dataServiceField;
    }


    /**
     * Gets the dataServiceObjectName value for this FieldMappingField.
     * 
     * @return dataServiceObjectName
     */
    public java.lang.String getDataServiceObjectName() {
        return dataServiceObjectName;
    }


    /**
     * Sets the dataServiceObjectName value for this FieldMappingField.
     * 
     * @param dataServiceObjectName
     */
    public void setDataServiceObjectName(java.lang.String dataServiceObjectName) {
        this.dataServiceObjectName = dataServiceObjectName;
    }


    /**
     * Gets the priority value for this FieldMappingField.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this FieldMappingField.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldMappingField)) return false;
        FieldMappingField other = (FieldMappingField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataServiceField==null && other.getDataServiceField()==null) || 
             (this.dataServiceField!=null &&
              this.dataServiceField.equals(other.getDataServiceField()))) &&
            ((this.dataServiceObjectName==null && other.getDataServiceObjectName()==null) || 
             (this.dataServiceObjectName!=null &&
              this.dataServiceObjectName.equals(other.getDataServiceObjectName()))) &&
            this.priority == other.getPriority();
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
        if (getDataServiceField() != null) {
            _hashCode += getDataServiceField().hashCode();
        }
        if (getDataServiceObjectName() != null) {
            _hashCode += getDataServiceObjectName().hashCode();
        }
        _hashCode += getPriority();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldMappingField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldMappingField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataServiceField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataServiceField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataServiceObjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataServiceObjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
