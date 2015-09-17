/**
 * ListMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ListMetadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ListMetadataQuery[] queries;

    private double asOfVersion;

    public ListMetadata() {
    }

    public ListMetadata(
           com.sforce.soap._2006._04.metadata.ListMetadataQuery[] queries,
           double asOfVersion) {
           this.queries = queries;
           this.asOfVersion = asOfVersion;
    }


    /**
     * Gets the queries value for this ListMetadata.
     * 
     * @return queries
     */
    public com.sforce.soap._2006._04.metadata.ListMetadataQuery[] getQueries() {
        return queries;
    }


    /**
     * Sets the queries value for this ListMetadata.
     * 
     * @param queries
     */
    public void setQueries(com.sforce.soap._2006._04.metadata.ListMetadataQuery[] queries) {
        this.queries = queries;
    }

    public com.sforce.soap._2006._04.metadata.ListMetadataQuery getQueries(int i) {
        return this.queries[i];
    }

    public void setQueries(int i, com.sforce.soap._2006._04.metadata.ListMetadataQuery _value) {
        this.queries[i] = _value;
    }


    /**
     * Gets the asOfVersion value for this ListMetadata.
     * 
     * @return asOfVersion
     */
    public double getAsOfVersion() {
        return asOfVersion;
    }


    /**
     * Sets the asOfVersion value for this ListMetadata.
     * 
     * @param asOfVersion
     */
    public void setAsOfVersion(double asOfVersion) {
        this.asOfVersion = asOfVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListMetadata)) return false;
        ListMetadata other = (ListMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queries==null && other.getQueries()==null) || 
             (this.queries!=null &&
              java.util.Arrays.equals(this.queries, other.getQueries()))) &&
            this.asOfVersion == other.getAsOfVersion();
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
        if (getQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getAsOfVersion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", ">listMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "queries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListMetadataQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asOfVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "asOfVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
