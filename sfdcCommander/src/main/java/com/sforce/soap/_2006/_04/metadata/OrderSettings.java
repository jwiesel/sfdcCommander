/**
 * OrderSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class OrderSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean enableNegativeQuantity;

    private java.lang.Boolean enableOrders;

    private java.lang.Boolean enableReductionOrders;

    public OrderSettings() {
    }

    public OrderSettings(
           java.lang.String fullName,
           java.lang.Boolean enableNegativeQuantity,
           java.lang.Boolean enableOrders,
           java.lang.Boolean enableReductionOrders) {
        super(
            fullName);
        this.enableNegativeQuantity = enableNegativeQuantity;
        this.enableOrders = enableOrders;
        this.enableReductionOrders = enableReductionOrders;
    }


    /**
     * Gets the enableNegativeQuantity value for this OrderSettings.
     * 
     * @return enableNegativeQuantity
     */
    public java.lang.Boolean getEnableNegativeQuantity() {
        return enableNegativeQuantity;
    }


    /**
     * Sets the enableNegativeQuantity value for this OrderSettings.
     * 
     * @param enableNegativeQuantity
     */
    public void setEnableNegativeQuantity(java.lang.Boolean enableNegativeQuantity) {
        this.enableNegativeQuantity = enableNegativeQuantity;
    }


    /**
     * Gets the enableOrders value for this OrderSettings.
     * 
     * @return enableOrders
     */
    public java.lang.Boolean getEnableOrders() {
        return enableOrders;
    }


    /**
     * Sets the enableOrders value for this OrderSettings.
     * 
     * @param enableOrders
     */
    public void setEnableOrders(java.lang.Boolean enableOrders) {
        this.enableOrders = enableOrders;
    }


    /**
     * Gets the enableReductionOrders value for this OrderSettings.
     * 
     * @return enableReductionOrders
     */
    public java.lang.Boolean getEnableReductionOrders() {
        return enableReductionOrders;
    }


    /**
     * Sets the enableReductionOrders value for this OrderSettings.
     * 
     * @param enableReductionOrders
     */
    public void setEnableReductionOrders(java.lang.Boolean enableReductionOrders) {
        this.enableReductionOrders = enableReductionOrders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderSettings)) return false;
        OrderSettings other = (OrderSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enableNegativeQuantity==null && other.getEnableNegativeQuantity()==null) || 
             (this.enableNegativeQuantity!=null &&
              this.enableNegativeQuantity.equals(other.getEnableNegativeQuantity()))) &&
            ((this.enableOrders==null && other.getEnableOrders()==null) || 
             (this.enableOrders!=null &&
              this.enableOrders.equals(other.getEnableOrders()))) &&
            ((this.enableReductionOrders==null && other.getEnableReductionOrders()==null) || 
             (this.enableReductionOrders!=null &&
              this.enableReductionOrders.equals(other.getEnableReductionOrders())));
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
        if (getEnableNegativeQuantity() != null) {
            _hashCode += getEnableNegativeQuantity().hashCode();
        }
        if (getEnableOrders() != null) {
            _hashCode += getEnableOrders().hashCode();
        }
        if (getEnableReductionOrders() != null) {
            _hashCode += getEnableReductionOrders().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OrderSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableNegativeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableNegativeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableReductionOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableReductionOrders"));
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
