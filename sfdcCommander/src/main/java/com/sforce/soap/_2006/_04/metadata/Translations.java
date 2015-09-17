/**
 * Translations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Translations  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CustomApplicationTranslation[] customApplications;

    private com.sforce.soap._2006._04.metadata.CustomDataTypeTranslation[] customDataTypeTranslations;

    private com.sforce.soap._2006._04.metadata.CustomLabelTranslation[] customLabels;

    private com.sforce.soap._2006._04.metadata.CustomPageWebLinkTranslation[] customPageWebLinks;

    private com.sforce.soap._2006._04.metadata.CustomTabTranslation[] customTabs;

    private com.sforce.soap._2006._04.metadata.GlobalQuickActionTranslation[] quickActions;

    private com.sforce.soap._2006._04.metadata.ReportTypeTranslation[] reportTypes;

    private com.sforce.soap._2006._04.metadata.ScontrolTranslation[] scontrols;

    public Translations() {
    }

    public Translations(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.CustomApplicationTranslation[] customApplications,
           com.sforce.soap._2006._04.metadata.CustomDataTypeTranslation[] customDataTypeTranslations,
           com.sforce.soap._2006._04.metadata.CustomLabelTranslation[] customLabels,
           com.sforce.soap._2006._04.metadata.CustomPageWebLinkTranslation[] customPageWebLinks,
           com.sforce.soap._2006._04.metadata.CustomTabTranslation[] customTabs,
           com.sforce.soap._2006._04.metadata.GlobalQuickActionTranslation[] quickActions,
           com.sforce.soap._2006._04.metadata.ReportTypeTranslation[] reportTypes,
           com.sforce.soap._2006._04.metadata.ScontrolTranslation[] scontrols) {
        super(
            fullName);
        this.customApplications = customApplications;
        this.customDataTypeTranslations = customDataTypeTranslations;
        this.customLabels = customLabels;
        this.customPageWebLinks = customPageWebLinks;
        this.customTabs = customTabs;
        this.quickActions = quickActions;
        this.reportTypes = reportTypes;
        this.scontrols = scontrols;
    }


    /**
     * Gets the customApplications value for this Translations.
     * 
     * @return customApplications
     */
    public com.sforce.soap._2006._04.metadata.CustomApplicationTranslation[] getCustomApplications() {
        return customApplications;
    }


    /**
     * Sets the customApplications value for this Translations.
     * 
     * @param customApplications
     */
    public void setCustomApplications(com.sforce.soap._2006._04.metadata.CustomApplicationTranslation[] customApplications) {
        this.customApplications = customApplications;
    }

    public com.sforce.soap._2006._04.metadata.CustomApplicationTranslation getCustomApplications(int i) {
        return this.customApplications[i];
    }

    public void setCustomApplications(int i, com.sforce.soap._2006._04.metadata.CustomApplicationTranslation _value) {
        this.customApplications[i] = _value;
    }


    /**
     * Gets the customDataTypeTranslations value for this Translations.
     * 
     * @return customDataTypeTranslations
     */
    public com.sforce.soap._2006._04.metadata.CustomDataTypeTranslation[] getCustomDataTypeTranslations() {
        return customDataTypeTranslations;
    }


    /**
     * Sets the customDataTypeTranslations value for this Translations.
     * 
     * @param customDataTypeTranslations
     */
    public void setCustomDataTypeTranslations(com.sforce.soap._2006._04.metadata.CustomDataTypeTranslation[] customDataTypeTranslations) {
        this.customDataTypeTranslations = customDataTypeTranslations;
    }

    public com.sforce.soap._2006._04.metadata.CustomDataTypeTranslation getCustomDataTypeTranslations(int i) {
        return this.customDataTypeTranslations[i];
    }

    public void setCustomDataTypeTranslations(int i, com.sforce.soap._2006._04.metadata.CustomDataTypeTranslation _value) {
        this.customDataTypeTranslations[i] = _value;
    }


    /**
     * Gets the customLabels value for this Translations.
     * 
     * @return customLabels
     */
    public com.sforce.soap._2006._04.metadata.CustomLabelTranslation[] getCustomLabels() {
        return customLabels;
    }


    /**
     * Sets the customLabels value for this Translations.
     * 
     * @param customLabels
     */
    public void setCustomLabels(com.sforce.soap._2006._04.metadata.CustomLabelTranslation[] customLabels) {
        this.customLabels = customLabels;
    }

    public com.sforce.soap._2006._04.metadata.CustomLabelTranslation getCustomLabels(int i) {
        return this.customLabels[i];
    }

    public void setCustomLabels(int i, com.sforce.soap._2006._04.metadata.CustomLabelTranslation _value) {
        this.customLabels[i] = _value;
    }


    /**
     * Gets the customPageWebLinks value for this Translations.
     * 
     * @return customPageWebLinks
     */
    public com.sforce.soap._2006._04.metadata.CustomPageWebLinkTranslation[] getCustomPageWebLinks() {
        return customPageWebLinks;
    }


    /**
     * Sets the customPageWebLinks value for this Translations.
     * 
     * @param customPageWebLinks
     */
    public void setCustomPageWebLinks(com.sforce.soap._2006._04.metadata.CustomPageWebLinkTranslation[] customPageWebLinks) {
        this.customPageWebLinks = customPageWebLinks;
    }

    public com.sforce.soap._2006._04.metadata.CustomPageWebLinkTranslation getCustomPageWebLinks(int i) {
        return this.customPageWebLinks[i];
    }

    public void setCustomPageWebLinks(int i, com.sforce.soap._2006._04.metadata.CustomPageWebLinkTranslation _value) {
        this.customPageWebLinks[i] = _value;
    }


    /**
     * Gets the customTabs value for this Translations.
     * 
     * @return customTabs
     */
    public com.sforce.soap._2006._04.metadata.CustomTabTranslation[] getCustomTabs() {
        return customTabs;
    }


    /**
     * Sets the customTabs value for this Translations.
     * 
     * @param customTabs
     */
    public void setCustomTabs(com.sforce.soap._2006._04.metadata.CustomTabTranslation[] customTabs) {
        this.customTabs = customTabs;
    }

    public com.sforce.soap._2006._04.metadata.CustomTabTranslation getCustomTabs(int i) {
        return this.customTabs[i];
    }

    public void setCustomTabs(int i, com.sforce.soap._2006._04.metadata.CustomTabTranslation _value) {
        this.customTabs[i] = _value;
    }


    /**
     * Gets the quickActions value for this Translations.
     * 
     * @return quickActions
     */
    public com.sforce.soap._2006._04.metadata.GlobalQuickActionTranslation[] getQuickActions() {
        return quickActions;
    }


    /**
     * Sets the quickActions value for this Translations.
     * 
     * @param quickActions
     */
    public void setQuickActions(com.sforce.soap._2006._04.metadata.GlobalQuickActionTranslation[] quickActions) {
        this.quickActions = quickActions;
    }

    public com.sforce.soap._2006._04.metadata.GlobalQuickActionTranslation getQuickActions(int i) {
        return this.quickActions[i];
    }

    public void setQuickActions(int i, com.sforce.soap._2006._04.metadata.GlobalQuickActionTranslation _value) {
        this.quickActions[i] = _value;
    }


    /**
     * Gets the reportTypes value for this Translations.
     * 
     * @return reportTypes
     */
    public com.sforce.soap._2006._04.metadata.ReportTypeTranslation[] getReportTypes() {
        return reportTypes;
    }


    /**
     * Sets the reportTypes value for this Translations.
     * 
     * @param reportTypes
     */
    public void setReportTypes(com.sforce.soap._2006._04.metadata.ReportTypeTranslation[] reportTypes) {
        this.reportTypes = reportTypes;
    }

    public com.sforce.soap._2006._04.metadata.ReportTypeTranslation getReportTypes(int i) {
        return this.reportTypes[i];
    }

    public void setReportTypes(int i, com.sforce.soap._2006._04.metadata.ReportTypeTranslation _value) {
        this.reportTypes[i] = _value;
    }


    /**
     * Gets the scontrols value for this Translations.
     * 
     * @return scontrols
     */
    public com.sforce.soap._2006._04.metadata.ScontrolTranslation[] getScontrols() {
        return scontrols;
    }


    /**
     * Sets the scontrols value for this Translations.
     * 
     * @param scontrols
     */
    public void setScontrols(com.sforce.soap._2006._04.metadata.ScontrolTranslation[] scontrols) {
        this.scontrols = scontrols;
    }

    public com.sforce.soap._2006._04.metadata.ScontrolTranslation getScontrols(int i) {
        return this.scontrols[i];
    }

    public void setScontrols(int i, com.sforce.soap._2006._04.metadata.ScontrolTranslation _value) {
        this.scontrols[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Translations)) return false;
        Translations other = (Translations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customApplications==null && other.getCustomApplications()==null) || 
             (this.customApplications!=null &&
              java.util.Arrays.equals(this.customApplications, other.getCustomApplications()))) &&
            ((this.customDataTypeTranslations==null && other.getCustomDataTypeTranslations()==null) || 
             (this.customDataTypeTranslations!=null &&
              java.util.Arrays.equals(this.customDataTypeTranslations, other.getCustomDataTypeTranslations()))) &&
            ((this.customLabels==null && other.getCustomLabels()==null) || 
             (this.customLabels!=null &&
              java.util.Arrays.equals(this.customLabels, other.getCustomLabels()))) &&
            ((this.customPageWebLinks==null && other.getCustomPageWebLinks()==null) || 
             (this.customPageWebLinks!=null &&
              java.util.Arrays.equals(this.customPageWebLinks, other.getCustomPageWebLinks()))) &&
            ((this.customTabs==null && other.getCustomTabs()==null) || 
             (this.customTabs!=null &&
              java.util.Arrays.equals(this.customTabs, other.getCustomTabs()))) &&
            ((this.quickActions==null && other.getQuickActions()==null) || 
             (this.quickActions!=null &&
              java.util.Arrays.equals(this.quickActions, other.getQuickActions()))) &&
            ((this.reportTypes==null && other.getReportTypes()==null) || 
             (this.reportTypes!=null &&
              java.util.Arrays.equals(this.reportTypes, other.getReportTypes()))) &&
            ((this.scontrols==null && other.getScontrols()==null) || 
             (this.scontrols!=null &&
              java.util.Arrays.equals(this.scontrols, other.getScontrols())));
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
        if (getCustomApplications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomApplications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomApplications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomDataTypeTranslations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomDataTypeTranslations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomDataTypeTranslations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomPageWebLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomPageWebLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomPageWebLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomTabs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomTabs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomTabs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getReportTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScontrols() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScontrols());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScontrols(), i);
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
        new org.apache.axis.description.TypeDesc(Translations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Translations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customApplications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customApplications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplicationTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDataTypeTranslations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customDataTypeTranslations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataTypeTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomLabelTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPageWebLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customPageWebLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomPageWebLinkTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customTabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomTabTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "GlobalQuickActionTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reportTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scontrols");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scontrols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ScontrolTranslation"));
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
