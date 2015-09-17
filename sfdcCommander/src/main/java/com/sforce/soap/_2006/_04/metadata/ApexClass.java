/**
 * ApexClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ApexClass  extends com.sforce.soap._2006._04.metadata.MetadataWithContent  implements java.io.Serializable {
    private double apiVersion;

    private com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions;

    private com.sforce.soap._2006._04.metadata.ApexCodeUnitStatus status;

    public ApexClass() {
    }

    public ApexClass(
           java.lang.String fullName,
           byte[] content,
           double apiVersion,
           com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions,
           com.sforce.soap._2006._04.metadata.ApexCodeUnitStatus status) {
        super(
            fullName,
            content);
        this.apiVersion = apiVersion;
        this.packageVersions = packageVersions;
        this.status = status;
    }


    /**
     * Gets the apiVersion value for this ApexClass.
     * 
     * @return apiVersion
     */
    public double getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this ApexClass.
     * 
     * @param apiVersion
     */
    public void setApiVersion(double apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the packageVersions value for this ApexClass.
     * 
     * @return packageVersions
     */
    public com.sforce.soap._2006._04.metadata.PackageVersion[] getPackageVersions() {
        return packageVersions;
    }


    /**
     * Sets the packageVersions value for this ApexClass.
     * 
     * @param packageVersions
     */
    public void setPackageVersions(com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions) {
        this.packageVersions = packageVersions;
    }

    public com.sforce.soap._2006._04.metadata.PackageVersion getPackageVersions(int i) {
        return this.packageVersions[i];
    }

    public void setPackageVersions(int i, com.sforce.soap._2006._04.metadata.PackageVersion _value) {
        this.packageVersions[i] = _value;
    }


    /**
     * Gets the status value for this ApexClass.
     * 
     * @return status
     */
    public com.sforce.soap._2006._04.metadata.ApexCodeUnitStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ApexClass.
     * 
     * @param status
     */
    public void setStatus(com.sforce.soap._2006._04.metadata.ApexCodeUnitStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApexClass)) return false;
        ApexClass other = (ApexClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.apiVersion == other.getApiVersion() &&
            ((this.packageVersions==null && other.getPackageVersions()==null) || 
             (this.packageVersions!=null &&
              java.util.Arrays.equals(this.packageVersions, other.getPackageVersions()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += new Double(getApiVersion()).hashCode();
        if (getPackageVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApexClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApexClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "packageVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PackageVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApexCodeUnitStatus"));
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
