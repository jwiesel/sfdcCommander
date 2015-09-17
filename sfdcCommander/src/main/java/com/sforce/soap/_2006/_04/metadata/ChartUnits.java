/**
 * ChartUnits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ChartUnits implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChartUnits(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Auto = "Auto";
    public static final java.lang.String _Integer = "Integer";
    public static final java.lang.String _Hundreds = "Hundreds";
    public static final java.lang.String _Thousands = "Thousands";
    public static final java.lang.String _Millions = "Millions";
    public static final java.lang.String _Billions = "Billions";
    public static final java.lang.String _Trillions = "Trillions";
    public static final ChartUnits Auto = new ChartUnits(_Auto);
    public static final ChartUnits Integer = new ChartUnits(_Integer);
    public static final ChartUnits Hundreds = new ChartUnits(_Hundreds);
    public static final ChartUnits Thousands = new ChartUnits(_Thousands);
    public static final ChartUnits Millions = new ChartUnits(_Millions);
    public static final ChartUnits Billions = new ChartUnits(_Billions);
    public static final ChartUnits Trillions = new ChartUnits(_Trillions);
    public java.lang.String getValue() { return _value_;}
    public static ChartUnits fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ChartUnits enumeration = (ChartUnits)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChartUnits fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ChartUnits.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartUnits"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
