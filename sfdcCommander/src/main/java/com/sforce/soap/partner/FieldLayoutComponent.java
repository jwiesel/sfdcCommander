/**
 * FieldLayoutComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class FieldLayoutComponent  extends com.sforce.soap.partner.DescribeLayoutComponent  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeLayoutComponent[] components;

    private com.sforce.soap.partner.FieldType fieldType;

    public FieldLayoutComponent() {
    }

    public FieldLayoutComponent(
           int displayLines,
           int tabOrder,
           com.sforce.soap.partner.LayoutComponentType type,
           java.lang.String value,
           com.sforce.soap.partner.DescribeLayoutComponent[] components,
           com.sforce.soap.partner.FieldType fieldType) {
        super(
            displayLines,
            tabOrder,
            type,
            value);
        this.components = components;
        this.fieldType = fieldType;
    }


    /**
     * Gets the components value for this FieldLayoutComponent.
     * 
     * @return components
     */
    public com.sforce.soap.partner.DescribeLayoutComponent[] getComponents() {
        return components;
    }


    /**
     * Sets the components value for this FieldLayoutComponent.
     * 
     * @param components
     */
    public void setComponents(com.sforce.soap.partner.DescribeLayoutComponent[] components) {
        this.components = components;
    }

    public com.sforce.soap.partner.DescribeLayoutComponent getComponents(int i) {
        return this.components[i];
    }

    public void setComponents(int i, com.sforce.soap.partner.DescribeLayoutComponent _value) {
        this.components[i] = _value;
    }


    /**
     * Gets the fieldType value for this FieldLayoutComponent.
     * 
     * @return fieldType
     */
    public com.sforce.soap.partner.FieldType getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this FieldLayoutComponent.
     * 
     * @param fieldType
     */
    public void setFieldType(com.sforce.soap.partner.FieldType fieldType) {
        this.fieldType = fieldType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldLayoutComponent)) return false;
        FieldLayoutComponent other = (FieldLayoutComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.components==null && other.getComponents()==null) || 
             (this.components!=null &&
              java.util.Arrays.equals(this.components, other.getComponents()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType())));
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
        if (getComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldLayoutComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FieldLayoutComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("components");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "components"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldType"));
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
