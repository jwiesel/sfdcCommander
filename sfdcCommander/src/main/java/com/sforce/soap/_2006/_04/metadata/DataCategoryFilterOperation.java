/**
 * DataCategoryFilterOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DataCategoryFilterOperation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DataCategoryFilterOperation(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _above = "above";
    public static final java.lang.String _below = "below";
    public static final java.lang.String _at = "at";
    public static final java.lang.String _aboveOrBelow = "aboveOrBelow";
    public static final DataCategoryFilterOperation above = new DataCategoryFilterOperation(_above);
    public static final DataCategoryFilterOperation below = new DataCategoryFilterOperation(_below);
    public static final DataCategoryFilterOperation at = new DataCategoryFilterOperation(_at);
    public static final DataCategoryFilterOperation aboveOrBelow = new DataCategoryFilterOperation(_aboveOrBelow);
    public java.lang.String getValue() { return _value_;}
    public static DataCategoryFilterOperation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DataCategoryFilterOperation enumeration = (DataCategoryFilterOperation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DataCategoryFilterOperation fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataCategoryFilterOperation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataCategoryFilterOperation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
