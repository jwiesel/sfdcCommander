/**
 * EventParameterMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EventParameterMap  implements java.io.Serializable {
    private java.lang.String parameterName;

    private java.lang.String parameterValue;

    public EventParameterMap() {
    }

    public EventParameterMap(
           java.lang.String parameterName,
           java.lang.String parameterValue) {
           this.parameterName = parameterName;
           this.parameterValue = parameterValue;
    }


    /**
     * Gets the parameterName value for this EventParameterMap.
     * 
     * @return parameterName
     */
    public java.lang.String getParameterName() {
        return parameterName;
    }


    /**
     * Sets the parameterName value for this EventParameterMap.
     * 
     * @param parameterName
     */
    public void setParameterName(java.lang.String parameterName) {
        this.parameterName = parameterName;
    }


    /**
     * Gets the parameterValue value for this EventParameterMap.
     * 
     * @return parameterValue
     */
    public java.lang.String getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this EventParameterMap.
     * 
     * @param parameterValue
     */
    public void setParameterValue(java.lang.String parameterValue) {
        this.parameterValue = parameterValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventParameterMap)) return false;
        EventParameterMap other = (EventParameterMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterName==null && other.getParameterName()==null) || 
             (this.parameterName!=null &&
              this.parameterName.equals(other.getParameterName()))) &&
            ((this.parameterValue==null && other.getParameterValue()==null) || 
             (this.parameterValue!=null &&
              this.parameterValue.equals(other.getParameterValue())));
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
        if (getParameterName() != null) {
            _hashCode += getParameterName().hashCode();
        }
        if (getParameterValue() != null) {
            _hashCode += getParameterValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventParameterMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EventParameterMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "parameterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "parameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
