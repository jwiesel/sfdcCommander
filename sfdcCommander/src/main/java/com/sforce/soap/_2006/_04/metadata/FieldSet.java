/**
 * FieldSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FieldSet  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FieldSetItem[] availableFields;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.FieldSetItem[] displayedFields;

    private java.lang.String label;

    public FieldSet() {
    }

    public FieldSet(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.FieldSetItem[] availableFields,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.FieldSetItem[] displayedFields,
           java.lang.String label) {
        super(
            fullName);
        this.availableFields = availableFields;
        this.description = description;
        this.displayedFields = displayedFields;
        this.label = label;
    }


    /**
     * Gets the availableFields value for this FieldSet.
     * 
     * @return availableFields
     */
    public com.sforce.soap._2006._04.metadata.FieldSetItem[] getAvailableFields() {
        return availableFields;
    }


    /**
     * Sets the availableFields value for this FieldSet.
     * 
     * @param availableFields
     */
    public void setAvailableFields(com.sforce.soap._2006._04.metadata.FieldSetItem[] availableFields) {
        this.availableFields = availableFields;
    }

    public com.sforce.soap._2006._04.metadata.FieldSetItem getAvailableFields(int i) {
        return this.availableFields[i];
    }

    public void setAvailableFields(int i, com.sforce.soap._2006._04.metadata.FieldSetItem _value) {
        this.availableFields[i] = _value;
    }


    /**
     * Gets the description value for this FieldSet.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FieldSet.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayedFields value for this FieldSet.
     * 
     * @return displayedFields
     */
    public com.sforce.soap._2006._04.metadata.FieldSetItem[] getDisplayedFields() {
        return displayedFields;
    }


    /**
     * Sets the displayedFields value for this FieldSet.
     * 
     * @param displayedFields
     */
    public void setDisplayedFields(com.sforce.soap._2006._04.metadata.FieldSetItem[] displayedFields) {
        this.displayedFields = displayedFields;
    }

    public com.sforce.soap._2006._04.metadata.FieldSetItem getDisplayedFields(int i) {
        return this.displayedFields[i];
    }

    public void setDisplayedFields(int i, com.sforce.soap._2006._04.metadata.FieldSetItem _value) {
        this.displayedFields[i] = _value;
    }


    /**
     * Gets the label value for this FieldSet.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this FieldSet.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldSet)) return false;
        FieldSet other = (FieldSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availableFields==null && other.getAvailableFields()==null) || 
             (this.availableFields!=null &&
              java.util.Arrays.equals(this.availableFields, other.getAvailableFields()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayedFields==null && other.getDisplayedFields()==null) || 
             (this.displayedFields!=null &&
              java.util.Arrays.equals(this.displayedFields, other.getDisplayedFields()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel())));
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
        if (getAvailableFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayedFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayedFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayedFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "availableFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldSetItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayedFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayedFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldSetItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
