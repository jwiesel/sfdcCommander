/**
 * ManageableState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ManageableState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManageableState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _released = "released";
    public static final java.lang.String _deleted = "deleted";
    public static final java.lang.String _deprecated = "deprecated";
    public static final java.lang.String _installed = "installed";
    public static final java.lang.String _beta = "beta";
    public static final java.lang.String _unmanaged = "unmanaged";
    public static final ManageableState released = new ManageableState(_released);
    public static final ManageableState deleted = new ManageableState(_deleted);
    public static final ManageableState deprecated = new ManageableState(_deprecated);
    public static final ManageableState installed = new ManageableState(_installed);
    public static final ManageableState beta = new ManageableState(_beta);
    public static final ManageableState unmanaged = new ManageableState(_unmanaged);
    public java.lang.String getValue() { return _value_;}
    public static ManageableState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManageableState enumeration = (ManageableState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManageableState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManageableState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ManageableState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
