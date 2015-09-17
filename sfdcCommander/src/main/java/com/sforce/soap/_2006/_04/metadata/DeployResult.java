/**
 * DeployResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DeployResult  implements java.io.Serializable {
    private java.lang.String canceledBy;

    private java.lang.String canceledByName;

    private boolean checkOnly;

    private java.util.Calendar completedDate;

    private java.lang.String createdBy;

    private java.lang.String createdByName;

    private java.util.Calendar createdDate;

    private com.sforce.soap._2006._04.metadata.DeployDetails details;

    private boolean done;

    private java.lang.String errorMessage;

    private com.sforce.soap._2006._04.metadata.StatusCode errorStatusCode;

    private java.lang.String id;

    private boolean ignoreWarnings;

    private java.util.Calendar lastModifiedDate;

    private int numberComponentErrors;

    private int numberComponentsDeployed;

    private int numberComponentsTotal;

    private int numberTestErrors;

    private int numberTestsCompleted;

    private int numberTestsTotal;

    private boolean rollbackOnError;

    private boolean runTestsEnabled;

    private java.util.Calendar startDate;

    private java.lang.String stateDetail;

    private com.sforce.soap._2006._04.metadata.DeployStatus status;

    private boolean success;

    public DeployResult() {
    }

    public DeployResult(
           java.lang.String canceledBy,
           java.lang.String canceledByName,
           boolean checkOnly,
           java.util.Calendar completedDate,
           java.lang.String createdBy,
           java.lang.String createdByName,
           java.util.Calendar createdDate,
           com.sforce.soap._2006._04.metadata.DeployDetails details,
           boolean done,
           java.lang.String errorMessage,
           com.sforce.soap._2006._04.metadata.StatusCode errorStatusCode,
           java.lang.String id,
           boolean ignoreWarnings,
           java.util.Calendar lastModifiedDate,
           int numberComponentErrors,
           int numberComponentsDeployed,
           int numberComponentsTotal,
           int numberTestErrors,
           int numberTestsCompleted,
           int numberTestsTotal,
           boolean rollbackOnError,
           boolean runTestsEnabled,
           java.util.Calendar startDate,
           java.lang.String stateDetail,
           com.sforce.soap._2006._04.metadata.DeployStatus status,
           boolean success) {
           this.canceledBy = canceledBy;
           this.canceledByName = canceledByName;
           this.checkOnly = checkOnly;
           this.completedDate = completedDate;
           this.createdBy = createdBy;
           this.createdByName = createdByName;
           this.createdDate = createdDate;
           this.details = details;
           this.done = done;
           this.errorMessage = errorMessage;
           this.errorStatusCode = errorStatusCode;
           this.id = id;
           this.ignoreWarnings = ignoreWarnings;
           this.lastModifiedDate = lastModifiedDate;
           this.numberComponentErrors = numberComponentErrors;
           this.numberComponentsDeployed = numberComponentsDeployed;
           this.numberComponentsTotal = numberComponentsTotal;
           this.numberTestErrors = numberTestErrors;
           this.numberTestsCompleted = numberTestsCompleted;
           this.numberTestsTotal = numberTestsTotal;
           this.rollbackOnError = rollbackOnError;
           this.runTestsEnabled = runTestsEnabled;
           this.startDate = startDate;
           this.stateDetail = stateDetail;
           this.status = status;
           this.success = success;
    }


    /**
     * Gets the canceledBy value for this DeployResult.
     * 
     * @return canceledBy
     */
    public java.lang.String getCanceledBy() {
        return canceledBy;
    }


    /**
     * Sets the canceledBy value for this DeployResult.
     * 
     * @param canceledBy
     */
    public void setCanceledBy(java.lang.String canceledBy) {
        this.canceledBy = canceledBy;
    }


    /**
     * Gets the canceledByName value for this DeployResult.
     * 
     * @return canceledByName
     */
    public java.lang.String getCanceledByName() {
        return canceledByName;
    }


    /**
     * Sets the canceledByName value for this DeployResult.
     * 
     * @param canceledByName
     */
    public void setCanceledByName(java.lang.String canceledByName) {
        this.canceledByName = canceledByName;
    }


    /**
     * Gets the checkOnly value for this DeployResult.
     * 
     * @return checkOnly
     */
    public boolean isCheckOnly() {
        return checkOnly;
    }


    /**
     * Sets the checkOnly value for this DeployResult.
     * 
     * @param checkOnly
     */
    public void setCheckOnly(boolean checkOnly) {
        this.checkOnly = checkOnly;
    }


    /**
     * Gets the completedDate value for this DeployResult.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this DeployResult.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the createdBy value for this DeployResult.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this DeployResult.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdByName value for this DeployResult.
     * 
     * @return createdByName
     */
    public java.lang.String getCreatedByName() {
        return createdByName;
    }


    /**
     * Sets the createdByName value for this DeployResult.
     * 
     * @param createdByName
     */
    public void setCreatedByName(java.lang.String createdByName) {
        this.createdByName = createdByName;
    }


    /**
     * Gets the createdDate value for this DeployResult.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this DeployResult.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the details value for this DeployResult.
     * 
     * @return details
     */
    public com.sforce.soap._2006._04.metadata.DeployDetails getDetails() {
        return details;
    }


    /**
     * Sets the details value for this DeployResult.
     * 
     * @param details
     */
    public void setDetails(com.sforce.soap._2006._04.metadata.DeployDetails details) {
        this.details = details;
    }


    /**
     * Gets the done value for this DeployResult.
     * 
     * @return done
     */
    public boolean isDone() {
        return done;
    }


    /**
     * Sets the done value for this DeployResult.
     * 
     * @param done
     */
    public void setDone(boolean done) {
        this.done = done;
    }


    /**
     * Gets the errorMessage value for this DeployResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this DeployResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the errorStatusCode value for this DeployResult.
     * 
     * @return errorStatusCode
     */
    public com.sforce.soap._2006._04.metadata.StatusCode getErrorStatusCode() {
        return errorStatusCode;
    }


    /**
     * Sets the errorStatusCode value for this DeployResult.
     * 
     * @param errorStatusCode
     */
    public void setErrorStatusCode(com.sforce.soap._2006._04.metadata.StatusCode errorStatusCode) {
        this.errorStatusCode = errorStatusCode;
    }


    /**
     * Gets the id value for this DeployResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DeployResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ignoreWarnings value for this DeployResult.
     * 
     * @return ignoreWarnings
     */
    public boolean isIgnoreWarnings() {
        return ignoreWarnings;
    }


    /**
     * Sets the ignoreWarnings value for this DeployResult.
     * 
     * @param ignoreWarnings
     */
    public void setIgnoreWarnings(boolean ignoreWarnings) {
        this.ignoreWarnings = ignoreWarnings;
    }


    /**
     * Gets the lastModifiedDate value for this DeployResult.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this DeployResult.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the numberComponentErrors value for this DeployResult.
     * 
     * @return numberComponentErrors
     */
    public int getNumberComponentErrors() {
        return numberComponentErrors;
    }


    /**
     * Sets the numberComponentErrors value for this DeployResult.
     * 
     * @param numberComponentErrors
     */
    public void setNumberComponentErrors(int numberComponentErrors) {
        this.numberComponentErrors = numberComponentErrors;
    }


    /**
     * Gets the numberComponentsDeployed value for this DeployResult.
     * 
     * @return numberComponentsDeployed
     */
    public int getNumberComponentsDeployed() {
        return numberComponentsDeployed;
    }


    /**
     * Sets the numberComponentsDeployed value for this DeployResult.
     * 
     * @param numberComponentsDeployed
     */
    public void setNumberComponentsDeployed(int numberComponentsDeployed) {
        this.numberComponentsDeployed = numberComponentsDeployed;
    }


    /**
     * Gets the numberComponentsTotal value for this DeployResult.
     * 
     * @return numberComponentsTotal
     */
    public int getNumberComponentsTotal() {
        return numberComponentsTotal;
    }


    /**
     * Sets the numberComponentsTotal value for this DeployResult.
     * 
     * @param numberComponentsTotal
     */
    public void setNumberComponentsTotal(int numberComponentsTotal) {
        this.numberComponentsTotal = numberComponentsTotal;
    }


    /**
     * Gets the numberTestErrors value for this DeployResult.
     * 
     * @return numberTestErrors
     */
    public int getNumberTestErrors() {
        return numberTestErrors;
    }


    /**
     * Sets the numberTestErrors value for this DeployResult.
     * 
     * @param numberTestErrors
     */
    public void setNumberTestErrors(int numberTestErrors) {
        this.numberTestErrors = numberTestErrors;
    }


    /**
     * Gets the numberTestsCompleted value for this DeployResult.
     * 
     * @return numberTestsCompleted
     */
    public int getNumberTestsCompleted() {
        return numberTestsCompleted;
    }


    /**
     * Sets the numberTestsCompleted value for this DeployResult.
     * 
     * @param numberTestsCompleted
     */
    public void setNumberTestsCompleted(int numberTestsCompleted) {
        this.numberTestsCompleted = numberTestsCompleted;
    }


    /**
     * Gets the numberTestsTotal value for this DeployResult.
     * 
     * @return numberTestsTotal
     */
    public int getNumberTestsTotal() {
        return numberTestsTotal;
    }


    /**
     * Sets the numberTestsTotal value for this DeployResult.
     * 
     * @param numberTestsTotal
     */
    public void setNumberTestsTotal(int numberTestsTotal) {
        this.numberTestsTotal = numberTestsTotal;
    }


    /**
     * Gets the rollbackOnError value for this DeployResult.
     * 
     * @return rollbackOnError
     */
    public boolean isRollbackOnError() {
        return rollbackOnError;
    }


    /**
     * Sets the rollbackOnError value for this DeployResult.
     * 
     * @param rollbackOnError
     */
    public void setRollbackOnError(boolean rollbackOnError) {
        this.rollbackOnError = rollbackOnError;
    }


    /**
     * Gets the runTestsEnabled value for this DeployResult.
     * 
     * @return runTestsEnabled
     */
    public boolean isRunTestsEnabled() {
        return runTestsEnabled;
    }


    /**
     * Sets the runTestsEnabled value for this DeployResult.
     * 
     * @param runTestsEnabled
     */
    public void setRunTestsEnabled(boolean runTestsEnabled) {
        this.runTestsEnabled = runTestsEnabled;
    }


    /**
     * Gets the startDate value for this DeployResult.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DeployResult.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the stateDetail value for this DeployResult.
     * 
     * @return stateDetail
     */
    public java.lang.String getStateDetail() {
        return stateDetail;
    }


    /**
     * Sets the stateDetail value for this DeployResult.
     * 
     * @param stateDetail
     */
    public void setStateDetail(java.lang.String stateDetail) {
        this.stateDetail = stateDetail;
    }


    /**
     * Gets the status value for this DeployResult.
     * 
     * @return status
     */
    public com.sforce.soap._2006._04.metadata.DeployStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DeployResult.
     * 
     * @param status
     */
    public void setStatus(com.sforce.soap._2006._04.metadata.DeployStatus status) {
        this.status = status;
    }


    /**
     * Gets the success value for this DeployResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this DeployResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeployResult)) return false;
        DeployResult other = (DeployResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.canceledBy==null && other.getCanceledBy()==null) || 
             (this.canceledBy!=null &&
              this.canceledBy.equals(other.getCanceledBy()))) &&
            ((this.canceledByName==null && other.getCanceledByName()==null) || 
             (this.canceledByName!=null &&
              this.canceledByName.equals(other.getCanceledByName()))) &&
            this.checkOnly == other.isCheckOnly() &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdByName==null && other.getCreatedByName()==null) || 
             (this.createdByName!=null &&
              this.createdByName.equals(other.getCreatedByName()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            this.done == other.isDone() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.errorStatusCode==null && other.getErrorStatusCode()==null) || 
             (this.errorStatusCode!=null &&
              this.errorStatusCode.equals(other.getErrorStatusCode()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.ignoreWarnings == other.isIgnoreWarnings() &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            this.numberComponentErrors == other.getNumberComponentErrors() &&
            this.numberComponentsDeployed == other.getNumberComponentsDeployed() &&
            this.numberComponentsTotal == other.getNumberComponentsTotal() &&
            this.numberTestErrors == other.getNumberTestErrors() &&
            this.numberTestsCompleted == other.getNumberTestsCompleted() &&
            this.numberTestsTotal == other.getNumberTestsTotal() &&
            this.rollbackOnError == other.isRollbackOnError() &&
            this.runTestsEnabled == other.isRunTestsEnabled() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.stateDetail==null && other.getStateDetail()==null) || 
             (this.stateDetail!=null &&
              this.stateDetail.equals(other.getStateDetail()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getCanceledBy() != null) {
            _hashCode += getCanceledBy().hashCode();
        }
        if (getCanceledByName() != null) {
            _hashCode += getCanceledByName().hashCode();
        }
        _hashCode += (isCheckOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedByName() != null) {
            _hashCode += getCreatedByName().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        _hashCode += (isDone() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getErrorStatusCode() != null) {
            _hashCode += getErrorStatusCode().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isIgnoreWarnings() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        _hashCode += getNumberComponentErrors();
        _hashCode += getNumberComponentsDeployed();
        _hashCode += getNumberComponentsTotal();
        _hashCode += getNumberTestErrors();
        _hashCode += getNumberTestsCompleted();
        _hashCode += getNumberTestsTotal();
        _hashCode += (isRollbackOnError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRunTestsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStateDetail() != null) {
            _hashCode += getStateDetail().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeployResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceledBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "canceledBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceledByName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "canceledByName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "checkOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "createdByName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("done");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "done"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "errorStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreWarnings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ignoreWarnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberComponentErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberComponentErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberComponentsDeployed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberComponentsDeployed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberComponentsTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberComponentsTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberTestErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberTestErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberTestsCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberTestsCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberTestsTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberTestsTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollbackOnError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rollbackOnError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runTestsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "runTestsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "stateDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployStatus"));
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
