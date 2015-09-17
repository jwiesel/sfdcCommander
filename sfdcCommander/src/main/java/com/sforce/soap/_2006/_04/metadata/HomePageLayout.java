/**
 * HomePageLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class HomePageLayout  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String[] narrowComponents;

    private java.lang.String[] wideComponents;

    public HomePageLayout() {
    }

    public HomePageLayout(
           java.lang.String fullName,
           java.lang.String[] narrowComponents,
           java.lang.String[] wideComponents) {
        super(
            fullName);
        this.narrowComponents = narrowComponents;
        this.wideComponents = wideComponents;
    }


    /**
     * Gets the narrowComponents value for this HomePageLayout.
     * 
     * @return narrowComponents
     */
    public java.lang.String[] getNarrowComponents() {
        return narrowComponents;
    }


    /**
     * Sets the narrowComponents value for this HomePageLayout.
     * 
     * @param narrowComponents
     */
    public void setNarrowComponents(java.lang.String[] narrowComponents) {
        this.narrowComponents = narrowComponents;
    }

    public java.lang.String getNarrowComponents(int i) {
        return this.narrowComponents[i];
    }

    public void setNarrowComponents(int i, java.lang.String _value) {
        this.narrowComponents[i] = _value;
    }


    /**
     * Gets the wideComponents value for this HomePageLayout.
     * 
     * @return wideComponents
     */
    public java.lang.String[] getWideComponents() {
        return wideComponents;
    }


    /**
     * Sets the wideComponents value for this HomePageLayout.
     * 
     * @param wideComponents
     */
    public void setWideComponents(java.lang.String[] wideComponents) {
        this.wideComponents = wideComponents;
    }

    public java.lang.String getWideComponents(int i) {
        return this.wideComponents[i];
    }

    public void setWideComponents(int i, java.lang.String _value) {
        this.wideComponents[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomePageLayout)) return false;
        HomePageLayout other = (HomePageLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.narrowComponents==null && other.getNarrowComponents()==null) || 
             (this.narrowComponents!=null &&
              java.util.Arrays.equals(this.narrowComponents, other.getNarrowComponents()))) &&
            ((this.wideComponents==null && other.getWideComponents()==null) || 
             (this.wideComponents!=null &&
              java.util.Arrays.equals(this.wideComponents, other.getWideComponents())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNarrowComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNarrowComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNarrowComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWideComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWideComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWideComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomePageLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "HomePageLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("narrowComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "narrowComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wideComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "wideComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
