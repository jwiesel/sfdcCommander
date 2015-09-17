/**
 * FlowScreen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlowScreen  extends com.sforce.soap._2006._04.metadata.FlowNode  implements java.io.Serializable {
    private java.lang.Boolean allowBack;

    private java.lang.Boolean allowFinish;

    private java.lang.Boolean allowPause;

    private com.sforce.soap._2006._04.metadata.FlowConnector connector;

    private com.sforce.soap._2006._04.metadata.FlowScreenField[] fields;

    private java.lang.String helpText;

    private java.lang.String pausedText;

    public FlowScreen() {
    }

    public FlowScreen(
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] param3,
           java.lang.String description,
           java.lang.String name,
           java.lang.String label,
           int locationX,
           int locationY,
           java.lang.Boolean allowBack,
           java.lang.Boolean allowFinish,
           java.lang.Boolean allowPause,
           com.sforce.soap._2006._04.metadata.FlowConnector connector,
           com.sforce.soap._2006._04.metadata.FlowScreenField[] fields,
           java.lang.String helpText,
           java.lang.String pausedText) {
        super(
            param3,
            description,
            name,
            label,
            locationX,
            locationY);
        this.allowBack = allowBack;
        this.allowFinish = allowFinish;
        this.allowPause = allowPause;
        this.connector = connector;
        this.fields = fields;
        this.helpText = helpText;
        this.pausedText = pausedText;
    }


    /**
     * Gets the allowBack value for this FlowScreen.
     * 
     * @return allowBack
     */
    public java.lang.Boolean getAllowBack() {
        return allowBack;
    }


    /**
     * Sets the allowBack value for this FlowScreen.
     * 
     * @param allowBack
     */
    public void setAllowBack(java.lang.Boolean allowBack) {
        this.allowBack = allowBack;
    }


    /**
     * Gets the allowFinish value for this FlowScreen.
     * 
     * @return allowFinish
     */
    public java.lang.Boolean getAllowFinish() {
        return allowFinish;
    }


    /**
     * Sets the allowFinish value for this FlowScreen.
     * 
     * @param allowFinish
     */
    public void setAllowFinish(java.lang.Boolean allowFinish) {
        this.allowFinish = allowFinish;
    }


    /**
     * Gets the allowPause value for this FlowScreen.
     * 
     * @return allowPause
     */
    public java.lang.Boolean getAllowPause() {
        return allowPause;
    }


    /**
     * Sets the allowPause value for this FlowScreen.
     * 
     * @param allowPause
     */
    public void setAllowPause(java.lang.Boolean allowPause) {
        this.allowPause = allowPause;
    }


    /**
     * Gets the connector value for this FlowScreen.
     * 
     * @return connector
     */
    public com.sforce.soap._2006._04.metadata.FlowConnector getConnector() {
        return connector;
    }


    /**
     * Sets the connector value for this FlowScreen.
     * 
     * @param connector
     */
    public void setConnector(com.sforce.soap._2006._04.metadata.FlowConnector connector) {
        this.connector = connector;
    }


    /**
     * Gets the fields value for this FlowScreen.
     * 
     * @return fields
     */
    public com.sforce.soap._2006._04.metadata.FlowScreenField[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this FlowScreen.
     * 
     * @param fields
     */
    public void setFields(com.sforce.soap._2006._04.metadata.FlowScreenField[] fields) {
        this.fields = fields;
    }

    public com.sforce.soap._2006._04.metadata.FlowScreenField getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.sforce.soap._2006._04.metadata.FlowScreenField _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the helpText value for this FlowScreen.
     * 
     * @return helpText
     */
    public java.lang.String getHelpText() {
        return helpText;
    }


    /**
     * Sets the helpText value for this FlowScreen.
     * 
     * @param helpText
     */
    public void setHelpText(java.lang.String helpText) {
        this.helpText = helpText;
    }


    /**
     * Gets the pausedText value for this FlowScreen.
     * 
     * @return pausedText
     */
    public java.lang.String getPausedText() {
        return pausedText;
    }


    /**
     * Sets the pausedText value for this FlowScreen.
     * 
     * @param pausedText
     */
    public void setPausedText(java.lang.String pausedText) {
        this.pausedText = pausedText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowScreen)) return false;
        FlowScreen other = (FlowScreen) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowBack==null && other.getAllowBack()==null) || 
             (this.allowBack!=null &&
              this.allowBack.equals(other.getAllowBack()))) &&
            ((this.allowFinish==null && other.getAllowFinish()==null) || 
             (this.allowFinish!=null &&
              this.allowFinish.equals(other.getAllowFinish()))) &&
            ((this.allowPause==null && other.getAllowPause()==null) || 
             (this.allowPause!=null &&
              this.allowPause.equals(other.getAllowPause()))) &&
            ((this.connector==null && other.getConnector()==null) || 
             (this.connector!=null &&
              this.connector.equals(other.getConnector()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.helpText==null && other.getHelpText()==null) || 
             (this.helpText!=null &&
              this.helpText.equals(other.getHelpText()))) &&
            ((this.pausedText==null && other.getPausedText()==null) || 
             (this.pausedText!=null &&
              this.pausedText.equals(other.getPausedText())));
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
        if (getAllowBack() != null) {
            _hashCode += getAllowBack().hashCode();
        }
        if (getAllowFinish() != null) {
            _hashCode += getAllowFinish().hashCode();
        }
        if (getAllowPause() != null) {
            _hashCode += getAllowPause().hashCode();
        }
        if (getConnector() != null) {
            _hashCode += getConnector().hashCode();
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHelpText() != null) {
            _hashCode += getHelpText().hashCode();
        }
        if (getPausedText() != null) {
            _hashCode += getPausedText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowScreen.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreen"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFinish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowFinish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPause");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowPause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "connector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreenField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "helpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pausedText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pausedText"));
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
