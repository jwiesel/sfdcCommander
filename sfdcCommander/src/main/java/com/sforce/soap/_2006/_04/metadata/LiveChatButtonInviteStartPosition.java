/**
 * LiveChatButtonInviteStartPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LiveChatButtonInviteStartPosition implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LiveChatButtonInviteStartPosition(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TopLeft = "TopLeft";
    public static final java.lang.String _TopLeftTop = "TopLeftTop";
    public static final java.lang.String _Top = "Top";
    public static final java.lang.String _TopRightTop = "TopRightTop";
    public static final java.lang.String _TopRight = "TopRight";
    public static final java.lang.String _TopRightRight = "TopRightRight";
    public static final java.lang.String _Right = "Right";
    public static final java.lang.String _BottomRightRight = "BottomRightRight";
    public static final java.lang.String _BottomRight = "BottomRight";
    public static final java.lang.String _BottomRightBottom = "BottomRightBottom";
    public static final java.lang.String _Bottom = "Bottom";
    public static final java.lang.String _BottomLeftBottom = "BottomLeftBottom";
    public static final java.lang.String _BottomLeft = "BottomLeft";
    public static final java.lang.String _BottomLeftLeft = "BottomLeftLeft";
    public static final java.lang.String _Left = "Left";
    public static final java.lang.String _TopLeftLeft = "TopLeftLeft";
    public static final LiveChatButtonInviteStartPosition TopLeft = new LiveChatButtonInviteStartPosition(_TopLeft);
    public static final LiveChatButtonInviteStartPosition TopLeftTop = new LiveChatButtonInviteStartPosition(_TopLeftTop);
    public static final LiveChatButtonInviteStartPosition Top = new LiveChatButtonInviteStartPosition(_Top);
    public static final LiveChatButtonInviteStartPosition TopRightTop = new LiveChatButtonInviteStartPosition(_TopRightTop);
    public static final LiveChatButtonInviteStartPosition TopRight = new LiveChatButtonInviteStartPosition(_TopRight);
    public static final LiveChatButtonInviteStartPosition TopRightRight = new LiveChatButtonInviteStartPosition(_TopRightRight);
    public static final LiveChatButtonInviteStartPosition Right = new LiveChatButtonInviteStartPosition(_Right);
    public static final LiveChatButtonInviteStartPosition BottomRightRight = new LiveChatButtonInviteStartPosition(_BottomRightRight);
    public static final LiveChatButtonInviteStartPosition BottomRight = new LiveChatButtonInviteStartPosition(_BottomRight);
    public static final LiveChatButtonInviteStartPosition BottomRightBottom = new LiveChatButtonInviteStartPosition(_BottomRightBottom);
    public static final LiveChatButtonInviteStartPosition Bottom = new LiveChatButtonInviteStartPosition(_Bottom);
    public static final LiveChatButtonInviteStartPosition BottomLeftBottom = new LiveChatButtonInviteStartPosition(_BottomLeftBottom);
    public static final LiveChatButtonInviteStartPosition BottomLeft = new LiveChatButtonInviteStartPosition(_BottomLeft);
    public static final LiveChatButtonInviteStartPosition BottomLeftLeft = new LiveChatButtonInviteStartPosition(_BottomLeftLeft);
    public static final LiveChatButtonInviteStartPosition Left = new LiveChatButtonInviteStartPosition(_Left);
    public static final LiveChatButtonInviteStartPosition TopLeftLeft = new LiveChatButtonInviteStartPosition(_TopLeftLeft);
    public java.lang.String getValue() { return _value_;}
    public static LiveChatButtonInviteStartPosition fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LiveChatButtonInviteStartPosition enumeration = (LiveChatButtonInviteStartPosition)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LiveChatButtonInviteStartPosition fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LiveChatButtonInviteStartPosition.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonInviteStartPosition"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
