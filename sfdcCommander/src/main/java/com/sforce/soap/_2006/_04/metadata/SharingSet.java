/**
 * SharingSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SharingSet  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.AccessMapping[] accessMappings;

    private java.lang.String description;

    private java.lang.String name;

    private java.lang.String[] profiles;

    public SharingSet() {
    }

    public SharingSet(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.AccessMapping[] accessMappings,
           java.lang.String description,
           java.lang.String name,
           java.lang.String[] profiles) {
        super(
            fullName);
        this.accessMappings = accessMappings;
        this.description = description;
        this.name = name;
        this.profiles = profiles;
    }


    /**
     * Gets the accessMappings value for this SharingSet.
     * 
     * @return accessMappings
     */
    public com.sforce.soap._2006._04.metadata.AccessMapping[] getAccessMappings() {
        return accessMappings;
    }


    /**
     * Sets the accessMappings value for this SharingSet.
     * 
     * @param accessMappings
     */
    public void setAccessMappings(com.sforce.soap._2006._04.metadata.AccessMapping[] accessMappings) {
        this.accessMappings = accessMappings;
    }

    public com.sforce.soap._2006._04.metadata.AccessMapping getAccessMappings(int i) {
        return this.accessMappings[i];
    }

    public void setAccessMappings(int i, com.sforce.soap._2006._04.metadata.AccessMapping _value) {
        this.accessMappings[i] = _value;
    }


    /**
     * Gets the description value for this SharingSet.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SharingSet.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this SharingSet.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SharingSet.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the profiles value for this SharingSet.
     * 
     * @return profiles
     */
    public java.lang.String[] getProfiles() {
        return profiles;
    }


    /**
     * Sets the profiles value for this SharingSet.
     * 
     * @param profiles
     */
    public void setProfiles(java.lang.String[] profiles) {
        this.profiles = profiles;
    }

    public java.lang.String getProfiles(int i) {
        return this.profiles[i];
    }

    public void setProfiles(int i, java.lang.String _value) {
        this.profiles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharingSet)) return false;
        SharingSet other = (SharingSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accessMappings==null && other.getAccessMappings()==null) || 
             (this.accessMappings!=null &&
              java.util.Arrays.equals(this.accessMappings, other.getAccessMappings()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.profiles==null && other.getProfiles()==null) || 
             (this.profiles!=null &&
              java.util.Arrays.equals(this.profiles, other.getProfiles())));
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
        if (getAccessMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProfiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfiles(), i);
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
        new org.apache.axis.description.TypeDesc(SharingSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accessMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccessMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "profiles"));
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
