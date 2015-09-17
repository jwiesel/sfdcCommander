/**
 * RetrieveQuickActionTemplates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class RetrieveQuickActionTemplates  implements java.io.Serializable {
    private java.lang.String[] quickActionNames;

    private java.lang.String contextId;

    public RetrieveQuickActionTemplates() {
    }

    public RetrieveQuickActionTemplates(
           java.lang.String[] quickActionNames,
           java.lang.String contextId) {
           this.quickActionNames = quickActionNames;
           this.contextId = contextId;
    }


    /**
     * Gets the quickActionNames value for this RetrieveQuickActionTemplates.
     * 
     * @return quickActionNames
     */
    public java.lang.String[] getQuickActionNames() {
        return quickActionNames;
    }


    /**
     * Sets the quickActionNames value for this RetrieveQuickActionTemplates.
     * 
     * @param quickActionNames
     */
    public void setQuickActionNames(java.lang.String[] quickActionNames) {
        this.quickActionNames = quickActionNames;
    }

    public java.lang.String getQuickActionNames(int i) {
        return this.quickActionNames[i];
    }

    public void setQuickActionNames(int i, java.lang.String _value) {
        this.quickActionNames[i] = _value;
    }


    /**
     * Gets the contextId value for this RetrieveQuickActionTemplates.
     * 
     * @return contextId
     */
    public java.lang.String getContextId() {
        return contextId;
    }


    /**
     * Sets the contextId value for this RetrieveQuickActionTemplates.
     * 
     * @param contextId
     */
    public void setContextId(java.lang.String contextId) {
        this.contextId = contextId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveQuickActionTemplates)) return false;
        RetrieveQuickActionTemplates other = (RetrieveQuickActionTemplates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quickActionNames==null && other.getQuickActionNames()==null) || 
             (this.quickActionNames!=null &&
              java.util.Arrays.equals(this.quickActionNames, other.getQuickActionNames()))) &&
            ((this.contextId==null && other.getContextId()==null) || 
             (this.contextId!=null &&
              this.contextId.equals(other.getContextId())));
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
        if (getQuickActionNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuickActionNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuickActionNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContextId() != null) {
            _hashCode += getContextId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveQuickActionTemplates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">retrieveQuickActionTemplates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
