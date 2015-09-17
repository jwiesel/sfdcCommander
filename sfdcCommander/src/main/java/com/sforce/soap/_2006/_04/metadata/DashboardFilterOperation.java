/**
 * DashboardFilterOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardFilterOperation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DashboardFilterOperation(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _equals = "equals";
    public static final java.lang.String _notEqual = "notEqual";
    public static final java.lang.String _lessThan = "lessThan";
    public static final java.lang.String _greaterThan = "greaterThan";
    public static final java.lang.String _lessOrEqual = "lessOrEqual";
    public static final java.lang.String _greaterOrEqual = "greaterOrEqual";
    public static final java.lang.String _contains = "contains";
    public static final java.lang.String _notContain = "notContain";
    public static final java.lang.String _startsWith = "startsWith";
    public static final java.lang.String _includes = "includes";
    public static final java.lang.String _excludes = "excludes";
    public static final java.lang.String _between = "between";
    public static final DashboardFilterOperation equals = new DashboardFilterOperation(_equals);
    public static final DashboardFilterOperation notEqual = new DashboardFilterOperation(_notEqual);
    public static final DashboardFilterOperation lessThan = new DashboardFilterOperation(_lessThan);
    public static final DashboardFilterOperation greaterThan = new DashboardFilterOperation(_greaterThan);
    public static final DashboardFilterOperation lessOrEqual = new DashboardFilterOperation(_lessOrEqual);
    public static final DashboardFilterOperation greaterOrEqual = new DashboardFilterOperation(_greaterOrEqual);
    public static final DashboardFilterOperation contains = new DashboardFilterOperation(_contains);
    public static final DashboardFilterOperation notContain = new DashboardFilterOperation(_notContain);
    public static final DashboardFilterOperation startsWith = new DashboardFilterOperation(_startsWith);
    public static final DashboardFilterOperation includes = new DashboardFilterOperation(_includes);
    public static final DashboardFilterOperation excludes = new DashboardFilterOperation(_excludes);
    public static final DashboardFilterOperation between = new DashboardFilterOperation(_between);
    public java.lang.String getValue() { return _value_;}
    public static DashboardFilterOperation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DashboardFilterOperation enumeration = (DashboardFilterOperation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DashboardFilterOperation fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DashboardFilterOperation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilterOperation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
