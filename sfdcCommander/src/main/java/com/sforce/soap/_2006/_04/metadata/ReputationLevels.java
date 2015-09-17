/**
 * ReputationLevels.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReputationLevels  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ChatterAnswersReputationLevel[] chatterAnswersReputationLevels;

    private com.sforce.soap._2006._04.metadata.IdeaReputationLevel[] ideaReputationLevels;

    public ReputationLevels() {
    }

    public ReputationLevels(
           com.sforce.soap._2006._04.metadata.ChatterAnswersReputationLevel[] chatterAnswersReputationLevels,
           com.sforce.soap._2006._04.metadata.IdeaReputationLevel[] ideaReputationLevels) {
           this.chatterAnswersReputationLevels = chatterAnswersReputationLevels;
           this.ideaReputationLevels = ideaReputationLevels;
    }


    /**
     * Gets the chatterAnswersReputationLevels value for this ReputationLevels.
     * 
     * @return chatterAnswersReputationLevels
     */
    public com.sforce.soap._2006._04.metadata.ChatterAnswersReputationLevel[] getChatterAnswersReputationLevels() {
        return chatterAnswersReputationLevels;
    }


    /**
     * Sets the chatterAnswersReputationLevels value for this ReputationLevels.
     * 
     * @param chatterAnswersReputationLevels
     */
    public void setChatterAnswersReputationLevels(com.sforce.soap._2006._04.metadata.ChatterAnswersReputationLevel[] chatterAnswersReputationLevels) {
        this.chatterAnswersReputationLevels = chatterAnswersReputationLevels;
    }

    public com.sforce.soap._2006._04.metadata.ChatterAnswersReputationLevel getChatterAnswersReputationLevels(int i) {
        return this.chatterAnswersReputationLevels[i];
    }

    public void setChatterAnswersReputationLevels(int i, com.sforce.soap._2006._04.metadata.ChatterAnswersReputationLevel _value) {
        this.chatterAnswersReputationLevels[i] = _value;
    }


    /**
     * Gets the ideaReputationLevels value for this ReputationLevels.
     * 
     * @return ideaReputationLevels
     */
    public com.sforce.soap._2006._04.metadata.IdeaReputationLevel[] getIdeaReputationLevels() {
        return ideaReputationLevels;
    }


    /**
     * Sets the ideaReputationLevels value for this ReputationLevels.
     * 
     * @param ideaReputationLevels
     */
    public void setIdeaReputationLevels(com.sforce.soap._2006._04.metadata.IdeaReputationLevel[] ideaReputationLevels) {
        this.ideaReputationLevels = ideaReputationLevels;
    }

    public com.sforce.soap._2006._04.metadata.IdeaReputationLevel getIdeaReputationLevels(int i) {
        return this.ideaReputationLevels[i];
    }

    public void setIdeaReputationLevels(int i, com.sforce.soap._2006._04.metadata.IdeaReputationLevel _value) {
        this.ideaReputationLevels[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReputationLevels)) return false;
        ReputationLevels other = (ReputationLevels) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chatterAnswersReputationLevels==null && other.getChatterAnswersReputationLevels()==null) || 
             (this.chatterAnswersReputationLevels!=null &&
              java.util.Arrays.equals(this.chatterAnswersReputationLevels, other.getChatterAnswersReputationLevels()))) &&
            ((this.ideaReputationLevels==null && other.getIdeaReputationLevels()==null) || 
             (this.ideaReputationLevels!=null &&
              java.util.Arrays.equals(this.ideaReputationLevels, other.getIdeaReputationLevels())));
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
        if (getChatterAnswersReputationLevels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChatterAnswersReputationLevels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChatterAnswersReputationLevels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdeaReputationLevels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdeaReputationLevels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdeaReputationLevels(), i);
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
        new org.apache.axis.description.TypeDesc(ReputationLevels.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReputationLevels"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatterAnswersReputationLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatterAnswersReputationLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChatterAnswersReputationLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideaReputationLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ideaReputationLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IdeaReputationLevel"));
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
