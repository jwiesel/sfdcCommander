/**
 * FlowLoop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowLoop  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private java.lang.String assignNextValueToReference;

    private java.lang.String collectionReference;

    private com.sforce.soap._2006._04.metadata.IterationOrder iterationOrder;

    private com.sforce.soap._2006._04.metadata.FlowConnector nextValueConnector;

    private com.sforce.soap._2006._04.metadata.FlowConnector noMoreValuesConnector;

    public FlowLoop() {
    }

    public FlowLoop(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           java.lang.String assignNextValueToReference,
           java.lang.String collectionReference,
           com.sforce.soap._2006._04.metadata.IterationOrder iterationOrder,
           com.sforce.soap._2006._04.metadata.FlowConnector nextValueConnector,
           com.sforce.soap._2006._04.metadata.FlowConnector noMoreValuesConnector) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.assignNextValueToReference = assignNextValueToReference;
        this.collectionReference = collectionReference;
        this.iterationOrder = iterationOrder;
        this.nextValueConnector = nextValueConnector;
        this.noMoreValuesConnector = noMoreValuesConnector;
    }


    /**
     * Gets the assignNextValueToReference value for this FlowLoop.
     * 
     * @return assignNextValueToReference
     */
    public java.lang.String getAssignNextValueToReference() {
        return assignNextValueToReference;
    }


    /**
     * Sets the assignNextValueToReference value for this FlowLoop.
     * 
     * @param assignNextValueToReference
     */
    public void setAssignNextValueToReference(java.lang.String assignNextValueToReference) {
        this.assignNextValueToReference = assignNextValueToReference;
    }


    /**
     * Gets the collectionReference value for this FlowLoop.
     * 
     * @return collectionReference
     */
    public java.lang.String getCollectionReference() {
        return collectionReference;
    }


    /**
     * Sets the collectionReference value for this FlowLoop.
     * 
     * @param collectionReference
     */
    public void setCollectionReference(java.lang.String collectionReference) {
        this.collectionReference = collectionReference;
    }


    /**
     * Gets the iterationOrder value for this FlowLoop.
     * 
     * @return iterationOrder
     */
    public com.sforce.soap._2006._04.metadata.IterationOrder getIterationOrder() {
        return iterationOrder;
    }


    /**
     * Sets the iterationOrder value for this FlowLoop.
     * 
     * @param iterationOrder
     */
    public void setIterationOrder(com.sforce.soap._2006._04.metadata.IterationOrder iterationOrder) {
        this.iterationOrder = iterationOrder;
    }


    /**
     * Gets the nextValueConnector value for this FlowLoop.
     * 
     * @return nextValueConnector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getNextValueConnector() {
        return nextValueConnector;
    }


    /**
     * Sets the nextValueConnector value for this FlowLoop.
     * 
     * @param nextValueConnector
     */
    public void setNextValueConnector(com.sforce.soap._2006._04.metadata.FlowConnector nextValueConnector) {
        this.nextValueConnector = nextValueConnector;
    }


    /**
     * Gets the noMoreValuesConnector value for this FlowLoop.
     * 
     * @return noMoreValuesConnector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getNoMoreValuesConnector() {
        return noMoreValuesConnector;
    }


    /**
     * Sets the noMoreValuesConnector value for this FlowLoop.
     * 
     * @param noMoreValuesConnector
     */
    public void setNoMoreValuesConnector(com.sforce.soap._2006._04.metadata.FlowConnector noMoreValuesConnector) {
        this.noMoreValuesConnector = noMoreValuesConnector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowLoop)) return false;
        FlowLoop other = (FlowLoop) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignNextValueToReference==null && other.getAssignNextValueToReference()==null) || 
             (this.assignNextValueToReference!=null &&
              this.assignNextValueToReference.equals(other.getAssignNextValueToReference()))) &&
            ((this.collectionReference==null && other.getCollectionReference()==null) || 
             (this.collectionReference!=null &&
              this.collectionReference.equals(other.getCollectionReference()))) &&
            ((this.iterationOrder==null && other.getIterationOrder()==null) || 
             (this.iterationOrder!=null &&
              this.iterationOrder.equals(other.getIterationOrder()))) &&
            ((this.nextValueConnector==null && other.getNextValueConnector()==null) || 
             (this.nextValueConnector!=null &&
              this.nextValueConnector.equals(other.getNextValueConnector()))) &&
            ((this.noMoreValuesConnector==null && other.getNoMoreValuesConnector()==null) || 
             (this.noMoreValuesConnector!=null &&
              this.noMoreValuesConnector.equals(other.getNoMoreValuesConnector())));
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
        if (getAssignNextValueToReference() != null) {
            _hashCode += getAssignNextValueToReference().hashCode();
        }
        if (getCollectionReference() != null) {
            _hashCode += getCollectionReference().hashCode();
        }
        if (getIterationOrder() != null) {
            _hashCode += getIterationOrder().hashCode();
        }
        if (getNextValueConnector() != null) {
            _hashCode += getNextValueConnector().hashCode();
        }
        if (getNoMoreValuesConnector() != null) {
            _hashCode += getNoMoreValuesConnector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowLoop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowLoop"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignNextValueToReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignNextValueToReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "collectionReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterationOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "iterationOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IterationOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextValueConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "nextValueConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noMoreValuesConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "noMoreValuesConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
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
