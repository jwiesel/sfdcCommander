/**
 * ValueSetValuesDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ValueSetValuesDefinition  implements java.io.Serializable {
    private boolean sorted;

    private com.sforce.soap._2006._04.metadata.CustomValue[] value;

    public ValueSetValuesDefinition() {
    }

    public ValueSetValuesDefinition(
           boolean sorted,
           com.sforce.soap._2006._04.metadata.CustomValue[] value) {
           this.sorted = sorted;
           this.value = value;
    }


    /**
     * Gets the sorted value for this ValueSetValuesDefinition.
     * 
     * @return sorted
     */
    public boolean isSorted() {
        return sorted;
    }


    /**
     * Sets the sorted value for this ValueSetValuesDefinition.
     * 
     * @param sorted
     */
    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }


    /**
     * Gets the value value for this ValueSetValuesDefinition.
     * 
     * @return value
     */
    public com.sforce.soap._2006._04.metadata.CustomValue[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this ValueSetValuesDefinition.
     * 
     * @param value
     */
    public void setValue(com.sforce.soap._2006._04.metadata.CustomValue[] value) {
        this.value = value;
    }

    public com.sforce.soap._2006._04.metadata.CustomValue getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.sforce.soap._2006._04.metadata.CustomValue _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueSetValuesDefinition)) return false;
        ValueSetValuesDefinition other = (ValueSetValuesDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sorted == other.isSorted() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        _hashCode += (isSorted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(ValueSetValuesDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueSetValuesDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sorted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sorted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomValue"));
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
