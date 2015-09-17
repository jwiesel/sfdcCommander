/**
 * FlowRecordCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowRecordCreate  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private java.lang.String assignRecordIdToReference;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private com.sforce.soap._2006._04.metadata.FlowConnector faultConnector;

    private com.sforce.soap._2006._04.metadata.FlowInputFieldAssignment[] inputAssignments;

    private java.lang.String inputReference;

    private java.lang.String object;

    public FlowRecordCreate() {
    }

    public FlowRecordCreate(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           java.lang.String assignRecordIdToReference,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           com.sforce.soap._2006._04.metadata.FlowConnector faultConnector,
           com.sforce.soap._2006._04.metadata.FlowInputFieldAssignment[] inputAssignments,
           java.lang.String inputReference,
           java.lang.String object) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.assignRecordIdToReference = assignRecordIdToReference;
        this.connector = connector;
        this.faultConnector = faultConnector;
        this.inputAssignments = inputAssignments;
        this.inputReference = inputReference;
        this.object = object;
    }


    /**
     * Gets the assignRecordIdToReference value for this FlowRecordCreate.
     * 
     * @return assignRecordIdToReference
     */
    public java.lang.String getAssignRecordIdToReference() {
        return assignRecordIdToReference;
    }


    /**
     * Sets the assignRecordIdToReference value for this FlowRecordCreate.
     * 
     * @param assignRecordIdToReference
     */
    public void setAssignRecordIdToReference(java.lang.String assignRecordIdToReference) {
        this.assignRecordIdToReference = assignRecordIdToReference;
    }


    /**
     * Gets the connector value for this FlowRecordCreate.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowRecordCreate.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the faultConnector value for this FlowRecordCreate.
     * 
     * @return faultConnector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getFaultConnector() {
        return faultConnector;
    }


    /**
     * Sets the faultConnector value for this FlowRecordCreate.
     * 
     * @param faultConnector
     */
    public void setFaultConnector(com.sforce.soap._2006._04.metadata.FlowConnector faultConnector) {
        this.faultConnector = faultConnector;
    }


    /**
     * Gets the inputAssignments value for this FlowRecordCreate.
     * 
     * @return inputAssignments
     */
    public com.sforce.soap._2006._04.metadata.FlowInputFieldAssignment[] getInputAssignments() {
        return inputAssignments;
    }


    /**
     * Sets the inputAssignments value for this FlowRecordCreate.
     * 
     * @param inputAssignments
     */
    public void setInputAssignments(com.sforce.soap._2006._04.metadata.FlowInputFieldAssignment[] inputAssignments) {
        this.inputAssignments = inputAssignments;
    }

    public com.sforce.soap._2006._04.metadata.FlowInputFieldAssignment getInputAssignments(int i) {
        return this.inputAssignments[i];
    }

    public void setInputAssignments(int i, com.sforce.soap._2006._04.metadata.FlowInputFieldAssignment _value) {
        this.inputAssignments[i] = _value;
    }


    /**
     * Gets the inputReference value for this FlowRecordCreate.
     * 
     * @return inputReference
     */
    public java.lang.String getInputReference() {
        return inputReference;
    }


    /**
     * Sets the inputReference value for this FlowRecordCreate.
     * 
     * @param inputReference
     */
    public void setInputReference(java.lang.String inputReference) {
        this.inputReference = inputReference;
    }


    /**
     * Gets the object value for this FlowRecordCreate.
     * 
     * @return object
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this FlowRecordCreate.
     * 
     * @param object
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowRecordCreate)) return false;
        FlowRecordCreate other = (FlowRecordCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignRecordIdToReference==null && other.getAssignRecordIdToReference()==null) || 
             (this.assignRecordIdToReference!=null &&
              this.assignRecordIdToReference.equals(other.getAssignRecordIdToReference()))) &&
            ((this.connector==null && other.getConnector()==null) || 
             (this.connector!=null &&
              this.connector.equals(other.getConnector()))) &&
            ((this.faultConnector==null && other.getFaultConnector()==null) || 
             (this.faultConnector!=null &&
              this.faultConnector.equals(other.getFaultConnector()))) &&
            ((this.inputAssignments==null && other.getInputAssignments()==null) || 
             (this.inputAssignments!=null &&
              java.util.Arrays.equals(this.inputAssignments, other.getInputAssignments()))) &&
            ((this.inputReference==null && other.getInputReference()==null) || 
             (this.inputReference!=null &&
              this.inputReference.equals(other.getInputReference()))) &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject())));
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
        if (getAssignRecordIdToReference() != null) {
            _hashCode += getAssignRecordIdToReference().hashCode();
        }
        if (getConnector() != null) {
            _hashCode += getConnector().hashCode();
        }
        if (getFaultConnector() != null) {
            _hashCode += getFaultConnector().hashCode();
        }
        if (getInputAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInputReference() != null) {
            _hashCode += getInputReference().hashCode();
        }
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowRecordCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignRecordIdToReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignRecordIdToReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "faultConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inputAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowInputFieldAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inputReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "object"));
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
