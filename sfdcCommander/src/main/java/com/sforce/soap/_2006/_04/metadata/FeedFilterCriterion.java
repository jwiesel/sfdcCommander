/**
 * FeedFilterCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FeedFilterCriterion  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FeedItemType feedItemType;

    private com.sforce.soap._2006._04.metadata.FeedItemVisibility feedItemVisibility;

    private java.lang.String relatedSObjectType;

    public FeedFilterCriterion() {
    }

    public FeedFilterCriterion(
           com.sforce.soap._2006._04.metadata.FeedItemType feedItemType,
           com.sforce.soap._2006._04.metadata.FeedItemVisibility feedItemVisibility,
           java.lang.String relatedSObjectType) {
           this.feedItemType = feedItemType;
           this.feedItemVisibility = feedItemVisibility;
           this.relatedSObjectType = relatedSObjectType;
    }


    /**
     * Gets the feedItemType value for this FeedFilterCriterion.
     * 
     * @return feedItemType
     */
    public com.sforce.soap._2006._04.metadata.FeedItemType getFeedItemType() {
        return feedItemType;
    }


    /**
     * Sets the feedItemType value for this FeedFilterCriterion.
     * 
     * @param feedItemType
     */
    public void setFeedItemType(com.sforce.soap._2006._04.metadata.FeedItemType feedItemType) {
        this.feedItemType = feedItemType;
    }


    /**
     * Gets the feedItemVisibility value for this FeedFilterCriterion.
     * 
     * @return feedItemVisibility
     */
    public com.sforce.soap._2006._04.metadata.FeedItemVisibility getFeedItemVisibility() {
        return feedItemVisibility;
    }


    /**
     * Sets the feedItemVisibility value for this FeedFilterCriterion.
     * 
     * @param feedItemVisibility
     */
    public void setFeedItemVisibility(com.sforce.soap._2006._04.metadata.FeedItemVisibility feedItemVisibility) {
        this.feedItemVisibility = feedItemVisibility;
    }


    /**
     * Gets the relatedSObjectType value for this FeedFilterCriterion.
     * 
     * @return relatedSObjectType
     */
    public java.lang.String getRelatedSObjectType() {
        return relatedSObjectType;
    }


    /**
     * Sets the relatedSObjectType value for this FeedFilterCriterion.
     * 
     * @param relatedSObjectType
     */
    public void setRelatedSObjectType(java.lang.String relatedSObjectType) {
        this.relatedSObjectType = relatedSObjectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedFilterCriterion)) return false;
        FeedFilterCriterion other = (FeedFilterCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedItemType==null && other.getFeedItemType()==null) || 
             (this.feedItemType!=null &&
              this.feedItemType.equals(other.getFeedItemType()))) &&
            ((this.feedItemVisibility==null && other.getFeedItemVisibility()==null) || 
             (this.feedItemVisibility!=null &&
              this.feedItemVisibility.equals(other.getFeedItemVisibility()))) &&
            ((this.relatedSObjectType==null && other.getRelatedSObjectType()==null) || 
             (this.relatedSObjectType!=null &&
              this.relatedSObjectType.equals(other.getRelatedSObjectType())));
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
        if (getFeedItemType() != null) {
            _hashCode += getFeedItemType().hashCode();
        }
        if (getFeedItemVisibility() != null) {
            _hashCode += getFeedItemVisibility().hashCode();
        }
        if (getRelatedSObjectType() != null) {
            _hashCode += getRelatedSObjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedFilterCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedFilterCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedItemVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemVisibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedSObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relatedSObjectType"));
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
