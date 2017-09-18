/**
 * SearchSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SearchSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean documentContentSearchEnabled;

    private boolean optimizeSearchForCJKEnabled;

    private boolean recentlyViewedUsersForBlankLookupEnabled;

    private com.sforce.soap._2006._04.metadata.ObjectSearchSetting[] searchSettingsByObject;

    private boolean sidebarAutoCompleteEnabled;

    private boolean sidebarDropDownListEnabled;

    private boolean sidebarLimitToItemsIOwnCheckboxEnabled;

    private boolean singleSearchResultShortcutEnabled;

    private boolean spellCorrectKnowledgeSearchEnabled;

    public SearchSettings() {
    }

    public SearchSettings(
           java.lang.String fullName,
           boolean documentContentSearchEnabled,
           boolean optimizeSearchForCJKEnabled,
           boolean recentlyViewedUsersForBlankLookupEnabled,
           com.sforce.soap._2006._04.metadata.ObjectSearchSetting[] searchSettingsByObject,
           boolean sidebarAutoCompleteEnabled,
           boolean sidebarDropDownListEnabled,
           boolean sidebarLimitToItemsIOwnCheckboxEnabled,
           boolean singleSearchResultShortcutEnabled,
           boolean spellCorrectKnowledgeSearchEnabled) {
        super(
            fullName);
        this.documentContentSearchEnabled = documentContentSearchEnabled;
        this.optimizeSearchForCJKEnabled = optimizeSearchForCJKEnabled;
        this.recentlyViewedUsersForBlankLookupEnabled = recentlyViewedUsersForBlankLookupEnabled;
        this.searchSettingsByObject = searchSettingsByObject;
        this.sidebarAutoCompleteEnabled = sidebarAutoCompleteEnabled;
        this.sidebarDropDownListEnabled = sidebarDropDownListEnabled;
        this.sidebarLimitToItemsIOwnCheckboxEnabled = sidebarLimitToItemsIOwnCheckboxEnabled;
        this.singleSearchResultShortcutEnabled = singleSearchResultShortcutEnabled;
        this.spellCorrectKnowledgeSearchEnabled = spellCorrectKnowledgeSearchEnabled;
    }


    /**
     * Gets the documentContentSearchEnabled value for this SearchSettings.
     * 
     * @return documentContentSearchEnabled
     */
    public boolean isDocumentContentSearchEnabled() {
        return documentContentSearchEnabled;
    }


    /**
     * Sets the documentContentSearchEnabled value for this SearchSettings.
     * 
     * @param documentContentSearchEnabled
     */
    public void setDocumentContentSearchEnabled(boolean documentContentSearchEnabled) {
        this.documentContentSearchEnabled = documentContentSearchEnabled;
    }


    /**
     * Gets the optimizeSearchForCJKEnabled value for this SearchSettings.
     * 
     * @return optimizeSearchForCJKEnabled
     */
    public boolean isOptimizeSearchForCJKEnabled() {
        return optimizeSearchForCJKEnabled;
    }


    /**
     * Sets the optimizeSearchForCJKEnabled value for this SearchSettings.
     * 
     * @param optimizeSearchForCJKEnabled
     */
    public void setOptimizeSearchForCJKEnabled(boolean optimizeSearchForCJKEnabled) {
        this.optimizeSearchForCJKEnabled = optimizeSearchForCJKEnabled;
    }


    /**
     * Gets the recentlyViewedUsersForBlankLookupEnabled value for this SearchSettings.
     * 
     * @return recentlyViewedUsersForBlankLookupEnabled
     */
    public boolean isRecentlyViewedUsersForBlankLookupEnabled() {
        return recentlyViewedUsersForBlankLookupEnabled;
    }


    /**
     * Sets the recentlyViewedUsersForBlankLookupEnabled value for this SearchSettings.
     * 
     * @param recentlyViewedUsersForBlankLookupEnabled
     */
    public void setRecentlyViewedUsersForBlankLookupEnabled(boolean recentlyViewedUsersForBlankLookupEnabled) {
        this.recentlyViewedUsersForBlankLookupEnabled = recentlyViewedUsersForBlankLookupEnabled;
    }


    /**
     * Gets the searchSettingsByObject value for this SearchSettings.
     * 
     * @return searchSettingsByObject
     */
    public com.sforce.soap._2006._04.metadata.ObjectSearchSetting[] getSearchSettingsByObject() {
        return searchSettingsByObject;
    }


    /**
     * Sets the searchSettingsByObject value for this SearchSettings.
     * 
     * @param searchSettingsByObject
     */
    public void setSearchSettingsByObject(com.sforce.soap._2006._04.metadata.ObjectSearchSetting[] searchSettingsByObject) {
        this.searchSettingsByObject = searchSettingsByObject;
    }


    /**
     * Gets the sidebarAutoCompleteEnabled value for this SearchSettings.
     * 
     * @return sidebarAutoCompleteEnabled
     */
    public boolean isSidebarAutoCompleteEnabled() {
        return sidebarAutoCompleteEnabled;
    }


    /**
     * Sets the sidebarAutoCompleteEnabled value for this SearchSettings.
     * 
     * @param sidebarAutoCompleteEnabled
     */
    public void setSidebarAutoCompleteEnabled(boolean sidebarAutoCompleteEnabled) {
        this.sidebarAutoCompleteEnabled = sidebarAutoCompleteEnabled;
    }


    /**
     * Gets the sidebarDropDownListEnabled value for this SearchSettings.
     * 
     * @return sidebarDropDownListEnabled
     */
    public boolean isSidebarDropDownListEnabled() {
        return sidebarDropDownListEnabled;
    }


    /**
     * Sets the sidebarDropDownListEnabled value for this SearchSettings.
     * 
     * @param sidebarDropDownListEnabled
     */
    public void setSidebarDropDownListEnabled(boolean sidebarDropDownListEnabled) {
        this.sidebarDropDownListEnabled = sidebarDropDownListEnabled;
    }


    /**
     * Gets the sidebarLimitToItemsIOwnCheckboxEnabled value for this SearchSettings.
     * 
     * @return sidebarLimitToItemsIOwnCheckboxEnabled
     */
    public boolean isSidebarLimitToItemsIOwnCheckboxEnabled() {
        return sidebarLimitToItemsIOwnCheckboxEnabled;
    }


    /**
     * Sets the sidebarLimitToItemsIOwnCheckboxEnabled value for this SearchSettings.
     * 
     * @param sidebarLimitToItemsIOwnCheckboxEnabled
     */
    public void setSidebarLimitToItemsIOwnCheckboxEnabled(boolean sidebarLimitToItemsIOwnCheckboxEnabled) {
        this.sidebarLimitToItemsIOwnCheckboxEnabled = sidebarLimitToItemsIOwnCheckboxEnabled;
    }


    /**
     * Gets the singleSearchResultShortcutEnabled value for this SearchSettings.
     * 
     * @return singleSearchResultShortcutEnabled
     */
    public boolean isSingleSearchResultShortcutEnabled() {
        return singleSearchResultShortcutEnabled;
    }


    /**
     * Sets the singleSearchResultShortcutEnabled value for this SearchSettings.
     * 
     * @param singleSearchResultShortcutEnabled
     */
    public void setSingleSearchResultShortcutEnabled(boolean singleSearchResultShortcutEnabled) {
        this.singleSearchResultShortcutEnabled = singleSearchResultShortcutEnabled;
    }


    /**
     * Gets the spellCorrectKnowledgeSearchEnabled value for this SearchSettings.
     * 
     * @return spellCorrectKnowledgeSearchEnabled
     */
    public boolean isSpellCorrectKnowledgeSearchEnabled() {
        return spellCorrectKnowledgeSearchEnabled;
    }


    /**
     * Sets the spellCorrectKnowledgeSearchEnabled value for this SearchSettings.
     * 
     * @param spellCorrectKnowledgeSearchEnabled
     */
    public void setSpellCorrectKnowledgeSearchEnabled(boolean spellCorrectKnowledgeSearchEnabled) {
        this.spellCorrectKnowledgeSearchEnabled = spellCorrectKnowledgeSearchEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchSettings)) return false;
        SearchSettings other = (SearchSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.documentContentSearchEnabled == other.isDocumentContentSearchEnabled() &&
            this.optimizeSearchForCJKEnabled == other.isOptimizeSearchForCJKEnabled() &&
            this.recentlyViewedUsersForBlankLookupEnabled == other.isRecentlyViewedUsersForBlankLookupEnabled() &&
            ((this.searchSettingsByObject==null && other.getSearchSettingsByObject()==null) || 
             (this.searchSettingsByObject!=null &&
              java.util.Arrays.equals(this.searchSettingsByObject, other.getSearchSettingsByObject()))) &&
            this.sidebarAutoCompleteEnabled == other.isSidebarAutoCompleteEnabled() &&
            this.sidebarDropDownListEnabled == other.isSidebarDropDownListEnabled() &&
            this.sidebarLimitToItemsIOwnCheckboxEnabled == other.isSidebarLimitToItemsIOwnCheckboxEnabled() &&
            this.singleSearchResultShortcutEnabled == other.isSingleSearchResultShortcutEnabled() &&
            this.spellCorrectKnowledgeSearchEnabled == other.isSpellCorrectKnowledgeSearchEnabled();
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
        _hashCode += (isDocumentContentSearchEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOptimizeSearchForCJKEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRecentlyViewedUsersForBlankLookupEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSearchSettingsByObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchSettingsByObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchSettingsByObject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSidebarAutoCompleteEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSidebarDropDownListEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSidebarLimitToItemsIOwnCheckboxEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSingleSearchResultShortcutEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSpellCorrectKnowledgeSearchEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SearchSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentContentSearchEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "documentContentSearchEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizeSearchForCJKEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optimizeSearchForCJKEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recentlyViewedUsersForBlankLookupEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recentlyViewedUsersForBlankLookupEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSettingsByObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "searchSettingsByObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectSearchSetting"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "searchSettingsByObject"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidebarAutoCompleteEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sidebarAutoCompleteEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidebarDropDownListEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sidebarDropDownListEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidebarLimitToItemsIOwnCheckboxEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sidebarLimitToItemsIOwnCheckboxEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleSearchResultShortcutEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "singleSearchResultShortcutEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spellCorrectKnowledgeSearchEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "spellCorrectKnowledgeSearchEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
