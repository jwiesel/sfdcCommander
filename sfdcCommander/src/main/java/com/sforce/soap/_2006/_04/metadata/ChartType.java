/**
 * ChartType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ChartType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChartType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Scatter = "Scatter";
    public static final java.lang.String _ScatterGrouped = "ScatterGrouped";
    public static final java.lang.String _Bubble = "Bubble";
    public static final java.lang.String _BubbleGrouped = "BubbleGrouped";
    public static final java.lang.String _HorizontalBar = "HorizontalBar";
    public static final java.lang.String _HorizontalBarGrouped = "HorizontalBarGrouped";
    public static final java.lang.String _HorizontalBarStacked = "HorizontalBarStacked";
    public static final java.lang.String _HorizontalBarStackedTo100 = "HorizontalBarStackedTo100";
    public static final java.lang.String _VerticalColumn = "VerticalColumn";
    public static final java.lang.String _VerticalColumnGrouped = "VerticalColumnGrouped";
    public static final java.lang.String _VerticalColumnStacked = "VerticalColumnStacked";
    public static final java.lang.String _VerticalColumnStackedTo100 = "VerticalColumnStackedTo100";
    public static final java.lang.String _Line = "Line";
    public static final java.lang.String _LineGrouped = "LineGrouped";
    public static final java.lang.String _LineCumulative = "LineCumulative";
    public static final java.lang.String _LineCumulativeGrouped = "LineCumulativeGrouped";
    public static final java.lang.String _Pie = "Pie";
    public static final java.lang.String _Donut = "Donut";
    public static final java.lang.String _Funnel = "Funnel";
    public static final java.lang.String _VerticalColumnLine = "VerticalColumnLine";
    public static final java.lang.String _VerticalColumnGroupedLine = "VerticalColumnGroupedLine";
    public static final java.lang.String _VerticalColumnStackedLine = "VerticalColumnStackedLine";
    public static final java.lang.String _Plugin = "Plugin";
    public static final ChartType None = new ChartType(_None);
    public static final ChartType Scatter = new ChartType(_Scatter);
    public static final ChartType ScatterGrouped = new ChartType(_ScatterGrouped);
    public static final ChartType Bubble = new ChartType(_Bubble);
    public static final ChartType BubbleGrouped = new ChartType(_BubbleGrouped);
    public static final ChartType HorizontalBar = new ChartType(_HorizontalBar);
    public static final ChartType HorizontalBarGrouped = new ChartType(_HorizontalBarGrouped);
    public static final ChartType HorizontalBarStacked = new ChartType(_HorizontalBarStacked);
    public static final ChartType HorizontalBarStackedTo100 = new ChartType(_HorizontalBarStackedTo100);
    public static final ChartType VerticalColumn = new ChartType(_VerticalColumn);
    public static final ChartType VerticalColumnGrouped = new ChartType(_VerticalColumnGrouped);
    public static final ChartType VerticalColumnStacked = new ChartType(_VerticalColumnStacked);
    public static final ChartType VerticalColumnStackedTo100 = new ChartType(_VerticalColumnStackedTo100);
    public static final ChartType Line = new ChartType(_Line);
    public static final ChartType LineGrouped = new ChartType(_LineGrouped);
    public static final ChartType LineCumulative = new ChartType(_LineCumulative);
    public static final ChartType LineCumulativeGrouped = new ChartType(_LineCumulativeGrouped);
    public static final ChartType Pie = new ChartType(_Pie);
    public static final ChartType Donut = new ChartType(_Donut);
    public static final ChartType Funnel = new ChartType(_Funnel);
    public static final ChartType VerticalColumnLine = new ChartType(_VerticalColumnLine);
    public static final ChartType VerticalColumnGroupedLine = new ChartType(_VerticalColumnGroupedLine);
    public static final ChartType VerticalColumnStackedLine = new ChartType(_VerticalColumnStackedLine);
    public static final ChartType Plugin = new ChartType(_Plugin);
    public java.lang.String getValue() { return _value_;}
    public static ChartType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ChartType enumeration = (ChartType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChartType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ChartType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
