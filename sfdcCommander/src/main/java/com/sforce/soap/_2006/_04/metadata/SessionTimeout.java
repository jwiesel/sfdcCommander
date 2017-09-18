/**
 * SessionTimeout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SessionTimeout implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SessionTimeout(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TwentyFourHours = "TwentyFourHours";
    public static final java.lang.String _TwelveHours = "TwelveHours";
    public static final java.lang.String _EightHours = "EightHours";
    public static final java.lang.String _FourHours = "FourHours";
    public static final java.lang.String _TwoHours = "TwoHours";
    public static final java.lang.String _SixtyMinutes = "SixtyMinutes";
    public static final java.lang.String _ThirtyMinutes = "ThirtyMinutes";
    public static final java.lang.String _FifteenMinutes = "FifteenMinutes";
    public static final SessionTimeout TwentyFourHours = new SessionTimeout(_TwentyFourHours);
    public static final SessionTimeout TwelveHours = new SessionTimeout(_TwelveHours);
    public static final SessionTimeout EightHours = new SessionTimeout(_EightHours);
    public static final SessionTimeout FourHours = new SessionTimeout(_FourHours);
    public static final SessionTimeout TwoHours = new SessionTimeout(_TwoHours);
    public static final SessionTimeout SixtyMinutes = new SessionTimeout(_SixtyMinutes);
    public static final SessionTimeout ThirtyMinutes = new SessionTimeout(_ThirtyMinutes);
    public static final SessionTimeout FifteenMinutes = new SessionTimeout(_FifteenMinutes);
    public java.lang.String getValue() { return _value_;}
    public static SessionTimeout fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SessionTimeout enumeration = (SessionTimeout)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SessionTimeout fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SessionTimeout.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionTimeout"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
