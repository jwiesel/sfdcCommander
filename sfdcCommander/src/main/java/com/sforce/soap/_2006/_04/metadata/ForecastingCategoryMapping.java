/**
 * ForecastingCategoryMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ForecastingCategoryMapping  implements java.io.Serializable {
    private java.lang.String forecastingItemCategoryApiName;

    private com.sforce.soap._2006._04.metadata.WeightedSourceCategory[] weightedSourceCategories;

    public ForecastingCategoryMapping() {
    }

    public ForecastingCategoryMapping(
           java.lang.String forecastingItemCategoryApiName,
           com.sforce.soap._2006._04.metadata.WeightedSourceCategory[] weightedSourceCategories) {
           this.forecastingItemCategoryApiName = forecastingItemCategoryApiName;
           this.weightedSourceCategories = weightedSourceCategories;
    }


    /**
     * Gets the forecastingItemCategoryApiName value for this ForecastingCategoryMapping.
     * 
     * @return forecastingItemCategoryApiName
     */
    public java.lang.String getForecastingItemCategoryApiName() {
        return forecastingItemCategoryApiName;
    }


    /**
     * Sets the forecastingItemCategoryApiName value for this ForecastingCategoryMapping.
     * 
     * @param forecastingItemCategoryApiName
     */
    public void setForecastingItemCategoryApiName(java.lang.String forecastingItemCategoryApiName) {
        this.forecastingItemCategoryApiName = forecastingItemCategoryApiName;
    }


    /**
     * Gets the weightedSourceCategories value for this ForecastingCategoryMapping.
     * 
     * @return weightedSourceCategories
     */
    public com.sforce.soap._2006._04.metadata.WeightedSourceCategory[] getWeightedSourceCategories() {
        return weightedSourceCategories;
    }


    /**
     * Sets the weightedSourceCategories value for this ForecastingCategoryMapping.
     * 
     * @param weightedSourceCategories
     */
    public void setWeightedSourceCategories(com.sforce.soap._2006._04.metadata.WeightedSourceCategory[] weightedSourceCategories) {
        this.weightedSourceCategories = weightedSourceCategories;
    }

    public com.sforce.soap._2006._04.metadata.WeightedSourceCategory getWeightedSourceCategories(int i) {
        return this.weightedSourceCategories[i];
    }

    public void setWeightedSourceCategories(int i, com.sforce.soap._2006._04.metadata.WeightedSourceCategory _value) {
        this.weightedSourceCategories[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastingCategoryMapping)) return false;
        ForecastingCategoryMapping other = (ForecastingCategoryMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forecastingItemCategoryApiName==null && other.getForecastingItemCategoryApiName()==null) || 
             (this.forecastingItemCategoryApiName!=null &&
              this.forecastingItemCategoryApiName.equals(other.getForecastingItemCategoryApiName()))) &&
            ((this.weightedSourceCategories==null && other.getWeightedSourceCategories()==null) || 
             (this.weightedSourceCategories!=null &&
              java.util.Arrays.equals(this.weightedSourceCategories, other.getWeightedSourceCategories())));
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
        if (getForecastingItemCategoryApiName() != null) {
            _hashCode += getForecastingItemCategoryApiName().hashCode();
        }
        if (getWeightedSourceCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeightedSourceCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeightedSourceCategories(), i);
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
        new org.apache.axis.description.TypeDesc(ForecastingCategoryMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastingCategoryMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastingItemCategoryApiName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forecastingItemCategoryApiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightedSourceCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "weightedSourceCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WeightedSourceCategory"));
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
