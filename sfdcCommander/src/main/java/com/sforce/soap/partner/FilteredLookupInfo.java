/**
 * FilteredLookupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class FilteredLookupInfo  implements java.io.Serializable {
    private java.lang.String[] controllingFields;

    private boolean dependent;

    private boolean optionalFilter;

    public FilteredLookupInfo() {
    }

    public FilteredLookupInfo(
           java.lang.String[] controllingFields,
           boolean dependent,
           boolean optionalFilter) {
           this.controllingFields = controllingFields;
           this.dependent = dependent;
           this.optionalFilter = optionalFilter;
    }


    /**
     * Gets the controllingFields value for this FilteredLookupInfo.
     * 
     * @return controllingFields
     */
    public java.lang.String[] getControllingFields() {
        return controllingFields;
    }


    /**
     * Sets the controllingFields value for this FilteredLookupInfo.
     * 
     * @param controllingFields
     */
    public void setControllingFields(java.lang.String[] controllingFields) {
        this.controllingFields = controllingFields;
    }

    public java.lang.String getControllingFields(int i) {
        return this.controllingFields[i];
    }

    public void setControllingFields(int i, java.lang.String _value) {
        this.controllingFields[i] = _value;
    }


    /**
     * Gets the dependent value for this FilteredLookupInfo.
     * 
     * @return dependent
     */
    public boolean isDependent() {
        return dependent;
    }


    /**
     * Sets the dependent value for this FilteredLookupInfo.
     * 
     * @param dependent
     */
    public void setDependent(boolean dependent) {
        this.dependent = dependent;
    }


    /**
     * Gets the optionalFilter value for this FilteredLookupInfo.
     * 
     * @return optionalFilter
     */
    public boolean isOptionalFilter() {
        return optionalFilter;
    }


    /**
     * Sets the optionalFilter value for this FilteredLookupInfo.
     * 
     * @param optionalFilter
     */
    public void setOptionalFilter(boolean optionalFilter) {
        this.optionalFilter = optionalFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilteredLookupInfo)) return false;
        FilteredLookupInfo other = (FilteredLookupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.controllingFields==null && other.getControllingFields()==null) || 
             (this.controllingFields!=null &&
              java.util.Arrays.equals(this.controllingFields, other.getControllingFields()))) &&
            this.dependent == other.isDependent() &&
            this.optionalFilter == other.isOptionalFilter();
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
        if (getControllingFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControllingFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControllingFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDependent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOptionalFilter() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilteredLookupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FilteredLookupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllingFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "controllingFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "dependent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "optionalFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
