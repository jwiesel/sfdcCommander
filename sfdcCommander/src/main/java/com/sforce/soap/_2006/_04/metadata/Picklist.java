/**
 * Picklist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Picklist  implements java.io.Serializable {
    private java.lang.String controllingField;

    private com.sforce.soap._2006._04.metadata.PicklistValue[] picklistValues;

    private boolean sorted;

    public Picklist() {
    }

    public Picklist(
           java.lang.String controllingField,
           com.sforce.soap._2006._04.metadata.PicklistValue[] picklistValues,
           boolean sorted) {
           this.controllingField = controllingField;
           this.picklistValues = picklistValues;
           this.sorted = sorted;
    }


    /**
     * Gets the controllingField value for this Picklist.
     * 
     * @return controllingField
     */
    public java.lang.String getControllingField() {
        return controllingField;
    }


    /**
     * Sets the controllingField value for this Picklist.
     * 
     * @param controllingField
     */
    public void setControllingField(java.lang.String controllingField) {
        this.controllingField = controllingField;
    }


    /**
     * Gets the picklistValues value for this Picklist.
     * 
     * @return picklistValues
     */
    public com.sforce.soap._2006._04.metadata.PicklistValue[] getPicklistValues() {
        return picklistValues;
    }


    /**
     * Sets the picklistValues value for this Picklist.
     * 
     * @param picklistValues
     */
    public void setPicklistValues(com.sforce.soap._2006._04.metadata.PicklistValue[] picklistValues) {
        this.picklistValues = picklistValues;
    }

    public com.sforce.soap._2006._04.metadata.PicklistValue getPicklistValues(int i) {
        return this.picklistValues[i];
    }

    public void setPicklistValues(int i, com.sforce.soap._2006._04.metadata.PicklistValue _value) {
        this.picklistValues[i] = _value;
    }


    /**
     * Gets the sorted value for this Picklist.
     * 
     * @return sorted
     */
    public boolean isSorted() {
        return sorted;
    }


    /**
     * Sets the sorted value for this Picklist.
     * 
     * @param sorted
     */
    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Picklist)) return false;
        Picklist other = (Picklist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.controllingField==null && other.getControllingField()==null) || 
             (this.controllingField!=null &&
              this.controllingField.equals(other.getControllingField()))) &&
            ((this.picklistValues==null && other.getPicklistValues()==null) || 
             (this.picklistValues!=null &&
              java.util.Arrays.equals(this.picklistValues, other.getPicklistValues()))) &&
            this.sorted == other.isSorted();
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
        if (getControllingField() != null) {
            _hashCode += getControllingField().hashCode();
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
        _hashCode += (isSorted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Picklist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Picklist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllingField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "controllingField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklistValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PicklistValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sorted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sorted"));
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
