/**
 * SearchLayoutFieldsDisplayed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SearchLayoutFieldsDisplayed  implements java.io.Serializable {
    private boolean applicable;

    private com.sforce.soap.partner.SearchLayoutField[] fields;

    public SearchLayoutFieldsDisplayed() {
    }

    public SearchLayoutFieldsDisplayed(
           boolean applicable,
           com.sforce.soap.partner.SearchLayoutField[] fields) {
           this.applicable = applicable;
           this.fields = fields;
    }


    /**
     * Gets the applicable value for this SearchLayoutFieldsDisplayed.
     * 
     * @return applicable
     */
    public boolean isApplicable() {
        return applicable;
    }


    /**
     * Sets the applicable value for this SearchLayoutFieldsDisplayed.
     * 
     * @param applicable
     */
    public void setApplicable(boolean applicable) {
        this.applicable = applicable;
    }


    /**
     * Gets the fields value for this SearchLayoutFieldsDisplayed.
     * 
     * @return fields
     */
    public com.sforce.soap.partner.SearchLayoutField[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this SearchLayoutFieldsDisplayed.
     * 
     * @param fields
     */
    public void setFields(com.sforce.soap.partner.SearchLayoutField[] fields) {
        this.fields = fields;
    }

    public com.sforce.soap.partner.SearchLayoutField getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.sforce.soap.partner.SearchLayoutField _value) {
        this.fields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchLayoutFieldsDisplayed)) return false;
        SearchLayoutFieldsDisplayed other = (SearchLayoutFieldsDisplayed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.applicable == other.isApplicable() &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields())));
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
        _hashCode += (isApplicable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchLayoutFieldsDisplayed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchLayoutFieldsDisplayed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "applicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchLayoutField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
