/**
 * NameCaseValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class NameCaseValue  implements java.io.Serializable {
    private com.sforce.soap.partner.Article article;

    private com.sforce.soap.partner.CaseType caseType;

    private com.sforce.soap.partner.GrammaticalNumber number;

    private com.sforce.soap.partner.Possessive possessive;

    private java.lang.String value;

    public NameCaseValue() {
    }

    public NameCaseValue(
           com.sforce.soap.partner.Article article,
           com.sforce.soap.partner.CaseType caseType,
           com.sforce.soap.partner.GrammaticalNumber number,
           com.sforce.soap.partner.Possessive possessive,
           java.lang.String value) {
           this.article = article;
           this.caseType = caseType;
           this.number = number;
           this.possessive = possessive;
           this.value = value;
    }


    /**
     * Gets the article value for this NameCaseValue.
     * 
     * @return article
     */
    public com.sforce.soap.partner.Article getArticle() {
        return article;
    }


    /**
     * Sets the article value for this NameCaseValue.
     * 
     * @param article
     */
    public void setArticle(com.sforce.soap.partner.Article article) {
        this.article = article;
    }


    /**
     * Gets the caseType value for this NameCaseValue.
     * 
     * @return caseType
     */
    public com.sforce.soap.partner.CaseType getCaseType() {
        return caseType;
    }


    /**
     * Sets the caseType value for this NameCaseValue.
     * 
     * @param caseType
     */
    public void setCaseType(com.sforce.soap.partner.CaseType caseType) {
        this.caseType = caseType;
    }


    /**
     * Gets the number value for this NameCaseValue.
     * 
     * @return number
     */
    public com.sforce.soap.partner.GrammaticalNumber getNumber() {
        return number;
    }


    /**
     * Sets the number value for this NameCaseValue.
     * 
     * @param number
     */
    public void setNumber(com.sforce.soap.partner.GrammaticalNumber number) {
        this.number = number;
    }


    /**
     * Gets the possessive value for this NameCaseValue.
     * 
     * @return possessive
     */
    public com.sforce.soap.partner.Possessive getPossessive() {
        return possessive;
    }


    /**
     * Sets the possessive value for this NameCaseValue.
     * 
     * @param possessive
     */
    public void setPossessive(com.sforce.soap.partner.Possessive possessive) {
        this.possessive = possessive;
    }


    /**
     * Gets the value value for this NameCaseValue.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this NameCaseValue.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameCaseValue)) return false;
        NameCaseValue other = (NameCaseValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.article==null && other.getArticle()==null) || 
             (this.article!=null &&
              this.article.equals(other.getArticle()))) &&
            ((this.caseType==null && other.getCaseType()==null) || 
             (this.caseType!=null &&
              this.caseType.equals(other.getCaseType()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.possessive==null && other.getPossessive()==null) || 
             (this.possessive!=null &&
              this.possessive.equals(other.getPossessive()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getArticle() != null) {
            _hashCode += getArticle().hashCode();
        }
        if (getCaseType() != null) {
            _hashCode += getCaseType().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPossessive() != null) {
            _hashCode += getPossessive().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameCaseValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NameCaseValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "article"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Article"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "caseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "CaseType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GrammaticalNumber"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possessive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "possessive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Possessive"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "value"));
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
