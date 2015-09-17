/**
 * XOrgHub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class XOrgHub  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String label;

    private boolean lockSharedObjects;

    private java.lang.String[] permissionSets;

    private com.sforce.soap._2006._04.metadata.XOrgHubSharedObject[] sharedObjects;

    public XOrgHub() {
    }

    public XOrgHub(
           java.lang.String fullName,
           java.lang.String label,
           boolean lockSharedObjects,
           java.lang.String[] permissionSets,
           com.sforce.soap._2006._04.metadata.XOrgHubSharedObject[] sharedObjects) {
        super(
            fullName);
        this.label = label;
        this.lockSharedObjects = lockSharedObjects;
        this.permissionSets = permissionSets;
        this.sharedObjects = sharedObjects;
    }


    /**
     * Gets the label value for this XOrgHub.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this XOrgHub.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lockSharedObjects value for this XOrgHub.
     * 
     * @return lockSharedObjects
     */
    public boolean isLockSharedObjects() {
        return lockSharedObjects;
    }


    /**
     * Sets the lockSharedObjects value for this XOrgHub.
     * 
     * @param lockSharedObjects
     */
    public void setLockSharedObjects(boolean lockSharedObjects) {
        this.lockSharedObjects = lockSharedObjects;
    }


    /**
     * Gets the permissionSets value for this XOrgHub.
     * 
     * @return permissionSets
     */
    public java.lang.String[] getPermissionSets() {
        return permissionSets;
    }


    /**
     * Sets the permissionSets value for this XOrgHub.
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
     * Gets the sharedObjects value for this XOrgHub.
     * 
     * @return sharedObjects
     */
    public com.sforce.soap._2006._04.metadata.XOrgHubSharedObject[] getSharedObjects() {
        return sharedObjects;
    }


    /**
     * Sets the sharedObjects value for this XOrgHub.
     * 
     * @param sharedObjects
     */
    public void setSharedObjects(com.sforce.soap._2006._04.metadata.XOrgHubSharedObject[] sharedObjects) {
        this.sharedObjects = sharedObjects;
    }

    public com.sforce.soap._2006._04.metadata.XOrgHubSharedObject getSharedObjects(int i) {
        return this.sharedObjects[i];
    }

    public void setSharedObjects(int i, com.sforce.soap._2006._04.metadata.XOrgHubSharedObject _value) {
        this.sharedObjects[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XOrgHub)) return false;
        XOrgHub other = (XOrgHub) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            this.lockSharedObjects == other.isLockSharedObjects() &&
            ((this.permissionSets==null && other.getPermissionSets()==null) || 
             (this.permissionSets!=null &&
              java.util.Arrays.equals(this.permissionSets, other.getPermissionSets()))) &&
            ((this.sharedObjects==null && other.getSharedObjects()==null) || 
             (this.sharedObjects!=null &&
              java.util.Arrays.equals(this.sharedObjects, other.getSharedObjects())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        _hashCode += (isLockSharedObjects() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getSharedObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharedObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharedObjects(), i);
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
        new org.apache.axis.description.TypeDesc(XOrgHub.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "XOrgHub"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockSharedObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lockSharedObjects"));
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
        elemField.setFieldName("sharedObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharedObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "XOrgHubSharedObject"));
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
