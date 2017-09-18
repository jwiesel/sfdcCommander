/**
 * AppBrand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AppBrand  implements java.io.Serializable {
    private java.lang.String footerColor;

    private java.lang.String headerColor;

    private java.lang.String logo;

    private java.lang.Integer logoVersion;

    public AppBrand() {
    }

    public AppBrand(
           java.lang.String footerColor,
           java.lang.String headerColor,
           java.lang.String logo,
           java.lang.Integer logoVersion) {
           this.footerColor = footerColor;
           this.headerColor = headerColor;
           this.logo = logo;
           this.logoVersion = logoVersion;
    }


    /**
     * Gets the footerColor value for this AppBrand.
     * 
     * @return footerColor
     */
    public java.lang.String getFooterColor() {
        return footerColor;
    }


    /**
     * Sets the footerColor value for this AppBrand.
     * 
     * @param footerColor
     */
    public void setFooterColor(java.lang.String footerColor) {
        this.footerColor = footerColor;
    }


    /**
     * Gets the headerColor value for this AppBrand.
     * 
     * @return headerColor
     */
    public java.lang.String getHeaderColor() {
        return headerColor;
    }


    /**
     * Sets the headerColor value for this AppBrand.
     * 
     * @param headerColor
     */
    public void setHeaderColor(java.lang.String headerColor) {
        this.headerColor = headerColor;
    }


    /**
     * Gets the logo value for this AppBrand.
     * 
     * @return logo
     */
    public java.lang.String getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this AppBrand.
     * 
     * @param logo
     */
    public void setLogo(java.lang.String logo) {
        this.logo = logo;
    }


    /**
     * Gets the logoVersion value for this AppBrand.
     * 
     * @return logoVersion
     */
    public java.lang.Integer getLogoVersion() {
        return logoVersion;
    }


    /**
     * Sets the logoVersion value for this AppBrand.
     * 
     * @param logoVersion
     */
    public void setLogoVersion(java.lang.Integer logoVersion) {
        this.logoVersion = logoVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppBrand)) return false;
        AppBrand other = (AppBrand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.footerColor==null && other.getFooterColor()==null) || 
             (this.footerColor!=null &&
              this.footerColor.equals(other.getFooterColor()))) &&
            ((this.headerColor==null && other.getHeaderColor()==null) || 
             (this.headerColor!=null &&
              this.headerColor.equals(other.getHeaderColor()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.logoVersion==null && other.getLogoVersion()==null) || 
             (this.logoVersion!=null &&
              this.logoVersion.equals(other.getLogoVersion())));
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
        if (getFooterColor() != null) {
            _hashCode += getFooterColor().hashCode();
        }
        if (getHeaderColor() != null) {
            _hashCode += getHeaderColor().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getLogoVersion() != null) {
            _hashCode += getLogoVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppBrand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AppBrand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footerColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "footerColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "headerColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logoVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
