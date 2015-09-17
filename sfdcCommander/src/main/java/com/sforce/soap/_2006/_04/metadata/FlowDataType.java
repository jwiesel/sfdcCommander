/**
 * FlowDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowDataType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlowDataType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Currency = "Currency";
    public static final java.lang.String _Date = "Date";
    public static final java.lang.String _Number = "Number";
    public static final java.lang.String _String = "String";
    public static final java.lang.String _Boolean = "Boolean";
    public static final java.lang.String _SObject = "SObject";
    public static final java.lang.String _DateTime = "DateTime";
    public static final java.lang.String _Picklist = "Picklist";
    public static final java.lang.String _Multipicklist = "Multipicklist";
    public static final FlowDataType Currency = new FlowDataType(_Currency);
    public static final FlowDataType Date = new FlowDataType(_Date);
    public static final FlowDataType Number = new FlowDataType(_Number);
    public static final FlowDataType String = new FlowDataType(_String);
    public static final FlowDataType Boolean = new FlowDataType(_Boolean);
    public static final FlowDataType SObject = new FlowDataType(_SObject);
    public static final FlowDataType DateTime = new FlowDataType(_DateTime);
    public static final FlowDataType Picklist = new FlowDataType(_Picklist);
    public static final FlowDataType Multipicklist = new FlowDataType(_Multipicklist);
    public java.lang.String getValue() { return _value_;}
    public static FlowDataType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlowDataType enumeration = (FlowDataType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlowDataType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlowDataType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDataType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
