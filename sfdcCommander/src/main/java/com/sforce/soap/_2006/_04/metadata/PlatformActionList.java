/**
 * PlatformActionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PlatformActionList  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.PlatformActionListContext actionListContext;

    private com.sforce.soap._2006._04.metadata.PlatformActionListItem[] platformActionListItems;

    private java.lang.String relatedSourceEntity;

    public PlatformActionList() {
    }

    public PlatformActionList(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.PlatformActionListContext actionListContext,
           com.sforce.soap._2006._04.metadata.PlatformActionListItem[] platformActionListItems,
           java.lang.String relatedSourceEntity) {
        super(
            fullName);
        this.actionListContext = actionListContext;
        this.platformActionListItems = platformActionListItems;
        this.relatedSourceEntity = relatedSourceEntity;
    }


    /**
     * Gets the actionListContext value for this PlatformActionList.
     * 
     * @return actionListContext
     */
    public com.sforce.soap._2006._04.metadata.PlatformActionListContext getActionListContext() {
        return actionListContext;
    }


    /**
     * Sets the actionListContext value for this PlatformActionList.
     * 
     * @param actionListContext
     */
    public void setActionListContext(com.sforce.soap._2006._04.metadata.PlatformActionListContext actionListContext) {
        this.actionListContext = actionListContext;
    }


    /**
     * Gets the platformActionListItems value for this PlatformActionList.
     * 
     * @return platformActionListItems
     */
    public com.sforce.soap._2006._04.metadata.PlatformActionListItem[] getPlatformActionListItems() {
        return platformActionListItems;
    }


    /**
     * Sets the platformActionListItems value for this PlatformActionList.
     * 
     * @param platformActionListItems
     */
    public void setPlatformActionListItems(com.sforce.soap._2006._04.metadata.PlatformActionListItem[] platformActionListItems) {
        this.platformActionListItems = platformActionListItems;
    }

    public com.sforce.soap._2006._04.metadata.PlatformActionListItem getPlatformActionListItems(int i) {
        return this.platformActionListItems[i];
    }

    public void setPlatformActionListItems(int i, com.sforce.soap._2006._04.metadata.PlatformActionListItem _value) {
        this.platformActionListItems[i] = _value;
    }


    /**
     * Gets the relatedSourceEntity value for this PlatformActionList.
     * 
     * @return relatedSourceEntity
     */
    public java.lang.String getRelatedSourceEntity() {
        return relatedSourceEntity;
    }


    /**
     * Sets the relatedSourceEntity value for this PlatformActionList.
     * 
     * @param relatedSourceEntity
     */
    public void setRelatedSourceEntity(java.lang.String relatedSourceEntity) {
        this.relatedSourceEntity = relatedSourceEntity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlatformActionList)) return false;
        PlatformActionList other = (PlatformActionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionListContext==null && other.getActionListContext()==null) || 
             (this.actionListContext!=null &&
              this.actionListContext.equals(other.getActionListContext()))) &&
            ((this.platformActionListItems==null && other.getPlatformActionListItems()==null) || 
             (this.platformActionListItems!=null &&
              java.util.Arrays.equals(this.platformActionListItems, other.getPlatformActionListItems()))) &&
            ((this.relatedSourceEntity==null && other.getRelatedSourceEntity()==null) || 
             (this.relatedSourceEntity!=null &&
              this.relatedSourceEntity.equals(other.getRelatedSourceEntity())));
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
        if (getActionListContext() != null) {
            _hashCode += getActionListContext().hashCode();
        }
        if (getPlatformActionListItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlatformActionListItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlatformActionListItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedSourceEntity() != null) {
            _hashCode += getRelatedSourceEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlatformActionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformActionList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionListContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionListContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformActionListContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformActionListItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "platformActionListItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PlatformActionListItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedSourceEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relatedSourceEntity"));
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
