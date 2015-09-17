/**
 * FlowProcessType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowProcessType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlowProcessType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AutoLaunchedFlow = "AutoLaunchedFlow";
    public static final java.lang.String _Flow = "Flow";
    public static final java.lang.String _Workflow = "Workflow";
    public static final java.lang.String _LoginFlow = "LoginFlow";
    public static final java.lang.String _ActionPlan = "ActionPlan";
    public static final java.lang.String _JourneyBuilderIntegration = "JourneyBuilderIntegration";
    public static final java.lang.String _UserProvisioningFlow = "UserProvisioningFlow";
    public static final FlowProcessType AutoLaunchedFlow = new FlowProcessType(_AutoLaunchedFlow);
    public static final FlowProcessType Flow = new FlowProcessType(_Flow);
    public static final FlowProcessType Workflow = new FlowProcessType(_Workflow);
    public static final FlowProcessType LoginFlow = new FlowProcessType(_LoginFlow);
    public static final FlowProcessType ActionPlan = new FlowProcessType(_ActionPlan);
    public static final FlowProcessType JourneyBuilderIntegration = new FlowProcessType(_JourneyBuilderIntegration);
    public static final FlowProcessType UserProvisioningFlow = new FlowProcessType(_UserProvisioningFlow);
    public java.lang.String getValue() { return _value_;}
    public static FlowProcessType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlowProcessType enumeration = (FlowProcessType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlowProcessType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlowProcessType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowProcessType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
