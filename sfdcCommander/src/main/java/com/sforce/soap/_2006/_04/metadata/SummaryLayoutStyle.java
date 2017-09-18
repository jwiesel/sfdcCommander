/**
 * SummaryLayoutStyle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SummaryLayoutStyle implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SummaryLayoutStyle(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Default = "Default";
    public static final java.lang.String _QuoteTemplate = "QuoteTemplate";
    public static final java.lang.String _DefaultQuoteTemplate = "DefaultQuoteTemplate";
    public static final java.lang.String _ServiceReportTemplate = "ServiceReportTemplate";
    public static final java.lang.String _ChildServiceReportTemplateStyle = "ChildServiceReportTemplateStyle";
    public static final java.lang.String _DefaultServiceReportTemplate = "DefaultServiceReportTemplate";
    public static final java.lang.String _CaseInteraction = "CaseInteraction";
    public static final java.lang.String _QuickActionLayoutLeftRight = "QuickActionLayoutLeftRight";
    public static final java.lang.String _QuickActionLayoutTopDown = "QuickActionLayoutTopDown";
    public static final java.lang.String _PathAssistant = "PathAssistant";
    public static final SummaryLayoutStyle Default = new SummaryLayoutStyle(_Default);
    public static final SummaryLayoutStyle QuoteTemplate = new SummaryLayoutStyle(_QuoteTemplate);
    public static final SummaryLayoutStyle DefaultQuoteTemplate = new SummaryLayoutStyle(_DefaultQuoteTemplate);
    public static final SummaryLayoutStyle ServiceReportTemplate = new SummaryLayoutStyle(_ServiceReportTemplate);
    public static final SummaryLayoutStyle ChildServiceReportTemplateStyle = new SummaryLayoutStyle(_ChildServiceReportTemplateStyle);
    public static final SummaryLayoutStyle DefaultServiceReportTemplate = new SummaryLayoutStyle(_DefaultServiceReportTemplate);
    public static final SummaryLayoutStyle CaseInteraction = new SummaryLayoutStyle(_CaseInteraction);
    public static final SummaryLayoutStyle QuickActionLayoutLeftRight = new SummaryLayoutStyle(_QuickActionLayoutLeftRight);
    public static final SummaryLayoutStyle QuickActionLayoutTopDown = new SummaryLayoutStyle(_QuickActionLayoutTopDown);
    public static final SummaryLayoutStyle PathAssistant = new SummaryLayoutStyle(_PathAssistant);
    public java.lang.String getValue() { return _value_;}
    public static SummaryLayoutStyle fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SummaryLayoutStyle enumeration = (SummaryLayoutStyle)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SummaryLayoutStyle fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SummaryLayoutStyle.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayoutStyle"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
