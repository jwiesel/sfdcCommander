/**
 * ChatterAnswersSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ChatterAnswersSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean emailFollowersOnBestAnswer;

    private java.lang.Boolean emailFollowersOnReply;

    private java.lang.Boolean emailOwnerOnPrivateReply;

    private java.lang.Boolean emailOwnerOnReply;

    private java.lang.Boolean enableAnswerViaEmail;

    private boolean enableChatterAnswers;

    private java.lang.Boolean enableFacebookSSO;

    private java.lang.Boolean enableInlinePublisher;

    private java.lang.Boolean enableReputation;

    private java.lang.Boolean enableRichTextEditor;

    private java.lang.String facebookAuthProvider;

    private java.lang.Boolean showInPortals;

    public ChatterAnswersSettings() {
    }

    public ChatterAnswersSettings(
           java.lang.String fullName,
           java.lang.Boolean emailFollowersOnBestAnswer,
           java.lang.Boolean emailFollowersOnReply,
           java.lang.Boolean emailOwnerOnPrivateReply,
           java.lang.Boolean emailOwnerOnReply,
           java.lang.Boolean enableAnswerViaEmail,
           boolean enableChatterAnswers,
           java.lang.Boolean enableFacebookSSO,
           java.lang.Boolean enableInlinePublisher,
           java.lang.Boolean enableReputation,
           java.lang.Boolean enableRichTextEditor,
           java.lang.String facebookAuthProvider,
           java.lang.Boolean showInPortals) {
        super(
            fullName);
        this.emailFollowersOnBestAnswer = emailFollowersOnBestAnswer;
        this.emailFollowersOnReply = emailFollowersOnReply;
        this.emailOwnerOnPrivateReply = emailOwnerOnPrivateReply;
        this.emailOwnerOnReply = emailOwnerOnReply;
        this.enableAnswerViaEmail = enableAnswerViaEmail;
        this.enableChatterAnswers = enableChatterAnswers;
        this.enableFacebookSSO = enableFacebookSSO;
        this.enableInlinePublisher = enableInlinePublisher;
        this.enableReputation = enableReputation;
        this.enableRichTextEditor = enableRichTextEditor;
        this.facebookAuthProvider = facebookAuthProvider;
        this.showInPortals = showInPortals;
    }


    /**
     * Gets the emailFollowersOnBestAnswer value for this ChatterAnswersSettings.
     * 
     * @return emailFollowersOnBestAnswer
     */
    public java.lang.Boolean getEmailFollowersOnBestAnswer() {
        return emailFollowersOnBestAnswer;
    }


    /**
     * Sets the emailFollowersOnBestAnswer value for this ChatterAnswersSettings.
     * 
     * @param emailFollowersOnBestAnswer
     */
    public void setEmailFollowersOnBestAnswer(java.lang.Boolean emailFollowersOnBestAnswer) {
        this.emailFollowersOnBestAnswer = emailFollowersOnBestAnswer;
    }


    /**
     * Gets the emailFollowersOnReply value for this ChatterAnswersSettings.
     * 
     * @return emailFollowersOnReply
     */
    public java.lang.Boolean getEmailFollowersOnReply() {
        return emailFollowersOnReply;
    }


    /**
     * Sets the emailFollowersOnReply value for this ChatterAnswersSettings.
     * 
     * @param emailFollowersOnReply
     */
    public void setEmailFollowersOnReply(java.lang.Boolean emailFollowersOnReply) {
        this.emailFollowersOnReply = emailFollowersOnReply;
    }


    /**
     * Gets the emailOwnerOnPrivateReply value for this ChatterAnswersSettings.
     * 
     * @return emailOwnerOnPrivateReply
     */
    public java.lang.Boolean getEmailOwnerOnPrivateReply() {
        return emailOwnerOnPrivateReply;
    }


    /**
     * Sets the emailOwnerOnPrivateReply value for this ChatterAnswersSettings.
     * 
     * @param emailOwnerOnPrivateReply
     */
    public void setEmailOwnerOnPrivateReply(java.lang.Boolean emailOwnerOnPrivateReply) {
        this.emailOwnerOnPrivateReply = emailOwnerOnPrivateReply;
    }


    /**
     * Gets the emailOwnerOnReply value for this ChatterAnswersSettings.
     * 
     * @return emailOwnerOnReply
     */
    public java.lang.Boolean getEmailOwnerOnReply() {
        return emailOwnerOnReply;
    }


    /**
     * Sets the emailOwnerOnReply value for this ChatterAnswersSettings.
     * 
     * @param emailOwnerOnReply
     */
    public void setEmailOwnerOnReply(java.lang.Boolean emailOwnerOnReply) {
        this.emailOwnerOnReply = emailOwnerOnReply;
    }


    /**
     * Gets the enableAnswerViaEmail value for this ChatterAnswersSettings.
     * 
     * @return enableAnswerViaEmail
     */
    public java.lang.Boolean getEnableAnswerViaEmail() {
        return enableAnswerViaEmail;
    }


    /**
     * Sets the enableAnswerViaEmail value for this ChatterAnswersSettings.
     * 
     * @param enableAnswerViaEmail
     */
    public void setEnableAnswerViaEmail(java.lang.Boolean enableAnswerViaEmail) {
        this.enableAnswerViaEmail = enableAnswerViaEmail;
    }


    /**
     * Gets the enableChatterAnswers value for this ChatterAnswersSettings.
     * 
     * @return enableChatterAnswers
     */
    public boolean isEnableChatterAnswers() {
        return enableChatterAnswers;
    }


    /**
     * Sets the enableChatterAnswers value for this ChatterAnswersSettings.
     * 
     * @param enableChatterAnswers
     */
    public void setEnableChatterAnswers(boolean enableChatterAnswers) {
        this.enableChatterAnswers = enableChatterAnswers;
    }


    /**
     * Gets the enableFacebookSSO value for this ChatterAnswersSettings.
     * 
     * @return enableFacebookSSO
     */
    public java.lang.Boolean getEnableFacebookSSO() {
        return enableFacebookSSO;
    }


    /**
     * Sets the enableFacebookSSO value for this ChatterAnswersSettings.
     * 
     * @param enableFacebookSSO
     */
    public void setEnableFacebookSSO(java.lang.Boolean enableFacebookSSO) {
        this.enableFacebookSSO = enableFacebookSSO;
    }


    /**
     * Gets the enableInlinePublisher value for this ChatterAnswersSettings.
     * 
     * @return enableInlinePublisher
     */
    public java.lang.Boolean getEnableInlinePublisher() {
        return enableInlinePublisher;
    }


    /**
     * Sets the enableInlinePublisher value for this ChatterAnswersSettings.
     * 
     * @param enableInlinePublisher
     */
    public void setEnableInlinePublisher(java.lang.Boolean enableInlinePublisher) {
        this.enableInlinePublisher = enableInlinePublisher;
    }


    /**
     * Gets the enableReputation value for this ChatterAnswersSettings.
     * 
     * @return enableReputation
     */
    public java.lang.Boolean getEnableReputation() {
        return enableReputation;
    }


    /**
     * Sets the enableReputation value for this ChatterAnswersSettings.
     * 
     * @param enableReputation
     */
    public void setEnableReputation(java.lang.Boolean enableReputation) {
        this.enableReputation = enableReputation;
    }


    /**
     * Gets the enableRichTextEditor value for this ChatterAnswersSettings.
     * 
     * @return enableRichTextEditor
     */
    public java.lang.Boolean getEnableRichTextEditor() {
        return enableRichTextEditor;
    }


    /**
     * Sets the enableRichTextEditor value for this ChatterAnswersSettings.
     * 
     * @param enableRichTextEditor
     */
    public void setEnableRichTextEditor(java.lang.Boolean enableRichTextEditor) {
        this.enableRichTextEditor = enableRichTextEditor;
    }


    /**
     * Gets the facebookAuthProvider value for this ChatterAnswersSettings.
     * 
     * @return facebookAuthProvider
     */
    public java.lang.String getFacebookAuthProvider() {
        return facebookAuthProvider;
    }


    /**
     * Sets the facebookAuthProvider value for this ChatterAnswersSettings.
     * 
     * @param facebookAuthProvider
     */
    public void setFacebookAuthProvider(java.lang.String facebookAuthProvider) {
        this.facebookAuthProvider = facebookAuthProvider;
    }


    /**
     * Gets the showInPortals value for this ChatterAnswersSettings.
     * 
     * @return showInPortals
     */
    public java.lang.Boolean getShowInPortals() {
        return showInPortals;
    }


    /**
     * Sets the showInPortals value for this ChatterAnswersSettings.
     * 
     * @param showInPortals
     */
    public void setShowInPortals(java.lang.Boolean showInPortals) {
        this.showInPortals = showInPortals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChatterAnswersSettings)) return false;
        ChatterAnswersSettings other = (ChatterAnswersSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.emailFollowersOnBestAnswer==null && other.getEmailFollowersOnBestAnswer()==null) || 
             (this.emailFollowersOnBestAnswer!=null &&
              this.emailFollowersOnBestAnswer.equals(other.getEmailFollowersOnBestAnswer()))) &&
            ((this.emailFollowersOnReply==null && other.getEmailFollowersOnReply()==null) || 
             (this.emailFollowersOnReply!=null &&
              this.emailFollowersOnReply.equals(other.getEmailFollowersOnReply()))) &&
            ((this.emailOwnerOnPrivateReply==null && other.getEmailOwnerOnPrivateReply()==null) || 
             (this.emailOwnerOnPrivateReply!=null &&
              this.emailOwnerOnPrivateReply.equals(other.getEmailOwnerOnPrivateReply()))) &&
            ((this.emailOwnerOnReply==null && other.getEmailOwnerOnReply()==null) || 
             (this.emailOwnerOnReply!=null &&
              this.emailOwnerOnReply.equals(other.getEmailOwnerOnReply()))) &&
            ((this.enableAnswerViaEmail==null && other.getEnableAnswerViaEmail()==null) || 
             (this.enableAnswerViaEmail!=null &&
              this.enableAnswerViaEmail.equals(other.getEnableAnswerViaEmail()))) &&
            this.enableChatterAnswers == other.isEnableChatterAnswers() &&
            ((this.enableFacebookSSO==null && other.getEnableFacebookSSO()==null) || 
             (this.enableFacebookSSO!=null &&
              this.enableFacebookSSO.equals(other.getEnableFacebookSSO()))) &&
            ((this.enableInlinePublisher==null && other.getEnableInlinePublisher()==null) || 
             (this.enableInlinePublisher!=null &&
              this.enableInlinePublisher.equals(other.getEnableInlinePublisher()))) &&
            ((this.enableReputation==null && other.getEnableReputation()==null) || 
             (this.enableReputation!=null &&
              this.enableReputation.equals(other.getEnableReputation()))) &&
            ((this.enableRichTextEditor==null && other.getEnableRichTextEditor()==null) || 
             (this.enableRichTextEditor!=null &&
              this.enableRichTextEditor.equals(other.getEnableRichTextEditor()))) &&
            ((this.facebookAuthProvider==null && other.getFacebookAuthProvider()==null) || 
             (this.facebookAuthProvider!=null &&
              this.facebookAuthProvider.equals(other.getFacebookAuthProvider()))) &&
            ((this.showInPortals==null && other.getShowInPortals()==null) || 
             (this.showInPortals!=null &&
              this.showInPortals.equals(other.getShowInPortals())));
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
        if (getEmailFollowersOnBestAnswer() != null) {
            _hashCode += getEmailFollowersOnBestAnswer().hashCode();
        }
        if (getEmailFollowersOnReply() != null) {
            _hashCode += getEmailFollowersOnReply().hashCode();
        }
        if (getEmailOwnerOnPrivateReply() != null) {
            _hashCode += getEmailOwnerOnPrivateReply().hashCode();
        }
        if (getEmailOwnerOnReply() != null) {
            _hashCode += getEmailOwnerOnReply().hashCode();
        }
        if (getEnableAnswerViaEmail() != null) {
            _hashCode += getEnableAnswerViaEmail().hashCode();
        }
        _hashCode += (isEnableChatterAnswers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEnableFacebookSSO() != null) {
            _hashCode += getEnableFacebookSSO().hashCode();
        }
        if (getEnableInlinePublisher() != null) {
            _hashCode += getEnableInlinePublisher().hashCode();
        }
        if (getEnableReputation() != null) {
            _hashCode += getEnableReputation().hashCode();
        }
        if (getEnableRichTextEditor() != null) {
            _hashCode += getEnableRichTextEditor().hashCode();
        }
        if (getFacebookAuthProvider() != null) {
            _hashCode += getFacebookAuthProvider().hashCode();
        }
        if (getShowInPortals() != null) {
            _hashCode += getShowInPortals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChatterAnswersSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChatterAnswersSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFollowersOnBestAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailFollowersOnBestAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFollowersOnReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailFollowersOnReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailOwnerOnPrivateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailOwnerOnPrivateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailOwnerOnReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailOwnerOnReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAnswerViaEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAnswerViaEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableChatterAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableChatterAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableFacebookSSO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableFacebookSSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableInlinePublisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableInlinePublisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableReputation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableReputation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableRichTextEditor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableRichTextEditor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facebookAuthProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "facebookAuthProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showInPortals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showInPortals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
