/**
 * CustomPermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomPermission  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String connectedApp;

    private java.lang.String description;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.CustomPermissionDependencyRequired[] requiredPermission;

    public CustomPermission() {
    }

    public CustomPermission(
           java.lang.String fullName,
           java.lang.String connectedApp,
           java.lang.String description,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.CustomPermissionDependencyRequired[] requiredPermission) {
        super(
            fullName);
        this.connectedApp = connectedApp;
        this.description = description;
        this.label = label;
        this.requiredPermission = requiredPermission;
    }


    /**
     * Gets the connectedApp value for this CustomPermission.
     * 
     * @return connectedApp
     */
    public java.lang.String getConnectedApp() {
        return connectedApp;
    }


    /**
     * Sets the connectedApp value for this CustomPermission.
     * 
     * @param connectedApp
     */
    public void setConnectedApp(java.lang.String connectedApp) {
        this.connectedApp = connectedApp;
    }


    /**
     * Gets the description value for this CustomPermission.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomPermission.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the label value for this CustomPermission.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CustomPermission.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the requiredPermission value for this CustomPermission.
     * 
     * @return requiredPermission
     */
    public com.sforce.soap._2006._04.metadata.CustomPermissionDependencyRequired[] getRequiredPermission() {
        return requiredPermission;
    }


    /**
     * Sets the requiredPermission value for this CustomPermission.
     * 
     * @param requiredPermission
     */
    public void setRequiredPermission(com.sforce.soap._2006._04.metadata.CustomPermissionDependencyRequired[] requiredPermission) {
        this.requiredPermission = requiredPermission;
    }

    public com.sforce.soap._2006._04.metadata.CustomPermissionDependencyRequired getRequiredPermission(int i) {
        return this.requiredPermission[i];
    }

    public void setRequiredPermission(int i, com.sforce.soap._2006._04.metadata.CustomPermissionDependencyRequired _value) {
        this.requiredPermission[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPermission)) return false;
        CustomPermission other = (CustomPermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connectedApp==null && other.getConnectedApp()==null) || 
             (this.connectedApp!=null &&
              this.connectedApp.equals(other.getConnectedApp()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.requiredPermission==null && other.getRequiredPermission()==null) || 
             (this.requiredPermission!=null &&
              java.util.Arrays.equals(this.requiredPermission, other.getRequiredPermission())));
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
        if (getConnectedApp() != null) {
            _hashCode += getConnectedApp().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getRequiredPermission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequiredPermission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequiredPermission(), i);
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
        new org.apache.axis.description.TypeDesc(CustomPermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomPermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connectedApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredPermission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "requiredPermission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomPermissionDependencyRequired"));
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
