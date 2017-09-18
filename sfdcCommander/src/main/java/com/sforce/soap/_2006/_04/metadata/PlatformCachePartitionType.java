/**
 * PlatformCachePartitionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PlatformCachePartitionType  implements java.io.Serializable {
    private int allocatedCapacity;

    private int allocatedPurchasedCapacity;

    private int allocatedTrialCapacity;

    private com.sforce.soap._2006._04.metadata.PlatformCacheType cacheType;

    public PlatformCachePartitionType() {
    }

    public PlatformCachePartitionType(
           int allocatedCapacity,
           int allocatedPurchasedCapacity,
           int allocatedTrialCapacity,
           com.sforce.soap._2006._04.metadata.PlatformCacheType cacheType) {
           this.allocatedCapacity = allocatedCapacity;
           this.allocatedPurchasedCapacity = allocatedPurchasedCapacity;
           this.allocatedTrialCapacity = allocatedTrialCapacity;
           this.cacheType = cacheType;
    }


    /**
     * Gets the allocatedCapacity value for this PlatformCachePartitionType.
     * 
     * @return allocatedCapacity
     */
    public int getAllocatedCapacity() {
        return allocatedCapacity;
    }


    /**
     * Sets the allocatedCapacity value for this PlatformCachePartitionType.
     * 
     * @param allocatedCapacity
     */
    public void setAllocatedCapacity(int allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }


    /**
     * Gets the allocatedPurchasedCapacity value for this PlatformCachePartitionType.
     * 
     * @return allocatedPurchasedCapacity
     */
    public int getAllocatedPurchasedCapacity() {
        return allocatedPurchasedCapacity;
    }


    /**
     * Sets the allocatedPurchasedCapacity value for this PlatformCachePartitionType.
     * 
     * @param allocatedPurchasedCapacity
     */
    public void setAllocatedPurchasedCapacity(int allocatedPurchasedCapacity) {
        this.allocatedPurchasedCapacity = allocatedPurchasedCapacity;
    }


    /**
     * Gets the allocatedTrialCapacity value for this PlatformCachePartitionType.
     * 
     * @return allocatedTrialCapacity
     */
    public int getAllocatedTrialCapacity() {
        return allocatedTrialCapacity;
    }


    /**
     * Sets the allocatedTrialCapacity value for this PlatformCachePartitionType.
     * 
     * @param allocatedTrialCapacity
     */
    public void setAllocatedTrialCapacity(int allocatedTrialCapacity) {
        this.allocatedTrialCapacity = allocatedTrialCapacity;
    }


    /**
     * Gets the cacheType value for this PlatformCachePartitionType.
     * 
     * @return cacheType
     */
    public com.sforce.soap._2006._04.metadata.PlatformCacheType getCacheType() {
        return cacheType;
    }


    /**
     * Sets the cacheType value for this PlatformCachePartitionType.
     * 
     * @param cacheType
     */
    public void setCacheType(com.sforce.soap._2006._04.metadata.PlatformCacheType cacheType) {
        this.cacheType = cacheType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlatformCachePartitionType)) return false;
        PlatformCachePartitionType other = (PlatformCachePartitionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allocatedCapacity == other.getAllocatedCapacity() &&
            this.allocatedPurchasedCapacity == other.getAllocatedPurchasedCapacity() &&
            this.allocatedTrialCapacity == other.getAllocatedTrialCapacity() &&
            ((this.cacheType==null && other.getCacheType()==null) || 
             (this.cacheType!=null &&
              this.cacheType.equals(other.getCacheType())));
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
        _hashCode += getAllocatedCapacity();
        _hashCode += getAllocatedPurchasedCapacity();
        _hashCode += getAllocatedTrialCapacity();
        if (getCacheType() != null) {
            _hashCode += getCacheType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlatformCachePartitionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformCachePartitionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocatedCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allocatedCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocatedPurchasedCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allocatedPurchasedCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocatedTrialCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allocatedTrialCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "cacheType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformCacheType"));
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
