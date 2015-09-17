/**
 * AnalyticSnapshot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AnalyticSnapshot  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String groupColumn;

    private com.sforce.soap._2006._04.metadata.AnalyticSnapshotMapping[] mappings;

    private java.lang.String name;

    private java.lang.String runningUser;

    private java.lang.String sourceReport;

    private java.lang.String targetObject;

    public AnalyticSnapshot() {
    }

    public AnalyticSnapshot(
           java.lang.String fullName,
           java.lang.String description,
           java.lang.String groupColumn,
           com.sforce.soap._2006._04.metadata.AnalyticSnapshotMapping[] mappings,
           java.lang.String name,
           java.lang.String runningUser,
           java.lang.String sourceReport,
           java.lang.String targetObject) {
        super(
            fullName);
        this.description = description;
        this.groupColumn = groupColumn;
        this.mappings = mappings;
        this.name = name;
        this.runningUser = runningUser;
        this.sourceReport = sourceReport;
        this.targetObject = targetObject;
    }


    /**
     * Gets the description value for this AnalyticSnapshot.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AnalyticSnapshot.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the groupColumn value for this AnalyticSnapshot.
     * 
     * @return groupColumn
     */
    public java.lang.String getGroupColumn() {
        return groupColumn;
    }


    /**
     * Sets the groupColumn value for this AnalyticSnapshot.
     * 
     * @param groupColumn
     */
    public void setGroupColumn(java.lang.String groupColumn) {
        this.groupColumn = groupColumn;
    }


    /**
     * Gets the mappings value for this AnalyticSnapshot.
     * 
     * @return mappings
     */
    public com.sforce.soap._2006._04.metadata.AnalyticSnapshotMapping[] getMappings() {
        return mappings;
    }


    /**
     * Sets the mappings value for this AnalyticSnapshot.
     * 
     * @param mappings
     */
    public void setMappings(com.sforce.soap._2006._04.metadata.AnalyticSnapshotMapping[] mappings) {
        this.mappings = mappings;
    }

    public com.sforce.soap._2006._04.metadata.AnalyticSnapshotMapping getMappings(int i) {
        return this.mappings[i];
    }

    public void setMappings(int i, com.sforce.soap._2006._04.metadata.AnalyticSnapshotMapping _value) {
        this.mappings[i] = _value;
    }


    /**
     * Gets the name value for this AnalyticSnapshot.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AnalyticSnapshot.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the runningUser value for this AnalyticSnapshot.
     * 
     * @return runningUser
     */
    public java.lang.String getRunningUser() {
        return runningUser;
    }


    /**
     * Sets the runningUser value for this AnalyticSnapshot.
     * 
     * @param runningUser
     */
    public void setRunningUser(java.lang.String runningUser) {
        this.runningUser = runningUser;
    }


    /**
     * Gets the sourceReport value for this AnalyticSnapshot.
     * 
     * @return sourceReport
     */
    public java.lang.String getSourceReport() {
        return sourceReport;
    }


    /**
     * Sets the sourceReport value for this AnalyticSnapshot.
     * 
     * @param sourceReport
     */
    public void setSourceReport(java.lang.String sourceReport) {
        this.sourceReport = sourceReport;
    }


    /**
     * Gets the targetObject value for this AnalyticSnapshot.
     * 
     * @return targetObject
     */
    public java.lang.String getTargetObject() {
        return targetObject;
    }


    /**
     * Sets the targetObject value for this AnalyticSnapshot.
     * 
     * @param targetObject
     */
    public void setTargetObject(java.lang.String targetObject) {
        this.targetObject = targetObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnalyticSnapshot)) return false;
        AnalyticSnapshot other = (AnalyticSnapshot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.groupColumn==null && other.getGroupColumn()==null) || 
             (this.groupColumn!=null &&
              this.groupColumn.equals(other.getGroupColumn()))) &&
            ((this.mappings==null && other.getMappings()==null) || 
             (this.mappings!=null &&
              java.util.Arrays.equals(this.mappings, other.getMappings()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.runningUser==null && other.getRunningUser()==null) || 
             (this.runningUser!=null &&
              this.runningUser.equals(other.getRunningUser()))) &&
            ((this.sourceReport==null && other.getSourceReport()==null) || 
             (this.sourceReport!=null &&
              this.sourceReport.equals(other.getSourceReport()))) &&
            ((this.targetObject==null && other.getTargetObject()==null) || 
             (this.targetObject!=null &&
              this.targetObject.equals(other.getTargetObject())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getGroupColumn() != null) {
            _hashCode += getGroupColumn().hashCode();
        }
        if (getMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRunningUser() != null) {
            _hashCode += getRunningUser().hashCode();
        }
        if (getSourceReport() != null) {
            _hashCode += getSourceReport().hashCode();
        }
        if (getTargetObject() != null) {
            _hashCode += getTargetObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnalyticSnapshot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AnalyticSnapshot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "groupColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AnalyticSnapshotMapping"));
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
        elemField.setFieldName("runningUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "runningUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceReport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sourceReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetObject"));
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
