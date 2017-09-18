/**
 * CleanRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CleanRule  implements java.io.Serializable {
    private boolean bulkEnabled;

    private boolean bypassTriggers;

    private boolean bypassWorkflow;

    private java.lang.String description;

    private java.lang.String developerName;

    private com.sforce.soap._2006._04.metadata.FieldMapping[] fieldMappings;

    private java.lang.String masterLabel;

    private java.lang.String matchRule;

    private java.lang.String sourceSobjectType;

    private com.sforce.soap._2006._04.metadata.CleanRuleStatus status;

    private java.lang.String targetSobjectType;

    public CleanRule() {
    }

    public CleanRule(
           boolean bulkEnabled,
           boolean bypassTriggers,
           boolean bypassWorkflow,
           java.lang.String description,
           java.lang.String developerName,
           com.sforce.soap._2006._04.metadata.FieldMapping[] fieldMappings,
           java.lang.String masterLabel,
           java.lang.String matchRule,
           java.lang.String sourceSobjectType,
           com.sforce.soap._2006._04.metadata.CleanRuleStatus status,
           java.lang.String targetSobjectType) {
           this.bulkEnabled = bulkEnabled;
           this.bypassTriggers = bypassTriggers;
           this.bypassWorkflow = bypassWorkflow;
           this.description = description;
           this.developerName = developerName;
           this.fieldMappings = fieldMappings;
           this.masterLabel = masterLabel;
           this.matchRule = matchRule;
           this.sourceSobjectType = sourceSobjectType;
           this.status = status;
           this.targetSobjectType = targetSobjectType;
    }


    /**
     * Gets the bulkEnabled value for this CleanRule.
     * 
     * @return bulkEnabled
     */
    public boolean isBulkEnabled() {
        return bulkEnabled;
    }


    /**
     * Sets the bulkEnabled value for this CleanRule.
     * 
     * @param bulkEnabled
     */
    public void setBulkEnabled(boolean bulkEnabled) {
        this.bulkEnabled = bulkEnabled;
    }


    /**
     * Gets the bypassTriggers value for this CleanRule.
     * 
     * @return bypassTriggers
     */
    public boolean isBypassTriggers() {
        return bypassTriggers;
    }


    /**
     * Sets the bypassTriggers value for this CleanRule.
     * 
     * @param bypassTriggers
     */
    public void setBypassTriggers(boolean bypassTriggers) {
        this.bypassTriggers = bypassTriggers;
    }


    /**
     * Gets the bypassWorkflow value for this CleanRule.
     * 
     * @return bypassWorkflow
     */
    public boolean isBypassWorkflow() {
        return bypassWorkflow;
    }


    /**
     * Sets the bypassWorkflow value for this CleanRule.
     * 
     * @param bypassWorkflow
     */
    public void setBypassWorkflow(boolean bypassWorkflow) {
        this.bypassWorkflow = bypassWorkflow;
    }


    /**
     * Gets the description value for this CleanRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CleanRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the developerName value for this CleanRule.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this CleanRule.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the fieldMappings value for this CleanRule.
     * 
     * @return fieldMappings
     */
    public com.sforce.soap._2006._04.metadata.FieldMapping[] getFieldMappings() {
        return fieldMappings;
    }


    /**
     * Sets the fieldMappings value for this CleanRule.
     * 
     * @param fieldMappings
     */
    public void setFieldMappings(com.sforce.soap._2006._04.metadata.FieldMapping[] fieldMappings) {
        this.fieldMappings = fieldMappings;
    }

    public com.sforce.soap._2006._04.metadata.FieldMapping getFieldMappings(int i) {
        return this.fieldMappings[i];
    }

    public void setFieldMappings(int i, com.sforce.soap._2006._04.metadata.FieldMapping _value) {
        this.fieldMappings[i] = _value;
    }


    /**
     * Gets the masterLabel value for this CleanRule.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this CleanRule.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the matchRule value for this CleanRule.
     * 
     * @return matchRule
     */
    public java.lang.String getMatchRule() {
        return matchRule;
    }


    /**
     * Sets the matchRule value for this CleanRule.
     * 
     * @param matchRule
     */
    public void setMatchRule(java.lang.String matchRule) {
        this.matchRule = matchRule;
    }


    /**
     * Gets the sourceSobjectType value for this CleanRule.
     * 
     * @return sourceSobjectType
     */
    public java.lang.String getSourceSobjectType() {
        return sourceSobjectType;
    }


    /**
     * Sets the sourceSobjectType value for this CleanRule.
     * 
     * @param sourceSobjectType
     */
    public void setSourceSobjectType(java.lang.String sourceSobjectType) {
        this.sourceSobjectType = sourceSobjectType;
    }


    /**
     * Gets the status value for this CleanRule.
     * 
     * @return status
     */
    public com.sforce.soap._2006._04.metadata.CleanRuleStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CleanRule.
     * 
     * @param status
     */
    public void setStatus(com.sforce.soap._2006._04.metadata.CleanRuleStatus status) {
        this.status = status;
    }


    /**
     * Gets the targetSobjectType value for this CleanRule.
     * 
     * @return targetSobjectType
     */
    public java.lang.String getTargetSobjectType() {
        return targetSobjectType;
    }


    /**
     * Sets the targetSobjectType value for this CleanRule.
     * 
     * @param targetSobjectType
     */
    public void setTargetSobjectType(java.lang.String targetSobjectType) {
        this.targetSobjectType = targetSobjectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CleanRule)) return false;
        CleanRule other = (CleanRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bulkEnabled == other.isBulkEnabled() &&
            this.bypassTriggers == other.isBypassTriggers() &&
            this.bypassWorkflow == other.isBypassWorkflow() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.fieldMappings==null && other.getFieldMappings()==null) || 
             (this.fieldMappings!=null &&
              java.util.Arrays.equals(this.fieldMappings, other.getFieldMappings()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.matchRule==null && other.getMatchRule()==null) || 
             (this.matchRule!=null &&
              this.matchRule.equals(other.getMatchRule()))) &&
            ((this.sourceSobjectType==null && other.getSourceSobjectType()==null) || 
             (this.sourceSobjectType!=null &&
              this.sourceSobjectType.equals(other.getSourceSobjectType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.targetSobjectType==null && other.getTargetSobjectType()==null) || 
             (this.targetSobjectType!=null &&
              this.targetSobjectType.equals(other.getTargetSobjectType())));
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
        _hashCode += (isBulkEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBypassTriggers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBypassWorkflow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getFieldMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getMatchRule() != null) {
            _hashCode += getMatchRule().hashCode();
        }
        if (getSourceSobjectType() != null) {
            _hashCode += getSourceSobjectType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTargetSobjectType() != null) {
            _hashCode += getTargetSobjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CleanRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CleanRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bulkEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bypassTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassWorkflow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bypassWorkflow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "developerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "matchRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sourceSobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CleanRuleStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetSobjectType"));
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
