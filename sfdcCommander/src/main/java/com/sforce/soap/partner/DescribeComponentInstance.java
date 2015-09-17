/**
 * DescribeComponentInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeComponentInstance  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeComponentInstanceProperty[] properties;

    private java.lang.String typeName;

    private java.lang.String typeNamespace;

    public DescribeComponentInstance() {
    }

    public DescribeComponentInstance(
           com.sforce.soap.partner.DescribeComponentInstanceProperty[] properties,
           java.lang.String typeName,
           java.lang.String typeNamespace) {
           this.properties = properties;
           this.typeName = typeName;
           this.typeNamespace = typeNamespace;
    }


    /**
     * Gets the properties value for this DescribeComponentInstance.
     * 
     * @return properties
     */
    public com.sforce.soap.partner.DescribeComponentInstanceProperty[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this DescribeComponentInstance.
     * 
     * @param properties
     */
    public void setProperties(com.sforce.soap.partner.DescribeComponentInstanceProperty[] properties) {
        this.properties = properties;
    }

    public com.sforce.soap.partner.DescribeComponentInstanceProperty getProperties(int i) {
        return this.properties[i];
    }

    public void setProperties(int i, com.sforce.soap.partner.DescribeComponentInstanceProperty _value) {
        this.properties[i] = _value;
    }


    /**
     * Gets the typeName value for this DescribeComponentInstance.
     * 
     * @return typeName
     */
    public java.lang.String getTypeName() {
        return typeName;
    }


    /**
     * Sets the typeName value for this DescribeComponentInstance.
     * 
     * @param typeName
     */
    public void setTypeName(java.lang.String typeName) {
        this.typeName = typeName;
    }


    /**
     * Gets the typeNamespace value for this DescribeComponentInstance.
     * 
     * @return typeNamespace
     */
    public java.lang.String getTypeNamespace() {
        return typeNamespace;
    }


    /**
     * Sets the typeNamespace value for this DescribeComponentInstance.
     * 
     * @param typeNamespace
     */
    public void setTypeNamespace(java.lang.String typeNamespace) {
        this.typeNamespace = typeNamespace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeComponentInstance)) return false;
        DescribeComponentInstance other = (DescribeComponentInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.typeName==null && other.getTypeName()==null) || 
             (this.typeName!=null &&
              this.typeName.equals(other.getTypeName()))) &&
            ((this.typeNamespace==null && other.getTypeNamespace()==null) || 
             (this.typeNamespace!=null &&
              this.typeNamespace.equals(other.getTypeNamespace())));
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
        if (getProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTypeName() != null) {
            _hashCode += getTypeName().hashCode();
        }
        if (getTypeNamespace() != null) {
            _hashCode += getTypeNamespace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeComponentInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeComponentInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeComponentInstanceProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "typeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "typeNamespace"));
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
