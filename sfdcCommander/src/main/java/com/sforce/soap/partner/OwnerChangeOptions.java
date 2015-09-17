/**
 * OwnerChangeOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class OwnerChangeOptions  implements java.io.Serializable {
    private boolean transferAttachments;

    private boolean transferOpenActivities;

    public OwnerChangeOptions() {
    }

    public OwnerChangeOptions(
           boolean transferAttachments,
           boolean transferOpenActivities) {
           this.transferAttachments = transferAttachments;
           this.transferOpenActivities = transferOpenActivities;
    }


    /**
     * Gets the transferAttachments value for this OwnerChangeOptions.
     * 
     * @return transferAttachments
     */
    public boolean isTransferAttachments() {
        return transferAttachments;
    }


    /**
     * Sets the transferAttachments value for this OwnerChangeOptions.
     * 
     * @param transferAttachments
     */
    public void setTransferAttachments(boolean transferAttachments) {
        this.transferAttachments = transferAttachments;
    }


    /**
     * Gets the transferOpenActivities value for this OwnerChangeOptions.
     * 
     * @return transferOpenActivities
     */
    public boolean isTransferOpenActivities() {
        return transferOpenActivities;
    }


    /**
     * Sets the transferOpenActivities value for this OwnerChangeOptions.
     * 
     * @param transferOpenActivities
     */
    public void setTransferOpenActivities(boolean transferOpenActivities) {
        this.transferOpenActivities = transferOpenActivities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OwnerChangeOptions)) return false;
        OwnerChangeOptions other = (OwnerChangeOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.transferAttachments == other.isTransferAttachments() &&
            this.transferOpenActivities == other.isTransferOpenActivities();
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
        _hashCode += (isTransferAttachments() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTransferOpenActivities() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OwnerChangeOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">OwnerChangeOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "transferAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOpenActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "transferOpenActivities"));
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
