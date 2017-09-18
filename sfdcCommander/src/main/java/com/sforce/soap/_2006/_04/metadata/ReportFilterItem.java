/**
 * ReportFilterItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportFilterItem  implements java.io.Serializable {
    private java.lang.String column;

    private java.lang.Boolean columnToColumn;

    private java.lang.Boolean isUnlocked;

    private com.sforce.soap._2006._04.metadata.FilterOperation operator;

    private java.lang.String snapshot;

    private java.lang.String value;

    public ReportFilterItem() {
    }

    public ReportFilterItem(
           java.lang.String column,
           java.lang.Boolean columnToColumn,
           java.lang.Boolean isUnlocked,
           com.sforce.soap._2006._04.metadata.FilterOperation operator,
           java.lang.String snapshot,
           java.lang.String value) {
           this.column = column;
           this.columnToColumn = columnToColumn;
           this.isUnlocked = isUnlocked;
           this.operator = operator;
           this.snapshot = snapshot;
           this.value = value;
    }


    /**
     * Gets the column value for this ReportFilterItem.
     * 
     * @return column
     */
    public java.lang.String getColumn() {
        return column;
    }


    /**
     * Sets the column value for this ReportFilterItem.
     * 
     * @param column
     */
    public void setColumn(java.lang.String column) {
        this.column = column;
    }


    /**
     * Gets the columnToColumn value for this ReportFilterItem.
     * 
     * @return columnToColumn
     */
    public java.lang.Boolean getColumnToColumn() {
        return columnToColumn;
    }


    /**
     * Sets the columnToColumn value for this ReportFilterItem.
     * 
     * @param columnToColumn
     */
    public void setColumnToColumn(java.lang.Boolean columnToColumn) {
        this.columnToColumn = columnToColumn;
    }


    /**
     * Gets the isUnlocked value for this ReportFilterItem.
     * 
     * @return isUnlocked
     */
    public java.lang.Boolean getIsUnlocked() {
        return isUnlocked;
    }


    /**
     * Sets the isUnlocked value for this ReportFilterItem.
     * 
     * @param isUnlocked
     */
    public void setIsUnlocked(java.lang.Boolean isUnlocked) {
        this.isUnlocked = isUnlocked;
    }


    /**
     * Gets the operator value for this ReportFilterItem.
     * 
     * @return operator
     */
    public com.sforce.soap._2006._04.metadata.FilterOperation getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ReportFilterItem.
     * 
     * @param operator
     */
    public void setOperator(com.sforce.soap._2006._04.metadata.FilterOperation operator) {
        this.operator = operator;
    }


    /**
     * Gets the snapshot value for this ReportFilterItem.
     * 
     * @return snapshot
     */
    public java.lang.String getSnapshot() {
        return snapshot;
    }


    /**
     * Sets the snapshot value for this ReportFilterItem.
     * 
     * @param snapshot
     */
    public void setSnapshot(java.lang.String snapshot) {
        this.snapshot = snapshot;
    }


    /**
     * Gets the value value for this ReportFilterItem.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ReportFilterItem.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportFilterItem)) return false;
        ReportFilterItem other = (ReportFilterItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn()))) &&
            ((this.columnToColumn==null && other.getColumnToColumn()==null) || 
             (this.columnToColumn!=null &&
              this.columnToColumn.equals(other.getColumnToColumn()))) &&
            ((this.isUnlocked==null && other.getIsUnlocked()==null) || 
             (this.isUnlocked!=null &&
              this.isUnlocked.equals(other.getIsUnlocked()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.snapshot==null && other.getSnapshot()==null) || 
             (this.snapshot!=null &&
              this.snapshot.equals(other.getSnapshot()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        if (getColumnToColumn() != null) {
            _hashCode += getColumnToColumn().hashCode();
        }
        if (getIsUnlocked() != null) {
            _hashCode += getIsUnlocked().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getSnapshot() != null) {
            _hashCode += getSnapshot().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportFilterItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFilterItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnToColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "columnToColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUnlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isUnlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterOperation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "snapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
