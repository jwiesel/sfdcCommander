/**
 * ContentAssetVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ContentAssetVersion  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String pathOnClient;

    private java.lang.String zipEntry;

    public ContentAssetVersion() {
    }

    public ContentAssetVersion(
           java.lang.String number,
           java.lang.String pathOnClient,
           java.lang.String zipEntry) {
           this.number = number;
           this.pathOnClient = pathOnClient;
           this.zipEntry = zipEntry;
    }


    /**
     * Gets the number value for this ContentAssetVersion.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this ContentAssetVersion.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the pathOnClient value for this ContentAssetVersion.
     * 
     * @return pathOnClient
     */
    public java.lang.String getPathOnClient() {
        return pathOnClient;
    }


    /**
     * Sets the pathOnClient value for this ContentAssetVersion.
     * 
     * @param pathOnClient
     */
    public void setPathOnClient(java.lang.String pathOnClient) {
        this.pathOnClient = pathOnClient;
    }


    /**
     * Gets the zipEntry value for this ContentAssetVersion.
     * 
     * @return zipEntry
     */
    public java.lang.String getZipEntry() {
        return zipEntry;
    }


    /**
     * Sets the zipEntry value for this ContentAssetVersion.
     * 
     * @param zipEntry
     */
    public void setZipEntry(java.lang.String zipEntry) {
        this.zipEntry = zipEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentAssetVersion)) return false;
        ContentAssetVersion other = (ContentAssetVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.pathOnClient==null && other.getPathOnClient()==null) || 
             (this.pathOnClient!=null &&
              this.pathOnClient.equals(other.getPathOnClient()))) &&
            ((this.zipEntry==null && other.getZipEntry()==null) || 
             (this.zipEntry!=null &&
              this.zipEntry.equals(other.getZipEntry())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPathOnClient() != null) {
            _hashCode += getPathOnClient().hashCode();
        }
        if (getZipEntry() != null) {
            _hashCode += getZipEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentAssetVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathOnClient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pathOnClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "zipEntry"));
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
