/**
 * PicklistForRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class PicklistForRecordType  implements java.io.Serializable {
    private java.lang.String picklistName;

    private com.sforce.soap.partner.PicklistEntry[] picklistValues;

    public PicklistForRecordType() {
    }

    public PicklistForRecordType(
           java.lang.String picklistName,
           com.sforce.soap.partner.PicklistEntry[] picklistValues) {
           this.picklistName = picklistName;
           this.picklistValues = picklistValues;
    }


    /**
     * Gets the picklistName value for this PicklistForRecordType.
     * 
     * @return picklistName
     */
    public java.lang.String getPicklistName() {
        return picklistName;
    }


    /**
     * Sets the picklistName value for this PicklistForRecordType.
     * 
     * @param picklistName
     */
    public void setPicklistName(java.lang.String picklistName) {
        this.picklistName = picklistName;
    }


    /**
     * Gets the picklistValues value for this PicklistForRecordType.
     * 
     * @return picklistValues
     */
    public com.sforce.soap.partner.PicklistEntry[] getPicklistValues() {
        return picklistValues;
    }


    /**
     * Sets the picklistValues value for this PicklistForRecordType.
     * 
     * @param picklistValues
     */
    public void setPicklistValues(com.sforce.soap.partner.PicklistEntry[] picklistValues) {
        this.picklistValues = picklistValues;
    }

    public com.sforce.soap.partner.PicklistEntry getPicklistValues(int i) {
        return this.picklistValues[i];
    }

    public void setPicklistValues(int i, com.sforce.soap.partner.PicklistEntry _value) {
        this.picklistValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PicklistForRecordType)) return false;
        PicklistForRecordType other = (PicklistForRecordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.picklistName==null && other.getPicklistName()==null) || 
             (this.picklistName!=null &&
              this.picklistName.equals(other.getPicklistName()))) &&
            ((this.picklistValues==null && other.getPicklistValues()==null) || 
             (this.picklistValues!=null &&
              java.util.Arrays.equals(this.picklistValues, other.getPicklistValues())));
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
        if (getPicklistName() != null) {
            _hashCode += getPicklistName().hashCode();
        }
        if (getPicklistValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicklistValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicklistValues(), i);
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
        new org.apache.axis.description.TypeDesc(PicklistForRecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PicklistForRecordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "picklistName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "picklistValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PicklistEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
