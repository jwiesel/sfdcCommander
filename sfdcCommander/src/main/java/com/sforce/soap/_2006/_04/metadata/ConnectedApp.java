/**
 * ConnectedApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ConnectedApp  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ConnectedAppAttribute[] attributes;

    private com.sforce.soap._2006._04.metadata.ConnectedAppCanvasConfig canvasConfig;

    private java.lang.String contactEmail;

    private java.lang.String contactPhone;

    private java.lang.String description;

    private java.lang.String iconUrl;

    private java.lang.String infoUrl;

    private com.sforce.soap._2006._04.metadata.ConnectedAppIpRange[] ipRanges;

    private java.lang.String label;

    private java.lang.String logoUrl;

    private com.sforce.soap._2006._04.metadata.ConnectedAppMobileDetailConfig mobileAppConfig;

    private java.lang.String mobileStartUrl;

    private com.sforce.soap._2006._04.metadata.ConnectedAppOauthConfig oauthConfig;

    private com.sforce.soap._2006._04.metadata.ConnectedAppSamlConfig samlConfig;

    private java.lang.String startUrl;

    public ConnectedApp() {
    }

    public ConnectedApp(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ConnectedAppAttribute[] attributes,
           com.sforce.soap._2006._04.metadata.ConnectedAppCanvasConfig canvasConfig,
           java.lang.String contactEmail,
           java.lang.String contactPhone,
           java.lang.String description,
           java.lang.String iconUrl,
           java.lang.String infoUrl,
           com.sforce.soap._2006._04.metadata.ConnectedAppIpRange[] ipRanges,
           java.lang.String label,
           java.lang.String logoUrl,
           com.sforce.soap._2006._04.metadata.ConnectedAppMobileDetailConfig mobileAppConfig,
           java.lang.String mobileStartUrl,
           com.sforce.soap._2006._04.metadata.ConnectedAppOauthConfig oauthConfig,
           com.sforce.soap._2006._04.metadata.ConnectedAppSamlConfig samlConfig,
           java.lang.String startUrl) {
        super(
            fullName);
        this.attributes = attributes;
        this.canvasConfig = canvasConfig;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.description = description;
        this.iconUrl = iconUrl;
        this.infoUrl = infoUrl;
        this.ipRanges = ipRanges;
        this.label = label;
        this.logoUrl = logoUrl;
        this.mobileAppConfig = mobileAppConfig;
        this.mobileStartUrl = mobileStartUrl;
        this.oauthConfig = oauthConfig;
        this.samlConfig = samlConfig;
        this.startUrl = startUrl;
    }


    /**
     * Gets the attributes value for this ConnectedApp.
     * 
     * @return attributes
     */
    public com.sforce.soap._2006._04.metadata.ConnectedAppAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ConnectedApp.
     * 
     * @param attributes
     */
    public void setAttributes(com.sforce.soap._2006._04.metadata.ConnectedAppAttribute[] attributes) {
        this.attributes = attributes;
    }

    public com.sforce.soap._2006._04.metadata.ConnectedAppAttribute getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, com.sforce.soap._2006._04.metadata.ConnectedAppAttribute _value) {
        this.attributes[i] = _value;
    }


    /**
     * Gets the canvasConfig value for this ConnectedApp.
     * 
     * @return canvasConfig
     */
    public com.sforce.soap._2006._04.metadata.ConnectedAppCanvasConfig getCanvasConfig() {
        return canvasConfig;
    }


    /**
     * Sets the canvasConfig value for this ConnectedApp.
     * 
     * @param canvasConfig
     */
    public void setCanvasConfig(com.sforce.soap._2006._04.metadata.ConnectedAppCanvasConfig canvasConfig) {
        this.canvasConfig = canvasConfig;
    }


    /**
     * Gets the contactEmail value for this ConnectedApp.
     * 
     * @return contactEmail
     */
    public java.lang.String getContactEmail() {
        return contactEmail;
    }


    /**
     * Sets the contactEmail value for this ConnectedApp.
     * 
     * @param contactEmail
     */
    public void setContactEmail(java.lang.String contactEmail) {
        this.contactEmail = contactEmail;
    }


    /**
     * Gets the contactPhone value for this ConnectedApp.
     * 
     * @return contactPhone
     */
    public java.lang.String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this ConnectedApp.
     * 
     * @param contactPhone
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * Gets the description value for this ConnectedApp.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ConnectedApp.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the iconUrl value for this ConnectedApp.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this ConnectedApp.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the infoUrl value for this ConnectedApp.
     * 
     * @return infoUrl
     */
    public java.lang.String getInfoUrl() {
        return infoUrl;
    }


    /**
     * Sets the infoUrl value for this ConnectedApp.
     * 
     * @param infoUrl
     */
    public void setInfoUrl(java.lang.String infoUrl) {
        this.infoUrl = infoUrl;
    }


    /**
     * Gets the ipRanges value for this ConnectedApp.
     * 
     * @return ipRanges
     */
    public com.sforce.soap._2006._04.metadata.ConnectedAppIpRange[] getIpRanges() {
        return ipRanges;
    }


    /**
     * Sets the ipRanges value for this ConnectedApp.
     * 
     * @param ipRanges
     */
    public void setIpRanges(com.sforce.soap._2006._04.metadata.ConnectedAppIpRange[] ipRanges) {
        this.ipRanges = ipRanges;
    }

    public com.sforce.soap._2006._04.metadata.ConnectedAppIpRange getIpRanges(int i) {
        return this.ipRanges[i];
    }

    public void setIpRanges(int i, com.sforce.soap._2006._04.metadata.ConnectedAppIpRange _value) {
        this.ipRanges[i] = _value;
    }


    /**
     * Gets the label value for this ConnectedApp.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ConnectedApp.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the logoUrl value for this ConnectedApp.
     * 
     * @return logoUrl
     */
    public java.lang.String getLogoUrl() {
        return logoUrl;
    }


    /**
     * Sets the logoUrl value for this ConnectedApp.
     * 
     * @param logoUrl
     */
    public void setLogoUrl(java.lang.String logoUrl) {
        this.logoUrl = logoUrl;
    }


    /**
     * Gets the mobileAppConfig value for this ConnectedApp.
     * 
     * @return mobileAppConfig
     */
    public com.sforce.soap._2006._04.metadata.ConnectedAppMobileDetailConfig getMobileAppConfig() {
        return mobileAppConfig;
    }


    /**
     * Sets the mobileAppConfig value for this ConnectedApp.
     * 
     * @param mobileAppConfig
     */
    public void setMobileAppConfig(com.sforce.soap._2006._04.metadata.ConnectedAppMobileDetailConfig mobileAppConfig) {
        this.mobileAppConfig = mobileAppConfig;
    }


    /**
     * Gets the mobileStartUrl value for this ConnectedApp.
     * 
     * @return mobileStartUrl
     */
    public java.lang.String getMobileStartUrl() {
        return mobileStartUrl;
    }


    /**
     * Sets the mobileStartUrl value for this ConnectedApp.
     * 
     * @param mobileStartUrl
     */
    public void setMobileStartUrl(java.lang.String mobileStartUrl) {
        this.mobileStartUrl = mobileStartUrl;
    }


    /**
     * Gets the oauthConfig value for this ConnectedApp.
     * 
     * @return oauthConfig
     */
    public com.sforce.soap._2006._04.metadata.ConnectedAppOauthConfig getOauthConfig() {
        return oauthConfig;
    }


    /**
     * Sets the oauthConfig value for this ConnectedApp.
     * 
     * @param oauthConfig
     */
    public void setOauthConfig(com.sforce.soap._2006._04.metadata.ConnectedAppOauthConfig oauthConfig) {
        this.oauthConfig = oauthConfig;
    }


    /**
     * Gets the samlConfig value for this ConnectedApp.
     * 
     * @return samlConfig
     */
    public com.sforce.soap._2006._04.metadata.ConnectedAppSamlConfig getSamlConfig() {
        return samlConfig;
    }


    /**
     * Sets the samlConfig value for this ConnectedApp.
     * 
     * @param samlConfig
     */
    public void setSamlConfig(com.sforce.soap._2006._04.metadata.ConnectedAppSamlConfig samlConfig) {
        this.samlConfig = samlConfig;
    }


    /**
     * Gets the startUrl value for this ConnectedApp.
     * 
     * @return startUrl
     */
    public java.lang.String getStartUrl() {
        return startUrl;
    }


    /**
     * Sets the startUrl value for this ConnectedApp.
     * 
     * @param startUrl
     */
    public void setStartUrl(java.lang.String startUrl) {
        this.startUrl = startUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectedApp)) return false;
        ConnectedApp other = (ConnectedApp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.canvasConfig==null && other.getCanvasConfig()==null) || 
             (this.canvasConfig!=null &&
              this.canvasConfig.equals(other.getCanvasConfig()))) &&
            ((this.contactEmail==null && other.getContactEmail()==null) || 
             (this.contactEmail!=null &&
              this.contactEmail.equals(other.getContactEmail()))) &&
            ((this.contactPhone==null && other.getContactPhone()==null) || 
             (this.contactPhone!=null &&
              this.contactPhone.equals(other.getContactPhone()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.infoUrl==null && other.getInfoUrl()==null) || 
             (this.infoUrl!=null &&
              this.infoUrl.equals(other.getInfoUrl()))) &&
            ((this.ipRanges==null && other.getIpRanges()==null) || 
             (this.ipRanges!=null &&
              java.util.Arrays.equals(this.ipRanges, other.getIpRanges()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.logoUrl==null && other.getLogoUrl()==null) || 
             (this.logoUrl!=null &&
              this.logoUrl.equals(other.getLogoUrl()))) &&
            ((this.mobileAppConfig==null && other.getMobileAppConfig()==null) || 
             (this.mobileAppConfig!=null &&
              this.mobileAppConfig.equals(other.getMobileAppConfig()))) &&
            ((this.mobileStartUrl==null && other.getMobileStartUrl()==null) || 
             (this.mobileStartUrl!=null &&
              this.mobileStartUrl.equals(other.getMobileStartUrl()))) &&
            ((this.oauthConfig==null && other.getOauthConfig()==null) || 
             (this.oauthConfig!=null &&
              this.oauthConfig.equals(other.getOauthConfig()))) &&
            ((this.samlConfig==null && other.getSamlConfig()==null) || 
             (this.samlConfig!=null &&
              this.samlConfig.equals(other.getSamlConfig()))) &&
            ((this.startUrl==null && other.getStartUrl()==null) || 
             (this.startUrl!=null &&
              this.startUrl.equals(other.getStartUrl())));
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
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCanvasConfig() != null) {
            _hashCode += getCanvasConfig().hashCode();
        }
        if (getContactEmail() != null) {
            _hashCode += getContactEmail().hashCode();
        }
        if (getContactPhone() != null) {
            _hashCode += getContactPhone().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getInfoUrl() != null) {
            _hashCode += getInfoUrl().hashCode();
        }
        if (getIpRanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpRanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpRanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLogoUrl() != null) {
            _hashCode += getLogoUrl().hashCode();
        }
        if (getMobileAppConfig() != null) {
            _hashCode += getMobileAppConfig().hashCode();
        }
        if (getMobileStartUrl() != null) {
            _hashCode += getMobileStartUrl().hashCode();
        }
        if (getOauthConfig() != null) {
            _hashCode += getOauthConfig().hashCode();
        }
        if (getSamlConfig() != null) {
            _hashCode += getSamlConfig().hashCode();
        }
        if (getStartUrl() != null) {
            _hashCode += getStartUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectedApp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedApp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "canvasConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppCanvasConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "contactEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "contactPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("infoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "infoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ipRanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppIpRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAppConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mobileAppConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppMobileDetailConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileStartUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mobileStartUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oauthConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "oauthConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppOauthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppSamlConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "startUrl"));
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
