/**
 * CustomApplicationComponents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomApplicationComponents  implements java.io.Serializable {
    private java.lang.String alignment;

    private java.lang.String[] customApplicationComponent;

    public CustomApplicationComponents() {
    }

    public CustomApplicationComponents(
           java.lang.String alignment,
           java.lang.String[] customApplicationComponent) {
           this.alignment = alignment;
           this.customApplicationComponent = customApplicationComponent;
    }


    /**
     * Gets the alignment value for this CustomApplicationComponents.
     * 
     * @return alignment
     */
    public java.lang.String getAlignment() {
        return alignment;
    }


    /**
     * Sets the alignment value for this CustomApplicationComponents.
     * 
     * @param alignment
     */
    public void setAlignment(java.lang.String alignment) {
        this.alignment = alignment;
    }


    /**
     * Gets the customApplicationComponent value for this CustomApplicationComponents.
     * 
     * @return customApplicationComponent
     */
    public java.lang.String[] getCustomApplicationComponent() {
        return customApplicationComponent;
    }


    /**
     * Sets the customApplicationComponent value for this CustomApplicationComponents.
     * 
     * @param customApplicationComponent
     */
    public void setCustomApplicationComponent(java.lang.String[] customApplicationComponent) {
        this.customApplicationComponent = customApplicationComponent;
    }

    public java.lang.String getCustomApplicationComponent(int i) {
        return this.customApplicationComponent[i];
    }

    public void setCustomApplicationComponent(int i, java.lang.String _value) {
        this.customApplicationComponent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomApplicationComponents)) return false;
        CustomApplicationComponents other = (CustomApplicationComponents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alignment==null && other.getAlignment()==null) || 
             (this.alignment!=null &&
              this.alignment.equals(other.getAlignment()))) &&
            ((this.customApplicationComponent==null && other.getCustomApplicationComponent()==null) || 
             (this.customApplicationComponent!=null &&
              java.util.Arrays.equals(this.customApplicationComponent, other.getCustomApplicationComponent())));
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
        if (getAlignment() != null) {
            _hashCode += getAlignment().hashCode();
        }
        if (getCustomApplicationComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomApplicationComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomApplicationComponent(), i);
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
        new org.apache.axis.description.TypeDesc(CustomApplicationComponents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplicationComponents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "alignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customApplicationComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customApplicationComponent"));
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
