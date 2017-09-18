/**
 * CommunityThemeDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CommunityThemeDefinition  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CommunityCustomThemeLayoutType[] customThemeLayoutType;

    private java.lang.String description;

    private java.lang.Boolean enableExtendedCleanUpOnDelete;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.CommunityThemeSetting[] themeSetting;

    public CommunityThemeDefinition() {
    }

    public CommunityThemeDefinition(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.CommunityCustomThemeLayoutType[] customThemeLayoutType,
           java.lang.String description,
           java.lang.Boolean enableExtendedCleanUpOnDelete,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.CommunityThemeSetting[] themeSetting) {
        super(
            fullName);
        this.customThemeLayoutType = customThemeLayoutType;
        this.description = description;
        this.enableExtendedCleanUpOnDelete = enableExtendedCleanUpOnDelete;
        this.masterLabel = masterLabel;
        this.themeSetting = themeSetting;
    }


    /**
     * Gets the customThemeLayoutType value for this CommunityThemeDefinition.
     * 
     * @return customThemeLayoutType
     */
    public com.sforce.soap._2006._04.metadata.CommunityCustomThemeLayoutType[] getCustomThemeLayoutType() {
        return customThemeLayoutType;
    }


    /**
     * Sets the customThemeLayoutType value for this CommunityThemeDefinition.
     * 
     * @param customThemeLayoutType
     */
    public void setCustomThemeLayoutType(com.sforce.soap._2006._04.metadata.CommunityCustomThemeLayoutType[] customThemeLayoutType) {
        this.customThemeLayoutType = customThemeLayoutType;
    }

    public com.sforce.soap._2006._04.metadata.CommunityCustomThemeLayoutType getCustomThemeLayoutType(int i) {
        return this.customThemeLayoutType[i];
    }

    public void setCustomThemeLayoutType(int i, com.sforce.soap._2006._04.metadata.CommunityCustomThemeLayoutType _value) {
        this.customThemeLayoutType[i] = _value;
    }


    /**
     * Gets the description value for this CommunityThemeDefinition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CommunityThemeDefinition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the enableExtendedCleanUpOnDelete value for this CommunityThemeDefinition.
     * 
     * @return enableExtendedCleanUpOnDelete
     */
    public java.lang.Boolean getEnableExtendedCleanUpOnDelete() {
        return enableExtendedCleanUpOnDelete;
    }


    /**
     * Sets the enableExtendedCleanUpOnDelete value for this CommunityThemeDefinition.
     * 
     * @param enableExtendedCleanUpOnDelete
     */
    public void setEnableExtendedCleanUpOnDelete(java.lang.Boolean enableExtendedCleanUpOnDelete) {
        this.enableExtendedCleanUpOnDelete = enableExtendedCleanUpOnDelete;
    }


    /**
     * Gets the masterLabel value for this CommunityThemeDefinition.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this CommunityThemeDefinition.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the themeSetting value for this CommunityThemeDefinition.
     * 
     * @return themeSetting
     */
    public com.sforce.soap._2006._04.metadata.CommunityThemeSetting[] getThemeSetting() {
        return themeSetting;
    }


    /**
     * Sets the themeSetting value for this CommunityThemeDefinition.
     * 
     * @param themeSetting
     */
    public void setThemeSetting(com.sforce.soap._2006._04.metadata.CommunityThemeSetting[] themeSetting) {
        this.themeSetting = themeSetting;
    }

    public com.sforce.soap._2006._04.metadata.CommunityThemeSetting getThemeSetting(int i) {
        return this.themeSetting[i];
    }

    public void setThemeSetting(int i, com.sforce.soap._2006._04.metadata.CommunityThemeSetting _value) {
        this.themeSetting[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunityThemeDefinition)) return false;
        CommunityThemeDefinition other = (CommunityThemeDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customThemeLayoutType==null && other.getCustomThemeLayoutType()==null) || 
             (this.customThemeLayoutType!=null &&
              java.util.Arrays.equals(this.customThemeLayoutType, other.getCustomThemeLayoutType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.enableExtendedCleanUpOnDelete==null && other.getEnableExtendedCleanUpOnDelete()==null) || 
             (this.enableExtendedCleanUpOnDelete!=null &&
              this.enableExtendedCleanUpOnDelete.equals(other.getEnableExtendedCleanUpOnDelete()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.themeSetting==null && other.getThemeSetting()==null) || 
             (this.themeSetting!=null &&
              java.util.Arrays.equals(this.themeSetting, other.getThemeSetting())));
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
        if (getCustomThemeLayoutType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomThemeLayoutType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomThemeLayoutType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getThemeSetting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThemeSetting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThemeSetting(), i);
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
        new org.apache.axis.description.TypeDesc(CommunityThemeDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityThemeDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customThemeLayoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customThemeLayoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityCustomThemeLayoutType"));
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
        elemField.setFieldName("themeSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "themeSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CommunityThemeSetting"));
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
