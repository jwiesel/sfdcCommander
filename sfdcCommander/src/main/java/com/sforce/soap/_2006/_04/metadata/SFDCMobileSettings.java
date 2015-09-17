/**
 * SFDCMobileSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SFDCMobileSettings  implements java.io.Serializable {
    private java.lang.Boolean enableMobileLite;

    private java.lang.Boolean enableUserToDeviceLinking;

    public SFDCMobileSettings() {
    }

    public SFDCMobileSettings(
           java.lang.Boolean enableMobileLite,
           java.lang.Boolean enableUserToDeviceLinking) {
           this.enableMobileLite = enableMobileLite;
           this.enableUserToDeviceLinking = enableUserToDeviceLinking;
    }


    /**
     * Gets the enableMobileLite value for this SFDCMobileSettings.
     * 
     * @return enableMobileLite
     */
    public java.lang.Boolean getEnableMobileLite() {
        return enableMobileLite;
    }


    /**
     * Sets the enableMobileLite value for this SFDCMobileSettings.
     * 
     * @param enableMobileLite
     */
    public void setEnableMobileLite(java.lang.Boolean enableMobileLite) {
        this.enableMobileLite = enableMobileLite;
    }


    /**
     * Gets the enableUserToDeviceLinking value for this SFDCMobileSettings.
     * 
     * @return enableUserToDeviceLinking
     */
    public java.lang.Boolean getEnableUserToDeviceLinking() {
        return enableUserToDeviceLinking;
    }


    /**
     * Sets the enableUserToDeviceLinking value for this SFDCMobileSettings.
     * 
     * @param enableUserToDeviceLinking
     */
    public void setEnableUserToDeviceLinking(java.lang.Boolean enableUserToDeviceLinking) {
        this.enableUserToDeviceLinking = enableUserToDeviceLinking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SFDCMobileSettings)) return false;
        SFDCMobileSettings other = (SFDCMobileSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enableMobileLite==null && other.getEnableMobileLite()==null) || 
             (this.enableMobileLite!=null &&
              this.enableMobileLite.equals(other.getEnableMobileLite()))) &&
            ((this.enableUserToDeviceLinking==null && other.getEnableUserToDeviceLinking()==null) || 
             (this.enableUserToDeviceLinking!=null &&
              this.enableUserToDeviceLinking.equals(other.getEnableUserToDeviceLinking())));
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
        if (getEnableMobileLite() != null) {
            _hashCode += getEnableMobileLite().hashCode();
        }
        if (getEnableUserToDeviceLinking() != null) {
            _hashCode += getEnableUserToDeviceLinking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SFDCMobileSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SFDCMobileSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableMobileLite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableMobileLite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableUserToDeviceLinking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableUserToDeviceLinking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
