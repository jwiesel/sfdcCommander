/**
 * CustomObjectTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomObjectTranslation  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ObjectNameCaseValue[] caseValues;

    private com.sforce.soap._2006._04.metadata.CustomFieldTranslation[] fields;

    private com.sforce.soap._2006._04.metadata.Gender gender;

    private com.sforce.soap._2006._04.metadata.LayoutTranslation[] layouts;

    private java.lang.String nameFieldLabel;

    private com.sforce.soap._2006._04.metadata.QuickActionTranslation[] quickActions;

    private com.sforce.soap._2006._04.metadata.RecordTypeTranslation[] recordTypes;

    private com.sforce.soap._2006._04.metadata.SharingReasonTranslation[] sharingReasons;

    private com.sforce.soap._2006._04.metadata.StandardFieldTranslation[] standardFields;

    private com.sforce.soap._2006._04.metadata.StartsWith startsWith;

    private com.sforce.soap._2006._04.metadata.ValidationRuleTranslation[] validationRules;

    private com.sforce.soap._2006._04.metadata.WebLinkTranslation[] webLinks;

    private com.sforce.soap._2006._04.metadata.WorkflowTaskTranslation[] workflowTasks;

    public CustomObjectTranslation() {
    }

    public CustomObjectTranslation(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ObjectNameCaseValue[] caseValues,
           com.sforce.soap._2006._04.metadata.CustomFieldTranslation[] fields,
           com.sforce.soap._2006._04.metadata.Gender gender,
           com.sforce.soap._2006._04.metadata.LayoutTranslation[] layouts,
           java.lang.String nameFieldLabel,
           com.sforce.soap._2006._04.metadata.QuickActionTranslation[] quickActions,
           com.sforce.soap._2006._04.metadata.RecordTypeTranslation[] recordTypes,
           com.sforce.soap._2006._04.metadata.SharingReasonTranslation[] sharingReasons,
           com.sforce.soap._2006._04.metadata.StandardFieldTranslation[] standardFields,
           com.sforce.soap._2006._04.metadata.StartsWith startsWith,
           com.sforce.soap._2006._04.metadata.ValidationRuleTranslation[] validationRules,
           com.sforce.soap._2006._04.metadata.WebLinkTranslation[] webLinks,
           com.sforce.soap._2006._04.metadata.WorkflowTaskTranslation[] workflowTasks) {
        super(
            fullName);
        this.caseValues = caseValues;
        this.fields = fields;
        this.gender = gender;
        this.layouts = layouts;
        this.nameFieldLabel = nameFieldLabel;
        this.quickActions = quickActions;
        this.recordTypes = recordTypes;
        this.sharingReasons = sharingReasons;
        this.standardFields = standardFields;
        this.startsWith = startsWith;
        this.validationRules = validationRules;
        this.webLinks = webLinks;
        this.workflowTasks = workflowTasks;
    }


    /**
     * Gets the caseValues value for this CustomObjectTranslation.
     * 
     * @return caseValues
     */
    public com.sforce.soap._2006._04.metadata.ObjectNameCaseValue[] getCaseValues() {
        return caseValues;
    }


    /**
     * Sets the caseValues value for this CustomObjectTranslation.
     * 
     * @param caseValues
     */
    public void setCaseValues(com.sforce.soap._2006._04.metadata.ObjectNameCaseValue[] caseValues) {
        this.caseValues = caseValues;
    }

    public com.sforce.soap._2006._04.metadata.ObjectNameCaseValue getCaseValues(int i) {
        return this.caseValues[i];
    }

    public void setCaseValues(int i, com.sforce.soap._2006._04.metadata.ObjectNameCaseValue _value) {
        this.caseValues[i] = _value;
    }


    /**
     * Gets the fields value for this CustomObjectTranslation.
     * 
     * @return fields
     */
    public com.sforce.soap._2006._04.metadata.CustomFieldTranslation[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this CustomObjectTranslation.
     * 
     * @param fields
     */
    public void setFields(com.sforce.soap._2006._04.metadata.CustomFieldTranslation[] fields) {
        this.fields = fields;
    }

    public com.sforce.soap._2006._04.metadata.CustomFieldTranslation getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.sforce.soap._2006._04.metadata.CustomFieldTranslation _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the gender value for this CustomObjectTranslation.
     * 
     * @return gender
     */
    public com.sforce.soap._2006._04.metadata.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this CustomObjectTranslation.
     * 
     * @param gender
     */
    public void setGender(com.sforce.soap._2006._04.metadata.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the layouts value for this CustomObjectTranslation.
     * 
     * @return layouts
     */
    public com.sforce.soap._2006._04.metadata.LayoutTranslation[] getLayouts() {
        return layouts;
    }


    /**
     * Sets the layouts value for this CustomObjectTranslation.
     * 
     * @param layouts
     */
    public void setLayouts(com.sforce.soap._2006._04.metadata.LayoutTranslation[] layouts) {
        this.layouts = layouts;
    }

    public com.sforce.soap._2006._04.metadata.LayoutTranslation getLayouts(int i) {
        return this.layouts[i];
    }

    public void setLayouts(int i, com.sforce.soap._2006._04.metadata.LayoutTranslation _value) {
        this.layouts[i] = _value;
    }


    /**
     * Gets the nameFieldLabel value for this CustomObjectTranslation.
     * 
     * @return nameFieldLabel
     */
    public java.lang.String getNameFieldLabel() {
        return nameFieldLabel;
    }


    /**
     * Sets the nameFieldLabel value for this CustomObjectTranslation.
     * 
     * @param nameFieldLabel
     */
    public void setNameFieldLabel(java.lang.String nameFieldLabel) {
        this.nameFieldLabel = nameFieldLabel;
    }


    /**
     * Gets the quickActions value for this CustomObjectTranslation.
     * 
     * @return quickActions
     */
    public com.sforce.soap._2006._04.metadata.QuickActionTranslation[] getQuickActions() {
        return quickActions;
    }


    /**
     * Sets the quickActions value for this CustomObjectTranslation.
     * 
     * @param quickActions
     */
    public void setQuickActions(com.sforce.soap._2006._04.metadata.QuickActionTranslation[] quickActions) {
        this.quickActions = quickActions;
    }

    public com.sforce.soap._2006._04.metadata.QuickActionTranslation getQuickActions(int i) {
        return this.quickActions[i];
    }

    public void setQuickActions(int i, com.sforce.soap._2006._04.metadata.QuickActionTranslation _value) {
        this.quickActions[i] = _value;
    }


    /**
     * Gets the recordTypes value for this CustomObjectTranslation.
     * 
     * @return recordTypes
     */
    public com.sforce.soap._2006._04.metadata.RecordTypeTranslation[] getRecordTypes() {
        return recordTypes;
    }


    /**
     * Sets the recordTypes value for this CustomObjectTranslation.
     * 
     * @param recordTypes
     */
    public void setRecordTypes(com.sforce.soap._2006._04.metadata.RecordTypeTranslation[] recordTypes) {
        this.recordTypes = recordTypes;
    }

    public com.sforce.soap._2006._04.metadata.RecordTypeTranslation getRecordTypes(int i) {
        return this.recordTypes[i];
    }

    public void setRecordTypes(int i, com.sforce.soap._2006._04.metadata.RecordTypeTranslation _value) {
        this.recordTypes[i] = _value;
    }


    /**
     * Gets the sharingReasons value for this CustomObjectTranslation.
     * 
     * @return sharingReasons
     */
    public com.sforce.soap._2006._04.metadata.SharingReasonTranslation[] getSharingReasons() {
        return sharingReasons;
    }


    /**
     * Sets the sharingReasons value for this CustomObjectTranslation.
     * 
     * @param sharingReasons
     */
    public void setSharingReasons(com.sforce.soap._2006._04.metadata.SharingReasonTranslation[] sharingReasons) {
        this.sharingReasons = sharingReasons;
    }

    public com.sforce.soap._2006._04.metadata.SharingReasonTranslation getSharingReasons(int i) {
        return this.sharingReasons[i];
    }

    public void setSharingReasons(int i, com.sforce.soap._2006._04.metadata.SharingReasonTranslation _value) {
        this.sharingReasons[i] = _value;
    }


    /**
     * Gets the standardFields value for this CustomObjectTranslation.
     * 
     * @return standardFields
     */
    public com.sforce.soap._2006._04.metadata.StandardFieldTranslation[] getStandardFields() {
        return standardFields;
    }


    /**
     * Sets the standardFields value for this CustomObjectTranslation.
     * 
     * @param standardFields
     */
    public void setStandardFields(com.sforce.soap._2006._04.metadata.StandardFieldTranslation[] standardFields) {
        this.standardFields = standardFields;
    }

    public com.sforce.soap._2006._04.metadata.StandardFieldTranslation getStandardFields(int i) {
        return this.standardFields[i];
    }

    public void setStandardFields(int i, com.sforce.soap._2006._04.metadata.StandardFieldTranslation _value) {
        this.standardFields[i] = _value;
    }


    /**
     * Gets the startsWith value for this CustomObjectTranslation.
     * 
     * @return startsWith
     */
    public com.sforce.soap._2006._04.metadata.StartsWith getStartsWith() {
        return startsWith;
    }


    /**
     * Sets the startsWith value for this CustomObjectTranslation.
     * 
     * @param startsWith
     */
    public void setStartsWith(com.sforce.soap._2006._04.metadata.StartsWith startsWith) {
        this.startsWith = startsWith;
    }


    /**
     * Gets the validationRules value for this CustomObjectTranslation.
     * 
     * @return validationRules
     */
    public com.sforce.soap._2006._04.metadata.ValidationRuleTranslation[] getValidationRules() {
        return validationRules;
    }


    /**
     * Sets the validationRules value for this CustomObjectTranslation.
     * 
     * @param validationRules
     */
    public void setValidationRules(com.sforce.soap._2006._04.metadata.ValidationRuleTranslation[] validationRules) {
        this.validationRules = validationRules;
    }

    public com.sforce.soap._2006._04.metadata.ValidationRuleTranslation getValidationRules(int i) {
        return this.validationRules[i];
    }

    public void setValidationRules(int i, com.sforce.soap._2006._04.metadata.ValidationRuleTranslation _value) {
        this.validationRules[i] = _value;
    }


    /**
     * Gets the webLinks value for this CustomObjectTranslation.
     * 
     * @return webLinks
     */
    public com.sforce.soap._2006._04.metadata.WebLinkTranslation[] getWebLinks() {
        return webLinks;
    }


    /**
     * Sets the webLinks value for this CustomObjectTranslation.
     * 
     * @param webLinks
     */
    public void setWebLinks(com.sforce.soap._2006._04.metadata.WebLinkTranslation[] webLinks) {
        this.webLinks = webLinks;
    }

    public com.sforce.soap._2006._04.metadata.WebLinkTranslation getWebLinks(int i) {
        return this.webLinks[i];
    }

    public void setWebLinks(int i, com.sforce.soap._2006._04.metadata.WebLinkTranslation _value) {
        this.webLinks[i] = _value;
    }


    /**
     * Gets the workflowTasks value for this CustomObjectTranslation.
     * 
     * @return workflowTasks
     */
    public com.sforce.soap._2006._04.metadata.WorkflowTaskTranslation[] getWorkflowTasks() {
        return workflowTasks;
    }


    /**
     * Sets the workflowTasks value for this CustomObjectTranslation.
     * 
     * @param workflowTasks
     */
    public void setWorkflowTasks(com.sforce.soap._2006._04.metadata.WorkflowTaskTranslation[] workflowTasks) {
        this.workflowTasks = workflowTasks;
    }

    public com.sforce.soap._2006._04.metadata.WorkflowTaskTranslation getWorkflowTasks(int i) {
        return this.workflowTasks[i];
    }

    public void setWorkflowTasks(int i, com.sforce.soap._2006._04.metadata.WorkflowTaskTranslation _value) {
        this.workflowTasks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomObjectTranslation)) return false;
        CustomObjectTranslation other = (CustomObjectTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.caseValues==null && other.getCaseValues()==null) || 
             (this.caseValues!=null &&
              java.util.Arrays.equals(this.caseValues, other.getCaseValues()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.layouts==null && other.getLayouts()==null) || 
             (this.layouts!=null &&
              java.util.Arrays.equals(this.layouts, other.getLayouts()))) &&
            ((this.nameFieldLabel==null && other.getNameFieldLabel()==null) || 
             (this.nameFieldLabel!=null &&
              this.nameFieldLabel.equals(other.getNameFieldLabel()))) &&
            ((this.quickActions==null && other.getQuickActions()==null) || 
             (this.quickActions!=null &&
              java.util.Arrays.equals(this.quickActions, other.getQuickActions()))) &&
            ((this.recordTypes==null && other.getRecordTypes()==null) || 
             (this.recordTypes!=null &&
              java.util.Arrays.equals(this.recordTypes, other.getRecordTypes()))) &&
            ((this.sharingReasons==null && other.getSharingReasons()==null) || 
             (this.sharingReasons!=null &&
              java.util.Arrays.equals(this.sharingReasons, other.getSharingReasons()))) &&
            ((this.standardFields==null && other.getStandardFields()==null) || 
             (this.standardFields!=null &&
              java.util.Arrays.equals(this.standardFields, other.getStandardFields()))) &&
            ((this.startsWith==null && other.getStartsWith()==null) || 
             (this.startsWith!=null &&
              this.startsWith.equals(other.getStartsWith()))) &&
            ((this.validationRules==null && other.getValidationRules()==null) || 
             (this.validationRules!=null &&
              java.util.Arrays.equals(this.validationRules, other.getValidationRules()))) &&
            ((this.webLinks==null && other.getWebLinks()==null) || 
             (this.webLinks!=null &&
              java.util.Arrays.equals(this.webLinks, other.getWebLinks()))) &&
            ((this.workflowTasks==null && other.getWorkflowTasks()==null) || 
             (this.workflowTasks!=null &&
              java.util.Arrays.equals(this.workflowTasks, other.getWorkflowTasks())));
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
        if (getCaseValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getLayouts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayouts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLayouts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameFieldLabel() != null) {
            _hashCode += getNameFieldLabel().hashCode();
        }
        if (getQuickActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuickActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuickActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharingReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharingReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharingReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStandardFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStandardFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStandardFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartsWith() != null) {
            _hashCode += getStartsWith().hashCode();
        }
        if (getValidationRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidationRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidationRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkflowTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowTasks(), i);
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
        new org.apache.axis.description.TypeDesc(CustomObjectTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectNameCaseValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomFieldTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Gender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layouts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameFieldLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "nameFieldLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordTypeTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharingReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharingReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingReasonTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "standardFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StandardFieldTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startsWith");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "startsWith"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StartsWith"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "validationRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValidationRuleTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "webLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "workflowTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTaskTranslation"));
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
