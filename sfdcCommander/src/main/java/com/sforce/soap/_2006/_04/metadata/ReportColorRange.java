/**
 * ReportColorRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportColorRange  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportSummaryType aggregate;

    private java.lang.String columnName;

    private java.lang.Double highBreakpoint;

    private java.lang.String highColor;

    private java.lang.Double lowBreakpoint;

    private java.lang.String lowColor;

    private java.lang.String midColor;

    public ReportColorRange() {
    }

    public ReportColorRange(
           com.sforce.soap._2006._04.metadata.ReportSummaryType aggregate,
           java.lang.String columnName,
           java.lang.Double highBreakpoint,
           java.lang.String highColor,
           java.lang.Double lowBreakpoint,
           java.lang.String lowColor,
           java.lang.String midColor) {
           this.aggregate = aggregate;
           this.columnName = columnName;
           this.highBreakpoint = highBreakpoint;
           this.highColor = highColor;
           this.lowBreakpoint = lowBreakpoint;
           this.lowColor = lowColor;
           this.midColor = midColor;
    }


    /**
     * Gets the aggregate value for this ReportColorRange.
     * 
     * @return aggregate
     */
    public com.sforce.soap._2006._04.metadata.ReportSummaryType getAggregate() {
        return aggregate;
    }


    /**
     * Sets the aggregate value for this ReportColorRange.
     * 
     * @param aggregate
     */
    public void setAggregate(com.sforce.soap._2006._04.metadata.ReportSummaryType aggregate) {
        this.aggregate = aggregate;
    }


    /**
     * Gets the columnName value for this ReportColorRange.
     * 
     * @return columnName
     */
    public java.lang.String getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this ReportColorRange.
     * 
     * @param columnName
     */
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the highBreakpoint value for this ReportColorRange.
     * 
     * @return highBreakpoint
     */
    public java.lang.Double getHighBreakpoint() {
        return highBreakpoint;
    }


    /**
     * Sets the highBreakpoint value for this ReportColorRange.
     * 
     * @param highBreakpoint
     */
    public void setHighBreakpoint(java.lang.Double highBreakpoint) {
        this.highBreakpoint = highBreakpoint;
    }


    /**
     * Gets the highColor value for this ReportColorRange.
     * 
     * @return highColor
     */
    public java.lang.String getHighColor() {
        return highColor;
    }


    /**
     * Sets the highColor value for this ReportColorRange.
     * 
     * @param highColor
     */
    public void setHighColor(java.lang.String highColor) {
        this.highColor = highColor;
    }


    /**
     * Gets the lowBreakpoint value for this ReportColorRange.
     * 
     * @return lowBreakpoint
     */
    public java.lang.Double getLowBreakpoint() {
        return lowBreakpoint;
    }


    /**
     * Sets the lowBreakpoint value for this ReportColorRange.
     * 
     * @param lowBreakpoint
     */
    public void setLowBreakpoint(java.lang.Double lowBreakpoint) {
        this.lowBreakpoint = lowBreakpoint;
    }


    /**
     * Gets the lowColor value for this ReportColorRange.
     * 
     * @return lowColor
     */
    public java.lang.String getLowColor() {
        return lowColor;
    }


    /**
     * Sets the lowColor value for this ReportColorRange.
     * 
     * @param lowColor
     */
    public void setLowColor(java.lang.String lowColor) {
        this.lowColor = lowColor;
    }


    /**
     * Gets the midColor value for this ReportColorRange.
     * 
     * @return midColor
     */
    public java.lang.String getMidColor() {
        return midColor;
    }


    /**
     * Sets the midColor value for this ReportColorRange.
     * 
     * @param midColor
     */
    public void setMidColor(java.lang.String midColor) {
        this.midColor = midColor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportColorRange)) return false;
        ReportColorRange other = (ReportColorRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aggregate==null && other.getAggregate()==null) || 
             (this.aggregate!=null &&
              this.aggregate.equals(other.getAggregate()))) &&
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            ((this.highBreakpoint==null && other.getHighBreakpoint()==null) || 
             (this.highBreakpoint!=null &&
              this.highBreakpoint.equals(other.getHighBreakpoint()))) &&
            ((this.highColor==null && other.getHighColor()==null) || 
             (this.highColor!=null &&
              this.highColor.equals(other.getHighColor()))) &&
            ((this.lowBreakpoint==null && other.getLowBreakpoint()==null) || 
             (this.lowBreakpoint!=null &&
              this.lowBreakpoint.equals(other.getLowBreakpoint()))) &&
            ((this.lowColor==null && other.getLowColor()==null) || 
             (this.lowColor!=null &&
              this.lowColor.equals(other.getLowColor()))) &&
            ((this.midColor==null && other.getMidColor()==null) || 
             (this.midColor!=null &&
              this.midColor.equals(other.getMidColor())));
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
        if (getAggregate() != null) {
            _hashCode += getAggregate().hashCode();
        }
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        if (getHighBreakpoint() != null) {
            _hashCode += getHighBreakpoint().hashCode();
        }
        if (getHighColor() != null) {
            _hashCode += getHighColor().hashCode();
        }
        if (getLowBreakpoint() != null) {
            _hashCode += getLowBreakpoint().hashCode();
        }
        if (getLowColor() != null) {
            _hashCode += getLowColor().hashCode();
        }
        if (getMidColor() != null) {
            _hashCode += getMidColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportColorRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportColorRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportSummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "columnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highBreakpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "highBreakpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "highColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowBreakpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lowBreakpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lowColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "midColor"));
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
