/**
 * DescribeLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeLayout  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeLayoutButton[] buttonLayoutSection;

    private com.sforce.soap.partner.DescribeLayoutSection[] detailLayoutSections;

    private com.sforce.soap.partner.DescribeLayoutSection[] editLayoutSections;

    private com.sforce.soap.partner.DescribeLayoutFeedFilter[] feedView;

    private com.sforce.soap.partner.DescribeLayoutSection highlightsPanelLayoutSection;

    private java.lang.String id;

    private com.sforce.soap.partner.DescribeQuickActionListItemResult[] quickActionList;

    private com.sforce.soap.partner.DescribeRelatedContentItem[] relatedContent;

    private com.sforce.soap.partner.RelatedList[] relatedLists;

    public DescribeLayout() {
    }

    public DescribeLayout(
           com.sforce.soap.partner.DescribeLayoutButton[] buttonLayoutSection,
           com.sforce.soap.partner.DescribeLayoutSection[] detailLayoutSections,
           com.sforce.soap.partner.DescribeLayoutSection[] editLayoutSections,
           com.sforce.soap.partner.DescribeLayoutFeedFilter[] feedView,
           com.sforce.soap.partner.DescribeLayoutSection highlightsPanelLayoutSection,
           java.lang.String id,
           com.sforce.soap.partner.DescribeQuickActionListItemResult[] quickActionList,
           com.sforce.soap.partner.DescribeRelatedContentItem[] relatedContent,
           com.sforce.soap.partner.RelatedList[] relatedLists) {
           this.buttonLayoutSection = buttonLayoutSection;
           this.detailLayoutSections = detailLayoutSections;
           this.editLayoutSections = editLayoutSections;
           this.feedView = feedView;
           this.highlightsPanelLayoutSection = highlightsPanelLayoutSection;
           this.id = id;
           this.quickActionList = quickActionList;
           this.relatedContent = relatedContent;
           this.relatedLists = relatedLists;
    }


    /**
     * Gets the buttonLayoutSection value for this DescribeLayout.
     * 
     * @return buttonLayoutSection
     */
    public com.sforce.soap.partner.DescribeLayoutButton[] getButtonLayoutSection() {
        return buttonLayoutSection;
    }


    /**
     * Sets the buttonLayoutSection value for this DescribeLayout.
     * 
     * @param buttonLayoutSection
     */
    public void setButtonLayoutSection(com.sforce.soap.partner.DescribeLayoutButton[] buttonLayoutSection) {
        this.buttonLayoutSection = buttonLayoutSection;
    }


    /**
     * Gets the detailLayoutSections value for this DescribeLayout.
     * 
     * @return detailLayoutSections
     */
    public com.sforce.soap.partner.DescribeLayoutSection[] getDetailLayoutSections() {
        return detailLayoutSections;
    }


    /**
     * Sets the detailLayoutSections value for this DescribeLayout.
     * 
     * @param detailLayoutSections
     */
    public void setDetailLayoutSections(com.sforce.soap.partner.DescribeLayoutSection[] detailLayoutSections) {
        this.detailLayoutSections = detailLayoutSections;
    }

    public com.sforce.soap.partner.DescribeLayoutSection getDetailLayoutSections(int i) {
        return this.detailLayoutSections[i];
    }

    public void setDetailLayoutSections(int i, com.sforce.soap.partner.DescribeLayoutSection _value) {
        this.detailLayoutSections[i] = _value;
    }


    /**
     * Gets the editLayoutSections value for this DescribeLayout.
     * 
     * @return editLayoutSections
     */
    public com.sforce.soap.partner.DescribeLayoutSection[] getEditLayoutSections() {
        return editLayoutSections;
    }


    /**
     * Sets the editLayoutSections value for this DescribeLayout.
     * 
     * @param editLayoutSections
     */
    public void setEditLayoutSections(com.sforce.soap.partner.DescribeLayoutSection[] editLayoutSections) {
        this.editLayoutSections = editLayoutSections;
    }

    public com.sforce.soap.partner.DescribeLayoutSection getEditLayoutSections(int i) {
        return this.editLayoutSections[i];
    }

    public void setEditLayoutSections(int i, com.sforce.soap.partner.DescribeLayoutSection _value) {
        this.editLayoutSections[i] = _value;
    }


    /**
     * Gets the feedView value for this DescribeLayout.
     * 
     * @return feedView
     */
    public com.sforce.soap.partner.DescribeLayoutFeedFilter[] getFeedView() {
        return feedView;
    }


    /**
     * Sets the feedView value for this DescribeLayout.
     * 
     * @param feedView
     */
    public void setFeedView(com.sforce.soap.partner.DescribeLayoutFeedFilter[] feedView) {
        this.feedView = feedView;
    }


    /**
     * Gets the highlightsPanelLayoutSection value for this DescribeLayout.
     * 
     * @return highlightsPanelLayoutSection
     */
    public com.sforce.soap.partner.DescribeLayoutSection getHighlightsPanelLayoutSection() {
        return highlightsPanelLayoutSection;
    }


    /**
     * Sets the highlightsPanelLayoutSection value for this DescribeLayout.
     * 
     * @param highlightsPanelLayoutSection
     */
    public void setHighlightsPanelLayoutSection(com.sforce.soap.partner.DescribeLayoutSection highlightsPanelLayoutSection) {
        this.highlightsPanelLayoutSection = highlightsPanelLayoutSection;
    }


    /**
     * Gets the id value for this DescribeLayout.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DescribeLayout.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the quickActionList value for this DescribeLayout.
     * 
     * @return quickActionList
     */
    public com.sforce.soap.partner.DescribeQuickActionListItemResult[] getQuickActionList() {
        return quickActionList;
    }


    /**
     * Sets the quickActionList value for this DescribeLayout.
     * 
     * @param quickActionList
     */
    public void setQuickActionList(com.sforce.soap.partner.DescribeQuickActionListItemResult[] quickActionList) {
        this.quickActionList = quickActionList;
    }


    /**
     * Gets the relatedContent value for this DescribeLayout.
     * 
     * @return relatedContent
     */
    public com.sforce.soap.partner.DescribeRelatedContentItem[] getRelatedContent() {
        return relatedContent;
    }


    /**
     * Sets the relatedContent value for this DescribeLayout.
     * 
     * @param relatedContent
     */
    public void setRelatedContent(com.sforce.soap.partner.DescribeRelatedContentItem[] relatedContent) {
        this.relatedContent = relatedContent;
    }


    /**
     * Gets the relatedLists value for this DescribeLayout.
     * 
     * @return relatedLists
     */
    public com.sforce.soap.partner.RelatedList[] getRelatedLists() {
        return relatedLists;
    }


    /**
     * Sets the relatedLists value for this DescribeLayout.
     * 
     * @param relatedLists
     */
    public void setRelatedLists(com.sforce.soap.partner.RelatedList[] relatedLists) {
        this.relatedLists = relatedLists;
    }

    public com.sforce.soap.partner.RelatedList getRelatedLists(int i) {
        return this.relatedLists[i];
    }

    public void setRelatedLists(int i, com.sforce.soap.partner.RelatedList _value) {
        this.relatedLists[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeLayout)) return false;
        DescribeLayout other = (DescribeLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buttonLayoutSection==null && other.getButtonLayoutSection()==null) || 
             (this.buttonLayoutSection!=null &&
              java.util.Arrays.equals(this.buttonLayoutSection, other.getButtonLayoutSection()))) &&
            ((this.detailLayoutSections==null && other.getDetailLayoutSections()==null) || 
             (this.detailLayoutSections!=null &&
              java.util.Arrays.equals(this.detailLayoutSections, other.getDetailLayoutSections()))) &&
            ((this.editLayoutSections==null && other.getEditLayoutSections()==null) || 
             (this.editLayoutSections!=null &&
              java.util.Arrays.equals(this.editLayoutSections, other.getEditLayoutSections()))) &&
            ((this.feedView==null && other.getFeedView()==null) || 
             (this.feedView!=null &&
              java.util.Arrays.equals(this.feedView, other.getFeedView()))) &&
            ((this.highlightsPanelLayoutSection==null && other.getHighlightsPanelLayoutSection()==null) || 
             (this.highlightsPanelLayoutSection!=null &&
              this.highlightsPanelLayoutSection.equals(other.getHighlightsPanelLayoutSection()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.quickActionList==null && other.getQuickActionList()==null) || 
             (this.quickActionList!=null &&
              java.util.Arrays.equals(this.quickActionList, other.getQuickActionList()))) &&
            ((this.relatedContent==null && other.getRelatedContent()==null) || 
             (this.relatedContent!=null &&
              java.util.Arrays.equals(this.relatedContent, other.getRelatedContent()))) &&
            ((this.relatedLists==null && other.getRelatedLists()==null) || 
             (this.relatedLists!=null &&
              java.util.Arrays.equals(this.relatedLists, other.getRelatedLists())));
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
        if (getButtonLayoutSection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getButtonLayoutSection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getButtonLayoutSection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailLayoutSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailLayoutSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailLayoutSections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEditLayoutSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditLayoutSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditLayoutSections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeedView() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedView());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedView(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHighlightsPanelLayoutSection() != null) {
            _hashCode += getHighlightsPanelLayoutSection().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getQuickActionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuickActionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuickActionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedLists(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonLayoutSection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "buttonLayoutSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutButton"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "detailButtons"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailLayoutSections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "detailLayoutSections"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editLayoutSections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "editLayoutSections"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedView");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "feedView"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutFeedFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "feedFilters"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highlightsPanelLayoutSection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "highlightsPanelLayoutSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionListItemResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionListItems"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "relatedContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeRelatedContentItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "relatedContentItems"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedLists");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "relatedLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RelatedList"));
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
