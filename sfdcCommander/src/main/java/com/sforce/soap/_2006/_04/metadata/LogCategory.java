/**
 * LogCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LogCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LogCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Db = "Db";
    public static final java.lang.String _Workflow = "Workflow";
    public static final java.lang.String _Validation = "Validation";
    public static final java.lang.String _Callout = "Callout";
    public static final java.lang.String _Apex_code = "Apex_code";
    public static final java.lang.String _Apex_profiling = "Apex_profiling";
    public static final java.lang.String _Visualforce = "Visualforce";
    public static final java.lang.String _System = "System";
    public static final java.lang.String _All = "All";
    public static final LogCategory Db = new LogCategory(_Db);
    public static final LogCategory Workflow = new LogCategory(_Workflow);
    public static final LogCategory Validation = new LogCategory(_Validation);
    public static final LogCategory Callout = new LogCategory(_Callout);
    public static final LogCategory Apex_code = new LogCategory(_Apex_code);
    public static final LogCategory Apex_profiling = new LogCategory(_Apex_profiling);
    public static final LogCategory Visualforce = new LogCategory(_Visualforce);
    public static final LogCategory System = new LogCategory(_System);
    public static final LogCategory All = new LogCategory(_All);
    public java.lang.String getValue() { return _value_;}
    public static LogCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LogCategory enumeration = (LogCategory)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LogCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LogCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LogCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
