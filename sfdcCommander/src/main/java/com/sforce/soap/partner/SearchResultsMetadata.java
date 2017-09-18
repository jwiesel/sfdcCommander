/**
 * SearchResultsMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SearchResultsMetadata  implements java.io.Serializable {
    private com.sforce.soap.partner.LabelsSearchMetadata[] entityLabelMetadata;

    private com.sforce.soap.partner.EntitySearchMetadata[] entityMetadata;

    public SearchResultsMetadata() {
    }

    public SearchResultsMetadata(
           com.sforce.soap.partner.LabelsSearchMetadata[] entityLabelMetadata,
           com.sforce.soap.partner.EntitySearchMetadata[] entityMetadata) {
           this.entityLabelMetadata = entityLabelMetadata;
           this.entityMetadata = entityMetadata;
    }


    /**
     * Gets the entityLabelMetadata value for this SearchResultsMetadata.
     * 
     * @return entityLabelMetadata
     */
    public com.sforce.soap.partner.LabelsSearchMetadata[] getEntityLabelMetadata() {
        return entityLabelMetadata;
    }


    /**
     * Sets the entityLabelMetadata value for this SearchResultsMetadata.
     * 
     * @param entityLabelMetadata
     */
    public void setEntityLabelMetadata(com.sforce.soap.partner.LabelsSearchMetadata[] entityLabelMetadata) {
        this.entityLabelMetadata = entityLabelMetadata;
    }

    public com.sforce.soap.partner.LabelsSearchMetadata getEntityLabelMetadata(int i) {
        return this.entityLabelMetadata[i];
    }

    public void setEntityLabelMetadata(int i, com.sforce.soap.partner.LabelsSearchMetadata _value) {
        this.entityLabelMetadata[i] = _value;
    }


    /**
     * Gets the entityMetadata value for this SearchResultsMetadata.
     * 
     * @return entityMetadata
     */
    public com.sforce.soap.partner.EntitySearchMetadata[] getEntityMetadata() {
        return entityMetadata;
    }


    /**
     * Sets the entityMetadata value for this SearchResultsMetadata.
     * 
     * @param entityMetadata
     */
    public void setEntityMetadata(com.sforce.soap.partner.EntitySearchMetadata[] entityMetadata) {
        this.entityMetadata = entityMetadata;
    }

    public com.sforce.soap.partner.EntitySearchMetadata getEntityMetadata(int i) {
        return this.entityMetadata[i];
    }

    public void setEntityMetadata(int i, com.sforce.soap.partner.EntitySearchMetadata _value) {
        this.entityMetadata[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchResultsMetadata)) return false;
        SearchResultsMetadata other = (SearchResultsMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityLabelMetadata==null && other.getEntityLabelMetadata()==null) || 
             (this.entityLabelMetadata!=null &&
              java.util.Arrays.equals(this.entityLabelMetadata, other.getEntityLabelMetadata()))) &&
            ((this.entityMetadata==null && other.getEntityMetadata()==null) || 
             (this.entityMetadata!=null &&
              java.util.Arrays.equals(this.entityMetadata, other.getEntityMetadata())));
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
        if (getEntityLabelMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityLabelMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityLabelMetadata(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityMetadata(), i);
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
        new org.apache.axis.description.TypeDesc(SearchResultsMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchResultsMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityLabelMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "entityLabelMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LabelsSearchMetadata"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "entityMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EntitySearchMetadata"));
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
