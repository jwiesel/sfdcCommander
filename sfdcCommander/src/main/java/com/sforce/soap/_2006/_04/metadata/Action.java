/**
 * Action.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Action  implements java.io.Serializable {
    private boolean block;

    private boolean endSession;

    private com.sforce.soap._2006._04.metadata.Notification[] notifications;

    private boolean twoFactorAuthentication;

    public Action() {
    }

    public Action(
           boolean block,
           boolean endSession,
           com.sforce.soap._2006._04.metadata.Notification[] notifications,
           boolean twoFactorAuthentication) {
           this.block = block;
           this.endSession = endSession;
           this.notifications = notifications;
           this.twoFactorAuthentication = twoFactorAuthentication;
    }


    /**
     * Gets the block value for this Action.
     * 
     * @return block
     */
    public boolean isBlock() {
        return block;
    }


    /**
     * Sets the block value for this Action.
     * 
     * @param block
     */
    public void setBlock(boolean block) {
        this.block = block;
    }


    /**
     * Gets the endSession value for this Action.
     * 
     * @return endSession
     */
    public boolean isEndSession() {
        return endSession;
    }


    /**
     * Sets the endSession value for this Action.
     * 
     * @param endSession
     */
    public void setEndSession(boolean endSession) {
        this.endSession = endSession;
    }


    /**
     * Gets the notifications value for this Action.
     * 
     * @return notifications
     */
    public com.sforce.soap._2006._04.metadata.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this Action.
     * 
     * @param notifications
     */
    public void setNotifications(com.sforce.soap._2006._04.metadata.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.sforce.soap._2006._04.metadata.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.sforce.soap._2006._04.metadata.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the twoFactorAuthentication value for this Action.
     * 
     * @return twoFactorAuthentication
     */
    public boolean isTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }


    /**
     * Sets the twoFactorAuthentication value for this Action.
     * 
     * @param twoFactorAuthentication
     */
    public void setTwoFactorAuthentication(boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Action)) return false;
        Action other = (Action) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.block == other.isBlock() &&
            this.endSession == other.isEndSession() &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            this.twoFactorAuthentication == other.isTwoFactorAuthentication();
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
        _hashCode += (isBlock() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEndSession() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isTwoFactorAuthentication() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Action.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Action"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("block");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endSession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "endSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twoFactorAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "twoFactorAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
