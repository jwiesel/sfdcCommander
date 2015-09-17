/**
 * CustomPermissionDependencyRequired.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomPermissionDependencyRequired  implements java.io.Serializable {
    private java.lang.String customPermission;

    private boolean dependency;

    public CustomPermissionDependencyRequired() {
    }

    public CustomPermissionDependencyRequired(
           java.lang.String customPermission,
           boolean dependency) {
           this.customPermission = customPermission;
           this.dependency = dependency;
    }


    /**
     * Gets the customPermission value for this CustomPermissionDependencyRequired.
     * 
     * @return customPermission
     */
    public java.lang.String getCustomPermission() {
        return customPermission;
    }


    /**
     * Sets the customPermission value for this CustomPermissionDependencyRequired.
     * 
     * @param customPermission
     */
    public void setCustomPermission(java.lang.String customPermission) {
        this.customPermission = customPermission;
    }


    /**
     * Gets the dependency value for this CustomPermissionDependencyRequired.
     * 
     * @return dependency
     */
    public boolean isDependency() {
        return dependency;
    }


    /**
     * Sets the dependency value for this CustomPermissionDependencyRequired.
     * 
     * @param dependency
     */
    public void setDependency(boolean dependency) {
        this.dependency = dependency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPermissionDependencyRequired)) return false;
        CustomPermissionDependencyRequired other = (CustomPermissionDependencyRequired) obj;
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
            this.dependency == other.isDependency();
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
        _hashCode += (isDependency() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomPermissionDependencyRequired.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomPermissionDependencyRequired"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPermission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customPermission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dependency"));
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
