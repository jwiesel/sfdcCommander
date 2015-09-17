/**
 * FeedItemSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FeedItemSettings  implements java.io.Serializable {
    private java.lang.Integer characterLimit;

    private java.lang.Boolean collapseThread;

    private com.sforce.soap._2006._04.metadata.FeedItemDisplayFormat displayFormat;

    private com.sforce.soap._2006._04.metadata.FeedItemType feedItemType;

    public FeedItemSettings() {
    }

    public FeedItemSettings(
           java.lang.Integer characterLimit,
           java.lang.Boolean collapseThread,
           com.sforce.soap._2006._04.metadata.FeedItemDisplayFormat displayFormat,
           com.sforce.soap._2006._04.metadata.FeedItemType feedItemType) {
           this.characterLimit = characterLimit;
           this.collapseThread = collapseThread;
           this.displayFormat = displayFormat;
           this.feedItemType = feedItemType;
    }


    /**
     * Gets the characterLimit value for this FeedItemSettings.
     * 
     * @return characterLimit
     */
    public java.lang.Integer getCharacterLimit() {
        return characterLimit;
    }


    /**
     * Sets the characterLimit value for this FeedItemSettings.
     * 
     * @param characterLimit
     */
    public void setCharacterLimit(java.lang.Integer characterLimit) {
        this.characterLimit = characterLimit;
    }


    /**
     * Gets the collapseThread value for this FeedItemSettings.
     * 
     * @return collapseThread
     */
    public java.lang.Boolean getCollapseThread() {
        return collapseThread;
    }


    /**
     * Sets the collapseThread value for this FeedItemSettings.
     * 
     * @param collapseThread
     */
    public void setCollapseThread(java.lang.Boolean collapseThread) {
        this.collapseThread = collapseThread;
    }


    /**
     * Gets the displayFormat value for this FeedItemSettings.
     * 
     * @return displayFormat
     */
    public com.sforce.soap._2006._04.metadata.FeedItemDisplayFormat getDisplayFormat() {
        return displayFormat;
    }


    /**
     * Sets the displayFormat value for this FeedItemSettings.
     * 
     * @param displayFormat
     */
    public void setDisplayFormat(com.sforce.soap._2006._04.metadata.FeedItemDisplayFormat displayFormat) {
        this.displayFormat = displayFormat;
    }


    /**
     * Gets the feedItemType value for this FeedItemSettings.
     * 
     * @return feedItemType
     */
    public com.sforce.soap._2006._04.metadata.FeedItemType getFeedItemType() {
        return feedItemType;
    }


    /**
     * Sets the feedItemType value for this FeedItemSettings.
     * 
     * @param feedItemType
     */
    public void setFeedItemType(com.sforce.soap._2006._04.metadata.FeedItemType feedItemType) {
        this.feedItemType = feedItemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemSettings)) return false;
        FeedItemSettings other = (FeedItemSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.characterLimit==null && other.getCharacterLimit()==null) || 
             (this.characterLimit!=null &&
              this.characterLimit.equals(other.getCharacterLimit()))) &&
            ((this.collapseThread==null && other.getCollapseThread()==null) || 
             (this.collapseThread!=null &&
              this.collapseThread.equals(other.getCollapseThread()))) &&
            ((this.displayFormat==null && other.getDisplayFormat()==null) || 
             (this.displayFormat!=null &&
              this.displayFormat.equals(other.getDisplayFormat()))) &&
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
        if (getCharacterLimit() != null) {
            _hashCode += getCharacterLimit().hashCode();
        }
        if (getCollapseThread() != null) {
            _hashCode += getCollapseThread().hashCode();
        }
        if (getDisplayFormat() != null) {
            _hashCode += getDisplayFormat().hashCode();
        }
        if (getFeedItemType() != null) {
            _hashCode += getFeedItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("characterLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "characterLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapseThread");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "collapseThread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemDisplayFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemType"));
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
