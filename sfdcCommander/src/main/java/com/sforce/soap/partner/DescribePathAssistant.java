/**
 * DescribePathAssistant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribePathAssistant  implements java.io.Serializable {
    private boolean active;

    private java.lang.String apiName;

    private java.lang.String label;

    private java.lang.String pathPicklistField;

    private com.sforce.soap.partner.PicklistForRecordType[] picklistsForRecordType;

    private java.lang.String recordTypeId;

    private com.sforce.soap.partner.DescribePathAssistantStep[] steps;

    public DescribePathAssistant() {
    }

    public DescribePathAssistant(
           boolean active,
           java.lang.String apiName,
           java.lang.String label,
           java.lang.String pathPicklistField,
           com.sforce.soap.partner.PicklistForRecordType[] picklistsForRecordType,
           java.lang.String recordTypeId,
           com.sforce.soap.partner.DescribePathAssistantStep[] steps) {
           this.active = active;
           this.apiName = apiName;
           this.label = label;
           this.pathPicklistField = pathPicklistField;
           this.picklistsForRecordType = picklistsForRecordType;
           this.recordTypeId = recordTypeId;
           this.steps = steps;
    }


    /**
     * Gets the active value for this DescribePathAssistant.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this DescribePathAssistant.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the apiName value for this DescribePathAssistant.
     * 
     * @return apiName
     */
    public java.lang.String getApiName() {
        return apiName;
    }


    /**
     * Sets the apiName value for this DescribePathAssistant.
     * 
     * @param apiName
     */
    public void setApiName(java.lang.String apiName) {
        this.apiName = apiName;
    }


    /**
     * Gets the label value for this DescribePathAssistant.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribePathAssistant.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the pathPicklistField value for this DescribePathAssistant.
     * 
     * @return pathPicklistField
     */
    public java.lang.String getPathPicklistField() {
        return pathPicklistField;
    }


    /**
     * Sets the pathPicklistField value for this DescribePathAssistant.
     * 
     * @param pathPicklistField
     */
    public void setPathPicklistField(java.lang.String pathPicklistField) {
        this.pathPicklistField = pathPicklistField;
    }


    /**
     * Gets the picklistsForRecordType value for this DescribePathAssistant.
     * 
     * @return picklistsForRecordType
     */
    public com.sforce.soap.partner.PicklistForRecordType[] getPicklistsForRecordType() {
        return picklistsForRecordType;
    }


    /**
     * Sets the picklistsForRecordType value for this DescribePathAssistant.
     * 
     * @param picklistsForRecordType
     */
    public void setPicklistsForRecordType(com.sforce.soap.partner.PicklistForRecordType[] picklistsForRecordType) {
        this.picklistsForRecordType = picklistsForRecordType;
    }

    public com.sforce.soap.partner.PicklistForRecordType getPicklistsForRecordType(int i) {
        return this.picklistsForRecordType[i];
    }

    public void setPicklistsForRecordType(int i, com.sforce.soap.partner.PicklistForRecordType _value) {
        this.picklistsForRecordType[i] = _value;
    }


    /**
     * Gets the recordTypeId value for this DescribePathAssistant.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this DescribePathAssistant.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the steps value for this DescribePathAssistant.
     * 
     * @return steps
     */
    public com.sforce.soap.partner.DescribePathAssistantStep[] getSteps() {
        return steps;
    }


    /**
     * Sets the steps value for this DescribePathAssistant.
     * 
     * @param steps
     */
    public void setSteps(com.sforce.soap.partner.DescribePathAssistantStep[] steps) {
        this.steps = steps;
    }

    public com.sforce.soap.partner.DescribePathAssistantStep getSteps(int i) {
        return this.steps[i];
    }

    public void setSteps(int i, com.sforce.soap.partner.DescribePathAssistantStep _value) {
        this.steps[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribePathAssistant)) return false;
        DescribePathAssistant other = (DescribePathAssistant) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.apiName==null && other.getApiName()==null) || 
             (this.apiName!=null &&
              this.apiName.equals(other.getApiName()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.pathPicklistField==null && other.getPathPicklistField()==null) || 
             (this.pathPicklistField!=null &&
              this.pathPicklistField.equals(other.getPathPicklistField()))) &&
            ((this.picklistsForRecordType==null && other.getPicklistsForRecordType()==null) || 
             (this.picklistsForRecordType!=null &&
              java.util.Arrays.equals(this.picklistsForRecordType, other.getPicklistsForRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.steps==null && other.getSteps()==null) || 
             (this.steps!=null &&
              java.util.Arrays.equals(this.steps, other.getSteps())));
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
        if (getApiName() != null) {
            _hashCode += getApiName().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getPathPicklistField() != null) {
            _hashCode += getPathPicklistField().hashCode();
        }
        if (getPicklistsForRecordType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicklistsForRecordType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicklistsForRecordType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSteps(), i);
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
        new org.apache.axis.description.TypeDesc(DescribePathAssistant.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribePathAssistant"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "apiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathPicklistField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "pathPicklistField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistsForRecordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "picklistsForRecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PicklistForRecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "steps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribePathAssistantStep"));
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
