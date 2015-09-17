/**
 * CustomLinkComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class CustomLinkComponent  extends com.sforce.soap.partner.DescribeLayoutComponent  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeLayoutButton customLink;

    public CustomLinkComponent() {
    }

    public CustomLinkComponent(
           int displayLines,
           int tabOrder,
           com.sforce.soap.partner.LayoutComponentType type,
           java.lang.String value,
           com.sforce.soap.partner.DescribeLayoutButton customLink) {
        super(
            displayLines,
            tabOrder,
            type,
            value);
        this.customLink = customLink;
    }


    /**
     * Gets the customLink value for this CustomLinkComponent.
     * 
     * @return customLink
     */
    public com.sforce.soap.partner.DescribeLayoutButton getCustomLink() {
        return customLink;
    }


    /**
     * Sets the customLink value for this CustomLinkComponent.
     * 
     * @param customLink
     */
    public void setCustomLink(com.sforce.soap.partner.DescribeLayoutButton customLink) {
        this.customLink = customLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomLinkComponent)) return false;
        CustomLinkComponent other = (CustomLinkComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customLink==null && other.getCustomLink()==null) || 
             (this.customLink!=null &&
              this.customLink.equals(other.getCustomLink())));
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
        if (getCustomLink() != null) {
            _hashCode += getCustomLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomLinkComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "CustomLinkComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "customLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutButton"));
        elemField.setNillable(false);
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
