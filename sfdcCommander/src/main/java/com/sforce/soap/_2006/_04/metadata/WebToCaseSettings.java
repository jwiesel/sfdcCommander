/**
 * WebToCaseSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WebToCaseSettings  implements java.io.Serializable {
    private java.lang.String caseOrigin;

    private java.lang.String defaultResponseTemplate;

    private java.lang.Boolean enableWebToCase;

    public WebToCaseSettings() {
    }

    public WebToCaseSettings(
           java.lang.String caseOrigin,
           java.lang.String defaultResponseTemplate,
           java.lang.Boolean enableWebToCase) {
           this.caseOrigin = caseOrigin;
           this.defaultResponseTemplate = defaultResponseTemplate;
           this.enableWebToCase = enableWebToCase;
    }


    /**
     * Gets the caseOrigin value for this WebToCaseSettings.
     * 
     * @return caseOrigin
     */
    public java.lang.String getCaseOrigin() {
        return caseOrigin;
    }


    /**
     * Sets the caseOrigin value for this WebToCaseSettings.
     * 
     * @param caseOrigin
     */
    public void setCaseOrigin(java.lang.String caseOrigin) {
        this.caseOrigin = caseOrigin;
    }


    /**
     * Gets the defaultResponseTemplate value for this WebToCaseSettings.
     * 
     * @return defaultResponseTemplate
     */
    public java.lang.String getDefaultResponseTemplate() {
        return defaultResponseTemplate;
    }


    /**
     * Sets the defaultResponseTemplate value for this WebToCaseSettings.
     * 
     * @param defaultResponseTemplate
     */
    public void setDefaultResponseTemplate(java.lang.String defaultResponseTemplate) {
        this.defaultResponseTemplate = defaultResponseTemplate;
    }


    /**
     * Gets the enableWebToCase value for this WebToCaseSettings.
     * 
     * @return enableWebToCase
     */
    public java.lang.Boolean getEnableWebToCase() {
        return enableWebToCase;
    }


    /**
     * Sets the enableWebToCase value for this WebToCaseSettings.
     * 
     * @param enableWebToCase
     */
    public void setEnableWebToCase(java.lang.Boolean enableWebToCase) {
        this.enableWebToCase = enableWebToCase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebToCaseSettings)) return false;
        WebToCaseSettings other = (WebToCaseSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseOrigin==null && other.getCaseOrigin()==null) || 
             (this.caseOrigin!=null &&
              this.caseOrigin.equals(other.getCaseOrigin()))) &&
            ((this.defaultResponseTemplate==null && other.getDefaultResponseTemplate()==null) || 
             (this.defaultResponseTemplate!=null &&
              this.defaultResponseTemplate.equals(other.getDefaultResponseTemplate()))) &&
            ((this.enableWebToCase==null && other.getEnableWebToCase()==null) || 
             (this.enableWebToCase!=null &&
              this.enableWebToCase.equals(other.getEnableWebToCase())));
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
        if (getCaseOrigin() != null) {
            _hashCode += getCaseOrigin().hashCode();
        }
        if (getDefaultResponseTemplate() != null) {
            _hashCode += getDefaultResponseTemplate().hashCode();
        }
        if (getEnableWebToCase() != null) {
            _hashCode += getEnableWebToCase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebToCaseSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebToCaseSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultResponseTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultResponseTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableWebToCase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableWebToCase"));
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
