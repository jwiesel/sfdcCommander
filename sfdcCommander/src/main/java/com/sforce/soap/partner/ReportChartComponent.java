/**
 * ReportChartComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class ReportChartComponent  extends com.sforce.soap.partner.DescribeLayoutComponent  implements java.io.Serializable {
    private boolean cacheData;

    private java.lang.String contextFilterableField;

    private java.lang.String error;

    private boolean hideOnError;

    private boolean includeContext;

    private boolean showTitle;

    private com.sforce.soap.partner.ReportChartSize size;

    public ReportChartComponent() {
    }

    public ReportChartComponent(
           int displayLines,
           int tabOrder,
           com.sforce.soap.partner.LayoutComponentType type,
           java.lang.String value,
           boolean cacheData,
           java.lang.String contextFilterableField,
           java.lang.String error,
           boolean hideOnError,
           boolean includeContext,
           boolean showTitle,
           com.sforce.soap.partner.ReportChartSize size) {
        super(
            displayLines,
            tabOrder,
            type,
            value);
        this.cacheData = cacheData;
        this.contextFilterableField = contextFilterableField;
        this.error = error;
        this.hideOnError = hideOnError;
        this.includeContext = includeContext;
        this.showTitle = showTitle;
        this.size = size;
    }


    /**
     * Gets the cacheData value for this ReportChartComponent.
     * 
     * @return cacheData
     */
    public boolean isCacheData() {
        return cacheData;
    }


    /**
     * Sets the cacheData value for this ReportChartComponent.
     * 
     * @param cacheData
     */
    public void setCacheData(boolean cacheData) {
        this.cacheData = cacheData;
    }


    /**
     * Gets the contextFilterableField value for this ReportChartComponent.
     * 
     * @return contextFilterableField
     */
    public java.lang.String getContextFilterableField() {
        return contextFilterableField;
    }


    /**
     * Sets the contextFilterableField value for this ReportChartComponent.
     * 
     * @param contextFilterableField
     */
    public void setContextFilterableField(java.lang.String contextFilterableField) {
        this.contextFilterableField = contextFilterableField;
    }


    /**
     * Gets the error value for this ReportChartComponent.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ReportChartComponent.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the hideOnError value for this ReportChartComponent.
     * 
     * @return hideOnError
     */
    public boolean isHideOnError() {
        return hideOnError;
    }


    /**
     * Sets the hideOnError value for this ReportChartComponent.
     * 
     * @param hideOnError
     */
    public void setHideOnError(boolean hideOnError) {
        this.hideOnError = hideOnError;
    }


    /**
     * Gets the includeContext value for this ReportChartComponent.
     * 
     * @return includeContext
     */
    public boolean isIncludeContext() {
        return includeContext;
    }


    /**
     * Sets the includeContext value for this ReportChartComponent.
     * 
     * @param includeContext
     */
    public void setIncludeContext(boolean includeContext) {
        this.includeContext = includeContext;
    }


    /**
     * Gets the showTitle value for this ReportChartComponent.
     * 
     * @return showTitle
     */
    public boolean isShowTitle() {
        return showTitle;
    }


    /**
     * Sets the showTitle value for this ReportChartComponent.
     * 
     * @param showTitle
     */
    public void setShowTitle(boolean showTitle) {
        this.showTitle = showTitle;
    }


    /**
     * Gets the size value for this ReportChartComponent.
     * 
     * @return size
     */
    public com.sforce.soap.partner.ReportChartSize getSize() {
        return size;
    }


    /**
     * Sets the size value for this ReportChartComponent.
     * 
     * @param size
     */
    public void setSize(com.sforce.soap.partner.ReportChartSize size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportChartComponent)) return false;
        ReportChartComponent other = (ReportChartComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cacheData == other.isCacheData() &&
            ((this.contextFilterableField==null && other.getContextFilterableField()==null) || 
             (this.contextFilterableField!=null &&
              this.contextFilterableField.equals(other.getContextFilterableField()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            this.hideOnError == other.isHideOnError() &&
            this.includeContext == other.isIncludeContext() &&
            this.showTitle == other.isShowTitle() &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize())));
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
        _hashCode += (isCacheData() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getContextFilterableField() != null) {
            _hashCode += getContextFilterableField().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        _hashCode += (isHideOnError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeContext() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowTitle() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportChartComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ReportChartComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "cacheData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextFilterableField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contextFilterableField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "error"));
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
        elemField.setFieldName("includeContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "includeContext"));
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ReportChartSize"));
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
