/**
 * NextAutomatedApprover.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class NextAutomatedApprover  implements java.io.Serializable {
    private java.lang.Boolean useApproverFieldOfRecordOwner;

    private java.lang.String userHierarchyField;

    public NextAutomatedApprover() {
    }

    public NextAutomatedApprover(
           java.lang.Boolean useApproverFieldOfRecordOwner,
           java.lang.String userHierarchyField) {
           this.useApproverFieldOfRecordOwner = useApproverFieldOfRecordOwner;
           this.userHierarchyField = userHierarchyField;
    }


    /**
     * Gets the useApproverFieldOfRecordOwner value for this NextAutomatedApprover.
     * 
     * @return useApproverFieldOfRecordOwner
     */
    public java.lang.Boolean getUseApproverFieldOfRecordOwner() {
        return useApproverFieldOfRecordOwner;
    }


    /**
     * Sets the useApproverFieldOfRecordOwner value for this NextAutomatedApprover.
     * 
     * @param useApproverFieldOfRecordOwner
     */
    public void setUseApproverFieldOfRecordOwner(java.lang.Boolean useApproverFieldOfRecordOwner) {
        this.useApproverFieldOfRecordOwner = useApproverFieldOfRecordOwner;
    }


    /**
     * Gets the userHierarchyField value for this NextAutomatedApprover.
     * 
     * @return userHierarchyField
     */
    public java.lang.String getUserHierarchyField() {
        return userHierarchyField;
    }


    /**
     * Sets the userHierarchyField value for this NextAutomatedApprover.
     * 
     * @param userHierarchyField
     */
    public void setUserHierarchyField(java.lang.String userHierarchyField) {
        this.userHierarchyField = userHierarchyField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NextAutomatedApprover)) return false;
        NextAutomatedApprover other = (NextAutomatedApprover) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.useApproverFieldOfRecordOwner==null && other.getUseApproverFieldOfRecordOwner()==null) || 
             (this.useApproverFieldOfRecordOwner!=null &&
              this.useApproverFieldOfRecordOwner.equals(other.getUseApproverFieldOfRecordOwner()))) &&
            ((this.userHierarchyField==null && other.getUserHierarchyField()==null) || 
             (this.userHierarchyField!=null &&
              this.userHierarchyField.equals(other.getUserHierarchyField())));
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
        if (getUseApproverFieldOfRecordOwner() != null) {
            _hashCode += getUseApproverFieldOfRecordOwner().hashCode();
        }
        if (getUserHierarchyField() != null) {
            _hashCode += getUserHierarchyField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NextAutomatedApprover.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NextAutomatedApprover"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useApproverFieldOfRecordOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "useApproverFieldOfRecordOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userHierarchyField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userHierarchyField"));
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
