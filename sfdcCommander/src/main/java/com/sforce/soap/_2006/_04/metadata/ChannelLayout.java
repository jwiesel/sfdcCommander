/**
 * ChannelLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ChannelLayout  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String[] enabledChannels;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.ChannelLayoutItem[] layoutItems;

    public ChannelLayout() {
    }

    public ChannelLayout(
           java.lang.String fullName,
           java.lang.String[] enabledChannels,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.ChannelLayoutItem[] layoutItems) {
        super(
            fullName);
        this.enabledChannels = enabledChannels;
        this.label = label;
        this.layoutItems = layoutItems;
    }


    /**
     * Gets the enabledChannels value for this ChannelLayout.
     * 
     * @return enabledChannels
     */
    public java.lang.String[] getEnabledChannels() {
        return enabledChannels;
    }


    /**
     * Sets the enabledChannels value for this ChannelLayout.
     * 
     * @param enabledChannels
     */
    public void setEnabledChannels(java.lang.String[] enabledChannels) {
        this.enabledChannels = enabledChannels;
    }

    public java.lang.String getEnabledChannels(int i) {
        return this.enabledChannels[i];
    }

    public void setEnabledChannels(int i, java.lang.String _value) {
        this.enabledChannels[i] = _value;
    }


    /**
     * Gets the label value for this ChannelLayout.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ChannelLayout.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the layoutItems value for this ChannelLayout.
     * 
     * @return layoutItems
     */
    public com.sforce.soap._2006._04.metadata.ChannelLayoutItem[] getLayoutItems() {
        return layoutItems;
    }


    /**
     * Sets the layoutItems value for this ChannelLayout.
     * 
     * @param layoutItems
     */
    public void setLayoutItems(com.sforce.soap._2006._04.metadata.ChannelLayoutItem[] layoutItems) {
        this.layoutItems = layoutItems;
    }

    public com.sforce.soap._2006._04.metadata.ChannelLayoutItem getLayoutItems(int i) {
        return this.layoutItems[i];
    }

    public void setLayoutItems(int i, com.sforce.soap._2006._04.metadata.ChannelLayoutItem _value) {
        this.layoutItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChannelLayout)) return false;
        ChannelLayout other = (ChannelLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enabledChannels==null && other.getEnabledChannels()==null) || 
             (this.enabledChannels!=null &&
              java.util.Arrays.equals(this.enabledChannels, other.getEnabledChannels()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.layoutItems==null && other.getLayoutItems()==null) || 
             (this.layoutItems!=null &&
              java.util.Arrays.equals(this.layoutItems, other.getLayoutItems())));
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
        if (getEnabledChannels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnabledChannels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnabledChannels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChannelLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChannelLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledChannels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enabledChannels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("layoutItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "layoutItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChannelLayoutItem"));
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
