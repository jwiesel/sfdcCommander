/**
 * CleanDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CleanDataService  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CleanRule[] cleanRules;

    private java.lang.String description;

    private java.lang.String masterLabel;

    private java.lang.String matchEngine;

    public CleanDataService() {
    }

    public CleanDataService(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.CleanRule[] cleanRules,
           java.lang.String description,
           java.lang.String masterLabel,
           java.lang.String matchEngine) {
        super(
            fullName);
        this.cleanRules = cleanRules;
        this.description = description;
        this.masterLabel = masterLabel;
        this.matchEngine = matchEngine;
    }


    /**
     * Gets the cleanRules value for this CleanDataService.
     * 
     * @return cleanRules
     */
    public com.sforce.soap._2006._04.metadata.CleanRule[] getCleanRules() {
        return cleanRules;
    }


    /**
     * Sets the cleanRules value for this CleanDataService.
     * 
     * @param cleanRules
     */
    public void setCleanRules(com.sforce.soap._2006._04.metadata.CleanRule[] cleanRules) {
        this.cleanRules = cleanRules;
    }

    public com.sforce.soap._2006._04.metadata.CleanRule getCleanRules(int i) {
        return this.cleanRules[i];
    }

    public void setCleanRules(int i, com.sforce.soap._2006._04.metadata.CleanRule _value) {
        this.cleanRules[i] = _value;
    }


    /**
     * Gets the description value for this CleanDataService.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CleanDataService.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the masterLabel value for this CleanDataService.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this CleanDataService.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the matchEngine value for this CleanDataService.
     * 
     * @return matchEngine
     */
    public java.lang.String getMatchEngine() {
        return matchEngine;
    }


    /**
     * Sets the matchEngine value for this CleanDataService.
     * 
     * @param matchEngine
     */
    public void setMatchEngine(java.lang.String matchEngine) {
        this.matchEngine = matchEngine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CleanDataService)) return false;
        CleanDataService other = (CleanDataService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cleanRules==null && other.getCleanRules()==null) || 
             (this.cleanRules!=null &&
              java.util.Arrays.equals(this.cleanRules, other.getCleanRules()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.matchEngine==null && other.getMatchEngine()==null) || 
             (this.matchEngine!=null &&
              this.matchEngine.equals(other.getMatchEngine())));
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
        if (getCleanRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCleanRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCleanRules(), i);
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
        if (getMatchEngine() != null) {
            _hashCode += getMatchEngine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CleanDataService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CleanDataService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleanRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "cleanRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CleanRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
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
        elemField.setFieldName("matchEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "matchEngine"));
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
