/**
 * FieldUpdateOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FieldUpdateOperation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FieldUpdateOperation(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Formula = "Formula";
    public static final java.lang.String _Literal = "Literal";
    public static final java.lang.String _Null = "Null";
    public static final java.lang.String _NextValue = "NextValue";
    public static final java.lang.String _PreviousValue = "PreviousValue";
    public static final java.lang.String _LookupValue = "LookupValue";
    public static final FieldUpdateOperation Formula = new FieldUpdateOperation(_Formula);
    public static final FieldUpdateOperation Literal = new FieldUpdateOperation(_Literal);
    public static final FieldUpdateOperation Null = new FieldUpdateOperation(_Null);
    public static final FieldUpdateOperation NextValue = new FieldUpdateOperation(_NextValue);
    public static final FieldUpdateOperation PreviousValue = new FieldUpdateOperation(_PreviousValue);
    public static final FieldUpdateOperation LookupValue = new FieldUpdateOperation(_LookupValue);
    public java.lang.String getValue() { return _value_;}
    public static FieldUpdateOperation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FieldUpdateOperation enumeration = (FieldUpdateOperation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FieldUpdateOperation fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FieldUpdateOperation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldUpdateOperation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
