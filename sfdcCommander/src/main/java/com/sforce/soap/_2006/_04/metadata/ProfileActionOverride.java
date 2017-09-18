/**
 * ProfileActionOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ProfileActionOverride  implements java.io.Serializable {
    private java.lang.String actionName;

    private java.lang.String content;

    private com.sforce.soap._2006._04.metadata.FormFactor formFactor;

    private java.lang.String pageOrSobjectType;

    private java.lang.String recordType;

    private com.sforce.soap._2006._04.metadata.ActionOverrideType type;

    public ProfileActionOverride() {
    }

    public ProfileActionOverride(
           java.lang.String actionName,
           java.lang.String content,
           com.sforce.soap._2006._04.metadata.FormFactor formFactor,
           java.lang.String pageOrSobjectType,
           java.lang.String recordType,
           com.sforce.soap._2006._04.metadata.ActionOverrideType type) {
           this.actionName = actionName;
           this.content = content;
           this.formFactor = formFactor;
           this.pageOrSobjectType = pageOrSobjectType;
           this.recordType = recordType;
           this.type = type;
    }


    /**
     * Gets the actionName value for this ProfileActionOverride.
     * 
     * @return actionName
     */
    public java.lang.String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this ProfileActionOverride.
     * 
     * @param actionName
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the content value for this ProfileActionOverride.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this ProfileActionOverride.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the formFactor value for this ProfileActionOverride.
     * 
     * @return formFactor
     */
    public com.sforce.soap._2006._04.metadata.FormFactor getFormFactor() {
        return formFactor;
    }


    /**
     * Sets the formFactor value for this ProfileActionOverride.
     * 
     * @param formFactor
     */
    public void setFormFactor(com.sforce.soap._2006._04.metadata.FormFactor formFactor) {
        this.formFactor = formFactor;
    }


    /**
     * Gets the pageOrSobjectType value for this ProfileActionOverride.
     * 
     * @return pageOrSobjectType
     */
    public java.lang.String getPageOrSobjectType() {
        return pageOrSobjectType;
    }


    /**
     * Sets the pageOrSobjectType value for this ProfileActionOverride.
     * 
     * @param pageOrSobjectType
     */
    public void setPageOrSobjectType(java.lang.String pageOrSobjectType) {
        this.pageOrSobjectType = pageOrSobjectType;
    }


    /**
     * Gets the recordType value for this ProfileActionOverride.
     * 
     * @return recordType
     */
    public java.lang.String getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this ProfileActionOverride.
     * 
     * @param recordType
     */
    public void setRecordType(java.lang.String recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the type value for this ProfileActionOverride.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.ActionOverrideType getType() {
        return type;
    }


    /**
     * Sets the type value for this ProfileActionOverride.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.ActionOverrideType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileActionOverride)) return false;
        ProfileActionOverride other = (ProfileActionOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionName==null && other.getActionName()==null) || 
             (this.actionName!=null &&
              this.actionName.equals(other.getActionName()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.formFactor==null && other.getFormFactor()==null) || 
             (this.formFactor!=null &&
              this.formFactor.equals(other.getFormFactor()))) &&
            ((this.pageOrSobjectType==null && other.getPageOrSobjectType()==null) || 
             (this.pageOrSobjectType!=null &&
              this.pageOrSobjectType.equals(other.getPageOrSobjectType()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getActionName() != null) {
            _hashCode += getActionName().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getFormFactor() != null) {
            _hashCode += getFormFactor().hashCode();
        }
        if (getPageOrSobjectType() != null) {
            _hashCode += getPageOrSobjectType().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileActionOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileActionOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "formFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FormFactor"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageOrSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageOrSobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionOverrideType"));
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
