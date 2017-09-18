/**
 * WaveXmd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class WaveXmd  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String dataset;

    private java.lang.String datasetConnector;

    private java.lang.String datasetFullyQualifiedName;

    private com.sforce.soap._2006._04.metadata.WaveXmdDate[] dates;

    private com.sforce.soap._2006._04.metadata.WaveXmdDimension[] dimensions;

    private com.sforce.soap._2006._04.metadata.WaveXmdMeasure[] measures;

    private com.sforce.soap._2006._04.metadata.WaveXmdOrganization[] organizations;

    private java.lang.String origin;

    public WaveXmd() {
    }

    public WaveXmd(
           java.lang.String fullName,
           java.lang.String dataset,
           java.lang.String datasetConnector,
           java.lang.String datasetFullyQualifiedName,
           com.sforce.soap._2006._04.metadata.WaveXmdDate[] dates,
           com.sforce.soap._2006._04.metadata.WaveXmdDimension[] dimensions,
           com.sforce.soap._2006._04.metadata.WaveXmdMeasure[] measures,
           com.sforce.soap._2006._04.metadata.WaveXmdOrganization[] organizations,
           java.lang.String origin) {
        super(
            fullName);
        this.dataset = dataset;
        this.datasetConnector = datasetConnector;
        this.datasetFullyQualifiedName = datasetFullyQualifiedName;
        this.dates = dates;
        this.dimensions = dimensions;
        this.measures = measures;
        this.organizations = organizations;
        this.origin = origin;
    }


    /**
     * Gets the dataset value for this WaveXmd.
     * 
     * @return dataset
     */
    public java.lang.String getDataset() {
        return dataset;
    }


    /**
     * Sets the dataset value for this WaveXmd.
     * 
     * @param dataset
     */
    public void setDataset(java.lang.String dataset) {
        this.dataset = dataset;
    }


    /**
     * Gets the datasetConnector value for this WaveXmd.
     * 
     * @return datasetConnector
     */
    public java.lang.String getDatasetConnector() {
        return datasetConnector;
    }


    /**
     * Sets the datasetConnector value for this WaveXmd.
     * 
     * @param datasetConnector
     */
    public void setDatasetConnector(java.lang.String datasetConnector) {
        this.datasetConnector = datasetConnector;
    }


    /**
     * Gets the datasetFullyQualifiedName value for this WaveXmd.
     * 
     * @return datasetFullyQualifiedName
     */
    public java.lang.String getDatasetFullyQualifiedName() {
        return datasetFullyQualifiedName;
    }


    /**
     * Sets the datasetFullyQualifiedName value for this WaveXmd.
     * 
     * @param datasetFullyQualifiedName
     */
    public void setDatasetFullyQualifiedName(java.lang.String datasetFullyQualifiedName) {
        this.datasetFullyQualifiedName = datasetFullyQualifiedName;
    }


    /**
     * Gets the dates value for this WaveXmd.
     * 
     * @return dates
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdDate[] getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this WaveXmd.
     * 
     * @param dates
     */
    public void setDates(com.sforce.soap._2006._04.metadata.WaveXmdDate[] dates) {
        this.dates = dates;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdDate getDates(int i) {
        return this.dates[i];
    }

    public void setDates(int i, com.sforce.soap._2006._04.metadata.WaveXmdDate _value) {
        this.dates[i] = _value;
    }


    /**
     * Gets the dimensions value for this WaveXmd.
     * 
     * @return dimensions
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdDimension[] getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this WaveXmd.
     * 
     * @param dimensions
     */
    public void setDimensions(com.sforce.soap._2006._04.metadata.WaveXmdDimension[] dimensions) {
        this.dimensions = dimensions;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdDimension getDimensions(int i) {
        return this.dimensions[i];
    }

    public void setDimensions(int i, com.sforce.soap._2006._04.metadata.WaveXmdDimension _value) {
        this.dimensions[i] = _value;
    }


    /**
     * Gets the measures value for this WaveXmd.
     * 
     * @return measures
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdMeasure[] getMeasures() {
        return measures;
    }


    /**
     * Sets the measures value for this WaveXmd.
     * 
     * @param measures
     */
    public void setMeasures(com.sforce.soap._2006._04.metadata.WaveXmdMeasure[] measures) {
        this.measures = measures;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdMeasure getMeasures(int i) {
        return this.measures[i];
    }

    public void setMeasures(int i, com.sforce.soap._2006._04.metadata.WaveXmdMeasure _value) {
        this.measures[i] = _value;
    }


    /**
     * Gets the organizations value for this WaveXmd.
     * 
     * @return organizations
     */
    public com.sforce.soap._2006._04.metadata.WaveXmdOrganization[] getOrganizations() {
        return organizations;
    }


    /**
     * Sets the organizations value for this WaveXmd.
     * 
     * @param organizations
     */
    public void setOrganizations(com.sforce.soap._2006._04.metadata.WaveXmdOrganization[] organizations) {
        this.organizations = organizations;
    }

    public com.sforce.soap._2006._04.metadata.WaveXmdOrganization getOrganizations(int i) {
        return this.organizations[i];
    }

    public void setOrganizations(int i, com.sforce.soap._2006._04.metadata.WaveXmdOrganization _value) {
        this.organizations[i] = _value;
    }


    /**
     * Gets the origin value for this WaveXmd.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this WaveXmd.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaveXmd)) return false;
        WaveXmd other = (WaveXmd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataset==null && other.getDataset()==null) || 
             (this.dataset!=null &&
              this.dataset.equals(other.getDataset()))) &&
            ((this.datasetConnector==null && other.getDatasetConnector()==null) || 
             (this.datasetConnector!=null &&
              this.datasetConnector.equals(other.getDatasetConnector()))) &&
            ((this.datasetFullyQualifiedName==null && other.getDatasetFullyQualifiedName()==null) || 
             (this.datasetFullyQualifiedName!=null &&
              this.datasetFullyQualifiedName.equals(other.getDatasetFullyQualifiedName()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              java.util.Arrays.equals(this.dates, other.getDates()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              java.util.Arrays.equals(this.dimensions, other.getDimensions()))) &&
            ((this.measures==null && other.getMeasures()==null) || 
             (this.measures!=null &&
              java.util.Arrays.equals(this.measures, other.getMeasures()))) &&
            ((this.organizations==null && other.getOrganizations()==null) || 
             (this.organizations!=null &&
              java.util.Arrays.equals(this.organizations, other.getOrganizations()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin())));
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
        if (getDataset() != null) {
            _hashCode += getDataset().hashCode();
        }
        if (getDatasetConnector() != null) {
            _hashCode += getDatasetConnector().hashCode();
        }
        if (getDatasetFullyQualifiedName() != null) {
            _hashCode += getDatasetFullyQualifiedName().hashCode();
        }
        if (getDates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMeasures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMeasures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMeasures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrganizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaveXmd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasetConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "datasetConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasetFullyQualifiedName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "datasetFullyQualifiedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdDimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "measures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdMeasure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "organizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WaveXmdOrganization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
