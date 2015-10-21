/**
 * FlowCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowCondition implements java.io.Serializable {
    private java.lang.String leftValueReference;

    private com.sforce.soap._2006._04.metadata.FlowComparisonOperator operator;

    private com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue rightValue;

    private com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement; // attribute

    private FlowMetadataValue[] param1;

    public FlowCondition() {
    }

    public FlowCondition(
            com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param1,
            java.lang.String leftValueReference,
            com.sforce.soap._2006._04.metadata.FlowComparisonOperator operator,
            com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue rightValue) {
        this.param1 = param1;
        this.leftValueReference = leftValueReference;
        this.operator = operator;
        this.rightValue = rightValue;
    }

    /**
     * Gets the leftValueReference value for this FlowCondition.
     * 
     * @return leftValueReference
     */
    public java.lang.String getLeftValueReference() {
        return leftValueReference;
    }

    /**
     * Sets the leftValueReference value for this FlowCondition.
     * 
     * @param leftValueReference
     */
    public void setLeftValueReference(java.lang.String leftValueReference) {
        this.leftValueReference = leftValueReference;
    }

    /**
     * Gets the operator value for this FlowCondition.
     * 
     * @return operator
     */
    public com.sforce.soap._2006._04.metadata.FlowComparisonOperator getOperator() {
        return operator;
    }

    /**
     * Sets the operator value for this FlowCondition.
     * 
     * @param operator
     */
    public void setOperator(
            com.sforce.soap._2006._04.metadata.FlowComparisonOperator operator) {
        this.operator = operator;
    }

    /**
     * Gets the rightValue value for this FlowCondition.
     * 
     * @return rightValue
     */
    public com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue getRightValue() {
        return rightValue;
    }

    /**
     * Sets the rightValue value for this FlowCondition.
     * 
     * @param rightValue
     */
    public void setRightValue(
            com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue rightValue) {
        this.rightValue = rightValue;
    }

    /**
     * Gets the flowBaseElement value for this FlowCondition.
     * 
     * @return flowBaseElement
     */
    public com.sforce.soap._2006._04.metadata.FlowMetadataValue[] getFlowBaseElement() {
        return flowBaseElement;
    }

    /**
     * Sets the flowBaseElement value for this FlowCondition.
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
        if (!(obj instanceof FlowCondition))
            return false;
        FlowCondition other = (FlowCondition) obj;
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
                && ((this.leftValueReference == null
                        && other.getLeftValueReference() == null)
                        || (this.leftValueReference != null
                                && this.leftValueReference
                                        .equals(other.getLeftValueReference())))
                && ((this.operator == null && other.getOperator() == null)
                        || (this.operator != null
                                && this.operator.equals(other.getOperator())))
                && ((this.rightValue == null && other.getRightValue() == null)
                        || (this.rightValue != null && this.rightValue
                                .equals(other.getRightValue())))
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
        if (getLeftValueReference() != null) {
            _hashCode += getLeftValueReference().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getRightValue() != null) {
            _hashCode += getRightValue().hashCode();
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
            FlowCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "FlowCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftValueReference");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata",
                "leftValueReference"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata",
                "FlowComparisonOperator"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightValue");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "rightValue"));
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
