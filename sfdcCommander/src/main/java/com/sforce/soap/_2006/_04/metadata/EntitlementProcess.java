/**
 * EntitlementProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EntitlementProcess  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String SObjectType;

    private java.lang.Boolean active;

    private java.lang.String businessHours;

    private java.lang.String description;

    private java.lang.String entryStartDateField;

    private java.lang.String exitCriteriaBooleanFilter;

    private com.sforce.soap._2006._04.metadata.FilterItem[] exitCriteriaFilterItems;

    private java.lang.String exitCriteriaFormula;

    private java.lang.Boolean isVersionDefault;

    private com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneItem[] milestones;

    private java.lang.String name;

    private java.lang.String versionMaster;

    private java.lang.String versionNotes;

    private java.lang.Integer versionNumber;

    public EntitlementProcess() {
    }

    public EntitlementProcess(
           java.lang.String fullName,
           java.lang.String SObjectType,
           java.lang.Boolean active,
           java.lang.String businessHours,
           java.lang.String description,
           java.lang.String entryStartDateField,
           java.lang.String exitCriteriaBooleanFilter,
           com.sforce.soap._2006._04.metadata.FilterItem[] exitCriteriaFilterItems,
           java.lang.String exitCriteriaFormula,
           java.lang.Boolean isVersionDefault,
           com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneItem[] milestones,
           java.lang.String name,
           java.lang.String versionMaster,
           java.lang.String versionNotes,
           java.lang.Integer versionNumber) {
        super(
            fullName);
        this.SObjectType = SObjectType;
        this.active = active;
        this.businessHours = businessHours;
        this.description = description;
        this.entryStartDateField = entryStartDateField;
        this.exitCriteriaBooleanFilter = exitCriteriaBooleanFilter;
        this.exitCriteriaFilterItems = exitCriteriaFilterItems;
        this.exitCriteriaFormula = exitCriteriaFormula;
        this.isVersionDefault = isVersionDefault;
        this.milestones = milestones;
        this.name = name;
        this.versionMaster = versionMaster;
        this.versionNotes = versionNotes;
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the SObjectType value for this EntitlementProcess.
     * 
     * @return SObjectType
     */
    public java.lang.String getSObjectType() {
        return SObjectType;
    }


    /**
     * Sets the SObjectType value for this EntitlementProcess.
     * 
     * @param SObjectType
     */
    public void setSObjectType(java.lang.String SObjectType) {
        this.SObjectType = SObjectType;
    }


    /**
     * Gets the active value for this EntitlementProcess.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this EntitlementProcess.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the businessHours value for this EntitlementProcess.
     * 
     * @return businessHours
     */
    public java.lang.String getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this EntitlementProcess.
     * 
     * @param businessHours
     */
    public void setBusinessHours(java.lang.String businessHours) {
        this.businessHours = businessHours;
    }


    /**
     * Gets the description value for this EntitlementProcess.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this EntitlementProcess.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the entryStartDateField value for this EntitlementProcess.
     * 
     * @return entryStartDateField
     */
    public java.lang.String getEntryStartDateField() {
        return entryStartDateField;
    }


    /**
     * Sets the entryStartDateField value for this EntitlementProcess.
     * 
     * @param entryStartDateField
     */
    public void setEntryStartDateField(java.lang.String entryStartDateField) {
        this.entryStartDateField = entryStartDateField;
    }


    /**
     * Gets the exitCriteriaBooleanFilter value for this EntitlementProcess.
     * 
     * @return exitCriteriaBooleanFilter
     */
    public java.lang.String getExitCriteriaBooleanFilter() {
        return exitCriteriaBooleanFilter;
    }


    /**
     * Sets the exitCriteriaBooleanFilter value for this EntitlementProcess.
     * 
     * @param exitCriteriaBooleanFilter
     */
    public void setExitCriteriaBooleanFilter(java.lang.String exitCriteriaBooleanFilter) {
        this.exitCriteriaBooleanFilter = exitCriteriaBooleanFilter;
    }


    /**
     * Gets the exitCriteriaFilterItems value for this EntitlementProcess.
     * 
     * @return exitCriteriaFilterItems
     */
    public com.sforce.soap._2006._04.metadata.FilterItem[] getExitCriteriaFilterItems() {
        return exitCriteriaFilterItems;
    }


    /**
     * Sets the exitCriteriaFilterItems value for this EntitlementProcess.
     * 
     * @param exitCriteriaFilterItems
     */
    public void setExitCriteriaFilterItems(com.sforce.soap._2006._04.metadata.FilterItem[] exitCriteriaFilterItems) {
        this.exitCriteriaFilterItems = exitCriteriaFilterItems;
    }

    public com.sforce.soap._2006._04.metadata.FilterItem getExitCriteriaFilterItems(int i) {
        return this.exitCriteriaFilterItems[i];
    }

    public void setExitCriteriaFilterItems(int i, com.sforce.soap._2006._04.metadata.FilterItem _value) {
        this.exitCriteriaFilterItems[i] = _value;
    }


    /**
     * Gets the exitCriteriaFormula value for this EntitlementProcess.
     * 
     * @return exitCriteriaFormula
     */
    public java.lang.String getExitCriteriaFormula() {
        return exitCriteriaFormula;
    }


    /**
     * Sets the exitCriteriaFormula value for this EntitlementProcess.
     * 
     * @param exitCriteriaFormula
     */
    public void setExitCriteriaFormula(java.lang.String exitCriteriaFormula) {
        this.exitCriteriaFormula = exitCriteriaFormula;
    }


    /**
     * Gets the isVersionDefault value for this EntitlementProcess.
     * 
     * @return isVersionDefault
     */
    public java.lang.Boolean getIsVersionDefault() {
        return isVersionDefault;
    }


    /**
     * Sets the isVersionDefault value for this EntitlementProcess.
     * 
     * @param isVersionDefault
     */
    public void setIsVersionDefault(java.lang.Boolean isVersionDefault) {
        this.isVersionDefault = isVersionDefault;
    }


    /**
     * Gets the milestones value for this EntitlementProcess.
     * 
     * @return milestones
     */
    public com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneItem[] getMilestones() {
        return milestones;
    }


    /**
     * Sets the milestones value for this EntitlementProcess.
     * 
     * @param milestones
     */
    public void setMilestones(com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneItem[] milestones) {
        this.milestones = milestones;
    }

    public com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneItem getMilestones(int i) {
        return this.milestones[i];
    }

    public void setMilestones(int i, com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneItem _value) {
        this.milestones[i] = _value;
    }


    /**
     * Gets the name value for this EntitlementProcess.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EntitlementProcess.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the versionMaster value for this EntitlementProcess.
     * 
     * @return versionMaster
     */
    public java.lang.String getVersionMaster() {
        return versionMaster;
    }


    /**
     * Sets the versionMaster value for this EntitlementProcess.
     * 
     * @param versionMaster
     */
    public void setVersionMaster(java.lang.String versionMaster) {
        this.versionMaster = versionMaster;
    }


    /**
     * Gets the versionNotes value for this EntitlementProcess.
     * 
     * @return versionNotes
     */
    public java.lang.String getVersionNotes() {
        return versionNotes;
    }


    /**
     * Sets the versionNotes value for this EntitlementProcess.
     * 
     * @param versionNotes
     */
    public void setVersionNotes(java.lang.String versionNotes) {
        this.versionNotes = versionNotes;
    }


    /**
     * Gets the versionNumber value for this EntitlementProcess.
     * 
     * @return versionNumber
     */
    public java.lang.Integer getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this EntitlementProcess.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementProcess)) return false;
        EntitlementProcess other = (EntitlementProcess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SObjectType==null && other.getSObjectType()==null) || 
             (this.SObjectType!=null &&
              this.SObjectType.equals(other.getSObjectType()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              this.businessHours.equals(other.getBusinessHours()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.entryStartDateField==null && other.getEntryStartDateField()==null) || 
             (this.entryStartDateField!=null &&
              this.entryStartDateField.equals(other.getEntryStartDateField()))) &&
            ((this.exitCriteriaBooleanFilter==null && other.getExitCriteriaBooleanFilter()==null) || 
             (this.exitCriteriaBooleanFilter!=null &&
              this.exitCriteriaBooleanFilter.equals(other.getExitCriteriaBooleanFilter()))) &&
            ((this.exitCriteriaFilterItems==null && other.getExitCriteriaFilterItems()==null) || 
             (this.exitCriteriaFilterItems!=null &&
              java.util.Arrays.equals(this.exitCriteriaFilterItems, other.getExitCriteriaFilterItems()))) &&
            ((this.exitCriteriaFormula==null && other.getExitCriteriaFormula()==null) || 
             (this.exitCriteriaFormula!=null &&
              this.exitCriteriaFormula.equals(other.getExitCriteriaFormula()))) &&
            ((this.isVersionDefault==null && other.getIsVersionDefault()==null) || 
             (this.isVersionDefault!=null &&
              this.isVersionDefault.equals(other.getIsVersionDefault()))) &&
            ((this.milestones==null && other.getMilestones()==null) || 
             (this.milestones!=null &&
              java.util.Arrays.equals(this.milestones, other.getMilestones()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.versionMaster==null && other.getVersionMaster()==null) || 
             (this.versionMaster!=null &&
              this.versionMaster.equals(other.getVersionMaster()))) &&
            ((this.versionNotes==null && other.getVersionNotes()==null) || 
             (this.versionNotes!=null &&
              this.versionNotes.equals(other.getVersionNotes()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber())));
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
        if (getSObjectType() != null) {
            _hashCode += getSObjectType().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getBusinessHours() != null) {
            _hashCode += getBusinessHours().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEntryStartDateField() != null) {
            _hashCode += getEntryStartDateField().hashCode();
        }
        if (getExitCriteriaBooleanFilter() != null) {
            _hashCode += getExitCriteriaBooleanFilter().hashCode();
        }
        if (getExitCriteriaFilterItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExitCriteriaFilterItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExitCriteriaFilterItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExitCriteriaFormula() != null) {
            _hashCode += getExitCriteriaFormula().hashCode();
        }
        if (getIsVersionDefault() != null) {
            _hashCode += getIsVersionDefault().hashCode();
        }
        if (getMilestones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMilestones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMilestones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVersionMaster() != null) {
            _hashCode += getVersionMaster().hashCode();
        }
        if (getVersionNotes() != null) {
            _hashCode += getVersionNotes().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementProcess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryStartDateField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entryStartDateField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitCriteriaBooleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "exitCriteriaBooleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitCriteriaFilterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "exitCriteriaFilterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitCriteriaFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "exitCriteriaFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVersionDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isVersionDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "milestones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcessMilestoneItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionMaster");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "versionMaster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "versionNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
