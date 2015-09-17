/**
 * MinPasswordLength.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MinPasswordLength implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MinPasswordLength(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FiveCharacters = "FiveCharacters";
    public static final java.lang.String _EightCharacters = "EightCharacters";
    public static final java.lang.String _TenCharacters = "TenCharacters";
    public static final java.lang.String _TwelveCharacters = "TwelveCharacters";
    public static final java.lang.String _FifteenCharacters = "FifteenCharacters";
    public static final MinPasswordLength FiveCharacters = new MinPasswordLength(_FiveCharacters);
    public static final MinPasswordLength EightCharacters = new MinPasswordLength(_EightCharacters);
    public static final MinPasswordLength TenCharacters = new MinPasswordLength(_TenCharacters);
    public static final MinPasswordLength TwelveCharacters = new MinPasswordLength(_TwelveCharacters);
    public static final MinPasswordLength FifteenCharacters = new MinPasswordLength(_FifteenCharacters);
    public java.lang.String getValue() { return _value_;}
    public static MinPasswordLength fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MinPasswordLength enumeration = (MinPasswordLength)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MinPasswordLength fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MinPasswordLength.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MinPasswordLength"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
