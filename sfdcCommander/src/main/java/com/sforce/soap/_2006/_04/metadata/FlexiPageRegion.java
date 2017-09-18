/**
 * FlexiPageRegion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlexiPageRegion  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.RegionFlagStatus appendable;

    private com.sforce.soap._2006._04.metadata.ComponentInstance[] componentInstances;

    private com.sforce.soap._2006._04.metadata.FlexiPageRegionMode mode;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.RegionFlagStatus prependable;

    private com.sforce.soap._2006._04.metadata.RegionFlagStatus replaceable;

    private com.sforce.soap._2006._04.metadata.FlexiPageRegionType type;

    public FlexiPageRegion() {
    }

    public FlexiPageRegion(
           com.sforce.soap._2006._04.metadata.RegionFlagStatus appendable,
           com.sforce.soap._2006._04.metadata.ComponentInstance[] componentInstances,
           com.sforce.soap._2006._04.metadata.FlexiPageRegionMode mode,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.RegionFlagStatus prependable,
           com.sforce.soap._2006._04.metadata.RegionFlagStatus replaceable,
           com.sforce.soap._2006._04.metadata.FlexiPageRegionType type) {
           this.appendable = appendable;
           this.componentInstances = componentInstances;
           this.mode = mode;
           this.name = name;
           this.prependable = prependable;
           this.replaceable = replaceable;
           this.type = type;
    }


    /**
     * Gets the appendable value for this FlexiPageRegion.
     * 
     * @return appendable
     */
    public com.sforce.soap._2006._04.metadata.RegionFlagStatus getAppendable() {
        return appendable;
    }


    /**
     * Sets the appendable value for this FlexiPageRegion.
     * 
     * @param appendable
     */
    public void setAppendable(com.sforce.soap._2006._04.metadata.RegionFlagStatus appendable) {
        this.appendable = appendable;
    }


    /**
     * Gets the componentInstances value for this FlexiPageRegion.
     * 
     * @return componentInstances
     */
    public com.sforce.soap._2006._04.metadata.ComponentInstance[] getComponentInstances() {
        return componentInstances;
    }


    /**
     * Sets the componentInstances value for this FlexiPageRegion.
     * 
     * @param componentInstances
     */
    public void setComponentInstances(com.sforce.soap._2006._04.metadata.ComponentInstance[] componentInstances) {
        this.componentInstances = componentInstances;
    }

    public com.sforce.soap._2006._04.metadata.ComponentInstance getComponentInstances(int i) {
        return this.componentInstances[i];
    }

    public void setComponentInstances(int i, com.sforce.soap._2006._04.metadata.ComponentInstance _value) {
        this.componentInstances[i] = _value;
    }


    /**
     * Gets the mode value for this FlexiPageRegion.
     * 
     * @return mode
     */
    public com.sforce.soap._2006._04.metadata.FlexiPageRegionMode getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this FlexiPageRegion.
     * 
     * @param mode
     */
    public void setMode(com.sforce.soap._2006._04.metadata.FlexiPageRegionMode mode) {
        this.mode = mode;
    }


    /**
     * Gets the name value for this FlexiPageRegion.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FlexiPageRegion.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the prependable value for this FlexiPageRegion.
     * 
     * @return prependable
     */
    public com.sforce.soap._2006._04.metadata.RegionFlagStatus getPrependable() {
        return prependable;
    }


    /**
     * Sets the prependable value for this FlexiPageRegion.
     * 
     * @param prependable
     */
    public void setPrependable(com.sforce.soap._2006._04.metadata.RegionFlagStatus prependable) {
        this.prependable = prependable;
    }


    /**
     * Gets the replaceable value for this FlexiPageRegion.
     * 
     * @return replaceable
     */
    public com.sforce.soap._2006._04.metadata.RegionFlagStatus getReplaceable() {
        return replaceable;
    }


    /**
     * Sets the replaceable value for this FlexiPageRegion.
     * 
     * @param replaceable
     */
    public void setReplaceable(com.sforce.soap._2006._04.metadata.RegionFlagStatus replaceable) {
        this.replaceable = replaceable;
    }


    /**
     * Gets the type value for this FlexiPageRegion.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.FlexiPageRegionType getType() {
        return type;
    }


    /**
     * Sets the type value for this FlexiPageRegion.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.FlexiPageRegionType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexiPageRegion)) return false;
        FlexiPageRegion other = (FlexiPageRegion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appendable==null && other.getAppendable()==null) || 
             (this.appendable!=null &&
              this.appendable.equals(other.getAppendable()))) &&
            ((this.componentInstances==null && other.getComponentInstances()==null) || 
             (this.componentInstances!=null &&
              java.util.Arrays.equals(this.componentInstances, other.getComponentInstances()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.prependable==null && other.getPrependable()==null) || 
             (this.prependable!=null &&
              this.prependable.equals(other.getPrependable()))) &&
            ((this.replaceable==null && other.getReplaceable()==null) || 
             (this.replaceable!=null &&
              this.replaceable.equals(other.getReplaceable()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAppendable() != null) {
            _hashCode += getAppendable().hashCode();
        }
        if (getComponentInstances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentInstances());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentInstances(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPrependable() != null) {
            _hashCode += getPrependable().hashCode();
        }
        if (getReplaceable() != null) {
            _hashCode += getReplaceable().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexiPageRegion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageRegion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "appendable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RegionFlagStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "componentInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ComponentInstance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageRegionMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prependable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "prependable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RegionFlagStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replaceable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "replaceable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RegionFlagStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageRegionType"));
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
