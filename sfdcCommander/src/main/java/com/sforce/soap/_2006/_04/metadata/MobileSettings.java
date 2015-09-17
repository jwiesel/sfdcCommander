/**
 * MobileSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MobileSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ChatterMobileSettings chatterMobile;

    private com.sforce.soap._2006._04.metadata.DashboardMobileSettings dashboardMobile;

    private com.sforce.soap._2006._04.metadata.SFDCMobileSettings salesforceMobile;

    private com.sforce.soap._2006._04.metadata.TouchMobileSettings touchMobile;

    public MobileSettings() {
    }

    public MobileSettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ChatterMobileSettings chatterMobile,
           com.sforce.soap._2006._04.metadata.DashboardMobileSettings dashboardMobile,
           com.sforce.soap._2006._04.metadata.SFDCMobileSettings salesforceMobile,
           com.sforce.soap._2006._04.metadata.TouchMobileSettings touchMobile) {
        super(
            fullName);
        this.chatterMobile = chatterMobile;
        this.dashboardMobile = dashboardMobile;
        this.salesforceMobile = salesforceMobile;
        this.touchMobile = touchMobile;
    }


    /**
     * Gets the chatterMobile value for this MobileSettings.
     * 
     * @return chatterMobile
     */
    public com.sforce.soap._2006._04.metadata.ChatterMobileSettings getChatterMobile() {
        return chatterMobile;
    }


    /**
     * Sets the chatterMobile value for this MobileSettings.
     * 
     * @param chatterMobile
     */
    public void setChatterMobile(com.sforce.soap._2006._04.metadata.ChatterMobileSettings chatterMobile) {
        this.chatterMobile = chatterMobile;
    }


    /**
     * Gets the dashboardMobile value for this MobileSettings.
     * 
     * @return dashboardMobile
     */
    public com.sforce.soap._2006._04.metadata.DashboardMobileSettings getDashboardMobile() {
        return dashboardMobile;
    }


    /**
     * Sets the dashboardMobile value for this MobileSettings.
     * 
     * @param dashboardMobile
     */
    public void setDashboardMobile(com.sforce.soap._2006._04.metadata.DashboardMobileSettings dashboardMobile) {
        this.dashboardMobile = dashboardMobile;
    }


    /**
     * Gets the salesforceMobile value for this MobileSettings.
     * 
     * @return salesforceMobile
     */
    public com.sforce.soap._2006._04.metadata.SFDCMobileSettings getSalesforceMobile() {
        return salesforceMobile;
    }


    /**
     * Sets the salesforceMobile value for this MobileSettings.
     * 
     * @param salesforceMobile
     */
    public void setSalesforceMobile(com.sforce.soap._2006._04.metadata.SFDCMobileSettings salesforceMobile) {
        this.salesforceMobile = salesforceMobile;
    }


    /**
     * Gets the touchMobile value for this MobileSettings.
     * 
     * @return touchMobile
     */
    public com.sforce.soap._2006._04.metadata.TouchMobileSettings getTouchMobile() {
        return touchMobile;
    }


    /**
     * Sets the touchMobile value for this MobileSettings.
     * 
     * @param touchMobile
     */
    public void setTouchMobile(com.sforce.soap._2006._04.metadata.TouchMobileSettings touchMobile) {
        this.touchMobile = touchMobile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileSettings)) return false;
        MobileSettings other = (MobileSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chatterMobile==null && other.getChatterMobile()==null) || 
             (this.chatterMobile!=null &&
              this.chatterMobile.equals(other.getChatterMobile()))) &&
            ((this.dashboardMobile==null && other.getDashboardMobile()==null) || 
             (this.dashboardMobile!=null &&
              this.dashboardMobile.equals(other.getDashboardMobile()))) &&
            ((this.salesforceMobile==null && other.getSalesforceMobile()==null) || 
             (this.salesforceMobile!=null &&
              this.salesforceMobile.equals(other.getSalesforceMobile()))) &&
            ((this.touchMobile==null && other.getTouchMobile()==null) || 
             (this.touchMobile!=null &&
              this.touchMobile.equals(other.getTouchMobile())));
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
        if (getChatterMobile() != null) {
            _hashCode += getChatterMobile().hashCode();
        }
        if (getDashboardMobile() != null) {
            _hashCode += getDashboardMobile().hashCode();
        }
        if (getSalesforceMobile() != null) {
            _hashCode += getSalesforceMobile().hashCode();
        }
        if (getTouchMobile() != null) {
            _hashCode += getTouchMobile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MobileSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChatterMobileSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardMobileSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "salesforceMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SFDCMobileSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("touchMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "touchMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TouchMobileSettings"));
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
