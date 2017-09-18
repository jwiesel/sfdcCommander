/**
 * AuthProviderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AuthProviderType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthProviderType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Facebook = "Facebook";
    public static final java.lang.String _Janrain = "Janrain";
    public static final java.lang.String _Salesforce = "Salesforce";
    public static final java.lang.String _OpenIdConnect = "OpenIdConnect";
    public static final java.lang.String _MicrosoftACS = "MicrosoftACS";
    public static final java.lang.String _LinkedIn = "LinkedIn";
    public static final java.lang.String _Twitter = "Twitter";
    public static final java.lang.String _Google = "Google";
    public static final java.lang.String _GitHub = "GitHub";
    public static final java.lang.String _Custom = "Custom";
    public static final AuthProviderType Facebook = new AuthProviderType(_Facebook);
    public static final AuthProviderType Janrain = new AuthProviderType(_Janrain);
    public static final AuthProviderType Salesforce = new AuthProviderType(_Salesforce);
    public static final AuthProviderType OpenIdConnect = new AuthProviderType(_OpenIdConnect);
    public static final AuthProviderType MicrosoftACS = new AuthProviderType(_MicrosoftACS);
    public static final AuthProviderType LinkedIn = new AuthProviderType(_LinkedIn);
    public static final AuthProviderType Twitter = new AuthProviderType(_Twitter);
    public static final AuthProviderType Google = new AuthProviderType(_Google);
    public static final AuthProviderType GitHub = new AuthProviderType(_GitHub);
    public static final AuthProviderType Custom = new AuthProviderType(_Custom);
    public java.lang.String getValue() { return _value_;}
    public static AuthProviderType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuthProviderType enumeration = (AuthProviderType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuthProviderType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuthProviderType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuthProviderType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
