/**
 * PersonalJourneySettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PersonalJourneySettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean enableExactTargetForSalesforceApps;

    public PersonalJourneySettings() {
    }

    public PersonalJourneySettings(
           java.lang.String fullName,
           boolean enableExactTargetForSalesforceApps) {
        super(
            fullName);
        this.enableExactTargetForSalesforceApps = enableExactTargetForSalesforceApps;
    }


    /**
     * Gets the enableExactTargetForSalesforceApps value for this PersonalJourneySettings.
     * 
     * @return enableExactTargetForSalesforceApps
     */
    public boolean isEnableExactTargetForSalesforceApps() {
        return enableExactTargetForSalesforceApps;
    }


    /**
     * Sets the enableExactTargetForSalesforceApps value for this PersonalJourneySettings.
     * 
     * @param enableExactTargetForSalesforceApps
     */
    public void setEnableExactTargetForSalesforceApps(boolean enableExactTargetForSalesforceApps) {
        this.enableExactTargetForSalesforceApps = enableExactTargetForSalesforceApps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalJourneySettings)) return false;
        PersonalJourneySettings other = (PersonalJourneySettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.enableExactTargetForSalesforceApps == other.isEnableExactTargetForSalesforceApps();
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
        _hashCode += (isEnableExactTargetForSalesforceApps() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalJourneySettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PersonalJourneySettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableExactTargetForSalesforceApps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableExactTargetForSalesforceApps"));
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
