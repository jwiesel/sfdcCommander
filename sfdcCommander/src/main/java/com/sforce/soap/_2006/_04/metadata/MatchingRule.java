/**
 * MatchingRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MatchingRule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String booleanFilter;

    private java.lang.String description;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.MatchingRuleItem[] matchingRuleItems;

    private com.sforce.soap._2006._04.metadata.MatchingRuleStatus ruleStatus;

    public MatchingRule() {
    }

    public MatchingRule(
           java.lang.String fullName,
           java.lang.String booleanFilter,
           java.lang.String description,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.MatchingRuleItem[] matchingRuleItems,
           com.sforce.soap._2006._04.metadata.MatchingRuleStatus ruleStatus) {
        super(
            fullName);
        this.booleanFilter = booleanFilter;
        this.description = description;
        this.label = label;
        this.matchingRuleItems = matchingRuleItems;
        this.ruleStatus = ruleStatus;
    }


    /**
     * Gets the booleanFilter value for this MatchingRule.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this MatchingRule.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the description value for this MatchingRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MatchingRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the label value for this MatchingRule.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this MatchingRule.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the matchingRuleItems value for this MatchingRule.
     * 
     * @return matchingRuleItems
     */
    public com.sforce.soap._2006._04.metadata.MatchingRuleItem[] getMatchingRuleItems() {
        return matchingRuleItems;
    }


    /**
     * Sets the matchingRuleItems value for this MatchingRule.
     * 
     * @param matchingRuleItems
     */
    public void setMatchingRuleItems(com.sforce.soap._2006._04.metadata.MatchingRuleItem[] matchingRuleItems) {
        this.matchingRuleItems = matchingRuleItems;
    }

    public com.sforce.soap._2006._04.metadata.MatchingRuleItem getMatchingRuleItems(int i) {
        return this.matchingRuleItems[i];
    }

    public void setMatchingRuleItems(int i, com.sforce.soap._2006._04.metadata.MatchingRuleItem _value) {
        this.matchingRuleItems[i] = _value;
    }


    /**
     * Gets the ruleStatus value for this MatchingRule.
     * 
     * @return ruleStatus
     */
    public com.sforce.soap._2006._04.metadata.MatchingRuleStatus getRuleStatus() {
        return ruleStatus;
    }


    /**
     * Sets the ruleStatus value for this MatchingRule.
     * 
     * @param ruleStatus
     */
    public void setRuleStatus(com.sforce.soap._2006._04.metadata.MatchingRuleStatus ruleStatus) {
        this.ruleStatus = ruleStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchingRule)) return false;
        MatchingRule other = (MatchingRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.matchingRuleItems==null && other.getMatchingRuleItems()==null) || 
             (this.matchingRuleItems!=null &&
              java.util.Arrays.equals(this.matchingRuleItems, other.getMatchingRuleItems()))) &&
            ((this.ruleStatus==null && other.getRuleStatus()==null) || 
             (this.ruleStatus!=null &&
              this.ruleStatus.equals(other.getRuleStatus())));
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
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getMatchingRuleItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchingRuleItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchingRuleItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRuleStatus() != null) {
            _hashCode += getRuleStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchingRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingRuleItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "matchingRuleItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingRuleItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ruleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingRuleStatus"));
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
