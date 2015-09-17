/**
 * PerformQuickActionResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class PerformQuickActionResult  implements java.io.Serializable {
    private java.lang.String contextId;

    private boolean created;

    private com.sforce.soap.partner.Error[] errors;

    private java.lang.String[] feedItemIds;

    private java.lang.String[] ids;

    private boolean success;

    public PerformQuickActionResult() {
    }

    public PerformQuickActionResult(
           java.lang.String contextId,
           boolean created,
           com.sforce.soap.partner.Error[] errors,
           java.lang.String[] feedItemIds,
           java.lang.String[] ids,
           boolean success) {
           this.contextId = contextId;
           this.created = created;
           this.errors = errors;
           this.feedItemIds = feedItemIds;
           this.ids = ids;
           this.success = success;
    }


    /**
     * Gets the contextId value for this PerformQuickActionResult.
     * 
     * @return contextId
     */
    public java.lang.String getContextId() {
        return contextId;
    }


    /**
     * Sets the contextId value for this PerformQuickActionResult.
     * 
     * @param contextId
     */
    public void setContextId(java.lang.String contextId) {
        this.contextId = contextId;
    }


    /**
     * Gets the created value for this PerformQuickActionResult.
     * 
     * @return created
     */
    public boolean isCreated() {
        return created;
    }


    /**
     * Sets the created value for this PerformQuickActionResult.
     * 
     * @param created
     */
    public void setCreated(boolean created) {
        this.created = created;
    }


    /**
     * Gets the errors value for this PerformQuickActionResult.
     * 
     * @return errors
     */
    public com.sforce.soap.partner.Error[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this PerformQuickActionResult.
     * 
     * @param errors
     */
    public void setErrors(com.sforce.soap.partner.Error[] errors) {
        this.errors = errors;
    }

    public com.sforce.soap.partner.Error getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.sforce.soap.partner.Error _value) {
        this.errors[i] = _value;
    }


    /**
     * Gets the feedItemIds value for this PerformQuickActionResult.
     * 
     * @return feedItemIds
     */
    public java.lang.String[] getFeedItemIds() {
        return feedItemIds;
    }


    /**
     * Sets the feedItemIds value for this PerformQuickActionResult.
     * 
     * @param feedItemIds
     */
    public void setFeedItemIds(java.lang.String[] feedItemIds) {
        this.feedItemIds = feedItemIds;
    }

    public java.lang.String getFeedItemIds(int i) {
        return this.feedItemIds[i];
    }

    public void setFeedItemIds(int i, java.lang.String _value) {
        this.feedItemIds[i] = _value;
    }


    /**
     * Gets the ids value for this PerformQuickActionResult.
     * 
     * @return ids
     */
    public java.lang.String[] getIds() {
        return ids;
    }


    /**
     * Sets the ids value for this PerformQuickActionResult.
     * 
     * @param ids
     */
    public void setIds(java.lang.String[] ids) {
        this.ids = ids;
    }

    public java.lang.String getIds(int i) {
        return this.ids[i];
    }

    public void setIds(int i, java.lang.String _value) {
        this.ids[i] = _value;
    }


    /**
     * Gets the success value for this PerformQuickActionResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this PerformQuickActionResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformQuickActionResult)) return false;
        PerformQuickActionResult other = (PerformQuickActionResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contextId==null && other.getContextId()==null) || 
             (this.contextId!=null &&
              this.contextId.equals(other.getContextId()))) &&
            this.created == other.isCreated() &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.feedItemIds==null && other.getFeedItemIds()==null) || 
             (this.feedItemIds!=null &&
              java.util.Arrays.equals(this.feedItemIds, other.getFeedItemIds()))) &&
            ((this.ids==null && other.getIds()==null) || 
             (this.ids!=null &&
              java.util.Arrays.equals(this.ids, other.getIds()))) &&
            this.success == other.isSuccess();
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
        if (getContextId() != null) {
            _hashCode += getContextId().hashCode();
        }
        _hashCode += (isCreated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeedItemIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedItemIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedItemIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformQuickActionResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "feedItemIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
