/**
 * ProfileLoginIpRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ProfileLoginIpRange  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String endAddress;

    private java.lang.String startAddress;

    public ProfileLoginIpRange() {
    }

    public ProfileLoginIpRange(
           java.lang.String description,
           java.lang.String endAddress,
           java.lang.String startAddress) {
           this.description = description;
           this.endAddress = endAddress;
           this.startAddress = startAddress;
    }


    /**
     * Gets the description value for this ProfileLoginIpRange.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProfileLoginIpRange.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endAddress value for this ProfileLoginIpRange.
     * 
     * @return endAddress
     */
    public java.lang.String getEndAddress() {
        return endAddress;
    }


    /**
     * Sets the endAddress value for this ProfileLoginIpRange.
     * 
     * @param endAddress
     */
    public void setEndAddress(java.lang.String endAddress) {
        this.endAddress = endAddress;
    }


    /**
     * Gets the startAddress value for this ProfileLoginIpRange.
     * 
     * @return startAddress
     */
    public java.lang.String getStartAddress() {
        return startAddress;
    }


    /**
     * Sets the startAddress value for this ProfileLoginIpRange.
     * 
     * @param startAddress
     */
    public void setStartAddress(java.lang.String startAddress) {
        this.startAddress = startAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileLoginIpRange)) return false;
        ProfileLoginIpRange other = (ProfileLoginIpRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endAddress==null && other.getEndAddress()==null) || 
             (this.endAddress!=null &&
              this.endAddress.equals(other.getEndAddress()))) &&
            ((this.startAddress==null && other.getStartAddress()==null) || 
             (this.startAddress!=null &&
              this.startAddress.equals(other.getStartAddress())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndAddress() != null) {
            _hashCode += getEndAddress().hashCode();
        }
        if (getStartAddress() != null) {
            _hashCode += getStartAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileLoginIpRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileLoginIpRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "endAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "startAddress"));
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
