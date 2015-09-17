/**
 * LetterheadHeaderFooter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LetterheadHeaderFooter  implements java.io.Serializable {
    private java.lang.String backgroundColor;

    private int height;

    private com.sforce.soap._2006._04.metadata.LetterheadHorizontalAlignment horizontalAlignment;

    private java.lang.String logo;

    private com.sforce.soap._2006._04.metadata.LetterheadVerticalAlignment verticalAlignment;

    public LetterheadHeaderFooter() {
    }

    public LetterheadHeaderFooter(
           java.lang.String backgroundColor,
           int height,
           com.sforce.soap._2006._04.metadata.LetterheadHorizontalAlignment horizontalAlignment,
           java.lang.String logo,
           com.sforce.soap._2006._04.metadata.LetterheadVerticalAlignment verticalAlignment) {
           this.backgroundColor = backgroundColor;
           this.height = height;
           this.horizontalAlignment = horizontalAlignment;
           this.logo = logo;
           this.verticalAlignment = verticalAlignment;
    }


    /**
     * Gets the backgroundColor value for this LetterheadHeaderFooter.
     * 
     * @return backgroundColor
     */
    public java.lang.String getBackgroundColor() {
        return backgroundColor;
    }


    /**
     * Sets the backgroundColor value for this LetterheadHeaderFooter.
     * 
     * @param backgroundColor
     */
    public void setBackgroundColor(java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Gets the height value for this LetterheadHeaderFooter.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this LetterheadHeaderFooter.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the horizontalAlignment value for this LetterheadHeaderFooter.
     * 
     * @return horizontalAlignment
     */
    public com.sforce.soap._2006._04.metadata.LetterheadHorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }


    /**
     * Sets the horizontalAlignment value for this LetterheadHeaderFooter.
     * 
     * @param horizontalAlignment
     */
    public void setHorizontalAlignment(com.sforce.soap._2006._04.metadata.LetterheadHorizontalAlignment horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }


    /**
     * Gets the logo value for this LetterheadHeaderFooter.
     * 
     * @return logo
     */
    public java.lang.String getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this LetterheadHeaderFooter.
     * 
     * @param logo
     */
    public void setLogo(java.lang.String logo) {
        this.logo = logo;
    }


    /**
     * Gets the verticalAlignment value for this LetterheadHeaderFooter.
     * 
     * @return verticalAlignment
     */
    public com.sforce.soap._2006._04.metadata.LetterheadVerticalAlignment getVerticalAlignment() {
        return verticalAlignment;
    }


    /**
     * Sets the verticalAlignment value for this LetterheadHeaderFooter.
     * 
     * @param verticalAlignment
     */
    public void setVerticalAlignment(com.sforce.soap._2006._04.metadata.LetterheadVerticalAlignment verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LetterheadHeaderFooter)) return false;
        LetterheadHeaderFooter other = (LetterheadHeaderFooter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.backgroundColor==null && other.getBackgroundColor()==null) || 
             (this.backgroundColor!=null &&
              this.backgroundColor.equals(other.getBackgroundColor()))) &&
            this.height == other.getHeight() &&
            ((this.horizontalAlignment==null && other.getHorizontalAlignment()==null) || 
             (this.horizontalAlignment!=null &&
              this.horizontalAlignment.equals(other.getHorizontalAlignment()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.verticalAlignment==null && other.getVerticalAlignment()==null) || 
             (this.verticalAlignment!=null &&
              this.verticalAlignment.equals(other.getVerticalAlignment())));
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
        if (getBackgroundColor() != null) {
            _hashCode += getBackgroundColor().hashCode();
        }
        _hashCode += getHeight();
        if (getHorizontalAlignment() != null) {
            _hashCode += getHorizontalAlignment().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getVerticalAlignment() != null) {
            _hashCode += getVerticalAlignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LetterheadHeaderFooter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadHeaderFooter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "backgroundColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horizontalAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "horizontalAlignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadHorizontalAlignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "verticalAlignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadVerticalAlignment"));
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
