/**
 * ModerationRuleAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ModerationRuleAction implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ModerationRuleAction(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Block = "Block";
    public static final java.lang.String _FreezeAndNotify = "FreezeAndNotify";
    public static final java.lang.String _Review = "Review";
    public static final java.lang.String _Replace = "Replace";
    public static final java.lang.String _Flag = "Flag";
    public static final ModerationRuleAction Block = new ModerationRuleAction(_Block);
    public static final ModerationRuleAction FreezeAndNotify = new ModerationRuleAction(_FreezeAndNotify);
    public static final ModerationRuleAction Review = new ModerationRuleAction(_Review);
    public static final ModerationRuleAction Replace = new ModerationRuleAction(_Replace);
    public static final ModerationRuleAction Flag = new ModerationRuleAction(_Flag);
    public java.lang.String getValue() { return _value_;}
    public static ModerationRuleAction fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ModerationRuleAction enumeration = (ModerationRuleAction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ModerationRuleAction fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ModerationRuleAction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ModerationRuleAction"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
