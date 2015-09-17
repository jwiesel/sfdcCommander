/**
 * GetUpdatedResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class GetUpdatedResult  implements java.io.Serializable {
    private java.lang.String[] ids;

    private java.util.Calendar latestDateCovered;

    public GetUpdatedResult() {
    }

    public GetUpdatedResult(
           java.lang.String[] ids,
           java.util.Calendar latestDateCovered) {
           this.ids = ids;
           this.latestDateCovered = latestDateCovered;
    }


    /**
     * Gets the ids value for this GetUpdatedResult.
     * 
     * @return ids
     */
    public java.lang.String[] getIds() {
        return ids;
    }


    /**
     * Sets the ids value for this GetUpdatedResult.
     * 
     * @param ids
     */
    public void setIds(java.lang.String[] ids) {
        this.ids = ids;
    }

    public java.lang.String getIds(int i) {
        return this.ids[i];
    }

    public void setIds(int i, java.lang.String _value) {
        this.ids[i] = _value;
    }


    /**
     * Gets the latestDateCovered value for this GetUpdatedResult.
     * 
     * @return latestDateCovered
     */
    public java.util.Calendar getLatestDateCovered() {
        return latestDateCovered;
    }


    /**
     * Sets the latestDateCovered value for this GetUpdatedResult.
     * 
     * @param latestDateCovered
     */
    public void setLatestDateCovered(java.util.Calendar latestDateCovered) {
        this.latestDateCovered = latestDateCovered;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUpdatedResult)) return false;
        GetUpdatedResult other = (GetUpdatedResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ids==null && other.getIds()==null) || 
             (this.ids!=null &&
              java.util.Arrays.equals(this.ids, other.getIds()))) &&
            ((this.latestDateCovered==null && other.getLatestDateCovered()==null) || 
             (this.latestDateCovered!=null &&
              this.latestDateCovered.equals(other.getLatestDateCovered())));
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
        if (getIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLatestDateCovered() != null) {
            _hashCode += getLatestDateCovered().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUpdatedResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetUpdatedResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestDateCovered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "latestDateCovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
