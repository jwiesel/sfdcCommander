/**
 * HomePageComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class HomePageComponent  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String body;

    private java.lang.Integer height;

    private java.lang.String[] links;

    private java.lang.String page;

    private com.sforce.soap._2006._04.metadata.PageComponentType pageComponentType;

    private java.lang.Boolean showLabel;

    private java.lang.Boolean showScrollbars;

    private com.sforce.soap._2006._04.metadata.PageComponentWidth width;

    public HomePageComponent() {
    }

    public HomePageComponent(
           java.lang.String fullName,
           java.lang.String body,
           java.lang.Integer height,
           java.lang.String[] links,
           java.lang.String page,
           com.sforce.soap._2006._04.metadata.PageComponentType pageComponentType,
           java.lang.Boolean showLabel,
           java.lang.Boolean showScrollbars,
           com.sforce.soap._2006._04.metadata.PageComponentWidth width) {
        super(
            fullName);
        this.body = body;
        this.height = height;
        this.links = links;
        this.page = page;
        this.pageComponentType = pageComponentType;
        this.showLabel = showLabel;
        this.showScrollbars = showScrollbars;
        this.width = width;
    }


    /**
     * Gets the body value for this HomePageComponent.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this HomePageComponent.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the height value for this HomePageComponent.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this HomePageComponent.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the links value for this HomePageComponent.
     * 
     * @return links
     */
    public java.lang.String[] getLinks() {
        return links;
    }


    /**
     * Sets the links value for this HomePageComponent.
     * 
     * @param links
     */
    public void setLinks(java.lang.String[] links) {
        this.links = links;
    }

    public java.lang.String getLinks(int i) {
        return this.links[i];
    }

    public void setLinks(int i, java.lang.String _value) {
        this.links[i] = _value;
    }


    /**
     * Gets the page value for this HomePageComponent.
     * 
     * @return page
     */
    public java.lang.String getPage() {
        return page;
    }


    /**
     * Sets the page value for this HomePageComponent.
     * 
     * @param page
     */
    public void setPage(java.lang.String page) {
        this.page = page;
    }


    /**
     * Gets the pageComponentType value for this HomePageComponent.
     * 
     * @return pageComponentType
     */
    public com.sforce.soap._2006._04.metadata.PageComponentType getPageComponentType() {
        return pageComponentType;
    }


    /**
     * Sets the pageComponentType value for this HomePageComponent.
     * 
     * @param pageComponentType
     */
    public void setPageComponentType(com.sforce.soap._2006._04.metadata.PageComponentType pageComponentType) {
        this.pageComponentType = pageComponentType;
    }


    /**
     * Gets the showLabel value for this HomePageComponent.
     * 
     * @return showLabel
     */
    public java.lang.Boolean getShowLabel() {
        return showLabel;
    }


    /**
     * Sets the showLabel value for this HomePageComponent.
     * 
     * @param showLabel
     */
    public void setShowLabel(java.lang.Boolean showLabel) {
        this.showLabel = showLabel;
    }


    /**
     * Gets the showScrollbars value for this HomePageComponent.
     * 
     * @return showScrollbars
     */
    public java.lang.Boolean getShowScrollbars() {
        return showScrollbars;
    }


    /**
     * Sets the showScrollbars value for this HomePageComponent.
     * 
     * @param showScrollbars
     */
    public void setShowScrollbars(java.lang.Boolean showScrollbars) {
        this.showScrollbars = showScrollbars;
    }


    /**
     * Gets the width value for this HomePageComponent.
     * 
     * @return width
     */
    public com.sforce.soap._2006._04.metadata.PageComponentWidth getWidth() {
        return width;
    }


    /**
     * Sets the width value for this HomePageComponent.
     * 
     * @param width
     */
    public void setWidth(com.sforce.soap._2006._04.metadata.PageComponentWidth width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomePageComponent)) return false;
        HomePageComponent other = (HomePageComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.links==null && other.getLinks()==null) || 
             (this.links!=null &&
              java.util.Arrays.equals(this.links, other.getLinks()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.pageComponentType==null && other.getPageComponentType()==null) || 
             (this.pageComponentType!=null &&
              this.pageComponentType.equals(other.getPageComponentType()))) &&
            ((this.showLabel==null && other.getShowLabel()==null) || 
             (this.showLabel!=null &&
              this.showLabel.equals(other.getShowLabel()))) &&
            ((this.showScrollbars==null && other.getShowScrollbars()==null) || 
             (this.showScrollbars!=null &&
              this.showScrollbars.equals(other.getShowScrollbars()))) &&
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
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getPageComponentType() != null) {
            _hashCode += getPageComponentType().hashCode();
        }
        if (getShowLabel() != null) {
            _hashCode += getShowLabel().hashCode();
        }
        if (getShowScrollbars() != null) {
            _hashCode += getShowScrollbars().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomePageComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "HomePageComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("links");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageComponentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageComponentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PageComponentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showScrollbars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showScrollbars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PageComponentWidth"));
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
