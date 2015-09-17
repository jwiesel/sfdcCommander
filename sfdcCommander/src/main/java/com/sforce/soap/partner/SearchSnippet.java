/**
 * SearchSnippet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SearchSnippet  implements java.io.Serializable {
    private java.lang.String text;

    private com.sforce.soap.partner.NameValuePair[] wholeFields;

    public SearchSnippet() {
    }

    public SearchSnippet(
           java.lang.String text,
           com.sforce.soap.partner.NameValuePair[] wholeFields) {
           this.text = text;
           this.wholeFields = wholeFields;
    }


    /**
     * Gets the text value for this SearchSnippet.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this SearchSnippet.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the wholeFields value for this SearchSnippet.
     * 
     * @return wholeFields
     */
    public com.sforce.soap.partner.NameValuePair[] getWholeFields() {
        return wholeFields;
    }


    /**
     * Sets the wholeFields value for this SearchSnippet.
     * 
     * @param wholeFields
     */
    public void setWholeFields(com.sforce.soap.partner.NameValuePair[] wholeFields) {
        this.wholeFields = wholeFields;
    }

    public com.sforce.soap.partner.NameValuePair getWholeFields(int i) {
        return this.wholeFields[i];
    }

    public void setWholeFields(int i, com.sforce.soap.partner.NameValuePair _value) {
        this.wholeFields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchSnippet)) return false;
        SearchSnippet other = (SearchSnippet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.wholeFields==null && other.getWholeFields()==null) || 
             (this.wholeFields!=null &&
              java.util.Arrays.equals(this.wholeFields, other.getWholeFields())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getWholeFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWholeFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWholeFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchSnippet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchSnippet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wholeFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "wholeFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NameValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
