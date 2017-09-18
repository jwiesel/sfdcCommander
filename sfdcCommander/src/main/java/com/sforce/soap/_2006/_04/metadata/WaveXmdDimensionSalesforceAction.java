/**
 * WaveXmdDimensionSalesforceAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WaveXmdDimensionSalesforceAction  implements java.io.Serializable {
    private boolean enabled;

    private java.lang.String salesforceActionName;

    private int sortIndex;

    public WaveXmdDimensionSalesforceAction() {
    }

    public WaveXmdDimensionSalesforceAction(
           boolean enabled,
           java.lang.String salesforceActionName,
           int sortIndex) {
           this.enabled = enabled;
           this.salesforceActionName = salesforceActionName;
           this.sortIndex = sortIndex;
    }


    /**
     * Gets the enabled value for this WaveXmdDimensionSalesforceAction.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this WaveXmdDimensionSalesforceAction.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the salesforceActionName value for this WaveXmdDimensionSalesforceAction.
     * 
     * @return salesforceActionName
     */
    public java.lang.String getSalesforceActionName() {
        return salesforceActionName;
    }


    /**
     * Sets the salesforceActionName value for this WaveXmdDimensionSalesforceAction.
     * 
     * @param salesforceActionName
     */
    public void setSalesforceActionName(java.lang.String salesforceActionName) {
        this.salesforceActionName = salesforceActionName;
    }


    /**
     * Gets the sortIndex value for this WaveXmdDimensionSalesforceAction.
     * 
     * @return sortIndex
     */
    public int getSortIndex() {
        return sortIndex;
    }


    /**
     * Sets the sortIndex value for this WaveXmdDimensionSalesforceAction.
     * 
     * @param sortIndex
     */
    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaveXmdDimensionSalesforceAction)) return false;
        WaveXmdDimensionSalesforceAction other = (WaveXmdDimensionSalesforceAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enabled == other.isEnabled() &&
            ((this.salesforceActionName==null && other.getSalesforceActionName()==null) || 
             (this.salesforceActionName!=null &&
              this.salesforceActionName.equals(other.getSalesforceActionName()))) &&
            this.sortIndex == other.getSortIndex();
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
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSalesforceActionName() != null) {
            _hashCode += getSalesforceActionName().hashCode();
        }
        _hashCode += getSortIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaveXmdDimensionSalesforceAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdDimensionSalesforceAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceActionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "salesforceActionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
