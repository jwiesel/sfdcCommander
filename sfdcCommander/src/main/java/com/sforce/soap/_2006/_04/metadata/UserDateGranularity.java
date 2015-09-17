/**
 * UserDateGranularity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class UserDateGranularity implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserDateGranularity(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Day = "Day";
    public static final java.lang.String _Week = "Week";
    public static final java.lang.String _Month = "Month";
    public static final java.lang.String _Quarter = "Quarter";
    public static final java.lang.String _Year = "Year";
    public static final java.lang.String _FiscalQuarter = "FiscalQuarter";
    public static final java.lang.String _FiscalYear = "FiscalYear";
    public static final java.lang.String _MonthInYear = "MonthInYear";
    public static final java.lang.String _DayInMonth = "DayInMonth";
    public static final java.lang.String _FiscalPeriod = "FiscalPeriod";
    public static final java.lang.String _FiscalWeek = "FiscalWeek";
    public static final UserDateGranularity None = new UserDateGranularity(_None);
    public static final UserDateGranularity Day = new UserDateGranularity(_Day);
    public static final UserDateGranularity Week = new UserDateGranularity(_Week);
    public static final UserDateGranularity Month = new UserDateGranularity(_Month);
    public static final UserDateGranularity Quarter = new UserDateGranularity(_Quarter);
    public static final UserDateGranularity Year = new UserDateGranularity(_Year);
    public static final UserDateGranularity FiscalQuarter = new UserDateGranularity(_FiscalQuarter);
    public static final UserDateGranularity FiscalYear = new UserDateGranularity(_FiscalYear);
    public static final UserDateGranularity MonthInYear = new UserDateGranularity(_MonthInYear);
    public static final UserDateGranularity DayInMonth = new UserDateGranularity(_DayInMonth);
    public static final UserDateGranularity FiscalPeriod = new UserDateGranularity(_FiscalPeriod);
    public static final UserDateGranularity FiscalWeek = new UserDateGranularity(_FiscalWeek);
    public java.lang.String getValue() { return _value_;}
    public static UserDateGranularity fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserDateGranularity enumeration = (UserDateGranularity)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserDateGranularity fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserDateGranularity.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserDateGranularity"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
