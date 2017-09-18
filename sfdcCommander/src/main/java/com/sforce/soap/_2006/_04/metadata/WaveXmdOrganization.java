/**
 * WaveXmdOrganization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WaveXmdOrganization  implements java.io.Serializable {
    private java.lang.String instanceUrl;

    private java.lang.String label;

    private java.lang.String organizationIdentifier;

    private int sortIndex;

    public WaveXmdOrganization() {
    }

    public WaveXmdOrganization(
           java.lang.String instanceUrl,
           java.lang.String label,
           java.lang.String organizationIdentifier,
           int sortIndex) {
           this.instanceUrl = instanceUrl;
           this.label = label;
           this.organizationIdentifier = organizationIdentifier;
           this.sortIndex = sortIndex;
    }


    /**
     * Gets the instanceUrl value for this WaveXmdOrganization.
     * 
     * @return instanceUrl
     */
    public java.lang.String getInstanceUrl() {
        return instanceUrl;
    }


    /**
     * Sets the instanceUrl value for this WaveXmdOrganization.
     * 
     * @param instanceUrl
     */
    public void setInstanceUrl(java.lang.String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }


    /**
     * Gets the label value for this WaveXmdOrganization.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this WaveXmdOrganization.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the organizationIdentifier value for this WaveXmdOrganization.
     * 
     * @return organizationIdentifier
     */
    public java.lang.String getOrganizationIdentifier() {
        return organizationIdentifier;
    }


    /**
     * Sets the organizationIdentifier value for this WaveXmdOrganization.
     * 
     * @param organizationIdentifier
     */
    public void setOrganizationIdentifier(java.lang.String organizationIdentifier) {
        this.organizationIdentifier = organizationIdentifier;
    }


    /**
     * Gets the sortIndex value for this WaveXmdOrganization.
     * 
     * @return sortIndex
     */
    public int getSortIndex() {
        return sortIndex;
    }


    /**
     * Sets the sortIndex value for this WaveXmdOrganization.
     * 
     * @param sortIndex
     */
    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaveXmdOrganization)) return false;
        WaveXmdOrganization other = (WaveXmdOrganization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instanceUrl==null && other.getInstanceUrl()==null) || 
             (this.instanceUrl!=null &&
              this.instanceUrl.equals(other.getInstanceUrl()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.organizationIdentifier==null && other.getOrganizationIdentifier()==null) || 
             (this.organizationIdentifier!=null &&
              this.organizationIdentifier.equals(other.getOrganizationIdentifier()))) &&
            this.sortIndex == other.getSortIndex();
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
        if (getInstanceUrl() != null) {
            _hashCode += getInstanceUrl().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getOrganizationIdentifier() != null) {
            _hashCode += getOrganizationIdentifier().hashCode();
        }
        _hashCode += getSortIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaveXmdOrganization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdOrganization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "instanceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "organizationIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
