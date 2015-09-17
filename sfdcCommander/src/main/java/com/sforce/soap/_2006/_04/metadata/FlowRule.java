/**
 * FlowRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowRule  extends com.sforce.soap._2006._04.metadata.FlowElement  implements java.io.Serializable {
    private java.lang.String conditionLogic;

    private com.sforce.soap._2006._04.metadata.FlowCondition[] conditions;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private java.lang.String label;

    public FlowRule() {
    }

    public FlowRule(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param2,
           java.lang.String description,
           java.lang.String name,
           java.lang.String conditionLogic,
           com.sforce.soap._2006._04.metadata.FlowCondition[] conditions,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           java.lang.String label) {
        super(
            param2,
            description,
            name);
        this.conditionLogic = conditionLogic;
        this.conditions = conditions;
        this.connector = connector;
        this.label = label;
    }


    /**
     * Gets the conditionLogic value for this FlowRule.
     * 
     * @return conditionLogic
     */
    public java.lang.String getConditionLogic() {
        return conditionLogic;
    }


    /**
     * Sets the conditionLogic value for this FlowRule.
     * 
     * @param conditionLogic
     */
    public void setConditionLogic(java.lang.String conditionLogic) {
        this.conditionLogic = conditionLogic;
    }


    /**
     * Gets the conditions value for this FlowRule.
     * 
     * @return conditions
     */
    public com.sforce.soap._2006._04.metadata.FlowCondition[] getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this FlowRule.
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
     * Gets the connector value for this FlowRule.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowRule.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the label value for this FlowRule.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this FlowRule.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowRule)) return false;
        FlowRule other = (FlowRule) obj;
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
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLogic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "conditionLogic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
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
