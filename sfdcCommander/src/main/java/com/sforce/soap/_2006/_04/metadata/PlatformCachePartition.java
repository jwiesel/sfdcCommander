/**
 * PlatformCachePartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PlatformCachePartition  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String description;

    private boolean isDefaultPartition;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.PlatformCachePartitionType[] platformCachePartitionTypes;

    public PlatformCachePartition() {
    }

    public PlatformCachePartition(
           java.lang.String fullName,
           java.lang.String description,
           boolean isDefaultPartition,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.PlatformCachePartitionType[] platformCachePartitionTypes) {
        super(
            fullName);
        this.description = description;
        this.isDefaultPartition = isDefaultPartition;
        this.masterLabel = masterLabel;
        this.platformCachePartitionTypes = platformCachePartitionTypes;
    }


    /**
     * Gets the description value for this PlatformCachePartition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PlatformCachePartition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isDefaultPartition value for this PlatformCachePartition.
     * 
     * @return isDefaultPartition
     */
    public boolean isIsDefaultPartition() {
        return isDefaultPartition;
    }


    /**
     * Sets the isDefaultPartition value for this PlatformCachePartition.
     * 
     * @param isDefaultPartition
     */
    public void setIsDefaultPartition(boolean isDefaultPartition) {
        this.isDefaultPartition = isDefaultPartition;
    }


    /**
     * Gets the masterLabel value for this PlatformCachePartition.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this PlatformCachePartition.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the platformCachePartitionTypes value for this PlatformCachePartition.
     * 
     * @return platformCachePartitionTypes
     */
    public com.sforce.soap._2006._04.metadata.PlatformCachePartitionType[] getPlatformCachePartitionTypes() {
        return platformCachePartitionTypes;
    }


    /**
     * Sets the platformCachePartitionTypes value for this PlatformCachePartition.
     * 
     * @param platformCachePartitionTypes
     */
    public void setPlatformCachePartitionTypes(com.sforce.soap._2006._04.metadata.PlatformCachePartitionType[] platformCachePartitionTypes) {
        this.platformCachePartitionTypes = platformCachePartitionTypes;
    }

    public com.sforce.soap._2006._04.metadata.PlatformCachePartitionType getPlatformCachePartitionTypes(int i) {
        return this.platformCachePartitionTypes[i];
    }

    public void setPlatformCachePartitionTypes(int i, com.sforce.soap._2006._04.metadata.PlatformCachePartitionType _value) {
        this.platformCachePartitionTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlatformCachePartition)) return false;
        PlatformCachePartition other = (PlatformCachePartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.isDefaultPartition == other.isIsDefaultPartition() &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.platformCachePartitionTypes==null && other.getPlatformCachePartitionTypes()==null) || 
             (this.platformCachePartitionTypes!=null &&
              java.util.Arrays.equals(this.platformCachePartitionTypes, other.getPlatformCachePartitionTypes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isIsDefaultPartition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getPlatformCachePartitionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlatformCachePartitionTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlatformCachePartitionTypes(), i);
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
        new org.apache.axis.description.TypeDesc(PlatformCachePartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformCachePartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isDefaultPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformCachePartitionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "platformCachePartitionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformCachePartitionType"));
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
