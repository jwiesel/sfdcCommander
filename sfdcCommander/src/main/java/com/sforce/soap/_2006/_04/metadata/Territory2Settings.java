/**
 * Territory2Settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Territory2Settings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String defaultAccountAccessLevel;

    private java.lang.String defaultCaseAccessLevel;

    private java.lang.String defaultContactAccessLevel;

    private java.lang.String defaultOpportunityAccessLevel;

    private com.sforce.soap._2006._04.metadata.Territory2SettingsOpportunityFilter opportunityFilterSettings;

    public Territory2Settings() {
    }

    public Territory2Settings(
           java.lang.String fullName,
           java.lang.String defaultAccountAccessLevel,
           java.lang.String defaultCaseAccessLevel,
           java.lang.String defaultContactAccessLevel,
           java.lang.String defaultOpportunityAccessLevel,
           com.sforce.soap._2006._04.metadata.Territory2SettingsOpportunityFilter opportunityFilterSettings) {
        super(
            fullName);
        this.defaultAccountAccessLevel = defaultAccountAccessLevel;
        this.defaultCaseAccessLevel = defaultCaseAccessLevel;
        this.defaultContactAccessLevel = defaultContactAccessLevel;
        this.defaultOpportunityAccessLevel = defaultOpportunityAccessLevel;
        this.opportunityFilterSettings = opportunityFilterSettings;
    }


    /**
     * Gets the defaultAccountAccessLevel value for this Territory2Settings.
     * 
     * @return defaultAccountAccessLevel
     */
    public java.lang.String getDefaultAccountAccessLevel() {
        return defaultAccountAccessLevel;
    }


    /**
     * Sets the defaultAccountAccessLevel value for this Territory2Settings.
     * 
     * @param defaultAccountAccessLevel
     */
    public void setDefaultAccountAccessLevel(java.lang.String defaultAccountAccessLevel) {
        this.defaultAccountAccessLevel = defaultAccountAccessLevel;
    }


    /**
     * Gets the defaultCaseAccessLevel value for this Territory2Settings.
     * 
     * @return defaultCaseAccessLevel
     */
    public java.lang.String getDefaultCaseAccessLevel() {
        return defaultCaseAccessLevel;
    }


    /**
     * Sets the defaultCaseAccessLevel value for this Territory2Settings.
     * 
     * @param defaultCaseAccessLevel
     */
    public void setDefaultCaseAccessLevel(java.lang.String defaultCaseAccessLevel) {
        this.defaultCaseAccessLevel = defaultCaseAccessLevel;
    }


    /**
     * Gets the defaultContactAccessLevel value for this Territory2Settings.
     * 
     * @return defaultContactAccessLevel
     */
    public java.lang.String getDefaultContactAccessLevel() {
        return defaultContactAccessLevel;
    }


    /**
     * Sets the defaultContactAccessLevel value for this Territory2Settings.
     * 
     * @param defaultContactAccessLevel
     */
    public void setDefaultContactAccessLevel(java.lang.String defaultContactAccessLevel) {
        this.defaultContactAccessLevel = defaultContactAccessLevel;
    }


    /**
     * Gets the defaultOpportunityAccessLevel value for this Territory2Settings.
     * 
     * @return defaultOpportunityAccessLevel
     */
    public java.lang.String getDefaultOpportunityAccessLevel() {
        return defaultOpportunityAccessLevel;
    }


    /**
     * Sets the defaultOpportunityAccessLevel value for this Territory2Settings.
     * 
     * @param defaultOpportunityAccessLevel
     */
    public void setDefaultOpportunityAccessLevel(java.lang.String defaultOpportunityAccessLevel) {
        this.defaultOpportunityAccessLevel = defaultOpportunityAccessLevel;
    }


    /**
     * Gets the opportunityFilterSettings value for this Territory2Settings.
     * 
     * @return opportunityFilterSettings
     */
    public com.sforce.soap._2006._04.metadata.Territory2SettingsOpportunityFilter getOpportunityFilterSettings() {
        return opportunityFilterSettings;
    }


    /**
     * Sets the opportunityFilterSettings value for this Territory2Settings.
     * 
     * @param opportunityFilterSettings
     */
    public void setOpportunityFilterSettings(com.sforce.soap._2006._04.metadata.Territory2SettingsOpportunityFilter opportunityFilterSettings) {
        this.opportunityFilterSettings = opportunityFilterSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Territory2Settings)) return false;
        Territory2Settings other = (Territory2Settings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultAccountAccessLevel==null && other.getDefaultAccountAccessLevel()==null) || 
             (this.defaultAccountAccessLevel!=null &&
              this.defaultAccountAccessLevel.equals(other.getDefaultAccountAccessLevel()))) &&
            ((this.defaultCaseAccessLevel==null && other.getDefaultCaseAccessLevel()==null) || 
             (this.defaultCaseAccessLevel!=null &&
              this.defaultCaseAccessLevel.equals(other.getDefaultCaseAccessLevel()))) &&
            ((this.defaultContactAccessLevel==null && other.getDefaultContactAccessLevel()==null) || 
             (this.defaultContactAccessLevel!=null &&
              this.defaultContactAccessLevel.equals(other.getDefaultContactAccessLevel()))) &&
            ((this.defaultOpportunityAccessLevel==null && other.getDefaultOpportunityAccessLevel()==null) || 
             (this.defaultOpportunityAccessLevel!=null &&
              this.defaultOpportunityAccessLevel.equals(other.getDefaultOpportunityAccessLevel()))) &&
            ((this.opportunityFilterSettings==null && other.getOpportunityFilterSettings()==null) || 
             (this.opportunityFilterSettings!=null &&
              this.opportunityFilterSettings.equals(other.getOpportunityFilterSettings())));
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
        if (getDefaultAccountAccessLevel() != null) {
            _hashCode += getDefaultAccountAccessLevel().hashCode();
        }
        if (getDefaultCaseAccessLevel() != null) {
            _hashCode += getDefaultCaseAccessLevel().hashCode();
        }
        if (getDefaultContactAccessLevel() != null) {
            _hashCode += getDefaultContactAccessLevel().hashCode();
        }
        if (getDefaultOpportunityAccessLevel() != null) {
            _hashCode += getDefaultOpportunityAccessLevel().hashCode();
        }
        if (getOpportunityFilterSettings() != null) {
            _hashCode += getOpportunityFilterSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Territory2Settings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory2Settings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAccountAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultAccountAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCaseAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultCaseAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultContactAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultContactAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOpportunityAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultOpportunityAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityFilterSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityFilterSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory2SettingsOpportunityFilter"));
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
