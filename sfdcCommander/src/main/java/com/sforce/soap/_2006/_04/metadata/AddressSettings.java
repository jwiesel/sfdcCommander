/**
 * AddressSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AddressSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.Country[] countriesAndStates;

    public AddressSettings() {
    }

    public AddressSettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.Country[] countriesAndStates) {
        super(
            fullName);
        this.countriesAndStates = countriesAndStates;
    }


    /**
     * Gets the countriesAndStates value for this AddressSettings.
     * 
     * @return countriesAndStates
     */
    public com.sforce.soap._2006._04.metadata.Country[] getCountriesAndStates() {
        return countriesAndStates;
    }


    /**
     * Sets the countriesAndStates value for this AddressSettings.
     * 
     * @param countriesAndStates
     */
    public void setCountriesAndStates(com.sforce.soap._2006._04.metadata.Country[] countriesAndStates) {
        this.countriesAndStates = countriesAndStates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressSettings)) return false;
        AddressSettings other = (AddressSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countriesAndStates==null && other.getCountriesAndStates()==null) || 
             (this.countriesAndStates!=null &&
              java.util.Arrays.equals(this.countriesAndStates, other.getCountriesAndStates())));
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
        if (getCountriesAndStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountriesAndStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountriesAndStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AddressSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countriesAndStates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "countriesAndStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Country"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "countries"));
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
