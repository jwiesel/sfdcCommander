/**
 * WorkflowAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WorkflowAlert  extends com.sforce.soap._2006._04.metadata.WorkflowAction  implements java.io.Serializable {
    private java.lang.String[] ccEmails;

    private java.lang.String description;

    private boolean _protected;

    private com.sforce.soap._2006._04.metadata.WorkflowEmailRecipient[] recipients;

    private java.lang.String senderAddress;

    private com.sforce.soap._2006._04.metadata.ActionEmailSenderType senderType;

    private java.lang.String template;

    public WorkflowAlert() {
    }

    public WorkflowAlert(
           java.lang.String fullName,
           java.lang.String[] ccEmails,
           java.lang.String description,
           boolean _protected,
           com.sforce.soap._2006._04.metadata.WorkflowEmailRecipient[] recipients,
           java.lang.String senderAddress,
           com.sforce.soap._2006._04.metadata.ActionEmailSenderType senderType,
           java.lang.String template) {
        super(
            fullName);
        this.ccEmails = ccEmails;
        this.description = description;
        this._protected = _protected;
        this.recipients = recipients;
        this.senderAddress = senderAddress;
        this.senderType = senderType;
        this.template = template;
    }


    /**
     * Gets the ccEmails value for this WorkflowAlert.
     * 
     * @return ccEmails
     */
    public java.lang.String[] getCcEmails() {
        return ccEmails;
    }


    /**
     * Sets the ccEmails value for this WorkflowAlert.
     * 
     * @param ccEmails
     */
    public void setCcEmails(java.lang.String[] ccEmails) {
        this.ccEmails = ccEmails;
    }

    public java.lang.String getCcEmails(int i) {
        return this.ccEmails[i];
    }

    public void setCcEmails(int i, java.lang.String _value) {
        this.ccEmails[i] = _value;
    }


    /**
     * Gets the description value for this WorkflowAlert.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WorkflowAlert.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the _protected value for this WorkflowAlert.
     * 
     * @return _protected
     */
    public boolean is_protected() {
        return _protected;
    }


    /**
     * Sets the _protected value for this WorkflowAlert.
     * 
     * @param _protected
     */
    public void set_protected(boolean _protected) {
        this._protected = _protected;
    }


    /**
     * Gets the recipients value for this WorkflowAlert.
     * 
     * @return recipients
     */
    public com.sforce.soap._2006._04.metadata.WorkflowEmailRecipient[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this WorkflowAlert.
     * 
     * @param recipients
     */
    public void setRecipients(com.sforce.soap._2006._04.metadata.WorkflowEmailRecipient[] recipients) {
        this.recipients = recipients;
    }

    public com.sforce.soap._2006._04.metadata.WorkflowEmailRecipient getRecipients(int i) {
        return this.recipients[i];
    }

    public void setRecipients(int i, com.sforce.soap._2006._04.metadata.WorkflowEmailRecipient _value) {
        this.recipients[i] = _value;
    }


    /**
     * Gets the senderAddress value for this WorkflowAlert.
     * 
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this WorkflowAlert.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderType value for this WorkflowAlert.
     * 
     * @return senderType
     */
    public com.sforce.soap._2006._04.metadata.ActionEmailSenderType getSenderType() {
        return senderType;
    }


    /**
     * Sets the senderType value for this WorkflowAlert.
     * 
     * @param senderType
     */
    public void setSenderType(com.sforce.soap._2006._04.metadata.ActionEmailSenderType senderType) {
        this.senderType = senderType;
    }


    /**
     * Gets the template value for this WorkflowAlert.
     * 
     * @return template
     */
    public java.lang.String getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this WorkflowAlert.
     * 
     * @param template
     */
    public void setTemplate(java.lang.String template) {
        this.template = template;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowAlert)) return false;
        WorkflowAlert other = (WorkflowAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ccEmails==null && other.getCcEmails()==null) || 
             (this.ccEmails!=null &&
              java.util.Arrays.equals(this.ccEmails, other.getCcEmails()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this._protected == other.is_protected() &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients()))) &&
            ((this.senderAddress==null && other.getSenderAddress()==null) || 
             (this.senderAddress!=null &&
              this.senderAddress.equals(other.getSenderAddress()))) &&
            ((this.senderType==null && other.getSenderType()==null) || 
             (this.senderType!=null &&
              this.senderType.equals(other.getSenderType()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate())));
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
        if (getCcEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (is_protected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getSenderType() != null) {
            _hashCode += getSenderType().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ccEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("_protected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "protected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowEmailRecipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "senderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "senderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionEmailSenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "template"));
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
