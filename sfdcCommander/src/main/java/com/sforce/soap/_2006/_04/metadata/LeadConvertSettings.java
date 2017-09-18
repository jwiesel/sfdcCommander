/**
 * LeadConvertSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LeadConvertSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean allowOwnerChange;

    private com.sforce.soap._2006._04.metadata.ObjectMapping[] objectMapping;

    private com.sforce.soap._2006._04.metadata.VisibleOrRequired opportunityCreationOptions;

    public LeadConvertSettings() {
    }

    public LeadConvertSettings(
           java.lang.String fullName,
           java.lang.Boolean allowOwnerChange,
           com.sforce.soap._2006._04.metadata.ObjectMapping[] objectMapping,
           com.sforce.soap._2006._04.metadata.VisibleOrRequired opportunityCreationOptions) {
        super(
            fullName);
        this.allowOwnerChange = allowOwnerChange;
        this.objectMapping = objectMapping;
        this.opportunityCreationOptions = opportunityCreationOptions;
    }


    /**
     * Gets the allowOwnerChange value for this LeadConvertSettings.
     * 
     * @return allowOwnerChange
     */
    public java.lang.Boolean getAllowOwnerChange() {
        return allowOwnerChange;
    }


    /**
     * Sets the allowOwnerChange value for this LeadConvertSettings.
     * 
     * @param allowOwnerChange
     */
    public void setAllowOwnerChange(java.lang.Boolean allowOwnerChange) {
        this.allowOwnerChange = allowOwnerChange;
    }


    /**
     * Gets the objectMapping value for this LeadConvertSettings.
     * 
     * @return objectMapping
     */
    public com.sforce.soap._2006._04.metadata.ObjectMapping[] getObjectMapping() {
        return objectMapping;
    }


    /**
     * Sets the objectMapping value for this LeadConvertSettings.
     * 
     * @param objectMapping
     */
    public void setObjectMapping(com.sforce.soap._2006._04.metadata.ObjectMapping[] objectMapping) {
        this.objectMapping = objectMapping;
    }

    public com.sforce.soap._2006._04.metadata.ObjectMapping getObjectMapping(int i) {
        return this.objectMapping[i];
    }

    public void setObjectMapping(int i, com.sforce.soap._2006._04.metadata.ObjectMapping _value) {
        this.objectMapping[i] = _value;
    }


    /**
     * Gets the opportunityCreationOptions value for this LeadConvertSettings.
     * 
     * @return opportunityCreationOptions
     */
    public com.sforce.soap._2006._04.metadata.VisibleOrRequired getOpportunityCreationOptions() {
        return opportunityCreationOptions;
    }


    /**
     * Sets the opportunityCreationOptions value for this LeadConvertSettings.
     * 
     * @param opportunityCreationOptions
     */
    public void setOpportunityCreationOptions(com.sforce.soap._2006._04.metadata.VisibleOrRequired opportunityCreationOptions) {
        this.opportunityCreationOptions = opportunityCreationOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LeadConvertSettings)) return false;
        LeadConvertSettings other = (LeadConvertSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowOwnerChange==null && other.getAllowOwnerChange()==null) || 
             (this.allowOwnerChange!=null &&
              this.allowOwnerChange.equals(other.getAllowOwnerChange()))) &&
            ((this.objectMapping==null && other.getObjectMapping()==null) || 
             (this.objectMapping!=null &&
              java.util.Arrays.equals(this.objectMapping, other.getObjectMapping()))) &&
            ((this.opportunityCreationOptions==null && other.getOpportunityCreationOptions()==null) || 
             (this.opportunityCreationOptions!=null &&
              this.opportunityCreationOptions.equals(other.getOpportunityCreationOptions())));
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
        if (getAllowOwnerChange() != null) {
            _hashCode += getAllowOwnerChange().hashCode();
        }
        if (getObjectMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpportunityCreationOptions() != null) {
            _hashCode += getOpportunityCreationOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LeadConvertSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LeadConvertSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOwnerChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowOwnerChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "objectMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityCreationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityCreationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "VisibleOrRequired"));
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
