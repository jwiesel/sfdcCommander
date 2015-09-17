/**
 * RecordTypePicklistValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class RecordTypePicklistValue  implements java.io.Serializable {
    private java.lang.String picklist;

    private com.sforce.soap._2006._04.metadata.PicklistValue[] values;

    public RecordTypePicklistValue() {
    }

    public RecordTypePicklistValue(
           java.lang.String picklist,
           com.sforce.soap._2006._04.metadata.PicklistValue[] values) {
           this.picklist = picklist;
           this.values = values;
    }


    /**
     * Gets the picklist value for this RecordTypePicklistValue.
     * 
     * @return picklist
     */
    public java.lang.String getPicklist() {
        return picklist;
    }


    /**
     * Sets the picklist value for this RecordTypePicklistValue.
     * 
     * @param picklist
     */
    public void setPicklist(java.lang.String picklist) {
        this.picklist = picklist;
    }


    /**
     * Gets the values value for this RecordTypePicklistValue.
     * 
     * @return values
     */
    public com.sforce.soap._2006._04.metadata.PicklistValue[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this RecordTypePicklistValue.
     * 
     * @param values
     */
    public void setValues(com.sforce.soap._2006._04.metadata.PicklistValue[] values) {
        this.values = values;
    }

    public com.sforce.soap._2006._04.metadata.PicklistValue getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, com.sforce.soap._2006._04.metadata.PicklistValue _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordTypePicklistValue)) return false;
        RecordTypePicklistValue other = (RecordTypePicklistValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.picklist==null && other.getPicklist()==null) || 
             (this.picklist!=null &&
              this.picklist.equals(other.getPicklist()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getPicklist() != null) {
            _hashCode += getPicklist().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(RecordTypePicklistValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordTypePicklistValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PicklistValue"));
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
