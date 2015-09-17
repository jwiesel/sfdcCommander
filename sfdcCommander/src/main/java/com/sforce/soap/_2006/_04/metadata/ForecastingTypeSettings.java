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

    private java.lang.String[] managerAdjustableCategoryApiNames;

    private java.lang.String name;

    private java.lang.String[] opportunityListFieldsSelectedSettings;

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
           java.lang.String[] managerAdjustableCategoryApiNames,
           java.lang.String name,
           java.lang.String[] opportunityListFieldsSelectedSettings,
           java.lang.String[] ownerAdjustableCategoryApiNames,
           com.sforce.soap._2006._04.metadata.QuotasSettings quotasSettings) {
           this.active = active;
           this.adjustmentsSettings = adjustmentsSettings;
           this.displayedCategoryApiNames = displayedCategoryApiNames;
           this.forecastRangeSettings = forecastRangeSettings;
           this.forecastedCategoryApiNames = forecastedCategoryApiNames;
           this.managerAdjustableCategoryApiNames = managerAdjustableCategoryApiNames;
           this.name = name;
           this.opportunityListFieldsSelectedSettings = opportunityListFieldsSelectedSettings;
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
            ((this.managerAdjustableCategoryApiNames==null && other.getManagerAdjustableCategoryApiNames()==null) || 
             (this.managerAdjustableCategoryApiNames!=null &&
              java.util.Arrays.equals(this.managerAdjustableCategoryApiNames, other.getManagerAdjustableCategoryApiNames()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.opportunityListFieldsSelectedSettings==null && other.getOpportunityListFieldsSelectedSettings()==null) || 
             (this.opportunityListFieldsSelectedSettings!=null &&
              java.util.Arrays.equals(this.opportunityListFieldsSelectedSettings, other.getOpportunityListFieldsSelectedSettings()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        elemField.setFieldName("managerAdjustableCategoryApiNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "managerAdjustableCategoryApiNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityListFieldsSelectedSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityListFieldsSelectedSettings"));
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
