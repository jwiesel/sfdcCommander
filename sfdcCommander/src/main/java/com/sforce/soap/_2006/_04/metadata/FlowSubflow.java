/**
 * FlowSubflow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowSubflow  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private java.lang.String flowName;

    private com.sforce.soap._2006._04.metadata.FlowSubflowInputAssignment[] inputAssignments;

    private com.sforce.soap._2006._04.metadata.FlowSubflowOutputAssignment[] outputAssignments;

    public FlowSubflow() {
    }

    public FlowSubflow(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           java.lang.String flowName,
           com.sforce.soap._2006._04.metadata.FlowSubflowInputAssignment[] inputAssignments,
           com.sforce.soap._2006._04.metadata.FlowSubflowOutputAssignment[] outputAssignments) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.connector = connector;
        this.flowName = flowName;
        this.inputAssignments = inputAssignments;
        this.outputAssignments = outputAssignments;
    }


    /**
     * Gets the connector value for this FlowSubflow.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowSubflow.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the flowName value for this FlowSubflow.
     * 
     * @return flowName
     */
    public java.lang.String getFlowName() {
        return flowName;
    }


    /**
     * Sets the flowName value for this FlowSubflow.
     * 
     * @param flowName
     */
    public void setFlowName(java.lang.String flowName) {
        this.flowName = flowName;
    }


    /**
     * Gets the inputAssignments value for this FlowSubflow.
     * 
     * @return inputAssignments
     */
    public com.sforce.soap._2006._04.metadata.FlowSubflowInputAssignment[] getInputAssignments() {
        return inputAssignments;
    }


    /**
     * Sets the inputAssignments value for this FlowSubflow.
     * 
     * @param inputAssignments
     */
    public void setInputAssignments(com.sforce.soap._2006._04.metadata.FlowSubflowInputAssignment[] inputAssignments) {
        this.inputAssignments = inputAssignments;
    }

    public com.sforce.soap._2006._04.metadata.FlowSubflowInputAssignment getInputAssignments(int i) {
        return this.inputAssignments[i];
    }

    public void setInputAssignments(int i, com.sforce.soap._2006._04.metadata.FlowSubflowInputAssignment _value) {
        this.inputAssignments[i] = _value;
    }


    /**
     * Gets the outputAssignments value for this FlowSubflow.
     * 
     * @return outputAssignments
     */
    public com.sforce.soap._2006._04.metadata.FlowSubflowOutputAssignment[] getOutputAssignments() {
        return outputAssignments;
    }


    /**
     * Sets the outputAssignments value for this FlowSubflow.
     * 
     * @param outputAssignments
     */
    public void setOutputAssignments(com.sforce.soap._2006._04.metadata.FlowSubflowOutputAssignment[] outputAssignments) {
        this.outputAssignments = outputAssignments;
    }

    public com.sforce.soap._2006._04.metadata.FlowSubflowOutputAssignment getOutputAssignments(int i) {
        return this.outputAssignments[i];
    }

    public void setOutputAssignments(int i, com.sforce.soap._2006._04.metadata.FlowSubflowOutputAssignment _value) {
        this.outputAssignments[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowSubflow)) return false;
        FlowSubflow other = (FlowSubflow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connector==null && other.getConnector()==null) || 
             (this.connector!=null &&
              this.connector.equals(other.getConnector()))) &&
            ((this.flowName==null && other.getFlowName()==null) || 
             (this.flowName!=null &&
              this.flowName.equals(other.getFlowName()))) &&
            ((this.inputAssignments==null && other.getInputAssignments()==null) || 
             (this.inputAssignments!=null &&
              java.util.Arrays.equals(this.inputAssignments, other.getInputAssignments()))) &&
            ((this.outputAssignments==null && other.getOutputAssignments()==null) || 
             (this.outputAssignments!=null &&
              java.util.Arrays.equals(this.outputAssignments, other.getOutputAssignments())));
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
        if (getConnector() != null) {
            _hashCode += getConnector().hashCode();
        }
        if (getFlowName() != null) {
            _hashCode += getFlowName().hashCode();
        }
        if (getInputAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputAssignments(), i);
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
        new org.apache.axis.description.TypeDesc(FlowSubflow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowSubflow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "flowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inputAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowSubflowInputAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowSubflowOutputAssignment"));
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
