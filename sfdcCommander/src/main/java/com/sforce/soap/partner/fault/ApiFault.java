/**
 * ApiFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner.fault;

public class ApiFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.sforce.soap.partner.fault.ExceptionCode exceptionCode;

    private java.lang.String exceptionMessage;

    private com.sforce.soap.partner.ExtendedErrorDetails[] extendedErrorDetails;

    public ApiFault() {
    }

    public ApiFault(
           com.sforce.soap.partner.fault.ExceptionCode exceptionCode,
           java.lang.String exceptionMessage,
           com.sforce.soap.partner.ExtendedErrorDetails[] extendedErrorDetails) {
        this.exceptionCode = exceptionCode;
        this.exceptionMessage = exceptionMessage;
        this.extendedErrorDetails = extendedErrorDetails;
    }


    /**
     * Gets the exceptionCode value for this ApiFault.
     * 
     * @return exceptionCode
     */
    public com.sforce.soap.partner.fault.ExceptionCode getExceptionCode() {
        return exceptionCode;
    }


    /**
     * Sets the exceptionCode value for this ApiFault.
     * 
     * @param exceptionCode
     */
    public void setExceptionCode(com.sforce.soap.partner.fault.ExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
    }


    /**
     * Gets the exceptionMessage value for this ApiFault.
     * 
     * @return exceptionMessage
     */
    public java.lang.String getExceptionMessage() {
        return exceptionMessage;
    }


    /**
     * Sets the exceptionMessage value for this ApiFault.
     * 
     * @param exceptionMessage
     */
    public void setExceptionMessage(java.lang.String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }


    /**
     * Gets the extendedErrorDetails value for this ApiFault.
     * 
     * @return extendedErrorDetails
     */
    public com.sforce.soap.partner.ExtendedErrorDetails[] getExtendedErrorDetails() {
        return extendedErrorDetails;
    }


    /**
     * Sets the extendedErrorDetails value for this ApiFault.
     * 
     * @param extendedErrorDetails
     */
    public void setExtendedErrorDetails(com.sforce.soap.partner.ExtendedErrorDetails[] extendedErrorDetails) {
        this.extendedErrorDetails = extendedErrorDetails;
    }

    public com.sforce.soap.partner.ExtendedErrorDetails getExtendedErrorDetails(int i) {
        return this.extendedErrorDetails[i];
    }

    public void setExtendedErrorDetails(int i, com.sforce.soap.partner.ExtendedErrorDetails _value) {
        this.extendedErrorDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiFault)) return false;
        ApiFault other = (ApiFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptionCode==null && other.getExceptionCode()==null) || 
             (this.exceptionCode!=null &&
              this.exceptionCode.equals(other.getExceptionCode()))) &&
            ((this.exceptionMessage==null && other.getExceptionMessage()==null) || 
             (this.exceptionMessage!=null &&
              this.exceptionMessage.equals(other.getExceptionMessage()))) &&
            ((this.extendedErrorDetails==null && other.getExtendedErrorDetails()==null) || 
             (this.extendedErrorDetails!=null &&
              java.util.Arrays.equals(this.extendedErrorDetails, other.getExtendedErrorDetails())));
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
        if (getExceptionCode() != null) {
            _hashCode += getExceptionCode().hashCode();
        }
        if (getExceptionMessage() != null) {
            _hashCode += getExceptionMessage().hashCode();
        }
        if (getExtendedErrorDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendedErrorDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendedErrorDetails(), i);
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
        new org.apache.axis.description.TypeDesc(ApiFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "ApiFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "exceptionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "ExceptionCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "exceptionMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedErrorDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "extendedErrorDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ExtendedErrorDetails"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
