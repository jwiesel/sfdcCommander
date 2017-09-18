/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Profile  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ProfileApplicationVisibility[] applicationVisibilities;

    private com.sforce.soap._2006._04.metadata.ProfileApexClassAccess[] classAccesses;

    private java.lang.Boolean custom;

    private com.sforce.soap._2006._04.metadata.ProfileCustomPermissions[] customPermissions;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.ProfileExternalDataSourceAccess[] externalDataSourceAccesses;

    private com.sforce.soap._2006._04.metadata.ProfileFieldLevelSecurity[] fieldPermissions;

    private com.sforce.soap._2006._04.metadata.ProfileLayoutAssignment[] layoutAssignments;

    private com.sforce.soap._2006._04.metadata.ProfileLoginHours loginHours;

    private com.sforce.soap._2006._04.metadata.ProfileLoginIpRange[] loginIpRanges;

    private com.sforce.soap._2006._04.metadata.ProfileObjectPermissions[] objectPermissions;

    private com.sforce.soap._2006._04.metadata.ProfileApexPageAccess[] pageAccesses;

    private com.sforce.soap._2006._04.metadata.ProfileActionOverride[] profileActionOverrides;

    private com.sforce.soap._2006._04.metadata.ProfileRecordTypeVisibility[] recordTypeVisibilities;

    private com.sforce.soap._2006._04.metadata.ProfileTabVisibility[] tabVisibilities;

    private java.lang.String userLicense;

    private com.sforce.soap._2006._04.metadata.ProfileUserPermission[] userPermissions;

    public Profile() {
    }

    public Profile(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ProfileApplicationVisibility[] applicationVisibilities,
           com.sforce.soap._2006._04.metadata.ProfileApexClassAccess[] classAccesses,
           java.lang.Boolean custom,
           com.sforce.soap._2006._04.metadata.ProfileCustomPermissions[] customPermissions,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.ProfileExternalDataSourceAccess[] externalDataSourceAccesses,
           com.sforce.soap._2006._04.metadata.ProfileFieldLevelSecurity[] fieldPermissions,
           com.sforce.soap._2006._04.metadata.ProfileLayoutAssignment[] layoutAssignments,
           com.sforce.soap._2006._04.metadata.ProfileLoginHours loginHours,
           com.sforce.soap._2006._04.metadata.ProfileLoginIpRange[] loginIpRanges,
           com.sforce.soap._2006._04.metadata.ProfileObjectPermissions[] objectPermissions,
           com.sforce.soap._2006._04.metadata.ProfileApexPageAccess[] pageAccesses,
           com.sforce.soap._2006._04.metadata.ProfileActionOverride[] profileActionOverrides,
           com.sforce.soap._2006._04.metadata.ProfileRecordTypeVisibility[] recordTypeVisibilities,
           com.sforce.soap._2006._04.metadata.ProfileTabVisibility[] tabVisibilities,
           java.lang.String userLicense,
           com.sforce.soap._2006._04.metadata.ProfileUserPermission[] userPermissions) {
        super(
            fullName);
        this.applicationVisibilities = applicationVisibilities;
        this.classAccesses = classAccesses;
        this.custom = custom;
        this.customPermissions = customPermissions;
        this.description = description;
        this.externalDataSourceAccesses = externalDataSourceAccesses;
        this.fieldPermissions = fieldPermissions;
        this.layoutAssignments = layoutAssignments;
        this.loginHours = loginHours;
        this.loginIpRanges = loginIpRanges;
        this.objectPermissions = objectPermissions;
        this.pageAccesses = pageAccesses;
        this.profileActionOverrides = profileActionOverrides;
        this.recordTypeVisibilities = recordTypeVisibilities;
        this.tabVisibilities = tabVisibilities;
        this.userLicense = userLicense;
        this.userPermissions = userPermissions;
    }


    /**
     * Gets the applicationVisibilities value for this Profile.
     * 
     * @return applicationVisibilities
     */
    public com.sforce.soap._2006._04.metadata.ProfileApplicationVisibility[] getApplicationVisibilities() {
        return applicationVisibilities;
    }


    /**
     * Sets the applicationVisibilities value for this Profile.
     * 
     * @param applicationVisibilities
     */
    public void setApplicationVisibilities(com.sforce.soap._2006._04.metadata.ProfileApplicationVisibility[] applicationVisibilities) {
        this.applicationVisibilities = applicationVisibilities;
    }

    public com.sforce.soap._2006._04.metadata.ProfileApplicationVisibility getApplicationVisibilities(int i) {
        return this.applicationVisibilities[i];
    }

    public void setApplicationVisibilities(int i, com.sforce.soap._2006._04.metadata.ProfileApplicationVisibility _value) {
        this.applicationVisibilities[i] = _value;
    }


    /**
     * Gets the classAccesses value for this Profile.
     * 
     * @return classAccesses
     */
    public com.sforce.soap._2006._04.metadata.ProfileApexClassAccess[] getClassAccesses() {
        return classAccesses;
    }


    /**
     * Sets the classAccesses value for this Profile.
     * 
     * @param classAccesses
     */
    public void setClassAccesses(com.sforce.soap._2006._04.metadata.ProfileApexClassAccess[] classAccesses) {
        this.classAccesses = classAccesses;
    }

    public com.sforce.soap._2006._04.metadata.ProfileApexClassAccess getClassAccesses(int i) {
        return this.classAccesses[i];
    }

    public void setClassAccesses(int i, com.sforce.soap._2006._04.metadata.ProfileApexClassAccess _value) {
        this.classAccesses[i] = _value;
    }


    /**
     * Gets the custom value for this Profile.
     * 
     * @return custom
     */
    public java.lang.Boolean getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this Profile.
     * 
     * @param custom
     */
    public void setCustom(java.lang.Boolean custom) {
        this.custom = custom;
    }


    /**
     * Gets the customPermissions value for this Profile.
     * 
     * @return customPermissions
     */
    public com.sforce.soap._2006._04.metadata.ProfileCustomPermissions[] getCustomPermissions() {
        return customPermissions;
    }


    /**
     * Sets the customPermissions value for this Profile.
     * 
     * @param customPermissions
     */
    public void setCustomPermissions(com.sforce.soap._2006._04.metadata.ProfileCustomPermissions[] customPermissions) {
        this.customPermissions = customPermissions;
    }

    public com.sforce.soap._2006._04.metadata.ProfileCustomPermissions getCustomPermissions(int i) {
        return this.customPermissions[i];
    }

    public void setCustomPermissions(int i, com.sforce.soap._2006._04.metadata.ProfileCustomPermissions _value) {
        this.customPermissions[i] = _value;
    }


    /**
     * Gets the description value for this Profile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Profile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the externalDataSourceAccesses value for this Profile.
     * 
     * @return externalDataSourceAccesses
     */
    public com.sforce.soap._2006._04.metadata.ProfileExternalDataSourceAccess[] getExternalDataSourceAccesses() {
        return externalDataSourceAccesses;
    }


    /**
     * Sets the externalDataSourceAccesses value for this Profile.
     * 
     * @param externalDataSourceAccesses
     */
    public void setExternalDataSourceAccesses(com.sforce.soap._2006._04.metadata.ProfileExternalDataSourceAccess[] externalDataSourceAccesses) {
        this.externalDataSourceAccesses = externalDataSourceAccesses;
    }

    public com.sforce.soap._2006._04.metadata.ProfileExternalDataSourceAccess getExternalDataSourceAccesses(int i) {
        return this.externalDataSourceAccesses[i];
    }

    public void setExternalDataSourceAccesses(int i, com.sforce.soap._2006._04.metadata.ProfileExternalDataSourceAccess _value) {
        this.externalDataSourceAccesses[i] = _value;
    }


    /**
     * Gets the fieldPermissions value for this Profile.
     * 
     * @return fieldPermissions
     */
    public com.sforce.soap._2006._04.metadata.ProfileFieldLevelSecurity[] getFieldPermissions() {
        return fieldPermissions;
    }


    /**
     * Sets the fieldPermissions value for this Profile.
     * 
     * @param fieldPermissions
     */
    public void setFieldPermissions(com.sforce.soap._2006._04.metadata.ProfileFieldLevelSecurity[] fieldPermissions) {
        this.fieldPermissions = fieldPermissions;
    }

    public com.sforce.soap._2006._04.metadata.ProfileFieldLevelSecurity getFieldPermissions(int i) {
        return this.fieldPermissions[i];
    }

    public void setFieldPermissions(int i, com.sforce.soap._2006._04.metadata.ProfileFieldLevelSecurity _value) {
        this.fieldPermissions[i] = _value;
    }


    /**
     * Gets the layoutAssignments value for this Profile.
     * 
     * @return layoutAssignments
     */
    public com.sforce.soap._2006._04.metadata.ProfileLayoutAssignment[] getLayoutAssignments() {
        return layoutAssignments;
    }


    /**
     * Sets the layoutAssignments value for this Profile.
     * 
     * @param layoutAssignments
     */
    public void setLayoutAssignments(com.sforce.soap._2006._04.metadata.ProfileLayoutAssignment[] layoutAssignments) {
        this.layoutAssignments = layoutAssignments;
    }

    public com.sforce.soap._2006._04.metadata.ProfileLayoutAssignment getLayoutAssignments(int i) {
        return this.layoutAssignments[i];
    }

    public void setLayoutAssignments(int i, com.sforce.soap._2006._04.metadata.ProfileLayoutAssignment _value) {
        this.layoutAssignments[i] = _value;
    }


    /**
     * Gets the loginHours value for this Profile.
     * 
     * @return loginHours
     */
    public com.sforce.soap._2006._04.metadata.ProfileLoginHours getLoginHours() {
        return loginHours;
    }


    /**
     * Sets the loginHours value for this Profile.
     * 
     * @param loginHours
     */
    public void setLoginHours(com.sforce.soap._2006._04.metadata.ProfileLoginHours loginHours) {
        this.loginHours = loginHours;
    }


    /**
     * Gets the loginIpRanges value for this Profile.
     * 
     * @return loginIpRanges
     */
    public com.sforce.soap._2006._04.metadata.ProfileLoginIpRange[] getLoginIpRanges() {
        return loginIpRanges;
    }


    /**
     * Sets the loginIpRanges value for this Profile.
     * 
     * @param loginIpRanges
     */
    public void setLoginIpRanges(com.sforce.soap._2006._04.metadata.ProfileLoginIpRange[] loginIpRanges) {
        this.loginIpRanges = loginIpRanges;
    }

    public com.sforce.soap._2006._04.metadata.ProfileLoginIpRange getLoginIpRanges(int i) {
        return this.loginIpRanges[i];
    }

    public void setLoginIpRanges(int i, com.sforce.soap._2006._04.metadata.ProfileLoginIpRange _value) {
        this.loginIpRanges[i] = _value;
    }


    /**
     * Gets the objectPermissions value for this Profile.
     * 
     * @return objectPermissions
     */
    public com.sforce.soap._2006._04.metadata.ProfileObjectPermissions[] getObjectPermissions() {
        return objectPermissions;
    }


    /**
     * Sets the objectPermissions value for this Profile.
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
     * Gets the pageAccesses value for this Profile.
     * 
     * @return pageAccesses
     */
    public com.sforce.soap._2006._04.metadata.ProfileApexPageAccess[] getPageAccesses() {
        return pageAccesses;
    }


    /**
     * Sets the pageAccesses value for this Profile.
     * 
     * @param pageAccesses
     */
    public void setPageAccesses(com.sforce.soap._2006._04.metadata.ProfileApexPageAccess[] pageAccesses) {
        this.pageAccesses = pageAccesses;
    }

    public com.sforce.soap._2006._04.metadata.ProfileApexPageAccess getPageAccesses(int i) {
        return this.pageAccesses[i];
    }

    public void setPageAccesses(int i, com.sforce.soap._2006._04.metadata.ProfileApexPageAccess _value) {
        this.pageAccesses[i] = _value;
    }


    /**
     * Gets the profileActionOverrides value for this Profile.
     * 
     * @return profileActionOverrides
     */
    public com.sforce.soap._2006._04.metadata.ProfileActionOverride[] getProfileActionOverrides() {
        return profileActionOverrides;
    }


    /**
     * Sets the profileActionOverrides value for this Profile.
     * 
     * @param profileActionOverrides
     */
    public void setProfileActionOverrides(com.sforce.soap._2006._04.metadata.ProfileActionOverride[] profileActionOverrides) {
        this.profileActionOverrides = profileActionOverrides;
    }

    public com.sforce.soap._2006._04.metadata.ProfileActionOverride getProfileActionOverrides(int i) {
        return this.profileActionOverrides[i];
    }

    public void setProfileActionOverrides(int i, com.sforce.soap._2006._04.metadata.ProfileActionOverride _value) {
        this.profileActionOverrides[i] = _value;
    }


    /**
     * Gets the recordTypeVisibilities value for this Profile.
     * 
     * @return recordTypeVisibilities
     */
    public com.sforce.soap._2006._04.metadata.ProfileRecordTypeVisibility[] getRecordTypeVisibilities() {
        return recordTypeVisibilities;
    }


    /**
     * Sets the recordTypeVisibilities value for this Profile.
     * 
     * @param recordTypeVisibilities
     */
    public void setRecordTypeVisibilities(com.sforce.soap._2006._04.metadata.ProfileRecordTypeVisibility[] recordTypeVisibilities) {
        this.recordTypeVisibilities = recordTypeVisibilities;
    }

    public com.sforce.soap._2006._04.metadata.ProfileRecordTypeVisibility getRecordTypeVisibilities(int i) {
        return this.recordTypeVisibilities[i];
    }

    public void setRecordTypeVisibilities(int i, com.sforce.soap._2006._04.metadata.ProfileRecordTypeVisibility _value) {
        this.recordTypeVisibilities[i] = _value;
    }


    /**
     * Gets the tabVisibilities value for this Profile.
     * 
     * @return tabVisibilities
     */
    public com.sforce.soap._2006._04.metadata.ProfileTabVisibility[] getTabVisibilities() {
        return tabVisibilities;
    }


    /**
     * Sets the tabVisibilities value for this Profile.
     * 
     * @param tabVisibilities
     */
    public void setTabVisibilities(com.sforce.soap._2006._04.metadata.ProfileTabVisibility[] tabVisibilities) {
        this.tabVisibilities = tabVisibilities;
    }

    public com.sforce.soap._2006._04.metadata.ProfileTabVisibility getTabVisibilities(int i) {
        return this.tabVisibilities[i];
    }

    public void setTabVisibilities(int i, com.sforce.soap._2006._04.metadata.ProfileTabVisibility _value) {
        this.tabVisibilities[i] = _value;
    }


    /**
     * Gets the userLicense value for this Profile.
     * 
     * @return userLicense
     */
    public java.lang.String getUserLicense() {
        return userLicense;
    }


    /**
     * Sets the userLicense value for this Profile.
     * 
     * @param userLicense
     */
    public void setUserLicense(java.lang.String userLicense) {
        this.userLicense = userLicense;
    }


    /**
     * Gets the userPermissions value for this Profile.
     * 
     * @return userPermissions
     */
    public com.sforce.soap._2006._04.metadata.ProfileUserPermission[] getUserPermissions() {
        return userPermissions;
    }


    /**
     * Sets the userPermissions value for this Profile.
     * 
     * @param userPermissions
     */
    public void setUserPermissions(com.sforce.soap._2006._04.metadata.ProfileUserPermission[] userPermissions) {
        this.userPermissions = userPermissions;
    }

    public com.sforce.soap._2006._04.metadata.ProfileUserPermission getUserPermissions(int i) {
        return this.userPermissions[i];
    }

    public void setUserPermissions(int i, com.sforce.soap._2006._04.metadata.ProfileUserPermission _value) {
        this.userPermissions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Profile)) return false;
        Profile other = (Profile) obj;
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
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
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
            ((this.layoutAssignments==null && other.getLayoutAssignments()==null) || 
             (this.layoutAssignments!=null &&
              java.util.Arrays.equals(this.layoutAssignments, other.getLayoutAssignments()))) &&
            ((this.loginHours==null && other.getLoginHours()==null) || 
             (this.loginHours!=null &&
              this.loginHours.equals(other.getLoginHours()))) &&
            ((this.loginIpRanges==null && other.getLoginIpRanges()==null) || 
             (this.loginIpRanges!=null &&
              java.util.Arrays.equals(this.loginIpRanges, other.getLoginIpRanges()))) &&
            ((this.objectPermissions==null && other.getObjectPermissions()==null) || 
             (this.objectPermissions!=null &&
              java.util.Arrays.equals(this.objectPermissions, other.getObjectPermissions()))) &&
            ((this.pageAccesses==null && other.getPageAccesses()==null) || 
             (this.pageAccesses!=null &&
              java.util.Arrays.equals(this.pageAccesses, other.getPageAccesses()))) &&
            ((this.profileActionOverrides==null && other.getProfileActionOverrides()==null) || 
             (this.profileActionOverrides!=null &&
              java.util.Arrays.equals(this.profileActionOverrides, other.getProfileActionOverrides()))) &&
            ((this.recordTypeVisibilities==null && other.getRecordTypeVisibilities()==null) || 
             (this.recordTypeVisibilities!=null &&
              java.util.Arrays.equals(this.recordTypeVisibilities, other.getRecordTypeVisibilities()))) &&
            ((this.tabVisibilities==null && other.getTabVisibilities()==null) || 
             (this.tabVisibilities!=null &&
              java.util.Arrays.equals(this.tabVisibilities, other.getTabVisibilities()))) &&
            ((this.userLicense==null && other.getUserLicense()==null) || 
             (this.userLicense!=null &&
              this.userLicense.equals(other.getUserLicense()))) &&
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
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
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
        if (getLayoutAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayoutAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLayoutAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoginHours() != null) {
            _hashCode += getLoginHours().hashCode();
        }
        if (getLoginIpRanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoginIpRanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoginIpRanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getProfileActionOverrides() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfileActionOverrides());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfileActionOverrides(), i);
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
        if (getTabVisibilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTabVisibilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTabVisibilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserLicense() != null) {
            _hashCode += getUserLicense().hashCode();
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
        new org.apache.axis.description.TypeDesc(Profile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Profile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationVisibilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "applicationVisibilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileApplicationVisibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classAccesses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "classAccesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileApexClassAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileCustomPermissions"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileExternalDataSourceAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileFieldLevelSecurity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layoutAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileLayoutAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "loginHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileLoginHours"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginIpRanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "loginIpRanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileLoginIpRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("pageAccesses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageAccesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileApexPageAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileActionOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "profileActionOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileActionOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeVisibilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordTypeVisibilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileRecordTypeVisibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabVisibilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tabVisibilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileTabVisibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileUserPermission"));
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
