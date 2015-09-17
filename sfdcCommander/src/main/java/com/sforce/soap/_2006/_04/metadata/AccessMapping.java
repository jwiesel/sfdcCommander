/**
 * AccessMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AccessMapping  implements java.io.Serializable {
    private java.lang.String accessLevel;

    private java.lang.String object;

    private java.lang.String objectField;

    private java.lang.String userField;

    public AccessMapping() {
    }

    public AccessMapping(
           java.lang.String accessLevel,
           java.lang.String object,
           java.lang.String objectField,
           java.lang.String userField) {
           this.accessLevel = accessLevel;
           this.object = object;
           this.objectField = objectField;
           this.userField = userField;
    }


    /**
     * Gets the accessLevel value for this AccessMapping.
     * 
     * @return accessLevel
     */
    public java.lang.String getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this AccessMapping.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(java.lang.String accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the object value for this AccessMapping.
     * 
     * @return object
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this AccessMapping.
     * 
     * @param object
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }


    /**
     * Gets the objectField value for this AccessMapping.
     * 
     * @return objectField
     */
    public java.lang.String getObjectField() {
        return objectField;
    }


    /**
     * Sets the objectField value for this AccessMapping.
     * 
     * @param objectField
     */
    public void setObjectField(java.lang.String objectField) {
        this.objectField = objectField;
    }


    /**
     * Gets the userField value for this AccessMapping.
     * 
     * @return userField
     */
    public java.lang.String getUserField() {
        return userField;
    }


    /**
     * Sets the userField value for this AccessMapping.
     * 
     * @param userField
     */
    public void setUserField(java.lang.String userField) {
        this.userField = userField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessMapping)) return false;
        AccessMapping other = (AccessMapping) obj;
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
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            ((this.objectField==null && other.getObjectField()==null) || 
             (this.objectField!=null &&
              this.objectField.equals(other.getObjectField()))) &&
            ((this.userField==null && other.getUserField()==null) || 
             (this.userField!=null &&
              this.userField.equals(other.getUserField())));
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
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        if (getObjectField() != null) {
            _hashCode += getObjectField().hashCode();
        }
        if (getUserField() != null) {
            _hashCode += getUserField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccessMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "objectField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userField"));
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
