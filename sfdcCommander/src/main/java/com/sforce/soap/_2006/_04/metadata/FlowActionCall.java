/**
 * FlowActionCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowActionCall  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private java.lang.String actionName;

    private com.sforce.soap._2006._04.metadata.InvocableActionType actionType;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private com.sforce.soap._2006._04.metadata.FlowConnector faultConnector;

    private com.sforce.soap._2006._04.metadata.FlowActionCallInputParameter[] inputParameters;

    private com.sforce.soap._2006._04.metadata.FlowActionCallOutputParameter[] outputParameters;

    public FlowActionCall() {
    }

    public FlowActionCall(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           java.lang.String actionName,
           com.sforce.soap._2006._04.metadata.InvocableActionType actionType,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           com.sforce.soap._2006._04.metadata.FlowConnector faultConnector,
           com.sforce.soap._2006._04.metadata.FlowActionCallInputParameter[] inputParameters,
           com.sforce.soap._2006._04.metadata.FlowActionCallOutputParameter[] outputParameters) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.actionName = actionName;
        this.actionType = actionType;
        this.connector = connector;
        this.faultConnector = faultConnector;
        this.inputParameters = inputParameters;
        this.outputParameters = outputParameters;
    }


    /**
     * Gets the actionName value for this FlowActionCall.
     * 
     * @return actionName
     */
    public java.lang.String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this FlowActionCall.
     * 
     * @param actionName
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the actionType value for this FlowActionCall.
     * 
     * @return actionType
     */
    public com.sforce.soap._2006._04.metadata.InvocableActionType getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this FlowActionCall.
     * 
     * @param actionType
     */
    public void setActionType(com.sforce.soap._2006._04.metadata.InvocableActionType actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the connector value for this FlowActionCall.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowActionCall.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the faultConnector value for this FlowActionCall.
     * 
     * @return faultConnector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getFaultConnector() {
        return faultConnector;
    }


    /**
     * Sets the faultConnector value for this FlowActionCall.
     * 
     * @param faultConnector
     */
    public void setFaultConnector(com.sforce.soap._2006._04.metadata.FlowConnector faultConnector) {
        this.faultConnector = faultConnector;
    }


    /**
     * Gets the inputParameters value for this FlowActionCall.
     * 
     * @return inputParameters
     */
    public com.sforce.soap._2006._04.metadata.FlowActionCallInputParameter[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this FlowActionCall.
     * 
     * @param inputParameters
     */
    public void setInputParameters(com.sforce.soap._2006._04.metadata.FlowActionCallInputParameter[] inputParameters) {
        this.inputParameters = inputParameters;
    }

    public com.sforce.soap._2006._04.metadata.FlowActionCallInputParameter getInputParameters(int i) {
        return this.inputParameters[i];
    }

    public void setInputParameters(int i, com.sforce.soap._2006._04.metadata.FlowActionCallInputParameter _value) {
        this.inputParameters[i] = _value;
    }


    /**
     * Gets the outputParameters value for this FlowActionCall.
     * 
     * @return outputParameters
     */
    public com.sforce.soap._2006._04.metadata.FlowActionCallOutputParameter[] getOutputParameters() {
        return outputParameters;
    }


    /**
     * Sets the outputParameters value for this FlowActionCall.
     * 
     * @param outputParameters
     */
    public void setOutputParameters(com.sforce.soap._2006._04.metadata.FlowActionCallOutputParameter[] outputParameters) {
        this.outputParameters = outputParameters;
    }

    public com.sforce.soap._2006._04.metadata.FlowActionCallOutputParameter getOutputParameters(int i) {
        return this.outputParameters[i];
    }

    public void setOutputParameters(int i, com.sforce.soap._2006._04.metadata.FlowActionCallOutputParameter _value) {
        this.outputParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowActionCall)) return false;
        FlowActionCall other = (FlowActionCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionName==null && other.getActionName()==null) || 
             (this.actionName!=null &&
              this.actionName.equals(other.getActionName()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.connector==null && other.getConnector()==null) || 
             (this.connector!=null &&
              this.connector.equals(other.getConnector()))) &&
            ((this.faultConnector==null && other.getFaultConnector()==null) || 
             (this.faultConnector!=null &&
              this.faultConnector.equals(other.getFaultConnector()))) &&
            ((this.inputParameters==null && other.getInputParameters()==null) || 
             (this.inputParameters!=null &&
              java.util.Arrays.equals(this.inputParameters, other.getInputParameters()))) &&
            ((this.outputParameters==null && other.getOutputParameters()==null) || 
             (this.outputParameters!=null &&
              java.util.Arrays.equals(this.outputParameters, other.getOutputParameters())));
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
        if (getActionName() != null) {
            _hashCode += getActionName().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getConnector() != null) {
            _hashCode += getConnector().hashCode();
        }
        if (getFaultConnector() != null) {
            _hashCode += getFaultConnector().hashCode();
        }
        if (getInputParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputParameters(), i);
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
        new org.apache.axis.description.TypeDesc(FlowActionCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowActionCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "InvocableActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "faultConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowActionCallInputParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowActionCallOutputParameter"));
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
