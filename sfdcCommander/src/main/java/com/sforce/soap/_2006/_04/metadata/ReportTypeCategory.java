/**
 * ReportTypeCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportTypeCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportTypeCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _accounts = "accounts";
    public static final java.lang.String _opportunities = "opportunities";
    public static final java.lang.String _forecasts = "forecasts";
    public static final java.lang.String _cases = "cases";
    public static final java.lang.String _leads = "leads";
    public static final java.lang.String _campaigns = "campaigns";
    public static final java.lang.String _activities = "activities";
    public static final java.lang.String _busop = "busop";
    public static final java.lang.String _products = "products";
    public static final java.lang.String _admin = "admin";
    public static final java.lang.String _territory = "territory";
    public static final java.lang.String _other = "other";
    public static final java.lang.String _content = "content";
    public static final java.lang.String _usage_entitlement = "usage_entitlement";
    public static final java.lang.String _wdc = "wdc";
    public static final java.lang.String _calibration = "calibration";
    public static final java.lang.String _territory2 = "territory2";
    public static final ReportTypeCategory accounts = new ReportTypeCategory(_accounts);
    public static final ReportTypeCategory opportunities = new ReportTypeCategory(_opportunities);
    public static final ReportTypeCategory forecasts = new ReportTypeCategory(_forecasts);
    public static final ReportTypeCategory cases = new ReportTypeCategory(_cases);
    public static final ReportTypeCategory leads = new ReportTypeCategory(_leads);
    public static final ReportTypeCategory campaigns = new ReportTypeCategory(_campaigns);
    public static final ReportTypeCategory activities = new ReportTypeCategory(_activities);
    public static final ReportTypeCategory busop = new ReportTypeCategory(_busop);
    public static final ReportTypeCategory products = new ReportTypeCategory(_products);
    public static final ReportTypeCategory admin = new ReportTypeCategory(_admin);
    public static final ReportTypeCategory territory = new ReportTypeCategory(_territory);
    public static final ReportTypeCategory other = new ReportTypeCategory(_other);
    public static final ReportTypeCategory content = new ReportTypeCategory(_content);
    public static final ReportTypeCategory usage_entitlement = new ReportTypeCategory(_usage_entitlement);
    public static final ReportTypeCategory wdc = new ReportTypeCategory(_wdc);
    public static final ReportTypeCategory calibration = new ReportTypeCategory(_calibration);
    public static final ReportTypeCategory territory2 = new ReportTypeCategory(_territory2);
    public java.lang.String getValue() { return _value_;}
    public static ReportTypeCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportTypeCategory enumeration = (ReportTypeCategory)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportTypeCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportTypeCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
