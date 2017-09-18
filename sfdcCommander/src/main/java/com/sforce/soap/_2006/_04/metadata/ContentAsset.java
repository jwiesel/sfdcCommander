/**
 * ContentAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ContentAsset  extends com.sforce.soap._2006._04.metadata.MetadataWithContent  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ContentAssetFormat format;

    private java.lang.String language;

    private java.lang.String masterLabel;

    private java.lang.String originNetwork;

    private com.sforce.soap._2006._04.metadata.ContentAssetRelationships relationships;

    private com.sforce.soap._2006._04.metadata.ContentAssetVersion[] versions;

    public ContentAsset() {
    }

    public ContentAsset(
           java.lang.String fullName,
           byte[] content,
           com.sforce.soap._2006._04.metadata.ContentAssetFormat format,
           java.lang.String language,
           java.lang.String masterLabel,
           java.lang.String originNetwork,
           com.sforce.soap._2006._04.metadata.ContentAssetRelationships relationships,
           com.sforce.soap._2006._04.metadata.ContentAssetVersion[] versions) {
        super(
            fullName,
            content);
        this.format = format;
        this.language = language;
        this.masterLabel = masterLabel;
        this.originNetwork = originNetwork;
        this.relationships = relationships;
        this.versions = versions;
    }


    /**
     * Gets the format value for this ContentAsset.
     * 
     * @return format
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ContentAsset.
     * 
     * @param format
     */
    public void setFormat(com.sforce.soap._2006._04.metadata.ContentAssetFormat format) {
        this.format = format;
    }


    /**
     * Gets the language value for this ContentAsset.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ContentAsset.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the masterLabel value for this ContentAsset.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this ContentAsset.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the originNetwork value for this ContentAsset.
     * 
     * @return originNetwork
     */
    public java.lang.String getOriginNetwork() {
        return originNetwork;
    }


    /**
     * Sets the originNetwork value for this ContentAsset.
     * 
     * @param originNetwork
     */
    public void setOriginNetwork(java.lang.String originNetwork) {
        this.originNetwork = originNetwork;
    }


    /**
     * Gets the relationships value for this ContentAsset.
     * 
     * @return relationships
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetRelationships getRelationships() {
        return relationships;
    }


    /**
     * Sets the relationships value for this ContentAsset.
     * 
     * @param relationships
     */
    public void setRelationships(com.sforce.soap._2006._04.metadata.ContentAssetRelationships relationships) {
        this.relationships = relationships;
    }


    /**
     * Gets the versions value for this ContentAsset.
     * 
     * @return versions
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetVersion[] getVersions() {
        return versions;
    }


    /**
     * Sets the versions value for this ContentAsset.
     * 
     * @param versions
     */
    public void setVersions(com.sforce.soap._2006._04.metadata.ContentAssetVersion[] versions) {
        this.versions = versions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentAsset)) return false;
        ContentAsset other = (ContentAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.originNetwork==null && other.getOriginNetwork()==null) || 
             (this.originNetwork!=null &&
              this.originNetwork.equals(other.getOriginNetwork()))) &&
            ((this.relationships==null && other.getRelationships()==null) || 
             (this.relationships!=null &&
              this.relationships.equals(other.getRelationships()))) &&
            ((this.versions==null && other.getVersions()==null) || 
             (this.versions!=null &&
              java.util.Arrays.equals(this.versions, other.getVersions())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getOriginNetwork() != null) {
            _hashCode += getOriginNetwork().hashCode();
        }
        if (getRelationships() != null) {
            _hashCode += getRelationships().hashCode();
        }
        if (getVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "language"));
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
        elemField.setFieldName("originNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "originNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationships");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetRelationships"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "versions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetVersion"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "version"));
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
