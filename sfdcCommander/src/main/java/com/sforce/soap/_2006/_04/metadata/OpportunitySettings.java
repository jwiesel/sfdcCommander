/**
 * OpportunitySettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class OpportunitySettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean autoActivateNewReminders;

    private java.lang.Boolean enableFindSimilarOpportunities;

    private java.lang.Boolean enableOpportunityTeam;

    private java.lang.Boolean enableUpdateReminders;

    private com.sforce.soap._2006._04.metadata.FindSimilarOppFilter findSimilarOppFilter;

    private java.lang.Boolean promptToAddProducts;

    public OpportunitySettings() {
    }

    public OpportunitySettings(
           java.lang.String fullName,
           java.lang.Boolean autoActivateNewReminders,
           java.lang.Boolean enableFindSimilarOpportunities,
           java.lang.Boolean enableOpportunityTeam,
           java.lang.Boolean enableUpdateReminders,
           com.sforce.soap._2006._04.metadata.FindSimilarOppFilter findSimilarOppFilter,
           java.lang.Boolean promptToAddProducts) {
        super(
            fullName);
        this.autoActivateNewReminders = autoActivateNewReminders;
        this.enableFindSimilarOpportunities = enableFindSimilarOpportunities;
        this.enableOpportunityTeam = enableOpportunityTeam;
        this.enableUpdateReminders = enableUpdateReminders;
        this.findSimilarOppFilter = findSimilarOppFilter;
        this.promptToAddProducts = promptToAddProducts;
    }


    /**
     * Gets the autoActivateNewReminders value for this OpportunitySettings.
     * 
     * @return autoActivateNewReminders
     */
    public java.lang.Boolean getAutoActivateNewReminders() {
        return autoActivateNewReminders;
    }


    /**
     * Sets the autoActivateNewReminders value for this OpportunitySettings.
     * 
     * @param autoActivateNewReminders
     */
    public void setAutoActivateNewReminders(java.lang.Boolean autoActivateNewReminders) {
        this.autoActivateNewReminders = autoActivateNewReminders;
    }


    /**
     * Gets the enableFindSimilarOpportunities value for this OpportunitySettings.
     * 
     * @return enableFindSimilarOpportunities
     */
    public java.lang.Boolean getEnableFindSimilarOpportunities() {
        return enableFindSimilarOpportunities;
    }


    /**
     * Sets the enableFindSimilarOpportunities value for this OpportunitySettings.
     * 
     * @param enableFindSimilarOpportunities
     */
    public void setEnableFindSimilarOpportunities(java.lang.Boolean enableFindSimilarOpportunities) {
        this.enableFindSimilarOpportunities = enableFindSimilarOpportunities;
    }


    /**
     * Gets the enableOpportunityTeam value for this OpportunitySettings.
     * 
     * @return enableOpportunityTeam
     */
    public java.lang.Boolean getEnableOpportunityTeam() {
        return enableOpportunityTeam;
    }


    /**
     * Sets the enableOpportunityTeam value for this OpportunitySettings.
     * 
     * @param enableOpportunityTeam
     */
    public void setEnableOpportunityTeam(java.lang.Boolean enableOpportunityTeam) {
        this.enableOpportunityTeam = enableOpportunityTeam;
    }


    /**
     * Gets the enableUpdateReminders value for this OpportunitySettings.
     * 
     * @return enableUpdateReminders
     */
    public java.lang.Boolean getEnableUpdateReminders() {
        return enableUpdateReminders;
    }


    /**
     * Sets the enableUpdateReminders value for this OpportunitySettings.
     * 
     * @param enableUpdateReminders
     */
    public void setEnableUpdateReminders(java.lang.Boolean enableUpdateReminders) {
        this.enableUpdateReminders = enableUpdateReminders;
    }


    /**
     * Gets the findSimilarOppFilter value for this OpportunitySettings.
     * 
     * @return findSimilarOppFilter
     */
    public com.sforce.soap._2006._04.metadata.FindSimilarOppFilter getFindSimilarOppFilter() {
        return findSimilarOppFilter;
    }


    /**
     * Sets the findSimilarOppFilter value for this OpportunitySettings.
     * 
     * @param findSimilarOppFilter
     */
    public void setFindSimilarOppFilter(com.sforce.soap._2006._04.metadata.FindSimilarOppFilter findSimilarOppFilter) {
        this.findSimilarOppFilter = findSimilarOppFilter;
    }


    /**
     * Gets the promptToAddProducts value for this OpportunitySettings.
     * 
     * @return promptToAddProducts
     */
    public java.lang.Boolean getPromptToAddProducts() {
        return promptToAddProducts;
    }


    /**
     * Sets the promptToAddProducts value for this OpportunitySettings.
     * 
     * @param promptToAddProducts
     */
    public void setPromptToAddProducts(java.lang.Boolean promptToAddProducts) {
        this.promptToAddProducts = promptToAddProducts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunitySettings)) return false;
        OpportunitySettings other = (OpportunitySettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoActivateNewReminders==null && other.getAutoActivateNewReminders()==null) || 
             (this.autoActivateNewReminders!=null &&
              this.autoActivateNewReminders.equals(other.getAutoActivateNewReminders()))) &&
            ((this.enableFindSimilarOpportunities==null && other.getEnableFindSimilarOpportunities()==null) || 
             (this.enableFindSimilarOpportunities!=null &&
              this.enableFindSimilarOpportunities.equals(other.getEnableFindSimilarOpportunities()))) &&
            ((this.enableOpportunityTeam==null && other.getEnableOpportunityTeam()==null) || 
             (this.enableOpportunityTeam!=null &&
              this.enableOpportunityTeam.equals(other.getEnableOpportunityTeam()))) &&
            ((this.enableUpdateReminders==null && other.getEnableUpdateReminders()==null) || 
             (this.enableUpdateReminders!=null &&
              this.enableUpdateReminders.equals(other.getEnableUpdateReminders()))) &&
            ((this.findSimilarOppFilter==null && other.getFindSimilarOppFilter()==null) || 
             (this.findSimilarOppFilter!=null &&
              this.findSimilarOppFilter.equals(other.getFindSimilarOppFilter()))) &&
            ((this.promptToAddProducts==null && other.getPromptToAddProducts()==null) || 
             (this.promptToAddProducts!=null &&
              this.promptToAddProducts.equals(other.getPromptToAddProducts())));
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
        if (getAutoActivateNewReminders() != null) {
            _hashCode += getAutoActivateNewReminders().hashCode();
        }
        if (getEnableFindSimilarOpportunities() != null) {
            _hashCode += getEnableFindSimilarOpportunities().hashCode();
        }
        if (getEnableOpportunityTeam() != null) {
            _hashCode += getEnableOpportunityTeam().hashCode();
        }
        if (getEnableUpdateReminders() != null) {
            _hashCode += getEnableUpdateReminders().hashCode();
        }
        if (getFindSimilarOppFilter() != null) {
            _hashCode += getFindSimilarOppFilter().hashCode();
        }
        if (getPromptToAddProducts() != null) {
            _hashCode += getPromptToAddProducts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpportunitySettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunitySettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoActivateNewReminders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autoActivateNewReminders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableFindSimilarOpportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableFindSimilarOpportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableOpportunityTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableOpportunityTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableUpdateReminders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableUpdateReminders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findSimilarOppFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "findSimilarOppFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FindSimilarOppFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptToAddProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "promptToAddProducts"));
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
