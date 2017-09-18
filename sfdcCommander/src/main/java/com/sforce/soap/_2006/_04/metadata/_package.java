/**
 * _package.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class _package  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.APIAccessLevel apiAccessLevel;

    private java.lang.String description;

    private java.lang.String namespacePrefix;

    private com.sforce.soap._2006._04.metadata.ProfileObjectPermissions[] objectPermissions;

    private java.lang.String packageType;

    private java.lang.String postInstallClass;

    private java.lang.String setupWeblink;

    private com.sforce.soap._2006._04.metadata.PackageTypeMembers[] types;

    private java.lang.String uninstallClass;

    private java.lang.String version;

    public _package() {
    }

    public _package(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.APIAccessLevel apiAccessLevel,
           java.lang.String description,
           java.lang.String namespacePrefix,
           com.sforce.soap._2006._04.metadata.ProfileObjectPermissions[] objectPermissions,
           java.lang.String packageType,
           java.lang.String postInstallClass,
           java.lang.String setupWeblink,
           com.sforce.soap._2006._04.metadata.PackageTypeMembers[] types,
           java.lang.String uninstallClass,
           java.lang.String version) {
        super(
            fullName);
        this.apiAccessLevel = apiAccessLevel;
        this.description = description;
        this.namespacePrefix = namespacePrefix;
        this.objectPermissions = objectPermissions;
        this.packageType = packageType;
        this.postInstallClass = postInstallClass;
        this.setupWeblink = setupWeblink;
        this.types = types;
        this.uninstallClass = uninstallClass;
        this.version = version;
    }


    /**
     * Gets the apiAccessLevel value for this _package.
     * 
     * @return apiAccessLevel
     */
    public com.sforce.soap._2006._04.metadata.APIAccessLevel getApiAccessLevel() {
        return apiAccessLevel;
    }


    /**
     * Sets the apiAccessLevel value for this _package.
     * 
     * @param apiAccessLevel
     */
    public void setApiAccessLevel(com.sforce.soap._2006._04.metadata.APIAccessLevel apiAccessLevel) {
        this.apiAccessLevel = apiAccessLevel;
    }


    /**
     * Gets the description value for this _package.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this _package.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the namespacePrefix value for this _package.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this _package.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the objectPermissions value for this _package.
     * 
     * @return objectPermissions
     */
    public com.sforce.soap._2006._04.metadata.ProfileObjectPermissions[] getObjectPermissions() {
        return objectPermissions;
    }


    /**
     * Sets the objectPermissions value for this _package.
     * 
     * @param objectPermissions
     */
    public void setObjectPermissions(com.sforce.soap._2006._04.metadata.ProfileObjectPermissions[] objectPermissions) {
        this.objectPermissions = objectPermissions;
    }

    public com.sforce.soap._2006._04.metadata.ProfileObjectPermissions getObjectPermissions(int i) {
        return this.objectPermissions[i];
    }

    public void setObjectPermissions(int i, com.sforce.soap._2006._04.metadata.ProfileObjectPermissions _value) {
        this.objectPermissions[i] = _value;
    }


    /**
     * Gets the packageType value for this _package.
     * 
     * @return packageType
     */
    public java.lang.String getPackageType() {
        return packageType;
    }


    /**
     * Sets the packageType value for this _package.
     * 
     * @param packageType
     */
    public void setPackageType(java.lang.String packageType) {
        this.packageType = packageType;
    }


    /**
     * Gets the postInstallClass value for this _package.
     * 
     * @return postInstallClass
     */
    public java.lang.String getPostInstallClass() {
        return postInstallClass;
    }


    /**
     * Sets the postInstallClass value for this _package.
     * 
     * @param postInstallClass
     */
    public void setPostInstallClass(java.lang.String postInstallClass) {
        this.postInstallClass = postInstallClass;
    }


    /**
     * Gets the setupWeblink value for this _package.
     * 
     * @return setupWeblink
     */
    public java.lang.String getSetupWeblink() {
        return setupWeblink;
    }


    /**
     * Sets the setupWeblink value for this _package.
     * 
     * @param setupWeblink
     */
    public void setSetupWeblink(java.lang.String setupWeblink) {
        this.setupWeblink = setupWeblink;
    }


    /**
     * Gets the types value for this _package.
     * 
     * @return types
     */
    public com.sforce.soap._2006._04.metadata.PackageTypeMembers[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this _package.
     * 
     * @param types
     */
    public void setTypes(com.sforce.soap._2006._04.metadata.PackageTypeMembers[] types) {
        this.types = types;
    }

    public com.sforce.soap._2006._04.metadata.PackageTypeMembers getTypes(int i) {
        return this.types[i];
    }

    public void setTypes(int i, com.sforce.soap._2006._04.metadata.PackageTypeMembers _value) {
        this.types[i] = _value;
    }


    /**
     * Gets the uninstallClass value for this _package.
     * 
     * @return uninstallClass
     */
    public java.lang.String getUninstallClass() {
        return uninstallClass;
    }


    /**
     * Sets the uninstallClass value for this _package.
     * 
     * @param uninstallClass
     */
    public void setUninstallClass(java.lang.String uninstallClass) {
        this.uninstallClass = uninstallClass;
    }


    /**
     * Gets the version value for this _package.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this _package.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _package)) return false;
        _package other = (_package) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apiAccessLevel==null && other.getApiAccessLevel()==null) || 
             (this.apiAccessLevel!=null &&
              this.apiAccessLevel.equals(other.getApiAccessLevel()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.objectPermissions==null && other.getObjectPermissions()==null) || 
             (this.objectPermissions!=null &&
              java.util.Arrays.equals(this.objectPermissions, other.getObjectPermissions()))) &&
            ((this.packageType==null && other.getPackageType()==null) || 
             (this.packageType!=null &&
              this.packageType.equals(other.getPackageType()))) &&
            ((this.postInstallClass==null && other.getPostInstallClass()==null) || 
             (this.postInstallClass!=null &&
              this.postInstallClass.equals(other.getPostInstallClass()))) &&
            ((this.setupWeblink==null && other.getSetupWeblink()==null) || 
             (this.setupWeblink!=null &&
              this.setupWeblink.equals(other.getSetupWeblink()))) &&
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes()))) &&
            ((this.uninstallClass==null && other.getUninstallClass()==null) || 
             (this.uninstallClass!=null &&
              this.uninstallClass.equals(other.getUninstallClass()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getApiAccessLevel() != null) {
            _hashCode += getApiAccessLevel().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getObjectPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageType() != null) {
            _hashCode += getPackageType().hashCode();
        }
        if (getPostInstallClass() != null) {
            _hashCode += getPostInstallClass().hashCode();
        }
        if (getSetupWeblink() != null) {
            _hashCode += getSetupWeblink().hashCode();
        }
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUninstallClass() != null) {
            _hashCode += getUninstallClass().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_package.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Package"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apiAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "APIAccessLevel"));
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
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "namespacePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "objectPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileObjectPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "packageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postInstallClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "postInstallClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupWeblink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "setupWeblink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PackageTypeMembers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uninstallClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "uninstallClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "version"));
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
