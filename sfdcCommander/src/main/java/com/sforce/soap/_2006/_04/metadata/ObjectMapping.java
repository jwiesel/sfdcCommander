/**
 * ObjectMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ObjectMapping  implements java.io.Serializable {
    private java.lang.String inputObject;

    private com.sforce.soap._2006._04.metadata.ObjectMappingField[] mappingFields;

    private java.lang.String outputObject;

    public ObjectMapping() {
    }

    public ObjectMapping(
           java.lang.String inputObject,
           com.sforce.soap._2006._04.metadata.ObjectMappingField[] mappingFields,
           java.lang.String outputObject) {
           this.inputObject = inputObject;
           this.mappingFields = mappingFields;
           this.outputObject = outputObject;
    }


    /**
     * Gets the inputObject value for this ObjectMapping.
     * 
     * @return inputObject
     */
    public java.lang.String getInputObject() {
        return inputObject;
    }


    /**
     * Sets the inputObject value for this ObjectMapping.
     * 
     * @param inputObject
     */
    public void setInputObject(java.lang.String inputObject) {
        this.inputObject = inputObject;
    }


    /**
     * Gets the mappingFields value for this ObjectMapping.
     * 
     * @return mappingFields
     */
    public com.sforce.soap._2006._04.metadata.ObjectMappingField[] getMappingFields() {
        return mappingFields;
    }


    /**
     * Sets the mappingFields value for this ObjectMapping.
     * 
     * @param mappingFields
     */
    public void setMappingFields(com.sforce.soap._2006._04.metadata.ObjectMappingField[] mappingFields) {
        this.mappingFields = mappingFields;
    }

    public com.sforce.soap._2006._04.metadata.ObjectMappingField getMappingFields(int i) {
        return this.mappingFields[i];
    }

    public void setMappingFields(int i, com.sforce.soap._2006._04.metadata.ObjectMappingField _value) {
        this.mappingFields[i] = _value;
    }


    /**
     * Gets the outputObject value for this ObjectMapping.
     * 
     * @return outputObject
     */
    public java.lang.String getOutputObject() {
        return outputObject;
    }


    /**
     * Sets the outputObject value for this ObjectMapping.
     * 
     * @param outputObject
     */
    public void setOutputObject(java.lang.String outputObject) {
        this.outputObject = outputObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectMapping)) return false;
        ObjectMapping other = (ObjectMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputObject==null && other.getInputObject()==null) || 
             (this.inputObject!=null &&
              this.inputObject.equals(other.getInputObject()))) &&
            ((this.mappingFields==null && other.getMappingFields()==null) || 
             (this.mappingFields!=null &&
              java.util.Arrays.equals(this.mappingFields, other.getMappingFields()))) &&
            ((this.outputObject==null && other.getOutputObject()==null) || 
             (this.outputObject!=null &&
              this.outputObject.equals(other.getOutputObject())));
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
        if (getInputObject() != null) {
            _hashCode += getInputObject().hashCode();
        }
        if (getMappingFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMappingFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMappingFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputObject() != null) {
            _hashCode += getOutputObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inputObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mappingFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectMappingField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
