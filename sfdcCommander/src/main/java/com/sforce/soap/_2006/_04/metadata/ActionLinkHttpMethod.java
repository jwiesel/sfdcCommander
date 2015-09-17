/**
 * ActionLinkHttpMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ActionLinkHttpMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionLinkHttpMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HttpDelete = "HttpDelete";
    public static final java.lang.String _HttpHead = "HttpHead";
    public static final java.lang.String _HttpGet = "HttpGet";
    public static final java.lang.String _HttpPatch = "HttpPatch";
    public static final java.lang.String _HttpPost = "HttpPost";
    public static final java.lang.String _HttpPut = "HttpPut";
    public static final ActionLinkHttpMethod HttpDelete = new ActionLinkHttpMethod(_HttpDelete);
    public static final ActionLinkHttpMethod HttpHead = new ActionLinkHttpMethod(_HttpHead);
    public static final ActionLinkHttpMethod HttpGet = new ActionLinkHttpMethod(_HttpGet);
    public static final ActionLinkHttpMethod HttpPatch = new ActionLinkHttpMethod(_HttpPatch);
    public static final ActionLinkHttpMethod HttpPost = new ActionLinkHttpMethod(_HttpPost);
    public static final ActionLinkHttpMethod HttpPut = new ActionLinkHttpMethod(_HttpPut);
    public java.lang.String getValue() { return _value_;}
    public static ActionLinkHttpMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionLinkHttpMethod enumeration = (ActionLinkHttpMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionLinkHttpMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionLinkHttpMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkHttpMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
