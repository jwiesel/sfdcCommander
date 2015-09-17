/**
 * Holiday.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Holiday  implements java.io.Serializable {
    private java.util.Date activityDate;

    private java.lang.String[] businessHours;

    private java.lang.String description;

    private org.apache.axis.types.Time endTime;

    private java.lang.Boolean isRecurring;

    private java.lang.String name;

    private java.lang.Integer recurrenceDayOfMonth;

    private java.lang.String[] recurrenceDayOfWeek;

    private java.lang.Integer recurrenceDayOfWeekMask;

    private java.util.Date recurrenceEndDate;

    private java.lang.String recurrenceInstance;

    private java.lang.Integer recurrenceInterval;

    private java.lang.String recurrenceMonthOfYear;

    private java.util.Date recurrenceStartDate;

    private java.lang.String recurrenceType;

    private org.apache.axis.types.Time startTime;

    public Holiday() {
    }

    public Holiday(
           java.util.Date activityDate,
           java.lang.String[] businessHours,
           java.lang.String description,
           org.apache.axis.types.Time endTime,
           java.lang.Boolean isRecurring,
           java.lang.String name,
           java.lang.Integer recurrenceDayOfMonth,
           java.lang.String[] recurrenceDayOfWeek,
           java.lang.Integer recurrenceDayOfWeekMask,
           java.util.Date recurrenceEndDate,
           java.lang.String recurrenceInstance,
           java.lang.Integer recurrenceInterval,
           java.lang.String recurrenceMonthOfYear,
           java.util.Date recurrenceStartDate,
           java.lang.String recurrenceType,
           org.apache.axis.types.Time startTime) {
           this.activityDate = activityDate;
           this.businessHours = businessHours;
           this.description = description;
           this.endTime = endTime;
           this.isRecurring = isRecurring;
           this.name = name;
           this.recurrenceDayOfMonth = recurrenceDayOfMonth;
           this.recurrenceDayOfWeek = recurrenceDayOfWeek;
           this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
           this.recurrenceEndDate = recurrenceEndDate;
           this.recurrenceInstance = recurrenceInstance;
           this.recurrenceInterval = recurrenceInterval;
           this.recurrenceMonthOfYear = recurrenceMonthOfYear;
           this.recurrenceStartDate = recurrenceStartDate;
           this.recurrenceType = recurrenceType;
           this.startTime = startTime;
    }


    /**
     * Gets the activityDate value for this Holiday.
     * 
     * @return activityDate
     */
    public java.util.Date getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this Holiday.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.util.Date activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the businessHours value for this Holiday.
     * 
     * @return businessHours
     */
    public java.lang.String[] getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this Holiday.
     * 
     * @param businessHours
     */
    public void setBusinessHours(java.lang.String[] businessHours) {
        this.businessHours = businessHours;
    }

    public java.lang.String getBusinessHours(int i) {
        return this.businessHours[i];
    }

    public void setBusinessHours(int i, java.lang.String _value) {
        this.businessHours[i] = _value;
    }


    /**
     * Gets the description value for this Holiday.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Holiday.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endTime value for this Holiday.
     * 
     * @return endTime
     */
    public org.apache.axis.types.Time getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this Holiday.
     * 
     * @param endTime
     */
    public void setEndTime(org.apache.axis.types.Time endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the isRecurring value for this Holiday.
     * 
     * @return isRecurring
     */
    public java.lang.Boolean getIsRecurring() {
        return isRecurring;
    }


    /**
     * Sets the isRecurring value for this Holiday.
     * 
     * @param isRecurring
     */
    public void setIsRecurring(java.lang.Boolean isRecurring) {
        this.isRecurring = isRecurring;
    }


    /**
     * Gets the name value for this Holiday.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Holiday.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the recurrenceDayOfMonth value for this Holiday.
     * 
     * @return recurrenceDayOfMonth
     */
    public java.lang.Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }


    /**
     * Sets the recurrenceDayOfMonth value for this Holiday.
     * 
     * @param recurrenceDayOfMonth
     */
    public void setRecurrenceDayOfMonth(java.lang.Integer recurrenceDayOfMonth) {
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    }


    /**
     * Gets the recurrenceDayOfWeek value for this Holiday.
     * 
     * @return recurrenceDayOfWeek
     */
    public java.lang.String[] getRecurrenceDayOfWeek() {
        return recurrenceDayOfWeek;
    }


    /**
     * Sets the recurrenceDayOfWeek value for this Holiday.
     * 
     * @param recurrenceDayOfWeek
     */
    public void setRecurrenceDayOfWeek(java.lang.String[] recurrenceDayOfWeek) {
        this.recurrenceDayOfWeek = recurrenceDayOfWeek;
    }

    public java.lang.String getRecurrenceDayOfWeek(int i) {
        return this.recurrenceDayOfWeek[i];
    }

    public void setRecurrenceDayOfWeek(int i, java.lang.String _value) {
        this.recurrenceDayOfWeek[i] = _value;
    }


    /**
     * Gets the recurrenceDayOfWeekMask value for this Holiday.
     * 
     * @return recurrenceDayOfWeekMask
     */
    public java.lang.Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }


    /**
     * Sets the recurrenceDayOfWeekMask value for this Holiday.
     * 
     * @param recurrenceDayOfWeekMask
     */
    public void setRecurrenceDayOfWeekMask(java.lang.Integer recurrenceDayOfWeekMask) {
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
    }


    /**
     * Gets the recurrenceEndDate value for this Holiday.
     * 
     * @return recurrenceEndDate
     */
    public java.util.Date getRecurrenceEndDate() {
        return recurrenceEndDate;
    }


    /**
     * Sets the recurrenceEndDate value for this Holiday.
     * 
     * @param recurrenceEndDate
     */
    public void setRecurrenceEndDate(java.util.Date recurrenceEndDate) {
        this.recurrenceEndDate = recurrenceEndDate;
    }


    /**
     * Gets the recurrenceInstance value for this Holiday.
     * 
     * @return recurrenceInstance
     */
    public java.lang.String getRecurrenceInstance() {
        return recurrenceInstance;
    }


    /**
     * Sets the recurrenceInstance value for this Holiday.
     * 
     * @param recurrenceInstance
     */
    public void setRecurrenceInstance(java.lang.String recurrenceInstance) {
        this.recurrenceInstance = recurrenceInstance;
    }


    /**
     * Gets the recurrenceInterval value for this Holiday.
     * 
     * @return recurrenceInterval
     */
    public java.lang.Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }


    /**
     * Sets the recurrenceInterval value for this Holiday.
     * 
     * @param recurrenceInterval
     */
    public void setRecurrenceInterval(java.lang.Integer recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
    }


    /**
     * Gets the recurrenceMonthOfYear value for this Holiday.
     * 
     * @return recurrenceMonthOfYear
     */
    public java.lang.String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }


    /**
     * Sets the recurrenceMonthOfYear value for this Holiday.
     * 
     * @param recurrenceMonthOfYear
     */
    public void setRecurrenceMonthOfYear(java.lang.String recurrenceMonthOfYear) {
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    }


    /**
     * Gets the recurrenceStartDate value for this Holiday.
     * 
     * @return recurrenceStartDate
     */
    public java.util.Date getRecurrenceStartDate() {
        return recurrenceStartDate;
    }


    /**
     * Sets the recurrenceStartDate value for this Holiday.
     * 
     * @param recurrenceStartDate
     */
    public void setRecurrenceStartDate(java.util.Date recurrenceStartDate) {
        this.recurrenceStartDate = recurrenceStartDate;
    }


    /**
     * Gets the recurrenceType value for this Holiday.
     * 
     * @return recurrenceType
     */
    public java.lang.String getRecurrenceType() {
        return recurrenceType;
    }


    /**
     * Sets the recurrenceType value for this Holiday.
     * 
     * @param recurrenceType
     */
    public void setRecurrenceType(java.lang.String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }


    /**
     * Gets the startTime value for this Holiday.
     * 
     * @return startTime
     */
    public org.apache.axis.types.Time getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this Holiday.
     * 
     * @param startTime
     */
    public void setStartTime(org.apache.axis.types.Time startTime) {
        this.startTime = startTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Holiday)) return false;
        Holiday other = (Holiday) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              java.util.Arrays.equals(this.businessHours, other.getBusinessHours()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.isRecurring==null && other.getIsRecurring()==null) || 
             (this.isRecurring!=null &&
              this.isRecurring.equals(other.getIsRecurring()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.recurrenceDayOfMonth==null && other.getRecurrenceDayOfMonth()==null) || 
             (this.recurrenceDayOfMonth!=null &&
              this.recurrenceDayOfMonth.equals(other.getRecurrenceDayOfMonth()))) &&
            ((this.recurrenceDayOfWeek==null && other.getRecurrenceDayOfWeek()==null) || 
             (this.recurrenceDayOfWeek!=null &&
              java.util.Arrays.equals(this.recurrenceDayOfWeek, other.getRecurrenceDayOfWeek()))) &&
            ((this.recurrenceDayOfWeekMask==null && other.getRecurrenceDayOfWeekMask()==null) || 
             (this.recurrenceDayOfWeekMask!=null &&
              this.recurrenceDayOfWeekMask.equals(other.getRecurrenceDayOfWeekMask()))) &&
            ((this.recurrenceEndDate==null && other.getRecurrenceEndDate()==null) || 
             (this.recurrenceEndDate!=null &&
              this.recurrenceEndDate.equals(other.getRecurrenceEndDate()))) &&
            ((this.recurrenceInstance==null && other.getRecurrenceInstance()==null) || 
             (this.recurrenceInstance!=null &&
              this.recurrenceInstance.equals(other.getRecurrenceInstance()))) &&
            ((this.recurrenceInterval==null && other.getRecurrenceInterval()==null) || 
             (this.recurrenceInterval!=null &&
              this.recurrenceInterval.equals(other.getRecurrenceInterval()))) &&
            ((this.recurrenceMonthOfYear==null && other.getRecurrenceMonthOfYear()==null) || 
             (this.recurrenceMonthOfYear!=null &&
              this.recurrenceMonthOfYear.equals(other.getRecurrenceMonthOfYear()))) &&
            ((this.recurrenceStartDate==null && other.getRecurrenceStartDate()==null) || 
             (this.recurrenceStartDate!=null &&
              this.recurrenceStartDate.equals(other.getRecurrenceStartDate()))) &&
            ((this.recurrenceType==null && other.getRecurrenceType()==null) || 
             (this.recurrenceType!=null &&
              this.recurrenceType.equals(other.getRecurrenceType()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime())));
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
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
        }
        if (getBusinessHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessHours(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getIsRecurring() != null) {
            _hashCode += getIsRecurring().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRecurrenceDayOfMonth() != null) {
            _hashCode += getRecurrenceDayOfMonth().hashCode();
        }
        if (getRecurrenceDayOfWeek() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurrenceDayOfWeek());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurrenceDayOfWeek(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurrenceDayOfWeekMask() != null) {
            _hashCode += getRecurrenceDayOfWeekMask().hashCode();
        }
        if (getRecurrenceEndDate() != null) {
            _hashCode += getRecurrenceEndDate().hashCode();
        }
        if (getRecurrenceInstance() != null) {
            _hashCode += getRecurrenceInstance().hashCode();
        }
        if (getRecurrenceInterval() != null) {
            _hashCode += getRecurrenceInterval().hashCode();
        }
        if (getRecurrenceMonthOfYear() != null) {
            _hashCode += getRecurrenceMonthOfYear().hashCode();
        }
        if (getRecurrenceStartDate() != null) {
            _hashCode += getRecurrenceStartDate().hashCode();
        }
        if (getRecurrenceType() != null) {
            _hashCode += getRecurrenceType().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Holiday.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Holiday"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "activityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "businessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRecurring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isRecurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("recurrenceDayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceDayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfWeekMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceDayOfWeekMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceMonthOfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceMonthOfYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recurrenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "startTime"));
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
