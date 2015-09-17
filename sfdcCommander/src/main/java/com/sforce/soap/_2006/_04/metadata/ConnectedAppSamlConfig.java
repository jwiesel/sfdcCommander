/**
 * ConnectedAppSamlConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ConnectedAppSamlConfig  implements java.io.Serializable {
    private java.lang.String acsUrl;

    private java.lang.String certificate;

    private java.lang.String encryptionCertificate;

    private com.sforce.soap._2006._04.metadata.SamlEncryptionType encryptionType;

    private java.lang.String entityUrl;

    private java.lang.String issuer;

    private com.sforce.soap._2006._04.metadata.SamlNameIdFormatType samlNameIdFormat;

    private java.lang.String samlSubjectCustomAttr;

    private com.sforce.soap._2006._04.metadata.SamlSubjectType samlSubjectType;

    public ConnectedAppSamlConfig() {
    }

    public ConnectedAppSamlConfig(
           java.lang.String acsUrl,
           java.lang.String certificate,
           java.lang.String encryptionCertificate,
           com.sforce.soap._2006._04.metadata.SamlEncryptionType encryptionType,
           java.lang.String entityUrl,
           java.lang.String issuer,
           com.sforce.soap._2006._04.metadata.SamlNameIdFormatType samlNameIdFormat,
           java.lang.String samlSubjectCustomAttr,
           com.sforce.soap._2006._04.metadata.SamlSubjectType samlSubjectType) {
           this.acsUrl = acsUrl;
           this.certificate = certificate;
           this.encryptionCertificate = encryptionCertificate;
           this.encryptionType = encryptionType;
           this.entityUrl = entityUrl;
           this.issuer = issuer;
           this.samlNameIdFormat = samlNameIdFormat;
           this.samlSubjectCustomAttr = samlSubjectCustomAttr;
           this.samlSubjectType = samlSubjectType;
    }


    /**
     * Gets the acsUrl value for this ConnectedAppSamlConfig.
     * 
     * @return acsUrl
     */
    public java.lang.String getAcsUrl() {
        return acsUrl;
    }


    /**
     * Sets the acsUrl value for this ConnectedAppSamlConfig.
     * 
     * @param acsUrl
     */
    public void setAcsUrl(java.lang.String acsUrl) {
        this.acsUrl = acsUrl;
    }


    /**
     * Gets the certificate value for this ConnectedAppSamlConfig.
     * 
     * @return certificate
     */
    public java.lang.String getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this ConnectedAppSamlConfig.
     * 
     * @param certificate
     */
    public void setCertificate(java.lang.String certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the encryptionCertificate value for this ConnectedAppSamlConfig.
     * 
     * @return encryptionCertificate
     */
    public java.lang.String getEncryptionCertificate() {
        return encryptionCertificate;
    }


    /**
     * Sets the encryptionCertificate value for this ConnectedAppSamlConfig.
     * 
     * @param encryptionCertificate
     */
    public void setEncryptionCertificate(java.lang.String encryptionCertificate) {
        this.encryptionCertificate = encryptionCertificate;
    }


    /**
     * Gets the encryptionType value for this ConnectedAppSamlConfig.
     * 
     * @return encryptionType
     */
    public com.sforce.soap._2006._04.metadata.SamlEncryptionType getEncryptionType() {
        return encryptionType;
    }


    /**
     * Sets the encryptionType value for this ConnectedAppSamlConfig.
     * 
     * @param encryptionType
     */
    public void setEncryptionType(com.sforce.soap._2006._04.metadata.SamlEncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }


    /**
     * Gets the entityUrl value for this ConnectedAppSamlConfig.
     * 
     * @return entityUrl
     */
    public java.lang.String getEntityUrl() {
        return entityUrl;
    }


    /**
     * Sets the entityUrl value for this ConnectedAppSamlConfig.
     * 
     * @param entityUrl
     */
    public void setEntityUrl(java.lang.String entityUrl) {
        this.entityUrl = entityUrl;
    }


    /**
     * Gets the issuer value for this ConnectedAppSamlConfig.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this ConnectedAppSamlConfig.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the samlNameIdFormat value for this ConnectedAppSamlConfig.
     * 
     * @return samlNameIdFormat
     */
    public com.sforce.soap._2006._04.metadata.SamlNameIdFormatType getSamlNameIdFormat() {
        return samlNameIdFormat;
    }


    /**
     * Sets the samlNameIdFormat value for this ConnectedAppSamlConfig.
     * 
     * @param samlNameIdFormat
     */
    public void setSamlNameIdFormat(com.sforce.soap._2006._04.metadata.SamlNameIdFormatType samlNameIdFormat) {
        this.samlNameIdFormat = samlNameIdFormat;
    }


    /**
     * Gets the samlSubjectCustomAttr value for this ConnectedAppSamlConfig.
     * 
     * @return samlSubjectCustomAttr
     */
    public java.lang.String getSamlSubjectCustomAttr() {
        return samlSubjectCustomAttr;
    }


    /**
     * Sets the samlSubjectCustomAttr value for this ConnectedAppSamlConfig.
     * 
     * @param samlSubjectCustomAttr
     */
    public void setSamlSubjectCustomAttr(java.lang.String samlSubjectCustomAttr) {
        this.samlSubjectCustomAttr = samlSubjectCustomAttr;
    }


    /**
     * Gets the samlSubjectType value for this ConnectedAppSamlConfig.
     * 
     * @return samlSubjectType
     */
    public com.sforce.soap._2006._04.metadata.SamlSubjectType getSamlSubjectType() {
        return samlSubjectType;
    }


    /**
     * Sets the samlSubjectType value for this ConnectedAppSamlConfig.
     * 
     * @param samlSubjectType
     */
    public void setSamlSubjectType(com.sforce.soap._2006._04.metadata.SamlSubjectType samlSubjectType) {
        this.samlSubjectType = samlSubjectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectedAppSamlConfig)) return false;
        ConnectedAppSamlConfig other = (ConnectedAppSamlConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acsUrl==null && other.getAcsUrl()==null) || 
             (this.acsUrl!=null &&
              this.acsUrl.equals(other.getAcsUrl()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            ((this.encryptionCertificate==null && other.getEncryptionCertificate()==null) || 
             (this.encryptionCertificate!=null &&
              this.encryptionCertificate.equals(other.getEncryptionCertificate()))) &&
            ((this.encryptionType==null && other.getEncryptionType()==null) || 
             (this.encryptionType!=null &&
              this.encryptionType.equals(other.getEncryptionType()))) &&
            ((this.entityUrl==null && other.getEntityUrl()==null) || 
             (this.entityUrl!=null &&
              this.entityUrl.equals(other.getEntityUrl()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.samlNameIdFormat==null && other.getSamlNameIdFormat()==null) || 
             (this.samlNameIdFormat!=null &&
              this.samlNameIdFormat.equals(other.getSamlNameIdFormat()))) &&
            ((this.samlSubjectCustomAttr==null && other.getSamlSubjectCustomAttr()==null) || 
             (this.samlSubjectCustomAttr!=null &&
              this.samlSubjectCustomAttr.equals(other.getSamlSubjectCustomAttr()))) &&
            ((this.samlSubjectType==null && other.getSamlSubjectType()==null) || 
             (this.samlSubjectType!=null &&
              this.samlSubjectType.equals(other.getSamlSubjectType())));
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
        if (getAcsUrl() != null) {
            _hashCode += getAcsUrl().hashCode();
        }
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        if (getEncryptionCertificate() != null) {
            _hashCode += getEncryptionCertificate().hashCode();
        }
        if (getEncryptionType() != null) {
            _hashCode += getEncryptionType().hashCode();
        }
        if (getEntityUrl() != null) {
            _hashCode += getEntityUrl().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getSamlNameIdFormat() != null) {
            _hashCode += getSamlNameIdFormat().hashCode();
        }
        if (getSamlSubjectCustomAttr() != null) {
            _hashCode += getSamlSubjectCustomAttr().hashCode();
        }
        if (getSamlSubjectType() != null) {
            _hashCode += getSamlSubjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectedAppSamlConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppSamlConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "acsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "encryptionCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "encryptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlEncryptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entityUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlNameIdFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlNameIdFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlNameIdFormatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlSubjectCustomAttr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlSubjectCustomAttr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlSubjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlSubjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlSubjectType"));
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
