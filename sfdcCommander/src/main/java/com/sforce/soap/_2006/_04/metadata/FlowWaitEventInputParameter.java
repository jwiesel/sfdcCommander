/**
 * FlowWaitEventInputParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowWaitEventInputParameter implements java.io.Serializable {
    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value;

    private com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement; // attribute

    private FlowMetadataValue[] param1;

    public FlowWaitEventInputParameter() {
    }

    public FlowWaitEventInputParameter(
            com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param1,
            java.lang.String name,
            com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value) {
        this.param1 = param1;
        this.name = name;
        this.value = value;
    }

    /**
     * Gets the name value for this FlowWaitEventInputParameter.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this FlowWaitEventInputParameter.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the value value for this FlowWaitEventInputParameter.
     * 
     * @return value
     */
    public com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue getValue() {
        return value;
    }

    /**
     * Sets the value value for this FlowWaitEventInputParameter.
     * 
     * @param value
     */
    public void setValue(
            com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value) {
        this.value = value;
    }

    /**
     * Gets the flowBaseElement value for this FlowWaitEventInputParameter.
     * 
     * @return flowBaseElement
     */
    public com.sforce.soap._2006._04.metadata.FlowMetadataValue[] getFlowBaseElement() {
        return flowBaseElement;
    }

    /**
     * Sets the flowBaseElement value for this FlowWaitEventInputParameter.
     * 
     * @param flowBaseElement
     */
    public void setFlowBaseElement(
            com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement) {
        this.flowBaseElement = flowBaseElement;
    }

    private java.lang.Object __equalsCalc = null;

    @Override
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowWaitEventInputParameter))
            return false;
        FlowWaitEventInputParameter other = (FlowWaitEventInputParameter) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj)
                && ((this.name == null && other.getName() == null)
                        || (this.name != null
                                && this.name.equals(other.getName())))
                && ((this.value == null && other.getValue() == null)
                        || (this.value != null
                                && this.value.equals(other.getValue())))
                && ((this.flowBaseElement == null
                        && other.getFlowBaseElement() == null)
                        || (this.flowBaseElement != null
                                && java.util.Arrays.equals(this.flowBaseElement,
                                        other.getFlowBaseElement())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    @Override
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getFlowBaseElement() != null) {
            for (int i = 0; i < java.lang.reflect.Array
                    .getLength(getFlowBaseElement()); i++) {
                java.lang.Object obj = java.lang.reflect.Array
                        .get(getFlowBaseElement(), i);
                if (obj != null && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            FlowWaitEventInputParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata",
                "FlowWaitEventInputParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata",
                "FlowElementReferenceOrValue"));
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
            java.lang.String mechType, java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
                _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType, java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
                _xmlType, typeDesc);
    }

}
