/**
 * QuickAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class QuickAction  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String canvas;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.FieldOverride[] fieldOverrides;

    private java.lang.Integer height;

    private java.lang.String icon;

    private java.lang.Boolean isProtected;

    private java.lang.String label;

    private java.lang.String page;

    private com.sforce.soap._2006._04.metadata.QuickActionLayout quickActionLayout;

    private com.sforce.soap._2006._04.metadata.QuickActionLabel standardLabel;

    private java.lang.String targetObject;

    private java.lang.String targetParentField;

    private java.lang.String targetRecordType;

    private com.sforce.soap._2006._04.metadata.QuickActionType type;

    private java.lang.Integer width;

    public QuickAction() {
    }

    public QuickAction(
           java.lang.String fullName,
           java.lang.String canvas,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.FieldOverride[] fieldOverrides,
           java.lang.Integer height,
           java.lang.String icon,
           java.lang.Boolean isProtected,
           java.lang.String label,
           java.lang.String page,
           com.sforce.soap._2006._04.metadata.QuickActionLayout quickActionLayout,
           com.sforce.soap._2006._04.metadata.QuickActionLabel standardLabel,
           java.lang.String targetObject,
           java.lang.String targetParentField,
           java.lang.String targetRecordType,
           com.sforce.soap._2006._04.metadata.QuickActionType type,
           java.lang.Integer width) {
        super(
            fullName);
        this.canvas = canvas;
        this.description = description;
        this.fieldOverrides = fieldOverrides;
        this.height = height;
        this.icon = icon;
        this.isProtected = isProtected;
        this.label = label;
        this.page = page;
        this.quickActionLayout = quickActionLayout;
        this.standardLabel = standardLabel;
        this.targetObject = targetObject;
        this.targetParentField = targetParentField;
        this.targetRecordType = targetRecordType;
        this.type = type;
        this.width = width;
    }


    /**
     * Gets the canvas value for this QuickAction.
     * 
     * @return canvas
     */
    public java.lang.String getCanvas() {
        return canvas;
    }


    /**
     * Sets the canvas value for this QuickAction.
     * 
     * @param canvas
     */
    public void setCanvas(java.lang.String canvas) {
        this.canvas = canvas;
    }


    /**
     * Gets the description value for this QuickAction.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this QuickAction.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fieldOverrides value for this QuickAction.
     * 
     * @return fieldOverrides
     */
    public com.sforce.soap._2006._04.metadata.FieldOverride[] getFieldOverrides() {
        return fieldOverrides;
    }


    /**
     * Sets the fieldOverrides value for this QuickAction.
     * 
     * @param fieldOverrides
     */
    public void setFieldOverrides(com.sforce.soap._2006._04.metadata.FieldOverride[] fieldOverrides) {
        this.fieldOverrides = fieldOverrides;
    }

    public com.sforce.soap._2006._04.metadata.FieldOverride getFieldOverrides(int i) {
        return this.fieldOverrides[i];
    }

    public void setFieldOverrides(int i, com.sforce.soap._2006._04.metadata.FieldOverride _value) {
        this.fieldOverrides[i] = _value;
    }


    /**
     * Gets the height value for this QuickAction.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this QuickAction.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the icon value for this QuickAction.
     * 
     * @return icon
     */
    public java.lang.String getIcon() {
        return icon;
    }


    /**
     * Sets the icon value for this QuickAction.
     * 
     * @param icon
     */
    public void setIcon(java.lang.String icon) {
        this.icon = icon;
    }


    /**
     * Gets the isProtected value for this QuickAction.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this QuickAction.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the label value for this QuickAction.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this QuickAction.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the page value for this QuickAction.
     * 
     * @return page
     */
    public java.lang.String getPage() {
        return page;
    }


    /**
     * Sets the page value for this QuickAction.
     * 
     * @param page
     */
    public void setPage(java.lang.String page) {
        this.page = page;
    }


    /**
     * Gets the quickActionLayout value for this QuickAction.
     * 
     * @return quickActionLayout
     */
    public com.sforce.soap._2006._04.metadata.QuickActionLayout getQuickActionLayout() {
        return quickActionLayout;
    }


    /**
     * Sets the quickActionLayout value for this QuickAction.
     * 
     * @param quickActionLayout
     */
    public void setQuickActionLayout(com.sforce.soap._2006._04.metadata.QuickActionLayout quickActionLayout) {
        this.quickActionLayout = quickActionLayout;
    }


    /**
     * Gets the standardLabel value for this QuickAction.
     * 
     * @return standardLabel
     */
    public com.sforce.soap._2006._04.metadata.QuickActionLabel getStandardLabel() {
        return standardLabel;
    }


    /**
     * Sets the standardLabel value for this QuickAction.
     * 
     * @param standardLabel
     */
    public void setStandardLabel(com.sforce.soap._2006._04.metadata.QuickActionLabel standardLabel) {
        this.standardLabel = standardLabel;
    }


    /**
     * Gets the targetObject value for this QuickAction.
     * 
     * @return targetObject
     */
    public java.lang.String getTargetObject() {
        return targetObject;
    }


    /**
     * Sets the targetObject value for this QuickAction.
     * 
     * @param targetObject
     */
    public void setTargetObject(java.lang.String targetObject) {
        this.targetObject = targetObject;
    }


    /**
     * Gets the targetParentField value for this QuickAction.
     * 
     * @return targetParentField
     */
    public java.lang.String getTargetParentField() {
        return targetParentField;
    }


    /**
     * Sets the targetParentField value for this QuickAction.
     * 
     * @param targetParentField
     */
    public void setTargetParentField(java.lang.String targetParentField) {
        this.targetParentField = targetParentField;
    }


    /**
     * Gets the targetRecordType value for this QuickAction.
     * 
     * @return targetRecordType
     */
    public java.lang.String getTargetRecordType() {
        return targetRecordType;
    }


    /**
     * Sets the targetRecordType value for this QuickAction.
     * 
     * @param targetRecordType
     */
    public void setTargetRecordType(java.lang.String targetRecordType) {
        this.targetRecordType = targetRecordType;
    }


    /**
     * Gets the type value for this QuickAction.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.QuickActionType getType() {
        return type;
    }


    /**
     * Sets the type value for this QuickAction.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.QuickActionType type) {
        this.type = type;
    }


    /**
     * Gets the width value for this QuickAction.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this QuickAction.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuickAction)) return false;
        QuickAction other = (QuickAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.canvas==null && other.getCanvas()==null) || 
             (this.canvas!=null &&
              this.canvas.equals(other.getCanvas()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fieldOverrides==null && other.getFieldOverrides()==null) || 
             (this.fieldOverrides!=null &&
              java.util.Arrays.equals(this.fieldOverrides, other.getFieldOverrides()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.icon==null && other.getIcon()==null) || 
             (this.icon!=null &&
              this.icon.equals(other.getIcon()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.quickActionLayout==null && other.getQuickActionLayout()==null) || 
             (this.quickActionLayout!=null &&
              this.quickActionLayout.equals(other.getQuickActionLayout()))) &&
            ((this.standardLabel==null && other.getStandardLabel()==null) || 
             (this.standardLabel!=null &&
              this.standardLabel.equals(other.getStandardLabel()))) &&
            ((this.targetObject==null && other.getTargetObject()==null) || 
             (this.targetObject!=null &&
              this.targetObject.equals(other.getTargetObject()))) &&
            ((this.targetParentField==null && other.getTargetParentField()==null) || 
             (this.targetParentField!=null &&
              this.targetParentField.equals(other.getTargetParentField()))) &&
            ((this.targetRecordType==null && other.getTargetRecordType()==null) || 
             (this.targetRecordType!=null &&
              this.targetRecordType.equals(other.getTargetRecordType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getCanvas() != null) {
            _hashCode += getCanvas().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFieldOverrides() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldOverrides());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldOverrides(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getIcon() != null) {
            _hashCode += getIcon().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getQuickActionLayout() != null) {
            _hashCode += getQuickActionLayout().hashCode();
        }
        if (getStandardLabel() != null) {
            _hashCode += getStandardLabel().hashCode();
        }
        if (getTargetObject() != null) {
            _hashCode += getTargetObject().hashCode();
        }
        if (getTargetParentField() != null) {
            _hashCode += getTargetParentField().hashCode();
        }
        if (getTargetRecordType() != null) {
            _hashCode += getTargetRecordType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuickAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "canvas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fieldOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "icon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isProtected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayout"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "standardLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetParentField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetParentField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRecordType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "targetRecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
