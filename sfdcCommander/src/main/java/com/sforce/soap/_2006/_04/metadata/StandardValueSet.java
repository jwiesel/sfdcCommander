/**
 * StandardValueSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class StandardValueSet  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean sorted;

    private com.sforce.soap._2006._04.metadata.StandardValue[] standardValue;

    public StandardValueSet() {
    }

    public StandardValueSet(
           java.lang.String fullName,
           boolean sorted,
           com.sforce.soap._2006._04.metadata.StandardValue[] standardValue) {
        super(
            fullName);
        this.sorted = sorted;
        this.standardValue = standardValue;
    }


    /**
     * Gets the sorted value for this StandardValueSet.
     * 
     * @return sorted
     */
    public boolean isSorted() {
        return sorted;
    }


    /**
     * Sets the sorted value for this StandardValueSet.
     * 
     * @param sorted
     */
    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }


    /**
     * Gets the standardValue value for this StandardValueSet.
     * 
     * @return standardValue
     */
    public com.sforce.soap._2006._04.metadata.StandardValue[] getStandardValue() {
        return standardValue;
    }


    /**
     * Sets the standardValue value for this StandardValueSet.
     * 
     * @param standardValue
     */
    public void setStandardValue(com.sforce.soap._2006._04.metadata.StandardValue[] standardValue) {
        this.standardValue = standardValue;
    }

    public com.sforce.soap._2006._04.metadata.StandardValue getStandardValue(int i) {
        return this.standardValue[i];
    }

    public void setStandardValue(int i, com.sforce.soap._2006._04.metadata.StandardValue _value) {
        this.standardValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StandardValueSet)) return false;
        StandardValueSet other = (StandardValueSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.sorted == other.isSorted() &&
            ((this.standardValue==null && other.getStandardValue()==null) || 
             (this.standardValue!=null &&
              java.util.Arrays.equals(this.standardValue, other.getStandardValue())));
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
        _hashCode += (isSorted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStandardValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStandardValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStandardValue(), i);
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
        new org.apache.axis.description.TypeDesc(StandardValueSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StandardValueSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sorted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sorted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "standardValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StandardValue"));
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
