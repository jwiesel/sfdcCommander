/**
 * DuplicateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DuplicateResult  implements java.io.Serializable {
    private boolean allowSave;

    private java.lang.String duplicateRule;

    private java.lang.String duplicateRuleEntityType;

    private java.lang.String errorMessage;

    private com.sforce.soap.partner.MatchResult[] matchResults;

    public DuplicateResult() {
    }

    public DuplicateResult(
           boolean allowSave,
           java.lang.String duplicateRule,
           java.lang.String duplicateRuleEntityType,
           java.lang.String errorMessage,
           com.sforce.soap.partner.MatchResult[] matchResults) {
           this.allowSave = allowSave;
           this.duplicateRule = duplicateRule;
           this.duplicateRuleEntityType = duplicateRuleEntityType;
           this.errorMessage = errorMessage;
           this.matchResults = matchResults;
    }


    /**
     * Gets the allowSave value for this DuplicateResult.
     * 
     * @return allowSave
     */
    public boolean isAllowSave() {
        return allowSave;
    }


    /**
     * Sets the allowSave value for this DuplicateResult.
     * 
     * @param allowSave
     */
    public void setAllowSave(boolean allowSave) {
        this.allowSave = allowSave;
    }


    /**
     * Gets the duplicateRule value for this DuplicateResult.
     * 
     * @return duplicateRule
     */
    public java.lang.String getDuplicateRule() {
        return duplicateRule;
    }


    /**
     * Sets the duplicateRule value for this DuplicateResult.
     * 
     * @param duplicateRule
     */
    public void setDuplicateRule(java.lang.String duplicateRule) {
        this.duplicateRule = duplicateRule;
    }


    /**
     * Gets the duplicateRuleEntityType value for this DuplicateResult.
     * 
     * @return duplicateRuleEntityType
     */
    public java.lang.String getDuplicateRuleEntityType() {
        return duplicateRuleEntityType;
    }


    /**
     * Sets the duplicateRuleEntityType value for this DuplicateResult.
     * 
     * @param duplicateRuleEntityType
     */
    public void setDuplicateRuleEntityType(java.lang.String duplicateRuleEntityType) {
        this.duplicateRuleEntityType = duplicateRuleEntityType;
    }


    /**
     * Gets the errorMessage value for this DuplicateResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this DuplicateResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the matchResults value for this DuplicateResult.
     * 
     * @return matchResults
     */
    public com.sforce.soap.partner.MatchResult[] getMatchResults() {
        return matchResults;
    }


    /**
     * Sets the matchResults value for this DuplicateResult.
     * 
     * @param matchResults
     */
    public void setMatchResults(com.sforce.soap.partner.MatchResult[] matchResults) {
        this.matchResults = matchResults;
    }

    public com.sforce.soap.partner.MatchResult getMatchResults(int i) {
        return this.matchResults[i];
    }

    public void setMatchResults(int i, com.sforce.soap.partner.MatchResult _value) {
        this.matchResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DuplicateResult)) return false;
        DuplicateResult other = (DuplicateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowSave == other.isAllowSave() &&
            ((this.duplicateRule==null && other.getDuplicateRule()==null) || 
             (this.duplicateRule!=null &&
              this.duplicateRule.equals(other.getDuplicateRule()))) &&
            ((this.duplicateRuleEntityType==null && other.getDuplicateRuleEntityType()==null) || 
             (this.duplicateRuleEntityType!=null &&
              this.duplicateRuleEntityType.equals(other.getDuplicateRuleEntityType()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.matchResults==null && other.getMatchResults()==null) || 
             (this.matchResults!=null &&
              java.util.Arrays.equals(this.matchResults, other.getMatchResults())));
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
        _hashCode += (isAllowSave() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDuplicateRule() != null) {
            _hashCode += getDuplicateRule().hashCode();
        }
        if (getDuplicateRuleEntityType() != null) {
            _hashCode += getDuplicateRuleEntityType().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getMatchResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchResults(), i);
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
        new org.apache.axis.description.TypeDesc(DuplicateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DuplicateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowSave");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "allowSave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "duplicateRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateRuleEntityType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "duplicateRuleEntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "matchResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MatchResult"));
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
