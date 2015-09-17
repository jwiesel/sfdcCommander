/**
 * WebLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WebLink  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.WebLinkAvailability availability;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.WebLinkDisplayType displayType;

    private com.sforce.soap._2006._04.metadata.Encoding encodingKey;

    private java.lang.Boolean hasMenubar;

    private java.lang.Boolean hasScrollbars;

    private java.lang.Boolean hasToolbar;

    private java.lang.Integer height;

    private java.lang.Boolean isResizable;

    private com.sforce.soap._2006._04.metadata.WebLinkType linkType;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.WebLinkWindowType openType;

    private java.lang.String page;

    private com.sforce.soap._2006._04.metadata.WebLinkPosition position;

    private boolean _protected;

    private java.lang.Boolean requireRowSelection;

    private java.lang.String scontrol;

    private java.lang.Boolean showsLocation;

    private java.lang.Boolean showsStatus;

    private java.lang.String url;

    private java.lang.Integer width;

    public WebLink() {
    }

    public WebLink(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.WebLinkAvailability availability,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.WebLinkDisplayType displayType,
           com.sforce.soap._2006._04.metadata.Encoding encodingKey,
           java.lang.Boolean hasMenubar,
           java.lang.Boolean hasScrollbars,
           java.lang.Boolean hasToolbar,
           java.lang.Integer height,
           java.lang.Boolean isResizable,
           com.sforce.soap._2006._04.metadata.WebLinkType linkType,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.WebLinkWindowType openType,
           java.lang.String page,
           com.sforce.soap._2006._04.metadata.WebLinkPosition position,
           boolean _protected,
           java.lang.Boolean requireRowSelection,
           java.lang.String scontrol,
           java.lang.Boolean showsLocation,
           java.lang.Boolean showsStatus,
           java.lang.String url,
           java.lang.Integer width) {
        super(
            fullName);
        this.availability = availability;
        this.description = description;
        this.displayType = displayType;
        this.encodingKey = encodingKey;
        this.hasMenubar = hasMenubar;
        this.hasScrollbars = hasScrollbars;
        this.hasToolbar = hasToolbar;
        this.height = height;
        this.isResizable = isResizable;
        this.linkType = linkType;
        this.masterLabel = masterLabel;
        this.openType = openType;
        this.page = page;
        this.position = position;
        this._protected = _protected;
        this.requireRowSelection = requireRowSelection;
        this.scontrol = scontrol;
        this.showsLocation = showsLocation;
        this.showsStatus = showsStatus;
        this.url = url;
        this.width = width;
    }


    /**
     * Gets the availability value for this WebLink.
     * 
     * @return availability
     */
    public com.sforce.soap._2006._04.metadata.WebLinkAvailability getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this WebLink.
     * 
     * @param availability
     */
    public void setAvailability(com.sforce.soap._2006._04.metadata.WebLinkAvailability availability) {
        this.availability = availability;
    }


    /**
     * Gets the description value for this WebLink.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WebLink.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayType value for this WebLink.
     * 
     * @return displayType
     */
    public com.sforce.soap._2006._04.metadata.WebLinkDisplayType getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this WebLink.
     * 
     * @param displayType
     */
    public void setDisplayType(com.sforce.soap._2006._04.metadata.WebLinkDisplayType displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the encodingKey value for this WebLink.
     * 
     * @return encodingKey
     */
    public com.sforce.soap._2006._04.metadata.Encoding getEncodingKey() {
        return encodingKey;
    }


    /**
     * Sets the encodingKey value for this WebLink.
     * 
     * @param encodingKey
     */
    public void setEncodingKey(com.sforce.soap._2006._04.metadata.Encoding encodingKey) {
        this.encodingKey = encodingKey;
    }


    /**
     * Gets the hasMenubar value for this WebLink.
     * 
     * @return hasMenubar
     */
    public java.lang.Boolean getHasMenubar() {
        return hasMenubar;
    }


    /**
     * Sets the hasMenubar value for this WebLink.
     * 
     * @param hasMenubar
     */
    public void setHasMenubar(java.lang.Boolean hasMenubar) {
        this.hasMenubar = hasMenubar;
    }


    /**
     * Gets the hasScrollbars value for this WebLink.
     * 
     * @return hasScrollbars
     */
    public java.lang.Boolean getHasScrollbars() {
        return hasScrollbars;
    }


    /**
     * Sets the hasScrollbars value for this WebLink.
     * 
     * @param hasScrollbars
     */
    public void setHasScrollbars(java.lang.Boolean hasScrollbars) {
        this.hasScrollbars = hasScrollbars;
    }


    /**
     * Gets the hasToolbar value for this WebLink.
     * 
     * @return hasToolbar
     */
    public java.lang.Boolean getHasToolbar() {
        return hasToolbar;
    }


    /**
     * Sets the hasToolbar value for this WebLink.
     * 
     * @param hasToolbar
     */
    public void setHasToolbar(java.lang.Boolean hasToolbar) {
        this.hasToolbar = hasToolbar;
    }


    /**
     * Gets the height value for this WebLink.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this WebLink.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the isResizable value for this WebLink.
     * 
     * @return isResizable
     */
    public java.lang.Boolean getIsResizable() {
        return isResizable;
    }


    /**
     * Sets the isResizable value for this WebLink.
     * 
     * @param isResizable
     */
    public void setIsResizable(java.lang.Boolean isResizable) {
        this.isResizable = isResizable;
    }


    /**
     * Gets the linkType value for this WebLink.
     * 
     * @return linkType
     */
    public com.sforce.soap._2006._04.metadata.WebLinkType getLinkType() {
        return linkType;
    }


    /**
     * Sets the linkType value for this WebLink.
     * 
     * @param linkType
     */
    public void setLinkType(com.sforce.soap._2006._04.metadata.WebLinkType linkType) {
        this.linkType = linkType;
    }


    /**
     * Gets the masterLabel value for this WebLink.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this WebLink.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the openType value for this WebLink.
     * 
     * @return openType
     */
    public com.sforce.soap._2006._04.metadata.WebLinkWindowType getOpenType() {
        return openType;
    }


    /**
     * Sets the openType value for this WebLink.
     * 
     * @param openType
     */
    public void setOpenType(com.sforce.soap._2006._04.metadata.WebLinkWindowType openType) {
        this.openType = openType;
    }


    /**
     * Gets the page value for this WebLink.
     * 
     * @return page
     */
    public java.lang.String getPage() {
        return page;
    }


    /**
     * Sets the page value for this WebLink.
     * 
     * @param page
     */
    public void setPage(java.lang.String page) {
        this.page = page;
    }


    /**
     * Gets the position value for this WebLink.
     * 
     * @return position
     */
    public com.sforce.soap._2006._04.metadata.WebLinkPosition getPosition() {
        return position;
    }


    /**
     * Sets the position value for this WebLink.
     * 
     * @param position
     */
    public void setPosition(com.sforce.soap._2006._04.metadata.WebLinkPosition position) {
        this.position = position;
    }


    /**
     * Gets the _protected value for this WebLink.
     * 
     * @return _protected
     */
    public boolean is_protected() {
        return _protected;
    }


    /**
     * Sets the _protected value for this WebLink.
     * 
     * @param _protected
     */
    public void set_protected(boolean _protected) {
        this._protected = _protected;
    }


    /**
     * Gets the requireRowSelection value for this WebLink.
     * 
     * @return requireRowSelection
     */
    public java.lang.Boolean getRequireRowSelection() {
        return requireRowSelection;
    }


    /**
     * Sets the requireRowSelection value for this WebLink.
     * 
     * @param requireRowSelection
     */
    public void setRequireRowSelection(java.lang.Boolean requireRowSelection) {
        this.requireRowSelection = requireRowSelection;
    }


    /**
     * Gets the scontrol value for this WebLink.
     * 
     * @return scontrol
     */
    public java.lang.String getScontrol() {
        return scontrol;
    }


    /**
     * Sets the scontrol value for this WebLink.
     * 
     * @param scontrol
     */
    public void setScontrol(java.lang.String scontrol) {
        this.scontrol = scontrol;
    }


    /**
     * Gets the showsLocation value for this WebLink.
     * 
     * @return showsLocation
     */
    public java.lang.Boolean getShowsLocation() {
        return showsLocation;
    }


    /**
     * Sets the showsLocation value for this WebLink.
     * 
     * @param showsLocation
     */
    public void setShowsLocation(java.lang.Boolean showsLocation) {
        this.showsLocation = showsLocation;
    }


    /**
     * Gets the showsStatus value for this WebLink.
     * 
     * @return showsStatus
     */
    public java.lang.Boolean getShowsStatus() {
        return showsStatus;
    }


    /**
     * Sets the showsStatus value for this WebLink.
     * 
     * @param showsStatus
     */
    public void setShowsStatus(java.lang.Boolean showsStatus) {
        this.showsStatus = showsStatus;
    }


    /**
     * Gets the url value for this WebLink.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this WebLink.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the width value for this WebLink.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this WebLink.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebLink)) return false;
        WebLink other = (WebLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayType==null && other.getDisplayType()==null) || 
             (this.displayType!=null &&
              this.displayType.equals(other.getDisplayType()))) &&
            ((this.encodingKey==null && other.getEncodingKey()==null) || 
             (this.encodingKey!=null &&
              this.encodingKey.equals(other.getEncodingKey()))) &&
            ((this.hasMenubar==null && other.getHasMenubar()==null) || 
             (this.hasMenubar!=null &&
              this.hasMenubar.equals(other.getHasMenubar()))) &&
            ((this.hasScrollbars==null && other.getHasScrollbars()==null) || 
             (this.hasScrollbars!=null &&
              this.hasScrollbars.equals(other.getHasScrollbars()))) &&
            ((this.hasToolbar==null && other.getHasToolbar()==null) || 
             (this.hasToolbar!=null &&
              this.hasToolbar.equals(other.getHasToolbar()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.isResizable==null && other.getIsResizable()==null) || 
             (this.isResizable!=null &&
              this.isResizable.equals(other.getIsResizable()))) &&
            ((this.linkType==null && other.getLinkType()==null) || 
             (this.linkType!=null &&
              this.linkType.equals(other.getLinkType()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.openType==null && other.getOpenType()==null) || 
             (this.openType!=null &&
              this.openType.equals(other.getOpenType()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            this._protected == other.is_protected() &&
            ((this.requireRowSelection==null && other.getRequireRowSelection()==null) || 
             (this.requireRowSelection!=null &&
              this.requireRowSelection.equals(other.getRequireRowSelection()))) &&
            ((this.scontrol==null && other.getScontrol()==null) || 
             (this.scontrol!=null &&
              this.scontrol.equals(other.getScontrol()))) &&
            ((this.showsLocation==null && other.getShowsLocation()==null) || 
             (this.showsLocation!=null &&
              this.showsLocation.equals(other.getShowsLocation()))) &&
            ((this.showsStatus==null && other.getShowsStatus()==null) || 
             (this.showsStatus!=null &&
              this.showsStatus.equals(other.getShowsStatus()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
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
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayType() != null) {
            _hashCode += getDisplayType().hashCode();
        }
        if (getEncodingKey() != null) {
            _hashCode += getEncodingKey().hashCode();
        }
        if (getHasMenubar() != null) {
            _hashCode += getHasMenubar().hashCode();
        }
        if (getHasScrollbars() != null) {
            _hashCode += getHasScrollbars().hashCode();
        }
        if (getHasToolbar() != null) {
            _hashCode += getHasToolbar().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getIsResizable() != null) {
            _hashCode += getIsResizable().hashCode();
        }
        if (getLinkType() != null) {
            _hashCode += getLinkType().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getOpenType() != null) {
            _hashCode += getOpenType().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        _hashCode += (is_protected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRequireRowSelection() != null) {
            _hashCode += getRequireRowSelection().hashCode();
        }
        if (getScontrol() != null) {
            _hashCode += getScontrol().hashCode();
        }
        if (getShowsLocation() != null) {
            _hashCode += getShowsLocation().hashCode();
        }
        if (getShowsStatus() != null) {
            _hashCode += getShowsStatus().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkAvailability"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkDisplayType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encodingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "encodingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Encoding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMenubar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "hasMenubar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasScrollbars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "hasScrollbars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasToolbar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "hasToolbar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("isResizable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isResizable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "linkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "openType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkWindowType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_protected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "protected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireRowSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "requireRowSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scontrol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scontrol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showsLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showsLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
