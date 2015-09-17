/**
 * ApprovalProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ApprovalProcess  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean active;

    private java.lang.Boolean allowRecall;

    private com.sforce.soap._2006._04.metadata.ApprovalSubmitter[] allowedSubmitters;

    private java.lang.String[] approvalPageFields;

    private com.sforce.soap._2006._04.metadata.ApprovalStep[] approvalStep;

    private java.lang.String description;

    private java.lang.String emailTemplate;

    private java.lang.Boolean enableMobileDeviceAccess;

    private com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria entryCriteria;

    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] finalApprovalActions;

    private java.lang.Boolean finalApprovalRecordLock;

    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] finalRejectionActions;

    private java.lang.Boolean finalRejectionRecordLock;

    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] initialSubmissionActions;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.NextAutomatedApprover nextAutomatedApprover;

    private java.lang.String postTemplate;

    private com.sforce.soap._2006._04.metadata.WorkflowActionReference[] recallActions;

    private com.sforce.soap._2006._04.metadata.RecordEditabilityType recordEditability;

    private java.lang.Boolean showApprovalHistory;

    public ApprovalProcess() {
    }

    public ApprovalProcess(
           java.lang.String fullName,
           boolean active,
           java.lang.Boolean allowRecall,
           com.sforce.soap._2006._04.metadata.ApprovalSubmitter[] allowedSubmitters,
           java.lang.String[] approvalPageFields,
           com.sforce.soap._2006._04.metadata.ApprovalStep[] approvalStep,
           java.lang.String description,
           java.lang.String emailTemplate,
           java.lang.Boolean enableMobileDeviceAccess,
           com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria entryCriteria,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] finalApprovalActions,
           java.lang.Boolean finalApprovalRecordLock,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] finalRejectionActions,
           java.lang.Boolean finalRejectionRecordLock,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] initialSubmissionActions,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.NextAutomatedApprover nextAutomatedApprover,
           java.lang.String postTemplate,
           com.sforce.soap._2006._04.metadata.WorkflowActionReference[] recallActions,
           com.sforce.soap._2006._04.metadata.RecordEditabilityType recordEditability,
           java.lang.Boolean showApprovalHistory) {
        super(
            fullName);
        this.active = active;
        this.allowRecall = allowRecall;
        this.allowedSubmitters = allowedSubmitters;
        this.approvalPageFields = approvalPageFields;
        this.approvalStep = approvalStep;
        this.description = description;
        this.emailTemplate = emailTemplate;
        this.enableMobileDeviceAccess = enableMobileDeviceAccess;
        this.entryCriteria = entryCriteria;
        this.finalApprovalActions = finalApprovalActions;
        this.finalApprovalRecordLock = finalApprovalRecordLock;
        this.finalRejectionActions = finalRejectionActions;
        this.finalRejectionRecordLock = finalRejectionRecordLock;
        this.initialSubmissionActions = initialSubmissionActions;
        this.label = label;
        this.nextAutomatedApprover = nextAutomatedApprover;
        this.postTemplate = postTemplate;
        this.recallActions = recallActions;
        this.recordEditability = recordEditability;
        this.showApprovalHistory = showApprovalHistory;
    }


    /**
     * Gets the active value for this ApprovalProcess.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ApprovalProcess.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the allowRecall value for this ApprovalProcess.
     * 
     * @return allowRecall
     */
    public java.lang.Boolean getAllowRecall() {
        return allowRecall;
    }


    /**
     * Sets the allowRecall value for this ApprovalProcess.
     * 
     * @param allowRecall
     */
    public void setAllowRecall(java.lang.Boolean allowRecall) {
        this.allowRecall = allowRecall;
    }


    /**
     * Gets the allowedSubmitters value for this ApprovalProcess.
     * 
     * @return allowedSubmitters
     */
    public com.sforce.soap._2006._04.metadata.ApprovalSubmitter[] getAllowedSubmitters() {
        return allowedSubmitters;
    }


    /**
     * Sets the allowedSubmitters value for this ApprovalProcess.
     * 
     * @param allowedSubmitters
     */
    public void setAllowedSubmitters(com.sforce.soap._2006._04.metadata.ApprovalSubmitter[] allowedSubmitters) {
        this.allowedSubmitters = allowedSubmitters;
    }

    public com.sforce.soap._2006._04.metadata.ApprovalSubmitter getAllowedSubmitters(int i) {
        return this.allowedSubmitters[i];
    }

    public void setAllowedSubmitters(int i, com.sforce.soap._2006._04.metadata.ApprovalSubmitter _value) {
        this.allowedSubmitters[i] = _value;
    }


    /**
     * Gets the approvalPageFields value for this ApprovalProcess.
     * 
     * @return approvalPageFields
     */
    public java.lang.String[] getApprovalPageFields() {
        return approvalPageFields;
    }


    /**
     * Sets the approvalPageFields value for this ApprovalProcess.
     * 
     * @param approvalPageFields
     */
    public void setApprovalPageFields(java.lang.String[] approvalPageFields) {
        this.approvalPageFields = approvalPageFields;
    }


    /**
     * Gets the approvalStep value for this ApprovalProcess.
     * 
     * @return approvalStep
     */
    public com.sforce.soap._2006._04.metadata.ApprovalStep[] getApprovalStep() {
        return approvalStep;
    }


    /**
     * Sets the approvalStep value for this ApprovalProcess.
     * 
     * @param approvalStep
     */
    public void setApprovalStep(com.sforce.soap._2006._04.metadata.ApprovalStep[] approvalStep) {
        this.approvalStep = approvalStep;
    }

    public com.sforce.soap._2006._04.metadata.ApprovalStep getApprovalStep(int i) {
        return this.approvalStep[i];
    }

    public void setApprovalStep(int i, com.sforce.soap._2006._04.metadata.ApprovalStep _value) {
        this.approvalStep[i] = _value;
    }


    /**
     * Gets the description value for this ApprovalProcess.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ApprovalProcess.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emailTemplate value for this ApprovalProcess.
     * 
     * @return emailTemplate
     */
    public java.lang.String getEmailTemplate() {
        return emailTemplate;
    }


    /**
     * Sets the emailTemplate value for this ApprovalProcess.
     * 
     * @param emailTemplate
     */
    public void setEmailTemplate(java.lang.String emailTemplate) {
        this.emailTemplate = emailTemplate;
    }


    /**
     * Gets the enableMobileDeviceAccess value for this ApprovalProcess.
     * 
     * @return enableMobileDeviceAccess
     */
    public java.lang.Boolean getEnableMobileDeviceAccess() {
        return enableMobileDeviceAccess;
    }


    /**
     * Sets the enableMobileDeviceAccess value for this ApprovalProcess.
     * 
     * @param enableMobileDeviceAccess
     */
    public void setEnableMobileDeviceAccess(java.lang.Boolean enableMobileDeviceAccess) {
        this.enableMobileDeviceAccess = enableMobileDeviceAccess;
    }


    /**
     * Gets the entryCriteria value for this ApprovalProcess.
     * 
     * @return entryCriteria
     */
    public com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria getEntryCriteria() {
        return entryCriteria;
    }


    /**
     * Sets the entryCriteria value for this ApprovalProcess.
     * 
     * @param entryCriteria
     */
    public void setEntryCriteria(com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria entryCriteria) {
        this.entryCriteria = entryCriteria;
    }


    /**
     * Gets the finalApprovalActions value for this ApprovalProcess.
     * 
     * @return finalApprovalActions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getFinalApprovalActions() {
        return finalApprovalActions;
    }


    /**
     * Sets the finalApprovalActions value for this ApprovalProcess.
     * 
     * @param finalApprovalActions
     */
    public void setFinalApprovalActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] finalApprovalActions) {
        this.finalApprovalActions = finalApprovalActions;
    }


    /**
     * Gets the finalApprovalRecordLock value for this ApprovalProcess.
     * 
     * @return finalApprovalRecordLock
     */
    public java.lang.Boolean getFinalApprovalRecordLock() {
        return finalApprovalRecordLock;
    }


    /**
     * Sets the finalApprovalRecordLock value for this ApprovalProcess.
     * 
     * @param finalApprovalRecordLock
     */
    public void setFinalApprovalRecordLock(java.lang.Boolean finalApprovalRecordLock) {
        this.finalApprovalRecordLock = finalApprovalRecordLock;
    }


    /**
     * Gets the finalRejectionActions value for this ApprovalProcess.
     * 
     * @return finalRejectionActions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getFinalRejectionActions() {
        return finalRejectionActions;
    }


    /**
     * Sets the finalRejectionActions value for this ApprovalProcess.
     * 
     * @param finalRejectionActions
     */
    public void setFinalRejectionActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] finalRejectionActions) {
        this.finalRejectionActions = finalRejectionActions;
    }


    /**
     * Gets the finalRejectionRecordLock value for this ApprovalProcess.
     * 
     * @return finalRejectionRecordLock
     */
    public java.lang.Boolean getFinalRejectionRecordLock() {
        return finalRejectionRecordLock;
    }


    /**
     * Sets the finalRejectionRecordLock value for this ApprovalProcess.
     * 
     * @param finalRejectionRecordLock
     */
    public void setFinalRejectionRecordLock(java.lang.Boolean finalRejectionRecordLock) {
        this.finalRejectionRecordLock = finalRejectionRecordLock;
    }


    /**
     * Gets the initialSubmissionActions value for this ApprovalProcess.
     * 
     * @return initialSubmissionActions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getInitialSubmissionActions() {
        return initialSubmissionActions;
    }


    /**
     * Sets the initialSubmissionActions value for this ApprovalProcess.
     * 
     * @param initialSubmissionActions
     */
    public void setInitialSubmissionActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] initialSubmissionActions) {
        this.initialSubmissionActions = initialSubmissionActions;
    }


    /**
     * Gets the label value for this ApprovalProcess.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ApprovalProcess.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the nextAutomatedApprover value for this ApprovalProcess.
     * 
     * @return nextAutomatedApprover
     */
    public com.sforce.soap._2006._04.metadata.NextAutomatedApprover getNextAutomatedApprover() {
        return nextAutomatedApprover;
    }


    /**
     * Sets the nextAutomatedApprover value for this ApprovalProcess.
     * 
     * @param nextAutomatedApprover
     */
    public void setNextAutomatedApprover(com.sforce.soap._2006._04.metadata.NextAutomatedApprover nextAutomatedApprover) {
        this.nextAutomatedApprover = nextAutomatedApprover;
    }


    /**
     * Gets the postTemplate value for this ApprovalProcess.
     * 
     * @return postTemplate
     */
    public java.lang.String getPostTemplate() {
        return postTemplate;
    }


    /**
     * Sets the postTemplate value for this ApprovalProcess.
     * 
     * @param postTemplate
     */
    public void setPostTemplate(java.lang.String postTemplate) {
        this.postTemplate = postTemplate;
    }


    /**
     * Gets the recallActions value for this ApprovalProcess.
     * 
     * @return recallActions
     */
    public com.sforce.soap._2006._04.metadata.WorkflowActionReference[] getRecallActions() {
        return recallActions;
    }


    /**
     * Sets the recallActions value for this ApprovalProcess.
     * 
     * @param recallActions
     */
    public void setRecallActions(com.sforce.soap._2006._04.metadata.WorkflowActionReference[] recallActions) {
        this.recallActions = recallActions;
    }


    /**
     * Gets the recordEditability value for this ApprovalProcess.
     * 
     * @return recordEditability
     */
    public com.sforce.soap._2006._04.metadata.RecordEditabilityType getRecordEditability() {
        return recordEditability;
    }


    /**
     * Sets the recordEditability value for this ApprovalProcess.
     * 
     * @param recordEditability
     */
    public void setRecordEditability(com.sforce.soap._2006._04.metadata.RecordEditabilityType recordEditability) {
        this.recordEditability = recordEditability;
    }


    /**
     * Gets the showApprovalHistory value for this ApprovalProcess.
     * 
     * @return showApprovalHistory
     */
    public java.lang.Boolean getShowApprovalHistory() {
        return showApprovalHistory;
    }


    /**
     * Sets the showApprovalHistory value for this ApprovalProcess.
     * 
     * @param showApprovalHistory
     */
    public void setShowApprovalHistory(java.lang.Boolean showApprovalHistory) {
        this.showApprovalHistory = showApprovalHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApprovalProcess)) return false;
        ApprovalProcess other = (ApprovalProcess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            ((this.allowRecall==null && other.getAllowRecall()==null) || 
             (this.allowRecall!=null &&
              this.allowRecall.equals(other.getAllowRecall()))) &&
            ((this.allowedSubmitters==null && other.getAllowedSubmitters()==null) || 
             (this.allowedSubmitters!=null &&
              java.util.Arrays.equals(this.allowedSubmitters, other.getAllowedSubmitters()))) &&
            ((this.approvalPageFields==null && other.getApprovalPageFields()==null) || 
             (this.approvalPageFields!=null &&
              java.util.Arrays.equals(this.approvalPageFields, other.getApprovalPageFields()))) &&
            ((this.approvalStep==null && other.getApprovalStep()==null) || 
             (this.approvalStep!=null &&
              java.util.Arrays.equals(this.approvalStep, other.getApprovalStep()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.emailTemplate==null && other.getEmailTemplate()==null) || 
             (this.emailTemplate!=null &&
              this.emailTemplate.equals(other.getEmailTemplate()))) &&
            ((this.enableMobileDeviceAccess==null && other.getEnableMobileDeviceAccess()==null) || 
             (this.enableMobileDeviceAccess!=null &&
              this.enableMobileDeviceAccess.equals(other.getEnableMobileDeviceAccess()))) &&
            ((this.entryCriteria==null && other.getEntryCriteria()==null) || 
             (this.entryCriteria!=null &&
              this.entryCriteria.equals(other.getEntryCriteria()))) &&
            ((this.finalApprovalActions==null && other.getFinalApprovalActions()==null) || 
             (this.finalApprovalActions!=null &&
              java.util.Arrays.equals(this.finalApprovalActions, other.getFinalApprovalActions()))) &&
            ((this.finalApprovalRecordLock==null && other.getFinalApprovalRecordLock()==null) || 
             (this.finalApprovalRecordLock!=null &&
              this.finalApprovalRecordLock.equals(other.getFinalApprovalRecordLock()))) &&
            ((this.finalRejectionActions==null && other.getFinalRejectionActions()==null) || 
             (this.finalRejectionActions!=null &&
              java.util.Arrays.equals(this.finalRejectionActions, other.getFinalRejectionActions()))) &&
            ((this.finalRejectionRecordLock==null && other.getFinalRejectionRecordLock()==null) || 
             (this.finalRejectionRecordLock!=null &&
              this.finalRejectionRecordLock.equals(other.getFinalRejectionRecordLock()))) &&
            ((this.initialSubmissionActions==null && other.getInitialSubmissionActions()==null) || 
             (this.initialSubmissionActions!=null &&
              java.util.Arrays.equals(this.initialSubmissionActions, other.getInitialSubmissionActions()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.nextAutomatedApprover==null && other.getNextAutomatedApprover()==null) || 
             (this.nextAutomatedApprover!=null &&
              this.nextAutomatedApprover.equals(other.getNextAutomatedApprover()))) &&
            ((this.postTemplate==null && other.getPostTemplate()==null) || 
             (this.postTemplate!=null &&
              this.postTemplate.equals(other.getPostTemplate()))) &&
            ((this.recallActions==null && other.getRecallActions()==null) || 
             (this.recallActions!=null &&
              java.util.Arrays.equals(this.recallActions, other.getRecallActions()))) &&
            ((this.recordEditability==null && other.getRecordEditability()==null) || 
             (this.recordEditability!=null &&
              this.recordEditability.equals(other.getRecordEditability()))) &&
            ((this.showApprovalHistory==null && other.getShowApprovalHistory()==null) || 
             (this.showApprovalHistory!=null &&
              this.showApprovalHistory.equals(other.getShowApprovalHistory())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAllowRecall() != null) {
            _hashCode += getAllowRecall().hashCode();
        }
        if (getAllowedSubmitters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedSubmitters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedSubmitters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalPageFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalPageFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalPageFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalStep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalStep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalStep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmailTemplate() != null) {
            _hashCode += getEmailTemplate().hashCode();
        }
        if (getEnableMobileDeviceAccess() != null) {
            _hashCode += getEnableMobileDeviceAccess().hashCode();
        }
        if (getEntryCriteria() != null) {
            _hashCode += getEntryCriteria().hashCode();
        }
        if (getFinalApprovalActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalApprovalActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalApprovalActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalApprovalRecordLock() != null) {
            _hashCode += getFinalApprovalRecordLock().hashCode();
        }
        if (getFinalRejectionActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalRejectionActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalRejectionActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalRejectionRecordLock() != null) {
            _hashCode += getFinalRejectionRecordLock().hashCode();
        }
        if (getInitialSubmissionActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInitialSubmissionActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInitialSubmissionActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getNextAutomatedApprover() != null) {
            _hashCode += getNextAutomatedApprover().hashCode();
        }
        if (getPostTemplate() != null) {
            _hashCode += getPostTemplate().hashCode();
        }
        if (getRecallActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecallActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecallActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordEditability() != null) {
            _hashCode += getRecordEditability().hashCode();
        }
        if (getShowApprovalHistory() != null) {
            _hashCode += getShowApprovalHistory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApprovalProcess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalProcess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRecall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowRecall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedSubmitters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowedSubmitters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalSubmitter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalPageFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "approvalPageFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "approvalStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStep"));
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
        elemField.setFieldName("emailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableMobileDeviceAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableMobileDeviceAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("finalApprovalActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "finalApprovalActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalApprovalRecordLock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "finalApprovalRecordLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalRejectionActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "finalRejectionActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalRejectionRecordLock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "finalRejectionRecordLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialSubmissionActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "initialSubmissionActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextAutomatedApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "nextAutomatedApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NextAutomatedApprover"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "postTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recallActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recallActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordEditability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordEditability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordEditabilityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showApprovalHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showApprovalHistory"));
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
