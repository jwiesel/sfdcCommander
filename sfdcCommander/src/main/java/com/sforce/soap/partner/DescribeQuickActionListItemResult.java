/**
 * DescribeQuickActionListItemResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeQuickActionListItemResult  implements java.io.Serializable {
    private com.sforce.soap.partner.ShareAccessLevel accessLevelRequired;

    private com.sforce.soap.partner.DescribeColor[] colors;

    private java.lang.String iconUrl;

    private com.sforce.soap.partner.DescribeIcon[] icons;

    private java.lang.String label;

    private java.lang.String miniIconUrl;

    private java.lang.String quickActionName;

    private java.lang.String targetSobjectType;

    private java.lang.String type;

    public DescribeQuickActionListItemResult() {
    }

    public DescribeQuickActionListItemResult(
           com.sforce.soap.partner.ShareAccessLevel accessLevelRequired,
           com.sforce.soap.partner.DescribeColor[] colors,
           java.lang.String iconUrl,
           com.sforce.soap.partner.DescribeIcon[] icons,
           java.lang.String label,
           java.lang.String miniIconUrl,
           java.lang.String quickActionName,
           java.lang.String targetSobjectType,
           java.lang.String type) {
           this.accessLevelRequired = accessLevelRequired;
           this.colors = colors;
           this.iconUrl = iconUrl;
           this.icons = icons;
           this.label = label;
           this.miniIconUrl = miniIconUrl;
           this.quickActionName = quickActionName;
           this.targetSobjectType = targetSobjectType;
           this.type = type;
    }


    /**
     * Gets the accessLevelRequired value for this DescribeQuickActionListItemResult.
     * 
     * @return accessLevelRequired
     */
    public com.sforce.soap.partner.ShareAccessLevel getAccessLevelRequired() {
        return accessLevelRequired;
    }


    /**
     * Sets the accessLevelRequired value for this DescribeQuickActionListItemResult.
     * 
     * @param accessLevelRequired
     */
    public void setAccessLevelRequired(com.sforce.soap.partner.ShareAccessLevel accessLevelRequired) {
        this.accessLevelRequired = accessLevelRequired;
    }


    /**
     * Gets the colors value for this DescribeQuickActionListItemResult.
     * 
     * @return colors
     */
    public com.sforce.soap.partner.DescribeColor[] getColors() {
        return colors;
    }


    /**
     * Sets the colors value for this DescribeQuickActionListItemResult.
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
     * Gets the iconUrl value for this DescribeQuickActionListItemResult.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this DescribeQuickActionListItemResult.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the icons value for this DescribeQuickActionListItemResult.
     * 
     * @return icons
     */
    public com.sforce.soap.partner.DescribeIcon[] getIcons() {
        return icons;
    }


    /**
     * Sets the icons value for this DescribeQuickActionListItemResult.
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
     * Gets the label value for this DescribeQuickActionListItemResult.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeQuickActionListItemResult.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the miniIconUrl value for this DescribeQuickActionListItemResult.
     * 
     * @return miniIconUrl
     */
    public java.lang.String getMiniIconUrl() {
        return miniIconUrl;
    }


    /**
     * Sets the miniIconUrl value for this DescribeQuickActionListItemResult.
     * 
     * @param miniIconUrl
     */
    public void setMiniIconUrl(java.lang.String miniIconUrl) {
        this.miniIconUrl = miniIconUrl;
    }


    /**
     * Gets the quickActionName value for this DescribeQuickActionListItemResult.
     * 
     * @return quickActionName
     */
    public java.lang.String getQuickActionName() {
        return quickActionName;
    }


    /**
     * Sets the quickActionName value for this DescribeQuickActionListItemResult.
     * 
     * @param quickActionName
     */
    public void setQuickActionName(java.lang.String quickActionName) {
        this.quickActionName = quickActionName;
    }


    /**
     * Gets the targetSobjectType value for this DescribeQuickActionListItemResult.
     * 
     * @return targetSobjectType
     */
    public java.lang.String getTargetSobjectType() {
        return targetSobjectType;
    }


    /**
     * Sets the targetSobjectType value for this DescribeQuickActionListItemResult.
     * 
     * @param targetSobjectType
     */
    public void setTargetSobjectType(java.lang.String targetSobjectType) {
        this.targetSobjectType = targetSobjectType;
    }


    /**
     * Gets the type value for this DescribeQuickActionListItemResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DescribeQuickActionListItemResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeQuickActionListItemResult)) return false;
        DescribeQuickActionListItemResult other = (DescribeQuickActionListItemResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessLevelRequired==null && other.getAccessLevelRequired()==null) || 
             (this.accessLevelRequired!=null &&
              this.accessLevelRequired.equals(other.getAccessLevelRequired()))) &&
            ((this.colors==null && other.getColors()==null) || 
             (this.colors!=null &&
              java.util.Arrays.equals(this.colors, other.getColors()))) &&
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
            ((this.quickActionName==null && other.getQuickActionName()==null) || 
             (this.quickActionName!=null &&
              this.quickActionName.equals(other.getQuickActionName()))) &&
            ((this.targetSobjectType==null && other.getTargetSobjectType()==null) || 
             (this.targetSobjectType!=null &&
              this.targetSobjectType.equals(other.getTargetSobjectType()))) &&
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
        if (getAccessLevelRequired() != null) {
            _hashCode += getAccessLevelRequired().hashCode();
        }
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
        if (getQuickActionName() != null) {
            _hashCode += getQuickActionName().hashCode();
        }
        if (getTargetSobjectType() != null) {
            _hashCode += getTargetSobjectType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeQuickActionListItemResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionListItemResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevelRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "accessLevelRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ShareAccessLevel"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "colors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeColor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "iconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("quickActionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "targetSobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "type"));
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
