/**
 * ReportGrouping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportGrouping  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportAggrType aggregateType;

    private com.sforce.soap._2006._04.metadata.UserDateGranularity dateGranularity;

    private java.lang.String field;

    private java.lang.String sortByName;

    private com.sforce.soap._2006._04.metadata.SortOrder sortOrder;

    private com.sforce.soap._2006._04.metadata.ReportSortType sortType;

    public ReportGrouping() {
    }

    public ReportGrouping(
           com.sforce.soap._2006._04.metadata.ReportAggrType aggregateType,
           com.sforce.soap._2006._04.metadata.UserDateGranularity dateGranularity,
           java.lang.String field,
           java.lang.String sortByName,
           com.sforce.soap._2006._04.metadata.SortOrder sortOrder,
           com.sforce.soap._2006._04.metadata.ReportSortType sortType) {
           this.aggregateType = aggregateType;
           this.dateGranularity = dateGranularity;
           this.field = field;
           this.sortByName = sortByName;
           this.sortOrder = sortOrder;
           this.sortType = sortType;
    }


    /**
     * Gets the aggregateType value for this ReportGrouping.
     * 
     * @return aggregateType
     */
    public com.sforce.soap._2006._04.metadata.ReportAggrType getAggregateType() {
        return aggregateType;
    }


    /**
     * Sets the aggregateType value for this ReportGrouping.
     * 
     * @param aggregateType
     */
    public void setAggregateType(com.sforce.soap._2006._04.metadata.ReportAggrType aggregateType) {
        this.aggregateType = aggregateType;
    }


    /**
     * Gets the dateGranularity value for this ReportGrouping.
     * 
     * @return dateGranularity
     */
    public com.sforce.soap._2006._04.metadata.UserDateGranularity getDateGranularity() {
        return dateGranularity;
    }


    /**
     * Sets the dateGranularity value for this ReportGrouping.
     * 
     * @param dateGranularity
     */
    public void setDateGranularity(com.sforce.soap._2006._04.metadata.UserDateGranularity dateGranularity) {
        this.dateGranularity = dateGranularity;
    }


    /**
     * Gets the field value for this ReportGrouping.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this ReportGrouping.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the sortByName value for this ReportGrouping.
     * 
     * @return sortByName
     */
    public java.lang.String getSortByName() {
        return sortByName;
    }


    /**
     * Sets the sortByName value for this ReportGrouping.
     * 
     * @param sortByName
     */
    public void setSortByName(java.lang.String sortByName) {
        this.sortByName = sortByName;
    }


    /**
     * Gets the sortOrder value for this ReportGrouping.
     * 
     * @return sortOrder
     */
    public com.sforce.soap._2006._04.metadata.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this ReportGrouping.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the sortType value for this ReportGrouping.
     * 
     * @return sortType
     */
    public com.sforce.soap._2006._04.metadata.ReportSortType getSortType() {
        return sortType;
    }


    /**
     * Sets the sortType value for this ReportGrouping.
     * 
     * @param sortType
     */
    public void setSortType(com.sforce.soap._2006._04.metadata.ReportSortType sortType) {
        this.sortType = sortType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportGrouping)) return false;
        ReportGrouping other = (ReportGrouping) obj;
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
            ((this.dateGranularity==null && other.getDateGranularity()==null) || 
             (this.dateGranularity!=null &&
              this.dateGranularity.equals(other.getDateGranularity()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.sortByName==null && other.getSortByName()==null) || 
             (this.sortByName!=null &&
              this.sortByName.equals(other.getSortByName()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.sortType==null && other.getSortType()==null) || 
             (this.sortType!=null &&
              this.sortType.equals(other.getSortType())));
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
        if (getDateGranularity() != null) {
            _hashCode += getDateGranularity().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getSortByName() != null) {
            _hashCode += getSortByName().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getSortType() != null) {
            _hashCode += getSortType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportGrouping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportGrouping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportAggrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateGranularity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dateGranularity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserDateGranularity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortByName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortByName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SortOrder"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportSortType"));
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
