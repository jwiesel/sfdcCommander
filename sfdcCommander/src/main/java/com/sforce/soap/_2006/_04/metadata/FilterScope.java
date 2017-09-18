/**
 * FilterScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FilterScope implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FilterScope(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Everything = "Everything";
    public static final java.lang.String _Mine = "Mine";
    public static final java.lang.String _Queue = "Queue";
    public static final java.lang.String _Delegated = "Delegated";
    public static final java.lang.String _MyTerritory = "MyTerritory";
    public static final java.lang.String _MyTeamTerritory = "MyTeamTerritory";
    public static final java.lang.String _Team = "Team";
    public static final java.lang.String _AssignedToMe = "AssignedToMe";
    public static final FilterScope Everything = new FilterScope(_Everything);
    public static final FilterScope Mine = new FilterScope(_Mine);
    public static final FilterScope Queue = new FilterScope(_Queue);
    public static final FilterScope Delegated = new FilterScope(_Delegated);
    public static final FilterScope MyTerritory = new FilterScope(_MyTerritory);
    public static final FilterScope MyTeamTerritory = new FilterScope(_MyTeamTerritory);
    public static final FilterScope Team = new FilterScope(_Team);
    public static final FilterScope AssignedToMe = new FilterScope(_AssignedToMe);
    public java.lang.String getValue() { return _value_;}
    public static FilterScope fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FilterScope enumeration = (FilterScope)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FilterScope fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FilterScope.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterScope"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
