/**
 * TouchMobileSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class TouchMobileSettings  implements java.io.Serializable {
    private java.lang.Boolean enableTouchAppIPad;

    private java.lang.Boolean enableTouchAppIPhone;

    private java.lang.Boolean enableTouchBrowserIPad;

    private java.lang.Boolean enableTouchIosPhone;

    private java.lang.Boolean enableVisualforceInTouch;

    public TouchMobileSettings() {
    }

    public TouchMobileSettings(
           java.lang.Boolean enableTouchAppIPad,
           java.lang.Boolean enableTouchAppIPhone,
           java.lang.Boolean enableTouchBrowserIPad,
           java.lang.Boolean enableTouchIosPhone,
           java.lang.Boolean enableVisualforceInTouch) {
           this.enableTouchAppIPad = enableTouchAppIPad;
           this.enableTouchAppIPhone = enableTouchAppIPhone;
           this.enableTouchBrowserIPad = enableTouchBrowserIPad;
           this.enableTouchIosPhone = enableTouchIosPhone;
           this.enableVisualforceInTouch = enableVisualforceInTouch;
    }


    /**
     * Gets the enableTouchAppIPad value for this TouchMobileSettings.
     * 
     * @return enableTouchAppIPad
     */
    public java.lang.Boolean getEnableTouchAppIPad() {
        return enableTouchAppIPad;
    }


    /**
     * Sets the enableTouchAppIPad value for this TouchMobileSettings.
     * 
     * @param enableTouchAppIPad
     */
    public void setEnableTouchAppIPad(java.lang.Boolean enableTouchAppIPad) {
        this.enableTouchAppIPad = enableTouchAppIPad;
    }


    /**
     * Gets the enableTouchAppIPhone value for this TouchMobileSettings.
     * 
     * @return enableTouchAppIPhone
     */
    public java.lang.Boolean getEnableTouchAppIPhone() {
        return enableTouchAppIPhone;
    }


    /**
     * Sets the enableTouchAppIPhone value for this TouchMobileSettings.
     * 
     * @param enableTouchAppIPhone
     */
    public void setEnableTouchAppIPhone(java.lang.Boolean enableTouchAppIPhone) {
        this.enableTouchAppIPhone = enableTouchAppIPhone;
    }


    /**
     * Gets the enableTouchBrowserIPad value for this TouchMobileSettings.
     * 
     * @return enableTouchBrowserIPad
     */
    public java.lang.Boolean getEnableTouchBrowserIPad() {
        return enableTouchBrowserIPad;
    }


    /**
     * Sets the enableTouchBrowserIPad value for this TouchMobileSettings.
     * 
     * @param enableTouchBrowserIPad
     */
    public void setEnableTouchBrowserIPad(java.lang.Boolean enableTouchBrowserIPad) {
        this.enableTouchBrowserIPad = enableTouchBrowserIPad;
    }


    /**
     * Gets the enableTouchIosPhone value for this TouchMobileSettings.
     * 
     * @return enableTouchIosPhone
     */
    public java.lang.Boolean getEnableTouchIosPhone() {
        return enableTouchIosPhone;
    }


    /**
     * Sets the enableTouchIosPhone value for this TouchMobileSettings.
     * 
     * @param enableTouchIosPhone
     */
    public void setEnableTouchIosPhone(java.lang.Boolean enableTouchIosPhone) {
        this.enableTouchIosPhone = enableTouchIosPhone;
    }


    /**
     * Gets the enableVisualforceInTouch value for this TouchMobileSettings.
     * 
     * @return enableVisualforceInTouch
     */
    public java.lang.Boolean getEnableVisualforceInTouch() {
        return enableVisualforceInTouch;
    }


    /**
     * Sets the enableVisualforceInTouch value for this TouchMobileSettings.
     * 
     * @param enableVisualforceInTouch
     */
    public void setEnableVisualforceInTouch(java.lang.Boolean enableVisualforceInTouch) {
        this.enableVisualforceInTouch = enableVisualforceInTouch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TouchMobileSettings)) return false;
        TouchMobileSettings other = (TouchMobileSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enableTouchAppIPad==null && other.getEnableTouchAppIPad()==null) || 
             (this.enableTouchAppIPad!=null &&
              this.enableTouchAppIPad.equals(other.getEnableTouchAppIPad()))) &&
            ((this.enableTouchAppIPhone==null && other.getEnableTouchAppIPhone()==null) || 
             (this.enableTouchAppIPhone!=null &&
              this.enableTouchAppIPhone.equals(other.getEnableTouchAppIPhone()))) &&
            ((this.enableTouchBrowserIPad==null && other.getEnableTouchBrowserIPad()==null) || 
             (this.enableTouchBrowserIPad!=null &&
              this.enableTouchBrowserIPad.equals(other.getEnableTouchBrowserIPad()))) &&
            ((this.enableTouchIosPhone==null && other.getEnableTouchIosPhone()==null) || 
             (this.enableTouchIosPhone!=null &&
              this.enableTouchIosPhone.equals(other.getEnableTouchIosPhone()))) &&
            ((this.enableVisualforceInTouch==null && other.getEnableVisualforceInTouch()==null) || 
             (this.enableVisualforceInTouch!=null &&
              this.enableVisualforceInTouch.equals(other.getEnableVisualforceInTouch())));
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
        if (getEnableTouchAppIPad() != null) {
            _hashCode += getEnableTouchAppIPad().hashCode();
        }
        if (getEnableTouchAppIPhone() != null) {
            _hashCode += getEnableTouchAppIPhone().hashCode();
        }
        if (getEnableTouchBrowserIPad() != null) {
            _hashCode += getEnableTouchBrowserIPad().hashCode();
        }
        if (getEnableTouchIosPhone() != null) {
            _hashCode += getEnableTouchIosPhone().hashCode();
        }
        if (getEnableVisualforceInTouch() != null) {
            _hashCode += getEnableVisualforceInTouch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TouchMobileSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TouchMobileSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableTouchAppIPad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableTouchAppIPad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableTouchAppIPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableTouchAppIPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableTouchBrowserIPad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableTouchBrowserIPad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableTouchIosPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableTouchIosPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableVisualforceInTouch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableVisualforceInTouch"));
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
