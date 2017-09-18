/**
 * CustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomField  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean caseSensitive;

    private java.lang.String customDataType;

    private java.lang.String defaultValue;

    private com.sforce.soap._2006._04.metadata.DeleteConstraint deleteConstraint;

    private java.lang.Boolean deprecated;

    private java.lang.String description;

    private java.lang.String displayFormat;

    private java.lang.Boolean encrypted;

    private java.lang.Boolean escapeMarkup;

    private java.lang.String externalDeveloperName;

    private java.lang.Boolean externalId;

    private com.sforce.soap._2006._04.metadata.FieldManageability fieldManageability;

    private java.lang.String formula;

    private com.sforce.soap._2006._04.metadata.TreatBlanksAs formulaTreatBlanksAs;

    private java.lang.String inlineHelpText;

    private java.lang.Boolean isConvertLeadDisabled;

    private java.lang.Boolean isFilteringDisabled;

    private java.lang.Boolean isNameField;

    private java.lang.Boolean isSortingDisabled;

    private java.lang.String label;

    private java.lang.Integer length;

    private com.sforce.soap._2006._04.metadata.LookupFilter lookupFilter;

    private com.sforce.soap._2006._04.metadata.EncryptedFieldMaskChar maskChar;

    private com.sforce.soap._2006._04.metadata.EncryptedFieldMaskType maskType;

    private java.lang.String metadataRelationshipControllingField;

    private java.lang.Boolean populateExistingRows;

    private java.lang.Integer precision;

    private java.lang.String referenceTargetField;

    private java.lang.String referenceTo;

    private java.lang.String relationshipLabel;

    private java.lang.String relationshipName;

    private java.lang.Integer relationshipOrder;

    private java.lang.Boolean reparentableMasterDetail;

    private java.lang.Boolean required;

    private java.lang.Boolean restrictedAdminField;

    private java.lang.Integer scale;

    private java.lang.Integer startingNumber;

    private java.lang.Boolean stripMarkup;

    private java.lang.String summarizedField;

    private com.sforce.soap._2006._04.metadata.FilterItem[] summaryFilterItems;

    private java.lang.String summaryForeignKey;

    private com.sforce.soap._2006._04.metadata.SummaryOperations summaryOperation;

    private java.lang.Boolean trackFeedHistory;

    private java.lang.Boolean trackHistory;

    private java.lang.Boolean trackTrending;

    private com.sforce.soap._2006._04.metadata.FieldType type;

    private java.lang.Boolean unique;

    private com.sforce.soap._2006._04.metadata.ValueSet valueSet;

    private java.lang.Integer visibleLines;

    private java.lang.Boolean writeRequiresMasterRead;

    public CustomField() {
    }

    public CustomField(
           java.lang.String fullName,
           java.lang.Boolean caseSensitive,
           java.lang.String customDataType,
           java.lang.String defaultValue,
           com.sforce.soap._2006._04.metadata.DeleteConstraint deleteConstraint,
           java.lang.Boolean deprecated,
           java.lang.String description,
           java.lang.String displayFormat,
           java.lang.Boolean encrypted,
           java.lang.Boolean escapeMarkup,
           java.lang.String externalDeveloperName,
           java.lang.Boolean externalId,
           com.sforce.soap._2006._04.metadata.FieldManageability fieldManageability,
           java.lang.String formula,
           com.sforce.soap._2006._04.metadata.TreatBlanksAs formulaTreatBlanksAs,
           java.lang.String inlineHelpText,
           java.lang.Boolean isConvertLeadDisabled,
           java.lang.Boolean isFilteringDisabled,
           java.lang.Boolean isNameField,
           java.lang.Boolean isSortingDisabled,
           java.lang.String label,
           java.lang.Integer length,
           com.sforce.soap._2006._04.metadata.LookupFilter lookupFilter,
           com.sforce.soap._2006._04.metadata.EncryptedFieldMaskChar maskChar,
           com.sforce.soap._2006._04.metadata.EncryptedFieldMaskType maskType,
           java.lang.String metadataRelationshipControllingField,
           java.lang.Boolean populateExistingRows,
           java.lang.Integer precision,
           java.lang.String referenceTargetField,
           java.lang.String referenceTo,
           java.lang.String relationshipLabel,
           java.lang.String relationshipName,
           java.lang.Integer relationshipOrder,
           java.lang.Boolean reparentableMasterDetail,
           java.lang.Boolean required,
           java.lang.Boolean restrictedAdminField,
           java.lang.Integer scale,
           java.lang.Integer startingNumber,
           java.lang.Boolean stripMarkup,
           java.lang.String summarizedField,
           com.sforce.soap._2006._04.metadata.FilterItem[] summaryFilterItems,
           java.lang.String summaryForeignKey,
           com.sforce.soap._2006._04.metadata.SummaryOperations summaryOperation,
           java.lang.Boolean trackFeedHistory,
           java.lang.Boolean trackHistory,
           java.lang.Boolean trackTrending,
           com.sforce.soap._2006._04.metadata.FieldType type,
           java.lang.Boolean unique,
           com.sforce.soap._2006._04.metadata.ValueSet valueSet,
           java.lang.Integer visibleLines,
           java.lang.Boolean writeRequiresMasterRead) {
        super(
            fullName);
        this.caseSensitive = caseSensitive;
        this.customDataType = customDataType;
        this.defaultValue = defaultValue;
        this.deleteConstraint = deleteConstraint;
        this.deprecated = deprecated;
        this.description = description;
        this.displayFormat = displayFormat;
        this.encrypted = encrypted;
        this.escapeMarkup = escapeMarkup;
        this.externalDeveloperName = externalDeveloperName;
        this.externalId = externalId;
        this.fieldManageability = fieldManageability;
        this.formula = formula;
        this.formulaTreatBlanksAs = formulaTreatBlanksAs;
        this.inlineHelpText = inlineHelpText;
        this.isConvertLeadDisabled = isConvertLeadDisabled;
        this.isFilteringDisabled = isFilteringDisabled;
        this.isNameField = isNameField;
        this.isSortingDisabled = isSortingDisabled;
        this.label = label;
        this.length = length;
        this.lookupFilter = lookupFilter;
        this.maskChar = maskChar;
        this.maskType = maskType;
        this.metadataRelationshipControllingField = metadataRelationshipControllingField;
        this.populateExistingRows = populateExistingRows;
        this.precision = precision;
        this.referenceTargetField = referenceTargetField;
        this.referenceTo = referenceTo;
        this.relationshipLabel = relationshipLabel;
        this.relationshipName = relationshipName;
        this.relationshipOrder = relationshipOrder;
        this.reparentableMasterDetail = reparentableMasterDetail;
        this.required = required;
        this.restrictedAdminField = restrictedAdminField;
        this.scale = scale;
        this.startingNumber = startingNumber;
        this.stripMarkup = stripMarkup;
        this.summarizedField = summarizedField;
        this.summaryFilterItems = summaryFilterItems;
        this.summaryForeignKey = summaryForeignKey;
        this.summaryOperation = summaryOperation;
        this.trackFeedHistory = trackFeedHistory;
        this.trackHistory = trackHistory;
        this.trackTrending = trackTrending;
        this.type = type;
        this.unique = unique;
        this.valueSet = valueSet;
        this.visibleLines = visibleLines;
        this.writeRequiresMasterRead = writeRequiresMasterRead;
    }


    /**
     * Gets the caseSensitive value for this CustomField.
     * 
     * @return caseSensitive
     */
    public java.lang.Boolean getCaseSensitive() {
        return caseSensitive;
    }


    /**
     * Sets the caseSensitive value for this CustomField.
     * 
     * @param caseSensitive
     */
    public void setCaseSensitive(java.lang.Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }


    /**
     * Gets the customDataType value for this CustomField.
     * 
     * @return customDataType
     */
    public java.lang.String getCustomDataType() {
        return customDataType;
    }


    /**
     * Sets the customDataType value for this CustomField.
     * 
     * @param customDataType
     */
    public void setCustomDataType(java.lang.String customDataType) {
        this.customDataType = customDataType;
    }


    /**
     * Gets the defaultValue value for this CustomField.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this CustomField.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the deleteConstraint value for this CustomField.
     * 
     * @return deleteConstraint
     */
    public com.sforce.soap._2006._04.metadata.DeleteConstraint getDeleteConstraint() {
        return deleteConstraint;
    }


    /**
     * Sets the deleteConstraint value for this CustomField.
     * 
     * @param deleteConstraint
     */
    public void setDeleteConstraint(com.sforce.soap._2006._04.metadata.DeleteConstraint deleteConstraint) {
        this.deleteConstraint = deleteConstraint;
    }


    /**
     * Gets the deprecated value for this CustomField.
     * 
     * @return deprecated
     */
    public java.lang.Boolean getDeprecated() {
        return deprecated;
    }


    /**
     * Sets the deprecated value for this CustomField.
     * 
     * @param deprecated
     */
    public void setDeprecated(java.lang.Boolean deprecated) {
        this.deprecated = deprecated;
    }


    /**
     * Gets the description value for this CustomField.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomField.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayFormat value for this CustomField.
     * 
     * @return displayFormat
     */
    public java.lang.String getDisplayFormat() {
        return displayFormat;
    }


    /**
     * Sets the displayFormat value for this CustomField.
     * 
     * @param displayFormat
     */
    public void setDisplayFormat(java.lang.String displayFormat) {
        this.displayFormat = displayFormat;
    }


    /**
     * Gets the encrypted value for this CustomField.
     * 
     * @return encrypted
     */
    public java.lang.Boolean getEncrypted() {
        return encrypted;
    }


    /**
     * Sets the encrypted value for this CustomField.
     * 
     * @param encrypted
     */
    public void setEncrypted(java.lang.Boolean encrypted) {
        this.encrypted = encrypted;
    }


    /**
     * Gets the escapeMarkup value for this CustomField.
     * 
     * @return escapeMarkup
     */
    public java.lang.Boolean getEscapeMarkup() {
        return escapeMarkup;
    }


    /**
     * Sets the escapeMarkup value for this CustomField.
     * 
     * @param escapeMarkup
     */
    public void setEscapeMarkup(java.lang.Boolean escapeMarkup) {
        this.escapeMarkup = escapeMarkup;
    }


    /**
     * Gets the externalDeveloperName value for this CustomField.
     * 
     * @return externalDeveloperName
     */
    public java.lang.String getExternalDeveloperName() {
        return externalDeveloperName;
    }


    /**
     * Sets the externalDeveloperName value for this CustomField.
     * 
     * @param externalDeveloperName
     */
    public void setExternalDeveloperName(java.lang.String externalDeveloperName) {
        this.externalDeveloperName = externalDeveloperName;
    }


    /**
     * Gets the externalId value for this CustomField.
     * 
     * @return externalId
     */
    public java.lang.Boolean getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomField.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.Boolean externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the fieldManageability value for this CustomField.
     * 
     * @return fieldManageability
     */
    public com.sforce.soap._2006._04.metadata.FieldManageability getFieldManageability() {
        return fieldManageability;
    }


    /**
     * Sets the fieldManageability value for this CustomField.
     * 
     * @param fieldManageability
     */
    public void setFieldManageability(com.sforce.soap._2006._04.metadata.FieldManageability fieldManageability) {
        this.fieldManageability = fieldManageability;
    }


    /**
     * Gets the formula value for this CustomField.
     * 
     * @return formula
     */
    public java.lang.String getFormula() {
        return formula;
    }


    /**
     * Sets the formula value for this CustomField.
     * 
     * @param formula
     */
    public void setFormula(java.lang.String formula) {
        this.formula = formula;
    }


    /**
     * Gets the formulaTreatBlanksAs value for this CustomField.
     * 
     * @return formulaTreatBlanksAs
     */
    public com.sforce.soap._2006._04.metadata.TreatBlanksAs getFormulaTreatBlanksAs() {
        return formulaTreatBlanksAs;
    }


    /**
     * Sets the formulaTreatBlanksAs value for this CustomField.
     * 
     * @param formulaTreatBlanksAs
     */
    public void setFormulaTreatBlanksAs(com.sforce.soap._2006._04.metadata.TreatBlanksAs formulaTreatBlanksAs) {
        this.formulaTreatBlanksAs = formulaTreatBlanksAs;
    }


    /**
     * Gets the inlineHelpText value for this CustomField.
     * 
     * @return inlineHelpText
     */
    public java.lang.String getInlineHelpText() {
        return inlineHelpText;
    }


    /**
     * Sets the inlineHelpText value for this CustomField.
     * 
     * @param inlineHelpText
     */
    public void setInlineHelpText(java.lang.String inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
    }


    /**
     * Gets the isConvertLeadDisabled value for this CustomField.
     * 
     * @return isConvertLeadDisabled
     */
    public java.lang.Boolean getIsConvertLeadDisabled() {
        return isConvertLeadDisabled;
    }


    /**
     * Sets the isConvertLeadDisabled value for this CustomField.
     * 
     * @param isConvertLeadDisabled
     */
    public void setIsConvertLeadDisabled(java.lang.Boolean isConvertLeadDisabled) {
        this.isConvertLeadDisabled = isConvertLeadDisabled;
    }


    /**
     * Gets the isFilteringDisabled value for this CustomField.
     * 
     * @return isFilteringDisabled
     */
    public java.lang.Boolean getIsFilteringDisabled() {
        return isFilteringDisabled;
    }


    /**
     * Sets the isFilteringDisabled value for this CustomField.
     * 
     * @param isFilteringDisabled
     */
    public void setIsFilteringDisabled(java.lang.Boolean isFilteringDisabled) {
        this.isFilteringDisabled = isFilteringDisabled;
    }


    /**
     * Gets the isNameField value for this CustomField.
     * 
     * @return isNameField
     */
    public java.lang.Boolean getIsNameField() {
        return isNameField;
    }


    /**
     * Sets the isNameField value for this CustomField.
     * 
     * @param isNameField
     */
    public void setIsNameField(java.lang.Boolean isNameField) {
        this.isNameField = isNameField;
    }


    /**
     * Gets the isSortingDisabled value for this CustomField.
     * 
     * @return isSortingDisabled
     */
    public java.lang.Boolean getIsSortingDisabled() {
        return isSortingDisabled;
    }


    /**
     * Sets the isSortingDisabled value for this CustomField.
     * 
     * @param isSortingDisabled
     */
    public void setIsSortingDisabled(java.lang.Boolean isSortingDisabled) {
        this.isSortingDisabled = isSortingDisabled;
    }


    /**
     * Gets the label value for this CustomField.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CustomField.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the length value for this CustomField.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this CustomField.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the lookupFilter value for this CustomField.
     * 
     * @return lookupFilter
     */
    public com.sforce.soap._2006._04.metadata.LookupFilter getLookupFilter() {
        return lookupFilter;
    }


    /**
     * Sets the lookupFilter value for this CustomField.
     * 
     * @param lookupFilter
     */
    public void setLookupFilter(com.sforce.soap._2006._04.metadata.LookupFilter lookupFilter) {
        this.lookupFilter = lookupFilter;
    }


    /**
     * Gets the maskChar value for this CustomField.
     * 
     * @return maskChar
     */
    public com.sforce.soap._2006._04.metadata.EncryptedFieldMaskChar getMaskChar() {
        return maskChar;
    }


    /**
     * Sets the maskChar value for this CustomField.
     * 
     * @param maskChar
     */
    public void setMaskChar(com.sforce.soap._2006._04.metadata.EncryptedFieldMaskChar maskChar) {
        this.maskChar = maskChar;
    }


    /**
     * Gets the maskType value for this CustomField.
     * 
     * @return maskType
     */
    public com.sforce.soap._2006._04.metadata.EncryptedFieldMaskType getMaskType() {
        return maskType;
    }


    /**
     * Sets the maskType value for this CustomField.
     * 
     * @param maskType
     */
    public void setMaskType(com.sforce.soap._2006._04.metadata.EncryptedFieldMaskType maskType) {
        this.maskType = maskType;
    }


    /**
     * Gets the metadataRelationshipControllingField value for this CustomField.
     * 
     * @return metadataRelationshipControllingField
     */
    public java.lang.String getMetadataRelationshipControllingField() {
        return metadataRelationshipControllingField;
    }


    /**
     * Sets the metadataRelationshipControllingField value for this CustomField.
     * 
     * @param metadataRelationshipControllingField
     */
    public void setMetadataRelationshipControllingField(java.lang.String metadataRelationshipControllingField) {
        this.metadataRelationshipControllingField = metadataRelationshipControllingField;
    }


    /**
     * Gets the populateExistingRows value for this CustomField.
     * 
     * @return populateExistingRows
     */
    public java.lang.Boolean getPopulateExistingRows() {
        return populateExistingRows;
    }


    /**
     * Sets the populateExistingRows value for this CustomField.
     * 
     * @param populateExistingRows
     */
    public void setPopulateExistingRows(java.lang.Boolean populateExistingRows) {
        this.populateExistingRows = populateExistingRows;
    }


    /**
     * Gets the precision value for this CustomField.
     * 
     * @return precision
     */
    public java.lang.Integer getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this CustomField.
     * 
     * @param precision
     */
    public void setPrecision(java.lang.Integer precision) {
        this.precision = precision;
    }


    /**
     * Gets the referenceTargetField value for this CustomField.
     * 
     * @return referenceTargetField
     */
    public java.lang.String getReferenceTargetField() {
        return referenceTargetField;
    }


    /**
     * Sets the referenceTargetField value for this CustomField.
     * 
     * @param referenceTargetField
     */
    public void setReferenceTargetField(java.lang.String referenceTargetField) {
        this.referenceTargetField = referenceTargetField;
    }


    /**
     * Gets the referenceTo value for this CustomField.
     * 
     * @return referenceTo
     */
    public java.lang.String getReferenceTo() {
        return referenceTo;
    }


    /**
     * Sets the referenceTo value for this CustomField.
     * 
     * @param referenceTo
     */
    public void setReferenceTo(java.lang.String referenceTo) {
        this.referenceTo = referenceTo;
    }


    /**
     * Gets the relationshipLabel value for this CustomField.
     * 
     * @return relationshipLabel
     */
    public java.lang.String getRelationshipLabel() {
        return relationshipLabel;
    }


    /**
     * Sets the relationshipLabel value for this CustomField.
     * 
     * @param relationshipLabel
     */
    public void setRelationshipLabel(java.lang.String relationshipLabel) {
        this.relationshipLabel = relationshipLabel;
    }


    /**
     * Gets the relationshipName value for this CustomField.
     * 
     * @return relationshipName
     */
    public java.lang.String getRelationshipName() {
        return relationshipName;
    }


    /**
     * Sets the relationshipName value for this CustomField.
     * 
     * @param relationshipName
     */
    public void setRelationshipName(java.lang.String relationshipName) {
        this.relationshipName = relationshipName;
    }


    /**
     * Gets the relationshipOrder value for this CustomField.
     * 
     * @return relationshipOrder
     */
    public java.lang.Integer getRelationshipOrder() {
        return relationshipOrder;
    }


    /**
     * Sets the relationshipOrder value for this CustomField.
     * 
     * @param relationshipOrder
     */
    public void setRelationshipOrder(java.lang.Integer relationshipOrder) {
        this.relationshipOrder = relationshipOrder;
    }


    /**
     * Gets the reparentableMasterDetail value for this CustomField.
     * 
     * @return reparentableMasterDetail
     */
    public java.lang.Boolean getReparentableMasterDetail() {
        return reparentableMasterDetail;
    }


    /**
     * Sets the reparentableMasterDetail value for this CustomField.
     * 
     * @param reparentableMasterDetail
     */
    public void setReparentableMasterDetail(java.lang.Boolean reparentableMasterDetail) {
        this.reparentableMasterDetail = reparentableMasterDetail;
    }


    /**
     * Gets the required value for this CustomField.
     * 
     * @return required
     */
    public java.lang.Boolean getRequired() {
        return required;
    }


    /**
     * Sets the required value for this CustomField.
     * 
     * @param required
     */
    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }


    /**
     * Gets the restrictedAdminField value for this CustomField.
     * 
     * @return restrictedAdminField
     */
    public java.lang.Boolean getRestrictedAdminField() {
        return restrictedAdminField;
    }


    /**
     * Sets the restrictedAdminField value for this CustomField.
     * 
     * @param restrictedAdminField
     */
    public void setRestrictedAdminField(java.lang.Boolean restrictedAdminField) {
        this.restrictedAdminField = restrictedAdminField;
    }


    /**
     * Gets the scale value for this CustomField.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this CustomField.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the startingNumber value for this CustomField.
     * 
     * @return startingNumber
     */
    public java.lang.Integer getStartingNumber() {
        return startingNumber;
    }


    /**
     * Sets the startingNumber value for this CustomField.
     * 
     * @param startingNumber
     */
    public void setStartingNumber(java.lang.Integer startingNumber) {
        this.startingNumber = startingNumber;
    }


    /**
     * Gets the stripMarkup value for this CustomField.
     * 
     * @return stripMarkup
     */
    public java.lang.Boolean getStripMarkup() {
        return stripMarkup;
    }


    /**
     * Sets the stripMarkup value for this CustomField.
     * 
     * @param stripMarkup
     */
    public void setStripMarkup(java.lang.Boolean stripMarkup) {
        this.stripMarkup = stripMarkup;
    }


    /**
     * Gets the summarizedField value for this CustomField.
     * 
     * @return summarizedField
     */
    public java.lang.String getSummarizedField() {
        return summarizedField;
    }


    /**
     * Sets the summarizedField value for this CustomField.
     * 
     * @param summarizedField
     */
    public void setSummarizedField(java.lang.String summarizedField) {
        this.summarizedField = summarizedField;
    }


    /**
     * Gets the summaryFilterItems value for this CustomField.
     * 
     * @return summaryFilterItems
     */
    public com.sforce.soap._2006._04.metadata.FilterItem[] getSummaryFilterItems() {
        return summaryFilterItems;
    }


    /**
     * Sets the summaryFilterItems value for this CustomField.
     * 
     * @param summaryFilterItems
     */
    public void setSummaryFilterItems(com.sforce.soap._2006._04.metadata.FilterItem[] summaryFilterItems) {
        this.summaryFilterItems = summaryFilterItems;
    }

    public com.sforce.soap._2006._04.metadata.FilterItem getSummaryFilterItems(int i) {
        return this.summaryFilterItems[i];
    }

    public void setSummaryFilterItems(int i, com.sforce.soap._2006._04.metadata.FilterItem _value) {
        this.summaryFilterItems[i] = _value;
    }


    /**
     * Gets the summaryForeignKey value for this CustomField.
     * 
     * @return summaryForeignKey
     */
    public java.lang.String getSummaryForeignKey() {
        return summaryForeignKey;
    }


    /**
     * Sets the summaryForeignKey value for this CustomField.
     * 
     * @param summaryForeignKey
     */
    public void setSummaryForeignKey(java.lang.String summaryForeignKey) {
        this.summaryForeignKey = summaryForeignKey;
    }


    /**
     * Gets the summaryOperation value for this CustomField.
     * 
     * @return summaryOperation
     */
    public com.sforce.soap._2006._04.metadata.SummaryOperations getSummaryOperation() {
        return summaryOperation;
    }


    /**
     * Sets the summaryOperation value for this CustomField.
     * 
     * @param summaryOperation
     */
    public void setSummaryOperation(com.sforce.soap._2006._04.metadata.SummaryOperations summaryOperation) {
        this.summaryOperation = summaryOperation;
    }


    /**
     * Gets the trackFeedHistory value for this CustomField.
     * 
     * @return trackFeedHistory
     */
    public java.lang.Boolean getTrackFeedHistory() {
        return trackFeedHistory;
    }


    /**
     * Sets the trackFeedHistory value for this CustomField.
     * 
     * @param trackFeedHistory
     */
    public void setTrackFeedHistory(java.lang.Boolean trackFeedHistory) {
        this.trackFeedHistory = trackFeedHistory;
    }


    /**
     * Gets the trackHistory value for this CustomField.
     * 
     * @return trackHistory
     */
    public java.lang.Boolean getTrackHistory() {
        return trackHistory;
    }


    /**
     * Sets the trackHistory value for this CustomField.
     * 
     * @param trackHistory
     */
    public void setTrackHistory(java.lang.Boolean trackHistory) {
        this.trackHistory = trackHistory;
    }


    /**
     * Gets the trackTrending value for this CustomField.
     * 
     * @return trackTrending
     */
    public java.lang.Boolean getTrackTrending() {
        return trackTrending;
    }


    /**
     * Sets the trackTrending value for this CustomField.
     * 
     * @param trackTrending
     */
    public void setTrackTrending(java.lang.Boolean trackTrending) {
        this.trackTrending = trackTrending;
    }


    /**
     * Gets the type value for this CustomField.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.FieldType getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomField.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.FieldType type) {
        this.type = type;
    }


    /**
     * Gets the unique value for this CustomField.
     * 
     * @return unique
     */
    public java.lang.Boolean getUnique() {
        return unique;
    }


    /**
     * Sets the unique value for this CustomField.
     * 
     * @param unique
     */
    public void setUnique(java.lang.Boolean unique) {
        this.unique = unique;
    }


    /**
     * Gets the valueSet value for this CustomField.
     * 
     * @return valueSet
     */
    public com.sforce.soap._2006._04.metadata.ValueSet getValueSet() {
        return valueSet;
    }


    /**
     * Sets the valueSet value for this CustomField.
     * 
     * @param valueSet
     */
    public void setValueSet(com.sforce.soap._2006._04.metadata.ValueSet valueSet) {
        this.valueSet = valueSet;
    }


    /**
     * Gets the visibleLines value for this CustomField.
     * 
     * @return visibleLines
     */
    public java.lang.Integer getVisibleLines() {
        return visibleLines;
    }


    /**
     * Sets the visibleLines value for this CustomField.
     * 
     * @param visibleLines
     */
    public void setVisibleLines(java.lang.Integer visibleLines) {
        this.visibleLines = visibleLines;
    }


    /**
     * Gets the writeRequiresMasterRead value for this CustomField.
     * 
     * @return writeRequiresMasterRead
     */
    public java.lang.Boolean getWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }


    /**
     * Sets the writeRequiresMasterRead value for this CustomField.
     * 
     * @param writeRequiresMasterRead
     */
    public void setWriteRequiresMasterRead(java.lang.Boolean writeRequiresMasterRead) {
        this.writeRequiresMasterRead = writeRequiresMasterRead;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomField)) return false;
        CustomField other = (CustomField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.caseSensitive==null && other.getCaseSensitive()==null) || 
             (this.caseSensitive!=null &&
              this.caseSensitive.equals(other.getCaseSensitive()))) &&
            ((this.customDataType==null && other.getCustomDataType()==null) || 
             (this.customDataType!=null &&
              this.customDataType.equals(other.getCustomDataType()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.deleteConstraint==null && other.getDeleteConstraint()==null) || 
             (this.deleteConstraint!=null &&
              this.deleteConstraint.equals(other.getDeleteConstraint()))) &&
            ((this.deprecated==null && other.getDeprecated()==null) || 
             (this.deprecated!=null &&
              this.deprecated.equals(other.getDeprecated()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayFormat==null && other.getDisplayFormat()==null) || 
             (this.displayFormat!=null &&
              this.displayFormat.equals(other.getDisplayFormat()))) &&
            ((this.encrypted==null && other.getEncrypted()==null) || 
             (this.encrypted!=null &&
              this.encrypted.equals(other.getEncrypted()))) &&
            ((this.escapeMarkup==null && other.getEscapeMarkup()==null) || 
             (this.escapeMarkup!=null &&
              this.escapeMarkup.equals(other.getEscapeMarkup()))) &&
            ((this.externalDeveloperName==null && other.getExternalDeveloperName()==null) || 
             (this.externalDeveloperName!=null &&
              this.externalDeveloperName.equals(other.getExternalDeveloperName()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.fieldManageability==null && other.getFieldManageability()==null) || 
             (this.fieldManageability!=null &&
              this.fieldManageability.equals(other.getFieldManageability()))) &&
            ((this.formula==null && other.getFormula()==null) || 
             (this.formula!=null &&
              this.formula.equals(other.getFormula()))) &&
            ((this.formulaTreatBlanksAs==null && other.getFormulaTreatBlanksAs()==null) || 
             (this.formulaTreatBlanksAs!=null &&
              this.formulaTreatBlanksAs.equals(other.getFormulaTreatBlanksAs()))) &&
            ((this.inlineHelpText==null && other.getInlineHelpText()==null) || 
             (this.inlineHelpText!=null &&
              this.inlineHelpText.equals(other.getInlineHelpText()))) &&
            ((this.isConvertLeadDisabled==null && other.getIsConvertLeadDisabled()==null) || 
             (this.isConvertLeadDisabled!=null &&
              this.isConvertLeadDisabled.equals(other.getIsConvertLeadDisabled()))) &&
            ((this.isFilteringDisabled==null && other.getIsFilteringDisabled()==null) || 
             (this.isFilteringDisabled!=null &&
              this.isFilteringDisabled.equals(other.getIsFilteringDisabled()))) &&
            ((this.isNameField==null && other.getIsNameField()==null) || 
             (this.isNameField!=null &&
              this.isNameField.equals(other.getIsNameField()))) &&
            ((this.isSortingDisabled==null && other.getIsSortingDisabled()==null) || 
             (this.isSortingDisabled!=null &&
              this.isSortingDisabled.equals(other.getIsSortingDisabled()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.lookupFilter==null && other.getLookupFilter()==null) || 
             (this.lookupFilter!=null &&
              this.lookupFilter.equals(other.getLookupFilter()))) &&
            ((this.maskChar==null && other.getMaskChar()==null) || 
             (this.maskChar!=null &&
              this.maskChar.equals(other.getMaskChar()))) &&
            ((this.maskType==null && other.getMaskType()==null) || 
             (this.maskType!=null &&
              this.maskType.equals(other.getMaskType()))) &&
            ((this.metadataRelationshipControllingField==null && other.getMetadataRelationshipControllingField()==null) || 
             (this.metadataRelationshipControllingField!=null &&
              this.metadataRelationshipControllingField.equals(other.getMetadataRelationshipControllingField()))) &&
            ((this.populateExistingRows==null && other.getPopulateExistingRows()==null) || 
             (this.populateExistingRows!=null &&
              this.populateExistingRows.equals(other.getPopulateExistingRows()))) &&
            ((this.precision==null && other.getPrecision()==null) || 
             (this.precision!=null &&
              this.precision.equals(other.getPrecision()))) &&
            ((this.referenceTargetField==null && other.getReferenceTargetField()==null) || 
             (this.referenceTargetField!=null &&
              this.referenceTargetField.equals(other.getReferenceTargetField()))) &&
            ((this.referenceTo==null && other.getReferenceTo()==null) || 
             (this.referenceTo!=null &&
              this.referenceTo.equals(other.getReferenceTo()))) &&
            ((this.relationshipLabel==null && other.getRelationshipLabel()==null) || 
             (this.relationshipLabel!=null &&
              this.relationshipLabel.equals(other.getRelationshipLabel()))) &&
            ((this.relationshipName==null && other.getRelationshipName()==null) || 
             (this.relationshipName!=null &&
              this.relationshipName.equals(other.getRelationshipName()))) &&
            ((this.relationshipOrder==null && other.getRelationshipOrder()==null) || 
             (this.relationshipOrder!=null &&
              this.relationshipOrder.equals(other.getRelationshipOrder()))) &&
            ((this.reparentableMasterDetail==null && other.getReparentableMasterDetail()==null) || 
             (this.reparentableMasterDetail!=null &&
              this.reparentableMasterDetail.equals(other.getReparentableMasterDetail()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.restrictedAdminField==null && other.getRestrictedAdminField()==null) || 
             (this.restrictedAdminField!=null &&
              this.restrictedAdminField.equals(other.getRestrictedAdminField()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.startingNumber==null && other.getStartingNumber()==null) || 
             (this.startingNumber!=null &&
              this.startingNumber.equals(other.getStartingNumber()))) &&
            ((this.stripMarkup==null && other.getStripMarkup()==null) || 
             (this.stripMarkup!=null &&
              this.stripMarkup.equals(other.getStripMarkup()))) &&
            ((this.summarizedField==null && other.getSummarizedField()==null) || 
             (this.summarizedField!=null &&
              this.summarizedField.equals(other.getSummarizedField()))) &&
            ((this.summaryFilterItems==null && other.getSummaryFilterItems()==null) || 
             (this.summaryFilterItems!=null &&
              java.util.Arrays.equals(this.summaryFilterItems, other.getSummaryFilterItems()))) &&
            ((this.summaryForeignKey==null && other.getSummaryForeignKey()==null) || 
             (this.summaryForeignKey!=null &&
              this.summaryForeignKey.equals(other.getSummaryForeignKey()))) &&
            ((this.summaryOperation==null && other.getSummaryOperation()==null) || 
             (this.summaryOperation!=null &&
              this.summaryOperation.equals(other.getSummaryOperation()))) &&
            ((this.trackFeedHistory==null && other.getTrackFeedHistory()==null) || 
             (this.trackFeedHistory!=null &&
              this.trackFeedHistory.equals(other.getTrackFeedHistory()))) &&
            ((this.trackHistory==null && other.getTrackHistory()==null) || 
             (this.trackHistory!=null &&
              this.trackHistory.equals(other.getTrackHistory()))) &&
            ((this.trackTrending==null && other.getTrackTrending()==null) || 
             (this.trackTrending!=null &&
              this.trackTrending.equals(other.getTrackTrending()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unique==null && other.getUnique()==null) || 
             (this.unique!=null &&
              this.unique.equals(other.getUnique()))) &&
            ((this.valueSet==null && other.getValueSet()==null) || 
             (this.valueSet!=null &&
              this.valueSet.equals(other.getValueSet()))) &&
            ((this.visibleLines==null && other.getVisibleLines()==null) || 
             (this.visibleLines!=null &&
              this.visibleLines.equals(other.getVisibleLines()))) &&
            ((this.writeRequiresMasterRead==null && other.getWriteRequiresMasterRead()==null) || 
             (this.writeRequiresMasterRead!=null &&
              this.writeRequiresMasterRead.equals(other.getWriteRequiresMasterRead())));
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
        if (getCaseSensitive() != null) {
            _hashCode += getCaseSensitive().hashCode();
        }
        if (getCustomDataType() != null) {
            _hashCode += getCustomDataType().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getDeleteConstraint() != null) {
            _hashCode += getDeleteConstraint().hashCode();
        }
        if (getDeprecated() != null) {
            _hashCode += getDeprecated().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayFormat() != null) {
            _hashCode += getDisplayFormat().hashCode();
        }
        if (getEncrypted() != null) {
            _hashCode += getEncrypted().hashCode();
        }
        if (getEscapeMarkup() != null) {
            _hashCode += getEscapeMarkup().hashCode();
        }
        if (getExternalDeveloperName() != null) {
            _hashCode += getExternalDeveloperName().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getFieldManageability() != null) {
            _hashCode += getFieldManageability().hashCode();
        }
        if (getFormula() != null) {
            _hashCode += getFormula().hashCode();
        }
        if (getFormulaTreatBlanksAs() != null) {
            _hashCode += getFormulaTreatBlanksAs().hashCode();
        }
        if (getInlineHelpText() != null) {
            _hashCode += getInlineHelpText().hashCode();
        }
        if (getIsConvertLeadDisabled() != null) {
            _hashCode += getIsConvertLeadDisabled().hashCode();
        }
        if (getIsFilteringDisabled() != null) {
            _hashCode += getIsFilteringDisabled().hashCode();
        }
        if (getIsNameField() != null) {
            _hashCode += getIsNameField().hashCode();
        }
        if (getIsSortingDisabled() != null) {
            _hashCode += getIsSortingDisabled().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getLookupFilter() != null) {
            _hashCode += getLookupFilter().hashCode();
        }
        if (getMaskChar() != null) {
            _hashCode += getMaskChar().hashCode();
        }
        if (getMaskType() != null) {
            _hashCode += getMaskType().hashCode();
        }
        if (getMetadataRelationshipControllingField() != null) {
            _hashCode += getMetadataRelationshipControllingField().hashCode();
        }
        if (getPopulateExistingRows() != null) {
            _hashCode += getPopulateExistingRows().hashCode();
        }
        if (getPrecision() != null) {
            _hashCode += getPrecision().hashCode();
        }
        if (getReferenceTargetField() != null) {
            _hashCode += getReferenceTargetField().hashCode();
        }
        if (getReferenceTo() != null) {
            _hashCode += getReferenceTo().hashCode();
        }
        if (getRelationshipLabel() != null) {
            _hashCode += getRelationshipLabel().hashCode();
        }
        if (getRelationshipName() != null) {
            _hashCode += getRelationshipName().hashCode();
        }
        if (getRelationshipOrder() != null) {
            _hashCode += getRelationshipOrder().hashCode();
        }
        if (getReparentableMasterDetail() != null) {
            _hashCode += getReparentableMasterDetail().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getRestrictedAdminField() != null) {
            _hashCode += getRestrictedAdminField().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getStartingNumber() != null) {
            _hashCode += getStartingNumber().hashCode();
        }
        if (getStripMarkup() != null) {
            _hashCode += getStripMarkup().hashCode();
        }
        if (getSummarizedField() != null) {
            _hashCode += getSummarizedField().hashCode();
        }
        if (getSummaryFilterItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSummaryFilterItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSummaryFilterItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryForeignKey() != null) {
            _hashCode += getSummaryForeignKey().hashCode();
        }
        if (getSummaryOperation() != null) {
            _hashCode += getSummaryOperation().hashCode();
        }
        if (getTrackFeedHistory() != null) {
            _hashCode += getTrackFeedHistory().hashCode();
        }
        if (getTrackHistory() != null) {
            _hashCode += getTrackHistory().hashCode();
        }
        if (getTrackTrending() != null) {
            _hashCode += getTrackTrending().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnique() != null) {
            _hashCode += getUnique().hashCode();
        }
        if (getValueSet() != null) {
            _hashCode += getValueSet().hashCode();
        }
        if (getVisibleLines() != null) {
            _hashCode += getVisibleLines().hashCode();
        }
        if (getWriteRequiresMasterRead() != null) {
            _hashCode += getWriteRequiresMasterRead().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseSensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteConstraint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deleteConstraint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeleteConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deprecated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deprecated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("displayFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encrypted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "encrypted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escapeMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "escapeMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDeveloperName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "externalDeveloperName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldManageability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldManageability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldManageability"));
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
        elemField.setFieldName("formulaTreatBlanksAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "formulaTreatBlanksAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TreatBlanksAs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inlineHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConvertLeadDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isConvertLeadDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFilteringDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isFilteringDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNameField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isNameField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSortingDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isSortingDisabled"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookupFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lookupFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LookupFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskChar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "maskChar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EncryptedFieldMaskChar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "maskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EncryptedFieldMaskType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataRelationshipControllingField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "metadataRelationshipControllingField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("populateExistingRows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "populateExistingRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTargetField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "referenceTargetField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "referenceTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relationshipLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relationshipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relationshipOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reparentableMasterDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reparentableMasterDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedAdminField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "restrictedAdminField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "startingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stripMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "stripMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summarizedField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "summarizedField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryFilterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "summaryFilterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryForeignKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "summaryForeignKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "summaryOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryOperations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackFeedHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "trackFeedHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "trackHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackTrending");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "trackTrending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "unique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "visibleLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeRequiresMasterRead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "writeRequiresMasterRead"));
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
