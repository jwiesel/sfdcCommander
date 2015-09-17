/**
 * CheckDeployStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CheckDeployStatus  implements java.io.Serializable {
    private java.lang.String asyncProcessId;

    private boolean includeDetails;

    public CheckDeployStatus() {
    }

    public CheckDeployStatus(
           java.lang.String asyncProcessId,
           boolean includeDetails) {
           this.asyncProcessId = asyncProcessId;
           this.includeDetails = includeDetails;
    }


    /**
     * Gets the asyncProcessId value for this CheckDeployStatus.
     * 
     * @return asyncProcessId
     */
    public java.lang.String getAsyncProcessId() {
        return asyncProcessId;
    }


    /**
     * Sets the asyncProcessId value for this CheckDeployStatus.
     * 
     * @param asyncProcessId
     */
    public void setAsyncProcessId(java.lang.String asyncProcessId) {
        this.asyncProcessId = asyncProcessId;
    }


    /**
     * Gets the includeDetails value for this CheckDeployStatus.
     * 
     * @return includeDetails
     */
    public boolean isIncludeDetails() {
        return includeDetails;
    }


    /**
     * Sets the includeDetails value for this CheckDeployStatus.
     * 
     * @param includeDetails
     */
    public void setIncludeDetails(boolean includeDetails) {
        this.includeDetails = includeDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckDeployStatus)) return false;
        CheckDeployStatus other = (CheckDeployStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asyncProcessId==null && other.getAsyncProcessId()==null) || 
             (this.asyncProcessId!=null &&
              this.asyncProcessId.equals(other.getAsyncProcessId()))) &&
            this.includeDetails == other.isIncludeDetails();
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
        if (getAsyncProcessId() != null) {
            _hashCode += getAsyncProcessId().hashCode();
        }
        _hashCode += (isIncludeDetails() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckDeployStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", ">checkDeployStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asyncProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "asyncProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "includeDetails"));
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
