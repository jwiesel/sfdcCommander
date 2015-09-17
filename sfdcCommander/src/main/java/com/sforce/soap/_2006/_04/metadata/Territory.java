/**
 * Territory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Territory  extends com.sforce.soap._2006._04.metadata.RoleOrTerritory  implements java.io.Serializable {
    private java.lang.String accountAccessLevel;

    private java.lang.String parentTerritory;

    public Territory() {
    }

    public Territory(
           java.lang.String fullName,
           java.lang.String caseAccessLevel,
           java.lang.String contactAccessLevel,
           java.lang.String description,
           java.lang.Boolean mayForecastManagerShare,
           java.lang.String name,
           java.lang.String opportunityAccessLevel,
           java.lang.String accountAccessLevel,
           java.lang.String parentTerritory) {
        super(
            fullName,
            caseAccessLevel,
            contactAccessLevel,
            description,
            mayForecastManagerShare,
            name,
            opportunityAccessLevel);
        this.accountAccessLevel = accountAccessLevel;
        this.parentTerritory = parentTerritory;
    }


    /**
     * Gets the accountAccessLevel value for this Territory.
     * 
     * @return accountAccessLevel
     */
    public java.lang.String getAccountAccessLevel() {
        return accountAccessLevel;
    }


    /**
     * Sets the accountAccessLevel value for this Territory.
     * 
     * @param accountAccessLevel
     */
    public void setAccountAccessLevel(java.lang.String accountAccessLevel) {
        this.accountAccessLevel = accountAccessLevel;
    }


    /**
     * Gets the parentTerritory value for this Territory.
     * 
     * @return parentTerritory
     */
    public java.lang.String getParentTerritory() {
        return parentTerritory;
    }


    /**
     * Sets the parentTerritory value for this Territory.
     * 
     * @param parentTerritory
     */
    public void setParentTerritory(java.lang.String parentTerritory) {
        this.parentTerritory = parentTerritory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Territory)) return false;
        Territory other = (Territory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountAccessLevel==null && other.getAccountAccessLevel()==null) || 
             (this.accountAccessLevel!=null &&
              this.accountAccessLevel.equals(other.getAccountAccessLevel()))) &&
            ((this.parentTerritory==null && other.getParentTerritory()==null) || 
             (this.parentTerritory!=null &&
              this.parentTerritory.equals(other.getParentTerritory())));
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
        if (getAccountAccessLevel() != null) {
            _hashCode += getAccountAccessLevel().hashCode();
        }
        if (getParentTerritory() != null) {
            _hashCode += getParentTerritory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Territory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accountAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTerritory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "parentTerritory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
