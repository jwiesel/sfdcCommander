/**
 * FlowDecision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowDecision  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowConnector defaultConnector;

    private java.lang.String defaultConnectorLabel;

    private com.sforce.soap._2006._04.metadata.FlowRule[] rules;

    public FlowDecision() {
    }

    public FlowDecision(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           com.sforce.soap._2006._04.metadata.FlowConnector defaultConnector,
           java.lang.String defaultConnectorLabel,
           com.sforce.soap._2006._04.metadata.FlowRule[] rules) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.defaultConnector = defaultConnector;
        this.defaultConnectorLabel = defaultConnectorLabel;
        this.rules = rules;
    }


    /**
     * Gets the defaultConnector value for this FlowDecision.
     * 
     * @return defaultConnector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getDefaultConnector() {
        return defaultConnector;
    }


    /**
     * Sets the defaultConnector value for this FlowDecision.
     * 
     * @param defaultConnector
     */
    public void setDefaultConnector(com.sforce.soap._2006._04.metadata.FlowConnector defaultConnector) {
        this.defaultConnector = defaultConnector;
    }


    /**
     * Gets the defaultConnectorLabel value for this FlowDecision.
     * 
     * @return defaultConnectorLabel
     */
    public java.lang.String getDefaultConnectorLabel() {
        return defaultConnectorLabel;
    }


    /**
     * Sets the defaultConnectorLabel value for this FlowDecision.
     * 
     * @param defaultConnectorLabel
     */
    public void setDefaultConnectorLabel(java.lang.String defaultConnectorLabel) {
        this.defaultConnectorLabel = defaultConnectorLabel;
    }


    /**
     * Gets the rules value for this FlowDecision.
     * 
     * @return rules
     */
    public com.sforce.soap._2006._04.metadata.FlowRule[] getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this FlowDecision.
     * 
     * @param rules
     */
    public void setRules(com.sforce.soap._2006._04.metadata.FlowRule[] rules) {
        this.rules = rules;
    }

    public com.sforce.soap._2006._04.metadata.FlowRule getRules(int i) {
        return this.rules[i];
    }

    public void setRules(int i, com.sforce.soap._2006._04.metadata.FlowRule _value) {
        this.rules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowDecision)) return false;
        FlowDecision other = (FlowDecision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultConnector==null && other.getDefaultConnector()==null) || 
             (this.defaultConnector!=null &&
              this.defaultConnector.equals(other.getDefaultConnector()))) &&
            ((this.defaultConnectorLabel==null && other.getDefaultConnectorLabel()==null) || 
             (this.defaultConnectorLabel!=null &&
              this.defaultConnectorLabel.equals(other.getDefaultConnectorLabel()))) &&
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              java.util.Arrays.equals(this.rules, other.getRules())));
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
        if (getDefaultConnector() != null) {
            _hashCode += getDefaultConnector().hashCode();
        }
        if (getDefaultConnectorLabel() != null) {
            _hashCode += getDefaultConnectorLabel().hashCode();
        }
        if (getRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRules(), i);
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
        new org.apache.axis.description.TypeDesc(FlowDecision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDecision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultConnectorLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultConnectorLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRule"));
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
