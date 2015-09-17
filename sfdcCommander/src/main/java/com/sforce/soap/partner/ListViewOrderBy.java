/**
 * ListViewOrderBy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class ListViewOrderBy  implements java.io.Serializable {
    private java.lang.String fieldNameOrPath;

    private com.sforce.soap.partner.OrderByNullsPosition nullsPosition;

    private com.sforce.soap.partner.OrderByDirection sortDirection;

    public ListViewOrderBy() {
    }

    public ListViewOrderBy(
           java.lang.String fieldNameOrPath,
           com.sforce.soap.partner.OrderByNullsPosition nullsPosition,
           com.sforce.soap.partner.OrderByDirection sortDirection) {
           this.fieldNameOrPath = fieldNameOrPath;
           this.nullsPosition = nullsPosition;
           this.sortDirection = sortDirection;
    }


    /**
     * Gets the fieldNameOrPath value for this ListViewOrderBy.
     * 
     * @return fieldNameOrPath
     */
    public java.lang.String getFieldNameOrPath() {
        return fieldNameOrPath;
    }


    /**
     * Sets the fieldNameOrPath value for this ListViewOrderBy.
     * 
     * @param fieldNameOrPath
     */
    public void setFieldNameOrPath(java.lang.String fieldNameOrPath) {
        this.fieldNameOrPath = fieldNameOrPath;
    }


    /**
     * Gets the nullsPosition value for this ListViewOrderBy.
     * 
     * @return nullsPosition
     */
    public com.sforce.soap.partner.OrderByNullsPosition getNullsPosition() {
        return nullsPosition;
    }


    /**
     * Sets the nullsPosition value for this ListViewOrderBy.
     * 
     * @param nullsPosition
     */
    public void setNullsPosition(com.sforce.soap.partner.OrderByNullsPosition nullsPosition) {
        this.nullsPosition = nullsPosition;
    }


    /**
     * Gets the sortDirection value for this ListViewOrderBy.
     * 
     * @return sortDirection
     */
    public com.sforce.soap.partner.OrderByDirection getSortDirection() {
        return sortDirection;
    }


    /**
     * Sets the sortDirection value for this ListViewOrderBy.
     * 
     * @param sortDirection
     */
    public void setSortDirection(com.sforce.soap.partner.OrderByDirection sortDirection) {
        this.sortDirection = sortDirection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListViewOrderBy)) return false;
        ListViewOrderBy other = (ListViewOrderBy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldNameOrPath==null && other.getFieldNameOrPath()==null) || 
             (this.fieldNameOrPath!=null &&
              this.fieldNameOrPath.equals(other.getFieldNameOrPath()))) &&
            ((this.nullsPosition==null && other.getNullsPosition()==null) || 
             (this.nullsPosition!=null &&
              this.nullsPosition.equals(other.getNullsPosition()))) &&
            ((this.sortDirection==null && other.getSortDirection()==null) || 
             (this.sortDirection!=null &&
              this.sortDirection.equals(other.getSortDirection())));
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
        if (getFieldNameOrPath() != null) {
            _hashCode += getFieldNameOrPath().hashCode();
        }
        if (getNullsPosition() != null) {
            _hashCode += getNullsPosition().hashCode();
        }
        if (getSortDirection() != null) {
            _hashCode += getSortDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListViewOrderBy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewOrderBy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNameOrPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldNameOrPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nullsPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "nullsPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "orderByNullsPosition"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sortDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "orderByDirection"));
        elemField.setNillable(true);
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
