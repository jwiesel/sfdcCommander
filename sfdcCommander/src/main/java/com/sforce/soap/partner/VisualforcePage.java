/**
 * VisualforcePage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class VisualforcePage  extends com.sforce.soap.partner.DescribeLayoutComponent  implements java.io.Serializable {
    private boolean showLabel;

    private boolean showScrollbars;

    private java.lang.String suggestedHeight;

    private java.lang.String suggestedWidth;

    private java.lang.String url;

    public VisualforcePage() {
    }

    public VisualforcePage(
           int displayLines,
           int tabOrder,
           com.sforce.soap.partner.LayoutComponentType type,
           java.lang.String value,
           boolean showLabel,
           boolean showScrollbars,
           java.lang.String suggestedHeight,
           java.lang.String suggestedWidth,
           java.lang.String url) {
        super(
            displayLines,
            tabOrder,
            type,
            value);
        this.showLabel = showLabel;
        this.showScrollbars = showScrollbars;
        this.suggestedHeight = suggestedHeight;
        this.suggestedWidth = suggestedWidth;
        this.url = url;
    }


    /**
     * Gets the showLabel value for this VisualforcePage.
     * 
     * @return showLabel
     */
    public boolean isShowLabel() {
        return showLabel;
    }


    /**
     * Sets the showLabel value for this VisualforcePage.
     * 
     * @param showLabel
     */
    public void setShowLabel(boolean showLabel) {
        this.showLabel = showLabel;
    }


    /**
     * Gets the showScrollbars value for this VisualforcePage.
     * 
     * @return showScrollbars
     */
    public boolean isShowScrollbars() {
        return showScrollbars;
    }


    /**
     * Sets the showScrollbars value for this VisualforcePage.
     * 
     * @param showScrollbars
     */
    public void setShowScrollbars(boolean showScrollbars) {
        this.showScrollbars = showScrollbars;
    }


    /**
     * Gets the suggestedHeight value for this VisualforcePage.
     * 
     * @return suggestedHeight
     */
    public java.lang.String getSuggestedHeight() {
        return suggestedHeight;
    }


    /**
     * Sets the suggestedHeight value for this VisualforcePage.
     * 
     * @param suggestedHeight
     */
    public void setSuggestedHeight(java.lang.String suggestedHeight) {
        this.suggestedHeight = suggestedHeight;
    }


    /**
     * Gets the suggestedWidth value for this VisualforcePage.
     * 
     * @return suggestedWidth
     */
    public java.lang.String getSuggestedWidth() {
        return suggestedWidth;
    }


    /**
     * Sets the suggestedWidth value for this VisualforcePage.
     * 
     * @param suggestedWidth
     */
    public void setSuggestedWidth(java.lang.String suggestedWidth) {
        this.suggestedWidth = suggestedWidth;
    }


    /**
     * Gets the url value for this VisualforcePage.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this VisualforcePage.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VisualforcePage)) return false;
        VisualforcePage other = (VisualforcePage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.showLabel == other.isShowLabel() &&
            this.showScrollbars == other.isShowScrollbars() &&
            ((this.suggestedHeight==null && other.getSuggestedHeight()==null) || 
             (this.suggestedHeight!=null &&
              this.suggestedHeight.equals(other.getSuggestedHeight()))) &&
            ((this.suggestedWidth==null && other.getSuggestedWidth()==null) || 
             (this.suggestedWidth!=null &&
              this.suggestedWidth.equals(other.getSuggestedWidth()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        _hashCode += (isShowLabel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowScrollbars() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSuggestedHeight() != null) {
            _hashCode += getSuggestedHeight().hashCode();
        }
        if (getSuggestedWidth() != null) {
            _hashCode += getSuggestedWidth().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VisualforcePage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "VisualforcePage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "showLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showScrollbars");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "showScrollbars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "suggestedHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "suggestedWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
