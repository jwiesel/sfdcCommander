/**
 * DashboardComponentSection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardComponentSection  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.DashboardComponentSize columnSize;

    private com.sforce.soap._2006._04.metadata.DashboardComponent[] components;

    public DashboardComponentSection() {
    }

    public DashboardComponentSection(
           com.sforce.soap._2006._04.metadata.DashboardComponentSize columnSize,
           com.sforce.soap._2006._04.metadata.DashboardComponent[] components) {
           this.columnSize = columnSize;
           this.components = components;
    }


    /**
     * Gets the columnSize value for this DashboardComponentSection.
     * 
     * @return columnSize
     */
    public com.sforce.soap._2006._04.metadata.DashboardComponentSize getColumnSize() {
        return columnSize;
    }


    /**
     * Sets the columnSize value for this DashboardComponentSection.
     * 
     * @param columnSize
     */
    public void setColumnSize(com.sforce.soap._2006._04.metadata.DashboardComponentSize columnSize) {
        this.columnSize = columnSize;
    }


    /**
     * Gets the components value for this DashboardComponentSection.
     * 
     * @return components
     */
    public com.sforce.soap._2006._04.metadata.DashboardComponent[] getComponents() {
        return components;
    }


    /**
     * Sets the components value for this DashboardComponentSection.
     * 
     * @param components
     */
    public void setComponents(com.sforce.soap._2006._04.metadata.DashboardComponent[] components) {
        this.components = components;
    }

    public com.sforce.soap._2006._04.metadata.DashboardComponent getComponents(int i) {
        return this.components[i];
    }

    public void setComponents(int i, com.sforce.soap._2006._04.metadata.DashboardComponent _value) {
        this.components[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashboardComponentSection)) return false;
        DashboardComponentSection other = (DashboardComponentSection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnSize==null && other.getColumnSize()==null) || 
             (this.columnSize!=null &&
              this.columnSize.equals(other.getColumnSize()))) &&
            ((this.components==null && other.getComponents()==null) || 
             (this.components!=null &&
              java.util.Arrays.equals(this.components, other.getComponents())));
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
        if (getColumnSize() != null) {
            _hashCode += getColumnSize().hashCode();
        }
        if (getComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponents(), i);
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
        new org.apache.axis.description.TypeDesc(DashboardComponentSection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentSection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "columnSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentSize"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("components");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "components"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponent"));
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
