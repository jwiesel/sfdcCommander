/**
 * LiveChatSensitiveDataRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LiveChatSensitiveDataRule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.SensitiveDataActionType actionType;

    private java.lang.String description;

    private int enforceOn;

    private boolean isEnabled;

    private java.lang.String pattern;

    private java.lang.String replacement;

    public LiveChatSensitiveDataRule() {
    }

    public LiveChatSensitiveDataRule(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.SensitiveDataActionType actionType,
           java.lang.String description,
           int enforceOn,
           boolean isEnabled,
           java.lang.String pattern,
           java.lang.String replacement) {
        super(
            fullName);
        this.actionType = actionType;
        this.description = description;
        this.enforceOn = enforceOn;
        this.isEnabled = isEnabled;
        this.pattern = pattern;
        this.replacement = replacement;
    }


    /**
     * Gets the actionType value for this LiveChatSensitiveDataRule.
     * 
     * @return actionType
     */
    public com.sforce.soap._2006._04.metadata.SensitiveDataActionType getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this LiveChatSensitiveDataRule.
     * 
     * @param actionType
     */
    public void setActionType(com.sforce.soap._2006._04.metadata.SensitiveDataActionType actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the description value for this LiveChatSensitiveDataRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LiveChatSensitiveDataRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the enforceOn value for this LiveChatSensitiveDataRule.
     * 
     * @return enforceOn
     */
    public int getEnforceOn() {
        return enforceOn;
    }


    /**
     * Sets the enforceOn value for this LiveChatSensitiveDataRule.
     * 
     * @param enforceOn
     */
    public void setEnforceOn(int enforceOn) {
        this.enforceOn = enforceOn;
    }


    /**
     * Gets the isEnabled value for this LiveChatSensitiveDataRule.
     * 
     * @return isEnabled
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this LiveChatSensitiveDataRule.
     * 
     * @param isEnabled
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the pattern value for this LiveChatSensitiveDataRule.
     * 
     * @return pattern
     */
    public java.lang.String getPattern() {
        return pattern;
    }


    /**
     * Sets the pattern value for this LiveChatSensitiveDataRule.
     * 
     * @param pattern
     */
    public void setPattern(java.lang.String pattern) {
        this.pattern = pattern;
    }


    /**
     * Gets the replacement value for this LiveChatSensitiveDataRule.
     * 
     * @return replacement
     */
    public java.lang.String getReplacement() {
        return replacement;
    }


    /**
     * Sets the replacement value for this LiveChatSensitiveDataRule.
     * 
     * @param replacement
     */
    public void setReplacement(java.lang.String replacement) {
        this.replacement = replacement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveChatSensitiveDataRule)) return false;
        LiveChatSensitiveDataRule other = (LiveChatSensitiveDataRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.enforceOn == other.getEnforceOn() &&
            this.isEnabled == other.isIsEnabled() &&
            ((this.pattern==null && other.getPattern()==null) || 
             (this.pattern!=null &&
              this.pattern.equals(other.getPattern()))) &&
            ((this.replacement==null && other.getReplacement()==null) || 
             (this.replacement!=null &&
              this.replacement.equals(other.getReplacement())));
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
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getEnforceOn();
        _hashCode += (isIsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPattern() != null) {
            _hashCode += getPattern().hashCode();
        }
        if (getReplacement() != null) {
            _hashCode += getReplacement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiveChatSensitiveDataRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatSensitiveDataRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SensitiveDataActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enforceOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pattern");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replacement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "replacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
