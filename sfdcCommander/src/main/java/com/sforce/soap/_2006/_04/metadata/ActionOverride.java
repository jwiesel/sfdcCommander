/**
 * ActionOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ActionOverride  implements java.io.Serializable {
    private java.lang.String actionName;

    private java.lang.String comment;

    private java.lang.String content;

    private com.sforce.soap._2006._04.metadata.FormFactor formFactor;

    private java.lang.Boolean skipRecordTypeSelect;

    private com.sforce.soap._2006._04.metadata.ActionOverrideType type;

    public ActionOverride() {
    }

    public ActionOverride(
           java.lang.String actionName,
           java.lang.String comment,
           java.lang.String content,
           com.sforce.soap._2006._04.metadata.FormFactor formFactor,
           java.lang.Boolean skipRecordTypeSelect,
           com.sforce.soap._2006._04.metadata.ActionOverrideType type) {
           this.actionName = actionName;
           this.comment = comment;
           this.content = content;
           this.formFactor = formFactor;
           this.skipRecordTypeSelect = skipRecordTypeSelect;
           this.type = type;
    }


    /**
     * Gets the actionName value for this ActionOverride.
     * 
     * @return actionName
     */
    public java.lang.String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this ActionOverride.
     * 
     * @param actionName
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the comment value for this ActionOverride.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ActionOverride.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the content value for this ActionOverride.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this ActionOverride.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the formFactor value for this ActionOverride.
     * 
     * @return formFactor
     */
    public com.sforce.soap._2006._04.metadata.FormFactor getFormFactor() {
        return formFactor;
    }


    /**
     * Sets the formFactor value for this ActionOverride.
     * 
     * @param formFactor
     */
    public void setFormFactor(com.sforce.soap._2006._04.metadata.FormFactor formFactor) {
        this.formFactor = formFactor;
    }


    /**
     * Gets the skipRecordTypeSelect value for this ActionOverride.
     * 
     * @return skipRecordTypeSelect
     */
    public java.lang.Boolean getSkipRecordTypeSelect() {
        return skipRecordTypeSelect;
    }


    /**
     * Sets the skipRecordTypeSelect value for this ActionOverride.
     * 
     * @param skipRecordTypeSelect
     */
    public void setSkipRecordTypeSelect(java.lang.Boolean skipRecordTypeSelect) {
        this.skipRecordTypeSelect = skipRecordTypeSelect;
    }


    /**
     * Gets the type value for this ActionOverride.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.ActionOverrideType getType() {
        return type;
    }


    /**
     * Sets the type value for this ActionOverride.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.ActionOverrideType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActionOverride)) return false;
        ActionOverride other = (ActionOverride) obj;
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
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.formFactor==null && other.getFormFactor()==null) || 
             (this.formFactor!=null &&
              this.formFactor.equals(other.getFormFactor()))) &&
            ((this.skipRecordTypeSelect==null && other.getSkipRecordTypeSelect()==null) || 
             (this.skipRecordTypeSelect!=null &&
              this.skipRecordTypeSelect.equals(other.getSkipRecordTypeSelect()))) &&
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getFormFactor() != null) {
            _hashCode += getFormFactor().hashCode();
        }
        if (getSkipRecordTypeSelect() != null) {
            _hashCode += getSkipRecordTypeSelect().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActionOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipRecordTypeSelect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "skipRecordTypeSelect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionOverrideType"));
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
