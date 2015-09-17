/**
 * Queue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Queue  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean doesSendEmailToMembers;

    private java.lang.String email;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.QueueSobject[] queueSobject;

    public Queue() {
    }

    public Queue(
           java.lang.String fullName,
           java.lang.Boolean doesSendEmailToMembers,
           java.lang.String email,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.QueueSobject[] queueSobject) {
        super(
            fullName);
        this.doesSendEmailToMembers = doesSendEmailToMembers;
        this.email = email;
        this.name = name;
        this.queueSobject = queueSobject;
    }


    /**
     * Gets the doesSendEmailToMembers value for this Queue.
     * 
     * @return doesSendEmailToMembers
     */
    public java.lang.Boolean getDoesSendEmailToMembers() {
        return doesSendEmailToMembers;
    }


    /**
     * Sets the doesSendEmailToMembers value for this Queue.
     * 
     * @param doesSendEmailToMembers
     */
    public void setDoesSendEmailToMembers(java.lang.Boolean doesSendEmailToMembers) {
        this.doesSendEmailToMembers = doesSendEmailToMembers;
    }


    /**
     * Gets the email value for this Queue.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Queue.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the name value for this Queue.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Queue.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the queueSobject value for this Queue.
     * 
     * @return queueSobject
     */
    public com.sforce.soap._2006._04.metadata.QueueSobject[] getQueueSobject() {
        return queueSobject;
    }


    /**
     * Sets the queueSobject value for this Queue.
     * 
     * @param queueSobject
     */
    public void setQueueSobject(com.sforce.soap._2006._04.metadata.QueueSobject[] queueSobject) {
        this.queueSobject = queueSobject;
    }

    public com.sforce.soap._2006._04.metadata.QueueSobject getQueueSobject(int i) {
        return this.queueSobject[i];
    }

    public void setQueueSobject(int i, com.sforce.soap._2006._04.metadata.QueueSobject _value) {
        this.queueSobject[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Queue)) return false;
        Queue other = (Queue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doesSendEmailToMembers==null && other.getDoesSendEmailToMembers()==null) || 
             (this.doesSendEmailToMembers!=null &&
              this.doesSendEmailToMembers.equals(other.getDoesSendEmailToMembers()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.queueSobject==null && other.getQueueSobject()==null) || 
             (this.queueSobject!=null &&
              java.util.Arrays.equals(this.queueSobject, other.getQueueSobject())));
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
        if (getDoesSendEmailToMembers() != null) {
            _hashCode += getDoesSendEmailToMembers().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getQueueSobject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueueSobject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueueSobject(), i);
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
        new org.apache.axis.description.TypeDesc(Queue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Queue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doesSendEmailToMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "doesSendEmailToMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueSobject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "queueSobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QueueSobject"));
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
