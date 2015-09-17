/**
 * DescribeMetadataResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DescribeMetadataResult  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.DescribeMetadataObject[] metadataObjects;

    private java.lang.String organizationNamespace;

    private boolean partialSaveAllowed;

    private boolean testRequired;

    public DescribeMetadataResult() {
    }

    public DescribeMetadataResult(
           com.sforce.soap._2006._04.metadata.DescribeMetadataObject[] metadataObjects,
           java.lang.String organizationNamespace,
           boolean partialSaveAllowed,
           boolean testRequired) {
           this.metadataObjects = metadataObjects;
           this.organizationNamespace = organizationNamespace;
           this.partialSaveAllowed = partialSaveAllowed;
           this.testRequired = testRequired;
    }


    /**
     * Gets the metadataObjects value for this DescribeMetadataResult.
     * 
     * @return metadataObjects
     */
    public com.sforce.soap._2006._04.metadata.DescribeMetadataObject[] getMetadataObjects() {
        return metadataObjects;
    }


    /**
     * Sets the metadataObjects value for this DescribeMetadataResult.
     * 
     * @param metadataObjects
     */
    public void setMetadataObjects(com.sforce.soap._2006._04.metadata.DescribeMetadataObject[] metadataObjects) {
        this.metadataObjects = metadataObjects;
    }

    public com.sforce.soap._2006._04.metadata.DescribeMetadataObject getMetadataObjects(int i) {
        return this.metadataObjects[i];
    }

    public void setMetadataObjects(int i, com.sforce.soap._2006._04.metadata.DescribeMetadataObject _value) {
        this.metadataObjects[i] = _value;
    }


    /**
     * Gets the organizationNamespace value for this DescribeMetadataResult.
     * 
     * @return organizationNamespace
     */
    public java.lang.String getOrganizationNamespace() {
        return organizationNamespace;
    }


    /**
     * Sets the organizationNamespace value for this DescribeMetadataResult.
     * 
     * @param organizationNamespace
     */
    public void setOrganizationNamespace(java.lang.String organizationNamespace) {
        this.organizationNamespace = organizationNamespace;
    }


    /**
     * Gets the partialSaveAllowed value for this DescribeMetadataResult.
     * 
     * @return partialSaveAllowed
     */
    public boolean isPartialSaveAllowed() {
        return partialSaveAllowed;
    }


    /**
     * Sets the partialSaveAllowed value for this DescribeMetadataResult.
     * 
     * @param partialSaveAllowed
     */
    public void setPartialSaveAllowed(boolean partialSaveAllowed) {
        this.partialSaveAllowed = partialSaveAllowed;
    }


    /**
     * Gets the testRequired value for this DescribeMetadataResult.
     * 
     * @return testRequired
     */
    public boolean isTestRequired() {
        return testRequired;
    }


    /**
     * Sets the testRequired value for this DescribeMetadataResult.
     * 
     * @param testRequired
     */
    public void setTestRequired(boolean testRequired) {
        this.testRequired = testRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeMetadataResult)) return false;
        DescribeMetadataResult other = (DescribeMetadataResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metadataObjects==null && other.getMetadataObjects()==null) || 
             (this.metadataObjects!=null &&
              java.util.Arrays.equals(this.metadataObjects, other.getMetadataObjects()))) &&
            ((this.organizationNamespace==null && other.getOrganizationNamespace()==null) || 
             (this.organizationNamespace!=null &&
              this.organizationNamespace.equals(other.getOrganizationNamespace()))) &&
            this.partialSaveAllowed == other.isPartialSaveAllowed() &&
            this.testRequired == other.isTestRequired();
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
        if (getMetadataObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetadataObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetadataObjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrganizationNamespace() != null) {
            _hashCode += getOrganizationNamespace().hashCode();
        }
        _hashCode += (isPartialSaveAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTestRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeMetadataResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DescribeMetadataResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "metadataObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DescribeMetadataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "organizationNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialSaveAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "partialSaveAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "testRequired"));
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
