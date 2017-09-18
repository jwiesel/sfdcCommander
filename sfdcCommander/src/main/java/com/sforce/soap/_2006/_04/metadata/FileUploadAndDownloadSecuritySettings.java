/**
 * FileUploadAndDownloadSecuritySettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FileUploadAndDownloadSecuritySettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FileTypeDispositionAssignmentBean[] dispositions;

    private boolean noHtmlUploadAsAttachment;

    public FileUploadAndDownloadSecuritySettings() {
    }

    public FileUploadAndDownloadSecuritySettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.FileTypeDispositionAssignmentBean[] dispositions,
           boolean noHtmlUploadAsAttachment) {
        super(
            fullName);
        this.dispositions = dispositions;
        this.noHtmlUploadAsAttachment = noHtmlUploadAsAttachment;
    }


    /**
     * Gets the dispositions value for this FileUploadAndDownloadSecuritySettings.
     * 
     * @return dispositions
     */
    public com.sforce.soap._2006._04.metadata.FileTypeDispositionAssignmentBean[] getDispositions() {
        return dispositions;
    }


    /**
     * Sets the dispositions value for this FileUploadAndDownloadSecuritySettings.
     * 
     * @param dispositions
     */
    public void setDispositions(com.sforce.soap._2006._04.metadata.FileTypeDispositionAssignmentBean[] dispositions) {
        this.dispositions = dispositions;
    }

    public com.sforce.soap._2006._04.metadata.FileTypeDispositionAssignmentBean getDispositions(int i) {
        return this.dispositions[i];
    }

    public void setDispositions(int i, com.sforce.soap._2006._04.metadata.FileTypeDispositionAssignmentBean _value) {
        this.dispositions[i] = _value;
    }


    /**
     * Gets the noHtmlUploadAsAttachment value for this FileUploadAndDownloadSecuritySettings.
     * 
     * @return noHtmlUploadAsAttachment
     */
    public boolean isNoHtmlUploadAsAttachment() {
        return noHtmlUploadAsAttachment;
    }


    /**
     * Sets the noHtmlUploadAsAttachment value for this FileUploadAndDownloadSecuritySettings.
     * 
     * @param noHtmlUploadAsAttachment
     */
    public void setNoHtmlUploadAsAttachment(boolean noHtmlUploadAsAttachment) {
        this.noHtmlUploadAsAttachment = noHtmlUploadAsAttachment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileUploadAndDownloadSecuritySettings)) return false;
        FileUploadAndDownloadSecuritySettings other = (FileUploadAndDownloadSecuritySettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dispositions==null && other.getDispositions()==null) || 
             (this.dispositions!=null &&
              java.util.Arrays.equals(this.dispositions, other.getDispositions()))) &&
            this.noHtmlUploadAsAttachment == other.isNoHtmlUploadAsAttachment();
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
        if (getDispositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDispositions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDispositions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isNoHtmlUploadAsAttachment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileUploadAndDownloadSecuritySettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileUploadAndDownloadSecuritySettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispositions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dispositions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileTypeDispositionAssignmentBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noHtmlUploadAsAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "noHtmlUploadAsAttachment"));
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
