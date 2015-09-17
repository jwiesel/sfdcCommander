/**
 * AnalyticSnapshotMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AnalyticSnapshotMapping  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportSummaryType aggregateType;

    private java.lang.String sourceField;

    private com.sforce.soap._2006._04.metadata.ReportJobSourceTypes sourceType;

    private java.lang.String targetField;

    public AnalyticSnapshotMapping() {
    }

    public AnalyticSnapshotMapping(
           com.sforce.soap._2006._04.metadata.ReportSummaryType aggregateType,
           java.lang.String sourceField,
           com.sforce.soap._2006._04.metadata.ReportJobSourceTypes sourceType,
           java.lang.String targetField) {
           this.aggregateType = aggregateType;
           this.sourceField = sourceField;
           this.sourceType = sourceType;
           this.targetField = targetField;
    }


    /**
     * Gets the aggregateType value for this AnalyticSnapshotMapping.
     * 
     * @return aggregateType
     */
    public com.sforce.soap._2006._04.metadata.ReportSummaryType getAggregateType() {
        return aggregateType;
    }


    /**
     * Sets the aggregateType value for this AnalyticSnapshotMapping.
     * 
     * @param aggregateType
     */
    public void setAggregateType(com.sforce.soap._2006._04.metadata.ReportSummaryType aggregateType) {
        this.aggregateType = aggregateType;
    }


    /**
     * Gets the sourceField value for this AnalyticSnapshotMapping.
     * 
     * @return sourceField
     */
    public java.lang.String getSourceField() {
        return sourceField;
    }


    /**
     * Sets the sourceField value for this AnalyticSnapshotMapping.
     * 
     * @param sourceField
     */
    public void setSourceField(java.lang.String sourceField) {
        this.sourceField = sourceField;
    }


    /**
     * Gets the sourceType value for this AnalyticSnapshotMapping.
     * 
     * @return sourceType
     */
    public com.sforce.soap._2006._04.metadata.ReportJobSourceTypes getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this AnalyticSnapshotMapping.
     * 
     * @param sourceType
     */
    public void setSourceType(com.sforce.soap._2006._04.metadata.ReportJobSourceTypes sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the targetField value for this AnalyticSnapshotMapping.
     * 
     * @return targetField
     */
    public java.lang.String getTargetField() {
        return targetField;
    }


    /**
     * Sets the targetField value for this AnalyticSnapshotMapping.
     * 
     * @param targetField
     */
    public void setTargetField(java.lang.String targetField) {
        this.targetField = targetField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnalyticSnapshotMapping)) return false;
        AnalyticSnapshotMapping other = (AnalyticSnapshotMapping) obj;
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
            ((this.sourceField==null && other.getSourceField()==null) || 
             (this.sourceField!=null &&
              this.sourceField.equals(other.getSourceField()))) &&
            ((this.sourceType==null && other.getSourceType()==null) || 
             (this.sourceType!=null &&
              this.sourceType.equals(other.getSourceType()))) &&
            ((this.targetField==null && other.getTargetField()==null) || 
             (this.targetField!=null &&
              this.targetField.equals(other.getTargetField())));
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
        if (getSourceField() != null) {
            _hashCode += getSourceField().hashCode();
        }
        if (getSourceType() != null) {
            _hashCode += getSourceType().hashCode();
        }
        if (getTargetField() != null) {
            _hashCode += getTargetField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnalyticSnapshotMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AnalyticSnapshotMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportSummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sourceField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportJobSourceTypes"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetField"));
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
