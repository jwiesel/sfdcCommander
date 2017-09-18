/**
 * AccountSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AccountSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean enableAccountOwnerReport;

    private java.lang.Boolean enableAccountTeams;

    private java.lang.Boolean showViewHierarchyLink;

    public AccountSettings() {
    }

    public AccountSettings(
           java.lang.String fullName,
           java.lang.Boolean enableAccountOwnerReport,
           java.lang.Boolean enableAccountTeams,
           java.lang.Boolean showViewHierarchyLink) {
        super(
            fullName);
        this.enableAccountOwnerReport = enableAccountOwnerReport;
        this.enableAccountTeams = enableAccountTeams;
        this.showViewHierarchyLink = showViewHierarchyLink;
    }


    /**
     * Gets the enableAccountOwnerReport value for this AccountSettings.
     * 
     * @return enableAccountOwnerReport
     */
    public java.lang.Boolean getEnableAccountOwnerReport() {
        return enableAccountOwnerReport;
    }


    /**
     * Sets the enableAccountOwnerReport value for this AccountSettings.
     * 
     * @param enableAccountOwnerReport
     */
    public void setEnableAccountOwnerReport(java.lang.Boolean enableAccountOwnerReport) {
        this.enableAccountOwnerReport = enableAccountOwnerReport;
    }


    /**
     * Gets the enableAccountTeams value for this AccountSettings.
     * 
     * @return enableAccountTeams
     */
    public java.lang.Boolean getEnableAccountTeams() {
        return enableAccountTeams;
    }


    /**
     * Sets the enableAccountTeams value for this AccountSettings.
     * 
     * @param enableAccountTeams
     */
    public void setEnableAccountTeams(java.lang.Boolean enableAccountTeams) {
        this.enableAccountTeams = enableAccountTeams;
    }


    /**
     * Gets the showViewHierarchyLink value for this AccountSettings.
     * 
     * @return showViewHierarchyLink
     */
    public java.lang.Boolean getShowViewHierarchyLink() {
        return showViewHierarchyLink;
    }


    /**
     * Sets the showViewHierarchyLink value for this AccountSettings.
     * 
     * @param showViewHierarchyLink
     */
    public void setShowViewHierarchyLink(java.lang.Boolean showViewHierarchyLink) {
        this.showViewHierarchyLink = showViewHierarchyLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSettings)) return false;
        AccountSettings other = (AccountSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enableAccountOwnerReport==null && other.getEnableAccountOwnerReport()==null) || 
             (this.enableAccountOwnerReport!=null &&
              this.enableAccountOwnerReport.equals(other.getEnableAccountOwnerReport()))) &&
            ((this.enableAccountTeams==null && other.getEnableAccountTeams()==null) || 
             (this.enableAccountTeams!=null &&
              this.enableAccountTeams.equals(other.getEnableAccountTeams()))) &&
            ((this.showViewHierarchyLink==null && other.getShowViewHierarchyLink()==null) || 
             (this.showViewHierarchyLink!=null &&
              this.showViewHierarchyLink.equals(other.getShowViewHierarchyLink())));
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
        if (getEnableAccountOwnerReport() != null) {
            _hashCode += getEnableAccountOwnerReport().hashCode();
        }
        if (getEnableAccountTeams() != null) {
            _hashCode += getEnableAccountTeams().hashCode();
        }
        if (getShowViewHierarchyLink() != null) {
            _hashCode += getShowViewHierarchyLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAccountOwnerReport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAccountOwnerReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAccountTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAccountTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showViewHierarchyLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showViewHierarchyLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
