/**
 * LicensedCustomPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LicensedCustomPermissions  implements java.io.Serializable {
    private java.lang.String customPermission;

    private java.lang.String licenseDefinition;

    public LicensedCustomPermissions() {
    }

    public LicensedCustomPermissions(
           java.lang.String customPermission,
           java.lang.String licenseDefinition) {
           this.customPermission = customPermission;
           this.licenseDefinition = licenseDefinition;
    }


    /**
     * Gets the customPermission value for this LicensedCustomPermissions.
     * 
     * @return customPermission
     */
    public java.lang.String getCustomPermission() {
        return customPermission;
    }


    /**
     * Sets the customPermission value for this LicensedCustomPermissions.
     * 
     * @param customPermission
     */
    public void setCustomPermission(java.lang.String customPermission) {
        this.customPermission = customPermission;
    }


    /**
     * Gets the licenseDefinition value for this LicensedCustomPermissions.
     * 
     * @return licenseDefinition
     */
    public java.lang.String getLicenseDefinition() {
        return licenseDefinition;
    }


    /**
     * Sets the licenseDefinition value for this LicensedCustomPermissions.
     * 
     * @param licenseDefinition
     */
    public void setLicenseDefinition(java.lang.String licenseDefinition) {
        this.licenseDefinition = licenseDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicensedCustomPermissions)) return false;
        LicensedCustomPermissions other = (LicensedCustomPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customPermission==null && other.getCustomPermission()==null) || 
             (this.customPermission!=null &&
              this.customPermission.equals(other.getCustomPermission()))) &&
            ((this.licenseDefinition==null && other.getLicenseDefinition()==null) || 
             (this.licenseDefinition!=null &&
              this.licenseDefinition.equals(other.getLicenseDefinition())));
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
        if (getCustomPermission() != null) {
            _hashCode += getCustomPermission().hashCode();
        }
        if (getLicenseDefinition() != null) {
            _hashCode += getLicenseDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicensedCustomPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LicensedCustomPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPermission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customPermission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "licenseDefinition"));
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
