/**
 * EntitlementProcessMilestoneItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EntitlementProcessMilestoneItem  implements java.io.Serializable {
    private java.lang.String businessHours;

    private java.lang.String criteriaBooleanFilter;

    private com.sforce.soap._2006._04.metadata.FilterItem[] milestoneCriteriaFilterItems;

    private java.lang.String milestoneCriteriaFormula;

    private java.lang.String milestoneName;

    private java.lang.String minutesCustomClass;

    private java.lang.Integer minutesToComplete;

    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] successActions;

    private com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneTimeTrigger[] timeTriggers;

    private java.lang.Boolean useCriteriaStartTime;

    public EntitlementProcessMilestoneItem() {
    }

    public EntitlementProcessMilestoneItem(
           java.lang.String businessHours,
           java.lang.String criteriaBooleanFilter,
           com.sforce.soap._2006._04.metadata.FilterItem[] milestoneCriteriaFilterItems,
           java.lang.String milestoneCriteriaFormula,
           java.lang.String milestoneName,
           java.lang.String minutesCustomClass,
           java.lang.Integer minutesToComplete,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] successActions,
           com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneTimeTrigger[] timeTriggers,
           java.lang.Boolean useCriteriaStartTime) {
           this.businessHours = businessHours;
           this.criteriaBooleanFilter = criteriaBooleanFilter;
           this.milestoneCriteriaFilterItems = milestoneCriteriaFilterItems;
           this.milestoneCriteriaFormula = milestoneCriteriaFormula;
           this.milestoneName = milestoneName;
           this.minutesCustomClass = minutesCustomClass;
           this.minutesToComplete = minutesToComplete;
           this.successActions = successActions;
           this.timeTriggers = timeTriggers;
           this.useCriteriaStartTime = useCriteriaStartTime;
    }


    /**
     * Gets the businessHours value for this EntitlementProcessMilestoneItem.
     * 
     * @return businessHours
     */
    public java.lang.String getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this EntitlementProcessMilestoneItem.
     * 
     * @param businessHours
     */
    public void setBusinessHours(java.lang.String businessHours) {
        this.businessHours = businessHours;
    }


    /**
     * Gets the criteriaBooleanFilter value for this EntitlementProcessMilestoneItem.
     * 
     * @return criteriaBooleanFilter
     */
    public java.lang.String getCriteriaBooleanFilter() {
        return criteriaBooleanFilter;
    }


    /**
     * Sets the criteriaBooleanFilter value for this EntitlementProcessMilestoneItem.
     * 
     * @param criteriaBooleanFilter
     */
    public void setCriteriaBooleanFilter(java.lang.String criteriaBooleanFilter) {
        this.criteriaBooleanFilter = criteriaBooleanFilter;
    }


    /**
     * Gets the milestoneCriteriaFilterItems value for this EntitlementProcessMilestoneItem.
     * 
     * @return milestoneCriteriaFilterItems
     */
    public com.sforce.soap._2006._04.metadata.FilterItem[] getMilestoneCriteriaFilterItems() {
        return milestoneCriteriaFilterItems;
    }


    /**
     * Sets the milestoneCriteriaFilterItems value for this EntitlementProcessMilestoneItem.
     * 
     * @param milestoneCriteriaFilterItems
     */
    public void setMilestoneCriteriaFilterItems(com.sforce.soap._2006._04.metadata.FilterItem[] milestoneCriteriaFilterItems) {
        this.milestoneCriteriaFilterItems = milestoneCriteriaFilterItems;
    }

    public com.sforce.soap._2006._04.metadata.FilterItem getMilestoneCriteriaFilterItems(int i) {
        return this.milestoneCriteriaFilterItems[i];
    }

    public void setMilestoneCriteriaFilterItems(int i, com.sforce.soap._2006._04.metadata.FilterItem _value) {
        this.milestoneCriteriaFilterItems[i] = _value;
    }


    /**
     * Gets the milestoneCriteriaFormula value for this EntitlementProcessMilestoneItem.
     * 
     * @return milestoneCriteriaFormula
     */
    public java.lang.String getMilestoneCriteriaFormula() {
        return milestoneCriteriaFormula;
    }


    /**
     * Sets the milestoneCriteriaFormula value for this EntitlementProcessMilestoneItem.
     * 
     * @param milestoneCriteriaFormula
     */
    public void setMilestoneCriteriaFormula(java.lang.String milestoneCriteriaFormula) {
        this.milestoneCriteriaFormula = milestoneCriteriaFormula;
    }


    /**
     * Gets the milestoneName value for this EntitlementProcessMilestoneItem.
     * 
     * @return milestoneName
     */
    public java.lang.String getMilestoneName() {
        return milestoneName;
    }


    /**
     * Sets the milestoneName value for this EntitlementProcessMilestoneItem.
     * 
     * @param milestoneName
     */
    public void setMilestoneName(java.lang.String milestoneName) {
        this.milestoneName = milestoneName;
    }


    /**
     * Gets the minutesCustomClass value for this EntitlementProcessMilestoneItem.
     * 
     * @return minutesCustomClass
     */
    public java.lang.String getMinutesCustomClass() {
        return minutesCustomClass;
    }


    /**
     * Sets the minutesCustomClass value for this EntitlementProcessMilestoneItem.
     * 
     * @param minutesCustomClass
     */
    public void setMinutesCustomClass(java.lang.String minutesCustomClass) {
        this.minutesCustomClass = minutesCustomClass;
    }


    /**
     * Gets the minutesToComplete value for this EntitlementProcessMilestoneItem.
     * 
     * @return minutesToComplete
     */
    public java.lang.Integer getMinutesToComplete() {
        return minutesToComplete;
    }


    /**
     * Sets the minutesToComplete value for this EntitlementProcessMilestoneItem.
     * 
     * @param minutesToComplete
     */
    public void setMinutesToComplete(java.lang.Integer minutesToComplete) {
        this.minutesToComplete = minutesToComplete;
    }


    /**
     * Gets the successActions value for this EntitlementProcessMilestoneItem.
     * 
     * @return successActions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getSuccessActions() {
        return successActions;
    }


    /**
     * Sets the successActions value for this EntitlementProcessMilestoneItem.
     * 
     * @param successActions
     */
    public void setSuccessActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] successActions) {
        this.successActions = successActions;
    }

    public com.sforce.soap._2006._04.metadata.WorkflowActionReference getSuccessActions(int i) {
        return this.successActions[i];
    }

    public void setSuccessActions(int i, com.sforce.soap._2006._04.metadata.WorkflowActionReference _value) {
        this.successActions[i] = _value;
    }


    /**
     * Gets the timeTriggers value for this EntitlementProcessMilestoneItem.
     * 
     * @return timeTriggers
     */
    public com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneTimeTrigger[] getTimeTriggers() {
        return timeTriggers;
    }


    /**
     * Sets the timeTriggers value for this EntitlementProcessMilestoneItem.
     * 
     * @param timeTriggers
     */
    public void setTimeTriggers(com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneTimeTrigger[] timeTriggers) {
        this.timeTriggers = timeTriggers;
    }

    public com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneTimeTrigger getTimeTriggers(int i) {
        return this.timeTriggers[i];
    }

    public void setTimeTriggers(int i, com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneTimeTrigger _value) {
        this.timeTriggers[i] = _value;
    }


    /**
     * Gets the useCriteriaStartTime value for this EntitlementProcessMilestoneItem.
     * 
     * @return useCriteriaStartTime
     */
    public java.lang.Boolean getUseCriteriaStartTime() {
        return useCriteriaStartTime;
    }


    /**
     * Sets the useCriteriaStartTime value for this EntitlementProcessMilestoneItem.
     * 
     * @param useCriteriaStartTime
     */
    public void setUseCriteriaStartTime(java.lang.Boolean useCriteriaStartTime) {
        this.useCriteriaStartTime = useCriteriaStartTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementProcessMilestoneItem)) return false;
        EntitlementProcessMilestoneItem other = (EntitlementProcessMilestoneItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              this.businessHours.equals(other.getBusinessHours()))) &&
            ((this.criteriaBooleanFilter==null && other.getCriteriaBooleanFilter()==null) || 
             (this.criteriaBooleanFilter!=null &&
              this.criteriaBooleanFilter.equals(other.getCriteriaBooleanFilter()))) &&
            ((this.milestoneCriteriaFilterItems==null && other.getMilestoneCriteriaFilterItems()==null) || 
             (this.milestoneCriteriaFilterItems!=null &&
              java.util.Arrays.equals(this.milestoneCriteriaFilterItems, other.getMilestoneCriteriaFilterItems()))) &&
            ((this.milestoneCriteriaFormula==null && other.getMilestoneCriteriaFormula()==null) || 
             (this.milestoneCriteriaFormula!=null &&
              this.milestoneCriteriaFormula.equals(other.getMilestoneCriteriaFormula()))) &&
            ((this.milestoneName==null && other.getMilestoneName()==null) || 
             (this.milestoneName!=null &&
              this.milestoneName.equals(other.getMilestoneName()))) &&
            ((this.minutesCustomClass==null && other.getMinutesCustomClass()==null) || 
             (this.minutesCustomClass!=null &&
              this.minutesCustomClass.equals(other.getMinutesCustomClass()))) &&
            ((this.minutesToComplete==null && other.getMinutesToComplete()==null) || 
             (this.minutesToComplete!=null &&
              this.minutesToComplete.equals(other.getMinutesToComplete()))) &&
            ((this.successActions==null && other.getSuccessActions()==null) || 
             (this.successActions!=null &&
              java.util.Arrays.equals(this.successActions, other.getSuccessActions()))) &&
            ((this.timeTriggers==null && other.getTimeTriggers()==null) || 
             (this.timeTriggers!=null &&
              java.util.Arrays.equals(this.timeTriggers, other.getTimeTriggers()))) &&
            ((this.useCriteriaStartTime==null && other.getUseCriteriaStartTime()==null) || 
             (this.useCriteriaStartTime!=null &&
              this.useCriteriaStartTime.equals(other.getUseCriteriaStartTime())));
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
        if (getBusinessHours() != null) {
            _hashCode += getBusinessHours().hashCode();
        }
        if (getCriteriaBooleanFilter() != null) {
            _hashCode += getCriteriaBooleanFilter().hashCode();
        }
        if (getMilestoneCriteriaFilterItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMilestoneCriteriaFilterItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMilestoneCriteriaFilterItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMilestoneCriteriaFormula() != null) {
            _hashCode += getMilestoneCriteriaFormula().hashCode();
        }
        if (getMilestoneName() != null) {
            _hashCode += getMilestoneName().hashCode();
        }
        if (getMinutesCustomClass() != null) {
            _hashCode += getMinutesCustomClass().hashCode();
        }
        if (getMinutesToComplete() != null) {
            _hashCode += getMinutesToComplete().hashCode();
        }
        if (getSuccessActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeTriggers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeTriggers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeTriggers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseCriteriaStartTime() != null) {
            _hashCode += getUseCriteriaStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementProcessMilestoneItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcessMilestoneItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "businessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaBooleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "criteriaBooleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneCriteriaFilterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "milestoneCriteriaFilterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneCriteriaFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "milestoneCriteriaFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "milestoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesCustomClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "minutesCustomClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesToComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "minutesToComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "successActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "timeTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcessMilestoneTimeTrigger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCriteriaStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "useCriteriaStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
