/**
 * ActionEmailRecipientTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ActionEmailRecipientTypes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionEmailRecipientTypes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _group = "group";
    public static final java.lang.String _role = "role";
    public static final java.lang.String _user = "user";
    public static final java.lang.String _opportunityTeam = "opportunityTeam";
    public static final java.lang.String _accountTeam = "accountTeam";
    public static final java.lang.String _roleSubordinates = "roleSubordinates";
    public static final java.lang.String _owner = "owner";
    public static final java.lang.String _creator = "creator";
    public static final java.lang.String _partnerUser = "partnerUser";
    public static final java.lang.String _accountOwner = "accountOwner";
    public static final java.lang.String _customerPortalUser = "customerPortalUser";
    public static final java.lang.String _portalRole = "portalRole";
    public static final java.lang.String _portalRoleSubordinates = "portalRoleSubordinates";
    public static final java.lang.String _contactLookup = "contactLookup";
    public static final java.lang.String _userLookup = "userLookup";
    public static final java.lang.String _roleSubordinatesInternal = "roleSubordinatesInternal";
    public static final java.lang.String _email = "email";
    public static final java.lang.String _caseTeam = "caseTeam";
    public static final java.lang.String _campaignMemberDerivedOwner = "campaignMemberDerivedOwner";
    public static final ActionEmailRecipientTypes group = new ActionEmailRecipientTypes(_group);
    public static final ActionEmailRecipientTypes role = new ActionEmailRecipientTypes(_role);
    public static final ActionEmailRecipientTypes user = new ActionEmailRecipientTypes(_user);
    public static final ActionEmailRecipientTypes opportunityTeam = new ActionEmailRecipientTypes(_opportunityTeam);
    public static final ActionEmailRecipientTypes accountTeam = new ActionEmailRecipientTypes(_accountTeam);
    public static final ActionEmailRecipientTypes roleSubordinates = new ActionEmailRecipientTypes(_roleSubordinates);
    public static final ActionEmailRecipientTypes owner = new ActionEmailRecipientTypes(_owner);
    public static final ActionEmailRecipientTypes creator = new ActionEmailRecipientTypes(_creator);
    public static final ActionEmailRecipientTypes partnerUser = new ActionEmailRecipientTypes(_partnerUser);
    public static final ActionEmailRecipientTypes accountOwner = new ActionEmailRecipientTypes(_accountOwner);
    public static final ActionEmailRecipientTypes customerPortalUser = new ActionEmailRecipientTypes(_customerPortalUser);
    public static final ActionEmailRecipientTypes portalRole = new ActionEmailRecipientTypes(_portalRole);
    public static final ActionEmailRecipientTypes portalRoleSubordinates = new ActionEmailRecipientTypes(_portalRoleSubordinates);
    public static final ActionEmailRecipientTypes contactLookup = new ActionEmailRecipientTypes(_contactLookup);
    public static final ActionEmailRecipientTypes userLookup = new ActionEmailRecipientTypes(_userLookup);
    public static final ActionEmailRecipientTypes roleSubordinatesInternal = new ActionEmailRecipientTypes(_roleSubordinatesInternal);
    public static final ActionEmailRecipientTypes email = new ActionEmailRecipientTypes(_email);
    public static final ActionEmailRecipientTypes caseTeam = new ActionEmailRecipientTypes(_caseTeam);
    public static final ActionEmailRecipientTypes campaignMemberDerivedOwner = new ActionEmailRecipientTypes(_campaignMemberDerivedOwner);
    public java.lang.String getValue() { return _value_;}
    public static ActionEmailRecipientTypes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionEmailRecipientTypes enumeration = (ActionEmailRecipientTypes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionEmailRecipientTypes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionEmailRecipientTypes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionEmailRecipientTypes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
