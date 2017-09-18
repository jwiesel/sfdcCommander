/**
 * EclairMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EclairMap  implements java.io.Serializable {
    private java.lang.Double boundingBoxBottom;

    private java.lang.Double boundingBoxLeft;

    private java.lang.Double boundingBoxRight;

    private java.lang.Double boundingBoxTop;

    private java.lang.String mapLabel;

    private java.lang.String mapName;

    private java.lang.String projection;

    public EclairMap() {
    }

    public EclairMap(
           java.lang.Double boundingBoxBottom,
           java.lang.Double boundingBoxLeft,
           java.lang.Double boundingBoxRight,
           java.lang.Double boundingBoxTop,
           java.lang.String mapLabel,
           java.lang.String mapName,
           java.lang.String projection) {
           this.boundingBoxBottom = boundingBoxBottom;
           this.boundingBoxLeft = boundingBoxLeft;
           this.boundingBoxRight = boundingBoxRight;
           this.boundingBoxTop = boundingBoxTop;
           this.mapLabel = mapLabel;
           this.mapName = mapName;
           this.projection = projection;
    }


    /**
     * Gets the boundingBoxBottom value for this EclairMap.
     * 
     * @return boundingBoxBottom
     */
    public java.lang.Double getBoundingBoxBottom() {
        return boundingBoxBottom;
    }


    /**
     * Sets the boundingBoxBottom value for this EclairMap.
     * 
     * @param boundingBoxBottom
     */
    public void setBoundingBoxBottom(java.lang.Double boundingBoxBottom) {
        this.boundingBoxBottom = boundingBoxBottom;
    }


    /**
     * Gets the boundingBoxLeft value for this EclairMap.
     * 
     * @return boundingBoxLeft
     */
    public java.lang.Double getBoundingBoxLeft() {
        return boundingBoxLeft;
    }


    /**
     * Sets the boundingBoxLeft value for this EclairMap.
     * 
     * @param boundingBoxLeft
     */
    public void setBoundingBoxLeft(java.lang.Double boundingBoxLeft) {
        this.boundingBoxLeft = boundingBoxLeft;
    }


    /**
     * Gets the boundingBoxRight value for this EclairMap.
     * 
     * @return boundingBoxRight
     */
    public java.lang.Double getBoundingBoxRight() {
        return boundingBoxRight;
    }


    /**
     * Sets the boundingBoxRight value for this EclairMap.
     * 
     * @param boundingBoxRight
     */
    public void setBoundingBoxRight(java.lang.Double boundingBoxRight) {
        this.boundingBoxRight = boundingBoxRight;
    }


    /**
     * Gets the boundingBoxTop value for this EclairMap.
     * 
     * @return boundingBoxTop
     */
    public java.lang.Double getBoundingBoxTop() {
        return boundingBoxTop;
    }


    /**
     * Sets the boundingBoxTop value for this EclairMap.
     * 
     * @param boundingBoxTop
     */
    public void setBoundingBoxTop(java.lang.Double boundingBoxTop) {
        this.boundingBoxTop = boundingBoxTop;
    }


    /**
     * Gets the mapLabel value for this EclairMap.
     * 
     * @return mapLabel
     */
    public java.lang.String getMapLabel() {
        return mapLabel;
    }


    /**
     * Sets the mapLabel value for this EclairMap.
     * 
     * @param mapLabel
     */
    public void setMapLabel(java.lang.String mapLabel) {
        this.mapLabel = mapLabel;
    }


    /**
     * Gets the mapName value for this EclairMap.
     * 
     * @return mapName
     */
    public java.lang.String getMapName() {
        return mapName;
    }


    /**
     * Sets the mapName value for this EclairMap.
     * 
     * @param mapName
     */
    public void setMapName(java.lang.String mapName) {
        this.mapName = mapName;
    }


    /**
     * Gets the projection value for this EclairMap.
     * 
     * @return projection
     */
    public java.lang.String getProjection() {
        return projection;
    }


    /**
     * Sets the projection value for this EclairMap.
     * 
     * @param projection
     */
    public void setProjection(java.lang.String projection) {
        this.projection = projection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EclairMap)) return false;
        EclairMap other = (EclairMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.boundingBoxBottom==null && other.getBoundingBoxBottom()==null) || 
             (this.boundingBoxBottom!=null &&
              this.boundingBoxBottom.equals(other.getBoundingBoxBottom()))) &&
            ((this.boundingBoxLeft==null && other.getBoundingBoxLeft()==null) || 
             (this.boundingBoxLeft!=null &&
              this.boundingBoxLeft.equals(other.getBoundingBoxLeft()))) &&
            ((this.boundingBoxRight==null && other.getBoundingBoxRight()==null) || 
             (this.boundingBoxRight!=null &&
              this.boundingBoxRight.equals(other.getBoundingBoxRight()))) &&
            ((this.boundingBoxTop==null && other.getBoundingBoxTop()==null) || 
             (this.boundingBoxTop!=null &&
              this.boundingBoxTop.equals(other.getBoundingBoxTop()))) &&
            ((this.mapLabel==null && other.getMapLabel()==null) || 
             (this.mapLabel!=null &&
              this.mapLabel.equals(other.getMapLabel()))) &&
            ((this.mapName==null && other.getMapName()==null) || 
             (this.mapName!=null &&
              this.mapName.equals(other.getMapName()))) &&
            ((this.projection==null && other.getProjection()==null) || 
             (this.projection!=null &&
              this.projection.equals(other.getProjection())));
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
        if (getBoundingBoxBottom() != null) {
            _hashCode += getBoundingBoxBottom().hashCode();
        }
        if (getBoundingBoxLeft() != null) {
            _hashCode += getBoundingBoxLeft().hashCode();
        }
        if (getBoundingBoxRight() != null) {
            _hashCode += getBoundingBoxRight().hashCode();
        }
        if (getBoundingBoxTop() != null) {
            _hashCode += getBoundingBoxTop().hashCode();
        }
        if (getMapLabel() != null) {
            _hashCode += getMapLabel().hashCode();
        }
        if (getMapName() != null) {
            _hashCode += getMapName().hashCode();
        }
        if (getProjection() != null) {
            _hashCode += getProjection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EclairMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EclairMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundingBoxBottom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "boundingBoxBottom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundingBoxLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "boundingBoxLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundingBoxRight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "boundingBoxRight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundingBoxTop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "boundingBoxTop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mapLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mapName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "projection"));
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
