/**
 * DashboardComponentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardComponentType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DashboardComponentType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Bar = "Bar";
    public static final java.lang.String _BarGrouped = "BarGrouped";
    public static final java.lang.String _BarStacked = "BarStacked";
    public static final java.lang.String _BarStacked100 = "BarStacked100";
    public static final java.lang.String _Column = "Column";
    public static final java.lang.String _ColumnGrouped = "ColumnGrouped";
    public static final java.lang.String _ColumnStacked = "ColumnStacked";
    public static final java.lang.String _ColumnStacked100 = "ColumnStacked100";
    public static final java.lang.String _Line = "Line";
    public static final java.lang.String _LineGrouped = "LineGrouped";
    public static final java.lang.String _Pie = "Pie";
    public static final java.lang.String _Table = "Table";
    public static final java.lang.String _Metric = "Metric";
    public static final java.lang.String _Gauge = "Gauge";
    public static final java.lang.String _LineCumulative = "LineCumulative";
    public static final java.lang.String _LineGroupedCumulative = "LineGroupedCumulative";
    public static final java.lang.String _Scontrol = "Scontrol";
    public static final java.lang.String _VisualforcePage = "VisualforcePage";
    public static final java.lang.String _Donut = "Donut";
    public static final java.lang.String _Funnel = "Funnel";
    public static final java.lang.String _ColumnLine = "ColumnLine";
    public static final java.lang.String _ColumnLineGrouped = "ColumnLineGrouped";
    public static final java.lang.String _ColumnLineStacked = "ColumnLineStacked";
    public static final java.lang.String _ColumnLineStacked100 = "ColumnLineStacked100";
    public static final java.lang.String _Scatter = "Scatter";
    public static final java.lang.String _ScatterGrouped = "ScatterGrouped";
    public static final DashboardComponentType Bar = new DashboardComponentType(_Bar);
    public static final DashboardComponentType BarGrouped = new DashboardComponentType(_BarGrouped);
    public static final DashboardComponentType BarStacked = new DashboardComponentType(_BarStacked);
    public static final DashboardComponentType BarStacked100 = new DashboardComponentType(_BarStacked100);
    public static final DashboardComponentType Column = new DashboardComponentType(_Column);
    public static final DashboardComponentType ColumnGrouped = new DashboardComponentType(_ColumnGrouped);
    public static final DashboardComponentType ColumnStacked = new DashboardComponentType(_ColumnStacked);
    public static final DashboardComponentType ColumnStacked100 = new DashboardComponentType(_ColumnStacked100);
    public static final DashboardComponentType Line = new DashboardComponentType(_Line);
    public static final DashboardComponentType LineGrouped = new DashboardComponentType(_LineGrouped);
    public static final DashboardComponentType Pie = new DashboardComponentType(_Pie);
    public static final DashboardComponentType Table = new DashboardComponentType(_Table);
    public static final DashboardComponentType Metric = new DashboardComponentType(_Metric);
    public static final DashboardComponentType Gauge = new DashboardComponentType(_Gauge);
    public static final DashboardComponentType LineCumulative = new DashboardComponentType(_LineCumulative);
    public static final DashboardComponentType LineGroupedCumulative = new DashboardComponentType(_LineGroupedCumulative);
    public static final DashboardComponentType Scontrol = new DashboardComponentType(_Scontrol);
    public static final DashboardComponentType VisualforcePage = new DashboardComponentType(_VisualforcePage);
    public static final DashboardComponentType Donut = new DashboardComponentType(_Donut);
    public static final DashboardComponentType Funnel = new DashboardComponentType(_Funnel);
    public static final DashboardComponentType ColumnLine = new DashboardComponentType(_ColumnLine);
    public static final DashboardComponentType ColumnLineGrouped = new DashboardComponentType(_ColumnLineGrouped);
    public static final DashboardComponentType ColumnLineStacked = new DashboardComponentType(_ColumnLineStacked);
    public static final DashboardComponentType ColumnLineStacked100 = new DashboardComponentType(_ColumnLineStacked100);
    public static final DashboardComponentType Scatter = new DashboardComponentType(_Scatter);
    public static final DashboardComponentType ScatterGrouped = new DashboardComponentType(_ScatterGrouped);
    public java.lang.String getValue() { return _value_;}
    public static DashboardComponentType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DashboardComponentType enumeration = (DashboardComponentType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DashboardComponentType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DashboardComponentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
