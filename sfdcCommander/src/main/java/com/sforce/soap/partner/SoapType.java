/**
 * SoapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SoapType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SoapType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "tns:ID";
    public static final java.lang.String _value2 = "xsd:base64Binary";
    public static final java.lang.String _value3 = "xsd:boolean";
    public static final java.lang.String _value4 = "xsd:double";
    public static final java.lang.String _value5 = "xsd:int";
    public static final java.lang.String _value6 = "xsd:string";
    public static final java.lang.String _value7 = "xsd:date";
    public static final java.lang.String _value8 = "xsd:dateTime";
    public static final java.lang.String _value9 = "xsd:time";
    public static final java.lang.String _value10 = "tns:location";
    public static final java.lang.String _value11 = "tns:address";
    public static final java.lang.String _value12 = "xsd:anyType";
    public static final java.lang.String _value13 = "urn:RelationshipReferenceTo";
    public static final java.lang.String _value14 = "urn:JunctionIdListNames";
    public static final java.lang.String _value15 = "urn:SearchLayoutFieldsDisplayed";
    public static final java.lang.String _value16 = "urn:SearchLayoutField";
    public static final java.lang.String _value17 = "urn:SearchLayoutButtonsDisplayed";
    public static final java.lang.String _value18 = "urn:SearchLayoutButton";
    public static final java.lang.String _value19 = "urn:RecordTypesSupported";
    public static final SoapType value1 = new SoapType(_value1);
    public static final SoapType value2 = new SoapType(_value2);
    public static final SoapType value3 = new SoapType(_value3);
    public static final SoapType value4 = new SoapType(_value4);
    public static final SoapType value5 = new SoapType(_value5);
    public static final SoapType value6 = new SoapType(_value6);
    public static final SoapType value7 = new SoapType(_value7);
    public static final SoapType value8 = new SoapType(_value8);
    public static final SoapType value9 = new SoapType(_value9);
    public static final SoapType value10 = new SoapType(_value10);
    public static final SoapType value11 = new SoapType(_value11);
    public static final SoapType value12 = new SoapType(_value12);
    public static final SoapType value13 = new SoapType(_value13);
    public static final SoapType value14 = new SoapType(_value14);
    public static final SoapType value15 = new SoapType(_value15);
    public static final SoapType value16 = new SoapType(_value16);
    public static final SoapType value17 = new SoapType(_value17);
    public static final SoapType value18 = new SoapType(_value18);
    public static final SoapType value19 = new SoapType(_value19);
    public java.lang.String getValue() { return _value_;}
    public static SoapType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SoapType enumeration = (SoapType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SoapType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SoapType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "soapType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
