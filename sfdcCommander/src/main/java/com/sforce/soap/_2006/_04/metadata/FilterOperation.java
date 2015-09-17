/**
 * FilterOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FilterOperation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FilterOperation(java.lang.String value) {
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
    public static final java.lang.String _within = "within";
    public static final FilterOperation equals = new FilterOperation(_equals);
    public static final FilterOperation notEqual = new FilterOperation(_notEqual);
    public static final FilterOperation lessThan = new FilterOperation(_lessThan);
    public static final FilterOperation greaterThan = new FilterOperation(_greaterThan);
    public static final FilterOperation lessOrEqual = new FilterOperation(_lessOrEqual);
    public static final FilterOperation greaterOrEqual = new FilterOperation(_greaterOrEqual);
    public static final FilterOperation contains = new FilterOperation(_contains);
    public static final FilterOperation notContain = new FilterOperation(_notContain);
    public static final FilterOperation startsWith = new FilterOperation(_startsWith);
    public static final FilterOperation includes = new FilterOperation(_includes);
    public static final FilterOperation excludes = new FilterOperation(_excludes);
    public static final FilterOperation within = new FilterOperation(_within);
    public java.lang.String getValue() { return _value_;}
    public static FilterOperation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FilterOperation enumeration = (FilterOperation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FilterOperation fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FilterOperation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterOperation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
