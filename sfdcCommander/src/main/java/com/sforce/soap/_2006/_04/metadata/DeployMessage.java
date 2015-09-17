/**
 * DeployMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DeployMessage  implements java.io.Serializable {
    private boolean changed;

    private java.lang.Integer columnNumber;

    private java.lang.String componentType;

    private boolean created;

    private java.util.Calendar createdDate;

    private boolean deleted;

    private java.lang.String fileName;

    private java.lang.String fullName;

    private java.lang.String id;

    private java.lang.Integer lineNumber;

    private java.lang.String problem;

    private com.sforce.soap._2006._04.metadata.DeployProblemType problemType;

    private boolean success;

    public DeployMessage() {
    }

    public DeployMessage(
           boolean changed,
           java.lang.Integer columnNumber,
           java.lang.String componentType,
           boolean created,
           java.util.Calendar createdDate,
           boolean deleted,
           java.lang.String fileName,
           java.lang.String fullName,
           java.lang.String id,
           java.lang.Integer lineNumber,
           java.lang.String problem,
           com.sforce.soap._2006._04.metadata.DeployProblemType problemType,
           boolean success) {
           this.changed = changed;
           this.columnNumber = columnNumber;
           this.componentType = componentType;
           this.created = created;
           this.createdDate = createdDate;
           this.deleted = deleted;
           this.fileName = fileName;
           this.fullName = fullName;
           this.id = id;
           this.lineNumber = lineNumber;
           this.problem = problem;
           this.problemType = problemType;
           this.success = success;
    }


    /**
     * Gets the changed value for this DeployMessage.
     * 
     * @return changed
     */
    public boolean isChanged() {
        return changed;
    }


    /**
     * Sets the changed value for this DeployMessage.
     * 
     * @param changed
     */
    public void setChanged(boolean changed) {
        this.changed = changed;
    }


    /**
     * Gets the columnNumber value for this DeployMessage.
     * 
     * @return columnNumber
     */
    public java.lang.Integer getColumnNumber() {
        return columnNumber;
    }


    /**
     * Sets the columnNumber value for this DeployMessage.
     * 
     * @param columnNumber
     */
    public void setColumnNumber(java.lang.Integer columnNumber) {
        this.columnNumber = columnNumber;
    }


    /**
     * Gets the componentType value for this DeployMessage.
     * 
     * @return componentType
     */
    public java.lang.String getComponentType() {
        return componentType;
    }


    /**
     * Sets the componentType value for this DeployMessage.
     * 
     * @param componentType
     */
    public void setComponentType(java.lang.String componentType) {
        this.componentType = componentType;
    }


    /**
     * Gets the created value for this DeployMessage.
     * 
     * @return created
     */
    public boolean isCreated() {
        return created;
    }


    /**
     * Sets the created value for this DeployMessage.
     * 
     * @param created
     */
    public void setCreated(boolean created) {
        this.created = created;
    }


    /**
     * Gets the createdDate value for this DeployMessage.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this DeployMessage.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the deleted value for this DeployMessage.
     * 
     * @return deleted
     */
    public boolean isDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this DeployMessage.
     * 
     * @param deleted
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the fileName value for this DeployMessage.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this DeployMessage.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fullName value for this DeployMessage.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this DeployMessage.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the id value for this DeployMessage.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DeployMessage.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the lineNumber value for this DeployMessage.
     * 
     * @return lineNumber
     */
    public java.lang.Integer getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this DeployMessage.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.Integer lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the problem value for this DeployMessage.
     * 
     * @return problem
     */
    public java.lang.String getProblem() {
        return problem;
    }


    /**
     * Sets the problem value for this DeployMessage.
     * 
     * @param problem
     */
    public void setProblem(java.lang.String problem) {
        this.problem = problem;
    }


    /**
     * Gets the problemType value for this DeployMessage.
     * 
     * @return problemType
     */
    public com.sforce.soap._2006._04.metadata.DeployProblemType getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this DeployMessage.
     * 
     * @param problemType
     */
    public void setProblemType(com.sforce.soap._2006._04.metadata.DeployProblemType problemType) {
        this.problemType = problemType;
    }


    /**
     * Gets the success value for this DeployMessage.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this DeployMessage.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeployMessage)) return false;
        DeployMessage other = (DeployMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.changed == other.isChanged() &&
            ((this.columnNumber==null && other.getColumnNumber()==null) || 
             (this.columnNumber!=null &&
              this.columnNumber.equals(other.getColumnNumber()))) &&
            ((this.componentType==null && other.getComponentType()==null) || 
             (this.componentType!=null &&
              this.componentType.equals(other.getComponentType()))) &&
            this.created == other.isCreated() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.deleted == other.isDeleted() &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.problem==null && other.getProblem()==null) || 
             (this.problem!=null &&
              this.problem.equals(other.getProblem()))) &&
            ((this.problemType==null && other.getProblemType()==null) || 
             (this.problemType!=null &&
              this.problemType.equals(other.getProblemType()))) &&
            this.success == other.isSuccess();
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
        _hashCode += (isChanged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getColumnNumber() != null) {
            _hashCode += getColumnNumber().hashCode();
        }
        if (getComponentType() != null) {
            _hashCode += getComponentType().hashCode();
        }
        _hashCode += (isCreated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += (isDeleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getProblem() != null) {
            _hashCode += getProblem().hashCode();
        }
        if (getProblemType() != null) {
            _hashCode += getProblemType().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeployMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "changed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "columnNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "componentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "problem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "problemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployProblemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
