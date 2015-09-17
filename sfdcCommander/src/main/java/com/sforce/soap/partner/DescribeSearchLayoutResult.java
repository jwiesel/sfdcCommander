/**
 * DescribeSearchLayoutResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeSearchLayoutResult  implements java.io.Serializable {
    private java.lang.String errorMsg;

    private java.lang.String label;

    private java.lang.Integer limitRows;

    private java.lang.String objectType;

    private com.sforce.soap.partner.DescribeColumn[] searchColumns;

    public DescribeSearchLayoutResult() {
    }

    public DescribeSearchLayoutResult(
           java.lang.String errorMsg,
           java.lang.String label,
           java.lang.Integer limitRows,
           java.lang.String objectType,
           com.sforce.soap.partner.DescribeColumn[] searchColumns) {
           this.errorMsg = errorMsg;
           this.label = label;
           this.limitRows = limitRows;
           this.objectType = objectType;
           this.searchColumns = searchColumns;
    }


    /**
     * Gets the errorMsg value for this DescribeSearchLayoutResult.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this DescribeSearchLayoutResult.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * Gets the label value for this DescribeSearchLayoutResult.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeSearchLayoutResult.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the limitRows value for this DescribeSearchLayoutResult.
     * 
     * @return limitRows
     */
    public java.lang.Integer getLimitRows() {
        return limitRows;
    }


    /**
     * Sets the limitRows value for this DescribeSearchLayoutResult.
     * 
     * @param limitRows
     */
    public void setLimitRows(java.lang.Integer limitRows) {
        this.limitRows = limitRows;
    }


    /**
     * Gets the objectType value for this DescribeSearchLayoutResult.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this DescribeSearchLayoutResult.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the searchColumns value for this DescribeSearchLayoutResult.
     * 
     * @return searchColumns
     */
    public com.sforce.soap.partner.DescribeColumn[] getSearchColumns() {
        return searchColumns;
    }


    /**
     * Sets the searchColumns value for this DescribeSearchLayoutResult.
     * 
     * @param searchColumns
     */
    public void setSearchColumns(com.sforce.soap.partner.DescribeColumn[] searchColumns) {
        this.searchColumns = searchColumns;
    }

    public com.sforce.soap.partner.DescribeColumn getSearchColumns(int i) {
        return this.searchColumns[i];
    }

    public void setSearchColumns(int i, com.sforce.soap.partner.DescribeColumn _value) {
        this.searchColumns[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeSearchLayoutResult)) return false;
        DescribeSearchLayoutResult other = (DescribeSearchLayoutResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.limitRows==null && other.getLimitRows()==null) || 
             (this.limitRows!=null &&
              this.limitRows.equals(other.getLimitRows()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.searchColumns==null && other.getSearchColumns()==null) || 
             (this.searchColumns!=null &&
              java.util.Arrays.equals(this.searchColumns, other.getSearchColumns())));
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
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLimitRows() != null) {
            _hashCode += getLimitRows().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getSearchColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchColumns(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeSearchLayoutResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchLayoutResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitRows");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "limitRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "searchColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
