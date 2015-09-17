/**
 * ReportDataCategoryFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportDataCategoryFilter  implements java.io.Serializable {
    private java.lang.String dataCategory;

    private java.lang.String dataCategoryGroup;

    private com.sforce.soap._2006._04.metadata.DataCategoryFilterOperation operator;

    public ReportDataCategoryFilter() {
    }

    public ReportDataCategoryFilter(
           java.lang.String dataCategory,
           java.lang.String dataCategoryGroup,
           com.sforce.soap._2006._04.metadata.DataCategoryFilterOperation operator) {
           this.dataCategory = dataCategory;
           this.dataCategoryGroup = dataCategoryGroup;
           this.operator = operator;
    }


    /**
     * Gets the dataCategory value for this ReportDataCategoryFilter.
     * 
     * @return dataCategory
     */
    public java.lang.String getDataCategory() {
        return dataCategory;
    }


    /**
     * Sets the dataCategory value for this ReportDataCategoryFilter.
     * 
     * @param dataCategory
     */
    public void setDataCategory(java.lang.String dataCategory) {
        this.dataCategory = dataCategory;
    }


    /**
     * Gets the dataCategoryGroup value for this ReportDataCategoryFilter.
     * 
     * @return dataCategoryGroup
     */
    public java.lang.String getDataCategoryGroup() {
        return dataCategoryGroup;
    }


    /**
     * Sets the dataCategoryGroup value for this ReportDataCategoryFilter.
     * 
     * @param dataCategoryGroup
     */
    public void setDataCategoryGroup(java.lang.String dataCategoryGroup) {
        this.dataCategoryGroup = dataCategoryGroup;
    }


    /**
     * Gets the operator value for this ReportDataCategoryFilter.
     * 
     * @return operator
     */
    public com.sforce.soap._2006._04.metadata.DataCategoryFilterOperation getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ReportDataCategoryFilter.
     * 
     * @param operator
     */
    public void setOperator(com.sforce.soap._2006._04.metadata.DataCategoryFilterOperation operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDataCategoryFilter)) return false;
        ReportDataCategoryFilter other = (ReportDataCategoryFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataCategory==null && other.getDataCategory()==null) || 
             (this.dataCategory!=null &&
              this.dataCategory.equals(other.getDataCategory()))) &&
            ((this.dataCategoryGroup==null && other.getDataCategoryGroup()==null) || 
             (this.dataCategoryGroup!=null &&
              this.dataCategoryGroup.equals(other.getDataCategoryGroup()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getDataCategory() != null) {
            _hashCode += getDataCategory().hashCode();
        }
        if (getDataCategoryGroup() != null) {
            _hashCode += getDataCategoryGroup().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDataCategoryFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportDataCategoryFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCategoryGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataCategoryGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataCategoryFilterOperation"));
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
