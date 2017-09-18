/**
 * ExtendedErrorDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ExtendedErrorDetails  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String extendedErrorCode;

    private org.apache.axis.message.MessageElement [] _any;

    public ExtendedErrorDetails() {
    }

    public ExtendedErrorDetails(
           java.lang.String extendedErrorCode,
           org.apache.axis.message.MessageElement [] _any) {
           this.extendedErrorCode = extendedErrorCode;
           this._any = _any;
    }


    /**
     * Gets the extendedErrorCode value for this ExtendedErrorDetails.
     * 
     * @return extendedErrorCode
     */
    public java.lang.String getExtendedErrorCode() {
        return extendedErrorCode;
    }


    /**
     * Sets the extendedErrorCode value for this ExtendedErrorDetails.
     * 
     * @param extendedErrorCode
     */
    public void setExtendedErrorCode(java.lang.String extendedErrorCode) {
        this.extendedErrorCode = extendedErrorCode;
    }


    /**
     * Gets the _any value for this ExtendedErrorDetails.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ExtendedErrorDetails.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendedErrorDetails)) return false;
        ExtendedErrorDetails other = (ExtendedErrorDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extendedErrorCode==null && other.getExtendedErrorCode()==null) || 
             (this.extendedErrorCode!=null &&
              this.extendedErrorCode.equals(other.getExtendedErrorCode()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getExtendedErrorCode() != null) {
            _hashCode += getExtendedErrorCode().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(ExtendedErrorDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ExtendedErrorDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "extendedErrorCode"));
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
