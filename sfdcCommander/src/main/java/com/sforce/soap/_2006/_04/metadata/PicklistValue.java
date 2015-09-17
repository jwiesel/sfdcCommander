/**
 * PicklistValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class PicklistValue  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean allowEmail;

    private java.lang.Boolean closed;

    private java.lang.String color;

    private java.lang.String[] controllingFieldValues;

    private java.lang.Boolean converted;

    private java.lang.Boolean cssExposed;

    private boolean _default;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.ForecastCategories forecastCategory;

    private java.lang.Boolean highPriority;

    private java.lang.Integer probability;

    private java.lang.String reverseRole;

    private java.lang.Boolean reviewed;

    private java.lang.Boolean won;

    public PicklistValue() {
    }

    public PicklistValue(
           java.lang.String fullName,
           java.lang.Boolean allowEmail,
           java.lang.Boolean closed,
           java.lang.String color,
           java.lang.String[] controllingFieldValues,
           java.lang.Boolean converted,
           java.lang.Boolean cssExposed,
           boolean _default,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.ForecastCategories forecastCategory,
           java.lang.Boolean highPriority,
           java.lang.Integer probability,
           java.lang.String reverseRole,
           java.lang.Boolean reviewed,
           java.lang.Boolean won) {
        super(
            fullName);
        this.allowEmail = allowEmail;
        this.closed = closed;
        this.color = color;
        this.controllingFieldValues = controllingFieldValues;
        this.converted = converted;
        this.cssExposed = cssExposed;
        this._default = _default;
        this.description = description;
        this.forecastCategory = forecastCategory;
        this.highPriority = highPriority;
        this.probability = probability;
        this.reverseRole = reverseRole;
        this.reviewed = reviewed;
        this.won = won;
    }


    /**
     * Gets the allowEmail value for this PicklistValue.
     * 
     * @return allowEmail
     */
    public java.lang.Boolean getAllowEmail() {
        return allowEmail;
    }


    /**
     * Sets the allowEmail value for this PicklistValue.
     * 
     * @param allowEmail
     */
    public void setAllowEmail(java.lang.Boolean allowEmail) {
        this.allowEmail = allowEmail;
    }


    /**
     * Gets the closed value for this PicklistValue.
     * 
     * @return closed
     */
    public java.lang.Boolean getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this PicklistValue.
     * 
     * @param closed
     */
    public void setClosed(java.lang.Boolean closed) {
        this.closed = closed;
    }


    /**
     * Gets the color value for this PicklistValue.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this PicklistValue.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the controllingFieldValues value for this PicklistValue.
     * 
     * @return controllingFieldValues
     */
    public java.lang.String[] getControllingFieldValues() {
        return controllingFieldValues;
    }


    /**
     * Sets the controllingFieldValues value for this PicklistValue.
     * 
     * @param controllingFieldValues
     */
    public void setControllingFieldValues(java.lang.String[] controllingFieldValues) {
        this.controllingFieldValues = controllingFieldValues;
    }

    public java.lang.String getControllingFieldValues(int i) {
        return this.controllingFieldValues[i];
    }

    public void setControllingFieldValues(int i, java.lang.String _value) {
        this.controllingFieldValues[i] = _value;
    }


    /**
     * Gets the converted value for this PicklistValue.
     * 
     * @return converted
     */
    public java.lang.Boolean getConverted() {
        return converted;
    }


    /**
     * Sets the converted value for this PicklistValue.
     * 
     * @param converted
     */
    public void setConverted(java.lang.Boolean converted) {
        this.converted = converted;
    }


    /**
     * Gets the cssExposed value for this PicklistValue.
     * 
     * @return cssExposed
     */
    public java.lang.Boolean getCssExposed() {
        return cssExposed;
    }


    /**
     * Sets the cssExposed value for this PicklistValue.
     * 
     * @param cssExposed
     */
    public void setCssExposed(java.lang.Boolean cssExposed) {
        this.cssExposed = cssExposed;
    }


    /**
     * Gets the _default value for this PicklistValue.
     * 
     * @return _default
     */
    public boolean is_default() {
        return _default;
    }


    /**
     * Sets the _default value for this PicklistValue.
     * 
     * @param _default
     */
    public void set_default(boolean _default) {
        this._default = _default;
    }


    /**
     * Gets the description value for this PicklistValue.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PicklistValue.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the forecastCategory value for this PicklistValue.
     * 
     * @return forecastCategory
     */
    public com.sforce.soap._2006._04.metadata.ForecastCategories getForecastCategory() {
        return forecastCategory;
    }


    /**
     * Sets the forecastCategory value for this PicklistValue.
     * 
     * @param forecastCategory
     */
    public void setForecastCategory(com.sforce.soap._2006._04.metadata.ForecastCategories forecastCategory) {
        this.forecastCategory = forecastCategory;
    }


    /**
     * Gets the highPriority value for this PicklistValue.
     * 
     * @return highPriority
     */
    public java.lang.Boolean getHighPriority() {
        return highPriority;
    }


    /**
     * Sets the highPriority value for this PicklistValue.
     * 
     * @param highPriority
     */
    public void setHighPriority(java.lang.Boolean highPriority) {
        this.highPriority = highPriority;
    }


    /**
     * Gets the probability value for this PicklistValue.
     * 
     * @return probability
     */
    public java.lang.Integer getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this PicklistValue.
     * 
     * @param probability
     */
    public void setProbability(java.lang.Integer probability) {
        this.probability = probability;
    }


    /**
     * Gets the reverseRole value for this PicklistValue.
     * 
     * @return reverseRole
     */
    public java.lang.String getReverseRole() {
        return reverseRole;
    }


    /**
     * Sets the reverseRole value for this PicklistValue.
     * 
     * @param reverseRole
     */
    public void setReverseRole(java.lang.String reverseRole) {
        this.reverseRole = reverseRole;
    }


    /**
     * Gets the reviewed value for this PicklistValue.
     * 
     * @return reviewed
     */
    public java.lang.Boolean getReviewed() {
        return reviewed;
    }


    /**
     * Sets the reviewed value for this PicklistValue.
     * 
     * @param reviewed
     */
    public void setReviewed(java.lang.Boolean reviewed) {
        this.reviewed = reviewed;
    }


    /**
     * Gets the won value for this PicklistValue.
     * 
     * @return won
     */
    public java.lang.Boolean getWon() {
        return won;
    }


    /**
     * Sets the won value for this PicklistValue.
     * 
     * @param won
     */
    public void setWon(java.lang.Boolean won) {
        this.won = won;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PicklistValue)) return false;
        PicklistValue other = (PicklistValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowEmail==null && other.getAllowEmail()==null) || 
             (this.allowEmail!=null &&
              this.allowEmail.equals(other.getAllowEmail()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.controllingFieldValues==null && other.getControllingFieldValues()==null) || 
             (this.controllingFieldValues!=null &&
              java.util.Arrays.equals(this.controllingFieldValues, other.getControllingFieldValues()))) &&
            ((this.converted==null && other.getConverted()==null) || 
             (this.converted!=null &&
              this.converted.equals(other.getConverted()))) &&
            ((this.cssExposed==null && other.getCssExposed()==null) || 
             (this.cssExposed!=null &&
              this.cssExposed.equals(other.getCssExposed()))) &&
            this._default == other.is_default() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.forecastCategory==null && other.getForecastCategory()==null) || 
             (this.forecastCategory!=null &&
              this.forecastCategory.equals(other.getForecastCategory()))) &&
            ((this.highPriority==null && other.getHighPriority()==null) || 
             (this.highPriority!=null &&
              this.highPriority.equals(other.getHighPriority()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.reverseRole==null && other.getReverseRole()==null) || 
             (this.reverseRole!=null &&
              this.reverseRole.equals(other.getReverseRole()))) &&
            ((this.reviewed==null && other.getReviewed()==null) || 
             (this.reviewed!=null &&
              this.reviewed.equals(other.getReviewed()))) &&
            ((this.won==null && other.getWon()==null) || 
             (this.won!=null &&
              this.won.equals(other.getWon())));
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
        if (getAllowEmail() != null) {
            _hashCode += getAllowEmail().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getControllingFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControllingFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControllingFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConverted() != null) {
            _hashCode += getConverted().hashCode();
        }
        if (getCssExposed() != null) {
            _hashCode += getCssExposed().hashCode();
        }
        _hashCode += (is_default() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getForecastCategory() != null) {
            _hashCode += getForecastCategory().hashCode();
        }
        if (getHighPriority() != null) {
            _hashCode += getHighPriority().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getReverseRole() != null) {
            _hashCode += getReverseRole().hashCode();
        }
        if (getReviewed() != null) {
            _hashCode += getReviewed().hashCode();
        }
        if (getWon() != null) {
            _hashCode += getWon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PicklistValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PicklistValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllingFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "controllingFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "converted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssExposed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "cssExposed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("forecastCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forecastCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastCategories"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "highPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reverseRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reviewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "won"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
