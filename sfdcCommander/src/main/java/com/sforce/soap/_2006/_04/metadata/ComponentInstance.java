/**
 * ComponentInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ComponentInstance  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ComponentInstanceProperty[] componentInstanceProperties;

    private java.lang.String componentName;

    public ComponentInstance() {
    }

    public ComponentInstance(
           com.sforce.soap._2006._04.metadata.ComponentInstanceProperty[] componentInstanceProperties,
           java.lang.String componentName) {
           this.componentInstanceProperties = componentInstanceProperties;
           this.componentName = componentName;
    }


    /**
     * Gets the componentInstanceProperties value for this ComponentInstance.
     * 
     * @return componentInstanceProperties
     */
    public com.sforce.soap._2006._04.metadata.ComponentInstanceProperty[] getComponentInstanceProperties() {
        return componentInstanceProperties;
    }


    /**
     * Sets the componentInstanceProperties value for this ComponentInstance.
     * 
     * @param componentInstanceProperties
     */
    public void setComponentInstanceProperties(com.sforce.soap._2006._04.metadata.ComponentInstanceProperty[] componentInstanceProperties) {
        this.componentInstanceProperties = componentInstanceProperties;
    }

    public com.sforce.soap._2006._04.metadata.ComponentInstanceProperty getComponentInstanceProperties(int i) {
        return this.componentInstanceProperties[i];
    }

    public void setComponentInstanceProperties(int i, com.sforce.soap._2006._04.metadata.ComponentInstanceProperty _value) {
        this.componentInstanceProperties[i] = _value;
    }


    /**
     * Gets the componentName value for this ComponentInstance.
     * 
     * @return componentName
     */
    public java.lang.String getComponentName() {
        return componentName;
    }


    /**
     * Sets the componentName value for this ComponentInstance.
     * 
     * @param componentName
     */
    public void setComponentName(java.lang.String componentName) {
        this.componentName = componentName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComponentInstance)) return false;
        ComponentInstance other = (ComponentInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.componentInstanceProperties==null && other.getComponentInstanceProperties()==null) || 
             (this.componentInstanceProperties!=null &&
              java.util.Arrays.equals(this.componentInstanceProperties, other.getComponentInstanceProperties()))) &&
            ((this.componentName==null && other.getComponentName()==null) || 
             (this.componentName!=null &&
              this.componentName.equals(other.getComponentName())));
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
        if (getComponentInstanceProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentInstanceProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentInstanceProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentName() != null) {
            _hashCode += getComponentName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComponentInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ComponentInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentInstanceProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "componentInstanceProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ComponentInstanceProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "componentName"));
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
