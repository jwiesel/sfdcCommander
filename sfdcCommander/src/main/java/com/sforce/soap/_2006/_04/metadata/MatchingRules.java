/**
 * MatchingRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MatchingRules  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.MatchingRule[] matchingRules;

    public MatchingRules() {
    }

    public MatchingRules(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.MatchingRule[] matchingRules) {
        super(
            fullName);
        this.matchingRules = matchingRules;
    }


    /**
     * Gets the matchingRules value for this MatchingRules.
     * 
     * @return matchingRules
     */
    public com.sforce.soap._2006._04.metadata.MatchingRule[] getMatchingRules() {
        return matchingRules;
    }


    /**
     * Sets the matchingRules value for this MatchingRules.
     * 
     * @param matchingRules
     */
    public void setMatchingRules(com.sforce.soap._2006._04.metadata.MatchingRule[] matchingRules) {
        this.matchingRules = matchingRules;
    }

    public com.sforce.soap._2006._04.metadata.MatchingRule getMatchingRules(int i) {
        return this.matchingRules[i];
    }

    public void setMatchingRules(int i, com.sforce.soap._2006._04.metadata.MatchingRule _value) {
        this.matchingRules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchingRules)) return false;
        MatchingRules other = (MatchingRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.matchingRules==null && other.getMatchingRules()==null) || 
             (this.matchingRules!=null &&
              java.util.Arrays.equals(this.matchingRules, other.getMatchingRules())));
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
        if (getMatchingRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchingRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchingRules(), i);
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
        new org.apache.axis.description.TypeDesc(MatchingRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "matchingRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MatchingRule"));
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
