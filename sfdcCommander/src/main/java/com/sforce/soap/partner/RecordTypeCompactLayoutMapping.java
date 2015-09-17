/**
 * RecordTypeCompactLayoutMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class RecordTypeCompactLayoutMapping  implements java.io.Serializable {
    private boolean available;

    private java.lang.String compactLayoutId;

    private java.lang.String compactLayoutName;

    private java.lang.String recordTypeId;

    private java.lang.String recordTypeName;

    public RecordTypeCompactLayoutMapping() {
    }

    public RecordTypeCompactLayoutMapping(
           boolean available,
           java.lang.String compactLayoutId,
           java.lang.String compactLayoutName,
           java.lang.String recordTypeId,
           java.lang.String recordTypeName) {
           this.available = available;
           this.compactLayoutId = compactLayoutId;
           this.compactLayoutName = compactLayoutName;
           this.recordTypeId = recordTypeId;
           this.recordTypeName = recordTypeName;
    }


    /**
     * Gets the available value for this RecordTypeCompactLayoutMapping.
     * 
     * @return available
     */
    public boolean isAvailable() {
        return available;
    }


    /**
     * Sets the available value for this RecordTypeCompactLayoutMapping.
     * 
     * @param available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }


    /**
     * Gets the compactLayoutId value for this RecordTypeCompactLayoutMapping.
     * 
     * @return compactLayoutId
     */
    public java.lang.String getCompactLayoutId() {
        return compactLayoutId;
    }


    /**
     * Sets the compactLayoutId value for this RecordTypeCompactLayoutMapping.
     * 
     * @param compactLayoutId
     */
    public void setCompactLayoutId(java.lang.String compactLayoutId) {
        this.compactLayoutId = compactLayoutId;
    }


    /**
     * Gets the compactLayoutName value for this RecordTypeCompactLayoutMapping.
     * 
     * @return compactLayoutName
     */
    public java.lang.String getCompactLayoutName() {
        return compactLayoutName;
    }


    /**
     * Sets the compactLayoutName value for this RecordTypeCompactLayoutMapping.
     * 
     * @param compactLayoutName
     */
    public void setCompactLayoutName(java.lang.String compactLayoutName) {
        this.compactLayoutName = compactLayoutName;
    }


    /**
     * Gets the recordTypeId value for this RecordTypeCompactLayoutMapping.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this RecordTypeCompactLayoutMapping.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the recordTypeName value for this RecordTypeCompactLayoutMapping.
     * 
     * @return recordTypeName
     */
    public java.lang.String getRecordTypeName() {
        return recordTypeName;
    }


    /**
     * Sets the recordTypeName value for this RecordTypeCompactLayoutMapping.
     * 
     * @param recordTypeName
     */
    public void setRecordTypeName(java.lang.String recordTypeName) {
        this.recordTypeName = recordTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordTypeCompactLayoutMapping)) return false;
        RecordTypeCompactLayoutMapping other = (RecordTypeCompactLayoutMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.available == other.isAvailable() &&
            ((this.compactLayoutId==null && other.getCompactLayoutId()==null) || 
             (this.compactLayoutId!=null &&
              this.compactLayoutId.equals(other.getCompactLayoutId()))) &&
            ((this.compactLayoutName==null && other.getCompactLayoutName()==null) || 
             (this.compactLayoutName!=null &&
              this.compactLayoutName.equals(other.getCompactLayoutName()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.recordTypeName==null && other.getRecordTypeName()==null) || 
             (this.recordTypeName!=null &&
              this.recordTypeName.equals(other.getRecordTypeName())));
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
        _hashCode += (isAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCompactLayoutId() != null) {
            _hashCode += getCompactLayoutId().hashCode();
        }
        if (getCompactLayoutName() != null) {
            _hashCode += getCompactLayoutName().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRecordTypeName() != null) {
            _hashCode += getRecordTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordTypeCompactLayoutMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RecordTypeCompactLayoutMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compactLayoutId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "compactLayoutId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compactLayoutName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "compactLayoutName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
