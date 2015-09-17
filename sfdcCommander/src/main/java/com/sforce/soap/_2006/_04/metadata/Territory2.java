/**
 * Territory2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Territory2  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String accountAccessLevel;

    private java.lang.String caseAccessLevel;

    private java.lang.String contactAccessLevel;

    private com.sforce.soap._2006._04.metadata.FieldValue[] customFields;

    private java.lang.String description;

    private java.lang.String name;

    private java.lang.String opportunityAccessLevel;

    private java.lang.String parentTerritory;

    private com.sforce.soap._2006._04.metadata.Territory2RuleAssociation[] ruleAssociations;

    private java.lang.String territory2Type;

    public Territory2() {
    }

    public Territory2(
           java.lang.String fullName,
           java.lang.String accountAccessLevel,
           java.lang.String caseAccessLevel,
           java.lang.String contactAccessLevel,
           com.sforce.soap._2006._04.metadata.FieldValue[] customFields,
           java.lang.String description,
           java.lang.String name,
           java.lang.String opportunityAccessLevel,
           java.lang.String parentTerritory,
           com.sforce.soap._2006._04.metadata.Territory2RuleAssociation[] ruleAssociations,
           java.lang.String territory2Type) {
        super(
            fullName);
        this.accountAccessLevel = accountAccessLevel;
        this.caseAccessLevel = caseAccessLevel;
        this.contactAccessLevel = contactAccessLevel;
        this.customFields = customFields;
        this.description = description;
        this.name = name;
        this.opportunityAccessLevel = opportunityAccessLevel;
        this.parentTerritory = parentTerritory;
        this.ruleAssociations = ruleAssociations;
        this.territory2Type = territory2Type;
    }


    /**
     * Gets the accountAccessLevel value for this Territory2.
     * 
     * @return accountAccessLevel
     */
    public java.lang.String getAccountAccessLevel() {
        return accountAccessLevel;
    }


    /**
     * Sets the accountAccessLevel value for this Territory2.
     * 
     * @param accountAccessLevel
     */
    public void setAccountAccessLevel(java.lang.String accountAccessLevel) {
        this.accountAccessLevel = accountAccessLevel;
    }


    /**
     * Gets the caseAccessLevel value for this Territory2.
     * 
     * @return caseAccessLevel
     */
    public java.lang.String getCaseAccessLevel() {
        return caseAccessLevel;
    }


    /**
     * Sets the caseAccessLevel value for this Territory2.
     * 
     * @param caseAccessLevel
     */
    public void setCaseAccessLevel(java.lang.String caseAccessLevel) {
        this.caseAccessLevel = caseAccessLevel;
    }


    /**
     * Gets the contactAccessLevel value for this Territory2.
     * 
     * @return contactAccessLevel
     */
    public java.lang.String getContactAccessLevel() {
        return contactAccessLevel;
    }


    /**
     * Sets the contactAccessLevel value for this Territory2.
     * 
     * @param contactAccessLevel
     */
    public void setContactAccessLevel(java.lang.String contactAccessLevel) {
        this.contactAccessLevel = contactAccessLevel;
    }


    /**
     * Gets the customFields value for this Territory2.
     * 
     * @return customFields
     */
    public com.sforce.soap._2006._04.metadata.FieldValue[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this Territory2.
     * 
     * @param customFields
     */
    public void setCustomFields(com.sforce.soap._2006._04.metadata.FieldValue[] customFields) {
        this.customFields = customFields;
    }

    public com.sforce.soap._2006._04.metadata.FieldValue getCustomFields(int i) {
        return this.customFields[i];
    }

    public void setCustomFields(int i, com.sforce.soap._2006._04.metadata.FieldValue _value) {
        this.customFields[i] = _value;
    }


    /**
     * Gets the description value for this Territory2.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Territory2.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this Territory2.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Territory2.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the opportunityAccessLevel value for this Territory2.
     * 
     * @return opportunityAccessLevel
     */
    public java.lang.String getOpportunityAccessLevel() {
        return opportunityAccessLevel;
    }


    /**
     * Sets the opportunityAccessLevel value for this Territory2.
     * 
     * @param opportunityAccessLevel
     */
    public void setOpportunityAccessLevel(java.lang.String opportunityAccessLevel) {
        this.opportunityAccessLevel = opportunityAccessLevel;
    }


    /**
     * Gets the parentTerritory value for this Territory2.
     * 
     * @return parentTerritory
     */
    public java.lang.String getParentTerritory() {
        return parentTerritory;
    }


    /**
     * Sets the parentTerritory value for this Territory2.
     * 
     * @param parentTerritory
     */
    public void setParentTerritory(java.lang.String parentTerritory) {
        this.parentTerritory = parentTerritory;
    }


    /**
     * Gets the ruleAssociations value for this Territory2.
     * 
     * @return ruleAssociations
     */
    public com.sforce.soap._2006._04.metadata.Territory2RuleAssociation[] getRuleAssociations() {
        return ruleAssociations;
    }


    /**
     * Sets the ruleAssociations value for this Territory2.
     * 
     * @param ruleAssociations
     */
    public void setRuleAssociations(com.sforce.soap._2006._04.metadata.Territory2RuleAssociation[] ruleAssociations) {
        this.ruleAssociations = ruleAssociations;
    }

    public com.sforce.soap._2006._04.metadata.Territory2RuleAssociation getRuleAssociations(int i) {
        return this.ruleAssociations[i];
    }

    public void setRuleAssociations(int i, com.sforce.soap._2006._04.metadata.Territory2RuleAssociation _value) {
        this.ruleAssociations[i] = _value;
    }


    /**
     * Gets the territory2Type value for this Territory2.
     * 
     * @return territory2Type
     */
    public java.lang.String getTerritory2Type() {
        return territory2Type;
    }


    /**
     * Sets the territory2Type value for this Territory2.
     * 
     * @param territory2Type
     */
    public void setTerritory2Type(java.lang.String territory2Type) {
        this.territory2Type = territory2Type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Territory2)) return false;
        Territory2 other = (Territory2) obj;
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
            ((this.caseAccessLevel==null && other.getCaseAccessLevel()==null) || 
             (this.caseAccessLevel!=null &&
              this.caseAccessLevel.equals(other.getCaseAccessLevel()))) &&
            ((this.contactAccessLevel==null && other.getContactAccessLevel()==null) || 
             (this.contactAccessLevel!=null &&
              this.contactAccessLevel.equals(other.getContactAccessLevel()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.opportunityAccessLevel==null && other.getOpportunityAccessLevel()==null) || 
             (this.opportunityAccessLevel!=null &&
              this.opportunityAccessLevel.equals(other.getOpportunityAccessLevel()))) &&
            ((this.parentTerritory==null && other.getParentTerritory()==null) || 
             (this.parentTerritory!=null &&
              this.parentTerritory.equals(other.getParentTerritory()))) &&
            ((this.ruleAssociations==null && other.getRuleAssociations()==null) || 
             (this.ruleAssociations!=null &&
              java.util.Arrays.equals(this.ruleAssociations, other.getRuleAssociations()))) &&
            ((this.territory2Type==null && other.getTerritory2Type()==null) || 
             (this.territory2Type!=null &&
              this.territory2Type.equals(other.getTerritory2Type())));
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
        if (getCaseAccessLevel() != null) {
            _hashCode += getCaseAccessLevel().hashCode();
        }
        if (getContactAccessLevel() != null) {
            _hashCode += getContactAccessLevel().hashCode();
        }
        if (getCustomFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOpportunityAccessLevel() != null) {
            _hashCode += getOpportunityAccessLevel().hashCode();
        }
        if (getParentTerritory() != null) {
            _hashCode += getParentTerritory().hashCode();
        }
        if (getRuleAssociations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleAssociations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleAssociations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerritory2Type() != null) {
            _hashCode += getTerritory2Type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Territory2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accountAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "contactAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityAccessLevel"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ruleAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory2RuleAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territory2Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "territory2Type"));
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
