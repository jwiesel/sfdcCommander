/**
 * CaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class CaseType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CaseType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Nominative = "Nominative";
    public static final java.lang.String _Accusative = "Accusative";
    public static final java.lang.String _Genitive = "Genitive";
    public static final java.lang.String _Dative = "Dative";
    public static final java.lang.String _Inessive = "Inessive";
    public static final java.lang.String _Elative = "Elative";
    public static final java.lang.String _Illative = "Illative";
    public static final java.lang.String _Adessive = "Adessive";
    public static final java.lang.String _Ablative = "Ablative";
    public static final java.lang.String _Allative = "Allative";
    public static final java.lang.String _Essive = "Essive";
    public static final java.lang.String _Translative = "Translative";
    public static final java.lang.String _Partitive = "Partitive";
    public static final java.lang.String _Objective = "Objective";
    public static final java.lang.String _Subjective = "Subjective";
    public static final java.lang.String _Instrumental = "Instrumental";
    public static final java.lang.String _Prepositional = "Prepositional";
    public static final java.lang.String _Locative = "Locative";
    public static final java.lang.String _Vocative = "Vocative";
    public static final java.lang.String _Sublative = "Sublative";
    public static final java.lang.String _Superessive = "Superessive";
    public static final java.lang.String _Delative = "Delative";
    public static final java.lang.String _Causalfinal = "Causalfinal";
    public static final java.lang.String _Essiveformal = "Essiveformal";
    public static final java.lang.String _Termanative = "Termanative";
    public static final java.lang.String _Distributive = "Distributive";
    public static final java.lang.String _Ergative = "Ergative";
    public static final java.lang.String _Adverbial = "Adverbial";
    public static final java.lang.String _Abessive = "Abessive";
    public static final java.lang.String _Comitative = "Comitative";
    public static final CaseType Nominative = new CaseType(_Nominative);
    public static final CaseType Accusative = new CaseType(_Accusative);
    public static final CaseType Genitive = new CaseType(_Genitive);
    public static final CaseType Dative = new CaseType(_Dative);
    public static final CaseType Inessive = new CaseType(_Inessive);
    public static final CaseType Elative = new CaseType(_Elative);
    public static final CaseType Illative = new CaseType(_Illative);
    public static final CaseType Adessive = new CaseType(_Adessive);
    public static final CaseType Ablative = new CaseType(_Ablative);
    public static final CaseType Allative = new CaseType(_Allative);
    public static final CaseType Essive = new CaseType(_Essive);
    public static final CaseType Translative = new CaseType(_Translative);
    public static final CaseType Partitive = new CaseType(_Partitive);
    public static final CaseType Objective = new CaseType(_Objective);
    public static final CaseType Subjective = new CaseType(_Subjective);
    public static final CaseType Instrumental = new CaseType(_Instrumental);
    public static final CaseType Prepositional = new CaseType(_Prepositional);
    public static final CaseType Locative = new CaseType(_Locative);
    public static final CaseType Vocative = new CaseType(_Vocative);
    public static final CaseType Sublative = new CaseType(_Sublative);
    public static final CaseType Superessive = new CaseType(_Superessive);
    public static final CaseType Delative = new CaseType(_Delative);
    public static final CaseType Causalfinal = new CaseType(_Causalfinal);
    public static final CaseType Essiveformal = new CaseType(_Essiveformal);
    public static final CaseType Termanative = new CaseType(_Termanative);
    public static final CaseType Distributive = new CaseType(_Distributive);
    public static final CaseType Ergative = new CaseType(_Ergative);
    public static final CaseType Adverbial = new CaseType(_Adverbial);
    public static final CaseType Abessive = new CaseType(_Abessive);
    public static final CaseType Comitative = new CaseType(_Comitative);
    public java.lang.String getValue() { return _value_;}
    public static CaseType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CaseType enumeration = (CaseType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CaseType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CaseType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "CaseType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
