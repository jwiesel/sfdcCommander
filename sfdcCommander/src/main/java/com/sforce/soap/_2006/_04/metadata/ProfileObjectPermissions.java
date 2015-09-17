/**
 * ProfileObjectPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ProfileObjectPermissions  implements java.io.Serializable {
    private java.lang.Boolean allowCreate;

    private java.lang.Boolean allowDelete;

    private java.lang.Boolean allowEdit;

    private java.lang.Boolean allowRead;

    private java.lang.Boolean modifyAllRecords;

    private java.lang.String object;

    private java.lang.Boolean viewAllRecords;

    public ProfileObjectPermissions() {
    }

    public ProfileObjectPermissions(
           java.lang.Boolean allowCreate,
           java.lang.Boolean allowDelete,
           java.lang.Boolean allowEdit,
           java.lang.Boolean allowRead,
           java.lang.Boolean modifyAllRecords,
           java.lang.String object,
           java.lang.Boolean viewAllRecords) {
           this.allowCreate = allowCreate;
           this.allowDelete = allowDelete;
           this.allowEdit = allowEdit;
           this.allowRead = allowRead;
           this.modifyAllRecords = modifyAllRecords;
           this.object = object;
           this.viewAllRecords = viewAllRecords;
    }


    /**
     * Gets the allowCreate value for this ProfileObjectPermissions.
     * 
     * @return allowCreate
     */
    public java.lang.Boolean getAllowCreate() {
        return allowCreate;
    }


    /**
     * Sets the allowCreate value for this ProfileObjectPermissions.
     * 
     * @param allowCreate
     */
    public void setAllowCreate(java.lang.Boolean allowCreate) {
        this.allowCreate = allowCreate;
    }


    /**
     * Gets the allowDelete value for this ProfileObjectPermissions.
     * 
     * @return allowDelete
     */
    public java.lang.Boolean getAllowDelete() {
        return allowDelete;
    }


    /**
     * Sets the allowDelete value for this ProfileObjectPermissions.
     * 
     * @param allowDelete
     */
    public void setAllowDelete(java.lang.Boolean allowDelete) {
        this.allowDelete = allowDelete;
    }


    /**
     * Gets the allowEdit value for this ProfileObjectPermissions.
     * 
     * @return allowEdit
     */
    public java.lang.Boolean getAllowEdit() {
        return allowEdit;
    }


    /**
     * Sets the allowEdit value for this ProfileObjectPermissions.
     * 
     * @param allowEdit
     */
    public void setAllowEdit(java.lang.Boolean allowEdit) {
        this.allowEdit = allowEdit;
    }


    /**
     * Gets the allowRead value for this ProfileObjectPermissions.
     * 
     * @return allowRead
     */
    public java.lang.Boolean getAllowRead() {
        return allowRead;
    }


    /**
     * Sets the allowRead value for this ProfileObjectPermissions.
     * 
     * @param allowRead
     */
    public void setAllowRead(java.lang.Boolean allowRead) {
        this.allowRead = allowRead;
    }


    /**
     * Gets the modifyAllRecords value for this ProfileObjectPermissions.
     * 
     * @return modifyAllRecords
     */
    public java.lang.Boolean getModifyAllRecords() {
        return modifyAllRecords;
    }


    /**
     * Sets the modifyAllRecords value for this ProfileObjectPermissions.
     * 
     * @param modifyAllRecords
     */
    public void setModifyAllRecords(java.lang.Boolean modifyAllRecords) {
        this.modifyAllRecords = modifyAllRecords;
    }


    /**
     * Gets the object value for this ProfileObjectPermissions.
     * 
     * @return object
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this ProfileObjectPermissions.
     * 
     * @param object
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }


    /**
     * Gets the viewAllRecords value for this ProfileObjectPermissions.
     * 
     * @return viewAllRecords
     */
    public java.lang.Boolean getViewAllRecords() {
        return viewAllRecords;
    }


    /**
     * Sets the viewAllRecords value for this ProfileObjectPermissions.
     * 
     * @param viewAllRecords
     */
    public void setViewAllRecords(java.lang.Boolean viewAllRecords) {
        this.viewAllRecords = viewAllRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileObjectPermissions)) return false;
        ProfileObjectPermissions other = (ProfileObjectPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowCreate==null && other.getAllowCreate()==null) || 
             (this.allowCreate!=null &&
              this.allowCreate.equals(other.getAllowCreate()))) &&
            ((this.allowDelete==null && other.getAllowDelete()==null) || 
             (this.allowDelete!=null &&
              this.allowDelete.equals(other.getAllowDelete()))) &&
            ((this.allowEdit==null && other.getAllowEdit()==null) || 
             (this.allowEdit!=null &&
              this.allowEdit.equals(other.getAllowEdit()))) &&
            ((this.allowRead==null && other.getAllowRead()==null) || 
             (this.allowRead!=null &&
              this.allowRead.equals(other.getAllowRead()))) &&
            ((this.modifyAllRecords==null && other.getModifyAllRecords()==null) || 
             (this.modifyAllRecords!=null &&
              this.modifyAllRecords.equals(other.getModifyAllRecords()))) &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            ((this.viewAllRecords==null && other.getViewAllRecords()==null) || 
             (this.viewAllRecords!=null &&
              this.viewAllRecords.equals(other.getViewAllRecords())));
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
        if (getAllowCreate() != null) {
            _hashCode += getAllowCreate().hashCode();
        }
        if (getAllowDelete() != null) {
            _hashCode += getAllowDelete().hashCode();
        }
        if (getAllowEdit() != null) {
            _hashCode += getAllowEdit().hashCode();
        }
        if (getAllowRead() != null) {
            _hashCode += getAllowRead().hashCode();
        }
        if (getModifyAllRecords() != null) {
            _hashCode += getModifyAllRecords().hashCode();
        }
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        if (getViewAllRecords() != null) {
            _hashCode += getViewAllRecords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileObjectPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileObjectPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowRead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyAllRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "modifyAllRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewAllRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "viewAllRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
