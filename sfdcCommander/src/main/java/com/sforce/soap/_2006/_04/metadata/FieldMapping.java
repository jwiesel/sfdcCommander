/**
 * FieldMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FieldMapping  implements java.io.Serializable {
    private java.lang.String SObjectType;

    private java.lang.String developerName;

    private com.sforce.soap._2006._04.metadata.FieldMappingRow[] fieldMappingRows;

    private java.lang.String masterLabel;

    public FieldMapping() {
    }

    public FieldMapping(
           java.lang.String SObjectType,
           java.lang.String developerName,
           com.sforce.soap._2006._04.metadata.FieldMappingRow[] fieldMappingRows,
           java.lang.String masterLabel) {
           this.SObjectType = SObjectType;
           this.developerName = developerName;
           this.fieldMappingRows = fieldMappingRows;
           this.masterLabel = masterLabel;
    }


    /**
     * Gets the SObjectType value for this FieldMapping.
     * 
     * @return SObjectType
     */
    public java.lang.String getSObjectType() {
        return SObjectType;
    }


    /**
     * Sets the SObjectType value for this FieldMapping.
     * 
     * @param SObjectType
     */
    public void setSObjectType(java.lang.String SObjectType) {
        this.SObjectType = SObjectType;
    }


    /**
     * Gets the developerName value for this FieldMapping.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this FieldMapping.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the fieldMappingRows value for this FieldMapping.
     * 
     * @return fieldMappingRows
     */
    public com.sforce.soap._2006._04.metadata.FieldMappingRow[] getFieldMappingRows() {
        return fieldMappingRows;
    }


    /**
     * Sets the fieldMappingRows value for this FieldMapping.
     * 
     * @param fieldMappingRows
     */
    public void setFieldMappingRows(com.sforce.soap._2006._04.metadata.FieldMappingRow[] fieldMappingRows) {
        this.fieldMappingRows = fieldMappingRows;
    }

    public com.sforce.soap._2006._04.metadata.FieldMappingRow getFieldMappingRows(int i) {
        return this.fieldMappingRows[i];
    }

    public void setFieldMappingRows(int i, com.sforce.soap._2006._04.metadata.FieldMappingRow _value) {
        this.fieldMappingRows[i] = _value;
    }


    /**
     * Gets the masterLabel value for this FieldMapping.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this FieldMapping.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldMapping)) return false;
        FieldMapping other = (FieldMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SObjectType==null && other.getSObjectType()==null) || 
             (this.SObjectType!=null &&
              this.SObjectType.equals(other.getSObjectType()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.fieldMappingRows==null && other.getFieldMappingRows()==null) || 
             (this.fieldMappingRows!=null &&
              java.util.Arrays.equals(this.fieldMappingRows, other.getFieldMappingRows()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel())));
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
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getFieldMappingRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldMappingRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldMappingRows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "developerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMappingRows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldMappingRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldMappingRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
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
