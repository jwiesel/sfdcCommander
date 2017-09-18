/**
 * DescribeValueTypeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DescribeValueTypeResult  implements java.io.Serializable {
    private boolean apiCreatable;

    private boolean apiDeletable;

    private boolean apiReadable;

    private boolean apiUpdatable;

    private com.sforce.soap._2006._04.metadata.ValueTypeField parentField;

    private com.sforce.soap._2006._04.metadata.ValueTypeField[] valueTypeFields;

    public DescribeValueTypeResult() {
    }

    public DescribeValueTypeResult(
           boolean apiCreatable,
           boolean apiDeletable,
           boolean apiReadable,
           boolean apiUpdatable,
           com.sforce.soap._2006._04.metadata.ValueTypeField parentField,
           com.sforce.soap._2006._04.metadata.ValueTypeField[] valueTypeFields) {
           this.apiCreatable = apiCreatable;
           this.apiDeletable = apiDeletable;
           this.apiReadable = apiReadable;
           this.apiUpdatable = apiUpdatable;
           this.parentField = parentField;
           this.valueTypeFields = valueTypeFields;
    }


    /**
     * Gets the apiCreatable value for this DescribeValueTypeResult.
     * 
     * @return apiCreatable
     */
    public boolean isApiCreatable() {
        return apiCreatable;
    }


    /**
     * Sets the apiCreatable value for this DescribeValueTypeResult.
     * 
     * @param apiCreatable
     */
    public void setApiCreatable(boolean apiCreatable) {
        this.apiCreatable = apiCreatable;
    }


    /**
     * Gets the apiDeletable value for this DescribeValueTypeResult.
     * 
     * @return apiDeletable
     */
    public boolean isApiDeletable() {
        return apiDeletable;
    }


    /**
     * Sets the apiDeletable value for this DescribeValueTypeResult.
     * 
     * @param apiDeletable
     */
    public void setApiDeletable(boolean apiDeletable) {
        this.apiDeletable = apiDeletable;
    }


    /**
     * Gets the apiReadable value for this DescribeValueTypeResult.
     * 
     * @return apiReadable
     */
    public boolean isApiReadable() {
        return apiReadable;
    }


    /**
     * Sets the apiReadable value for this DescribeValueTypeResult.
     * 
     * @param apiReadable
     */
    public void setApiReadable(boolean apiReadable) {
        this.apiReadable = apiReadable;
    }


    /**
     * Gets the apiUpdatable value for this DescribeValueTypeResult.
     * 
     * @return apiUpdatable
     */
    public boolean isApiUpdatable() {
        return apiUpdatable;
    }


    /**
     * Sets the apiUpdatable value for this DescribeValueTypeResult.
     * 
     * @param apiUpdatable
     */
    public void setApiUpdatable(boolean apiUpdatable) {
        this.apiUpdatable = apiUpdatable;
    }


    /**
     * Gets the parentField value for this DescribeValueTypeResult.
     * 
     * @return parentField
     */
    public com.sforce.soap._2006._04.metadata.ValueTypeField getParentField() {
        return parentField;
    }


    /**
     * Sets the parentField value for this DescribeValueTypeResult.
     * 
     * @param parentField
     */
    public void setParentField(com.sforce.soap._2006._04.metadata.ValueTypeField parentField) {
        this.parentField = parentField;
    }


    /**
     * Gets the valueTypeFields value for this DescribeValueTypeResult.
     * 
     * @return valueTypeFields
     */
    public com.sforce.soap._2006._04.metadata.ValueTypeField[] getValueTypeFields() {
        return valueTypeFields;
    }


    /**
     * Sets the valueTypeFields value for this DescribeValueTypeResult.
     * 
     * @param valueTypeFields
     */
    public void setValueTypeFields(com.sforce.soap._2006._04.metadata.ValueTypeField[] valueTypeFields) {
        this.valueTypeFields = valueTypeFields;
    }

    public com.sforce.soap._2006._04.metadata.ValueTypeField getValueTypeFields(int i) {
        return this.valueTypeFields[i];
    }

    public void setValueTypeFields(int i, com.sforce.soap._2006._04.metadata.ValueTypeField _value) {
        this.valueTypeFields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeValueTypeResult)) return false;
        DescribeValueTypeResult other = (DescribeValueTypeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.apiCreatable == other.isApiCreatable() &&
            this.apiDeletable == other.isApiDeletable() &&
            this.apiReadable == other.isApiReadable() &&
            this.apiUpdatable == other.isApiUpdatable() &&
            ((this.parentField==null && other.getParentField()==null) || 
             (this.parentField!=null &&
              this.parentField.equals(other.getParentField()))) &&
            ((this.valueTypeFields==null && other.getValueTypeFields()==null) || 
             (this.valueTypeFields!=null &&
              java.util.Arrays.equals(this.valueTypeFields, other.getValueTypeFields())));
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
        _hashCode += (isApiCreatable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApiDeletable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApiReadable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApiUpdatable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getParentField() != null) {
            _hashCode += getParentField().hashCode();
        }
        if (getValueTypeFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueTypeFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueTypeFields(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeValueTypeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DescribeValueTypeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiCreatable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiCreatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiDeletable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiDeletable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiReadable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiReadable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiUpdatable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiUpdatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "parentField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueTypeField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueTypeFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueTypeFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueTypeField"));
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
