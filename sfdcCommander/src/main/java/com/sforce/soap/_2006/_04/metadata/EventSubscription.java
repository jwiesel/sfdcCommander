/**
 * EventSubscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EventSubscription  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean active;

    private com.sforce.soap._2006._04.metadata.EventParameterMap[] eventParameters;

    private java.lang.String eventType;

    private java.lang.String referenceData;

    public EventSubscription() {
    }

    public EventSubscription(
           java.lang.String fullName,
           java.lang.Boolean active,
           com.sforce.soap._2006._04.metadata.EventParameterMap[] eventParameters,
           java.lang.String eventType,
           java.lang.String referenceData) {
        super(
            fullName);
        this.active = active;
        this.eventParameters = eventParameters;
        this.eventType = eventType;
        this.referenceData = referenceData;
    }


    /**
     * Gets the active value for this EventSubscription.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this EventSubscription.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the eventParameters value for this EventSubscription.
     * 
     * @return eventParameters
     */
    public com.sforce.soap._2006._04.metadata.EventParameterMap[] getEventParameters() {
        return eventParameters;
    }


    /**
     * Sets the eventParameters value for this EventSubscription.
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
     * Gets the eventType value for this EventSubscription.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this EventSubscription.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the referenceData value for this EventSubscription.
     * 
     * @return referenceData
     */
    public java.lang.String getReferenceData() {
        return referenceData;
    }


    /**
     * Sets the referenceData value for this EventSubscription.
     * 
     * @param referenceData
     */
    public void setReferenceData(java.lang.String referenceData) {
        this.referenceData = referenceData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventSubscription)) return false;
        EventSubscription other = (EventSubscription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.eventParameters==null && other.getEventParameters()==null) || 
             (this.eventParameters!=null &&
              java.util.Arrays.equals(this.eventParameters, other.getEventParameters()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.referenceData==null && other.getReferenceData()==null) || 
             (this.referenceData!=null &&
              this.referenceData.equals(other.getReferenceData())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
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
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getReferenceData() != null) {
            _hashCode += getReferenceData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventSubscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EventSubscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "eventParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EventParameterMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "referenceData"));
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
