/**
 * ReportTypeColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportTypeColumn  implements java.io.Serializable {
    private boolean checkedByDefault;

    private java.lang.String displayNameOverride;

    private java.lang.String field;

    private java.lang.String table;

    public ReportTypeColumn() {
    }

    public ReportTypeColumn(
           boolean checkedByDefault,
           java.lang.String displayNameOverride,
           java.lang.String field,
           java.lang.String table) {
           this.checkedByDefault = checkedByDefault;
           this.displayNameOverride = displayNameOverride;
           this.field = field;
           this.table = table;
    }


    /**
     * Gets the checkedByDefault value for this ReportTypeColumn.
     * 
     * @return checkedByDefault
     */
    public boolean isCheckedByDefault() {
        return checkedByDefault;
    }


    /**
     * Sets the checkedByDefault value for this ReportTypeColumn.
     * 
     * @param checkedByDefault
     */
    public void setCheckedByDefault(boolean checkedByDefault) {
        this.checkedByDefault = checkedByDefault;
    }


    /**
     * Gets the displayNameOverride value for this ReportTypeColumn.
     * 
     * @return displayNameOverride
     */
    public java.lang.String getDisplayNameOverride() {
        return displayNameOverride;
    }


    /**
     * Sets the displayNameOverride value for this ReportTypeColumn.
     * 
     * @param displayNameOverride
     */
    public void setDisplayNameOverride(java.lang.String displayNameOverride) {
        this.displayNameOverride = displayNameOverride;
    }


    /**
     * Gets the field value for this ReportTypeColumn.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this ReportTypeColumn.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the table value for this ReportTypeColumn.
     * 
     * @return table
     */
    public java.lang.String getTable() {
        return table;
    }


    /**
     * Sets the table value for this ReportTypeColumn.
     * 
     * @param table
     */
    public void setTable(java.lang.String table) {
        this.table = table;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportTypeColumn)) return false;
        ReportTypeColumn other = (ReportTypeColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.checkedByDefault == other.isCheckedByDefault() &&
            ((this.displayNameOverride==null && other.getDisplayNameOverride()==null) || 
             (this.displayNameOverride!=null &&
              this.displayNameOverride.equals(other.getDisplayNameOverride()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.table==null && other.getTable()==null) || 
             (this.table!=null &&
              this.table.equals(other.getTable())));
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
        _hashCode += (isCheckedByDefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDisplayNameOverride() != null) {
            _hashCode += getDisplayNameOverride().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getTable() != null) {
            _hashCode += getTable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportTypeColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkedByDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "checkedByDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayNameOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayNameOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("table");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "table"));
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
