/**
 * EscalationRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EscalationRules  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.EscalationRule[] escalationRule;

    public EscalationRules() {
    }

    public EscalationRules(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.EscalationRule[] escalationRule) {
        super(
            fullName);
        this.escalationRule = escalationRule;
    }


    /**
     * Gets the escalationRule value for this EscalationRules.
     * 
     * @return escalationRule
     */
    public com.sforce.soap._2006._04.metadata.EscalationRule[] getEscalationRule() {
        return escalationRule;
    }


    /**
     * Sets the escalationRule value for this EscalationRules.
     * 
     * @param escalationRule
     */
    public void setEscalationRule(com.sforce.soap._2006._04.metadata.EscalationRule[] escalationRule) {
        this.escalationRule = escalationRule;
    }

    public com.sforce.soap._2006._04.metadata.EscalationRule getEscalationRule(int i) {
        return this.escalationRule[i];
    }

    public void setEscalationRule(int i, com.sforce.soap._2006._04.metadata.EscalationRule _value) {
        this.escalationRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EscalationRules)) return false;
        EscalationRules other = (EscalationRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.escalationRule==null && other.getEscalationRule()==null) || 
             (this.escalationRule!=null &&
              java.util.Arrays.equals(this.escalationRule, other.getEscalationRule())));
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
        if (getEscalationRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEscalationRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEscalationRule(), i);
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
        new org.apache.axis.description.TypeDesc(EscalationRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "escalationRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationRule"));
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
