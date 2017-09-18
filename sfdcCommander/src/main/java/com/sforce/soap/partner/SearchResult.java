/**
 * SearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SearchResult  implements java.io.Serializable {
    private java.lang.String queryId;

    private com.sforce.soap.partner.SearchRecord[] searchRecords;

    private com.sforce.soap.partner.SearchResultsMetadata searchResultsMetadata;

    public SearchResult() {
    }

    public SearchResult(
           java.lang.String queryId,
           com.sforce.soap.partner.SearchRecord[] searchRecords,
           com.sforce.soap.partner.SearchResultsMetadata searchResultsMetadata) {
           this.queryId = queryId;
           this.searchRecords = searchRecords;
           this.searchResultsMetadata = searchResultsMetadata;
    }


    /**
     * Gets the queryId value for this SearchResult.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this SearchResult.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the searchRecords value for this SearchResult.
     * 
     * @return searchRecords
     */
    public com.sforce.soap.partner.SearchRecord[] getSearchRecords() {
        return searchRecords;
    }


    /**
     * Sets the searchRecords value for this SearchResult.
     * 
     * @param searchRecords
     */
    public void setSearchRecords(com.sforce.soap.partner.SearchRecord[] searchRecords) {
        this.searchRecords = searchRecords;
    }

    public com.sforce.soap.partner.SearchRecord getSearchRecords(int i) {
        return this.searchRecords[i];
    }

    public void setSearchRecords(int i, com.sforce.soap.partner.SearchRecord _value) {
        this.searchRecords[i] = _value;
    }


    /**
     * Gets the searchResultsMetadata value for this SearchResult.
     * 
     * @return searchResultsMetadata
     */
    public com.sforce.soap.partner.SearchResultsMetadata getSearchResultsMetadata() {
        return searchResultsMetadata;
    }


    /**
     * Sets the searchResultsMetadata value for this SearchResult.
     * 
     * @param searchResultsMetadata
     */
    public void setSearchResultsMetadata(com.sforce.soap.partner.SearchResultsMetadata searchResultsMetadata) {
        this.searchResultsMetadata = searchResultsMetadata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchResult)) return false;
        SearchResult other = (SearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.searchRecords==null && other.getSearchRecords()==null) || 
             (this.searchRecords!=null &&
              java.util.Arrays.equals(this.searchRecords, other.getSearchRecords()))) &&
            ((this.searchResultsMetadata==null && other.getSearchResultsMetadata()==null) || 
             (this.searchResultsMetadata!=null &&
              this.searchResultsMetadata.equals(other.getSearchResultsMetadata())));
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
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
        }
        if (getSearchRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchResultsMetadata() != null) {
            _hashCode += getSearchResultsMetadata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "searchRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResultsMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "searchResultsMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchResultsMetadata"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
