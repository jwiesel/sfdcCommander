/**
 * FlowScreenField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowScreenField  extends com.sforce.soap._2006._04.metadata.FlowElement  implements java.io.Serializable {
    private java.lang.String[] choiceReferences;

    private com.sforce.soap._2006._04.metadata.FlowDataType dataType;

    private java.lang.String defaultSelectedChoiceReference;

    private com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue defaultValue;

    private java.lang.String fieldText;

    private com.sforce.soap._2006._04.metadata.FlowScreenFieldType fieldType;

    private java.lang.String helpText;

    private java.lang.Boolean isRequired;

    private java.lang.Boolean isVisible;

    private java.lang.Integer scale;

    private com.sforce.soap._2006._04.metadata.FlowInputValidationRule validationRule;

    public FlowScreenField() {
    }

    public FlowScreenField(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param2,
           java.lang.String description,
           java.lang.String name,
           java.lang.String[] choiceReferences,
           com.sforce.soap._2006._04.metadata.FlowDataType dataType,
           java.lang.String defaultSelectedChoiceReference,
           com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue defaultValue,
           java.lang.String fieldText,
           com.sforce.soap._2006._04.metadata.FlowScreenFieldType fieldType,
           java.lang.String helpText,
           java.lang.Boolean isRequired,
           java.lang.Boolean isVisible,
           java.lang.Integer scale,
           com.sforce.soap._2006._04.metadata.FlowInputValidationRule validationRule) {
        super(
            param2,
            description,
            name);
        this.choiceReferences = choiceReferences;
        this.dataType = dataType;
        this.defaultSelectedChoiceReference = defaultSelectedChoiceReference;
        this.defaultValue = defaultValue;
        this.fieldText = fieldText;
        this.fieldType = fieldType;
        this.helpText = helpText;
        this.isRequired = isRequired;
        this.isVisible = isVisible;
        this.scale = scale;
        this.validationRule = validationRule;
    }


    /**
     * Gets the choiceReferences value for this FlowScreenField.
     * 
     * @return choiceReferences
     */
    public java.lang.String[] getChoiceReferences() {
        return choiceReferences;
    }


    /**
     * Sets the choiceReferences value for this FlowScreenField.
     * 
     * @param choiceReferences
     */
    public void setChoiceReferences(java.lang.String[] choiceReferences) {
        this.choiceReferences = choiceReferences;
    }

    public java.lang.String getChoiceReferences(int i) {
        return this.choiceReferences[i];
    }

    public void setChoiceReferences(int i, java.lang.String _value) {
        this.choiceReferences[i] = _value;
    }


    /**
     * Gets the dataType value for this FlowScreenField.
     * 
     * @return dataType
     */
    public com.sforce.soap._2006._04.metadata.FlowDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this FlowScreenField.
     * 
     * @param dataType
     */
    public void setDataType(com.sforce.soap._2006._04.metadata.FlowDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the defaultSelectedChoiceReference value for this FlowScreenField.
     * 
     * @return defaultSelectedChoiceReference
     */
    public java.lang.String getDefaultSelectedChoiceReference() {
        return defaultSelectedChoiceReference;
    }


    /**
     * Sets the defaultSelectedChoiceReference value for this FlowScreenField.
     * 
     * @param defaultSelectedChoiceReference
     */
    public void setDefaultSelectedChoiceReference(java.lang.String defaultSelectedChoiceReference) {
        this.defaultSelectedChoiceReference = defaultSelectedChoiceReference;
    }


    /**
     * Gets the defaultValue value for this FlowScreenField.
     * 
     * @return defaultValue
     */
    public com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this FlowScreenField.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the fieldText value for this FlowScreenField.
     * 
     * @return fieldText
     */
    public java.lang.String getFieldText() {
        return fieldText;
    }


    /**
     * Sets the fieldText value for this FlowScreenField.
     * 
     * @param fieldText
     */
    public void setFieldText(java.lang.String fieldText) {
        this.fieldText = fieldText;
    }


    /**
     * Gets the fieldType value for this FlowScreenField.
     * 
     * @return fieldType
     */
    public com.sforce.soap._2006._04.metadata.FlowScreenFieldType getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this FlowScreenField.
     * 
     * @param fieldType
     */
    public void setFieldType(com.sforce.soap._2006._04.metadata.FlowScreenFieldType fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the helpText value for this FlowScreenField.
     * 
     * @return helpText
     */
    public java.lang.String getHelpText() {
        return helpText;
    }


    /**
     * Sets the helpText value for this FlowScreenField.
     * 
     * @param helpText
     */
    public void setHelpText(java.lang.String helpText) {
        this.helpText = helpText;
    }


    /**
     * Gets the isRequired value for this FlowScreenField.
     * 
     * @return isRequired
     */
    public java.lang.Boolean getIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this FlowScreenField.
     * 
     * @param isRequired
     */
    public void setIsRequired(java.lang.Boolean isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the isVisible value for this FlowScreenField.
     * 
     * @return isVisible
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this FlowScreenField.
     * 
     * @param isVisible
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the scale value for this FlowScreenField.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this FlowScreenField.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the validationRule value for this FlowScreenField.
     * 
     * @return validationRule
     */
    public com.sforce.soap._2006._04.metadata.FlowInputValidationRule getValidationRule() {
        return validationRule;
    }


    /**
     * Sets the validationRule value for this FlowScreenField.
     * 
     * @param validationRule
     */
    public void setValidationRule(com.sforce.soap._2006._04.metadata.FlowInputValidationRule validationRule) {
        this.validationRule = validationRule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowScreenField)) return false;
        FlowScreenField other = (FlowScreenField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.choiceReferences==null && other.getChoiceReferences()==null) || 
             (this.choiceReferences!=null &&
              java.util.Arrays.equals(this.choiceReferences, other.getChoiceReferences()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.defaultSelectedChoiceReference==null && other.getDefaultSelectedChoiceReference()==null) || 
             (this.defaultSelectedChoiceReference!=null &&
              this.defaultSelectedChoiceReference.equals(other.getDefaultSelectedChoiceReference()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.fieldText==null && other.getFieldText()==null) || 
             (this.fieldText!=null &&
              this.fieldText.equals(other.getFieldText()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.helpText==null && other.getHelpText()==null) || 
             (this.helpText!=null &&
              this.helpText.equals(other.getHelpText()))) &&
            ((this.isRequired==null && other.getIsRequired()==null) || 
             (this.isRequired!=null &&
              this.isRequired.equals(other.getIsRequired()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.validationRule==null && other.getValidationRule()==null) || 
             (this.validationRule!=null &&
              this.validationRule.equals(other.getValidationRule())));
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
        if (getChoiceReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChoiceReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChoiceReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDefaultSelectedChoiceReference() != null) {
            _hashCode += getDefaultSelectedChoiceReference().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getFieldText() != null) {
            _hashCode += getFieldText().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getHelpText() != null) {
            _hashCode += getHelpText().hashCode();
        }
        if (getIsRequired() != null) {
            _hashCode += getIsRequired().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getValidationRule() != null) {
            _hashCode += getValidationRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowScreenField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreenField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "choiceReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultSelectedChoiceReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultSelectedChoiceReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowElementReferenceOrValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreenFieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "helpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
