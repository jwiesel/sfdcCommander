/**
 * BusinessHoursSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class BusinessHoursSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.BusinessHoursEntry[] businessHours;

    private com.sforce.soap._2006._04.metadata.Holiday[] holidays;

    public BusinessHoursSettings() {
    }

    public BusinessHoursSettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.BusinessHoursEntry[] businessHours,
           com.sforce.soap._2006._04.metadata.Holiday[] holidays) {
        super(
            fullName);
        this.businessHours = businessHours;
        this.holidays = holidays;
    }


    /**
     * Gets the businessHours value for this BusinessHoursSettings.
     * 
     * @return businessHours
     */
    public com.sforce.soap._2006._04.metadata.BusinessHoursEntry[] getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this BusinessHoursSettings.
     * 
     * @param businessHours
     */
    public void setBusinessHours(com.sforce.soap._2006._04.metadata.BusinessHoursEntry[] businessHours) {
        this.businessHours = businessHours;
    }

    public com.sforce.soap._2006._04.metadata.BusinessHoursEntry getBusinessHours(int i) {
        return this.businessHours[i];
    }

    public void setBusinessHours(int i, com.sforce.soap._2006._04.metadata.BusinessHoursEntry _value) {
        this.businessHours[i] = _value;
    }


    /**
     * Gets the holidays value for this BusinessHoursSettings.
     * 
     * @return holidays
     */
    public com.sforce.soap._2006._04.metadata.Holiday[] getHolidays() {
        return holidays;
    }


    /**
     * Sets the holidays value for this BusinessHoursSettings.
     * 
     * @param holidays
     */
    public void setHolidays(com.sforce.soap._2006._04.metadata.Holiday[] holidays) {
        this.holidays = holidays;
    }

    public com.sforce.soap._2006._04.metadata.Holiday getHolidays(int i) {
        return this.holidays[i];
    }

    public void setHolidays(int i, com.sforce.soap._2006._04.metadata.Holiday _value) {
        this.holidays[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessHoursSettings)) return false;
        BusinessHoursSettings other = (BusinessHoursSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              java.util.Arrays.equals(this.businessHours, other.getBusinessHours()))) &&
            ((this.holidays==null && other.getHolidays()==null) || 
             (this.holidays!=null &&
              java.util.Arrays.equals(this.holidays, other.getHolidays())));
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
        if (getBusinessHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessHours(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHolidays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHolidays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHolidays(), i);
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
        new org.apache.axis.description.TypeDesc(BusinessHoursSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessHoursSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "businessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessHoursEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "holidays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Holiday"));
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
