/**
 * FlowComparisonOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowComparisonOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlowComparisonOperator(java.lang.String value) {
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
    public static final java.lang.String _WasSet = "WasSet";
    public static final java.lang.String _WasSelected = "WasSelected";
    public static final java.lang.String _WasVisited = "WasVisited";
    public static final FlowComparisonOperator EqualTo = new FlowComparisonOperator(_EqualTo);
    public static final FlowComparisonOperator NotEqualTo = new FlowComparisonOperator(_NotEqualTo);
    public static final FlowComparisonOperator GreaterThan = new FlowComparisonOperator(_GreaterThan);
    public static final FlowComparisonOperator LessThan = new FlowComparisonOperator(_LessThan);
    public static final FlowComparisonOperator GreaterThanOrEqualTo = new FlowComparisonOperator(_GreaterThanOrEqualTo);
    public static final FlowComparisonOperator LessThanOrEqualTo = new FlowComparisonOperator(_LessThanOrEqualTo);
    public static final FlowComparisonOperator StartsWith = new FlowComparisonOperator(_StartsWith);
    public static final FlowComparisonOperator EndsWith = new FlowComparisonOperator(_EndsWith);
    public static final FlowComparisonOperator Contains = new FlowComparisonOperator(_Contains);
    public static final FlowComparisonOperator IsNull = new FlowComparisonOperator(_IsNull);
    public static final FlowComparisonOperator WasSet = new FlowComparisonOperator(_WasSet);
    public static final FlowComparisonOperator WasSelected = new FlowComparisonOperator(_WasSelected);
    public static final FlowComparisonOperator WasVisited = new FlowComparisonOperator(_WasVisited);
    public java.lang.String getValue() { return _value_;}
    public static FlowComparisonOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlowComparisonOperator enumeration = (FlowComparisonOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlowComparisonOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlowComparisonOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowComparisonOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
