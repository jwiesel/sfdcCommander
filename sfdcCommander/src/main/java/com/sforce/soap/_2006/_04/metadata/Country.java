/**
 * Country.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Country  implements java.io.Serializable {
    private boolean active;

    private java.lang.String integrationValue;

    private java.lang.String isoCode;

    private java.lang.String label;

    private boolean orgDefault;

    private boolean standard;

    private com.sforce.soap._2006._04.metadata.State[] states;

    private boolean visible;

    public Country() {
    }

    public Country(
           boolean active,
           java.lang.String integrationValue,
           java.lang.String isoCode,
           java.lang.String label,
           boolean orgDefault,
           boolean standard,
           com.sforce.soap._2006._04.metadata.State[] states,
           boolean visible) {
           this.active = active;
           this.integrationValue = integrationValue;
           this.isoCode = isoCode;
           this.label = label;
           this.orgDefault = orgDefault;
           this.standard = standard;
           this.states = states;
           this.visible = visible;
    }


    /**
     * Gets the active value for this Country.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Country.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the integrationValue value for this Country.
     * 
     * @return integrationValue
     */
    public java.lang.String getIntegrationValue() {
        return integrationValue;
    }


    /**
     * Sets the integrationValue value for this Country.
     * 
     * @param integrationValue
     */
    public void setIntegrationValue(java.lang.String integrationValue) {
        this.integrationValue = integrationValue;
    }


    /**
     * Gets the isoCode value for this Country.
     * 
     * @return isoCode
     */
    public java.lang.String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this Country.
     * 
     * @param isoCode
     */
    public void setIsoCode(java.lang.String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the label value for this Country.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Country.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the orgDefault value for this Country.
     * 
     * @return orgDefault
     */
    public boolean isOrgDefault() {
        return orgDefault;
    }


    /**
     * Sets the orgDefault value for this Country.
     * 
     * @param orgDefault
     */
    public void setOrgDefault(boolean orgDefault) {
        this.orgDefault = orgDefault;
    }


    /**
     * Gets the standard value for this Country.
     * 
     * @return standard
     */
    public boolean isStandard() {
        return standard;
    }


    /**
     * Sets the standard value for this Country.
     * 
     * @param standard
     */
    public void setStandard(boolean standard) {
        this.standard = standard;
    }


    /**
     * Gets the states value for this Country.
     * 
     * @return states
     */
    public com.sforce.soap._2006._04.metadata.State[] getStates() {
        return states;
    }


    /**
     * Sets the states value for this Country.
     * 
     * @param states
     */
    public void setStates(com.sforce.soap._2006._04.metadata.State[] states) {
        this.states = states;
    }

    public com.sforce.soap._2006._04.metadata.State getStates(int i) {
        return this.states[i];
    }

    public void setStates(int i, com.sforce.soap._2006._04.metadata.State _value) {
        this.states[i] = _value;
    }


    /**
     * Gets the visible value for this Country.
     * 
     * @return visible
     */
    public boolean isVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this Country.
     * 
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Country)) return false;
        Country other = (Country) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.integrationValue==null && other.getIntegrationValue()==null) || 
             (this.integrationValue!=null &&
              this.integrationValue.equals(other.getIntegrationValue()))) &&
            ((this.isoCode==null && other.getIsoCode()==null) || 
             (this.isoCode!=null &&
              this.isoCode.equals(other.getIsoCode()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            this.orgDefault == other.isOrgDefault() &&
            this.standard == other.isStandard() &&
            ((this.states==null && other.getStates()==null) || 
             (this.states!=null &&
              java.util.Arrays.equals(this.states, other.getStates()))) &&
            this.visible == other.isVisible();
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
        if (getIntegrationValue() != null) {
            _hashCode += getIntegrationValue().hashCode();
        }
        if (getIsoCode() != null) {
            _hashCode += getIsoCode().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        _hashCode += (isOrgDefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStandard() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isVisible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Country.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Country"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "integrationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "orgDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "standard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("states");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "states"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "State"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "visible"));
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
