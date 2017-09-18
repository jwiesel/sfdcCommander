/**
 * WaveXmdDimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WaveXmdDimension  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.WaveXmdDimensionCustomAction[] customActions;

    private java.lang.Boolean customActionsEnabled;

    private java.lang.String dateFormat;

    private java.lang.String description;

    private java.lang.String field;

    private java.lang.String fullyQualifiedName;

    private java.lang.String imageTemplate;

    private boolean isDerived;

    private java.lang.Boolean isMultiValue;

    private java.lang.String label;

    private java.lang.String linkTemplate;

    private java.lang.Boolean linkTemplateEnabled;

    private java.lang.String linkTooltip;

    private com.sforce.soap._2006._04.metadata.WaveXmdDimensionMember[] members;

    private java.lang.String origin;

    private com.sforce.soap._2006._04.metadata.WaveXmdRecordDisplayLookup[] recordDisplayFields;

    private java.lang.String recordIdField;

    private java.lang.String recordOrganizationIdField;

    private com.sforce.soap._2006._04.metadata.WaveXmdDimensionSalesforceAction[] salesforceActions;

    private java.lang.Boolean salesforceActionsEnabled;

    private java.lang.Integer showDetailsDefaultFieldIndex;

    private java.lang.Boolean showInExplorer;

    private int sortIndex;

    public WaveXmdDimension() {
    }

    public WaveXmdDimension(
           com.sforce.soap._2006._04.metadata.WaveXmdDimensionCustomAction[] customActions,
           java.lang.Boolean customActionsEnabled,
           java.lang.String dateFormat,
           java.lang.String description,
           java.lang.String field,
           java.lang.String fullyQualifiedName,
           java.lang.String imageTemplate,
           boolean isDerived,
           java.lang.Boolean isMultiValue,
           java.lang.String label,
           java.lang.String linkTemplate,
           java.lang.Boolean linkTemplateEnabled,
           java.lang.String linkTooltip,
           com.sforce.soap._2006._04.metadata.WaveXmdDimensionMember[] members,
           java.lang.String origin,
           com.sforce.soap._2006._04.metadata.WaveXmdRecordDisplayLookup[] recordDisplayFields,
           java.lang.String recordIdField,
           java.lang.String recordOrganizationIdField,
           com.sforce.soap._2006._04.metadata.WaveXmdDimensionSalesforceAction[] salesforceActions,
           java.lang.Boolean salesforceActionsEnabled,
           java.lang.Integer showDetailsDefaultFieldIndex,
           java.lang.Boolean showInExplorer,
           int sortIndex) {
           this.customActions = customActions;
           this.customActionsEnabled = customActionsEnabled;
           this.dateFormat = dateFormat;
           this.description = description;
           this.field = field;
           this.fullyQualifiedName = fullyQualifiedName;
           this.imageTemplate = imageTemplate;
           this.isDerived = isDerived;
           this.isMultiValue = isMultiValue;
           this.label = label;
           this.linkTemplate = linkTemplate;
           this.linkTemplateEnabled = linkTemplateEnabled;
           this.linkTooltip = linkTooltip;
           this.members = members;
           this.origin = origin;
           this.recordDisplayFields = recordDisplayFields;
           this.recordIdField = recordIdField;
           this.recordOrganizationIdField = recordOrganizationIdField;
           this.salesforceActions = salesforceActions;
           this.salesforceActionsEnabled = salesforceActionsEnabled;
           this.showDetailsDefaultFieldIndex = showDetailsDefaultFieldIndex;
           this.showInExplorer = showInExplorer;
           this.sortIndex = sortIndex;
    }


    /**
     * Gets the customActions value for this WaveXmdDimension.
     * 
     * @return customActions
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdDimensionCustomAction[] getCustomActions() {
        return customActions;
    }


    /**
     * Sets the customActions value for this WaveXmdDimension.
     * 
     * @param customActions
     */
    public void setCustomActions(com.sforce.soap._2006._04.metadata.WaveXmdDimensionCustomAction[] customActions) {
        this.customActions = customActions;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdDimensionCustomAction getCustomActions(int i) {
        return this.customActions[i];
    }

    public void setCustomActions(int i, com.sforce.soap._2006._04.metadata.WaveXmdDimensionCustomAction _value) {
        this.customActions[i] = _value;
    }


    /**
     * Gets the customActionsEnabled value for this WaveXmdDimension.
     * 
     * @return customActionsEnabled
     */
    public java.lang.Boolean getCustomActionsEnabled() {
        return customActionsEnabled;
    }


    /**
     * Sets the customActionsEnabled value for this WaveXmdDimension.
     * 
     * @param customActionsEnabled
     */
    public void setCustomActionsEnabled(java.lang.Boolean customActionsEnabled) {
        this.customActionsEnabled = customActionsEnabled;
    }


    /**
     * Gets the dateFormat value for this WaveXmdDimension.
     * 
     * @return dateFormat
     */
    public java.lang.String getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this WaveXmdDimension.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.String dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the description value for this WaveXmdDimension.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WaveXmdDimension.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the field value for this WaveXmdDimension.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this WaveXmdDimension.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the fullyQualifiedName value for this WaveXmdDimension.
     * 
     * @return fullyQualifiedName
     */
    public java.lang.String getFullyQualifiedName() {
        return fullyQualifiedName;
    }


    /**
     * Sets the fullyQualifiedName value for this WaveXmdDimension.
     * 
     * @param fullyQualifiedName
     */
    public void setFullyQualifiedName(java.lang.String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }


    /**
     * Gets the imageTemplate value for this WaveXmdDimension.
     * 
     * @return imageTemplate
     */
    public java.lang.String getImageTemplate() {
        return imageTemplate;
    }


    /**
     * Sets the imageTemplate value for this WaveXmdDimension.
     * 
     * @param imageTemplate
     */
    public void setImageTemplate(java.lang.String imageTemplate) {
        this.imageTemplate = imageTemplate;
    }


    /**
     * Gets the isDerived value for this WaveXmdDimension.
     * 
     * @return isDerived
     */
    public boolean isIsDerived() {
        return isDerived;
    }


    /**
     * Sets the isDerived value for this WaveXmdDimension.
     * 
     * @param isDerived
     */
    public void setIsDerived(boolean isDerived) {
        this.isDerived = isDerived;
    }


    /**
     * Gets the isMultiValue value for this WaveXmdDimension.
     * 
     * @return isMultiValue
     */
    public java.lang.Boolean getIsMultiValue() {
        return isMultiValue;
    }


    /**
     * Sets the isMultiValue value for this WaveXmdDimension.
     * 
     * @param isMultiValue
     */
    public void setIsMultiValue(java.lang.Boolean isMultiValue) {
        this.isMultiValue = isMultiValue;
    }


    /**
     * Gets the label value for this WaveXmdDimension.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this WaveXmdDimension.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the linkTemplate value for this WaveXmdDimension.
     * 
     * @return linkTemplate
     */
    public java.lang.String getLinkTemplate() {
        return linkTemplate;
    }


    /**
     * Sets the linkTemplate value for this WaveXmdDimension.
     * 
     * @param linkTemplate
     */
    public void setLinkTemplate(java.lang.String linkTemplate) {
        this.linkTemplate = linkTemplate;
    }


    /**
     * Gets the linkTemplateEnabled value for this WaveXmdDimension.
     * 
     * @return linkTemplateEnabled
     */
    public java.lang.Boolean getLinkTemplateEnabled() {
        return linkTemplateEnabled;
    }


    /**
     * Sets the linkTemplateEnabled value for this WaveXmdDimension.
     * 
     * @param linkTemplateEnabled
     */
    public void setLinkTemplateEnabled(java.lang.Boolean linkTemplateEnabled) {
        this.linkTemplateEnabled = linkTemplateEnabled;
    }


    /**
     * Gets the linkTooltip value for this WaveXmdDimension.
     * 
     * @return linkTooltip
     */
    public java.lang.String getLinkTooltip() {
        return linkTooltip;
    }


    /**
     * Sets the linkTooltip value for this WaveXmdDimension.
     * 
     * @param linkTooltip
     */
    public void setLinkTooltip(java.lang.String linkTooltip) {
        this.linkTooltip = linkTooltip;
    }


    /**
     * Gets the members value for this WaveXmdDimension.
     * 
     * @return members
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdDimensionMember[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this WaveXmdDimension.
     * 
     * @param members
     */
    public void setMembers(com.sforce.soap._2006._04.metadata.WaveXmdDimensionMember[] members) {
        this.members = members;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdDimensionMember getMembers(int i) {
        return this.members[i];
    }

    public void setMembers(int i, com.sforce.soap._2006._04.metadata.WaveXmdDimensionMember _value) {
        this.members[i] = _value;
    }


    /**
     * Gets the origin value for this WaveXmdDimension.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this WaveXmdDimension.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the recordDisplayFields value for this WaveXmdDimension.
     * 
     * @return recordDisplayFields
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdRecordDisplayLookup[] getRecordDisplayFields() {
        return recordDisplayFields;
    }


    /**
     * Sets the recordDisplayFields value for this WaveXmdDimension.
     * 
     * @param recordDisplayFields
     */
    public void setRecordDisplayFields(com.sforce.soap._2006._04.metadata.WaveXmdRecordDisplayLookup[] recordDisplayFields) {
        this.recordDisplayFields = recordDisplayFields;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdRecordDisplayLookup getRecordDisplayFields(int i) {
        return this.recordDisplayFields[i];
    }

    public void setRecordDisplayFields(int i, com.sforce.soap._2006._04.metadata.WaveXmdRecordDisplayLookup _value) {
        this.recordDisplayFields[i] = _value;
    }


    /**
     * Gets the recordIdField value for this WaveXmdDimension.
     * 
     * @return recordIdField
     */
    public java.lang.String getRecordIdField() {
        return recordIdField;
    }


    /**
     * Sets the recordIdField value for this WaveXmdDimension.
     * 
     * @param recordIdField
     */
    public void setRecordIdField(java.lang.String recordIdField) {
        this.recordIdField = recordIdField;
    }


    /**
     * Gets the recordOrganizationIdField value for this WaveXmdDimension.
     * 
     * @return recordOrganizationIdField
     */
    public java.lang.String getRecordOrganizationIdField() {
        return recordOrganizationIdField;
    }


    /**
     * Sets the recordOrganizationIdField value for this WaveXmdDimension.
     * 
     * @param recordOrganizationIdField
     */
    public void setRecordOrganizationIdField(java.lang.String recordOrganizationIdField) {
        this.recordOrganizationIdField = recordOrganizationIdField;
    }


    /**
     * Gets the salesforceActions value for this WaveXmdDimension.
     * 
     * @return salesforceActions
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdDimensionSalesforceAction[] getSalesforceActions() {
        return salesforceActions;
    }


    /**
     * Sets the salesforceActions value for this WaveXmdDimension.
     * 
     * @param salesforceActions
     */
    public void setSalesforceActions(com.sforce.soap._2006._04.metadata.WaveXmdDimensionSalesforceAction[] salesforceActions) {
        this.salesforceActions = salesforceActions;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdDimensionSalesforceAction getSalesforceActions(int i) {
        return this.salesforceActions[i];
    }

    public void setSalesforceActions(int i, com.sforce.soap._2006._04.metadata.WaveXmdDimensionSalesforceAction _value) {
        this.salesforceActions[i] = _value;
    }


    /**
     * Gets the salesforceActionsEnabled value for this WaveXmdDimension.
     * 
     * @return salesforceActionsEnabled
     */
    public java.lang.Boolean getSalesforceActionsEnabled() {
        return salesforceActionsEnabled;
    }


    /**
     * Sets the salesforceActionsEnabled value for this WaveXmdDimension.
     * 
     * @param salesforceActionsEnabled
     */
    public void setSalesforceActionsEnabled(java.lang.Boolean salesforceActionsEnabled) {
        this.salesforceActionsEnabled = salesforceActionsEnabled;
    }


    /**
     * Gets the showDetailsDefaultFieldIndex value for this WaveXmdDimension.
     * 
     * @return showDetailsDefaultFieldIndex
     */
    public java.lang.Integer getShowDetailsDefaultFieldIndex() {
        return showDetailsDefaultFieldIndex;
    }


    /**
     * Sets the showDetailsDefaultFieldIndex value for this WaveXmdDimension.
     * 
     * @param showDetailsDefaultFieldIndex
     */
    public void setShowDetailsDefaultFieldIndex(java.lang.Integer showDetailsDefaultFieldIndex) {
        this.showDetailsDefaultFieldIndex = showDetailsDefaultFieldIndex;
    }


    /**
     * Gets the showInExplorer value for this WaveXmdDimension.
     * 
     * @return showInExplorer
     */
    public java.lang.Boolean getShowInExplorer() {
        return showInExplorer;
    }


    /**
     * Sets the showInExplorer value for this WaveXmdDimension.
     * 
     * @param showInExplorer
     */
    public void setShowInExplorer(java.lang.Boolean showInExplorer) {
        this.showInExplorer = showInExplorer;
    }


    /**
     * Gets the sortIndex value for this WaveXmdDimension.
     * 
     * @return sortIndex
     */
    public int getSortIndex() {
        return sortIndex;
    }


    /**
     * Sets the sortIndex value for this WaveXmdDimension.
     * 
     * @param sortIndex
     */
    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaveXmdDimension)) return false;
        WaveXmdDimension other = (WaveXmdDimension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customActions==null && other.getCustomActions()==null) || 
             (this.customActions!=null &&
              java.util.Arrays.equals(this.customActions, other.getCustomActions()))) &&
            ((this.customActionsEnabled==null && other.getCustomActionsEnabled()==null) || 
             (this.customActionsEnabled!=null &&
              this.customActionsEnabled.equals(other.getCustomActionsEnabled()))) &&
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.fullyQualifiedName==null && other.getFullyQualifiedName()==null) || 
             (this.fullyQualifiedName!=null &&
              this.fullyQualifiedName.equals(other.getFullyQualifiedName()))) &&
            ((this.imageTemplate==null && other.getImageTemplate()==null) || 
             (this.imageTemplate!=null &&
              this.imageTemplate.equals(other.getImageTemplate()))) &&
            this.isDerived == other.isIsDerived() &&
            ((this.isMultiValue==null && other.getIsMultiValue()==null) || 
             (this.isMultiValue!=null &&
              this.isMultiValue.equals(other.getIsMultiValue()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.linkTemplate==null && other.getLinkTemplate()==null) || 
             (this.linkTemplate!=null &&
              this.linkTemplate.equals(other.getLinkTemplate()))) &&
            ((this.linkTemplateEnabled==null && other.getLinkTemplateEnabled()==null) || 
             (this.linkTemplateEnabled!=null &&
              this.linkTemplateEnabled.equals(other.getLinkTemplateEnabled()))) &&
            ((this.linkTooltip==null && other.getLinkTooltip()==null) || 
             (this.linkTooltip!=null &&
              this.linkTooltip.equals(other.getLinkTooltip()))) &&
            ((this.members==null && other.getMembers()==null) || 
             (this.members!=null &&
              java.util.Arrays.equals(this.members, other.getMembers()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.recordDisplayFields==null && other.getRecordDisplayFields()==null) || 
             (this.recordDisplayFields!=null &&
              java.util.Arrays.equals(this.recordDisplayFields, other.getRecordDisplayFields()))) &&
            ((this.recordIdField==null && other.getRecordIdField()==null) || 
             (this.recordIdField!=null &&
              this.recordIdField.equals(other.getRecordIdField()))) &&
            ((this.recordOrganizationIdField==null && other.getRecordOrganizationIdField()==null) || 
             (this.recordOrganizationIdField!=null &&
              this.recordOrganizationIdField.equals(other.getRecordOrganizationIdField()))) &&
            ((this.salesforceActions==null && other.getSalesforceActions()==null) || 
             (this.salesforceActions!=null &&
              java.util.Arrays.equals(this.salesforceActions, other.getSalesforceActions()))) &&
            ((this.salesforceActionsEnabled==null && other.getSalesforceActionsEnabled()==null) || 
             (this.salesforceActionsEnabled!=null &&
              this.salesforceActionsEnabled.equals(other.getSalesforceActionsEnabled()))) &&
            ((this.showDetailsDefaultFieldIndex==null && other.getShowDetailsDefaultFieldIndex()==null) || 
             (this.showDetailsDefaultFieldIndex!=null &&
              this.showDetailsDefaultFieldIndex.equals(other.getShowDetailsDefaultFieldIndex()))) &&
            ((this.showInExplorer==null && other.getShowInExplorer()==null) || 
             (this.showInExplorer!=null &&
              this.showInExplorer.equals(other.getShowInExplorer()))) &&
            this.sortIndex == other.getSortIndex();
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
        if (getCustomActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomActionsEnabled() != null) {
            _hashCode += getCustomActionsEnabled().hashCode();
        }
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getFullyQualifiedName() != null) {
            _hashCode += getFullyQualifiedName().hashCode();
        }
        if (getImageTemplate() != null) {
            _hashCode += getImageTemplate().hashCode();
        }
        _hashCode += (isIsDerived() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIsMultiValue() != null) {
            _hashCode += getIsMultiValue().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLinkTemplate() != null) {
            _hashCode += getLinkTemplate().hashCode();
        }
        if (getLinkTemplateEnabled() != null) {
            _hashCode += getLinkTemplateEnabled().hashCode();
        }
        if (getLinkTooltip() != null) {
            _hashCode += getLinkTooltip().hashCode();
        }
        if (getMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getRecordDisplayFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordDisplayFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordDisplayFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordIdField() != null) {
            _hashCode += getRecordIdField().hashCode();
        }
        if (getRecordOrganizationIdField() != null) {
            _hashCode += getRecordOrganizationIdField().hashCode();
        }
        if (getSalesforceActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesforceActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesforceActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesforceActionsEnabled() != null) {
            _hashCode += getSalesforceActionsEnabled().hashCode();
        }
        if (getShowDetailsDefaultFieldIndex() != null) {
            _hashCode += getShowDetailsDefaultFieldIndex().hashCode();
        }
        if (getShowInExplorer() != null) {
            _hashCode += getShowInExplorer().hashCode();
        }
        _hashCode += getSortIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaveXmdDimension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdDimension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdDimensionCustomAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customActionsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customActionsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullyQualifiedName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fullyQualifiedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "imageTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDerived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isDerived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isMultiValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "linkTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkTemplateEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "linkTemplateEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkTooltip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "linkTooltip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "members"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdDimensionMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordDisplayFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordDisplayFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdRecordDisplayLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordIdField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordOrganizationIdField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordOrganizationIdField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "salesforceActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdDimensionSalesforceAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceActionsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "salesforceActionsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showDetailsDefaultFieldIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showDetailsDefaultFieldIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showInExplorer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showInExplorer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
