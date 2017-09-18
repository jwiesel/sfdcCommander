/**
 * DashboardGridComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DashboardGridComponent  implements java.io.Serializable {
    private int colSpan;

    private int columnIndex;

    private com.sforce.soap._2006._04.metadata.DashboardComponent dashboardComponent;

    private int rowIndex;

    private int rowSpan;

    public DashboardGridComponent() {
    }

    public DashboardGridComponent(
           int colSpan,
           int columnIndex,
           com.sforce.soap._2006._04.metadata.DashboardComponent dashboardComponent,
           int rowIndex,
           int rowSpan) {
           this.colSpan = colSpan;
           this.columnIndex = columnIndex;
           this.dashboardComponent = dashboardComponent;
           this.rowIndex = rowIndex;
           this.rowSpan = rowSpan;
    }


    /**
     * Gets the colSpan value for this DashboardGridComponent.
     * 
     * @return colSpan
     */
    public int getColSpan() {
        return colSpan;
    }


    /**
     * Sets the colSpan value for this DashboardGridComponent.
     * 
     * @param colSpan
     */
    public void setColSpan(int colSpan) {
        this.colSpan = colSpan;
    }


    /**
     * Gets the columnIndex value for this DashboardGridComponent.
     * 
     * @return columnIndex
     */
    public int getColumnIndex() {
        return columnIndex;
    }


    /**
     * Sets the columnIndex value for this DashboardGridComponent.
     * 
     * @param columnIndex
     */
    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }


    /**
     * Gets the dashboardComponent value for this DashboardGridComponent.
     * 
     * @return dashboardComponent
     */
    public com.sforce.soap._2006._04.metadata.DashboardComponent getDashboardComponent() {
        return dashboardComponent;
    }


    /**
     * Sets the dashboardComponent value for this DashboardGridComponent.
     * 
     * @param dashboardComponent
     */
    public void setDashboardComponent(com.sforce.soap._2006._04.metadata.DashboardComponent dashboardComponent) {
        this.dashboardComponent = dashboardComponent;
    }


    /**
     * Gets the rowIndex value for this DashboardGridComponent.
     * 
     * @return rowIndex
     */
    public int getRowIndex() {
        return rowIndex;
    }


    /**
     * Sets the rowIndex value for this DashboardGridComponent.
     * 
     * @param rowIndex
     */
    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }


    /**
     * Gets the rowSpan value for this DashboardGridComponent.
     * 
     * @return rowSpan
     */
    public int getRowSpan() {
        return rowSpan;
    }


    /**
     * Sets the rowSpan value for this DashboardGridComponent.
     * 
     * @param rowSpan
     */
    public void setRowSpan(int rowSpan) {
        this.rowSpan = rowSpan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashboardGridComponent)) return false;
        DashboardGridComponent other = (DashboardGridComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.colSpan == other.getColSpan() &&
            this.columnIndex == other.getColumnIndex() &&
            ((this.dashboardComponent==null && other.getDashboardComponent()==null) || 
             (this.dashboardComponent!=null &&
              this.dashboardComponent.equals(other.getDashboardComponent()))) &&
            this.rowIndex == other.getRowIndex() &&
            this.rowSpan == other.getRowSpan();
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
        _hashCode += getColSpan();
        _hashCode += getColumnIndex();
        if (getDashboardComponent() != null) {
            _hashCode += getDashboardComponent().hashCode();
        }
        _hashCode += getRowIndex();
        _hashCode += getRowSpan();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DashboardGridComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardGridComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "colSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "columnIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponent"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rowIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rowSpan"));
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
