/**
 * QuickActionLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class QuickActionLayout  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.LayoutSectionStyle layoutSectionStyle;

    private com.sforce.soap._2006._04.metadata.QuickActionLayoutItem[][] quickActionLayoutColumns;

    public QuickActionLayout() {
    }

    public QuickActionLayout(
           com.sforce.soap._2006._04.metadata.LayoutSectionStyle layoutSectionStyle,
           com.sforce.soap._2006._04.metadata.QuickActionLayoutItem[][] quickActionLayoutColumns) {
           this.layoutSectionStyle = layoutSectionStyle;
           this.quickActionLayoutColumns = quickActionLayoutColumns;
    }


    /**
     * Gets the layoutSectionStyle value for this QuickActionLayout.
     * 
     * @return layoutSectionStyle
     */
    public com.sforce.soap._2006._04.metadata.LayoutSectionStyle getLayoutSectionStyle() {
        return layoutSectionStyle;
    }


    /**
     * Sets the layoutSectionStyle value for this QuickActionLayout.
     * 
     * @param layoutSectionStyle
     */
    public void setLayoutSectionStyle(com.sforce.soap._2006._04.metadata.LayoutSectionStyle layoutSectionStyle) {
        this.layoutSectionStyle = layoutSectionStyle;
    }


    /**
     * Gets the quickActionLayoutColumns value for this QuickActionLayout.
     * 
     * @return quickActionLayoutColumns
     */
    public com.sforce.soap._2006._04.metadata.QuickActionLayoutItem[][] getQuickActionLayoutColumns() {
        return quickActionLayoutColumns;
    }


    /**
     * Sets the quickActionLayoutColumns value for this QuickActionLayout.
     * 
     * @param quickActionLayoutColumns
     */
    public void setQuickActionLayoutColumns(com.sforce.soap._2006._04.metadata.QuickActionLayoutItem[][] quickActionLayoutColumns) {
        this.quickActionLayoutColumns = quickActionLayoutColumns;
    }

    public com.sforce.soap._2006._04.metadata.QuickActionLayoutItem[] getQuickActionLayoutColumns(int i) {
        return this.quickActionLayoutColumns[i];
    }

    public void setQuickActionLayoutColumns(int i, com.sforce.soap._2006._04.metadata.QuickActionLayoutItem[] _value) {
        this.quickActionLayoutColumns[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuickActionLayout)) return false;
        QuickActionLayout other = (QuickActionLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.layoutSectionStyle==null && other.getLayoutSectionStyle()==null) || 
             (this.layoutSectionStyle!=null &&
              this.layoutSectionStyle.equals(other.getLayoutSectionStyle()))) &&
            ((this.quickActionLayoutColumns==null && other.getQuickActionLayoutColumns()==null) || 
             (this.quickActionLayoutColumns!=null &&
              java.util.Arrays.equals(this.quickActionLayoutColumns, other.getQuickActionLayoutColumns())));
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
        if (getLayoutSectionStyle() != null) {
            _hashCode += getLayoutSectionStyle().hashCode();
        }
        if (getQuickActionLayoutColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuickActionLayoutColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuickActionLayoutColumns(), i);
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
        new org.apache.axis.description.TypeDesc(QuickActionLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutSectionStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layoutSectionStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutSectionStyle"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionLayoutColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionLayoutColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayoutColumn"));
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
