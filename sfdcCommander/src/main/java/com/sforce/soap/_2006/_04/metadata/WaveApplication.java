/**
 * WaveApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WaveApplication  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String assetIcon;

    private java.lang.String description;

    private java.lang.String folder;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.FolderShare[] shares;

    private java.lang.String templateOrigin;

    private java.lang.String templateVersion;

    public WaveApplication() {
    }

    public WaveApplication(
           java.lang.String fullName,
           java.lang.String assetIcon,
           java.lang.String description,
           java.lang.String folder,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.FolderShare[] shares,
           java.lang.String templateOrigin,
           java.lang.String templateVersion) {
        super(
            fullName);
        this.assetIcon = assetIcon;
        this.description = description;
        this.folder = folder;
        this.masterLabel = masterLabel;
        this.shares = shares;
        this.templateOrigin = templateOrigin;
        this.templateVersion = templateVersion;
    }


    /**
     * Gets the assetIcon value for this WaveApplication.
     * 
     * @return assetIcon
     */
    public java.lang.String getAssetIcon() {
        return assetIcon;
    }


    /**
     * Sets the assetIcon value for this WaveApplication.
     * 
     * @param assetIcon
     */
    public void setAssetIcon(java.lang.String assetIcon) {
        this.assetIcon = assetIcon;
    }


    /**
     * Gets the description value for this WaveApplication.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WaveApplication.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the folder value for this WaveApplication.
     * 
     * @return folder
     */
    public java.lang.String getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this WaveApplication.
     * 
     * @param folder
     */
    public void setFolder(java.lang.String folder) {
        this.folder = folder;
    }


    /**
     * Gets the masterLabel value for this WaveApplication.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this WaveApplication.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the shares value for this WaveApplication.
     * 
     * @return shares
     */
    public com.sforce.soap._2006._04.metadata.FolderShare[] getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this WaveApplication.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap._2006._04.metadata.FolderShare[] shares) {
        this.shares = shares;
    }

    public com.sforce.soap._2006._04.metadata.FolderShare getShares(int i) {
        return this.shares[i];
    }

    public void setShares(int i, com.sforce.soap._2006._04.metadata.FolderShare _value) {
        this.shares[i] = _value;
    }


    /**
     * Gets the templateOrigin value for this WaveApplication.
     * 
     * @return templateOrigin
     */
    public java.lang.String getTemplateOrigin() {
        return templateOrigin;
    }


    /**
     * Sets the templateOrigin value for this WaveApplication.
     * 
     * @param templateOrigin
     */
    public void setTemplateOrigin(java.lang.String templateOrigin) {
        this.templateOrigin = templateOrigin;
    }


    /**
     * Gets the templateVersion value for this WaveApplication.
     * 
     * @return templateVersion
     */
    public java.lang.String getTemplateVersion() {
        return templateVersion;
    }


    /**
     * Sets the templateVersion value for this WaveApplication.
     * 
     * @param templateVersion
     */
    public void setTemplateVersion(java.lang.String templateVersion) {
        this.templateVersion = templateVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaveApplication)) return false;
        WaveApplication other = (WaveApplication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assetIcon==null && other.getAssetIcon()==null) || 
             (this.assetIcon!=null &&
              this.assetIcon.equals(other.getAssetIcon()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              java.util.Arrays.equals(this.shares, other.getShares()))) &&
            ((this.templateOrigin==null && other.getTemplateOrigin()==null) || 
             (this.templateOrigin!=null &&
              this.templateOrigin.equals(other.getTemplateOrigin()))) &&
            ((this.templateVersion==null && other.getTemplateVersion()==null) || 
             (this.templateVersion!=null &&
              this.templateVersion.equals(other.getTemplateVersion())));
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
        if (getAssetIcon() != null) {
            _hashCode += getAssetIcon().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getShares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplateOrigin() != null) {
            _hashCode += getTemplateOrigin().hashCode();
        }
        if (getTemplateVersion() != null) {
            _hashCode += getTemplateVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaveApplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveApplication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetIcon"));
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
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "folder"));
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
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderShare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "templateOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "templateVersion"));
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
