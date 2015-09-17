/**
 * Territory2SettingsOpportunityFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Territory2SettingsOpportunityFilter  implements java.io.Serializable {
    private java.lang.String apexClassName;

    private boolean enableFilter;

    private boolean runOnCreate;

    public Territory2SettingsOpportunityFilter() {
    }

    public Territory2SettingsOpportunityFilter(
           java.lang.String apexClassName,
           boolean enableFilter,
           boolean runOnCreate) {
           this.apexClassName = apexClassName;
           this.enableFilter = enableFilter;
           this.runOnCreate = runOnCreate;
    }


    /**
     * Gets the apexClassName value for this Territory2SettingsOpportunityFilter.
     * 
     * @return apexClassName
     */
    public java.lang.String getApexClassName() {
        return apexClassName;
    }


    /**
     * Sets the apexClassName value for this Territory2SettingsOpportunityFilter.
     * 
     * @param apexClassName
     */
    public void setApexClassName(java.lang.String apexClassName) {
        this.apexClassName = apexClassName;
    }


    /**
     * Gets the enableFilter value for this Territory2SettingsOpportunityFilter.
     * 
     * @return enableFilter
     */
    public boolean isEnableFilter() {
        return enableFilter;
    }


    /**
     * Sets the enableFilter value for this Territory2SettingsOpportunityFilter.
     * 
     * @param enableFilter
     */
    public void setEnableFilter(boolean enableFilter) {
        this.enableFilter = enableFilter;
    }


    /**
     * Gets the runOnCreate value for this Territory2SettingsOpportunityFilter.
     * 
     * @return runOnCreate
     */
    public boolean isRunOnCreate() {
        return runOnCreate;
    }


    /**
     * Sets the runOnCreate value for this Territory2SettingsOpportunityFilter.
     * 
     * @param runOnCreate
     */
    public void setRunOnCreate(boolean runOnCreate) {
        this.runOnCreate = runOnCreate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Territory2SettingsOpportunityFilter)) return false;
        Territory2SettingsOpportunityFilter other = (Territory2SettingsOpportunityFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apexClassName==null && other.getApexClassName()==null) || 
             (this.apexClassName!=null &&
              this.apexClassName.equals(other.getApexClassName()))) &&
            this.enableFilter == other.isEnableFilter() &&
            this.runOnCreate == other.isRunOnCreate();
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
        if (getApexClassName() != null) {
            _hashCode += getApexClassName().hashCode();
        }
        _hashCode += (isEnableFilter() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRunOnCreate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Territory2SettingsOpportunityFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory2SettingsOpportunityFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apexClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runOnCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "runOnCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
