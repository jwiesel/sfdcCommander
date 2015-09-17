/**
 * DescribeNounResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeNounResult  implements java.io.Serializable {
    private com.sforce.soap.partner.NameCaseValue[] caseValues;

    private java.lang.String developerName;

    private com.sforce.soap.partner.Gender gender;

    private java.lang.String name;

    private java.lang.String pluralAlias;

    private com.sforce.soap.partner.StartsWith startsWith;

    public DescribeNounResult() {
    }

    public DescribeNounResult(
           com.sforce.soap.partner.NameCaseValue[] caseValues,
           java.lang.String developerName,
           com.sforce.soap.partner.Gender gender,
           java.lang.String name,
           java.lang.String pluralAlias,
           com.sforce.soap.partner.StartsWith startsWith) {
           this.caseValues = caseValues;
           this.developerName = developerName;
           this.gender = gender;
           this.name = name;
           this.pluralAlias = pluralAlias;
           this.startsWith = startsWith;
    }


    /**
     * Gets the caseValues value for this DescribeNounResult.
     * 
     * @return caseValues
     */
    public com.sforce.soap.partner.NameCaseValue[] getCaseValues() {
        return caseValues;
    }


    /**
     * Sets the caseValues value for this DescribeNounResult.
     * 
     * @param caseValues
     */
    public void setCaseValues(com.sforce.soap.partner.NameCaseValue[] caseValues) {
        this.caseValues = caseValues;
    }

    public com.sforce.soap.partner.NameCaseValue getCaseValues(int i) {
        return this.caseValues[i];
    }

    public void setCaseValues(int i, com.sforce.soap.partner.NameCaseValue _value) {
        this.caseValues[i] = _value;
    }


    /**
     * Gets the developerName value for this DescribeNounResult.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this DescribeNounResult.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the gender value for this DescribeNounResult.
     * 
     * @return gender
     */
    public com.sforce.soap.partner.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this DescribeNounResult.
     * 
     * @param gender
     */
    public void setGender(com.sforce.soap.partner.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the name value for this DescribeNounResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeNounResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pluralAlias value for this DescribeNounResult.
     * 
     * @return pluralAlias
     */
    public java.lang.String getPluralAlias() {
        return pluralAlias;
    }


    /**
     * Sets the pluralAlias value for this DescribeNounResult.
     * 
     * @param pluralAlias
     */
    public void setPluralAlias(java.lang.String pluralAlias) {
        this.pluralAlias = pluralAlias;
    }


    /**
     * Gets the startsWith value for this DescribeNounResult.
     * 
     * @return startsWith
     */
    public com.sforce.soap.partner.StartsWith getStartsWith() {
        return startsWith;
    }


    /**
     * Sets the startsWith value for this DescribeNounResult.
     * 
     * @param startsWith
     */
    public void setStartsWith(com.sforce.soap.partner.StartsWith startsWith) {
        this.startsWith = startsWith;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeNounResult)) return false;
        DescribeNounResult other = (DescribeNounResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseValues==null && other.getCaseValues()==null) || 
             (this.caseValues!=null &&
              java.util.Arrays.equals(this.caseValues, other.getCaseValues()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pluralAlias==null && other.getPluralAlias()==null) || 
             (this.pluralAlias!=null &&
              this.pluralAlias.equals(other.getPluralAlias()))) &&
            ((this.startsWith==null && other.getStartsWith()==null) || 
             (this.startsWith!=null &&
              this.startsWith.equals(other.getStartsWith())));
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
        if (getCaseValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPluralAlias() != null) {
            _hashCode += getPluralAlias().hashCode();
        }
        if (getStartsWith() != null) {
            _hashCode += getStartsWith().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeNounResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeNounResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "caseValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NameCaseValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "developerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Gender"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "pluralAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startsWith");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "startsWith"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "StartsWith"));
        elemField.setNillable(true);
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
