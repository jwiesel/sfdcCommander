/**
 * DataPipeline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DataPipeline  extends com.sforce.soap._2006._04.metadata.MetadataWithContent  implements java.io.Serializable {
    private double apiVersion;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.DataPipelineType scriptType;

    public DataPipeline() {
    }

    public DataPipeline(
           java.lang.String fullName,
           byte[] content,
           double apiVersion,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.DataPipelineType scriptType) {
        super(
            fullName,
            content);
        this.apiVersion = apiVersion;
        this.label = label;
        this.scriptType = scriptType;
    }


    /**
     * Gets the apiVersion value for this DataPipeline.
     * 
     * @return apiVersion
     */
    public double getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this DataPipeline.
     * 
     * @param apiVersion
     */
    public void setApiVersion(double apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the label value for this DataPipeline.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DataPipeline.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the scriptType value for this DataPipeline.
     * 
     * @return scriptType
     */
    public com.sforce.soap._2006._04.metadata.DataPipelineType getScriptType() {
        return scriptType;
    }


    /**
     * Sets the scriptType value for this DataPipeline.
     * 
     * @param scriptType
     */
    public void setScriptType(com.sforce.soap._2006._04.metadata.DataPipelineType scriptType) {
        this.scriptType = scriptType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataPipeline)) return false;
        DataPipeline other = (DataPipeline) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.apiVersion == other.getApiVersion() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.scriptType==null && other.getScriptType()==null) || 
             (this.scriptType!=null &&
              this.scriptType.equals(other.getScriptType())));
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
        _hashCode += new Double(getApiVersion()).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getScriptType() != null) {
            _hashCode += getScriptType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataPipeline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataPipeline"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scriptType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataPipelineType"));
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
