/**
 * ChildRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class ChildRelationship  implements java.io.Serializable {
    private boolean cascadeDelete;

    private java.lang.String childSObject;

    private boolean deprecatedAndHidden;

    private java.lang.String field;

    private java.lang.String junctionIdListName;

    private java.lang.String[] junctionReferenceTo;

    private java.lang.String relationshipName;

    private java.lang.Boolean restrictedDelete;

    public ChildRelationship() {
    }

    public ChildRelationship(
           boolean cascadeDelete,
           java.lang.String childSObject,
           boolean deprecatedAndHidden,
           java.lang.String field,
           java.lang.String junctionIdListName,
           java.lang.String[] junctionReferenceTo,
           java.lang.String relationshipName,
           java.lang.Boolean restrictedDelete) {
           this.cascadeDelete = cascadeDelete;
           this.childSObject = childSObject;
           this.deprecatedAndHidden = deprecatedAndHidden;
           this.field = field;
           this.junctionIdListName = junctionIdListName;
           this.junctionReferenceTo = junctionReferenceTo;
           this.relationshipName = relationshipName;
           this.restrictedDelete = restrictedDelete;
    }


    /**
     * Gets the cascadeDelete value for this ChildRelationship.
     * 
     * @return cascadeDelete
     */
    public boolean isCascadeDelete() {
        return cascadeDelete;
    }


    /**
     * Sets the cascadeDelete value for this ChildRelationship.
     * 
     * @param cascadeDelete
     */
    public void setCascadeDelete(boolean cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
    }


    /**
     * Gets the childSObject value for this ChildRelationship.
     * 
     * @return childSObject
     */
    public java.lang.String getChildSObject() {
        return childSObject;
    }


    /**
     * Sets the childSObject value for this ChildRelationship.
     * 
     * @param childSObject
     */
    public void setChildSObject(java.lang.String childSObject) {
        this.childSObject = childSObject;
    }


    /**
     * Gets the deprecatedAndHidden value for this ChildRelationship.
     * 
     * @return deprecatedAndHidden
     */
    public boolean isDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }


    /**
     * Sets the deprecatedAndHidden value for this ChildRelationship.
     * 
     * @param deprecatedAndHidden
     */
    public void setDeprecatedAndHidden(boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }


    /**
     * Gets the field value for this ChildRelationship.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this ChildRelationship.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the junctionIdListName value for this ChildRelationship.
     * 
     * @return junctionIdListName
     */
    public java.lang.String getJunctionIdListName() {
        return junctionIdListName;
    }


    /**
     * Sets the junctionIdListName value for this ChildRelationship.
     * 
     * @param junctionIdListName
     */
    public void setJunctionIdListName(java.lang.String junctionIdListName) {
        this.junctionIdListName = junctionIdListName;
    }


    /**
     * Gets the junctionReferenceTo value for this ChildRelationship.
     * 
     * @return junctionReferenceTo
     */
    public java.lang.String[] getJunctionReferenceTo() {
        return junctionReferenceTo;
    }


    /**
     * Sets the junctionReferenceTo value for this ChildRelationship.
     * 
     * @param junctionReferenceTo
     */
    public void setJunctionReferenceTo(java.lang.String[] junctionReferenceTo) {
        this.junctionReferenceTo = junctionReferenceTo;
    }

    public java.lang.String getJunctionReferenceTo(int i) {
        return this.junctionReferenceTo[i];
    }

    public void setJunctionReferenceTo(int i, java.lang.String _value) {
        this.junctionReferenceTo[i] = _value;
    }


    /**
     * Gets the relationshipName value for this ChildRelationship.
     * 
     * @return relationshipName
     */
    public java.lang.String getRelationshipName() {
        return relationshipName;
    }


    /**
     * Sets the relationshipName value for this ChildRelationship.
     * 
     * @param relationshipName
     */
    public void setRelationshipName(java.lang.String relationshipName) {
        this.relationshipName = relationshipName;
    }


    /**
     * Gets the restrictedDelete value for this ChildRelationship.
     * 
     * @return restrictedDelete
     */
    public java.lang.Boolean getRestrictedDelete() {
        return restrictedDelete;
    }


    /**
     * Sets the restrictedDelete value for this ChildRelationship.
     * 
     * @param restrictedDelete
     */
    public void setRestrictedDelete(java.lang.Boolean restrictedDelete) {
        this.restrictedDelete = restrictedDelete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildRelationship)) return false;
        ChildRelationship other = (ChildRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cascadeDelete == other.isCascadeDelete() &&
            ((this.childSObject==null && other.getChildSObject()==null) || 
             (this.childSObject!=null &&
              this.childSObject.equals(other.getChildSObject()))) &&
            this.deprecatedAndHidden == other.isDeprecatedAndHidden() &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.junctionIdListName==null && other.getJunctionIdListName()==null) || 
             (this.junctionIdListName!=null &&
              this.junctionIdListName.equals(other.getJunctionIdListName()))) &&
            ((this.junctionReferenceTo==null && other.getJunctionReferenceTo()==null) || 
             (this.junctionReferenceTo!=null &&
              java.util.Arrays.equals(this.junctionReferenceTo, other.getJunctionReferenceTo()))) &&
            ((this.relationshipName==null && other.getRelationshipName()==null) || 
             (this.relationshipName!=null &&
              this.relationshipName.equals(other.getRelationshipName()))) &&
            ((this.restrictedDelete==null && other.getRestrictedDelete()==null) || 
             (this.restrictedDelete!=null &&
              this.restrictedDelete.equals(other.getRestrictedDelete())));
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
        _hashCode += (isCascadeDelete() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChildSObject() != null) {
            _hashCode += getChildSObject().hashCode();
        }
        _hashCode += (isDeprecatedAndHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getJunctionIdListName() != null) {
            _hashCode += getJunctionIdListName().hashCode();
        }
        if (getJunctionReferenceTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJunctionReferenceTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJunctionReferenceTo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationshipName() != null) {
            _hashCode += getRelationshipName().hashCode();
        }
        if (getRestrictedDelete() != null) {
            _hashCode += getRestrictedDelete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChildRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ChildRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cascadeDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "cascadeDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "childSObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deprecatedAndHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "deprecatedAndHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("junctionIdListName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "junctionIdListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("junctionReferenceTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "junctionReferenceTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "relationshipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "restrictedDelete"));
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
