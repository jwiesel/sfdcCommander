/**
 * ConnectedAppOauthConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ConnectedAppOauthConfig  implements java.io.Serializable {
    private java.lang.String callbackUrl;

    private java.lang.String certificate;

    private java.lang.String consumerKey;

    private java.lang.String consumerSecret;

    private com.sforce.soap._2006._04.metadata.ConnectedAppOauthAccessScope[] scopes;

    public ConnectedAppOauthConfig() {
    }

    public ConnectedAppOauthConfig(
           java.lang.String callbackUrl,
           java.lang.String certificate,
           java.lang.String consumerKey,
           java.lang.String consumerSecret,
           com.sforce.soap._2006._04.metadata.ConnectedAppOauthAccessScope[] scopes) {
           this.callbackUrl = callbackUrl;
           this.certificate = certificate;
           this.consumerKey = consumerKey;
           this.consumerSecret = consumerSecret;
           this.scopes = scopes;
    }


    /**
     * Gets the callbackUrl value for this ConnectedAppOauthConfig.
     * 
     * @return callbackUrl
     */
    public java.lang.String getCallbackUrl() {
        return callbackUrl;
    }


    /**
     * Sets the callbackUrl value for this ConnectedAppOauthConfig.
     * 
     * @param callbackUrl
     */
    public void setCallbackUrl(java.lang.String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    /**
     * Gets the certificate value for this ConnectedAppOauthConfig.
     * 
     * @return certificate
     */
    public java.lang.String getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this ConnectedAppOauthConfig.
     * 
     * @param certificate
     */
    public void setCertificate(java.lang.String certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the consumerKey value for this ConnectedAppOauthConfig.
     * 
     * @return consumerKey
     */
    public java.lang.String getConsumerKey() {
        return consumerKey;
    }


    /**
     * Sets the consumerKey value for this ConnectedAppOauthConfig.
     * 
     * @param consumerKey
     */
    public void setConsumerKey(java.lang.String consumerKey) {
        this.consumerKey = consumerKey;
    }


    /**
     * Gets the consumerSecret value for this ConnectedAppOauthConfig.
     * 
     * @return consumerSecret
     */
    public java.lang.String getConsumerSecret() {
        return consumerSecret;
    }


    /**
     * Sets the consumerSecret value for this ConnectedAppOauthConfig.
     * 
     * @param consumerSecret
     */
    public void setConsumerSecret(java.lang.String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }


    /**
     * Gets the scopes value for this ConnectedAppOauthConfig.
     * 
     * @return scopes
     */
    public com.sforce.soap._2006._04.metadata.ConnectedAppOauthAccessScope[] getScopes() {
        return scopes;
    }


    /**
     * Sets the scopes value for this ConnectedAppOauthConfig.
     * 
     * @param scopes
     */
    public void setScopes(com.sforce.soap._2006._04.metadata.ConnectedAppOauthAccessScope[] scopes) {
        this.scopes = scopes;
    }

    public com.sforce.soap._2006._04.metadata.ConnectedAppOauthAccessScope getScopes(int i) {
        return this.scopes[i];
    }

    public void setScopes(int i, com.sforce.soap._2006._04.metadata.ConnectedAppOauthAccessScope _value) {
        this.scopes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectedAppOauthConfig)) return false;
        ConnectedAppOauthConfig other = (ConnectedAppOauthConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callbackUrl==null && other.getCallbackUrl()==null) || 
             (this.callbackUrl!=null &&
              this.callbackUrl.equals(other.getCallbackUrl()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            ((this.consumerKey==null && other.getConsumerKey()==null) || 
             (this.consumerKey!=null &&
              this.consumerKey.equals(other.getConsumerKey()))) &&
            ((this.consumerSecret==null && other.getConsumerSecret()==null) || 
             (this.consumerSecret!=null &&
              this.consumerSecret.equals(other.getConsumerSecret()))) &&
            ((this.scopes==null && other.getScopes()==null) || 
             (this.scopes!=null &&
              java.util.Arrays.equals(this.scopes, other.getScopes())));
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
        if (getCallbackUrl() != null) {
            _hashCode += getCallbackUrl().hashCode();
        }
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        if (getConsumerKey() != null) {
            _hashCode += getConsumerKey().hashCode();
        }
        if (getConsumerSecret() != null) {
            _hashCode += getConsumerSecret().hashCode();
        }
        if (getScopes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScopes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScopes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectedAppOauthConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppOauthConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "callbackUrl"));
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
        elemField.setFieldName("consumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "consumerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "consumerSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scopes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppOauthAccessScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
