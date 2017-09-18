/**
 * CampaignInfluenceModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CampaignInfluenceModel  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private boolean isDefaultModel;

    private boolean isModelLocked;

    private java.lang.String modelDescription;

    private java.lang.String name;

    public CampaignInfluenceModel() {
    }

    public CampaignInfluenceModel(
           java.lang.String fullName,
           boolean isDefaultModel,
           boolean isModelLocked,
           java.lang.String modelDescription,
           java.lang.String name) {
        super(
            fullName);
        this.isDefaultModel = isDefaultModel;
        this.isModelLocked = isModelLocked;
        this.modelDescription = modelDescription;
        this.name = name;
    }


    /**
     * Gets the isDefaultModel value for this CampaignInfluenceModel.
     * 
     * @return isDefaultModel
     */
    public boolean isIsDefaultModel() {
        return isDefaultModel;
    }


    /**
     * Sets the isDefaultModel value for this CampaignInfluenceModel.
     * 
     * @param isDefaultModel
     */
    public void setIsDefaultModel(boolean isDefaultModel) {
        this.isDefaultModel = isDefaultModel;
    }


    /**
     * Gets the isModelLocked value for this CampaignInfluenceModel.
     * 
     * @return isModelLocked
     */
    public boolean isIsModelLocked() {
        return isModelLocked;
    }


    /**
     * Sets the isModelLocked value for this CampaignInfluenceModel.
     * 
     * @param isModelLocked
     */
    public void setIsModelLocked(boolean isModelLocked) {
        this.isModelLocked = isModelLocked;
    }


    /**
     * Gets the modelDescription value for this CampaignInfluenceModel.
     * 
     * @return modelDescription
     */
    public java.lang.String getModelDescription() {
        return modelDescription;
    }


    /**
     * Sets the modelDescription value for this CampaignInfluenceModel.
     * 
     * @param modelDescription
     */
    public void setModelDescription(java.lang.String modelDescription) {
        this.modelDescription = modelDescription;
    }


    /**
     * Gets the name value for this CampaignInfluenceModel.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CampaignInfluenceModel.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignInfluenceModel)) return false;
        CampaignInfluenceModel other = (CampaignInfluenceModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.isDefaultModel == other.isIsDefaultModel() &&
            this.isModelLocked == other.isIsModelLocked() &&
            ((this.modelDescription==null && other.getModelDescription()==null) || 
             (this.modelDescription!=null &&
              this.modelDescription.equals(other.getModelDescription()))) &&
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
        _hashCode += (isIsDefaultModel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsModelLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getModelDescription() != null) {
            _hashCode += getModelDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignInfluenceModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CampaignInfluenceModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isDefaultModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isModelLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isModelLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "modelDescription"));
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
