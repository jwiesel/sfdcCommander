/**
 * Territory2Rule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Territory2Rule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean active;

    private java.lang.String booleanFilter;

    private java.lang.String name;

    private java.lang.String objectType;

    private com.sforce.soap._2006._04.metadata.Territory2RuleItem[] ruleItems;

    public Territory2Rule() {
    }

    public Territory2Rule(
           java.lang.String fullName,
           boolean active,
           java.lang.String booleanFilter,
           java.lang.String name,
           java.lang.String objectType,
           com.sforce.soap._2006._04.metadata.Territory2RuleItem[] ruleItems) {
        super(
            fullName);
        this.active = active;
        this.booleanFilter = booleanFilter;
        this.name = name;
        this.objectType = objectType;
        this.ruleItems = ruleItems;
    }


    /**
     * Gets the active value for this Territory2Rule.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Territory2Rule.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the booleanFilter value for this Territory2Rule.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this Territory2Rule.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the name value for this Territory2Rule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Territory2Rule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the objectType value for this Territory2Rule.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this Territory2Rule.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the ruleItems value for this Territory2Rule.
     * 
     * @return ruleItems
     */
    public com.sforce.soap._2006._04.metadata.Territory2RuleItem[] getRuleItems() {
        return ruleItems;
    }


    /**
     * Sets the ruleItems value for this Territory2Rule.
     * 
     * @param ruleItems
     */
    public void setRuleItems(com.sforce.soap._2006._04.metadata.Territory2RuleItem[] ruleItems) {
        this.ruleItems = ruleItems;
    }

    public com.sforce.soap._2006._04.metadata.Territory2RuleItem getRuleItems(int i) {
        return this.ruleItems[i];
    }

    public void setRuleItems(int i, com.sforce.soap._2006._04.metadata.Territory2RuleItem _value) {
        this.ruleItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Territory2Rule)) return false;
        Territory2Rule other = (Territory2Rule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.ruleItems==null && other.getRuleItems()==null) || 
             (this.ruleItems!=null &&
              java.util.Arrays.equals(this.ruleItems, other.getRuleItems())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getRuleItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleItems(), i);
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
        new org.apache.axis.description.TypeDesc(Territory2Rule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory2Rule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ruleItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory2RuleItem"));
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
