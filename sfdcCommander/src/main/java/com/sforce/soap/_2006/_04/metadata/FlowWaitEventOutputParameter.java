/**
 * FlowWaitEventOutputParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowWaitEventOutputParameter implements java.io.Serializable {
    private java.lang.String assignToReference;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement; // attribute

    private FlowMetadataValue[] param1;

    public FlowWaitEventOutputParameter() {
    }

    public FlowWaitEventOutputParameter(
            com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param1,
            java.lang.String assignToReference, java.lang.String name) {
        this.param1 = param1;
        this.assignToReference = assignToReference;
        this.name = name;
    }

    /**
     * Gets the assignToReference value for this FlowWaitEventOutputParameter.
     * 
     * @return assignToReference
     */
    public java.lang.String getAssignToReference() {
        return assignToReference;
    }

    /**
     * Sets the assignToReference value for this FlowWaitEventOutputParameter.
     * 
     * @param assignToReference
     */
    public void setAssignToReference(java.lang.String assignToReference) {
        this.assignToReference = assignToReference;
    }

    /**
     * Gets the name value for this FlowWaitEventOutputParameter.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this FlowWaitEventOutputParameter.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the flowBaseElement value for this FlowWaitEventOutputParameter.
     * 
     * @return flowBaseElement
     */
    public com.sforce.soap._2006._04.metadata.FlowMetadataValue[] getFlowBaseElement() {
        return flowBaseElement;
    }

    /**
     * Sets the flowBaseElement value for this FlowWaitEventOutputParameter.
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
        if (!(obj instanceof FlowWaitEventOutputParameter))
            return false;
        FlowWaitEventOutputParameter other = (FlowWaitEventOutputParameter) obj;
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
                && ((this.assignToReference == null
                        && other.getAssignToReference() == null)
                        || (this.assignToReference != null
                                && this.assignToReference
                                        .equals(other.getAssignToReference())))
                && ((this.name == null && other.getName() == null)
                        || (this.name != null
                                && this.name.equals(other.getName())))
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
        if (getAssignToReference() != null) {
            _hashCode += getAssignToReference().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
            FlowWaitEventOutputParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata",
                "FlowWaitEventOutputParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignToReference");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata",
                "assignToReference"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
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
