/**
 * LabelsSearchMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class LabelsSearchMetadata  implements java.io.Serializable {
    private com.sforce.soap.partner.NameValuePair[] entityFieldLabels;

    private java.lang.String entityName;

    public LabelsSearchMetadata() {
    }

    public LabelsSearchMetadata(
           com.sforce.soap.partner.NameValuePair[] entityFieldLabels,
           java.lang.String entityName) {
           this.entityFieldLabels = entityFieldLabels;
           this.entityName = entityName;
    }


    /**
     * Gets the entityFieldLabels value for this LabelsSearchMetadata.
     * 
     * @return entityFieldLabels
     */
    public com.sforce.soap.partner.NameValuePair[] getEntityFieldLabels() {
        return entityFieldLabels;
    }


    /**
     * Sets the entityFieldLabels value for this LabelsSearchMetadata.
     * 
     * @param entityFieldLabels
     */
    public void setEntityFieldLabels(com.sforce.soap.partner.NameValuePair[] entityFieldLabels) {
        this.entityFieldLabels = entityFieldLabels;
    }

    public com.sforce.soap.partner.NameValuePair getEntityFieldLabels(int i) {
        return this.entityFieldLabels[i];
    }

    public void setEntityFieldLabels(int i, com.sforce.soap.partner.NameValuePair _value) {
        this.entityFieldLabels[i] = _value;
    }


    /**
     * Gets the entityName value for this LabelsSearchMetadata.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this LabelsSearchMetadata.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabelsSearchMetadata)) return false;
        LabelsSearchMetadata other = (LabelsSearchMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityFieldLabels==null && other.getEntityFieldLabels()==null) || 
             (this.entityFieldLabels!=null &&
              java.util.Arrays.equals(this.entityFieldLabels, other.getEntityFieldLabels()))) &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName())));
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
        if (getEntityFieldLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityFieldLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityFieldLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabelsSearchMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LabelsSearchMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityFieldLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "entityFieldLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NameValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "entityName"));
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
