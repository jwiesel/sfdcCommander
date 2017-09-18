/**
 * FlowScreenRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowScreenRule implements java.io.Serializable {
    private java.lang.String conditionLogic;

    private com.sforce.soap._2006._04.metadata.FlowCondition[] conditions;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.FlowScreenRuleAction[] ruleActions;

    private com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement; // attribute

    private FlowMetadataValue[] param1;

    public FlowScreenRule() {
    }

    public FlowScreenRule(
            com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param1,
            java.lang.String conditionLogic,
            com.sforce.soap._2006._04.metadata.FlowCondition[] conditions,
            java.lang.String label,
            com.sforce.soap._2006._04.metadata.FlowScreenRuleAction[] ruleActions) {
        this.param1 = param1;
        this.conditionLogic = conditionLogic;
        this.conditions = conditions;
        this.label = label;
        this.ruleActions = ruleActions;
    }

    /**
     * Gets the conditionLogic value for this FlowScreenRule.
     * 
     * @return conditionLogic
     */
    public java.lang.String getConditionLogic() {
        return conditionLogic;
    }

    /**
     * Sets the conditionLogic value for this FlowScreenRule.
     * 
     * @param conditionLogic
     */
    public void setConditionLogic(java.lang.String conditionLogic) {
        this.conditionLogic = conditionLogic;
    }

    /**
     * Gets the conditions value for this FlowScreenRule.
     * 
     * @return conditions
     */
    public com.sforce.soap._2006._04.metadata.FlowCondition[] getConditions() {
        return conditions;
    }

    /**
     * Sets the conditions value for this FlowScreenRule.
     * 
     * @param conditions
     */
    public void setConditions(
            com.sforce.soap._2006._04.metadata.FlowCondition[] conditions) {
        this.conditions = conditions;
    }

    public com.sforce.soap._2006._04.metadata.FlowCondition getConditions(
            int i) {
        return this.conditions[i];
    }

    public void setConditions(int i,
            com.sforce.soap._2006._04.metadata.FlowCondition _value) {
        this.conditions[i] = _value;
    }

    /**
     * Gets the label value for this FlowScreenRule.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }

    /**
     * Sets the label value for this FlowScreenRule.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    /**
     * Gets the ruleActions value for this FlowScreenRule.
     * 
     * @return ruleActions
     */
    public com.sforce.soap._2006._04.metadata.FlowScreenRuleAction[] getRuleActions() {
        return ruleActions;
    }

    /**
     * Sets the ruleActions value for this FlowScreenRule.
     * 
     * @param ruleActions
     */
    public void setRuleActions(
            com.sforce.soap._2006._04.metadata.FlowScreenRuleAction[] ruleActions) {
        this.ruleActions = ruleActions;
    }

    public com.sforce.soap._2006._04.metadata.FlowScreenRuleAction getRuleActions(
            int i) {
        return this.ruleActions[i];
    }

    public void setRuleActions(int i,
            com.sforce.soap._2006._04.metadata.FlowScreenRuleAction _value) {
        this.ruleActions[i] = _value;
    }

    /**
     * Gets the flowBaseElement value for this FlowScreenRule.
     * 
     * @return flowBaseElement
     */
    public com.sforce.soap._2006._04.metadata.FlowMetadataValue[] getFlowBaseElement() {
        return flowBaseElement;
    }

    /**
     * Sets the flowBaseElement value for this FlowScreenRule.
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
        if (!(obj instanceof FlowScreenRule))
            return false;
        FlowScreenRule other = (FlowScreenRule) obj;
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
                && ((this.conditionLogic == null
                        && other.getConditionLogic() == null)
                        || (this.conditionLogic != null && this.conditionLogic
                                .equals(other.getConditionLogic())))
                && ((this.conditions == null && other.getConditions() == null)
                        || (this.conditions != null && java.util.Arrays.equals(
                                this.conditions, other.getConditions())))
                && ((this.label == null && other.getLabel() == null)
                        || (this.label != null
                                && this.label.equals(other.getLabel())))
                && ((this.ruleActions == null && other.getRuleActions() == null)
                        || (this.ruleActions != null && java.util.Arrays.equals(
                                this.ruleActions, other.getRuleActions())))
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
        if (getConditionLogic() != null) {
            _hashCode += getConditionLogic().hashCode();
        }
        if (getConditions() != null) {
            for (int i = 0; i < java.lang.reflect.Array
                    .getLength(getConditions()); i++) {
                java.lang.Object obj = java.lang.reflect.Array
                        .get(getConditions(), i);
                if (obj != null && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getRuleActions() != null) {
            for (int i = 0; i < java.lang.reflect.Array
                    .getLength(getRuleActions()); i++) {
                java.lang.Object obj = java.lang.reflect.Array
                        .get(getRuleActions(), i);
                if (obj != null && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
            FlowScreenRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "FlowScreenRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLogic");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "conditionLogic"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "FlowCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleActions");
        elemField.setXmlName(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata", "ruleActions"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://soap.sforce.com/2006/04/metadata",
                "FlowScreenRuleAction"));
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
