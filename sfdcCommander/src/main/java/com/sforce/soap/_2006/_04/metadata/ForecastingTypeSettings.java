/**
 * ForecastingTypeSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ForecastingTypeSettings  implements java.io.Serializable {
    private boolean active;

    private com.sforce.soap._2006._04.metadata.AdjustmentsSettings adjustmentsSettings;

    private java.lang.String[] displayedCategoryApiNames;

    private com.sforce.soap._2006._04.metadata.ForecastRangeSettings forecastRangeSettings;

    private java.lang.String[] forecastedCategoryApiNames;

    private boolean isAmount;

    private boolean isAvailable;

    private boolean isQuantity;

    private java.lang.String[] managerAdjustableCategoryApiNames;

    private java.lang.String masterLabel;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.OpportunityListFieldsLabelMapping[] opportunityListFieldsLabelMappings;

    private java.lang.String[] opportunityListFieldsSelectedSettings;

    private java.lang.String[] opportunityListFieldsUnselectedSettings;

    private java.lang.String[] ownerAdjustableCategoryApiNames;

    private com.sforce.soap._2006._04.metadata.QuotasSettings quotasSettings;

    public ForecastingTypeSettings() {
    }

    public ForecastingTypeSettings(
           boolean active,
           com.sforce.soap._2006._04.metadata.AdjustmentsSettings adjustmentsSettings,
           java.lang.String[] displayedCategoryApiNames,
           com.sforce.soap._2006._04.metadata.ForecastRangeSettings forecastRangeSettings,
           java.lang.String[] forecastedCategoryApiNames,
           boolean isAmount,
           boolean isAvailable,
           boolean isQuantity,
           java.lang.String[] managerAdjustableCategoryApiNames,
           java.lang.String masterLabel,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.OpportunityListFieldsLabelMapping[] opportunityListFieldsLabelMappings,
           java.lang.String[] opportunityListFieldsSelectedSettings,
           java.lang.String[] opportunityListFieldsUnselectedSettings,
           java.lang.String[] ownerAdjustableCategoryApiNames,
           com.sforce.soap._2006._04.metadata.QuotasSettings quotasSettings) {
           this.active = active;
           this.adjustmentsSettings = adjustmentsSettings;
           this.displayedCategoryApiNames = displayedCategoryApiNames;
           this.forecastRangeSettings = forecastRangeSettings;
           this.forecastedCategoryApiNames = forecastedCategoryApiNames;
           this.isAmount = isAmount;
           this.isAvailable = isAvailable;
           this.isQuantity = isQuantity;
           this.managerAdjustableCategoryApiNames = managerAdjustableCategoryApiNames;
           this.masterLabel = masterLabel;
           this.name = name;
           this.opportunityListFieldsLabelMappings = opportunityListFieldsLabelMappings;
           this.opportunityListFieldsSelectedSettings = opportunityListFieldsSelectedSettings;
           this.opportunityListFieldsUnselectedSettings = opportunityListFieldsUnselectedSettings;
           this.ownerAdjustableCategoryApiNames = ownerAdjustableCategoryApiNames;
           this.quotasSettings = quotasSettings;
    }


    /**
     * Gets the active value for this ForecastingTypeSettings.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ForecastingTypeSettings.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the adjustmentsSettings value for this ForecastingTypeSettings.
     * 
     * @return adjustmentsSettings
     */
    public com.sforce.soap._2006._04.metadata.AdjustmentsSettings getAdjustmentsSettings() {
        return adjustmentsSettings;
    }


    /**
     * Sets the adjustmentsSettings value for this ForecastingTypeSettings.
     * 
     * @param adjustmentsSettings
     */
    public void setAdjustmentsSettings(com.sforce.soap._2006._04.metadata.AdjustmentsSettings adjustmentsSettings) {
        this.adjustmentsSettings = adjustmentsSettings;
    }


    /**
     * Gets the displayedCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @return displayedCategoryApiNames
     */
    public java.lang.String[] getDisplayedCategoryApiNames() {
        return displayedCategoryApiNames;
    }


    /**
     * Sets the displayedCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @param displayedCategoryApiNames
     */
    public void setDisplayedCategoryApiNames(java.lang.String[] displayedCategoryApiNames) {
        this.displayedCategoryApiNames = displayedCategoryApiNames;
    }

    public java.lang.String getDisplayedCategoryApiNames(int i) {
        return this.displayedCategoryApiNames[i];
    }

    public void setDisplayedCategoryApiNames(int i, java.lang.String _value) {
        this.displayedCategoryApiNames[i] = _value;
    }


    /**
     * Gets the forecastRangeSettings value for this ForecastingTypeSettings.
     * 
     * @return forecastRangeSettings
     */
    public com.sforce.soap._2006._04.metadata.ForecastRangeSettings getForecastRangeSettings() {
        return forecastRangeSettings;
    }


    /**
     * Sets the forecastRangeSettings value for this ForecastingTypeSettings.
     * 
     * @param forecastRangeSettings
     */
    public void setForecastRangeSettings(com.sforce.soap._2006._04.metadata.ForecastRangeSettings forecastRangeSettings) {
        this.forecastRangeSettings = forecastRangeSettings;
    }


    /**
     * Gets the forecastedCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @return forecastedCategoryApiNames
     */
    public java.lang.String[] getForecastedCategoryApiNames() {
        return forecastedCategoryApiNames;
    }


    /**
     * Sets the forecastedCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @param forecastedCategoryApiNames
     */
    public void setForecastedCategoryApiNames(java.lang.String[] forecastedCategoryApiNames) {
        this.forecastedCategoryApiNames = forecastedCategoryApiNames;
    }

    public java.lang.String getForecastedCategoryApiNames(int i) {
        return this.forecastedCategoryApiNames[i];
    }

    public void setForecastedCategoryApiNames(int i, java.lang.String _value) {
        this.forecastedCategoryApiNames[i] = _value;
    }


    /**
     * Gets the isAmount value for this ForecastingTypeSettings.
     * 
     * @return isAmount
     */
    public boolean isIsAmount() {
        return isAmount;
    }


    /**
     * Sets the isAmount value for this ForecastingTypeSettings.
     * 
     * @param isAmount
     */
    public void setIsAmount(boolean isAmount) {
        this.isAmount = isAmount;
    }


    /**
     * Gets the isAvailable value for this ForecastingTypeSettings.
     * 
     * @return isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this ForecastingTypeSettings.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the isQuantity value for this ForecastingTypeSettings.
     * 
     * @return isQuantity
     */
    public boolean isIsQuantity() {
        return isQuantity;
    }


    /**
     * Sets the isQuantity value for this ForecastingTypeSettings.
     * 
     * @param isQuantity
     */
    public void setIsQuantity(boolean isQuantity) {
        this.isQuantity = isQuantity;
    }


    /**
     * Gets the managerAdjustableCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @return managerAdjustableCategoryApiNames
     */
    public java.lang.String[] getManagerAdjustableCategoryApiNames() {
        return managerAdjustableCategoryApiNames;
    }


    /**
     * Sets the managerAdjustableCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @param managerAdjustableCategoryApiNames
     */
    public void setManagerAdjustableCategoryApiNames(java.lang.String[] managerAdjustableCategoryApiNames) {
        this.managerAdjustableCategoryApiNames = managerAdjustableCategoryApiNames;
    }

    public java.lang.String getManagerAdjustableCategoryApiNames(int i) {
        return this.managerAdjustableCategoryApiNames[i];
    }

    public void setManagerAdjustableCategoryApiNames(int i, java.lang.String _value) {
        this.managerAdjustableCategoryApiNames[i] = _value;
    }


    /**
     * Gets the masterLabel value for this ForecastingTypeSettings.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this ForecastingTypeSettings.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the name value for this ForecastingTypeSettings.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ForecastingTypeSettings.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the opportunityListFieldsLabelMappings value for this ForecastingTypeSettings.
     * 
     * @return opportunityListFieldsLabelMappings
     */
    public com.sforce.soap._2006._04.metadata.OpportunityListFieldsLabelMapping[] getOpportunityListFieldsLabelMappings() {
        return opportunityListFieldsLabelMappings;
    }


    /**
     * Sets the opportunityListFieldsLabelMappings value for this ForecastingTypeSettings.
     * 
     * @param opportunityListFieldsLabelMappings
     */
    public void setOpportunityListFieldsLabelMappings(com.sforce.soap._2006._04.metadata.OpportunityListFieldsLabelMapping[] opportunityListFieldsLabelMappings) {
        this.opportunityListFieldsLabelMappings = opportunityListFieldsLabelMappings;
    }

    public com.sforce.soap._2006._04.metadata.OpportunityListFieldsLabelMapping getOpportunityListFieldsLabelMappings(int i) {
        return this.opportunityListFieldsLabelMappings[i];
    }

    public void setOpportunityListFieldsLabelMappings(int i, com.sforce.soap._2006._04.metadata.OpportunityListFieldsLabelMapping _value) {
        this.opportunityListFieldsLabelMappings[i] = _value;
    }


    /**
     * Gets the opportunityListFieldsSelectedSettings value for this ForecastingTypeSettings.
     * 
     * @return opportunityListFieldsSelectedSettings
     */
    public java.lang.String[] getOpportunityListFieldsSelectedSettings() {
        return opportunityListFieldsSelectedSettings;
    }


    /**
     * Sets the opportunityListFieldsSelectedSettings value for this ForecastingTypeSettings.
     * 
     * @param opportunityListFieldsSelectedSettings
     */
    public void setOpportunityListFieldsSelectedSettings(java.lang.String[] opportunityListFieldsSelectedSettings) {
        this.opportunityListFieldsSelectedSettings = opportunityListFieldsSelectedSettings;
    }


    /**
     * Gets the opportunityListFieldsUnselectedSettings value for this ForecastingTypeSettings.
     * 
     * @return opportunityListFieldsUnselectedSettings
     */
    public java.lang.String[] getOpportunityListFieldsUnselectedSettings() {
        return opportunityListFieldsUnselectedSettings;
    }


    /**
     * Sets the opportunityListFieldsUnselectedSettings value for this ForecastingTypeSettings.
     * 
     * @param opportunityListFieldsUnselectedSettings
     */
    public void setOpportunityListFieldsUnselectedSettings(java.lang.String[] opportunityListFieldsUnselectedSettings) {
        this.opportunityListFieldsUnselectedSettings = opportunityListFieldsUnselectedSettings;
    }


    /**
     * Gets the ownerAdjustableCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @return ownerAdjustableCategoryApiNames
     */
    public java.lang.String[] getOwnerAdjustableCategoryApiNames() {
        return ownerAdjustableCategoryApiNames;
    }


    /**
     * Sets the ownerAdjustableCategoryApiNames value for this ForecastingTypeSettings.
     * 
     * @param ownerAdjustableCategoryApiNames
     */
    public void setOwnerAdjustableCategoryApiNames(java.lang.String[] ownerAdjustableCategoryApiNames) {
        this.ownerAdjustableCategoryApiNames = ownerAdjustableCategoryApiNames;
    }

    public java.lang.String getOwnerAdjustableCategoryApiNames(int i) {
        return this.ownerAdjustableCategoryApiNames[i];
    }

    public void setOwnerAdjustableCategoryApiNames(int i, java.lang.String _value) {
        this.ownerAdjustableCategoryApiNames[i] = _value;
    }


    /**
     * Gets the quotasSettings value for this ForecastingTypeSettings.
     * 
     * @return quotasSettings
     */
    public com.sforce.soap._2006._04.metadata.QuotasSettings getQuotasSettings() {
        return quotasSettings;
    }


    /**
     * Sets the quotasSettings value for this ForecastingTypeSettings.
     * 
     * @param quotasSettings
     */
    public void setQuotasSettings(com.sforce.soap._2006._04.metadata.QuotasSettings quotasSettings) {
        this.quotasSettings = quotasSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastingTypeSettings)) return false;
        ForecastingTypeSettings other = (ForecastingTypeSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.adjustmentsSettings==null && other.getAdjustmentsSettings()==null) || 
             (this.adjustmentsSettings!=null &&
              this.adjustmentsSettings.equals(other.getAdjustmentsSettings()))) &&
            ((this.displayedCategoryApiNames==null && other.getDisplayedCategoryApiNames()==null) || 
             (this.displayedCategoryApiNames!=null &&
              java.util.Arrays.equals(this.displayedCategoryApiNames, other.getDisplayedCategoryApiNames()))) &&
            ((this.forecastRangeSettings==null && other.getForecastRangeSettings()==null) || 
             (this.forecastRangeSettings!=null &&
              this.forecastRangeSettings.equals(other.getForecastRangeSettings()))) &&
            ((this.forecastedCategoryApiNames==null && other.getForecastedCategoryApiNames()==null) || 
             (this.forecastedCategoryApiNames!=null &&
              java.util.Arrays.equals(this.forecastedCategoryApiNames, other.getForecastedCategoryApiNames()))) &&
            this.isAmount == other.isIsAmount() &&
            this.isAvailable == other.isIsAvailable() &&
            this.isQuantity == other.isIsQuantity() &&
            ((this.managerAdjustableCategoryApiNames==null && other.getManagerAdjustableCategoryApiNames()==null) || 
             (this.managerAdjustableCategoryApiNames!=null &&
              java.util.Arrays.equals(this.managerAdjustableCategoryApiNames, other.getManagerAdjustableCategoryApiNames()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.opportunityListFieldsLabelMappings==null && other.getOpportunityListFieldsLabelMappings()==null) || 
             (this.opportunityListFieldsLabelMappings!=null &&
              java.util.Arrays.equals(this.opportunityListFieldsLabelMappings, other.getOpportunityListFieldsLabelMappings()))) &&
            ((this.opportunityListFieldsSelectedSettings==null && other.getOpportunityListFieldsSelectedSettings()==null) || 
             (this.opportunityListFieldsSelectedSettings!=null &&
              java.util.Arrays.equals(this.opportunityListFieldsSelectedSettings, other.getOpportunityListFieldsSelectedSettings()))) &&
            ((this.opportunityListFieldsUnselectedSettings==null && other.getOpportunityListFieldsUnselectedSettings()==null) || 
             (this.opportunityListFieldsUnselectedSettings!=null &&
              java.util.Arrays.equals(this.opportunityListFieldsUnselectedSettings, other.getOpportunityListFieldsUnselectedSettings()))) &&
            ((this.ownerAdjustableCategoryApiNames==null && other.getOwnerAdjustableCategoryApiNames()==null) || 
             (this.ownerAdjustableCategoryApiNames!=null &&
              java.util.Arrays.equals(this.ownerAdjustableCategoryApiNames, other.getOwnerAdjustableCategoryApiNames()))) &&
            ((this.quotasSettings==null && other.getQuotasSettings()==null) || 
             (this.quotasSettings!=null &&
              this.quotasSettings.equals(other.getQuotasSettings())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAdjustmentsSettings() != null) {
            _hashCode += getAdjustmentsSettings().hashCode();
        }
        if (getDisplayedCategoryApiNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayedCategoryApiNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayedCategoryApiNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForecastRangeSettings() != null) {
            _hashCode += getForecastRangeSettings().hashCode();
        }
        if (getForecastedCategoryApiNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastedCategoryApiNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastedCategoryApiNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsAmount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsQuantity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getManagerAdjustableCategoryApiNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagerAdjustableCategoryApiNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagerAdjustableCategoryApiNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOpportunityListFieldsLabelMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunityListFieldsLabelMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunityListFieldsLabelMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpportunityListFieldsSelectedSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunityListFieldsSelectedSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunityListFieldsSelectedSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpportunityListFieldsUnselectedSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunityListFieldsUnselectedSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunityListFieldsUnselectedSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwnerAdjustableCategoryApiNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwnerAdjustableCategoryApiNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwnerAdjustableCategoryApiNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuotasSettings() != null) {
            _hashCode += getQuotasSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastingTypeSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastingTypeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentsSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "adjustmentsSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AdjustmentsSettings"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayedCategoryApiNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayedCategoryApiNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastRangeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forecastRangeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastRangeSettings"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastedCategoryApiNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forecastedCategoryApiNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerAdjustableCategoryApiNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "managerAdjustableCategoryApiNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityListFieldsLabelMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityListFieldsLabelMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunityListFieldsLabelMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityListFieldsSelectedSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityListFieldsSelectedSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityListFieldsUnselectedSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityListFieldsUnselectedSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerAdjustableCategoryApiNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ownerAdjustableCategoryApiNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotasSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quotasSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuotasSettings"));
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
