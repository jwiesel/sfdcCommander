/**
 * DescribeSObjectListViews.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeSObjectListViews  implements java.io.Serializable {
    private java.lang.String sObjectType;

    private boolean recentsOnly;

    private com.sforce.soap.partner.ListViewIsSoqlCompatible isSoqlCompatible;

    private int limit;

    private int offset;

    public DescribeSObjectListViews() {
    }

    public DescribeSObjectListViews(
           java.lang.String sObjectType,
           boolean recentsOnly,
           com.sforce.soap.partner.ListViewIsSoqlCompatible isSoqlCompatible,
           int limit,
           int offset) {
           this.sObjectType = sObjectType;
           this.recentsOnly = recentsOnly;
           this.isSoqlCompatible = isSoqlCompatible;
           this.limit = limit;
           this.offset = offset;
    }


    /**
     * Gets the sObjectType value for this DescribeSObjectListViews.
     * 
     * @return sObjectType
     */
    public java.lang.String getSObjectType() {
        return sObjectType;
    }


    /**
     * Sets the sObjectType value for this DescribeSObjectListViews.
     * 
     * @param sObjectType
     */
    public void setSObjectType(java.lang.String sObjectType) {
        this.sObjectType = sObjectType;
    }


    /**
     * Gets the recentsOnly value for this DescribeSObjectListViews.
     * 
     * @return recentsOnly
     */
    public boolean isRecentsOnly() {
        return recentsOnly;
    }


    /**
     * Sets the recentsOnly value for this DescribeSObjectListViews.
     * 
     * @param recentsOnly
     */
    public void setRecentsOnly(boolean recentsOnly) {
        this.recentsOnly = recentsOnly;
    }


    /**
     * Gets the isSoqlCompatible value for this DescribeSObjectListViews.
     * 
     * @return isSoqlCompatible
     */
    public com.sforce.soap.partner.ListViewIsSoqlCompatible getIsSoqlCompatible() {
        return isSoqlCompatible;
    }


    /**
     * Sets the isSoqlCompatible value for this DescribeSObjectListViews.
     * 
     * @param isSoqlCompatible
     */
    public void setIsSoqlCompatible(com.sforce.soap.partner.ListViewIsSoqlCompatible isSoqlCompatible) {
        this.isSoqlCompatible = isSoqlCompatible;
    }


    /**
     * Gets the limit value for this DescribeSObjectListViews.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this DescribeSObjectListViews.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }


    /**
     * Gets the offset value for this DescribeSObjectListViews.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DescribeSObjectListViews.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeSObjectListViews)) return false;
        DescribeSObjectListViews other = (DescribeSObjectListViews) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sObjectType==null && other.getSObjectType()==null) || 
             (this.sObjectType!=null &&
              this.sObjectType.equals(other.getSObjectType()))) &&
            this.recentsOnly == other.isRecentsOnly() &&
            ((this.isSoqlCompatible==null && other.getIsSoqlCompatible()==null) || 
             (this.isSoqlCompatible!=null &&
              this.isSoqlCompatible.equals(other.getIsSoqlCompatible()))) &&
            this.limit == other.getLimit() &&
            this.offset == other.getOffset();
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
        if (getSObjectType() != null) {
            _hashCode += getSObjectType().hashCode();
        }
        _hashCode += (isRecentsOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIsSoqlCompatible() != null) {
            _hashCode += getIsSoqlCompatible().hashCode();
        }
        _hashCode += getLimit();
        _hashCode += getOffset();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeSObjectListViews.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObjectListViews"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recentsOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recentsOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSoqlCompatible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "isSoqlCompatible"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "listViewIsSoqlCompatible"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
