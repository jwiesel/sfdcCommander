/**
 * ApprovalStepApprover.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ApprovalStepApprover  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.Approver[] approver;

    private com.sforce.soap._2006._04.metadata.RoutingType whenMultipleApprovers;

    public ApprovalStepApprover() {
    }

    public ApprovalStepApprover(
           com.sforce.soap._2006._04.metadata.Approver[] approver,
           com.sforce.soap._2006._04.metadata.RoutingType whenMultipleApprovers) {
           this.approver = approver;
           this.whenMultipleApprovers = whenMultipleApprovers;
    }


    /**
     * Gets the approver value for this ApprovalStepApprover.
     * 
     * @return approver
     */
    public com.sforce.soap._2006._04.metadata.Approver[] getApprover() {
        return approver;
    }


    /**
     * Sets the approver value for this ApprovalStepApprover.
     * 
     * @param approver
     */
    public void setApprover(com.sforce.soap._2006._04.metadata.Approver[] approver) {
        this.approver = approver;
    }

    public com.sforce.soap._2006._04.metadata.Approver getApprover(int i) {
        return this.approver[i];
    }

    public void setApprover(int i, com.sforce.soap._2006._04.metadata.Approver _value) {
        this.approver[i] = _value;
    }


    /**
     * Gets the whenMultipleApprovers value for this ApprovalStepApprover.
     * 
     * @return whenMultipleApprovers
     */
    public com.sforce.soap._2006._04.metadata.RoutingType getWhenMultipleApprovers() {
        return whenMultipleApprovers;
    }


    /**
     * Sets the whenMultipleApprovers value for this ApprovalStepApprover.
     * 
     * @param whenMultipleApprovers
     */
    public void setWhenMultipleApprovers(com.sforce.soap._2006._04.metadata.RoutingType whenMultipleApprovers) {
        this.whenMultipleApprovers = whenMultipleApprovers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApprovalStepApprover)) return false;
        ApprovalStepApprover other = (ApprovalStepApprover) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approver==null && other.getApprover()==null) || 
             (this.approver!=null &&
              java.util.Arrays.equals(this.approver, other.getApprover()))) &&
            ((this.whenMultipleApprovers==null && other.getWhenMultipleApprovers()==null) || 
             (this.whenMultipleApprovers!=null &&
              this.whenMultipleApprovers.equals(other.getWhenMultipleApprovers())));
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
        if (getApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWhenMultipleApprovers() != null) {
            _hashCode += getWhenMultipleApprovers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApprovalStepApprover.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStepApprover"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Approver"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whenMultipleApprovers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "whenMultipleApprovers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RoutingType"));
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
