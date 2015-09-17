/**
 * FlowRecordLookup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowRecordLookup  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private java.lang.Boolean assignNullValuesIfNoRecordsFound;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private com.sforce.soap._2006._04.metadata.FlowConnector faultConnector;

    private com.sforce.soap._2006._04.metadata.FlowRecordFilter[] filters;

    private java.lang.String object;

    private com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment[] outputAssignments;

    private java.lang.String outputReference;

    private java.lang.String[] queriedFields;

    private java.lang.String sortField;

    private com.sforce.soap._2006._04.metadata.SortOrder sortOrder;

    public FlowRecordLookup() {
    }

    public FlowRecordLookup(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           java.lang.Boolean assignNullValuesIfNoRecordsFound,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           com.sforce.soap._2006._04.metadata.FlowConnector faultConnector,
           com.sforce.soap._2006._04.metadata.FlowRecordFilter[] filters,
           java.lang.String object,
           com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment[] outputAssignments,
           java.lang.String outputReference,
           java.lang.String[] queriedFields,
           java.lang.String sortField,
           com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.assignNullValuesIfNoRecordsFound = assignNullValuesIfNoRecordsFound;
        this.connector = connector;
        this.faultConnector = faultConnector;
        this.filters = filters;
        this.object = object;
        this.outputAssignments = outputAssignments;
        this.outputReference = outputReference;
        this.queriedFields = queriedFields;
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the assignNullValuesIfNoRecordsFound value for this FlowRecordLookup.
     * 
     * @return assignNullValuesIfNoRecordsFound
     */
    public java.lang.Boolean getAssignNullValuesIfNoRecordsFound() {
        return assignNullValuesIfNoRecordsFound;
    }


    /**
     * Sets the assignNullValuesIfNoRecordsFound value for this FlowRecordLookup.
     * 
     * @param assignNullValuesIfNoRecordsFound
     */
    public void setAssignNullValuesIfNoRecordsFound(java.lang.Boolean assignNullValuesIfNoRecordsFound) {
        this.assignNullValuesIfNoRecordsFound = assignNullValuesIfNoRecordsFound;
    }


    /**
     * Gets the connector value for this FlowRecordLookup.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowRecordLookup.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the faultConnector value for this FlowRecordLookup.
     * 
     * @return faultConnector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getFaultConnector() {
        return faultConnector;
    }


    /**
     * Sets the faultConnector value for this FlowRecordLookup.
     * 
     * @param faultConnector
     */
    public void setFaultConnector(com.sforce.soap._2006._04.metadata.FlowConnector faultConnector) {
        this.faultConnector = faultConnector;
    }


    /**
     * Gets the filters value for this FlowRecordLookup.
     * 
     * @return filters
     */
    public com.sforce.soap._2006._04.metadata.FlowRecordFilter[] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this FlowRecordLookup.
     * 
     * @param filters
     */
    public void setFilters(com.sforce.soap._2006._04.metadata.FlowRecordFilter[] filters) {
        this.filters = filters;
    }

    public com.sforce.soap._2006._04.metadata.FlowRecordFilter getFilters(int i) {
        return this.filters[i];
    }

    public void setFilters(int i, com.sforce.soap._2006._04.metadata.FlowRecordFilter _value) {
        this.filters[i] = _value;
    }


    /**
     * Gets the object value for this FlowRecordLookup.
     * 
     * @return object
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this FlowRecordLookup.
     * 
     * @param object
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }


    /**
     * Gets the outputAssignments value for this FlowRecordLookup.
     * 
     * @return outputAssignments
     */
    public com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment[] getOutputAssignments() {
        return outputAssignments;
    }


    /**
     * Sets the outputAssignments value for this FlowRecordLookup.
     * 
     * @param outputAssignments
     */
    public void setOutputAssignments(com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment[] outputAssignments) {
        this.outputAssignments = outputAssignments;
    }

    public com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment getOutputAssignments(int i) {
        return this.outputAssignments[i];
    }

    public void setOutputAssignments(int i, com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment _value) {
        this.outputAssignments[i] = _value;
    }


    /**
     * Gets the outputReference value for this FlowRecordLookup.
     * 
     * @return outputReference
     */
    public java.lang.String getOutputReference() {
        return outputReference;
    }


    /**
     * Sets the outputReference value for this FlowRecordLookup.
     * 
     * @param outputReference
     */
    public void setOutputReference(java.lang.String outputReference) {
        this.outputReference = outputReference;
    }


    /**
     * Gets the queriedFields value for this FlowRecordLookup.
     * 
     * @return queriedFields
     */
    public java.lang.String[] getQueriedFields() {
        return queriedFields;
    }


    /**
     * Sets the queriedFields value for this FlowRecordLookup.
     * 
     * @param queriedFields
     */
    public void setQueriedFields(java.lang.String[] queriedFields) {
        this.queriedFields = queriedFields;
    }

    public java.lang.String getQueriedFields(int i) {
        return this.queriedFields[i];
    }

    public void setQueriedFields(int i, java.lang.String _value) {
        this.queriedFields[i] = _value;
    }


    /**
     * Gets the sortField value for this FlowRecordLookup.
     * 
     * @return sortField
     */
    public java.lang.String getSortField() {
        return sortField;
    }


    /**
     * Sets the sortField value for this FlowRecordLookup.
     * 
     * @param sortField
     */
    public void setSortField(java.lang.String sortField) {
        this.sortField = sortField;
    }


    /**
     * Gets the sortOrder value for this FlowRecordLookup.
     * 
     * @return sortOrder
     */
    public com.sforce.soap._2006._04.metadata.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this FlowRecordLookup.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowRecordLookup)) return false;
        FlowRecordLookup other = (FlowRecordLookup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignNullValuesIfNoRecordsFound==null && other.getAssignNullValuesIfNoRecordsFound()==null) || 
             (this.assignNullValuesIfNoRecordsFound!=null &&
              this.assignNullValuesIfNoRecordsFound.equals(other.getAssignNullValuesIfNoRecordsFound()))) &&
            ((this.connector==null && other.getConnector()==null) || 
             (this.connector!=null &&
              this.connector.equals(other.getConnector()))) &&
            ((this.faultConnector==null && other.getFaultConnector()==null) || 
             (this.faultConnector!=null &&
              this.faultConnector.equals(other.getFaultConnector()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters()))) &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            ((this.outputAssignments==null && other.getOutputAssignments()==null) || 
             (this.outputAssignments!=null &&
              java.util.Arrays.equals(this.outputAssignments, other.getOutputAssignments()))) &&
            ((this.outputReference==null && other.getOutputReference()==null) || 
             (this.outputReference!=null &&
              this.outputReference.equals(other.getOutputReference()))) &&
            ((this.queriedFields==null && other.getQueriedFields()==null) || 
             (this.queriedFields!=null &&
              java.util.Arrays.equals(this.queriedFields, other.getQueriedFields()))) &&
            ((this.sortField==null && other.getSortField()==null) || 
             (this.sortField!=null &&
              this.sortField.equals(other.getSortField()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder())));
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
        if (getAssignNullValuesIfNoRecordsFound() != null) {
            _hashCode += getAssignNullValuesIfNoRecordsFound().hashCode();
        }
        if (getConnector() != null) {
            _hashCode += getConnector().hashCode();
        }
        if (getFaultConnector() != null) {
            _hashCode += getFaultConnector().hashCode();
        }
        if (getFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        if (getOutputAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputReference() != null) {
            _hashCode += getOutputReference().hashCode();
        }
        if (getQueriedFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueriedFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueriedFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSortField() != null) {
            _hashCode += getSortField().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowRecordLookup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordLookup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignNullValuesIfNoRecordsFound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignNullValuesIfNoRecordsFound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "faultConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowOutputFieldAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "outputReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queriedFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "queriedFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SortOrder"));
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
