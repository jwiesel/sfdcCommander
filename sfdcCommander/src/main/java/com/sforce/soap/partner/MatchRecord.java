/**
 * MatchRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class MatchRecord  implements java.io.Serializable {
    private com.sforce.soap.partner.AdditionalInformationMap[] additionalInformation;

    private com.sforce.soap.partner.FieldDiff[] fieldDiffs;

    private double matchConfidence;

    private com.sforce.soap.partner.sobject.SObject record;

    public MatchRecord() {
    }

    public MatchRecord(
           com.sforce.soap.partner.AdditionalInformationMap[] additionalInformation,
           com.sforce.soap.partner.FieldDiff[] fieldDiffs,
           double matchConfidence,
           com.sforce.soap.partner.sobject.SObject record) {
           this.additionalInformation = additionalInformation;
           this.fieldDiffs = fieldDiffs;
           this.matchConfidence = matchConfidence;
           this.record = record;
    }


    /**
     * Gets the additionalInformation value for this MatchRecord.
     * 
     * @return additionalInformation
     */
    public com.sforce.soap.partner.AdditionalInformationMap[] getAdditionalInformation() {
        return additionalInformation;
    }


    /**
     * Sets the additionalInformation value for this MatchRecord.
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(com.sforce.soap.partner.AdditionalInformationMap[] additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public com.sforce.soap.partner.AdditionalInformationMap getAdditionalInformation(int i) {
        return this.additionalInformation[i];
    }

    public void setAdditionalInformation(int i, com.sforce.soap.partner.AdditionalInformationMap _value) {
        this.additionalInformation[i] = _value;
    }


    /**
     * Gets the fieldDiffs value for this MatchRecord.
     * 
     * @return fieldDiffs
     */
    public com.sforce.soap.partner.FieldDiff[] getFieldDiffs() {
        return fieldDiffs;
    }


    /**
     * Sets the fieldDiffs value for this MatchRecord.
     * 
     * @param fieldDiffs
     */
    public void setFieldDiffs(com.sforce.soap.partner.FieldDiff[] fieldDiffs) {
        this.fieldDiffs = fieldDiffs;
    }

    public com.sforce.soap.partner.FieldDiff getFieldDiffs(int i) {
        return this.fieldDiffs[i];
    }

    public void setFieldDiffs(int i, com.sforce.soap.partner.FieldDiff _value) {
        this.fieldDiffs[i] = _value;
    }


    /**
     * Gets the matchConfidence value for this MatchRecord.
     * 
     * @return matchConfidence
     */
    public double getMatchConfidence() {
        return matchConfidence;
    }


    /**
     * Sets the matchConfidence value for this MatchRecord.
     * 
     * @param matchConfidence
     */
    public void setMatchConfidence(double matchConfidence) {
        this.matchConfidence = matchConfidence;
    }


    /**
     * Gets the record value for this MatchRecord.
     * 
     * @return record
     */
    public com.sforce.soap.partner.sobject.SObject getRecord() {
        return record;
    }


    /**
     * Sets the record value for this MatchRecord.
     * 
     * @param record
     */
    public void setRecord(com.sforce.soap.partner.sobject.SObject record) {
        this.record = record;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchRecord)) return false;
        MatchRecord other = (MatchRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalInformation==null && other.getAdditionalInformation()==null) || 
             (this.additionalInformation!=null &&
              java.util.Arrays.equals(this.additionalInformation, other.getAdditionalInformation()))) &&
            ((this.fieldDiffs==null && other.getFieldDiffs()==null) || 
             (this.fieldDiffs!=null &&
              java.util.Arrays.equals(this.fieldDiffs, other.getFieldDiffs()))) &&
            this.matchConfidence == other.getMatchConfidence() &&
            ((this.record==null && other.getRecord()==null) || 
             (this.record!=null &&
              this.record.equals(other.getRecord())));
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
        if (getAdditionalInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldDiffs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldDiffs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldDiffs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getMatchConfidence()).hashCode();
        if (getRecord() != null) {
            _hashCode += getRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MatchRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "additionalInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "AdditionalInformationMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDiffs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldDiffs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FieldDiff"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchConfidence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "matchConfidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("record");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "record"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject"));
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
