/**
 * WorkflowRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WorkflowRule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] actions;

    private boolean active;

    private java.lang.String booleanFilter;

    private com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems;

    private java.lang.String description;

    private java.lang.String formula;

    private com.sforce.soap._2006._04.metadata.WorkflowTriggerTypes triggerType;

    private com.sforce.soap._2006._04.metadata.WorkflowTimeTrigger[] workflowTimeTriggers;

    public WorkflowRule() {
    }

    public WorkflowRule(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] actions,
           boolean active,
           java.lang.String booleanFilter,
           com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems,
           java.lang.String description,
           java.lang.String formula,
           com.sforce.soap._2006._04.metadata.WorkflowTriggerTypes triggerType,
           com.sforce.soap._2006._04.metadata.WorkflowTimeTrigger[] workflowTimeTriggers) {
        super(
            fullName);
        this.actions = actions;
        this.active = active;
        this.booleanFilter = booleanFilter;
        this.criteriaItems = criteriaItems;
        this.description = description;
        this.formula = formula;
        this.triggerType = triggerType;
        this.workflowTimeTriggers = workflowTimeTriggers;
    }


    /**
     * Gets the actions value for this WorkflowRule.
     * 
     * @return actions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this WorkflowRule.
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
     * Gets the active value for this WorkflowRule.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this WorkflowRule.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the booleanFilter value for this WorkflowRule.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this WorkflowRule.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the criteriaItems value for this WorkflowRule.
     * 
     * @return criteriaItems
     */
    public com.sforce.soap._2006._04.metadata.FilterItem[] getCriteriaItems() {
        return criteriaItems;
    }


    /**
     * Sets the criteriaItems value for this WorkflowRule.
     * 
     * @param criteriaItems
     */
    public void setCriteriaItems(com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems) {
        this.criteriaItems = criteriaItems;
    }

    public com.sforce.soap._2006._04.metadata.FilterItem getCriteriaItems(int i) {
        return this.criteriaItems[i];
    }

    public void setCriteriaItems(int i, com.sforce.soap._2006._04.metadata.FilterItem _value) {
        this.criteriaItems[i] = _value;
    }


    /**
     * Gets the description value for this WorkflowRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WorkflowRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the formula value for this WorkflowRule.
     * 
     * @return formula
     */
    public java.lang.String getFormula() {
        return formula;
    }


    /**
     * Sets the formula value for this WorkflowRule.
     * 
     * @param formula
     */
    public void setFormula(java.lang.String formula) {
        this.formula = formula;
    }


    /**
     * Gets the triggerType value for this WorkflowRule.
     * 
     * @return triggerType
     */
    public com.sforce.soap._2006._04.metadata.WorkflowTriggerTypes getTriggerType() {
        return triggerType;
    }


    /**
     * Sets the triggerType value for this WorkflowRule.
     * 
     * @param triggerType
     */
    public void setTriggerType(com.sforce.soap._2006._04.metadata.WorkflowTriggerTypes triggerType) {
        this.triggerType = triggerType;
    }


    /**
     * Gets the workflowTimeTriggers value for this WorkflowRule.
     * 
     * @return workflowTimeTriggers
     */
    public com.sforce.soap._2006._04.metadata.WorkflowTimeTrigger[] getWorkflowTimeTriggers() {
        return workflowTimeTriggers;
    }


    /**
     * Sets the workflowTimeTriggers value for this WorkflowRule.
     * 
     * @param workflowTimeTriggers
     */
    public void setWorkflowTimeTriggers(com.sforce.soap._2006._04.metadata.WorkflowTimeTrigger[] workflowTimeTriggers) {
        this.workflowTimeTriggers = workflowTimeTriggers;
    }

    public com.sforce.soap._2006._04.metadata.WorkflowTimeTrigger getWorkflowTimeTriggers(int i) {
        return this.workflowTimeTriggers[i];
    }

    public void setWorkflowTimeTriggers(int i, com.sforce.soap._2006._04.metadata.WorkflowTimeTrigger _value) {
        this.workflowTimeTriggers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowRule)) return false;
        WorkflowRule other = (WorkflowRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            this.active == other.isActive() &&
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.criteriaItems==null && other.getCriteriaItems()==null) || 
             (this.criteriaItems!=null &&
              java.util.Arrays.equals(this.criteriaItems, other.getCriteriaItems()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.formula==null && other.getFormula()==null) || 
             (this.formula!=null &&
              this.formula.equals(other.getFormula()))) &&
            ((this.triggerType==null && other.getTriggerType()==null) || 
             (this.triggerType!=null &&
              this.triggerType.equals(other.getTriggerType()))) &&
            ((this.workflowTimeTriggers==null && other.getWorkflowTimeTriggers()==null) || 
             (this.workflowTimeTriggers!=null &&
              java.util.Arrays.equals(this.workflowTimeTriggers, other.getWorkflowTimeTriggers())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getCriteriaItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteriaItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteriaItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFormula() != null) {
            _hashCode += getFormula().hashCode();
        }
        if (getTriggerType() != null) {
            _hashCode += getTriggerType().hashCode();
        }
        if (getWorkflowTimeTriggers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowTimeTriggers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowTimeTriggers(), i);
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
        new org.apache.axis.description.TypeDesc(WorkflowRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "criteriaItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "formula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "triggerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTriggerTypes"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowTimeTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "workflowTimeTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTimeTrigger"));
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
