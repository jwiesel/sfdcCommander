/**
 * DescribeCompactLayoutsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeCompactLayoutsResult  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeCompactLayout[] compactLayouts;

    private java.lang.String defaultCompactLayoutId;

    private com.sforce.soap.partner.RecordTypeCompactLayoutMapping[] recordTypeCompactLayoutMappings;

    public DescribeCompactLayoutsResult() {
    }

    public DescribeCompactLayoutsResult(
           com.sforce.soap.partner.DescribeCompactLayout[] compactLayouts,
           java.lang.String defaultCompactLayoutId,
           com.sforce.soap.partner.RecordTypeCompactLayoutMapping[] recordTypeCompactLayoutMappings) {
           this.compactLayouts = compactLayouts;
           this.defaultCompactLayoutId = defaultCompactLayoutId;
           this.recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings;
    }


    /**
     * Gets the compactLayouts value for this DescribeCompactLayoutsResult.
     * 
     * @return compactLayouts
     */
    public com.sforce.soap.partner.DescribeCompactLayout[] getCompactLayouts() {
        return compactLayouts;
    }


    /**
     * Sets the compactLayouts value for this DescribeCompactLayoutsResult.
     * 
     * @param compactLayouts
     */
    public void setCompactLayouts(com.sforce.soap.partner.DescribeCompactLayout[] compactLayouts) {
        this.compactLayouts = compactLayouts;
    }

    public com.sforce.soap.partner.DescribeCompactLayout getCompactLayouts(int i) {
        return this.compactLayouts[i];
    }

    public void setCompactLayouts(int i, com.sforce.soap.partner.DescribeCompactLayout _value) {
        this.compactLayouts[i] = _value;
    }


    /**
     * Gets the defaultCompactLayoutId value for this DescribeCompactLayoutsResult.
     * 
     * @return defaultCompactLayoutId
     */
    public java.lang.String getDefaultCompactLayoutId() {
        return defaultCompactLayoutId;
    }


    /**
     * Sets the defaultCompactLayoutId value for this DescribeCompactLayoutsResult.
     * 
     * @param defaultCompactLayoutId
     */
    public void setDefaultCompactLayoutId(java.lang.String defaultCompactLayoutId) {
        this.defaultCompactLayoutId = defaultCompactLayoutId;
    }


    /**
     * Gets the recordTypeCompactLayoutMappings value for this DescribeCompactLayoutsResult.
     * 
     * @return recordTypeCompactLayoutMappings
     */
    public com.sforce.soap.partner.RecordTypeCompactLayoutMapping[] getRecordTypeCompactLayoutMappings() {
        return recordTypeCompactLayoutMappings;
    }


    /**
     * Sets the recordTypeCompactLayoutMappings value for this DescribeCompactLayoutsResult.
     * 
     * @param recordTypeCompactLayoutMappings
     */
    public void setRecordTypeCompactLayoutMappings(com.sforce.soap.partner.RecordTypeCompactLayoutMapping[] recordTypeCompactLayoutMappings) {
        this.recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings;
    }

    public com.sforce.soap.partner.RecordTypeCompactLayoutMapping getRecordTypeCompactLayoutMappings(int i) {
        return this.recordTypeCompactLayoutMappings[i];
    }

    public void setRecordTypeCompactLayoutMappings(int i, com.sforce.soap.partner.RecordTypeCompactLayoutMapping _value) {
        this.recordTypeCompactLayoutMappings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeCompactLayoutsResult)) return false;
        DescribeCompactLayoutsResult other = (DescribeCompactLayoutsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.compactLayouts==null && other.getCompactLayouts()==null) || 
             (this.compactLayouts!=null &&
              java.util.Arrays.equals(this.compactLayouts, other.getCompactLayouts()))) &&
            ((this.defaultCompactLayoutId==null && other.getDefaultCompactLayoutId()==null) || 
             (this.defaultCompactLayoutId!=null &&
              this.defaultCompactLayoutId.equals(other.getDefaultCompactLayoutId()))) &&
            ((this.recordTypeCompactLayoutMappings==null && other.getRecordTypeCompactLayoutMappings()==null) || 
             (this.recordTypeCompactLayoutMappings!=null &&
              java.util.Arrays.equals(this.recordTypeCompactLayoutMappings, other.getRecordTypeCompactLayoutMappings())));
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
        if (getCompactLayouts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompactLayouts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompactLayouts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultCompactLayoutId() != null) {
            _hashCode += getDefaultCompactLayoutId().hashCode();
        }
        if (getRecordTypeCompactLayoutMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypeCompactLayoutMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordTypeCompactLayoutMappings(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeCompactLayoutsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayoutsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compactLayouts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "compactLayouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayout"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCompactLayoutId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "defaultCompactLayoutId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeCompactLayoutMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeCompactLayoutMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RecordTypeCompactLayoutMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
