/**
 * AnalyticsCloudComponentLayoutItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AnalyticsCloudComponentLayoutItem  implements java.io.Serializable {
    private java.lang.String assetType;

    private java.lang.String devName;

    private java.lang.String error;

    private java.lang.String filter;

    private java.lang.Integer height;

    private java.lang.Boolean hideOnError;

    private java.lang.Boolean showSharing;

    private java.lang.Boolean showTitle;

    private java.lang.String width;

    public AnalyticsCloudComponentLayoutItem() {
    }

    public AnalyticsCloudComponentLayoutItem(
           java.lang.String assetType,
           java.lang.String devName,
           java.lang.String error,
           java.lang.String filter,
           java.lang.Integer height,
           java.lang.Boolean hideOnError,
           java.lang.Boolean showSharing,
           java.lang.Boolean showTitle,
           java.lang.String width) {
           this.assetType = assetType;
           this.devName = devName;
           this.error = error;
           this.filter = filter;
           this.height = height;
           this.hideOnError = hideOnError;
           this.showSharing = showSharing;
           this.showTitle = showTitle;
           this.width = width;
    }


    /**
     * Gets the assetType value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return assetType
     */
    public java.lang.String getAssetType() {
        return assetType;
    }


    /**
     * Sets the assetType value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param assetType
     */
    public void setAssetType(java.lang.String assetType) {
        this.assetType = assetType;
    }


    /**
     * Gets the devName value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return devName
     */
    public java.lang.String getDevName() {
        return devName;
    }


    /**
     * Sets the devName value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param devName
     */
    public void setDevName(java.lang.String devName) {
        this.devName = devName;
    }


    /**
     * Gets the error value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the filter value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }


    /**
     * Gets the height value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the hideOnError value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return hideOnError
     */
    public java.lang.Boolean getHideOnError() {
        return hideOnError;
    }


    /**
     * Sets the hideOnError value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param hideOnError
     */
    public void setHideOnError(java.lang.Boolean hideOnError) {
        this.hideOnError = hideOnError;
    }


    /**
     * Gets the showSharing value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return showSharing
     */
    public java.lang.Boolean getShowSharing() {
        return showSharing;
    }


    /**
     * Sets the showSharing value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param showSharing
     */
    public void setShowSharing(java.lang.Boolean showSharing) {
        this.showSharing = showSharing;
    }


    /**
     * Gets the showTitle value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return showTitle
     */
    public java.lang.Boolean getShowTitle() {
        return showTitle;
    }


    /**
     * Sets the showTitle value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param showTitle
     */
    public void setShowTitle(java.lang.Boolean showTitle) {
        this.showTitle = showTitle;
    }


    /**
     * Gets the width value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @return width
     */
    public java.lang.String getWidth() {
        return width;
    }


    /**
     * Sets the width value for this AnalyticsCloudComponentLayoutItem.
     * 
     * @param width
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnalyticsCloudComponentLayoutItem)) return false;
        AnalyticsCloudComponentLayoutItem other = (AnalyticsCloudComponentLayoutItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetType==null && other.getAssetType()==null) || 
             (this.assetType!=null &&
              this.assetType.equals(other.getAssetType()))) &&
            ((this.devName==null && other.getDevName()==null) || 
             (this.devName!=null &&
              this.devName.equals(other.getDevName()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.hideOnError==null && other.getHideOnError()==null) || 
             (this.hideOnError!=null &&
              this.hideOnError.equals(other.getHideOnError()))) &&
            ((this.showSharing==null && other.getShowSharing()==null) || 
             (this.showSharing!=null &&
              this.showSharing.equals(other.getShowSharing()))) &&
            ((this.showTitle==null && other.getShowTitle()==null) || 
             (this.showTitle!=null &&
              this.showTitle.equals(other.getShowTitle()))) &&
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
        int _hashCode = 1;
        if (getAssetType() != null) {
            _hashCode += getAssetType().hashCode();
        }
        if (getDevName() != null) {
            _hashCode += getDevName().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getHideOnError() != null) {
            _hashCode += getHideOnError().hashCode();
        }
        if (getShowSharing() != null) {
            _hashCode += getShowSharing().hashCode();
        }
        if (getShowTitle() != null) {
            _hashCode += getShowTitle().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnalyticsCloudComponentLayoutItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AnalyticsCloudComponentLayoutItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "devName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("showSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
