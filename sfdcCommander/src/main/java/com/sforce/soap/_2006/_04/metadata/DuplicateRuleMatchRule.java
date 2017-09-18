/**
 * DuplicateRuleMatchRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DuplicateRuleMatchRule  implements java.io.Serializable {
    private java.lang.String matchRuleSObjectType;

    private java.lang.String matchingRule;

    private com.sforce.soap._2006._04.metadata.ObjectMapping objectMapping;

    public DuplicateRuleMatchRule() {
    }

    public DuplicateRuleMatchRule(
           java.lang.String matchRuleSObjectType,
           java.lang.String matchingRule,
           com.sforce.soap._2006._04.metadata.ObjectMapping objectMapping) {
           this.matchRuleSObjectType = matchRuleSObjectType;
           this.matchingRule = matchingRule;
           this.objectMapping = objectMapping;
    }


    /**
     * Gets the matchRuleSObjectType value for this DuplicateRuleMatchRule.
     * 
     * @return matchRuleSObjectType
     */
    public java.lang.String getMatchRuleSObjectType() {
        return matchRuleSObjectType;
    }


    /**
     * Sets the matchRuleSObjectType value for this DuplicateRuleMatchRule.
     * 
     * @param matchRuleSObjectType
     */
    public void setMatchRuleSObjectType(java.lang.String matchRuleSObjectType) {
        this.matchRuleSObjectType = matchRuleSObjectType;
    }


    /**
     * Gets the matchingRule value for this DuplicateRuleMatchRule.
     * 
     * @return matchingRule
     */
    public java.lang.String getMatchingRule() {
        return matchingRule;
    }


    /**
     * Sets the matchingRule value for this DuplicateRuleMatchRule.
     * 
     * @param matchingRule
     */
    public void setMatchingRule(java.lang.String matchingRule) {
        this.matchingRule = matchingRule;
    }


    /**
     * Gets the objectMapping value for this DuplicateRuleMatchRule.
     * 
     * @return objectMapping
     */
    public com.sforce.soap._2006._04.metadata.ObjectMapping getObjectMapping() {
        return objectMapping;
    }


    /**
     * Sets the objectMapping value for this DuplicateRuleMatchRule.
     * 
     * @param objectMapping
     */
    public void setObjectMapping(com.sforce.soap._2006._04.metadata.ObjectMapping objectMapping) {
        this.objectMapping = objectMapping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DuplicateRuleMatchRule)) return false;
        DuplicateRuleMatchRule other = (DuplicateRuleMatchRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchRuleSObjectType==null && other.getMatchRuleSObjectType()==null) || 
             (this.matchRuleSObjectType!=null &&
              this.matchRuleSObjectType.equals(other.getMatchRuleSObjectType()))) &&
            ((this.matchingRule==null && other.getMatchingRule()==null) || 
             (this.matchingRule!=null &&
              this.matchingRule.equals(other.getMatchingRule()))) &&
            ((this.objectMapping==null && other.getObjectMapping()==null) || 
             (this.objectMapping!=null &&
              this.objectMapping.equals(other.getObjectMapping())));
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
        if (getMatchRuleSObjectType() != null) {
            _hashCode += getMatchRuleSObjectType().hashCode();
        }
        if (getMatchingRule() != null) {
            _hashCode += getMatchingRule().hashCode();
        }
        if (getObjectMapping() != null) {
            _hashCode += getObjectMapping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DuplicateRuleMatchRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DuplicateRuleMatchRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchRuleSObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "matchRuleSObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "matchingRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "objectMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectMapping"));
        elemField.setNillable(true);
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
