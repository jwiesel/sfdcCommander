/**
 * DashboardMobileSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardMobileSettings  implements java.io.Serializable {
    private java.lang.Boolean enableDashboardIPadApp;

    public DashboardMobileSettings() {
    }

    public DashboardMobileSettings(
           java.lang.Boolean enableDashboardIPadApp) {
           this.enableDashboardIPadApp = enableDashboardIPadApp;
    }


    /**
     * Gets the enableDashboardIPadApp value for this DashboardMobileSettings.
     * 
     * @return enableDashboardIPadApp
     */
    public java.lang.Boolean getEnableDashboardIPadApp() {
        return enableDashboardIPadApp;
    }


    /**
     * Sets the enableDashboardIPadApp value for this DashboardMobileSettings.
     * 
     * @param enableDashboardIPadApp
     */
    public void setEnableDashboardIPadApp(java.lang.Boolean enableDashboardIPadApp) {
        this.enableDashboardIPadApp = enableDashboardIPadApp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashboardMobileSettings)) return false;
        DashboardMobileSettings other = (DashboardMobileSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enableDashboardIPadApp==null && other.getEnableDashboardIPadApp()==null) || 
             (this.enableDashboardIPadApp!=null &&
              this.enableDashboardIPadApp.equals(other.getEnableDashboardIPadApp())));
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
        if (getEnableDashboardIPadApp() != null) {
            _hashCode += getEnableDashboardIPadApp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DashboardMobileSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardMobileSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableDashboardIPadApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableDashboardIPadApp"));
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
