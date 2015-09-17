/**
 * ForecastingSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ForecastingSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.DisplayCurrency displayCurrency;

    private java.lang.Boolean enableForecasts;

    private com.sforce.soap._2006._04.metadata.ForecastingCategoryMapping[] forecastingCategoryMappings;

    private com.sforce.soap._2006._04.metadata.ForecastingTypeSettings[] forecastingTypeSettings;

    public ForecastingSettings() {
    }

    public ForecastingSettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.DisplayCurrency displayCurrency,
           java.lang.Boolean enableForecasts,
           com.sforce.soap._2006._04.metadata.ForecastingCategoryMapping[] forecastingCategoryMappings,
           com.sforce.soap._2006._04.metadata.ForecastingTypeSettings[] forecastingTypeSettings) {
        super(
            fullName);
        this.displayCurrency = displayCurrency;
        this.enableForecasts = enableForecasts;
        this.forecastingCategoryMappings = forecastingCategoryMappings;
        this.forecastingTypeSettings = forecastingTypeSettings;
    }


    /**
     * Gets the displayCurrency value for this ForecastingSettings.
     * 
     * @return displayCurrency
     */
    public com.sforce.soap._2006._04.metadata.DisplayCurrency getDisplayCurrency() {
        return displayCurrency;
    }


    /**
     * Sets the displayCurrency value for this ForecastingSettings.
     * 
     * @param displayCurrency
     */
    public void setDisplayCurrency(com.sforce.soap._2006._04.metadata.DisplayCurrency displayCurrency) {
        this.displayCurrency = displayCurrency;
    }


    /**
     * Gets the enableForecasts value for this ForecastingSettings.
     * 
     * @return enableForecasts
     */
    public java.lang.Boolean getEnableForecasts() {
        return enableForecasts;
    }


    /**
     * Sets the enableForecasts value for this ForecastingSettings.
     * 
     * @param enableForecasts
     */
    public void setEnableForecasts(java.lang.Boolean enableForecasts) {
        this.enableForecasts = enableForecasts;
    }


    /**
     * Gets the forecastingCategoryMappings value for this ForecastingSettings.
     * 
     * @return forecastingCategoryMappings
     */
    public com.sforce.soap._2006._04.metadata.ForecastingCategoryMapping[] getForecastingCategoryMappings() {
        return forecastingCategoryMappings;
    }


    /**
     * Sets the forecastingCategoryMappings value for this ForecastingSettings.
     * 
     * @param forecastingCategoryMappings
     */
    public void setForecastingCategoryMappings(com.sforce.soap._2006._04.metadata.ForecastingCategoryMapping[] forecastingCategoryMappings) {
        this.forecastingCategoryMappings = forecastingCategoryMappings;
    }

    public com.sforce.soap._2006._04.metadata.ForecastingCategoryMapping getForecastingCategoryMappings(int i) {
        return this.forecastingCategoryMappings[i];
    }

    public void setForecastingCategoryMappings(int i, com.sforce.soap._2006._04.metadata.ForecastingCategoryMapping _value) {
        this.forecastingCategoryMappings[i] = _value;
    }


    /**
     * Gets the forecastingTypeSettings value for this ForecastingSettings.
     * 
     * @return forecastingTypeSettings
     */
    public com.sforce.soap._2006._04.metadata.ForecastingTypeSettings[] getForecastingTypeSettings() {
        return forecastingTypeSettings;
    }


    /**
     * Sets the forecastingTypeSettings value for this ForecastingSettings.
     * 
     * @param forecastingTypeSettings
     */
    public void setForecastingTypeSettings(com.sforce.soap._2006._04.metadata.ForecastingTypeSettings[] forecastingTypeSettings) {
        this.forecastingTypeSettings = forecastingTypeSettings;
    }

    public com.sforce.soap._2006._04.metadata.ForecastingTypeSettings getForecastingTypeSettings(int i) {
        return this.forecastingTypeSettings[i];
    }

    public void setForecastingTypeSettings(int i, com.sforce.soap._2006._04.metadata.ForecastingTypeSettings _value) {
        this.forecastingTypeSettings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastingSettings)) return false;
        ForecastingSettings other = (ForecastingSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayCurrency==null && other.getDisplayCurrency()==null) || 
             (this.displayCurrency!=null &&
              this.displayCurrency.equals(other.getDisplayCurrency()))) &&
            ((this.enableForecasts==null && other.getEnableForecasts()==null) || 
             (this.enableForecasts!=null &&
              this.enableForecasts.equals(other.getEnableForecasts()))) &&
            ((this.forecastingCategoryMappings==null && other.getForecastingCategoryMappings()==null) || 
             (this.forecastingCategoryMappings!=null &&
              java.util.Arrays.equals(this.forecastingCategoryMappings, other.getForecastingCategoryMappings()))) &&
            ((this.forecastingTypeSettings==null && other.getForecastingTypeSettings()==null) || 
             (this.forecastingTypeSettings!=null &&
              java.util.Arrays.equals(this.forecastingTypeSettings, other.getForecastingTypeSettings())));
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
        if (getDisplayCurrency() != null) {
            _hashCode += getDisplayCurrency().hashCode();
        }
        if (getEnableForecasts() != null) {
            _hashCode += getEnableForecasts().hashCode();
        }
        if (getForecastingCategoryMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastingCategoryMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastingCategoryMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForecastingTypeSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastingTypeSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastingTypeSettings(), i);
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
        new org.apache.axis.description.TypeDesc(ForecastingSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastingSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DisplayCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableForecasts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableForecasts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastingCategoryMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forecastingCategoryMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastingCategoryMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastingTypeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forecastingTypeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastingTypeSettings"));
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
