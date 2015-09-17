/**
 * FlowApexPluginCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowApexPluginCall  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private java.lang.String apexClass;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private com.sforce.soap._2006._04.metadata.FlowConnector faultConnector;

    private com.sforce.soap._2006._04.metadata.FlowApexPluginCallInputParameter[] inputParameters;

    private com.sforce.soap._2006._04.metadata.FlowApexPluginCallOutputParameter[] outputParameters;

    public FlowApexPluginCall() {
    }

    public FlowApexPluginCall(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           java.lang.String apexClass,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           com.sforce.soap._2006._04.metadata.FlowConnector faultConnector,
           com.sforce.soap._2006._04.metadata.FlowApexPluginCallInputParameter[] inputParameters,
           com.sforce.soap._2006._04.metadata.FlowApexPluginCallOutputParameter[] outputParameters) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.apexClass = apexClass;
        this.connector = connector;
        this.faultConnector = faultConnector;
        this.inputParameters = inputParameters;
        this.outputParameters = outputParameters;
    }


    /**
     * Gets the apexClass value for this FlowApexPluginCall.
     * 
     * @return apexClass
     */
    public java.lang.String getApexClass() {
        return apexClass;
    }


    /**
     * Sets the apexClass value for this FlowApexPluginCall.
     * 
     * @param apexClass
     */
    public void setApexClass(java.lang.String apexClass) {
        this.apexClass = apexClass;
    }


    /**
     * Gets the connector value for this FlowApexPluginCall.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowApexPluginCall.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the faultConnector value for this FlowApexPluginCall.
     * 
     * @return faultConnector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getFaultConnector() {
        return faultConnector;
    }


    /**
     * Sets the faultConnector value for this FlowApexPluginCall.
     * 
     * @param faultConnector
     */
    public void setFaultConnector(com.sforce.soap._2006._04.metadata.FlowConnector faultConnector) {
        this.faultConnector = faultConnector;
    }


    /**
     * Gets the inputParameters value for this FlowApexPluginCall.
     * 
     * @return inputParameters
     */
    public com.sforce.soap._2006._04.metadata.FlowApexPluginCallInputParameter[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this FlowApexPluginCall.
     * 
     * @param inputParameters
     */
    public void setInputParameters(com.sforce.soap._2006._04.metadata.FlowApexPluginCallInputParameter[] inputParameters) {
        this.inputParameters = inputParameters;
    }

    public com.sforce.soap._2006._04.metadata.FlowApexPluginCallInputParameter getInputParameters(int i) {
        return this.inputParameters[i];
    }

    public void setInputParameters(int i, com.sforce.soap._2006._04.metadata.FlowApexPluginCallInputParameter _value) {
        this.inputParameters[i] = _value;
    }


    /**
     * Gets the outputParameters value for this FlowApexPluginCall.
     * 
     * @return outputParameters
     */
    public com.sforce.soap._2006._04.metadata.FlowApexPluginCallOutputParameter[] getOutputParameters() {
        return outputParameters;
    }


    /**
     * Sets the outputParameters value for this FlowApexPluginCall.
     * 
     * @param outputParameters
     */
    public void setOutputParameters(com.sforce.soap._2006._04.metadata.FlowApexPluginCallOutputParameter[] outputParameters) {
        this.outputParameters = outputParameters;
    }

    public com.sforce.soap._2006._04.metadata.FlowApexPluginCallOutputParameter getOutputParameters(int i) {
        return this.outputParameters[i];
    }

    public void setOutputParameters(int i, com.sforce.soap._2006._04.metadata.FlowApexPluginCallOutputParameter _value) {
        this.outputParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowApexPluginCall)) return false;
        FlowApexPluginCall other = (FlowApexPluginCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apexClass==null && other.getApexClass()==null) || 
             (this.apexClass!=null &&
              this.apexClass.equals(other.getApexClass()))) &&
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
        if (getApexClass() != null) {
            _hashCode += getApexClass().hashCode();
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
        new org.apache.axis.description.TypeDesc(FlowApexPluginCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowApexPluginCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apexClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowApexPluginCallInputParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowApexPluginCallOutputParameter"));
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
