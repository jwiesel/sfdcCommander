/**
 * ContractSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ContractSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean autoCalculateEndDate;

    private java.lang.String autoExpirationDelay;

    private java.lang.String autoExpirationRecipient;

    private java.lang.Boolean autoExpireContracts;

    private java.lang.Boolean enableContractHistoryTracking;

    private java.lang.Boolean notifyOwnersOnContractExpiration;

    public ContractSettings() {
    }

    public ContractSettings(
           java.lang.String fullName,
           java.lang.Boolean autoCalculateEndDate,
           java.lang.String autoExpirationDelay,
           java.lang.String autoExpirationRecipient,
           java.lang.Boolean autoExpireContracts,
           java.lang.Boolean enableContractHistoryTracking,
           java.lang.Boolean notifyOwnersOnContractExpiration) {
        super(
            fullName);
        this.autoCalculateEndDate = autoCalculateEndDate;
        this.autoExpirationDelay = autoExpirationDelay;
        this.autoExpirationRecipient = autoExpirationRecipient;
        this.autoExpireContracts = autoExpireContracts;
        this.enableContractHistoryTracking = enableContractHistoryTracking;
        this.notifyOwnersOnContractExpiration = notifyOwnersOnContractExpiration;
    }


    /**
     * Gets the autoCalculateEndDate value for this ContractSettings.
     * 
     * @return autoCalculateEndDate
     */
    public java.lang.Boolean getAutoCalculateEndDate() {
        return autoCalculateEndDate;
    }


    /**
     * Sets the autoCalculateEndDate value for this ContractSettings.
     * 
     * @param autoCalculateEndDate
     */
    public void setAutoCalculateEndDate(java.lang.Boolean autoCalculateEndDate) {
        this.autoCalculateEndDate = autoCalculateEndDate;
    }


    /**
     * Gets the autoExpirationDelay value for this ContractSettings.
     * 
     * @return autoExpirationDelay
     */
    public java.lang.String getAutoExpirationDelay() {
        return autoExpirationDelay;
    }


    /**
     * Sets the autoExpirationDelay value for this ContractSettings.
     * 
     * @param autoExpirationDelay
     */
    public void setAutoExpirationDelay(java.lang.String autoExpirationDelay) {
        this.autoExpirationDelay = autoExpirationDelay;
    }


    /**
     * Gets the autoExpirationRecipient value for this ContractSettings.
     * 
     * @return autoExpirationRecipient
     */
    public java.lang.String getAutoExpirationRecipient() {
        return autoExpirationRecipient;
    }


    /**
     * Sets the autoExpirationRecipient value for this ContractSettings.
     * 
     * @param autoExpirationRecipient
     */
    public void setAutoExpirationRecipient(java.lang.String autoExpirationRecipient) {
        this.autoExpirationRecipient = autoExpirationRecipient;
    }


    /**
     * Gets the autoExpireContracts value for this ContractSettings.
     * 
     * @return autoExpireContracts
     */
    public java.lang.Boolean getAutoExpireContracts() {
        return autoExpireContracts;
    }


    /**
     * Sets the autoExpireContracts value for this ContractSettings.
     * 
     * @param autoExpireContracts
     */
    public void setAutoExpireContracts(java.lang.Boolean autoExpireContracts) {
        this.autoExpireContracts = autoExpireContracts;
    }


    /**
     * Gets the enableContractHistoryTracking value for this ContractSettings.
     * 
     * @return enableContractHistoryTracking
     */
    public java.lang.Boolean getEnableContractHistoryTracking() {
        return enableContractHistoryTracking;
    }


    /**
     * Sets the enableContractHistoryTracking value for this ContractSettings.
     * 
     * @param enableContractHistoryTracking
     */
    public void setEnableContractHistoryTracking(java.lang.Boolean enableContractHistoryTracking) {
        this.enableContractHistoryTracking = enableContractHistoryTracking;
    }


    /**
     * Gets the notifyOwnersOnContractExpiration value for this ContractSettings.
     * 
     * @return notifyOwnersOnContractExpiration
     */
    public java.lang.Boolean getNotifyOwnersOnContractExpiration() {
        return notifyOwnersOnContractExpiration;
    }


    /**
     * Sets the notifyOwnersOnContractExpiration value for this ContractSettings.
     * 
     * @param notifyOwnersOnContractExpiration
     */
    public void setNotifyOwnersOnContractExpiration(java.lang.Boolean notifyOwnersOnContractExpiration) {
        this.notifyOwnersOnContractExpiration = notifyOwnersOnContractExpiration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractSettings)) return false;
        ContractSettings other = (ContractSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoCalculateEndDate==null && other.getAutoCalculateEndDate()==null) || 
             (this.autoCalculateEndDate!=null &&
              this.autoCalculateEndDate.equals(other.getAutoCalculateEndDate()))) &&
            ((this.autoExpirationDelay==null && other.getAutoExpirationDelay()==null) || 
             (this.autoExpirationDelay!=null &&
              this.autoExpirationDelay.equals(other.getAutoExpirationDelay()))) &&
            ((this.autoExpirationRecipient==null && other.getAutoExpirationRecipient()==null) || 
             (this.autoExpirationRecipient!=null &&
              this.autoExpirationRecipient.equals(other.getAutoExpirationRecipient()))) &&
            ((this.autoExpireContracts==null && other.getAutoExpireContracts()==null) || 
             (this.autoExpireContracts!=null &&
              this.autoExpireContracts.equals(other.getAutoExpireContracts()))) &&
            ((this.enableContractHistoryTracking==null && other.getEnableContractHistoryTracking()==null) || 
             (this.enableContractHistoryTracking!=null &&
              this.enableContractHistoryTracking.equals(other.getEnableContractHistoryTracking()))) &&
            ((this.notifyOwnersOnContractExpiration==null && other.getNotifyOwnersOnContractExpiration()==null) || 
             (this.notifyOwnersOnContractExpiration!=null &&
              this.notifyOwnersOnContractExpiration.equals(other.getNotifyOwnersOnContractExpiration())));
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
        if (getAutoCalculateEndDate() != null) {
            _hashCode += getAutoCalculateEndDate().hashCode();
        }
        if (getAutoExpirationDelay() != null) {
            _hashCode += getAutoExpirationDelay().hashCode();
        }
        if (getAutoExpirationRecipient() != null) {
            _hashCode += getAutoExpirationRecipient().hashCode();
        }
        if (getAutoExpireContracts() != null) {
            _hashCode += getAutoExpireContracts().hashCode();
        }
        if (getEnableContractHistoryTracking() != null) {
            _hashCode += getEnableContractHistoryTracking().hashCode();
        }
        if (getNotifyOwnersOnContractExpiration() != null) {
            _hashCode += getNotifyOwnersOnContractExpiration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContractSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCalculateEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autoCalculateEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoExpirationDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autoExpirationDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoExpirationRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autoExpirationRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoExpireContracts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autoExpireContracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableContractHistoryTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableContractHistoryTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyOwnersOnContractExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyOwnersOnContractExpiration"));
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
