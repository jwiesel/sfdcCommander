/**
 * DashboardTableColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardTableColumn  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportSummaryType aggregateType;

    private java.lang.Boolean calculatePercent;

    private java.lang.String column;

    private java.lang.Integer decimalPlaces;

    private java.lang.Boolean showTotal;

    private com.sforce.soap._2006._04.metadata.DashboardComponentFilter sortBy;

    public DashboardTableColumn() {
    }

    public DashboardTableColumn(
           com.sforce.soap._2006._04.metadata.ReportSummaryType aggregateType,
           java.lang.Boolean calculatePercent,
           java.lang.String column,
           java.lang.Integer decimalPlaces,
           java.lang.Boolean showTotal,
           com.sforce.soap._2006._04.metadata.DashboardComponentFilter sortBy) {
           this.aggregateType = aggregateType;
           this.calculatePercent = calculatePercent;
           this.column = column;
           this.decimalPlaces = decimalPlaces;
           this.showTotal = showTotal;
           this.sortBy = sortBy;
    }


    /**
     * Gets the aggregateType value for this DashboardTableColumn.
     * 
     * @return aggregateType
     */
    public com.sforce.soap._2006._04.metadata.ReportSummaryType getAggregateType() {
        return aggregateType;
    }


    /**
     * Sets the aggregateType value for this DashboardTableColumn.
     * 
     * @param aggregateType
     */
    public void setAggregateType(com.sforce.soap._2006._04.metadata.ReportSummaryType aggregateType) {
        this.aggregateType = aggregateType;
    }


    /**
     * Gets the calculatePercent value for this DashboardTableColumn.
     * 
     * @return calculatePercent
     */
    public java.lang.Boolean getCalculatePercent() {
        return calculatePercent;
    }


    /**
     * Sets the calculatePercent value for this DashboardTableColumn.
     * 
     * @param calculatePercent
     */
    public void setCalculatePercent(java.lang.Boolean calculatePercent) {
        this.calculatePercent = calculatePercent;
    }


    /**
     * Gets the column value for this DashboardTableColumn.
     * 
     * @return column
     */
    public java.lang.String getColumn() {
        return column;
    }


    /**
     * Sets the column value for this DashboardTableColumn.
     * 
     * @param column
     */
    public void setColumn(java.lang.String column) {
        this.column = column;
    }


    /**
     * Gets the decimalPlaces value for this DashboardTableColumn.
     * 
     * @return decimalPlaces
     */
    public java.lang.Integer getDecimalPlaces() {
        return decimalPlaces;
    }


    /**
     * Sets the decimalPlaces value for this DashboardTableColumn.
     * 
     * @param decimalPlaces
     */
    public void setDecimalPlaces(java.lang.Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }


    /**
     * Gets the showTotal value for this DashboardTableColumn.
     * 
     * @return showTotal
     */
    public java.lang.Boolean getShowTotal() {
        return showTotal;
    }


    /**
     * Sets the showTotal value for this DashboardTableColumn.
     * 
     * @param showTotal
     */
    public void setShowTotal(java.lang.Boolean showTotal) {
        this.showTotal = showTotal;
    }


    /**
     * Gets the sortBy value for this DashboardTableColumn.
     * 
     * @return sortBy
     */
    public com.sforce.soap._2006._04.metadata.DashboardComponentFilter getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this DashboardTableColumn.
     * 
     * @param sortBy
     */
    public void setSortBy(com.sforce.soap._2006._04.metadata.DashboardComponentFilter sortBy) {
        this.sortBy = sortBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashboardTableColumn)) return false;
        DashboardTableColumn other = (DashboardTableColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aggregateType==null && other.getAggregateType()==null) || 
             (this.aggregateType!=null &&
              this.aggregateType.equals(other.getAggregateType()))) &&
            ((this.calculatePercent==null && other.getCalculatePercent()==null) || 
             (this.calculatePercent!=null &&
              this.calculatePercent.equals(other.getCalculatePercent()))) &&
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn()))) &&
            ((this.decimalPlaces==null && other.getDecimalPlaces()==null) || 
             (this.decimalPlaces!=null &&
              this.decimalPlaces.equals(other.getDecimalPlaces()))) &&
            ((this.showTotal==null && other.getShowTotal()==null) || 
             (this.showTotal!=null &&
              this.showTotal.equals(other.getShowTotal()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              this.sortBy.equals(other.getSortBy())));
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
        if (getAggregateType() != null) {
            _hashCode += getAggregateType().hashCode();
        }
        if (getCalculatePercent() != null) {
            _hashCode += getCalculatePercent().hashCode();
        }
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        if (getDecimalPlaces() != null) {
            _hashCode += getDecimalPlaces().hashCode();
        }
        if (getShowTotal() != null) {
            _hashCode += getShowTotal().hashCode();
        }
        if (getSortBy() != null) {
            _hashCode += getSortBy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DashboardTableColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardTableColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportSummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "calculatePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimalPlaces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "decimalPlaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentFilter"));
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
