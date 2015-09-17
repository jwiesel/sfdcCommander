/**
 * FlowChoiceUserInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowChoiceUserInput  implements java.io.Serializable {
    private java.lang.Boolean isRequired;

    private java.lang.String promptText;

    private com.sforce.soap._2006._04.metadata.FlowInputValidationRule validationRule;

    private com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement;  // attribute

    public FlowChoiceUserInput() {
    }

    public FlowChoiceUserInput(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param1,
           java.lang.Boolean isRequired,
           java.lang.String promptText,
           com.sforce.soap._2006._04.metadata.FlowInputValidationRule validationRule) {
        this.param1 = param1;
        this.isRequired = isRequired;
        this.promptText = promptText;
        this.validationRule = validationRule;
    }


    /**
     * Gets the isRequired value for this FlowChoiceUserInput.
     * 
     * @return isRequired
     */
    public java.lang.Boolean getIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this FlowChoiceUserInput.
     * 
     * @param isRequired
     */
    public void setIsRequired(java.lang.Boolean isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the promptText value for this FlowChoiceUserInput.
     * 
     * @return promptText
     */
    public java.lang.String getPromptText() {
        return promptText;
    }


    /**
     * Sets the promptText value for this FlowChoiceUserInput.
     * 
     * @param promptText
     */
    public void setPromptText(java.lang.String promptText) {
        this.promptText = promptText;
    }


    /**
     * Gets the validationRule value for this FlowChoiceUserInput.
     * 
     * @return validationRule
     */
    public com.sforce.soap._2006._04.metadata.FlowInputValidationRule getValidationRule() {
        return validationRule;
    }


    /**
     * Sets the validationRule value for this FlowChoiceUserInput.
     * 
     * @param validationRule
     */
    public void setValidationRule(com.sforce.soap._2006._04.metadata.FlowInputValidationRule validationRule) {
        this.validationRule = validationRule;
    }


    /**
     * Gets the flowBaseElement value for this FlowChoiceUserInput.
     * 
     * @return flowBaseElement
     */
    public com.sforce.soap._2006._04.metadata.FlowMetadataValue[] getFlowBaseElement() {
        return flowBaseElement;
    }


    /**
     * Sets the flowBaseElement value for this FlowChoiceUserInput.
     * 
     * @param flowBaseElement
     */
    public void setFlowBaseElement(com.sforce.soap._2006._04.metadata.FlowMetadataValue[] flowBaseElement) {
        this.flowBaseElement = flowBaseElement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowChoiceUserInput)) return false;
        FlowChoiceUserInput other = (FlowChoiceUserInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isRequired==null && other.getIsRequired()==null) || 
             (this.isRequired!=null &&
              this.isRequired.equals(other.getIsRequired()))) &&
            ((this.promptText==null && other.getPromptText()==null) || 
             (this.promptText!=null &&
              this.promptText.equals(other.getPromptText()))) &&
            ((this.validationRule==null && other.getValidationRule()==null) || 
             (this.validationRule!=null &&
              this.validationRule.equals(other.getValidationRule()))) &&
            ((this.flowBaseElement==null && other.getFlowBaseElement()==null) || 
             (this.flowBaseElement!=null &&
              java.util.Arrays.equals(this.flowBaseElement, other.getFlowBaseElement())));
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
        if (getIsRequired() != null) {
            _hashCode += getIsRequired().hashCode();
        }
        if (getPromptText() != null) {
            _hashCode += getPromptText().hashCode();
        }
        if (getValidationRule() != null) {
            _hashCode += getValidationRule().hashCode();
        }
        if (getFlowBaseElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlowBaseElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlowBaseElement(), i);
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
        new org.apache.axis.description.TypeDesc(FlowChoiceUserInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowChoiceUserInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "promptText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "validationRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowInputValidationRule"));
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
