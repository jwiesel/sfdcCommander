/**
 * CustomApplicationComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomApplicationComponent  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String buttonIconUrl;

    private java.lang.String buttonStyle;

    private java.lang.String buttonText;

    private java.lang.Integer buttonWidth;

    private java.lang.Integer height;

    private boolean isHeightFixed;

    private boolean isHidden;

    private boolean isWidthFixed;

    private java.lang.String visualforcePage;

    private java.lang.Integer width;

    public CustomApplicationComponent() {
    }

    public CustomApplicationComponent(
           java.lang.String fullName,
           java.lang.String buttonIconUrl,
           java.lang.String buttonStyle,
           java.lang.String buttonText,
           java.lang.Integer buttonWidth,
           java.lang.Integer height,
           boolean isHeightFixed,
           boolean isHidden,
           boolean isWidthFixed,
           java.lang.String visualforcePage,
           java.lang.Integer width) {
        super(
            fullName);
        this.buttonIconUrl = buttonIconUrl;
        this.buttonStyle = buttonStyle;
        this.buttonText = buttonText;
        this.buttonWidth = buttonWidth;
        this.height = height;
        this.isHeightFixed = isHeightFixed;
        this.isHidden = isHidden;
        this.isWidthFixed = isWidthFixed;
        this.visualforcePage = visualforcePage;
        this.width = width;
    }


    /**
     * Gets the buttonIconUrl value for this CustomApplicationComponent.
     * 
     * @return buttonIconUrl
     */
    public java.lang.String getButtonIconUrl() {
        return buttonIconUrl;
    }


    /**
     * Sets the buttonIconUrl value for this CustomApplicationComponent.
     * 
     * @param buttonIconUrl
     */
    public void setButtonIconUrl(java.lang.String buttonIconUrl) {
        this.buttonIconUrl = buttonIconUrl;
    }


    /**
     * Gets the buttonStyle value for this CustomApplicationComponent.
     * 
     * @return buttonStyle
     */
    public java.lang.String getButtonStyle() {
        return buttonStyle;
    }


    /**
     * Sets the buttonStyle value for this CustomApplicationComponent.
     * 
     * @param buttonStyle
     */
    public void setButtonStyle(java.lang.String buttonStyle) {
        this.buttonStyle = buttonStyle;
    }


    /**
     * Gets the buttonText value for this CustomApplicationComponent.
     * 
     * @return buttonText
     */
    public java.lang.String getButtonText() {
        return buttonText;
    }


    /**
     * Sets the buttonText value for this CustomApplicationComponent.
     * 
     * @param buttonText
     */
    public void setButtonText(java.lang.String buttonText) {
        this.buttonText = buttonText;
    }


    /**
     * Gets the buttonWidth value for this CustomApplicationComponent.
     * 
     * @return buttonWidth
     */
    public java.lang.Integer getButtonWidth() {
        return buttonWidth;
    }


    /**
     * Sets the buttonWidth value for this CustomApplicationComponent.
     * 
     * @param buttonWidth
     */
    public void setButtonWidth(java.lang.Integer buttonWidth) {
        this.buttonWidth = buttonWidth;
    }


    /**
     * Gets the height value for this CustomApplicationComponent.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this CustomApplicationComponent.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the isHeightFixed value for this CustomApplicationComponent.
     * 
     * @return isHeightFixed
     */
    public boolean isIsHeightFixed() {
        return isHeightFixed;
    }


    /**
     * Sets the isHeightFixed value for this CustomApplicationComponent.
     * 
     * @param isHeightFixed
     */
    public void setIsHeightFixed(boolean isHeightFixed) {
        this.isHeightFixed = isHeightFixed;
    }


    /**
     * Gets the isHidden value for this CustomApplicationComponent.
     * 
     * @return isHidden
     */
    public boolean isIsHidden() {
        return isHidden;
    }


    /**
     * Sets the isHidden value for this CustomApplicationComponent.
     * 
     * @param isHidden
     */
    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }


    /**
     * Gets the isWidthFixed value for this CustomApplicationComponent.
     * 
     * @return isWidthFixed
     */
    public boolean isIsWidthFixed() {
        return isWidthFixed;
    }


    /**
     * Sets the isWidthFixed value for this CustomApplicationComponent.
     * 
     * @param isWidthFixed
     */
    public void setIsWidthFixed(boolean isWidthFixed) {
        this.isWidthFixed = isWidthFixed;
    }


    /**
     * Gets the visualforcePage value for this CustomApplicationComponent.
     * 
     * @return visualforcePage
     */
    public java.lang.String getVisualforcePage() {
        return visualforcePage;
    }


    /**
     * Sets the visualforcePage value for this CustomApplicationComponent.
     * 
     * @param visualforcePage
     */
    public void setVisualforcePage(java.lang.String visualforcePage) {
        this.visualforcePage = visualforcePage;
    }


    /**
     * Gets the width value for this CustomApplicationComponent.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this CustomApplicationComponent.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomApplicationComponent)) return false;
        CustomApplicationComponent other = (CustomApplicationComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.buttonIconUrl==null && other.getButtonIconUrl()==null) || 
             (this.buttonIconUrl!=null &&
              this.buttonIconUrl.equals(other.getButtonIconUrl()))) &&
            ((this.buttonStyle==null && other.getButtonStyle()==null) || 
             (this.buttonStyle!=null &&
              this.buttonStyle.equals(other.getButtonStyle()))) &&
            ((this.buttonText==null && other.getButtonText()==null) || 
             (this.buttonText!=null &&
              this.buttonText.equals(other.getButtonText()))) &&
            ((this.buttonWidth==null && other.getButtonWidth()==null) || 
             (this.buttonWidth!=null &&
              this.buttonWidth.equals(other.getButtonWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            this.isHeightFixed == other.isIsHeightFixed() &&
            this.isHidden == other.isIsHidden() &&
            this.isWidthFixed == other.isIsWidthFixed() &&
            ((this.visualforcePage==null && other.getVisualforcePage()==null) || 
             (this.visualforcePage!=null &&
              this.visualforcePage.equals(other.getVisualforcePage()))) &&
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
        int _hashCode = super.hashCode();
        if (getButtonIconUrl() != null) {
            _hashCode += getButtonIconUrl().hashCode();
        }
        if (getButtonStyle() != null) {
            _hashCode += getButtonStyle().hashCode();
        }
        if (getButtonText() != null) {
            _hashCode += getButtonText().hashCode();
        }
        if (getButtonWidth() != null) {
            _hashCode += getButtonWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        _hashCode += (isIsHeightFixed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsWidthFixed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVisualforcePage() != null) {
            _hashCode += getVisualforcePage().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomApplicationComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplicationComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonIconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "buttonIconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "buttonStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "buttonText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "buttonWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHeightFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isHeightFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWidthFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isWidthFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualforcePage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "visualforcePage"));
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
