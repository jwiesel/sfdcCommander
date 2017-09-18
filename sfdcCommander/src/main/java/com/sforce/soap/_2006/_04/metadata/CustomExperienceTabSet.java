/**
 * CustomExperienceTabSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomExperienceTabSet  implements java.io.Serializable {
    private java.lang.String[] customTab;

    private java.lang.String defaultTab;

    private java.lang.String[] standardTab;

    public CustomExperienceTabSet() {
    }

    public CustomExperienceTabSet(
           java.lang.String[] customTab,
           java.lang.String defaultTab,
           java.lang.String[] standardTab) {
           this.customTab = customTab;
           this.defaultTab = defaultTab;
           this.standardTab = standardTab;
    }


    /**
     * Gets the customTab value for this CustomExperienceTabSet.
     * 
     * @return customTab
     */
    public java.lang.String[] getCustomTab() {
        return customTab;
    }


    /**
     * Sets the customTab value for this CustomExperienceTabSet.
     * 
     * @param customTab
     */
    public void setCustomTab(java.lang.String[] customTab) {
        this.customTab = customTab;
    }

    public java.lang.String getCustomTab(int i) {
        return this.customTab[i];
    }

    public void setCustomTab(int i, java.lang.String _value) {
        this.customTab[i] = _value;
    }


    /**
     * Gets the defaultTab value for this CustomExperienceTabSet.
     * 
     * @return defaultTab
     */
    public java.lang.String getDefaultTab() {
        return defaultTab;
    }


    /**
     * Sets the defaultTab value for this CustomExperienceTabSet.
     * 
     * @param defaultTab
     */
    public void setDefaultTab(java.lang.String defaultTab) {
        this.defaultTab = defaultTab;
    }


    /**
     * Gets the standardTab value for this CustomExperienceTabSet.
     * 
     * @return standardTab
     */
    public java.lang.String[] getStandardTab() {
        return standardTab;
    }


    /**
     * Sets the standardTab value for this CustomExperienceTabSet.
     * 
     * @param standardTab
     */
    public void setStandardTab(java.lang.String[] standardTab) {
        this.standardTab = standardTab;
    }

    public java.lang.String getStandardTab(int i) {
        return this.standardTab[i];
    }

    public void setStandardTab(int i, java.lang.String _value) {
        this.standardTab[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomExperienceTabSet)) return false;
        CustomExperienceTabSet other = (CustomExperienceTabSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customTab==null && other.getCustomTab()==null) || 
             (this.customTab!=null &&
              java.util.Arrays.equals(this.customTab, other.getCustomTab()))) &&
            ((this.defaultTab==null && other.getDefaultTab()==null) || 
             (this.defaultTab!=null &&
              this.defaultTab.equals(other.getDefaultTab()))) &&
            ((this.standardTab==null && other.getStandardTab()==null) || 
             (this.standardTab!=null &&
              java.util.Arrays.equals(this.standardTab, other.getStandardTab())));
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
        if (getCustomTab() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomTab());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomTab(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultTab() != null) {
            _hashCode += getDefaultTab().hashCode();
        }
        if (getStandardTab() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStandardTab());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStandardTab(), i);
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
        new org.apache.axis.description.TypeDesc(CustomExperienceTabSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomExperienceTabSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "standardTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
