/**
 * Letterhead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Letterhead  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean available;

    private java.lang.String backgroundColor;

    private java.lang.String bodyColor;

    private com.sforce.soap._2006._04.metadata.LetterheadLine bottomLine;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter footer;

    private com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter header;

    private com.sforce.soap._2006._04.metadata.LetterheadLine middleLine;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.LetterheadLine topLine;

    public Letterhead() {
    }

    public Letterhead(
           java.lang.String fullName,
           boolean available,
           java.lang.String backgroundColor,
           java.lang.String bodyColor,
           com.sforce.soap._2006._04.metadata.LetterheadLine bottomLine,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter footer,
           com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter header,
           com.sforce.soap._2006._04.metadata.LetterheadLine middleLine,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.LetterheadLine topLine) {
        super(
            fullName);
        this.available = available;
        this.backgroundColor = backgroundColor;
        this.bodyColor = bodyColor;
        this.bottomLine = bottomLine;
        this.description = description;
        this.footer = footer;
        this.header = header;
        this.middleLine = middleLine;
        this.name = name;
        this.topLine = topLine;
    }


    /**
     * Gets the available value for this Letterhead.
     * 
     * @return available
     */
    public boolean isAvailable() {
        return available;
    }


    /**
     * Sets the available value for this Letterhead.
     * 
     * @param available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }


    /**
     * Gets the backgroundColor value for this Letterhead.
     * 
     * @return backgroundColor
     */
    public java.lang.String getBackgroundColor() {
        return backgroundColor;
    }


    /**
     * Sets the backgroundColor value for this Letterhead.
     * 
     * @param backgroundColor
     */
    public void setBackgroundColor(java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Gets the bodyColor value for this Letterhead.
     * 
     * @return bodyColor
     */
    public java.lang.String getBodyColor() {
        return bodyColor;
    }


    /**
     * Sets the bodyColor value for this Letterhead.
     * 
     * @param bodyColor
     */
    public void setBodyColor(java.lang.String bodyColor) {
        this.bodyColor = bodyColor;
    }


    /**
     * Gets the bottomLine value for this Letterhead.
     * 
     * @return bottomLine
     */
    public com.sforce.soap._2006._04.metadata.LetterheadLine getBottomLine() {
        return bottomLine;
    }


    /**
     * Sets the bottomLine value for this Letterhead.
     * 
     * @param bottomLine
     */
    public void setBottomLine(com.sforce.soap._2006._04.metadata.LetterheadLine bottomLine) {
        this.bottomLine = bottomLine;
    }


    /**
     * Gets the description value for this Letterhead.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Letterhead.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the footer value for this Letterhead.
     * 
     * @return footer
     */
    public com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter getFooter() {
        return footer;
    }


    /**
     * Sets the footer value for this Letterhead.
     * 
     * @param footer
     */
    public void setFooter(com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter footer) {
        this.footer = footer;
    }


    /**
     * Gets the header value for this Letterhead.
     * 
     * @return header
     */
    public com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Letterhead.
     * 
     * @param header
     */
    public void setHeader(com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter header) {
        this.header = header;
    }


    /**
     * Gets the middleLine value for this Letterhead.
     * 
     * @return middleLine
     */
    public com.sforce.soap._2006._04.metadata.LetterheadLine getMiddleLine() {
        return middleLine;
    }


    /**
     * Sets the middleLine value for this Letterhead.
     * 
     * @param middleLine
     */
    public void setMiddleLine(com.sforce.soap._2006._04.metadata.LetterheadLine middleLine) {
        this.middleLine = middleLine;
    }


    /**
     * Gets the name value for this Letterhead.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Letterhead.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the topLine value for this Letterhead.
     * 
     * @return topLine
     */
    public com.sforce.soap._2006._04.metadata.LetterheadLine getTopLine() {
        return topLine;
    }


    /**
     * Sets the topLine value for this Letterhead.
     * 
     * @param topLine
     */
    public void setTopLine(com.sforce.soap._2006._04.metadata.LetterheadLine topLine) {
        this.topLine = topLine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Letterhead)) return false;
        Letterhead other = (Letterhead) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.available == other.isAvailable() &&
            ((this.backgroundColor==null && other.getBackgroundColor()==null) || 
             (this.backgroundColor!=null &&
              this.backgroundColor.equals(other.getBackgroundColor()))) &&
            ((this.bodyColor==null && other.getBodyColor()==null) || 
             (this.bodyColor!=null &&
              this.bodyColor.equals(other.getBodyColor()))) &&
            ((this.bottomLine==null && other.getBottomLine()==null) || 
             (this.bottomLine!=null &&
              this.bottomLine.equals(other.getBottomLine()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.footer==null && other.getFooter()==null) || 
             (this.footer!=null &&
              this.footer.equals(other.getFooter()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.middleLine==null && other.getMiddleLine()==null) || 
             (this.middleLine!=null &&
              this.middleLine.equals(other.getMiddleLine()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.topLine==null && other.getTopLine()==null) || 
             (this.topLine!=null &&
              this.topLine.equals(other.getTopLine())));
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
        _hashCode += (isAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBackgroundColor() != null) {
            _hashCode += getBackgroundColor().hashCode();
        }
        if (getBodyColor() != null) {
            _hashCode += getBodyColor().hashCode();
        }
        if (getBottomLine() != null) {
            _hashCode += getBottomLine().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFooter() != null) {
            _hashCode += getFooter().hashCode();
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getMiddleLine() != null) {
            _hashCode += getMiddleLine().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTopLine() != null) {
            _hashCode += getTopLine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Letterhead.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Letterhead"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "backgroundColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bodyColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bottomLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bottomLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadLine"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "footer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadHeaderFooter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadHeaderFooter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "middleLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadLine"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "topLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadLine"));
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
