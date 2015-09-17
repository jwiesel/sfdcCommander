/**
 * MatchingRuleStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MatchingRuleStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MatchingRuleStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Inactive = "Inactive";
    public static final java.lang.String _DeactivationFailed = "DeactivationFailed";
    public static final java.lang.String _Activating = "Activating";
    public static final java.lang.String _Deactivating = "Deactivating";
    public static final java.lang.String _Active = "Active";
    public static final java.lang.String _ActivationFailed = "ActivationFailed";
    public static final MatchingRuleStatus Inactive = new MatchingRuleStatus(_Inactive);
    public static final MatchingRuleStatus DeactivationFailed = new MatchingRuleStatus(_DeactivationFailed);
    public static final MatchingRuleStatus Activating = new MatchingRuleStatus(_Activating);
    public static final MatchingRuleStatus Deactivating = new MatchingRuleStatus(_Deactivating);
    public static final MatchingRuleStatus Active = new MatchingRuleStatus(_Active);
    public static final MatchingRuleStatus ActivationFailed = new MatchingRuleStatus(_ActivationFailed);
    public java.lang.String getValue() { return _value_;}
    public static MatchingRuleStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MatchingRuleStatus enumeration = (MatchingRuleStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MatchingRuleStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MatchingRuleStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingRuleStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
