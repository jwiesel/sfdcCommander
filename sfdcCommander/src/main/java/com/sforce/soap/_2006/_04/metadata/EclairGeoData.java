/**
 * EclairGeoData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EclairGeoData  extends com.sforce.soap._2006._04.metadata.MetadataWithContent  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.EclairMap[] maps;

    private java.lang.String masterLabel;

    public EclairGeoData() {
    }

    public EclairGeoData(
           java.lang.String fullName,
           byte[] content,
           com.sforce.soap._2006._04.metadata.EclairMap[] maps,
           java.lang.String masterLabel) {
        super(
            fullName,
            content);
        this.maps = maps;
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the maps value for this EclairGeoData.
     * 
     * @return maps
     */
    public com.sforce.soap._2006._04.metadata.EclairMap[] getMaps() {
        return maps;
    }


    /**
     * Sets the maps value for this EclairGeoData.
     * 
     * @param maps
     */
    public void setMaps(com.sforce.soap._2006._04.metadata.EclairMap[] maps) {
        this.maps = maps;
    }

    public com.sforce.soap._2006._04.metadata.EclairMap getMaps(int i) {
        return this.maps[i];
    }

    public void setMaps(int i, com.sforce.soap._2006._04.metadata.EclairMap _value) {
        this.maps[i] = _value;
    }


    /**
     * Gets the masterLabel value for this EclairGeoData.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this EclairGeoData.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EclairGeoData)) return false;
        EclairGeoData other = (EclairGeoData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maps==null && other.getMaps()==null) || 
             (this.maps!=null &&
              java.util.Arrays.equals(this.maps, other.getMaps()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EclairGeoData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EclairGeoData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "maps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EclairMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
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
