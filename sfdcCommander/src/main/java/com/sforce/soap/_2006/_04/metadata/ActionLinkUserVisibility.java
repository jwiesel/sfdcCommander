/**
 * ActionLinkUserVisibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ActionLinkUserVisibility implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionLinkUserVisibility(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Creator = "Creator";
    public static final java.lang.String _Everyone = "Everyone";
    public static final java.lang.String _EveryoneButCreator = "EveryoneButCreator";
    public static final java.lang.String _Manager = "Manager";
    public static final java.lang.String _CustomUser = "CustomUser";
    public static final java.lang.String _CustomExcludedUser = "CustomExcludedUser";
    public static final ActionLinkUserVisibility Creator = new ActionLinkUserVisibility(_Creator);
    public static final ActionLinkUserVisibility Everyone = new ActionLinkUserVisibility(_Everyone);
    public static final ActionLinkUserVisibility EveryoneButCreator = new ActionLinkUserVisibility(_EveryoneButCreator);
    public static final ActionLinkUserVisibility Manager = new ActionLinkUserVisibility(_Manager);
    public static final ActionLinkUserVisibility CustomUser = new ActionLinkUserVisibility(_CustomUser);
    public static final ActionLinkUserVisibility CustomExcludedUser = new ActionLinkUserVisibility(_CustomExcludedUser);
    public java.lang.String getValue() { return _value_;}
    public static ActionLinkUserVisibility fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionLinkUserVisibility enumeration = (ActionLinkUserVisibility)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionLinkUserVisibility fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionLinkUserVisibility.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkUserVisibility"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
