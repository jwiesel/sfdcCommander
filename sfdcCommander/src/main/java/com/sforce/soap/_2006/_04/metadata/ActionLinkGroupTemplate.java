/**
 * ActionLinkGroupTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ActionLinkGroupTemplate  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ActionLinkTemplate[] actionLinkTemplates;

    private com.sforce.soap._2006._04.metadata.PlatformActionGroupCategory category;

    private com.sforce.soap._2006._04.metadata.ActionLinkExecutionsAllowed executionsAllowed;

    private java.lang.Integer hoursUntilExpiration;

    private boolean isPublished;

    private java.lang.String name;

    public ActionLinkGroupTemplate() {
    }

    public ActionLinkGroupTemplate(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ActionLinkTemplate[] actionLinkTemplates,
           com.sforce.soap._2006._04.metadata.PlatformActionGroupCategory category,
           com.sforce.soap._2006._04.metadata.ActionLinkExecutionsAllowed executionsAllowed,
           java.lang.Integer hoursUntilExpiration,
           boolean isPublished,
           java.lang.String name) {
        super(
            fullName);
        this.actionLinkTemplates = actionLinkTemplates;
        this.category = category;
        this.executionsAllowed = executionsAllowed;
        this.hoursUntilExpiration = hoursUntilExpiration;
        this.isPublished = isPublished;
        this.name = name;
    }


    /**
     * Gets the actionLinkTemplates value for this ActionLinkGroupTemplate.
     * 
     * @return actionLinkTemplates
     */
    public com.sforce.soap._2006._04.metadata.ActionLinkTemplate[] getActionLinkTemplates() {
        return actionLinkTemplates;
    }


    /**
     * Sets the actionLinkTemplates value for this ActionLinkGroupTemplate.
     * 
     * @param actionLinkTemplates
     */
    public void setActionLinkTemplates(com.sforce.soap._2006._04.metadata.ActionLinkTemplate[] actionLinkTemplates) {
        this.actionLinkTemplates = actionLinkTemplates;
    }

    public com.sforce.soap._2006._04.metadata.ActionLinkTemplate getActionLinkTemplates(int i) {
        return this.actionLinkTemplates[i];
    }

    public void setActionLinkTemplates(int i, com.sforce.soap._2006._04.metadata.ActionLinkTemplate _value) {
        this.actionLinkTemplates[i] = _value;
    }


    /**
     * Gets the category value for this ActionLinkGroupTemplate.
     * 
     * @return category
     */
    public com.sforce.soap._2006._04.metadata.PlatformActionGroupCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ActionLinkGroupTemplate.
     * 
     * @param category
     */
    public void setCategory(com.sforce.soap._2006._04.metadata.PlatformActionGroupCategory category) {
        this.category = category;
    }


    /**
     * Gets the executionsAllowed value for this ActionLinkGroupTemplate.
     * 
     * @return executionsAllowed
     */
    public com.sforce.soap._2006._04.metadata.ActionLinkExecutionsAllowed getExecutionsAllowed() {
        return executionsAllowed;
    }


    /**
     * Sets the executionsAllowed value for this ActionLinkGroupTemplate.
     * 
     * @param executionsAllowed
     */
    public void setExecutionsAllowed(com.sforce.soap._2006._04.metadata.ActionLinkExecutionsAllowed executionsAllowed) {
        this.executionsAllowed = executionsAllowed;
    }


    /**
     * Gets the hoursUntilExpiration value for this ActionLinkGroupTemplate.
     * 
     * @return hoursUntilExpiration
     */
    public java.lang.Integer getHoursUntilExpiration() {
        return hoursUntilExpiration;
    }


    /**
     * Sets the hoursUntilExpiration value for this ActionLinkGroupTemplate.
     * 
     * @param hoursUntilExpiration
     */
    public void setHoursUntilExpiration(java.lang.Integer hoursUntilExpiration) {
        this.hoursUntilExpiration = hoursUntilExpiration;
    }


    /**
     * Gets the isPublished value for this ActionLinkGroupTemplate.
     * 
     * @return isPublished
     */
    public boolean isIsPublished() {
        return isPublished;
    }


    /**
     * Sets the isPublished value for this ActionLinkGroupTemplate.
     * 
     * @param isPublished
     */
    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }


    /**
     * Gets the name value for this ActionLinkGroupTemplate.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ActionLinkGroupTemplate.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActionLinkGroupTemplate)) return false;
        ActionLinkGroupTemplate other = (ActionLinkGroupTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionLinkTemplates==null && other.getActionLinkTemplates()==null) || 
             (this.actionLinkTemplates!=null &&
              java.util.Arrays.equals(this.actionLinkTemplates, other.getActionLinkTemplates()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.executionsAllowed==null && other.getExecutionsAllowed()==null) || 
             (this.executionsAllowed!=null &&
              this.executionsAllowed.equals(other.getExecutionsAllowed()))) &&
            ((this.hoursUntilExpiration==null && other.getHoursUntilExpiration()==null) || 
             (this.hoursUntilExpiration!=null &&
              this.hoursUntilExpiration.equals(other.getHoursUntilExpiration()))) &&
            this.isPublished == other.isIsPublished() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getActionLinkTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionLinkTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionLinkTemplates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getExecutionsAllowed() != null) {
            _hashCode += getExecutionsAllowed().hashCode();
        }
        if (getHoursUntilExpiration() != null) {
            _hashCode += getHoursUntilExpiration().hashCode();
        }
        _hashCode += (isIsPublished() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActionLinkGroupTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkGroupTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionLinkTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionLinkTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformActionGroupCategory"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionsAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "executionsAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkExecutionsAllowed"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursUntilExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "hoursUntilExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublished");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isPublished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
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
