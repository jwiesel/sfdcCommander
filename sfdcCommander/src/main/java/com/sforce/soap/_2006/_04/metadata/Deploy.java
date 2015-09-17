/**
 * Deploy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Deploy  implements java.io.Serializable {
    private byte[] zipFile;

    private com.sforce.soap._2006._04.metadata.DeployOptions deployOptions;

    public Deploy() {
    }

    public Deploy(
           byte[] zipFile,
           com.sforce.soap._2006._04.metadata.DeployOptions deployOptions) {
           this.zipFile = zipFile;
           this.deployOptions = deployOptions;
    }


    /**
     * Gets the zipFile value for this Deploy.
     * 
     * @return zipFile
     */
    public byte[] getZipFile() {
        return zipFile;
    }


    /**
     * Sets the zipFile value for this Deploy.
     * 
     * @param zipFile
     */
    public void setZipFile(byte[] zipFile) {
        this.zipFile = zipFile;
    }


    /**
     * Gets the deployOptions value for this Deploy.
     * 
     * @return deployOptions
     */
    public com.sforce.soap._2006._04.metadata.DeployOptions getDeployOptions() {
        return deployOptions;
    }


    /**
     * Sets the deployOptions value for this Deploy.
     * 
     * @param deployOptions
     */
    public void setDeployOptions(com.sforce.soap._2006._04.metadata.DeployOptions deployOptions) {
        this.deployOptions = deployOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Deploy)) return false;
        Deploy other = (Deploy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zipFile==null && other.getZipFile()==null) || 
             (this.zipFile!=null &&
              java.util.Arrays.equals(this.zipFile, other.getZipFile()))) &&
            ((this.deployOptions==null && other.getDeployOptions()==null) || 
             (this.deployOptions!=null &&
              this.deployOptions.equals(other.getDeployOptions())));
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
        if (getZipFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZipFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZipFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeployOptions() != null) {
            _hashCode += getDeployOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Deploy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", ">deploy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ZipFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployOptions"));
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
