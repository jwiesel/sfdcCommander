/**
 * VisualizationPlugin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class VisualizationPlugin  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String developerName;

    private java.lang.String icon;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.VisualizationResource[] visualizationResources;

    private com.sforce.soap._2006._04.metadata.VisualizationType[] visualizationTypes;

    public VisualizationPlugin() {
    }

    public VisualizationPlugin(
           java.lang.String fullName,
           java.lang.String description,
           java.lang.String developerName,
           java.lang.String icon,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.VisualizationResource[] visualizationResources,
           com.sforce.soap._2006._04.metadata.VisualizationType[] visualizationTypes) {
        super(
            fullName);
        this.description = description;
        this.developerName = developerName;
        this.icon = icon;
        this.masterLabel = masterLabel;
        this.visualizationResources = visualizationResources;
        this.visualizationTypes = visualizationTypes;
    }


    /**
     * Gets the description value for this VisualizationPlugin.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VisualizationPlugin.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the developerName value for this VisualizationPlugin.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this VisualizationPlugin.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the icon value for this VisualizationPlugin.
     * 
     * @return icon
     */
    public java.lang.String getIcon() {
        return icon;
    }


    /**
     * Sets the icon value for this VisualizationPlugin.
     * 
     * @param icon
     */
    public void setIcon(java.lang.String icon) {
        this.icon = icon;
    }


    /**
     * Gets the masterLabel value for this VisualizationPlugin.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this VisualizationPlugin.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the visualizationResources value for this VisualizationPlugin.
     * 
     * @return visualizationResources
     */
    public com.sforce.soap._2006._04.metadata.VisualizationResource[] getVisualizationResources() {
        return visualizationResources;
    }


    /**
     * Sets the visualizationResources value for this VisualizationPlugin.
     * 
     * @param visualizationResources
     */
    public void setVisualizationResources(com.sforce.soap._2006._04.metadata.VisualizationResource[] visualizationResources) {
        this.visualizationResources = visualizationResources;
    }

    public com.sforce.soap._2006._04.metadata.VisualizationResource getVisualizationResources(int i) {
        return this.visualizationResources[i];
    }

    public void setVisualizationResources(int i, com.sforce.soap._2006._04.metadata.VisualizationResource _value) {
        this.visualizationResources[i] = _value;
    }


    /**
     * Gets the visualizationTypes value for this VisualizationPlugin.
     * 
     * @return visualizationTypes
     */
    public com.sforce.soap._2006._04.metadata.VisualizationType[] getVisualizationTypes() {
        return visualizationTypes;
    }


    /**
     * Sets the visualizationTypes value for this VisualizationPlugin.
     * 
     * @param visualizationTypes
     */
    public void setVisualizationTypes(com.sforce.soap._2006._04.metadata.VisualizationType[] visualizationTypes) {
        this.visualizationTypes = visualizationTypes;
    }

    public com.sforce.soap._2006._04.metadata.VisualizationType getVisualizationTypes(int i) {
        return this.visualizationTypes[i];
    }

    public void setVisualizationTypes(int i, com.sforce.soap._2006._04.metadata.VisualizationType _value) {
        this.visualizationTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VisualizationPlugin)) return false;
        VisualizationPlugin other = (VisualizationPlugin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.icon==null && other.getIcon()==null) || 
             (this.icon!=null &&
              this.icon.equals(other.getIcon()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.visualizationResources==null && other.getVisualizationResources()==null) || 
             (this.visualizationResources!=null &&
              java.util.Arrays.equals(this.visualizationResources, other.getVisualizationResources()))) &&
            ((this.visualizationTypes==null && other.getVisualizationTypes()==null) || 
             (this.visualizationTypes!=null &&
              java.util.Arrays.equals(this.visualizationTypes, other.getVisualizationTypes())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getIcon() != null) {
            _hashCode += getIcon().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getVisualizationResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisualizationResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisualizationResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVisualizationTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisualizationTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisualizationTypes(), i);
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
        new org.apache.axis.description.TypeDesc(VisualizationPlugin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "VisualizationPlugin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "developerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "icon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualizationResources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "visualizationResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "VisualizationResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualizationTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "visualizationTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "VisualizationType"));
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
