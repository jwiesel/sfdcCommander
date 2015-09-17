/**
 * ReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportColumn  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportSummaryType[] aggregateTypes;

    private java.lang.String field;

    private java.lang.Boolean reverseColors;

    private java.lang.Boolean showChanges;

    public ReportColumn() {
    }

    public ReportColumn(
           com.sforce.soap._2006._04.metadata.ReportSummaryType[] aggregateTypes,
           java.lang.String field,
           java.lang.Boolean reverseColors,
           java.lang.Boolean showChanges) {
           this.aggregateTypes = aggregateTypes;
           this.field = field;
           this.reverseColors = reverseColors;
           this.showChanges = showChanges;
    }


    /**
     * Gets the aggregateTypes value for this ReportColumn.
     * 
     * @return aggregateTypes
     */
    public com.sforce.soap._2006._04.metadata.ReportSummaryType[] getAggregateTypes() {
        return aggregateTypes;
    }


    /**
     * Sets the aggregateTypes value for this ReportColumn.
     * 
     * @param aggregateTypes
     */
    public void setAggregateTypes(com.sforce.soap._2006._04.metadata.ReportSummaryType[] aggregateTypes) {
        this.aggregateTypes = aggregateTypes;
    }

    public com.sforce.soap._2006._04.metadata.ReportSummaryType getAggregateTypes(int i) {
        return this.aggregateTypes[i];
    }

    public void setAggregateTypes(int i, com.sforce.soap._2006._04.metadata.ReportSummaryType _value) {
        this.aggregateTypes[i] = _value;
    }


    /**
     * Gets the field value for this ReportColumn.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this ReportColumn.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the reverseColors value for this ReportColumn.
     * 
     * @return reverseColors
     */
    public java.lang.Boolean getReverseColors() {
        return reverseColors;
    }


    /**
     * Sets the reverseColors value for this ReportColumn.
     * 
     * @param reverseColors
     */
    public void setReverseColors(java.lang.Boolean reverseColors) {
        this.reverseColors = reverseColors;
    }


    /**
     * Gets the showChanges value for this ReportColumn.
     * 
     * @return showChanges
     */
    public java.lang.Boolean getShowChanges() {
        return showChanges;
    }


    /**
     * Sets the showChanges value for this ReportColumn.
     * 
     * @param showChanges
     */
    public void setShowChanges(java.lang.Boolean showChanges) {
        this.showChanges = showChanges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportColumn)) return false;
        ReportColumn other = (ReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aggregateTypes==null && other.getAggregateTypes()==null) || 
             (this.aggregateTypes!=null &&
              java.util.Arrays.equals(this.aggregateTypes, other.getAggregateTypes()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.reverseColors==null && other.getReverseColors()==null) || 
             (this.reverseColors!=null &&
              this.reverseColors.equals(other.getReverseColors()))) &&
            ((this.showChanges==null && other.getShowChanges()==null) || 
             (this.showChanges!=null &&
              this.showChanges.equals(other.getShowChanges())));
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
        if (getAggregateTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAggregateTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAggregateTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getReverseColors() != null) {
            _hashCode += getReverseColors().hashCode();
        }
        if (getShowChanges() != null) {
            _hashCode += getShowChanges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregateTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportSummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseColors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reverseColors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
