/**
 * ActionLinkTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ActionLinkTemplate  implements java.io.Serializable {
    private java.lang.String actionUrl;

    private java.lang.String headers;

    private boolean isConfirmationRequired;

    private boolean isGroupDefault;

    private java.lang.String label;

    private java.lang.String labelKey;

    private com.sforce.soap._2006._04.metadata.ActionLinkType linkType;

    private com.sforce.soap._2006._04.metadata.ActionLinkHttpMethod method;

    private int position;

    private java.lang.String requestBody;

    private java.lang.String userAlias;

    private com.sforce.soap._2006._04.metadata.ActionLinkUserVisibility userVisibility;

    public ActionLinkTemplate() {
    }

    public ActionLinkTemplate(
           java.lang.String actionUrl,
           java.lang.String headers,
           boolean isConfirmationRequired,
           boolean isGroupDefault,
           java.lang.String label,
           java.lang.String labelKey,
           com.sforce.soap._2006._04.metadata.ActionLinkType linkType,
           com.sforce.soap._2006._04.metadata.ActionLinkHttpMethod method,
           int position,
           java.lang.String requestBody,
           java.lang.String userAlias,
           com.sforce.soap._2006._04.metadata.ActionLinkUserVisibility userVisibility) {
           this.actionUrl = actionUrl;
           this.headers = headers;
           this.isConfirmationRequired = isConfirmationRequired;
           this.isGroupDefault = isGroupDefault;
           this.label = label;
           this.labelKey = labelKey;
           this.linkType = linkType;
           this.method = method;
           this.position = position;
           this.requestBody = requestBody;
           this.userAlias = userAlias;
           this.userVisibility = userVisibility;
    }


    /**
     * Gets the actionUrl value for this ActionLinkTemplate.
     * 
     * @return actionUrl
     */
    public java.lang.String getActionUrl() {
        return actionUrl;
    }


    /**
     * Sets the actionUrl value for this ActionLinkTemplate.
     * 
     * @param actionUrl
     */
    public void setActionUrl(java.lang.String actionUrl) {
        this.actionUrl = actionUrl;
    }


    /**
     * Gets the headers value for this ActionLinkTemplate.
     * 
     * @return headers
     */
    public java.lang.String getHeaders() {
        return headers;
    }


    /**
     * Sets the headers value for this ActionLinkTemplate.
     * 
     * @param headers
     */
    public void setHeaders(java.lang.String headers) {
        this.headers = headers;
    }


    /**
     * Gets the isConfirmationRequired value for this ActionLinkTemplate.
     * 
     * @return isConfirmationRequired
     */
    public boolean isIsConfirmationRequired() {
        return isConfirmationRequired;
    }


    /**
     * Sets the isConfirmationRequired value for this ActionLinkTemplate.
     * 
     * @param isConfirmationRequired
     */
    public void setIsConfirmationRequired(boolean isConfirmationRequired) {
        this.isConfirmationRequired = isConfirmationRequired;
    }


    /**
     * Gets the isGroupDefault value for this ActionLinkTemplate.
     * 
     * @return isGroupDefault
     */
    public boolean isIsGroupDefault() {
        return isGroupDefault;
    }


    /**
     * Sets the isGroupDefault value for this ActionLinkTemplate.
     * 
     * @param isGroupDefault
     */
    public void setIsGroupDefault(boolean isGroupDefault) {
        this.isGroupDefault = isGroupDefault;
    }


    /**
     * Gets the label value for this ActionLinkTemplate.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ActionLinkTemplate.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the labelKey value for this ActionLinkTemplate.
     * 
     * @return labelKey
     */
    public java.lang.String getLabelKey() {
        return labelKey;
    }


    /**
     * Sets the labelKey value for this ActionLinkTemplate.
     * 
     * @param labelKey
     */
    public void setLabelKey(java.lang.String labelKey) {
        this.labelKey = labelKey;
    }


    /**
     * Gets the linkType value for this ActionLinkTemplate.
     * 
     * @return linkType
     */
    public com.sforce.soap._2006._04.metadata.ActionLinkType getLinkType() {
        return linkType;
    }


    /**
     * Sets the linkType value for this ActionLinkTemplate.
     * 
     * @param linkType
     */
    public void setLinkType(com.sforce.soap._2006._04.metadata.ActionLinkType linkType) {
        this.linkType = linkType;
    }


    /**
     * Gets the method value for this ActionLinkTemplate.
     * 
     * @return method
     */
    public com.sforce.soap._2006._04.metadata.ActionLinkHttpMethod getMethod() {
        return method;
    }


    /**
     * Sets the method value for this ActionLinkTemplate.
     * 
     * @param method
     */
    public void setMethod(com.sforce.soap._2006._04.metadata.ActionLinkHttpMethod method) {
        this.method = method;
    }


    /**
     * Gets the position value for this ActionLinkTemplate.
     * 
     * @return position
     */
    public int getPosition() {
        return position;
    }


    /**
     * Sets the position value for this ActionLinkTemplate.
     * 
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }


    /**
     * Gets the requestBody value for this ActionLinkTemplate.
     * 
     * @return requestBody
     */
    public java.lang.String getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this ActionLinkTemplate.
     * 
     * @param requestBody
     */
    public void setRequestBody(java.lang.String requestBody) {
        this.requestBody = requestBody;
    }


    /**
     * Gets the userAlias value for this ActionLinkTemplate.
     * 
     * @return userAlias
     */
    public java.lang.String getUserAlias() {
        return userAlias;
    }


    /**
     * Sets the userAlias value for this ActionLinkTemplate.
     * 
     * @param userAlias
     */
    public void setUserAlias(java.lang.String userAlias) {
        this.userAlias = userAlias;
    }


    /**
     * Gets the userVisibility value for this ActionLinkTemplate.
     * 
     * @return userVisibility
     */
    public com.sforce.soap._2006._04.metadata.ActionLinkUserVisibility getUserVisibility() {
        return userVisibility;
    }


    /**
     * Sets the userVisibility value for this ActionLinkTemplate.
     * 
     * @param userVisibility
     */
    public void setUserVisibility(com.sforce.soap._2006._04.metadata.ActionLinkUserVisibility userVisibility) {
        this.userVisibility = userVisibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActionLinkTemplate)) return false;
        ActionLinkTemplate other = (ActionLinkTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionUrl==null && other.getActionUrl()==null) || 
             (this.actionUrl!=null &&
              this.actionUrl.equals(other.getActionUrl()))) &&
            ((this.headers==null && other.getHeaders()==null) || 
             (this.headers!=null &&
              this.headers.equals(other.getHeaders()))) &&
            this.isConfirmationRequired == other.isIsConfirmationRequired() &&
            this.isGroupDefault == other.isIsGroupDefault() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.labelKey==null && other.getLabelKey()==null) || 
             (this.labelKey!=null &&
              this.labelKey.equals(other.getLabelKey()))) &&
            ((this.linkType==null && other.getLinkType()==null) || 
             (this.linkType!=null &&
              this.linkType.equals(other.getLinkType()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            this.position == other.getPosition() &&
            ((this.requestBody==null && other.getRequestBody()==null) || 
             (this.requestBody!=null &&
              this.requestBody.equals(other.getRequestBody()))) &&
            ((this.userAlias==null && other.getUserAlias()==null) || 
             (this.userAlias!=null &&
              this.userAlias.equals(other.getUserAlias()))) &&
            ((this.userVisibility==null && other.getUserVisibility()==null) || 
             (this.userVisibility!=null &&
              this.userVisibility.equals(other.getUserVisibility())));
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
        if (getActionUrl() != null) {
            _hashCode += getActionUrl().hashCode();
        }
        if (getHeaders() != null) {
            _hashCode += getHeaders().hashCode();
        }
        _hashCode += (isIsConfirmationRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsGroupDefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabelKey() != null) {
            _hashCode += getLabelKey().hashCode();
        }
        if (getLinkType() != null) {
            _hashCode += getLinkType().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        _hashCode += getPosition();
        if (getRequestBody() != null) {
            _hashCode += getRequestBody().hashCode();
        }
        if (getUserAlias() != null) {
            _hashCode += getUserAlias().hashCode();
        }
        if (getUserVisibility() != null) {
            _hashCode += getUserVisibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActionLinkTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "headers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConfirmationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isConfirmationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGroupDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isGroupDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("labelKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "labelKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "linkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkHttpMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "requestBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionLinkUserVisibility"));
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
