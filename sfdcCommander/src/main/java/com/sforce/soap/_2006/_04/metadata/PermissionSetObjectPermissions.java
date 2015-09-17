/**
 * PermissionSetObjectPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PermissionSetObjectPermissions  implements java.io.Serializable {
    private boolean allowCreate;

    private boolean allowDelete;

    private boolean allowEdit;

    private boolean allowRead;

    private boolean modifyAllRecords;

    private java.lang.String object;

    private boolean viewAllRecords;

    public PermissionSetObjectPermissions() {
    }

    public PermissionSetObjectPermissions(
           boolean allowCreate,
           boolean allowDelete,
           boolean allowEdit,
           boolean allowRead,
           boolean modifyAllRecords,
           java.lang.String object,
           boolean viewAllRecords) {
           this.allowCreate = allowCreate;
           this.allowDelete = allowDelete;
           this.allowEdit = allowEdit;
           this.allowRead = allowRead;
           this.modifyAllRecords = modifyAllRecords;
           this.object = object;
           this.viewAllRecords = viewAllRecords;
    }


    /**
     * Gets the allowCreate value for this PermissionSetObjectPermissions.
     * 
     * @return allowCreate
     */
    public boolean isAllowCreate() {
        return allowCreate;
    }


    /**
     * Sets the allowCreate value for this PermissionSetObjectPermissions.
     * 
     * @param allowCreate
     */
    public void setAllowCreate(boolean allowCreate) {
        this.allowCreate = allowCreate;
    }


    /**
     * Gets the allowDelete value for this PermissionSetObjectPermissions.
     * 
     * @return allowDelete
     */
    public boolean isAllowDelete() {
        return allowDelete;
    }


    /**
     * Sets the allowDelete value for this PermissionSetObjectPermissions.
     * 
     * @param allowDelete
     */
    public void setAllowDelete(boolean allowDelete) {
        this.allowDelete = allowDelete;
    }


    /**
     * Gets the allowEdit value for this PermissionSetObjectPermissions.
     * 
     * @return allowEdit
     */
    public boolean isAllowEdit() {
        return allowEdit;
    }


    /**
     * Sets the allowEdit value for this PermissionSetObjectPermissions.
     * 
     * @param allowEdit
     */
    public void setAllowEdit(boolean allowEdit) {
        this.allowEdit = allowEdit;
    }


    /**
     * Gets the allowRead value for this PermissionSetObjectPermissions.
     * 
     * @return allowRead
     */
    public boolean isAllowRead() {
        return allowRead;
    }


    /**
     * Sets the allowRead value for this PermissionSetObjectPermissions.
     * 
     * @param allowRead
     */
    public void setAllowRead(boolean allowRead) {
        this.allowRead = allowRead;
    }


    /**
     * Gets the modifyAllRecords value for this PermissionSetObjectPermissions.
     * 
     * @return modifyAllRecords
     */
    public boolean isModifyAllRecords() {
        return modifyAllRecords;
    }


    /**
     * Sets the modifyAllRecords value for this PermissionSetObjectPermissions.
     * 
     * @param modifyAllRecords
     */
    public void setModifyAllRecords(boolean modifyAllRecords) {
        this.modifyAllRecords = modifyAllRecords;
    }


    /**
     * Gets the object value for this PermissionSetObjectPermissions.
     * 
     * @return object
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this PermissionSetObjectPermissions.
     * 
     * @param object
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }


    /**
     * Gets the viewAllRecords value for this PermissionSetObjectPermissions.
     * 
     * @return viewAllRecords
     */
    public boolean isViewAllRecords() {
        return viewAllRecords;
    }


    /**
     * Sets the viewAllRecords value for this PermissionSetObjectPermissions.
     * 
     * @param viewAllRecords
     */
    public void setViewAllRecords(boolean viewAllRecords) {
        this.viewAllRecords = viewAllRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermissionSetObjectPermissions)) return false;
        PermissionSetObjectPermissions other = (PermissionSetObjectPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowCreate == other.isAllowCreate() &&
            this.allowDelete == other.isAllowDelete() &&
            this.allowEdit == other.isAllowEdit() &&
            this.allowRead == other.isAllowRead() &&
            this.modifyAllRecords == other.isModifyAllRecords() &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            this.viewAllRecords == other.isViewAllRecords();
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
        _hashCode += (isAllowCreate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowDelete() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowEdit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowRead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModifyAllRecords() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        _hashCode += (isViewAllRecords() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermissionSetObjectPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetObjectPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowRead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyAllRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "modifyAllRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
