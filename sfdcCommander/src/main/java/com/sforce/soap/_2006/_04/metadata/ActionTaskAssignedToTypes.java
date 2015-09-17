/**
 * ActionTaskAssignedToTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ActionTaskAssignedToTypes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionTaskAssignedToTypes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _user = "user";
    public static final java.lang.String _role = "role";
    public static final java.lang.String _opportunityTeam = "opportunityTeam";
    public static final java.lang.String _accountTeam = "accountTeam";
    public static final java.lang.String _owner = "owner";
    public static final java.lang.String _accountOwner = "accountOwner";
    public static final java.lang.String _creator = "creator";
    public static final java.lang.String _accountCreator = "accountCreator";
    public static final java.lang.String _partnerUser = "partnerUser";
    public static final java.lang.String _portalRole = "portalRole";
    public static final ActionTaskAssignedToTypes user = new ActionTaskAssignedToTypes(_user);
    public static final ActionTaskAssignedToTypes role = new ActionTaskAssignedToTypes(_role);
    public static final ActionTaskAssignedToTypes opportunityTeam = new ActionTaskAssignedToTypes(_opportunityTeam);
    public static final ActionTaskAssignedToTypes accountTeam = new ActionTaskAssignedToTypes(_accountTeam);
    public static final ActionTaskAssignedToTypes owner = new ActionTaskAssignedToTypes(_owner);
    public static final ActionTaskAssignedToTypes accountOwner = new ActionTaskAssignedToTypes(_accountOwner);
    public static final ActionTaskAssignedToTypes creator = new ActionTaskAssignedToTypes(_creator);
    public static final ActionTaskAssignedToTypes accountCreator = new ActionTaskAssignedToTypes(_accountCreator);
    public static final ActionTaskAssignedToTypes partnerUser = new ActionTaskAssignedToTypes(_partnerUser);
    public static final ActionTaskAssignedToTypes portalRole = new ActionTaskAssignedToTypes(_portalRole);
    public java.lang.String getValue() { return _value_;}
    public static ActionTaskAssignedToTypes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionTaskAssignedToTypes enumeration = (ActionTaskAssignedToTypes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionTaskAssignedToTypes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionTaskAssignedToTypes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionTaskAssignedToTypes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
