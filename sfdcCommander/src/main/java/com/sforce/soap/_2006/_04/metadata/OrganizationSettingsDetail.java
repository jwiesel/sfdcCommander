/**
 * OrganizationSettingsDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class OrganizationSettingsDetail  implements java.io.Serializable {
    private java.lang.String settingName;

    private boolean settingValue;

    public OrganizationSettingsDetail() {
    }

    public OrganizationSettingsDetail(
           java.lang.String settingName,
           boolean settingValue) {
           this.settingName = settingName;
           this.settingValue = settingValue;
    }


    /**
     * Gets the settingName value for this OrganizationSettingsDetail.
     * 
     * @return settingName
     */
    public java.lang.String getSettingName() {
        return settingName;
    }


    /**
     * Sets the settingName value for this OrganizationSettingsDetail.
     * 
     * @param settingName
     */
    public void setSettingName(java.lang.String settingName) {
        this.settingName = settingName;
    }


    /**
     * Gets the settingValue value for this OrganizationSettingsDetail.
     * 
     * @return settingValue
     */
    public boolean isSettingValue() {
        return settingValue;
    }


    /**
     * Sets the settingValue value for this OrganizationSettingsDetail.
     * 
     * @param settingValue
     */
    public void setSettingValue(boolean settingValue) {
        this.settingValue = settingValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationSettingsDetail)) return false;
        OrganizationSettingsDetail other = (OrganizationSettingsDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.settingName==null && other.getSettingName()==null) || 
             (this.settingName!=null &&
              this.settingName.equals(other.getSettingName()))) &&
            this.settingValue == other.isSettingValue();
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
        if (getSettingName() != null) {
            _hashCode += getSettingName().hashCode();
        }
        _hashCode += (isSettingValue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationSettingsDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OrganizationSettingsDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "settingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "settingValue"));
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
