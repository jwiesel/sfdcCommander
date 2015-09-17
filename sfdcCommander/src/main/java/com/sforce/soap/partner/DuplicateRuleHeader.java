/**
 * DuplicateRuleHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DuplicateRuleHeader  implements java.io.Serializable {
    private boolean allowSave;

    private boolean includeRecordDetails;

    private boolean runAsCurrentUser;

    public DuplicateRuleHeader() {
    }

    public DuplicateRuleHeader(
           boolean allowSave,
           boolean includeRecordDetails,
           boolean runAsCurrentUser) {
           this.allowSave = allowSave;
           this.includeRecordDetails = includeRecordDetails;
           this.runAsCurrentUser = runAsCurrentUser;
    }


    /**
     * Gets the allowSave value for this DuplicateRuleHeader.
     * 
     * @return allowSave
     */
    public boolean isAllowSave() {
        return allowSave;
    }


    /**
     * Sets the allowSave value for this DuplicateRuleHeader.
     * 
     * @param allowSave
     */
    public void setAllowSave(boolean allowSave) {
        this.allowSave = allowSave;
    }


    /**
     * Gets the includeRecordDetails value for this DuplicateRuleHeader.
     * 
     * @return includeRecordDetails
     */
    public boolean isIncludeRecordDetails() {
        return includeRecordDetails;
    }


    /**
     * Sets the includeRecordDetails value for this DuplicateRuleHeader.
     * 
     * @param includeRecordDetails
     */
    public void setIncludeRecordDetails(boolean includeRecordDetails) {
        this.includeRecordDetails = includeRecordDetails;
    }


    /**
     * Gets the runAsCurrentUser value for this DuplicateRuleHeader.
     * 
     * @return runAsCurrentUser
     */
    public boolean isRunAsCurrentUser() {
        return runAsCurrentUser;
    }


    /**
     * Sets the runAsCurrentUser value for this DuplicateRuleHeader.
     * 
     * @param runAsCurrentUser
     */
    public void setRunAsCurrentUser(boolean runAsCurrentUser) {
        this.runAsCurrentUser = runAsCurrentUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DuplicateRuleHeader)) return false;
        DuplicateRuleHeader other = (DuplicateRuleHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowSave == other.isAllowSave() &&
            this.includeRecordDetails == other.isIncludeRecordDetails() &&
            this.runAsCurrentUser == other.isRunAsCurrentUser();
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
        _hashCode += (isAllowSave() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeRecordDetails() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRunAsCurrentUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DuplicateRuleHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">DuplicateRuleHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowSave");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "allowSave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeRecordDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "includeRecordDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runAsCurrentUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "runAsCurrentUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
