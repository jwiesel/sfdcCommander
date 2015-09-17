/**
 * SharingOwnerRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SharingOwnerRule  extends com.sforce.soap._2006._04.metadata.SharingBaseRule  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.SharedTo sharedFrom;

    public SharingOwnerRule() {
    }

    public SharingOwnerRule(
           java.lang.String fullName,
           java.lang.String accessLevel,
           com.sforce.soap._2006._04.metadata.AccountSharingRuleSettings accountSettings,
           java.lang.String description,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.SharedTo sharedTo,
           com.sforce.soap._2006._04.metadata.SharedTo sharedFrom) {
        super(
            fullName,
            accessLevel,
            accountSettings,
            description,
            label,
            sharedTo);
        this.sharedFrom = sharedFrom;
    }


    /**
     * Gets the sharedFrom value for this SharingOwnerRule.
     * 
     * @return sharedFrom
     */
    public com.sforce.soap._2006._04.metadata.SharedTo getSharedFrom() {
        return sharedFrom;
    }


    /**
     * Sets the sharedFrom value for this SharingOwnerRule.
     * 
     * @param sharedFrom
     */
    public void setSharedFrom(com.sforce.soap._2006._04.metadata.SharedTo sharedFrom) {
        this.sharedFrom = sharedFrom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharingOwnerRule)) return false;
        SharingOwnerRule other = (SharingOwnerRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sharedFrom==null && other.getSharedFrom()==null) || 
             (this.sharedFrom!=null &&
              this.sharedFrom.equals(other.getSharedFrom())));
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
        if (getSharedFrom() != null) {
            _hashCode += getSharedFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharingOwnerRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingOwnerRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharedTo"));
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
