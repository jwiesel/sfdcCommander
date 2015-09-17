/**
 * SessionSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SessionSettings  implements java.io.Serializable {
    private java.lang.Boolean disableTimeoutWarning;

    private java.lang.Boolean enableCSRFOnGet;

    private java.lang.Boolean enableCSRFOnPost;

    private java.lang.Boolean enableCacheAndAutocomplete;

    private java.lang.Boolean enableClickjackNonsetupSFDC;

    private java.lang.Boolean enableClickjackNonsetupUser;

    private java.lang.Boolean enableClickjackNonsetupUserHeaderless;

    private java.lang.Boolean enableClickjackSetup;

    private java.lang.Boolean enablePostForSessions;

    private java.lang.Boolean enableSMSIdentity;

    private java.lang.Boolean enforceIpRangesEveryRequest;

    private java.lang.Boolean forceLogoutOnSessionTimeout;

    private java.lang.Boolean forceRelogin;

    private java.lang.Boolean lockSessionsToDomain;

    private java.lang.Boolean lockSessionsToIp;

    private java.lang.String logoutURL;

    private com.sforce.soap._2006._04.metadata.SessionTimeout sessionTimeout;

    public SessionSettings() {
    }

    public SessionSettings(
           java.lang.Boolean disableTimeoutWarning,
           java.lang.Boolean enableCSRFOnGet,
           java.lang.Boolean enableCSRFOnPost,
           java.lang.Boolean enableCacheAndAutocomplete,
           java.lang.Boolean enableClickjackNonsetupSFDC,
           java.lang.Boolean enableClickjackNonsetupUser,
           java.lang.Boolean enableClickjackNonsetupUserHeaderless,
           java.lang.Boolean enableClickjackSetup,
           java.lang.Boolean enablePostForSessions,
           java.lang.Boolean enableSMSIdentity,
           java.lang.Boolean enforceIpRangesEveryRequest,
           java.lang.Boolean forceLogoutOnSessionTimeout,
           java.lang.Boolean forceRelogin,
           java.lang.Boolean lockSessionsToDomain,
           java.lang.Boolean lockSessionsToIp,
           java.lang.String logoutURL,
           com.sforce.soap._2006._04.metadata.SessionTimeout sessionTimeout) {
           this.disableTimeoutWarning = disableTimeoutWarning;
           this.enableCSRFOnGet = enableCSRFOnGet;
           this.enableCSRFOnPost = enableCSRFOnPost;
           this.enableCacheAndAutocomplete = enableCacheAndAutocomplete;
           this.enableClickjackNonsetupSFDC = enableClickjackNonsetupSFDC;
           this.enableClickjackNonsetupUser = enableClickjackNonsetupUser;
           this.enableClickjackNonsetupUserHeaderless = enableClickjackNonsetupUserHeaderless;
           this.enableClickjackSetup = enableClickjackSetup;
           this.enablePostForSessions = enablePostForSessions;
           this.enableSMSIdentity = enableSMSIdentity;
           this.enforceIpRangesEveryRequest = enforceIpRangesEveryRequest;
           this.forceLogoutOnSessionTimeout = forceLogoutOnSessionTimeout;
           this.forceRelogin = forceRelogin;
           this.lockSessionsToDomain = lockSessionsToDomain;
           this.lockSessionsToIp = lockSessionsToIp;
           this.logoutURL = logoutURL;
           this.sessionTimeout = sessionTimeout;
    }


    /**
     * Gets the disableTimeoutWarning value for this SessionSettings.
     * 
     * @return disableTimeoutWarning
     */
    public java.lang.Boolean getDisableTimeoutWarning() {
        return disableTimeoutWarning;
    }


    /**
     * Sets the disableTimeoutWarning value for this SessionSettings.
     * 
     * @param disableTimeoutWarning
     */
    public void setDisableTimeoutWarning(java.lang.Boolean disableTimeoutWarning) {
        this.disableTimeoutWarning = disableTimeoutWarning;
    }


    /**
     * Gets the enableCSRFOnGet value for this SessionSettings.
     * 
     * @return enableCSRFOnGet
     */
    public java.lang.Boolean getEnableCSRFOnGet() {
        return enableCSRFOnGet;
    }


    /**
     * Sets the enableCSRFOnGet value for this SessionSettings.
     * 
     * @param enableCSRFOnGet
     */
    public void setEnableCSRFOnGet(java.lang.Boolean enableCSRFOnGet) {
        this.enableCSRFOnGet = enableCSRFOnGet;
    }


    /**
     * Gets the enableCSRFOnPost value for this SessionSettings.
     * 
     * @return enableCSRFOnPost
     */
    public java.lang.Boolean getEnableCSRFOnPost() {
        return enableCSRFOnPost;
    }


    /**
     * Sets the enableCSRFOnPost value for this SessionSettings.
     * 
     * @param enableCSRFOnPost
     */
    public void setEnableCSRFOnPost(java.lang.Boolean enableCSRFOnPost) {
        this.enableCSRFOnPost = enableCSRFOnPost;
    }


    /**
     * Gets the enableCacheAndAutocomplete value for this SessionSettings.
     * 
     * @return enableCacheAndAutocomplete
     */
    public java.lang.Boolean getEnableCacheAndAutocomplete() {
        return enableCacheAndAutocomplete;
    }


    /**
     * Sets the enableCacheAndAutocomplete value for this SessionSettings.
     * 
     * @param enableCacheAndAutocomplete
     */
    public void setEnableCacheAndAutocomplete(java.lang.Boolean enableCacheAndAutocomplete) {
        this.enableCacheAndAutocomplete = enableCacheAndAutocomplete;
    }


    /**
     * Gets the enableClickjackNonsetupSFDC value for this SessionSettings.
     * 
     * @return enableClickjackNonsetupSFDC
     */
    public java.lang.Boolean getEnableClickjackNonsetupSFDC() {
        return enableClickjackNonsetupSFDC;
    }


    /**
     * Sets the enableClickjackNonsetupSFDC value for this SessionSettings.
     * 
     * @param enableClickjackNonsetupSFDC
     */
    public void setEnableClickjackNonsetupSFDC(java.lang.Boolean enableClickjackNonsetupSFDC) {
        this.enableClickjackNonsetupSFDC = enableClickjackNonsetupSFDC;
    }


    /**
     * Gets the enableClickjackNonsetupUser value for this SessionSettings.
     * 
     * @return enableClickjackNonsetupUser
     */
    public java.lang.Boolean getEnableClickjackNonsetupUser() {
        return enableClickjackNonsetupUser;
    }


    /**
     * Sets the enableClickjackNonsetupUser value for this SessionSettings.
     * 
     * @param enableClickjackNonsetupUser
     */
    public void setEnableClickjackNonsetupUser(java.lang.Boolean enableClickjackNonsetupUser) {
        this.enableClickjackNonsetupUser = enableClickjackNonsetupUser;
    }


    /**
     * Gets the enableClickjackNonsetupUserHeaderless value for this SessionSettings.
     * 
     * @return enableClickjackNonsetupUserHeaderless
     */
    public java.lang.Boolean getEnableClickjackNonsetupUserHeaderless() {
        return enableClickjackNonsetupUserHeaderless;
    }


    /**
     * Sets the enableClickjackNonsetupUserHeaderless value for this SessionSettings.
     * 
     * @param enableClickjackNonsetupUserHeaderless
     */
    public void setEnableClickjackNonsetupUserHeaderless(java.lang.Boolean enableClickjackNonsetupUserHeaderless) {
        this.enableClickjackNonsetupUserHeaderless = enableClickjackNonsetupUserHeaderless;
    }


    /**
     * Gets the enableClickjackSetup value for this SessionSettings.
     * 
     * @return enableClickjackSetup
     */
    public java.lang.Boolean getEnableClickjackSetup() {
        return enableClickjackSetup;
    }


    /**
     * Sets the enableClickjackSetup value for this SessionSettings.
     * 
     * @param enableClickjackSetup
     */
    public void setEnableClickjackSetup(java.lang.Boolean enableClickjackSetup) {
        this.enableClickjackSetup = enableClickjackSetup;
    }


    /**
     * Gets the enablePostForSessions value for this SessionSettings.
     * 
     * @return enablePostForSessions
     */
    public java.lang.Boolean getEnablePostForSessions() {
        return enablePostForSessions;
    }


    /**
     * Sets the enablePostForSessions value for this SessionSettings.
     * 
     * @param enablePostForSessions
     */
    public void setEnablePostForSessions(java.lang.Boolean enablePostForSessions) {
        this.enablePostForSessions = enablePostForSessions;
    }


    /**
     * Gets the enableSMSIdentity value for this SessionSettings.
     * 
     * @return enableSMSIdentity
     */
    public java.lang.Boolean getEnableSMSIdentity() {
        return enableSMSIdentity;
    }


    /**
     * Sets the enableSMSIdentity value for this SessionSettings.
     * 
     * @param enableSMSIdentity
     */
    public void setEnableSMSIdentity(java.lang.Boolean enableSMSIdentity) {
        this.enableSMSIdentity = enableSMSIdentity;
    }


    /**
     * Gets the enforceIpRangesEveryRequest value for this SessionSettings.
     * 
     * @return enforceIpRangesEveryRequest
     */
    public java.lang.Boolean getEnforceIpRangesEveryRequest() {
        return enforceIpRangesEveryRequest;
    }


    /**
     * Sets the enforceIpRangesEveryRequest value for this SessionSettings.
     * 
     * @param enforceIpRangesEveryRequest
     */
    public void setEnforceIpRangesEveryRequest(java.lang.Boolean enforceIpRangesEveryRequest) {
        this.enforceIpRangesEveryRequest = enforceIpRangesEveryRequest;
    }


    /**
     * Gets the forceLogoutOnSessionTimeout value for this SessionSettings.
     * 
     * @return forceLogoutOnSessionTimeout
     */
    public java.lang.Boolean getForceLogoutOnSessionTimeout() {
        return forceLogoutOnSessionTimeout;
    }


    /**
     * Sets the forceLogoutOnSessionTimeout value for this SessionSettings.
     * 
     * @param forceLogoutOnSessionTimeout
     */
    public void setForceLogoutOnSessionTimeout(java.lang.Boolean forceLogoutOnSessionTimeout) {
        this.forceLogoutOnSessionTimeout = forceLogoutOnSessionTimeout;
    }


    /**
     * Gets the forceRelogin value for this SessionSettings.
     * 
     * @return forceRelogin
     */
    public java.lang.Boolean getForceRelogin() {
        return forceRelogin;
    }


    /**
     * Sets the forceRelogin value for this SessionSettings.
     * 
     * @param forceRelogin
     */
    public void setForceRelogin(java.lang.Boolean forceRelogin) {
        this.forceRelogin = forceRelogin;
    }


    /**
     * Gets the lockSessionsToDomain value for this SessionSettings.
     * 
     * @return lockSessionsToDomain
     */
    public java.lang.Boolean getLockSessionsToDomain() {
        return lockSessionsToDomain;
    }


    /**
     * Sets the lockSessionsToDomain value for this SessionSettings.
     * 
     * @param lockSessionsToDomain
     */
    public void setLockSessionsToDomain(java.lang.Boolean lockSessionsToDomain) {
        this.lockSessionsToDomain = lockSessionsToDomain;
    }


    /**
     * Gets the lockSessionsToIp value for this SessionSettings.
     * 
     * @return lockSessionsToIp
     */
    public java.lang.Boolean getLockSessionsToIp() {
        return lockSessionsToIp;
    }


    /**
     * Sets the lockSessionsToIp value for this SessionSettings.
     * 
     * @param lockSessionsToIp
     */
    public void setLockSessionsToIp(java.lang.Boolean lockSessionsToIp) {
        this.lockSessionsToIp = lockSessionsToIp;
    }


    /**
     * Gets the logoutURL value for this SessionSettings.
     * 
     * @return logoutURL
     */
    public java.lang.String getLogoutURL() {
        return logoutURL;
    }


    /**
     * Sets the logoutURL value for this SessionSettings.
     * 
     * @param logoutURL
     */
    public void setLogoutURL(java.lang.String logoutURL) {
        this.logoutURL = logoutURL;
    }


    /**
     * Gets the sessionTimeout value for this SessionSettings.
     * 
     * @return sessionTimeout
     */
    public com.sforce.soap._2006._04.metadata.SessionTimeout getSessionTimeout() {
        return sessionTimeout;
    }


    /**
     * Sets the sessionTimeout value for this SessionSettings.
     * 
     * @param sessionTimeout
     */
    public void setSessionTimeout(com.sforce.soap._2006._04.metadata.SessionTimeout sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionSettings)) return false;
        SessionSettings other = (SessionSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.disableTimeoutWarning==null && other.getDisableTimeoutWarning()==null) || 
             (this.disableTimeoutWarning!=null &&
              this.disableTimeoutWarning.equals(other.getDisableTimeoutWarning()))) &&
            ((this.enableCSRFOnGet==null && other.getEnableCSRFOnGet()==null) || 
             (this.enableCSRFOnGet!=null &&
              this.enableCSRFOnGet.equals(other.getEnableCSRFOnGet()))) &&
            ((this.enableCSRFOnPost==null && other.getEnableCSRFOnPost()==null) || 
             (this.enableCSRFOnPost!=null &&
              this.enableCSRFOnPost.equals(other.getEnableCSRFOnPost()))) &&
            ((this.enableCacheAndAutocomplete==null && other.getEnableCacheAndAutocomplete()==null) || 
             (this.enableCacheAndAutocomplete!=null &&
              this.enableCacheAndAutocomplete.equals(other.getEnableCacheAndAutocomplete()))) &&
            ((this.enableClickjackNonsetupSFDC==null && other.getEnableClickjackNonsetupSFDC()==null) || 
             (this.enableClickjackNonsetupSFDC!=null &&
              this.enableClickjackNonsetupSFDC.equals(other.getEnableClickjackNonsetupSFDC()))) &&
            ((this.enableClickjackNonsetupUser==null && other.getEnableClickjackNonsetupUser()==null) || 
             (this.enableClickjackNonsetupUser!=null &&
              this.enableClickjackNonsetupUser.equals(other.getEnableClickjackNonsetupUser()))) &&
            ((this.enableClickjackNonsetupUserHeaderless==null && other.getEnableClickjackNonsetupUserHeaderless()==null) || 
             (this.enableClickjackNonsetupUserHeaderless!=null &&
              this.enableClickjackNonsetupUserHeaderless.equals(other.getEnableClickjackNonsetupUserHeaderless()))) &&
            ((this.enableClickjackSetup==null && other.getEnableClickjackSetup()==null) || 
             (this.enableClickjackSetup!=null &&
              this.enableClickjackSetup.equals(other.getEnableClickjackSetup()))) &&
            ((this.enablePostForSessions==null && other.getEnablePostForSessions()==null) || 
             (this.enablePostForSessions!=null &&
              this.enablePostForSessions.equals(other.getEnablePostForSessions()))) &&
            ((this.enableSMSIdentity==null && other.getEnableSMSIdentity()==null) || 
             (this.enableSMSIdentity!=null &&
              this.enableSMSIdentity.equals(other.getEnableSMSIdentity()))) &&
            ((this.enforceIpRangesEveryRequest==null && other.getEnforceIpRangesEveryRequest()==null) || 
             (this.enforceIpRangesEveryRequest!=null &&
              this.enforceIpRangesEveryRequest.equals(other.getEnforceIpRangesEveryRequest()))) &&
            ((this.forceLogoutOnSessionTimeout==null && other.getForceLogoutOnSessionTimeout()==null) || 
             (this.forceLogoutOnSessionTimeout!=null &&
              this.forceLogoutOnSessionTimeout.equals(other.getForceLogoutOnSessionTimeout()))) &&
            ((this.forceRelogin==null && other.getForceRelogin()==null) || 
             (this.forceRelogin!=null &&
              this.forceRelogin.equals(other.getForceRelogin()))) &&
            ((this.lockSessionsToDomain==null && other.getLockSessionsToDomain()==null) || 
             (this.lockSessionsToDomain!=null &&
              this.lockSessionsToDomain.equals(other.getLockSessionsToDomain()))) &&
            ((this.lockSessionsToIp==null && other.getLockSessionsToIp()==null) || 
             (this.lockSessionsToIp!=null &&
              this.lockSessionsToIp.equals(other.getLockSessionsToIp()))) &&
            ((this.logoutURL==null && other.getLogoutURL()==null) || 
             (this.logoutURL!=null &&
              this.logoutURL.equals(other.getLogoutURL()))) &&
            ((this.sessionTimeout==null && other.getSessionTimeout()==null) || 
             (this.sessionTimeout!=null &&
              this.sessionTimeout.equals(other.getSessionTimeout())));
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
        if (getDisableTimeoutWarning() != null) {
            _hashCode += getDisableTimeoutWarning().hashCode();
        }
        if (getEnableCSRFOnGet() != null) {
            _hashCode += getEnableCSRFOnGet().hashCode();
        }
        if (getEnableCSRFOnPost() != null) {
            _hashCode += getEnableCSRFOnPost().hashCode();
        }
        if (getEnableCacheAndAutocomplete() != null) {
            _hashCode += getEnableCacheAndAutocomplete().hashCode();
        }
        if (getEnableClickjackNonsetupSFDC() != null) {
            _hashCode += getEnableClickjackNonsetupSFDC().hashCode();
        }
        if (getEnableClickjackNonsetupUser() != null) {
            _hashCode += getEnableClickjackNonsetupUser().hashCode();
        }
        if (getEnableClickjackNonsetupUserHeaderless() != null) {
            _hashCode += getEnableClickjackNonsetupUserHeaderless().hashCode();
        }
        if (getEnableClickjackSetup() != null) {
            _hashCode += getEnableClickjackSetup().hashCode();
        }
        if (getEnablePostForSessions() != null) {
            _hashCode += getEnablePostForSessions().hashCode();
        }
        if (getEnableSMSIdentity() != null) {
            _hashCode += getEnableSMSIdentity().hashCode();
        }
        if (getEnforceIpRangesEveryRequest() != null) {
            _hashCode += getEnforceIpRangesEveryRequest().hashCode();
        }
        if (getForceLogoutOnSessionTimeout() != null) {
            _hashCode += getForceLogoutOnSessionTimeout().hashCode();
        }
        if (getForceRelogin() != null) {
            _hashCode += getForceRelogin().hashCode();
        }
        if (getLockSessionsToDomain() != null) {
            _hashCode += getLockSessionsToDomain().hashCode();
        }
        if (getLockSessionsToIp() != null) {
            _hashCode += getLockSessionsToIp().hashCode();
        }
        if (getLogoutURL() != null) {
            _hashCode += getLogoutURL().hashCode();
        }
        if (getSessionTimeout() != null) {
            _hashCode += getSessionTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableTimeoutWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "disableTimeoutWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCSRFOnGet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCSRFOnGet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCSRFOnPost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCSRFOnPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCacheAndAutocomplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCacheAndAutocomplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableClickjackNonsetupSFDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableClickjackNonsetupSFDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableClickjackNonsetupUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableClickjackNonsetupUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableClickjackNonsetupUserHeaderless");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableClickjackNonsetupUserHeaderless"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableClickjackSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableClickjackSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablePostForSessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enablePostForSessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSMSIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSMSIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceIpRangesEveryRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enforceIpRangesEveryRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceLogoutOnSessionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forceLogoutOnSessionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceRelogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forceRelogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockSessionsToDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lockSessionsToDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockSessionsToIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lockSessionsToIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoutURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logoutURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sessionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionTimeout"));
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
