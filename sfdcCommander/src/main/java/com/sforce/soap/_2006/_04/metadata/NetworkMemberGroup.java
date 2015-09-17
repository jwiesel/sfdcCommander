/**
 * NetworkMemberGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class NetworkMemberGroup  implements java.io.Serializable {
    private java.lang.String[] permissionSet;

    private java.lang.String[] profile;

    public NetworkMemberGroup() {
    }

    public NetworkMemberGroup(
           java.lang.String[] permissionSet,
           java.lang.String[] profile) {
           this.permissionSet = permissionSet;
           this.profile = profile;
    }


    /**
     * Gets the permissionSet value for this NetworkMemberGroup.
     * 
     * @return permissionSet
     */
    public java.lang.String[] getPermissionSet() {
        return permissionSet;
    }


    /**
     * Sets the permissionSet value for this NetworkMemberGroup.
     * 
     * @param permissionSet
     */
    public void setPermissionSet(java.lang.String[] permissionSet) {
        this.permissionSet = permissionSet;
    }

    public java.lang.String getPermissionSet(int i) {
        return this.permissionSet[i];
    }

    public void setPermissionSet(int i, java.lang.String _value) {
        this.permissionSet[i] = _value;
    }


    /**
     * Gets the profile value for this NetworkMemberGroup.
     * 
     * @return profile
     */
    public java.lang.String[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this NetworkMemberGroup.
     * 
     * @param profile
     */
    public void setProfile(java.lang.String[] profile) {
        this.profile = profile;
    }

    public java.lang.String getProfile(int i) {
        return this.profile[i];
    }

    public void setProfile(int i, java.lang.String _value) {
        this.profile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkMemberGroup)) return false;
        NetworkMemberGroup other = (NetworkMemberGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.permissionSet==null && other.getPermissionSet()==null) || 
             (this.permissionSet!=null &&
              java.util.Arrays.equals(this.permissionSet, other.getPermissionSet()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              java.util.Arrays.equals(this.profile, other.getProfile())));
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
        if (getPermissionSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissionSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissionSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfile(), i);
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
        new org.apache.axis.description.TypeDesc(NetworkMemberGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkMemberGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "permissionSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
