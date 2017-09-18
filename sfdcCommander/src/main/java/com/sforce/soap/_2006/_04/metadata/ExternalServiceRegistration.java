/**
 * ExternalServiceRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ExternalServiceRegistration  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String label;

    private java.lang.String namedCredential;

    private java.lang.String schema;

    private java.lang.String schemaType;

    private java.lang.String schemaUrl;

    private java.lang.String status;

    public ExternalServiceRegistration() {
    }

    public ExternalServiceRegistration(
           java.lang.String fullName,
           java.lang.String description,
           java.lang.String label,
           java.lang.String namedCredential,
           java.lang.String schema,
           java.lang.String schemaType,
           java.lang.String schemaUrl,
           java.lang.String status) {
        super(
            fullName);
        this.description = description;
        this.label = label;
        this.namedCredential = namedCredential;
        this.schema = schema;
        this.schemaType = schemaType;
        this.schemaUrl = schemaUrl;
        this.status = status;
    }


    /**
     * Gets the description value for this ExternalServiceRegistration.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExternalServiceRegistration.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the label value for this ExternalServiceRegistration.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ExternalServiceRegistration.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the namedCredential value for this ExternalServiceRegistration.
     * 
     * @return namedCredential
     */
    public java.lang.String getNamedCredential() {
        return namedCredential;
    }


    /**
     * Sets the namedCredential value for this ExternalServiceRegistration.
     * 
     * @param namedCredential
     */
    public void setNamedCredential(java.lang.String namedCredential) {
        this.namedCredential = namedCredential;
    }


    /**
     * Gets the schema value for this ExternalServiceRegistration.
     * 
     * @return schema
     */
    public java.lang.String getSchema() {
        return schema;
    }


    /**
     * Sets the schema value for this ExternalServiceRegistration.
     * 
     * @param schema
     */
    public void setSchema(java.lang.String schema) {
        this.schema = schema;
    }


    /**
     * Gets the schemaType value for this ExternalServiceRegistration.
     * 
     * @return schemaType
     */
    public java.lang.String getSchemaType() {
        return schemaType;
    }


    /**
     * Sets the schemaType value for this ExternalServiceRegistration.
     * 
     * @param schemaType
     */
    public void setSchemaType(java.lang.String schemaType) {
        this.schemaType = schemaType;
    }


    /**
     * Gets the schemaUrl value for this ExternalServiceRegistration.
     * 
     * @return schemaUrl
     */
    public java.lang.String getSchemaUrl() {
        return schemaUrl;
    }


    /**
     * Sets the schemaUrl value for this ExternalServiceRegistration.
     * 
     * @param schemaUrl
     */
    public void setSchemaUrl(java.lang.String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }


    /**
     * Gets the status value for this ExternalServiceRegistration.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExternalServiceRegistration.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalServiceRegistration)) return false;
        ExternalServiceRegistration other = (ExternalServiceRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.namedCredential==null && other.getNamedCredential()==null) || 
             (this.namedCredential!=null &&
              this.namedCredential.equals(other.getNamedCredential()))) &&
            ((this.schema==null && other.getSchema()==null) || 
             (this.schema!=null &&
              this.schema.equals(other.getSchema()))) &&
            ((this.schemaType==null && other.getSchemaType()==null) || 
             (this.schemaType!=null &&
              this.schemaType.equals(other.getSchemaType()))) &&
            ((this.schemaUrl==null && other.getSchemaUrl()==null) || 
             (this.schemaUrl!=null &&
              this.schemaUrl.equals(other.getSchemaUrl()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getNamedCredential() != null) {
            _hashCode += getNamedCredential().hashCode();
        }
        if (getSchema() != null) {
            _hashCode += getSchema().hashCode();
        }
        if (getSchemaType() != null) {
            _hashCode += getSchemaType().hashCode();
        }
        if (getSchemaUrl() != null) {
            _hashCode += getSchemaUrl().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalServiceRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ExternalServiceRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "namedCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "schema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "schemaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "schemaUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "status"));
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
