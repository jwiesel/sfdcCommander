/**
 * FlowRecordFilterOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowRecordFilterOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlowRecordFilterOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EqualTo = "EqualTo";
    public static final java.lang.String _NotEqualTo = "NotEqualTo";
    public static final java.lang.String _GreaterThan = "GreaterThan";
    public static final java.lang.String _LessThan = "LessThan";
    public static final java.lang.String _GreaterThanOrEqualTo = "GreaterThanOrEqualTo";
    public static final java.lang.String _LessThanOrEqualTo = "LessThanOrEqualTo";
    public static final java.lang.String _StartsWith = "StartsWith";
    public static final java.lang.String _EndsWith = "EndsWith";
    public static final java.lang.String _Contains = "Contains";
    public static final java.lang.String _IsNull = "IsNull";
    public static final FlowRecordFilterOperator EqualTo = new FlowRecordFilterOperator(_EqualTo);
    public static final FlowRecordFilterOperator NotEqualTo = new FlowRecordFilterOperator(_NotEqualTo);
    public static final FlowRecordFilterOperator GreaterThan = new FlowRecordFilterOperator(_GreaterThan);
    public static final FlowRecordFilterOperator LessThan = new FlowRecordFilterOperator(_LessThan);
    public static final FlowRecordFilterOperator GreaterThanOrEqualTo = new FlowRecordFilterOperator(_GreaterThanOrEqualTo);
    public static final FlowRecordFilterOperator LessThanOrEqualTo = new FlowRecordFilterOperator(_LessThanOrEqualTo);
    public static final FlowRecordFilterOperator StartsWith = new FlowRecordFilterOperator(_StartsWith);
    public static final FlowRecordFilterOperator EndsWith = new FlowRecordFilterOperator(_EndsWith);
    public static final FlowRecordFilterOperator Contains = new FlowRecordFilterOperator(_Contains);
    public static final FlowRecordFilterOperator IsNull = new FlowRecordFilterOperator(_IsNull);
    public java.lang.String getValue() { return _value_;}
    public static FlowRecordFilterOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlowRecordFilterOperator enumeration = (FlowRecordFilterOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlowRecordFilterOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlowRecordFilterOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordFilterOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
