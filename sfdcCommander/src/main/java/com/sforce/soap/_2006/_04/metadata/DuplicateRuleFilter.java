/**
 * DuplicateRuleFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DuplicateRuleFilter  implements java.io.Serializable {
    private java.lang.String booleanFilter;

    private com.sforce.soap._2006._04.metadata.DuplicateRuleFilterItem[] duplicateRuleFilterItems;

    public DuplicateRuleFilter() {
    }

    public DuplicateRuleFilter(
           java.lang.String booleanFilter,
           com.sforce.soap._2006._04.metadata.DuplicateRuleFilterItem[] duplicateRuleFilterItems) {
           this.booleanFilter = booleanFilter;
           this.duplicateRuleFilterItems = duplicateRuleFilterItems;
    }


    /**
     * Gets the booleanFilter value for this DuplicateRuleFilter.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this DuplicateRuleFilter.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the duplicateRuleFilterItems value for this DuplicateRuleFilter.
     * 
     * @return duplicateRuleFilterItems
     */
    public com.sforce.soap._2006._04.metadata.DuplicateRuleFilterItem[] getDuplicateRuleFilterItems() {
        return duplicateRuleFilterItems;
    }


    /**
     * Sets the duplicateRuleFilterItems value for this DuplicateRuleFilter.
     * 
     * @param duplicateRuleFilterItems
     */
    public void setDuplicateRuleFilterItems(com.sforce.soap._2006._04.metadata.DuplicateRuleFilterItem[] duplicateRuleFilterItems) {
        this.duplicateRuleFilterItems = duplicateRuleFilterItems;
    }

    public com.sforce.soap._2006._04.metadata.DuplicateRuleFilterItem getDuplicateRuleFilterItems(int i) {
        return this.duplicateRuleFilterItems[i];
    }

    public void setDuplicateRuleFilterItems(int i, com.sforce.soap._2006._04.metadata.DuplicateRuleFilterItem _value) {
        this.duplicateRuleFilterItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DuplicateRuleFilter)) return false;
        DuplicateRuleFilter other = (DuplicateRuleFilter) obj;
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
            ((this.duplicateRuleFilterItems==null && other.getDuplicateRuleFilterItems()==null) || 
             (this.duplicateRuleFilterItems!=null &&
              java.util.Arrays.equals(this.duplicateRuleFilterItems, other.getDuplicateRuleFilterItems())));
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
        if (getDuplicateRuleFilterItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicateRuleFilterItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicateRuleFilterItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DuplicateRuleFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DuplicateRuleFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateRuleFilterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "duplicateRuleFilterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DuplicateRuleFilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
