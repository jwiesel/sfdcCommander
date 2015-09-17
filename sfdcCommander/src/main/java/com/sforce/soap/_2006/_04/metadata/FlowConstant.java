/**
 * FlowConstant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowConstant  extends com.sforce.soap._2006._04.metadata.FlowElement  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowDataType dataType;

    private com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value;

    public FlowConstant() {
    }

    public FlowConstant(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param2,
           java.lang.String description,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.FlowDataType dataType,
           com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value) {
        super(
            param2,
            description,
            name);
        this.dataType = dataType;
        this.value = value;
    }


    /**
     * Gets the dataType value for this FlowConstant.
     * 
     * @return dataType
     */
    public com.sforce.soap._2006._04.metadata.FlowDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this FlowConstant.
     * 
     * @param dataType
     */
    public void setDataType(com.sforce.soap._2006._04.metadata.FlowDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the value value for this FlowConstant.
     * 
     * @return value
     */
    public com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue getValue() {
        return value;
    }


    /**
     * Sets the value value for this FlowConstant.
     * 
     * @param value
     */
    public void setValue(com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowConstant)) return false;
        FlowConstant other = (FlowConstant) obj;
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowConstant.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConstant"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDataType"));
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
