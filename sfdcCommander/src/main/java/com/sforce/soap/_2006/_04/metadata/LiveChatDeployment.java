/**
 * LiveChatDeployment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LiveChatDeployment  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String brandingImage;

    private java.lang.Boolean displayQueuePosition;

    private java.lang.String[] domainWhiteList;

    private java.lang.Boolean enablePrechatApi;

    private java.lang.Boolean enableTranscriptSave;

    private java.lang.String label;

    private java.lang.String mobileBrandingImage;

    private java.lang.String site;

    private java.lang.String windowTitle;

    public LiveChatDeployment() {
    }

    public LiveChatDeployment(
           java.lang.String fullName,
           java.lang.String brandingImage,
           java.lang.Boolean displayQueuePosition,
           java.lang.String[] domainWhiteList,
           java.lang.Boolean enablePrechatApi,
           java.lang.Boolean enableTranscriptSave,
           java.lang.String label,
           java.lang.String mobileBrandingImage,
           java.lang.String site,
           java.lang.String windowTitle) {
        super(
            fullName);
        this.brandingImage = brandingImage;
        this.displayQueuePosition = displayQueuePosition;
        this.domainWhiteList = domainWhiteList;
        this.enablePrechatApi = enablePrechatApi;
        this.enableTranscriptSave = enableTranscriptSave;
        this.label = label;
        this.mobileBrandingImage = mobileBrandingImage;
        this.site = site;
        this.windowTitle = windowTitle;
    }


    /**
     * Gets the brandingImage value for this LiveChatDeployment.
     * 
     * @return brandingImage
     */
    public java.lang.String getBrandingImage() {
        return brandingImage;
    }


    /**
     * Sets the brandingImage value for this LiveChatDeployment.
     * 
     * @param brandingImage
     */
    public void setBrandingImage(java.lang.String brandingImage) {
        this.brandingImage = brandingImage;
    }


    /**
     * Gets the displayQueuePosition value for this LiveChatDeployment.
     * 
     * @return displayQueuePosition
     */
    public java.lang.Boolean getDisplayQueuePosition() {
        return displayQueuePosition;
    }


    /**
     * Sets the displayQueuePosition value for this LiveChatDeployment.
     * 
     * @param displayQueuePosition
     */
    public void setDisplayQueuePosition(java.lang.Boolean displayQueuePosition) {
        this.displayQueuePosition = displayQueuePosition;
    }


    /**
     * Gets the domainWhiteList value for this LiveChatDeployment.
     * 
     * @return domainWhiteList
     */
    public java.lang.String[] getDomainWhiteList() {
        return domainWhiteList;
    }


    /**
     * Sets the domainWhiteList value for this LiveChatDeployment.
     * 
     * @param domainWhiteList
     */
    public void setDomainWhiteList(java.lang.String[] domainWhiteList) {
        this.domainWhiteList = domainWhiteList;
    }


    /**
     * Gets the enablePrechatApi value for this LiveChatDeployment.
     * 
     * @return enablePrechatApi
     */
    public java.lang.Boolean getEnablePrechatApi() {
        return enablePrechatApi;
    }


    /**
     * Sets the enablePrechatApi value for this LiveChatDeployment.
     * 
     * @param enablePrechatApi
     */
    public void setEnablePrechatApi(java.lang.Boolean enablePrechatApi) {
        this.enablePrechatApi = enablePrechatApi;
    }


    /**
     * Gets the enableTranscriptSave value for this LiveChatDeployment.
     * 
     * @return enableTranscriptSave
     */
    public java.lang.Boolean getEnableTranscriptSave() {
        return enableTranscriptSave;
    }


    /**
     * Sets the enableTranscriptSave value for this LiveChatDeployment.
     * 
     * @param enableTranscriptSave
     */
    public void setEnableTranscriptSave(java.lang.Boolean enableTranscriptSave) {
        this.enableTranscriptSave = enableTranscriptSave;
    }


    /**
     * Gets the label value for this LiveChatDeployment.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this LiveChatDeployment.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the mobileBrandingImage value for this LiveChatDeployment.
     * 
     * @return mobileBrandingImage
     */
    public java.lang.String getMobileBrandingImage() {
        return mobileBrandingImage;
    }


    /**
     * Sets the mobileBrandingImage value for this LiveChatDeployment.
     * 
     * @param mobileBrandingImage
     */
    public void setMobileBrandingImage(java.lang.String mobileBrandingImage) {
        this.mobileBrandingImage = mobileBrandingImage;
    }


    /**
     * Gets the site value for this LiveChatDeployment.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this LiveChatDeployment.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }


    /**
     * Gets the windowTitle value for this LiveChatDeployment.
     * 
     * @return windowTitle
     */
    public java.lang.String getWindowTitle() {
        return windowTitle;
    }


    /**
     * Sets the windowTitle value for this LiveChatDeployment.
     * 
     * @param windowTitle
     */
    public void setWindowTitle(java.lang.String windowTitle) {
        this.windowTitle = windowTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveChatDeployment)) return false;
        LiveChatDeployment other = (LiveChatDeployment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.brandingImage==null && other.getBrandingImage()==null) || 
             (this.brandingImage!=null &&
              this.brandingImage.equals(other.getBrandingImage()))) &&
            ((this.displayQueuePosition==null && other.getDisplayQueuePosition()==null) || 
             (this.displayQueuePosition!=null &&
              this.displayQueuePosition.equals(other.getDisplayQueuePosition()))) &&
            ((this.domainWhiteList==null && other.getDomainWhiteList()==null) || 
             (this.domainWhiteList!=null &&
              java.util.Arrays.equals(this.domainWhiteList, other.getDomainWhiteList()))) &&
            ((this.enablePrechatApi==null && other.getEnablePrechatApi()==null) || 
             (this.enablePrechatApi!=null &&
              this.enablePrechatApi.equals(other.getEnablePrechatApi()))) &&
            ((this.enableTranscriptSave==null && other.getEnableTranscriptSave()==null) || 
             (this.enableTranscriptSave!=null &&
              this.enableTranscriptSave.equals(other.getEnableTranscriptSave()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.mobileBrandingImage==null && other.getMobileBrandingImage()==null) || 
             (this.mobileBrandingImage!=null &&
              this.mobileBrandingImage.equals(other.getMobileBrandingImage()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.windowTitle==null && other.getWindowTitle()==null) || 
             (this.windowTitle!=null &&
              this.windowTitle.equals(other.getWindowTitle())));
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
        if (getBrandingImage() != null) {
            _hashCode += getBrandingImage().hashCode();
        }
        if (getDisplayQueuePosition() != null) {
            _hashCode += getDisplayQueuePosition().hashCode();
        }
        if (getDomainWhiteList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainWhiteList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainWhiteList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnablePrechatApi() != null) {
            _hashCode += getEnablePrechatApi().hashCode();
        }
        if (getEnableTranscriptSave() != null) {
            _hashCode += getEnableTranscriptSave().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getMobileBrandingImage() != null) {
            _hashCode += getMobileBrandingImage().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getWindowTitle() != null) {
            _hashCode += getWindowTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiveChatDeployment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatDeployment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandingImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "brandingImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayQueuePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayQueuePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainWhiteList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "domainWhiteList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "domain"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablePrechatApi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enablePrechatApi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableTranscriptSave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableTranscriptSave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("mobileBrandingImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mobileBrandingImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "windowTitle"));
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
