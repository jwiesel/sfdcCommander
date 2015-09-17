/**
 * RuleEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class RuleEntry  implements java.io.Serializable {
    private java.lang.String assignedTo;

    private com.sforce.soap._2006._04.metadata.AssignToLookupValueType assignedToType;

    private java.lang.String booleanFilter;

    private java.lang.String businessHours;

    private com.sforce.soap._2006._04.metadata.BusinessHoursSourceType businessHoursSource;

    private com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems;

    private java.lang.Boolean disableEscalationWhenModified;

    private com.sforce.soap._2006._04.metadata.EscalationAction[] escalationAction;

    private com.sforce.soap._2006._04.metadata.EscalationStartTimeType escalationStartTime;

    private java.lang.String formula;

    private java.lang.Boolean notifyCcRecipients;

    private java.lang.Boolean overrideExistingTeams;

    private java.lang.String replyToEmail;

    private java.lang.String senderEmail;

    private java.lang.String senderName;

    private java.lang.String[] team;

    private java.lang.String template;

    public RuleEntry() {
    }

    public RuleEntry(
           java.lang.String assignedTo,
           com.sforce.soap._2006._04.metadata.AssignToLookupValueType assignedToType,
           java.lang.String booleanFilter,
           java.lang.String businessHours,
           com.sforce.soap._2006._04.metadata.BusinessHoursSourceType businessHoursSource,
           com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems,
           java.lang.Boolean disableEscalationWhenModified,
           com.sforce.soap._2006._04.metadata.EscalationAction[] escalationAction,
           com.sforce.soap._2006._04.metadata.EscalationStartTimeType escalationStartTime,
           java.lang.String formula,
           java.lang.Boolean notifyCcRecipients,
           java.lang.Boolean overrideExistingTeams,
           java.lang.String replyToEmail,
           java.lang.String senderEmail,
           java.lang.String senderName,
           java.lang.String[] team,
           java.lang.String template) {
           this.assignedTo = assignedTo;
           this.assignedToType = assignedToType;
           this.booleanFilter = booleanFilter;
           this.businessHours = businessHours;
           this.businessHoursSource = businessHoursSource;
           this.criteriaItems = criteriaItems;
           this.disableEscalationWhenModified = disableEscalationWhenModified;
           this.escalationAction = escalationAction;
           this.escalationStartTime = escalationStartTime;
           this.formula = formula;
           this.notifyCcRecipients = notifyCcRecipients;
           this.overrideExistingTeams = overrideExistingTeams;
           this.replyToEmail = replyToEmail;
           this.senderEmail = senderEmail;
           this.senderName = senderName;
           this.team = team;
           this.template = template;
    }


    /**
     * Gets the assignedTo value for this RuleEntry.
     * 
     * @return assignedTo
     */
    public java.lang.String getAssignedTo() {
        return assignedTo;
    }


    /**
     * Sets the assignedTo value for this RuleEntry.
     * 
     * @param assignedTo
     */
    public void setAssignedTo(java.lang.String assignedTo) {
        this.assignedTo = assignedTo;
    }


    /**
     * Gets the assignedToType value for this RuleEntry.
     * 
     * @return assignedToType
     */
    public com.sforce.soap._2006._04.metadata.AssignToLookupValueType getAssignedToType() {
        return assignedToType;
    }


    /**
     * Sets the assignedToType value for this RuleEntry.
     * 
     * @param assignedToType
     */
    public void setAssignedToType(com.sforce.soap._2006._04.metadata.AssignToLookupValueType assignedToType) {
        this.assignedToType = assignedToType;
    }


    /**
     * Gets the booleanFilter value for this RuleEntry.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this RuleEntry.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the businessHours value for this RuleEntry.
     * 
     * @return businessHours
     */
    public java.lang.String getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this RuleEntry.
     * 
     * @param businessHours
     */
    public void setBusinessHours(java.lang.String businessHours) {
        this.businessHours = businessHours;
    }


    /**
     * Gets the businessHoursSource value for this RuleEntry.
     * 
     * @return businessHoursSource
     */
    public com.sforce.soap._2006._04.metadata.BusinessHoursSourceType getBusinessHoursSource() {
        return businessHoursSource;
    }


    /**
     * Sets the businessHoursSource value for this RuleEntry.
     * 
     * @param businessHoursSource
     */
    public void setBusinessHoursSource(com.sforce.soap._2006._04.metadata.BusinessHoursSourceType businessHoursSource) {
        this.businessHoursSource = businessHoursSource;
    }


    /**
     * Gets the criteriaItems value for this RuleEntry.
     * 
     * @return criteriaItems
     */
    public com.sforce.soap._2006._04.metadata.FilterItem[] getCriteriaItems() {
        return criteriaItems;
    }


    /**
     * Sets the criteriaItems value for this RuleEntry.
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
     * Gets the disableEscalationWhenModified value for this RuleEntry.
     * 
     * @return disableEscalationWhenModified
     */
    public java.lang.Boolean getDisableEscalationWhenModified() {
        return disableEscalationWhenModified;
    }


    /**
     * Sets the disableEscalationWhenModified value for this RuleEntry.
     * 
     * @param disableEscalationWhenModified
     */
    public void setDisableEscalationWhenModified(java.lang.Boolean disableEscalationWhenModified) {
        this.disableEscalationWhenModified = disableEscalationWhenModified;
    }


    /**
     * Gets the escalationAction value for this RuleEntry.
     * 
     * @return escalationAction
     */
    public com.sforce.soap._2006._04.metadata.EscalationAction[] getEscalationAction() {
        return escalationAction;
    }


    /**
     * Sets the escalationAction value for this RuleEntry.
     * 
     * @param escalationAction
     */
    public void setEscalationAction(com.sforce.soap._2006._04.metadata.EscalationAction[] escalationAction) {
        this.escalationAction = escalationAction;
    }

    public com.sforce.soap._2006._04.metadata.EscalationAction getEscalationAction(int i) {
        return this.escalationAction[i];
    }

    public void setEscalationAction(int i, com.sforce.soap._2006._04.metadata.EscalationAction _value) {
        this.escalationAction[i] = _value;
    }


    /**
     * Gets the escalationStartTime value for this RuleEntry.
     * 
     * @return escalationStartTime
     */
    public com.sforce.soap._2006._04.metadata.EscalationStartTimeType getEscalationStartTime() {
        return escalationStartTime;
    }


    /**
     * Sets the escalationStartTime value for this RuleEntry.
     * 
     * @param escalationStartTime
     */
    public void setEscalationStartTime(com.sforce.soap._2006._04.metadata.EscalationStartTimeType escalationStartTime) {
        this.escalationStartTime = escalationStartTime;
    }


    /**
     * Gets the formula value for this RuleEntry.
     * 
     * @return formula
     */
    public java.lang.String getFormula() {
        return formula;
    }


    /**
     * Sets the formula value for this RuleEntry.
     * 
     * @param formula
     */
    public void setFormula(java.lang.String formula) {
        this.formula = formula;
    }


    /**
     * Gets the notifyCcRecipients value for this RuleEntry.
     * 
     * @return notifyCcRecipients
     */
    public java.lang.Boolean getNotifyCcRecipients() {
        return notifyCcRecipients;
    }


    /**
     * Sets the notifyCcRecipients value for this RuleEntry.
     * 
     * @param notifyCcRecipients
     */
    public void setNotifyCcRecipients(java.lang.Boolean notifyCcRecipients) {
        this.notifyCcRecipients = notifyCcRecipients;
    }


    /**
     * Gets the overrideExistingTeams value for this RuleEntry.
     * 
     * @return overrideExistingTeams
     */
    public java.lang.Boolean getOverrideExistingTeams() {
        return overrideExistingTeams;
    }


    /**
     * Sets the overrideExistingTeams value for this RuleEntry.
     * 
     * @param overrideExistingTeams
     */
    public void setOverrideExistingTeams(java.lang.Boolean overrideExistingTeams) {
        this.overrideExistingTeams = overrideExistingTeams;
    }


    /**
     * Gets the replyToEmail value for this RuleEntry.
     * 
     * @return replyToEmail
     */
    public java.lang.String getReplyToEmail() {
        return replyToEmail;
    }


    /**
     * Sets the replyToEmail value for this RuleEntry.
     * 
     * @param replyToEmail
     */
    public void setReplyToEmail(java.lang.String replyToEmail) {
        this.replyToEmail = replyToEmail;
    }


    /**
     * Gets the senderEmail value for this RuleEntry.
     * 
     * @return senderEmail
     */
    public java.lang.String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this RuleEntry.
     * 
     * @param senderEmail
     */
    public void setSenderEmail(java.lang.String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the senderName value for this RuleEntry.
     * 
     * @return senderName
     */
    public java.lang.String getSenderName() {
        return senderName;
    }


    /**
     * Sets the senderName value for this RuleEntry.
     * 
     * @param senderName
     */
    public void setSenderName(java.lang.String senderName) {
        this.senderName = senderName;
    }


    /**
     * Gets the team value for this RuleEntry.
     * 
     * @return team
     */
    public java.lang.String[] getTeam() {
        return team;
    }


    /**
     * Sets the team value for this RuleEntry.
     * 
     * @param team
     */
    public void setTeam(java.lang.String[] team) {
        this.team = team;
    }

    public java.lang.String getTeam(int i) {
        return this.team[i];
    }

    public void setTeam(int i, java.lang.String _value) {
        this.team[i] = _value;
    }


    /**
     * Gets the template value for this RuleEntry.
     * 
     * @return template
     */
    public java.lang.String getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this RuleEntry.
     * 
     * @param template
     */
    public void setTemplate(java.lang.String template) {
        this.template = template;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleEntry)) return false;
        RuleEntry other = (RuleEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assignedTo==null && other.getAssignedTo()==null) || 
             (this.assignedTo!=null &&
              this.assignedTo.equals(other.getAssignedTo()))) &&
            ((this.assignedToType==null && other.getAssignedToType()==null) || 
             (this.assignedToType!=null &&
              this.assignedToType.equals(other.getAssignedToType()))) &&
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              this.businessHours.equals(other.getBusinessHours()))) &&
            ((this.businessHoursSource==null && other.getBusinessHoursSource()==null) || 
             (this.businessHoursSource!=null &&
              this.businessHoursSource.equals(other.getBusinessHoursSource()))) &&
            ((this.criteriaItems==null && other.getCriteriaItems()==null) || 
             (this.criteriaItems!=null &&
              java.util.Arrays.equals(this.criteriaItems, other.getCriteriaItems()))) &&
            ((this.disableEscalationWhenModified==null && other.getDisableEscalationWhenModified()==null) || 
             (this.disableEscalationWhenModified!=null &&
              this.disableEscalationWhenModified.equals(other.getDisableEscalationWhenModified()))) &&
            ((this.escalationAction==null && other.getEscalationAction()==null) || 
             (this.escalationAction!=null &&
              java.util.Arrays.equals(this.escalationAction, other.getEscalationAction()))) &&
            ((this.escalationStartTime==null && other.getEscalationStartTime()==null) || 
             (this.escalationStartTime!=null &&
              this.escalationStartTime.equals(other.getEscalationStartTime()))) &&
            ((this.formula==null && other.getFormula()==null) || 
             (this.formula!=null &&
              this.formula.equals(other.getFormula()))) &&
            ((this.notifyCcRecipients==null && other.getNotifyCcRecipients()==null) || 
             (this.notifyCcRecipients!=null &&
              this.notifyCcRecipients.equals(other.getNotifyCcRecipients()))) &&
            ((this.overrideExistingTeams==null && other.getOverrideExistingTeams()==null) || 
             (this.overrideExistingTeams!=null &&
              this.overrideExistingTeams.equals(other.getOverrideExistingTeams()))) &&
            ((this.replyToEmail==null && other.getReplyToEmail()==null) || 
             (this.replyToEmail!=null &&
              this.replyToEmail.equals(other.getReplyToEmail()))) &&
            ((this.senderEmail==null && other.getSenderEmail()==null) || 
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.senderName==null && other.getSenderName()==null) || 
             (this.senderName!=null &&
              this.senderName.equals(other.getSenderName()))) &&
            ((this.team==null && other.getTeam()==null) || 
             (this.team!=null &&
              java.util.Arrays.equals(this.team, other.getTeam()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate())));
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
        if (getAssignedTo() != null) {
            _hashCode += getAssignedTo().hashCode();
        }
        if (getAssignedToType() != null) {
            _hashCode += getAssignedToType().hashCode();
        }
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getBusinessHours() != null) {
            _hashCode += getBusinessHours().hashCode();
        }
        if (getBusinessHoursSource() != null) {
            _hashCode += getBusinessHoursSource().hashCode();
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
        if (getDisableEscalationWhenModified() != null) {
            _hashCode += getDisableEscalationWhenModified().hashCode();
        }
        if (getEscalationAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEscalationAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEscalationAction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEscalationStartTime() != null) {
            _hashCode += getEscalationStartTime().hashCode();
        }
        if (getFormula() != null) {
            _hashCode += getFormula().hashCode();
        }
        if (getNotifyCcRecipients() != null) {
            _hashCode += getNotifyCcRecipients().hashCode();
        }
        if (getOverrideExistingTeams() != null) {
            _hashCode += getOverrideExistingTeams().hashCode();
        }
        if (getReplyToEmail() != null) {
            _hashCode += getReplyToEmail().hashCode();
        }
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getSenderName() != null) {
            _hashCode += getSenderName().hashCode();
        }
        if (getTeam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RuleEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedToType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignedToType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AssignToLookupValueType"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "businessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHoursSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "businessHoursSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessHoursSourceType"));
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
        elemField.setFieldName("disableEscalationWhenModified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "disableEscalationWhenModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "escalationAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "escalationStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationStartTimeType"));
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
        elemField.setFieldName("notifyCcRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyCcRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideExistingTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "overrideExistingTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "replyToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "senderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "senderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "team"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
