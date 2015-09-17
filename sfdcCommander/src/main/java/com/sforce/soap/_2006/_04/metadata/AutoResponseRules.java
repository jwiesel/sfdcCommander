/**
 * AutoResponseRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AutoResponseRules  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.AutoResponseRule[] autoResponseRule;

    public AutoResponseRules() {
    }

    public AutoResponseRules(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.AutoResponseRule[] autoResponseRule) {
        super(
            fullName);
        this.autoResponseRule = autoResponseRule;
    }


    /**
     * Gets the autoResponseRule value for this AutoResponseRules.
     * 
     * @return autoResponseRule
     */
    public com.sforce.soap._2006._04.metadata.AutoResponseRule[] getAutoResponseRule() {
        return autoResponseRule;
    }


    /**
     * Sets the autoResponseRule value for this AutoResponseRules.
     * 
     * @param autoResponseRule
     */
    public void setAutoResponseRule(com.sforce.soap._2006._04.metadata.AutoResponseRule[] autoResponseRule) {
        this.autoResponseRule = autoResponseRule;
    }

    public com.sforce.soap._2006._04.metadata.AutoResponseRule getAutoResponseRule(int i) {
        return this.autoResponseRule[i];
    }

    public void setAutoResponseRule(int i, com.sforce.soap._2006._04.metadata.AutoResponseRule _value) {
        this.autoResponseRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoResponseRules)) return false;
        AutoResponseRules other = (AutoResponseRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoResponseRule==null && other.getAutoResponseRule()==null) || 
             (this.autoResponseRule!=null &&
              java.util.Arrays.equals(this.autoResponseRule, other.getAutoResponseRule())));
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
        if (getAutoResponseRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoResponseRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoResponseRule(), i);
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
        new org.apache.axis.description.TypeDesc(AutoResponseRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AutoResponseRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoResponseRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autoResponseRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AutoResponseRule"));
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
