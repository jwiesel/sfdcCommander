/**
 * DebuggingHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DebuggingHeader  implements java.io.Serializable {
    private com.sforce.soap.partner.LogInfo[] categories;

    private com.sforce.soap.partner.DebugLevel debugLevel;

    public DebuggingHeader() {
    }

    public DebuggingHeader(
           com.sforce.soap.partner.LogInfo[] categories,
           com.sforce.soap.partner.DebugLevel debugLevel) {
           this.categories = categories;
           this.debugLevel = debugLevel;
    }


    /**
     * Gets the categories value for this DebuggingHeader.
     * 
     * @return categories
     */
    public com.sforce.soap.partner.LogInfo[] getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this DebuggingHeader.
     * 
     * @param categories
     */
    public void setCategories(com.sforce.soap.partner.LogInfo[] categories) {
        this.categories = categories;
    }

    public com.sforce.soap.partner.LogInfo getCategories(int i) {
        return this.categories[i];
    }

    public void setCategories(int i, com.sforce.soap.partner.LogInfo _value) {
        this.categories[i] = _value;
    }


    /**
     * Gets the debugLevel value for this DebuggingHeader.
     * 
     * @return debugLevel
     */
    public com.sforce.soap.partner.DebugLevel getDebugLevel() {
        return debugLevel;
    }


    /**
     * Sets the debugLevel value for this DebuggingHeader.
     * 
     * @param debugLevel
     */
    public void setDebugLevel(com.sforce.soap.partner.DebugLevel debugLevel) {
        this.debugLevel = debugLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebuggingHeader)) return false;
        DebuggingHeader other = (DebuggingHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categories==null && other.getCategories()==null) || 
             (this.categories!=null &&
              java.util.Arrays.equals(this.categories, other.getCategories()))) &&
            ((this.debugLevel==null && other.getDebugLevel()==null) || 
             (this.debugLevel!=null &&
              this.debugLevel.equals(other.getDebugLevel())));
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
        if (getCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebugLevel() != null) {
            _hashCode += getDebugLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebuggingHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">DebuggingHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "categories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LogInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debugLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "debugLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DebugLevel"));
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
