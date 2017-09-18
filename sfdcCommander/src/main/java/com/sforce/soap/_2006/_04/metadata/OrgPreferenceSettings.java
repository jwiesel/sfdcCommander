/**
 * OrgPreferenceSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class OrgPreferenceSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.OrganizationSettingsDetail[] preferences;

    public OrgPreferenceSettings() {
    }

    public OrgPreferenceSettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.OrganizationSettingsDetail[] preferences) {
        super(
            fullName);
        this.preferences = preferences;
    }


    /**
     * Gets the preferences value for this OrgPreferenceSettings.
     * 
     * @return preferences
     */
    public com.sforce.soap._2006._04.metadata.OrganizationSettingsDetail[] getPreferences() {
        return preferences;
    }


    /**
     * Sets the preferences value for this OrgPreferenceSettings.
     * 
     * @param preferences
     */
    public void setPreferences(com.sforce.soap._2006._04.metadata.OrganizationSettingsDetail[] preferences) {
        this.preferences = preferences;
    }

    public com.sforce.soap._2006._04.metadata.OrganizationSettingsDetail getPreferences(int i) {
        return this.preferences[i];
    }

    public void setPreferences(int i, com.sforce.soap._2006._04.metadata.OrganizationSettingsDetail _value) {
        this.preferences[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgPreferenceSettings)) return false;
        OrgPreferenceSettings other = (OrgPreferenceSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.preferences==null && other.getPreferences()==null) || 
             (this.preferences!=null &&
              java.util.Arrays.equals(this.preferences, other.getPreferences())));
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
        if (getPreferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferences(), i);
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
        new org.apache.axis.description.TypeDesc(OrgPreferenceSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OrgPreferenceSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "preferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OrganizationSettingsDetail"));
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
