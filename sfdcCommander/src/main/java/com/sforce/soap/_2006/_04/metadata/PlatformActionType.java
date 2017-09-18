/**
 * PlatformActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PlatformActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PlatformActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _QuickAction = "QuickAction";
    public static final java.lang.String _StandardButton = "StandardButton";
    public static final java.lang.String _CustomButton = "CustomButton";
    public static final java.lang.String _ProductivityAction = "ProductivityAction";
    public static final java.lang.String _ActionLink = "ActionLink";
    public static final java.lang.String _InvocableAction = "InvocableAction";
    public static final PlatformActionType QuickAction = new PlatformActionType(_QuickAction);
    public static final PlatformActionType StandardButton = new PlatformActionType(_StandardButton);
    public static final PlatformActionType CustomButton = new PlatformActionType(_CustomButton);
    public static final PlatformActionType ProductivityAction = new PlatformActionType(_ProductivityAction);
    public static final PlatformActionType ActionLink = new PlatformActionType(_ActionLink);
    public static final PlatformActionType InvocableAction = new PlatformActionType(_InvocableAction);
    public java.lang.String getValue() { return _value_;}
    public static PlatformActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PlatformActionType enumeration = (PlatformActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PlatformActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PlatformActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
