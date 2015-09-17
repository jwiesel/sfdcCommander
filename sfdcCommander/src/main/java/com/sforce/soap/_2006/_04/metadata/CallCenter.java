/**
 * CallCenter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CallCenter  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String adapterUrl;

    private java.lang.String customSettings;

    private java.lang.String displayName;

    private java.lang.String displayNameLabel;

    private java.lang.String internalNameLabel;

    private com.sforce.soap._2006._04.metadata.CallCenterSection[] sections;

    private java.lang.String version;

    public CallCenter() {
    }

    public CallCenter(
           java.lang.String fullName,
           java.lang.String adapterUrl,
           java.lang.String customSettings,
           java.lang.String displayName,
           java.lang.String displayNameLabel,
           java.lang.String internalNameLabel,
           com.sforce.soap._2006._04.metadata.CallCenterSection[] sections,
           java.lang.String version) {
        super(
            fullName);
        this.adapterUrl = adapterUrl;
        this.customSettings = customSettings;
        this.displayName = displayName;
        this.displayNameLabel = displayNameLabel;
        this.internalNameLabel = internalNameLabel;
        this.sections = sections;
        this.version = version;
    }


    /**
     * Gets the adapterUrl value for this CallCenter.
     * 
     * @return adapterUrl
     */
    public java.lang.String getAdapterUrl() {
        return adapterUrl;
    }


    /**
     * Sets the adapterUrl value for this CallCenter.
     * 
     * @param adapterUrl
     */
    public void setAdapterUrl(java.lang.String adapterUrl) {
        this.adapterUrl = adapterUrl;
    }


    /**
     * Gets the customSettings value for this CallCenter.
     * 
     * @return customSettings
     */
    public java.lang.String getCustomSettings() {
        return customSettings;
    }


    /**
     * Sets the customSettings value for this CallCenter.
     * 
     * @param customSettings
     */
    public void setCustomSettings(java.lang.String customSettings) {
        this.customSettings = customSettings;
    }


    /**
     * Gets the displayName value for this CallCenter.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CallCenter.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the displayNameLabel value for this CallCenter.
     * 
     * @return displayNameLabel
     */
    public java.lang.String getDisplayNameLabel() {
        return displayNameLabel;
    }


    /**
     * Sets the displayNameLabel value for this CallCenter.
     * 
     * @param displayNameLabel
     */
    public void setDisplayNameLabel(java.lang.String displayNameLabel) {
        this.displayNameLabel = displayNameLabel;
    }


    /**
     * Gets the internalNameLabel value for this CallCenter.
     * 
     * @return internalNameLabel
     */
    public java.lang.String getInternalNameLabel() {
        return internalNameLabel;
    }


    /**
     * Sets the internalNameLabel value for this CallCenter.
     * 
     * @param internalNameLabel
     */
    public void setInternalNameLabel(java.lang.String internalNameLabel) {
        this.internalNameLabel = internalNameLabel;
    }


    /**
     * Gets the sections value for this CallCenter.
     * 
     * @return sections
     */
    public com.sforce.soap._2006._04.metadata.CallCenterSection[] getSections() {
        return sections;
    }


    /**
     * Sets the sections value for this CallCenter.
     * 
     * @param sections
     */
    public void setSections(com.sforce.soap._2006._04.metadata.CallCenterSection[] sections) {
        this.sections = sections;
    }

    public com.sforce.soap._2006._04.metadata.CallCenterSection getSections(int i) {
        return this.sections[i];
    }

    public void setSections(int i, com.sforce.soap._2006._04.metadata.CallCenterSection _value) {
        this.sections[i] = _value;
    }


    /**
     * Gets the version value for this CallCenter.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CallCenter.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallCenter)) return false;
        CallCenter other = (CallCenter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adapterUrl==null && other.getAdapterUrl()==null) || 
             (this.adapterUrl!=null &&
              this.adapterUrl.equals(other.getAdapterUrl()))) &&
            ((this.customSettings==null && other.getCustomSettings()==null) || 
             (this.customSettings!=null &&
              this.customSettings.equals(other.getCustomSettings()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.displayNameLabel==null && other.getDisplayNameLabel()==null) || 
             (this.displayNameLabel!=null &&
              this.displayNameLabel.equals(other.getDisplayNameLabel()))) &&
            ((this.internalNameLabel==null && other.getInternalNameLabel()==null) || 
             (this.internalNameLabel!=null &&
              this.internalNameLabel.equals(other.getInternalNameLabel()))) &&
            ((this.sections==null && other.getSections()==null) || 
             (this.sections!=null &&
              java.util.Arrays.equals(this.sections, other.getSections()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getAdapterUrl() != null) {
            _hashCode += getAdapterUrl().hashCode();
        }
        if (getCustomSettings() != null) {
            _hashCode += getCustomSettings().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDisplayNameLabel() != null) {
            _hashCode += getDisplayNameLabel().hashCode();
        }
        if (getInternalNameLabel() != null) {
            _hashCode += getInternalNameLabel().hashCode();
        }
        if (getSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallCenter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CallCenter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "adapterUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayNameLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayNameLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNameLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "internalNameLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CallCenterSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "version"));
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
