/**
 * DisableFeedTrackingHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DisableFeedTrackingHeader  implements java.io.Serializable {
    private boolean disableFeedTracking;

    public DisableFeedTrackingHeader() {
    }

    public DisableFeedTrackingHeader(
           boolean disableFeedTracking) {
           this.disableFeedTracking = disableFeedTracking;
    }


    /**
     * Gets the disableFeedTracking value for this DisableFeedTrackingHeader.
     * 
     * @return disableFeedTracking
     */
    public boolean isDisableFeedTracking() {
        return disableFeedTracking;
    }


    /**
     * Sets the disableFeedTracking value for this DisableFeedTrackingHeader.
     * 
     * @param disableFeedTracking
     */
    public void setDisableFeedTracking(boolean disableFeedTracking) {
        this.disableFeedTracking = disableFeedTracking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisableFeedTrackingHeader)) return false;
        DisableFeedTrackingHeader other = (DisableFeedTrackingHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.disableFeedTracking == other.isDisableFeedTracking();
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
        _hashCode += (isDisableFeedTracking() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisableFeedTrackingHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">DisableFeedTrackingHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableFeedTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "disableFeedTracking"));
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
