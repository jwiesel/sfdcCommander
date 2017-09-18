/**
 * AuthProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AuthProvider  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String authorizeUrl;

    private java.lang.String consumerKey;

    private java.lang.String consumerSecret;

    private java.lang.String customMetadataTypeRecord;

    private java.lang.String defaultScopes;

    private java.lang.String errorUrl;

    private java.lang.String executionUser;

    private java.lang.String friendlyName;

    private java.lang.String iconUrl;

    private java.lang.String idTokenIssuer;

    private java.lang.Boolean includeOrgIdInIdentifier;

    private java.lang.String logoutUrl;

    private java.lang.String plugin;

    private java.lang.String portal;

    private com.sforce.soap._2006._04.metadata.AuthProviderType providerType;

    private java.lang.String registrationHandler;

    private java.lang.Boolean sendAccessTokenInHeader;

    private java.lang.Boolean sendClientCredentialsInHeader;

    private java.lang.String tokenUrl;

    private java.lang.String userInfoUrl;

    public AuthProvider() {
    }

    public AuthProvider(
           java.lang.String fullName,
           java.lang.String authorizeUrl,
           java.lang.String consumerKey,
           java.lang.String consumerSecret,
           java.lang.String customMetadataTypeRecord,
           java.lang.String defaultScopes,
           java.lang.String errorUrl,
           java.lang.String executionUser,
           java.lang.String friendlyName,
           java.lang.String iconUrl,
           java.lang.String idTokenIssuer,
           java.lang.Boolean includeOrgIdInIdentifier,
           java.lang.String logoutUrl,
           java.lang.String plugin,
           java.lang.String portal,
           com.sforce.soap._2006._04.metadata.AuthProviderType providerType,
           java.lang.String registrationHandler,
           java.lang.Boolean sendAccessTokenInHeader,
           java.lang.Boolean sendClientCredentialsInHeader,
           java.lang.String tokenUrl,
           java.lang.String userInfoUrl) {
        super(
            fullName);
        this.authorizeUrl = authorizeUrl;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.customMetadataTypeRecord = customMetadataTypeRecord;
        this.defaultScopes = defaultScopes;
        this.errorUrl = errorUrl;
        this.executionUser = executionUser;
        this.friendlyName = friendlyName;
        this.iconUrl = iconUrl;
        this.idTokenIssuer = idTokenIssuer;
        this.includeOrgIdInIdentifier = includeOrgIdInIdentifier;
        this.logoutUrl = logoutUrl;
        this.plugin = plugin;
        this.portal = portal;
        this.providerType = providerType;
        this.registrationHandler = registrationHandler;
        this.sendAccessTokenInHeader = sendAccessTokenInHeader;
        this.sendClientCredentialsInHeader = sendClientCredentialsInHeader;
        this.tokenUrl = tokenUrl;
        this.userInfoUrl = userInfoUrl;
    }


    /**
     * Gets the authorizeUrl value for this AuthProvider.
     * 
     * @return authorizeUrl
     */
    public java.lang.String getAuthorizeUrl() {
        return authorizeUrl;
    }


    /**
     * Sets the authorizeUrl value for this AuthProvider.
     * 
     * @param authorizeUrl
     */
    public void setAuthorizeUrl(java.lang.String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
    }


    /**
     * Gets the consumerKey value for this AuthProvider.
     * 
     * @return consumerKey
     */
    public java.lang.String getConsumerKey() {
        return consumerKey;
    }


    /**
     * Sets the consumerKey value for this AuthProvider.
     * 
     * @param consumerKey
     */
    public void setConsumerKey(java.lang.String consumerKey) {
        this.consumerKey = consumerKey;
    }


    /**
     * Gets the consumerSecret value for this AuthProvider.
     * 
     * @return consumerSecret
     */
    public java.lang.String getConsumerSecret() {
        return consumerSecret;
    }


    /**
     * Sets the consumerSecret value for this AuthProvider.
     * 
     * @param consumerSecret
     */
    public void setConsumerSecret(java.lang.String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }


    /**
     * Gets the customMetadataTypeRecord value for this AuthProvider.
     * 
     * @return customMetadataTypeRecord
     */
    public java.lang.String getCustomMetadataTypeRecord() {
        return customMetadataTypeRecord;
    }


    /**
     * Sets the customMetadataTypeRecord value for this AuthProvider.
     * 
     * @param customMetadataTypeRecord
     */
    public void setCustomMetadataTypeRecord(java.lang.String customMetadataTypeRecord) {
        this.customMetadataTypeRecord = customMetadataTypeRecord;
    }


    /**
     * Gets the defaultScopes value for this AuthProvider.
     * 
     * @return defaultScopes
     */
    public java.lang.String getDefaultScopes() {
        return defaultScopes;
    }


    /**
     * Sets the defaultScopes value for this AuthProvider.
     * 
     * @param defaultScopes
     */
    public void setDefaultScopes(java.lang.String defaultScopes) {
        this.defaultScopes = defaultScopes;
    }


    /**
     * Gets the errorUrl value for this AuthProvider.
     * 
     * @return errorUrl
     */
    public java.lang.String getErrorUrl() {
        return errorUrl;
    }


    /**
     * Sets the errorUrl value for this AuthProvider.
     * 
     * @param errorUrl
     */
    public void setErrorUrl(java.lang.String errorUrl) {
        this.errorUrl = errorUrl;
    }


    /**
     * Gets the executionUser value for this AuthProvider.
     * 
     * @return executionUser
     */
    public java.lang.String getExecutionUser() {
        return executionUser;
    }


    /**
     * Sets the executionUser value for this AuthProvider.
     * 
     * @param executionUser
     */
    public void setExecutionUser(java.lang.String executionUser) {
        this.executionUser = executionUser;
    }


    /**
     * Gets the friendlyName value for this AuthProvider.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this AuthProvider.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the iconUrl value for this AuthProvider.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this AuthProvider.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the idTokenIssuer value for this AuthProvider.
     * 
     * @return idTokenIssuer
     */
    public java.lang.String getIdTokenIssuer() {
        return idTokenIssuer;
    }


    /**
     * Sets the idTokenIssuer value for this AuthProvider.
     * 
     * @param idTokenIssuer
     */
    public void setIdTokenIssuer(java.lang.String idTokenIssuer) {
        this.idTokenIssuer = idTokenIssuer;
    }


    /**
     * Gets the includeOrgIdInIdentifier value for this AuthProvider.
     * 
     * @return includeOrgIdInIdentifier
     */
    public java.lang.Boolean getIncludeOrgIdInIdentifier() {
        return includeOrgIdInIdentifier;
    }


    /**
     * Sets the includeOrgIdInIdentifier value for this AuthProvider.
     * 
     * @param includeOrgIdInIdentifier
     */
    public void setIncludeOrgIdInIdentifier(java.lang.Boolean includeOrgIdInIdentifier) {
        this.includeOrgIdInIdentifier = includeOrgIdInIdentifier;
    }


    /**
     * Gets the logoutUrl value for this AuthProvider.
     * 
     * @return logoutUrl
     */
    public java.lang.String getLogoutUrl() {
        return logoutUrl;
    }


    /**
     * Sets the logoutUrl value for this AuthProvider.
     * 
     * @param logoutUrl
     */
    public void setLogoutUrl(java.lang.String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }


    /**
     * Gets the plugin value for this AuthProvider.
     * 
     * @return plugin
     */
    public java.lang.String getPlugin() {
        return plugin;
    }


    /**
     * Sets the plugin value for this AuthProvider.
     * 
     * @param plugin
     */
    public void setPlugin(java.lang.String plugin) {
        this.plugin = plugin;
    }


    /**
     * Gets the portal value for this AuthProvider.
     * 
     * @return portal
     */
    public java.lang.String getPortal() {
        return portal;
    }


    /**
     * Sets the portal value for this AuthProvider.
     * 
     * @param portal
     */
    public void setPortal(java.lang.String portal) {
        this.portal = portal;
    }


    /**
     * Gets the providerType value for this AuthProvider.
     * 
     * @return providerType
     */
    public com.sforce.soap._2006._04.metadata.AuthProviderType getProviderType() {
        return providerType;
    }


    /**
     * Sets the providerType value for this AuthProvider.
     * 
     * @param providerType
     */
    public void setProviderType(com.sforce.soap._2006._04.metadata.AuthProviderType providerType) {
        this.providerType = providerType;
    }


    /**
     * Gets the registrationHandler value for this AuthProvider.
     * 
     * @return registrationHandler
     */
    public java.lang.String getRegistrationHandler() {
        return registrationHandler;
    }


    /**
     * Sets the registrationHandler value for this AuthProvider.
     * 
     * @param registrationHandler
     */
    public void setRegistrationHandler(java.lang.String registrationHandler) {
        this.registrationHandler = registrationHandler;
    }


    /**
     * Gets the sendAccessTokenInHeader value for this AuthProvider.
     * 
     * @return sendAccessTokenInHeader
     */
    public java.lang.Boolean getSendAccessTokenInHeader() {
        return sendAccessTokenInHeader;
    }


    /**
     * Sets the sendAccessTokenInHeader value for this AuthProvider.
     * 
     * @param sendAccessTokenInHeader
     */
    public void setSendAccessTokenInHeader(java.lang.Boolean sendAccessTokenInHeader) {
        this.sendAccessTokenInHeader = sendAccessTokenInHeader;
    }


    /**
     * Gets the sendClientCredentialsInHeader value for this AuthProvider.
     * 
     * @return sendClientCredentialsInHeader
     */
    public java.lang.Boolean getSendClientCredentialsInHeader() {
        return sendClientCredentialsInHeader;
    }


    /**
     * Sets the sendClientCredentialsInHeader value for this AuthProvider.
     * 
     * @param sendClientCredentialsInHeader
     */
    public void setSendClientCredentialsInHeader(java.lang.Boolean sendClientCredentialsInHeader) {
        this.sendClientCredentialsInHeader = sendClientCredentialsInHeader;
    }


    /**
     * Gets the tokenUrl value for this AuthProvider.
     * 
     * @return tokenUrl
     */
    public java.lang.String getTokenUrl() {
        return tokenUrl;
    }


    /**
     * Sets the tokenUrl value for this AuthProvider.
     * 
     * @param tokenUrl
     */
    public void setTokenUrl(java.lang.String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }


    /**
     * Gets the userInfoUrl value for this AuthProvider.
     * 
     * @return userInfoUrl
     */
    public java.lang.String getUserInfoUrl() {
        return userInfoUrl;
    }


    /**
     * Sets the userInfoUrl value for this AuthProvider.
     * 
     * @param userInfoUrl
     */
    public void setUserInfoUrl(java.lang.String userInfoUrl) {
        this.userInfoUrl = userInfoUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthProvider)) return false;
        AuthProvider other = (AuthProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorizeUrl==null && other.getAuthorizeUrl()==null) || 
             (this.authorizeUrl!=null &&
              this.authorizeUrl.equals(other.getAuthorizeUrl()))) &&
            ((this.consumerKey==null && other.getConsumerKey()==null) || 
             (this.consumerKey!=null &&
              this.consumerKey.equals(other.getConsumerKey()))) &&
            ((this.consumerSecret==null && other.getConsumerSecret()==null) || 
             (this.consumerSecret!=null &&
              this.consumerSecret.equals(other.getConsumerSecret()))) &&
            ((this.customMetadataTypeRecord==null && other.getCustomMetadataTypeRecord()==null) || 
             (this.customMetadataTypeRecord!=null &&
              this.customMetadataTypeRecord.equals(other.getCustomMetadataTypeRecord()))) &&
            ((this.defaultScopes==null && other.getDefaultScopes()==null) || 
             (this.defaultScopes!=null &&
              this.defaultScopes.equals(other.getDefaultScopes()))) &&
            ((this.errorUrl==null && other.getErrorUrl()==null) || 
             (this.errorUrl!=null &&
              this.errorUrl.equals(other.getErrorUrl()))) &&
            ((this.executionUser==null && other.getExecutionUser()==null) || 
             (this.executionUser!=null &&
              this.executionUser.equals(other.getExecutionUser()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.idTokenIssuer==null && other.getIdTokenIssuer()==null) || 
             (this.idTokenIssuer!=null &&
              this.idTokenIssuer.equals(other.getIdTokenIssuer()))) &&
            ((this.includeOrgIdInIdentifier==null && other.getIncludeOrgIdInIdentifier()==null) || 
             (this.includeOrgIdInIdentifier!=null &&
              this.includeOrgIdInIdentifier.equals(other.getIncludeOrgIdInIdentifier()))) &&
            ((this.logoutUrl==null && other.getLogoutUrl()==null) || 
             (this.logoutUrl!=null &&
              this.logoutUrl.equals(other.getLogoutUrl()))) &&
            ((this.plugin==null && other.getPlugin()==null) || 
             (this.plugin!=null &&
              this.plugin.equals(other.getPlugin()))) &&
            ((this.portal==null && other.getPortal()==null) || 
             (this.portal!=null &&
              this.portal.equals(other.getPortal()))) &&
            ((this.providerType==null && other.getProviderType()==null) || 
             (this.providerType!=null &&
              this.providerType.equals(other.getProviderType()))) &&
            ((this.registrationHandler==null && other.getRegistrationHandler()==null) || 
             (this.registrationHandler!=null &&
              this.registrationHandler.equals(other.getRegistrationHandler()))) &&
            ((this.sendAccessTokenInHeader==null && other.getSendAccessTokenInHeader()==null) || 
             (this.sendAccessTokenInHeader!=null &&
              this.sendAccessTokenInHeader.equals(other.getSendAccessTokenInHeader()))) &&
            ((this.sendClientCredentialsInHeader==null && other.getSendClientCredentialsInHeader()==null) || 
             (this.sendClientCredentialsInHeader!=null &&
              this.sendClientCredentialsInHeader.equals(other.getSendClientCredentialsInHeader()))) &&
            ((this.tokenUrl==null && other.getTokenUrl()==null) || 
             (this.tokenUrl!=null &&
              this.tokenUrl.equals(other.getTokenUrl()))) &&
            ((this.userInfoUrl==null && other.getUserInfoUrl()==null) || 
             (this.userInfoUrl!=null &&
              this.userInfoUrl.equals(other.getUserInfoUrl())));
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
        if (getAuthorizeUrl() != null) {
            _hashCode += getAuthorizeUrl().hashCode();
        }
        if (getConsumerKey() != null) {
            _hashCode += getConsumerKey().hashCode();
        }
        if (getConsumerSecret() != null) {
            _hashCode += getConsumerSecret().hashCode();
        }
        if (getCustomMetadataTypeRecord() != null) {
            _hashCode += getCustomMetadataTypeRecord().hashCode();
        }
        if (getDefaultScopes() != null) {
            _hashCode += getDefaultScopes().hashCode();
        }
        if (getErrorUrl() != null) {
            _hashCode += getErrorUrl().hashCode();
        }
        if (getExecutionUser() != null) {
            _hashCode += getExecutionUser().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getIdTokenIssuer() != null) {
            _hashCode += getIdTokenIssuer().hashCode();
        }
        if (getIncludeOrgIdInIdentifier() != null) {
            _hashCode += getIncludeOrgIdInIdentifier().hashCode();
        }
        if (getLogoutUrl() != null) {
            _hashCode += getLogoutUrl().hashCode();
        }
        if (getPlugin() != null) {
            _hashCode += getPlugin().hashCode();
        }
        if (getPortal() != null) {
            _hashCode += getPortal().hashCode();
        }
        if (getProviderType() != null) {
            _hashCode += getProviderType().hashCode();
        }
        if (getRegistrationHandler() != null) {
            _hashCode += getRegistrationHandler().hashCode();
        }
        if (getSendAccessTokenInHeader() != null) {
            _hashCode += getSendAccessTokenInHeader().hashCode();
        }
        if (getSendClientCredentialsInHeader() != null) {
            _hashCode += getSendClientCredentialsInHeader().hashCode();
        }
        if (getTokenUrl() != null) {
            _hashCode += getTokenUrl().hashCode();
        }
        if (getUserInfoUrl() != null) {
            _hashCode += getUserInfoUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuthProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "authorizeUrl"));
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
        elemField.setFieldName("customMetadataTypeRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customMetadataTypeRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultScopes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultScopes"));
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
        elemField.setFieldName("executionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "executionUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "friendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "iconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTokenIssuer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "idTokenIssuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeOrgIdInIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "includeOrgIdInIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("plugin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "plugin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "portal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "providerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuthProviderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationHandler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "registrationHandler"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAccessTokenInHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sendAccessTokenInHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendClientCredentialsInHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sendClientCredentialsInHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tokenUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userInfoUrl"));
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
