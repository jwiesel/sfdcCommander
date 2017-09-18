/**
 * DescribeLayoutSaveOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeLayoutSaveOption  implements java.io.Serializable {
    private boolean defaultValue;

    private boolean isDisplayed;

    private java.lang.String label;

    private java.lang.String name;

    private java.lang.String restHeaderName;

    private java.lang.String soapHeaderName;

    public DescribeLayoutSaveOption() {
    }

    public DescribeLayoutSaveOption(
           boolean defaultValue,
           boolean isDisplayed,
           java.lang.String label,
           java.lang.String name,
           java.lang.String restHeaderName,
           java.lang.String soapHeaderName) {
           this.defaultValue = defaultValue;
           this.isDisplayed = isDisplayed;
           this.label = label;
           this.name = name;
           this.restHeaderName = restHeaderName;
           this.soapHeaderName = soapHeaderName;
    }


    /**
     * Gets the defaultValue value for this DescribeLayoutSaveOption.
     * 
     * @return defaultValue
     */
    public boolean isDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this DescribeLayoutSaveOption.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(boolean defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the isDisplayed value for this DescribeLayoutSaveOption.
     * 
     * @return isDisplayed
     */
    public boolean isIsDisplayed() {
        return isDisplayed;
    }


    /**
     * Sets the isDisplayed value for this DescribeLayoutSaveOption.
     * 
     * @param isDisplayed
     */
    public void setIsDisplayed(boolean isDisplayed) {
        this.isDisplayed = isDisplayed;
    }


    /**
     * Gets the label value for this DescribeLayoutSaveOption.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeLayoutSaveOption.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the name value for this DescribeLayoutSaveOption.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeLayoutSaveOption.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the restHeaderName value for this DescribeLayoutSaveOption.
     * 
     * @return restHeaderName
     */
    public java.lang.String getRestHeaderName() {
        return restHeaderName;
    }


    /**
     * Sets the restHeaderName value for this DescribeLayoutSaveOption.
     * 
     * @param restHeaderName
     */
    public void setRestHeaderName(java.lang.String restHeaderName) {
        this.restHeaderName = restHeaderName;
    }


    /**
     * Gets the soapHeaderName value for this DescribeLayoutSaveOption.
     * 
     * @return soapHeaderName
     */
    public java.lang.String getSoapHeaderName() {
        return soapHeaderName;
    }


    /**
     * Sets the soapHeaderName value for this DescribeLayoutSaveOption.
     * 
     * @param soapHeaderName
     */
    public void setSoapHeaderName(java.lang.String soapHeaderName) {
        this.soapHeaderName = soapHeaderName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeLayoutSaveOption)) return false;
        DescribeLayoutSaveOption other = (DescribeLayoutSaveOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.defaultValue == other.isDefaultValue() &&
            this.isDisplayed == other.isIsDisplayed() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.restHeaderName==null && other.getRestHeaderName()==null) || 
             (this.restHeaderName!=null &&
              this.restHeaderName.equals(other.getRestHeaderName()))) &&
            ((this.soapHeaderName==null && other.getSoapHeaderName()==null) || 
             (this.soapHeaderName!=null &&
              this.soapHeaderName.equals(other.getSoapHeaderName())));
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
        _hashCode += (isDefaultValue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDisplayed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRestHeaderName() != null) {
            _hashCode += getRestHeaderName().hashCode();
        }
        if (getSoapHeaderName() != null) {
            _hashCode += getSoapHeaderName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeLayoutSaveOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutSaveOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDisplayed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "isDisplayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restHeaderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "restHeaderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soapHeaderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "soapHeaderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
