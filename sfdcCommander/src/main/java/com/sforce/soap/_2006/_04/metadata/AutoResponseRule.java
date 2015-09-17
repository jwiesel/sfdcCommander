/**
 * AutoResponseRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AutoResponseRule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean active;

    private com.sforce.soap._2006._04.metadata.RuleEntry[] ruleEntry;

    public AutoResponseRule() {
    }

    public AutoResponseRule(
           java.lang.String fullName,
           java.lang.Boolean active,
           com.sforce.soap._2006._04.metadata.RuleEntry[] ruleEntry) {
        super(
            fullName);
        this.active = active;
        this.ruleEntry = ruleEntry;
    }


    /**
     * Gets the active value for this AutoResponseRule.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this AutoResponseRule.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the ruleEntry value for this AutoResponseRule.
     * 
     * @return ruleEntry
     */
    public com.sforce.soap._2006._04.metadata.RuleEntry[] getRuleEntry() {
        return ruleEntry;
    }


    /**
     * Sets the ruleEntry value for this AutoResponseRule.
     * 
     * @param ruleEntry
     */
    public void setRuleEntry(com.sforce.soap._2006._04.metadata.RuleEntry[] ruleEntry) {
        this.ruleEntry = ruleEntry;
    }

    public com.sforce.soap._2006._04.metadata.RuleEntry getRuleEntry(int i) {
        return this.ruleEntry[i];
    }

    public void setRuleEntry(int i, com.sforce.soap._2006._04.metadata.RuleEntry _value) {
        this.ruleEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoResponseRule)) return false;
        AutoResponseRule other = (AutoResponseRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.ruleEntry==null && other.getRuleEntry()==null) || 
             (this.ruleEntry!=null &&
              java.util.Arrays.equals(this.ruleEntry, other.getRuleEntry())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getRuleEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleEntry(), i);
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
        new org.apache.axis.description.TypeDesc(AutoResponseRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AutoResponseRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ruleEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RuleEntry"));
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
