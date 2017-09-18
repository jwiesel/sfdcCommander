/**
 * NavigationMenuItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class NavigationMenuItem  implements java.io.Serializable {
    private java.lang.String defaultListViewId;

    private java.lang.String label;

    private int position;

    private java.lang.Boolean publiclyAvailable;

    private com.sforce.soap._2006._04.metadata.NavigationMenuItem[] subMenu;

    private java.lang.String target;

    private java.lang.String targetPreference;

    private java.lang.String type;

    public NavigationMenuItem() {
    }

    public NavigationMenuItem(
           java.lang.String defaultListViewId,
           java.lang.String label,
           int position,
           java.lang.Boolean publiclyAvailable,
           com.sforce.soap._2006._04.metadata.NavigationMenuItem[] subMenu,
           java.lang.String target,
           java.lang.String targetPreference,
           java.lang.String type) {
           this.defaultListViewId = defaultListViewId;
           this.label = label;
           this.position = position;
           this.publiclyAvailable = publiclyAvailable;
           this.subMenu = subMenu;
           this.target = target;
           this.targetPreference = targetPreference;
           this.type = type;
    }


    /**
     * Gets the defaultListViewId value for this NavigationMenuItem.
     * 
     * @return defaultListViewId
     */
    public java.lang.String getDefaultListViewId() {
        return defaultListViewId;
    }


    /**
     * Sets the defaultListViewId value for this NavigationMenuItem.
     * 
     * @param defaultListViewId
     */
    public void setDefaultListViewId(java.lang.String defaultListViewId) {
        this.defaultListViewId = defaultListViewId;
    }


    /**
     * Gets the label value for this NavigationMenuItem.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this NavigationMenuItem.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the position value for this NavigationMenuItem.
     * 
     * @return position
     */
    public int getPosition() {
        return position;
    }


    /**
     * Sets the position value for this NavigationMenuItem.
     * 
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }


    /**
     * Gets the publiclyAvailable value for this NavigationMenuItem.
     * 
     * @return publiclyAvailable
     */
    public java.lang.Boolean getPubliclyAvailable() {
        return publiclyAvailable;
    }


    /**
     * Sets the publiclyAvailable value for this NavigationMenuItem.
     * 
     * @param publiclyAvailable
     */
    public void setPubliclyAvailable(java.lang.Boolean publiclyAvailable) {
        this.publiclyAvailable = publiclyAvailable;
    }


    /**
     * Gets the subMenu value for this NavigationMenuItem.
     * 
     * @return subMenu
     */
    public com.sforce.soap._2006._04.metadata.NavigationMenuItem[] getSubMenu() {
        return subMenu;
    }


    /**
     * Sets the subMenu value for this NavigationMenuItem.
     * 
     * @param subMenu
     */
    public void setSubMenu(com.sforce.soap._2006._04.metadata.NavigationMenuItem[] subMenu) {
        this.subMenu = subMenu;
    }


    /**
     * Gets the target value for this NavigationMenuItem.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this NavigationMenuItem.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the targetPreference value for this NavigationMenuItem.
     * 
     * @return targetPreference
     */
    public java.lang.String getTargetPreference() {
        return targetPreference;
    }


    /**
     * Sets the targetPreference value for this NavigationMenuItem.
     * 
     * @param targetPreference
     */
    public void setTargetPreference(java.lang.String targetPreference) {
        this.targetPreference = targetPreference;
    }


    /**
     * Gets the type value for this NavigationMenuItem.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this NavigationMenuItem.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NavigationMenuItem)) return false;
        NavigationMenuItem other = (NavigationMenuItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultListViewId==null && other.getDefaultListViewId()==null) || 
             (this.defaultListViewId!=null &&
              this.defaultListViewId.equals(other.getDefaultListViewId()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            this.position == other.getPosition() &&
            ((this.publiclyAvailable==null && other.getPubliclyAvailable()==null) || 
             (this.publiclyAvailable!=null &&
              this.publiclyAvailable.equals(other.getPubliclyAvailable()))) &&
            ((this.subMenu==null && other.getSubMenu()==null) || 
             (this.subMenu!=null &&
              java.util.Arrays.equals(this.subMenu, other.getSubMenu()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.targetPreference==null && other.getTargetPreference()==null) || 
             (this.targetPreference!=null &&
              this.targetPreference.equals(other.getTargetPreference()))) &&
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
        int _hashCode = 1;
        if (getDefaultListViewId() != null) {
            _hashCode += getDefaultListViewId().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        _hashCode += getPosition();
        if (getPubliclyAvailable() != null) {
            _hashCode += getPubliclyAvailable().hashCode();
        }
        if (getSubMenu() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubMenu());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubMenu(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getTargetPreference() != null) {
            _hashCode += getTargetPreference().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NavigationMenuItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NavigationMenuItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultListViewId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultListViewId"));
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
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publiclyAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "publiclyAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "subMenu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NavigationMenuItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "navigationMenuItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
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
