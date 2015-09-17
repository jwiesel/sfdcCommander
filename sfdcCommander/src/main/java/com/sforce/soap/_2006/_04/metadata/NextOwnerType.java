/**
 * NextOwnerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class NextOwnerType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NextOwnerType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _adhoc = "adhoc";
    public static final java.lang.String _user = "user";
    public static final java.lang.String _userHierarchyField = "userHierarchyField";
    public static final java.lang.String _relatedUserField = "relatedUserField";
    public static final java.lang.String _queue = "queue";
    public static final NextOwnerType adhoc = new NextOwnerType(_adhoc);
    public static final NextOwnerType user = new NextOwnerType(_user);
    public static final NextOwnerType userHierarchyField = new NextOwnerType(_userHierarchyField);
    public static final NextOwnerType relatedUserField = new NextOwnerType(_relatedUserField);
    public static final NextOwnerType queue = new NextOwnerType(_queue);
    public java.lang.String getValue() { return _value_;}
    public static NextOwnerType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NextOwnerType enumeration = (NextOwnerType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NextOwnerType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NextOwnerType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NextOwnerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
