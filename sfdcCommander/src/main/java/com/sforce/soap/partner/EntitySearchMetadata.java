/**
 * EntitySearchMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class EntitySearchMetadata  implements java.io.Serializable {
    private java.lang.String entityName;

    private com.sforce.soap.partner.FieldLevelSearchMetadata[] fieldMetadata;

    public EntitySearchMetadata() {
    }

    public EntitySearchMetadata(
           java.lang.String entityName,
           com.sforce.soap.partner.FieldLevelSearchMetadata[] fieldMetadata) {
           this.entityName = entityName;
           this.fieldMetadata = fieldMetadata;
    }


    /**
     * Gets the entityName value for this EntitySearchMetadata.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this EntitySearchMetadata.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the fieldMetadata value for this EntitySearchMetadata.
     * 
     * @return fieldMetadata
     */
    public com.sforce.soap.partner.FieldLevelSearchMetadata[] getFieldMetadata() {
        return fieldMetadata;
    }


    /**
     * Sets the fieldMetadata value for this EntitySearchMetadata.
     * 
     * @param fieldMetadata
     */
    public void setFieldMetadata(com.sforce.soap.partner.FieldLevelSearchMetadata[] fieldMetadata) {
        this.fieldMetadata = fieldMetadata;
    }

    public com.sforce.soap.partner.FieldLevelSearchMetadata getFieldMetadata(int i) {
        return this.fieldMetadata[i];
    }

    public void setFieldMetadata(int i, com.sforce.soap.partner.FieldLevelSearchMetadata _value) {
        this.fieldMetadata[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitySearchMetadata)) return false;
        EntitySearchMetadata other = (EntitySearchMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.fieldMetadata==null && other.getFieldMetadata()==null) || 
             (this.fieldMetadata!=null &&
              java.util.Arrays.equals(this.fieldMetadata, other.getFieldMetadata())));
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
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getFieldMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldMetadata(), i);
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
        new org.apache.axis.description.TypeDesc(EntitySearchMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EntitySearchMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "entityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FieldLevelSearchMetadata"));
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
