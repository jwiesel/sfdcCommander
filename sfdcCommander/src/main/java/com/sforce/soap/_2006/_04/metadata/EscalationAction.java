/**
 * EscalationAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EscalationAction  implements java.io.Serializable {
    private java.lang.String assignedTo;

    private java.lang.String assignedToTemplate;

    private com.sforce.soap._2006._04.metadata.AssignToLookupValueType assignedToType;

    private java.lang.Integer minutesToEscalation;

    private java.lang.Boolean notifyCaseOwner;

    private java.lang.String[] notifyEmail;

    private java.lang.String notifyTo;

    private java.lang.String notifyToTemplate;

    public EscalationAction() {
    }

    public EscalationAction(
           java.lang.String assignedTo,
           java.lang.String assignedToTemplate,
           com.sforce.soap._2006._04.metadata.AssignToLookupValueType assignedToType,
           java.lang.Integer minutesToEscalation,
           java.lang.Boolean notifyCaseOwner,
           java.lang.String[] notifyEmail,
           java.lang.String notifyTo,
           java.lang.String notifyToTemplate) {
           this.assignedTo = assignedTo;
           this.assignedToTemplate = assignedToTemplate;
           this.assignedToType = assignedToType;
           this.minutesToEscalation = minutesToEscalation;
           this.notifyCaseOwner = notifyCaseOwner;
           this.notifyEmail = notifyEmail;
           this.notifyTo = notifyTo;
           this.notifyToTemplate = notifyToTemplate;
    }


    /**
     * Gets the assignedTo value for this EscalationAction.
     * 
     * @return assignedTo
     */
    public java.lang.String getAssignedTo() {
        return assignedTo;
    }


    /**
     * Sets the assignedTo value for this EscalationAction.
     * 
     * @param assignedTo
     */
    public void setAssignedTo(java.lang.String assignedTo) {
        this.assignedTo = assignedTo;
    }


    /**
     * Gets the assignedToTemplate value for this EscalationAction.
     * 
     * @return assignedToTemplate
     */
    public java.lang.String getAssignedToTemplate() {
        return assignedToTemplate;
    }


    /**
     * Sets the assignedToTemplate value for this EscalationAction.
     * 
     * @param assignedToTemplate
     */
    public void setAssignedToTemplate(java.lang.String assignedToTemplate) {
        this.assignedToTemplate = assignedToTemplate;
    }


    /**
     * Gets the assignedToType value for this EscalationAction.
     * 
     * @return assignedToType
     */
    public com.sforce.soap._2006._04.metadata.AssignToLookupValueType getAssignedToType() {
        return assignedToType;
    }


    /**
     * Sets the assignedToType value for this EscalationAction.
     * 
     * @param assignedToType
     */
    public void setAssignedToType(com.sforce.soap._2006._04.metadata.AssignToLookupValueType assignedToType) {
        this.assignedToType = assignedToType;
    }


    /**
     * Gets the minutesToEscalation value for this EscalationAction.
     * 
     * @return minutesToEscalation
     */
    public java.lang.Integer getMinutesToEscalation() {
        return minutesToEscalation;
    }


    /**
     * Sets the minutesToEscalation value for this EscalationAction.
     * 
     * @param minutesToEscalation
     */
    public void setMinutesToEscalation(java.lang.Integer minutesToEscalation) {
        this.minutesToEscalation = minutesToEscalation;
    }


    /**
     * Gets the notifyCaseOwner value for this EscalationAction.
     * 
     * @return notifyCaseOwner
     */
    public java.lang.Boolean getNotifyCaseOwner() {
        return notifyCaseOwner;
    }


    /**
     * Sets the notifyCaseOwner value for this EscalationAction.
     * 
     * @param notifyCaseOwner
     */
    public void setNotifyCaseOwner(java.lang.Boolean notifyCaseOwner) {
        this.notifyCaseOwner = notifyCaseOwner;
    }


    /**
     * Gets the notifyEmail value for this EscalationAction.
     * 
     * @return notifyEmail
     */
    public java.lang.String[] getNotifyEmail() {
        return notifyEmail;
    }


    /**
     * Sets the notifyEmail value for this EscalationAction.
     * 
     * @param notifyEmail
     */
    public void setNotifyEmail(java.lang.String[] notifyEmail) {
        this.notifyEmail = notifyEmail;
    }

    public java.lang.String getNotifyEmail(int i) {
        return this.notifyEmail[i];
    }

    public void setNotifyEmail(int i, java.lang.String _value) {
        this.notifyEmail[i] = _value;
    }


    /**
     * Gets the notifyTo value for this EscalationAction.
     * 
     * @return notifyTo
     */
    public java.lang.String getNotifyTo() {
        return notifyTo;
    }


    /**
     * Sets the notifyTo value for this EscalationAction.
     * 
     * @param notifyTo
     */
    public void setNotifyTo(java.lang.String notifyTo) {
        this.notifyTo = notifyTo;
    }


    /**
     * Gets the notifyToTemplate value for this EscalationAction.
     * 
     * @return notifyToTemplate
     */
    public java.lang.String getNotifyToTemplate() {
        return notifyToTemplate;
    }


    /**
     * Sets the notifyToTemplate value for this EscalationAction.
     * 
     * @param notifyToTemplate
     */
    public void setNotifyToTemplate(java.lang.String notifyToTemplate) {
        this.notifyToTemplate = notifyToTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EscalationAction)) return false;
        EscalationAction other = (EscalationAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assignedTo==null && other.getAssignedTo()==null) || 
             (this.assignedTo!=null &&
              this.assignedTo.equals(other.getAssignedTo()))) &&
            ((this.assignedToTemplate==null && other.getAssignedToTemplate()==null) || 
             (this.assignedToTemplate!=null &&
              this.assignedToTemplate.equals(other.getAssignedToTemplate()))) &&
            ((this.assignedToType==null && other.getAssignedToType()==null) || 
             (this.assignedToType!=null &&
              this.assignedToType.equals(other.getAssignedToType()))) &&
            ((this.minutesToEscalation==null && other.getMinutesToEscalation()==null) || 
             (this.minutesToEscalation!=null &&
              this.minutesToEscalation.equals(other.getMinutesToEscalation()))) &&
            ((this.notifyCaseOwner==null && other.getNotifyCaseOwner()==null) || 
             (this.notifyCaseOwner!=null &&
              this.notifyCaseOwner.equals(other.getNotifyCaseOwner()))) &&
            ((this.notifyEmail==null && other.getNotifyEmail()==null) || 
             (this.notifyEmail!=null &&
              java.util.Arrays.equals(this.notifyEmail, other.getNotifyEmail()))) &&
            ((this.notifyTo==null && other.getNotifyTo()==null) || 
             (this.notifyTo!=null &&
              this.notifyTo.equals(other.getNotifyTo()))) &&
            ((this.notifyToTemplate==null && other.getNotifyToTemplate()==null) || 
             (this.notifyToTemplate!=null &&
              this.notifyToTemplate.equals(other.getNotifyToTemplate())));
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
        if (getAssignedTo() != null) {
            _hashCode += getAssignedTo().hashCode();
        }
        if (getAssignedToTemplate() != null) {
            _hashCode += getAssignedToTemplate().hashCode();
        }
        if (getAssignedToType() != null) {
            _hashCode += getAssignedToType().hashCode();
        }
        if (getMinutesToEscalation() != null) {
            _hashCode += getMinutesToEscalation().hashCode();
        }
        if (getNotifyCaseOwner() != null) {
            _hashCode += getNotifyCaseOwner().hashCode();
        }
        if (getNotifyEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifyEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifyEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotifyTo() != null) {
            _hashCode += getNotifyTo().hashCode();
        }
        if (getNotifyToTemplate() != null) {
            _hashCode += getNotifyToTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EscalationAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedToTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignedToTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedToType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignedToType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AssignToLookupValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesToEscalation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "minutesToEscalation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyCaseOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyCaseOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyToTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "notifyToTemplate"));
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
