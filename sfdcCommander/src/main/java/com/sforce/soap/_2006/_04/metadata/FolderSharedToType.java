/**
 * FolderSharedToType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FolderSharedToType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FolderSharedToType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Group = "Group";
    public static final java.lang.String _Role = "Role";
    public static final java.lang.String _RoleAndSubordinates = "RoleAndSubordinates";
    public static final java.lang.String _RoleAndSubordinatesInternal = "RoleAndSubordinatesInternal";
    public static final java.lang.String _Manager = "Manager";
    public static final java.lang.String _ManagerAndSubordinatesInternal = "ManagerAndSubordinatesInternal";
    public static final java.lang.String _Organization = "Organization";
    public static final java.lang.String _Territory = "Territory";
    public static final java.lang.String _TerritoryAndSubordinates = "TerritoryAndSubordinates";
    public static final java.lang.String _AllPrmUsers = "AllPrmUsers";
    public static final java.lang.String _User = "User";
    public static final java.lang.String _PartnerUser = "PartnerUser";
    public static final java.lang.String _AllCspUsers = "AllCspUsers";
    public static final java.lang.String _CustomerPortalUser = "CustomerPortalUser";
    public static final java.lang.String _PortalRole = "PortalRole";
    public static final java.lang.String _PortalRoleAndSubordinates = "PortalRoleAndSubordinates";
    public static final FolderSharedToType Group = new FolderSharedToType(_Group);
    public static final FolderSharedToType Role = new FolderSharedToType(_Role);
    public static final FolderSharedToType RoleAndSubordinates = new FolderSharedToType(_RoleAndSubordinates);
    public static final FolderSharedToType RoleAndSubordinatesInternal = new FolderSharedToType(_RoleAndSubordinatesInternal);
    public static final FolderSharedToType Manager = new FolderSharedToType(_Manager);
    public static final FolderSharedToType ManagerAndSubordinatesInternal = new FolderSharedToType(_ManagerAndSubordinatesInternal);
    public static final FolderSharedToType Organization = new FolderSharedToType(_Organization);
    public static final FolderSharedToType Territory = new FolderSharedToType(_Territory);
    public static final FolderSharedToType TerritoryAndSubordinates = new FolderSharedToType(_TerritoryAndSubordinates);
    public static final FolderSharedToType AllPrmUsers = new FolderSharedToType(_AllPrmUsers);
    public static final FolderSharedToType User = new FolderSharedToType(_User);
    public static final FolderSharedToType PartnerUser = new FolderSharedToType(_PartnerUser);
    public static final FolderSharedToType AllCspUsers = new FolderSharedToType(_AllCspUsers);
    public static final FolderSharedToType CustomerPortalUser = new FolderSharedToType(_CustomerPortalUser);
    public static final FolderSharedToType PortalRole = new FolderSharedToType(_PortalRole);
    public static final FolderSharedToType PortalRoleAndSubordinates = new FolderSharedToType(_PortalRoleAndSubordinates);
    public java.lang.String getValue() { return _value_;}
    public static FolderSharedToType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FolderSharedToType enumeration = (FolderSharedToType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FolderSharedToType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FolderSharedToType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderSharedToType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
