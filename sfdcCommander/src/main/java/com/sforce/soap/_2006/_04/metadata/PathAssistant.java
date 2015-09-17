/**
 * PathAssistant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PathAssistant  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean active;

    private java.lang.String entityName;

    private java.lang.String fieldName;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.PathAssistantStep[] pathAssistantSteps;

    private java.lang.String recordTypeName;

    public PathAssistant() {
    }

    public PathAssistant(
           java.lang.String fullName,
           boolean active,
           java.lang.String entityName,
           java.lang.String fieldName,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.PathAssistantStep[] pathAssistantSteps,
           java.lang.String recordTypeName) {
        super(
            fullName);
        this.active = active;
        this.entityName = entityName;
        this.fieldName = fieldName;
        this.masterLabel = masterLabel;
        this.pathAssistantSteps = pathAssistantSteps;
        this.recordTypeName = recordTypeName;
    }


    /**
     * Gets the active value for this PathAssistant.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this PathAssistant.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the entityName value for this PathAssistant.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this PathAssistant.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the fieldName value for this PathAssistant.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this PathAssistant.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the masterLabel value for this PathAssistant.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this PathAssistant.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the pathAssistantSteps value for this PathAssistant.
     * 
     * @return pathAssistantSteps
     */
    public com.sforce.soap._2006._04.metadata.PathAssistantStep[] getPathAssistantSteps() {
        return pathAssistantSteps;
    }


    /**
     * Sets the pathAssistantSteps value for this PathAssistant.
     * 
     * @param pathAssistantSteps
     */
    public void setPathAssistantSteps(com.sforce.soap._2006._04.metadata.PathAssistantStep[] pathAssistantSteps) {
        this.pathAssistantSteps = pathAssistantSteps;
    }

    public com.sforce.soap._2006._04.metadata.PathAssistantStep getPathAssistantSteps(int i) {
        return this.pathAssistantSteps[i];
    }

    public void setPathAssistantSteps(int i, com.sforce.soap._2006._04.metadata.PathAssistantStep _value) {
        this.pathAssistantSteps[i] = _value;
    }


    /**
     * Gets the recordTypeName value for this PathAssistant.
     * 
     * @return recordTypeName
     */
    public java.lang.String getRecordTypeName() {
        return recordTypeName;
    }


    /**
     * Sets the recordTypeName value for this PathAssistant.
     * 
     * @param recordTypeName
     */
    public void setRecordTypeName(java.lang.String recordTypeName) {
        this.recordTypeName = recordTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PathAssistant)) return false;
        PathAssistant other = (PathAssistant) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.pathAssistantSteps==null && other.getPathAssistantSteps()==null) || 
             (this.pathAssistantSteps!=null &&
              java.util.Arrays.equals(this.pathAssistantSteps, other.getPathAssistantSteps()))) &&
            ((this.recordTypeName==null && other.getRecordTypeName()==null) || 
             (this.recordTypeName!=null &&
              this.recordTypeName.equals(other.getRecordTypeName())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getPathAssistantSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPathAssistantSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPathAssistantSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordTypeName() != null) {
            _hashCode += getRecordTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PathAssistant.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PathAssistant"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathAssistantSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pathAssistantSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PathAssistantStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordTypeName"));
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
