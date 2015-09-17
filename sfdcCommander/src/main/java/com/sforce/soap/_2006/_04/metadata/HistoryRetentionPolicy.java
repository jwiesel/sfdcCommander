/**
 * HistoryRetentionPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class HistoryRetentionPolicy  implements java.io.Serializable {
    private int archiveAfterMonths;

    private int archiveRetentionYears;

    private java.lang.String description;

    public HistoryRetentionPolicy() {
    }

    public HistoryRetentionPolicy(
           int archiveAfterMonths,
           int archiveRetentionYears,
           java.lang.String description) {
           this.archiveAfterMonths = archiveAfterMonths;
           this.archiveRetentionYears = archiveRetentionYears;
           this.description = description;
    }


    /**
     * Gets the archiveAfterMonths value for this HistoryRetentionPolicy.
     * 
     * @return archiveAfterMonths
     */
    public int getArchiveAfterMonths() {
        return archiveAfterMonths;
    }


    /**
     * Sets the archiveAfterMonths value for this HistoryRetentionPolicy.
     * 
     * @param archiveAfterMonths
     */
    public void setArchiveAfterMonths(int archiveAfterMonths) {
        this.archiveAfterMonths = archiveAfterMonths;
    }


    /**
     * Gets the archiveRetentionYears value for this HistoryRetentionPolicy.
     * 
     * @return archiveRetentionYears
     */
    public int getArchiveRetentionYears() {
        return archiveRetentionYears;
    }


    /**
     * Sets the archiveRetentionYears value for this HistoryRetentionPolicy.
     * 
     * @param archiveRetentionYears
     */
    public void setArchiveRetentionYears(int archiveRetentionYears) {
        this.archiveRetentionYears = archiveRetentionYears;
    }


    /**
     * Gets the description value for this HistoryRetentionPolicy.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HistoryRetentionPolicy.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoryRetentionPolicy)) return false;
        HistoryRetentionPolicy other = (HistoryRetentionPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.archiveAfterMonths == other.getArchiveAfterMonths() &&
            this.archiveRetentionYears == other.getArchiveRetentionYears() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        _hashCode += getArchiveAfterMonths();
        _hashCode += getArchiveRetentionYears();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistoryRetentionPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "HistoryRetentionPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveAfterMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "archiveAfterMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveRetentionYears");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "archiveRetentionYears"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
