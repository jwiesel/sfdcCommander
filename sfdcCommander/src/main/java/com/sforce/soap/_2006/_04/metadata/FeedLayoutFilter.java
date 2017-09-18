/**
 * FeedLayoutFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FeedLayoutFilter  implements java.io.Serializable {
    private java.lang.String feedFilterName;

    private com.sforce.soap._2006._04.metadata.FeedLayoutFilterType feedFilterType;

    private com.sforce.soap._2006._04.metadata.FeedItemType feedItemType;

    public FeedLayoutFilter() {
    }

    public FeedLayoutFilter(
           java.lang.String feedFilterName,
           com.sforce.soap._2006._04.metadata.FeedLayoutFilterType feedFilterType,
           com.sforce.soap._2006._04.metadata.FeedItemType feedItemType) {
           this.feedFilterName = feedFilterName;
           this.feedFilterType = feedFilterType;
           this.feedItemType = feedItemType;
    }


    /**
     * Gets the feedFilterName value for this FeedLayoutFilter.
     * 
     * @return feedFilterName
     */
    public java.lang.String getFeedFilterName() {
        return feedFilterName;
    }


    /**
     * Sets the feedFilterName value for this FeedLayoutFilter.
     * 
     * @param feedFilterName
     */
    public void setFeedFilterName(java.lang.String feedFilterName) {
        this.feedFilterName = feedFilterName;
    }


    /**
     * Gets the feedFilterType value for this FeedLayoutFilter.
     * 
     * @return feedFilterType
     */
    public com.sforce.soap._2006._04.metadata.FeedLayoutFilterType getFeedFilterType() {
        return feedFilterType;
    }


    /**
     * Sets the feedFilterType value for this FeedLayoutFilter.
     * 
     * @param feedFilterType
     */
    public void setFeedFilterType(com.sforce.soap._2006._04.metadata.FeedLayoutFilterType feedFilterType) {
        this.feedFilterType = feedFilterType;
    }


    /**
     * Gets the feedItemType value for this FeedLayoutFilter.
     * 
     * @return feedItemType
     */
    public com.sforce.soap._2006._04.metadata.FeedItemType getFeedItemType() {
        return feedItemType;
    }


    /**
     * Sets the feedItemType value for this FeedLayoutFilter.
     * 
     * @param feedItemType
     */
    public void setFeedItemType(com.sforce.soap._2006._04.metadata.FeedItemType feedItemType) {
        this.feedItemType = feedItemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedLayoutFilter)) return false;
        FeedLayoutFilter other = (FeedLayoutFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedFilterName==null && other.getFeedFilterName()==null) || 
             (this.feedFilterName!=null &&
              this.feedFilterName.equals(other.getFeedFilterName()))) &&
            ((this.feedFilterType==null && other.getFeedFilterType()==null) || 
             (this.feedFilterType!=null &&
              this.feedFilterType.equals(other.getFeedFilterType()))) &&
            ((this.feedItemType==null && other.getFeedItemType()==null) || 
             (this.feedItemType!=null &&
              this.feedItemType.equals(other.getFeedItemType())));
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
        if (getFeedFilterName() != null) {
            _hashCode += getFeedFilterName().hashCode();
        }
        if (getFeedFilterType() != null) {
            _hashCode += getFeedFilterType().hashCode();
        }
        if (getFeedItemType() != null) {
            _hashCode += getFeedItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedLayoutFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayoutFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedFilterName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedFilterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedFilterType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedFilterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayoutFilterType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemType"));
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
