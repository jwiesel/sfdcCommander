/**
 * ManagedTopics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ManagedTopics  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ManagedTopic[] managedTopic;

    public ManagedTopics() {
    }

    public ManagedTopics(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ManagedTopic[] managedTopic) {
        super(
            fullName);
        this.managedTopic = managedTopic;
    }


    /**
     * Gets the managedTopic value for this ManagedTopics.
     * 
     * @return managedTopic
     */
    public com.sforce.soap._2006._04.metadata.ManagedTopic[] getManagedTopic() {
        return managedTopic;
    }


    /**
     * Sets the managedTopic value for this ManagedTopics.
     * 
     * @param managedTopic
     */
    public void setManagedTopic(com.sforce.soap._2006._04.metadata.ManagedTopic[] managedTopic) {
        this.managedTopic = managedTopic;
    }

    public com.sforce.soap._2006._04.metadata.ManagedTopic getManagedTopic(int i) {
        return this.managedTopic[i];
    }

    public void setManagedTopic(int i, com.sforce.soap._2006._04.metadata.ManagedTopic _value) {
        this.managedTopic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedTopics)) return false;
        ManagedTopics other = (ManagedTopics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.managedTopic==null && other.getManagedTopic()==null) || 
             (this.managedTopic!=null &&
              java.util.Arrays.equals(this.managedTopic, other.getManagedTopic())));
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
        if (getManagedTopic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagedTopic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagedTopic(), i);
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
        new org.apache.axis.description.TypeDesc(ManagedTopics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ManagedTopics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedTopic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "managedTopic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ManagedTopic"));
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
