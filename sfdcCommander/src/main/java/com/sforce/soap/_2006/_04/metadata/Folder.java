/**
 * Folder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Folder  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FolderAccessTypes accessType;

    private com.sforce.soap._2006._04.metadata.FolderShare[] folderShares;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.PublicFolderAccess publicFolderAccess;

    private com.sforce.soap._2006._04.metadata.SharedTo sharedTo;

    public Folder() {
    }

    public Folder(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.FolderAccessTypes accessType,
           com.sforce.soap._2006._04.metadata.FolderShare[] folderShares,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.PublicFolderAccess publicFolderAccess,
           com.sforce.soap._2006._04.metadata.SharedTo sharedTo) {
        super(
            fullName);
        this.accessType = accessType;
        this.folderShares = folderShares;
        this.name = name;
        this.publicFolderAccess = publicFolderAccess;
        this.sharedTo = sharedTo;
    }


    /**
     * Gets the accessType value for this Folder.
     * 
     * @return accessType
     */
    public com.sforce.soap._2006._04.metadata.FolderAccessTypes getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this Folder.
     * 
     * @param accessType
     */
    public void setAccessType(com.sforce.soap._2006._04.metadata.FolderAccessTypes accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the folderShares value for this Folder.
     * 
     * @return folderShares
     */
    public com.sforce.soap._2006._04.metadata.FolderShare[] getFolderShares() {
        return folderShares;
    }


    /**
     * Sets the folderShares value for this Folder.
     * 
     * @param folderShares
     */
    public void setFolderShares(com.sforce.soap._2006._04.metadata.FolderShare[] folderShares) {
        this.folderShares = folderShares;
    }

    public com.sforce.soap._2006._04.metadata.FolderShare getFolderShares(int i) {
        return this.folderShares[i];
    }

    public void setFolderShares(int i, com.sforce.soap._2006._04.metadata.FolderShare _value) {
        this.folderShares[i] = _value;
    }


    /**
     * Gets the name value for this Folder.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Folder.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the publicFolderAccess value for this Folder.
     * 
     * @return publicFolderAccess
     */
    public com.sforce.soap._2006._04.metadata.PublicFolderAccess getPublicFolderAccess() {
        return publicFolderAccess;
    }


    /**
     * Sets the publicFolderAccess value for this Folder.
     * 
     * @param publicFolderAccess
     */
    public void setPublicFolderAccess(com.sforce.soap._2006._04.metadata.PublicFolderAccess publicFolderAccess) {
        this.publicFolderAccess = publicFolderAccess;
    }


    /**
     * Gets the sharedTo value for this Folder.
     * 
     * @return sharedTo
     */
    public com.sforce.soap._2006._04.metadata.SharedTo getSharedTo() {
        return sharedTo;
    }


    /**
     * Sets the sharedTo value for this Folder.
     * 
     * @param sharedTo
     */
    public void setSharedTo(com.sforce.soap._2006._04.metadata.SharedTo sharedTo) {
        this.sharedTo = sharedTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Folder)) return false;
        Folder other = (Folder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accessType==null && other.getAccessType()==null) || 
             (this.accessType!=null &&
              this.accessType.equals(other.getAccessType()))) &&
            ((this.folderShares==null && other.getFolderShares()==null) || 
             (this.folderShares!=null &&
              java.util.Arrays.equals(this.folderShares, other.getFolderShares()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.publicFolderAccess==null && other.getPublicFolderAccess()==null) || 
             (this.publicFolderAccess!=null &&
              this.publicFolderAccess.equals(other.getPublicFolderAccess()))) &&
            ((this.sharedTo==null && other.getSharedTo()==null) || 
             (this.sharedTo!=null &&
              this.sharedTo.equals(other.getSharedTo())));
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
        if (getAccessType() != null) {
            _hashCode += getAccessType().hashCode();
        }
        if (getFolderShares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFolderShares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFolderShares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPublicFolderAccess() != null) {
            _hashCode += getPublicFolderAccess().hashCode();
        }
        if (getSharedTo() != null) {
            _hashCode += getSharedTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Folder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Folder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderAccessTypes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderShares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "folderShares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderShare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicFolderAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "publicFolderAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PublicFolderAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharedTo"));
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
