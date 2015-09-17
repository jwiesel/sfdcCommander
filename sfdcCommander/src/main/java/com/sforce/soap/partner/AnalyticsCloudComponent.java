/**
 * AnalyticsCloudComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class AnalyticsCloudComponent  extends com.sforce.soap.partner.DescribeLayoutComponent  implements java.io.Serializable {
    private java.lang.String error;

    private java.lang.String filter;

    private java.lang.String height;

    private boolean hideOnError;

    private boolean showTitle;

    private java.lang.String width;

    public AnalyticsCloudComponent() {
    }

    public AnalyticsCloudComponent(
           int displayLines,
           int tabOrder,
           com.sforce.soap.partner.LayoutComponentType type,
           java.lang.String value,
           java.lang.String error,
           java.lang.String filter,
           java.lang.String height,
           boolean hideOnError,
           boolean showTitle,
           java.lang.String width) {
        super(
            displayLines,
            tabOrder,
            type,
            value);
        this.error = error;
        this.filter = filter;
        this.height = height;
        this.hideOnError = hideOnError;
        this.showTitle = showTitle;
        this.width = width;
    }


    /**
     * Gets the error value for this AnalyticsCloudComponent.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this AnalyticsCloudComponent.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the filter value for this AnalyticsCloudComponent.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this AnalyticsCloudComponent.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }


    /**
     * Gets the height value for this AnalyticsCloudComponent.
     * 
     * @return height
     */
    public java.lang.String getHeight() {
        return height;
    }


    /**
     * Sets the height value for this AnalyticsCloudComponent.
     * 
     * @param height
     */
    public void setHeight(java.lang.String height) {
        this.height = height;
    }


    /**
     * Gets the hideOnError value for this AnalyticsCloudComponent.
     * 
     * @return hideOnError
     */
    public boolean isHideOnError() {
        return hideOnError;
    }


    /**
     * Sets the hideOnError value for this AnalyticsCloudComponent.
     * 
     * @param hideOnError
     */
    public void setHideOnError(boolean hideOnError) {
        this.hideOnError = hideOnError;
    }


    /**
     * Gets the showTitle value for this AnalyticsCloudComponent.
     * 
     * @return showTitle
     */
    public boolean isShowTitle() {
        return showTitle;
    }


    /**
     * Sets the showTitle value for this AnalyticsCloudComponent.
     * 
     * @param showTitle
     */
    public void setShowTitle(boolean showTitle) {
        this.showTitle = showTitle;
    }


    /**
     * Gets the width value for this AnalyticsCloudComponent.
     * 
     * @return width
     */
    public java.lang.String getWidth() {
        return width;
    }


    /**
     * Sets the width value for this AnalyticsCloudComponent.
     * 
     * @param width
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnalyticsCloudComponent)) return false;
        AnalyticsCloudComponent other = (AnalyticsCloudComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            this.hideOnError == other.isHideOnError() &&
            this.showTitle == other.isShowTitle() &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        _hashCode += (isHideOnError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowTitle() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnalyticsCloudComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "AnalyticsCloudComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideOnError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "hideOnError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "showTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "width"));
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
