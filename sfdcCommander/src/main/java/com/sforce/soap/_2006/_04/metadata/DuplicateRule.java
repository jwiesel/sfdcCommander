/**
 * DuplicateRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DuplicateRule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.DupeActionType actionOnInsert;

    private com.sforce.soap._2006._04.metadata.DupeActionType actionOnUpdate;

    private java.lang.String alertText;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.DuplicateRuleFilter duplicateRuleFilter;

    private com.sforce.soap._2006._04.metadata.DuplicateRuleMatchRule[] duplicateRuleMatchRules;

    private boolean isActive;

    private java.lang.String masterLabel;

    private java.lang.String[] operationsOnInsert;

    private java.lang.String[] operationsOnUpdate;

    private com.sforce.soap._2006._04.metadata.DupeSecurityOptionType securityOption;

    private int sortOrder;

    public DuplicateRule() {
    }

    public DuplicateRule(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.DupeActionType actionOnInsert,
           com.sforce.soap._2006._04.metadata.DupeActionType actionOnUpdate,
           java.lang.String alertText,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.DuplicateRuleFilter duplicateRuleFilter,
           com.sforce.soap._2006._04.metadata.DuplicateRuleMatchRule[] duplicateRuleMatchRules,
           boolean isActive,
           java.lang.String masterLabel,
           java.lang.String[] operationsOnInsert,
           java.lang.String[] operationsOnUpdate,
           com.sforce.soap._2006._04.metadata.DupeSecurityOptionType securityOption,
           int sortOrder) {
        super(
            fullName);
        this.actionOnInsert = actionOnInsert;
        this.actionOnUpdate = actionOnUpdate;
        this.alertText = alertText;
        this.description = description;
        this.duplicateRuleFilter = duplicateRuleFilter;
        this.duplicateRuleMatchRules = duplicateRuleMatchRules;
        this.isActive = isActive;
        this.masterLabel = masterLabel;
        this.operationsOnInsert = operationsOnInsert;
        this.operationsOnUpdate = operationsOnUpdate;
        this.securityOption = securityOption;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the actionOnInsert value for this DuplicateRule.
     * 
     * @return actionOnInsert
     */
    public com.sforce.soap._2006._04.metadata.DupeActionType getActionOnInsert() {
        return actionOnInsert;
    }


    /**
     * Sets the actionOnInsert value for this DuplicateRule.
     * 
     * @param actionOnInsert
     */
    public void setActionOnInsert(com.sforce.soap._2006._04.metadata.DupeActionType actionOnInsert) {
        this.actionOnInsert = actionOnInsert;
    }


    /**
     * Gets the actionOnUpdate value for this DuplicateRule.
     * 
     * @return actionOnUpdate
     */
    public com.sforce.soap._2006._04.metadata.DupeActionType getActionOnUpdate() {
        return actionOnUpdate;
    }


    /**
     * Sets the actionOnUpdate value for this DuplicateRule.
     * 
     * @param actionOnUpdate
     */
    public void setActionOnUpdate(com.sforce.soap._2006._04.metadata.DupeActionType actionOnUpdate) {
        this.actionOnUpdate = actionOnUpdate;
    }


    /**
     * Gets the alertText value for this DuplicateRule.
     * 
     * @return alertText
     */
    public java.lang.String getAlertText() {
        return alertText;
    }


    /**
     * Sets the alertText value for this DuplicateRule.
     * 
     * @param alertText
     */
    public void setAlertText(java.lang.String alertText) {
        this.alertText = alertText;
    }


    /**
     * Gets the description value for this DuplicateRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DuplicateRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the duplicateRuleFilter value for this DuplicateRule.
     * 
     * @return duplicateRuleFilter
     */
    public com.sforce.soap._2006._04.metadata.DuplicateRuleFilter getDuplicateRuleFilter() {
        return duplicateRuleFilter;
    }


    /**
     * Sets the duplicateRuleFilter value for this DuplicateRule.
     * 
     * @param duplicateRuleFilter
     */
    public void setDuplicateRuleFilter(com.sforce.soap._2006._04.metadata.DuplicateRuleFilter duplicateRuleFilter) {
        this.duplicateRuleFilter = duplicateRuleFilter;
    }


    /**
     * Gets the duplicateRuleMatchRules value for this DuplicateRule.
     * 
     * @return duplicateRuleMatchRules
     */
    public com.sforce.soap._2006._04.metadata.DuplicateRuleMatchRule[] getDuplicateRuleMatchRules() {
        return duplicateRuleMatchRules;
    }


    /**
     * Sets the duplicateRuleMatchRules value for this DuplicateRule.
     * 
     * @param duplicateRuleMatchRules
     */
    public void setDuplicateRuleMatchRules(com.sforce.soap._2006._04.metadata.DuplicateRuleMatchRule[] duplicateRuleMatchRules) {
        this.duplicateRuleMatchRules = duplicateRuleMatchRules;
    }

    public com.sforce.soap._2006._04.metadata.DuplicateRuleMatchRule getDuplicateRuleMatchRules(int i) {
        return this.duplicateRuleMatchRules[i];
    }

    public void setDuplicateRuleMatchRules(int i, com.sforce.soap._2006._04.metadata.DuplicateRuleMatchRule _value) {
        this.duplicateRuleMatchRules[i] = _value;
    }


    /**
     * Gets the isActive value for this DuplicateRule.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this DuplicateRule.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the masterLabel value for this DuplicateRule.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this DuplicateRule.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the operationsOnInsert value for this DuplicateRule.
     * 
     * @return operationsOnInsert
     */
    public java.lang.String[] getOperationsOnInsert() {
        return operationsOnInsert;
    }


    /**
     * Sets the operationsOnInsert value for this DuplicateRule.
     * 
     * @param operationsOnInsert
     */
    public void setOperationsOnInsert(java.lang.String[] operationsOnInsert) {
        this.operationsOnInsert = operationsOnInsert;
    }

    public java.lang.String getOperationsOnInsert(int i) {
        return this.operationsOnInsert[i];
    }

    public void setOperationsOnInsert(int i, java.lang.String _value) {
        this.operationsOnInsert[i] = _value;
    }


    /**
     * Gets the operationsOnUpdate value for this DuplicateRule.
     * 
     * @return operationsOnUpdate
     */
    public java.lang.String[] getOperationsOnUpdate() {
        return operationsOnUpdate;
    }


    /**
     * Sets the operationsOnUpdate value for this DuplicateRule.
     * 
     * @param operationsOnUpdate
     */
    public void setOperationsOnUpdate(java.lang.String[] operationsOnUpdate) {
        this.operationsOnUpdate = operationsOnUpdate;
    }

    public java.lang.String getOperationsOnUpdate(int i) {
        return this.operationsOnUpdate[i];
    }

    public void setOperationsOnUpdate(int i, java.lang.String _value) {
        this.operationsOnUpdate[i] = _value;
    }


    /**
     * Gets the securityOption value for this DuplicateRule.
     * 
     * @return securityOption
     */
    public com.sforce.soap._2006._04.metadata.DupeSecurityOptionType getSecurityOption() {
        return securityOption;
    }


    /**
     * Sets the securityOption value for this DuplicateRule.
     * 
     * @param securityOption
     */
    public void setSecurityOption(com.sforce.soap._2006._04.metadata.DupeSecurityOptionType securityOption) {
        this.securityOption = securityOption;
    }


    /**
     * Gets the sortOrder value for this DuplicateRule.
     * 
     * @return sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this DuplicateRule.
     * 
     * @param sortOrder
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DuplicateRule)) return false;
        DuplicateRule other = (DuplicateRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionOnInsert==null && other.getActionOnInsert()==null) || 
             (this.actionOnInsert!=null &&
              this.actionOnInsert.equals(other.getActionOnInsert()))) &&
            ((this.actionOnUpdate==null && other.getActionOnUpdate()==null) || 
             (this.actionOnUpdate!=null &&
              this.actionOnUpdate.equals(other.getActionOnUpdate()))) &&
            ((this.alertText==null && other.getAlertText()==null) || 
             (this.alertText!=null &&
              this.alertText.equals(other.getAlertText()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.duplicateRuleFilter==null && other.getDuplicateRuleFilter()==null) || 
             (this.duplicateRuleFilter!=null &&
              this.duplicateRuleFilter.equals(other.getDuplicateRuleFilter()))) &&
            ((this.duplicateRuleMatchRules==null && other.getDuplicateRuleMatchRules()==null) || 
             (this.duplicateRuleMatchRules!=null &&
              java.util.Arrays.equals(this.duplicateRuleMatchRules, other.getDuplicateRuleMatchRules()))) &&
            this.isActive == other.isIsActive() &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.operationsOnInsert==null && other.getOperationsOnInsert()==null) || 
             (this.operationsOnInsert!=null &&
              java.util.Arrays.equals(this.operationsOnInsert, other.getOperationsOnInsert()))) &&
            ((this.operationsOnUpdate==null && other.getOperationsOnUpdate()==null) || 
             (this.operationsOnUpdate!=null &&
              java.util.Arrays.equals(this.operationsOnUpdate, other.getOperationsOnUpdate()))) &&
            ((this.securityOption==null && other.getSecurityOption()==null) || 
             (this.securityOption!=null &&
              this.securityOption.equals(other.getSecurityOption()))) &&
            this.sortOrder == other.getSortOrder();
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
        if (getActionOnInsert() != null) {
            _hashCode += getActionOnInsert().hashCode();
        }
        if (getActionOnUpdate() != null) {
            _hashCode += getActionOnUpdate().hashCode();
        }
        if (getAlertText() != null) {
            _hashCode += getAlertText().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDuplicateRuleFilter() != null) {
            _hashCode += getDuplicateRuleFilter().hashCode();
        }
        if (getDuplicateRuleMatchRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicateRuleMatchRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicateRuleMatchRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getOperationsOnInsert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationsOnInsert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationsOnInsert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationsOnUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationsOnUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationsOnUpdate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecurityOption() != null) {
            _hashCode += getSecurityOption().hashCode();
        }
        _hashCode += getSortOrder();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DuplicateRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DuplicateRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionOnInsert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionOnInsert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DupeActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionOnUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionOnUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DupeActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "alertText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateRuleFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "duplicateRuleFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DuplicateRuleFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateRuleMatchRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "duplicateRuleMatchRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DuplicateRuleMatchRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationsOnInsert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "operationsOnInsert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationsOnUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "operationsOnUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "securityOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DupeSecurityOptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
