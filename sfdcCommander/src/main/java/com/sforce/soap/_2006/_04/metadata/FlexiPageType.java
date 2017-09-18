/**
 * FlexiPageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlexiPageType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlexiPageType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AppPage = "AppPage";
    public static final java.lang.String _ObjectPage = "ObjectPage";
    public static final java.lang.String _RecordPage = "RecordPage";
    public static final java.lang.String _HomePage = "HomePage";
    public static final java.lang.String _MailAppAppPage = "MailAppAppPage";
    public static final java.lang.String _CommAppPage = "CommAppPage";
    public static final java.lang.String _CommForgotPasswordPage = "CommForgotPasswordPage";
    public static final java.lang.String _CommLoginPage = "CommLoginPage";
    public static final java.lang.String _CommObjectPage = "CommObjectPage";
    public static final java.lang.String _CommQuickActionCreatePage = "CommQuickActionCreatePage";
    public static final java.lang.String _CommRecordPage = "CommRecordPage";
    public static final java.lang.String _CommRelatedListPage = "CommRelatedListPage";
    public static final java.lang.String _CommSearchResultPage = "CommSearchResultPage";
    public static final java.lang.String _CommSelfRegisterPage = "CommSelfRegisterPage";
    public static final java.lang.String _CommThemeLayoutPage = "CommThemeLayoutPage";
    public static final java.lang.String _UtilityBar = "UtilityBar";
    public static final java.lang.String _RecordPreview = "RecordPreview";
    public static final FlexiPageType AppPage = new FlexiPageType(_AppPage);
    public static final FlexiPageType ObjectPage = new FlexiPageType(_ObjectPage);
    public static final FlexiPageType RecordPage = new FlexiPageType(_RecordPage);
    public static final FlexiPageType HomePage = new FlexiPageType(_HomePage);
    public static final FlexiPageType MailAppAppPage = new FlexiPageType(_MailAppAppPage);
    public static final FlexiPageType CommAppPage = new FlexiPageType(_CommAppPage);
    public static final FlexiPageType CommForgotPasswordPage = new FlexiPageType(_CommForgotPasswordPage);
    public static final FlexiPageType CommLoginPage = new FlexiPageType(_CommLoginPage);
    public static final FlexiPageType CommObjectPage = new FlexiPageType(_CommObjectPage);
    public static final FlexiPageType CommQuickActionCreatePage = new FlexiPageType(_CommQuickActionCreatePage);
    public static final FlexiPageType CommRecordPage = new FlexiPageType(_CommRecordPage);
    public static final FlexiPageType CommRelatedListPage = new FlexiPageType(_CommRelatedListPage);
    public static final FlexiPageType CommSearchResultPage = new FlexiPageType(_CommSearchResultPage);
    public static final FlexiPageType CommSelfRegisterPage = new FlexiPageType(_CommSelfRegisterPage);
    public static final FlexiPageType CommThemeLayoutPage = new FlexiPageType(_CommThemeLayoutPage);
    public static final FlexiPageType UtilityBar = new FlexiPageType(_UtilityBar);
    public static final FlexiPageType RecordPreview = new FlexiPageType(_RecordPreview);
    public java.lang.String getValue() { return _value_;}
    public static FlexiPageType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlexiPageType enumeration = (FlexiPageType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlexiPageType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlexiPageType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
