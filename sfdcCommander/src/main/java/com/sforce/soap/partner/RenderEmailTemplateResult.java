/**
 * RenderEmailTemplateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class RenderEmailTemplateResult  implements java.io.Serializable {
    private com.sforce.soap.partner.RenderEmailTemplateBodyResult[] bodyResults;

    private com.sforce.soap.partner.Error[] errors;

    private boolean success;

    public RenderEmailTemplateResult() {
    }

    public RenderEmailTemplateResult(
           com.sforce.soap.partner.RenderEmailTemplateBodyResult[] bodyResults,
           com.sforce.soap.partner.Error[] errors,
           boolean success) {
           this.bodyResults = bodyResults;
           this.errors = errors;
           this.success = success;
    }


    /**
     * Gets the bodyResults value for this RenderEmailTemplateResult.
     * 
     * @return bodyResults
     */
    public com.sforce.soap.partner.RenderEmailTemplateBodyResult[] getBodyResults() {
        return bodyResults;
    }


    /**
     * Sets the bodyResults value for this RenderEmailTemplateResult.
     * 
     * @param bodyResults
     */
    public void setBodyResults(com.sforce.soap.partner.RenderEmailTemplateBodyResult[] bodyResults) {
        this.bodyResults = bodyResults;
    }

    public com.sforce.soap.partner.RenderEmailTemplateBodyResult getBodyResults(int i) {
        return this.bodyResults[i];
    }

    public void setBodyResults(int i, com.sforce.soap.partner.RenderEmailTemplateBodyResult _value) {
        this.bodyResults[i] = _value;
    }


    /**
     * Gets the errors value for this RenderEmailTemplateResult.
     * 
     * @return errors
     */
    public com.sforce.soap.partner.Error[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this RenderEmailTemplateResult.
     * 
     * @param errors
     */
    public void setErrors(com.sforce.soap.partner.Error[] errors) {
        this.errors = errors;
    }

    public com.sforce.soap.partner.Error getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.sforce.soap.partner.Error _value) {
        this.errors[i] = _value;
    }


    /**
     * Gets the success value for this RenderEmailTemplateResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this RenderEmailTemplateResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenderEmailTemplateResult)) return false;
        RenderEmailTemplateResult other = (RenderEmailTemplateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bodyResults==null && other.getBodyResults()==null) || 
             (this.bodyResults!=null &&
              java.util.Arrays.equals(this.bodyResults, other.getBodyResults()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
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
        if (getBodyResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBodyResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBodyResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenderEmailTemplateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RenderEmailTemplateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "bodyResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RenderEmailTemplateBodyResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
