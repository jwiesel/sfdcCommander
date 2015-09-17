/**
 * FeedLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FeedLayout  implements java.io.Serializable {
    private java.lang.Boolean autocollapsePublisher;

    private java.lang.Boolean compactFeed;

    private com.sforce.soap._2006._04.metadata.FeedLayoutFilterPosition feedFilterPosition;

    private com.sforce.soap._2006._04.metadata.FeedLayoutFilter[] feedFilters;

    private java.lang.Boolean fullWidthFeed;

    private java.lang.Boolean hideSidebar;

    private java.lang.Boolean highlightExternalFeedItems;

    private com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] leftComponents;

    private com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] rightComponents;

    public FeedLayout() {
    }

    public FeedLayout(
           java.lang.Boolean autocollapsePublisher,
           java.lang.Boolean compactFeed,
           com.sforce.soap._2006._04.metadata.FeedLayoutFilterPosition feedFilterPosition,
           com.sforce.soap._2006._04.metadata.FeedLayoutFilter[] feedFilters,
           java.lang.Boolean fullWidthFeed,
           java.lang.Boolean hideSidebar,
           java.lang.Boolean highlightExternalFeedItems,
           com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] leftComponents,
           com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] rightComponents) {
           this.autocollapsePublisher = autocollapsePublisher;
           this.compactFeed = compactFeed;
           this.feedFilterPosition = feedFilterPosition;
           this.feedFilters = feedFilters;
           this.fullWidthFeed = fullWidthFeed;
           this.hideSidebar = hideSidebar;
           this.highlightExternalFeedItems = highlightExternalFeedItems;
           this.leftComponents = leftComponents;
           this.rightComponents = rightComponents;
    }


    /**
     * Gets the autocollapsePublisher value for this FeedLayout.
     * 
     * @return autocollapsePublisher
     */
    public java.lang.Boolean getAutocollapsePublisher() {
        return autocollapsePublisher;
    }


    /**
     * Sets the autocollapsePublisher value for this FeedLayout.
     * 
     * @param autocollapsePublisher
     */
    public void setAutocollapsePublisher(java.lang.Boolean autocollapsePublisher) {
        this.autocollapsePublisher = autocollapsePublisher;
    }


    /**
     * Gets the compactFeed value for this FeedLayout.
     * 
     * @return compactFeed
     */
    public java.lang.Boolean getCompactFeed() {
        return compactFeed;
    }


    /**
     * Sets the compactFeed value for this FeedLayout.
     * 
     * @param compactFeed
     */
    public void setCompactFeed(java.lang.Boolean compactFeed) {
        this.compactFeed = compactFeed;
    }


    /**
     * Gets the feedFilterPosition value for this FeedLayout.
     * 
     * @return feedFilterPosition
     */
    public com.sforce.soap._2006._04.metadata.FeedLayoutFilterPosition getFeedFilterPosition() {
        return feedFilterPosition;
    }


    /**
     * Sets the feedFilterPosition value for this FeedLayout.
     * 
     * @param feedFilterPosition
     */
    public void setFeedFilterPosition(com.sforce.soap._2006._04.metadata.FeedLayoutFilterPosition feedFilterPosition) {
        this.feedFilterPosition = feedFilterPosition;
    }


    /**
     * Gets the feedFilters value for this FeedLayout.
     * 
     * @return feedFilters
     */
    public com.sforce.soap._2006._04.metadata.FeedLayoutFilter[] getFeedFilters() {
        return feedFilters;
    }


    /**
     * Sets the feedFilters value for this FeedLayout.
     * 
     * @param feedFilters
     */
    public void setFeedFilters(com.sforce.soap._2006._04.metadata.FeedLayoutFilter[] feedFilters) {
        this.feedFilters = feedFilters;
    }

    public com.sforce.soap._2006._04.metadata.FeedLayoutFilter getFeedFilters(int i) {
        return this.feedFilters[i];
    }

    public void setFeedFilters(int i, com.sforce.soap._2006._04.metadata.FeedLayoutFilter _value) {
        this.feedFilters[i] = _value;
    }


    /**
     * Gets the fullWidthFeed value for this FeedLayout.
     * 
     * @return fullWidthFeed
     */
    public java.lang.Boolean getFullWidthFeed() {
        return fullWidthFeed;
    }


    /**
     * Sets the fullWidthFeed value for this FeedLayout.
     * 
     * @param fullWidthFeed
     */
    public void setFullWidthFeed(java.lang.Boolean fullWidthFeed) {
        this.fullWidthFeed = fullWidthFeed;
    }


    /**
     * Gets the hideSidebar value for this FeedLayout.
     * 
     * @return hideSidebar
     */
    public java.lang.Boolean getHideSidebar() {
        return hideSidebar;
    }


    /**
     * Sets the hideSidebar value for this FeedLayout.
     * 
     * @param hideSidebar
     */
    public void setHideSidebar(java.lang.Boolean hideSidebar) {
        this.hideSidebar = hideSidebar;
    }


    /**
     * Gets the highlightExternalFeedItems value for this FeedLayout.
     * 
     * @return highlightExternalFeedItems
     */
    public java.lang.Boolean getHighlightExternalFeedItems() {
        return highlightExternalFeedItems;
    }


    /**
     * Sets the highlightExternalFeedItems value for this FeedLayout.
     * 
     * @param highlightExternalFeedItems
     */
    public void setHighlightExternalFeedItems(java.lang.Boolean highlightExternalFeedItems) {
        this.highlightExternalFeedItems = highlightExternalFeedItems;
    }


    /**
     * Gets the leftComponents value for this FeedLayout.
     * 
     * @return leftComponents
     */
    public com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] getLeftComponents() {
        return leftComponents;
    }


    /**
     * Sets the leftComponents value for this FeedLayout.
     * 
     * @param leftComponents
     */
    public void setLeftComponents(com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] leftComponents) {
        this.leftComponents = leftComponents;
    }

    public com.sforce.soap._2006._04.metadata.FeedLayoutComponent getLeftComponents(int i) {
        return this.leftComponents[i];
    }

    public void setLeftComponents(int i, com.sforce.soap._2006._04.metadata.FeedLayoutComponent _value) {
        this.leftComponents[i] = _value;
    }


    /**
     * Gets the rightComponents value for this FeedLayout.
     * 
     * @return rightComponents
     */
    public com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] getRightComponents() {
        return rightComponents;
    }


    /**
     * Sets the rightComponents value for this FeedLayout.
     * 
     * @param rightComponents
     */
    public void setRightComponents(com.sforce.soap._2006._04.metadata.FeedLayoutComponent[] rightComponents) {
        this.rightComponents = rightComponents;
    }

    public com.sforce.soap._2006._04.metadata.FeedLayoutComponent getRightComponents(int i) {
        return this.rightComponents[i];
    }

    public void setRightComponents(int i, com.sforce.soap._2006._04.metadata.FeedLayoutComponent _value) {
        this.rightComponents[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedLayout)) return false;
        FeedLayout other = (FeedLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autocollapsePublisher==null && other.getAutocollapsePublisher()==null) || 
             (this.autocollapsePublisher!=null &&
              this.autocollapsePublisher.equals(other.getAutocollapsePublisher()))) &&
            ((this.compactFeed==null && other.getCompactFeed()==null) || 
             (this.compactFeed!=null &&
              this.compactFeed.equals(other.getCompactFeed()))) &&
            ((this.feedFilterPosition==null && other.getFeedFilterPosition()==null) || 
             (this.feedFilterPosition!=null &&
              this.feedFilterPosition.equals(other.getFeedFilterPosition()))) &&
            ((this.feedFilters==null && other.getFeedFilters()==null) || 
             (this.feedFilters!=null &&
              java.util.Arrays.equals(this.feedFilters, other.getFeedFilters()))) &&
            ((this.fullWidthFeed==null && other.getFullWidthFeed()==null) || 
             (this.fullWidthFeed!=null &&
              this.fullWidthFeed.equals(other.getFullWidthFeed()))) &&
            ((this.hideSidebar==null && other.getHideSidebar()==null) || 
             (this.hideSidebar!=null &&
              this.hideSidebar.equals(other.getHideSidebar()))) &&
            ((this.highlightExternalFeedItems==null && other.getHighlightExternalFeedItems()==null) || 
             (this.highlightExternalFeedItems!=null &&
              this.highlightExternalFeedItems.equals(other.getHighlightExternalFeedItems()))) &&
            ((this.leftComponents==null && other.getLeftComponents()==null) || 
             (this.leftComponents!=null &&
              java.util.Arrays.equals(this.leftComponents, other.getLeftComponents()))) &&
            ((this.rightComponents==null && other.getRightComponents()==null) || 
             (this.rightComponents!=null &&
              java.util.Arrays.equals(this.rightComponents, other.getRightComponents())));
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
        if (getAutocollapsePublisher() != null) {
            _hashCode += getAutocollapsePublisher().hashCode();
        }
        if (getCompactFeed() != null) {
            _hashCode += getCompactFeed().hashCode();
        }
        if (getFeedFilterPosition() != null) {
            _hashCode += getFeedFilterPosition().hashCode();
        }
        if (getFeedFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullWidthFeed() != null) {
            _hashCode += getFullWidthFeed().hashCode();
        }
        if (getHideSidebar() != null) {
            _hashCode += getHideSidebar().hashCode();
        }
        if (getHighlightExternalFeedItems() != null) {
            _hashCode += getHighlightExternalFeedItems().hashCode();
        }
        if (getLeftComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeftComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeftComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRightComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRightComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRightComponents(), i);
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
        new org.apache.axis.description.TypeDesc(FeedLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autocollapsePublisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autocollapsePublisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compactFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "compactFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedFilterPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedFilterPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayoutFilterPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "feedFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayoutFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullWidthFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fullWidthFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideSidebar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "hideSidebar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highlightExternalFeedItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "highlightExternalFeedItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "leftComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayoutComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rightComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedLayoutComponent"));
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
