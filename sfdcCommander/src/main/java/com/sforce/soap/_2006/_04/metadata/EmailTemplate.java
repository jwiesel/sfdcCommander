/**
 * EmailTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class EmailTemplate  extends com.sforce.soap._2006._04.metadata.MetadataWithContent  implements java.io.Serializable {
    private java.lang.Double apiVersion;

    private java.lang.String[] attachedDocuments;

    private com.sforce.soap._2006._04.metadata.Attachment[] attachments;

    private boolean available;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.Encoding encodingKey;

    private java.lang.String letterhead;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions;

    private com.sforce.soap._2006._04.metadata.EmailTemplateStyle style;

    private java.lang.String subject;

    private java.lang.String textOnly;

    private com.sforce.soap._2006._04.metadata.EmailTemplateType type;

    public EmailTemplate() {
    }

    public EmailTemplate(
           java.lang.String fullName,
           byte[] content,
           java.lang.Double apiVersion,
           java.lang.String[] attachedDocuments,
           com.sforce.soap._2006._04.metadata.Attachment[] attachments,
           boolean available,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.Encoding encodingKey,
           java.lang.String letterhead,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.PackageVersion[] packageVersions,
           com.sforce.soap._2006._04.metadata.EmailTemplateStyle style,
           java.lang.String subject,
           java.lang.String textOnly,
           com.sforce.soap._2006._04.metadata.EmailTemplateType type) {
        super(
            fullName,
            content);
        this.apiVersion = apiVersion;
        this.attachedDocuments = attachedDocuments;
        this.attachments = attachments;
        this.available = available;
        this.description = description;
        this.encodingKey = encodingKey;
        this.letterhead = letterhead;
        this.name = name;
        this.packageVersions = packageVersions;
        this.style = style;
        this.subject = subject;
        this.textOnly = textOnly;
        this.type = type;
    }


    /**
     * Gets the apiVersion value for this EmailTemplate.
     * 
     * @return apiVersion
     */
    public java.lang.Double getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this EmailTemplate.
     * 
     * @param apiVersion
     */
    public void setApiVersion(java.lang.Double apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the attachedDocuments value for this EmailTemplate.
     * 
     * @return attachedDocuments
     */
    public java.lang.String[] getAttachedDocuments() {
        return attachedDocuments;
    }


    /**
     * Sets the attachedDocuments value for this EmailTemplate.
     * 
     * @param attachedDocuments
     */
    public void setAttachedDocuments(java.lang.String[] attachedDocuments) {
        this.attachedDocuments = attachedDocuments;
    }

    public java.lang.String getAttachedDocuments(int i) {
        return this.attachedDocuments[i];
    }

    public void setAttachedDocuments(int i, java.lang.String _value) {
        this.attachedDocuments[i] = _value;
    }


    /**
     * Gets the attachments value for this EmailTemplate.
     * 
     * @return attachments
     */
    public com.sforce.soap._2006._04.metadata.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this EmailTemplate.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap._2006._04.metadata.Attachment[] attachments) {
        this.attachments = attachments;
    }

    public com.sforce.soap._2006._04.metadata.Attachment getAttachments(int i) {
        return this.attachments[i];
    }

    public void setAttachments(int i, com.sforce.soap._2006._04.metadata.Attachment _value) {
        this.attachments[i] = _value;
    }


    /**
     * Gets the available value for this EmailTemplate.
     * 
     * @return available
     */
    public boolean isAvailable() {
        return available;
    }


    /**
     * Sets the available value for this EmailTemplate.
     * 
     * @param available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }


    /**
     * Gets the description value for this EmailTemplate.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this EmailTemplate.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the encodingKey value for this EmailTemplate.
     * 
     * @return encodingKey
     */
    public com.sforce.soap._2006._04.metadata.Encoding getEncodingKey() {
        return encodingKey;
    }


    /**
     * Sets the encodingKey value for this EmailTemplate.
     * 
     * @param encodingKey
     */
    public void setEncodingKey(com.sforce.soap._2006._04.metadata.Encoding encodingKey) {
        this.encodingKey = encodingKey;
    }


    /**
     * Gets the letterhead value for this EmailTemplate.
     * 
     * @return letterhead
     */
    public java.lang.String getLetterhead() {
        return letterhead;
    }


    /**
     * Sets the letterhead value for this EmailTemplate.
     * 
     * @param letterhead
     */
    public void setLetterhead(java.lang.String letterhead) {
        this.letterhead = letterhead;
    }


    /**
     * Gets the name value for this EmailTemplate.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EmailTemplate.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the packageVersions value for this EmailTemplate.
     * 
     * @return packageVersions
     */
    public com.sforce.soap._2006._04.metadata.PackageVersion[] getPackageVersions() {
        return packageVersions;
    }


    /**
     * Sets the packageVersions value for this EmailTemplate.
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
     * Gets the style value for this EmailTemplate.
     * 
     * @return style
     */
    public com.sforce.soap._2006._04.metadata.EmailTemplateStyle getStyle() {
        return style;
    }


    /**
     * Sets the style value for this EmailTemplate.
     * 
     * @param style
     */
    public void setStyle(com.sforce.soap._2006._04.metadata.EmailTemplateStyle style) {
        this.style = style;
    }


    /**
     * Gets the subject value for this EmailTemplate.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this EmailTemplate.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the textOnly value for this EmailTemplate.
     * 
     * @return textOnly
     */
    public java.lang.String getTextOnly() {
        return textOnly;
    }


    /**
     * Sets the textOnly value for this EmailTemplate.
     * 
     * @param textOnly
     */
    public void setTextOnly(java.lang.String textOnly) {
        this.textOnly = textOnly;
    }


    /**
     * Gets the type value for this EmailTemplate.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.EmailTemplateType getType() {
        return type;
    }


    /**
     * Sets the type value for this EmailTemplate.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.EmailTemplateType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailTemplate)) return false;
        EmailTemplate other = (EmailTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apiVersion==null && other.getApiVersion()==null) || 
             (this.apiVersion!=null &&
              this.apiVersion.equals(other.getApiVersion()))) &&
            ((this.attachedDocuments==null && other.getAttachedDocuments()==null) || 
             (this.attachedDocuments!=null &&
              java.util.Arrays.equals(this.attachedDocuments, other.getAttachedDocuments()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            this.available == other.isAvailable() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.encodingKey==null && other.getEncodingKey()==null) || 
             (this.encodingKey!=null &&
              this.encodingKey.equals(other.getEncodingKey()))) &&
            ((this.letterhead==null && other.getLetterhead()==null) || 
             (this.letterhead!=null &&
              this.letterhead.equals(other.getLetterhead()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.packageVersions==null && other.getPackageVersions()==null) || 
             (this.packageVersions!=null &&
              java.util.Arrays.equals(this.packageVersions, other.getPackageVersions()))) &&
            ((this.style==null && other.getStyle()==null) || 
             (this.style!=null &&
              this.style.equals(other.getStyle()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.textOnly==null && other.getTextOnly()==null) || 
             (this.textOnly!=null &&
              this.textOnly.equals(other.getTextOnly()))) &&
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
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        if (getAttachedDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachedDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachedDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEncodingKey() != null) {
            _hashCode += getEncodingKey().hashCode();
        }
        if (getLetterhead() != null) {
            _hashCode += getLetterhead().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        if (getStyle() != null) {
            _hashCode += getStyle().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getTextOnly() != null) {
            _hashCode += getTextOnly().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "attachedDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "available"));
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
        elemField.setFieldName("encodingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "encodingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Encoding"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letterhead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "letterhead"));
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
        elemField.setFieldName("packageVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "packageVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PackageVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailTemplateStyle"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "textOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailTemplateType"));
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
