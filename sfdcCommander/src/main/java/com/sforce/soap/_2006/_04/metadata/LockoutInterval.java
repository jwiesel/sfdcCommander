/**
 * LockoutInterval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LockoutInterval implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LockoutInterval(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FifteenMinutes = "FifteenMinutes";
    public static final java.lang.String _ThirtyMinutes = "ThirtyMinutes";
    public static final java.lang.String _SixtyMinutes = "SixtyMinutes";
    public static final java.lang.String _Forever = "Forever";
    public static final LockoutInterval FifteenMinutes = new LockoutInterval(_FifteenMinutes);
    public static final LockoutInterval ThirtyMinutes = new LockoutInterval(_ThirtyMinutes);
    public static final LockoutInterval SixtyMinutes = new LockoutInterval(_SixtyMinutes);
    public static final LockoutInterval Forever = new LockoutInterval(_Forever);
    public java.lang.String getValue() { return _value_;}
    public static LockoutInterval fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LockoutInterval enumeration = (LockoutInterval)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LockoutInterval fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LockoutInterval.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LockoutInterval"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
