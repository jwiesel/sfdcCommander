/**
 * ObjectNameCaseValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ObjectNameCaseValue  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.Article article;

    private com.sforce.soap._2006._04.metadata.CaseType caseType;

    private java.lang.Boolean plural;

    private com.sforce.soap._2006._04.metadata.Possessive possessive;

    private java.lang.String value;

    public ObjectNameCaseValue() {
    }

    public ObjectNameCaseValue(
           com.sforce.soap._2006._04.metadata.Article article,
           com.sforce.soap._2006._04.metadata.CaseType caseType,
           java.lang.Boolean plural,
           com.sforce.soap._2006._04.metadata.Possessive possessive,
           java.lang.String value) {
           this.article = article;
           this.caseType = caseType;
           this.plural = plural;
           this.possessive = possessive;
           this.value = value;
    }


    /**
     * Gets the article value for this ObjectNameCaseValue.
     * 
     * @return article
     */
    public com.sforce.soap._2006._04.metadata.Article getArticle() {
        return article;
    }


    /**
     * Sets the article value for this ObjectNameCaseValue.
     * 
     * @param article
     */
    public void setArticle(com.sforce.soap._2006._04.metadata.Article article) {
        this.article = article;
    }


    /**
     * Gets the caseType value for this ObjectNameCaseValue.
     * 
     * @return caseType
     */
    public com.sforce.soap._2006._04.metadata.CaseType getCaseType() {
        return caseType;
    }


    /**
     * Sets the caseType value for this ObjectNameCaseValue.
     * 
     * @param caseType
     */
    public void setCaseType(com.sforce.soap._2006._04.metadata.CaseType caseType) {
        this.caseType = caseType;
    }


    /**
     * Gets the plural value for this ObjectNameCaseValue.
     * 
     * @return plural
     */
    public java.lang.Boolean getPlural() {
        return plural;
    }


    /**
     * Sets the plural value for this ObjectNameCaseValue.
     * 
     * @param plural
     */
    public void setPlural(java.lang.Boolean plural) {
        this.plural = plural;
    }


    /**
     * Gets the possessive value for this ObjectNameCaseValue.
     * 
     * @return possessive
     */
    public com.sforce.soap._2006._04.metadata.Possessive getPossessive() {
        return possessive;
    }


    /**
     * Sets the possessive value for this ObjectNameCaseValue.
     * 
     * @param possessive
     */
    public void setPossessive(com.sforce.soap._2006._04.metadata.Possessive possessive) {
        this.possessive = possessive;
    }


    /**
     * Gets the value value for this ObjectNameCaseValue.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ObjectNameCaseValue.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectNameCaseValue)) return false;
        ObjectNameCaseValue other = (ObjectNameCaseValue) obj;
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
            ((this.plural==null && other.getPlural()==null) || 
             (this.plural!=null &&
              this.plural.equals(other.getPlural()))) &&
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
        if (getPlural() != null) {
            _hashCode += getPlural().hashCode();
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
        new org.apache.axis.description.TypeDesc(ObjectNameCaseValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectNameCaseValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Article"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plural");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "plural"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possessive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "possessive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Possessive"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "value"));
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
