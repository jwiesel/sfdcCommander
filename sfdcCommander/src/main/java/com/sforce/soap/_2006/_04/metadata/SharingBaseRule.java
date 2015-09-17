/**
 * SharingBaseRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SharingBaseRule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String accessLevel;

    private com.sforce.soap._2006._04.metadata.AccountSharingRuleSettings accountSettings;

    private java.lang.String description;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.SharedTo sharedTo;

    public SharingBaseRule() {
    }

    public SharingBaseRule(
           java.lang.String fullName,
           java.lang.String accessLevel,
           com.sforce.soap._2006._04.metadata.AccountSharingRuleSettings accountSettings,
           java.lang.String description,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.SharedTo sharedTo) {
        super(
            fullName);
        this.accessLevel = accessLevel;
        this.accountSettings = accountSettings;
        this.description = description;
        this.label = label;
        this.sharedTo = sharedTo;
    }


    /**
     * Gets the accessLevel value for this SharingBaseRule.
     * 
     * @return accessLevel
     */
    public java.lang.String getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this SharingBaseRule.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(java.lang.String accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the accountSettings value for this SharingBaseRule.
     * 
     * @return accountSettings
     */
    public com.sforce.soap._2006._04.metadata.AccountSharingRuleSettings getAccountSettings() {
        return accountSettings;
    }


    /**
     * Sets the accountSettings value for this SharingBaseRule.
     * 
     * @param accountSettings
     */
    public void setAccountSettings(com.sforce.soap._2006._04.metadata.AccountSharingRuleSettings accountSettings) {
        this.accountSettings = accountSettings;
    }


    /**
     * Gets the description value for this SharingBaseRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SharingBaseRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the label value for this SharingBaseRule.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this SharingBaseRule.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the sharedTo value for this SharingBaseRule.
     * 
     * @return sharedTo
     */
    public com.sforce.soap._2006._04.metadata.SharedTo getSharedTo() {
        return sharedTo;
    }


    /**
     * Sets the sharedTo value for this SharingBaseRule.
     * 
     * @param sharedTo
     */
    public void setSharedTo(com.sforce.soap._2006._04.metadata.SharedTo sharedTo) {
        this.sharedTo = sharedTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharingBaseRule)) return false;
        SharingBaseRule other = (SharingBaseRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.accountSettings==null && other.getAccountSettings()==null) || 
             (this.accountSettings!=null &&
              this.accountSettings.equals(other.getAccountSettings()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.sharedTo==null && other.getSharedTo()==null) || 
             (this.sharedTo!=null &&
              this.sharedTo.equals(other.getSharedTo())));
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
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getAccountSettings() != null) {
            _hashCode += getAccountSettings().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getSharedTo() != null) {
            _hashCode += getSharedTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharingBaseRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingBaseRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accountSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountSharingRuleSettings"));
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
        elemField.setFieldName("sharedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharedTo"));
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
