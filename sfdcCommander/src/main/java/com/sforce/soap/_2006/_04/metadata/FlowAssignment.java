/**
 * FlowAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowAssignment  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowAssignmentItem[] assignmentItems;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    public FlowAssignment() {
    }

    public FlowAssignment(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           com.sforce.soap._2006._04.metadata.FlowAssignmentItem[] assignmentItems,
           com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.assignmentItems = assignmentItems;
        this.connector = connector;
    }


    /**
     * Gets the assignmentItems value for this FlowAssignment.
     * 
     * @return assignmentItems
     */
    public com.sforce.soap._2006._04.metadata.FlowAssignmentItem[] getAssignmentItems() {
        return assignmentItems;
    }


    /**
     * Sets the assignmentItems value for this FlowAssignment.
     * 
     * @param assignmentItems
     */
    public void setAssignmentItems(com.sforce.soap._2006._04.metadata.FlowAssignmentItem[] assignmentItems) {
        this.assignmentItems = assignmentItems;
    }

    public com.sforce.soap._2006._04.metadata.FlowAssignmentItem getAssignmentItems(int i) {
        return this.assignmentItems[i];
    }

    public void setAssignmentItems(int i, com.sforce.soap._2006._04.metadata.FlowAssignmentItem _value) {
        this.assignmentItems[i] = _value;
    }


    /**
     * Gets the connector value for this FlowAssignment.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowAssignment.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowAssignment)) return false;
        FlowAssignment other = (FlowAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignmentItems==null && other.getAssignmentItems()==null) || 
             (this.assignmentItems!=null &&
              java.util.Arrays.equals(this.assignmentItems, other.getAssignmentItems()))) &&
            ((this.connector==null && other.getConnector()==null) || 
             (this.connector!=null &&
              this.connector.equals(other.getConnector())));
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
        if (getAssignmentItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignmentItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignmentItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnector() != null) {
            _hashCode += getConnector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignmentItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowAssignmentItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connector"));
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
