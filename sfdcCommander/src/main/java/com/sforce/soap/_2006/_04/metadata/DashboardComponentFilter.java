/**
 * DashboardComponentFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardComponentFilter implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DashboardComponentFilter(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RowLabelAscending = "RowLabelAscending";
    public static final java.lang.String _RowLabelDescending = "RowLabelDescending";
    public static final java.lang.String _RowValueAscending = "RowValueAscending";
    public static final java.lang.String _RowValueDescending = "RowValueDescending";
    public static final DashboardComponentFilter RowLabelAscending = new DashboardComponentFilter(_RowLabelAscending);
    public static final DashboardComponentFilter RowLabelDescending = new DashboardComponentFilter(_RowLabelDescending);
    public static final DashboardComponentFilter RowValueAscending = new DashboardComponentFilter(_RowValueAscending);
    public static final DashboardComponentFilter RowValueDescending = new DashboardComponentFilter(_RowValueDescending);
    public java.lang.String getValue() { return _value_;}
    public static DashboardComponentFilter fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DashboardComponentFilter enumeration = (DashboardComponentFilter)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DashboardComponentFilter fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DashboardComponentFilter.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentFilter"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
