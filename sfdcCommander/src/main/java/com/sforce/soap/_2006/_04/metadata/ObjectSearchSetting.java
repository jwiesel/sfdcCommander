/**
 * ObjectSearchSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ObjectSearchSetting  implements java.io.Serializable {
    private boolean enhancedLookupEnabled;

    private boolean lookupAutoCompleteEnabled;

    private java.lang.String name;

    private int resultsPerPageCount;

    public ObjectSearchSetting() {
    }

    public ObjectSearchSetting(
           boolean enhancedLookupEnabled,
           boolean lookupAutoCompleteEnabled,
           java.lang.String name,
           int resultsPerPageCount) {
           this.enhancedLookupEnabled = enhancedLookupEnabled;
           this.lookupAutoCompleteEnabled = lookupAutoCompleteEnabled;
           this.name = name;
           this.resultsPerPageCount = resultsPerPageCount;
    }


    /**
     * Gets the enhancedLookupEnabled value for this ObjectSearchSetting.
     * 
     * @return enhancedLookupEnabled
     */
    public boolean isEnhancedLookupEnabled() {
        return enhancedLookupEnabled;
    }


    /**
     * Sets the enhancedLookupEnabled value for this ObjectSearchSetting.
     * 
     * @param enhancedLookupEnabled
     */
    public void setEnhancedLookupEnabled(boolean enhancedLookupEnabled) {
        this.enhancedLookupEnabled = enhancedLookupEnabled;
    }


    /**
     * Gets the lookupAutoCompleteEnabled value for this ObjectSearchSetting.
     * 
     * @return lookupAutoCompleteEnabled
     */
    public boolean isLookupAutoCompleteEnabled() {
        return lookupAutoCompleteEnabled;
    }


    /**
     * Sets the lookupAutoCompleteEnabled value for this ObjectSearchSetting.
     * 
     * @param lookupAutoCompleteEnabled
     */
    public void setLookupAutoCompleteEnabled(boolean lookupAutoCompleteEnabled) {
        this.lookupAutoCompleteEnabled = lookupAutoCompleteEnabled;
    }


    /**
     * Gets the name value for this ObjectSearchSetting.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ObjectSearchSetting.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the resultsPerPageCount value for this ObjectSearchSetting.
     * 
     * @return resultsPerPageCount
     */
    public int getResultsPerPageCount() {
        return resultsPerPageCount;
    }


    /**
     * Sets the resultsPerPageCount value for this ObjectSearchSetting.
     * 
     * @param resultsPerPageCount
     */
    public void setResultsPerPageCount(int resultsPerPageCount) {
        this.resultsPerPageCount = resultsPerPageCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectSearchSetting)) return false;
        ObjectSearchSetting other = (ObjectSearchSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enhancedLookupEnabled == other.isEnhancedLookupEnabled() &&
            this.lookupAutoCompleteEnabled == other.isLookupAutoCompleteEnabled() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.resultsPerPageCount == other.getResultsPerPageCount();
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
        _hashCode += (isEnhancedLookupEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLookupAutoCompleteEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getResultsPerPageCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectSearchSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectSearchSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedLookupEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enhancedLookupEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookupAutoCompleteEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lookupAutoCompleteEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsPerPageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "resultsPerPageCount"));
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
