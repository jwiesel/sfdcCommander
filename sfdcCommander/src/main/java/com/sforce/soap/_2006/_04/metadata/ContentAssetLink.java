/**
 * ContentAssetLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ContentAssetLink  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ContentAssetAccess access;

    private java.lang.Boolean isManagingWorkspace;

    private java.lang.String name;

    public ContentAssetLink() {
    }

    public ContentAssetLink(
           com.sforce.soap._2006._04.metadata.ContentAssetAccess access,
           java.lang.Boolean isManagingWorkspace,
           java.lang.String name) {
           this.access = access;
           this.isManagingWorkspace = isManagingWorkspace;
           this.name = name;
    }


    /**
     * Gets the access value for this ContentAssetLink.
     * 
     * @return access
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetAccess getAccess() {
        return access;
    }


    /**
     * Sets the access value for this ContentAssetLink.
     * 
     * @param access
     */
    public void setAccess(com.sforce.soap._2006._04.metadata.ContentAssetAccess access) {
        this.access = access;
    }


    /**
     * Gets the isManagingWorkspace value for this ContentAssetLink.
     * 
     * @return isManagingWorkspace
     */
    public java.lang.Boolean getIsManagingWorkspace() {
        return isManagingWorkspace;
    }


    /**
     * Sets the isManagingWorkspace value for this ContentAssetLink.
     * 
     * @param isManagingWorkspace
     */
    public void setIsManagingWorkspace(java.lang.Boolean isManagingWorkspace) {
        this.isManagingWorkspace = isManagingWorkspace;
    }


    /**
     * Gets the name value for this ContentAssetLink.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ContentAssetLink.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentAssetLink)) return false;
        ContentAssetLink other = (ContentAssetLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.access==null && other.getAccess()==null) || 
             (this.access!=null &&
              this.access.equals(other.getAccess()))) &&
            ((this.isManagingWorkspace==null && other.getIsManagingWorkspace()==null) || 
             (this.isManagingWorkspace!=null &&
              this.isManagingWorkspace.equals(other.getIsManagingWorkspace()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getAccess() != null) {
            _hashCode += getAccess().hashCode();
        }
        if (getIsManagingWorkspace() != null) {
            _hashCode += getIsManagingWorkspace().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentAssetLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetAccess"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isManagingWorkspace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isManagingWorkspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
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
