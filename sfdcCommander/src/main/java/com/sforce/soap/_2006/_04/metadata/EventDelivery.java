/**
 * EventDelivery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EventDelivery  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.EventParameterMap[] eventParameters;

    private java.lang.String eventSubscription;

    private java.lang.String referenceData;

    private com.sforce.soap._2006._04.metadata.EventDeliveryType type;

    public EventDelivery() {
    }

    public EventDelivery(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.EventParameterMap[] eventParameters,
           java.lang.String eventSubscription,
           java.lang.String referenceData,
           com.sforce.soap._2006._04.metadata.EventDeliveryType type) {
        super(
            fullName);
        this.eventParameters = eventParameters;
        this.eventSubscription = eventSubscription;
        this.referenceData = referenceData;
        this.type = type;
    }


    /**
     * Gets the eventParameters value for this EventDelivery.
     * 
     * @return eventParameters
     */
    public com.sforce.soap._2006._04.metadata.EventParameterMap[] getEventParameters() {
        return eventParameters;
    }


    /**
     * Sets the eventParameters value for this EventDelivery.
     * 
     * @param eventParameters
     */
    public void setEventParameters(com.sforce.soap._2006._04.metadata.EventParameterMap[] eventParameters) {
        this.eventParameters = eventParameters;
    }

    public com.sforce.soap._2006._04.metadata.EventParameterMap getEventParameters(int i) {
        return this.eventParameters[i];
    }

    public void setEventParameters(int i, com.sforce.soap._2006._04.metadata.EventParameterMap _value) {
        this.eventParameters[i] = _value;
    }


    /**
     * Gets the eventSubscription value for this EventDelivery.
     * 
     * @return eventSubscription
     */
    public java.lang.String getEventSubscription() {
        return eventSubscription;
    }


    /**
     * Sets the eventSubscription value for this EventDelivery.
     * 
     * @param eventSubscription
     */
    public void setEventSubscription(java.lang.String eventSubscription) {
        this.eventSubscription = eventSubscription;
    }


    /**
     * Gets the referenceData value for this EventDelivery.
     * 
     * @return referenceData
     */
    public java.lang.String getReferenceData() {
        return referenceData;
    }


    /**
     * Sets the referenceData value for this EventDelivery.
     * 
     * @param referenceData
     */
    public void setReferenceData(java.lang.String referenceData) {
        this.referenceData = referenceData;
    }


    /**
     * Gets the type value for this EventDelivery.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.EventDeliveryType getType() {
        return type;
    }


    /**
     * Sets the type value for this EventDelivery.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.EventDeliveryType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventDelivery)) return false;
        EventDelivery other = (EventDelivery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventParameters==null && other.getEventParameters()==null) || 
             (this.eventParameters!=null &&
              java.util.Arrays.equals(this.eventParameters, other.getEventParameters()))) &&
            ((this.eventSubscription==null && other.getEventSubscription()==null) || 
             (this.eventSubscription!=null &&
              this.eventSubscription.equals(other.getEventSubscription()))) &&
            ((this.referenceData==null && other.getReferenceData()==null) || 
             (this.referenceData!=null &&
              this.referenceData.equals(other.getReferenceData()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getEventParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventSubscription() != null) {
            _hashCode += getEventSubscription().hashCode();
        }
        if (getReferenceData() != null) {
            _hashCode += getReferenceData().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventDelivery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EventDelivery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "eventParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EventParameterMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventSubscription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "eventSubscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "referenceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EventDeliveryType"));
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
