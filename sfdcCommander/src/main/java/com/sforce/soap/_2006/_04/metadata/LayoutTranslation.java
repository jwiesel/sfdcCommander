/**
 * LayoutTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LayoutTranslation  implements java.io.Serializable {
    private java.lang.String layout;

    private java.lang.String layoutType;

    private com.sforce.soap._2006._04.metadata.LayoutSectionTranslation[] sections;

    public LayoutTranslation() {
    }

    public LayoutTranslation(
           java.lang.String layout,
           java.lang.String layoutType,
           com.sforce.soap._2006._04.metadata.LayoutSectionTranslation[] sections) {
           this.layout = layout;
           this.layoutType = layoutType;
           this.sections = sections;
    }


    /**
     * Gets the layout value for this LayoutTranslation.
     * 
     * @return layout
     */
    public java.lang.String getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this LayoutTranslation.
     * 
     * @param layout
     */
    public void setLayout(java.lang.String layout) {
        this.layout = layout;
    }


    /**
     * Gets the layoutType value for this LayoutTranslation.
     * 
     * @return layoutType
     */
    public java.lang.String getLayoutType() {
        return layoutType;
    }


    /**
     * Sets the layoutType value for this LayoutTranslation.
     * 
     * @param layoutType
     */
    public void setLayoutType(java.lang.String layoutType) {
        this.layoutType = layoutType;
    }


    /**
     * Gets the sections value for this LayoutTranslation.
     * 
     * @return sections
     */
    public com.sforce.soap._2006._04.metadata.LayoutSectionTranslation[] getSections() {
        return sections;
    }


    /**
     * Sets the sections value for this LayoutTranslation.
     * 
     * @param sections
     */
    public void setSections(com.sforce.soap._2006._04.metadata.LayoutSectionTranslation[] sections) {
        this.sections = sections;
    }

    public com.sforce.soap._2006._04.metadata.LayoutSectionTranslation getSections(int i) {
        return this.sections[i];
    }

    public void setSections(int i, com.sforce.soap._2006._04.metadata.LayoutSectionTranslation _value) {
        this.sections[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LayoutTranslation)) return false;
        LayoutTranslation other = (LayoutTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout()))) &&
            ((this.layoutType==null && other.getLayoutType()==null) || 
             (this.layoutType!=null &&
              this.layoutType.equals(other.getLayoutType()))) &&
            ((this.sections==null && other.getSections()==null) || 
             (this.sections!=null &&
              java.util.Arrays.equals(this.sections, other.getSections())));
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
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        if (getLayoutType() != null) {
            _hashCode += getLayoutType().hashCode();
        }
        if (getSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSections(), i);
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
        new org.apache.axis.description.TypeDesc(LayoutTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutSectionTranslation"));
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
