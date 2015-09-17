/**
 * FolderShare.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FolderShare  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FolderShareAccessLevel accessLevel;

    private java.lang.String sharedTo;

    private com.sforce.soap._2006._04.metadata.FolderSharedToType sharedToType;

    public FolderShare() {
    }

    public FolderShare(
           com.sforce.soap._2006._04.metadata.FolderShareAccessLevel accessLevel,
           java.lang.String sharedTo,
           com.sforce.soap._2006._04.metadata.FolderSharedToType sharedToType) {
           this.accessLevel = accessLevel;
           this.sharedTo = sharedTo;
           this.sharedToType = sharedToType;
    }


    /**
     * Gets the accessLevel value for this FolderShare.
     * 
     * @return accessLevel
     */
    public com.sforce.soap._2006._04.metadata.FolderShareAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this FolderShare.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(com.sforce.soap._2006._04.metadata.FolderShareAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the sharedTo value for this FolderShare.
     * 
     * @return sharedTo
     */
    public java.lang.String getSharedTo() {
        return sharedTo;
    }


    /**
     * Sets the sharedTo value for this FolderShare.
     * 
     * @param sharedTo
     */
    public void setSharedTo(java.lang.String sharedTo) {
        this.sharedTo = sharedTo;
    }


    /**
     * Gets the sharedToType value for this FolderShare.
     * 
     * @return sharedToType
     */
    public com.sforce.soap._2006._04.metadata.FolderSharedToType getSharedToType() {
        return sharedToType;
    }


    /**
     * Sets the sharedToType value for this FolderShare.
     * 
     * @param sharedToType
     */
    public void setSharedToType(com.sforce.soap._2006._04.metadata.FolderSharedToType sharedToType) {
        this.sharedToType = sharedToType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FolderShare)) return false;
        FolderShare other = (FolderShare) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.sharedTo==null && other.getSharedTo()==null) || 
             (this.sharedTo!=null &&
              this.sharedTo.equals(other.getSharedTo()))) &&
            ((this.sharedToType==null && other.getSharedToType()==null) || 
             (this.sharedToType!=null &&
              this.sharedToType.equals(other.getSharedToType())));
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
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getSharedTo() != null) {
            _hashCode += getSharedTo().hashCode();
        }
        if (getSharedToType() != null) {
            _hashCode += getSharedToType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FolderShare.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderShare"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderShareAccessLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedToType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharedToType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderSharedToType"));
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
