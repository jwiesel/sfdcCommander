/**
 * DescribeSearchScopeOrderResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeSearchScopeOrderResult  implements java.io.Serializable {
    private java.lang.String keyPrefix;

    private java.lang.String name;

    public DescribeSearchScopeOrderResult() {
    }

    public DescribeSearchScopeOrderResult(
           java.lang.String keyPrefix,
           java.lang.String name) {
           this.keyPrefix = keyPrefix;
           this.name = name;
    }


    /**
     * Gets the keyPrefix value for this DescribeSearchScopeOrderResult.
     * 
     * @return keyPrefix
     */
    public java.lang.String getKeyPrefix() {
        return keyPrefix;
    }


    /**
     * Sets the keyPrefix value for this DescribeSearchScopeOrderResult.
     * 
     * @param keyPrefix
     */
    public void setKeyPrefix(java.lang.String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }


    /**
     * Gets the name value for this DescribeSearchScopeOrderResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeSearchScopeOrderResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeSearchScopeOrderResult)) return false;
        DescribeSearchScopeOrderResult other = (DescribeSearchScopeOrderResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyPrefix==null && other.getKeyPrefix()==null) || 
             (this.keyPrefix!=null &&
              this.keyPrefix.equals(other.getKeyPrefix()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getKeyPrefix() != null) {
            _hashCode += getKeyPrefix().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeSearchScopeOrderResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchScopeOrderResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "keyPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
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
