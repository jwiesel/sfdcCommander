/**
 * DescribeMetadataObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DescribeMetadataObject  implements java.io.Serializable {
    private java.lang.String[] childXmlNames;

    private java.lang.String directoryName;

    private boolean inFolder;

    private boolean metaFile;

    private java.lang.String suffix;

    private java.lang.String xmlName;

    public DescribeMetadataObject() {
    }

    public DescribeMetadataObject(
           java.lang.String[] childXmlNames,
           java.lang.String directoryName,
           boolean inFolder,
           boolean metaFile,
           java.lang.String suffix,
           java.lang.String xmlName) {
           this.childXmlNames = childXmlNames;
           this.directoryName = directoryName;
           this.inFolder = inFolder;
           this.metaFile = metaFile;
           this.suffix = suffix;
           this.xmlName = xmlName;
    }


    /**
     * Gets the childXmlNames value for this DescribeMetadataObject.
     * 
     * @return childXmlNames
     */
    public java.lang.String[] getChildXmlNames() {
        return childXmlNames;
    }


    /**
     * Sets the childXmlNames value for this DescribeMetadataObject.
     * 
     * @param childXmlNames
     */
    public void setChildXmlNames(java.lang.String[] childXmlNames) {
        this.childXmlNames = childXmlNames;
    }

    public java.lang.String getChildXmlNames(int i) {
        return this.childXmlNames[i];
    }

    public void setChildXmlNames(int i, java.lang.String _value) {
        this.childXmlNames[i] = _value;
    }


    /**
     * Gets the directoryName value for this DescribeMetadataObject.
     * 
     * @return directoryName
     */
    public java.lang.String getDirectoryName() {
        return directoryName;
    }


    /**
     * Sets the directoryName value for this DescribeMetadataObject.
     * 
     * @param directoryName
     */
    public void setDirectoryName(java.lang.String directoryName) {
        this.directoryName = directoryName;
    }


    /**
     * Gets the inFolder value for this DescribeMetadataObject.
     * 
     * @return inFolder
     */
    public boolean isInFolder() {
        return inFolder;
    }


    /**
     * Sets the inFolder value for this DescribeMetadataObject.
     * 
     * @param inFolder
     */
    public void setInFolder(boolean inFolder) {
        this.inFolder = inFolder;
    }


    /**
     * Gets the metaFile value for this DescribeMetadataObject.
     * 
     * @return metaFile
     */
    public boolean isMetaFile() {
        return metaFile;
    }


    /**
     * Sets the metaFile value for this DescribeMetadataObject.
     * 
     * @param metaFile
     */
    public void setMetaFile(boolean metaFile) {
        this.metaFile = metaFile;
    }


    /**
     * Gets the suffix value for this DescribeMetadataObject.
     * 
     * @return suffix
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this DescribeMetadataObject.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the xmlName value for this DescribeMetadataObject.
     * 
     * @return xmlName
     */
    public java.lang.String getXmlName() {
        return xmlName;
    }


    /**
     * Sets the xmlName value for this DescribeMetadataObject.
     * 
     * @param xmlName
     */
    public void setXmlName(java.lang.String xmlName) {
        this.xmlName = xmlName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeMetadataObject)) return false;
        DescribeMetadataObject other = (DescribeMetadataObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.childXmlNames==null && other.getChildXmlNames()==null) || 
             (this.childXmlNames!=null &&
              java.util.Arrays.equals(this.childXmlNames, other.getChildXmlNames()))) &&
            ((this.directoryName==null && other.getDirectoryName()==null) || 
             (this.directoryName!=null &&
              this.directoryName.equals(other.getDirectoryName()))) &&
            this.inFolder == other.isInFolder() &&
            this.metaFile == other.isMetaFile() &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.xmlName==null && other.getXmlName()==null) || 
             (this.xmlName!=null &&
              this.xmlName.equals(other.getXmlName())));
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
        if (getChildXmlNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildXmlNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildXmlNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirectoryName() != null) {
            _hashCode += getDirectoryName().hashCode();
        }
        _hashCode += (isInFolder() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMetaFile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getXmlName() != null) {
            _hashCode += getXmlName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeMetadataObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DescribeMetadataObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childXmlNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "childXmlNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "directoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "metaFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "xmlName"));
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
