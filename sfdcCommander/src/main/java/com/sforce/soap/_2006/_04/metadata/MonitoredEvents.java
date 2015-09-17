/**
 * MonitoredEvents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MonitoredEvents implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MonitoredEvents(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AuditTrail = "AuditTrail";
    public static final java.lang.String _Login = "Login";
    public static final java.lang.String _Entity = "Entity";
    public static final java.lang.String _DataExport = "DataExport";
    public static final java.lang.String _AccessResource = "AccessResource";
    public static final MonitoredEvents AuditTrail = new MonitoredEvents(_AuditTrail);
    public static final MonitoredEvents Login = new MonitoredEvents(_Login);
    public static final MonitoredEvents Entity = new MonitoredEvents(_Entity);
    public static final MonitoredEvents DataExport = new MonitoredEvents(_DataExport);
    public static final MonitoredEvents AccessResource = new MonitoredEvents(_AccessResource);
    public java.lang.String getValue() { return _value_;}
    public static MonitoredEvents fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MonitoredEvents enumeration = (MonitoredEvents)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MonitoredEvents fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MonitoredEvents.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MonitoredEvents"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
