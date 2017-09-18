/**
 * DelegateGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DelegateGroup  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String[] customObjects;

    private java.lang.String[] groups;

    private java.lang.String label;

    private boolean loginAccess;

    private java.lang.String[] permissionSets;

    private java.lang.String[] profiles;

    private java.lang.String[] roles;

    public DelegateGroup() {
    }

    public DelegateGroup(
           java.lang.String fullName,
           java.lang.String[] customObjects,
           java.lang.String[] groups,
           java.lang.String label,
           boolean loginAccess,
           java.lang.String[] permissionSets,
           java.lang.String[] profiles,
           java.lang.String[] roles) {
        super(
            fullName);
        this.customObjects = customObjects;
        this.groups = groups;
        this.label = label;
        this.loginAccess = loginAccess;
        this.permissionSets = permissionSets;
        this.profiles = profiles;
        this.roles = roles;
    }


    /**
     * Gets the customObjects value for this DelegateGroup.
     * 
     * @return customObjects
     */
    public java.lang.String[] getCustomObjects() {
        return customObjects;
    }


    /**
     * Sets the customObjects value for this DelegateGroup.
     * 
     * @param customObjects
     */
    public void setCustomObjects(java.lang.String[] customObjects) {
        this.customObjects = customObjects;
    }

    public java.lang.String getCustomObjects(int i) {
        return this.customObjects[i];
    }

    public void setCustomObjects(int i, java.lang.String _value) {
        this.customObjects[i] = _value;
    }


    /**
     * Gets the groups value for this DelegateGroup.
     * 
     * @return groups
     */
    public java.lang.String[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this DelegateGroup.
     * 
     * @param groups
     */
    public void setGroups(java.lang.String[] groups) {
        this.groups = groups;
    }

    public java.lang.String getGroups(int i) {
        return this.groups[i];
    }

    public void setGroups(int i, java.lang.String _value) {
        this.groups[i] = _value;
    }


    /**
     * Gets the label value for this DelegateGroup.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DelegateGroup.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the loginAccess value for this DelegateGroup.
     * 
     * @return loginAccess
     */
    public boolean isLoginAccess() {
        return loginAccess;
    }


    /**
     * Sets the loginAccess value for this DelegateGroup.
     * 
     * @param loginAccess
     */
    public void setLoginAccess(boolean loginAccess) {
        this.loginAccess = loginAccess;
    }


    /**
     * Gets the permissionSets value for this DelegateGroup.
     * 
     * @return permissionSets
     */
    public java.lang.String[] getPermissionSets() {
        return permissionSets;
    }


    /**
     * Sets the permissionSets value for this DelegateGroup.
     * 
     * @param permissionSets
     */
    public void setPermissionSets(java.lang.String[] permissionSets) {
        this.permissionSets = permissionSets;
    }

    public java.lang.String getPermissionSets(int i) {
        return this.permissionSets[i];
    }

    public void setPermissionSets(int i, java.lang.String _value) {
        this.permissionSets[i] = _value;
    }


    /**
     * Gets the profiles value for this DelegateGroup.
     * 
     * @return profiles
     */
    public java.lang.String[] getProfiles() {
        return profiles;
    }


    /**
     * Sets the profiles value for this DelegateGroup.
     * 
     * @param profiles
     */
    public void setProfiles(java.lang.String[] profiles) {
        this.profiles = profiles;
    }

    public java.lang.String getProfiles(int i) {
        return this.profiles[i];
    }

    public void setProfiles(int i, java.lang.String _value) {
        this.profiles[i] = _value;
    }


    /**
     * Gets the roles value for this DelegateGroup.
     * 
     * @return roles
     */
    public java.lang.String[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this DelegateGroup.
     * 
     * @param roles
     */
    public void setRoles(java.lang.String[] roles) {
        this.roles = roles;
    }

    public java.lang.String getRoles(int i) {
        return this.roles[i];
    }

    public void setRoles(int i, java.lang.String _value) {
        this.roles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelegateGroup)) return false;
        DelegateGroup other = (DelegateGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customObjects==null && other.getCustomObjects()==null) || 
             (this.customObjects!=null &&
              java.util.Arrays.equals(this.customObjects, other.getCustomObjects()))) &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              java.util.Arrays.equals(this.groups, other.getGroups()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            this.loginAccess == other.isLoginAccess() &&
            ((this.permissionSets==null && other.getPermissionSets()==null) || 
             (this.permissionSets!=null &&
              java.util.Arrays.equals(this.permissionSets, other.getPermissionSets()))) &&
            ((this.profiles==null && other.getProfiles()==null) || 
             (this.profiles!=null &&
              java.util.Arrays.equals(this.profiles, other.getProfiles()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles())));
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
        if (getCustomObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomObjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        _hashCode += (isLoginAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPermissionSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissionSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissionSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
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
        new org.apache.axis.description.TypeDesc(DelegateGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DelegateGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "loginAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "permissionSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "profiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
