/**
 * DescribePathAssistantStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribePathAssistantStep  implements java.io.Serializable {
    private boolean closed;

    private boolean converted;

    private com.sforce.soap.partner.DescribePathAssistantField[] fields;

    private java.lang.String info;

    private com.sforce.soap.partner.DescribeLayoutSection layoutSection;

    private java.lang.String picklistLabel;

    private java.lang.String picklistValue;

    private boolean won;

    public DescribePathAssistantStep() {
    }

    public DescribePathAssistantStep(
           boolean closed,
           boolean converted,
           com.sforce.soap.partner.DescribePathAssistantField[] fields,
           java.lang.String info,
           com.sforce.soap.partner.DescribeLayoutSection layoutSection,
           java.lang.String picklistLabel,
           java.lang.String picklistValue,
           boolean won) {
           this.closed = closed;
           this.converted = converted;
           this.fields = fields;
           this.info = info;
           this.layoutSection = layoutSection;
           this.picklistLabel = picklistLabel;
           this.picklistValue = picklistValue;
           this.won = won;
    }


    /**
     * Gets the closed value for this DescribePathAssistantStep.
     * 
     * @return closed
     */
    public boolean isClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this DescribePathAssistantStep.
     * 
     * @param closed
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }


    /**
     * Gets the converted value for this DescribePathAssistantStep.
     * 
     * @return converted
     */
    public boolean isConverted() {
        return converted;
    }


    /**
     * Sets the converted value for this DescribePathAssistantStep.
     * 
     * @param converted
     */
    public void setConverted(boolean converted) {
        this.converted = converted;
    }


    /**
     * Gets the fields value for this DescribePathAssistantStep.
     * 
     * @return fields
     */
    public com.sforce.soap.partner.DescribePathAssistantField[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this DescribePathAssistantStep.
     * 
     * @param fields
     */
    public void setFields(com.sforce.soap.partner.DescribePathAssistantField[] fields) {
        this.fields = fields;
    }

    public com.sforce.soap.partner.DescribePathAssistantField getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.sforce.soap.partner.DescribePathAssistantField _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the info value for this DescribePathAssistantStep.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this DescribePathAssistantStep.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the layoutSection value for this DescribePathAssistantStep.
     * 
     * @return layoutSection
     */
    public com.sforce.soap.partner.DescribeLayoutSection getLayoutSection() {
        return layoutSection;
    }


    /**
     * Sets the layoutSection value for this DescribePathAssistantStep.
     * 
     * @param layoutSection
     */
    public void setLayoutSection(com.sforce.soap.partner.DescribeLayoutSection layoutSection) {
        this.layoutSection = layoutSection;
    }


    /**
     * Gets the picklistLabel value for this DescribePathAssistantStep.
     * 
     * @return picklistLabel
     */
    public java.lang.String getPicklistLabel() {
        return picklistLabel;
    }


    /**
     * Sets the picklistLabel value for this DescribePathAssistantStep.
     * 
     * @param picklistLabel
     */
    public void setPicklistLabel(java.lang.String picklistLabel) {
        this.picklistLabel = picklistLabel;
    }


    /**
     * Gets the picklistValue value for this DescribePathAssistantStep.
     * 
     * @return picklistValue
     */
    public java.lang.String getPicklistValue() {
        return picklistValue;
    }


    /**
     * Sets the picklistValue value for this DescribePathAssistantStep.
     * 
     * @param picklistValue
     */
    public void setPicklistValue(java.lang.String picklistValue) {
        this.picklistValue = picklistValue;
    }


    /**
     * Gets the won value for this DescribePathAssistantStep.
     * 
     * @return won
     */
    public boolean isWon() {
        return won;
    }


    /**
     * Sets the won value for this DescribePathAssistantStep.
     * 
     * @param won
     */
    public void setWon(boolean won) {
        this.won = won;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribePathAssistantStep)) return false;
        DescribePathAssistantStep other = (DescribePathAssistantStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.closed == other.isClosed() &&
            this.converted == other.isConverted() &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.layoutSection==null && other.getLayoutSection()==null) || 
             (this.layoutSection!=null &&
              this.layoutSection.equals(other.getLayoutSection()))) &&
            ((this.picklistLabel==null && other.getPicklistLabel()==null) || 
             (this.picklistLabel!=null &&
              this.picklistLabel.equals(other.getPicklistLabel()))) &&
            ((this.picklistValue==null && other.getPicklistValue()==null) || 
             (this.picklistValue!=null &&
              this.picklistValue.equals(other.getPicklistValue()))) &&
            this.won == other.isWon();
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
        _hashCode += (isClosed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConverted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getLayoutSection() != null) {
            _hashCode += getLayoutSection().hashCode();
        }
        if (getPicklistLabel() != null) {
            _hashCode += getPicklistLabel().hashCode();
        }
        if (getPicklistValue() != null) {
            _hashCode += getPicklistValue().hashCode();
        }
        _hashCode += (isWon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribePathAssistantStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribePathAssistantStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "converted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribePathAssistantField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutSection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "layoutSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutSection"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "picklistLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "picklistValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "won"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
