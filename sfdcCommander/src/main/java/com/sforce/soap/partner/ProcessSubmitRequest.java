/**
 * ProcessSubmitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class ProcessSubmitRequest  extends com.sforce.soap.partner.ProcessRequest  implements java.io.Serializable {
    private java.lang.String objectId;

    private java.lang.String submitterId;

    private java.lang.String processDefinitionNameOrId;

    private java.lang.Boolean skipEntryCriteria;

    public ProcessSubmitRequest() {
    }

    public ProcessSubmitRequest(
           java.lang.String comments,
           java.lang.String[] nextApproverIds,
           java.lang.String objectId,
           java.lang.String submitterId,
           java.lang.String processDefinitionNameOrId,
           java.lang.Boolean skipEntryCriteria) {
        super(
            comments,
            nextApproverIds);
        this.objectId = objectId;
        this.submitterId = submitterId;
        this.processDefinitionNameOrId = processDefinitionNameOrId;
        this.skipEntryCriteria = skipEntryCriteria;
    }


    /**
     * Gets the objectId value for this ProcessSubmitRequest.
     * 
     * @return objectId
     */
    public java.lang.String getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this ProcessSubmitRequest.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.String objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the submitterId value for this ProcessSubmitRequest.
     * 
     * @return submitterId
     */
    public java.lang.String getSubmitterId() {
        return submitterId;
    }


    /**
     * Sets the submitterId value for this ProcessSubmitRequest.
     * 
     * @param submitterId
     */
    public void setSubmitterId(java.lang.String submitterId) {
        this.submitterId = submitterId;
    }


    /**
     * Gets the processDefinitionNameOrId value for this ProcessSubmitRequest.
     * 
     * @return processDefinitionNameOrId
     */
    public java.lang.String getProcessDefinitionNameOrId() {
        return processDefinitionNameOrId;
    }


    /**
     * Sets the processDefinitionNameOrId value for this ProcessSubmitRequest.
     * 
     * @param processDefinitionNameOrId
     */
    public void setProcessDefinitionNameOrId(java.lang.String processDefinitionNameOrId) {
        this.processDefinitionNameOrId = processDefinitionNameOrId;
    }


    /**
     * Gets the skipEntryCriteria value for this ProcessSubmitRequest.
     * 
     * @return skipEntryCriteria
     */
    public java.lang.Boolean getSkipEntryCriteria() {
        return skipEntryCriteria;
    }


    /**
     * Sets the skipEntryCriteria value for this ProcessSubmitRequest.
     * 
     * @param skipEntryCriteria
     */
    public void setSkipEntryCriteria(java.lang.Boolean skipEntryCriteria) {
        this.skipEntryCriteria = skipEntryCriteria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSubmitRequest)) return false;
        ProcessSubmitRequest other = (ProcessSubmitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.submitterId==null && other.getSubmitterId()==null) || 
             (this.submitterId!=null &&
              this.submitterId.equals(other.getSubmitterId()))) &&
            ((this.processDefinitionNameOrId==null && other.getProcessDefinitionNameOrId()==null) || 
             (this.processDefinitionNameOrId!=null &&
              this.processDefinitionNameOrId.equals(other.getProcessDefinitionNameOrId()))) &&
            ((this.skipEntryCriteria==null && other.getSkipEntryCriteria()==null) || 
             (this.skipEntryCriteria!=null &&
              this.skipEntryCriteria.equals(other.getSkipEntryCriteria())));
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
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getSubmitterId() != null) {
            _hashCode += getSubmitterId().hashCode();
        }
        if (getProcessDefinitionNameOrId() != null) {
            _hashCode += getProcessDefinitionNameOrId().hashCode();
        }
        if (getSkipEntryCriteria() != null) {
            _hashCode += getSkipEntryCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSubmitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessSubmitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "objectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitterId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "submitterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDefinitionNameOrId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "processDefinitionNameOrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipEntryCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "skipEntryCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
