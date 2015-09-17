/**
 * ReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportFilter  implements java.io.Serializable {
    private java.lang.String booleanFilter;

    private com.sforce.soap._2006._04.metadata.ReportFilterItem[] criteriaItems;

    private com.sforce.soap._2006._04.metadata.Language language;

    public ReportFilter() {
    }

    public ReportFilter(
           java.lang.String booleanFilter,
           com.sforce.soap._2006._04.metadata.ReportFilterItem[] criteriaItems,
           com.sforce.soap._2006._04.metadata.Language language) {
           this.booleanFilter = booleanFilter;
           this.criteriaItems = criteriaItems;
           this.language = language;
    }


    /**
     * Gets the booleanFilter value for this ReportFilter.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this ReportFilter.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the criteriaItems value for this ReportFilter.
     * 
     * @return criteriaItems
     */
    public com.sforce.soap._2006._04.metadata.ReportFilterItem[] getCriteriaItems() {
        return criteriaItems;
    }


    /**
     * Sets the criteriaItems value for this ReportFilter.
     * 
     * @param criteriaItems
     */
    public void setCriteriaItems(com.sforce.soap._2006._04.metadata.ReportFilterItem[] criteriaItems) {
        this.criteriaItems = criteriaItems;
    }

    public com.sforce.soap._2006._04.metadata.ReportFilterItem getCriteriaItems(int i) {
        return this.criteriaItems[i];
    }

    public void setCriteriaItems(int i, com.sforce.soap._2006._04.metadata.ReportFilterItem _value) {
        this.criteriaItems[i] = _value;
    }


    /**
     * Gets the language value for this ReportFilter.
     * 
     * @return language
     */
    public com.sforce.soap._2006._04.metadata.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ReportFilter.
     * 
     * @param language
     */
    public void setLanguage(com.sforce.soap._2006._04.metadata.Language language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportFilter)) return false;
        ReportFilter other = (ReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.criteriaItems==null && other.getCriteriaItems()==null) || 
             (this.criteriaItems!=null &&
              java.util.Arrays.equals(this.criteriaItems, other.getCriteriaItems()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getCriteriaItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteriaItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteriaItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "criteriaItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Language"));
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
