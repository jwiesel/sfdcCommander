/**
 * AccountSharingRuleSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AccountSharingRuleSettings  implements java.io.Serializable {
    private java.lang.String caseAccessLevel;

    private java.lang.String contactAccessLevel;

    private java.lang.String opportunityAccessLevel;

    public AccountSharingRuleSettings() {
    }

    public AccountSharingRuleSettings(
           java.lang.String caseAccessLevel,
           java.lang.String contactAccessLevel,
           java.lang.String opportunityAccessLevel) {
           this.caseAccessLevel = caseAccessLevel;
           this.contactAccessLevel = contactAccessLevel;
           this.opportunityAccessLevel = opportunityAccessLevel;
    }


    /**
     * Gets the caseAccessLevel value for this AccountSharingRuleSettings.
     * 
     * @return caseAccessLevel
     */
    public java.lang.String getCaseAccessLevel() {
        return caseAccessLevel;
    }


    /**
     * Sets the caseAccessLevel value for this AccountSharingRuleSettings.
     * 
     * @param caseAccessLevel
     */
    public void setCaseAccessLevel(java.lang.String caseAccessLevel) {
        this.caseAccessLevel = caseAccessLevel;
    }


    /**
     * Gets the contactAccessLevel value for this AccountSharingRuleSettings.
     * 
     * @return contactAccessLevel
     */
    public java.lang.String getContactAccessLevel() {
        return contactAccessLevel;
    }


    /**
     * Sets the contactAccessLevel value for this AccountSharingRuleSettings.
     * 
     * @param contactAccessLevel
     */
    public void setContactAccessLevel(java.lang.String contactAccessLevel) {
        this.contactAccessLevel = contactAccessLevel;
    }


    /**
     * Gets the opportunityAccessLevel value for this AccountSharingRuleSettings.
     * 
     * @return opportunityAccessLevel
     */
    public java.lang.String getOpportunityAccessLevel() {
        return opportunityAccessLevel;
    }


    /**
     * Sets the opportunityAccessLevel value for this AccountSharingRuleSettings.
     * 
     * @param opportunityAccessLevel
     */
    public void setOpportunityAccessLevel(java.lang.String opportunityAccessLevel) {
        this.opportunityAccessLevel = opportunityAccessLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSharingRuleSettings)) return false;
        AccountSharingRuleSettings other = (AccountSharingRuleSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseAccessLevel==null && other.getCaseAccessLevel()==null) || 
             (this.caseAccessLevel!=null &&
              this.caseAccessLevel.equals(other.getCaseAccessLevel()))) &&
            ((this.contactAccessLevel==null && other.getContactAccessLevel()==null) || 
             (this.contactAccessLevel!=null &&
              this.contactAccessLevel.equals(other.getContactAccessLevel()))) &&
            ((this.opportunityAccessLevel==null && other.getOpportunityAccessLevel()==null) || 
             (this.opportunityAccessLevel!=null &&
              this.opportunityAccessLevel.equals(other.getOpportunityAccessLevel())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCaseAccessLevel() != null) {
            _hashCode += getCaseAccessLevel().hashCode();
        }
        if (getContactAccessLevel() != null) {
            _hashCode += getContactAccessLevel().hashCode();
        }
        if (getOpportunityAccessLevel() != null) {
            _hashCode += getOpportunityAccessLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountSharingRuleSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountSharingRuleSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "contactAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityAccessLevel"));
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
