/**
 * KnowledgeLanguage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class KnowledgeLanguage  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.String defaultAssignee;

    private com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType defaultAssigneeType;

    private java.lang.String defaultReviewer;

    private com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType defaultReviewerType;

    private java.lang.String name;

    public KnowledgeLanguage() {
    }

    public KnowledgeLanguage(
           java.lang.Boolean active,
           java.lang.String defaultAssignee,
           com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType defaultAssigneeType,
           java.lang.String defaultReviewer,
           com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType defaultReviewerType,
           java.lang.String name) {
           this.active = active;
           this.defaultAssignee = defaultAssignee;
           this.defaultAssigneeType = defaultAssigneeType;
           this.defaultReviewer = defaultReviewer;
           this.defaultReviewerType = defaultReviewerType;
           this.name = name;
    }


    /**
     * Gets the active value for this KnowledgeLanguage.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this KnowledgeLanguage.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the defaultAssignee value for this KnowledgeLanguage.
     * 
     * @return defaultAssignee
     */
    public java.lang.String getDefaultAssignee() {
        return defaultAssignee;
    }


    /**
     * Sets the defaultAssignee value for this KnowledgeLanguage.
     * 
     * @param defaultAssignee
     */
    public void setDefaultAssignee(java.lang.String defaultAssignee) {
        this.defaultAssignee = defaultAssignee;
    }


    /**
     * Gets the defaultAssigneeType value for this KnowledgeLanguage.
     * 
     * @return defaultAssigneeType
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType getDefaultAssigneeType() {
        return defaultAssigneeType;
    }


    /**
     * Sets the defaultAssigneeType value for this KnowledgeLanguage.
     * 
     * @param defaultAssigneeType
     */
    public void setDefaultAssigneeType(com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType defaultAssigneeType) {
        this.defaultAssigneeType = defaultAssigneeType;
    }


    /**
     * Gets the defaultReviewer value for this KnowledgeLanguage.
     * 
     * @return defaultReviewer
     */
    public java.lang.String getDefaultReviewer() {
        return defaultReviewer;
    }


    /**
     * Sets the defaultReviewer value for this KnowledgeLanguage.
     * 
     * @param defaultReviewer
     */
    public void setDefaultReviewer(java.lang.String defaultReviewer) {
        this.defaultReviewer = defaultReviewer;
    }


    /**
     * Gets the defaultReviewerType value for this KnowledgeLanguage.
     * 
     * @return defaultReviewerType
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType getDefaultReviewerType() {
        return defaultReviewerType;
    }


    /**
     * Sets the defaultReviewerType value for this KnowledgeLanguage.
     * 
     * @param defaultReviewerType
     */
    public void setDefaultReviewerType(com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType defaultReviewerType) {
        this.defaultReviewerType = defaultReviewerType;
    }


    /**
     * Gets the name value for this KnowledgeLanguage.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this KnowledgeLanguage.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KnowledgeLanguage)) return false;
        KnowledgeLanguage other = (KnowledgeLanguage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.defaultAssignee==null && other.getDefaultAssignee()==null) || 
             (this.defaultAssignee!=null &&
              this.defaultAssignee.equals(other.getDefaultAssignee()))) &&
            ((this.defaultAssigneeType==null && other.getDefaultAssigneeType()==null) || 
             (this.defaultAssigneeType!=null &&
              this.defaultAssigneeType.equals(other.getDefaultAssigneeType()))) &&
            ((this.defaultReviewer==null && other.getDefaultReviewer()==null) || 
             (this.defaultReviewer!=null &&
              this.defaultReviewer.equals(other.getDefaultReviewer()))) &&
            ((this.defaultReviewerType==null && other.getDefaultReviewerType()==null) || 
             (this.defaultReviewerType!=null &&
              this.defaultReviewerType.equals(other.getDefaultReviewerType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getDefaultAssignee() != null) {
            _hashCode += getDefaultAssignee().hashCode();
        }
        if (getDefaultAssigneeType() != null) {
            _hashCode += getDefaultAssigneeType().hashCode();
        }
        if (getDefaultReviewer() != null) {
            _hashCode += getDefaultReviewer().hashCode();
        }
        if (getDefaultReviewerType() != null) {
            _hashCode += getDefaultReviewerType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KnowledgeLanguage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAssignee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultAssignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAssigneeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultAssigneeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguageLookupValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultReviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReviewerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultReviewerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguageLookupValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
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
