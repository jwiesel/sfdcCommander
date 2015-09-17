/**
 * QuickActionLayoutItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class QuickActionLayoutItem  implements java.io.Serializable {
    private java.lang.Boolean emptySpace;

    private java.lang.String field;

    private com.sforce.soap._2006._04.metadata.UiBehavior uiBehavior;

    public QuickActionLayoutItem() {
    }

    public QuickActionLayoutItem(
           java.lang.Boolean emptySpace,
           java.lang.String field,
           com.sforce.soap._2006._04.metadata.UiBehavior uiBehavior) {
           this.emptySpace = emptySpace;
           this.field = field;
           this.uiBehavior = uiBehavior;
    }


    /**
     * Gets the emptySpace value for this QuickActionLayoutItem.
     * 
     * @return emptySpace
     */
    public java.lang.Boolean getEmptySpace() {
        return emptySpace;
    }


    /**
     * Sets the emptySpace value for this QuickActionLayoutItem.
     * 
     * @param emptySpace
     */
    public void setEmptySpace(java.lang.Boolean emptySpace) {
        this.emptySpace = emptySpace;
    }


    /**
     * Gets the field value for this QuickActionLayoutItem.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this QuickActionLayoutItem.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the uiBehavior value for this QuickActionLayoutItem.
     * 
     * @return uiBehavior
     */
    public com.sforce.soap._2006._04.metadata.UiBehavior getUiBehavior() {
        return uiBehavior;
    }


    /**
     * Sets the uiBehavior value for this QuickActionLayoutItem.
     * 
     * @param uiBehavior
     */
    public void setUiBehavior(com.sforce.soap._2006._04.metadata.UiBehavior uiBehavior) {
        this.uiBehavior = uiBehavior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuickActionLayoutItem)) return false;
        QuickActionLayoutItem other = (QuickActionLayoutItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emptySpace==null && other.getEmptySpace()==null) || 
             (this.emptySpace!=null &&
              this.emptySpace.equals(other.getEmptySpace()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.uiBehavior==null && other.getUiBehavior()==null) || 
             (this.uiBehavior!=null &&
              this.uiBehavior.equals(other.getUiBehavior())));
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
        if (getEmptySpace() != null) {
            _hashCode += getEmptySpace().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getUiBehavior() != null) {
            _hashCode += getUiBehavior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuickActionLayoutItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayoutItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emptySpace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emptySpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uiBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "uiBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UiBehavior"));
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
