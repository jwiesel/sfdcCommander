/**
 * EmbeddedServiceQuickAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EmbeddedServiceQuickAction  implements java.io.Serializable {
    private java.lang.String embeddedServiceLiveAgent;

    private int order;

    private java.lang.String quickActionDefinition;

    public EmbeddedServiceQuickAction() {
    }

    public EmbeddedServiceQuickAction(
           java.lang.String embeddedServiceLiveAgent,
           int order,
           java.lang.String quickActionDefinition) {
           this.embeddedServiceLiveAgent = embeddedServiceLiveAgent;
           this.order = order;
           this.quickActionDefinition = quickActionDefinition;
    }


    /**
     * Gets the embeddedServiceLiveAgent value for this EmbeddedServiceQuickAction.
     * 
     * @return embeddedServiceLiveAgent
     */
    public java.lang.String getEmbeddedServiceLiveAgent() {
        return embeddedServiceLiveAgent;
    }


    /**
     * Sets the embeddedServiceLiveAgent value for this EmbeddedServiceQuickAction.
     * 
     * @param embeddedServiceLiveAgent
     */
    public void setEmbeddedServiceLiveAgent(java.lang.String embeddedServiceLiveAgent) {
        this.embeddedServiceLiveAgent = embeddedServiceLiveAgent;
    }


    /**
     * Gets the order value for this EmbeddedServiceQuickAction.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this EmbeddedServiceQuickAction.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * Gets the quickActionDefinition value for this EmbeddedServiceQuickAction.
     * 
     * @return quickActionDefinition
     */
    public java.lang.String getQuickActionDefinition() {
        return quickActionDefinition;
    }


    /**
     * Sets the quickActionDefinition value for this EmbeddedServiceQuickAction.
     * 
     * @param quickActionDefinition
     */
    public void setQuickActionDefinition(java.lang.String quickActionDefinition) {
        this.quickActionDefinition = quickActionDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmbeddedServiceQuickAction)) return false;
        EmbeddedServiceQuickAction other = (EmbeddedServiceQuickAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.embeddedServiceLiveAgent==null && other.getEmbeddedServiceLiveAgent()==null) || 
             (this.embeddedServiceLiveAgent!=null &&
              this.embeddedServiceLiveAgent.equals(other.getEmbeddedServiceLiveAgent()))) &&
            this.order == other.getOrder() &&
            ((this.quickActionDefinition==null && other.getQuickActionDefinition()==null) || 
             (this.quickActionDefinition!=null &&
              this.quickActionDefinition.equals(other.getQuickActionDefinition())));
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
        if (getEmbeddedServiceLiveAgent() != null) {
            _hashCode += getEmbeddedServiceLiveAgent().hashCode();
        }
        _hashCode += getOrder();
        if (getQuickActionDefinition() != null) {
            _hashCode += getQuickActionDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmbeddedServiceQuickAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmbeddedServiceQuickAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embeddedServiceLiveAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "embeddedServiceLiveAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionDefinition"));
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
