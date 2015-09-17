/**
 * ProductSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ProductSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean enableCascadeActivateToRelatedPrices;

    private java.lang.Boolean enableQuantitySchedule;

    private java.lang.Boolean enableRevenueSchedule;

    public ProductSettings() {
    }

    public ProductSettings(
           java.lang.String fullName,
           java.lang.Boolean enableCascadeActivateToRelatedPrices,
           java.lang.Boolean enableQuantitySchedule,
           java.lang.Boolean enableRevenueSchedule) {
        super(
            fullName);
        this.enableCascadeActivateToRelatedPrices = enableCascadeActivateToRelatedPrices;
        this.enableQuantitySchedule = enableQuantitySchedule;
        this.enableRevenueSchedule = enableRevenueSchedule;
    }


    /**
     * Gets the enableCascadeActivateToRelatedPrices value for this ProductSettings.
     * 
     * @return enableCascadeActivateToRelatedPrices
     */
    public java.lang.Boolean getEnableCascadeActivateToRelatedPrices() {
        return enableCascadeActivateToRelatedPrices;
    }


    /**
     * Sets the enableCascadeActivateToRelatedPrices value for this ProductSettings.
     * 
     * @param enableCascadeActivateToRelatedPrices
     */
    public void setEnableCascadeActivateToRelatedPrices(java.lang.Boolean enableCascadeActivateToRelatedPrices) {
        this.enableCascadeActivateToRelatedPrices = enableCascadeActivateToRelatedPrices;
    }


    /**
     * Gets the enableQuantitySchedule value for this ProductSettings.
     * 
     * @return enableQuantitySchedule
     */
    public java.lang.Boolean getEnableQuantitySchedule() {
        return enableQuantitySchedule;
    }


    /**
     * Sets the enableQuantitySchedule value for this ProductSettings.
     * 
     * @param enableQuantitySchedule
     */
    public void setEnableQuantitySchedule(java.lang.Boolean enableQuantitySchedule) {
        this.enableQuantitySchedule = enableQuantitySchedule;
    }


    /**
     * Gets the enableRevenueSchedule value for this ProductSettings.
     * 
     * @return enableRevenueSchedule
     */
    public java.lang.Boolean getEnableRevenueSchedule() {
        return enableRevenueSchedule;
    }


    /**
     * Sets the enableRevenueSchedule value for this ProductSettings.
     * 
     * @param enableRevenueSchedule
     */
    public void setEnableRevenueSchedule(java.lang.Boolean enableRevenueSchedule) {
        this.enableRevenueSchedule = enableRevenueSchedule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSettings)) return false;
        ProductSettings other = (ProductSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enableCascadeActivateToRelatedPrices==null && other.getEnableCascadeActivateToRelatedPrices()==null) || 
             (this.enableCascadeActivateToRelatedPrices!=null &&
              this.enableCascadeActivateToRelatedPrices.equals(other.getEnableCascadeActivateToRelatedPrices()))) &&
            ((this.enableQuantitySchedule==null && other.getEnableQuantitySchedule()==null) || 
             (this.enableQuantitySchedule!=null &&
              this.enableQuantitySchedule.equals(other.getEnableQuantitySchedule()))) &&
            ((this.enableRevenueSchedule==null && other.getEnableRevenueSchedule()==null) || 
             (this.enableRevenueSchedule!=null &&
              this.enableRevenueSchedule.equals(other.getEnableRevenueSchedule())));
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
        if (getEnableCascadeActivateToRelatedPrices() != null) {
            _hashCode += getEnableCascadeActivateToRelatedPrices().hashCode();
        }
        if (getEnableQuantitySchedule() != null) {
            _hashCode += getEnableQuantitySchedule().hashCode();
        }
        if (getEnableRevenueSchedule() != null) {
            _hashCode += getEnableRevenueSchedule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProductSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCascadeActivateToRelatedPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCascadeActivateToRelatedPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableQuantitySchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableQuantitySchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableRevenueSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableRevenueSchedule"));
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
