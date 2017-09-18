/**
 * OwnerChangeOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class OwnerChangeOptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OwnerChangeOptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EnforceNewOwnerHasReadAccess = "EnforceNewOwnerHasReadAccess";
    public static final java.lang.String _TransferOpenActivities = "TransferOpenActivities";
    public static final java.lang.String _TransferNotesAndAttachments = "TransferNotesAndAttachments";
    public static final java.lang.String _TransferOthersOpenOpportunities = "TransferOthersOpenOpportunities";
    public static final java.lang.String _TransferOwnedOpenOpportunities = "TransferOwnedOpenOpportunities";
    public static final java.lang.String _TransferContracts = "TransferContracts";
    public static final java.lang.String _TransferOrders = "TransferOrders";
    public static final java.lang.String _TransferContacts = "TransferContacts";
    public static final OwnerChangeOptionType EnforceNewOwnerHasReadAccess = new OwnerChangeOptionType(_EnforceNewOwnerHasReadAccess);
    public static final OwnerChangeOptionType TransferOpenActivities = new OwnerChangeOptionType(_TransferOpenActivities);
    public static final OwnerChangeOptionType TransferNotesAndAttachments = new OwnerChangeOptionType(_TransferNotesAndAttachments);
    public static final OwnerChangeOptionType TransferOthersOpenOpportunities = new OwnerChangeOptionType(_TransferOthersOpenOpportunities);
    public static final OwnerChangeOptionType TransferOwnedOpenOpportunities = new OwnerChangeOptionType(_TransferOwnedOpenOpportunities);
    public static final OwnerChangeOptionType TransferContracts = new OwnerChangeOptionType(_TransferContracts);
    public static final OwnerChangeOptionType TransferOrders = new OwnerChangeOptionType(_TransferOrders);
    public static final OwnerChangeOptionType TransferContacts = new OwnerChangeOptionType(_TransferContacts);
    public java.lang.String getValue() { return _value_;}
    public static OwnerChangeOptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OwnerChangeOptionType enumeration = (OwnerChangeOptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OwnerChangeOptionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OwnerChangeOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "OwnerChangeOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
