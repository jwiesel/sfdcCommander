/**
 * CommunityThemeSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CommunityThemeSetting  implements java.io.Serializable {
    private java.lang.String customThemeLayoutType;

    private java.lang.String themeLayout;

    private com.sforce.soap._2006._04.metadata.CommunityThemeLayoutType themeLayoutType;

    public CommunityThemeSetting() {
    }

    public CommunityThemeSetting(
           java.lang.String customThemeLayoutType,
           java.lang.String themeLayout,
           com.sforce.soap._2006._04.metadata.CommunityThemeLayoutType themeLayoutType) {
           this.customThemeLayoutType = customThemeLayoutType;
           this.themeLayout = themeLayout;
           this.themeLayoutType = themeLayoutType;
    }


    /**
     * Gets the customThemeLayoutType value for this CommunityThemeSetting.
     * 
     * @return customThemeLayoutType
     */
    public java.lang.String getCustomThemeLayoutType() {
        return customThemeLayoutType;
    }


    /**
     * Sets the customThemeLayoutType value for this CommunityThemeSetting.
     * 
     * @param customThemeLayoutType
     */
    public void setCustomThemeLayoutType(java.lang.String customThemeLayoutType) {
        this.customThemeLayoutType = customThemeLayoutType;
    }


    /**
     * Gets the themeLayout value for this CommunityThemeSetting.
     * 
     * @return themeLayout
     */
    public java.lang.String getThemeLayout() {
        return themeLayout;
    }


    /**
     * Sets the themeLayout value for this CommunityThemeSetting.
     * 
     * @param themeLayout
     */
    public void setThemeLayout(java.lang.String themeLayout) {
        this.themeLayout = themeLayout;
    }


    /**
     * Gets the themeLayoutType value for this CommunityThemeSetting.
     * 
     * @return themeLayoutType
     */
    public com.sforce.soap._2006._04.metadata.CommunityThemeLayoutType getThemeLayoutType() {
        return themeLayoutType;
    }


    /**
     * Sets the themeLayoutType value for this CommunityThemeSetting.
     * 
     * @param themeLayoutType
     */
    public void setThemeLayoutType(com.sforce.soap._2006._04.metadata.CommunityThemeLayoutType themeLayoutType) {
        this.themeLayoutType = themeLayoutType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunityThemeSetting)) return false;
        CommunityThemeSetting other = (CommunityThemeSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customThemeLayoutType==null && other.getCustomThemeLayoutType()==null) || 
             (this.customThemeLayoutType!=null &&
              this.customThemeLayoutType.equals(other.getCustomThemeLayoutType()))) &&
            ((this.themeLayout==null && other.getThemeLayout()==null) || 
             (this.themeLayout!=null &&
              this.themeLayout.equals(other.getThemeLayout()))) &&
            ((this.themeLayoutType==null && other.getThemeLayoutType()==null) || 
             (this.themeLayoutType!=null &&
              this.themeLayoutType.equals(other.getThemeLayoutType())));
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
        if (getCustomThemeLayoutType() != null) {
            _hashCode += getCustomThemeLayoutType().hashCode();
        }
        if (getThemeLayout() != null) {
            _hashCode += getThemeLayout().hashCode();
        }
        if (getThemeLayoutType() != null) {
            _hashCode += getThemeLayoutType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunityThemeSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityThemeSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customThemeLayoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customThemeLayoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "themeLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeLayoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "themeLayoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityThemeLayoutType"));
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
