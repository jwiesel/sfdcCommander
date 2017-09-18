/**
 * DescribePathAssistants.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribePathAssistants  implements java.io.Serializable {
    private java.lang.String sObjectType;

    private java.lang.String picklistValue;

    private java.lang.String[] recordTypeIds;

    public DescribePathAssistants() {
    }

    public DescribePathAssistants(
           java.lang.String sObjectType,
           java.lang.String picklistValue,
           java.lang.String[] recordTypeIds) {
           this.sObjectType = sObjectType;
           this.picklistValue = picklistValue;
           this.recordTypeIds = recordTypeIds;
    }


    /**
     * Gets the sObjectType value for this DescribePathAssistants.
     * 
     * @return sObjectType
     */
    public java.lang.String getSObjectType() {
        return sObjectType;
    }


    /**
     * Sets the sObjectType value for this DescribePathAssistants.
     * 
     * @param sObjectType
     */
    public void setSObjectType(java.lang.String sObjectType) {
        this.sObjectType = sObjectType;
    }


    /**
     * Gets the picklistValue value for this DescribePathAssistants.
     * 
     * @return picklistValue
     */
    public java.lang.String getPicklistValue() {
        return picklistValue;
    }


    /**
     * Sets the picklistValue value for this DescribePathAssistants.
     * 
     * @param picklistValue
     */
    public void setPicklistValue(java.lang.String picklistValue) {
        this.picklistValue = picklistValue;
    }


    /**
     * Gets the recordTypeIds value for this DescribePathAssistants.
     * 
     * @return recordTypeIds
     */
    public java.lang.String[] getRecordTypeIds() {
        return recordTypeIds;
    }


    /**
     * Sets the recordTypeIds value for this DescribePathAssistants.
     * 
     * @param recordTypeIds
     */
    public void setRecordTypeIds(java.lang.String[] recordTypeIds) {
        this.recordTypeIds = recordTypeIds;
    }

    public java.lang.String getRecordTypeIds(int i) {
        return this.recordTypeIds[i];
    }

    public void setRecordTypeIds(int i, java.lang.String _value) {
        this.recordTypeIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribePathAssistants)) return false;
        DescribePathAssistants other = (DescribePathAssistants) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sObjectType==null && other.getSObjectType()==null) || 
             (this.sObjectType!=null &&
              this.sObjectType.equals(other.getSObjectType()))) &&
            ((this.picklistValue==null && other.getPicklistValue()==null) || 
             (this.picklistValue!=null &&
              this.picklistValue.equals(other.getPicklistValue()))) &&
            ((this.recordTypeIds==null && other.getRecordTypeIds()==null) || 
             (this.recordTypeIds!=null &&
              java.util.Arrays.equals(this.recordTypeIds, other.getRecordTypeIds())));
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
        if (getSObjectType() != null) {
            _hashCode += getSObjectType().hashCode();
        }
        if (getPicklistValue() != null) {
            _hashCode += getPicklistValue().hashCode();
        }
        if (getRecordTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordTypeIds(), i);
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
        new org.apache.axis.description.TypeDesc(DescribePathAssistants.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describePathAssistants"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "picklistValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
