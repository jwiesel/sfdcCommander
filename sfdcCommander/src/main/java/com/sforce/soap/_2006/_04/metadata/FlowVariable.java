/**
 * FlowVariable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowVariable  extends com.sforce.soap._2006._04.metadata.FlowElement  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowDataType dataType;

    private java.lang.Boolean isCollection;

    private java.lang.Boolean isInput;

    private java.lang.Boolean isOutput;

    private java.lang.String objectType;

    private java.lang.Integer scale;

    private com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value;

    public FlowVariable() {
    }

    public FlowVariable(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param2,
           java.lang.String description,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.FlowDataType dataType,
           java.lang.Boolean isCollection,
           java.lang.Boolean isInput,
           java.lang.Boolean isOutput,
           java.lang.String objectType,
           java.lang.Integer scale,
           com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value) {
        super(
            param2,
            description,
            name);
        this.dataType = dataType;
        this.isCollection = isCollection;
        this.isInput = isInput;
        this.isOutput = isOutput;
        this.objectType = objectType;
        this.scale = scale;
        this.value = value;
    }


    /**
     * Gets the dataType value for this FlowVariable.
     * 
     * @return dataType
     */
    public com.sforce.soap._2006._04.metadata.FlowDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this FlowVariable.
     * 
     * @param dataType
     */
    public void setDataType(com.sforce.soap._2006._04.metadata.FlowDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the isCollection value for this FlowVariable.
     * 
     * @return isCollection
     */
    public java.lang.Boolean getIsCollection() {
        return isCollection;
    }


    /**
     * Sets the isCollection value for this FlowVariable.
     * 
     * @param isCollection
     */
    public void setIsCollection(java.lang.Boolean isCollection) {
        this.isCollection = isCollection;
    }


    /**
     * Gets the isInput value for this FlowVariable.
     * 
     * @return isInput
     */
    public java.lang.Boolean getIsInput() {
        return isInput;
    }


    /**
     * Sets the isInput value for this FlowVariable.
     * 
     * @param isInput
     */
    public void setIsInput(java.lang.Boolean isInput) {
        this.isInput = isInput;
    }


    /**
     * Gets the isOutput value for this FlowVariable.
     * 
     * @return isOutput
     */
    public java.lang.Boolean getIsOutput() {
        return isOutput;
    }


    /**
     * Sets the isOutput value for this FlowVariable.
     * 
     * @param isOutput
     */
    public void setIsOutput(java.lang.Boolean isOutput) {
        this.isOutput = isOutput;
    }


    /**
     * Gets the objectType value for this FlowVariable.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this FlowVariable.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the scale value for this FlowVariable.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this FlowVariable.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the value value for this FlowVariable.
     * 
     * @return value
     */
    public com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue getValue() {
        return value;
    }


    /**
     * Sets the value value for this FlowVariable.
     * 
     * @param value
     */
    public void setValue(com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowVariable)) return false;
        FlowVariable other = (FlowVariable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.isCollection==null && other.getIsCollection()==null) || 
             (this.isCollection!=null &&
              this.isCollection.equals(other.getIsCollection()))) &&
            ((this.isInput==null && other.getIsInput()==null) || 
             (this.isInput!=null &&
              this.isInput.equals(other.getIsInput()))) &&
            ((this.isOutput==null && other.getIsOutput()==null) || 
             (this.isOutput!=null &&
              this.isOutput.equals(other.getIsOutput()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getIsCollection() != null) {
            _hashCode += getIsCollection().hashCode();
        }
        if (getIsInput() != null) {
            _hashCode += getIsInput().hashCode();
        }
        if (getIsOutput() != null) {
            _hashCode += getIsOutput().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowVariable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowVariable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowElementReferenceOrValue"));
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
