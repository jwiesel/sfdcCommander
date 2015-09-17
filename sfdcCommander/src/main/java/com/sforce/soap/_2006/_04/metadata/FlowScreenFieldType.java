/**
 * FlowScreenFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowScreenFieldType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlowScreenFieldType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DisplayText = "DisplayText";
    public static final java.lang.String _InputField = "InputField";
    public static final java.lang.String _LargeTextArea = "LargeTextArea";
    public static final java.lang.String _PasswordField = "PasswordField";
    public static final java.lang.String _RadioButtons = "RadioButtons";
    public static final java.lang.String _DropdownBox = "DropdownBox";
    public static final java.lang.String _MultiSelectCheckboxes = "MultiSelectCheckboxes";
    public static final java.lang.String _MultiSelectPicklist = "MultiSelectPicklist";
    public static final FlowScreenFieldType DisplayText = new FlowScreenFieldType(_DisplayText);
    public static final FlowScreenFieldType InputField = new FlowScreenFieldType(_InputField);
    public static final FlowScreenFieldType LargeTextArea = new FlowScreenFieldType(_LargeTextArea);
    public static final FlowScreenFieldType PasswordField = new FlowScreenFieldType(_PasswordField);
    public static final FlowScreenFieldType RadioButtons = new FlowScreenFieldType(_RadioButtons);
    public static final FlowScreenFieldType DropdownBox = new FlowScreenFieldType(_DropdownBox);
    public static final FlowScreenFieldType MultiSelectCheckboxes = new FlowScreenFieldType(_MultiSelectCheckboxes);
    public static final FlowScreenFieldType MultiSelectPicklist = new FlowScreenFieldType(_MultiSelectPicklist);
    public java.lang.String getValue() { return _value_;}
    public static FlowScreenFieldType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlowScreenFieldType enumeration = (FlowScreenFieldType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlowScreenFieldType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlowScreenFieldType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreenFieldType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
