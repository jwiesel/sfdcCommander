/**
 * SharingRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SharingRules  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.SharingCriteriaRule[] sharingCriteriaRules;

    private com.sforce.soap._2006._04.metadata.SharingOwnerRule[] sharingOwnerRules;

    private com.sforce.soap._2006._04.metadata.SharingTerritoryRule[] sharingTerritoryRules;

    public SharingRules() {
    }

    public SharingRules(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.SharingCriteriaRule[] sharingCriteriaRules,
           com.sforce.soap._2006._04.metadata.SharingOwnerRule[] sharingOwnerRules,
           com.sforce.soap._2006._04.metadata.SharingTerritoryRule[] sharingTerritoryRules) {
        super(
            fullName);
        this.sharingCriteriaRules = sharingCriteriaRules;
        this.sharingOwnerRules = sharingOwnerRules;
        this.sharingTerritoryRules = sharingTerritoryRules;
    }


    /**
     * Gets the sharingCriteriaRules value for this SharingRules.
     * 
     * @return sharingCriteriaRules
     */
    public com.sforce.soap._2006._04.metadata.SharingCriteriaRule[] getSharingCriteriaRules() {
        return sharingCriteriaRules;
    }


    /**
     * Sets the sharingCriteriaRules value for this SharingRules.
     * 
     * @param sharingCriteriaRules
     */
    public void setSharingCriteriaRules(com.sforce.soap._2006._04.metadata.SharingCriteriaRule[] sharingCriteriaRules) {
        this.sharingCriteriaRules = sharingCriteriaRules;
    }

    public com.sforce.soap._2006._04.metadata.SharingCriteriaRule getSharingCriteriaRules(int i) {
        return this.sharingCriteriaRules[i];
    }

    public void setSharingCriteriaRules(int i, com.sforce.soap._2006._04.metadata.SharingCriteriaRule _value) {
        this.sharingCriteriaRules[i] = _value;
    }


    /**
     * Gets the sharingOwnerRules value for this SharingRules.
     * 
     * @return sharingOwnerRules
     */
    public com.sforce.soap._2006._04.metadata.SharingOwnerRule[] getSharingOwnerRules() {
        return sharingOwnerRules;
    }


    /**
     * Sets the sharingOwnerRules value for this SharingRules.
     * 
     * @param sharingOwnerRules
     */
    public void setSharingOwnerRules(com.sforce.soap._2006._04.metadata.SharingOwnerRule[] sharingOwnerRules) {
        this.sharingOwnerRules = sharingOwnerRules;
    }

    public com.sforce.soap._2006._04.metadata.SharingOwnerRule getSharingOwnerRules(int i) {
        return this.sharingOwnerRules[i];
    }

    public void setSharingOwnerRules(int i, com.sforce.soap._2006._04.metadata.SharingOwnerRule _value) {
        this.sharingOwnerRules[i] = _value;
    }


    /**
     * Gets the sharingTerritoryRules value for this SharingRules.
     * 
     * @return sharingTerritoryRules
     */
    public com.sforce.soap._2006._04.metadata.SharingTerritoryRule[] getSharingTerritoryRules() {
        return sharingTerritoryRules;
    }


    /**
     * Sets the sharingTerritoryRules value for this SharingRules.
     * 
     * @param sharingTerritoryRules
     */
    public void setSharingTerritoryRules(com.sforce.soap._2006._04.metadata.SharingTerritoryRule[] sharingTerritoryRules) {
        this.sharingTerritoryRules = sharingTerritoryRules;
    }

    public com.sforce.soap._2006._04.metadata.SharingTerritoryRule getSharingTerritoryRules(int i) {
        return this.sharingTerritoryRules[i];
    }

    public void setSharingTerritoryRules(int i, com.sforce.soap._2006._04.metadata.SharingTerritoryRule _value) {
        this.sharingTerritoryRules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharingRules)) return false;
        SharingRules other = (SharingRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sharingCriteriaRules==null && other.getSharingCriteriaRules()==null) || 
             (this.sharingCriteriaRules!=null &&
              java.util.Arrays.equals(this.sharingCriteriaRules, other.getSharingCriteriaRules()))) &&
            ((this.sharingOwnerRules==null && other.getSharingOwnerRules()==null) || 
             (this.sharingOwnerRules!=null &&
              java.util.Arrays.equals(this.sharingOwnerRules, other.getSharingOwnerRules()))) &&
            ((this.sharingTerritoryRules==null && other.getSharingTerritoryRules()==null) || 
             (this.sharingTerritoryRules!=null &&
              java.util.Arrays.equals(this.sharingTerritoryRules, other.getSharingTerritoryRules())));
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
        if (getSharingCriteriaRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharingCriteriaRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharingCriteriaRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharingOwnerRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharingOwnerRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharingOwnerRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharingTerritoryRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharingTerritoryRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharingTerritoryRules(), i);
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
        new org.apache.axis.description.TypeDesc(SharingRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharingCriteriaRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharingCriteriaRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingCriteriaRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharingOwnerRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharingOwnerRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingOwnerRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharingTerritoryRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharingTerritoryRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingTerritoryRule"));
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
