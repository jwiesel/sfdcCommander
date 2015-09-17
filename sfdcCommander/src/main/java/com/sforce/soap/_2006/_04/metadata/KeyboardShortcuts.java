/**
 * KeyboardShortcuts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class KeyboardShortcuts  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CustomShortcut[] customShortcut;

    private com.sforce.soap._2006._04.metadata.DefaultShortcut[] defaultShortcut;

    public KeyboardShortcuts() {
    }

    public KeyboardShortcuts(
           com.sforce.soap._2006._04.metadata.CustomShortcut[] customShortcut,
           com.sforce.soap._2006._04.metadata.DefaultShortcut[] defaultShortcut) {
           this.customShortcut = customShortcut;
           this.defaultShortcut = defaultShortcut;
    }


    /**
     * Gets the customShortcut value for this KeyboardShortcuts.
     * 
     * @return customShortcut
     */
    public com.sforce.soap._2006._04.metadata.CustomShortcut[] getCustomShortcut() {
        return customShortcut;
    }


    /**
     * Sets the customShortcut value for this KeyboardShortcuts.
     * 
     * @param customShortcut
     */
    public void setCustomShortcut(com.sforce.soap._2006._04.metadata.CustomShortcut[] customShortcut) {
        this.customShortcut = customShortcut;
    }

    public com.sforce.soap._2006._04.metadata.CustomShortcut getCustomShortcut(int i) {
        return this.customShortcut[i];
    }

    public void setCustomShortcut(int i, com.sforce.soap._2006._04.metadata.CustomShortcut _value) {
        this.customShortcut[i] = _value;
    }


    /**
     * Gets the defaultShortcut value for this KeyboardShortcuts.
     * 
     * @return defaultShortcut
     */
    public com.sforce.soap._2006._04.metadata.DefaultShortcut[] getDefaultShortcut() {
        return defaultShortcut;
    }


    /**
     * Sets the defaultShortcut value for this KeyboardShortcuts.
     * 
     * @param defaultShortcut
     */
    public void setDefaultShortcut(com.sforce.soap._2006._04.metadata.DefaultShortcut[] defaultShortcut) {
        this.defaultShortcut = defaultShortcut;
    }

    public com.sforce.soap._2006._04.metadata.DefaultShortcut getDefaultShortcut(int i) {
        return this.defaultShortcut[i];
    }

    public void setDefaultShortcut(int i, com.sforce.soap._2006._04.metadata.DefaultShortcut _value) {
        this.defaultShortcut[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyboardShortcuts)) return false;
        KeyboardShortcuts other = (KeyboardShortcuts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customShortcut==null && other.getCustomShortcut()==null) || 
             (this.customShortcut!=null &&
              java.util.Arrays.equals(this.customShortcut, other.getCustomShortcut()))) &&
            ((this.defaultShortcut==null && other.getDefaultShortcut()==null) || 
             (this.defaultShortcut!=null &&
              java.util.Arrays.equals(this.defaultShortcut, other.getDefaultShortcut())));
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
        if (getCustomShortcut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomShortcut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomShortcut(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultShortcut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultShortcut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultShortcut(), i);
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
        new org.apache.axis.description.TypeDesc(KeyboardShortcuts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KeyboardShortcuts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customShortcut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customShortcut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomShortcut"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultShortcut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultShortcut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DefaultShortcut"));
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
