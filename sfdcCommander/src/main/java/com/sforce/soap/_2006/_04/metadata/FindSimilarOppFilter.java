/**
 * FindSimilarOppFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FindSimilarOppFilter  implements java.io.Serializable {
    private java.lang.String[] similarOpportunitiesDisplayColumns;

    private java.lang.String[] similarOpportunitiesMatchFields;

    public FindSimilarOppFilter() {
    }

    public FindSimilarOppFilter(
           java.lang.String[] similarOpportunitiesDisplayColumns,
           java.lang.String[] similarOpportunitiesMatchFields) {
           this.similarOpportunitiesDisplayColumns = similarOpportunitiesDisplayColumns;
           this.similarOpportunitiesMatchFields = similarOpportunitiesMatchFields;
    }


    /**
     * Gets the similarOpportunitiesDisplayColumns value for this FindSimilarOppFilter.
     * 
     * @return similarOpportunitiesDisplayColumns
     */
    public java.lang.String[] getSimilarOpportunitiesDisplayColumns() {
        return similarOpportunitiesDisplayColumns;
    }


    /**
     * Sets the similarOpportunitiesDisplayColumns value for this FindSimilarOppFilter.
     * 
     * @param similarOpportunitiesDisplayColumns
     */
    public void setSimilarOpportunitiesDisplayColumns(java.lang.String[] similarOpportunitiesDisplayColumns) {
        this.similarOpportunitiesDisplayColumns = similarOpportunitiesDisplayColumns;
    }

    public java.lang.String getSimilarOpportunitiesDisplayColumns(int i) {
        return this.similarOpportunitiesDisplayColumns[i];
    }

    public void setSimilarOpportunitiesDisplayColumns(int i, java.lang.String _value) {
        this.similarOpportunitiesDisplayColumns[i] = _value;
    }


    /**
     * Gets the similarOpportunitiesMatchFields value for this FindSimilarOppFilter.
     * 
     * @return similarOpportunitiesMatchFields
     */
    public java.lang.String[] getSimilarOpportunitiesMatchFields() {
        return similarOpportunitiesMatchFields;
    }


    /**
     * Sets the similarOpportunitiesMatchFields value for this FindSimilarOppFilter.
     * 
     * @param similarOpportunitiesMatchFields
     */
    public void setSimilarOpportunitiesMatchFields(java.lang.String[] similarOpportunitiesMatchFields) {
        this.similarOpportunitiesMatchFields = similarOpportunitiesMatchFields;
    }

    public java.lang.String getSimilarOpportunitiesMatchFields(int i) {
        return this.similarOpportunitiesMatchFields[i];
    }

    public void setSimilarOpportunitiesMatchFields(int i, java.lang.String _value) {
        this.similarOpportunitiesMatchFields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindSimilarOppFilter)) return false;
        FindSimilarOppFilter other = (FindSimilarOppFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.similarOpportunitiesDisplayColumns==null && other.getSimilarOpportunitiesDisplayColumns()==null) || 
             (this.similarOpportunitiesDisplayColumns!=null &&
              java.util.Arrays.equals(this.similarOpportunitiesDisplayColumns, other.getSimilarOpportunitiesDisplayColumns()))) &&
            ((this.similarOpportunitiesMatchFields==null && other.getSimilarOpportunitiesMatchFields()==null) || 
             (this.similarOpportunitiesMatchFields!=null &&
              java.util.Arrays.equals(this.similarOpportunitiesMatchFields, other.getSimilarOpportunitiesMatchFields())));
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
        if (getSimilarOpportunitiesDisplayColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimilarOpportunitiesDisplayColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimilarOpportunitiesDisplayColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimilarOpportunitiesMatchFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimilarOpportunitiesMatchFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimilarOpportunitiesMatchFields(), i);
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
        new org.apache.axis.description.TypeDesc(FindSimilarOppFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FindSimilarOppFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarOpportunitiesDisplayColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "similarOpportunitiesDisplayColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarOpportunitiesMatchFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "similarOpportunitiesMatchFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
