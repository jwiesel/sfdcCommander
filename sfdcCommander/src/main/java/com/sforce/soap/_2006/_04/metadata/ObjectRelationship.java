/**
 * ObjectRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ObjectRelationship  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ObjectRelationship join;

    private boolean outerJoin;

    private java.lang.String relationship;

    public ObjectRelationship() {
    }

    public ObjectRelationship(
           com.sforce.soap._2006._04.metadata.ObjectRelationship join,
           boolean outerJoin,
           java.lang.String relationship) {
           this.join = join;
           this.outerJoin = outerJoin;
           this.relationship = relationship;
    }


    /**
     * Gets the join value for this ObjectRelationship.
     * 
     * @return join
     */
    public com.sforce.soap._2006._04.metadata.ObjectRelationship getJoin() {
        return join;
    }


    /**
     * Sets the join value for this ObjectRelationship.
     * 
     * @param join
     */
    public void setJoin(com.sforce.soap._2006._04.metadata.ObjectRelationship join) {
        this.join = join;
    }


    /**
     * Gets the outerJoin value for this ObjectRelationship.
     * 
     * @return outerJoin
     */
    public boolean isOuterJoin() {
        return outerJoin;
    }


    /**
     * Sets the outerJoin value for this ObjectRelationship.
     * 
     * @param outerJoin
     */
    public void setOuterJoin(boolean outerJoin) {
        this.outerJoin = outerJoin;
    }


    /**
     * Gets the relationship value for this ObjectRelationship.
     * 
     * @return relationship
     */
    public java.lang.String getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this ObjectRelationship.
     * 
     * @param relationship
     */
    public void setRelationship(java.lang.String relationship) {
        this.relationship = relationship;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectRelationship)) return false;
        ObjectRelationship other = (ObjectRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.join==null && other.getJoin()==null) || 
             (this.join!=null &&
              this.join.equals(other.getJoin()))) &&
            this.outerJoin == other.isOuterJoin() &&
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              this.relationship.equals(other.getRelationship())));
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
        if (getJoin() != null) {
            _hashCode += getJoin().hashCode();
        }
        _hashCode += (isOuterJoin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRelationship() != null) {
            _hashCode += getRelationship().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("join");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "join"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectRelationship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relationship"));
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
