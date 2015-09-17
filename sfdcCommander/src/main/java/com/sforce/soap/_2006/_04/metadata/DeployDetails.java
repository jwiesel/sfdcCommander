/**
 * DeployDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DeployDetails  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.DeployMessage[] componentFailures;

    private com.sforce.soap._2006._04.metadata.DeployMessage[] componentSuccesses;

    private com.sforce.soap._2006._04.metadata.RetrieveResult retrieveResult;

    private com.sforce.soap._2006._04.metadata.RunTestsResult runTestResult;

    public DeployDetails() {
    }

    public DeployDetails(
           com.sforce.soap._2006._04.metadata.DeployMessage[] componentFailures,
           com.sforce.soap._2006._04.metadata.DeployMessage[] componentSuccesses,
           com.sforce.soap._2006._04.metadata.RetrieveResult retrieveResult,
           com.sforce.soap._2006._04.metadata.RunTestsResult runTestResult) {
           this.componentFailures = componentFailures;
           this.componentSuccesses = componentSuccesses;
           this.retrieveResult = retrieveResult;
           this.runTestResult = runTestResult;
    }


    /**
     * Gets the componentFailures value for this DeployDetails.
     * 
     * @return componentFailures
     */
    public com.sforce.soap._2006._04.metadata.DeployMessage[] getComponentFailures() {
        return componentFailures;
    }


    /**
     * Sets the componentFailures value for this DeployDetails.
     * 
     * @param componentFailures
     */
    public void setComponentFailures(com.sforce.soap._2006._04.metadata.DeployMessage[] componentFailures) {
        this.componentFailures = componentFailures;
    }

    public com.sforce.soap._2006._04.metadata.DeployMessage getComponentFailures(int i) {
        return this.componentFailures[i];
    }

    public void setComponentFailures(int i, com.sforce.soap._2006._04.metadata.DeployMessage _value) {
        this.componentFailures[i] = _value;
    }


    /**
     * Gets the componentSuccesses value for this DeployDetails.
     * 
     * @return componentSuccesses
     */
    public com.sforce.soap._2006._04.metadata.DeployMessage[] getComponentSuccesses() {
        return componentSuccesses;
    }


    /**
     * Sets the componentSuccesses value for this DeployDetails.
     * 
     * @param componentSuccesses
     */
    public void setComponentSuccesses(com.sforce.soap._2006._04.metadata.DeployMessage[] componentSuccesses) {
        this.componentSuccesses = componentSuccesses;
    }

    public com.sforce.soap._2006._04.metadata.DeployMessage getComponentSuccesses(int i) {
        return this.componentSuccesses[i];
    }

    public void setComponentSuccesses(int i, com.sforce.soap._2006._04.metadata.DeployMessage _value) {
        this.componentSuccesses[i] = _value;
    }


    /**
     * Gets the retrieveResult value for this DeployDetails.
     * 
     * @return retrieveResult
     */
    public com.sforce.soap._2006._04.metadata.RetrieveResult getRetrieveResult() {
        return retrieveResult;
    }


    /**
     * Sets the retrieveResult value for this DeployDetails.
     * 
     * @param retrieveResult
     */
    public void setRetrieveResult(com.sforce.soap._2006._04.metadata.RetrieveResult retrieveResult) {
        this.retrieveResult = retrieveResult;
    }


    /**
     * Gets the runTestResult value for this DeployDetails.
     * 
     * @return runTestResult
     */
    public com.sforce.soap._2006._04.metadata.RunTestsResult getRunTestResult() {
        return runTestResult;
    }


    /**
     * Sets the runTestResult value for this DeployDetails.
     * 
     * @param runTestResult
     */
    public void setRunTestResult(com.sforce.soap._2006._04.metadata.RunTestsResult runTestResult) {
        this.runTestResult = runTestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeployDetails)) return false;
        DeployDetails other = (DeployDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.componentFailures==null && other.getComponentFailures()==null) || 
             (this.componentFailures!=null &&
              java.util.Arrays.equals(this.componentFailures, other.getComponentFailures()))) &&
            ((this.componentSuccesses==null && other.getComponentSuccesses()==null) || 
             (this.componentSuccesses!=null &&
              java.util.Arrays.equals(this.componentSuccesses, other.getComponentSuccesses()))) &&
            ((this.retrieveResult==null && other.getRetrieveResult()==null) || 
             (this.retrieveResult!=null &&
              this.retrieveResult.equals(other.getRetrieveResult()))) &&
            ((this.runTestResult==null && other.getRunTestResult()==null) || 
             (this.runTestResult!=null &&
              this.runTestResult.equals(other.getRunTestResult())));
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
        if (getComponentFailures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentFailures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentFailures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentSuccesses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentSuccesses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentSuccesses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetrieveResult() != null) {
            _hashCode += getRetrieveResult().hashCode();
        }
        if (getRunTestResult() != null) {
            _hashCode += getRunTestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeployDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "componentFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentSuccesses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "componentSuccesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "retrieveResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RetrieveResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runTestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "runTestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RunTestsResult"));
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
