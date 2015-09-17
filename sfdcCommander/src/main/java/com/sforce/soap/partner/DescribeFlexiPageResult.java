/**
 * DescribeFlexiPageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeFlexiPageResult  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String label;

    private java.lang.String name;

    private com.sforce.soap.partner.DescribeQuickActionListItemResult[] quickActionList;

    private com.sforce.soap.partner.DescribeFlexiPageRegion[] regions;

    private java.lang.String sobjectType;

    private java.lang.String template;

    private java.lang.String type;

    public DescribeFlexiPageResult() {
    }

    public DescribeFlexiPageResult(
           java.lang.String id,
           java.lang.String label,
           java.lang.String name,
           com.sforce.soap.partner.DescribeQuickActionListItemResult[] quickActionList,
           com.sforce.soap.partner.DescribeFlexiPageRegion[] regions,
           java.lang.String sobjectType,
           java.lang.String template,
           java.lang.String type) {
           this.id = id;
           this.label = label;
           this.name = name;
           this.quickActionList = quickActionList;
           this.regions = regions;
           this.sobjectType = sobjectType;
           this.template = template;
           this.type = type;
    }


    /**
     * Gets the id value for this DescribeFlexiPageResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DescribeFlexiPageResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the label value for this DescribeFlexiPageResult.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeFlexiPageResult.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the name value for this DescribeFlexiPageResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeFlexiPageResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the quickActionList value for this DescribeFlexiPageResult.
     * 
     * @return quickActionList
     */
    public com.sforce.soap.partner.DescribeQuickActionListItemResult[] getQuickActionList() {
        return quickActionList;
    }


    /**
     * Sets the quickActionList value for this DescribeFlexiPageResult.
     * 
     * @param quickActionList
     */
    public void setQuickActionList(com.sforce.soap.partner.DescribeQuickActionListItemResult[] quickActionList) {
        this.quickActionList = quickActionList;
    }


    /**
     * Gets the regions value for this DescribeFlexiPageResult.
     * 
     * @return regions
     */
    public com.sforce.soap.partner.DescribeFlexiPageRegion[] getRegions() {
        return regions;
    }


    /**
     * Sets the regions value for this DescribeFlexiPageResult.
     * 
     * @param regions
     */
    public void setRegions(com.sforce.soap.partner.DescribeFlexiPageRegion[] regions) {
        this.regions = regions;
    }

    public com.sforce.soap.partner.DescribeFlexiPageRegion getRegions(int i) {
        return this.regions[i];
    }

    public void setRegions(int i, com.sforce.soap.partner.DescribeFlexiPageRegion _value) {
        this.regions[i] = _value;
    }


    /**
     * Gets the sobjectType value for this DescribeFlexiPageResult.
     * 
     * @return sobjectType
     */
    public java.lang.String getSobjectType() {
        return sobjectType;
    }


    /**
     * Sets the sobjectType value for this DescribeFlexiPageResult.
     * 
     * @param sobjectType
     */
    public void setSobjectType(java.lang.String sobjectType) {
        this.sobjectType = sobjectType;
    }


    /**
     * Gets the template value for this DescribeFlexiPageResult.
     * 
     * @return template
     */
    public java.lang.String getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this DescribeFlexiPageResult.
     * 
     * @param template
     */
    public void setTemplate(java.lang.String template) {
        this.template = template;
    }


    /**
     * Gets the type value for this DescribeFlexiPageResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DescribeFlexiPageResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeFlexiPageResult)) return false;
        DescribeFlexiPageResult other = (DescribeFlexiPageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.quickActionList==null && other.getQuickActionList()==null) || 
             (this.quickActionList!=null &&
              java.util.Arrays.equals(this.quickActionList, other.getQuickActionList()))) &&
            ((this.regions==null && other.getRegions()==null) || 
             (this.regions!=null &&
              java.util.Arrays.equals(this.regions, other.getRegions()))) &&
            ((this.sobjectType==null && other.getSobjectType()==null) || 
             (this.sobjectType!=null &&
              this.sobjectType.equals(other.getSobjectType()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        if (getRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSobjectType() != null) {
            _hashCode += getSobjectType().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeFlexiPageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeFlexiPageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
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
        elemField.setFieldName("quickActionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionListItemResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionListItems"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "regions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeFlexiPageRegion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "template"));
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
