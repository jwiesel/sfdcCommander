/**
 * ModerationRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ModerationRule  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ModerationRuleAction action;

    private java.lang.Integer actionLimit;

    private boolean active;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.ModeratedEntityField[] entitiesAndFields;

    private java.lang.String masterLabel;

    private java.lang.Integer notifyLimit;

    private com.sforce.soap._2006._04.metadata.RateLimitTimePeriod timePeriod;

    private com.sforce.soap._2006._04.metadata.ModerationRuleType type;

    private java.lang.String[] userCriteria;

    private java.lang.String userMessage;

    public ModerationRule() {
    }

    public ModerationRule(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ModerationRuleAction action,
           java.lang.Integer actionLimit,
           boolean active,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.ModeratedEntityField[] entitiesAndFields,
           java.lang.String masterLabel,
           java.lang.Integer notifyLimit,
           com.sforce.soap._2006._04.metadata.RateLimitTimePeriod timePeriod,
           com.sforce.soap._2006._04.metadata.ModerationRuleType type,
           java.lang.String[] userCriteria,
           java.lang.String userMessage) {
        super(
            fullName);
        this.action = action;
        this.actionLimit = actionLimit;
        this.active = active;
        this.description = description;
        this.entitiesAndFields = entitiesAndFields;
        this.masterLabel = masterLabel;
        this.notifyLimit = notifyLimit;
        this.timePeriod = timePeriod;
        this.type = type;
        this.userCriteria = userCriteria;
        this.userMessage = userMessage;
    }


    /**
     * Gets the action value for this ModerationRule.
     * 
     * @return action
     */
    public com.sforce.soap._2006._04.metadata.ModerationRuleAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this ModerationRule.
     * 
     * @param action
     */
    public void setAction(com.sforce.soap._2006._04.metadata.ModerationRuleAction action) {
        this.action = action;
    }


    /**
     * Gets the actionLimit value for this ModerationRule.
     * 
     * @return actionLimit
     */
    public java.lang.Integer getActionLimit() {
        return actionLimit;
    }


    /**
     * Sets the actionLimit value for this ModerationRule.
     * 
     * @param actionLimit
     */
    public void setActionLimit(java.lang.Integer actionLimit) {
        this.actionLimit = actionLimit;
    }


    /**
     * Gets the active value for this ModerationRule.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ModerationRule.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the description value for this ModerationRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ModerationRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the entitiesAndFields value for this ModerationRule.
     * 
     * @return entitiesAndFields
     */
    public com.sforce.soap._2006._04.metadata.ModeratedEntityField[] getEntitiesAndFields() {
        return entitiesAndFields;
    }


    /**
     * Sets the entitiesAndFields value for this ModerationRule.
     * 
     * @param entitiesAndFields
     */
    public void setEntitiesAndFields(com.sforce.soap._2006._04.metadata.ModeratedEntityField[] entitiesAndFields) {
        this.entitiesAndFields = entitiesAndFields;
    }

    public com.sforce.soap._2006._04.metadata.ModeratedEntityField getEntitiesAndFields(int i) {
        return this.entitiesAndFields[i];
    }

    public void setEntitiesAndFields(int i, com.sforce.soap._2006._04.metadata.ModeratedEntityField _value) {
        this.entitiesAndFields[i] = _value;
    }


    /**
     * Gets the masterLabel value for this ModerationRule.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this ModerationRule.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the notifyLimit value for this ModerationRule.
     * 
     * @return notifyLimit
     */
    public java.lang.Integer getNotifyLimit() {
        return notifyLimit;
    }


    /**
     * Sets the notifyLimit value for this ModerationRule.
     * 
     * @param notifyLimit
     */
    public void setNotifyLimit(java.lang.Integer notifyLimit) {
        this.notifyLimit = notifyLimit;
    }


    /**
     * Gets the timePeriod value for this ModerationRule.
     * 
     * @return timePeriod
     */
    public com.sforce.soap._2006._04.metadata.RateLimitTimePeriod getTimePeriod() {
        return timePeriod;
    }


    /**
     * Sets the timePeriod value for this ModerationRule.
     * 
     * @param timePeriod
     */
    public void setTimePeriod(com.sforce.soap._2006._04.metadata.RateLimitTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }


    /**
     * Gets the type value for this ModerationRule.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.ModerationRuleType getType() {
        return type;
    }


    /**
     * Sets the type value for this ModerationRule.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.ModerationRuleType type) {
        this.type = type;
    }


    /**
     * Gets the userCriteria value for this ModerationRule.
     * 
     * @return userCriteria
     */
    public java.lang.String[] getUserCriteria() {
        return userCriteria;
    }


    /**
     * Sets the userCriteria value for this ModerationRule.
     * 
     * @param userCriteria
     */
    public void setUserCriteria(java.lang.String[] userCriteria) {
        this.userCriteria = userCriteria;
    }

    public java.lang.String getUserCriteria(int i) {
        return this.userCriteria[i];
    }

    public void setUserCriteria(int i, java.lang.String _value) {
        this.userCriteria[i] = _value;
    }


    /**
     * Gets the userMessage value for this ModerationRule.
     * 
     * @return userMessage
     */
    public java.lang.String getUserMessage() {
        return userMessage;
    }


    /**
     * Sets the userMessage value for this ModerationRule.
     * 
     * @param userMessage
     */
    public void setUserMessage(java.lang.String userMessage) {
        this.userMessage = userMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModerationRule)) return false;
        ModerationRule other = (ModerationRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.actionLimit==null && other.getActionLimit()==null) || 
             (this.actionLimit!=null &&
              this.actionLimit.equals(other.getActionLimit()))) &&
            this.active == other.isActive() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.entitiesAndFields==null && other.getEntitiesAndFields()==null) || 
             (this.entitiesAndFields!=null &&
              java.util.Arrays.equals(this.entitiesAndFields, other.getEntitiesAndFields()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.notifyLimit==null && other.getNotifyLimit()==null) || 
             (this.notifyLimit!=null &&
              this.notifyLimit.equals(other.getNotifyLimit()))) &&
            ((this.timePeriod==null && other.getTimePeriod()==null) || 
             (this.timePeriod!=null &&
              this.timePeriod.equals(other.getTimePeriod()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userCriteria==null && other.getUserCriteria()==null) || 
             (this.userCriteria!=null &&
              java.util.Arrays.equals(this.userCriteria, other.getUserCriteria()))) &&
            ((this.userMessage==null && other.getUserMessage()==null) || 
             (this.userMessage!=null &&
              this.userMessage.equals(other.getUserMessage())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getActionLimit() != null) {
            _hashCode += getActionLimit().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEntitiesAndFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntitiesAndFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntitiesAndFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNotifyLimit() != null) {
            _hashCode += getNotifyLimit().hashCode();
        }
        if (getTimePeriod() != null) {
            _hashCode += getTimePeriod().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserMessage() != null) {
            _hashCode += getUserMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModerationRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ModerationRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ModerationRuleAction"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitiesAndFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "entitiesAndFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ModeratedEntityField"));
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
        elemField.setFieldName("notifyLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "timePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RateLimitTimePeriod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ModerationRuleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userMessage"));
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
