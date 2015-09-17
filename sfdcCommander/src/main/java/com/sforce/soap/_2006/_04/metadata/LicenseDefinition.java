/**
 * LicenseDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LicenseDefinition  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String aggregationGroup;

    private java.lang.String description;

    private boolean isPublished;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.LicensedCustomPermissions[] licensedCustomPermissions;

    private java.lang.String licensingAuthority;

    private java.lang.String licensingAuthorityProvider;

    private int minPlatformVersion;

    private java.lang.String origin;

    private int revision;

    private int trialLicenseDuration;

    private int trialLicenseQuantity;

    public LicenseDefinition() {
    }

    public LicenseDefinition(
           java.lang.String fullName,
           java.lang.String aggregationGroup,
           java.lang.String description,
           boolean isPublished,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.LicensedCustomPermissions[] licensedCustomPermissions,
           java.lang.String licensingAuthority,
           java.lang.String licensingAuthorityProvider,
           int minPlatformVersion,
           java.lang.String origin,
           int revision,
           int trialLicenseDuration,
           int trialLicenseQuantity) {
        super(
            fullName);
        this.aggregationGroup = aggregationGroup;
        this.description = description;
        this.isPublished = isPublished;
        this.label = label;
        this.licensedCustomPermissions = licensedCustomPermissions;
        this.licensingAuthority = licensingAuthority;
        this.licensingAuthorityProvider = licensingAuthorityProvider;
        this.minPlatformVersion = minPlatformVersion;
        this.origin = origin;
        this.revision = revision;
        this.trialLicenseDuration = trialLicenseDuration;
        this.trialLicenseQuantity = trialLicenseQuantity;
    }


    /**
     * Gets the aggregationGroup value for this LicenseDefinition.
     * 
     * @return aggregationGroup
     */
    public java.lang.String getAggregationGroup() {
        return aggregationGroup;
    }


    /**
     * Sets the aggregationGroup value for this LicenseDefinition.
     * 
     * @param aggregationGroup
     */
    public void setAggregationGroup(java.lang.String aggregationGroup) {
        this.aggregationGroup = aggregationGroup;
    }


    /**
     * Gets the description value for this LicenseDefinition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LicenseDefinition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isPublished value for this LicenseDefinition.
     * 
     * @return isPublished
     */
    public boolean isIsPublished() {
        return isPublished;
    }


    /**
     * Sets the isPublished value for this LicenseDefinition.
     * 
     * @param isPublished
     */
    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }


    /**
     * Gets the label value for this LicenseDefinition.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this LicenseDefinition.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the licensedCustomPermissions value for this LicenseDefinition.
     * 
     * @return licensedCustomPermissions
     */
    public com.sforce.soap._2006._04.metadata.LicensedCustomPermissions[] getLicensedCustomPermissions() {
        return licensedCustomPermissions;
    }


    /**
     * Sets the licensedCustomPermissions value for this LicenseDefinition.
     * 
     * @param licensedCustomPermissions
     */
    public void setLicensedCustomPermissions(com.sforce.soap._2006._04.metadata.LicensedCustomPermissions[] licensedCustomPermissions) {
        this.licensedCustomPermissions = licensedCustomPermissions;
    }

    public com.sforce.soap._2006._04.metadata.LicensedCustomPermissions getLicensedCustomPermissions(int i) {
        return this.licensedCustomPermissions[i];
    }

    public void setLicensedCustomPermissions(int i, com.sforce.soap._2006._04.metadata.LicensedCustomPermissions _value) {
        this.licensedCustomPermissions[i] = _value;
    }


    /**
     * Gets the licensingAuthority value for this LicenseDefinition.
     * 
     * @return licensingAuthority
     */
    public java.lang.String getLicensingAuthority() {
        return licensingAuthority;
    }


    /**
     * Sets the licensingAuthority value for this LicenseDefinition.
     * 
     * @param licensingAuthority
     */
    public void setLicensingAuthority(java.lang.String licensingAuthority) {
        this.licensingAuthority = licensingAuthority;
    }


    /**
     * Gets the licensingAuthorityProvider value for this LicenseDefinition.
     * 
     * @return licensingAuthorityProvider
     */
    public java.lang.String getLicensingAuthorityProvider() {
        return licensingAuthorityProvider;
    }


    /**
     * Sets the licensingAuthorityProvider value for this LicenseDefinition.
     * 
     * @param licensingAuthorityProvider
     */
    public void setLicensingAuthorityProvider(java.lang.String licensingAuthorityProvider) {
        this.licensingAuthorityProvider = licensingAuthorityProvider;
    }


    /**
     * Gets the minPlatformVersion value for this LicenseDefinition.
     * 
     * @return minPlatformVersion
     */
    public int getMinPlatformVersion() {
        return minPlatformVersion;
    }


    /**
     * Sets the minPlatformVersion value for this LicenseDefinition.
     * 
     * @param minPlatformVersion
     */
    public void setMinPlatformVersion(int minPlatformVersion) {
        this.minPlatformVersion = minPlatformVersion;
    }


    /**
     * Gets the origin value for this LicenseDefinition.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this LicenseDefinition.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the revision value for this LicenseDefinition.
     * 
     * @return revision
     */
    public int getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this LicenseDefinition.
     * 
     * @param revision
     */
    public void setRevision(int revision) {
        this.revision = revision;
    }


    /**
     * Gets the trialLicenseDuration value for this LicenseDefinition.
     * 
     * @return trialLicenseDuration
     */
    public int getTrialLicenseDuration() {
        return trialLicenseDuration;
    }


    /**
     * Sets the trialLicenseDuration value for this LicenseDefinition.
     * 
     * @param trialLicenseDuration
     */
    public void setTrialLicenseDuration(int trialLicenseDuration) {
        this.trialLicenseDuration = trialLicenseDuration;
    }


    /**
     * Gets the trialLicenseQuantity value for this LicenseDefinition.
     * 
     * @return trialLicenseQuantity
     */
    public int getTrialLicenseQuantity() {
        return trialLicenseQuantity;
    }


    /**
     * Sets the trialLicenseQuantity value for this LicenseDefinition.
     * 
     * @param trialLicenseQuantity
     */
    public void setTrialLicenseQuantity(int trialLicenseQuantity) {
        this.trialLicenseQuantity = trialLicenseQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseDefinition)) return false;
        LicenseDefinition other = (LicenseDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aggregationGroup==null && other.getAggregationGroup()==null) || 
             (this.aggregationGroup!=null &&
              this.aggregationGroup.equals(other.getAggregationGroup()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.isPublished == other.isIsPublished() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.licensedCustomPermissions==null && other.getLicensedCustomPermissions()==null) || 
             (this.licensedCustomPermissions!=null &&
              java.util.Arrays.equals(this.licensedCustomPermissions, other.getLicensedCustomPermissions()))) &&
            ((this.licensingAuthority==null && other.getLicensingAuthority()==null) || 
             (this.licensingAuthority!=null &&
              this.licensingAuthority.equals(other.getLicensingAuthority()))) &&
            ((this.licensingAuthorityProvider==null && other.getLicensingAuthorityProvider()==null) || 
             (this.licensingAuthorityProvider!=null &&
              this.licensingAuthorityProvider.equals(other.getLicensingAuthorityProvider()))) &&
            this.minPlatformVersion == other.getMinPlatformVersion() &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            this.revision == other.getRevision() &&
            this.trialLicenseDuration == other.getTrialLicenseDuration() &&
            this.trialLicenseQuantity == other.getTrialLicenseQuantity();
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
        if (getAggregationGroup() != null) {
            _hashCode += getAggregationGroup().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isIsPublished() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLicensedCustomPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicensedCustomPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicensedCustomPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLicensingAuthority() != null) {
            _hashCode += getLicensingAuthority().hashCode();
        }
        if (getLicensingAuthorityProvider() != null) {
            _hashCode += getLicensingAuthorityProvider().hashCode();
        }
        _hashCode += getMinPlatformVersion();
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        _hashCode += getRevision();
        _hashCode += getTrialLicenseDuration();
        _hashCode += getTrialLicenseQuantity();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenseDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LicenseDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregationGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregationGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isPublished");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isPublished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licensedCustomPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "licensedCustomPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LicensedCustomPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licensingAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "licensingAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licensingAuthorityProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "licensingAuthorityProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minPlatformVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "minPlatformVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialLicenseDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "trialLicenseDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialLicenseQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "trialLicenseQuantity"));
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
