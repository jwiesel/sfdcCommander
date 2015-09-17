/**
 * PathAssistantStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PathAssistantStep  implements java.io.Serializable {
    private java.lang.String[] fieldNames;

    private java.lang.String info;

    private java.lang.String picklistValueName;

    public PathAssistantStep() {
    }

    public PathAssistantStep(
           java.lang.String[] fieldNames,
           java.lang.String info,
           java.lang.String picklistValueName) {
           this.fieldNames = fieldNames;
           this.info = info;
           this.picklistValueName = picklistValueName;
    }


    /**
     * Gets the fieldNames value for this PathAssistantStep.
     * 
     * @return fieldNames
     */
    public java.lang.String[] getFieldNames() {
        return fieldNames;
    }


    /**
     * Sets the fieldNames value for this PathAssistantStep.
     * 
     * @param fieldNames
     */
    public void setFieldNames(java.lang.String[] fieldNames) {
        this.fieldNames = fieldNames;
    }

    public java.lang.String getFieldNames(int i) {
        return this.fieldNames[i];
    }

    public void setFieldNames(int i, java.lang.String _value) {
        this.fieldNames[i] = _value;
    }


    /**
     * Gets the info value for this PathAssistantStep.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this PathAssistantStep.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the picklistValueName value for this PathAssistantStep.
     * 
     * @return picklistValueName
     */
    public java.lang.String getPicklistValueName() {
        return picklistValueName;
    }


    /**
     * Sets the picklistValueName value for this PathAssistantStep.
     * 
     * @param picklistValueName
     */
    public void setPicklistValueName(java.lang.String picklistValueName) {
        this.picklistValueName = picklistValueName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PathAssistantStep)) return false;
        PathAssistantStep other = (PathAssistantStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldNames==null && other.getFieldNames()==null) || 
             (this.fieldNames!=null &&
              java.util.Arrays.equals(this.fieldNames, other.getFieldNames()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.picklistValueName==null && other.getPicklistValueName()==null) || 
             (this.picklistValueName!=null &&
              this.picklistValueName.equals(other.getPicklistValueName())));
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
        if (getFieldNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getPicklistValueName() != null) {
            _hashCode += getPicklistValueName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PathAssistantStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PathAssistantStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklistValueName"));
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
