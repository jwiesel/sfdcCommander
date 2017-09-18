/**
 * KnowledgeSuggestedArticlesSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class KnowledgeSuggestedArticlesSettings  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.KnowledgeCaseField[] caseFields;

    private java.lang.Boolean useSuggestedArticlesForCase;

    private com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderField[] workOrderFields;

    private com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderLineItemField[] workOrderLineItemFields;

    public KnowledgeSuggestedArticlesSettings() {
    }

    public KnowledgeSuggestedArticlesSettings(
           com.sforce.soap._2006._04.metadata.KnowledgeCaseField[] caseFields,
           java.lang.Boolean useSuggestedArticlesForCase,
           com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderField[] workOrderFields,
           com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderLineItemField[] workOrderLineItemFields) {
           this.caseFields = caseFields;
           this.useSuggestedArticlesForCase = useSuggestedArticlesForCase;
           this.workOrderFields = workOrderFields;
           this.workOrderLineItemFields = workOrderLineItemFields;
    }


    /**
     * Gets the caseFields value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @return caseFields
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeCaseField[] getCaseFields() {
        return caseFields;
    }


    /**
     * Sets the caseFields value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @param caseFields
     */
    public void setCaseFields(com.sforce.soap._2006._04.metadata.KnowledgeCaseField[] caseFields) {
        this.caseFields = caseFields;
    }


    /**
     * Gets the useSuggestedArticlesForCase value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @return useSuggestedArticlesForCase
     */
    public java.lang.Boolean getUseSuggestedArticlesForCase() {
        return useSuggestedArticlesForCase;
    }


    /**
     * Sets the useSuggestedArticlesForCase value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @param useSuggestedArticlesForCase
     */
    public void setUseSuggestedArticlesForCase(java.lang.Boolean useSuggestedArticlesForCase) {
        this.useSuggestedArticlesForCase = useSuggestedArticlesForCase;
    }


    /**
     * Gets the workOrderFields value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @return workOrderFields
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderField[] getWorkOrderFields() {
        return workOrderFields;
    }


    /**
     * Sets the workOrderFields value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @param workOrderFields
     */
    public void setWorkOrderFields(com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderField[] workOrderFields) {
        this.workOrderFields = workOrderFields;
    }


    /**
     * Gets the workOrderLineItemFields value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @return workOrderLineItemFields
     */
    public com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderLineItemField[] getWorkOrderLineItemFields() {
        return workOrderLineItemFields;
    }


    /**
     * Sets the workOrderLineItemFields value for this KnowledgeSuggestedArticlesSettings.
     * 
     * @param workOrderLineItemFields
     */
    public void setWorkOrderLineItemFields(com.sforce.soap._2006._04.metadata.KnowledgeWorkOrderLineItemField[] workOrderLineItemFields) {
        this.workOrderLineItemFields = workOrderLineItemFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KnowledgeSuggestedArticlesSettings)) return false;
        KnowledgeSuggestedArticlesSettings other = (KnowledgeSuggestedArticlesSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseFields==null && other.getCaseFields()==null) || 
             (this.caseFields!=null &&
              java.util.Arrays.equals(this.caseFields, other.getCaseFields()))) &&
            ((this.useSuggestedArticlesForCase==null && other.getUseSuggestedArticlesForCase()==null) || 
             (this.useSuggestedArticlesForCase!=null &&
              this.useSuggestedArticlesForCase.equals(other.getUseSuggestedArticlesForCase()))) &&
            ((this.workOrderFields==null && other.getWorkOrderFields()==null) || 
             (this.workOrderFields!=null &&
              java.util.Arrays.equals(this.workOrderFields, other.getWorkOrderFields()))) &&
            ((this.workOrderLineItemFields==null && other.getWorkOrderLineItemFields()==null) || 
             (this.workOrderLineItemFields!=null &&
              java.util.Arrays.equals(this.workOrderLineItemFields, other.getWorkOrderLineItemFields())));
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
        if (getCaseFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseSuggestedArticlesForCase() != null) {
            _hashCode += getUseSuggestedArticlesForCase().hashCode();
        }
        if (getWorkOrderFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkOrderFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkOrderFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkOrderLineItemFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkOrderLineItemFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkOrderLineItemFields(), i);
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
        new org.apache.axis.description.TypeDesc(KnowledgeSuggestedArticlesSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeSuggestedArticlesSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeCaseField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSuggestedArticlesForCase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "useSuggestedArticlesForCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrderFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "workOrderFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeWorkOrderField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrderLineItemFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "workOrderLineItemFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeWorkOrderLineItemField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
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
