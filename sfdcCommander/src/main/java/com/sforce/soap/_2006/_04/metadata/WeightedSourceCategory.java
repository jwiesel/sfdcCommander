/**
 * WeightedSourceCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WeightedSourceCategory  implements java.io.Serializable {
    private java.lang.String sourceCategoryApiName;

    private double weight;

    public WeightedSourceCategory() {
    }

    public WeightedSourceCategory(
           java.lang.String sourceCategoryApiName,
           double weight) {
           this.sourceCategoryApiName = sourceCategoryApiName;
           this.weight = weight;
    }


    /**
     * Gets the sourceCategoryApiName value for this WeightedSourceCategory.
     * 
     * @return sourceCategoryApiName
     */
    public java.lang.String getSourceCategoryApiName() {
        return sourceCategoryApiName;
    }


    /**
     * Sets the sourceCategoryApiName value for this WeightedSourceCategory.
     * 
     * @param sourceCategoryApiName
     */
    public void setSourceCategoryApiName(java.lang.String sourceCategoryApiName) {
        this.sourceCategoryApiName = sourceCategoryApiName;
    }


    /**
     * Gets the weight value for this WeightedSourceCategory.
     * 
     * @return weight
     */
    public double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this WeightedSourceCategory.
     * 
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeightedSourceCategory)) return false;
        WeightedSourceCategory other = (WeightedSourceCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceCategoryApiName==null && other.getSourceCategoryApiName()==null) || 
             (this.sourceCategoryApiName!=null &&
              this.sourceCategoryApiName.equals(other.getSourceCategoryApiName()))) &&
            this.weight == other.getWeight();
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
        if (getSourceCategoryApiName() != null) {
            _hashCode += getSourceCategoryApiName().hashCode();
        }
        _hashCode += new Double(getWeight()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WeightedSourceCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WeightedSourceCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCategoryApiName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sourceCategoryApiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
