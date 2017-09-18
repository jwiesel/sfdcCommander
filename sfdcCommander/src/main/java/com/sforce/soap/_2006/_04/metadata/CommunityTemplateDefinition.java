/**
 * CommunityTemplateDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CommunityTemplateDefinition  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CommunityTemplateBundleInfo[] bundlesInfo;

    private com.sforce.soap._2006._04.metadata.CommunityTemplateCategory category;

    private java.lang.String defaultThemeDefinition;

    private java.lang.String description;

    private java.lang.Boolean enableExtendedCleanUpOnDelete;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.CommunityTemplatePageSetting[] pageSetting;

    public CommunityTemplateDefinition() {
    }

    public CommunityTemplateDefinition(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.CommunityTemplateBundleInfo[] bundlesInfo,
           com.sforce.soap._2006._04.metadata.CommunityTemplateCategory category,
           java.lang.String defaultThemeDefinition,
           java.lang.String description,
           java.lang.Boolean enableExtendedCleanUpOnDelete,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.CommunityTemplatePageSetting[] pageSetting) {
        super(
            fullName);
        this.bundlesInfo = bundlesInfo;
        this.category = category;
        this.defaultThemeDefinition = defaultThemeDefinition;
        this.description = description;
        this.enableExtendedCleanUpOnDelete = enableExtendedCleanUpOnDelete;
        this.masterLabel = masterLabel;
        this.pageSetting = pageSetting;
    }


    /**
     * Gets the bundlesInfo value for this CommunityTemplateDefinition.
     * 
     * @return bundlesInfo
     */
    public com.sforce.soap._2006._04.metadata.CommunityTemplateBundleInfo[] getBundlesInfo() {
        return bundlesInfo;
    }


    /**
     * Sets the bundlesInfo value for this CommunityTemplateDefinition.
     * 
     * @param bundlesInfo
     */
    public void setBundlesInfo(com.sforce.soap._2006._04.metadata.CommunityTemplateBundleInfo[] bundlesInfo) {
        this.bundlesInfo = bundlesInfo;
    }

    public com.sforce.soap._2006._04.metadata.CommunityTemplateBundleInfo getBundlesInfo(int i) {
        return this.bundlesInfo[i];
    }

    public void setBundlesInfo(int i, com.sforce.soap._2006._04.metadata.CommunityTemplateBundleInfo _value) {
        this.bundlesInfo[i] = _value;
    }


    /**
     * Gets the category value for this CommunityTemplateDefinition.
     * 
     * @return category
     */
    public com.sforce.soap._2006._04.metadata.CommunityTemplateCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CommunityTemplateDefinition.
     * 
     * @param category
     */
    public void setCategory(com.sforce.soap._2006._04.metadata.CommunityTemplateCategory category) {
        this.category = category;
    }


    /**
     * Gets the defaultThemeDefinition value for this CommunityTemplateDefinition.
     * 
     * @return defaultThemeDefinition
     */
    public java.lang.String getDefaultThemeDefinition() {
        return defaultThemeDefinition;
    }


    /**
     * Sets the defaultThemeDefinition value for this CommunityTemplateDefinition.
     * 
     * @param defaultThemeDefinition
     */
    public void setDefaultThemeDefinition(java.lang.String defaultThemeDefinition) {
        this.defaultThemeDefinition = defaultThemeDefinition;
    }


    /**
     * Gets the description value for this CommunityTemplateDefinition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CommunityTemplateDefinition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the enableExtendedCleanUpOnDelete value for this CommunityTemplateDefinition.
     * 
     * @return enableExtendedCleanUpOnDelete
     */
    public java.lang.Boolean getEnableExtendedCleanUpOnDelete() {
        return enableExtendedCleanUpOnDelete;
    }


    /**
     * Sets the enableExtendedCleanUpOnDelete value for this CommunityTemplateDefinition.
     * 
     * @param enableExtendedCleanUpOnDelete
     */
    public void setEnableExtendedCleanUpOnDelete(java.lang.Boolean enableExtendedCleanUpOnDelete) {
        this.enableExtendedCleanUpOnDelete = enableExtendedCleanUpOnDelete;
    }


    /**
     * Gets the masterLabel value for this CommunityTemplateDefinition.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this CommunityTemplateDefinition.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the pageSetting value for this CommunityTemplateDefinition.
     * 
     * @return pageSetting
     */
    public com.sforce.soap._2006._04.metadata.CommunityTemplatePageSetting[] getPageSetting() {
        return pageSetting;
    }


    /**
     * Sets the pageSetting value for this CommunityTemplateDefinition.
     * 
     * @param pageSetting
     */
    public void setPageSetting(com.sforce.soap._2006._04.metadata.CommunityTemplatePageSetting[] pageSetting) {
        this.pageSetting = pageSetting;
    }

    public com.sforce.soap._2006._04.metadata.CommunityTemplatePageSetting getPageSetting(int i) {
        return this.pageSetting[i];
    }

    public void setPageSetting(int i, com.sforce.soap._2006._04.metadata.CommunityTemplatePageSetting _value) {
        this.pageSetting[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunityTemplateDefinition)) return false;
        CommunityTemplateDefinition other = (CommunityTemplateDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bundlesInfo==null && other.getBundlesInfo()==null) || 
             (this.bundlesInfo!=null &&
              java.util.Arrays.equals(this.bundlesInfo, other.getBundlesInfo()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.defaultThemeDefinition==null && other.getDefaultThemeDefinition()==null) || 
             (this.defaultThemeDefinition!=null &&
              this.defaultThemeDefinition.equals(other.getDefaultThemeDefinition()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.enableExtendedCleanUpOnDelete==null && other.getEnableExtendedCleanUpOnDelete()==null) || 
             (this.enableExtendedCleanUpOnDelete!=null &&
              this.enableExtendedCleanUpOnDelete.equals(other.getEnableExtendedCleanUpOnDelete()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.pageSetting==null && other.getPageSetting()==null) || 
             (this.pageSetting!=null &&
              java.util.Arrays.equals(this.pageSetting, other.getPageSetting())));
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
        if (getBundlesInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundlesInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundlesInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getDefaultThemeDefinition() != null) {
            _hashCode += getDefaultThemeDefinition().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEnableExtendedCleanUpOnDelete() != null) {
            _hashCode += getEnableExtendedCleanUpOnDelete().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getPageSetting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageSetting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageSetting(), i);
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
        new org.apache.axis.description.TypeDesc(CommunityTemplateDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityTemplateDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundlesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bundlesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityTemplateBundleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityTemplateCategory"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultThemeDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultThemeDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("enableExtendedCleanUpOnDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableExtendedCleanUpOnDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityTemplatePageSetting"));
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
