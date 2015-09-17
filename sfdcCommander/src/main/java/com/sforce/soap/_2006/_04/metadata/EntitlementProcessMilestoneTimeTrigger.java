/**
 * EntitlementProcessMilestoneTimeTrigger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EntitlementProcessMilestoneTimeTrigger  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] actions;

    private java.lang.Integer timeLength;

    private com.sforce.soap._2006._04.metadata.MilestoneTimeUnits workflowTimeTriggerUnit;

    public EntitlementProcessMilestoneTimeTrigger() {
    }

    public EntitlementProcessMilestoneTimeTrigger(
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] actions,
           java.lang.Integer timeLength,
           com.sforce.soap._2006._04.metadata.MilestoneTimeUnits workflowTimeTriggerUnit) {
           this.actions = actions;
           this.timeLength = timeLength;
           this.workflowTimeTriggerUnit = workflowTimeTriggerUnit;
    }


    /**
     * Gets the actions value for this EntitlementProcessMilestoneTimeTrigger.
     * 
     * @return actions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this EntitlementProcessMilestoneTimeTrigger.
     * 
     * @param actions
     */
    public void setActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] actions) {
        this.actions = actions;
    }

    public com.sforce.soap._2006._04.metadata.WorkflowActionReference getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.sforce.soap._2006._04.metadata.WorkflowActionReference _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the timeLength value for this EntitlementProcessMilestoneTimeTrigger.
     * 
     * @return timeLength
     */
    public java.lang.Integer getTimeLength() {
        return timeLength;
    }


    /**
     * Sets the timeLength value for this EntitlementProcessMilestoneTimeTrigger.
     * 
     * @param timeLength
     */
    public void setTimeLength(java.lang.Integer timeLength) {
        this.timeLength = timeLength;
    }


    /**
     * Gets the workflowTimeTriggerUnit value for this EntitlementProcessMilestoneTimeTrigger.
     * 
     * @return workflowTimeTriggerUnit
     */
    public com.sforce.soap._2006._04.metadata.MilestoneTimeUnits getWorkflowTimeTriggerUnit() {
        return workflowTimeTriggerUnit;
    }


    /**
     * Sets the workflowTimeTriggerUnit value for this EntitlementProcessMilestoneTimeTrigger.
     * 
     * @param workflowTimeTriggerUnit
     */
    public void setWorkflowTimeTriggerUnit(com.sforce.soap._2006._04.metadata.MilestoneTimeUnits workflowTimeTriggerUnit) {
        this.workflowTimeTriggerUnit = workflowTimeTriggerUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementProcessMilestoneTimeTrigger)) return false;
        EntitlementProcessMilestoneTimeTrigger other = (EntitlementProcessMilestoneTimeTrigger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.timeLength==null && other.getTimeLength()==null) || 
             (this.timeLength!=null &&
              this.timeLength.equals(other.getTimeLength()))) &&
            ((this.workflowTimeTriggerUnit==null && other.getWorkflowTimeTriggerUnit()==null) || 
             (this.workflowTimeTriggerUnit!=null &&
              this.workflowTimeTriggerUnit.equals(other.getWorkflowTimeTriggerUnit())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeLength() != null) {
            _hashCode += getTimeLength().hashCode();
        }
        if (getWorkflowTimeTriggerUnit() != null) {
            _hashCode += getWorkflowTimeTriggerUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementProcessMilestoneTimeTrigger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcessMilestoneTimeTrigger"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "timeLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowTimeTriggerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "workflowTimeTriggerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MilestoneTimeUnits"));
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
