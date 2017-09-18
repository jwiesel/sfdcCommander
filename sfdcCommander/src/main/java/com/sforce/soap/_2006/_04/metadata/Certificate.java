/**
 * Certificate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Certificate  extends com.sforce.soap._2006._04.metadata.MetadataWithContent  implements java.io.Serializable {
    private boolean caSigned;

    private java.lang.Boolean encryptedWithPlatformEncryption;

    private java.util.Calendar expirationDate;

    private java.lang.Integer keySize;

    private java.lang.String masterLabel;

    private java.lang.Boolean privateKeyExportable;

    public Certificate() {
    }

    public Certificate(
           java.lang.String fullName,
           byte[] content,
           boolean caSigned,
           java.lang.Boolean encryptedWithPlatformEncryption,
           java.util.Calendar expirationDate,
           java.lang.Integer keySize,
           java.lang.String masterLabel,
           java.lang.Boolean privateKeyExportable) {
        super(
            fullName,
            content);
        this.caSigned = caSigned;
        this.encryptedWithPlatformEncryption = encryptedWithPlatformEncryption;
        this.expirationDate = expirationDate;
        this.keySize = keySize;
        this.masterLabel = masterLabel;
        this.privateKeyExportable = privateKeyExportable;
    }


    /**
     * Gets the caSigned value for this Certificate.
     * 
     * @return caSigned
     */
    public boolean isCaSigned() {
        return caSigned;
    }


    /**
     * Sets the caSigned value for this Certificate.
     * 
     * @param caSigned
     */
    public void setCaSigned(boolean caSigned) {
        this.caSigned = caSigned;
    }


    /**
     * Gets the encryptedWithPlatformEncryption value for this Certificate.
     * 
     * @return encryptedWithPlatformEncryption
     */
    public java.lang.Boolean getEncryptedWithPlatformEncryption() {
        return encryptedWithPlatformEncryption;
    }


    /**
     * Sets the encryptedWithPlatformEncryption value for this Certificate.
     * 
     * @param encryptedWithPlatformEncryption
     */
    public void setEncryptedWithPlatformEncryption(java.lang.Boolean encryptedWithPlatformEncryption) {
        this.encryptedWithPlatformEncryption = encryptedWithPlatformEncryption;
    }


    /**
     * Gets the expirationDate value for this Certificate.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Certificate.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the keySize value for this Certificate.
     * 
     * @return keySize
     */
    public java.lang.Integer getKeySize() {
        return keySize;
    }


    /**
     * Sets the keySize value for this Certificate.
     * 
     * @param keySize
     */
    public void setKeySize(java.lang.Integer keySize) {
        this.keySize = keySize;
    }


    /**
     * Gets the masterLabel value for this Certificate.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this Certificate.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the privateKeyExportable value for this Certificate.
     * 
     * @return privateKeyExportable
     */
    public java.lang.Boolean getPrivateKeyExportable() {
        return privateKeyExportable;
    }


    /**
     * Sets the privateKeyExportable value for this Certificate.
     * 
     * @param privateKeyExportable
     */
    public void setPrivateKeyExportable(java.lang.Boolean privateKeyExportable) {
        this.privateKeyExportable = privateKeyExportable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Certificate)) return false;
        Certificate other = (Certificate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.caSigned == other.isCaSigned() &&
            ((this.encryptedWithPlatformEncryption==null && other.getEncryptedWithPlatformEncryption()==null) || 
             (this.encryptedWithPlatformEncryption!=null &&
              this.encryptedWithPlatformEncryption.equals(other.getEncryptedWithPlatformEncryption()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.keySize==null && other.getKeySize()==null) || 
             (this.keySize!=null &&
              this.keySize.equals(other.getKeySize()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.privateKeyExportable==null && other.getPrivateKeyExportable()==null) || 
             (this.privateKeyExportable!=null &&
              this.privateKeyExportable.equals(other.getPrivateKeyExportable())));
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
        _hashCode += (isCaSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEncryptedWithPlatformEncryption() != null) {
            _hashCode += getEncryptedWithPlatformEncryption().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getKeySize() != null) {
            _hashCode += getKeySize().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getPrivateKeyExportable() != null) {
            _hashCode += getPrivateKeyExportable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Certificate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Certificate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedWithPlatformEncryption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "encryptedWithPlatformEncryption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keySize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "keySize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateKeyExportable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "privateKeyExportable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
