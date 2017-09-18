/**
 * PlatformActionListContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PlatformActionListContext implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PlatformActionListContext(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ListView = "ListView";
    public static final java.lang.String _RelatedList = "RelatedList";
    public static final java.lang.String _ListViewRecord = "ListViewRecord";
    public static final java.lang.String _RelatedListRecord = "RelatedListRecord";
    public static final java.lang.String _Record = "Record";
    public static final java.lang.String _FeedElement = "FeedElement";
    public static final java.lang.String _Chatter = "Chatter";
    public static final java.lang.String _Global = "Global";
    public static final java.lang.String _Flexipage = "Flexipage";
    public static final java.lang.String _MruList = "MruList";
    public static final java.lang.String _MruRow = "MruRow";
    public static final java.lang.String _RecordEdit = "RecordEdit";
    public static final java.lang.String _Photo = "Photo";
    public static final java.lang.String _BannerPhoto = "BannerPhoto";
    public static final java.lang.String _ObjectHomeChart = "ObjectHomeChart";
    public static final java.lang.String _ListViewDefinition = "ListViewDefinition";
    public static final java.lang.String _Dockable = "Dockable";
    public static final java.lang.String _Lookup = "Lookup";
    public static final java.lang.String _Assistant = "Assistant";
    public static final PlatformActionListContext ListView = new PlatformActionListContext(_ListView);
    public static final PlatformActionListContext RelatedList = new PlatformActionListContext(_RelatedList);
    public static final PlatformActionListContext ListViewRecord = new PlatformActionListContext(_ListViewRecord);
    public static final PlatformActionListContext RelatedListRecord = new PlatformActionListContext(_RelatedListRecord);
    public static final PlatformActionListContext Record = new PlatformActionListContext(_Record);
    public static final PlatformActionListContext FeedElement = new PlatformActionListContext(_FeedElement);
    public static final PlatformActionListContext Chatter = new PlatformActionListContext(_Chatter);
    public static final PlatformActionListContext Global = new PlatformActionListContext(_Global);
    public static final PlatformActionListContext Flexipage = new PlatformActionListContext(_Flexipage);
    public static final PlatformActionListContext MruList = new PlatformActionListContext(_MruList);
    public static final PlatformActionListContext MruRow = new PlatformActionListContext(_MruRow);
    public static final PlatformActionListContext RecordEdit = new PlatformActionListContext(_RecordEdit);
    public static final PlatformActionListContext Photo = new PlatformActionListContext(_Photo);
    public static final PlatformActionListContext BannerPhoto = new PlatformActionListContext(_BannerPhoto);
    public static final PlatformActionListContext ObjectHomeChart = new PlatformActionListContext(_ObjectHomeChart);
    public static final PlatformActionListContext ListViewDefinition = new PlatformActionListContext(_ListViewDefinition);
    public static final PlatformActionListContext Dockable = new PlatformActionListContext(_Dockable);
    public static final PlatformActionListContext Lookup = new PlatformActionListContext(_Lookup);
    public static final PlatformActionListContext Assistant = new PlatformActionListContext(_Assistant);
    public java.lang.String getValue() { return _value_;}
    public static PlatformActionListContext fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PlatformActionListContext enumeration = (PlatformActionListContext)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PlatformActionListContext fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PlatformActionListContext.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformActionListContext"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
