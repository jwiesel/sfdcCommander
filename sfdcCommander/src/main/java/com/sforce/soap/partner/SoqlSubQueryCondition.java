/**
 * SoqlSubQueryCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SoqlSubQueryCondition  extends com.sforce.soap.partner.SoqlWhereCondition  implements java.io.Serializable {
    private java.lang.String field;

    private com.sforce.soap.partner.SoqlOperator operator;

    private java.lang.String subQuery;

    public SoqlSubQueryCondition() {
    }

    public SoqlSubQueryCondition(
           java.lang.String field,
           com.sforce.soap.partner.SoqlOperator operator,
           java.lang.String subQuery) {
        this.field = field;
        this.operator = operator;
        this.subQuery = subQuery;
    }


    /**
     * Gets the field value for this SoqlSubQueryCondition.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this SoqlSubQueryCondition.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the operator value for this SoqlSubQueryCondition.
     * 
     * @return operator
     */
    public com.sforce.soap.partner.SoqlOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this SoqlSubQueryCondition.
     * 
     * @param operator
     */
    public void setOperator(com.sforce.soap.partner.SoqlOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the subQuery value for this SoqlSubQueryCondition.
     * 
     * @return subQuery
     */
    public java.lang.String getSubQuery() {
        return subQuery;
    }


    /**
     * Sets the subQuery value for this SoqlSubQueryCondition.
     * 
     * @param subQuery
     */
    public void setSubQuery(java.lang.String subQuery) {
        this.subQuery = subQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoqlSubQueryCondition)) return false;
        SoqlSubQueryCondition other = (SoqlSubQueryCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.subQuery==null && other.getSubQuery()==null) || 
             (this.subQuery!=null &&
              this.subQuery.equals(other.getSubQuery())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getSubQuery() != null) {
            _hashCode += getSubQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoqlSubQueryCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SoqlSubQueryCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "soqlOperator"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "subQuery"));
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
