/**
 * DescribeSoqlListViewParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeSoqlListViewParams  implements java.io.Serializable {
    private java.lang.String developerNameOrId;

    private java.lang.String sobjectType;

    public DescribeSoqlListViewParams() {
    }

    public DescribeSoqlListViewParams(
           java.lang.String developerNameOrId,
           java.lang.String sobjectType) {
           this.developerNameOrId = developerNameOrId;
           this.sobjectType = sobjectType;
    }


    /**
     * Gets the developerNameOrId value for this DescribeSoqlListViewParams.
     * 
     * @return developerNameOrId
     */
    public java.lang.String getDeveloperNameOrId() {
        return developerNameOrId;
    }


    /**
     * Sets the developerNameOrId value for this DescribeSoqlListViewParams.
     * 
     * @param developerNameOrId
     */
    public void setDeveloperNameOrId(java.lang.String developerNameOrId) {
        this.developerNameOrId = developerNameOrId;
    }


    /**
     * Gets the sobjectType value for this DescribeSoqlListViewParams.
     * 
     * @return sobjectType
     */
    public java.lang.String getSobjectType() {
        return sobjectType;
    }


    /**
     * Sets the sobjectType value for this DescribeSoqlListViewParams.
     * 
     * @param sobjectType
     */
    public void setSobjectType(java.lang.String sobjectType) {
        this.sobjectType = sobjectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeSoqlListViewParams)) return false;
        DescribeSoqlListViewParams other = (DescribeSoqlListViewParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.developerNameOrId==null && other.getDeveloperNameOrId()==null) || 
             (this.developerNameOrId!=null &&
              this.developerNameOrId.equals(other.getDeveloperNameOrId()))) &&
            ((this.sobjectType==null && other.getSobjectType()==null) || 
             (this.sobjectType!=null &&
              this.sobjectType.equals(other.getSobjectType())));
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
        if (getDeveloperNameOrId() != null) {
            _hashCode += getDeveloperNameOrId().hashCode();
        }
        if (getSobjectType() != null) {
            _hashCode += getSobjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeSoqlListViewParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerNameOrId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "developerNameOrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
