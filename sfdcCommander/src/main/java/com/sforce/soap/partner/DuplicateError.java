/**
 * DuplicateError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DuplicateError  extends com.sforce.soap.partner.Error  implements java.io.Serializable {
    private com.sforce.soap.partner.DuplicateResult duplicateResult;

    public DuplicateError() {
    }

    public DuplicateError(
           com.sforce.soap.partner.ExtendedErrorDetails[] extendedErrorDetails,
           java.lang.String[] fields,
           java.lang.String message,
           com.sforce.soap.partner.StatusCode statusCode,
           com.sforce.soap.partner.DuplicateResult duplicateResult) {
        super(
            extendedErrorDetails,
            fields,
            message,
            statusCode);
        this.duplicateResult = duplicateResult;
    }


    /**
     * Gets the duplicateResult value for this DuplicateError.
     * 
     * @return duplicateResult
     */
    public com.sforce.soap.partner.DuplicateResult getDuplicateResult() {
        return duplicateResult;
    }


    /**
     * Sets the duplicateResult value for this DuplicateError.
     * 
     * @param duplicateResult
     */
    public void setDuplicateResult(com.sforce.soap.partner.DuplicateResult duplicateResult) {
        this.duplicateResult = duplicateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DuplicateError)) return false;
        DuplicateError other = (DuplicateError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.duplicateResult==null && other.getDuplicateResult()==null) || 
             (this.duplicateResult!=null &&
              this.duplicateResult.equals(other.getDuplicateResult())));
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
        if (getDuplicateResult() != null) {
            _hashCode += getDuplicateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DuplicateError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DuplicateError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "duplicateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DuplicateResult"));
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
