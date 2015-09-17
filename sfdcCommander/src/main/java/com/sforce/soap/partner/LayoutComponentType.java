/**
 * LayoutComponentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class LayoutComponentType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LayoutComponentType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ReportChart = "ReportChart";
    public static final java.lang.String _Field = "Field";
    public static final java.lang.String _Separator = "Separator";
    public static final java.lang.String _SControl = "SControl";
    public static final java.lang.String _EmptySpace = "EmptySpace";
    public static final java.lang.String _VisualforcePage = "VisualforcePage";
    public static final java.lang.String _ExpandedLookup = "ExpandedLookup";
    public static final java.lang.String _AuraComponent = "AuraComponent";
    public static final java.lang.String _Canvas = "Canvas";
    public static final java.lang.String _CustomLink = "CustomLink";
    public static final java.lang.String _AnalyticsCloud = "AnalyticsCloud";
    public static final LayoutComponentType ReportChart = new LayoutComponentType(_ReportChart);
    public static final LayoutComponentType Field = new LayoutComponentType(_Field);
    public static final LayoutComponentType Separator = new LayoutComponentType(_Separator);
    public static final LayoutComponentType SControl = new LayoutComponentType(_SControl);
    public static final LayoutComponentType EmptySpace = new LayoutComponentType(_EmptySpace);
    public static final LayoutComponentType VisualforcePage = new LayoutComponentType(_VisualforcePage);
    public static final LayoutComponentType ExpandedLookup = new LayoutComponentType(_ExpandedLookup);
    public static final LayoutComponentType AuraComponent = new LayoutComponentType(_AuraComponent);
    public static final LayoutComponentType Canvas = new LayoutComponentType(_Canvas);
    public static final LayoutComponentType CustomLink = new LayoutComponentType(_CustomLink);
    public static final LayoutComponentType AnalyticsCloud = new LayoutComponentType(_AnalyticsCloud);
    public java.lang.String getValue() { return _value_;}
    public static LayoutComponentType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LayoutComponentType enumeration = (LayoutComponentType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LayoutComponentType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LayoutComponentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "layoutComponentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
