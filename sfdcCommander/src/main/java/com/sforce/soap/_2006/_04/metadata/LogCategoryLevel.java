/**
 * LogCategoryLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LogCategoryLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LogCategoryLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Internal = "Internal";
    public static final java.lang.String _Finest = "Finest";
    public static final java.lang.String _Finer = "Finer";
    public static final java.lang.String _Fine = "Fine";
    public static final java.lang.String _Debug = "Debug";
    public static final java.lang.String _Info = "Info";
    public static final java.lang.String _Warn = "Warn";
    public static final java.lang.String _Error = "Error";
    public static final LogCategoryLevel Internal = new LogCategoryLevel(_Internal);
    public static final LogCategoryLevel Finest = new LogCategoryLevel(_Finest);
    public static final LogCategoryLevel Finer = new LogCategoryLevel(_Finer);
    public static final LogCategoryLevel Fine = new LogCategoryLevel(_Fine);
    public static final LogCategoryLevel Debug = new LogCategoryLevel(_Debug);
    public static final LogCategoryLevel Info = new LogCategoryLevel(_Info);
    public static final LogCategoryLevel Warn = new LogCategoryLevel(_Warn);
    public static final LogCategoryLevel Error = new LogCategoryLevel(_Error);
    public java.lang.String getValue() { return _value_;}
    public static LogCategoryLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LogCategoryLevel enumeration = (LogCategoryLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LogCategoryLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LogCategoryLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LogCategoryLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
