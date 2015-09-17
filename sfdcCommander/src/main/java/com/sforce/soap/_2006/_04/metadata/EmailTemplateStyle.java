/**
 * EmailTemplateStyle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EmailTemplateStyle implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EmailTemplateStyle(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _freeForm = "freeForm";
    public static final java.lang.String _formalLetter = "formalLetter";
    public static final java.lang.String _promotionRight = "promotionRight";
    public static final java.lang.String _promotionLeft = "promotionLeft";
    public static final java.lang.String _newsletter = "newsletter";
    public static final java.lang.String _products = "products";
    public static final EmailTemplateStyle none = new EmailTemplateStyle(_none);
    public static final EmailTemplateStyle freeForm = new EmailTemplateStyle(_freeForm);
    public static final EmailTemplateStyle formalLetter = new EmailTemplateStyle(_formalLetter);
    public static final EmailTemplateStyle promotionRight = new EmailTemplateStyle(_promotionRight);
    public static final EmailTemplateStyle promotionLeft = new EmailTemplateStyle(_promotionLeft);
    public static final EmailTemplateStyle newsletter = new EmailTemplateStyle(_newsletter);
    public static final EmailTemplateStyle products = new EmailTemplateStyle(_products);
    public java.lang.String getValue() { return _value_;}
    public static EmailTemplateStyle fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EmailTemplateStyle enumeration = (EmailTemplateStyle)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EmailTemplateStyle fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EmailTemplateStyle.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailTemplateStyle"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
