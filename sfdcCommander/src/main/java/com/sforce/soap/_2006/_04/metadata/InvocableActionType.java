/**
 * InvocableActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class InvocableActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InvocableActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _apex = "apex";
    public static final java.lang.String _chatterPost = "chatterPost";
    public static final java.lang.String _contentWorkspaceEnableFolders = "contentWorkspaceEnableFolders";
    public static final java.lang.String _emailAlert = "emailAlert";
    public static final java.lang.String _emailSimple = "emailSimple";
    public static final java.lang.String _flow = "flow";
    public static final java.lang.String _metricRefresh = "metricRefresh";
    public static final java.lang.String _quickAction = "quickAction";
    public static final java.lang.String _submit = "submit";
    public static final java.lang.String _thanks = "thanks";
    public static final java.lang.String _thunderResponse = "thunderResponse";
    public static final java.lang.String _createServiceReport = "createServiceReport";
    public static final InvocableActionType apex = new InvocableActionType(_apex);
    public static final InvocableActionType chatterPost = new InvocableActionType(_chatterPost);
    public static final InvocableActionType contentWorkspaceEnableFolders = new InvocableActionType(_contentWorkspaceEnableFolders);
    public static final InvocableActionType emailAlert = new InvocableActionType(_emailAlert);
    public static final InvocableActionType emailSimple = new InvocableActionType(_emailSimple);
    public static final InvocableActionType flow = new InvocableActionType(_flow);
    public static final InvocableActionType metricRefresh = new InvocableActionType(_metricRefresh);
    public static final InvocableActionType quickAction = new InvocableActionType(_quickAction);
    public static final InvocableActionType submit = new InvocableActionType(_submit);
    public static final InvocableActionType thanks = new InvocableActionType(_thanks);
    public static final InvocableActionType thunderResponse = new InvocableActionType(_thunderResponse);
    public static final InvocableActionType createServiceReport = new InvocableActionType(_createServiceReport);
    public java.lang.String getValue() { return _value_;}
    public static InvocableActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InvocableActionType enumeration = (InvocableActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InvocableActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InvocableActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "InvocableActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
