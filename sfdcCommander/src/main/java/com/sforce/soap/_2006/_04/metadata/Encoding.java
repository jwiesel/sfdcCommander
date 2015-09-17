/**
 * Encoding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Encoding implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Encoding(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "UTF-8";
    public static final java.lang.String _value2 = "ISO-8859-1";
    public static final java.lang.String _value3 = "Shift_JIS";
    public static final java.lang.String _value4 = "ISO-2022-JP";
    public static final java.lang.String _value5 = "EUC-JP";
    public static final java.lang.String _value6 = "ks_c_5601-1987";
    public static final java.lang.String _value7 = "Big5";
    public static final java.lang.String _value8 = "GB2312";
    public static final java.lang.String _value9 = "Big5-HKSCS";
    public static final java.lang.String _value10 = "x-SJIS_0213";
    public static final Encoding value1 = new Encoding(_value1);
    public static final Encoding value2 = new Encoding(_value2);
    public static final Encoding value3 = new Encoding(_value3);
    public static final Encoding value4 = new Encoding(_value4);
    public static final Encoding value5 = new Encoding(_value5);
    public static final Encoding value6 = new Encoding(_value6);
    public static final Encoding value7 = new Encoding(_value7);
    public static final Encoding value8 = new Encoding(_value8);
    public static final Encoding value9 = new Encoding(_value9);
    public static final Encoding value10 = new Encoding(_value10);
    public java.lang.String getValue() { return _value_;}
    public static Encoding fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Encoding enumeration = (Encoding)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Encoding fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Encoding.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Encoding"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
