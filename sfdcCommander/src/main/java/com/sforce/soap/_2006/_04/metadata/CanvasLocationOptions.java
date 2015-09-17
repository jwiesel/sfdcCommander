/**
 * CanvasLocationOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CanvasLocationOptions implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CanvasLocationOptions(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Chatter = "Chatter";
    public static final java.lang.String _UserProfile = "UserProfile";
    public static final java.lang.String _Visualforce = "Visualforce";
    public static final java.lang.String _Aura = "Aura";
    public static final java.lang.String _Publisher = "Publisher";
    public static final java.lang.String _ChatterFeed = "ChatterFeed";
    public static final java.lang.String _ServiceDesk = "ServiceDesk";
    public static final java.lang.String _OpenCTI = "OpenCTI";
    public static final java.lang.String _AppLauncher = "AppLauncher";
    public static final java.lang.String _MobileNav = "MobileNav";
    public static final java.lang.String _PageLayout = "PageLayout";
    public static final CanvasLocationOptions None = new CanvasLocationOptions(_None);
    public static final CanvasLocationOptions Chatter = new CanvasLocationOptions(_Chatter);
    public static final CanvasLocationOptions UserProfile = new CanvasLocationOptions(_UserProfile);
    public static final CanvasLocationOptions Visualforce = new CanvasLocationOptions(_Visualforce);
    public static final CanvasLocationOptions Aura = new CanvasLocationOptions(_Aura);
    public static final CanvasLocationOptions Publisher = new CanvasLocationOptions(_Publisher);
    public static final CanvasLocationOptions ChatterFeed = new CanvasLocationOptions(_ChatterFeed);
    public static final CanvasLocationOptions ServiceDesk = new CanvasLocationOptions(_ServiceDesk);
    public static final CanvasLocationOptions OpenCTI = new CanvasLocationOptions(_OpenCTI);
    public static final CanvasLocationOptions AppLauncher = new CanvasLocationOptions(_AppLauncher);
    public static final CanvasLocationOptions MobileNav = new CanvasLocationOptions(_MobileNav);
    public static final CanvasLocationOptions PageLayout = new CanvasLocationOptions(_PageLayout);
    public java.lang.String getValue() { return _value_;}
    public static CanvasLocationOptions fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CanvasLocationOptions enumeration = (CanvasLocationOptions)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CanvasLocationOptions fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CanvasLocationOptions.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CanvasLocationOptions"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
