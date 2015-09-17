/**
 * ChartSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ChartSummary  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportSummaryType aggregate;

    private com.sforce.soap._2006._04.metadata.ChartAxis axisBinding;

    private java.lang.String column;

    public ChartSummary() {
    }

    public ChartSummary(
           com.sforce.soap._2006._04.metadata.ReportSummaryType aggregate,
           com.sforce.soap._2006._04.metadata.ChartAxis axisBinding,
           java.lang.String column) {
           this.aggregate = aggregate;
           this.axisBinding = axisBinding;
           this.column = column;
    }


    /**
     * Gets the aggregate value for this ChartSummary.
     * 
     * @return aggregate
     */
    public com.sforce.soap._2006._04.metadata.ReportSummaryType getAggregate() {
        return aggregate;
    }


    /**
     * Sets the aggregate value for this ChartSummary.
     * 
     * @param aggregate
     */
    public void setAggregate(com.sforce.soap._2006._04.metadata.ReportSummaryType aggregate) {
        this.aggregate = aggregate;
    }


    /**
     * Gets the axisBinding value for this ChartSummary.
     * 
     * @return axisBinding
     */
    public com.sforce.soap._2006._04.metadata.ChartAxis getAxisBinding() {
        return axisBinding;
    }


    /**
     * Sets the axisBinding value for this ChartSummary.
     * 
     * @param axisBinding
     */
    public void setAxisBinding(com.sforce.soap._2006._04.metadata.ChartAxis axisBinding) {
        this.axisBinding = axisBinding;
    }


    /**
     * Gets the column value for this ChartSummary.
     * 
     * @return column
     */
    public java.lang.String getColumn() {
        return column;
    }


    /**
     * Sets the column value for this ChartSummary.
     * 
     * @param column
     */
    public void setColumn(java.lang.String column) {
        this.column = column;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChartSummary)) return false;
        ChartSummary other = (ChartSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aggregate==null && other.getAggregate()==null) || 
             (this.aggregate!=null &&
              this.aggregate.equals(other.getAggregate()))) &&
            ((this.axisBinding==null && other.getAxisBinding()==null) || 
             (this.axisBinding!=null &&
              this.axisBinding.equals(other.getAxisBinding()))) &&
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn())));
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
        if (getAggregate() != null) {
            _hashCode += getAggregate().hashCode();
        }
        if (getAxisBinding() != null) {
            _hashCode += getAxisBinding().hashCode();
        }
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChartSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportSummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("axisBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "axisBinding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartAxis"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
