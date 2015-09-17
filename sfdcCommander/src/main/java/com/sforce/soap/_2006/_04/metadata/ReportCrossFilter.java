/**
 * ReportCrossFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportCrossFilter  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportFilterItem[] criteriaItems;

    private com.sforce.soap._2006._04.metadata.ObjectFilterOperator operation;

    private java.lang.String primaryTableColumn;

    private java.lang.String relatedTable;

    private java.lang.String relatedTableJoinColumn;

    public ReportCrossFilter() {
    }

    public ReportCrossFilter(
           com.sforce.soap._2006._04.metadata.ReportFilterItem[] criteriaItems,
           com.sforce.soap._2006._04.metadata.ObjectFilterOperator operation,
           java.lang.String primaryTableColumn,
           java.lang.String relatedTable,
           java.lang.String relatedTableJoinColumn) {
           this.criteriaItems = criteriaItems;
           this.operation = operation;
           this.primaryTableColumn = primaryTableColumn;
           this.relatedTable = relatedTable;
           this.relatedTableJoinColumn = relatedTableJoinColumn;
    }


    /**
     * Gets the criteriaItems value for this ReportCrossFilter.
     * 
     * @return criteriaItems
     */
    public com.sforce.soap._2006._04.metadata.ReportFilterItem[] getCriteriaItems() {
        return criteriaItems;
    }


    /**
     * Sets the criteriaItems value for this ReportCrossFilter.
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
     * Gets the operation value for this ReportCrossFilter.
     * 
     * @return operation
     */
    public com.sforce.soap._2006._04.metadata.ObjectFilterOperator getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this ReportCrossFilter.
     * 
     * @param operation
     */
    public void setOperation(com.sforce.soap._2006._04.metadata.ObjectFilterOperator operation) {
        this.operation = operation;
    }


    /**
     * Gets the primaryTableColumn value for this ReportCrossFilter.
     * 
     * @return primaryTableColumn
     */
    public java.lang.String getPrimaryTableColumn() {
        return primaryTableColumn;
    }


    /**
     * Sets the primaryTableColumn value for this ReportCrossFilter.
     * 
     * @param primaryTableColumn
     */
    public void setPrimaryTableColumn(java.lang.String primaryTableColumn) {
        this.primaryTableColumn = primaryTableColumn;
    }


    /**
     * Gets the relatedTable value for this ReportCrossFilter.
     * 
     * @return relatedTable
     */
    public java.lang.String getRelatedTable() {
        return relatedTable;
    }


    /**
     * Sets the relatedTable value for this ReportCrossFilter.
     * 
     * @param relatedTable
     */
    public void setRelatedTable(java.lang.String relatedTable) {
        this.relatedTable = relatedTable;
    }


    /**
     * Gets the relatedTableJoinColumn value for this ReportCrossFilter.
     * 
     * @return relatedTableJoinColumn
     */
    public java.lang.String getRelatedTableJoinColumn() {
        return relatedTableJoinColumn;
    }


    /**
     * Sets the relatedTableJoinColumn value for this ReportCrossFilter.
     * 
     * @param relatedTableJoinColumn
     */
    public void setRelatedTableJoinColumn(java.lang.String relatedTableJoinColumn) {
        this.relatedTableJoinColumn = relatedTableJoinColumn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportCrossFilter)) return false;
        ReportCrossFilter other = (ReportCrossFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criteriaItems==null && other.getCriteriaItems()==null) || 
             (this.criteriaItems!=null &&
              java.util.Arrays.equals(this.criteriaItems, other.getCriteriaItems()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.primaryTableColumn==null && other.getPrimaryTableColumn()==null) || 
             (this.primaryTableColumn!=null &&
              this.primaryTableColumn.equals(other.getPrimaryTableColumn()))) &&
            ((this.relatedTable==null && other.getRelatedTable()==null) || 
             (this.relatedTable!=null &&
              this.relatedTable.equals(other.getRelatedTable()))) &&
            ((this.relatedTableJoinColumn==null && other.getRelatedTableJoinColumn()==null) || 
             (this.relatedTableJoinColumn!=null &&
              this.relatedTableJoinColumn.equals(other.getRelatedTableJoinColumn())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getPrimaryTableColumn() != null) {
            _hashCode += getPrimaryTableColumn().hashCode();
        }
        if (getRelatedTable() != null) {
            _hashCode += getRelatedTable().hashCode();
        }
        if (getRelatedTableJoinColumn() != null) {
            _hashCode += getRelatedTableJoinColumn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportCrossFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportCrossFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "criteriaItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectFilterOperator"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryTableColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "primaryTableColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relatedTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedTableJoinColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relatedTableJoinColumn"));
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
