/**
 * EmbeddedServiceLiveAgent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EmbeddedServiceLiveAgent  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String embeddedServiceConfig;

    private com.sforce.soap._2006._04.metadata.EmbeddedServiceQuickAction[] embeddedServiceQuickActions;

    private java.lang.String liveAgentChatUrl;

    private java.lang.String liveAgentContentUrl;

    private java.lang.String liveChatButton;

    private java.lang.String liveChatDeployment;

    private java.lang.String masterLabel;

    private boolean prechatEnabled;

    private java.lang.String prechatJson;

    private com.sforce.soap._2006._04.metadata.EmbeddedServiceScenario scenario;

    public EmbeddedServiceLiveAgent() {
    }

    public EmbeddedServiceLiveAgent(
           java.lang.String fullName,
           java.lang.String embeddedServiceConfig,
           com.sforce.soap._2006._04.metadata.EmbeddedServiceQuickAction[] embeddedServiceQuickActions,
           java.lang.String liveAgentChatUrl,
           java.lang.String liveAgentContentUrl,
           java.lang.String liveChatButton,
           java.lang.String liveChatDeployment,
           java.lang.String masterLabel,
           boolean prechatEnabled,
           java.lang.String prechatJson,
           com.sforce.soap._2006._04.metadata.EmbeddedServiceScenario scenario) {
        super(
            fullName);
        this.embeddedServiceConfig = embeddedServiceConfig;
        this.embeddedServiceQuickActions = embeddedServiceQuickActions;
        this.liveAgentChatUrl = liveAgentChatUrl;
        this.liveAgentContentUrl = liveAgentContentUrl;
        this.liveChatButton = liveChatButton;
        this.liveChatDeployment = liveChatDeployment;
        this.masterLabel = masterLabel;
        this.prechatEnabled = prechatEnabled;
        this.prechatJson = prechatJson;
        this.scenario = scenario;
    }


    /**
     * Gets the embeddedServiceConfig value for this EmbeddedServiceLiveAgent.
     * 
     * @return embeddedServiceConfig
     */
    public java.lang.String getEmbeddedServiceConfig() {
        return embeddedServiceConfig;
    }


    /**
     * Sets the embeddedServiceConfig value for this EmbeddedServiceLiveAgent.
     * 
     * @param embeddedServiceConfig
     */
    public void setEmbeddedServiceConfig(java.lang.String embeddedServiceConfig) {
        this.embeddedServiceConfig = embeddedServiceConfig;
    }


    /**
     * Gets the embeddedServiceQuickActions value for this EmbeddedServiceLiveAgent.
     * 
     * @return embeddedServiceQuickActions
     */
    public com.sforce.soap._2006._04.metadata.EmbeddedServiceQuickAction[] getEmbeddedServiceQuickActions() {
        return embeddedServiceQuickActions;
    }


    /**
     * Sets the embeddedServiceQuickActions value for this EmbeddedServiceLiveAgent.
     * 
     * @param embeddedServiceQuickActions
     */
    public void setEmbeddedServiceQuickActions(com.sforce.soap._2006._04.metadata.EmbeddedServiceQuickAction[] embeddedServiceQuickActions) {
        this.embeddedServiceQuickActions = embeddedServiceQuickActions;
    }

    public com.sforce.soap._2006._04.metadata.EmbeddedServiceQuickAction getEmbeddedServiceQuickActions(int i) {
        return this.embeddedServiceQuickActions[i];
    }

    public void setEmbeddedServiceQuickActions(int i, com.sforce.soap._2006._04.metadata.EmbeddedServiceQuickAction _value) {
        this.embeddedServiceQuickActions[i] = _value;
    }


    /**
     * Gets the liveAgentChatUrl value for this EmbeddedServiceLiveAgent.
     * 
     * @return liveAgentChatUrl
     */
    public java.lang.String getLiveAgentChatUrl() {
        return liveAgentChatUrl;
    }


    /**
     * Sets the liveAgentChatUrl value for this EmbeddedServiceLiveAgent.
     * 
     * @param liveAgentChatUrl
     */
    public void setLiveAgentChatUrl(java.lang.String liveAgentChatUrl) {
        this.liveAgentChatUrl = liveAgentChatUrl;
    }


    /**
     * Gets the liveAgentContentUrl value for this EmbeddedServiceLiveAgent.
     * 
     * @return liveAgentContentUrl
     */
    public java.lang.String getLiveAgentContentUrl() {
        return liveAgentContentUrl;
    }


    /**
     * Sets the liveAgentContentUrl value for this EmbeddedServiceLiveAgent.
     * 
     * @param liveAgentContentUrl
     */
    public void setLiveAgentContentUrl(java.lang.String liveAgentContentUrl) {
        this.liveAgentContentUrl = liveAgentContentUrl;
    }


    /**
     * Gets the liveChatButton value for this EmbeddedServiceLiveAgent.
     * 
     * @return liveChatButton
     */
    public java.lang.String getLiveChatButton() {
        return liveChatButton;
    }


    /**
     * Sets the liveChatButton value for this EmbeddedServiceLiveAgent.
     * 
     * @param liveChatButton
     */
    public void setLiveChatButton(java.lang.String liveChatButton) {
        this.liveChatButton = liveChatButton;
    }


    /**
     * Gets the liveChatDeployment value for this EmbeddedServiceLiveAgent.
     * 
     * @return liveChatDeployment
     */
    public java.lang.String getLiveChatDeployment() {
        return liveChatDeployment;
    }


    /**
     * Sets the liveChatDeployment value for this EmbeddedServiceLiveAgent.
     * 
     * @param liveChatDeployment
     */
    public void setLiveChatDeployment(java.lang.String liveChatDeployment) {
        this.liveChatDeployment = liveChatDeployment;
    }


    /**
     * Gets the masterLabel value for this EmbeddedServiceLiveAgent.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this EmbeddedServiceLiveAgent.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the prechatEnabled value for this EmbeddedServiceLiveAgent.
     * 
     * @return prechatEnabled
     */
    public boolean isPrechatEnabled() {
        return prechatEnabled;
    }


    /**
     * Sets the prechatEnabled value for this EmbeddedServiceLiveAgent.
     * 
     * @param prechatEnabled
     */
    public void setPrechatEnabled(boolean prechatEnabled) {
        this.prechatEnabled = prechatEnabled;
    }


    /**
     * Gets the prechatJson value for this EmbeddedServiceLiveAgent.
     * 
     * @return prechatJson
     */
    public java.lang.String getPrechatJson() {
        return prechatJson;
    }


    /**
     * Sets the prechatJson value for this EmbeddedServiceLiveAgent.
     * 
     * @param prechatJson
     */
    public void setPrechatJson(java.lang.String prechatJson) {
        this.prechatJson = prechatJson;
    }


    /**
     * Gets the scenario value for this EmbeddedServiceLiveAgent.
     * 
     * @return scenario
     */
    public com.sforce.soap._2006._04.metadata.EmbeddedServiceScenario getScenario() {
        return scenario;
    }


    /**
     * Sets the scenario value for this EmbeddedServiceLiveAgent.
     * 
     * @param scenario
     */
    public void setScenario(com.sforce.soap._2006._04.metadata.EmbeddedServiceScenario scenario) {
        this.scenario = scenario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmbeddedServiceLiveAgent)) return false;
        EmbeddedServiceLiveAgent other = (EmbeddedServiceLiveAgent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.embeddedServiceConfig==null && other.getEmbeddedServiceConfig()==null) || 
             (this.embeddedServiceConfig!=null &&
              this.embeddedServiceConfig.equals(other.getEmbeddedServiceConfig()))) &&
            ((this.embeddedServiceQuickActions==null && other.getEmbeddedServiceQuickActions()==null) || 
             (this.embeddedServiceQuickActions!=null &&
              java.util.Arrays.equals(this.embeddedServiceQuickActions, other.getEmbeddedServiceQuickActions()))) &&
            ((this.liveAgentChatUrl==null && other.getLiveAgentChatUrl()==null) || 
             (this.liveAgentChatUrl!=null &&
              this.liveAgentChatUrl.equals(other.getLiveAgentChatUrl()))) &&
            ((this.liveAgentContentUrl==null && other.getLiveAgentContentUrl()==null) || 
             (this.liveAgentContentUrl!=null &&
              this.liveAgentContentUrl.equals(other.getLiveAgentContentUrl()))) &&
            ((this.liveChatButton==null && other.getLiveChatButton()==null) || 
             (this.liveChatButton!=null &&
              this.liveChatButton.equals(other.getLiveChatButton()))) &&
            ((this.liveChatDeployment==null && other.getLiveChatDeployment()==null) || 
             (this.liveChatDeployment!=null &&
              this.liveChatDeployment.equals(other.getLiveChatDeployment()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            this.prechatEnabled == other.isPrechatEnabled() &&
            ((this.prechatJson==null && other.getPrechatJson()==null) || 
             (this.prechatJson!=null &&
              this.prechatJson.equals(other.getPrechatJson()))) &&
            ((this.scenario==null && other.getScenario()==null) || 
             (this.scenario!=null &&
              this.scenario.equals(other.getScenario())));
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
        if (getEmbeddedServiceConfig() != null) {
            _hashCode += getEmbeddedServiceConfig().hashCode();
        }
        if (getEmbeddedServiceQuickActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmbeddedServiceQuickActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmbeddedServiceQuickActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiveAgentChatUrl() != null) {
            _hashCode += getLiveAgentChatUrl().hashCode();
        }
        if (getLiveAgentContentUrl() != null) {
            _hashCode += getLiveAgentContentUrl().hashCode();
        }
        if (getLiveChatButton() != null) {
            _hashCode += getLiveChatButton().hashCode();
        }
        if (getLiveChatDeployment() != null) {
            _hashCode += getLiveChatDeployment().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        _hashCode += (isPrechatEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPrechatJson() != null) {
            _hashCode += getPrechatJson().hashCode();
        }
        if (getScenario() != null) {
            _hashCode += getScenario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmbeddedServiceLiveAgent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmbeddedServiceLiveAgent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embeddedServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "embeddedServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embeddedServiceQuickActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "embeddedServiceQuickActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmbeddedServiceQuickAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveAgentChatUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "liveAgentChatUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveAgentContentUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "liveAgentContentUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveChatButton");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "liveChatButton"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveChatDeployment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "liveChatDeployment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prechatEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "prechatEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prechatJson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "prechatJson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmbeddedServiceScenario"));
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
