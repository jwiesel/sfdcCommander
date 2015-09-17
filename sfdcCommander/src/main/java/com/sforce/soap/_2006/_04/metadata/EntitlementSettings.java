/**
 * EntitlementSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EntitlementSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean assetLookupLimitedToActiveEntitlementsOnAccount;

    private java.lang.Boolean assetLookupLimitedToActiveEntitlementsOnContact;

    private java.lang.Boolean assetLookupLimitedToSameAccount;

    private java.lang.Boolean assetLookupLimitedToSameContact;

    private boolean enableEntitlementVersioning;

    private boolean enableEntitlements;

    private java.lang.Boolean entitlementLookupLimitedToActiveStatus;

    private java.lang.Boolean entitlementLookupLimitedToSameAccount;

    private java.lang.Boolean entitlementLookupLimitedToSameAsset;

    private java.lang.Boolean entitlementLookupLimitedToSameContact;

    public EntitlementSettings() {
    }

    public EntitlementSettings(
           java.lang.String fullName,
           java.lang.Boolean assetLookupLimitedToActiveEntitlementsOnAccount,
           java.lang.Boolean assetLookupLimitedToActiveEntitlementsOnContact,
           java.lang.Boolean assetLookupLimitedToSameAccount,
           java.lang.Boolean assetLookupLimitedToSameContact,
           boolean enableEntitlementVersioning,
           boolean enableEntitlements,
           java.lang.Boolean entitlementLookupLimitedToActiveStatus,
           java.lang.Boolean entitlementLookupLimitedToSameAccount,
           java.lang.Boolean entitlementLookupLimitedToSameAsset,
           java.lang.Boolean entitlementLookupLimitedToSameContact) {
        super(
            fullName);
        this.assetLookupLimitedToActiveEntitlementsOnAccount = assetLookupLimitedToActiveEntitlementsOnAccount;
        this.assetLookupLimitedToActiveEntitlementsOnContact = assetLookupLimitedToActiveEntitlementsOnContact;
        this.assetLookupLimitedToSameAccount = assetLookupLimitedToSameAccount;
        this.assetLookupLimitedToSameContact = assetLookupLimitedToSameContact;
        this.enableEntitlementVersioning = enableEntitlementVersioning;
        this.enableEntitlements = enableEntitlements;
        this.entitlementLookupLimitedToActiveStatus = entitlementLookupLimitedToActiveStatus;
        this.entitlementLookupLimitedToSameAccount = entitlementLookupLimitedToSameAccount;
        this.entitlementLookupLimitedToSameAsset = entitlementLookupLimitedToSameAsset;
        this.entitlementLookupLimitedToSameContact = entitlementLookupLimitedToSameContact;
    }


    /**
     * Gets the assetLookupLimitedToActiveEntitlementsOnAccount value for this EntitlementSettings.
     * 
     * @return assetLookupLimitedToActiveEntitlementsOnAccount
     */
    public java.lang.Boolean getAssetLookupLimitedToActiveEntitlementsOnAccount() {
        return assetLookupLimitedToActiveEntitlementsOnAccount;
    }


    /**
     * Sets the assetLookupLimitedToActiveEntitlementsOnAccount value for this EntitlementSettings.
     * 
     * @param assetLookupLimitedToActiveEntitlementsOnAccount
     */
    public void setAssetLookupLimitedToActiveEntitlementsOnAccount(java.lang.Boolean assetLookupLimitedToActiveEntitlementsOnAccount) {
        this.assetLookupLimitedToActiveEntitlementsOnAccount = assetLookupLimitedToActiveEntitlementsOnAccount;
    }


    /**
     * Gets the assetLookupLimitedToActiveEntitlementsOnContact value for this EntitlementSettings.
     * 
     * @return assetLookupLimitedToActiveEntitlementsOnContact
     */
    public java.lang.Boolean getAssetLookupLimitedToActiveEntitlementsOnContact() {
        return assetLookupLimitedToActiveEntitlementsOnContact;
    }


    /**
     * Sets the assetLookupLimitedToActiveEntitlementsOnContact value for this EntitlementSettings.
     * 
     * @param assetLookupLimitedToActiveEntitlementsOnContact
     */
    public void setAssetLookupLimitedToActiveEntitlementsOnContact(java.lang.Boolean assetLookupLimitedToActiveEntitlementsOnContact) {
        this.assetLookupLimitedToActiveEntitlementsOnContact = assetLookupLimitedToActiveEntitlementsOnContact;
    }


    /**
     * Gets the assetLookupLimitedToSameAccount value for this EntitlementSettings.
     * 
     * @return assetLookupLimitedToSameAccount
     */
    public java.lang.Boolean getAssetLookupLimitedToSameAccount() {
        return assetLookupLimitedToSameAccount;
    }


    /**
     * Sets the assetLookupLimitedToSameAccount value for this EntitlementSettings.
     * 
     * @param assetLookupLimitedToSameAccount
     */
    public void setAssetLookupLimitedToSameAccount(java.lang.Boolean assetLookupLimitedToSameAccount) {
        this.assetLookupLimitedToSameAccount = assetLookupLimitedToSameAccount;
    }


    /**
     * Gets the assetLookupLimitedToSameContact value for this EntitlementSettings.
     * 
     * @return assetLookupLimitedToSameContact
     */
    public java.lang.Boolean getAssetLookupLimitedToSameContact() {
        return assetLookupLimitedToSameContact;
    }


    /**
     * Sets the assetLookupLimitedToSameContact value for this EntitlementSettings.
     * 
     * @param assetLookupLimitedToSameContact
     */
    public void setAssetLookupLimitedToSameContact(java.lang.Boolean assetLookupLimitedToSameContact) {
        this.assetLookupLimitedToSameContact = assetLookupLimitedToSameContact;
    }


    /**
     * Gets the enableEntitlementVersioning value for this EntitlementSettings.
     * 
     * @return enableEntitlementVersioning
     */
    public boolean isEnableEntitlementVersioning() {
        return enableEntitlementVersioning;
    }


    /**
     * Sets the enableEntitlementVersioning value for this EntitlementSettings.
     * 
     * @param enableEntitlementVersioning
     */
    public void setEnableEntitlementVersioning(boolean enableEntitlementVersioning) {
        this.enableEntitlementVersioning = enableEntitlementVersioning;
    }


    /**
     * Gets the enableEntitlements value for this EntitlementSettings.
     * 
     * @return enableEntitlements
     */
    public boolean isEnableEntitlements() {
        return enableEntitlements;
    }


    /**
     * Sets the enableEntitlements value for this EntitlementSettings.
     * 
     * @param enableEntitlements
     */
    public void setEnableEntitlements(boolean enableEntitlements) {
        this.enableEntitlements = enableEntitlements;
    }


    /**
     * Gets the entitlementLookupLimitedToActiveStatus value for this EntitlementSettings.
     * 
     * @return entitlementLookupLimitedToActiveStatus
     */
    public java.lang.Boolean getEntitlementLookupLimitedToActiveStatus() {
        return entitlementLookupLimitedToActiveStatus;
    }


    /**
     * Sets the entitlementLookupLimitedToActiveStatus value for this EntitlementSettings.
     * 
     * @param entitlementLookupLimitedToActiveStatus
     */
    public void setEntitlementLookupLimitedToActiveStatus(java.lang.Boolean entitlementLookupLimitedToActiveStatus) {
        this.entitlementLookupLimitedToActiveStatus = entitlementLookupLimitedToActiveStatus;
    }


    /**
     * Gets the entitlementLookupLimitedToSameAccount value for this EntitlementSettings.
     * 
     * @return entitlementLookupLimitedToSameAccount
     */
    public java.lang.Boolean getEntitlementLookupLimitedToSameAccount() {
        return entitlementLookupLimitedToSameAccount;
    }


    /**
     * Sets the entitlementLookupLimitedToSameAccount value for this EntitlementSettings.
     * 
     * @param entitlementLookupLimitedToSameAccount
     */
    public void setEntitlementLookupLimitedToSameAccount(java.lang.Boolean entitlementLookupLimitedToSameAccount) {
        this.entitlementLookupLimitedToSameAccount = entitlementLookupLimitedToSameAccount;
    }


    /**
     * Gets the entitlementLookupLimitedToSameAsset value for this EntitlementSettings.
     * 
     * @return entitlementLookupLimitedToSameAsset
     */
    public java.lang.Boolean getEntitlementLookupLimitedToSameAsset() {
        return entitlementLookupLimitedToSameAsset;
    }


    /**
     * Sets the entitlementLookupLimitedToSameAsset value for this EntitlementSettings.
     * 
     * @param entitlementLookupLimitedToSameAsset
     */
    public void setEntitlementLookupLimitedToSameAsset(java.lang.Boolean entitlementLookupLimitedToSameAsset) {
        this.entitlementLookupLimitedToSameAsset = entitlementLookupLimitedToSameAsset;
    }


    /**
     * Gets the entitlementLookupLimitedToSameContact value for this EntitlementSettings.
     * 
     * @return entitlementLookupLimitedToSameContact
     */
    public java.lang.Boolean getEntitlementLookupLimitedToSameContact() {
        return entitlementLookupLimitedToSameContact;
    }


    /**
     * Sets the entitlementLookupLimitedToSameContact value for this EntitlementSettings.
     * 
     * @param entitlementLookupLimitedToSameContact
     */
    public void setEntitlementLookupLimitedToSameContact(java.lang.Boolean entitlementLookupLimitedToSameContact) {
        this.entitlementLookupLimitedToSameContact = entitlementLookupLimitedToSameContact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementSettings)) return false;
        EntitlementSettings other = (EntitlementSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assetLookupLimitedToActiveEntitlementsOnAccount==null && other.getAssetLookupLimitedToActiveEntitlementsOnAccount()==null) || 
             (this.assetLookupLimitedToActiveEntitlementsOnAccount!=null &&
              this.assetLookupLimitedToActiveEntitlementsOnAccount.equals(other.getAssetLookupLimitedToActiveEntitlementsOnAccount()))) &&
            ((this.assetLookupLimitedToActiveEntitlementsOnContact==null && other.getAssetLookupLimitedToActiveEntitlementsOnContact()==null) || 
             (this.assetLookupLimitedToActiveEntitlementsOnContact!=null &&
              this.assetLookupLimitedToActiveEntitlementsOnContact.equals(other.getAssetLookupLimitedToActiveEntitlementsOnContact()))) &&
            ((this.assetLookupLimitedToSameAccount==null && other.getAssetLookupLimitedToSameAccount()==null) || 
             (this.assetLookupLimitedToSameAccount!=null &&
              this.assetLookupLimitedToSameAccount.equals(other.getAssetLookupLimitedToSameAccount()))) &&
            ((this.assetLookupLimitedToSameContact==null && other.getAssetLookupLimitedToSameContact()==null) || 
             (this.assetLookupLimitedToSameContact!=null &&
              this.assetLookupLimitedToSameContact.equals(other.getAssetLookupLimitedToSameContact()))) &&
            this.enableEntitlementVersioning == other.isEnableEntitlementVersioning() &&
            this.enableEntitlements == other.isEnableEntitlements() &&
            ((this.entitlementLookupLimitedToActiveStatus==null && other.getEntitlementLookupLimitedToActiveStatus()==null) || 
             (this.entitlementLookupLimitedToActiveStatus!=null &&
              this.entitlementLookupLimitedToActiveStatus.equals(other.getEntitlementLookupLimitedToActiveStatus()))) &&
            ((this.entitlementLookupLimitedToSameAccount==null && other.getEntitlementLookupLimitedToSameAccount()==null) || 
             (this.entitlementLookupLimitedToSameAccount!=null &&
              this.entitlementLookupLimitedToSameAccount.equals(other.getEntitlementLookupLimitedToSameAccount()))) &&
            ((this.entitlementLookupLimitedToSameAsset==null && other.getEntitlementLookupLimitedToSameAsset()==null) || 
             (this.entitlementLookupLimitedToSameAsset!=null &&
              this.entitlementLookupLimitedToSameAsset.equals(other.getEntitlementLookupLimitedToSameAsset()))) &&
            ((this.entitlementLookupLimitedToSameContact==null && other.getEntitlementLookupLimitedToSameContact()==null) || 
             (this.entitlementLookupLimitedToSameContact!=null &&
              this.entitlementLookupLimitedToSameContact.equals(other.getEntitlementLookupLimitedToSameContact())));
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
        if (getAssetLookupLimitedToActiveEntitlementsOnAccount() != null) {
            _hashCode += getAssetLookupLimitedToActiveEntitlementsOnAccount().hashCode();
        }
        if (getAssetLookupLimitedToActiveEntitlementsOnContact() != null) {
            _hashCode += getAssetLookupLimitedToActiveEntitlementsOnContact().hashCode();
        }
        if (getAssetLookupLimitedToSameAccount() != null) {
            _hashCode += getAssetLookupLimitedToSameAccount().hashCode();
        }
        if (getAssetLookupLimitedToSameContact() != null) {
            _hashCode += getAssetLookupLimitedToSameContact().hashCode();
        }
        _hashCode += (isEnableEntitlementVersioning() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableEntitlements() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEntitlementLookupLimitedToActiveStatus() != null) {
            _hashCode += getEntitlementLookupLimitedToActiveStatus().hashCode();
        }
        if (getEntitlementLookupLimitedToSameAccount() != null) {
            _hashCode += getEntitlementLookupLimitedToSameAccount().hashCode();
        }
        if (getEntitlementLookupLimitedToSameAsset() != null) {
            _hashCode += getEntitlementLookupLimitedToSameAsset().hashCode();
        }
        if (getEntitlementLookupLimitedToSameContact() != null) {
            _hashCode += getEntitlementLookupLimitedToSameContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetLookupLimitedToActiveEntitlementsOnAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetLookupLimitedToActiveEntitlementsOnAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetLookupLimitedToActiveEntitlementsOnContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetLookupLimitedToActiveEntitlementsOnContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetLookupLimitedToSameAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetLookupLimitedToSameAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetLookupLimitedToSameContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetLookupLimitedToSameContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableEntitlementVersioning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableEntitlementVersioning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableEntitlements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableEntitlements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementLookupLimitedToActiveStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entitlementLookupLimitedToActiveStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementLookupLimitedToSameAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entitlementLookupLimitedToSameAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementLookupLimitedToSameAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entitlementLookupLimitedToSameAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementLookupLimitedToSameContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entitlementLookupLimitedToSameContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
