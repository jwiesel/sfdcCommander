/**
 * ReportBucketField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportBucketField  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportBucketFieldType bucketType;

    private java.lang.String developerName;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.ReportFormulaNullTreatment nullTreatment;

    private java.lang.String otherBucketLabel;

    private java.lang.String sourceColumnName;

    private java.lang.Boolean useOther;

    private com.sforce.soap._2006._04.metadata.ReportBucketFieldValue[] values;

    public ReportBucketField() {
    }

    public ReportBucketField(
           com.sforce.soap._2006._04.metadata.ReportBucketFieldType bucketType,
           java.lang.String developerName,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.ReportFormulaNullTreatment nullTreatment,
           java.lang.String otherBucketLabel,
           java.lang.String sourceColumnName,
           java.lang.Boolean useOther,
           com.sforce.soap._2006._04.metadata.ReportBucketFieldValue[] values) {
           this.bucketType = bucketType;
           this.developerName = developerName;
           this.masterLabel = masterLabel;
           this.nullTreatment = nullTreatment;
           this.otherBucketLabel = otherBucketLabel;
           this.sourceColumnName = sourceColumnName;
           this.useOther = useOther;
           this.values = values;
    }


    /**
     * Gets the bucketType value for this ReportBucketField.
     * 
     * @return bucketType
     */
    public com.sforce.soap._2006._04.metadata.ReportBucketFieldType getBucketType() {
        return bucketType;
    }


    /**
     * Sets the bucketType value for this ReportBucketField.
     * 
     * @param bucketType
     */
    public void setBucketType(com.sforce.soap._2006._04.metadata.ReportBucketFieldType bucketType) {
        this.bucketType = bucketType;
    }


    /**
     * Gets the developerName value for this ReportBucketField.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this ReportBucketField.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the masterLabel value for this ReportBucketField.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this ReportBucketField.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the nullTreatment value for this ReportBucketField.
     * 
     * @return nullTreatment
     */
    public com.sforce.soap._2006._04.metadata.ReportFormulaNullTreatment getNullTreatment() {
        return nullTreatment;
    }


    /**
     * Sets the nullTreatment value for this ReportBucketField.
     * 
     * @param nullTreatment
     */
    public void setNullTreatment(com.sforce.soap._2006._04.metadata.ReportFormulaNullTreatment nullTreatment) {
        this.nullTreatment = nullTreatment;
    }


    /**
     * Gets the otherBucketLabel value for this ReportBucketField.
     * 
     * @return otherBucketLabel
     */
    public java.lang.String getOtherBucketLabel() {
        return otherBucketLabel;
    }


    /**
     * Sets the otherBucketLabel value for this ReportBucketField.
     * 
     * @param otherBucketLabel
     */
    public void setOtherBucketLabel(java.lang.String otherBucketLabel) {
        this.otherBucketLabel = otherBucketLabel;
    }


    /**
     * Gets the sourceColumnName value for this ReportBucketField.
     * 
     * @return sourceColumnName
     */
    public java.lang.String getSourceColumnName() {
        return sourceColumnName;
    }


    /**
     * Sets the sourceColumnName value for this ReportBucketField.
     * 
     * @param sourceColumnName
     */
    public void setSourceColumnName(java.lang.String sourceColumnName) {
        this.sourceColumnName = sourceColumnName;
    }


    /**
     * Gets the useOther value for this ReportBucketField.
     * 
     * @return useOther
     */
    public java.lang.Boolean getUseOther() {
        return useOther;
    }


    /**
     * Sets the useOther value for this ReportBucketField.
     * 
     * @param useOther
     */
    public void setUseOther(java.lang.Boolean useOther) {
        this.useOther = useOther;
    }


    /**
     * Gets the values value for this ReportBucketField.
     * 
     * @return values
     */
    public com.sforce.soap._2006._04.metadata.ReportBucketFieldValue[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this ReportBucketField.
     * 
     * @param values
     */
    public void setValues(com.sforce.soap._2006._04.metadata.ReportBucketFieldValue[] values) {
        this.values = values;
    }

    public com.sforce.soap._2006._04.metadata.ReportBucketFieldValue getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, com.sforce.soap._2006._04.metadata.ReportBucketFieldValue _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportBucketField)) return false;
        ReportBucketField other = (ReportBucketField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bucketType==null && other.getBucketType()==null) || 
             (this.bucketType!=null &&
              this.bucketType.equals(other.getBucketType()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.nullTreatment==null && other.getNullTreatment()==null) || 
             (this.nullTreatment!=null &&
              this.nullTreatment.equals(other.getNullTreatment()))) &&
            ((this.otherBucketLabel==null && other.getOtherBucketLabel()==null) || 
             (this.otherBucketLabel!=null &&
              this.otherBucketLabel.equals(other.getOtherBucketLabel()))) &&
            ((this.sourceColumnName==null && other.getSourceColumnName()==null) || 
             (this.sourceColumnName!=null &&
              this.sourceColumnName.equals(other.getSourceColumnName()))) &&
            ((this.useOther==null && other.getUseOther()==null) || 
             (this.useOther!=null &&
              this.useOther.equals(other.getUseOther()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getBucketType() != null) {
            _hashCode += getBucketType().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNullTreatment() != null) {
            _hashCode += getNullTreatment().hashCode();
        }
        if (getOtherBucketLabel() != null) {
            _hashCode += getOtherBucketLabel().hashCode();
        }
        if (getSourceColumnName() != null) {
            _hashCode += getSourceColumnName().hashCode();
        }
        if (getUseOther() != null) {
            _hashCode += getUseOther().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(ReportBucketField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "bucketType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketFieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "developerName"));
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
        elemField.setFieldName("nullTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "nullTreatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFormulaNullTreatment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherBucketLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "otherBucketLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceColumnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sourceColumnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useOther");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "useOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketFieldValue"));
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
