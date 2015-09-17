/**
 * CodeCoverageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CodeCoverageResult  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CodeLocation[] dmlInfo;

    private java.lang.String id;

    private com.sforce.soap._2006._04.metadata.CodeLocation[] locationsNotCovered;

    private com.sforce.soap._2006._04.metadata.CodeLocation[] methodInfo;

    private java.lang.String name;

    private java.lang.String namespace;

    private int numLocations;

    private int numLocationsNotCovered;

    private com.sforce.soap._2006._04.metadata.CodeLocation[] soqlInfo;

    private com.sforce.soap._2006._04.metadata.CodeLocation[] soslInfo;

    private java.lang.String type;

    public CodeCoverageResult() {
    }

    public CodeCoverageResult(
           com.sforce.soap._2006._04.metadata.CodeLocation[] dmlInfo,
           java.lang.String id,
           com.sforce.soap._2006._04.metadata.CodeLocation[] locationsNotCovered,
           com.sforce.soap._2006._04.metadata.CodeLocation[] methodInfo,
           java.lang.String name,
           java.lang.String namespace,
           int numLocations,
           int numLocationsNotCovered,
           com.sforce.soap._2006._04.metadata.CodeLocation[] soqlInfo,
           com.sforce.soap._2006._04.metadata.CodeLocation[] soslInfo,
           java.lang.String type) {
           this.dmlInfo = dmlInfo;
           this.id = id;
           this.locationsNotCovered = locationsNotCovered;
           this.methodInfo = methodInfo;
           this.name = name;
           this.namespace = namespace;
           this.numLocations = numLocations;
           this.numLocationsNotCovered = numLocationsNotCovered;
           this.soqlInfo = soqlInfo;
           this.soslInfo = soslInfo;
           this.type = type;
    }


    /**
     * Gets the dmlInfo value for this CodeCoverageResult.
     * 
     * @return dmlInfo
     */
    public com.sforce.soap._2006._04.metadata.CodeLocation[] getDmlInfo() {
        return dmlInfo;
    }


    /**
     * Sets the dmlInfo value for this CodeCoverageResult.
     * 
     * @param dmlInfo
     */
    public void setDmlInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] dmlInfo) {
        this.dmlInfo = dmlInfo;
    }

    public com.sforce.soap._2006._04.metadata.CodeLocation getDmlInfo(int i) {
        return this.dmlInfo[i];
    }

    public void setDmlInfo(int i, com.sforce.soap._2006._04.metadata.CodeLocation _value) {
        this.dmlInfo[i] = _value;
    }


    /**
     * Gets the id value for this CodeCoverageResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CodeCoverageResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the locationsNotCovered value for this CodeCoverageResult.
     * 
     * @return locationsNotCovered
     */
    public com.sforce.soap._2006._04.metadata.CodeLocation[] getLocationsNotCovered() {
        return locationsNotCovered;
    }


    /**
     * Sets the locationsNotCovered value for this CodeCoverageResult.
     * 
     * @param locationsNotCovered
     */
    public void setLocationsNotCovered(com.sforce.soap._2006._04.metadata.CodeLocation[] locationsNotCovered) {
        this.locationsNotCovered = locationsNotCovered;
    }

    public com.sforce.soap._2006._04.metadata.CodeLocation getLocationsNotCovered(int i) {
        return this.locationsNotCovered[i];
    }

    public void setLocationsNotCovered(int i, com.sforce.soap._2006._04.metadata.CodeLocation _value) {
        this.locationsNotCovered[i] = _value;
    }


    /**
     * Gets the methodInfo value for this CodeCoverageResult.
     * 
     * @return methodInfo
     */
    public com.sforce.soap._2006._04.metadata.CodeLocation[] getMethodInfo() {
        return methodInfo;
    }


    /**
     * Sets the methodInfo value for this CodeCoverageResult.
     * 
     * @param methodInfo
     */
    public void setMethodInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] methodInfo) {
        this.methodInfo = methodInfo;
    }

    public com.sforce.soap._2006._04.metadata.CodeLocation getMethodInfo(int i) {
        return this.methodInfo[i];
    }

    public void setMethodInfo(int i, com.sforce.soap._2006._04.metadata.CodeLocation _value) {
        this.methodInfo[i] = _value;
    }


    /**
     * Gets the name value for this CodeCoverageResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CodeCoverageResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespace value for this CodeCoverageResult.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this CodeCoverageResult.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the numLocations value for this CodeCoverageResult.
     * 
     * @return numLocations
     */
    public int getNumLocations() {
        return numLocations;
    }


    /**
     * Sets the numLocations value for this CodeCoverageResult.
     * 
     * @param numLocations
     */
    public void setNumLocations(int numLocations) {
        this.numLocations = numLocations;
    }


    /**
     * Gets the numLocationsNotCovered value for this CodeCoverageResult.
     * 
     * @return numLocationsNotCovered
     */
    public int getNumLocationsNotCovered() {
        return numLocationsNotCovered;
    }


    /**
     * Sets the numLocationsNotCovered value for this CodeCoverageResult.
     * 
     * @param numLocationsNotCovered
     */
    public void setNumLocationsNotCovered(int numLocationsNotCovered) {
        this.numLocationsNotCovered = numLocationsNotCovered;
    }


    /**
     * Gets the soqlInfo value for this CodeCoverageResult.
     * 
     * @return soqlInfo
     */
    public com.sforce.soap._2006._04.metadata.CodeLocation[] getSoqlInfo() {
        return soqlInfo;
    }


    /**
     * Sets the soqlInfo value for this CodeCoverageResult.
     * 
     * @param soqlInfo
     */
    public void setSoqlInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] soqlInfo) {
        this.soqlInfo = soqlInfo;
    }

    public com.sforce.soap._2006._04.metadata.CodeLocation getSoqlInfo(int i) {
        return this.soqlInfo[i];
    }

    public void setSoqlInfo(int i, com.sforce.soap._2006._04.metadata.CodeLocation _value) {
        this.soqlInfo[i] = _value;
    }


    /**
     * Gets the soslInfo value for this CodeCoverageResult.
     * 
     * @return soslInfo
     */
    public com.sforce.soap._2006._04.metadata.CodeLocation[] getSoslInfo() {
        return soslInfo;
    }


    /**
     * Sets the soslInfo value for this CodeCoverageResult.
     * 
     * @param soslInfo
     */
    public void setSoslInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] soslInfo) {
        this.soslInfo = soslInfo;
    }

    public com.sforce.soap._2006._04.metadata.CodeLocation getSoslInfo(int i) {
        return this.soslInfo[i];
    }

    public void setSoslInfo(int i, com.sforce.soap._2006._04.metadata.CodeLocation _value) {
        this.soslInfo[i] = _value;
    }


    /**
     * Gets the type value for this CodeCoverageResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CodeCoverageResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeCoverageResult)) return false;
        CodeCoverageResult other = (CodeCoverageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmlInfo==null && other.getDmlInfo()==null) || 
             (this.dmlInfo!=null &&
              java.util.Arrays.equals(this.dmlInfo, other.getDmlInfo()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.locationsNotCovered==null && other.getLocationsNotCovered()==null) || 
             (this.locationsNotCovered!=null &&
              java.util.Arrays.equals(this.locationsNotCovered, other.getLocationsNotCovered()))) &&
            ((this.methodInfo==null && other.getMethodInfo()==null) || 
             (this.methodInfo!=null &&
              java.util.Arrays.equals(this.methodInfo, other.getMethodInfo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            this.numLocations == other.getNumLocations() &&
            this.numLocationsNotCovered == other.getNumLocationsNotCovered() &&
            ((this.soqlInfo==null && other.getSoqlInfo()==null) || 
             (this.soqlInfo!=null &&
              java.util.Arrays.equals(this.soqlInfo, other.getSoqlInfo()))) &&
            ((this.soslInfo==null && other.getSoslInfo()==null) || 
             (this.soslInfo!=null &&
              java.util.Arrays.equals(this.soslInfo, other.getSoslInfo()))) &&
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
        if (getDmlInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDmlInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDmlInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLocationsNotCovered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationsNotCovered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationsNotCovered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMethodInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMethodInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMethodInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        _hashCode += getNumLocations();
        _hashCode += getNumLocationsNotCovered();
        if (getSoqlInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoqlInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoqlInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoslInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoslInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoslInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeCoverageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeCoverageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmlInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dmlInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationsNotCovered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "locationsNotCovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "methodInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLocationsNotCovered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numLocationsNotCovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soqlInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "soqlInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soslInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "soslInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
