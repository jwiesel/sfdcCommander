/**
 * AppMenu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AppMenu  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.AppMenuItem[] appMenuItems;

    public AppMenu() {
    }

    public AppMenu(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.AppMenuItem[] appMenuItems) {
        super(
            fullName);
        this.appMenuItems = appMenuItems;
    }


    /**
     * Gets the appMenuItems value for this AppMenu.
     * 
     * @return appMenuItems
     */
    public com.sforce.soap._2006._04.metadata.AppMenuItem[] getAppMenuItems() {
        return appMenuItems;
    }


    /**
     * Sets the appMenuItems value for this AppMenu.
     * 
     * @param appMenuItems
     */
    public void setAppMenuItems(com.sforce.soap._2006._04.metadata.AppMenuItem[] appMenuItems) {
        this.appMenuItems = appMenuItems;
    }

    public com.sforce.soap._2006._04.metadata.AppMenuItem getAppMenuItems(int i) {
        return this.appMenuItems[i];
    }

    public void setAppMenuItems(int i, com.sforce.soap._2006._04.metadata.AppMenuItem _value) {
        this.appMenuItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppMenu)) return false;
        AppMenu other = (AppMenu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appMenuItems==null && other.getAppMenuItems()==null) || 
             (this.appMenuItems!=null &&
              java.util.Arrays.equals(this.appMenuItems, other.getAppMenuItems())));
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
        if (getAppMenuItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppMenuItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppMenuItems(), i);
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
        new org.apache.axis.description.TypeDesc(AppMenu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AppMenu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appMenuItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "appMenuItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AppMenuItem"));
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
