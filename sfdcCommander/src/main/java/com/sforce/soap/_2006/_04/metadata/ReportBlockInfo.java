/**
 * ReportBlockInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportBlockInfo  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportAggregateReference[] aggregateReferences;

    private java.lang.String blockId;

    private java.lang.String joinTable;

    public ReportBlockInfo() {
    }

    public ReportBlockInfo(
           com.sforce.soap._2006._04.metadata.ReportAggregateReference[] aggregateReferences,
           java.lang.String blockId,
           java.lang.String joinTable) {
           this.aggregateReferences = aggregateReferences;
           this.blockId = blockId;
           this.joinTable = joinTable;
    }


    /**
     * Gets the aggregateReferences value for this ReportBlockInfo.
     * 
     * @return aggregateReferences
     */
    public com.sforce.soap._2006._04.metadata.ReportAggregateReference[] getAggregateReferences() {
        return aggregateReferences;
    }


    /**
     * Sets the aggregateReferences value for this ReportBlockInfo.
     * 
     * @param aggregateReferences
     */
    public void setAggregateReferences(com.sforce.soap._2006._04.metadata.ReportAggregateReference[] aggregateReferences) {
        this.aggregateReferences = aggregateReferences;
    }

    public com.sforce.soap._2006._04.metadata.ReportAggregateReference getAggregateReferences(int i) {
        return this.aggregateReferences[i];
    }

    public void setAggregateReferences(int i, com.sforce.soap._2006._04.metadata.ReportAggregateReference _value) {
        this.aggregateReferences[i] = _value;
    }


    /**
     * Gets the blockId value for this ReportBlockInfo.
     * 
     * @return blockId
     */
    public java.lang.String getBlockId() {
        return blockId;
    }


    /**
     * Sets the blockId value for this ReportBlockInfo.
     * 
     * @param blockId
     */
    public void setBlockId(java.lang.String blockId) {
        this.blockId = blockId;
    }


    /**
     * Gets the joinTable value for this ReportBlockInfo.
     * 
     * @return joinTable
     */
    public java.lang.String getJoinTable() {
        return joinTable;
    }


    /**
     * Sets the joinTable value for this ReportBlockInfo.
     * 
     * @param joinTable
     */
    public void setJoinTable(java.lang.String joinTable) {
        this.joinTable = joinTable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportBlockInfo)) return false;
        ReportBlockInfo other = (ReportBlockInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aggregateReferences==null && other.getAggregateReferences()==null) || 
             (this.aggregateReferences!=null &&
              java.util.Arrays.equals(this.aggregateReferences, other.getAggregateReferences()))) &&
            ((this.blockId==null && other.getBlockId()==null) || 
             (this.blockId!=null &&
              this.blockId.equals(other.getBlockId()))) &&
            ((this.joinTable==null && other.getJoinTable()==null) || 
             (this.joinTable!=null &&
              this.joinTable.equals(other.getJoinTable())));
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
        if (getAggregateReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAggregateReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAggregateReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBlockId() != null) {
            _hashCode += getBlockId().hashCode();
        }
        if (getJoinTable() != null) {
            _hashCode += getJoinTable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportBlockInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBlockInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregateReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportAggregateReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "blockId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("joinTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "joinTable"));
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
