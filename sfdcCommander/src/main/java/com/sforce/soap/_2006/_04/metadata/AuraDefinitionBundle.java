/**
 * AuraDefinitionBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AuraDefinitionBundle  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private byte[] SVGContent;

    private java.lang.Double apiVersion;

    private byte[] controllerContent;

    private java.lang.String description;

    private byte[] designContent;

    private byte[] documentationContent;

    private byte[] helperContent;

    private byte[] markup;

    private byte[] modelContent;

    private com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions;

    private byte[] rendererContent;

    private byte[] styleContent;

    private byte[] testsuiteContent;

    private com.sforce.soap._2006._04.metadata.AuraBundleType type;

    public AuraDefinitionBundle() {
    }

    public AuraDefinitionBundle(
           java.lang.String fullName,
           byte[] SVGContent,
           java.lang.Double apiVersion,
           byte[] controllerContent,
           java.lang.String description,
           byte[] designContent,
           byte[] documentationContent,
           byte[] helperContent,
           byte[] markup,
           byte[] modelContent,
           com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions,
           byte[] rendererContent,
           byte[] styleContent,
           byte[] testsuiteContent,
           com.sforce.soap._2006._04.metadata.AuraBundleType type) {
        super(
            fullName);
        this.SVGContent = SVGContent;
        this.apiVersion = apiVersion;
        this.controllerContent = controllerContent;
        this.description = description;
        this.designContent = designContent;
        this.documentationContent = documentationContent;
        this.helperContent = helperContent;
        this.markup = markup;
        this.modelContent = modelContent;
        this.packageVersions = packageVersions;
        this.rendererContent = rendererContent;
        this.styleContent = styleContent;
        this.testsuiteContent = testsuiteContent;
        this.type = type;
    }


    /**
     * Gets the SVGContent value for this AuraDefinitionBundle.
     * 
     * @return SVGContent
     */
    public byte[] getSVGContent() {
        return SVGContent;
    }


    /**
     * Sets the SVGContent value for this AuraDefinitionBundle.
     * 
     * @param SVGContent
     */
    public void setSVGContent(byte[] SVGContent) {
        this.SVGContent = SVGContent;
    }


    /**
     * Gets the apiVersion value for this AuraDefinitionBundle.
     * 
     * @return apiVersion
     */
    public java.lang.Double getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this AuraDefinitionBundle.
     * 
     * @param apiVersion
     */
    public void setApiVersion(java.lang.Double apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the controllerContent value for this AuraDefinitionBundle.
     * 
     * @return controllerContent
     */
    public byte[] getControllerContent() {
        return controllerContent;
    }


    /**
     * Sets the controllerContent value for this AuraDefinitionBundle.
     * 
     * @param controllerContent
     */
    public void setControllerContent(byte[] controllerContent) {
        this.controllerContent = controllerContent;
    }


    /**
     * Gets the description value for this AuraDefinitionBundle.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AuraDefinitionBundle.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the designContent value for this AuraDefinitionBundle.
     * 
     * @return designContent
     */
    public byte[] getDesignContent() {
        return designContent;
    }


    /**
     * Sets the designContent value for this AuraDefinitionBundle.
     * 
     * @param designContent
     */
    public void setDesignContent(byte[] designContent) {
        this.designContent = designContent;
    }


    /**
     * Gets the documentationContent value for this AuraDefinitionBundle.
     * 
     * @return documentationContent
     */
    public byte[] getDocumentationContent() {
        return documentationContent;
    }


    /**
     * Sets the documentationContent value for this AuraDefinitionBundle.
     * 
     * @param documentationContent
     */
    public void setDocumentationContent(byte[] documentationContent) {
        this.documentationContent = documentationContent;
    }


    /**
     * Gets the helperContent value for this AuraDefinitionBundle.
     * 
     * @return helperContent
     */
    public byte[] getHelperContent() {
        return helperContent;
    }


    /**
     * Sets the helperContent value for this AuraDefinitionBundle.
     * 
     * @param helperContent
     */
    public void setHelperContent(byte[] helperContent) {
        this.helperContent = helperContent;
    }


    /**
     * Gets the markup value for this AuraDefinitionBundle.
     * 
     * @return markup
     */
    public byte[] getMarkup() {
        return markup;
    }


    /**
     * Sets the markup value for this AuraDefinitionBundle.
     * 
     * @param markup
     */
    public void setMarkup(byte[] markup) {
        this.markup = markup;
    }


    /**
     * Gets the modelContent value for this AuraDefinitionBundle.
     * 
     * @return modelContent
     */
    public byte[] getModelContent() {
        return modelContent;
    }


    /**
     * Sets the modelContent value for this AuraDefinitionBundle.
     * 
     * @param modelContent
     */
    public void setModelContent(byte[] modelContent) {
        this.modelContent = modelContent;
    }


    /**
     * Gets the packageVersions value for this AuraDefinitionBundle.
     * 
     * @return packageVersions
     */
    public com.sforce.soap._2006._04.metadata.PackageVersion[] getPackageVersions() {
        return packageVersions;
    }


    /**
     * Sets the packageVersions value for this AuraDefinitionBundle.
     * 
     * @param packageVersions
     */
    public void setPackageVersions(com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions) {
        this.packageVersions = packageVersions;
    }

    public com.sforce.soap._2006._04.metadata.PackageVersion getPackageVersions(int i) {
        return this.packageVersions[i];
    }

    public void setPackageVersions(int i, com.sforce.soap._2006._04.metadata.PackageVersion _value) {
        this.packageVersions[i] = _value;
    }


    /**
     * Gets the rendererContent value for this AuraDefinitionBundle.
     * 
     * @return rendererContent
     */
    public byte[] getRendererContent() {
        return rendererContent;
    }


    /**
     * Sets the rendererContent value for this AuraDefinitionBundle.
     * 
     * @param rendererContent
     */
    public void setRendererContent(byte[] rendererContent) {
        this.rendererContent = rendererContent;
    }


    /**
     * Gets the styleContent value for this AuraDefinitionBundle.
     * 
     * @return styleContent
     */
    public byte[] getStyleContent() {
        return styleContent;
    }


    /**
     * Sets the styleContent value for this AuraDefinitionBundle.
     * 
     * @param styleContent
     */
    public void setStyleContent(byte[] styleContent) {
        this.styleContent = styleContent;
    }


    /**
     * Gets the testsuiteContent value for this AuraDefinitionBundle.
     * 
     * @return testsuiteContent
     */
    public byte[] getTestsuiteContent() {
        return testsuiteContent;
    }


    /**
     * Sets the testsuiteContent value for this AuraDefinitionBundle.
     * 
     * @param testsuiteContent
     */
    public void setTestsuiteContent(byte[] testsuiteContent) {
        this.testsuiteContent = testsuiteContent;
    }


    /**
     * Gets the type value for this AuraDefinitionBundle.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.AuraBundleType getType() {
        return type;
    }


    /**
     * Sets the type value for this AuraDefinitionBundle.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.AuraBundleType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuraDefinitionBundle)) return false;
        AuraDefinitionBundle other = (AuraDefinitionBundle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SVGContent==null && other.getSVGContent()==null) || 
             (this.SVGContent!=null &&
              java.util.Arrays.equals(this.SVGContent, other.getSVGContent()))) &&
            ((this.apiVersion==null && other.getApiVersion()==null) || 
             (this.apiVersion!=null &&
              this.apiVersion.equals(other.getApiVersion()))) &&
            ((this.controllerContent==null && other.getControllerContent()==null) || 
             (this.controllerContent!=null &&
              java.util.Arrays.equals(this.controllerContent, other.getControllerContent()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.designContent==null && other.getDesignContent()==null) || 
             (this.designContent!=null &&
              java.util.Arrays.equals(this.designContent, other.getDesignContent()))) &&
            ((this.documentationContent==null && other.getDocumentationContent()==null) || 
             (this.documentationContent!=null &&
              java.util.Arrays.equals(this.documentationContent, other.getDocumentationContent()))) &&
            ((this.helperContent==null && other.getHelperContent()==null) || 
             (this.helperContent!=null &&
              java.util.Arrays.equals(this.helperContent, other.getHelperContent()))) &&
            ((this.markup==null && other.getMarkup()==null) || 
             (this.markup!=null &&
              java.util.Arrays.equals(this.markup, other.getMarkup()))) &&
            ((this.modelContent==null && other.getModelContent()==null) || 
             (this.modelContent!=null &&
              java.util.Arrays.equals(this.modelContent, other.getModelContent()))) &&
            ((this.packageVersions==null && other.getPackageVersions()==null) || 
             (this.packageVersions!=null &&
              java.util.Arrays.equals(this.packageVersions, other.getPackageVersions()))) &&
            ((this.rendererContent==null && other.getRendererContent()==null) || 
             (this.rendererContent!=null &&
              java.util.Arrays.equals(this.rendererContent, other.getRendererContent()))) &&
            ((this.styleContent==null && other.getStyleContent()==null) || 
             (this.styleContent!=null &&
              java.util.Arrays.equals(this.styleContent, other.getStyleContent()))) &&
            ((this.testsuiteContent==null && other.getTestsuiteContent()==null) || 
             (this.testsuiteContent!=null &&
              java.util.Arrays.equals(this.testsuiteContent, other.getTestsuiteContent()))) &&
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
        if (getSVGContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSVGContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSVGContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        if (getControllerContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControllerContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControllerContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDesignContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesignContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDesignContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentationContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentationContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentationContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHelperContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHelperContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHelperContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarkup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModelContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModelContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModelContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRendererContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRendererContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRendererContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStyleContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStyleContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStyleContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTestsuiteContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestsuiteContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestsuiteContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuraDefinitionBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuraDefinitionBundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SVGContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SVGContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllerContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "controllerContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("designContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "designContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentationContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "documentationContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helperContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "helperContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "markup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "modelContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "packageVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PackageVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rendererContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rendererContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "styleContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testsuiteContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "testsuiteContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuraBundleType"));
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
