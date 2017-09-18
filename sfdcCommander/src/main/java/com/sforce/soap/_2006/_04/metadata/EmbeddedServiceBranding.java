/**
 * EmbeddedServiceBranding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EmbeddedServiceBranding  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String contrastPrimaryColor;

    private java.lang.String embeddedServiceConfig;

    private java.lang.String font;

    private java.lang.String masterLabel;

    private java.lang.String navBarColor;

    private java.lang.String primaryColor;

    private java.lang.String secondaryColor;

    public EmbeddedServiceBranding() {
    }

    public EmbeddedServiceBranding(
           java.lang.String fullName,
           java.lang.String contrastPrimaryColor,
           java.lang.String embeddedServiceConfig,
           java.lang.String font,
           java.lang.String masterLabel,
           java.lang.String navBarColor,
           java.lang.String primaryColor,
           java.lang.String secondaryColor) {
        super(
            fullName);
        this.contrastPrimaryColor = contrastPrimaryColor;
        this.embeddedServiceConfig = embeddedServiceConfig;
        this.font = font;
        this.masterLabel = masterLabel;
        this.navBarColor = navBarColor;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }


    /**
     * Gets the contrastPrimaryColor value for this EmbeddedServiceBranding.
     * 
     * @return contrastPrimaryColor
     */
    public java.lang.String getContrastPrimaryColor() {
        return contrastPrimaryColor;
    }


    /**
     * Sets the contrastPrimaryColor value for this EmbeddedServiceBranding.
     * 
     * @param contrastPrimaryColor
     */
    public void setContrastPrimaryColor(java.lang.String contrastPrimaryColor) {
        this.contrastPrimaryColor = contrastPrimaryColor;
    }


    /**
     * Gets the embeddedServiceConfig value for this EmbeddedServiceBranding.
     * 
     * @return embeddedServiceConfig
     */
    public java.lang.String getEmbeddedServiceConfig() {
        return embeddedServiceConfig;
    }


    /**
     * Sets the embeddedServiceConfig value for this EmbeddedServiceBranding.
     * 
     * @param embeddedServiceConfig
     */
    public void setEmbeddedServiceConfig(java.lang.String embeddedServiceConfig) {
        this.embeddedServiceConfig = embeddedServiceConfig;
    }


    /**
     * Gets the font value for this EmbeddedServiceBranding.
     * 
     * @return font
     */
    public java.lang.String getFont() {
        return font;
    }


    /**
     * Sets the font value for this EmbeddedServiceBranding.
     * 
     * @param font
     */
    public void setFont(java.lang.String font) {
        this.font = font;
    }


    /**
     * Gets the masterLabel value for this EmbeddedServiceBranding.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this EmbeddedServiceBranding.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the navBarColor value for this EmbeddedServiceBranding.
     * 
     * @return navBarColor
     */
    public java.lang.String getNavBarColor() {
        return navBarColor;
    }


    /**
     * Sets the navBarColor value for this EmbeddedServiceBranding.
     * 
     * @param navBarColor
     */
    public void setNavBarColor(java.lang.String navBarColor) {
        this.navBarColor = navBarColor;
    }


    /**
     * Gets the primaryColor value for this EmbeddedServiceBranding.
     * 
     * @return primaryColor
     */
    public java.lang.String getPrimaryColor() {
        return primaryColor;
    }


    /**
     * Sets the primaryColor value for this EmbeddedServiceBranding.
     * 
     * @param primaryColor
     */
    public void setPrimaryColor(java.lang.String primaryColor) {
        this.primaryColor = primaryColor;
    }


    /**
     * Gets the secondaryColor value for this EmbeddedServiceBranding.
     * 
     * @return secondaryColor
     */
    public java.lang.String getSecondaryColor() {
        return secondaryColor;
    }


    /**
     * Sets the secondaryColor value for this EmbeddedServiceBranding.
     * 
     * @param secondaryColor
     */
    public void setSecondaryColor(java.lang.String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmbeddedServiceBranding)) return false;
        EmbeddedServiceBranding other = (EmbeddedServiceBranding) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contrastPrimaryColor==null && other.getContrastPrimaryColor()==null) || 
             (this.contrastPrimaryColor!=null &&
              this.contrastPrimaryColor.equals(other.getContrastPrimaryColor()))) &&
            ((this.embeddedServiceConfig==null && other.getEmbeddedServiceConfig()==null) || 
             (this.embeddedServiceConfig!=null &&
              this.embeddedServiceConfig.equals(other.getEmbeddedServiceConfig()))) &&
            ((this.font==null && other.getFont()==null) || 
             (this.font!=null &&
              this.font.equals(other.getFont()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.navBarColor==null && other.getNavBarColor()==null) || 
             (this.navBarColor!=null &&
              this.navBarColor.equals(other.getNavBarColor()))) &&
            ((this.primaryColor==null && other.getPrimaryColor()==null) || 
             (this.primaryColor!=null &&
              this.primaryColor.equals(other.getPrimaryColor()))) &&
            ((this.secondaryColor==null && other.getSecondaryColor()==null) || 
             (this.secondaryColor!=null &&
              this.secondaryColor.equals(other.getSecondaryColor())));
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
        if (getContrastPrimaryColor() != null) {
            _hashCode += getContrastPrimaryColor().hashCode();
        }
        if (getEmbeddedServiceConfig() != null) {
            _hashCode += getEmbeddedServiceConfig().hashCode();
        }
        if (getFont() != null) {
            _hashCode += getFont().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNavBarColor() != null) {
            _hashCode += getNavBarColor().hashCode();
        }
        if (getPrimaryColor() != null) {
            _hashCode += getPrimaryColor().hashCode();
        }
        if (getSecondaryColor() != null) {
            _hashCode += getSecondaryColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmbeddedServiceBranding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmbeddedServiceBranding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrastPrimaryColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "contrastPrimaryColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embeddedServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "embeddedServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("font");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "font"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("navBarColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "navBarColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "primaryColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "secondaryColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
