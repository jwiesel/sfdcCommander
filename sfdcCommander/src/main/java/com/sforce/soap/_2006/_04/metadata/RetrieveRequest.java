/**
 * RetrieveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class RetrieveRequest  implements java.io.Serializable {
    private double apiVersion;

    private java.lang.String[] packageNames;

    private boolean singlePackage;

    private java.lang.String[] specificFiles;

    private com.sforce.soap._2006._04.metadata._package unpackaged;

    public RetrieveRequest() {
    }

    public RetrieveRequest(
           double apiVersion,
           java.lang.String[] packageNames,
           boolean singlePackage,
           java.lang.String[] specificFiles,
           com.sforce.soap._2006._04.metadata._package unpackaged) {
           this.apiVersion = apiVersion;
           this.packageNames = packageNames;
           this.singlePackage = singlePackage;
           this.specificFiles = specificFiles;
           this.unpackaged = unpackaged;
    }


    /**
     * Gets the apiVersion value for this RetrieveRequest.
     * 
     * @return apiVersion
     */
    public double getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this RetrieveRequest.
     * 
     * @param apiVersion
     */
    public void setApiVersion(double apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the packageNames value for this RetrieveRequest.
     * 
     * @return packageNames
     */
    public java.lang.String[] getPackageNames() {
        return packageNames;
    }


    /**
     * Sets the packageNames value for this RetrieveRequest.
     * 
     * @param packageNames
     */
    public void setPackageNames(java.lang.String[] packageNames) {
        this.packageNames = packageNames;
    }

    public java.lang.String getPackageNames(int i) {
        return this.packageNames[i];
    }

    public void setPackageNames(int i, java.lang.String _value) {
        this.packageNames[i] = _value;
    }


    /**
     * Gets the singlePackage value for this RetrieveRequest.
     * 
     * @return singlePackage
     */
    public boolean isSinglePackage() {
        return singlePackage;
    }


    /**
     * Sets the singlePackage value for this RetrieveRequest.
     * 
     * @param singlePackage
     */
    public void setSinglePackage(boolean singlePackage) {
        this.singlePackage = singlePackage;
    }


    /**
     * Gets the specificFiles value for this RetrieveRequest.
     * 
     * @return specificFiles
     */
    public java.lang.String[] getSpecificFiles() {
        return specificFiles;
    }


    /**
     * Sets the specificFiles value for this RetrieveRequest.
     * 
     * @param specificFiles
     */
    public void setSpecificFiles(java.lang.String[] specificFiles) {
        this.specificFiles = specificFiles;
    }

    public java.lang.String getSpecificFiles(int i) {
        return this.specificFiles[i];
    }

    public void setSpecificFiles(int i, java.lang.String _value) {
        this.specificFiles[i] = _value;
    }


    /**
     * Gets the unpackaged value for this RetrieveRequest.
     * 
     * @return unpackaged
     */
    public com.sforce.soap._2006._04.metadata._package getUnpackaged() {
        return unpackaged;
    }


    /**
     * Sets the unpackaged value for this RetrieveRequest.
     * 
     * @param unpackaged
     */
    public void setUnpackaged(com.sforce.soap._2006._04.metadata._package unpackaged) {
        this.unpackaged = unpackaged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveRequest)) return false;
        RetrieveRequest other = (RetrieveRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.apiVersion == other.getApiVersion() &&
            ((this.packageNames==null && other.getPackageNames()==null) || 
             (this.packageNames!=null &&
              java.util.Arrays.equals(this.packageNames, other.getPackageNames()))) &&
            this.singlePackage == other.isSinglePackage() &&
            ((this.specificFiles==null && other.getSpecificFiles()==null) || 
             (this.specificFiles!=null &&
              java.util.Arrays.equals(this.specificFiles, other.getSpecificFiles()))) &&
            ((this.unpackaged==null && other.getUnpackaged()==null) || 
             (this.unpackaged!=null &&
              this.unpackaged.equals(other.getUnpackaged())));
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
        _hashCode += new Double(getApiVersion()).hashCode();
        if (getPackageNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSinglePackage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSpecificFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecificFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecificFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnpackaged() != null) {
            _hashCode += getUnpackaged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RetrieveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "packageNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singlePackage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "singlePackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "specificFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpackaged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "unpackaged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Package"));
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
