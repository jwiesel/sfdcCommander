/**
 * ConnectedAppCanvasConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ConnectedAppCanvasConfig  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.AccessMethod accessMethod;

    private java.lang.String canvasUrl;

    private java.lang.String lifecycleClass;

    private com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] locations;

    private com.sforce.soap._2006._04.metadata.CanvasOptions[] options;

    private com.sforce.soap._2006._04.metadata.SamlInitiationMethod samlInitiationMethod;

    public ConnectedAppCanvasConfig() {
    }

    public ConnectedAppCanvasConfig(
           com.sforce.soap._2006._04.metadata.AccessMethod accessMethod,
           java.lang.String canvasUrl,
           java.lang.String lifecycleClass,
           com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] locations,
           com.sforce.soap._2006._04.metadata.CanvasOptions[] options,
           com.sforce.soap._2006._04.metadata.SamlInitiationMethod samlInitiationMethod) {
           this.accessMethod = accessMethod;
           this.canvasUrl = canvasUrl;
           this.lifecycleClass = lifecycleClass;
           this.locations = locations;
           this.options = options;
           this.samlInitiationMethod = samlInitiationMethod;
    }


    /**
     * Gets the accessMethod value for this ConnectedAppCanvasConfig.
     * 
     * @return accessMethod
     */
    public com.sforce.soap._2006._04.metadata.AccessMethod getAccessMethod() {
        return accessMethod;
    }


    /**
     * Sets the accessMethod value for this ConnectedAppCanvasConfig.
     * 
     * @param accessMethod
     */
    public void setAccessMethod(com.sforce.soap._2006._04.metadata.AccessMethod accessMethod) {
        this.accessMethod = accessMethod;
    }


    /**
     * Gets the canvasUrl value for this ConnectedAppCanvasConfig.
     * 
     * @return canvasUrl
     */
    public java.lang.String getCanvasUrl() {
        return canvasUrl;
    }


    /**
     * Sets the canvasUrl value for this ConnectedAppCanvasConfig.
     * 
     * @param canvasUrl
     */
    public void setCanvasUrl(java.lang.String canvasUrl) {
        this.canvasUrl = canvasUrl;
    }


    /**
     * Gets the lifecycleClass value for this ConnectedAppCanvasConfig.
     * 
     * @return lifecycleClass
     */
    public java.lang.String getLifecycleClass() {
        return lifecycleClass;
    }


    /**
     * Sets the lifecycleClass value for this ConnectedAppCanvasConfig.
     * 
     * @param lifecycleClass
     */
    public void setLifecycleClass(java.lang.String lifecycleClass) {
        this.lifecycleClass = lifecycleClass;
    }


    /**
     * Gets the locations value for this ConnectedAppCanvasConfig.
     * 
     * @return locations
     */
    public com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this ConnectedAppCanvasConfig.
     * 
     * @param locations
     */
    public void setLocations(com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] locations) {
        this.locations = locations;
    }

    public com.sforce.soap._2006._04.metadata.CanvasLocationOptions getLocations(int i) {
        return this.locations[i];
    }

    public void setLocations(int i, com.sforce.soap._2006._04.metadata.CanvasLocationOptions _value) {
        this.locations[i] = _value;
    }


    /**
     * Gets the options value for this ConnectedAppCanvasConfig.
     * 
     * @return options
     */
    public com.sforce.soap._2006._04.metadata.CanvasOptions[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ConnectedAppCanvasConfig.
     * 
     * @param options
     */
    public void setOptions(com.sforce.soap._2006._04.metadata.CanvasOptions[] options) {
        this.options = options;
    }

    public com.sforce.soap._2006._04.metadata.CanvasOptions getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.sforce.soap._2006._04.metadata.CanvasOptions _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the samlInitiationMethod value for this ConnectedAppCanvasConfig.
     * 
     * @return samlInitiationMethod
     */
    public com.sforce.soap._2006._04.metadata.SamlInitiationMethod getSamlInitiationMethod() {
        return samlInitiationMethod;
    }


    /**
     * Sets the samlInitiationMethod value for this ConnectedAppCanvasConfig.
     * 
     * @param samlInitiationMethod
     */
    public void setSamlInitiationMethod(com.sforce.soap._2006._04.metadata.SamlInitiationMethod samlInitiationMethod) {
        this.samlInitiationMethod = samlInitiationMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectedAppCanvasConfig)) return false;
        ConnectedAppCanvasConfig other = (ConnectedAppCanvasConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessMethod==null && other.getAccessMethod()==null) || 
             (this.accessMethod!=null &&
              this.accessMethod.equals(other.getAccessMethod()))) &&
            ((this.canvasUrl==null && other.getCanvasUrl()==null) || 
             (this.canvasUrl!=null &&
              this.canvasUrl.equals(other.getCanvasUrl()))) &&
            ((this.lifecycleClass==null && other.getLifecycleClass()==null) || 
             (this.lifecycleClass!=null &&
              this.lifecycleClass.equals(other.getLifecycleClass()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.samlInitiationMethod==null && other.getSamlInitiationMethod()==null) || 
             (this.samlInitiationMethod!=null &&
              this.samlInitiationMethod.equals(other.getSamlInitiationMethod())));
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
        if (getAccessMethod() != null) {
            _hashCode += getAccessMethod().hashCode();
        }
        if (getCanvasUrl() != null) {
            _hashCode += getCanvasUrl().hashCode();
        }
        if (getLifecycleClass() != null) {
            _hashCode += getLifecycleClass().hashCode();
        }
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlInitiationMethod() != null) {
            _hashCode += getSamlInitiationMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectedAppCanvasConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppCanvasConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accessMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccessMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "canvasUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifecycleClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lifecycleClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CanvasLocationOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CanvasOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlInitiationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "samlInitiationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlInitiationMethod"));
        elemField.setMinOccurs(0);
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
