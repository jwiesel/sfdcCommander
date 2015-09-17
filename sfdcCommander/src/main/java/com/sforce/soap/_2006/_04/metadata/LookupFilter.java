/**
 * LookupFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LookupFilter  implements java.io.Serializable {
    private boolean active;

    private java.lang.String booleanFilter;

    private java.lang.String description;

    private java.lang.String errorMessage;

    private com.sforce.soap._2006._04.metadata.FilterItem[] filterItems;

    private java.lang.String infoMessage;

    private boolean isOptional;

    public LookupFilter() {
    }

    public LookupFilter(
           boolean active,
           java.lang.String booleanFilter,
           java.lang.String description,
           java.lang.String errorMessage,
           com.sforce.soap._2006._04.metadata.FilterItem[] filterItems,
           java.lang.String infoMessage,
           boolean isOptional) {
           this.active = active;
           this.booleanFilter = booleanFilter;
           this.description = description;
           this.errorMessage = errorMessage;
           this.filterItems = filterItems;
           this.infoMessage = infoMessage;
           this.isOptional = isOptional;
    }


    /**
     * Gets the active value for this LookupFilter.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this LookupFilter.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the booleanFilter value for this LookupFilter.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this LookupFilter.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the description value for this LookupFilter.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LookupFilter.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the errorMessage value for this LookupFilter.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this LookupFilter.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the filterItems value for this LookupFilter.
     * 
     * @return filterItems
     */
    public com.sforce.soap._2006._04.metadata.FilterItem[] getFilterItems() {
        return filterItems;
    }


    /**
     * Sets the filterItems value for this LookupFilter.
     * 
     * @param filterItems
     */
    public void setFilterItems(com.sforce.soap._2006._04.metadata.FilterItem[] filterItems) {
        this.filterItems = filterItems;
    }

    public com.sforce.soap._2006._04.metadata.FilterItem getFilterItems(int i) {
        return this.filterItems[i];
    }

    public void setFilterItems(int i, com.sforce.soap._2006._04.metadata.FilterItem _value) {
        this.filterItems[i] = _value;
    }


    /**
     * Gets the infoMessage value for this LookupFilter.
     * 
     * @return infoMessage
     */
    public java.lang.String getInfoMessage() {
        return infoMessage;
    }


    /**
     * Sets the infoMessage value for this LookupFilter.
     * 
     * @param infoMessage
     */
    public void setInfoMessage(java.lang.String infoMessage) {
        this.infoMessage = infoMessage;
    }


    /**
     * Gets the isOptional value for this LookupFilter.
     * 
     * @return isOptional
     */
    public boolean isIsOptional() {
        return isOptional;
    }


    /**
     * Sets the isOptional value for this LookupFilter.
     * 
     * @param isOptional
     */
    public void setIsOptional(boolean isOptional) {
        this.isOptional = isOptional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupFilter)) return false;
        LookupFilter other = (LookupFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.filterItems==null && other.getFilterItems()==null) || 
             (this.filterItems!=null &&
              java.util.Arrays.equals(this.filterItems, other.getFilterItems()))) &&
            ((this.infoMessage==null && other.getInfoMessage()==null) || 
             (this.infoMessage!=null &&
              this.infoMessage.equals(other.getInfoMessage()))) &&
            this.isOptional == other.isIsOptional();
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getFilterItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInfoMessage() != null) {
            _hashCode += getInfoMessage().hashCode();
        }
        _hashCode += (isIsOptional() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LookupFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("filterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "filterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "infoMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOptional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isOptional"));
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
