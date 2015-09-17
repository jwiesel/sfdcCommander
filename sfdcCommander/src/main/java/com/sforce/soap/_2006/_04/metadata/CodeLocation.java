/**
 * CodeLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CodeLocation  implements java.io.Serializable {
    private int column;

    private int line;

    private int numExecutions;

    private double time;

    public CodeLocation() {
    }

    public CodeLocation(
           int column,
           int line,
           int numExecutions,
           double time) {
           this.column = column;
           this.line = line;
           this.numExecutions = numExecutions;
           this.time = time;
    }


    /**
     * Gets the column value for this CodeLocation.
     * 
     * @return column
     */
    public int getColumn() {
        return column;
    }


    /**
     * Sets the column value for this CodeLocation.
     * 
     * @param column
     */
    public void setColumn(int column) {
        this.column = column;
    }


    /**
     * Gets the line value for this CodeLocation.
     * 
     * @return line
     */
    public int getLine() {
        return line;
    }


    /**
     * Sets the line value for this CodeLocation.
     * 
     * @param line
     */
    public void setLine(int line) {
        this.line = line;
    }


    /**
     * Gets the numExecutions value for this CodeLocation.
     * 
     * @return numExecutions
     */
    public int getNumExecutions() {
        return numExecutions;
    }


    /**
     * Sets the numExecutions value for this CodeLocation.
     * 
     * @param numExecutions
     */
    public void setNumExecutions(int numExecutions) {
        this.numExecutions = numExecutions;
    }


    /**
     * Gets the time value for this CodeLocation.
     * 
     * @return time
     */
    public double getTime() {
        return time;
    }


    /**
     * Sets the time value for this CodeLocation.
     * 
     * @param time
     */
    public void setTime(double time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeLocation)) return false;
        CodeLocation other = (CodeLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.column == other.getColumn() &&
            this.line == other.getLine() &&
            this.numExecutions == other.getNumExecutions() &&
            this.time == other.getTime();
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
        _hashCode += getColumn();
        _hashCode += getLine();
        _hashCode += getNumExecutions();
        _hashCode += new Double(getTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numExecutions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numExecutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
