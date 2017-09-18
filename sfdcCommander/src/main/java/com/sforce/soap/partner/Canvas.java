/**
 * Canvas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class Canvas  extends com.sforce.soap.partner.DescribeLayoutComponent  implements java.io.Serializable {
    private java.lang.String displayLocation;

    private java.lang.String referenceId;

    private boolean showLabel;

    private boolean showScrollbars;

    private java.lang.String suggestedHeight;

    private java.lang.String suggestedWidth;

    public Canvas() {
    }

    public Canvas(
           int displayLines,
           int tabOrder,
           com.sforce.soap.partner.LayoutComponentType type,
           java.lang.String value,
           java.lang.String displayLocation,
           java.lang.String referenceId,
           boolean showLabel,
           boolean showScrollbars,
           java.lang.String suggestedHeight,
           java.lang.String suggestedWidth) {
        super(
            displayLines,
            tabOrder,
            type,
            value);
        this.displayLocation = displayLocation;
        this.referenceId = referenceId;
        this.showLabel = showLabel;
        this.showScrollbars = showScrollbars;
        this.suggestedHeight = suggestedHeight;
        this.suggestedWidth = suggestedWidth;
    }


    /**
     * Gets the displayLocation value for this Canvas.
     * 
     * @return displayLocation
     */
    public java.lang.String getDisplayLocation() {
        return displayLocation;
    }


    /**
     * Sets the displayLocation value for this Canvas.
     * 
     * @param displayLocation
     */
    public void setDisplayLocation(java.lang.String displayLocation) {
        this.displayLocation = displayLocation;
    }


    /**
     * Gets the referenceId value for this Canvas.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this Canvas.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the showLabel value for this Canvas.
     * 
     * @return showLabel
     */
    public boolean isShowLabel() {
        return showLabel;
    }


    /**
     * Sets the showLabel value for this Canvas.
     * 
     * @param showLabel
     */
    public void setShowLabel(boolean showLabel) {
        this.showLabel = showLabel;
    }


    /**
     * Gets the showScrollbars value for this Canvas.
     * 
     * @return showScrollbars
     */
    public boolean isShowScrollbars() {
        return showScrollbars;
    }


    /**
     * Sets the showScrollbars value for this Canvas.
     * 
     * @param showScrollbars
     */
    public void setShowScrollbars(boolean showScrollbars) {
        this.showScrollbars = showScrollbars;
    }


    /**
     * Gets the suggestedHeight value for this Canvas.
     * 
     * @return suggestedHeight
     */
    public java.lang.String getSuggestedHeight() {
        return suggestedHeight;
    }


    /**
     * Sets the suggestedHeight value for this Canvas.
     * 
     * @param suggestedHeight
     */
    public void setSuggestedHeight(java.lang.String suggestedHeight) {
        this.suggestedHeight = suggestedHeight;
    }


    /**
     * Gets the suggestedWidth value for this Canvas.
     * 
     * @return suggestedWidth
     */
    public java.lang.String getSuggestedWidth() {
        return suggestedWidth;
    }


    /**
     * Sets the suggestedWidth value for this Canvas.
     * 
     * @param suggestedWidth
     */
    public void setSuggestedWidth(java.lang.String suggestedWidth) {
        this.suggestedWidth = suggestedWidth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Canvas)) return false;
        Canvas other = (Canvas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayLocation==null && other.getDisplayLocation()==null) || 
             (this.displayLocation!=null &&
              this.displayLocation.equals(other.getDisplayLocation()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            this.showLabel == other.isShowLabel() &&
            this.showScrollbars == other.isShowScrollbars() &&
            ((this.suggestedHeight==null && other.getSuggestedHeight()==null) || 
             (this.suggestedHeight!=null &&
              this.suggestedHeight.equals(other.getSuggestedHeight()))) &&
            ((this.suggestedWidth==null && other.getSuggestedWidth()==null) || 
             (this.suggestedWidth!=null &&
              this.suggestedWidth.equals(other.getSuggestedWidth())));
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
        if (getDisplayLocation() != null) {
            _hashCode += getDisplayLocation().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        _hashCode += (isShowLabel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowScrollbars() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSuggestedHeight() != null) {
            _hashCode += getSuggestedHeight().hashCode();
        }
        if (getSuggestedWidth() != null) {
            _hashCode += getSuggestedWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Canvas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Canvas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "displayLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
