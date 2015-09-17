/**
 * LayoutSection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LayoutSection  implements java.io.Serializable {
    private java.lang.Boolean customLabel;

    private java.lang.Boolean detailHeading;

    private java.lang.Boolean editHeading;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.LayoutColumn[] layoutColumns;

    private com.sforce.soap._2006._04.metadata.LayoutSectionStyle style;

    public LayoutSection() {
    }

    public LayoutSection(
           java.lang.Boolean customLabel,
           java.lang.Boolean detailHeading,
           java.lang.Boolean editHeading,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.LayoutColumn[] layoutColumns,
           com.sforce.soap._2006._04.metadata.LayoutSectionStyle style) {
           this.customLabel = customLabel;
           this.detailHeading = detailHeading;
           this.editHeading = editHeading;
           this.label = label;
           this.layoutColumns = layoutColumns;
           this.style = style;
    }


    /**
     * Gets the customLabel value for this LayoutSection.
     * 
     * @return customLabel
     */
    public java.lang.Boolean getCustomLabel() {
        return customLabel;
    }


    /**
     * Sets the customLabel value for this LayoutSection.
     * 
     * @param customLabel
     */
    public void setCustomLabel(java.lang.Boolean customLabel) {
        this.customLabel = customLabel;
    }


    /**
     * Gets the detailHeading value for this LayoutSection.
     * 
     * @return detailHeading
     */
    public java.lang.Boolean getDetailHeading() {
        return detailHeading;
    }


    /**
     * Sets the detailHeading value for this LayoutSection.
     * 
     * @param detailHeading
     */
    public void setDetailHeading(java.lang.Boolean detailHeading) {
        this.detailHeading = detailHeading;
    }


    /**
     * Gets the editHeading value for this LayoutSection.
     * 
     * @return editHeading
     */
    public java.lang.Boolean getEditHeading() {
        return editHeading;
    }


    /**
     * Sets the editHeading value for this LayoutSection.
     * 
     * @param editHeading
     */
    public void setEditHeading(java.lang.Boolean editHeading) {
        this.editHeading = editHeading;
    }


    /**
     * Gets the label value for this LayoutSection.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this LayoutSection.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the layoutColumns value for this LayoutSection.
     * 
     * @return layoutColumns
     */
    public com.sforce.soap._2006._04.metadata.LayoutColumn[] getLayoutColumns() {
        return layoutColumns;
    }


    /**
     * Sets the layoutColumns value for this LayoutSection.
     * 
     * @param layoutColumns
     */
    public void setLayoutColumns(com.sforce.soap._2006._04.metadata.LayoutColumn[] layoutColumns) {
        this.layoutColumns = layoutColumns;
    }

    public com.sforce.soap._2006._04.metadata.LayoutColumn getLayoutColumns(int i) {
        return this.layoutColumns[i];
    }

    public void setLayoutColumns(int i, com.sforce.soap._2006._04.metadata.LayoutColumn _value) {
        this.layoutColumns[i] = _value;
    }


    /**
     * Gets the style value for this LayoutSection.
     * 
     * @return style
     */
    public com.sforce.soap._2006._04.metadata.LayoutSectionStyle getStyle() {
        return style;
    }


    /**
     * Sets the style value for this LayoutSection.
     * 
     * @param style
     */
    public void setStyle(com.sforce.soap._2006._04.metadata.LayoutSectionStyle style) {
        this.style = style;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LayoutSection)) return false;
        LayoutSection other = (LayoutSection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customLabel==null && other.getCustomLabel()==null) || 
             (this.customLabel!=null &&
              this.customLabel.equals(other.getCustomLabel()))) &&
            ((this.detailHeading==null && other.getDetailHeading()==null) || 
             (this.detailHeading!=null &&
              this.detailHeading.equals(other.getDetailHeading()))) &&
            ((this.editHeading==null && other.getEditHeading()==null) || 
             (this.editHeading!=null &&
              this.editHeading.equals(other.getEditHeading()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.layoutColumns==null && other.getLayoutColumns()==null) || 
             (this.layoutColumns!=null &&
              java.util.Arrays.equals(this.layoutColumns, other.getLayoutColumns()))) &&
            ((this.style==null && other.getStyle()==null) || 
             (this.style!=null &&
              this.style.equals(other.getStyle())));
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
        if (getCustomLabel() != null) {
            _hashCode += getCustomLabel().hashCode();
        }
        if (getDetailHeading() != null) {
            _hashCode += getDetailHeading().hashCode();
        }
        if (getEditHeading() != null) {
            _hashCode += getEditHeading().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLayoutColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayoutColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLayoutColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStyle() != null) {
            _hashCode += getStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LayoutSection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutSection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailHeading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "detailHeading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editHeading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "editHeading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layoutColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutSectionStyle"));
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
