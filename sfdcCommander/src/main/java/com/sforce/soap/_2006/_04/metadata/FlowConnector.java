/**
 * FlowConnector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowConnector  implements java.io.Serializable {
    private java.lang.String targetReference;

    private com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement;  // attribute

    public FlowConnector() {
    }

    public FlowConnector(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param1,
           java.lang.String targetReference) {
        this.param1 = param1;
        this.targetReference = targetReference;
    }


    /**
     * Gets the targetReference value for this FlowConnector.
     * 
     * @return targetReference
     */
    public java.lang.String getTargetReference() {
        return targetReference;
    }


    /**
     * Sets the targetReference value for this FlowConnector.
     * 
     * @param targetReference
     */
    public void setTargetReference(java.lang.String targetReference) {
        this.targetReference = targetReference;
    }


    /**
     * Gets the flowBaseElement value for this FlowConnector.
     * 
     * @return flowBaseElement
     */
    public com.sforce.soap._2006._04.metadata.FlowMetadataValue[] getFlowBaseElement() {
        return flowBaseElement;
    }


    /**
     * Sets the flowBaseElement value for this FlowConnector.
     * 
     * @param flowBaseElement
     */
    public void setFlowBaseElement(com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement) {
        this.flowBaseElement = flowBaseElement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowConnector)) return false;
        FlowConnector other = (FlowConnector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetReference==null && other.getTargetReference()==null) || 
             (this.targetReference!=null &&
              this.targetReference.equals(other.getTargetReference()))) &&
            ((this.flowBaseElement==null && other.getFlowBaseElement()==null) || 
             (this.flowBaseElement!=null &&
              java.util.Arrays.equals(this.flowBaseElement, other.getFlowBaseElement())));
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
        if (getTargetReference() != null) {
            _hashCode += getTargetReference().hashCode();
        }
        if (getFlowBaseElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlowBaseElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlowBaseElement(), i);
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
        new org.apache.axis.description.TypeDesc(FlowConnector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetReference"));
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
