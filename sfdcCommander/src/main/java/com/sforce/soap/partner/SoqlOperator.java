/**
 * SoqlOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SoqlOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SoqlOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _equals = "equals";
    public static final java.lang.String _excludes = "excludes";
    public static final java.lang.String _greaterThan = "greaterThan";
    public static final java.lang.String _greaterThanOrEqualTo = "greaterThanOrEqualTo";
    public static final java.lang.String _in = "in";
    public static final java.lang.String _includes = "includes";
    public static final java.lang.String _lessThan = "lessThan";
    public static final java.lang.String _lessThanOrEqualTo = "lessThanOrEqualTo";
    public static final java.lang.String _like = "like";
    public static final java.lang.String _notEquals = "notEquals";
    public static final java.lang.String _notIn = "notIn";
    public static final java.lang.String _within = "within";
    public static final SoqlOperator equals = new SoqlOperator(_equals);
    public static final SoqlOperator excludes = new SoqlOperator(_excludes);
    public static final SoqlOperator greaterThan = new SoqlOperator(_greaterThan);
    public static final SoqlOperator greaterThanOrEqualTo = new SoqlOperator(_greaterThanOrEqualTo);
    public static final SoqlOperator in = new SoqlOperator(_in);
    public static final SoqlOperator includes = new SoqlOperator(_includes);
    public static final SoqlOperator lessThan = new SoqlOperator(_lessThan);
    public static final SoqlOperator lessThanOrEqualTo = new SoqlOperator(_lessThanOrEqualTo);
    public static final SoqlOperator like = new SoqlOperator(_like);
    public static final SoqlOperator notEquals = new SoqlOperator(_notEquals);
    public static final SoqlOperator notIn = new SoqlOperator(_notIn);
    public static final SoqlOperator within = new SoqlOperator(_within);
    public java.lang.String getValue() { return _value_;}
    public static SoqlOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SoqlOperator enumeration = (SoqlOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SoqlOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SoqlOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "soqlOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
