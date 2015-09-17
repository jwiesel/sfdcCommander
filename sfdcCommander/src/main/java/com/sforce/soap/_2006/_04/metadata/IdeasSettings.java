/**
 * IdeasSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class IdeasSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean enableChatterProfile;

    private java.lang.Boolean enableIdeaThemes;

    private java.lang.Boolean enableIdeas;

    private java.lang.Boolean enableIdeasReputation;

    private java.lang.Double halfLife;

    private java.lang.String ideasProfilePage;

    public IdeasSettings() {
    }

    public IdeasSettings(
           java.lang.String fullName,
           java.lang.Boolean enableChatterProfile,
           java.lang.Boolean enableIdeaThemes,
           java.lang.Boolean enableIdeas,
           java.lang.Boolean enableIdeasReputation,
           java.lang.Double halfLife,
           java.lang.String ideasProfilePage) {
        super(
            fullName);
        this.enableChatterProfile = enableChatterProfile;
        this.enableIdeaThemes = enableIdeaThemes;
        this.enableIdeas = enableIdeas;
        this.enableIdeasReputation = enableIdeasReputation;
        this.halfLife = halfLife;
        this.ideasProfilePage = ideasProfilePage;
    }


    /**
     * Gets the enableChatterProfile value for this IdeasSettings.
     * 
     * @return enableChatterProfile
     */
    public java.lang.Boolean getEnableChatterProfile() {
        return enableChatterProfile;
    }


    /**
     * Sets the enableChatterProfile value for this IdeasSettings.
     * 
     * @param enableChatterProfile
     */
    public void setEnableChatterProfile(java.lang.Boolean enableChatterProfile) {
        this.enableChatterProfile = enableChatterProfile;
    }


    /**
     * Gets the enableIdeaThemes value for this IdeasSettings.
     * 
     * @return enableIdeaThemes
     */
    public java.lang.Boolean getEnableIdeaThemes() {
        return enableIdeaThemes;
    }


    /**
     * Sets the enableIdeaThemes value for this IdeasSettings.
     * 
     * @param enableIdeaThemes
     */
    public void setEnableIdeaThemes(java.lang.Boolean enableIdeaThemes) {
        this.enableIdeaThemes = enableIdeaThemes;
    }


    /**
     * Gets the enableIdeas value for this IdeasSettings.
     * 
     * @return enableIdeas
     */
    public java.lang.Boolean getEnableIdeas() {
        return enableIdeas;
    }


    /**
     * Sets the enableIdeas value for this IdeasSettings.
     * 
     * @param enableIdeas
     */
    public void setEnableIdeas(java.lang.Boolean enableIdeas) {
        this.enableIdeas = enableIdeas;
    }


    /**
     * Gets the enableIdeasReputation value for this IdeasSettings.
     * 
     * @return enableIdeasReputation
     */
    public java.lang.Boolean getEnableIdeasReputation() {
        return enableIdeasReputation;
    }


    /**
     * Sets the enableIdeasReputation value for this IdeasSettings.
     * 
     * @param enableIdeasReputation
     */
    public void setEnableIdeasReputation(java.lang.Boolean enableIdeasReputation) {
        this.enableIdeasReputation = enableIdeasReputation;
    }


    /**
     * Gets the halfLife value for this IdeasSettings.
     * 
     * @return halfLife
     */
    public java.lang.Double getHalfLife() {
        return halfLife;
    }


    /**
     * Sets the halfLife value for this IdeasSettings.
     * 
     * @param halfLife
     */
    public void setHalfLife(java.lang.Double halfLife) {
        this.halfLife = halfLife;
    }


    /**
     * Gets the ideasProfilePage value for this IdeasSettings.
     * 
     * @return ideasProfilePage
     */
    public java.lang.String getIdeasProfilePage() {
        return ideasProfilePage;
    }


    /**
     * Sets the ideasProfilePage value for this IdeasSettings.
     * 
     * @param ideasProfilePage
     */
    public void setIdeasProfilePage(java.lang.String ideasProfilePage) {
        this.ideasProfilePage = ideasProfilePage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdeasSettings)) return false;
        IdeasSettings other = (IdeasSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enableChatterProfile==null && other.getEnableChatterProfile()==null) || 
             (this.enableChatterProfile!=null &&
              this.enableChatterProfile.equals(other.getEnableChatterProfile()))) &&
            ((this.enableIdeaThemes==null && other.getEnableIdeaThemes()==null) || 
             (this.enableIdeaThemes!=null &&
              this.enableIdeaThemes.equals(other.getEnableIdeaThemes()))) &&
            ((this.enableIdeas==null && other.getEnableIdeas()==null) || 
             (this.enableIdeas!=null &&
              this.enableIdeas.equals(other.getEnableIdeas()))) &&
            ((this.enableIdeasReputation==null && other.getEnableIdeasReputation()==null) || 
             (this.enableIdeasReputation!=null &&
              this.enableIdeasReputation.equals(other.getEnableIdeasReputation()))) &&
            ((this.halfLife==null && other.getHalfLife()==null) || 
             (this.halfLife!=null &&
              this.halfLife.equals(other.getHalfLife()))) &&
            ((this.ideasProfilePage==null && other.getIdeasProfilePage()==null) || 
             (this.ideasProfilePage!=null &&
              this.ideasProfilePage.equals(other.getIdeasProfilePage())));
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
        if (getEnableChatterProfile() != null) {
            _hashCode += getEnableChatterProfile().hashCode();
        }
        if (getEnableIdeaThemes() != null) {
            _hashCode += getEnableIdeaThemes().hashCode();
        }
        if (getEnableIdeas() != null) {
            _hashCode += getEnableIdeas().hashCode();
        }
        if (getEnableIdeasReputation() != null) {
            _hashCode += getEnableIdeasReputation().hashCode();
        }
        if (getHalfLife() != null) {
            _hashCode += getHalfLife().hashCode();
        }
        if (getIdeasProfilePage() != null) {
            _hashCode += getIdeasProfilePage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdeasSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IdeasSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableChatterProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableChatterProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableIdeaThemes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableIdeaThemes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableIdeas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableIdeas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableIdeasReputation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableIdeasReputation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("halfLife");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "halfLife"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideasProfilePage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ideasProfilePage"));
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
