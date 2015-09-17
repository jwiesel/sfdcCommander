/**
 * ReportChartComponentLayoutItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportChartComponentLayoutItem  implements java.io.Serializable {
    private java.lang.Boolean cacheData;

    private java.lang.String contextFilterableField;

    private java.lang.String error;

    private java.lang.Boolean hideOnError;

    private java.lang.Boolean includeContext;

    private java.lang.String reportName;

    private java.lang.Boolean showTitle;

    private com.sforce.soap._2006._04.metadata.ReportChartComponentSize size;

    public ReportChartComponentLayoutItem() {
    }

    public ReportChartComponentLayoutItem(
           java.lang.Boolean cacheData,
           java.lang.String contextFilterableField,
           java.lang.String error,
           java.lang.Boolean hideOnError,
           java.lang.Boolean includeContext,
           java.lang.String reportName,
           java.lang.Boolean showTitle,
           com.sforce.soap._2006._04.metadata.ReportChartComponentSize size) {
           this.cacheData = cacheData;
           this.contextFilterableField = contextFilterableField;
           this.error = error;
           this.hideOnError = hideOnError;
           this.includeContext = includeContext;
           this.reportName = reportName;
           this.showTitle = showTitle;
           this.size = size;
    }


    /**
     * Gets the cacheData value for this ReportChartComponentLayoutItem.
     * 
     * @return cacheData
     */
    public java.lang.Boolean getCacheData() {
        return cacheData;
    }


    /**
     * Sets the cacheData value for this ReportChartComponentLayoutItem.
     * 
     * @param cacheData
     */
    public void setCacheData(java.lang.Boolean cacheData) {
        this.cacheData = cacheData;
    }


    /**
     * Gets the contextFilterableField value for this ReportChartComponentLayoutItem.
     * 
     * @return contextFilterableField
     */
    public java.lang.String getContextFilterableField() {
        return contextFilterableField;
    }


    /**
     * Sets the contextFilterableField value for this ReportChartComponentLayoutItem.
     * 
     * @param contextFilterableField
     */
    public void setContextFilterableField(java.lang.String contextFilterableField) {
        this.contextFilterableField = contextFilterableField;
    }


    /**
     * Gets the error value for this ReportChartComponentLayoutItem.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ReportChartComponentLayoutItem.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the hideOnError value for this ReportChartComponentLayoutItem.
     * 
     * @return hideOnError
     */
    public java.lang.Boolean getHideOnError() {
        return hideOnError;
    }


    /**
     * Sets the hideOnError value for this ReportChartComponentLayoutItem.
     * 
     * @param hideOnError
     */
    public void setHideOnError(java.lang.Boolean hideOnError) {
        this.hideOnError = hideOnError;
    }


    /**
     * Gets the includeContext value for this ReportChartComponentLayoutItem.
     * 
     * @return includeContext
     */
    public java.lang.Boolean getIncludeContext() {
        return includeContext;
    }


    /**
     * Sets the includeContext value for this ReportChartComponentLayoutItem.
     * 
     * @param includeContext
     */
    public void setIncludeContext(java.lang.Boolean includeContext) {
        this.includeContext = includeContext;
    }


    /**
     * Gets the reportName value for this ReportChartComponentLayoutItem.
     * 
     * @return reportName
     */
    public java.lang.String getReportName() {
        return reportName;
    }


    /**
     * Sets the reportName value for this ReportChartComponentLayoutItem.
     * 
     * @param reportName
     */
    public void setReportName(java.lang.String reportName) {
        this.reportName = reportName;
    }


    /**
     * Gets the showTitle value for this ReportChartComponentLayoutItem.
     * 
     * @return showTitle
     */
    public java.lang.Boolean getShowTitle() {
        return showTitle;
    }


    /**
     * Sets the showTitle value for this ReportChartComponentLayoutItem.
     * 
     * @param showTitle
     */
    public void setShowTitle(java.lang.Boolean showTitle) {
        this.showTitle = showTitle;
    }


    /**
     * Gets the size value for this ReportChartComponentLayoutItem.
     * 
     * @return size
     */
    public com.sforce.soap._2006._04.metadata.ReportChartComponentSize getSize() {
        return size;
    }


    /**
     * Sets the size value for this ReportChartComponentLayoutItem.
     * 
     * @param size
     */
    public void setSize(com.sforce.soap._2006._04.metadata.ReportChartComponentSize size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportChartComponentLayoutItem)) return false;
        ReportChartComponentLayoutItem other = (ReportChartComponentLayoutItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cacheData==null && other.getCacheData()==null) || 
             (this.cacheData!=null &&
              this.cacheData.equals(other.getCacheData()))) &&
            ((this.contextFilterableField==null && other.getContextFilterableField()==null) || 
             (this.contextFilterableField!=null &&
              this.contextFilterableField.equals(other.getContextFilterableField()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.hideOnError==null && other.getHideOnError()==null) || 
             (this.hideOnError!=null &&
              this.hideOnError.equals(other.getHideOnError()))) &&
            ((this.includeContext==null && other.getIncludeContext()==null) || 
             (this.includeContext!=null &&
              this.includeContext.equals(other.getIncludeContext()))) &&
            ((this.reportName==null && other.getReportName()==null) || 
             (this.reportName!=null &&
              this.reportName.equals(other.getReportName()))) &&
            ((this.showTitle==null && other.getShowTitle()==null) || 
             (this.showTitle!=null &&
              this.showTitle.equals(other.getShowTitle()))) &&
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
        int _hashCode = 1;
        if (getCacheData() != null) {
            _hashCode += getCacheData().hashCode();
        }
        if (getContextFilterableField() != null) {
            _hashCode += getContextFilterableField().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getHideOnError() != null) {
            _hashCode += getHideOnError().hashCode();
        }
        if (getIncludeContext() != null) {
            _hashCode += getIncludeContext().hashCode();
        }
        if (getReportName() != null) {
            _hashCode += getReportName().hashCode();
        }
        if (getShowTitle() != null) {
            _hashCode += getShowTitle().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportChartComponentLayoutItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChartComponentLayoutItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "cacheData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextFilterableField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "contextFilterableField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideOnError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "hideOnError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "includeContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reportName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChartComponentSize"));
        elemField.setMinOccurs(0);
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
