/**
 * ListViewColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class ListViewColumn  implements java.io.Serializable {
    private java.lang.String ascendingLabel;

    private java.lang.String descendingLabel;

    private java.lang.String fieldNameOrPath;

    private boolean hidden;

    private java.lang.String label;

    private java.lang.String selectListItem;

    private com.sforce.soap.partner.OrderByDirection sortDirection;

    private java.lang.Integer sortIndex;

    private boolean sortable;

    private com.sforce.soap.partner.FieldType type;

    public ListViewColumn() {
    }

    public ListViewColumn(
           java.lang.String ascendingLabel,
           java.lang.String descendingLabel,
           java.lang.String fieldNameOrPath,
           boolean hidden,
           java.lang.String label,
           java.lang.String selectListItem,
           com.sforce.soap.partner.OrderByDirection sortDirection,
           java.lang.Integer sortIndex,
           boolean sortable,
           com.sforce.soap.partner.FieldType type) {
           this.ascendingLabel = ascendingLabel;
           this.descendingLabel = descendingLabel;
           this.fieldNameOrPath = fieldNameOrPath;
           this.hidden = hidden;
           this.label = label;
           this.selectListItem = selectListItem;
           this.sortDirection = sortDirection;
           this.sortIndex = sortIndex;
           this.sortable = sortable;
           this.type = type;
    }


    /**
     * Gets the ascendingLabel value for this ListViewColumn.
     * 
     * @return ascendingLabel
     */
    public java.lang.String getAscendingLabel() {
        return ascendingLabel;
    }


    /**
     * Sets the ascendingLabel value for this ListViewColumn.
     * 
     * @param ascendingLabel
     */
    public void setAscendingLabel(java.lang.String ascendingLabel) {
        this.ascendingLabel = ascendingLabel;
    }


    /**
     * Gets the descendingLabel value for this ListViewColumn.
     * 
     * @return descendingLabel
     */
    public java.lang.String getDescendingLabel() {
        return descendingLabel;
    }


    /**
     * Sets the descendingLabel value for this ListViewColumn.
     * 
     * @param descendingLabel
     */
    public void setDescendingLabel(java.lang.String descendingLabel) {
        this.descendingLabel = descendingLabel;
    }


    /**
     * Gets the fieldNameOrPath value for this ListViewColumn.
     * 
     * @return fieldNameOrPath
     */
    public java.lang.String getFieldNameOrPath() {
        return fieldNameOrPath;
    }


    /**
     * Sets the fieldNameOrPath value for this ListViewColumn.
     * 
     * @param fieldNameOrPath
     */
    public void setFieldNameOrPath(java.lang.String fieldNameOrPath) {
        this.fieldNameOrPath = fieldNameOrPath;
    }


    /**
     * Gets the hidden value for this ListViewColumn.
     * 
     * @return hidden
     */
    public boolean isHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this ListViewColumn.
     * 
     * @param hidden
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the label value for this ListViewColumn.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ListViewColumn.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the selectListItem value for this ListViewColumn.
     * 
     * @return selectListItem
     */
    public java.lang.String getSelectListItem() {
        return selectListItem;
    }


    /**
     * Sets the selectListItem value for this ListViewColumn.
     * 
     * @param selectListItem
     */
    public void setSelectListItem(java.lang.String selectListItem) {
        this.selectListItem = selectListItem;
    }


    /**
     * Gets the sortDirection value for this ListViewColumn.
     * 
     * @return sortDirection
     */
    public com.sforce.soap.partner.OrderByDirection getSortDirection() {
        return sortDirection;
    }


    /**
     * Sets the sortDirection value for this ListViewColumn.
     * 
     * @param sortDirection
     */
    public void setSortDirection(com.sforce.soap.partner.OrderByDirection sortDirection) {
        this.sortDirection = sortDirection;
    }


    /**
     * Gets the sortIndex value for this ListViewColumn.
     * 
     * @return sortIndex
     */
    public java.lang.Integer getSortIndex() {
        return sortIndex;
    }


    /**
     * Sets the sortIndex value for this ListViewColumn.
     * 
     * @param sortIndex
     */
    public void setSortIndex(java.lang.Integer sortIndex) {
        this.sortIndex = sortIndex;
    }


    /**
     * Gets the sortable value for this ListViewColumn.
     * 
     * @return sortable
     */
    public boolean isSortable() {
        return sortable;
    }


    /**
     * Sets the sortable value for this ListViewColumn.
     * 
     * @param sortable
     */
    public void setSortable(boolean sortable) {
        this.sortable = sortable;
    }


    /**
     * Gets the type value for this ListViewColumn.
     * 
     * @return type
     */
    public com.sforce.soap.partner.FieldType getType() {
        return type;
    }


    /**
     * Sets the type value for this ListViewColumn.
     * 
     * @param type
     */
    public void setType(com.sforce.soap.partner.FieldType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListViewColumn)) return false;
        ListViewColumn other = (ListViewColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ascendingLabel==null && other.getAscendingLabel()==null) || 
             (this.ascendingLabel!=null &&
              this.ascendingLabel.equals(other.getAscendingLabel()))) &&
            ((this.descendingLabel==null && other.getDescendingLabel()==null) || 
             (this.descendingLabel!=null &&
              this.descendingLabel.equals(other.getDescendingLabel()))) &&
            ((this.fieldNameOrPath==null && other.getFieldNameOrPath()==null) || 
             (this.fieldNameOrPath!=null &&
              this.fieldNameOrPath.equals(other.getFieldNameOrPath()))) &&
            this.hidden == other.isHidden() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.selectListItem==null && other.getSelectListItem()==null) || 
             (this.selectListItem!=null &&
              this.selectListItem.equals(other.getSelectListItem()))) &&
            ((this.sortDirection==null && other.getSortDirection()==null) || 
             (this.sortDirection!=null &&
              this.sortDirection.equals(other.getSortDirection()))) &&
            ((this.sortIndex==null && other.getSortIndex()==null) || 
             (this.sortIndex!=null &&
              this.sortIndex.equals(other.getSortIndex()))) &&
            this.sortable == other.isSortable() &&
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
        if (getAscendingLabel() != null) {
            _hashCode += getAscendingLabel().hashCode();
        }
        if (getDescendingLabel() != null) {
            _hashCode += getDescendingLabel().hashCode();
        }
        if (getFieldNameOrPath() != null) {
            _hashCode += getFieldNameOrPath().hashCode();
        }
        _hashCode += (isHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getSelectListItem() != null) {
            _hashCode += getSelectListItem().hashCode();
        }
        if (getSortDirection() != null) {
            _hashCode += getSortDirection().hashCode();
        }
        if (getSortIndex() != null) {
            _hashCode += getSortIndex().hashCode();
        }
        _hashCode += (isSortable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListViewColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ascendingLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ascendingLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descendingLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "descendingLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNameOrPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldNameOrPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectListItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "selectListItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sortDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "orderByDirection"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sortIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sortable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldType"));
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
