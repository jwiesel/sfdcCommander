/**
 * DescribeNouns.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeNouns  implements java.io.Serializable {
    private java.lang.String[] nouns;

    private boolean onlyRenamed;

    private boolean includeFields;

    public DescribeNouns() {
    }

    public DescribeNouns(
           java.lang.String[] nouns,
           boolean onlyRenamed,
           boolean includeFields) {
           this.nouns = nouns;
           this.onlyRenamed = onlyRenamed;
           this.includeFields = includeFields;
    }


    /**
     * Gets the nouns value for this DescribeNouns.
     * 
     * @return nouns
     */
    public java.lang.String[] getNouns() {
        return nouns;
    }


    /**
     * Sets the nouns value for this DescribeNouns.
     * 
     * @param nouns
     */
    public void setNouns(java.lang.String[] nouns) {
        this.nouns = nouns;
    }

    public java.lang.String getNouns(int i) {
        return this.nouns[i];
    }

    public void setNouns(int i, java.lang.String _value) {
        this.nouns[i] = _value;
    }


    /**
     * Gets the onlyRenamed value for this DescribeNouns.
     * 
     * @return onlyRenamed
     */
    public boolean isOnlyRenamed() {
        return onlyRenamed;
    }


    /**
     * Sets the onlyRenamed value for this DescribeNouns.
     * 
     * @param onlyRenamed
     */
    public void setOnlyRenamed(boolean onlyRenamed) {
        this.onlyRenamed = onlyRenamed;
    }


    /**
     * Gets the includeFields value for this DescribeNouns.
     * 
     * @return includeFields
     */
    public boolean isIncludeFields() {
        return includeFields;
    }


    /**
     * Sets the includeFields value for this DescribeNouns.
     * 
     * @param includeFields
     */
    public void setIncludeFields(boolean includeFields) {
        this.includeFields = includeFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeNouns)) return false;
        DescribeNouns other = (DescribeNouns) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nouns==null && other.getNouns()==null) || 
             (this.nouns!=null &&
              java.util.Arrays.equals(this.nouns, other.getNouns()))) &&
            this.onlyRenamed == other.isOnlyRenamed() &&
            this.includeFields == other.isIncludeFields();
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
        if (getNouns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNouns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNouns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isOnlyRenamed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeFields() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeNouns.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeNouns"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nouns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "nouns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlyRenamed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "onlyRenamed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "includeFields"));
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
