/**
 * RecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class RecordType  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean active;

    private java.lang.String businessProcess;

    private java.lang.String compactLayoutAssignment;

    private java.lang.String description;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.RecordTypePicklistValue[] picklistValues;

    public RecordType() {
    }

    public RecordType(
           java.lang.String fullName,
           boolean active,
           java.lang.String businessProcess,
           java.lang.String compactLayoutAssignment,
           java.lang.String description,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.RecordTypePicklistValue[] picklistValues) {
        super(
            fullName);
        this.active = active;
        this.businessProcess = businessProcess;
        this.compactLayoutAssignment = compactLayoutAssignment;
        this.description = description;
        this.label = label;
        this.picklistValues = picklistValues;
    }


    /**
     * Gets the active value for this RecordType.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this RecordType.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the businessProcess value for this RecordType.
     * 
     * @return businessProcess
     */
    public java.lang.String getBusinessProcess() {
        return businessProcess;
    }


    /**
     * Sets the businessProcess value for this RecordType.
     * 
     * @param businessProcess
     */
    public void setBusinessProcess(java.lang.String businessProcess) {
        this.businessProcess = businessProcess;
    }


    /**
     * Gets the compactLayoutAssignment value for this RecordType.
     * 
     * @return compactLayoutAssignment
     */
    public java.lang.String getCompactLayoutAssignment() {
        return compactLayoutAssignment;
    }


    /**
     * Sets the compactLayoutAssignment value for this RecordType.
     * 
     * @param compactLayoutAssignment
     */
    public void setCompactLayoutAssignment(java.lang.String compactLayoutAssignment) {
        this.compactLayoutAssignment = compactLayoutAssignment;
    }


    /**
     * Gets the description value for this RecordType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RecordType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the label value for this RecordType.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this RecordType.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the picklistValues value for this RecordType.
     * 
     * @return picklistValues
     */
    public com.sforce.soap._2006._04.metadata.RecordTypePicklistValue[] getPicklistValues() {
        return picklistValues;
    }


    /**
     * Sets the picklistValues value for this RecordType.
     * 
     * @param picklistValues
     */
    public void setPicklistValues(com.sforce.soap._2006._04.metadata.RecordTypePicklistValue[] picklistValues) {
        this.picklistValues = picklistValues;
    }

    public com.sforce.soap._2006._04.metadata.RecordTypePicklistValue getPicklistValues(int i) {
        return this.picklistValues[i];
    }

    public void setPicklistValues(int i, com.sforce.soap._2006._04.metadata.RecordTypePicklistValue _value) {
        this.picklistValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordType)) return false;
        RecordType other = (RecordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            ((this.businessProcess==null && other.getBusinessProcess()==null) || 
             (this.businessProcess!=null &&
              this.businessProcess.equals(other.getBusinessProcess()))) &&
            ((this.compactLayoutAssignment==null && other.getCompactLayoutAssignment()==null) || 
             (this.compactLayoutAssignment!=null &&
              this.compactLayoutAssignment.equals(other.getCompactLayoutAssignment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.picklistValues==null && other.getPicklistValues()==null) || 
             (this.picklistValues!=null &&
              java.util.Arrays.equals(this.picklistValues, other.getPicklistValues())));
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
        if (getBusinessProcess() != null) {
            _hashCode += getBusinessProcess().hashCode();
        }
        if (getCompactLayoutAssignment() != null) {
            _hashCode += getCompactLayoutAssignment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getPicklistValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicklistValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicklistValues(), i);
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
        new org.apache.axis.description.TypeDesc(RecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "businessProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compactLayoutAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "compactLayoutAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklistValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordTypePicklistValue"));
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
