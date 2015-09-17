/**
 * DescribeCompactLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeCompactLayout  implements java.io.Serializable {
    private com.sforce.soap.partner.DescribeLayoutButton[] actions;

    private com.sforce.soap.partner.DescribeLayoutItem[] fieldItems;

    private java.lang.String id;

    private com.sforce.soap.partner.DescribeLayoutItem[] imageItems;

    private java.lang.String label;

    private java.lang.String name;

    private java.lang.String objectType;

    public DescribeCompactLayout() {
    }

    public DescribeCompactLayout(
           com.sforce.soap.partner.DescribeLayoutButton[] actions,
           com.sforce.soap.partner.DescribeLayoutItem[] fieldItems,
           java.lang.String id,
           com.sforce.soap.partner.DescribeLayoutItem[] imageItems,
           java.lang.String label,
           java.lang.String name,
           java.lang.String objectType) {
           this.actions = actions;
           this.fieldItems = fieldItems;
           this.id = id;
           this.imageItems = imageItems;
           this.label = label;
           this.name = name;
           this.objectType = objectType;
    }


    /**
     * Gets the actions value for this DescribeCompactLayout.
     * 
     * @return actions
     */
    public com.sforce.soap.partner.DescribeLayoutButton[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this DescribeCompactLayout.
     * 
     * @param actions
     */
    public void setActions(com.sforce.soap.partner.DescribeLayoutButton[] actions) {
        this.actions = actions;
    }

    public com.sforce.soap.partner.DescribeLayoutButton getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.sforce.soap.partner.DescribeLayoutButton _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the fieldItems value for this DescribeCompactLayout.
     * 
     * @return fieldItems
     */
    public com.sforce.soap.partner.DescribeLayoutItem[] getFieldItems() {
        return fieldItems;
    }


    /**
     * Sets the fieldItems value for this DescribeCompactLayout.
     * 
     * @param fieldItems
     */
    public void setFieldItems(com.sforce.soap.partner.DescribeLayoutItem[] fieldItems) {
        this.fieldItems = fieldItems;
    }

    public com.sforce.soap.partner.DescribeLayoutItem getFieldItems(int i) {
        return this.fieldItems[i];
    }

    public void setFieldItems(int i, com.sforce.soap.partner.DescribeLayoutItem _value) {
        this.fieldItems[i] = _value;
    }


    /**
     * Gets the id value for this DescribeCompactLayout.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DescribeCompactLayout.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the imageItems value for this DescribeCompactLayout.
     * 
     * @return imageItems
     */
    public com.sforce.soap.partner.DescribeLayoutItem[] getImageItems() {
        return imageItems;
    }


    /**
     * Sets the imageItems value for this DescribeCompactLayout.
     * 
     * @param imageItems
     */
    public void setImageItems(com.sforce.soap.partner.DescribeLayoutItem[] imageItems) {
        this.imageItems = imageItems;
    }

    public com.sforce.soap.partner.DescribeLayoutItem getImageItems(int i) {
        return this.imageItems[i];
    }

    public void setImageItems(int i, com.sforce.soap.partner.DescribeLayoutItem _value) {
        this.imageItems[i] = _value;
    }


    /**
     * Gets the label value for this DescribeCompactLayout.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeCompactLayout.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the name value for this DescribeCompactLayout.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeCompactLayout.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the objectType value for this DescribeCompactLayout.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this DescribeCompactLayout.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeCompactLayout)) return false;
        DescribeCompactLayout other = (DescribeCompactLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.fieldItems==null && other.getFieldItems()==null) || 
             (this.fieldItems!=null &&
              java.util.Arrays.equals(this.fieldItems, other.getFieldItems()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.imageItems==null && other.getImageItems()==null) || 
             (this.imageItems!=null &&
              java.util.Arrays.equals(this.imageItems, other.getImageItems()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType())));
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
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getImageItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeCompactLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutButton"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "imageItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
