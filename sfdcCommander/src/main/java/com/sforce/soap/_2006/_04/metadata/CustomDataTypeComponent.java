/**
 * CustomDataTypeComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomDataTypeComponent  implements java.io.Serializable {
    private java.lang.String developerSuffix;

    private java.lang.Boolean enforceFieldRequiredness;

    private java.lang.String label;

    private java.lang.Integer length;

    private java.lang.Integer precision;

    private java.lang.Integer scale;

    private com.sforce.soap._2006._04.metadata.SortOrder sortOrder;

    private java.lang.Integer sortPriority;

    private com.sforce.soap._2006._04.metadata.FieldType type;

    public CustomDataTypeComponent() {
    }

    public CustomDataTypeComponent(
           java.lang.String developerSuffix,
           java.lang.Boolean enforceFieldRequiredness,
           java.lang.String label,
           java.lang.Integer length,
           java.lang.Integer precision,
           java.lang.Integer scale,
           com.sforce.soap._2006._04.metadata.SortOrder sortOrder,
           java.lang.Integer sortPriority,
           com.sforce.soap._2006._04.metadata.FieldType type) {
           this.developerSuffix = developerSuffix;
           this.enforceFieldRequiredness = enforceFieldRequiredness;
           this.label = label;
           this.length = length;
           this.precision = precision;
           this.scale = scale;
           this.sortOrder = sortOrder;
           this.sortPriority = sortPriority;
           this.type = type;
    }


    /**
     * Gets the developerSuffix value for this CustomDataTypeComponent.
     * 
     * @return developerSuffix
     */
    public java.lang.String getDeveloperSuffix() {
        return developerSuffix;
    }


    /**
     * Sets the developerSuffix value for this CustomDataTypeComponent.
     * 
     * @param developerSuffix
     */
    public void setDeveloperSuffix(java.lang.String developerSuffix) {
        this.developerSuffix = developerSuffix;
    }


    /**
     * Gets the enforceFieldRequiredness value for this CustomDataTypeComponent.
     * 
     * @return enforceFieldRequiredness
     */
    public java.lang.Boolean getEnforceFieldRequiredness() {
        return enforceFieldRequiredness;
    }


    /**
     * Sets the enforceFieldRequiredness value for this CustomDataTypeComponent.
     * 
     * @param enforceFieldRequiredness
     */
    public void setEnforceFieldRequiredness(java.lang.Boolean enforceFieldRequiredness) {
        this.enforceFieldRequiredness = enforceFieldRequiredness;
    }


    /**
     * Gets the label value for this CustomDataTypeComponent.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CustomDataTypeComponent.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the length value for this CustomDataTypeComponent.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this CustomDataTypeComponent.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the precision value for this CustomDataTypeComponent.
     * 
     * @return precision
     */
    public java.lang.Integer getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this CustomDataTypeComponent.
     * 
     * @param precision
     */
    public void setPrecision(java.lang.Integer precision) {
        this.precision = precision;
    }


    /**
     * Gets the scale value for this CustomDataTypeComponent.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this CustomDataTypeComponent.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the sortOrder value for this CustomDataTypeComponent.
     * 
     * @return sortOrder
     */
    public com.sforce.soap._2006._04.metadata.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this CustomDataTypeComponent.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the sortPriority value for this CustomDataTypeComponent.
     * 
     * @return sortPriority
     */
    public java.lang.Integer getSortPriority() {
        return sortPriority;
    }


    /**
     * Sets the sortPriority value for this CustomDataTypeComponent.
     * 
     * @param sortPriority
     */
    public void setSortPriority(java.lang.Integer sortPriority) {
        this.sortPriority = sortPriority;
    }


    /**
     * Gets the type value for this CustomDataTypeComponent.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.FieldType getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomDataTypeComponent.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.FieldType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomDataTypeComponent)) return false;
        CustomDataTypeComponent other = (CustomDataTypeComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.developerSuffix==null && other.getDeveloperSuffix()==null) || 
             (this.developerSuffix!=null &&
              this.developerSuffix.equals(other.getDeveloperSuffix()))) &&
            ((this.enforceFieldRequiredness==null && other.getEnforceFieldRequiredness()==null) || 
             (this.enforceFieldRequiredness!=null &&
              this.enforceFieldRequiredness.equals(other.getEnforceFieldRequiredness()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.precision==null && other.getPrecision()==null) || 
             (this.precision!=null &&
              this.precision.equals(other.getPrecision()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.sortPriority==null && other.getSortPriority()==null) || 
             (this.sortPriority!=null &&
              this.sortPriority.equals(other.getSortPriority()))) &&
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
        int _hashCode = 1;
        if (getDeveloperSuffix() != null) {
            _hashCode += getDeveloperSuffix().hashCode();
        }
        if (getEnforceFieldRequiredness() != null) {
            _hashCode += getEnforceFieldRequiredness().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getPrecision() != null) {
            _hashCode += getPrecision().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getSortPriority() != null) {
            _hashCode += getSortPriority().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomDataTypeComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataTypeComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "developerSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceFieldRequiredness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enforceFieldRequiredness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SortOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldType"));
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
