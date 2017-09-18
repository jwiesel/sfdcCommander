/**
 * RunTestsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class RunTestsResult  implements java.io.Serializable {
    private java.lang.String apexLogId;

    private com.sforce.soap._2006._04.metadata.CodeCoverageResult[] codeCoverage;

    private com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] codeCoverageWarnings;

    private com.sforce.soap._2006._04.metadata.RunTestFailure[] failures;

    private int numFailures;

    private int numTestsRun;

    private com.sforce.soap._2006._04.metadata.RunTestSuccess[] successes;

    private double totalTime;

    public RunTestsResult() {
    }

    public RunTestsResult(
           java.lang.String apexLogId,
           com.sforce.soap._2006._04.metadata.CodeCoverageResult[] codeCoverage,
           com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] codeCoverageWarnings,
           com.sforce.soap._2006._04.metadata.RunTestFailure[] failures,
           int numFailures,
           int numTestsRun,
           com.sforce.soap._2006._04.metadata.RunTestSuccess[] successes,
           double totalTime) {
           this.apexLogId = apexLogId;
           this.codeCoverage = codeCoverage;
           this.codeCoverageWarnings = codeCoverageWarnings;
           this.failures = failures;
           this.numFailures = numFailures;
           this.numTestsRun = numTestsRun;
           this.successes = successes;
           this.totalTime = totalTime;
    }


    /**
     * Gets the apexLogId value for this RunTestsResult.
     * 
     * @return apexLogId
     */
    public java.lang.String getApexLogId() {
        return apexLogId;
    }


    /**
     * Sets the apexLogId value for this RunTestsResult.
     * 
     * @param apexLogId
     */
    public void setApexLogId(java.lang.String apexLogId) {
        this.apexLogId = apexLogId;
    }


    /**
     * Gets the codeCoverage value for this RunTestsResult.
     * 
     * @return codeCoverage
     */
    public com.sforce.soap._2006._04.metadata.CodeCoverageResult[] getCodeCoverage() {
        return codeCoverage;
    }


    /**
     * Sets the codeCoverage value for this RunTestsResult.
     * 
     * @param codeCoverage
     */
    public void setCodeCoverage(com.sforce.soap._2006._04.metadata.CodeCoverageResult[] codeCoverage) {
        this.codeCoverage = codeCoverage;
    }

    public com.sforce.soap._2006._04.metadata.CodeCoverageResult getCodeCoverage(int i) {
        return this.codeCoverage[i];
    }

    public void setCodeCoverage(int i, com.sforce.soap._2006._04.metadata.CodeCoverageResult _value) {
        this.codeCoverage[i] = _value;
    }


    /**
     * Gets the codeCoverageWarnings value for this RunTestsResult.
     * 
     * @return codeCoverageWarnings
     */
    public com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] getCodeCoverageWarnings() {
        return codeCoverageWarnings;
    }


    /**
     * Sets the codeCoverageWarnings value for this RunTestsResult.
     * 
     * @param codeCoverageWarnings
     */
    public void setCodeCoverageWarnings(com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] codeCoverageWarnings) {
        this.codeCoverageWarnings = codeCoverageWarnings;
    }

    public com.sforce.soap._2006._04.metadata.CodeCoverageWarning getCodeCoverageWarnings(int i) {
        return this.codeCoverageWarnings[i];
    }

    public void setCodeCoverageWarnings(int i, com.sforce.soap._2006._04.metadata.CodeCoverageWarning _value) {
        this.codeCoverageWarnings[i] = _value;
    }


    /**
     * Gets the failures value for this RunTestsResult.
     * 
     * @return failures
     */
    public com.sforce.soap._2006._04.metadata.RunTestFailure[] getFailures() {
        return failures;
    }


    /**
     * Sets the failures value for this RunTestsResult.
     * 
     * @param failures
     */
    public void setFailures(com.sforce.soap._2006._04.metadata.RunTestFailure[] failures) {
        this.failures = failures;
    }

    public com.sforce.soap._2006._04.metadata.RunTestFailure getFailures(int i) {
        return this.failures[i];
    }

    public void setFailures(int i, com.sforce.soap._2006._04.metadata.RunTestFailure _value) {
        this.failures[i] = _value;
    }


    /**
     * Gets the numFailures value for this RunTestsResult.
     * 
     * @return numFailures
     */
    public int getNumFailures() {
        return numFailures;
    }


    /**
     * Sets the numFailures value for this RunTestsResult.
     * 
     * @param numFailures
     */
    public void setNumFailures(int numFailures) {
        this.numFailures = numFailures;
    }


    /**
     * Gets the numTestsRun value for this RunTestsResult.
     * 
     * @return numTestsRun
     */
    public int getNumTestsRun() {
        return numTestsRun;
    }


    /**
     * Sets the numTestsRun value for this RunTestsResult.
     * 
     * @param numTestsRun
     */
    public void setNumTestsRun(int numTestsRun) {
        this.numTestsRun = numTestsRun;
    }


    /**
     * Gets the successes value for this RunTestsResult.
     * 
     * @return successes
     */
    public com.sforce.soap._2006._04.metadata.RunTestSuccess[] getSuccesses() {
        return successes;
    }


    /**
     * Sets the successes value for this RunTestsResult.
     * 
     * @param successes
     */
    public void setSuccesses(com.sforce.soap._2006._04.metadata.RunTestSuccess[] successes) {
        this.successes = successes;
    }

    public com.sforce.soap._2006._04.metadata.RunTestSuccess getSuccesses(int i) {
        return this.successes[i];
    }

    public void setSuccesses(int i, com.sforce.soap._2006._04.metadata.RunTestSuccess _value) {
        this.successes[i] = _value;
    }


    /**
     * Gets the totalTime value for this RunTestsResult.
     * 
     * @return totalTime
     */
    public double getTotalTime() {
        return totalTime;
    }


    /**
     * Sets the totalTime value for this RunTestsResult.
     * 
     * @param totalTime
     */
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunTestsResult)) return false;
        RunTestsResult other = (RunTestsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apexLogId==null && other.getApexLogId()==null) || 
             (this.apexLogId!=null &&
              this.apexLogId.equals(other.getApexLogId()))) &&
            ((this.codeCoverage==null && other.getCodeCoverage()==null) || 
             (this.codeCoverage!=null &&
              java.util.Arrays.equals(this.codeCoverage, other.getCodeCoverage()))) &&
            ((this.codeCoverageWarnings==null && other.getCodeCoverageWarnings()==null) || 
             (this.codeCoverageWarnings!=null &&
              java.util.Arrays.equals(this.codeCoverageWarnings, other.getCodeCoverageWarnings()))) &&
            ((this.failures==null && other.getFailures()==null) || 
             (this.failures!=null &&
              java.util.Arrays.equals(this.failures, other.getFailures()))) &&
            this.numFailures == other.getNumFailures() &&
            this.numTestsRun == other.getNumTestsRun() &&
            ((this.successes==null && other.getSuccesses()==null) || 
             (this.successes!=null &&
              java.util.Arrays.equals(this.successes, other.getSuccesses()))) &&
            this.totalTime == other.getTotalTime();
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
        if (getApexLogId() != null) {
            _hashCode += getApexLogId().hashCode();
        }
        if (getCodeCoverage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodeCoverage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodeCoverage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodeCoverageWarnings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodeCoverageWarnings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodeCoverageWarnings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNumFailures();
        _hashCode += getNumTestsRun();
        if (getSuccesses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccesses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccesses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getTotalTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunTestsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RunTestsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexLogId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apexLogId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeCoverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "codeCoverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeCoverageResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeCoverageWarnings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "codeCoverageWarnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeCoverageWarning"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "failures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RunTestFailure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTestsRun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numTestsRun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "successes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RunTestSuccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "totalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
