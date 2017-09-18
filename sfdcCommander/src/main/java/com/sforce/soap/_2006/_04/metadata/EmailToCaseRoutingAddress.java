/**
 * EmailToCaseRoutingAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EmailToCaseRoutingAddress  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddressType addressType;

    private java.lang.String authorizedSenders;

    private java.lang.String caseOrigin;

    private java.lang.String caseOwner;

    private java.lang.String caseOwnerType;

    private java.lang.String casePriority;

    private java.lang.Boolean createTask;

    private java.lang.String emailAddress;

    private java.lang.String emailServicesAddress;

    private java.lang.Boolean isVerified;

    private java.lang.String routingName;

    private java.lang.Boolean saveEmailHeaders;

    private java.lang.String taskStatus;

    public EmailToCaseRoutingAddress() {
    }

    public EmailToCaseRoutingAddress(
           com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddressType addressType,
           java.lang.String authorizedSenders,
           java.lang.String caseOrigin,
           java.lang.String caseOwner,
           java.lang.String caseOwnerType,
           java.lang.String casePriority,
           java.lang.Boolean createTask,
           java.lang.String emailAddress,
           java.lang.String emailServicesAddress,
           java.lang.Boolean isVerified,
           java.lang.String routingName,
           java.lang.Boolean saveEmailHeaders,
           java.lang.String taskStatus) {
           this.addressType = addressType;
           this.authorizedSenders = authorizedSenders;
           this.caseOrigin = caseOrigin;
           this.caseOwner = caseOwner;
           this.caseOwnerType = caseOwnerType;
           this.casePriority = casePriority;
           this.createTask = createTask;
           this.emailAddress = emailAddress;
           this.emailServicesAddress = emailServicesAddress;
           this.isVerified = isVerified;
           this.routingName = routingName;
           this.saveEmailHeaders = saveEmailHeaders;
           this.taskStatus = taskStatus;
    }


    /**
     * Gets the addressType value for this EmailToCaseRoutingAddress.
     * 
     * @return addressType
     */
    public com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddressType getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this EmailToCaseRoutingAddress.
     * 
     * @param addressType
     */
    public void setAddressType(com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddressType addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the authorizedSenders value for this EmailToCaseRoutingAddress.
     * 
     * @return authorizedSenders
     */
    public java.lang.String getAuthorizedSenders() {
        return authorizedSenders;
    }


    /**
     * Sets the authorizedSenders value for this EmailToCaseRoutingAddress.
     * 
     * @param authorizedSenders
     */
    public void setAuthorizedSenders(java.lang.String authorizedSenders) {
        this.authorizedSenders = authorizedSenders;
    }


    /**
     * Gets the caseOrigin value for this EmailToCaseRoutingAddress.
     * 
     * @return caseOrigin
     */
    public java.lang.String getCaseOrigin() {
        return caseOrigin;
    }


    /**
     * Sets the caseOrigin value for this EmailToCaseRoutingAddress.
     * 
     * @param caseOrigin
     */
    public void setCaseOrigin(java.lang.String caseOrigin) {
        this.caseOrigin = caseOrigin;
    }


    /**
     * Gets the caseOwner value for this EmailToCaseRoutingAddress.
     * 
     * @return caseOwner
     */
    public java.lang.String getCaseOwner() {
        return caseOwner;
    }


    /**
     * Sets the caseOwner value for this EmailToCaseRoutingAddress.
     * 
     * @param caseOwner
     */
    public void setCaseOwner(java.lang.String caseOwner) {
        this.caseOwner = caseOwner;
    }


    /**
     * Gets the caseOwnerType value for this EmailToCaseRoutingAddress.
     * 
     * @return caseOwnerType
     */
    public java.lang.String getCaseOwnerType() {
        return caseOwnerType;
    }


    /**
     * Sets the caseOwnerType value for this EmailToCaseRoutingAddress.
     * 
     * @param caseOwnerType
     */
    public void setCaseOwnerType(java.lang.String caseOwnerType) {
        this.caseOwnerType = caseOwnerType;
    }


    /**
     * Gets the casePriority value for this EmailToCaseRoutingAddress.
     * 
     * @return casePriority
     */
    public java.lang.String getCasePriority() {
        return casePriority;
    }


    /**
     * Sets the casePriority value for this EmailToCaseRoutingAddress.
     * 
     * @param casePriority
     */
    public void setCasePriority(java.lang.String casePriority) {
        this.casePriority = casePriority;
    }


    /**
     * Gets the createTask value for this EmailToCaseRoutingAddress.
     * 
     * @return createTask
     */
    public java.lang.Boolean getCreateTask() {
        return createTask;
    }


    /**
     * Sets the createTask value for this EmailToCaseRoutingAddress.
     * 
     * @param createTask
     */
    public void setCreateTask(java.lang.Boolean createTask) {
        this.createTask = createTask;
    }


    /**
     * Gets the emailAddress value for this EmailToCaseRoutingAddress.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this EmailToCaseRoutingAddress.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the emailServicesAddress value for this EmailToCaseRoutingAddress.
     * 
     * @return emailServicesAddress
     */
    public java.lang.String getEmailServicesAddress() {
        return emailServicesAddress;
    }


    /**
     * Sets the emailServicesAddress value for this EmailToCaseRoutingAddress.
     * 
     * @param emailServicesAddress
     */
    public void setEmailServicesAddress(java.lang.String emailServicesAddress) {
        this.emailServicesAddress = emailServicesAddress;
    }


    /**
     * Gets the isVerified value for this EmailToCaseRoutingAddress.
     * 
     * @return isVerified
     */
    public java.lang.Boolean getIsVerified() {
        return isVerified;
    }


    /**
     * Sets the isVerified value for this EmailToCaseRoutingAddress.
     * 
     * @param isVerified
     */
    public void setIsVerified(java.lang.Boolean isVerified) {
        this.isVerified = isVerified;
    }


    /**
     * Gets the routingName value for this EmailToCaseRoutingAddress.
     * 
     * @return routingName
     */
    public java.lang.String getRoutingName() {
        return routingName;
    }


    /**
     * Sets the routingName value for this EmailToCaseRoutingAddress.
     * 
     * @param routingName
     */
    public void setRoutingName(java.lang.String routingName) {
        this.routingName = routingName;
    }


    /**
     * Gets the saveEmailHeaders value for this EmailToCaseRoutingAddress.
     * 
     * @return saveEmailHeaders
     */
    public java.lang.Boolean getSaveEmailHeaders() {
        return saveEmailHeaders;
    }


    /**
     * Sets the saveEmailHeaders value for this EmailToCaseRoutingAddress.
     * 
     * @param saveEmailHeaders
     */
    public void setSaveEmailHeaders(java.lang.Boolean saveEmailHeaders) {
        this.saveEmailHeaders = saveEmailHeaders;
    }


    /**
     * Gets the taskStatus value for this EmailToCaseRoutingAddress.
     * 
     * @return taskStatus
     */
    public java.lang.String getTaskStatus() {
        return taskStatus;
    }


    /**
     * Sets the taskStatus value for this EmailToCaseRoutingAddress.
     * 
     * @param taskStatus
     */
    public void setTaskStatus(java.lang.String taskStatus) {
        this.taskStatus = taskStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailToCaseRoutingAddress)) return false;
        EmailToCaseRoutingAddress other = (EmailToCaseRoutingAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType()))) &&
            ((this.authorizedSenders==null && other.getAuthorizedSenders()==null) || 
             (this.authorizedSenders!=null &&
              this.authorizedSenders.equals(other.getAuthorizedSenders()))) &&
            ((this.caseOrigin==null && other.getCaseOrigin()==null) || 
             (this.caseOrigin!=null &&
              this.caseOrigin.equals(other.getCaseOrigin()))) &&
            ((this.caseOwner==null && other.getCaseOwner()==null) || 
             (this.caseOwner!=null &&
              this.caseOwner.equals(other.getCaseOwner()))) &&
            ((this.caseOwnerType==null && other.getCaseOwnerType()==null) || 
             (this.caseOwnerType!=null &&
              this.caseOwnerType.equals(other.getCaseOwnerType()))) &&
            ((this.casePriority==null && other.getCasePriority()==null) || 
             (this.casePriority!=null &&
              this.casePriority.equals(other.getCasePriority()))) &&
            ((this.createTask==null && other.getCreateTask()==null) || 
             (this.createTask!=null &&
              this.createTask.equals(other.getCreateTask()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.emailServicesAddress==null && other.getEmailServicesAddress()==null) || 
             (this.emailServicesAddress!=null &&
              this.emailServicesAddress.equals(other.getEmailServicesAddress()))) &&
            ((this.isVerified==null && other.getIsVerified()==null) || 
             (this.isVerified!=null &&
              this.isVerified.equals(other.getIsVerified()))) &&
            ((this.routingName==null && other.getRoutingName()==null) || 
             (this.routingName!=null &&
              this.routingName.equals(other.getRoutingName()))) &&
            ((this.saveEmailHeaders==null && other.getSaveEmailHeaders()==null) || 
             (this.saveEmailHeaders!=null &&
              this.saveEmailHeaders.equals(other.getSaveEmailHeaders()))) &&
            ((this.taskStatus==null && other.getTaskStatus()==null) || 
             (this.taskStatus!=null &&
              this.taskStatus.equals(other.getTaskStatus())));
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
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
        }
        if (getAuthorizedSenders() != null) {
            _hashCode += getAuthorizedSenders().hashCode();
        }
        if (getCaseOrigin() != null) {
            _hashCode += getCaseOrigin().hashCode();
        }
        if (getCaseOwner() != null) {
            _hashCode += getCaseOwner().hashCode();
        }
        if (getCaseOwnerType() != null) {
            _hashCode += getCaseOwnerType().hashCode();
        }
        if (getCasePriority() != null) {
            _hashCode += getCasePriority().hashCode();
        }
        if (getCreateTask() != null) {
            _hashCode += getCreateTask().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getEmailServicesAddress() != null) {
            _hashCode += getEmailServicesAddress().hashCode();
        }
        if (getIsVerified() != null) {
            _hashCode += getIsVerified().hashCode();
        }
        if (getRoutingName() != null) {
            _hashCode += getRoutingName().hashCode();
        }
        if (getSaveEmailHeaders() != null) {
            _hashCode += getSaveEmailHeaders().hashCode();
        }
        if (getTaskStatus() != null) {
            _hashCode += getTaskStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailToCaseRoutingAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseRoutingAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseRoutingAddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedSenders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "authorizedSenders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseOwnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseOwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casePriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "casePriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "createTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailServicesAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailServicesAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isVerified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "routingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveEmailHeaders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "saveEmailHeaders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "taskStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
