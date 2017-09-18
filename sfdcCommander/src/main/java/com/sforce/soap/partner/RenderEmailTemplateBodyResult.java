/**
 * RenderEmailTemplateBodyResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class RenderEmailTemplateBodyResult  implements java.io.Serializable {
    private com.sforce.soap.partner.RenderEmailTemplateError[] errors;

    private java.lang.String mergedBody;

    private boolean success;

    public RenderEmailTemplateBodyResult() {
    }

    public RenderEmailTemplateBodyResult(
           com.sforce.soap.partner.RenderEmailTemplateError[] errors,
           java.lang.String mergedBody,
           boolean success) {
           this.errors = errors;
           this.mergedBody = mergedBody;
           this.success = success;
    }


    /**
     * Gets the errors value for this RenderEmailTemplateBodyResult.
     * 
     * @return errors
     */
    public com.sforce.soap.partner.RenderEmailTemplateError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this RenderEmailTemplateBodyResult.
     * 
     * @param errors
     */
    public void setErrors(com.sforce.soap.partner.RenderEmailTemplateError[] errors) {
        this.errors = errors;
    }

    public com.sforce.soap.partner.RenderEmailTemplateError getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.sforce.soap.partner.RenderEmailTemplateError _value) {
        this.errors[i] = _value;
    }


    /**
     * Gets the mergedBody value for this RenderEmailTemplateBodyResult.
     * 
     * @return mergedBody
     */
    public java.lang.String getMergedBody() {
        return mergedBody;
    }


    /**
     * Sets the mergedBody value for this RenderEmailTemplateBodyResult.
     * 
     * @param mergedBody
     */
    public void setMergedBody(java.lang.String mergedBody) {
        this.mergedBody = mergedBody;
    }


    /**
     * Gets the success value for this RenderEmailTemplateBodyResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this RenderEmailTemplateBodyResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenderEmailTemplateBodyResult)) return false;
        RenderEmailTemplateBodyResult other = (RenderEmailTemplateBodyResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.mergedBody==null && other.getMergedBody()==null) || 
             (this.mergedBody!=null &&
              this.mergedBody.equals(other.getMergedBody()))) &&
            this.success == other.isSuccess();
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
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMergedBody() != null) {
            _hashCode += getMergedBody().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenderEmailTemplateBodyResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RenderEmailTemplateBodyResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RenderEmailTemplateError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergedBody");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "mergedBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "success"));
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
