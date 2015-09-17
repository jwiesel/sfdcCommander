/**
 * FlowWaitEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowWaitEvent  extends com.sforce.soap._2006._04.metadata.FlowElement  implements java.io.Serializable {
    private java.lang.String conditionLogic;

    private com.sforce.soap._2006._04.metadata.FlowCondition[] conditions;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private java.lang.String eventType;

    private com.sforce.soap._2006._04.metadata.FlowWaitEventInputParameter[] inputParameters;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.FlowWaitEventOutputParameter[] outputParameters;

    public FlowWaitEvent() {
    }

    public FlowWaitEvent(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param2,
           java.lang.String description,
           java.lang.String name,
           java.lang.String conditionLogic,
           com.sforce.soap._2006._04.metadata.FlowCondition[] conditions,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           java.lang.String eventType,
           com.sforce.soap._2006._04.metadata.FlowWaitEventInputParameter[] inputParameters,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.FlowWaitEventOutputParameter[] outputParameters) {
        super(
            param2,
            description,
            name);
        this.conditionLogic = conditionLogic;
        this.conditions = conditions;
        this.connector = connector;
        this.eventType = eventType;
        this.inputParameters = inputParameters;
        this.label = label;
        this.outputParameters = outputParameters;
    }


    /**
     * Gets the conditionLogic value for this FlowWaitEvent.
     * 
     * @return conditionLogic
     */
    public java.lang.String getConditionLogic() {
        return conditionLogic;
    }


    /**
     * Sets the conditionLogic value for this FlowWaitEvent.
     * 
     * @param conditionLogic
     */
    public void setConditionLogic(java.lang.String conditionLogic) {
        this.conditionLogic = conditionLogic;
    }


    /**
     * Gets the conditions value for this FlowWaitEvent.
     * 
     * @return conditions
     */
    public com.sforce.soap._2006._04.metadata.FlowCondition[] getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this FlowWaitEvent.
     * 
     * @param conditions
     */
    public void setConditions(com.sforce.soap._2006._04.metadata.FlowCondition[] conditions) {
        this.conditions = conditions;
    }

    public com.sforce.soap._2006._04.metadata.FlowCondition getConditions(int i) {
        return this.conditions[i];
    }

    public void setConditions(int i, com.sforce.soap._2006._04.metadata.FlowCondition _value) {
        this.conditions[i] = _value;
    }


    /**
     * Gets the connector value for this FlowWaitEvent.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowWaitEvent.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the eventType value for this FlowWaitEvent.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this FlowWaitEvent.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the inputParameters value for this FlowWaitEvent.
     * 
     * @return inputParameters
     */
    public com.sforce.soap._2006._04.metadata.FlowWaitEventInputParameter[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this FlowWaitEvent.
     * 
     * @param inputParameters
     */
    public void setInputParameters(com.sforce.soap._2006._04.metadata.FlowWaitEventInputParameter[] inputParameters) {
        this.inputParameters = inputParameters;
    }

    public com.sforce.soap._2006._04.metadata.FlowWaitEventInputParameter getInputParameters(int i) {
        return this.inputParameters[i];
    }

    public void setInputParameters(int i, com.sforce.soap._2006._04.metadata.FlowWaitEventInputParameter _value) {
        this.inputParameters[i] = _value;
    }


    /**
     * Gets the label value for this FlowWaitEvent.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this FlowWaitEvent.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the outputParameters value for this FlowWaitEvent.
     * 
     * @return outputParameters
     */
    public com.sforce.soap._2006._04.metadata.FlowWaitEventOutputParameter[] getOutputParameters() {
        return outputParameters;
    }


    /**
     * Sets the outputParameters value for this FlowWaitEvent.
     * 
     * @param outputParameters
     */
    public void setOutputParameters(com.sforce.soap._2006._04.metadata.FlowWaitEventOutputParameter[] outputParameters) {
        this.outputParameters = outputParameters;
    }

    public com.sforce.soap._2006._04.metadata.FlowWaitEventOutputParameter getOutputParameters(int i) {
        return this.outputParameters[i];
    }

    public void setOutputParameters(int i, com.sforce.soap._2006._04.metadata.FlowWaitEventOutputParameter _value) {
        this.outputParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowWaitEvent)) return false;
        FlowWaitEvent other = (FlowWaitEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conditionLogic==null && other.getConditionLogic()==null) || 
             (this.conditionLogic!=null &&
              this.conditionLogic.equals(other.getConditionLogic()))) &&
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              java.util.Arrays.equals(this.conditions, other.getConditions()))) &&
            ((this.connector==null && other.getConnector()==null) || 
             (this.connector!=null &&
              this.connector.equals(other.getConnector()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.inputParameters==null && other.getInputParameters()==null) || 
             (this.inputParameters!=null &&
              java.util.Arrays.equals(this.inputParameters, other.getInputParameters()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
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
        if (getConditionLogic() != null) {
            _hashCode += getConditionLogic().hashCode();
        }
        if (getConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConditions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnector() != null) {
            _hashCode += getConnector().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
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
        new org.apache.axis.description.TypeDesc(FlowWaitEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowWaitEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLogic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "conditionLogic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowWaitEventInputParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowWaitEventOutputParameter"));
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
