/**
 * EntitlementTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EntitlementTemplate  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String businessHours;

    private java.lang.Integer casesPerEntitlement;

    private java.lang.String entitlementProcess;

    private java.lang.Boolean isPerIncident;

    private java.lang.Integer term;

    private java.lang.String type;

    public EntitlementTemplate() {
    }

    public EntitlementTemplate(
           java.lang.String fullName,
           java.lang.String businessHours,
           java.lang.Integer casesPerEntitlement,
           java.lang.String entitlementProcess,
           java.lang.Boolean isPerIncident,
           java.lang.Integer term,
           java.lang.String type) {
        super(
            fullName);
        this.businessHours = businessHours;
        this.casesPerEntitlement = casesPerEntitlement;
        this.entitlementProcess = entitlementProcess;
        this.isPerIncident = isPerIncident;
        this.term = term;
        this.type = type;
    }


    /**
     * Gets the businessHours value for this EntitlementTemplate.
     * 
     * @return businessHours
     */
    public java.lang.String getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this EntitlementTemplate.
     * 
     * @param businessHours
     */
    public void setBusinessHours(java.lang.String businessHours) {
        this.businessHours = businessHours;
    }


    /**
     * Gets the casesPerEntitlement value for this EntitlementTemplate.
     * 
     * @return casesPerEntitlement
     */
    public java.lang.Integer getCasesPerEntitlement() {
        return casesPerEntitlement;
    }


    /**
     * Sets the casesPerEntitlement value for this EntitlementTemplate.
     * 
     * @param casesPerEntitlement
     */
    public void setCasesPerEntitlement(java.lang.Integer casesPerEntitlement) {
        this.casesPerEntitlement = casesPerEntitlement;
    }


    /**
     * Gets the entitlementProcess value for this EntitlementTemplate.
     * 
     * @return entitlementProcess
     */
    public java.lang.String getEntitlementProcess() {
        return entitlementProcess;
    }


    /**
     * Sets the entitlementProcess value for this EntitlementTemplate.
     * 
     * @param entitlementProcess
     */
    public void setEntitlementProcess(java.lang.String entitlementProcess) {
        this.entitlementProcess = entitlementProcess;
    }


    /**
     * Gets the isPerIncident value for this EntitlementTemplate.
     * 
     * @return isPerIncident
     */
    public java.lang.Boolean getIsPerIncident() {
        return isPerIncident;
    }


    /**
     * Sets the isPerIncident value for this EntitlementTemplate.
     * 
     * @param isPerIncident
     */
    public void setIsPerIncident(java.lang.Boolean isPerIncident) {
        this.isPerIncident = isPerIncident;
    }


    /**
     * Gets the term value for this EntitlementTemplate.
     * 
     * @return term
     */
    public java.lang.Integer getTerm() {
        return term;
    }


    /**
     * Sets the term value for this EntitlementTemplate.
     * 
     * @param term
     */
    public void setTerm(java.lang.Integer term) {
        this.term = term;
    }


    /**
     * Gets the type value for this EntitlementTemplate.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this EntitlementTemplate.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementTemplate)) return false;
        EntitlementTemplate other = (EntitlementTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              this.businessHours.equals(other.getBusinessHours()))) &&
            ((this.casesPerEntitlement==null && other.getCasesPerEntitlement()==null) || 
             (this.casesPerEntitlement!=null &&
              this.casesPerEntitlement.equals(other.getCasesPerEntitlement()))) &&
            ((this.entitlementProcess==null && other.getEntitlementProcess()==null) || 
             (this.entitlementProcess!=null &&
              this.entitlementProcess.equals(other.getEntitlementProcess()))) &&
            ((this.isPerIncident==null && other.getIsPerIncident()==null) || 
             (this.isPerIncident!=null &&
              this.isPerIncident.equals(other.getIsPerIncident()))) &&
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              this.term.equals(other.getTerm()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBusinessHours() != null) {
            _hashCode += getBusinessHours().hashCode();
        }
        if (getCasesPerEntitlement() != null) {
            _hashCode += getCasesPerEntitlement().hashCode();
        }
        if (getEntitlementProcess() != null) {
            _hashCode += getEntitlementProcess().hashCode();
        }
        if (getIsPerIncident() != null) {
            _hashCode += getIsPerIncident().hashCode();
        }
        if (getTerm() != null) {
            _hashCode += getTerm().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "businessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casesPerEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "casesPerEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entitlementProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPerIncident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isPerIncident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
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
