/**
 * FeedLayoutComponentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FeedLayoutComponentType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedLayoutComponentType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HelpAndToolLinks = "HelpAndToolLinks";
    public static final java.lang.String _CustomButtons = "CustomButtons";
    public static final java.lang.String _Following = "Following";
    public static final java.lang.String _Followers = "Followers";
    public static final java.lang.String _CustomLinks = "CustomLinks";
    public static final java.lang.String _Milestones = "Milestones";
    public static final java.lang.String _Topics = "Topics";
    public static final java.lang.String _CaseUnifiedFiles = "CaseUnifiedFiles";
    public static final java.lang.String _Visualforce = "Visualforce";
    public static final FeedLayoutComponentType HelpAndToolLinks = new FeedLayoutComponentType(_HelpAndToolLinks);
    public static final FeedLayoutComponentType CustomButtons = new FeedLayoutComponentType(_CustomButtons);
    public static final FeedLayoutComponentType Following = new FeedLayoutComponentType(_Following);
    public static final FeedLayoutComponentType Followers = new FeedLayoutComponentType(_Followers);
    public static final FeedLayoutComponentType CustomLinks = new FeedLayoutComponentType(_CustomLinks);
    public static final FeedLayoutComponentType Milestones = new FeedLayoutComponentType(_Milestones);
    public static final FeedLayoutComponentType Topics = new FeedLayoutComponentType(_Topics);
    public static final FeedLayoutComponentType CaseUnifiedFiles = new FeedLayoutComponentType(_CaseUnifiedFiles);
    public static final FeedLayoutComponentType Visualforce = new FeedLayoutComponentType(_Visualforce);
    public java.lang.String getValue() { return _value_;}
    public static FeedLayoutComponentType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedLayoutComponentType enumeration = (FeedLayoutComponentType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedLayoutComponentType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedLayoutComponentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayoutComponentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
