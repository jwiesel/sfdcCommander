/**
 * SharingModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SharingModel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SharingModel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Private = "Private";
    public static final java.lang.String _Read = "Read";
    public static final java.lang.String _ReadSelect = "ReadSelect";
    public static final java.lang.String _ReadWrite = "ReadWrite";
    public static final java.lang.String _ReadWriteTransfer = "ReadWriteTransfer";
    public static final java.lang.String _FullAccess = "FullAccess";
    public static final java.lang.String _ControlledByParent = "ControlledByParent";
    public static final SharingModel Private = new SharingModel(_Private);
    public static final SharingModel Read = new SharingModel(_Read);
    public static final SharingModel ReadSelect = new SharingModel(_ReadSelect);
    public static final SharingModel ReadWrite = new SharingModel(_ReadWrite);
    public static final SharingModel ReadWriteTransfer = new SharingModel(_ReadWriteTransfer);
    public static final SharingModel FullAccess = new SharingModel(_FullAccess);
    public static final SharingModel ControlledByParent = new SharingModel(_ControlledByParent);
    public java.lang.String getValue() { return _value_;}
    public static SharingModel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SharingModel enumeration = (SharingModel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SharingModel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SharingModel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingModel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
