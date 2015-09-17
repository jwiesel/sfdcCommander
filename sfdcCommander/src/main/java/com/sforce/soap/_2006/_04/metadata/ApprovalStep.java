/**
 * ApprovalStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ApprovalStep  implements java.io.Serializable {
    private java.lang.Boolean allowDelegate;

    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] approvalActions;

    private com.sforce.soap._2006._04.metadata.ApprovalStepApprover assignedApprover;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria entryCriteria;

    private com.sforce.soap._2006._04.metadata.StepCriteriaNotMetType ifCriteriaNotMet;

    private java.lang.String label;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.ApprovalStepRejectBehavior rejectBehavior;

    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] rejectionActions;

    public ApprovalStep() {
    }

    public ApprovalStep(
           java.lang.Boolean allowDelegate,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] approvalActions,
           com.sforce.soap._2006._04.metadata.ApprovalStepApprover assignedApprover,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria entryCriteria,
           com.sforce.soap._2006._04.metadata.StepCriteriaNotMetType ifCriteriaNotMet,
           java.lang.String label,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.ApprovalStepRejectBehavior rejectBehavior,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] rejectionActions) {
           this.allowDelegate = allowDelegate;
           this.approvalActions = approvalActions;
           this.assignedApprover = assignedApprover;
           this.description = description;
           this.entryCriteria = entryCriteria;
           this.ifCriteriaNotMet = ifCriteriaNotMet;
           this.label = label;
           this.name = name;
           this.rejectBehavior = rejectBehavior;
           this.rejectionActions = rejectionActions;
    }


    /**
     * Gets the allowDelegate value for this ApprovalStep.
     * 
     * @return allowDelegate
     */
    public java.lang.Boolean getAllowDelegate() {
        return allowDelegate;
    }


    /**
     * Sets the allowDelegate value for this ApprovalStep.
     * 
     * @param allowDelegate
     */
    public void setAllowDelegate(java.lang.Boolean allowDelegate) {
        this.allowDelegate = allowDelegate;
    }


    /**
     * Gets the approvalActions value for this ApprovalStep.
     * 
     * @return approvalActions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getApprovalActions() {
        return approvalActions;
    }


    /**
     * Sets the approvalActions value for this ApprovalStep.
     * 
     * @param approvalActions
     */
    public void setApprovalActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] approvalActions) {
        this.approvalActions = approvalActions;
    }


    /**
     * Gets the assignedApprover value for this ApprovalStep.
     * 
     * @return assignedApprover
     */
    public com.sforce.soap._2006._04.metadata.ApprovalStepApprover getAssignedApprover() {
        return assignedApprover;
    }


    /**
     * Sets the assignedApprover value for this ApprovalStep.
     * 
     * @param assignedApprover
     */
    public void setAssignedApprover(com.sforce.soap._2006._04.metadata.ApprovalStepApprover assignedApprover) {
        this.assignedApprover = assignedApprover;
    }


    /**
     * Gets the description value for this ApprovalStep.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ApprovalStep.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the entryCriteria value for this ApprovalStep.
     * 
     * @return entryCriteria
     */
    public com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria getEntryCriteria() {
        return entryCriteria;
    }


    /**
     * Sets the entryCriteria value for this ApprovalStep.
     * 
     * @param entryCriteria
     */
    public void setEntryCriteria(com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria entryCriteria) {
        this.entryCriteria = entryCriteria;
    }


    /**
     * Gets the ifCriteriaNotMet value for this ApprovalStep.
     * 
     * @return ifCriteriaNotMet
     */
    public com.sforce.soap._2006._04.metadata.StepCriteriaNotMetType getIfCriteriaNotMet() {
        return ifCriteriaNotMet;
    }


    /**
     * Sets the ifCriteriaNotMet value for this ApprovalStep.
     * 
     * @param ifCriteriaNotMet
     */
    public void setIfCriteriaNotMet(com.sforce.soap._2006._04.metadata.StepCriteriaNotMetType ifCriteriaNotMet) {
        this.ifCriteriaNotMet = ifCriteriaNotMet;
    }


    /**
     * Gets the label value for this ApprovalStep.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ApprovalStep.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the name value for this ApprovalStep.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ApprovalStep.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rejectBehavior value for this ApprovalStep.
     * 
     * @return rejectBehavior
     */
    public com.sforce.soap._2006._04.metadata.ApprovalStepRejectBehavior getRejectBehavior() {
        return rejectBehavior;
    }


    /**
     * Sets the rejectBehavior value for this ApprovalStep.
     * 
     * @param rejectBehavior
     */
    public void setRejectBehavior(com.sforce.soap._2006._04.metadata.ApprovalStepRejectBehavior rejectBehavior) {
        this.rejectBehavior = rejectBehavior;
    }


    /**
     * Gets the rejectionActions value for this ApprovalStep.
     * 
     * @return rejectionActions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getRejectionActions() {
        return rejectionActions;
    }


    /**
     * Sets the rejectionActions value for this ApprovalStep.
     * 
     * @param rejectionActions
     */
    public void setRejectionActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] rejectionActions) {
        this.rejectionActions = rejectionActions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApprovalStep)) return false;
        ApprovalStep other = (ApprovalStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowDelegate==null && other.getAllowDelegate()==null) || 
             (this.allowDelegate!=null &&
              this.allowDelegate.equals(other.getAllowDelegate()))) &&
            ((this.approvalActions==null && other.getApprovalActions()==null) || 
             (this.approvalActions!=null &&
              java.util.Arrays.equals(this.approvalActions, other.getApprovalActions()))) &&
            ((this.assignedApprover==null && other.getAssignedApprover()==null) || 
             (this.assignedApprover!=null &&
              this.assignedApprover.equals(other.getAssignedApprover()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.entryCriteria==null && other.getEntryCriteria()==null) || 
             (this.entryCriteria!=null &&
              this.entryCriteria.equals(other.getEntryCriteria()))) &&
            ((this.ifCriteriaNotMet==null && other.getIfCriteriaNotMet()==null) || 
             (this.ifCriteriaNotMet!=null &&
              this.ifCriteriaNotMet.equals(other.getIfCriteriaNotMet()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.rejectBehavior==null && other.getRejectBehavior()==null) || 
             (this.rejectBehavior!=null &&
              this.rejectBehavior.equals(other.getRejectBehavior()))) &&
            ((this.rejectionActions==null && other.getRejectionActions()==null) || 
             (this.rejectionActions!=null &&
              java.util.Arrays.equals(this.rejectionActions, other.getRejectionActions())));
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
        if (getAllowDelegate() != null) {
            _hashCode += getAllowDelegate().hashCode();
        }
        if (getApprovalActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignedApprover() != null) {
            _hashCode += getAssignedApprover().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEntryCriteria() != null) {
            _hashCode += getEntryCriteria().hashCode();
        }
        if (getIfCriteriaNotMet() != null) {
            _hashCode += getIfCriteriaNotMet().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRejectBehavior() != null) {
            _hashCode += getRejectBehavior().hashCode();
        }
        if (getRejectionActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRejectionActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRejectionActions(), i);
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
        new org.apache.axis.description.TypeDesc(ApprovalStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDelegate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowDelegate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "approvalActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignedApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStepApprover"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entryCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalEntryCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifCriteriaNotMet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ifCriteriaNotMet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StepCriteriaNotMetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rejectBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStepRejectBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rejectionActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
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
