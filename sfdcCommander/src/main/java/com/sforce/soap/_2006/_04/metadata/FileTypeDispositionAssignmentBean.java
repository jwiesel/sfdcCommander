/**
 * FileTypeDispositionAssignmentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FileTypeDispositionAssignmentBean  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FileDownloadBehavior behavior;

    private com.sforce.soap._2006._04.metadata.FileType fileType;

    private boolean securityRiskFileType;

    public FileTypeDispositionAssignmentBean() {
    }

    public FileTypeDispositionAssignmentBean(
           com.sforce.soap._2006._04.metadata.FileDownloadBehavior behavior,
           com.sforce.soap._2006._04.metadata.FileType fileType,
           boolean securityRiskFileType) {
           this.behavior = behavior;
           this.fileType = fileType;
           this.securityRiskFileType = securityRiskFileType;
    }


    /**
     * Gets the behavior value for this FileTypeDispositionAssignmentBean.
     * 
     * @return behavior
     */
    public com.sforce.soap._2006._04.metadata.FileDownloadBehavior getBehavior() {
        return behavior;
    }


    /**
     * Sets the behavior value for this FileTypeDispositionAssignmentBean.
     * 
     * @param behavior
     */
    public void setBehavior(com.sforce.soap._2006._04.metadata.FileDownloadBehavior behavior) {
        this.behavior = behavior;
    }


    /**
     * Gets the fileType value for this FileTypeDispositionAssignmentBean.
     * 
     * @return fileType
     */
    public com.sforce.soap._2006._04.metadata.FileType getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this FileTypeDispositionAssignmentBean.
     * 
     * @param fileType
     */
    public void setFileType(com.sforce.soap._2006._04.metadata.FileType fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the securityRiskFileType value for this FileTypeDispositionAssignmentBean.
     * 
     * @return securityRiskFileType
     */
    public boolean isSecurityRiskFileType() {
        return securityRiskFileType;
    }


    /**
     * Sets the securityRiskFileType value for this FileTypeDispositionAssignmentBean.
     * 
     * @param securityRiskFileType
     */
    public void setSecurityRiskFileType(boolean securityRiskFileType) {
        this.securityRiskFileType = securityRiskFileType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileTypeDispositionAssignmentBean)) return false;
        FileTypeDispositionAssignmentBean other = (FileTypeDispositionAssignmentBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.behavior==null && other.getBehavior()==null) || 
             (this.behavior!=null &&
              this.behavior.equals(other.getBehavior()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            this.securityRiskFileType == other.isSecurityRiskFileType();
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
        if (getBehavior() != null) {
            _hashCode += getBehavior().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        _hashCode += (isSecurityRiskFileType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileTypeDispositionAssignmentBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileTypeDispositionAssignmentBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("behavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "behavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileDownloadBehavior"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityRiskFileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "securityRiskFileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
