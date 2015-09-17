/**
 * FlowElementReferenceOrValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowElementReferenceOrValue  implements java.io.Serializable {
    private java.lang.Boolean booleanValue;

    private java.util.Calendar dateTimeValue;

    private java.util.Date dateValue;

    private java.lang.String elementReference;

    private java.lang.Double numberValue;

    private java.lang.String stringValue;

    public FlowElementReferenceOrValue() {
    }

    public FlowElementReferenceOrValue(
           java.lang.Boolean booleanValue,
           java.util.Calendar dateTimeValue,
           java.util.Date dateValue,
           java.lang.String elementReference,
           java.lang.Double numberValue,
           java.lang.String stringValue) {
           this.booleanValue = booleanValue;
           this.dateTimeValue = dateTimeValue;
           this.dateValue = dateValue;
           this.elementReference = elementReference;
           this.numberValue = numberValue;
           this.stringValue = stringValue;
    }


    /**
     * Gets the booleanValue value for this FlowElementReferenceOrValue.
     * 
     * @return booleanValue
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }


    /**
     * Sets the booleanValue value for this FlowElementReferenceOrValue.
     * 
     * @param booleanValue
     */
    public void setBooleanValue(java.lang.Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }


    /**
     * Gets the dateTimeValue value for this FlowElementReferenceOrValue.
     * 
     * @return dateTimeValue
     */
    public java.util.Calendar getDateTimeValue() {
        return dateTimeValue;
    }


    /**
     * Sets the dateTimeValue value for this FlowElementReferenceOrValue.
     * 
     * @param dateTimeValue
     */
    public void setDateTimeValue(java.util.Calendar dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }


    /**
     * Gets the dateValue value for this FlowElementReferenceOrValue.
     * 
     * @return dateValue
     */
    public java.util.Date getDateValue() {
        return dateValue;
    }


    /**
     * Sets the dateValue value for this FlowElementReferenceOrValue.
     * 
     * @param dateValue
     */
    public void setDateValue(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }


    /**
     * Gets the elementReference value for this FlowElementReferenceOrValue.
     * 
     * @return elementReference
     */
    public java.lang.String getElementReference() {
        return elementReference;
    }


    /**
     * Sets the elementReference value for this FlowElementReferenceOrValue.
     * 
     * @param elementReference
     */
    public void setElementReference(java.lang.String elementReference) {
        this.elementReference = elementReference;
    }


    /**
     * Gets the numberValue value for this FlowElementReferenceOrValue.
     * 
     * @return numberValue
     */
    public java.lang.Double getNumberValue() {
        return numberValue;
    }


    /**
     * Sets the numberValue value for this FlowElementReferenceOrValue.
     * 
     * @param numberValue
     */
    public void setNumberValue(java.lang.Double numberValue) {
        this.numberValue = numberValue;
    }


    /**
     * Gets the stringValue value for this FlowElementReferenceOrValue.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this FlowElementReferenceOrValue.
     * 
     * @param stringValue
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowElementReferenceOrValue)) return false;
        FlowElementReferenceOrValue other = (FlowElementReferenceOrValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.booleanValue==null && other.getBooleanValue()==null) || 
             (this.booleanValue!=null &&
              this.booleanValue.equals(other.getBooleanValue()))) &&
            ((this.dateTimeValue==null && other.getDateTimeValue()==null) || 
             (this.dateTimeValue!=null &&
              this.dateTimeValue.equals(other.getDateTimeValue()))) &&
            ((this.dateValue==null && other.getDateValue()==null) || 
             (this.dateValue!=null &&
              this.dateValue.equals(other.getDateValue()))) &&
            ((this.elementReference==null && other.getElementReference()==null) || 
             (this.elementReference!=null &&
              this.elementReference.equals(other.getElementReference()))) &&
            ((this.numberValue==null && other.getNumberValue()==null) || 
             (this.numberValue!=null &&
              this.numberValue.equals(other.getNumberValue()))) &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue())));
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
        if (getBooleanValue() != null) {
            _hashCode += getBooleanValue().hashCode();
        }
        if (getDateTimeValue() != null) {
            _hashCode += getDateTimeValue().hashCode();
        }
        if (getDateValue() != null) {
            _hashCode += getDateValue().hashCode();
        }
        if (getElementReference() != null) {
            _hashCode += getElementReference().hashCode();
        }
        if (getNumberValue() != null) {
            _hashCode += getNumberValue().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowElementReferenceOrValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowElementReferenceOrValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dateTimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "elementReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "stringValue"));
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
