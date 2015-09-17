/**
 * FlowStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowStep  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowConnector[] connectors;

    public FlowStep() {
    }

    public FlowStep(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           com.sforce.soap._2006._04.metadata.FlowConnector[] connectors) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.connectors = connectors;
    }


    /**
     * Gets the connectors value for this FlowStep.
     * 
     * @return connectors
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector[] getConnectors() {
        return connectors;
    }


    /**
     * Sets the connectors value for this FlowStep.
     * 
     * @param connectors
     */
    public void setConnectors(com.sforce.soap._2006._04.metadata.FlowConnector[] connectors) {
        this.connectors = connectors;
    }

    public com.sforce.soap._2006._04.metadata.FlowConnector getConnectors(int i) {
        return this.connectors[i];
    }

    public void setConnectors(int i, com.sforce.soap._2006._04.metadata.FlowConnector _value) {
        this.connectors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowStep)) return false;
        FlowStep other = (FlowStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connectors==null && other.getConnectors()==null) || 
             (this.connectors!=null &&
              java.util.Arrays.equals(this.connectors, other.getConnectors())));
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
        if (getConnectors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectors(), i);
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
        new org.apache.axis.description.TypeDesc(FlowStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
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
