/**
 * ValueTypeField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ValueTypeField  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ValueTypeField[] fields;

    private java.lang.String[] foreignKeyDomain;

    private boolean isForeignKey;

    private boolean isNameField;

    private int minOccurs;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.PicklistEntry[] picklistValues;

    private java.lang.String soapType;

    private boolean valueRequired;

    public ValueTypeField() {
    }

    public ValueTypeField(
           com.sforce.soap._2006._04.metadata.ValueTypeField[] fields,
           java.lang.String[] foreignKeyDomain,
           boolean isForeignKey,
           boolean isNameField,
           int minOccurs,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.PicklistEntry[] picklistValues,
           java.lang.String soapType,
           boolean valueRequired) {
           this.fields = fields;
           this.foreignKeyDomain = foreignKeyDomain;
           this.isForeignKey = isForeignKey;
           this.isNameField = isNameField;
           this.minOccurs = minOccurs;
           this.name = name;
           this.picklistValues = picklistValues;
           this.soapType = soapType;
           this.valueRequired = valueRequired;
    }


    /**
     * Gets the fields value for this ValueTypeField.
     * 
     * @return fields
     */
    public com.sforce.soap._2006._04.metadata.ValueTypeField[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this ValueTypeField.
     * 
     * @param fields
     */
    public void setFields(com.sforce.soap._2006._04.metadata.ValueTypeField[] fields) {
        this.fields = fields;
    }

    public com.sforce.soap._2006._04.metadata.ValueTypeField getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.sforce.soap._2006._04.metadata.ValueTypeField _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the foreignKeyDomain value for this ValueTypeField.
     * 
     * @return foreignKeyDomain
     */
    public java.lang.String[] getForeignKeyDomain() {
        return foreignKeyDomain;
    }


    /**
     * Sets the foreignKeyDomain value for this ValueTypeField.
     * 
     * @param foreignKeyDomain
     */
    public void setForeignKeyDomain(java.lang.String[] foreignKeyDomain) {
        this.foreignKeyDomain = foreignKeyDomain;
    }

    public java.lang.String getForeignKeyDomain(int i) {
        return this.foreignKeyDomain[i];
    }

    public void setForeignKeyDomain(int i, java.lang.String _value) {
        this.foreignKeyDomain[i] = _value;
    }


    /**
     * Gets the isForeignKey value for this ValueTypeField.
     * 
     * @return isForeignKey
     */
    public boolean isIsForeignKey() {
        return isForeignKey;
    }


    /**
     * Sets the isForeignKey value for this ValueTypeField.
     * 
     * @param isForeignKey
     */
    public void setIsForeignKey(boolean isForeignKey) {
        this.isForeignKey = isForeignKey;
    }


    /**
     * Gets the isNameField value for this ValueTypeField.
     * 
     * @return isNameField
     */
    public boolean isIsNameField() {
        return isNameField;
    }


    /**
     * Sets the isNameField value for this ValueTypeField.
     * 
     * @param isNameField
     */
    public void setIsNameField(boolean isNameField) {
        this.isNameField = isNameField;
    }


    /**
     * Gets the minOccurs value for this ValueTypeField.
     * 
     * @return minOccurs
     */
    public int getMinOccurs() {
        return minOccurs;
    }


    /**
     * Sets the minOccurs value for this ValueTypeField.
     * 
     * @param minOccurs
     */
    public void setMinOccurs(int minOccurs) {
        this.minOccurs = minOccurs;
    }


    /**
     * Gets the name value for this ValueTypeField.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ValueTypeField.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the picklistValues value for this ValueTypeField.
     * 
     * @return picklistValues
     */
    public com.sforce.soap._2006._04.metadata.PicklistEntry[] getPicklistValues() {
        return picklistValues;
    }


    /**
     * Sets the picklistValues value for this ValueTypeField.
     * 
     * @param picklistValues
     */
    public void setPicklistValues(com.sforce.soap._2006._04.metadata.PicklistEntry[] picklistValues) {
        this.picklistValues = picklistValues;
    }

    public com.sforce.soap._2006._04.metadata.PicklistEntry getPicklistValues(int i) {
        return this.picklistValues[i];
    }

    public void setPicklistValues(int i, com.sforce.soap._2006._04.metadata.PicklistEntry _value) {
        this.picklistValues[i] = _value;
    }


    /**
     * Gets the soapType value for this ValueTypeField.
     * 
     * @return soapType
     */
    public java.lang.String getSoapType() {
        return soapType;
    }


    /**
     * Sets the soapType value for this ValueTypeField.
     * 
     * @param soapType
     */
    public void setSoapType(java.lang.String soapType) {
        this.soapType = soapType;
    }


    /**
     * Gets the valueRequired value for this ValueTypeField.
     * 
     * @return valueRequired
     */
    public boolean isValueRequired() {
        return valueRequired;
    }


    /**
     * Sets the valueRequired value for this ValueTypeField.
     * 
     * @param valueRequired
     */
    public void setValueRequired(boolean valueRequired) {
        this.valueRequired = valueRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueTypeField)) return false;
        ValueTypeField other = (ValueTypeField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.foreignKeyDomain==null && other.getForeignKeyDomain()==null) || 
             (this.foreignKeyDomain!=null &&
              java.util.Arrays.equals(this.foreignKeyDomain, other.getForeignKeyDomain()))) &&
            this.isForeignKey == other.isIsForeignKey() &&
            this.isNameField == other.isIsNameField() &&
            this.minOccurs == other.getMinOccurs() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.picklistValues==null && other.getPicklistValues()==null) || 
             (this.picklistValues!=null &&
              java.util.Arrays.equals(this.picklistValues, other.getPicklistValues()))) &&
            ((this.soapType==null && other.getSoapType()==null) || 
             (this.soapType!=null &&
              this.soapType.equals(other.getSoapType()))) &&
            this.valueRequired == other.isValueRequired();
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
        if (getForeignKeyDomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForeignKeyDomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForeignKeyDomain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsForeignKey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsNameField() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMinOccurs();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPicklistValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicklistValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicklistValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoapType() != null) {
            _hashCode += getSoapType().hashCode();
        }
        _hashCode += (isValueRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValueTypeField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueTypeField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValueTypeField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignKeyDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "foreignKeyDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isForeignKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isForeignKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNameField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isNameField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minOccurs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "minOccurs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklistValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PicklistEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soapType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "soapType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueRequired"));
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
