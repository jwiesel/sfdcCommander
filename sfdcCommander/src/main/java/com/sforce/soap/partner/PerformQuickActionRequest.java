/**
 * PerformQuickActionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class PerformQuickActionRequest  implements java.io.Serializable {
    private java.lang.String contextId;

    private java.lang.String quickActionName;

    private com.sforce.soap.partner.sobject.SObject[] records;

    public PerformQuickActionRequest() {
    }

    public PerformQuickActionRequest(
           java.lang.String contextId,
           java.lang.String quickActionName,
           com.sforce.soap.partner.sobject.SObject[] records) {
           this.contextId = contextId;
           this.quickActionName = quickActionName;
           this.records = records;
    }


    /**
     * Gets the contextId value for this PerformQuickActionRequest.
     * 
     * @return contextId
     */
    public java.lang.String getContextId() {
        return contextId;
    }


    /**
     * Sets the contextId value for this PerformQuickActionRequest.
     * 
     * @param contextId
     */
    public void setContextId(java.lang.String contextId) {
        this.contextId = contextId;
    }


    /**
     * Gets the quickActionName value for this PerformQuickActionRequest.
     * 
     * @return quickActionName
     */
    public java.lang.String getQuickActionName() {
        return quickActionName;
    }


    /**
     * Sets the quickActionName value for this PerformQuickActionRequest.
     * 
     * @param quickActionName
     */
    public void setQuickActionName(java.lang.String quickActionName) {
        this.quickActionName = quickActionName;
    }


    /**
     * Gets the records value for this PerformQuickActionRequest.
     * 
     * @return records
     */
    public com.sforce.soap.partner.sobject.SObject[] getRecords() {
        return records;
    }


    /**
     * Sets the records value for this PerformQuickActionRequest.
     * 
     * @param records
     */
    public void setRecords(com.sforce.soap.partner.sobject.SObject[] records) {
        this.records = records;
    }

    public com.sforce.soap.partner.sobject.SObject getRecords(int i) {
        return this.records[i];
    }

    public void setRecords(int i, com.sforce.soap.partner.sobject.SObject _value) {
        this.records[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformQuickActionRequest)) return false;
        PerformQuickActionRequest other = (PerformQuickActionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contextId==null && other.getContextId()==null) || 
             (this.contextId!=null &&
              this.contextId.equals(other.getContextId()))) &&
            ((this.quickActionName==null && other.getQuickActionName()==null) || 
             (this.quickActionName!=null &&
              this.quickActionName.equals(other.getQuickActionName()))) &&
            ((this.records==null && other.getRecords()==null) || 
             (this.records!=null &&
              java.util.Arrays.equals(this.records, other.getRecords())));
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
        if (getContextId() != null) {
            _hashCode += getContextId().hashCode();
        }
        if (getQuickActionName() != null) {
            _hashCode += getQuickActionName().hashCode();
        }
        if (getRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecords(), i);
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
        new org.apache.axis.description.TypeDesc(PerformQuickActionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("records");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "records"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject"));
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

}
