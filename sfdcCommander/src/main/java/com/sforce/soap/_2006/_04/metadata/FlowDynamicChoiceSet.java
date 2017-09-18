/**
 * FlowDynamicChoiceSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowDynamicChoiceSet  extends com.sforce.soap._2006._04.metadata.FlowElement  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowDataType dataType;

    private java.lang.String displayField;

    private com.sforce.soap._2006._04.metadata.FlowRecordFilter[] filters;

    private java.lang.Integer limit;

    private java.lang.String object;

    private com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment[] outputAssignments;

    private java.lang.String picklistField;

    private java.lang.String picklistObject;

    private java.lang.String sortField;

    private com.sforce.soap._2006._04.metadata.SortOrder sortOrder;

    private java.lang.String valueField;

    public FlowDynamicChoiceSet() {
    }

    public FlowDynamicChoiceSet(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param2,
           java.lang.String description,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.FlowDataType dataType,
           java.lang.String displayField,
           com.sforce.soap._2006._04.metadata.FlowRecordFilter[] filters,
           java.lang.Integer limit,
           java.lang.String object,
           com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment[] outputAssignments,
           java.lang.String picklistField,
           java.lang.String picklistObject,
           java.lang.String sortField,
           com.sforce.soap._2006._04.metadata.SortOrder sortOrder,
           java.lang.String valueField) {
        super(
            param2,
            description,
            name);
        this.dataType = dataType;
        this.displayField = displayField;
        this.filters = filters;
        this.limit = limit;
        this.object = object;
        this.outputAssignments = outputAssignments;
        this.picklistField = picklistField;
        this.picklistObject = picklistObject;
        this.sortField = sortField;
        this.sortOrder = sortOrder;
        this.valueField = valueField;
    }


    /**
     * Gets the dataType value for this FlowDynamicChoiceSet.
     * 
     * @return dataType
     */
    public com.sforce.soap._2006._04.metadata.FlowDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this FlowDynamicChoiceSet.
     * 
     * @param dataType
     */
    public void setDataType(com.sforce.soap._2006._04.metadata.FlowDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the displayField value for this FlowDynamicChoiceSet.
     * 
     * @return displayField
     */
    public java.lang.String getDisplayField() {
        return displayField;
    }


    /**
     * Sets the displayField value for this FlowDynamicChoiceSet.
     * 
     * @param displayField
     */
    public void setDisplayField(java.lang.String displayField) {
        this.displayField = displayField;
    }


    /**
     * Gets the filters value for this FlowDynamicChoiceSet.
     * 
     * @return filters
     */
    public com.sforce.soap._2006._04.metadata.FlowRecordFilter[] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this FlowDynamicChoiceSet.
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
     * Gets the limit value for this FlowDynamicChoiceSet.
     * 
     * @return limit
     */
    public java.lang.Integer getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this FlowDynamicChoiceSet.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Integer limit) {
        this.limit = limit;
    }


    /**
     * Gets the object value for this FlowDynamicChoiceSet.
     * 
     * @return object
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this FlowDynamicChoiceSet.
     * 
     * @param object
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }


    /**
     * Gets the outputAssignments value for this FlowDynamicChoiceSet.
     * 
     * @return outputAssignments
     */
    public com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment[] getOutputAssignments() {
        return outputAssignments;
    }


    /**
     * Sets the outputAssignments value for this FlowDynamicChoiceSet.
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
     * Gets the picklistField value for this FlowDynamicChoiceSet.
     * 
     * @return picklistField
     */
    public java.lang.String getPicklistField() {
        return picklistField;
    }


    /**
     * Sets the picklistField value for this FlowDynamicChoiceSet.
     * 
     * @param picklistField
     */
    public void setPicklistField(java.lang.String picklistField) {
        this.picklistField = picklistField;
    }


    /**
     * Gets the picklistObject value for this FlowDynamicChoiceSet.
     * 
     * @return picklistObject
     */
    public java.lang.String getPicklistObject() {
        return picklistObject;
    }


    /**
     * Sets the picklistObject value for this FlowDynamicChoiceSet.
     * 
     * @param picklistObject
     */
    public void setPicklistObject(java.lang.String picklistObject) {
        this.picklistObject = picklistObject;
    }


    /**
     * Gets the sortField value for this FlowDynamicChoiceSet.
     * 
     * @return sortField
     */
    public java.lang.String getSortField() {
        return sortField;
    }


    /**
     * Sets the sortField value for this FlowDynamicChoiceSet.
     * 
     * @param sortField
     */
    public void setSortField(java.lang.String sortField) {
        this.sortField = sortField;
    }


    /**
     * Gets the sortOrder value for this FlowDynamicChoiceSet.
     * 
     * @return sortOrder
     */
    public com.sforce.soap._2006._04.metadata.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this FlowDynamicChoiceSet.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the valueField value for this FlowDynamicChoiceSet.
     * 
     * @return valueField
     */
    public java.lang.String getValueField() {
        return valueField;
    }


    /**
     * Sets the valueField value for this FlowDynamicChoiceSet.
     * 
     * @param valueField
     */
    public void setValueField(java.lang.String valueField) {
        this.valueField = valueField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowDynamicChoiceSet)) return false;
        FlowDynamicChoiceSet other = (FlowDynamicChoiceSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.displayField==null && other.getDisplayField()==null) || 
             (this.displayField!=null &&
              this.displayField.equals(other.getDisplayField()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            ((this.outputAssignments==null && other.getOutputAssignments()==null) || 
             (this.outputAssignments!=null &&
              java.util.Arrays.equals(this.outputAssignments, other.getOutputAssignments()))) &&
            ((this.picklistField==null && other.getPicklistField()==null) || 
             (this.picklistField!=null &&
              this.picklistField.equals(other.getPicklistField()))) &&
            ((this.picklistObject==null && other.getPicklistObject()==null) || 
             (this.picklistObject!=null &&
              this.picklistObject.equals(other.getPicklistObject()))) &&
            ((this.sortField==null && other.getSortField()==null) || 
             (this.sortField!=null &&
              this.sortField.equals(other.getSortField()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.valueField==null && other.getValueField()==null) || 
             (this.valueField!=null &&
              this.valueField.equals(other.getValueField())));
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
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDisplayField() != null) {
            _hashCode += getDisplayField().hashCode();
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
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
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
        if (getPicklistField() != null) {
            _hashCode += getPicklistField().hashCode();
        }
        if (getPicklistObject() != null) {
            _hashCode += getPicklistObject().hashCode();
        }
        if (getSortField() != null) {
            _hashCode += getSortField().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getValueField() != null) {
            _hashCode += getValueField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowDynamicChoiceSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDynamicChoiceSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("picklistField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklistField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklistObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "valueField"));
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
