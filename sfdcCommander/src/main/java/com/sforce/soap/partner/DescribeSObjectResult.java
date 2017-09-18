/**
 * DescribeSObjectResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeSObjectResult  implements java.io.Serializable {
    private com.sforce.soap.partner.ActionOverride[] actionOverrides;

    private boolean activateable;

    private com.sforce.soap.partner.ChildRelationship[] childRelationships;

    private boolean compactLayoutable;

    private boolean createable;

    private boolean custom;

    private boolean customSetting;

    private boolean deletable;

    private boolean deprecatedAndHidden;

    private boolean feedEnabled;

    private com.sforce.soap.partner.Field[] fields;

    private boolean hasSubtypes;

    private boolean idEnabled;

    private boolean isSubtype;

    private java.lang.String keyPrefix;

    private java.lang.String label;

    private java.lang.String labelPlural;

    private boolean layoutable;

    private boolean mergeable;

    private boolean mruEnabled;

    private java.lang.String name;

    private com.sforce.soap.partner.NamedLayoutInfo[] namedLayoutInfos;

    private java.lang.String networkScopeFieldName;

    private boolean queryable;

    private com.sforce.soap.partner.RecordTypeInfo[] recordTypeInfos;

    private boolean replicateable;

    private boolean retrieveable;

    private java.lang.Boolean searchLayoutable;

    private boolean searchable;

    private com.sforce.soap.partner.ScopeInfo[] supportedScopes;

    private java.lang.Boolean triggerable;

    private boolean undeletable;

    private boolean updateable;

    private java.lang.String urlDetail;

    private java.lang.String urlEdit;

    private java.lang.String urlNew;

    public DescribeSObjectResult() {
    }

    public DescribeSObjectResult(
           com.sforce.soap.partner.ActionOverride[] actionOverrides,
           boolean activateable,
           com.sforce.soap.partner.ChildRelationship[] childRelationships,
           boolean compactLayoutable,
           boolean createable,
           boolean custom,
           boolean customSetting,
           boolean deletable,
           boolean deprecatedAndHidden,
           boolean feedEnabled,
           com.sforce.soap.partner.Field[] fields,
           boolean hasSubtypes,
           boolean idEnabled,
           boolean isSubtype,
           java.lang.String keyPrefix,
           java.lang.String label,
           java.lang.String labelPlural,
           boolean layoutable,
           boolean mergeable,
           boolean mruEnabled,
           java.lang.String name,
           com.sforce.soap.partner.NamedLayoutInfo[] namedLayoutInfos,
           java.lang.String networkScopeFieldName,
           boolean queryable,
           com.sforce.soap.partner.RecordTypeInfo[] recordTypeInfos,
           boolean replicateable,
           boolean retrieveable,
           java.lang.Boolean searchLayoutable,
           boolean searchable,
           com.sforce.soap.partner.ScopeInfo[] supportedScopes,
           java.lang.Boolean triggerable,
           boolean undeletable,
           boolean updateable,
           java.lang.String urlDetail,
           java.lang.String urlEdit,
           java.lang.String urlNew) {
           this.actionOverrides = actionOverrides;
           this.activateable = activateable;
           this.childRelationships = childRelationships;
           this.compactLayoutable = compactLayoutable;
           this.createable = createable;
           this.custom = custom;
           this.customSetting = customSetting;
           this.deletable = deletable;
           this.deprecatedAndHidden = deprecatedAndHidden;
           this.feedEnabled = feedEnabled;
           this.fields = fields;
           this.hasSubtypes = hasSubtypes;
           this.idEnabled = idEnabled;
           this.isSubtype = isSubtype;
           this.keyPrefix = keyPrefix;
           this.label = label;
           this.labelPlural = labelPlural;
           this.layoutable = layoutable;
           this.mergeable = mergeable;
           this.mruEnabled = mruEnabled;
           this.name = name;
           this.namedLayoutInfos = namedLayoutInfos;
           this.networkScopeFieldName = networkScopeFieldName;
           this.queryable = queryable;
           this.recordTypeInfos = recordTypeInfos;
           this.replicateable = replicateable;
           this.retrieveable = retrieveable;
           this.searchLayoutable = searchLayoutable;
           this.searchable = searchable;
           this.supportedScopes = supportedScopes;
           this.triggerable = triggerable;
           this.undeletable = undeletable;
           this.updateable = updateable;
           this.urlDetail = urlDetail;
           this.urlEdit = urlEdit;
           this.urlNew = urlNew;
    }


    /**
     * Gets the actionOverrides value for this DescribeSObjectResult.
     * 
     * @return actionOverrides
     */
    public com.sforce.soap.partner.ActionOverride[] getActionOverrides() {
        return actionOverrides;
    }


    /**
     * Sets the actionOverrides value for this DescribeSObjectResult.
     * 
     * @param actionOverrides
     */
    public void setActionOverrides(com.sforce.soap.partner.ActionOverride[] actionOverrides) {
        this.actionOverrides = actionOverrides;
    }

    public com.sforce.soap.partner.ActionOverride getActionOverrides(int i) {
        return this.actionOverrides[i];
    }

    public void setActionOverrides(int i, com.sforce.soap.partner.ActionOverride _value) {
        this.actionOverrides[i] = _value;
    }


    /**
     * Gets the activateable value for this DescribeSObjectResult.
     * 
     * @return activateable
     */
    public boolean isActivateable() {
        return activateable;
    }


    /**
     * Sets the activateable value for this DescribeSObjectResult.
     * 
     * @param activateable
     */
    public void setActivateable(boolean activateable) {
        this.activateable = activateable;
    }


    /**
     * Gets the childRelationships value for this DescribeSObjectResult.
     * 
     * @return childRelationships
     */
    public com.sforce.soap.partner.ChildRelationship[] getChildRelationships() {
        return childRelationships;
    }


    /**
     * Sets the childRelationships value for this DescribeSObjectResult.
     * 
     * @param childRelationships
     */
    public void setChildRelationships(com.sforce.soap.partner.ChildRelationship[] childRelationships) {
        this.childRelationships = childRelationships;
    }

    public com.sforce.soap.partner.ChildRelationship getChildRelationships(int i) {
        return this.childRelationships[i];
    }

    public void setChildRelationships(int i, com.sforce.soap.partner.ChildRelationship _value) {
        this.childRelationships[i] = _value;
    }


    /**
     * Gets the compactLayoutable value for this DescribeSObjectResult.
     * 
     * @return compactLayoutable
     */
    public boolean isCompactLayoutable() {
        return compactLayoutable;
    }


    /**
     * Sets the compactLayoutable value for this DescribeSObjectResult.
     * 
     * @param compactLayoutable
     */
    public void setCompactLayoutable(boolean compactLayoutable) {
        this.compactLayoutable = compactLayoutable;
    }


    /**
     * Gets the createable value for this DescribeSObjectResult.
     * 
     * @return createable
     */
    public boolean isCreateable() {
        return createable;
    }


    /**
     * Sets the createable value for this DescribeSObjectResult.
     * 
     * @param createable
     */
    public void setCreateable(boolean createable) {
        this.createable = createable;
    }


    /**
     * Gets the custom value for this DescribeSObjectResult.
     * 
     * @return custom
     */
    public boolean isCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this DescribeSObjectResult.
     * 
     * @param custom
     */
    public void setCustom(boolean custom) {
        this.custom = custom;
    }


    /**
     * Gets the customSetting value for this DescribeSObjectResult.
     * 
     * @return customSetting
     */
    public boolean isCustomSetting() {
        return customSetting;
    }


    /**
     * Sets the customSetting value for this DescribeSObjectResult.
     * 
     * @param customSetting
     */
    public void setCustomSetting(boolean customSetting) {
        this.customSetting = customSetting;
    }


    /**
     * Gets the deletable value for this DescribeSObjectResult.
     * 
     * @return deletable
     */
    public boolean isDeletable() {
        return deletable;
    }


    /**
     * Sets the deletable value for this DescribeSObjectResult.
     * 
     * @param deletable
     */
    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }


    /**
     * Gets the deprecatedAndHidden value for this DescribeSObjectResult.
     * 
     * @return deprecatedAndHidden
     */
    public boolean isDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }


    /**
     * Sets the deprecatedAndHidden value for this DescribeSObjectResult.
     * 
     * @param deprecatedAndHidden
     */
    public void setDeprecatedAndHidden(boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }


    /**
     * Gets the feedEnabled value for this DescribeSObjectResult.
     * 
     * @return feedEnabled
     */
    public boolean isFeedEnabled() {
        return feedEnabled;
    }


    /**
     * Sets the feedEnabled value for this DescribeSObjectResult.
     * 
     * @param feedEnabled
     */
    public void setFeedEnabled(boolean feedEnabled) {
        this.feedEnabled = feedEnabled;
    }


    /**
     * Gets the fields value for this DescribeSObjectResult.
     * 
     * @return fields
     */
    public com.sforce.soap.partner.Field[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this DescribeSObjectResult.
     * 
     * @param fields
     */
    public void setFields(com.sforce.soap.partner.Field[] fields) {
        this.fields = fields;
    }

    public com.sforce.soap.partner.Field getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.sforce.soap.partner.Field _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the hasSubtypes value for this DescribeSObjectResult.
     * 
     * @return hasSubtypes
     */
    public boolean isHasSubtypes() {
        return hasSubtypes;
    }


    /**
     * Sets the hasSubtypes value for this DescribeSObjectResult.
     * 
     * @param hasSubtypes
     */
    public void setHasSubtypes(boolean hasSubtypes) {
        this.hasSubtypes = hasSubtypes;
    }


    /**
     * Gets the idEnabled value for this DescribeSObjectResult.
     * 
     * @return idEnabled
     */
    public boolean isIdEnabled() {
        return idEnabled;
    }


    /**
     * Sets the idEnabled value for this DescribeSObjectResult.
     * 
     * @param idEnabled
     */
    public void setIdEnabled(boolean idEnabled) {
        this.idEnabled = idEnabled;
    }


    /**
     * Gets the isSubtype value for this DescribeSObjectResult.
     * 
     * @return isSubtype
     */
    public boolean isIsSubtype() {
        return isSubtype;
    }


    /**
     * Sets the isSubtype value for this DescribeSObjectResult.
     * 
     * @param isSubtype
     */
    public void setIsSubtype(boolean isSubtype) {
        this.isSubtype = isSubtype;
    }


    /**
     * Gets the keyPrefix value for this DescribeSObjectResult.
     * 
     * @return keyPrefix
     */
    public java.lang.String getKeyPrefix() {
        return keyPrefix;
    }


    /**
     * Sets the keyPrefix value for this DescribeSObjectResult.
     * 
     * @param keyPrefix
     */
    public void setKeyPrefix(java.lang.String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }


    /**
     * Gets the label value for this DescribeSObjectResult.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeSObjectResult.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the labelPlural value for this DescribeSObjectResult.
     * 
     * @return labelPlural
     */
    public java.lang.String getLabelPlural() {
        return labelPlural;
    }


    /**
     * Sets the labelPlural value for this DescribeSObjectResult.
     * 
     * @param labelPlural
     */
    public void setLabelPlural(java.lang.String labelPlural) {
        this.labelPlural = labelPlural;
    }


    /**
     * Gets the layoutable value for this DescribeSObjectResult.
     * 
     * @return layoutable
     */
    public boolean isLayoutable() {
        return layoutable;
    }


    /**
     * Sets the layoutable value for this DescribeSObjectResult.
     * 
     * @param layoutable
     */
    public void setLayoutable(boolean layoutable) {
        this.layoutable = layoutable;
    }


    /**
     * Gets the mergeable value for this DescribeSObjectResult.
     * 
     * @return mergeable
     */
    public boolean isMergeable() {
        return mergeable;
    }


    /**
     * Sets the mergeable value for this DescribeSObjectResult.
     * 
     * @param mergeable
     */
    public void setMergeable(boolean mergeable) {
        this.mergeable = mergeable;
    }


    /**
     * Gets the mruEnabled value for this DescribeSObjectResult.
     * 
     * @return mruEnabled
     */
    public boolean isMruEnabled() {
        return mruEnabled;
    }


    /**
     * Sets the mruEnabled value for this DescribeSObjectResult.
     * 
     * @param mruEnabled
     */
    public void setMruEnabled(boolean mruEnabled) {
        this.mruEnabled = mruEnabled;
    }


    /**
     * Gets the name value for this DescribeSObjectResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeSObjectResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namedLayoutInfos value for this DescribeSObjectResult.
     * 
     * @return namedLayoutInfos
     */
    public com.sforce.soap.partner.NamedLayoutInfo[] getNamedLayoutInfos() {
        return namedLayoutInfos;
    }


    /**
     * Sets the namedLayoutInfos value for this DescribeSObjectResult.
     * 
     * @param namedLayoutInfos
     */
    public void setNamedLayoutInfos(com.sforce.soap.partner.NamedLayoutInfo[] namedLayoutInfos) {
        this.namedLayoutInfos = namedLayoutInfos;
    }

    public com.sforce.soap.partner.NamedLayoutInfo getNamedLayoutInfos(int i) {
        return this.namedLayoutInfos[i];
    }

    public void setNamedLayoutInfos(int i, com.sforce.soap.partner.NamedLayoutInfo _value) {
        this.namedLayoutInfos[i] = _value;
    }


    /**
     * Gets the networkScopeFieldName value for this DescribeSObjectResult.
     * 
     * @return networkScopeFieldName
     */
    public java.lang.String getNetworkScopeFieldName() {
        return networkScopeFieldName;
    }


    /**
     * Sets the networkScopeFieldName value for this DescribeSObjectResult.
     * 
     * @param networkScopeFieldName
     */
    public void setNetworkScopeFieldName(java.lang.String networkScopeFieldName) {
        this.networkScopeFieldName = networkScopeFieldName;
    }


    /**
     * Gets the queryable value for this DescribeSObjectResult.
     * 
     * @return queryable
     */
    public boolean isQueryable() {
        return queryable;
    }


    /**
     * Sets the queryable value for this DescribeSObjectResult.
     * 
     * @param queryable
     */
    public void setQueryable(boolean queryable) {
        this.queryable = queryable;
    }


    /**
     * Gets the recordTypeInfos value for this DescribeSObjectResult.
     * 
     * @return recordTypeInfos
     */
    public com.sforce.soap.partner.RecordTypeInfo[] getRecordTypeInfos() {
        return recordTypeInfos;
    }


    /**
     * Sets the recordTypeInfos value for this DescribeSObjectResult.
     * 
     * @param recordTypeInfos
     */
    public void setRecordTypeInfos(com.sforce.soap.partner.RecordTypeInfo[] recordTypeInfos) {
        this.recordTypeInfos = recordTypeInfos;
    }

    public com.sforce.soap.partner.RecordTypeInfo getRecordTypeInfos(int i) {
        return this.recordTypeInfos[i];
    }

    public void setRecordTypeInfos(int i, com.sforce.soap.partner.RecordTypeInfo _value) {
        this.recordTypeInfos[i] = _value;
    }


    /**
     * Gets the replicateable value for this DescribeSObjectResult.
     * 
     * @return replicateable
     */
    public boolean isReplicateable() {
        return replicateable;
    }


    /**
     * Sets the replicateable value for this DescribeSObjectResult.
     * 
     * @param replicateable
     */
    public void setReplicateable(boolean replicateable) {
        this.replicateable = replicateable;
    }


    /**
     * Gets the retrieveable value for this DescribeSObjectResult.
     * 
     * @return retrieveable
     */
    public boolean isRetrieveable() {
        return retrieveable;
    }


    /**
     * Sets the retrieveable value for this DescribeSObjectResult.
     * 
     * @param retrieveable
     */
    public void setRetrieveable(boolean retrieveable) {
        this.retrieveable = retrieveable;
    }


    /**
     * Gets the searchLayoutable value for this DescribeSObjectResult.
     * 
     * @return searchLayoutable
     */
    public java.lang.Boolean getSearchLayoutable() {
        return searchLayoutable;
    }


    /**
     * Sets the searchLayoutable value for this DescribeSObjectResult.
     * 
     * @param searchLayoutable
     */
    public void setSearchLayoutable(java.lang.Boolean searchLayoutable) {
        this.searchLayoutable = searchLayoutable;
    }


    /**
     * Gets the searchable value for this DescribeSObjectResult.
     * 
     * @return searchable
     */
    public boolean isSearchable() {
        return searchable;
    }


    /**
     * Sets the searchable value for this DescribeSObjectResult.
     * 
     * @param searchable
     */
    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }


    /**
     * Gets the supportedScopes value for this DescribeSObjectResult.
     * 
     * @return supportedScopes
     */
    public com.sforce.soap.partner.ScopeInfo[] getSupportedScopes() {
        return supportedScopes;
    }


    /**
     * Sets the supportedScopes value for this DescribeSObjectResult.
     * 
     * @param supportedScopes
     */
    public void setSupportedScopes(com.sforce.soap.partner.ScopeInfo[] supportedScopes) {
        this.supportedScopes = supportedScopes;
    }

    public com.sforce.soap.partner.ScopeInfo getSupportedScopes(int i) {
        return this.supportedScopes[i];
    }

    public void setSupportedScopes(int i, com.sforce.soap.partner.ScopeInfo _value) {
        this.supportedScopes[i] = _value;
    }


    /**
     * Gets the triggerable value for this DescribeSObjectResult.
     * 
     * @return triggerable
     */
    public java.lang.Boolean getTriggerable() {
        return triggerable;
    }


    /**
     * Sets the triggerable value for this DescribeSObjectResult.
     * 
     * @param triggerable
     */
    public void setTriggerable(java.lang.Boolean triggerable) {
        this.triggerable = triggerable;
    }


    /**
     * Gets the undeletable value for this DescribeSObjectResult.
     * 
     * @return undeletable
     */
    public boolean isUndeletable() {
        return undeletable;
    }


    /**
     * Sets the undeletable value for this DescribeSObjectResult.
     * 
     * @param undeletable
     */
    public void setUndeletable(boolean undeletable) {
        this.undeletable = undeletable;
    }


    /**
     * Gets the updateable value for this DescribeSObjectResult.
     * 
     * @return updateable
     */
    public boolean isUpdateable() {
        return updateable;
    }


    /**
     * Sets the updateable value for this DescribeSObjectResult.
     * 
     * @param updateable
     */
    public void setUpdateable(boolean updateable) {
        this.updateable = updateable;
    }


    /**
     * Gets the urlDetail value for this DescribeSObjectResult.
     * 
     * @return urlDetail
     */
    public java.lang.String getUrlDetail() {
        return urlDetail;
    }


    /**
     * Sets the urlDetail value for this DescribeSObjectResult.
     * 
     * @param urlDetail
     */
    public void setUrlDetail(java.lang.String urlDetail) {
        this.urlDetail = urlDetail;
    }


    /**
     * Gets the urlEdit value for this DescribeSObjectResult.
     * 
     * @return urlEdit
     */
    public java.lang.String getUrlEdit() {
        return urlEdit;
    }


    /**
     * Sets the urlEdit value for this DescribeSObjectResult.
     * 
     * @param urlEdit
     */
    public void setUrlEdit(java.lang.String urlEdit) {
        this.urlEdit = urlEdit;
    }


    /**
     * Gets the urlNew value for this DescribeSObjectResult.
     * 
     * @return urlNew
     */
    public java.lang.String getUrlNew() {
        return urlNew;
    }


    /**
     * Sets the urlNew value for this DescribeSObjectResult.
     * 
     * @param urlNew
     */
    public void setUrlNew(java.lang.String urlNew) {
        this.urlNew = urlNew;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeSObjectResult)) return false;
        DescribeSObjectResult other = (DescribeSObjectResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionOverrides==null && other.getActionOverrides()==null) || 
             (this.actionOverrides!=null &&
              java.util.Arrays.equals(this.actionOverrides, other.getActionOverrides()))) &&
            this.activateable == other.isActivateable() &&
            ((this.childRelationships==null && other.getChildRelationships()==null) || 
             (this.childRelationships!=null &&
              java.util.Arrays.equals(this.childRelationships, other.getChildRelationships()))) &&
            this.compactLayoutable == other.isCompactLayoutable() &&
            this.createable == other.isCreateable() &&
            this.custom == other.isCustom() &&
            this.customSetting == other.isCustomSetting() &&
            this.deletable == other.isDeletable() &&
            this.deprecatedAndHidden == other.isDeprecatedAndHidden() &&
            this.feedEnabled == other.isFeedEnabled() &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            this.hasSubtypes == other.isHasSubtypes() &&
            this.idEnabled == other.isIdEnabled() &&
            this.isSubtype == other.isIsSubtype() &&
            ((this.keyPrefix==null && other.getKeyPrefix()==null) || 
             (this.keyPrefix!=null &&
              this.keyPrefix.equals(other.getKeyPrefix()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.labelPlural==null && other.getLabelPlural()==null) || 
             (this.labelPlural!=null &&
              this.labelPlural.equals(other.getLabelPlural()))) &&
            this.layoutable == other.isLayoutable() &&
            this.mergeable == other.isMergeable() &&
            this.mruEnabled == other.isMruEnabled() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namedLayoutInfos==null && other.getNamedLayoutInfos()==null) || 
             (this.namedLayoutInfos!=null &&
              java.util.Arrays.equals(this.namedLayoutInfos, other.getNamedLayoutInfos()))) &&
            ((this.networkScopeFieldName==null && other.getNetworkScopeFieldName()==null) || 
             (this.networkScopeFieldName!=null &&
              this.networkScopeFieldName.equals(other.getNetworkScopeFieldName()))) &&
            this.queryable == other.isQueryable() &&
            ((this.recordTypeInfos==null && other.getRecordTypeInfos()==null) || 
             (this.recordTypeInfos!=null &&
              java.util.Arrays.equals(this.recordTypeInfos, other.getRecordTypeInfos()))) &&
            this.replicateable == other.isReplicateable() &&
            this.retrieveable == other.isRetrieveable() &&
            ((this.searchLayoutable==null && other.getSearchLayoutable()==null) || 
             (this.searchLayoutable!=null &&
              this.searchLayoutable.equals(other.getSearchLayoutable()))) &&
            this.searchable == other.isSearchable() &&
            ((this.supportedScopes==null && other.getSupportedScopes()==null) || 
             (this.supportedScopes!=null &&
              java.util.Arrays.equals(this.supportedScopes, other.getSupportedScopes()))) &&
            ((this.triggerable==null && other.getTriggerable()==null) || 
             (this.triggerable!=null &&
              this.triggerable.equals(other.getTriggerable()))) &&
            this.undeletable == other.isUndeletable() &&
            this.updateable == other.isUpdateable() &&
            ((this.urlDetail==null && other.getUrlDetail()==null) || 
             (this.urlDetail!=null &&
              this.urlDetail.equals(other.getUrlDetail()))) &&
            ((this.urlEdit==null && other.getUrlEdit()==null) || 
             (this.urlEdit!=null &&
              this.urlEdit.equals(other.getUrlEdit()))) &&
            ((this.urlNew==null && other.getUrlNew()==null) || 
             (this.urlNew!=null &&
              this.urlNew.equals(other.getUrlNew())));
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
        if (getActionOverrides() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionOverrides());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionOverrides(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isActivateable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChildRelationships() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildRelationships());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildRelationships(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isCompactLayoutable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCreateable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCustom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCustomSetting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeletable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeprecatedAndHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFeedEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += (isHasSubtypes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIdEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsSubtype() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKeyPrefix() != null) {
            _hashCode += getKeyPrefix().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabelPlural() != null) {
            _hashCode += getLabelPlural().hashCode();
        }
        _hashCode += (isLayoutable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMergeable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMruEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamedLayoutInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamedLayoutInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamedLayoutInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkScopeFieldName() != null) {
            _hashCode += getNetworkScopeFieldName().hashCode();
        }
        _hashCode += (isQueryable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecordTypeInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypeInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordTypeInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplicateable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRetrieveable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSearchLayoutable() != null) {
            _hashCode += getSearchLayoutable().hashCode();
        }
        _hashCode += (isSearchable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSupportedScopes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedScopes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedScopes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTriggerable() != null) {
            _hashCode += getTriggerable().hashCode();
        }
        _hashCode += (isUndeletable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUpdateable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUrlDetail() != null) {
            _hashCode += getUrlDetail().hashCode();
        }
        if (getUrlEdit() != null) {
            _hashCode += getUrlEdit().hashCode();
        }
        if (getUrlNew() != null) {
            _hashCode += getUrlNew().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeSObjectResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSObjectResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "actionOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ActionOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "activateable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "childRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ChildRelationship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compactLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "compactLayoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "createable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "customSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "deletable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deprecatedAndHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "deprecatedAndHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "feedEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Field"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSubtypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "hasSubtypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "idEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "isSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "keyPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPlural");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "labelPlural"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "layoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "mergeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mruEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "mruEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedLayoutInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "namedLayoutInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NamedLayoutInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkScopeFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "networkScopeFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RecordTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicateable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "replicateable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieveable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "searchLayoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "searchable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedScopes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "supportedScopes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ScopeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "triggerable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeletable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undeletable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "updateable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "urlDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "urlEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlNew");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "urlNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
