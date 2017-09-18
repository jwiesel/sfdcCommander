/**
 * WaveLens.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WaveLens  extends com.sforce.soap._2006._04.metadata.MetadataWithContent  implements java.io.Serializable {
    private java.lang.String application;

    private java.lang.String[] datasets;

    private java.lang.String description;

    private java.lang.String masterLabel;

    private java.lang.String templateAssetSourceName;

    private java.lang.String visualizationType;

    public WaveLens() {
    }

    public WaveLens(
           java.lang.String fullName,
           byte[] content,
           java.lang.String application,
           java.lang.String[] datasets,
           java.lang.String description,
           java.lang.String masterLabel,
           java.lang.String templateAssetSourceName,
           java.lang.String visualizationType) {
        super(
            fullName,
            content);
        this.application = application;
        this.datasets = datasets;
        this.description = description;
        this.masterLabel = masterLabel;
        this.templateAssetSourceName = templateAssetSourceName;
        this.visualizationType = visualizationType;
    }


    /**
     * Gets the application value for this WaveLens.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this WaveLens.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the datasets value for this WaveLens.
     * 
     * @return datasets
     */
    public java.lang.String[] getDatasets() {
        return datasets;
    }


    /**
     * Sets the datasets value for this WaveLens.
     * 
     * @param datasets
     */
    public void setDatasets(java.lang.String[] datasets) {
        this.datasets = datasets;
    }

    public java.lang.String getDatasets(int i) {
        return this.datasets[i];
    }

    public void setDatasets(int i, java.lang.String _value) {
        this.datasets[i] = _value;
    }


    /**
     * Gets the description value for this WaveLens.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WaveLens.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the masterLabel value for this WaveLens.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this WaveLens.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the templateAssetSourceName value for this WaveLens.
     * 
     * @return templateAssetSourceName
     */
    public java.lang.String getTemplateAssetSourceName() {
        return templateAssetSourceName;
    }


    /**
     * Sets the templateAssetSourceName value for this WaveLens.
     * 
     * @param templateAssetSourceName
     */
    public void setTemplateAssetSourceName(java.lang.String templateAssetSourceName) {
        this.templateAssetSourceName = templateAssetSourceName;
    }


    /**
     * Gets the visualizationType value for this WaveLens.
     * 
     * @return visualizationType
     */
    public java.lang.String getVisualizationType() {
        return visualizationType;
    }


    /**
     * Sets the visualizationType value for this WaveLens.
     * 
     * @param visualizationType
     */
    public void setVisualizationType(java.lang.String visualizationType) {
        this.visualizationType = visualizationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaveLens)) return false;
        WaveLens other = (WaveLens) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.datasets==null && other.getDatasets()==null) || 
             (this.datasets!=null &&
              java.util.Arrays.equals(this.datasets, other.getDatasets()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.templateAssetSourceName==null && other.getTemplateAssetSourceName()==null) || 
             (this.templateAssetSourceName!=null &&
              this.templateAssetSourceName.equals(other.getTemplateAssetSourceName()))) &&
            ((this.visualizationType==null && other.getVisualizationType()==null) || 
             (this.visualizationType!=null &&
              this.visualizationType.equals(other.getVisualizationType())));
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
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getDatasets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatasets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatasets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getTemplateAssetSourceName() != null) {
            _hashCode += getTemplateAssetSourceName().hashCode();
        }
        if (getVisualizationType() != null) {
            _hashCode += getVisualizationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaveLens.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveLens"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "datasets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateAssetSourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "templateAssetSourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "visualizationType"));
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
