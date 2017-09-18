/**
 * FieldMappingRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FieldMappingRow  implements java.io.Serializable {
    private java.lang.String SObjectType;

    private com.sforce.soap._2006._04.metadata.FieldMappingField[] fieldMappingFields;

    private java.lang.String fieldName;

    private com.sforce.soap._2006._04.metadata.MappingOperation mappingOperation;

    public FieldMappingRow() {
    }

    public FieldMappingRow(
           java.lang.String SObjectType,
           com.sforce.soap._2006._04.metadata.FieldMappingField[] fieldMappingFields,
           java.lang.String fieldName,
           com.sforce.soap._2006._04.metadata.MappingOperation mappingOperation) {
           this.SObjectType = SObjectType;
           this.fieldMappingFields = fieldMappingFields;
           this.fieldName = fieldName;
           this.mappingOperation = mappingOperation;
    }


    /**
     * Gets the SObjectType value for this FieldMappingRow.
     * 
     * @return SObjectType
     */
    public java.lang.String getSObjectType() {
        return SObjectType;
    }


    /**
     * Sets the SObjectType value for this FieldMappingRow.
     * 
     * @param SObjectType
     */
    public void setSObjectType(java.lang.String SObjectType) {
        this.SObjectType = SObjectType;
    }


    /**
     * Gets the fieldMappingFields value for this FieldMappingRow.
     * 
     * @return fieldMappingFields
     */
    public com.sforce.soap._2006._04.metadata.FieldMappingField[] getFieldMappingFields() {
        return fieldMappingFields;
    }


    /**
     * Sets the fieldMappingFields value for this FieldMappingRow.
     * 
     * @param fieldMappingFields
     */
    public void setFieldMappingFields(com.sforce.soap._2006._04.metadata.FieldMappingField[] fieldMappingFields) {
        this.fieldMappingFields = fieldMappingFields;
    }

    public com.sforce.soap._2006._04.metadata.FieldMappingField getFieldMappingFields(int i) {
        return this.fieldMappingFields[i];
    }

    public void setFieldMappingFields(int i, com.sforce.soap._2006._04.metadata.FieldMappingField _value) {
        this.fieldMappingFields[i] = _value;
    }


    /**
     * Gets the fieldName value for this FieldMappingRow.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this FieldMappingRow.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the mappingOperation value for this FieldMappingRow.
     * 
     * @return mappingOperation
     */
    public com.sforce.soap._2006._04.metadata.MappingOperation getMappingOperation() {
        return mappingOperation;
    }


    /**
     * Sets the mappingOperation value for this FieldMappingRow.
     * 
     * @param mappingOperation
     */
    public void setMappingOperation(com.sforce.soap._2006._04.metadata.MappingOperation mappingOperation) {
        this.mappingOperation = mappingOperation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldMappingRow)) return false;
        FieldMappingRow other = (FieldMappingRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SObjectType==null && other.getSObjectType()==null) || 
             (this.SObjectType!=null &&
              this.SObjectType.equals(other.getSObjectType()))) &&
            ((this.fieldMappingFields==null && other.getFieldMappingFields()==null) || 
             (this.fieldMappingFields!=null &&
              java.util.Arrays.equals(this.fieldMappingFields, other.getFieldMappingFields()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.mappingOperation==null && other.getMappingOperation()==null) || 
             (this.mappingOperation!=null &&
              this.mappingOperation.equals(other.getMappingOperation())));
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
        if (getSObjectType() != null) {
            _hashCode += getSObjectType().hashCode();
        }
        if (getFieldMappingFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldMappingFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldMappingFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getMappingOperation() != null) {
            _hashCode += getMappingOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldMappingRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldMappingRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMappingFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldMappingFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldMappingField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mappingOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MappingOperation"));
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
