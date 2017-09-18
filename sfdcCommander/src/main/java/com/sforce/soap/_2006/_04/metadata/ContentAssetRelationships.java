/**
 * ContentAssetRelationships.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ContentAssetRelationships  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ContentAssetLink[] insightsApplication;

    private com.sforce.soap._2006._04.metadata.ContentAssetLink[] network;

    private com.sforce.soap._2006._04.metadata.ContentAssetLink organization;

    private com.sforce.soap._2006._04.metadata.ContentAssetLink[] workspace;

    public ContentAssetRelationships() {
    }

    public ContentAssetRelationships(
           com.sforce.soap._2006._04.metadata.ContentAssetLink[] insightsApplication,
           com.sforce.soap._2006._04.metadata.ContentAssetLink[] network,
           com.sforce.soap._2006._04.metadata.ContentAssetLink organization,
           com.sforce.soap._2006._04.metadata.ContentAssetLink[] workspace) {
           this.insightsApplication = insightsApplication;
           this.network = network;
           this.organization = organization;
           this.workspace = workspace;
    }


    /**
     * Gets the insightsApplication value for this ContentAssetRelationships.
     * 
     * @return insightsApplication
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetLink[] getInsightsApplication() {
        return insightsApplication;
    }


    /**
     * Sets the insightsApplication value for this ContentAssetRelationships.
     * 
     * @param insightsApplication
     */
    public void setInsightsApplication(com.sforce.soap._2006._04.metadata.ContentAssetLink[] insightsApplication) {
        this.insightsApplication = insightsApplication;
    }

    public com.sforce.soap._2006._04.metadata.ContentAssetLink getInsightsApplication(int i) {
        return this.insightsApplication[i];
    }

    public void setInsightsApplication(int i, com.sforce.soap._2006._04.metadata.ContentAssetLink _value) {
        this.insightsApplication[i] = _value;
    }


    /**
     * Gets the network value for this ContentAssetRelationships.
     * 
     * @return network
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetLink[] getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this ContentAssetRelationships.
     * 
     * @param network
     */
    public void setNetwork(com.sforce.soap._2006._04.metadata.ContentAssetLink[] network) {
        this.network = network;
    }

    public com.sforce.soap._2006._04.metadata.ContentAssetLink getNetwork(int i) {
        return this.network[i];
    }

    public void setNetwork(int i, com.sforce.soap._2006._04.metadata.ContentAssetLink _value) {
        this.network[i] = _value;
    }


    /**
     * Gets the organization value for this ContentAssetRelationships.
     * 
     * @return organization
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetLink getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this ContentAssetRelationships.
     * 
     * @param organization
     */
    public void setOrganization(com.sforce.soap._2006._04.metadata.ContentAssetLink organization) {
        this.organization = organization;
    }


    /**
     * Gets the workspace value for this ContentAssetRelationships.
     * 
     * @return workspace
     */
    public com.sforce.soap._2006._04.metadata.ContentAssetLink[] getWorkspace() {
        return workspace;
    }


    /**
     * Sets the workspace value for this ContentAssetRelationships.
     * 
     * @param workspace
     */
    public void setWorkspace(com.sforce.soap._2006._04.metadata.ContentAssetLink[] workspace) {
        this.workspace = workspace;
    }

    public com.sforce.soap._2006._04.metadata.ContentAssetLink getWorkspace(int i) {
        return this.workspace[i];
    }

    public void setWorkspace(int i, com.sforce.soap._2006._04.metadata.ContentAssetLink _value) {
        this.workspace[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentAssetRelationships)) return false;
        ContentAssetRelationships other = (ContentAssetRelationships) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insightsApplication==null && other.getInsightsApplication()==null) || 
             (this.insightsApplication!=null &&
              java.util.Arrays.equals(this.insightsApplication, other.getInsightsApplication()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              java.util.Arrays.equals(this.network, other.getNetwork()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.workspace==null && other.getWorkspace()==null) || 
             (this.workspace!=null &&
              java.util.Arrays.equals(this.workspace, other.getWorkspace())));
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
        if (getInsightsApplication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsightsApplication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsightsApplication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getWorkspace() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkspace());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkspace(), i);
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
        new org.apache.axis.description.TypeDesc(ContentAssetRelationships.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetRelationships"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insightsApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "insightsApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workspace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "workspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContentAssetLink"));
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
