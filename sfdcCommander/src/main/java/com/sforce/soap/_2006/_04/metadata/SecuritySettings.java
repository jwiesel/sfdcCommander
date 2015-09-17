/**
 * SecuritySettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SecuritySettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.IpRange[] networkAccess;

    private com.sforce.soap._2006._04.metadata.PasswordPolicies passwordPolicies;

    private com.sforce.soap._2006._04.metadata.SessionSettings sessionSettings;

    public SecuritySettings() {
    }

    public SecuritySettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.IpRange[] networkAccess,
           com.sforce.soap._2006._04.metadata.PasswordPolicies passwordPolicies,
           com.sforce.soap._2006._04.metadata.SessionSettings sessionSettings) {
        super(
            fullName);
        this.networkAccess = networkAccess;
        this.passwordPolicies = passwordPolicies;
        this.sessionSettings = sessionSettings;
    }


    /**
     * Gets the networkAccess value for this SecuritySettings.
     * 
     * @return networkAccess
     */
    public com.sforce.soap._2006._04.metadata.IpRange[] getNetworkAccess() {
        return networkAccess;
    }


    /**
     * Sets the networkAccess value for this SecuritySettings.
     * 
     * @param networkAccess
     */
    public void setNetworkAccess(com.sforce.soap._2006._04.metadata.IpRange[] networkAccess) {
        this.networkAccess = networkAccess;
    }


    /**
     * Gets the passwordPolicies value for this SecuritySettings.
     * 
     * @return passwordPolicies
     */
    public com.sforce.soap._2006._04.metadata.PasswordPolicies getPasswordPolicies() {
        return passwordPolicies;
    }


    /**
     * Sets the passwordPolicies value for this SecuritySettings.
     * 
     * @param passwordPolicies
     */
    public void setPasswordPolicies(com.sforce.soap._2006._04.metadata.PasswordPolicies passwordPolicies) {
        this.passwordPolicies = passwordPolicies;
    }


    /**
     * Gets the sessionSettings value for this SecuritySettings.
     * 
     * @return sessionSettings
     */
    public com.sforce.soap._2006._04.metadata.SessionSettings getSessionSettings() {
        return sessionSettings;
    }


    /**
     * Sets the sessionSettings value for this SecuritySettings.
     * 
     * @param sessionSettings
     */
    public void setSessionSettings(com.sforce.soap._2006._04.metadata.SessionSettings sessionSettings) {
        this.sessionSettings = sessionSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecuritySettings)) return false;
        SecuritySettings other = (SecuritySettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkAccess==null && other.getNetworkAccess()==null) || 
             (this.networkAccess!=null &&
              java.util.Arrays.equals(this.networkAccess, other.getNetworkAccess()))) &&
            ((this.passwordPolicies==null && other.getPasswordPolicies()==null) || 
             (this.passwordPolicies!=null &&
              this.passwordPolicies.equals(other.getPasswordPolicies()))) &&
            ((this.sessionSettings==null && other.getSessionSettings()==null) || 
             (this.sessionSettings!=null &&
              this.sessionSettings.equals(other.getSessionSettings())));
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
        if (getNetworkAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkAccess(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPasswordPolicies() != null) {
            _hashCode += getPasswordPolicies().hashCode();
        }
        if (getSessionSettings() != null) {
            _hashCode += getSessionSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecuritySettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SecuritySettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "networkAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IpRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ipRanges"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "passwordPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PasswordPolicies"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sessionSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionSettings"));
        elemField.setMinOccurs(0);
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
