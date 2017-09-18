/**
 * PermissionSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PermissionSet  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.PermissionSetApplicationVisibility[] applicationVisibilities;

    private com.sforce.soap._2006._04.metadata.PermissionSetApexClassAccess[] classAccesses;

    private com.sforce.soap._2006._04.metadata.PermissionSetCustomPermissions[] customPermissions;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.PermissionSetExternalDataSourceAccess[] externalDataSourceAccesses;

    private com.sforce.soap._2006._04.metadata.PermissionSetFieldPermissions[] fieldPermissions;

    private java.lang.Boolean hasActivationRequired;

    private java.lang.String label;

    private java.lang.String license;

    private com.sforce.soap._2006._04.metadata.PermissionSetObjectPermissions[] objectPermissions;

    private com.sforce.soap._2006._04.metadata.PermissionSetApexPageAccess[] pageAccesses;

    private com.sforce.soap._2006._04.metadata.PermissionSetRecordTypeVisibility[] recordTypeVisibilities;

    private com.sforce.soap._2006._04.metadata.PermissionSetTabSetting[] tabSettings;

    private com.sforce.soap._2006._04.metadata.PermissionSetUserPermission[] userPermissions;

    public PermissionSet() {
    }

    public PermissionSet(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.PermissionSetApplicationVisibility[] applicationVisibilities,
           com.sforce.soap._2006._04.metadata.PermissionSetApexClassAccess[] classAccesses,
           com.sforce.soap._2006._04.metadata.PermissionSetCustomPermissions[] customPermissions,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.PermissionSetExternalDataSourceAccess[] externalDataSourceAccesses,
           com.sforce.soap._2006._04.metadata.PermissionSetFieldPermissions[] fieldPermissions,
           java.lang.Boolean hasActivationRequired,
           java.lang.String label,
           java.lang.String license,
           com.sforce.soap._2006._04.metadata.PermissionSetObjectPermissions[] objectPermissions,
           com.sforce.soap._2006._04.metadata.PermissionSetApexPageAccess[] pageAccesses,
           com.sforce.soap._2006._04.metadata.PermissionSetRecordTypeVisibility[] recordTypeVisibilities,
           com.sforce.soap._2006._04.metadata.PermissionSetTabSetting[] tabSettings,
           com.sforce.soap._2006._04.metadata.PermissionSetUserPermission[] userPermissions) {
        super(
            fullName);
        this.applicationVisibilities = applicationVisibilities;
        this.classAccesses = classAccesses;
        this.customPermissions = customPermissions;
        this.description = description;
        this.externalDataSourceAccesses = externalDataSourceAccesses;
        this.fieldPermissions = fieldPermissions;
        this.hasActivationRequired = hasActivationRequired;
        this.label = label;
        this.license = license;
        this.objectPermissions = objectPermissions;
        this.pageAccesses = pageAccesses;
        this.recordTypeVisibilities = recordTypeVisibilities;
        this.tabSettings = tabSettings;
        this.userPermissions = userPermissions;
    }


    /**
     * Gets the applicationVisibilities value for this PermissionSet.
     * 
     * @return applicationVisibilities
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetApplicationVisibility[] getApplicationVisibilities() {
        return applicationVisibilities;
    }


    /**
     * Sets the applicationVisibilities value for this PermissionSet.
     * 
     * @param applicationVisibilities
     */
    public void setApplicationVisibilities(com.sforce.soap._2006._04.metadata.PermissionSetApplicationVisibility[] applicationVisibilities) {
        this.applicationVisibilities = applicationVisibilities;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetApplicationVisibility getApplicationVisibilities(int i) {
        return this.applicationVisibilities[i];
    }

    public void setApplicationVisibilities(int i, com.sforce.soap._2006._04.metadata.PermissionSetApplicationVisibility _value) {
        this.applicationVisibilities[i] = _value;
    }


    /**
     * Gets the classAccesses value for this PermissionSet.
     * 
     * @return classAccesses
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetApexClassAccess[] getClassAccesses() {
        return classAccesses;
    }


    /**
     * Sets the classAccesses value for this PermissionSet.
     * 
     * @param classAccesses
     */
    public void setClassAccesses(com.sforce.soap._2006._04.metadata.PermissionSetApexClassAccess[] classAccesses) {
        this.classAccesses = classAccesses;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetApexClassAccess getClassAccesses(int i) {
        return this.classAccesses[i];
    }

    public void setClassAccesses(int i, com.sforce.soap._2006._04.metadata.PermissionSetApexClassAccess _value) {
        this.classAccesses[i] = _value;
    }


    /**
     * Gets the customPermissions value for this PermissionSet.
     * 
     * @return customPermissions
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetCustomPermissions[] getCustomPermissions() {
        return customPermissions;
    }


    /**
     * Sets the customPermissions value for this PermissionSet.
     * 
     * @param customPermissions
     */
    public void setCustomPermissions(com.sforce.soap._2006._04.metadata.PermissionSetCustomPermissions[] customPermissions) {
        this.customPermissions = customPermissions;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetCustomPermissions getCustomPermissions(int i) {
        return this.customPermissions[i];
    }

    public void setCustomPermissions(int i, com.sforce.soap._2006._04.metadata.PermissionSetCustomPermissions _value) {
        this.customPermissions[i] = _value;
    }


    /**
     * Gets the description value for this PermissionSet.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PermissionSet.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the externalDataSourceAccesses value for this PermissionSet.
     * 
     * @return externalDataSourceAccesses
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetExternalDataSourceAccess[] getExternalDataSourceAccesses() {
        return externalDataSourceAccesses;
    }


    /**
     * Sets the externalDataSourceAccesses value for this PermissionSet.
     * 
     * @param externalDataSourceAccesses
     */
    public void setExternalDataSourceAccesses(com.sforce.soap._2006._04.metadata.PermissionSetExternalDataSourceAccess[] externalDataSourceAccesses) {
        this.externalDataSourceAccesses = externalDataSourceAccesses;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetExternalDataSourceAccess getExternalDataSourceAccesses(int i) {
        return this.externalDataSourceAccesses[i];
    }

    public void setExternalDataSourceAccesses(int i, com.sforce.soap._2006._04.metadata.PermissionSetExternalDataSourceAccess _value) {
        this.externalDataSourceAccesses[i] = _value;
    }


    /**
     * Gets the fieldPermissions value for this PermissionSet.
     * 
     * @return fieldPermissions
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetFieldPermissions[] getFieldPermissions() {
        return fieldPermissions;
    }


    /**
     * Sets the fieldPermissions value for this PermissionSet.
     * 
     * @param fieldPermissions
     */
    public void setFieldPermissions(com.sforce.soap._2006._04.metadata.PermissionSetFieldPermissions[] fieldPermissions) {
        this.fieldPermissions = fieldPermissions;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetFieldPermissions getFieldPermissions(int i) {
        return this.fieldPermissions[i];
    }

    public void setFieldPermissions(int i, com.sforce.soap._2006._04.metadata.PermissionSetFieldPermissions _value) {
        this.fieldPermissions[i] = _value;
    }


    /**
     * Gets the hasActivationRequired value for this PermissionSet.
     * 
     * @return hasActivationRequired
     */
    public java.lang.Boolean getHasActivationRequired() {
        return hasActivationRequired;
    }


    /**
     * Sets the hasActivationRequired value for this PermissionSet.
     * 
     * @param hasActivationRequired
     */
    public void setHasActivationRequired(java.lang.Boolean hasActivationRequired) {
        this.hasActivationRequired = hasActivationRequired;
    }


    /**
     * Gets the label value for this PermissionSet.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this PermissionSet.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the license value for this PermissionSet.
     * 
     * @return license
     */
    public java.lang.String getLicense() {
        return license;
    }


    /**
     * Sets the license value for this PermissionSet.
     * 
     * @param license
     */
    public void setLicense(java.lang.String license) {
        this.license = license;
    }


    /**
     * Gets the objectPermissions value for this PermissionSet.
     * 
     * @return objectPermissions
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetObjectPermissions[] getObjectPermissions() {
        return objectPermissions;
    }


    /**
     * Sets the objectPermissions value for this PermissionSet.
     * 
     * @param objectPermissions
     */
    public void setObjectPermissions(com.sforce.soap._2006._04.metadata.PermissionSetObjectPermissions[] objectPermissions) {
        this.objectPermissions = objectPermissions;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetObjectPermissions getObjectPermissions(int i) {
        return this.objectPermissions[i];
    }

    public void setObjectPermissions(int i, com.sforce.soap._2006._04.metadata.PermissionSetObjectPermissions _value) {
        this.objectPermissions[i] = _value;
    }


    /**
     * Gets the pageAccesses value for this PermissionSet.
     * 
     * @return pageAccesses
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetApexPageAccess[] getPageAccesses() {
        return pageAccesses;
    }


    /**
     * Sets the pageAccesses value for this PermissionSet.
     * 
     * @param pageAccesses
     */
    public void setPageAccesses(com.sforce.soap._2006._04.metadata.PermissionSetApexPageAccess[] pageAccesses) {
        this.pageAccesses = pageAccesses;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetApexPageAccess getPageAccesses(int i) {
        return this.pageAccesses[i];
    }

    public void setPageAccesses(int i, com.sforce.soap._2006._04.metadata.PermissionSetApexPageAccess _value) {
        this.pageAccesses[i] = _value;
    }


    /**
     * Gets the recordTypeVisibilities value for this PermissionSet.
     * 
     * @return recordTypeVisibilities
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetRecordTypeVisibility[] getRecordTypeVisibilities() {
        return recordTypeVisibilities;
    }


    /**
     * Sets the recordTypeVisibilities value for this PermissionSet.
     * 
     * @param recordTypeVisibilities
     */
    public void setRecordTypeVisibilities(com.sforce.soap._2006._04.metadata.PermissionSetRecordTypeVisibility[] recordTypeVisibilities) {
        this.recordTypeVisibilities = recordTypeVisibilities;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetRecordTypeVisibility getRecordTypeVisibilities(int i) {
        return this.recordTypeVisibilities[i];
    }

    public void setRecordTypeVisibilities(int i, com.sforce.soap._2006._04.metadata.PermissionSetRecordTypeVisibility _value) {
        this.recordTypeVisibilities[i] = _value;
    }


    /**
     * Gets the tabSettings value for this PermissionSet.
     * 
     * @return tabSettings
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetTabSetting[] getTabSettings() {
        return tabSettings;
    }


    /**
     * Sets the tabSettings value for this PermissionSet.
     * 
     * @param tabSettings
     */
    public void setTabSettings(com.sforce.soap._2006._04.metadata.PermissionSetTabSetting[] tabSettings) {
        this.tabSettings = tabSettings;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetTabSetting getTabSettings(int i) {
        return this.tabSettings[i];
    }

    public void setTabSettings(int i, com.sforce.soap._2006._04.metadata.PermissionSetTabSetting _value) {
        this.tabSettings[i] = _value;
    }


    /**
     * Gets the userPermissions value for this PermissionSet.
     * 
     * @return userPermissions
     */
    public com.sforce.soap._2006._04.metadata.PermissionSetUserPermission[] getUserPermissions() {
        return userPermissions;
    }


    /**
     * Sets the userPermissions value for this PermissionSet.
     * 
     * @param userPermissions
     */
    public void setUserPermissions(com.sforce.soap._2006._04.metadata.PermissionSetUserPermission[] userPermissions) {
        this.userPermissions = userPermissions;
    }

    public com.sforce.soap._2006._04.metadata.PermissionSetUserPermission getUserPermissions(int i) {
        return this.userPermissions[i];
    }

    public void setUserPermissions(int i, com.sforce.soap._2006._04.metadata.PermissionSetUserPermission _value) {
        this.userPermissions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermissionSet)) return false;
        PermissionSet other = (PermissionSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationVisibilities==null && other.getApplicationVisibilities()==null) || 
             (this.applicationVisibilities!=null &&
              java.util.Arrays.equals(this.applicationVisibilities, other.getApplicationVisibilities()))) &&
            ((this.classAccesses==null && other.getClassAccesses()==null) || 
             (this.classAccesses!=null &&
              java.util.Arrays.equals(this.classAccesses, other.getClassAccesses()))) &&
            ((this.customPermissions==null && other.getCustomPermissions()==null) || 
             (this.customPermissions!=null &&
              java.util.Arrays.equals(this.customPermissions, other.getCustomPermissions()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.externalDataSourceAccesses==null && other.getExternalDataSourceAccesses()==null) || 
             (this.externalDataSourceAccesses!=null &&
              java.util.Arrays.equals(this.externalDataSourceAccesses, other.getExternalDataSourceAccesses()))) &&
            ((this.fieldPermissions==null && other.getFieldPermissions()==null) || 
             (this.fieldPermissions!=null &&
              java.util.Arrays.equals(this.fieldPermissions, other.getFieldPermissions()))) &&
            ((this.hasActivationRequired==null && other.getHasActivationRequired()==null) || 
             (this.hasActivationRequired!=null &&
              this.hasActivationRequired.equals(other.getHasActivationRequired()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.license==null && other.getLicense()==null) || 
             (this.license!=null &&
              this.license.equals(other.getLicense()))) &&
            ((this.objectPermissions==null && other.getObjectPermissions()==null) || 
             (this.objectPermissions!=null &&
              java.util.Arrays.equals(this.objectPermissions, other.getObjectPermissions()))) &&
            ((this.pageAccesses==null && other.getPageAccesses()==null) || 
             (this.pageAccesses!=null &&
              java.util.Arrays.equals(this.pageAccesses, other.getPageAccesses()))) &&
            ((this.recordTypeVisibilities==null && other.getRecordTypeVisibilities()==null) || 
             (this.recordTypeVisibilities!=null &&
              java.util.Arrays.equals(this.recordTypeVisibilities, other.getRecordTypeVisibilities()))) &&
            ((this.tabSettings==null && other.getTabSettings()==null) || 
             (this.tabSettings!=null &&
              java.util.Arrays.equals(this.tabSettings, other.getTabSettings()))) &&
            ((this.userPermissions==null && other.getUserPermissions()==null) || 
             (this.userPermissions!=null &&
              java.util.Arrays.equals(this.userPermissions, other.getUserPermissions())));
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
        if (getApplicationVisibilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationVisibilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationVisibilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassAccesses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassAccesses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassAccesses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExternalDataSourceAccesses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalDataSourceAccesses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalDataSourceAccesses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasActivationRequired() != null) {
            _hashCode += getHasActivationRequired().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLicense() != null) {
            _hashCode += getLicense().hashCode();
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
        if (getPageAccesses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageAccesses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageAccesses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordTypeVisibilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypeVisibilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordTypeVisibilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTabSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTabSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTabSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermissionSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationVisibilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "applicationVisibilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetApplicationVisibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classAccesses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "classAccesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetApexClassAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetCustomPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDataSourceAccesses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "externalDataSourceAccesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetExternalDataSourceAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetFieldPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasActivationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "hasActivationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("license");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "license"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "objectPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetObjectPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageAccesses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageAccesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetApexPageAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeVisibilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordTypeVisibilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetRecordTypeVisibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tabSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetTabSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetUserPermission"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
