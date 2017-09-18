/**
 * DashboardGridLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardGridLayout  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.DashboardGridComponent[] dashboardGridComponents;

    private int numberOfColumns;

    private int rowHeight;

    public DashboardGridLayout() {
    }

    public DashboardGridLayout(
           com.sforce.soap._2006._04.metadata.DashboardGridComponent[] dashboardGridComponents,
           int numberOfColumns,
           int rowHeight) {
           this.dashboardGridComponents = dashboardGridComponents;
           this.numberOfColumns = numberOfColumns;
           this.rowHeight = rowHeight;
    }


    /**
     * Gets the dashboardGridComponents value for this DashboardGridLayout.
     * 
     * @return dashboardGridComponents
     */
    public com.sforce.soap._2006._04.metadata.DashboardGridComponent[] getDashboardGridComponents() {
        return dashboardGridComponents;
    }


    /**
     * Sets the dashboardGridComponents value for this DashboardGridLayout.
     * 
     * @param dashboardGridComponents
     */
    public void setDashboardGridComponents(com.sforce.soap._2006._04.metadata.DashboardGridComponent[] dashboardGridComponents) {
        this.dashboardGridComponents = dashboardGridComponents;
    }

    public com.sforce.soap._2006._04.metadata.DashboardGridComponent getDashboardGridComponents(int i) {
        return this.dashboardGridComponents[i];
    }

    public void setDashboardGridComponents(int i, com.sforce.soap._2006._04.metadata.DashboardGridComponent _value) {
        this.dashboardGridComponents[i] = _value;
    }


    /**
     * Gets the numberOfColumns value for this DashboardGridLayout.
     * 
     * @return numberOfColumns
     */
    public int getNumberOfColumns() {
        return numberOfColumns;
    }


    /**
     * Sets the numberOfColumns value for this DashboardGridLayout.
     * 
     * @param numberOfColumns
     */
    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }


    /**
     * Gets the rowHeight value for this DashboardGridLayout.
     * 
     * @return rowHeight
     */
    public int getRowHeight() {
        return rowHeight;
    }


    /**
     * Sets the rowHeight value for this DashboardGridLayout.
     * 
     * @param rowHeight
     */
    public void setRowHeight(int rowHeight) {
        this.rowHeight = rowHeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashboardGridLayout)) return false;
        DashboardGridLayout other = (DashboardGridLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dashboardGridComponents==null && other.getDashboardGridComponents()==null) || 
             (this.dashboardGridComponents!=null &&
              java.util.Arrays.equals(this.dashboardGridComponents, other.getDashboardGridComponents()))) &&
            this.numberOfColumns == other.getNumberOfColumns() &&
            this.rowHeight == other.getRowHeight();
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
        if (getDashboardGridComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDashboardGridComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDashboardGridComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNumberOfColumns();
        _hashCode += getRowHeight();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DashboardGridLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardGridLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardGridComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardGridComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardGridComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberOfColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rowHeight"));
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
