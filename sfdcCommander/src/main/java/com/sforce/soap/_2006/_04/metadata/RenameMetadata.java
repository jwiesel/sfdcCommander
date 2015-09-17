/**
 * RenameMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class RenameMetadata  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String oldFullName;

    private java.lang.String newFullName;

    public RenameMetadata() {
    }

    public RenameMetadata(
           java.lang.String type,
           java.lang.String oldFullName,
           java.lang.String newFullName) {
           this.type = type;
           this.oldFullName = oldFullName;
           this.newFullName = newFullName;
    }


    /**
     * Gets the type value for this RenameMetadata.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RenameMetadata.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the oldFullName value for this RenameMetadata.
     * 
     * @return oldFullName
     */
    public java.lang.String getOldFullName() {
        return oldFullName;
    }


    /**
     * Sets the oldFullName value for this RenameMetadata.
     * 
     * @param oldFullName
     */
    public void setOldFullName(java.lang.String oldFullName) {
        this.oldFullName = oldFullName;
    }


    /**
     * Gets the newFullName value for this RenameMetadata.
     * 
     * @return newFullName
     */
    public java.lang.String getNewFullName() {
        return newFullName;
    }


    /**
     * Sets the newFullName value for this RenameMetadata.
     * 
     * @param newFullName
     */
    public void setNewFullName(java.lang.String newFullName) {
        this.newFullName = newFullName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenameMetadata)) return false;
        RenameMetadata other = (RenameMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.oldFullName==null && other.getOldFullName()==null) || 
             (this.oldFullName!=null &&
              this.oldFullName.equals(other.getOldFullName()))) &&
            ((this.newFullName==null && other.getNewFullName()==null) || 
             (this.newFullName!=null &&
              this.newFullName.equals(other.getNewFullName())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getOldFullName() != null) {
            _hashCode += getOldFullName().hashCode();
        }
        if (getNewFullName() != null) {
            _hashCode += getNewFullName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenameMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", ">renameMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "oldFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "newFullName"));
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
