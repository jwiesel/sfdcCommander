/**
 * UserCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class UserCriteria  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Integer creationAgeInSeconds;

    private java.lang.String description;

    private java.lang.Integer lastChatterActivityAgeInSeconds;

    private java.lang.String masterLabel;

    private java.lang.String[] profiles;

    private com.sforce.soap._2006._04.metadata.NetworkUserType[] userTypes;

    public UserCriteria() {
    }

    public UserCriteria(
           java.lang.String fullName,
           java.lang.Integer creationAgeInSeconds,
           java.lang.String description,
           java.lang.Integer lastChatterActivityAgeInSeconds,
           java.lang.String masterLabel,
           java.lang.String[] profiles,
           com.sforce.soap._2006._04.metadata.NetworkUserType[] userTypes) {
        super(
            fullName);
        this.creationAgeInSeconds = creationAgeInSeconds;
        this.description = description;
        this.lastChatterActivityAgeInSeconds = lastChatterActivityAgeInSeconds;
        this.masterLabel = masterLabel;
        this.profiles = profiles;
        this.userTypes = userTypes;
    }


    /**
     * Gets the creationAgeInSeconds value for this UserCriteria.
     * 
     * @return creationAgeInSeconds
     */
    public java.lang.Integer getCreationAgeInSeconds() {
        return creationAgeInSeconds;
    }


    /**
     * Sets the creationAgeInSeconds value for this UserCriteria.
     * 
     * @param creationAgeInSeconds
     */
    public void setCreationAgeInSeconds(java.lang.Integer creationAgeInSeconds) {
        this.creationAgeInSeconds = creationAgeInSeconds;
    }


    /**
     * Gets the description value for this UserCriteria.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserCriteria.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lastChatterActivityAgeInSeconds value for this UserCriteria.
     * 
     * @return lastChatterActivityAgeInSeconds
     */
    public java.lang.Integer getLastChatterActivityAgeInSeconds() {
        return lastChatterActivityAgeInSeconds;
    }


    /**
     * Sets the lastChatterActivityAgeInSeconds value for this UserCriteria.
     * 
     * @param lastChatterActivityAgeInSeconds
     */
    public void setLastChatterActivityAgeInSeconds(java.lang.Integer lastChatterActivityAgeInSeconds) {
        this.lastChatterActivityAgeInSeconds = lastChatterActivityAgeInSeconds;
    }


    /**
     * Gets the masterLabel value for this UserCriteria.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this UserCriteria.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the profiles value for this UserCriteria.
     * 
     * @return profiles
     */
    public java.lang.String[] getProfiles() {
        return profiles;
    }


    /**
     * Sets the profiles value for this UserCriteria.
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


    /**
     * Gets the userTypes value for this UserCriteria.
     * 
     * @return userTypes
     */
    public com.sforce.soap._2006._04.metadata.NetworkUserType[] getUserTypes() {
        return userTypes;
    }


    /**
     * Sets the userTypes value for this UserCriteria.
     * 
     * @param userTypes
     */
    public void setUserTypes(com.sforce.soap._2006._04.metadata.NetworkUserType[] userTypes) {
        this.userTypes = userTypes;
    }

    public com.sforce.soap._2006._04.metadata.NetworkUserType getUserTypes(int i) {
        return this.userTypes[i];
    }

    public void setUserTypes(int i, com.sforce.soap._2006._04.metadata.NetworkUserType _value) {
        this.userTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCriteria)) return false;
        UserCriteria other = (UserCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creationAgeInSeconds==null && other.getCreationAgeInSeconds()==null) || 
             (this.creationAgeInSeconds!=null &&
              this.creationAgeInSeconds.equals(other.getCreationAgeInSeconds()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lastChatterActivityAgeInSeconds==null && other.getLastChatterActivityAgeInSeconds()==null) || 
             (this.lastChatterActivityAgeInSeconds!=null &&
              this.lastChatterActivityAgeInSeconds.equals(other.getLastChatterActivityAgeInSeconds()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.profiles==null && other.getProfiles()==null) || 
             (this.profiles!=null &&
              java.util.Arrays.equals(this.profiles, other.getProfiles()))) &&
            ((this.userTypes==null && other.getUserTypes()==null) || 
             (this.userTypes!=null &&
              java.util.Arrays.equals(this.userTypes, other.getUserTypes())));
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
        if (getCreationAgeInSeconds() != null) {
            _hashCode += getCreationAgeInSeconds().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLastChatterActivityAgeInSeconds() != null) {
            _hashCode += getLastChatterActivityAgeInSeconds().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
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
        if (getUserTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserTypes(), i);
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
        new org.apache.axis.description.TypeDesc(UserCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationAgeInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "creationAgeInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChatterActivityAgeInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lastChatterActivityAgeInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkUserType"));
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
