/**
 * ConnectedAppOauthAccessScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ConnectedAppOauthAccessScope implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConnectedAppOauthAccessScope(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Basic = "Basic";
    public static final java.lang.String _Api = "Api";
    public static final java.lang.String _Web = "Web";
    public static final java.lang.String _Full = "Full";
    public static final java.lang.String _Chatter = "Chatter";
    public static final java.lang.String _CustomApplications = "CustomApplications";
    public static final java.lang.String _RefreshToken = "RefreshToken";
    public static final java.lang.String _OpenID = "OpenID";
    public static final java.lang.String _Profile = "Profile";
    public static final java.lang.String _Email = "Email";
    public static final java.lang.String _Address = "Address";
    public static final java.lang.String _Phone = "Phone";
    public static final java.lang.String _OfflineAccess = "OfflineAccess";
    public static final java.lang.String _CustomPermissions = "CustomPermissions";
    public static final java.lang.String _Wave = "Wave";
    public static final java.lang.String _Eclair = "Eclair";
    public static final ConnectedAppOauthAccessScope Basic = new ConnectedAppOauthAccessScope(_Basic);
    public static final ConnectedAppOauthAccessScope Api = new ConnectedAppOauthAccessScope(_Api);
    public static final ConnectedAppOauthAccessScope Web = new ConnectedAppOauthAccessScope(_Web);
    public static final ConnectedAppOauthAccessScope Full = new ConnectedAppOauthAccessScope(_Full);
    public static final ConnectedAppOauthAccessScope Chatter = new ConnectedAppOauthAccessScope(_Chatter);
    public static final ConnectedAppOauthAccessScope CustomApplications = new ConnectedAppOauthAccessScope(_CustomApplications);
    public static final ConnectedAppOauthAccessScope RefreshToken = new ConnectedAppOauthAccessScope(_RefreshToken);
    public static final ConnectedAppOauthAccessScope OpenID = new ConnectedAppOauthAccessScope(_OpenID);
    public static final ConnectedAppOauthAccessScope Profile = new ConnectedAppOauthAccessScope(_Profile);
    public static final ConnectedAppOauthAccessScope Email = new ConnectedAppOauthAccessScope(_Email);
    public static final ConnectedAppOauthAccessScope Address = new ConnectedAppOauthAccessScope(_Address);
    public static final ConnectedAppOauthAccessScope Phone = new ConnectedAppOauthAccessScope(_Phone);
    public static final ConnectedAppOauthAccessScope OfflineAccess = new ConnectedAppOauthAccessScope(_OfflineAccess);
    public static final ConnectedAppOauthAccessScope CustomPermissions = new ConnectedAppOauthAccessScope(_CustomPermissions);
    public static final ConnectedAppOauthAccessScope Wave = new ConnectedAppOauthAccessScope(_Wave);
    public static final ConnectedAppOauthAccessScope Eclair = new ConnectedAppOauthAccessScope(_Eclair);
    public java.lang.String getValue() { return _value_;}
    public static ConnectedAppOauthAccessScope fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConnectedAppOauthAccessScope enumeration = (ConnectedAppOauthAccessScope)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConnectedAppOauthAccessScope fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConnectedAppOauthAccessScope.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppOauthAccessScope"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
