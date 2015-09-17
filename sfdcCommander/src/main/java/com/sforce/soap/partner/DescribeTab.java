/**
 * DescribeTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeTab  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeColor[] colors;

    private boolean custom;

    private java.lang.String iconUrl;

    private com.sforce.soap.partner.DescribeIcon[] icons;

    private java.lang.String label;

    private java.lang.String miniIconUrl;

    private java.lang.String name;

    private java.lang.String sobjectName;

    private java.lang.String url;

    public DescribeTab() {
    }

    public DescribeTab(
           com.sforce.soap.partner.DescribeColor[] colors,
           boolean custom,
           java.lang.String iconUrl,
           com.sforce.soap.partner.DescribeIcon[] icons,
           java.lang.String label,
           java.lang.String miniIconUrl,
           java.lang.String name,
           java.lang.String sobjectName,
           java.lang.String url) {
           this.colors = colors;
           this.custom = custom;
           this.iconUrl = iconUrl;
           this.icons = icons;
           this.label = label;
           this.miniIconUrl = miniIconUrl;
           this.name = name;
           this.sobjectName = sobjectName;
           this.url = url;
    }


    /**
     * Gets the colors value for this DescribeTab.
     * 
     * @return colors
     */
    public com.sforce.soap.partner.DescribeColor[] getColors() {
        return colors;
    }


    /**
     * Sets the colors value for this DescribeTab.
     * 
     * @param colors
     */
    public void setColors(com.sforce.soap.partner.DescribeColor[] colors) {
        this.colors = colors;
    }

    public com.sforce.soap.partner.DescribeColor getColors(int i) {
        return this.colors[i];
    }

    public void setColors(int i, com.sforce.soap.partner.DescribeColor _value) {
        this.colors[i] = _value;
    }


    /**
     * Gets the custom value for this DescribeTab.
     * 
     * @return custom
     */
    public boolean isCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this DescribeTab.
     * 
     * @param custom
     */
    public void setCustom(boolean custom) {
        this.custom = custom;
    }


    /**
     * Gets the iconUrl value for this DescribeTab.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this DescribeTab.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the icons value for this DescribeTab.
     * 
     * @return icons
     */
    public com.sforce.soap.partner.DescribeIcon[] getIcons() {
        return icons;
    }


    /**
     * Sets the icons value for this DescribeTab.
     * 
     * @param icons
     */
    public void setIcons(com.sforce.soap.partner.DescribeIcon[] icons) {
        this.icons = icons;
    }

    public com.sforce.soap.partner.DescribeIcon getIcons(int i) {
        return this.icons[i];
    }

    public void setIcons(int i, com.sforce.soap.partner.DescribeIcon _value) {
        this.icons[i] = _value;
    }


    /**
     * Gets the label value for this DescribeTab.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeTab.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the miniIconUrl value for this DescribeTab.
     * 
     * @return miniIconUrl
     */
    public java.lang.String getMiniIconUrl() {
        return miniIconUrl;
    }


    /**
     * Sets the miniIconUrl value for this DescribeTab.
     * 
     * @param miniIconUrl
     */
    public void setMiniIconUrl(java.lang.String miniIconUrl) {
        this.miniIconUrl = miniIconUrl;
    }


    /**
     * Gets the name value for this DescribeTab.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeTab.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sobjectName value for this DescribeTab.
     * 
     * @return sobjectName
     */
    public java.lang.String getSobjectName() {
        return sobjectName;
    }


    /**
     * Sets the sobjectName value for this DescribeTab.
     * 
     * @param sobjectName
     */
    public void setSobjectName(java.lang.String sobjectName) {
        this.sobjectName = sobjectName;
    }


    /**
     * Gets the url value for this DescribeTab.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DescribeTab.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeTab)) return false;
        DescribeTab other = (DescribeTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colors==null && other.getColors()==null) || 
             (this.colors!=null &&
              java.util.Arrays.equals(this.colors, other.getColors()))) &&
            this.custom == other.isCustom() &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.icons==null && other.getIcons()==null) || 
             (this.icons!=null &&
              java.util.Arrays.equals(this.icons, other.getIcons()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.miniIconUrl==null && other.getMiniIconUrl()==null) || 
             (this.miniIconUrl!=null &&
              this.miniIconUrl.equals(other.getMiniIconUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sobjectName==null && other.getSobjectName()==null) || 
             (this.sobjectName!=null &&
              this.sobjectName.equals(other.getSobjectName()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getColors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isCustom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getIcons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIcons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIcons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getMiniIconUrl() != null) {
            _hashCode += getMiniIconUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSobjectName() != null) {
            _hashCode += getSobjectName().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "colors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeColor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "iconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icons");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "icons"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeIcon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miniIconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "miniIconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sobjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "url"));
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
