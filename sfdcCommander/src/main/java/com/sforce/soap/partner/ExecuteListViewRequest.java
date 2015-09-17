/**
 * ExecuteListViewRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class ExecuteListViewRequest  implements java.io.Serializable {
    private java.lang.String developerNameOrId;

    private java.lang.Integer limit;

    private java.lang.Integer offset;

    private com.sforce.soap.partner.ListViewOrderBy[] orderBy;

    private java.lang.String sobjectType;

    public ExecuteListViewRequest() {
    }

    public ExecuteListViewRequest(
           java.lang.String developerNameOrId,
           java.lang.Integer limit,
           java.lang.Integer offset,
           com.sforce.soap.partner.ListViewOrderBy[] orderBy,
           java.lang.String sobjectType) {
           this.developerNameOrId = developerNameOrId;
           this.limit = limit;
           this.offset = offset;
           this.orderBy = orderBy;
           this.sobjectType = sobjectType;
    }


    /**
     * Gets the developerNameOrId value for this ExecuteListViewRequest.
     * 
     * @return developerNameOrId
     */
    public java.lang.String getDeveloperNameOrId() {
        return developerNameOrId;
    }


    /**
     * Sets the developerNameOrId value for this ExecuteListViewRequest.
     * 
     * @param developerNameOrId
     */
    public void setDeveloperNameOrId(java.lang.String developerNameOrId) {
        this.developerNameOrId = developerNameOrId;
    }


    /**
     * Gets the limit value for this ExecuteListViewRequest.
     * 
     * @return limit
     */
    public java.lang.Integer getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this ExecuteListViewRequest.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Integer limit) {
        this.limit = limit;
    }


    /**
     * Gets the offset value for this ExecuteListViewRequest.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ExecuteListViewRequest.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the orderBy value for this ExecuteListViewRequest.
     * 
     * @return orderBy
     */
    public com.sforce.soap.partner.ListViewOrderBy[] getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this ExecuteListViewRequest.
     * 
     * @param orderBy
     */
    public void setOrderBy(com.sforce.soap.partner.ListViewOrderBy[] orderBy) {
        this.orderBy = orderBy;
    }

    public com.sforce.soap.partner.ListViewOrderBy getOrderBy(int i) {
        return this.orderBy[i];
    }

    public void setOrderBy(int i, com.sforce.soap.partner.ListViewOrderBy _value) {
        this.orderBy[i] = _value;
    }


    /**
     * Gets the sobjectType value for this ExecuteListViewRequest.
     * 
     * @return sobjectType
     */
    public java.lang.String getSobjectType() {
        return sobjectType;
    }


    /**
     * Sets the sobjectType value for this ExecuteListViewRequest.
     * 
     * @param sobjectType
     */
    public void setSobjectType(java.lang.String sobjectType) {
        this.sobjectType = sobjectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteListViewRequest)) return false;
        ExecuteListViewRequest other = (ExecuteListViewRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.developerNameOrId==null && other.getDeveloperNameOrId()==null) || 
             (this.developerNameOrId!=null &&
              this.developerNameOrId.equals(other.getDeveloperNameOrId()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              java.util.Arrays.equals(this.orderBy, other.getOrderBy()))) &&
            ((this.sobjectType==null && other.getSobjectType()==null) || 
             (this.sobjectType!=null &&
              this.sobjectType.equals(other.getSobjectType())));
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
        if (getDeveloperNameOrId() != null) {
            _hashCode += getDeveloperNameOrId().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getOrderBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSobjectType() != null) {
            _hashCode += getSobjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteListViewRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ExecuteListViewRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerNameOrId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "developerNameOrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "orderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewOrderBy"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sobjectType"));
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
