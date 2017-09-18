/**
 * PasswordPolicies.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PasswordPolicies  implements java.io.Serializable {
    private java.lang.String apiOnlyUserHomePageURL;

    private com.sforce.soap._2006._04.metadata.Complexity complexity;

    private com.sforce.soap._2006._04.metadata.Expiration expiration;

    private java.lang.String historyRestriction;

    private com.sforce.soap._2006._04.metadata.LockoutInterval lockoutInterval;

    private com.sforce.soap._2006._04.metadata.MaxLoginAttempts maxLoginAttempts;

    private java.lang.String minimumPasswordLength;

    private java.lang.Boolean minimumPasswordLifetime;

    private java.lang.Boolean obscureSecretAnswer;

    private java.lang.String passwordAssistanceMessage;

    private java.lang.String passwordAssistanceURL;

    private com.sforce.soap._2006._04.metadata.QuestionRestriction questionRestriction;

    public PasswordPolicies() {
    }

    public PasswordPolicies(
           java.lang.String apiOnlyUserHomePageURL,
           com.sforce.soap._2006._04.metadata.Complexity complexity,
           com.sforce.soap._2006._04.metadata.Expiration expiration,
           java.lang.String historyRestriction,
           com.sforce.soap._2006._04.metadata.LockoutInterval lockoutInterval,
           com.sforce.soap._2006._04.metadata.MaxLoginAttempts maxLoginAttempts,
           java.lang.String minimumPasswordLength,
           java.lang.Boolean minimumPasswordLifetime,
           java.lang.Boolean obscureSecretAnswer,
           java.lang.String passwordAssistanceMessage,
           java.lang.String passwordAssistanceURL,
           com.sforce.soap._2006._04.metadata.QuestionRestriction questionRestriction) {
           this.apiOnlyUserHomePageURL = apiOnlyUserHomePageURL;
           this.complexity = complexity;
           this.expiration = expiration;
           this.historyRestriction = historyRestriction;
           this.lockoutInterval = lockoutInterval;
           this.maxLoginAttempts = maxLoginAttempts;
           this.minimumPasswordLength = minimumPasswordLength;
           this.minimumPasswordLifetime = minimumPasswordLifetime;
           this.obscureSecretAnswer = obscureSecretAnswer;
           this.passwordAssistanceMessage = passwordAssistanceMessage;
           this.passwordAssistanceURL = passwordAssistanceURL;
           this.questionRestriction = questionRestriction;
    }


    /**
     * Gets the apiOnlyUserHomePageURL value for this PasswordPolicies.
     * 
     * @return apiOnlyUserHomePageURL
     */
    public java.lang.String getApiOnlyUserHomePageURL() {
        return apiOnlyUserHomePageURL;
    }


    /**
     * Sets the apiOnlyUserHomePageURL value for this PasswordPolicies.
     * 
     * @param apiOnlyUserHomePageURL
     */
    public void setApiOnlyUserHomePageURL(java.lang.String apiOnlyUserHomePageURL) {
        this.apiOnlyUserHomePageURL = apiOnlyUserHomePageURL;
    }


    /**
     * Gets the complexity value for this PasswordPolicies.
     * 
     * @return complexity
     */
    public com.sforce.soap._2006._04.metadata.Complexity getComplexity() {
        return complexity;
    }


    /**
     * Sets the complexity value for this PasswordPolicies.
     * 
     * @param complexity
     */
    public void setComplexity(com.sforce.soap._2006._04.metadata.Complexity complexity) {
        this.complexity = complexity;
    }


    /**
     * Gets the expiration value for this PasswordPolicies.
     * 
     * @return expiration
     */
    public com.sforce.soap._2006._04.metadata.Expiration getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this PasswordPolicies.
     * 
     * @param expiration
     */
    public void setExpiration(com.sforce.soap._2006._04.metadata.Expiration expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the historyRestriction value for this PasswordPolicies.
     * 
     * @return historyRestriction
     */
    public java.lang.String getHistoryRestriction() {
        return historyRestriction;
    }


    /**
     * Sets the historyRestriction value for this PasswordPolicies.
     * 
     * @param historyRestriction
     */
    public void setHistoryRestriction(java.lang.String historyRestriction) {
        this.historyRestriction = historyRestriction;
    }


    /**
     * Gets the lockoutInterval value for this PasswordPolicies.
     * 
     * @return lockoutInterval
     */
    public com.sforce.soap._2006._04.metadata.LockoutInterval getLockoutInterval() {
        return lockoutInterval;
    }


    /**
     * Sets the lockoutInterval value for this PasswordPolicies.
     * 
     * @param lockoutInterval
     */
    public void setLockoutInterval(com.sforce.soap._2006._04.metadata.LockoutInterval lockoutInterval) {
        this.lockoutInterval = lockoutInterval;
    }


    /**
     * Gets the maxLoginAttempts value for this PasswordPolicies.
     * 
     * @return maxLoginAttempts
     */
    public com.sforce.soap._2006._04.metadata.MaxLoginAttempts getMaxLoginAttempts() {
        return maxLoginAttempts;
    }


    /**
     * Sets the maxLoginAttempts value for this PasswordPolicies.
     * 
     * @param maxLoginAttempts
     */
    public void setMaxLoginAttempts(com.sforce.soap._2006._04.metadata.MaxLoginAttempts maxLoginAttempts) {
        this.maxLoginAttempts = maxLoginAttempts;
    }


    /**
     * Gets the minimumPasswordLength value for this PasswordPolicies.
     * 
     * @return minimumPasswordLength
     */
    public java.lang.String getMinimumPasswordLength() {
        return minimumPasswordLength;
    }


    /**
     * Sets the minimumPasswordLength value for this PasswordPolicies.
     * 
     * @param minimumPasswordLength
     */
    public void setMinimumPasswordLength(java.lang.String minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }


    /**
     * Gets the minimumPasswordLifetime value for this PasswordPolicies.
     * 
     * @return minimumPasswordLifetime
     */
    public java.lang.Boolean getMinimumPasswordLifetime() {
        return minimumPasswordLifetime;
    }


    /**
     * Sets the minimumPasswordLifetime value for this PasswordPolicies.
     * 
     * @param minimumPasswordLifetime
     */
    public void setMinimumPasswordLifetime(java.lang.Boolean minimumPasswordLifetime) {
        this.minimumPasswordLifetime = minimumPasswordLifetime;
    }


    /**
     * Gets the obscureSecretAnswer value for this PasswordPolicies.
     * 
     * @return obscureSecretAnswer
     */
    public java.lang.Boolean getObscureSecretAnswer() {
        return obscureSecretAnswer;
    }


    /**
     * Sets the obscureSecretAnswer value for this PasswordPolicies.
     * 
     * @param obscureSecretAnswer
     */
    public void setObscureSecretAnswer(java.lang.Boolean obscureSecretAnswer) {
        this.obscureSecretAnswer = obscureSecretAnswer;
    }


    /**
     * Gets the passwordAssistanceMessage value for this PasswordPolicies.
     * 
     * @return passwordAssistanceMessage
     */
    public java.lang.String getPasswordAssistanceMessage() {
        return passwordAssistanceMessage;
    }


    /**
     * Sets the passwordAssistanceMessage value for this PasswordPolicies.
     * 
     * @param passwordAssistanceMessage
     */
    public void setPasswordAssistanceMessage(java.lang.String passwordAssistanceMessage) {
        this.passwordAssistanceMessage = passwordAssistanceMessage;
    }


    /**
     * Gets the passwordAssistanceURL value for this PasswordPolicies.
     * 
     * @return passwordAssistanceURL
     */
    public java.lang.String getPasswordAssistanceURL() {
        return passwordAssistanceURL;
    }


    /**
     * Sets the passwordAssistanceURL value for this PasswordPolicies.
     * 
     * @param passwordAssistanceURL
     */
    public void setPasswordAssistanceURL(java.lang.String passwordAssistanceURL) {
        this.passwordAssistanceURL = passwordAssistanceURL;
    }


    /**
     * Gets the questionRestriction value for this PasswordPolicies.
     * 
     * @return questionRestriction
     */
    public com.sforce.soap._2006._04.metadata.QuestionRestriction getQuestionRestriction() {
        return questionRestriction;
    }


    /**
     * Sets the questionRestriction value for this PasswordPolicies.
     * 
     * @param questionRestriction
     */
    public void setQuestionRestriction(com.sforce.soap._2006._04.metadata.QuestionRestriction questionRestriction) {
        this.questionRestriction = questionRestriction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordPolicies)) return false;
        PasswordPolicies other = (PasswordPolicies) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apiOnlyUserHomePageURL==null && other.getApiOnlyUserHomePageURL()==null) || 
             (this.apiOnlyUserHomePageURL!=null &&
              this.apiOnlyUserHomePageURL.equals(other.getApiOnlyUserHomePageURL()))) &&
            ((this.complexity==null && other.getComplexity()==null) || 
             (this.complexity!=null &&
              this.complexity.equals(other.getComplexity()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.historyRestriction==null && other.getHistoryRestriction()==null) || 
             (this.historyRestriction!=null &&
              this.historyRestriction.equals(other.getHistoryRestriction()))) &&
            ((this.lockoutInterval==null && other.getLockoutInterval()==null) || 
             (this.lockoutInterval!=null &&
              this.lockoutInterval.equals(other.getLockoutInterval()))) &&
            ((this.maxLoginAttempts==null && other.getMaxLoginAttempts()==null) || 
             (this.maxLoginAttempts!=null &&
              this.maxLoginAttempts.equals(other.getMaxLoginAttempts()))) &&
            ((this.minimumPasswordLength==null && other.getMinimumPasswordLength()==null) || 
             (this.minimumPasswordLength!=null &&
              this.minimumPasswordLength.equals(other.getMinimumPasswordLength()))) &&
            ((this.minimumPasswordLifetime==null && other.getMinimumPasswordLifetime()==null) || 
             (this.minimumPasswordLifetime!=null &&
              this.minimumPasswordLifetime.equals(other.getMinimumPasswordLifetime()))) &&
            ((this.obscureSecretAnswer==null && other.getObscureSecretAnswer()==null) || 
             (this.obscureSecretAnswer!=null &&
              this.obscureSecretAnswer.equals(other.getObscureSecretAnswer()))) &&
            ((this.passwordAssistanceMessage==null && other.getPasswordAssistanceMessage()==null) || 
             (this.passwordAssistanceMessage!=null &&
              this.passwordAssistanceMessage.equals(other.getPasswordAssistanceMessage()))) &&
            ((this.passwordAssistanceURL==null && other.getPasswordAssistanceURL()==null) || 
             (this.passwordAssistanceURL!=null &&
              this.passwordAssistanceURL.equals(other.getPasswordAssistanceURL()))) &&
            ((this.questionRestriction==null && other.getQuestionRestriction()==null) || 
             (this.questionRestriction!=null &&
              this.questionRestriction.equals(other.getQuestionRestriction())));
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
        if (getApiOnlyUserHomePageURL() != null) {
            _hashCode += getApiOnlyUserHomePageURL().hashCode();
        }
        if (getComplexity() != null) {
            _hashCode += getComplexity().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getHistoryRestriction() != null) {
            _hashCode += getHistoryRestriction().hashCode();
        }
        if (getLockoutInterval() != null) {
            _hashCode += getLockoutInterval().hashCode();
        }
        if (getMaxLoginAttempts() != null) {
            _hashCode += getMaxLoginAttempts().hashCode();
        }
        if (getMinimumPasswordLength() != null) {
            _hashCode += getMinimumPasswordLength().hashCode();
        }
        if (getMinimumPasswordLifetime() != null) {
            _hashCode += getMinimumPasswordLifetime().hashCode();
        }
        if (getObscureSecretAnswer() != null) {
            _hashCode += getObscureSecretAnswer().hashCode();
        }
        if (getPasswordAssistanceMessage() != null) {
            _hashCode += getPasswordAssistanceMessage().hashCode();
        }
        if (getPasswordAssistanceURL() != null) {
            _hashCode += getPasswordAssistanceURL().hashCode();
        }
        if (getQuestionRestriction() != null) {
            _hashCode += getQuestionRestriction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordPolicies.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PasswordPolicies"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiOnlyUserHomePageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiOnlyUserHomePageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complexity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "complexity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Complexity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Expiration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "historyRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lockoutInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LockoutInterval"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLoginAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "maxLoginAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MaxLoginAttempts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumPasswordLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "minimumPasswordLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumPasswordLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "minimumPasswordLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obscureSecretAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "obscureSecretAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAssistanceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "passwordAssistanceMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAssistanceURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "passwordAssistanceURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "questionRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuestionRestriction"));
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
