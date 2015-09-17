/**
 * DescribeGlobalTheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeGlobalTheme  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeGlobalResult global;

    private com.sforce.soap.partner.DescribeThemeItem[] theme;

    public DescribeGlobalTheme() {
    }

    public DescribeGlobalTheme(
           com.sforce.soap.partner.DescribeGlobalResult global,
           com.sforce.soap.partner.DescribeThemeItem[] theme) {
           this.global = global;
           this.theme = theme;
    }


    /**
     * Gets the global value for this DescribeGlobalTheme.
     * 
     * @return global
     */
    public com.sforce.soap.partner.DescribeGlobalResult getGlobal() {
        return global;
    }


    /**
     * Sets the global value for this DescribeGlobalTheme.
     * 
     * @param global
     */
    public void setGlobal(com.sforce.soap.partner.DescribeGlobalResult global) {
        this.global = global;
    }


    /**
     * Gets the theme value for this DescribeGlobalTheme.
     * 
     * @return theme
     */
    public com.sforce.soap.partner.DescribeThemeItem[] getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this DescribeGlobalTheme.
     * 
     * @param theme
     */
    public void setTheme(com.sforce.soap.partner.DescribeThemeItem[] theme) {
        this.theme = theme;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeGlobalTheme)) return false;
        DescribeGlobalTheme other = (DescribeGlobalTheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.global==null && other.getGlobal()==null) || 
             (this.global!=null &&
              this.global.equals(other.getGlobal()))) &&
            ((this.theme==null && other.getTheme()==null) || 
             (this.theme!=null &&
              java.util.Arrays.equals(this.theme, other.getTheme())));
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
        if (getGlobal() != null) {
            _hashCode += getGlobal().hashCode();
        }
        if (getTheme() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTheme());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTheme(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeGlobalTheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeGlobalTheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "global"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeGlobalResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "theme"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeThemeItem"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "themeItems"));
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
