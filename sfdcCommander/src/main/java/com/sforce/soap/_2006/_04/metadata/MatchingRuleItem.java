/**
 * MatchingRuleItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MatchingRuleItem  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.BlankValueBehavior blankValueBehavior;

    private java.lang.String fieldName;

    private com.sforce.soap._2006._04.metadata.MatchingMethod matchingMethod;

    public MatchingRuleItem() {
    }

    public MatchingRuleItem(
           com.sforce.soap._2006._04.metadata.BlankValueBehavior blankValueBehavior,
           java.lang.String fieldName,
           com.sforce.soap._2006._04.metadata.MatchingMethod matchingMethod) {
           this.blankValueBehavior = blankValueBehavior;
           this.fieldName = fieldName;
           this.matchingMethod = matchingMethod;
    }


    /**
     * Gets the blankValueBehavior value for this MatchingRuleItem.
     * 
     * @return blankValueBehavior
     */
    public com.sforce.soap._2006._04.metadata.BlankValueBehavior getBlankValueBehavior() {
        return blankValueBehavior;
    }


    /**
     * Sets the blankValueBehavior value for this MatchingRuleItem.
     * 
     * @param blankValueBehavior
     */
    public void setBlankValueBehavior(com.sforce.soap._2006._04.metadata.BlankValueBehavior blankValueBehavior) {
        this.blankValueBehavior = blankValueBehavior;
    }


    /**
     * Gets the fieldName value for this MatchingRuleItem.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this MatchingRuleItem.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the matchingMethod value for this MatchingRuleItem.
     * 
     * @return matchingMethod
     */
    public com.sforce.soap._2006._04.metadata.MatchingMethod getMatchingMethod() {
        return matchingMethod;
    }


    /**
     * Sets the matchingMethod value for this MatchingRuleItem.
     * 
     * @param matchingMethod
     */
    public void setMatchingMethod(com.sforce.soap._2006._04.metadata.MatchingMethod matchingMethod) {
        this.matchingMethod = matchingMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchingRuleItem)) return false;
        MatchingRuleItem other = (MatchingRuleItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blankValueBehavior==null && other.getBlankValueBehavior()==null) || 
             (this.blankValueBehavior!=null &&
              this.blankValueBehavior.equals(other.getBlankValueBehavior()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.matchingMethod==null && other.getMatchingMethod()==null) || 
             (this.matchingMethod!=null &&
              this.matchingMethod.equals(other.getMatchingMethod())));
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
        if (getBlankValueBehavior() != null) {
            _hashCode += getBlankValueBehavior().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getMatchingMethod() != null) {
            _hashCode += getMatchingMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchingRuleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingRuleItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blankValueBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "blankValueBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BlankValueBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "matchingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingMethod"));
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
