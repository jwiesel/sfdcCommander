/**
 * CustomDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomDataType  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CustomDataTypeComponent[] customDataTypeComponents;

    private java.lang.String description;

    private java.lang.String displayFormula;

    private java.lang.Boolean editComponentsOnSeparateLines;

    private java.lang.String label;

    private java.lang.Boolean rightAligned;

    private java.lang.Boolean supportComponentsInReports;

    public CustomDataType() {
    }

    public CustomDataType(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.CustomDataTypeComponent[] customDataTypeComponents,
           java.lang.String description,
           java.lang.String displayFormula,
           java.lang.Boolean editComponentsOnSeparateLines,
           java.lang.String label,
           java.lang.Boolean rightAligned,
           java.lang.Boolean supportComponentsInReports) {
        super(
            fullName);
        this.customDataTypeComponents = customDataTypeComponents;
        this.description = description;
        this.displayFormula = displayFormula;
        this.editComponentsOnSeparateLines = editComponentsOnSeparateLines;
        this.label = label;
        this.rightAligned = rightAligned;
        this.supportComponentsInReports = supportComponentsInReports;
    }


    /**
     * Gets the customDataTypeComponents value for this CustomDataType.
     * 
     * @return customDataTypeComponents
     */
    public com.sforce.soap._2006._04.metadata.CustomDataTypeComponent[] getCustomDataTypeComponents() {
        return customDataTypeComponents;
    }


    /**
     * Sets the customDataTypeComponents value for this CustomDataType.
     * 
     * @param customDataTypeComponents
     */
    public void setCustomDataTypeComponents(com.sforce.soap._2006._04.metadata.CustomDataTypeComponent[] customDataTypeComponents) {
        this.customDataTypeComponents = customDataTypeComponents;
    }

    public com.sforce.soap._2006._04.metadata.CustomDataTypeComponent getCustomDataTypeComponents(int i) {
        return this.customDataTypeComponents[i];
    }

    public void setCustomDataTypeComponents(int i, com.sforce.soap._2006._04.metadata.CustomDataTypeComponent _value) {
        this.customDataTypeComponents[i] = _value;
    }


    /**
     * Gets the description value for this CustomDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayFormula value for this CustomDataType.
     * 
     * @return displayFormula
     */
    public java.lang.String getDisplayFormula() {
        return displayFormula;
    }


    /**
     * Sets the displayFormula value for this CustomDataType.
     * 
     * @param displayFormula
     */
    public void setDisplayFormula(java.lang.String displayFormula) {
        this.displayFormula = displayFormula;
    }


    /**
     * Gets the editComponentsOnSeparateLines value for this CustomDataType.
     * 
     * @return editComponentsOnSeparateLines
     */
    public java.lang.Boolean getEditComponentsOnSeparateLines() {
        return editComponentsOnSeparateLines;
    }


    /**
     * Sets the editComponentsOnSeparateLines value for this CustomDataType.
     * 
     * @param editComponentsOnSeparateLines
     */
    public void setEditComponentsOnSeparateLines(java.lang.Boolean editComponentsOnSeparateLines) {
        this.editComponentsOnSeparateLines = editComponentsOnSeparateLines;
    }


    /**
     * Gets the label value for this CustomDataType.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CustomDataType.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the rightAligned value for this CustomDataType.
     * 
     * @return rightAligned
     */
    public java.lang.Boolean getRightAligned() {
        return rightAligned;
    }


    /**
     * Sets the rightAligned value for this CustomDataType.
     * 
     * @param rightAligned
     */
    public void setRightAligned(java.lang.Boolean rightAligned) {
        this.rightAligned = rightAligned;
    }


    /**
     * Gets the supportComponentsInReports value for this CustomDataType.
     * 
     * @return supportComponentsInReports
     */
    public java.lang.Boolean getSupportComponentsInReports() {
        return supportComponentsInReports;
    }


    /**
     * Sets the supportComponentsInReports value for this CustomDataType.
     * 
     * @param supportComponentsInReports
     */
    public void setSupportComponentsInReports(java.lang.Boolean supportComponentsInReports) {
        this.supportComponentsInReports = supportComponentsInReports;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomDataType)) return false;
        CustomDataType other = (CustomDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customDataTypeComponents==null && other.getCustomDataTypeComponents()==null) || 
             (this.customDataTypeComponents!=null &&
              java.util.Arrays.equals(this.customDataTypeComponents, other.getCustomDataTypeComponents()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayFormula==null && other.getDisplayFormula()==null) || 
             (this.displayFormula!=null &&
              this.displayFormula.equals(other.getDisplayFormula()))) &&
            ((this.editComponentsOnSeparateLines==null && other.getEditComponentsOnSeparateLines()==null) || 
             (this.editComponentsOnSeparateLines!=null &&
              this.editComponentsOnSeparateLines.equals(other.getEditComponentsOnSeparateLines()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.rightAligned==null && other.getRightAligned()==null) || 
             (this.rightAligned!=null &&
              this.rightAligned.equals(other.getRightAligned()))) &&
            ((this.supportComponentsInReports==null && other.getSupportComponentsInReports()==null) || 
             (this.supportComponentsInReports!=null &&
              this.supportComponentsInReports.equals(other.getSupportComponentsInReports())));
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
        if (getCustomDataTypeComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomDataTypeComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomDataTypeComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayFormula() != null) {
            _hashCode += getDisplayFormula().hashCode();
        }
        if (getEditComponentsOnSeparateLines() != null) {
            _hashCode += getEditComponentsOnSeparateLines().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getRightAligned() != null) {
            _hashCode += getRightAligned().hashCode();
        }
        if (getSupportComponentsInReports() != null) {
            _hashCode += getSupportComponentsInReports().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDataTypeComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customDataTypeComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataTypeComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editComponentsOnSeparateLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "editComponentsOnSeparateLines"));
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
        elemField.setFieldName("rightAligned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rightAligned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportComponentsInReports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "supportComponentsInReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
