/**
 * Container.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Container  implements java.io.Serializable {
    private java.lang.Integer height;

    private boolean isContainerAutoSizeEnabled;

    private java.lang.String region;

    private com.sforce.soap._2006._04.metadata.SidebarComponent[] sidebarComponents;

    private java.lang.String style;

    private java.lang.String unit;

    private java.lang.Integer width;

    public Container() {
    }

    public Container(
           java.lang.Integer height,
           boolean isContainerAutoSizeEnabled,
           java.lang.String region,
           com.sforce.soap._2006._04.metadata.SidebarComponent[] sidebarComponents,
           java.lang.String style,
           java.lang.String unit,
           java.lang.Integer width) {
           this.height = height;
           this.isContainerAutoSizeEnabled = isContainerAutoSizeEnabled;
           this.region = region;
           this.sidebarComponents = sidebarComponents;
           this.style = style;
           this.unit = unit;
           this.width = width;
    }


    /**
     * Gets the height value for this Container.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this Container.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the isContainerAutoSizeEnabled value for this Container.
     * 
     * @return isContainerAutoSizeEnabled
     */
    public boolean isIsContainerAutoSizeEnabled() {
        return isContainerAutoSizeEnabled;
    }


    /**
     * Sets the isContainerAutoSizeEnabled value for this Container.
     * 
     * @param isContainerAutoSizeEnabled
     */
    public void setIsContainerAutoSizeEnabled(boolean isContainerAutoSizeEnabled) {
        this.isContainerAutoSizeEnabled = isContainerAutoSizeEnabled;
    }


    /**
     * Gets the region value for this Container.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Container.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the sidebarComponents value for this Container.
     * 
     * @return sidebarComponents
     */
    public com.sforce.soap._2006._04.metadata.SidebarComponent[] getSidebarComponents() {
        return sidebarComponents;
    }


    /**
     * Sets the sidebarComponents value for this Container.
     * 
     * @param sidebarComponents
     */
    public void setSidebarComponents(com.sforce.soap._2006._04.metadata.SidebarComponent[] sidebarComponents) {
        this.sidebarComponents = sidebarComponents;
    }

    public com.sforce.soap._2006._04.metadata.SidebarComponent getSidebarComponents(int i) {
        return this.sidebarComponents[i];
    }

    public void setSidebarComponents(int i, com.sforce.soap._2006._04.metadata.SidebarComponent _value) {
        this.sidebarComponents[i] = _value;
    }


    /**
     * Gets the style value for this Container.
     * 
     * @return style
     */
    public java.lang.String getStyle() {
        return style;
    }


    /**
     * Sets the style value for this Container.
     * 
     * @param style
     */
    public void setStyle(java.lang.String style) {
        this.style = style;
    }


    /**
     * Gets the unit value for this Container.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Container.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the width value for this Container.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Container.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Container)) return false;
        Container other = (Container) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            this.isContainerAutoSizeEnabled == other.isIsContainerAutoSizeEnabled() &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.sidebarComponents==null && other.getSidebarComponents()==null) || 
             (this.sidebarComponents!=null &&
              java.util.Arrays.equals(this.sidebarComponents, other.getSidebarComponents()))) &&
            ((this.style==null && other.getStyle()==null) || 
             (this.style!=null &&
              this.style.equals(other.getStyle()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        _hashCode += (isIsContainerAutoSizeEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getSidebarComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSidebarComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSidebarComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStyle() != null) {
            _hashCode += getStyle().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Container.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Container"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isContainerAutoSizeEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isContainerAutoSizeEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidebarComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sidebarComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SidebarComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
