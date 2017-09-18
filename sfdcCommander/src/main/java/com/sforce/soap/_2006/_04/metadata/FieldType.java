/**
 * FieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FieldType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FieldType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AutoNumber = "AutoNumber";
    public static final java.lang.String _Lookup = "Lookup";
    public static final java.lang.String _MasterDetail = "MasterDetail";
    public static final java.lang.String _Checkbox = "Checkbox";
    public static final java.lang.String _Currency = "Currency";
    public static final java.lang.String _Date = "Date";
    public static final java.lang.String _DateTime = "DateTime";
    public static final java.lang.String _Email = "Email";
    public static final java.lang.String _Number = "Number";
    public static final java.lang.String _Percent = "Percent";
    public static final java.lang.String _Phone = "Phone";
    public static final java.lang.String _Picklist = "Picklist";
    public static final java.lang.String _MultiselectPicklist = "MultiselectPicklist";
    public static final java.lang.String _Text = "Text";
    public static final java.lang.String _TextArea = "TextArea";
    public static final java.lang.String _LongTextArea = "LongTextArea";
    public static final java.lang.String _Html = "Html";
    public static final java.lang.String _Url = "Url";
    public static final java.lang.String _EncryptedText = "EncryptedText";
    public static final java.lang.String _Summary = "Summary";
    public static final java.lang.String _Hierarchy = "Hierarchy";
    public static final java.lang.String _File = "File";
    public static final java.lang.String _MetadataRelationship = "MetadataRelationship";
    public static final java.lang.String _ExternalLookup = "ExternalLookup";
    public static final java.lang.String _IndirectLookup = "IndirectLookup";
    public static final java.lang.String _CustomDataType = "CustomDataType";
    public static final FieldType AutoNumber = new FieldType(_AutoNumber);
    public static final FieldType Lookup = new FieldType(_Lookup);
    public static final FieldType MasterDetail = new FieldType(_MasterDetail);
    public static final FieldType Checkbox = new FieldType(_Checkbox);
    public static final FieldType Currency = new FieldType(_Currency);
    public static final FieldType Date = new FieldType(_Date);
    public static final FieldType DateTime = new FieldType(_DateTime);
    public static final FieldType Email = new FieldType(_Email);
    public static final FieldType Number = new FieldType(_Number);
    public static final FieldType Percent = new FieldType(_Percent);
    public static final FieldType Phone = new FieldType(_Phone);
    public static final FieldType Picklist = new FieldType(_Picklist);
    public static final FieldType MultiselectPicklist = new FieldType(_MultiselectPicklist);
    public static final FieldType Text = new FieldType(_Text);
    public static final FieldType TextArea = new FieldType(_TextArea);
    public static final FieldType LongTextArea = new FieldType(_LongTextArea);
    public static final FieldType Html = new FieldType(_Html);
    public static final FieldType Url = new FieldType(_Url);
    public static final FieldType EncryptedText = new FieldType(_EncryptedText);
    public static final FieldType Summary = new FieldType(_Summary);
    public static final FieldType Hierarchy = new FieldType(_Hierarchy);
    public static final FieldType File = new FieldType(_File);
    public static final FieldType MetadataRelationship = new FieldType(_MetadataRelationship);
    public static final FieldType ExternalLookup = new FieldType(_ExternalLookup);
    public static final FieldType IndirectLookup = new FieldType(_IndirectLookup);
    public static final FieldType CustomDataType = new FieldType(_CustomDataType);
    public java.lang.String getValue() { return _value_;}
    public static FieldType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FieldType enumeration = (FieldType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FieldType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FieldType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
