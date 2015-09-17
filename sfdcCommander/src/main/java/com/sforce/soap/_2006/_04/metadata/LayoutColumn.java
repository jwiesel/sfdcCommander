/**
 * LayoutColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LayoutColumn  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.LayoutItem[] layoutItems;

    private java.lang.String reserved;

    public LayoutColumn() {
    }

    public LayoutColumn(
           com.sforce.soap._2006._04.metadata.LayoutItem[] layoutItems,
           java.lang.String reserved) {
           this.layoutItems = layoutItems;
           this.reserved = reserved;
    }


    /**
     * Gets the layoutItems value for this LayoutColumn.
     * 
     * @return layoutItems
     */
    public com.sforce.soap._2006._04.metadata.LayoutItem[] getLayoutItems() {
        return layoutItems;
    }


    /**
     * Sets the layoutItems value for this LayoutColumn.
     * 
     * @param layoutItems
     */
    public void setLayoutItems(com.sforce.soap._2006._04.metadata.LayoutItem[] layoutItems) {
        this.layoutItems = layoutItems;
    }

    public com.sforce.soap._2006._04.metadata.LayoutItem getLayoutItems(int i) {
        return this.layoutItems[i];
    }

    public void setLayoutItems(int i, com.sforce.soap._2006._04.metadata.LayoutItem _value) {
        this.layoutItems[i] = _value;
    }


    /**
     * Gets the reserved value for this LayoutColumn.
     * 
     * @return reserved
     */
    public java.lang.String getReserved() {
        return reserved;
    }


    /**
     * Sets the reserved value for this LayoutColumn.
     * 
     * @param reserved
     */
    public void setReserved(java.lang.String reserved) {
        this.reserved = reserved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LayoutColumn)) return false;
        LayoutColumn other = (LayoutColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.layoutItems==null && other.getLayoutItems()==null) || 
             (this.layoutItems!=null &&
              java.util.Arrays.equals(this.layoutItems, other.getLayoutItems()))) &&
            ((this.reserved==null && other.getReserved()==null) || 
             (this.reserved!=null &&
              this.reserved.equals(other.getReserved())));
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
        if (getLayoutItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayoutItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLayoutItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReserved() != null) {
            _hashCode += getReserved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LayoutColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layoutItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reserved"));
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
