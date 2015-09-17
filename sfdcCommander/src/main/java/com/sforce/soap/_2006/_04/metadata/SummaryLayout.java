/**
 * SummaryLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SummaryLayout  implements java.io.Serializable {
    private java.lang.String masterLabel;

    private int sizeX;

    private java.lang.Integer sizeY;

    private java.lang.Integer sizeZ;

    private com.sforce.soap._2006._04.metadata.SummaryLayoutItem[] summaryLayoutItems;

    private com.sforce.soap._2006._04.metadata.SummaryLayoutStyle summaryLayoutStyle;

    public SummaryLayout() {
    }

    public SummaryLayout(
           java.lang.String masterLabel,
           int sizeX,
           java.lang.Integer sizeY,
           java.lang.Integer sizeZ,
           com.sforce.soap._2006._04.metadata.SummaryLayoutItem[] summaryLayoutItems,
           com.sforce.soap._2006._04.metadata.SummaryLayoutStyle summaryLayoutStyle) {
           this.masterLabel = masterLabel;
           this.sizeX = sizeX;
           this.sizeY = sizeY;
           this.sizeZ = sizeZ;
           this.summaryLayoutItems = summaryLayoutItems;
           this.summaryLayoutStyle = summaryLayoutStyle;
    }


    /**
     * Gets the masterLabel value for this SummaryLayout.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this SummaryLayout.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the sizeX value for this SummaryLayout.
     * 
     * @return sizeX
     */
    public int getSizeX() {
        return sizeX;
    }


    /**
     * Sets the sizeX value for this SummaryLayout.
     * 
     * @param sizeX
     */
    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }


    /**
     * Gets the sizeY value for this SummaryLayout.
     * 
     * @return sizeY
     */
    public java.lang.Integer getSizeY() {
        return sizeY;
    }


    /**
     * Sets the sizeY value for this SummaryLayout.
     * 
     * @param sizeY
     */
    public void setSizeY(java.lang.Integer sizeY) {
        this.sizeY = sizeY;
    }


    /**
     * Gets the sizeZ value for this SummaryLayout.
     * 
     * @return sizeZ
     */
    public java.lang.Integer getSizeZ() {
        return sizeZ;
    }


    /**
     * Sets the sizeZ value for this SummaryLayout.
     * 
     * @param sizeZ
     */
    public void setSizeZ(java.lang.Integer sizeZ) {
        this.sizeZ = sizeZ;
    }


    /**
     * Gets the summaryLayoutItems value for this SummaryLayout.
     * 
     * @return summaryLayoutItems
     */
    public com.sforce.soap._2006._04.metadata.SummaryLayoutItem[] getSummaryLayoutItems() {
        return summaryLayoutItems;
    }


    /**
     * Sets the summaryLayoutItems value for this SummaryLayout.
     * 
     * @param summaryLayoutItems
     */
    public void setSummaryLayoutItems(com.sforce.soap._2006._04.metadata.SummaryLayoutItem[] summaryLayoutItems) {
        this.summaryLayoutItems = summaryLayoutItems;
    }

    public com.sforce.soap._2006._04.metadata.SummaryLayoutItem getSummaryLayoutItems(int i) {
        return this.summaryLayoutItems[i];
    }

    public void setSummaryLayoutItems(int i, com.sforce.soap._2006._04.metadata.SummaryLayoutItem _value) {
        this.summaryLayoutItems[i] = _value;
    }


    /**
     * Gets the summaryLayoutStyle value for this SummaryLayout.
     * 
     * @return summaryLayoutStyle
     */
    public com.sforce.soap._2006._04.metadata.SummaryLayoutStyle getSummaryLayoutStyle() {
        return summaryLayoutStyle;
    }


    /**
     * Sets the summaryLayoutStyle value for this SummaryLayout.
     * 
     * @param summaryLayoutStyle
     */
    public void setSummaryLayoutStyle(com.sforce.soap._2006._04.metadata.SummaryLayoutStyle summaryLayoutStyle) {
        this.summaryLayoutStyle = summaryLayoutStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SummaryLayout)) return false;
        SummaryLayout other = (SummaryLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            this.sizeX == other.getSizeX() &&
            ((this.sizeY==null && other.getSizeY()==null) || 
             (this.sizeY!=null &&
              this.sizeY.equals(other.getSizeY()))) &&
            ((this.sizeZ==null && other.getSizeZ()==null) || 
             (this.sizeZ!=null &&
              this.sizeZ.equals(other.getSizeZ()))) &&
            ((this.summaryLayoutItems==null && other.getSummaryLayoutItems()==null) || 
             (this.summaryLayoutItems!=null &&
              java.util.Arrays.equals(this.summaryLayoutItems, other.getSummaryLayoutItems()))) &&
            ((this.summaryLayoutStyle==null && other.getSummaryLayoutStyle()==null) || 
             (this.summaryLayoutStyle!=null &&
              this.summaryLayoutStyle.equals(other.getSummaryLayoutStyle())));
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
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        _hashCode += getSizeX();
        if (getSizeY() != null) {
            _hashCode += getSizeY().hashCode();
        }
        if (getSizeZ() != null) {
            _hashCode += getSizeZ().hashCode();
        }
        if (getSummaryLayoutItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSummaryLayoutItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSummaryLayoutItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryLayoutStyle() != null) {
            _hashCode += getSummaryLayoutStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SummaryLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sizeX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sizeY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sizeZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryLayoutItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "summaryLayoutItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayoutItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryLayoutStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "summaryLayoutStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayoutStyle"));
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
