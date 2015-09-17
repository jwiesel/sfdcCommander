/**
 * QuickActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class QuickActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QuickActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Create = "Create";
    public static final java.lang.String _VisualforcePage = "VisualforcePage";
    public static final java.lang.String _Post = "Post";
    public static final java.lang.String _SendEmail = "SendEmail";
    public static final java.lang.String _LogACall = "LogACall";
    public static final java.lang.String _SocialPost = "SocialPost";
    public static final java.lang.String _Canvas = "Canvas";
    public static final java.lang.String _Update = "Update";
    public static final QuickActionType Create = new QuickActionType(_Create);
    public static final QuickActionType VisualforcePage = new QuickActionType(_VisualforcePage);
    public static final QuickActionType Post = new QuickActionType(_Post);
    public static final QuickActionType SendEmail = new QuickActionType(_SendEmail);
    public static final QuickActionType LogACall = new QuickActionType(_LogACall);
    public static final QuickActionType SocialPost = new QuickActionType(_SocialPost);
    public static final QuickActionType Canvas = new QuickActionType(_Canvas);
    public static final QuickActionType Update = new QuickActionType(_Update);
    public java.lang.String getValue() { return _value_;}
    public static QuickActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        QuickActionType enumeration = (QuickActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QuickActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(QuickActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
