/**
 * ValueSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ValueSet  implements java.io.Serializable {
    private java.lang.String controllingField;

    private java.lang.Boolean restricted;

    private com.sforce.soap._2006._04.metadata.ValueSetValuesDefinition valueSetDefinition;

    private java.lang.String valueSetName;

    private com.sforce.soap._2006._04.metadata.ValueSettings[] valueSettings;

    public ValueSet() {
    }

    public ValueSet(
           java.lang.String controllingField,
           java.lang.Boolean restricted,
           com.sforce.soap._2006._04.metadata.ValueSetValuesDefinition valueSetDefinition,
           java.lang.String valueSetName,
           com.sforce.soap._2006._04.metadata.ValueSettings[] valueSettings) {
           this.controllingField = controllingField;
           this.restricted = restricted;
           this.valueSetDefinition = valueSetDefinition;
           this.valueSetName = valueSetName;
           this.valueSettings = valueSettings;
    }


    /**
     * Gets the controllingField value for this ValueSet.
     * 
     * @return controllingField
     */
    public java.lang.String getControllingField() {
        return controllingField;
    }


    /**
     * Sets the controllingField value for this ValueSet.
     * 
     * @param controllingField
     */
    public void setControllingField(java.lang.String controllingField) {
        this.controllingField = controllingField;
    }


    /**
     * Gets the restricted value for this ValueSet.
     * 
     * @return restricted
     */
    public java.lang.Boolean getRestricted() {
        return restricted;
    }


    /**
     * Sets the restricted value for this ValueSet.
     * 
     * @param restricted
     */
    public void setRestricted(java.lang.Boolean restricted) {
        this.restricted = restricted;
    }


    /**
     * Gets the valueSetDefinition value for this ValueSet.
     * 
     * @return valueSetDefinition
     */
    public com.sforce.soap._2006._04.metadata.ValueSetValuesDefinition getValueSetDefinition() {
        return valueSetDefinition;
    }


    /**
     * Sets the valueSetDefinition value for this ValueSet.
     * 
     * @param valueSetDefinition
     */
    public void setValueSetDefinition(com.sforce.soap._2006._04.metadata.ValueSetValuesDefinition valueSetDefinition) {
        this.valueSetDefinition = valueSetDefinition;
    }


    /**
     * Gets the valueSetName value for this ValueSet.
     * 
     * @return valueSetName
     */
    public java.lang.String getValueSetName() {
        return valueSetName;
    }


    /**
     * Sets the valueSetName value for this ValueSet.
     * 
     * @param valueSetName
     */
    public void setValueSetName(java.lang.String valueSetName) {
        this.valueSetName = valueSetName;
    }


    /**
     * Gets the valueSettings value for this ValueSet.
     * 
     * @return valueSettings
     */
    public com.sforce.soap._2006._04.metadata.ValueSettings[] getValueSettings() {
        return valueSettings;
    }


    /**
     * Sets the valueSettings value for this ValueSet.
     * 
     * @param valueSettings
     */
    public void setValueSettings(com.sforce.soap._2006._04.metadata.ValueSettings[] valueSettings) {
        this.valueSettings = valueSettings;
    }

    public com.sforce.soap._2006._04.metadata.ValueSettings getValueSettings(int i) {
        return this.valueSettings[i];
    }

    public void setValueSettings(int i, com.sforce.soap._2006._04.metadata.ValueSettings _value) {
        this.valueSettings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueSet)) return false;
        ValueSet other = (ValueSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.controllingField==null && other.getControllingField()==null) || 
             (this.controllingField!=null &&
              this.controllingField.equals(other.getControllingField()))) &&
            ((this.restricted==null && other.getRestricted()==null) || 
             (this.restricted!=null &&
              this.restricted.equals(other.getRestricted()))) &&
            ((this.valueSetDefinition==null && other.getValueSetDefinition()==null) || 
             (this.valueSetDefinition!=null &&
              this.valueSetDefinition.equals(other.getValueSetDefinition()))) &&
            ((this.valueSetName==null && other.getValueSetName()==null) || 
             (this.valueSetName!=null &&
              this.valueSetName.equals(other.getValueSetName()))) &&
            ((this.valueSettings==null && other.getValueSettings()==null) || 
             (this.valueSettings!=null &&
              java.util.Arrays.equals(this.valueSettings, other.getValueSettings())));
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
        if (getControllingField() != null) {
            _hashCode += getControllingField().hashCode();
        }
        if (getRestricted() != null) {
            _hashCode += getRestricted().hashCode();
        }
        if (getValueSetDefinition() != null) {
            _hashCode += getValueSetDefinition().hashCode();
        }
        if (getValueSetName() != null) {
            _hashCode += getValueSetName().hashCode();
        }
        if (getValueSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueSettings(), i);
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
        new org.apache.axis.description.TypeDesc(ValueSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllingField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "controllingField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restricted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "restricted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueSetDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueSetValuesDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueSetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueSettings"));
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
