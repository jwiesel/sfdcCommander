/**
 * ListView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ListView  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String booleanFilter;

    private java.lang.String[] columns;

    private java.lang.String division;

    private com.sforce.soap._2006._04.metadata.FilterScope filterScope;

    private com.sforce.soap._2006._04.metadata.ListViewFilter[] filters;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.Language language;

    private java.lang.String queue;

    private com.sforce.soap._2006._04.metadata.SharedTo sharedTo;

    public ListView() {
    }

    public ListView(
           java.lang.String fullName,
           java.lang.String booleanFilter,
           java.lang.String[] columns,
           java.lang.String division,
           com.sforce.soap._2006._04.metadata.FilterScope filterScope,
           com.sforce.soap._2006._04.metadata.ListViewFilter[] filters,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.Language language,
           java.lang.String queue,
           com.sforce.soap._2006._04.metadata.SharedTo sharedTo) {
        super(
            fullName);
        this.booleanFilter = booleanFilter;
        this.columns = columns;
        this.division = division;
        this.filterScope = filterScope;
        this.filters = filters;
        this.label = label;
        this.language = language;
        this.queue = queue;
        this.sharedTo = sharedTo;
    }


    /**
     * Gets the booleanFilter value for this ListView.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this ListView.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the columns value for this ListView.
     * 
     * @return columns
     */
    public java.lang.String[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this ListView.
     * 
     * @param columns
     */
    public void setColumns(java.lang.String[] columns) {
        this.columns = columns;
    }

    public java.lang.String getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, java.lang.String _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the division value for this ListView.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this ListView.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the filterScope value for this ListView.
     * 
     * @return filterScope
     */
    public com.sforce.soap._2006._04.metadata.FilterScope getFilterScope() {
        return filterScope;
    }


    /**
     * Sets the filterScope value for this ListView.
     * 
     * @param filterScope
     */
    public void setFilterScope(com.sforce.soap._2006._04.metadata.FilterScope filterScope) {
        this.filterScope = filterScope;
    }


    /**
     * Gets the filters value for this ListView.
     * 
     * @return filters
     */
    public com.sforce.soap._2006._04.metadata.ListViewFilter[] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this ListView.
     * 
     * @param filters
     */
    public void setFilters(com.sforce.soap._2006._04.metadata.ListViewFilter[] filters) {
        this.filters = filters;
    }

    public com.sforce.soap._2006._04.metadata.ListViewFilter getFilters(int i) {
        return this.filters[i];
    }

    public void setFilters(int i, com.sforce.soap._2006._04.metadata.ListViewFilter _value) {
        this.filters[i] = _value;
    }


    /**
     * Gets the label value for this ListView.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ListView.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the language value for this ListView.
     * 
     * @return language
     */
    public com.sforce.soap._2006._04.metadata.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ListView.
     * 
     * @param language
     */
    public void setLanguage(com.sforce.soap._2006._04.metadata.Language language) {
        this.language = language;
    }


    /**
     * Gets the queue value for this ListView.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this ListView.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the sharedTo value for this ListView.
     * 
     * @return sharedTo
     */
    public com.sforce.soap._2006._04.metadata.SharedTo getSharedTo() {
        return sharedTo;
    }


    /**
     * Sets the sharedTo value for this ListView.
     * 
     * @param sharedTo
     */
    public void setSharedTo(com.sforce.soap._2006._04.metadata.SharedTo sharedTo) {
        this.sharedTo = sharedTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListView)) return false;
        ListView other = (ListView) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.filterScope==null && other.getFilterScope()==null) || 
             (this.filterScope!=null &&
              this.filterScope.equals(other.getFilterScope()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.sharedTo==null && other.getSharedTo()==null) || 
             (this.sharedTo!=null &&
              this.sharedTo.equals(other.getSharedTo())));
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
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getFilterScope() != null) {
            _hashCode += getFilterScope().hashCode();
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getSharedTo() != null) {
            _hashCode += getSharedTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListView.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListView"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterScope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "filterScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterScope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListViewFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sharedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharedTo"));
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
