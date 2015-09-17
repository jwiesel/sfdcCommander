/**
 * EmailToCaseSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EmailToCaseSettings  implements java.io.Serializable {
    private java.lang.Boolean enableEmailToCase;

    private java.lang.Boolean enableHtmlEmail;

    private java.lang.Boolean enableOnDemandEmailToCase;

    private java.lang.Boolean enableThreadIDInBody;

    private java.lang.Boolean enableThreadIDInSubject;

    private java.lang.Boolean notifyOwnerOnNewCaseEmail;

    private com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType overEmailLimitAction;

    private java.lang.Boolean preQuoteSignature;

    private com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddress[] routingAddresses;

    private com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType unauthorizedSenderAction;

    public EmailToCaseSettings() {
    }

    public EmailToCaseSettings(
           java.lang.Boolean enableEmailToCase,
           java.lang.Boolean enableHtmlEmail,
           java.lang.Boolean enableOnDemandEmailToCase,
           java.lang.Boolean enableThreadIDInBody,
           java.lang.Boolean enableThreadIDInSubject,
           java.lang.Boolean notifyOwnerOnNewCaseEmail,
           com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType overEmailLimitAction,
           java.lang.Boolean preQuoteSignature,
           com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddress[] routingAddresses,
           com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType unauthorizedSenderAction) {
           this.enableEmailToCase = enableEmailToCase;
           this.enableHtmlEmail = enableHtmlEmail;
           this.enableOnDemandEmailToCase = enableOnDemandEmailToCase;
           this.enableThreadIDInBody = enableThreadIDInBody;
           this.enableThreadIDInSubject = enableThreadIDInSubject;
           this.notifyOwnerOnNewCaseEmail = notifyOwnerOnNewCaseEmail;
           this.overEmailLimitAction = overEmailLimitAction;
           this.preQuoteSignature = preQuoteSignature;
           this.routingAddresses = routingAddresses;
           this.unauthorizedSenderAction = unauthorizedSenderAction;
    }


    /**
     * Gets the enableEmailToCase value for this EmailToCaseSettings.
     * 
     * @return enableEmailToCase
     */
    public java.lang.Boolean getEnableEmailToCase() {
        return enableEmailToCase;
    }


    /**
     * Sets the enableEmailToCase value for this EmailToCaseSettings.
     * 
     * @param enableEmailToCase
     */
    public void setEnableEmailToCase(java.lang.Boolean enableEmailToCase) {
        this.enableEmailToCase = enableEmailToCase;
    }


    /**
     * Gets the enableHtmlEmail value for this EmailToCaseSettings.
     * 
     * @return enableHtmlEmail
     */
    public java.lang.Boolean getEnableHtmlEmail() {
        return enableHtmlEmail;
    }


    /**
     * Sets the enableHtmlEmail value for this EmailToCaseSettings.
     * 
     * @param enableHtmlEmail
     */
    public void setEnableHtmlEmail(java.lang.Boolean enableHtmlEmail) {
        this.enableHtmlEmail = enableHtmlEmail;
    }


    /**
     * Gets the enableOnDemandEmailToCase value for this EmailToCaseSettings.
     * 
     * @return enableOnDemandEmailToCase
     */
    public java.lang.Boolean getEnableOnDemandEmailToCase() {
        return enableOnDemandEmailToCase;
    }


    /**
     * Sets the enableOnDemandEmailToCase value for this EmailToCaseSettings.
     * 
     * @param enableOnDemandEmailToCase
     */
    public void setEnableOnDemandEmailToCase(java.lang.Boolean enableOnDemandEmailToCase) {
        this.enableOnDemandEmailToCase = enableOnDemandEmailToCase;
    }


    /**
     * Gets the enableThreadIDInBody value for this EmailToCaseSettings.
     * 
     * @return enableThreadIDInBody
     */
    public java.lang.Boolean getEnableThreadIDInBody() {
        return enableThreadIDInBody;
    }


    /**
     * Sets the enableThreadIDInBody value for this EmailToCaseSettings.
     * 
     * @param enableThreadIDInBody
     */
    public void setEnableThreadIDInBody(java.lang.Boolean enableThreadIDInBody) {
        this.enableThreadIDInBody = enableThreadIDInBody;
    }


    /**
     * Gets the enableThreadIDInSubject value for this EmailToCaseSettings.
     * 
     * @return enableThreadIDInSubject
     */
    public java.lang.Boolean getEnableThreadIDInSubject() {
        return enableThreadIDInSubject;
    }


    /**
     * Sets the enableThreadIDInSubject value for this EmailToCaseSettings.
     * 
     * @param enableThreadIDInSubject
     */
    public void setEnableThreadIDInSubject(java.lang.Boolean enableThreadIDInSubject) {
        this.enableThreadIDInSubject = enableThreadIDInSubject;
    }


    /**
     * Gets the notifyOwnerOnNewCaseEmail value for this EmailToCaseSettings.
     * 
     * @return notifyOwnerOnNewCaseEmail
     */
    public java.lang.Boolean getNotifyOwnerOnNewCaseEmail() {
        return notifyOwnerOnNewCaseEmail;
    }


    /**
     * Sets the notifyOwnerOnNewCaseEmail value for this EmailToCaseSettings.
     * 
     * @param notifyOwnerOnNewCaseEmail
     */
    public void setNotifyOwnerOnNewCaseEmail(java.lang.Boolean notifyOwnerOnNewCaseEmail) {
        this.notifyOwnerOnNewCaseEmail = notifyOwnerOnNewCaseEmail;
    }


    /**
     * Gets the overEmailLimitAction value for this EmailToCaseSettings.
     * 
     * @return overEmailLimitAction
     */
    public com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType getOverEmailLimitAction() {
        return overEmailLimitAction;
    }


    /**
     * Sets the overEmailLimitAction value for this EmailToCaseSettings.
     * 
     * @param overEmailLimitAction
     */
    public void setOverEmailLimitAction(com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType overEmailLimitAction) {
        this.overEmailLimitAction = overEmailLimitAction;
    }


    /**
     * Gets the preQuoteSignature value for this EmailToCaseSettings.
     * 
     * @return preQuoteSignature
     */
    public java.lang.Boolean getPreQuoteSignature() {
        return preQuoteSignature;
    }


    /**
     * Sets the preQuoteSignature value for this EmailToCaseSettings.
     * 
     * @param preQuoteSignature
     */
    public void setPreQuoteSignature(java.lang.Boolean preQuoteSignature) {
        this.preQuoteSignature = preQuoteSignature;
    }


    /**
     * Gets the routingAddresses value for this EmailToCaseSettings.
     * 
     * @return routingAddresses
     */
    public com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddress[] getRoutingAddresses() {
        return routingAddresses;
    }


    /**
     * Sets the routingAddresses value for this EmailToCaseSettings.
     * 
     * @param routingAddresses
     */
    public void setRoutingAddresses(com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddress[] routingAddresses) {
        this.routingAddresses = routingAddresses;
    }

    public com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddress getRoutingAddresses(int i) {
        return this.routingAddresses[i];
    }

    public void setRoutingAddresses(int i, com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddress _value) {
        this.routingAddresses[i] = _value;
    }


    /**
     * Gets the unauthorizedSenderAction value for this EmailToCaseSettings.
     * 
     * @return unauthorizedSenderAction
     */
    public com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType getUnauthorizedSenderAction() {
        return unauthorizedSenderAction;
    }


    /**
     * Sets the unauthorizedSenderAction value for this EmailToCaseSettings.
     * 
     * @param unauthorizedSenderAction
     */
    public void setUnauthorizedSenderAction(com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType unauthorizedSenderAction) {
        this.unauthorizedSenderAction = unauthorizedSenderAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailToCaseSettings)) return false;
        EmailToCaseSettings other = (EmailToCaseSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enableEmailToCase==null && other.getEnableEmailToCase()==null) || 
             (this.enableEmailToCase!=null &&
              this.enableEmailToCase.equals(other.getEnableEmailToCase()))) &&
            ((this.enableHtmlEmail==null && other.getEnableHtmlEmail()==null) || 
             (this.enableHtmlEmail!=null &&
              this.enableHtmlEmail.equals(other.getEnableHtmlEmail()))) &&
            ((this.enableOnDemandEmailToCase==null && other.getEnableOnDemandEmailToCase()==null) || 
             (this.enableOnDemandEmailToCase!=null &&
              this.enableOnDemandEmailToCase.equals(other.getEnableOnDemandEmailToCase()))) &&
            ((this.enableThreadIDInBody==null && other.getEnableThreadIDInBody()==null) || 
             (this.enableThreadIDInBody!=null &&
              this.enableThreadIDInBody.equals(other.getEnableThreadIDInBody()))) &&
            ((this.enableThreadIDInSubject==null && other.getEnableThreadIDInSubject()==null) || 
             (this.enableThreadIDInSubject!=null &&
              this.enableThreadIDInSubject.equals(other.getEnableThreadIDInSubject()))) &&
            ((this.notifyOwnerOnNewCaseEmail==null && other.getNotifyOwnerOnNewCaseEmail()==null) || 
             (this.notifyOwnerOnNewCaseEmail!=null &&
              this.notifyOwnerOnNewCaseEmail.equals(other.getNotifyOwnerOnNewCaseEmail()))) &&
            ((this.overEmailLimitAction==null && other.getOverEmailLimitAction()==null) || 
             (this.overEmailLimitAction!=null &&
              this.overEmailLimitAction.equals(other.getOverEmailLimitAction()))) &&
            ((this.preQuoteSignature==null && other.getPreQuoteSignature()==null) || 
             (this.preQuoteSignature!=null &&
              this.preQuoteSignature.equals(other.getPreQuoteSignature()))) &&
            ((this.routingAddresses==null && other.getRoutingAddresses()==null) || 
             (this.routingAddresses!=null &&
              java.util.Arrays.equals(this.routingAddresses, other.getRoutingAddresses()))) &&
            ((this.unauthorizedSenderAction==null && other.getUnauthorizedSenderAction()==null) || 
             (this.unauthorizedSenderAction!=null &&
              this.unauthorizedSenderAction.equals(other.getUnauthorizedSenderAction())));
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
        if (getEnableEmailToCase() != null) {
            _hashCode += getEnableEmailToCase().hashCode();
        }
        if (getEnableHtmlEmail() != null) {
            _hashCode += getEnableHtmlEmail().hashCode();
        }
        if (getEnableOnDemandEmailToCase() != null) {
            _hashCode += getEnableOnDemandEmailToCase().hashCode();
        }
        if (getEnableThreadIDInBody() != null) {
            _hashCode += getEnableThreadIDInBody().hashCode();
        }
        if (getEnableThreadIDInSubject() != null) {
            _hashCode += getEnableThreadIDInSubject().hashCode();
        }
        if (getNotifyOwnerOnNewCaseEmail() != null) {
            _hashCode += getNotifyOwnerOnNewCaseEmail().hashCode();
        }
        if (getOverEmailLimitAction() != null) {
            _hashCode += getOverEmailLimitAction().hashCode();
        }
        if (getPreQuoteSignature() != null) {
            _hashCode += getPreQuoteSignature().hashCode();
        }
        if (getRoutingAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutingAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutingAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnauthorizedSenderAction() != null) {
            _hashCode += getUnauthorizedSenderAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailToCaseSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableEmailToCase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableEmailToCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableHtmlEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableHtmlEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableOnDemandEmailToCase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableOnDemandEmailToCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableThreadIDInBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableThreadIDInBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableThreadIDInSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableThreadIDInSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyOwnerOnNewCaseEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyOwnerOnNewCaseEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overEmailLimitAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "overEmailLimitAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseOnFailureActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preQuoteSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "preQuoteSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "routingAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseRoutingAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unauthorizedSenderAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "unauthorizedSenderAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseOnFailureActionType"));
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
