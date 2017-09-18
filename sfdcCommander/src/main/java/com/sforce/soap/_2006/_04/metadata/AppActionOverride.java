/**
 * AppActionOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AppActionOverride  extends com.sforce.soap._2006._04.metadata.ActionOverride  implements java.io.Serializable {
    private java.lang.String pageOrSobjectType;

    public AppActionOverride() {
    }

    public AppActionOverride(
           java.lang.String actionName,
           java.lang.String comment,
           java.lang.String content,
           com.sforce.soap._2006._04.metadata.FormFactor formFactor,
           java.lang.Boolean skipRecordTypeSelect,
           com.sforce.soap._2006._04.metadata.ActionOverrideType type,
           java.lang.String pageOrSobjectType) {
        super(
            actionName,
            comment,
            content,
            formFactor,
            skipRecordTypeSelect,
            type);
        this.pageOrSobjectType = pageOrSobjectType;
    }


    /**
     * Gets the pageOrSobjectType value for this AppActionOverride.
     * 
     * @return pageOrSobjectType
     */
    public java.lang.String getPageOrSobjectType() {
        return pageOrSobjectType;
    }


    /**
     * Sets the pageOrSobjectType value for this AppActionOverride.
     * 
     * @param pageOrSobjectType
     */
    public void setPageOrSobjectType(java.lang.String pageOrSobjectType) {
        this.pageOrSobjectType = pageOrSobjectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppActionOverride)) return false;
        AppActionOverride other = (AppActionOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pageOrSobjectType==null && other.getPageOrSobjectType()==null) || 
             (this.pageOrSobjectType!=null &&
              this.pageOrSobjectType.equals(other.getPageOrSobjectType())));
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
        if (getPageOrSobjectType() != null) {
            _hashCode += getPageOrSobjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppActionOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AppActionOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageOrSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageOrSobjectType"));
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
