/**
 * RelatedListItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class RelatedListItem  implements java.io.Serializable {
    private java.lang.String[] customButtons;

    private java.lang.String[] excludeButtons;

    private java.lang.String[] fields;

    private java.lang.String relatedList;

    private java.lang.String sortField;

    private com.sforce.soap._2006._04.metadata.SortOrder sortOrder;

    public RelatedListItem() {
    }

    public RelatedListItem(
           java.lang.String[] customButtons,
           java.lang.String[] excludeButtons,
           java.lang.String[] fields,
           java.lang.String relatedList,
           java.lang.String sortField,
           com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
           this.customButtons = customButtons;
           this.excludeButtons = excludeButtons;
           this.fields = fields;
           this.relatedList = relatedList;
           this.sortField = sortField;
           this.sortOrder = sortOrder;
    }


    /**
     * Gets the customButtons value for this RelatedListItem.
     * 
     * @return customButtons
     */
    public java.lang.String[] getCustomButtons() {
        return customButtons;
    }


    /**
     * Sets the customButtons value for this RelatedListItem.
     * 
     * @param customButtons
     */
    public void setCustomButtons(java.lang.String[] customButtons) {
        this.customButtons = customButtons;
    }

    public java.lang.String getCustomButtons(int i) {
        return this.customButtons[i];
    }

    public void setCustomButtons(int i, java.lang.String _value) {
        this.customButtons[i] = _value;
    }


    /**
     * Gets the excludeButtons value for this RelatedListItem.
     * 
     * @return excludeButtons
     */
    public java.lang.String[] getExcludeButtons() {
        return excludeButtons;
    }


    /**
     * Sets the excludeButtons value for this RelatedListItem.
     * 
     * @param excludeButtons
     */
    public void setExcludeButtons(java.lang.String[] excludeButtons) {
        this.excludeButtons = excludeButtons;
    }

    public java.lang.String getExcludeButtons(int i) {
        return this.excludeButtons[i];
    }

    public void setExcludeButtons(int i, java.lang.String _value) {
        this.excludeButtons[i] = _value;
    }


    /**
     * Gets the fields value for this RelatedListItem.
     * 
     * @return fields
     */
    public java.lang.String[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this RelatedListItem.
     * 
     * @param fields
     */
    public void setFields(java.lang.String[] fields) {
        this.fields = fields;
    }

    public java.lang.String getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, java.lang.String _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the relatedList value for this RelatedListItem.
     * 
     * @return relatedList
     */
    public java.lang.String getRelatedList() {
        return relatedList;
    }


    /**
     * Sets the relatedList value for this RelatedListItem.
     * 
     * @param relatedList
     */
    public void setRelatedList(java.lang.String relatedList) {
        this.relatedList = relatedList;
    }


    /**
     * Gets the sortField value for this RelatedListItem.
     * 
     * @return sortField
     */
    public java.lang.String getSortField() {
        return sortField;
    }


    /**
     * Sets the sortField value for this RelatedListItem.
     * 
     * @param sortField
     */
    public void setSortField(java.lang.String sortField) {
        this.sortField = sortField;
    }


    /**
     * Gets the sortOrder value for this RelatedListItem.
     * 
     * @return sortOrder
     */
    public com.sforce.soap._2006._04.metadata.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this RelatedListItem.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedListItem)) return false;
        RelatedListItem other = (RelatedListItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customButtons==null && other.getCustomButtons()==null) || 
             (this.customButtons!=null &&
              java.util.Arrays.equals(this.customButtons, other.getCustomButtons()))) &&
            ((this.excludeButtons==null && other.getExcludeButtons()==null) || 
             (this.excludeButtons!=null &&
              java.util.Arrays.equals(this.excludeButtons, other.getExcludeButtons()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.relatedList==null && other.getRelatedList()==null) || 
             (this.relatedList!=null &&
              this.relatedList.equals(other.getRelatedList()))) &&
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
        int _hashCode = 1;
        if (getCustomButtons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomButtons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomButtons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeButtons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeButtons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeButtons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedList() != null) {
            _hashCode += getRelatedList().hashCode();
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
        new org.apache.axis.description.TypeDesc(RelatedListItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RelatedListItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customButtons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customButtons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeButtons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "excludeButtons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relatedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
