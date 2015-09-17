/**
 * LiveChatButtonInviteEndPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LiveChatButtonInviteEndPosition implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LiveChatButtonInviteEndPosition(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TopLeft = "TopLeft";
    public static final java.lang.String _Top = "Top";
    public static final java.lang.String _TopRight = "TopRight";
    public static final java.lang.String _Left = "Left";
    public static final java.lang.String _Center = "Center";
    public static final java.lang.String _Right = "Right";
    public static final java.lang.String _BottomLeft = "BottomLeft";
    public static final java.lang.String _Bottom = "Bottom";
    public static final java.lang.String _BottomRight = "BottomRight";
    public static final LiveChatButtonInviteEndPosition TopLeft = new LiveChatButtonInviteEndPosition(_TopLeft);
    public static final LiveChatButtonInviteEndPosition Top = new LiveChatButtonInviteEndPosition(_Top);
    public static final LiveChatButtonInviteEndPosition TopRight = new LiveChatButtonInviteEndPosition(_TopRight);
    public static final LiveChatButtonInviteEndPosition Left = new LiveChatButtonInviteEndPosition(_Left);
    public static final LiveChatButtonInviteEndPosition Center = new LiveChatButtonInviteEndPosition(_Center);
    public static final LiveChatButtonInviteEndPosition Right = new LiveChatButtonInviteEndPosition(_Right);
    public static final LiveChatButtonInviteEndPosition BottomLeft = new LiveChatButtonInviteEndPosition(_BottomLeft);
    public static final LiveChatButtonInviteEndPosition Bottom = new LiveChatButtonInviteEndPosition(_Bottom);
    public static final LiveChatButtonInviteEndPosition BottomRight = new LiveChatButtonInviteEndPosition(_BottomRight);
    public java.lang.String getValue() { return _value_;}
    public static LiveChatButtonInviteEndPosition fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LiveChatButtonInviteEndPosition enumeration = (LiveChatButtonInviteEndPosition)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LiveChatButtonInviteEndPosition fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LiveChatButtonInviteEndPosition.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonInviteEndPosition"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
