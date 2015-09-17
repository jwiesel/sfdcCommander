/**
 * CustomConsoleComponents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomConsoleComponents  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.Container[] primaryTabComponents;

    private com.sforce.soap._2006._04.metadata.Container[] subtabComponents;

    public CustomConsoleComponents() {
    }

    public CustomConsoleComponents(
           com.sforce.soap._2006._04.metadata.Container[] primaryTabComponents,
           com.sforce.soap._2006._04.metadata.Container[] subtabComponents) {
           this.primaryTabComponents = primaryTabComponents;
           this.subtabComponents = subtabComponents;
    }


    /**
     * Gets the primaryTabComponents value for this CustomConsoleComponents.
     * 
     * @return primaryTabComponents
     */
    public com.sforce.soap._2006._04.metadata.Container[] getPrimaryTabComponents() {
        return primaryTabComponents;
    }


    /**
     * Sets the primaryTabComponents value for this CustomConsoleComponents.
     * 
     * @param primaryTabComponents
     */
    public void setPrimaryTabComponents(com.sforce.soap._2006._04.metadata.Container[] primaryTabComponents) {
        this.primaryTabComponents = primaryTabComponents;
    }


    /**
     * Gets the subtabComponents value for this CustomConsoleComponents.
     * 
     * @return subtabComponents
     */
    public com.sforce.soap._2006._04.metadata.Container[] getSubtabComponents() {
        return subtabComponents;
    }


    /**
     * Sets the subtabComponents value for this CustomConsoleComponents.
     * 
     * @param subtabComponents
     */
    public void setSubtabComponents(com.sforce.soap._2006._04.metadata.Container[] subtabComponents) {
        this.subtabComponents = subtabComponents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomConsoleComponents)) return false;
        CustomConsoleComponents other = (CustomConsoleComponents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryTabComponents==null && other.getPrimaryTabComponents()==null) || 
             (this.primaryTabComponents!=null &&
              java.util.Arrays.equals(this.primaryTabComponents, other.getPrimaryTabComponents()))) &&
            ((this.subtabComponents==null && other.getSubtabComponents()==null) || 
             (this.subtabComponents!=null &&
              java.util.Arrays.equals(this.subtabComponents, other.getSubtabComponents())));
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
        if (getPrimaryTabComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryTabComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryTabComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubtabComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubtabComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubtabComponents(), i);
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
        new org.apache.axis.description.TypeDesc(CustomConsoleComponents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomConsoleComponents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryTabComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "primaryTabComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Container"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "containers"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtabComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "subtabComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Container"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "containers"));
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
