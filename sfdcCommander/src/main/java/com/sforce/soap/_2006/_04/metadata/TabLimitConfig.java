/**
 * TabLimitConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class TabLimitConfig  implements java.io.Serializable {
    private java.lang.String maxNumberOfPrimaryTabs;

    private java.lang.String maxNumberOfSubTabs;

    public TabLimitConfig() {
    }

    public TabLimitConfig(
           java.lang.String maxNumberOfPrimaryTabs,
           java.lang.String maxNumberOfSubTabs) {
           this.maxNumberOfPrimaryTabs = maxNumberOfPrimaryTabs;
           this.maxNumberOfSubTabs = maxNumberOfSubTabs;
    }


    /**
     * Gets the maxNumberOfPrimaryTabs value for this TabLimitConfig.
     * 
     * @return maxNumberOfPrimaryTabs
     */
    public java.lang.String getMaxNumberOfPrimaryTabs() {
        return maxNumberOfPrimaryTabs;
    }


    /**
     * Sets the maxNumberOfPrimaryTabs value for this TabLimitConfig.
     * 
     * @param maxNumberOfPrimaryTabs
     */
    public void setMaxNumberOfPrimaryTabs(java.lang.String maxNumberOfPrimaryTabs) {
        this.maxNumberOfPrimaryTabs = maxNumberOfPrimaryTabs;
    }


    /**
     * Gets the maxNumberOfSubTabs value for this TabLimitConfig.
     * 
     * @return maxNumberOfSubTabs
     */
    public java.lang.String getMaxNumberOfSubTabs() {
        return maxNumberOfSubTabs;
    }


    /**
     * Sets the maxNumberOfSubTabs value for this TabLimitConfig.
     * 
     * @param maxNumberOfSubTabs
     */
    public void setMaxNumberOfSubTabs(java.lang.String maxNumberOfSubTabs) {
        this.maxNumberOfSubTabs = maxNumberOfSubTabs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TabLimitConfig)) return false;
        TabLimitConfig other = (TabLimitConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxNumberOfPrimaryTabs==null && other.getMaxNumberOfPrimaryTabs()==null) || 
             (this.maxNumberOfPrimaryTabs!=null &&
              this.maxNumberOfPrimaryTabs.equals(other.getMaxNumberOfPrimaryTabs()))) &&
            ((this.maxNumberOfSubTabs==null && other.getMaxNumberOfSubTabs()==null) || 
             (this.maxNumberOfSubTabs!=null &&
              this.maxNumberOfSubTabs.equals(other.getMaxNumberOfSubTabs())));
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
        if (getMaxNumberOfPrimaryTabs() != null) {
            _hashCode += getMaxNumberOfPrimaryTabs().hashCode();
        }
        if (getMaxNumberOfSubTabs() != null) {
            _hashCode += getMaxNumberOfSubTabs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TabLimitConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TabLimitConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfPrimaryTabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "maxNumberOfPrimaryTabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfSubTabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "maxNumberOfSubTabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
