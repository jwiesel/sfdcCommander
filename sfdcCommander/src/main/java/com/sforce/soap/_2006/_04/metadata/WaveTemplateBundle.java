/**
 * WaveTemplateBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WaveTemplateBundle  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String assetIcon;

    private java.lang.Double assetVersion;

    private java.lang.String description;

    private java.lang.String label;

    private java.lang.String templateType;

    public WaveTemplateBundle() {
    }

    public WaveTemplateBundle(
           java.lang.String fullName,
           java.lang.String assetIcon,
           java.lang.Double assetVersion,
           java.lang.String description,
           java.lang.String label,
           java.lang.String templateType) {
        super(
            fullName);
        this.assetIcon = assetIcon;
        this.assetVersion = assetVersion;
        this.description = description;
        this.label = label;
        this.templateType = templateType;
    }


    /**
     * Gets the assetIcon value for this WaveTemplateBundle.
     * 
     * @return assetIcon
     */
    public java.lang.String getAssetIcon() {
        return assetIcon;
    }


    /**
     * Sets the assetIcon value for this WaveTemplateBundle.
     * 
     * @param assetIcon
     */
    public void setAssetIcon(java.lang.String assetIcon) {
        this.assetIcon = assetIcon;
    }


    /**
     * Gets the assetVersion value for this WaveTemplateBundle.
     * 
     * @return assetVersion
     */
    public java.lang.Double getAssetVersion() {
        return assetVersion;
    }


    /**
     * Sets the assetVersion value for this WaveTemplateBundle.
     * 
     * @param assetVersion
     */
    public void setAssetVersion(java.lang.Double assetVersion) {
        this.assetVersion = assetVersion;
    }


    /**
     * Gets the description value for this WaveTemplateBundle.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WaveTemplateBundle.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the label value for this WaveTemplateBundle.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this WaveTemplateBundle.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the templateType value for this WaveTemplateBundle.
     * 
     * @return templateType
     */
    public java.lang.String getTemplateType() {
        return templateType;
    }


    /**
     * Sets the templateType value for this WaveTemplateBundle.
     * 
     * @param templateType
     */
    public void setTemplateType(java.lang.String templateType) {
        this.templateType = templateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaveTemplateBundle)) return false;
        WaveTemplateBundle other = (WaveTemplateBundle) obj;
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
            ((this.assetVersion==null && other.getAssetVersion()==null) || 
             (this.assetVersion!=null &&
              this.assetVersion.equals(other.getAssetVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.templateType==null && other.getTemplateType()==null) || 
             (this.templateType!=null &&
              this.templateType.equals(other.getTemplateType())));
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
        if (getAssetVersion() != null) {
            _hashCode += getAssetVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getTemplateType() != null) {
            _hashCode += getTemplateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaveTemplateBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveTemplateBundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "templateType"));
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
