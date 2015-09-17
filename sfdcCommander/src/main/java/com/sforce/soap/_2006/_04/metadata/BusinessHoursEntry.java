/**
 * BusinessHoursEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class BusinessHoursEntry  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean active;

    private boolean _default;

    private org.apache.axis.types.Time fridayEndTime;

    private org.apache.axis.types.Time fridayStartTime;

    private org.apache.axis.types.Time mondayEndTime;

    private org.apache.axis.types.Time mondayStartTime;

    private java.lang.String name;

    private org.apache.axis.types.Time saturdayEndTime;

    private org.apache.axis.types.Time saturdayStartTime;

    private org.apache.axis.types.Time sundayEndTime;

    private org.apache.axis.types.Time sundayStartTime;

    private org.apache.axis.types.Time thursdayEndTime;

    private org.apache.axis.types.Time thursdayStartTime;

    private java.lang.String timeZoneId;

    private org.apache.axis.types.Time tuesdayEndTime;

    private org.apache.axis.types.Time tuesdayStartTime;

    private org.apache.axis.types.Time wednesdayEndTime;

    private org.apache.axis.types.Time wednesdayStartTime;

    public BusinessHoursEntry() {
    }

    public BusinessHoursEntry(
           java.lang.String fullName,
           java.lang.Boolean active,
           boolean _default,
           org.apache.axis.types.Time fridayEndTime,
           org.apache.axis.types.Time fridayStartTime,
           org.apache.axis.types.Time mondayEndTime,
           org.apache.axis.types.Time mondayStartTime,
           java.lang.String name,
           org.apache.axis.types.Time saturdayEndTime,
           org.apache.axis.types.Time saturdayStartTime,
           org.apache.axis.types.Time sundayEndTime,
           org.apache.axis.types.Time sundayStartTime,
           org.apache.axis.types.Time thursdayEndTime,
           org.apache.axis.types.Time thursdayStartTime,
           java.lang.String timeZoneId,
           org.apache.axis.types.Time tuesdayEndTime,
           org.apache.axis.types.Time tuesdayStartTime,
           org.apache.axis.types.Time wednesdayEndTime,
           org.apache.axis.types.Time wednesdayStartTime) {
        super(
            fullName);
        this.active = active;
        this._default = _default;
        this.fridayEndTime = fridayEndTime;
        this.fridayStartTime = fridayStartTime;
        this.mondayEndTime = mondayEndTime;
        this.mondayStartTime = mondayStartTime;
        this.name = name;
        this.saturdayEndTime = saturdayEndTime;
        this.saturdayStartTime = saturdayStartTime;
        this.sundayEndTime = sundayEndTime;
        this.sundayStartTime = sundayStartTime;
        this.thursdayEndTime = thursdayEndTime;
        this.thursdayStartTime = thursdayStartTime;
        this.timeZoneId = timeZoneId;
        this.tuesdayEndTime = tuesdayEndTime;
        this.tuesdayStartTime = tuesdayStartTime;
        this.wednesdayEndTime = wednesdayEndTime;
        this.wednesdayStartTime = wednesdayStartTime;
    }


    /**
     * Gets the active value for this BusinessHoursEntry.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this BusinessHoursEntry.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the _default value for this BusinessHoursEntry.
     * 
     * @return _default
     */
    public boolean is_default() {
        return _default;
    }


    /**
     * Sets the _default value for this BusinessHoursEntry.
     * 
     * @param _default
     */
    public void set_default(boolean _default) {
        this._default = _default;
    }


    /**
     * Gets the fridayEndTime value for this BusinessHoursEntry.
     * 
     * @return fridayEndTime
     */
    public org.apache.axis.types.Time getFridayEndTime() {
        return fridayEndTime;
    }


    /**
     * Sets the fridayEndTime value for this BusinessHoursEntry.
     * 
     * @param fridayEndTime
     */
    public void setFridayEndTime(org.apache.axis.types.Time fridayEndTime) {
        this.fridayEndTime = fridayEndTime;
    }


    /**
     * Gets the fridayStartTime value for this BusinessHoursEntry.
     * 
     * @return fridayStartTime
     */
    public org.apache.axis.types.Time getFridayStartTime() {
        return fridayStartTime;
    }


    /**
     * Sets the fridayStartTime value for this BusinessHoursEntry.
     * 
     * @param fridayStartTime
     */
    public void setFridayStartTime(org.apache.axis.types.Time fridayStartTime) {
        this.fridayStartTime = fridayStartTime;
    }


    /**
     * Gets the mondayEndTime value for this BusinessHoursEntry.
     * 
     * @return mondayEndTime
     */
    public org.apache.axis.types.Time getMondayEndTime() {
        return mondayEndTime;
    }


    /**
     * Sets the mondayEndTime value for this BusinessHoursEntry.
     * 
     * @param mondayEndTime
     */
    public void setMondayEndTime(org.apache.axis.types.Time mondayEndTime) {
        this.mondayEndTime = mondayEndTime;
    }


    /**
     * Gets the mondayStartTime value for this BusinessHoursEntry.
     * 
     * @return mondayStartTime
     */
    public org.apache.axis.types.Time getMondayStartTime() {
        return mondayStartTime;
    }


    /**
     * Sets the mondayStartTime value for this BusinessHoursEntry.
     * 
     * @param mondayStartTime
     */
    public void setMondayStartTime(org.apache.axis.types.Time mondayStartTime) {
        this.mondayStartTime = mondayStartTime;
    }


    /**
     * Gets the name value for this BusinessHoursEntry.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BusinessHoursEntry.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the saturdayEndTime value for this BusinessHoursEntry.
     * 
     * @return saturdayEndTime
     */
    public org.apache.axis.types.Time getSaturdayEndTime() {
        return saturdayEndTime;
    }


    /**
     * Sets the saturdayEndTime value for this BusinessHoursEntry.
     * 
     * @param saturdayEndTime
     */
    public void setSaturdayEndTime(org.apache.axis.types.Time saturdayEndTime) {
        this.saturdayEndTime = saturdayEndTime;
    }


    /**
     * Gets the saturdayStartTime value for this BusinessHoursEntry.
     * 
     * @return saturdayStartTime
     */
    public org.apache.axis.types.Time getSaturdayStartTime() {
        return saturdayStartTime;
    }


    /**
     * Sets the saturdayStartTime value for this BusinessHoursEntry.
     * 
     * @param saturdayStartTime
     */
    public void setSaturdayStartTime(org.apache.axis.types.Time saturdayStartTime) {
        this.saturdayStartTime = saturdayStartTime;
    }


    /**
     * Gets the sundayEndTime value for this BusinessHoursEntry.
     * 
     * @return sundayEndTime
     */
    public org.apache.axis.types.Time getSundayEndTime() {
        return sundayEndTime;
    }


    /**
     * Sets the sundayEndTime value for this BusinessHoursEntry.
     * 
     * @param sundayEndTime
     */
    public void setSundayEndTime(org.apache.axis.types.Time sundayEndTime) {
        this.sundayEndTime = sundayEndTime;
    }


    /**
     * Gets the sundayStartTime value for this BusinessHoursEntry.
     * 
     * @return sundayStartTime
     */
    public org.apache.axis.types.Time getSundayStartTime() {
        return sundayStartTime;
    }


    /**
     * Sets the sundayStartTime value for this BusinessHoursEntry.
     * 
     * @param sundayStartTime
     */
    public void setSundayStartTime(org.apache.axis.types.Time sundayStartTime) {
        this.sundayStartTime = sundayStartTime;
    }


    /**
     * Gets the thursdayEndTime value for this BusinessHoursEntry.
     * 
     * @return thursdayEndTime
     */
    public org.apache.axis.types.Time getThursdayEndTime() {
        return thursdayEndTime;
    }


    /**
     * Sets the thursdayEndTime value for this BusinessHoursEntry.
     * 
     * @param thursdayEndTime
     */
    public void setThursdayEndTime(org.apache.axis.types.Time thursdayEndTime) {
        this.thursdayEndTime = thursdayEndTime;
    }


    /**
     * Gets the thursdayStartTime value for this BusinessHoursEntry.
     * 
     * @return thursdayStartTime
     */
    public org.apache.axis.types.Time getThursdayStartTime() {
        return thursdayStartTime;
    }


    /**
     * Sets the thursdayStartTime value for this BusinessHoursEntry.
     * 
     * @param thursdayStartTime
     */
    public void setThursdayStartTime(org.apache.axis.types.Time thursdayStartTime) {
        this.thursdayStartTime = thursdayStartTime;
    }


    /**
     * Gets the timeZoneId value for this BusinessHoursEntry.
     * 
     * @return timeZoneId
     */
    public java.lang.String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this BusinessHoursEntry.
     * 
     * @param timeZoneId
     */
    public void setTimeZoneId(java.lang.String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the tuesdayEndTime value for this BusinessHoursEntry.
     * 
     * @return tuesdayEndTime
     */
    public org.apache.axis.types.Time getTuesdayEndTime() {
        return tuesdayEndTime;
    }


    /**
     * Sets the tuesdayEndTime value for this BusinessHoursEntry.
     * 
     * @param tuesdayEndTime
     */
    public void setTuesdayEndTime(org.apache.axis.types.Time tuesdayEndTime) {
        this.tuesdayEndTime = tuesdayEndTime;
    }


    /**
     * Gets the tuesdayStartTime value for this BusinessHoursEntry.
     * 
     * @return tuesdayStartTime
     */
    public org.apache.axis.types.Time getTuesdayStartTime() {
        return tuesdayStartTime;
    }


    /**
     * Sets the tuesdayStartTime value for this BusinessHoursEntry.
     * 
     * @param tuesdayStartTime
     */
    public void setTuesdayStartTime(org.apache.axis.types.Time tuesdayStartTime) {
        this.tuesdayStartTime = tuesdayStartTime;
    }


    /**
     * Gets the wednesdayEndTime value for this BusinessHoursEntry.
     * 
     * @return wednesdayEndTime
     */
    public org.apache.axis.types.Time getWednesdayEndTime() {
        return wednesdayEndTime;
    }


    /**
     * Sets the wednesdayEndTime value for this BusinessHoursEntry.
     * 
     * @param wednesdayEndTime
     */
    public void setWednesdayEndTime(org.apache.axis.types.Time wednesdayEndTime) {
        this.wednesdayEndTime = wednesdayEndTime;
    }


    /**
     * Gets the wednesdayStartTime value for this BusinessHoursEntry.
     * 
     * @return wednesdayStartTime
     */
    public org.apache.axis.types.Time getWednesdayStartTime() {
        return wednesdayStartTime;
    }


    /**
     * Sets the wednesdayStartTime value for this BusinessHoursEntry.
     * 
     * @param wednesdayStartTime
     */
    public void setWednesdayStartTime(org.apache.axis.types.Time wednesdayStartTime) {
        this.wednesdayStartTime = wednesdayStartTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessHoursEntry)) return false;
        BusinessHoursEntry other = (BusinessHoursEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            this._default == other.is_default() &&
            ((this.fridayEndTime==null && other.getFridayEndTime()==null) || 
             (this.fridayEndTime!=null &&
              this.fridayEndTime.equals(other.getFridayEndTime()))) &&
            ((this.fridayStartTime==null && other.getFridayStartTime()==null) || 
             (this.fridayStartTime!=null &&
              this.fridayStartTime.equals(other.getFridayStartTime()))) &&
            ((this.mondayEndTime==null && other.getMondayEndTime()==null) || 
             (this.mondayEndTime!=null &&
              this.mondayEndTime.equals(other.getMondayEndTime()))) &&
            ((this.mondayStartTime==null && other.getMondayStartTime()==null) || 
             (this.mondayStartTime!=null &&
              this.mondayStartTime.equals(other.getMondayStartTime()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.saturdayEndTime==null && other.getSaturdayEndTime()==null) || 
             (this.saturdayEndTime!=null &&
              this.saturdayEndTime.equals(other.getSaturdayEndTime()))) &&
            ((this.saturdayStartTime==null && other.getSaturdayStartTime()==null) || 
             (this.saturdayStartTime!=null &&
              this.saturdayStartTime.equals(other.getSaturdayStartTime()))) &&
            ((this.sundayEndTime==null && other.getSundayEndTime()==null) || 
             (this.sundayEndTime!=null &&
              this.sundayEndTime.equals(other.getSundayEndTime()))) &&
            ((this.sundayStartTime==null && other.getSundayStartTime()==null) || 
             (this.sundayStartTime!=null &&
              this.sundayStartTime.equals(other.getSundayStartTime()))) &&
            ((this.thursdayEndTime==null && other.getThursdayEndTime()==null) || 
             (this.thursdayEndTime!=null &&
              this.thursdayEndTime.equals(other.getThursdayEndTime()))) &&
            ((this.thursdayStartTime==null && other.getThursdayStartTime()==null) || 
             (this.thursdayStartTime!=null &&
              this.thursdayStartTime.equals(other.getThursdayStartTime()))) &&
            ((this.timeZoneId==null && other.getTimeZoneId()==null) || 
             (this.timeZoneId!=null &&
              this.timeZoneId.equals(other.getTimeZoneId()))) &&
            ((this.tuesdayEndTime==null && other.getTuesdayEndTime()==null) || 
             (this.tuesdayEndTime!=null &&
              this.tuesdayEndTime.equals(other.getTuesdayEndTime()))) &&
            ((this.tuesdayStartTime==null && other.getTuesdayStartTime()==null) || 
             (this.tuesdayStartTime!=null &&
              this.tuesdayStartTime.equals(other.getTuesdayStartTime()))) &&
            ((this.wednesdayEndTime==null && other.getWednesdayEndTime()==null) || 
             (this.wednesdayEndTime!=null &&
              this.wednesdayEndTime.equals(other.getWednesdayEndTime()))) &&
            ((this.wednesdayStartTime==null && other.getWednesdayStartTime()==null) || 
             (this.wednesdayStartTime!=null &&
              this.wednesdayStartTime.equals(other.getWednesdayStartTime())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        _hashCode += (is_default() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFridayEndTime() != null) {
            _hashCode += getFridayEndTime().hashCode();
        }
        if (getFridayStartTime() != null) {
            _hashCode += getFridayStartTime().hashCode();
        }
        if (getMondayEndTime() != null) {
            _hashCode += getMondayEndTime().hashCode();
        }
        if (getMondayStartTime() != null) {
            _hashCode += getMondayStartTime().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSaturdayEndTime() != null) {
            _hashCode += getSaturdayEndTime().hashCode();
        }
        if (getSaturdayStartTime() != null) {
            _hashCode += getSaturdayStartTime().hashCode();
        }
        if (getSundayEndTime() != null) {
            _hashCode += getSundayEndTime().hashCode();
        }
        if (getSundayStartTime() != null) {
            _hashCode += getSundayStartTime().hashCode();
        }
        if (getThursdayEndTime() != null) {
            _hashCode += getThursdayEndTime().hashCode();
        }
        if (getThursdayStartTime() != null) {
            _hashCode += getThursdayStartTime().hashCode();
        }
        if (getTimeZoneId() != null) {
            _hashCode += getTimeZoneId().hashCode();
        }
        if (getTuesdayEndTime() != null) {
            _hashCode += getTuesdayEndTime().hashCode();
        }
        if (getTuesdayStartTime() != null) {
            _hashCode += getTuesdayStartTime().hashCode();
        }
        if (getWednesdayEndTime() != null) {
            _hashCode += getWednesdayEndTime().hashCode();
        }
        if (getWednesdayStartTime() != null) {
            _hashCode += getWednesdayStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessHoursEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessHoursEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
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
        elemField.setFieldName("fridayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fridayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fridayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mondayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mondayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "saturdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "saturdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sundayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sundayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "thursdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "thursdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "timeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tuesdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tuesdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "wednesdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "wednesdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
