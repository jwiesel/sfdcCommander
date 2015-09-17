/**
 * DashboardFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardFilter  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.DashboardFilterOption[] dashboardFilterOptions;

    private java.lang.String name;

    public DashboardFilter() {
    }

    public DashboardFilter(
           com.sforce.soap._2006._04.metadata.DashboardFilterOption[] dashboardFilterOptions,
           java.lang.String name) {
           this.dashboardFilterOptions = dashboardFilterOptions;
           this.name = name;
    }


    /**
     * Gets the dashboardFilterOptions value for this DashboardFilter.
     * 
     * @return dashboardFilterOptions
     */
    public com.sforce.soap._2006._04.metadata.DashboardFilterOption[] getDashboardFilterOptions() {
        return dashboardFilterOptions;
    }


    /**
     * Sets the dashboardFilterOptions value for this DashboardFilter.
     * 
     * @param dashboardFilterOptions
     */
    public void setDashboardFilterOptions(com.sforce.soap._2006._04.metadata.DashboardFilterOption[] dashboardFilterOptions) {
        this.dashboardFilterOptions = dashboardFilterOptions;
    }

    public com.sforce.soap._2006._04.metadata.DashboardFilterOption getDashboardFilterOptions(int i) {
        return this.dashboardFilterOptions[i];
    }

    public void setDashboardFilterOptions(int i, com.sforce.soap._2006._04.metadata.DashboardFilterOption _value) {
        this.dashboardFilterOptions[i] = _value;
    }


    /**
     * Gets the name value for this DashboardFilter.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DashboardFilter.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashboardFilter)) return false;
        DashboardFilter other = (DashboardFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dashboardFilterOptions==null && other.getDashboardFilterOptions()==null) || 
             (this.dashboardFilterOptions!=null &&
              java.util.Arrays.equals(this.dashboardFilterOptions, other.getDashboardFilterOptions()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getDashboardFilterOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDashboardFilterOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDashboardFilterOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DashboardFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardFilterOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardFilterOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilterOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
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
