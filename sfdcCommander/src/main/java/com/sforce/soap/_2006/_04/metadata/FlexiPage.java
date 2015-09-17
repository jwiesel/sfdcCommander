/**
 * FlexiPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlexiPage  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.FlexiPageRegion[] flexiPageRegions;

    private java.lang.String masterLabel;

    private java.lang.String pageTemplate;

    private com.sforce.soap._2006._04.metadata.PlatformActionList platformActionlist;

    private com.sforce.soap._2006._04.metadata.QuickActionListItem[] quickActionList;

    private java.lang.String sobjectType;

    private com.sforce.soap._2006._04.metadata.FlexiPageType type;

    public FlexiPage() {
    }

    public FlexiPage(
           java.lang.String fullName,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.FlexiPageRegion[] flexiPageRegions,
           java.lang.String masterLabel,
           java.lang.String pageTemplate,
           com.sforce.soap._2006._04.metadata.PlatformActionList platformActionlist,
           com.sforce.soap._2006._04.metadata.QuickActionListItem[] quickActionList,
           java.lang.String sobjectType,
           com.sforce.soap._2006._04.metadata.FlexiPageType type) {
        super(
            fullName);
        this.description = description;
        this.flexiPageRegions = flexiPageRegions;
        this.masterLabel = masterLabel;
        this.pageTemplate = pageTemplate;
        this.platformActionlist = platformActionlist;
        this.quickActionList = quickActionList;
        this.sobjectType = sobjectType;
        this.type = type;
    }


    /**
     * Gets the description value for this FlexiPage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FlexiPage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the flexiPageRegions value for this FlexiPage.
     * 
     * @return flexiPageRegions
     */
    public com.sforce.soap._2006._04.metadata.FlexiPageRegion[] getFlexiPageRegions() {
        return flexiPageRegions;
    }


    /**
     * Sets the flexiPageRegions value for this FlexiPage.
     * 
     * @param flexiPageRegions
     */
    public void setFlexiPageRegions(com.sforce.soap._2006._04.metadata.FlexiPageRegion[] flexiPageRegions) {
        this.flexiPageRegions = flexiPageRegions;
    }

    public com.sforce.soap._2006._04.metadata.FlexiPageRegion getFlexiPageRegions(int i) {
        return this.flexiPageRegions[i];
    }

    public void setFlexiPageRegions(int i, com.sforce.soap._2006._04.metadata.FlexiPageRegion _value) {
        this.flexiPageRegions[i] = _value;
    }


    /**
     * Gets the masterLabel value for this FlexiPage.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this FlexiPage.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the pageTemplate value for this FlexiPage.
     * 
     * @return pageTemplate
     */
    public java.lang.String getPageTemplate() {
        return pageTemplate;
    }


    /**
     * Sets the pageTemplate value for this FlexiPage.
     * 
     * @param pageTemplate
     */
    public void setPageTemplate(java.lang.String pageTemplate) {
        this.pageTemplate = pageTemplate;
    }


    /**
     * Gets the platformActionlist value for this FlexiPage.
     * 
     * @return platformActionlist
     */
    public com.sforce.soap._2006._04.metadata.PlatformActionList getPlatformActionlist() {
        return platformActionlist;
    }


    /**
     * Sets the platformActionlist value for this FlexiPage.
     * 
     * @param platformActionlist
     */
    public void setPlatformActionlist(com.sforce.soap._2006._04.metadata.PlatformActionList platformActionlist) {
        this.platformActionlist = platformActionlist;
    }


    /**
     * Gets the quickActionList value for this FlexiPage.
     * 
     * @return quickActionList
     */
    public com.sforce.soap._2006._04.metadata.QuickActionListItem[] getQuickActionList() {
        return quickActionList;
    }


    /**
     * Sets the quickActionList value for this FlexiPage.
     * 
     * @param quickActionList
     */
    public void setQuickActionList(com.sforce.soap._2006._04.metadata.QuickActionListItem[] quickActionList) {
        this.quickActionList = quickActionList;
    }


    /**
     * Gets the sobjectType value for this FlexiPage.
     * 
     * @return sobjectType
     */
    public java.lang.String getSobjectType() {
        return sobjectType;
    }


    /**
     * Sets the sobjectType value for this FlexiPage.
     * 
     * @param sobjectType
     */
    public void setSobjectType(java.lang.String sobjectType) {
        this.sobjectType = sobjectType;
    }


    /**
     * Gets the type value for this FlexiPage.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.FlexiPageType getType() {
        return type;
    }


    /**
     * Sets the type value for this FlexiPage.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.FlexiPageType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexiPage)) return false;
        FlexiPage other = (FlexiPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.flexiPageRegions==null && other.getFlexiPageRegions()==null) || 
             (this.flexiPageRegions!=null &&
              java.util.Arrays.equals(this.flexiPageRegions, other.getFlexiPageRegions()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.pageTemplate==null && other.getPageTemplate()==null) || 
             (this.pageTemplate!=null &&
              this.pageTemplate.equals(other.getPageTemplate()))) &&
            ((this.platformActionlist==null && other.getPlatformActionlist()==null) || 
             (this.platformActionlist!=null &&
              this.platformActionlist.equals(other.getPlatformActionlist()))) &&
            ((this.quickActionList==null && other.getQuickActionList()==null) || 
             (this.quickActionList!=null &&
              java.util.Arrays.equals(this.quickActionList, other.getQuickActionList()))) &&
            ((this.sobjectType==null && other.getSobjectType()==null) || 
             (this.sobjectType!=null &&
              this.sobjectType.equals(other.getSobjectType()))) &&
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
        int _hashCode = super.hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFlexiPageRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlexiPageRegions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlexiPageRegions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getPageTemplate() != null) {
            _hashCode += getPageTemplate().hashCode();
        }
        if (getPlatformActionlist() != null) {
            _hashCode += getPlatformActionlist().hashCode();
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
        if (getSobjectType() != null) {
            _hashCode += getSobjectType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexiPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexiPageRegions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "flexiPageRegions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageRegion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformActionlist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "platformActionlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformActionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionListItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionListItems"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageType"));
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
