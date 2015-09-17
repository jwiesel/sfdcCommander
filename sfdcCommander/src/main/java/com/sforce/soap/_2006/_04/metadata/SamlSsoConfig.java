/**
 * SamlSsoConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SamlSsoConfig  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String attributeName;

    private java.lang.String attributeNameIdFormat;

    private java.lang.String decryptionCertificate;

    private java.lang.String errorUrl;

    private java.lang.String executionUserId;

    private com.sforce.soap._2006._04.metadata.SamlIdentityLocationType identityLocation;

    private com.sforce.soap._2006._04.metadata.SamlIdentityType identityMapping;

    private java.lang.String issuer;

    private java.lang.String loginUrl;

    private java.lang.String logoutUrl;

    private java.lang.String name;

    private java.lang.String oauthTokenEndpoint;

    private java.lang.Boolean redirectBinding;

    private java.lang.String requestSignatureMethod;

    private java.lang.String salesforceLoginUrl;

    private java.lang.String samlEntityId;

    private java.lang.String samlJitHandlerId;

    private com.sforce.soap._2006._04.metadata.SamlType samlVersion;

    private java.lang.Boolean userProvisioning;

    private java.lang.String validationCert;

    public SamlSsoConfig() {
    }

    public SamlSsoConfig(
           java.lang.String fullName,
           java.lang.String attributeName,
           java.lang.String attributeNameIdFormat,
           java.lang.String decryptionCertificate,
           java.lang.String errorUrl,
           java.lang.String executionUserId,
           com.sforce.soap._2006._04.metadata.SamlIdentityLocationType identityLocation,
           com.sforce.soap._2006._04.metadata.SamlIdentityType identityMapping,
           java.lang.String issuer,
           java.lang.String loginUrl,
           java.lang.String logoutUrl,
           java.lang.String name,
           java.lang.String oauthTokenEndpoint,
           java.lang.Boolean redirectBinding,
           java.lang.String requestSignatureMethod,
           java.lang.String salesforceLoginUrl,
           java.lang.String samlEntityId,
           java.lang.String samlJitHandlerId,
           com.sforce.soap._2006._04.metadata.SamlType samlVersion,
           java.lang.Boolean userProvisioning,
           java.lang.String validationCert) {
        super(
            fullName);
        this.attributeName = attributeName;
        this.attributeNameIdFormat = attributeNameIdFormat;
        this.decryptionCertificate = decryptionCertificate;
        this.errorUrl = errorUrl;
        this.executionUserId = executionUserId;
        this.identityLocation = identityLocation;
        this.identityMapping = identityMapping;
        this.issuer = issuer;
        this.loginUrl = loginUrl;
        this.logoutUrl = logoutUrl;
        this.name = name;
        this.oauthTokenEndpoint = oauthTokenEndpoint;
        this.redirectBinding = redirectBinding;
        this.requestSignatureMethod = requestSignatureMethod;
        this.salesforceLoginUrl = salesforceLoginUrl;
        this.samlEntityId = samlEntityId;
        this.samlJitHandlerId = samlJitHandlerId;
        this.samlVersion = samlVersion;
        this.userProvisioning = userProvisioning;
        this.validationCert = validationCert;
    }


    /**
     * Gets the attributeName value for this SamlSsoConfig.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this SamlSsoConfig.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the attributeNameIdFormat value for this SamlSsoConfig.
     * 
     * @return attributeNameIdFormat
     */
    public java.lang.String getAttributeNameIdFormat() {
        return attributeNameIdFormat;
    }


    /**
     * Sets the attributeNameIdFormat value for this SamlSsoConfig.
     * 
     * @param attributeNameIdFormat
     */
    public void setAttributeNameIdFormat(java.lang.String attributeNameIdFormat) {
        this.attributeNameIdFormat = attributeNameIdFormat;
    }


    /**
     * Gets the decryptionCertificate value for this SamlSsoConfig.
     * 
     * @return decryptionCertificate
     */
    public java.lang.String getDecryptionCertificate() {
        return decryptionCertificate;
    }


    /**
     * Sets the decryptionCertificate value for this SamlSsoConfig.
     * 
     * @param decryptionCertificate
     */
    public void setDecryptionCertificate(java.lang.String decryptionCertificate) {
        this.decryptionCertificate = decryptionCertificate;
    }


    /**
     * Gets the errorUrl value for this SamlSsoConfig.
     * 
     * @return errorUrl
     */
    public java.lang.String getErrorUrl() {
        return errorUrl;
    }


    /**
     * Sets the errorUrl value for this SamlSsoConfig.
     * 
     * @param errorUrl
     */
    public void setErrorUrl(java.lang.String errorUrl) {
        this.errorUrl = errorUrl;
    }


    /**
     * Gets the executionUserId value for this SamlSsoConfig.
     * 
     * @return executionUserId
     */
    public java.lang.String getExecutionUserId() {
        return executionUserId;
    }


    /**
     * Sets the executionUserId value for this SamlSsoConfig.
     * 
     * @param executionUserId
     */
    public void setExecutionUserId(java.lang.String executionUserId) {
        this.executionUserId = executionUserId;
    }


    /**
     * Gets the identityLocation value for this SamlSsoConfig.
     * 
     * @return identityLocation
     */
    public com.sforce.soap._2006._04.metadata.SamlIdentityLocationType getIdentityLocation() {
        return identityLocation;
    }


    /**
     * Sets the identityLocation value for this SamlSsoConfig.
     * 
     * @param identityLocation
     */
    public void setIdentityLocation(com.sforce.soap._2006._04.metadata.SamlIdentityLocationType identityLocation) {
        this.identityLocation = identityLocation;
    }


    /**
     * Gets the identityMapping value for this SamlSsoConfig.
     * 
     * @return identityMapping
     */
    public com.sforce.soap._2006._04.metadata.SamlIdentityType getIdentityMapping() {
        return identityMapping;
    }


    /**
     * Sets the identityMapping value for this SamlSsoConfig.
     * 
     * @param identityMapping
     */
    public void setIdentityMapping(com.sforce.soap._2006._04.metadata.SamlIdentityType identityMapping) {
        this.identityMapping = identityMapping;
    }


    /**
     * Gets the issuer value for this SamlSsoConfig.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this SamlSsoConfig.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the loginUrl value for this SamlSsoConfig.
     * 
     * @return loginUrl
     */
    public java.lang.String getLoginUrl() {
        return loginUrl;
    }


    /**
     * Sets the loginUrl value for this SamlSsoConfig.
     * 
     * @param loginUrl
     */
    public void setLoginUrl(java.lang.String loginUrl) {
        this.loginUrl = loginUrl;
    }


    /**
     * Gets the logoutUrl value for this SamlSsoConfig.
     * 
     * @return logoutUrl
     */
    public java.lang.String getLogoutUrl() {
        return logoutUrl;
    }


    /**
     * Sets the logoutUrl value for this SamlSsoConfig.
     * 
     * @param logoutUrl
     */
    public void setLogoutUrl(java.lang.String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }


    /**
     * Gets the name value for this SamlSsoConfig.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SamlSsoConfig.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the oauthTokenEndpoint value for this SamlSsoConfig.
     * 
     * @return oauthTokenEndpoint
     */
    public java.lang.String getOauthTokenEndpoint() {
        return oauthTokenEndpoint;
    }


    /**
     * Sets the oauthTokenEndpoint value for this SamlSsoConfig.
     * 
     * @param oauthTokenEndpoint
     */
    public void setOauthTokenEndpoint(java.lang.String oauthTokenEndpoint) {
        this.oauthTokenEndpoint = oauthTokenEndpoint;
    }


    /**
     * Gets the redirectBinding value for this SamlSsoConfig.
     * 
     * @return redirectBinding
     */
    public java.lang.Boolean getRedirectBinding() {
        return redirectBinding;
    }


    /**
     * Sets the redirectBinding value for this SamlSsoConfig.
     * 
     * @param redirectBinding
     */
    public void setRedirectBinding(java.lang.Boolean redirectBinding) {
        this.redirectBinding = redirectBinding;
    }


    /**
     * Gets the requestSignatureMethod value for this SamlSsoConfig.
     * 
     * @return requestSignatureMethod
     */
    public java.lang.String getRequestSignatureMethod() {
        return requestSignatureMethod;
    }


    /**
     * Sets the requestSignatureMethod value for this SamlSsoConfig.
     * 
     * @param requestSignatureMethod
     */
    public void setRequestSignatureMethod(java.lang.String requestSignatureMethod) {
        this.requestSignatureMethod = requestSignatureMethod;
    }


    /**
     * Gets the salesforceLoginUrl value for this SamlSsoConfig.
     * 
     * @return salesforceLoginUrl
     */
    public java.lang.String getSalesforceLoginUrl() {
        return salesforceLoginUrl;
    }


    /**
     * Sets the salesforceLoginUrl value for this SamlSsoConfig.
     * 
     * @param salesforceLoginUrl
     */
    public void setSalesforceLoginUrl(java.lang.String salesforceLoginUrl) {
        this.salesforceLoginUrl = salesforceLoginUrl;
    }


    /**
     * Gets the samlEntityId value for this SamlSsoConfig.
     * 
     * @return samlEntityId
     */
    public java.lang.String getSamlEntityId() {
        return samlEntityId;
    }


    /**
     * Sets the samlEntityId value for this SamlSsoConfig.
     * 
     * @param samlEntityId
     */
    public void setSamlEntityId(java.lang.String samlEntityId) {
        this.samlEntityId = samlEntityId;
    }


    /**
     * Gets the samlJitHandlerId value for this SamlSsoConfig.
     * 
     * @return samlJitHandlerId
     */
    public java.lang.String getSamlJitHandlerId() {
        return samlJitHandlerId;
    }


    /**
     * Sets the samlJitHandlerId value for this SamlSsoConfig.
     * 
     * @param samlJitHandlerId
     */
    public void setSamlJitHandlerId(java.lang.String samlJitHandlerId) {
        this.samlJitHandlerId = samlJitHandlerId;
    }


    /**
     * Gets the samlVersion value for this SamlSsoConfig.
     * 
     * @return samlVersion
     */
    public com.sforce.soap._2006._04.metadata.SamlType getSamlVersion() {
        return samlVersion;
    }


    /**
     * Sets the samlVersion value for this SamlSsoConfig.
     * 
     * @param samlVersion
     */
    public void setSamlVersion(com.sforce.soap._2006._04.metadata.SamlType samlVersion) {
        this.samlVersion = samlVersion;
    }


    /**
     * Gets the userProvisioning value for this SamlSsoConfig.
     * 
     * @return userProvisioning
     */
    public java.lang.Boolean getUserProvisioning() {
        return userProvisioning;
    }


    /**
     * Sets the userProvisioning value for this SamlSsoConfig.
     * 
     * @param userProvisioning
     */
    public void setUserProvisioning(java.lang.Boolean userProvisioning) {
        this.userProvisioning = userProvisioning;
    }


    /**
     * Gets the validationCert value for this SamlSsoConfig.
     * 
     * @return validationCert
     */
    public java.lang.String getValidationCert() {
        return validationCert;
    }


    /**
     * Sets the validationCert value for this SamlSsoConfig.
     * 
     * @param validationCert
     */
    public void setValidationCert(java.lang.String validationCert) {
        this.validationCert = validationCert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SamlSsoConfig)) return false;
        SamlSsoConfig other = (SamlSsoConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.attributeNameIdFormat==null && other.getAttributeNameIdFormat()==null) || 
             (this.attributeNameIdFormat!=null &&
              this.attributeNameIdFormat.equals(other.getAttributeNameIdFormat()))) &&
            ((this.decryptionCertificate==null && other.getDecryptionCertificate()==null) || 
             (this.decryptionCertificate!=null &&
              this.decryptionCertificate.equals(other.getDecryptionCertificate()))) &&
            ((this.errorUrl==null && other.getErrorUrl()==null) || 
             (this.errorUrl!=null &&
              this.errorUrl.equals(other.getErrorUrl()))) &&
            ((this.executionUserId==null && other.getExecutionUserId()==null) || 
             (this.executionUserId!=null &&
              this.executionUserId.equals(other.getExecutionUserId()))) &&
            ((this.identityLocation==null && other.getIdentityLocation()==null) || 
             (this.identityLocation!=null &&
              this.identityLocation.equals(other.getIdentityLocation()))) &&
            ((this.identityMapping==null && other.getIdentityMapping()==null) || 
             (this.identityMapping!=null &&
              this.identityMapping.equals(other.getIdentityMapping()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.loginUrl==null && other.getLoginUrl()==null) || 
             (this.loginUrl!=null &&
              this.loginUrl.equals(other.getLoginUrl()))) &&
            ((this.logoutUrl==null && other.getLogoutUrl()==null) || 
             (this.logoutUrl!=null &&
              this.logoutUrl.equals(other.getLogoutUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.oauthTokenEndpoint==null && other.getOauthTokenEndpoint()==null) || 
             (this.oauthTokenEndpoint!=null &&
              this.oauthTokenEndpoint.equals(other.getOauthTokenEndpoint()))) &&
            ((this.redirectBinding==null && other.getRedirectBinding()==null) || 
             (this.redirectBinding!=null &&
              this.redirectBinding.equals(other.getRedirectBinding()))) &&
            ((this.requestSignatureMethod==null && other.getRequestSignatureMethod()==null) || 
             (this.requestSignatureMethod!=null &&
              this.requestSignatureMethod.equals(other.getRequestSignatureMethod()))) &&
            ((this.salesforceLoginUrl==null && other.getSalesforceLoginUrl()==null) || 
             (this.salesforceLoginUrl!=null &&
              this.salesforceLoginUrl.equals(other.getSalesforceLoginUrl()))) &&
            ((this.samlEntityId==null && other.getSamlEntityId()==null) || 
             (this.samlEntityId!=null &&
              this.samlEntityId.equals(other.getSamlEntityId()))) &&
            ((this.samlJitHandlerId==null && other.getSamlJitHandlerId()==null) || 
             (this.samlJitHandlerId!=null &&
              this.samlJitHandlerId.equals(other.getSamlJitHandlerId()))) &&
            ((this.samlVersion==null && other.getSamlVersion()==null) || 
             (this.samlVersion!=null &&
              this.samlVersion.equals(other.getSamlVersion()))) &&
            ((this.userProvisioning==null && other.getUserProvisioning()==null) || 
             (this.userProvisioning!=null &&
              this.userProvisioning.equals(other.getUserProvisioning()))) &&
            ((this.validationCert==null && other.getValidationCert()==null) || 
             (this.validationCert!=null &&
              this.validationCert.equals(other.getValidationCert())));
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
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getAttributeNameIdFormat() != null) {
            _hashCode += getAttributeNameIdFormat().hashCode();
        }
        if (getDecryptionCertificate() != null) {
            _hashCode += getDecryptionCertificate().hashCode();
        }
        if (getErrorUrl() != null) {
            _hashCode += getErrorUrl().hashCode();
        }
        if (getExecutionUserId() != null) {
            _hashCode += getExecutionUserId().hashCode();
        }
        if (getIdentityLocation() != null) {
            _hashCode += getIdentityLocation().hashCode();
        }
        if (getIdentityMapping() != null) {
            _hashCode += getIdentityMapping().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getLoginUrl() != null) {
            _hashCode += getLoginUrl().hashCode();
        }
        if (getLogoutUrl() != null) {
            _hashCode += getLogoutUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOauthTokenEndpoint() != null) {
            _hashCode += getOauthTokenEndpoint().hashCode();
        }
        if (getRedirectBinding() != null) {
            _hashCode += getRedirectBinding().hashCode();
        }
        if (getRequestSignatureMethod() != null) {
            _hashCode += getRequestSignatureMethod().hashCode();
        }
        if (getSalesforceLoginUrl() != null) {
            _hashCode += getSalesforceLoginUrl().hashCode();
        }
        if (getSamlEntityId() != null) {
            _hashCode += getSamlEntityId().hashCode();
        }
        if (getSamlJitHandlerId() != null) {
            _hashCode += getSamlJitHandlerId().hashCode();
        }
        if (getSamlVersion() != null) {
            _hashCode += getSamlVersion().hashCode();
        }
        if (getUserProvisioning() != null) {
            _hashCode += getUserProvisioning().hashCode();
        }
        if (getValidationCert() != null) {
            _hashCode += getValidationCert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SamlSsoConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlSsoConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeNameIdFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "attributeNameIdFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decryptionCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "decryptionCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "errorUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "executionUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "identityLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlIdentityLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "identityMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlIdentityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "loginUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoutUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logoutUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oauthTokenEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "oauthTokenEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "redirectBinding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestSignatureMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "requestSignatureMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceLoginUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "salesforceLoginUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlJitHandlerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlJitHandlerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userProvisioning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userProvisioning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationCert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "validationCert"));
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
