/**
 * NamedCredential.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class NamedCredential  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String authProvider;

    private java.lang.String certificate;

    private java.lang.String endpoint;

    private java.lang.String label;

    private java.lang.String oauthRefreshToken;

    private java.lang.String oauthScope;

    private java.lang.String oauthToken;

    private java.lang.String password;

    private com.sforce.soap._2006._04.metadata.ExternalPrincipalType principalType;

    private com.sforce.soap._2006._04.metadata.AuthenticationProtocol protocol;

    private java.lang.String username;

    public NamedCredential() {
    }

    public NamedCredential(
           java.lang.String fullName,
           java.lang.String authProvider,
           java.lang.String certificate,
           java.lang.String endpoint,
           java.lang.String label,
           java.lang.String oauthRefreshToken,
           java.lang.String oauthScope,
           java.lang.String oauthToken,
           java.lang.String password,
           com.sforce.soap._2006._04.metadata.ExternalPrincipalType principalType,
           com.sforce.soap._2006._04.metadata.AuthenticationProtocol protocol,
           java.lang.String username) {
        super(
            fullName);
        this.authProvider = authProvider;
        this.certificate = certificate;
        this.endpoint = endpoint;
        this.label = label;
        this.oauthRefreshToken = oauthRefreshToken;
        this.oauthScope = oauthScope;
        this.oauthToken = oauthToken;
        this.password = password;
        this.principalType = principalType;
        this.protocol = protocol;
        this.username = username;
    }


    /**
     * Gets the authProvider value for this NamedCredential.
     * 
     * @return authProvider
     */
    public java.lang.String getAuthProvider() {
        return authProvider;
    }


    /**
     * Sets the authProvider value for this NamedCredential.
     * 
     * @param authProvider
     */
    public void setAuthProvider(java.lang.String authProvider) {
        this.authProvider = authProvider;
    }


    /**
     * Gets the certificate value for this NamedCredential.
     * 
     * @return certificate
     */
    public java.lang.String getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this NamedCredential.
     * 
     * @param certificate
     */
    public void setCertificate(java.lang.String certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the endpoint value for this NamedCredential.
     * 
     * @return endpoint
     */
    public java.lang.String getEndpoint() {
        return endpoint;
    }


    /**
     * Sets the endpoint value for this NamedCredential.
     * 
     * @param endpoint
     */
    public void setEndpoint(java.lang.String endpoint) {
        this.endpoint = endpoint;
    }


    /**
     * Gets the label value for this NamedCredential.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this NamedCredential.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the oauthRefreshToken value for this NamedCredential.
     * 
     * @return oauthRefreshToken
     */
    public java.lang.String getOauthRefreshToken() {
        return oauthRefreshToken;
    }


    /**
     * Sets the oauthRefreshToken value for this NamedCredential.
     * 
     * @param oauthRefreshToken
     */
    public void setOauthRefreshToken(java.lang.String oauthRefreshToken) {
        this.oauthRefreshToken = oauthRefreshToken;
    }


    /**
     * Gets the oauthScope value for this NamedCredential.
     * 
     * @return oauthScope
     */
    public java.lang.String getOauthScope() {
        return oauthScope;
    }


    /**
     * Sets the oauthScope value for this NamedCredential.
     * 
     * @param oauthScope
     */
    public void setOauthScope(java.lang.String oauthScope) {
        this.oauthScope = oauthScope;
    }


    /**
     * Gets the oauthToken value for this NamedCredential.
     * 
     * @return oauthToken
     */
    public java.lang.String getOauthToken() {
        return oauthToken;
    }


    /**
     * Sets the oauthToken value for this NamedCredential.
     * 
     * @param oauthToken
     */
    public void setOauthToken(java.lang.String oauthToken) {
        this.oauthToken = oauthToken;
    }


    /**
     * Gets the password value for this NamedCredential.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this NamedCredential.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the principalType value for this NamedCredential.
     * 
     * @return principalType
     */
    public com.sforce.soap._2006._04.metadata.ExternalPrincipalType getPrincipalType() {
        return principalType;
    }


    /**
     * Sets the principalType value for this NamedCredential.
     * 
     * @param principalType
     */
    public void setPrincipalType(com.sforce.soap._2006._04.metadata.ExternalPrincipalType principalType) {
        this.principalType = principalType;
    }


    /**
     * Gets the protocol value for this NamedCredential.
     * 
     * @return protocol
     */
    public com.sforce.soap._2006._04.metadata.AuthenticationProtocol getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this NamedCredential.
     * 
     * @param protocol
     */
    public void setProtocol(com.sforce.soap._2006._04.metadata.AuthenticationProtocol protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the username value for this NamedCredential.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this NamedCredential.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NamedCredential)) return false;
        NamedCredential other = (NamedCredential) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authProvider==null && other.getAuthProvider()==null) || 
             (this.authProvider!=null &&
              this.authProvider.equals(other.getAuthProvider()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            ((this.endpoint==null && other.getEndpoint()==null) || 
             (this.endpoint!=null &&
              this.endpoint.equals(other.getEndpoint()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.oauthRefreshToken==null && other.getOauthRefreshToken()==null) || 
             (this.oauthRefreshToken!=null &&
              this.oauthRefreshToken.equals(other.getOauthRefreshToken()))) &&
            ((this.oauthScope==null && other.getOauthScope()==null) || 
             (this.oauthScope!=null &&
              this.oauthScope.equals(other.getOauthScope()))) &&
            ((this.oauthToken==null && other.getOauthToken()==null) || 
             (this.oauthToken!=null &&
              this.oauthToken.equals(other.getOauthToken()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.principalType==null && other.getPrincipalType()==null) || 
             (this.principalType!=null &&
              this.principalType.equals(other.getPrincipalType()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getAuthProvider() != null) {
            _hashCode += getAuthProvider().hashCode();
        }
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        if (getEndpoint() != null) {
            _hashCode += getEndpoint().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getOauthRefreshToken() != null) {
            _hashCode += getOauthRefreshToken().hashCode();
        }
        if (getOauthScope() != null) {
            _hashCode += getOauthScope().hashCode();
        }
        if (getOauthToken() != null) {
            _hashCode += getOauthToken().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPrincipalType() != null) {
            _hashCode += getPrincipalType().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NamedCredential.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NamedCredential"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "authProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("endpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "endpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oauthRefreshToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "oauthRefreshToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oauthScope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "oauthScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oauthToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "oauthToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "principalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ExternalPrincipalType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuthenticationProtocol"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "username"));
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
