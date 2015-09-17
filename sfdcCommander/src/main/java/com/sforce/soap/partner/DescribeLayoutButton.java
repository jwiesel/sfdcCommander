/**
 * DescribeLayoutButton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeLayoutButton  implements java.io.Serializable {
    private com.sforce.soap.partner.WebLinkWindowType behavior;

    private com.sforce.soap.partner.DescribeColor[] colors;

    private java.lang.String content;

    private com.sforce.soap.partner.WebLinkType contentSource;

    private boolean custom;

    private java.lang.String encoding;

    private java.lang.Integer height;

    private com.sforce.soap.partner.DescribeIcon[] icons;

    private java.lang.String label;

    private java.lang.Boolean menubar;

    private java.lang.String name;

    private boolean overridden;

    private java.lang.Boolean resizeable;

    private java.lang.Boolean scrollbars;

    private java.lang.Boolean showsLocation;

    private java.lang.Boolean showsStatus;

    private java.lang.Boolean toolbar;

    private java.lang.String url;

    private java.lang.Integer width;

    private com.sforce.soap.partner.WebLinkPosition windowPosition;

    public DescribeLayoutButton() {
    }

    public DescribeLayoutButton(
           com.sforce.soap.partner.WebLinkWindowType behavior,
           com.sforce.soap.partner.DescribeColor[] colors,
           java.lang.String content,
           com.sforce.soap.partner.WebLinkType contentSource,
           boolean custom,
           java.lang.String encoding,
           java.lang.Integer height,
           com.sforce.soap.partner.DescribeIcon[] icons,
           java.lang.String label,
           java.lang.Boolean menubar,
           java.lang.String name,
           boolean overridden,
           java.lang.Boolean resizeable,
           java.lang.Boolean scrollbars,
           java.lang.Boolean showsLocation,
           java.lang.Boolean showsStatus,
           java.lang.Boolean toolbar,
           java.lang.String url,
           java.lang.Integer width,
           com.sforce.soap.partner.WebLinkPosition windowPosition) {
           this.behavior = behavior;
           this.colors = colors;
           this.content = content;
           this.contentSource = contentSource;
           this.custom = custom;
           this.encoding = encoding;
           this.height = height;
           this.icons = icons;
           this.label = label;
           this.menubar = menubar;
           this.name = name;
           this.overridden = overridden;
           this.resizeable = resizeable;
           this.scrollbars = scrollbars;
           this.showsLocation = showsLocation;
           this.showsStatus = showsStatus;
           this.toolbar = toolbar;
           this.url = url;
           this.width = width;
           this.windowPosition = windowPosition;
    }


    /**
     * Gets the behavior value for this DescribeLayoutButton.
     * 
     * @return behavior
     */
    public com.sforce.soap.partner.WebLinkWindowType getBehavior() {
        return behavior;
    }


    /**
     * Sets the behavior value for this DescribeLayoutButton.
     * 
     * @param behavior
     */
    public void setBehavior(com.sforce.soap.partner.WebLinkWindowType behavior) {
        this.behavior = behavior;
    }


    /**
     * Gets the colors value for this DescribeLayoutButton.
     * 
     * @return colors
     */
    public com.sforce.soap.partner.DescribeColor[] getColors() {
        return colors;
    }


    /**
     * Sets the colors value for this DescribeLayoutButton.
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
     * Gets the content value for this DescribeLayoutButton.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this DescribeLayoutButton.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the contentSource value for this DescribeLayoutButton.
     * 
     * @return contentSource
     */
    public com.sforce.soap.partner.WebLinkType getContentSource() {
        return contentSource;
    }


    /**
     * Sets the contentSource value for this DescribeLayoutButton.
     * 
     * @param contentSource
     */
    public void setContentSource(com.sforce.soap.partner.WebLinkType contentSource) {
        this.contentSource = contentSource;
    }


    /**
     * Gets the custom value for this DescribeLayoutButton.
     * 
     * @return custom
     */
    public boolean isCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this DescribeLayoutButton.
     * 
     * @param custom
     */
    public void setCustom(boolean custom) {
        this.custom = custom;
    }


    /**
     * Gets the encoding value for this DescribeLayoutButton.
     * 
     * @return encoding
     */
    public java.lang.String getEncoding() {
        return encoding;
    }


    /**
     * Sets the encoding value for this DescribeLayoutButton.
     * 
     * @param encoding
     */
    public void setEncoding(java.lang.String encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets the height value for this DescribeLayoutButton.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this DescribeLayoutButton.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the icons value for this DescribeLayoutButton.
     * 
     * @return icons
     */
    public com.sforce.soap.partner.DescribeIcon[] getIcons() {
        return icons;
    }


    /**
     * Sets the icons value for this DescribeLayoutButton.
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
     * Gets the label value for this DescribeLayoutButton.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeLayoutButton.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the menubar value for this DescribeLayoutButton.
     * 
     * @return menubar
     */
    public java.lang.Boolean getMenubar() {
        return menubar;
    }


    /**
     * Sets the menubar value for this DescribeLayoutButton.
     * 
     * @param menubar
     */
    public void setMenubar(java.lang.Boolean menubar) {
        this.menubar = menubar;
    }


    /**
     * Gets the name value for this DescribeLayoutButton.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeLayoutButton.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the overridden value for this DescribeLayoutButton.
     * 
     * @return overridden
     */
    public boolean isOverridden() {
        return overridden;
    }


    /**
     * Sets the overridden value for this DescribeLayoutButton.
     * 
     * @param overridden
     */
    public void setOverridden(boolean overridden) {
        this.overridden = overridden;
    }


    /**
     * Gets the resizeable value for this DescribeLayoutButton.
     * 
     * @return resizeable
     */
    public java.lang.Boolean getResizeable() {
        return resizeable;
    }


    /**
     * Sets the resizeable value for this DescribeLayoutButton.
     * 
     * @param resizeable
     */
    public void setResizeable(java.lang.Boolean resizeable) {
        this.resizeable = resizeable;
    }


    /**
     * Gets the scrollbars value for this DescribeLayoutButton.
     * 
     * @return scrollbars
     */
    public java.lang.Boolean getScrollbars() {
        return scrollbars;
    }


    /**
     * Sets the scrollbars value for this DescribeLayoutButton.
     * 
     * @param scrollbars
     */
    public void setScrollbars(java.lang.Boolean scrollbars) {
        this.scrollbars = scrollbars;
    }


    /**
     * Gets the showsLocation value for this DescribeLayoutButton.
     * 
     * @return showsLocation
     */
    public java.lang.Boolean getShowsLocation() {
        return showsLocation;
    }


    /**
     * Sets the showsLocation value for this DescribeLayoutButton.
     * 
     * @param showsLocation
     */
    public void setShowsLocation(java.lang.Boolean showsLocation) {
        this.showsLocation = showsLocation;
    }


    /**
     * Gets the showsStatus value for this DescribeLayoutButton.
     * 
     * @return showsStatus
     */
    public java.lang.Boolean getShowsStatus() {
        return showsStatus;
    }


    /**
     * Sets the showsStatus value for this DescribeLayoutButton.
     * 
     * @param showsStatus
     */
    public void setShowsStatus(java.lang.Boolean showsStatus) {
        this.showsStatus = showsStatus;
    }


    /**
     * Gets the toolbar value for this DescribeLayoutButton.
     * 
     * @return toolbar
     */
    public java.lang.Boolean getToolbar() {
        return toolbar;
    }


    /**
     * Sets the toolbar value for this DescribeLayoutButton.
     * 
     * @param toolbar
     */
    public void setToolbar(java.lang.Boolean toolbar) {
        this.toolbar = toolbar;
    }


    /**
     * Gets the url value for this DescribeLayoutButton.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DescribeLayoutButton.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the width value for this DescribeLayoutButton.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this DescribeLayoutButton.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }


    /**
     * Gets the windowPosition value for this DescribeLayoutButton.
     * 
     * @return windowPosition
     */
    public com.sforce.soap.partner.WebLinkPosition getWindowPosition() {
        return windowPosition;
    }


    /**
     * Sets the windowPosition value for this DescribeLayoutButton.
     * 
     * @param windowPosition
     */
    public void setWindowPosition(com.sforce.soap.partner.WebLinkPosition windowPosition) {
        this.windowPosition = windowPosition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeLayoutButton)) return false;
        DescribeLayoutButton other = (DescribeLayoutButton) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.behavior==null && other.getBehavior()==null) || 
             (this.behavior!=null &&
              this.behavior.equals(other.getBehavior()))) &&
            ((this.colors==null && other.getColors()==null) || 
             (this.colors!=null &&
              java.util.Arrays.equals(this.colors, other.getColors()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.contentSource==null && other.getContentSource()==null) || 
             (this.contentSource!=null &&
              this.contentSource.equals(other.getContentSource()))) &&
            this.custom == other.isCustom() &&
            ((this.encoding==null && other.getEncoding()==null) || 
             (this.encoding!=null &&
              this.encoding.equals(other.getEncoding()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.icons==null && other.getIcons()==null) || 
             (this.icons!=null &&
              java.util.Arrays.equals(this.icons, other.getIcons()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.menubar==null && other.getMenubar()==null) || 
             (this.menubar!=null &&
              this.menubar.equals(other.getMenubar()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.overridden == other.isOverridden() &&
            ((this.resizeable==null && other.getResizeable()==null) || 
             (this.resizeable!=null &&
              this.resizeable.equals(other.getResizeable()))) &&
            ((this.scrollbars==null && other.getScrollbars()==null) || 
             (this.scrollbars!=null &&
              this.scrollbars.equals(other.getScrollbars()))) &&
            ((this.showsLocation==null && other.getShowsLocation()==null) || 
             (this.showsLocation!=null &&
              this.showsLocation.equals(other.getShowsLocation()))) &&
            ((this.showsStatus==null && other.getShowsStatus()==null) || 
             (this.showsStatus!=null &&
              this.showsStatus.equals(other.getShowsStatus()))) &&
            ((this.toolbar==null && other.getToolbar()==null) || 
             (this.toolbar!=null &&
              this.toolbar.equals(other.getToolbar()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.windowPosition==null && other.getWindowPosition()==null) || 
             (this.windowPosition!=null &&
              this.windowPosition.equals(other.getWindowPosition())));
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
        if (getBehavior() != null) {
            _hashCode += getBehavior().hashCode();
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
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getContentSource() != null) {
            _hashCode += getContentSource().hashCode();
        }
        _hashCode += (isCustom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEncoding() != null) {
            _hashCode += getEncoding().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
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
        if (getMenubar() != null) {
            _hashCode += getMenubar().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isOverridden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResizeable() != null) {
            _hashCode += getResizeable().hashCode();
        }
        if (getScrollbars() != null) {
            _hashCode += getScrollbars().hashCode();
        }
        if (getShowsLocation() != null) {
            _hashCode += getShowsLocation().hashCode();
        }
        if (getShowsStatus() != null) {
            _hashCode += getShowsStatus().hashCode();
        }
        if (getToolbar() != null) {
            _hashCode += getToolbar().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getWindowPosition() != null) {
            _hashCode += getWindowPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeLayoutButton.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutButton"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("behavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "behavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "WebLinkWindowType"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contentSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "WebLinkType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encoding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "encoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menubar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "menubar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overridden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "overridden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resizeable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resizeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scrollbars");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "scrollbars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showsLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "showsLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "showsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolbar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "toolbar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "windowPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "WebLinkPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
