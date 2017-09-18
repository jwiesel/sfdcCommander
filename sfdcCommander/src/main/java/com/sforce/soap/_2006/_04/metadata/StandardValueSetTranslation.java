/**
 * StandardValueSetTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class StandardValueSetTranslation  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ValueTranslation[] valueTranslation;

    public StandardValueSetTranslation() {
    }

    public StandardValueSetTranslation(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ValueTranslation[] valueTranslation) {
        super(
            fullName);
        this.valueTranslation = valueTranslation;
    }


    /**
     * Gets the valueTranslation value for this StandardValueSetTranslation.
     * 
     * @return valueTranslation
     */
    public com.sforce.soap._2006._04.metadata.ValueTranslation[] getValueTranslation() {
        return valueTranslation;
    }


    /**
     * Sets the valueTranslation value for this StandardValueSetTranslation.
     * 
     * @param valueTranslation
     */
    public void setValueTranslation(com.sforce.soap._2006._04.metadata.ValueTranslation[] valueTranslation) {
        this.valueTranslation = valueTranslation;
    }

    public com.sforce.soap._2006._04.metadata.ValueTranslation getValueTranslation(int i) {
        return this.valueTranslation[i];
    }

    public void setValueTranslation(int i, com.sforce.soap._2006._04.metadata.ValueTranslation _value) {
        this.valueTranslation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StandardValueSetTranslation)) return false;
        StandardValueSetTranslation other = (StandardValueSetTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.valueTranslation==null && other.getValueTranslation()==null) || 
             (this.valueTranslation!=null &&
              java.util.Arrays.equals(this.valueTranslation, other.getValueTranslation())));
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
        if (getValueTranslation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueTranslation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueTranslation(), i);
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
        new org.apache.axis.description.TypeDesc(StandardValueSetTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StandardValueSetTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueTranslation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueTranslation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueTranslation"));
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
