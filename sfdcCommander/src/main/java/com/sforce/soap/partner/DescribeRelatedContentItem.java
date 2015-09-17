/**
 * DescribeRelatedContentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeRelatedContentItem  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeLayoutItem describeLayoutItem;

    public DescribeRelatedContentItem() {
    }

    public DescribeRelatedContentItem(
           com.sforce.soap.partner.DescribeLayoutItem describeLayoutItem) {
           this.describeLayoutItem = describeLayoutItem;
    }


    /**
     * Gets the describeLayoutItem value for this DescribeRelatedContentItem.
     * 
     * @return describeLayoutItem
     */
    public com.sforce.soap.partner.DescribeLayoutItem getDescribeLayoutItem() {
        return describeLayoutItem;
    }


    /**
     * Sets the describeLayoutItem value for this DescribeRelatedContentItem.
     * 
     * @param describeLayoutItem
     */
    public void setDescribeLayoutItem(com.sforce.soap.partner.DescribeLayoutItem describeLayoutItem) {
        this.describeLayoutItem = describeLayoutItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeRelatedContentItem)) return false;
        DescribeRelatedContentItem other = (DescribeRelatedContentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.describeLayoutItem==null && other.getDescribeLayoutItem()==null) || 
             (this.describeLayoutItem!=null &&
              this.describeLayoutItem.equals(other.getDescribeLayoutItem())));
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
        if (getDescribeLayoutItem() != null) {
            _hashCode += getDescribeLayoutItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeRelatedContentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeRelatedContentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("describeLayoutItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayoutItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutItem"));
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
