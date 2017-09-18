/**
 * ValueSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ValueSettings  implements java.io.Serializable {
    private java.lang.String[] controllingFieldValue;

    private java.lang.String valueName;

    public ValueSettings() {
    }

    public ValueSettings(
           java.lang.String[] controllingFieldValue,
           java.lang.String valueName) {
           this.controllingFieldValue = controllingFieldValue;
           this.valueName = valueName;
    }


    /**
     * Gets the controllingFieldValue value for this ValueSettings.
     * 
     * @return controllingFieldValue
     */
    public java.lang.String[] getControllingFieldValue() {
        return controllingFieldValue;
    }


    /**
     * Sets the controllingFieldValue value for this ValueSettings.
     * 
     * @param controllingFieldValue
     */
    public void setControllingFieldValue(java.lang.String[] controllingFieldValue) {
        this.controllingFieldValue = controllingFieldValue;
    }

    public java.lang.String getControllingFieldValue(int i) {
        return this.controllingFieldValue[i];
    }

    public void setControllingFieldValue(int i, java.lang.String _value) {
        this.controllingFieldValue[i] = _value;
    }


    /**
     * Gets the valueName value for this ValueSettings.
     * 
     * @return valueName
     */
    public java.lang.String getValueName() {
        return valueName;
    }


    /**
     * Sets the valueName value for this ValueSettings.
     * 
     * @param valueName
     */
    public void setValueName(java.lang.String valueName) {
        this.valueName = valueName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueSettings)) return false;
        ValueSettings other = (ValueSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.controllingFieldValue==null && other.getControllingFieldValue()==null) || 
             (this.controllingFieldValue!=null &&
              java.util.Arrays.equals(this.controllingFieldValue, other.getControllingFieldValue()))) &&
            ((this.valueName==null && other.getValueName()==null) || 
             (this.valueName!=null &&
              this.valueName.equals(other.getValueName())));
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
        if (getControllingFieldValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControllingFieldValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControllingFieldValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValueName() != null) {
            _hashCode += getValueName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValueSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllingFieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "controllingFieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueName"));
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
