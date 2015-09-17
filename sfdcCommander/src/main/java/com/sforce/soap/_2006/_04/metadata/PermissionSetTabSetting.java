/**
 * PermissionSetTabSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PermissionSetTabSetting  implements java.io.Serializable {
    private java.lang.String tab;

    private com.sforce.soap._2006._04.metadata.PermissionSetTabVisibility visibility;

    public PermissionSetTabSetting() {
    }

    public PermissionSetTabSetting(
           java.lang.String tab,
           com.sforce.soap._2006._04.metadata.PermissionSetTabVisibility visibility) {
           this.tab = tab;
           this.visibility = visibility;
    }


    /**
     * Gets the tab value for this PermissionSetTabSetting.
     * 
     * @return tab
     */
    public java.lang.String getTab() {
        return tab;
    }


    /**
     * Sets the tab value for this PermissionSetTabSetting.
     * 
     * @param tab
     */
    public void setTab(java.lang.String tab) {
        this.tab = tab;
    }


    /**
     * Gets the visibility value for this PermissionSetTabSetting.
     * 
     * @return visibility
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetTabVisibility getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this PermissionSetTabSetting.
     * 
     * @param visibility
     */
    public void setVisibility(com.sforce.soap._2006._04.metadata.PermissionSetTabVisibility visibility) {
        this.visibility = visibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermissionSetTabSetting)) return false;
        PermissionSetTabSetting other = (PermissionSetTabSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tab==null && other.getTab()==null) || 
             (this.tab!=null &&
              this.tab.equals(other.getTab()))) &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility())));
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
        if (getTab() != null) {
            _hashCode += getTab().hashCode();
        }
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermissionSetTabSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetTabSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "visibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetTabVisibility"));
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
