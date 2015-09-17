/**
 * ForecastRangeSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ForecastRangeSettings  implements java.io.Serializable {
    private int beginning;

    private int displaying;

    private com.sforce.soap._2006._04.metadata.PeriodTypes periodType;

    public ForecastRangeSettings() {
    }

    public ForecastRangeSettings(
           int beginning,
           int displaying,
           com.sforce.soap._2006._04.metadata.PeriodTypes periodType) {
           this.beginning = beginning;
           this.displaying = displaying;
           this.periodType = periodType;
    }


    /**
     * Gets the beginning value for this ForecastRangeSettings.
     * 
     * @return beginning
     */
    public int getBeginning() {
        return beginning;
    }


    /**
     * Sets the beginning value for this ForecastRangeSettings.
     * 
     * @param beginning
     */
    public void setBeginning(int beginning) {
        this.beginning = beginning;
    }


    /**
     * Gets the displaying value for this ForecastRangeSettings.
     * 
     * @return displaying
     */
    public int getDisplaying() {
        return displaying;
    }


    /**
     * Sets the displaying value for this ForecastRangeSettings.
     * 
     * @param displaying
     */
    public void setDisplaying(int displaying) {
        this.displaying = displaying;
    }


    /**
     * Gets the periodType value for this ForecastRangeSettings.
     * 
     * @return periodType
     */
    public com.sforce.soap._2006._04.metadata.PeriodTypes getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this ForecastRangeSettings.
     * 
     * @param periodType
     */
    public void setPeriodType(com.sforce.soap._2006._04.metadata.PeriodTypes periodType) {
        this.periodType = periodType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastRangeSettings)) return false;
        ForecastRangeSettings other = (ForecastRangeSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.beginning == other.getBeginning() &&
            this.displaying == other.getDisplaying() &&
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType())));
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
        _hashCode += getBeginning();
        _hashCode += getDisplaying();
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastRangeSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastRangeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "beginning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaying");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displaying"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "periodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PeriodTypes"));
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
