/**
 * SummaryLayoutItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SummaryLayoutItem  implements java.io.Serializable {
    private java.lang.String customLink;

    private java.lang.String field;

    private int posX;

    private java.lang.Integer posY;

    private java.lang.Integer posZ;

    public SummaryLayoutItem() {
    }

    public SummaryLayoutItem(
           java.lang.String customLink,
           java.lang.String field,
           int posX,
           java.lang.Integer posY,
           java.lang.Integer posZ) {
           this.customLink = customLink;
           this.field = field;
           this.posX = posX;
           this.posY = posY;
           this.posZ = posZ;
    }


    /**
     * Gets the customLink value for this SummaryLayoutItem.
     * 
     * @return customLink
     */
    public java.lang.String getCustomLink() {
        return customLink;
    }


    /**
     * Sets the customLink value for this SummaryLayoutItem.
     * 
     * @param customLink
     */
    public void setCustomLink(java.lang.String customLink) {
        this.customLink = customLink;
    }


    /**
     * Gets the field value for this SummaryLayoutItem.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this SummaryLayoutItem.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the posX value for this SummaryLayoutItem.
     * 
     * @return posX
     */
    public int getPosX() {
        return posX;
    }


    /**
     * Sets the posX value for this SummaryLayoutItem.
     * 
     * @param posX
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }


    /**
     * Gets the posY value for this SummaryLayoutItem.
     * 
     * @return posY
     */
    public java.lang.Integer getPosY() {
        return posY;
    }


    /**
     * Sets the posY value for this SummaryLayoutItem.
     * 
     * @param posY
     */
    public void setPosY(java.lang.Integer posY) {
        this.posY = posY;
    }


    /**
     * Gets the posZ value for this SummaryLayoutItem.
     * 
     * @return posZ
     */
    public java.lang.Integer getPosZ() {
        return posZ;
    }


    /**
     * Sets the posZ value for this SummaryLayoutItem.
     * 
     * @param posZ
     */
    public void setPosZ(java.lang.Integer posZ) {
        this.posZ = posZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SummaryLayoutItem)) return false;
        SummaryLayoutItem other = (SummaryLayoutItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customLink==null && other.getCustomLink()==null) || 
             (this.customLink!=null &&
              this.customLink.equals(other.getCustomLink()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            this.posX == other.getPosX() &&
            ((this.posY==null && other.getPosY()==null) || 
             (this.posY!=null &&
              this.posY.equals(other.getPosY()))) &&
            ((this.posZ==null && other.getPosZ()==null) || 
             (this.posZ!=null &&
              this.posZ.equals(other.getPosZ())));
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
        if (getCustomLink() != null) {
            _hashCode += getCustomLink().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        _hashCode += getPosX();
        if (getPosY() != null) {
            _hashCode += getPosY().hashCode();
        }
        if (getPosZ() != null) {
            _hashCode += getPosZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SummaryLayoutItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayoutItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "posX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "posY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "posZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
