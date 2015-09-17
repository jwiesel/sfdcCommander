/**
 * ApprovalSubmitter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ApprovalSubmitter  implements java.io.Serializable {
    private java.lang.String submitter;

    private com.sforce.soap._2006._04.metadata.ProcessSubmitterType type;

    public ApprovalSubmitter() {
    }

    public ApprovalSubmitter(
           java.lang.String submitter,
           com.sforce.soap._2006._04.metadata.ProcessSubmitterType type) {
           this.submitter = submitter;
           this.type = type;
    }


    /**
     * Gets the submitter value for this ApprovalSubmitter.
     * 
     * @return submitter
     */
    public java.lang.String getSubmitter() {
        return submitter;
    }


    /**
     * Sets the submitter value for this ApprovalSubmitter.
     * 
     * @param submitter
     */
    public void setSubmitter(java.lang.String submitter) {
        this.submitter = submitter;
    }


    /**
     * Gets the type value for this ApprovalSubmitter.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.ProcessSubmitterType getType() {
        return type;
    }


    /**
     * Sets the type value for this ApprovalSubmitter.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.ProcessSubmitterType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApprovalSubmitter)) return false;
        ApprovalSubmitter other = (ApprovalSubmitter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.submitter==null && other.getSubmitter()==null) || 
             (this.submitter!=null &&
              this.submitter.equals(other.getSubmitter()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getSubmitter() != null) {
            _hashCode += getSubmitter().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApprovalSubmitter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalSubmitter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "submitter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProcessSubmitterType"));
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
