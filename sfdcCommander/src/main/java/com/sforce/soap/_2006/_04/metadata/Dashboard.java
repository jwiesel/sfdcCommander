/**
 * Dashboard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Dashboard  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String backgroundEndColor;

    private com.sforce.soap._2006._04.metadata.ChartBackgroundDirection backgroundFadeDirection;

    private java.lang.String backgroundStartColor;

    private com.sforce.soap._2006._04.metadata.DashboardFilter[] dashboardFilters;

    private java.lang.String dashboardResultRefreshedDate;

    private java.lang.String dashboardResultRunningUser;

    private com.sforce.soap._2006._04.metadata.DashboardType dashboardType;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.DashboardComponentSection leftSection;

    private com.sforce.soap._2006._04.metadata.DashboardComponentSection middleSection;

    private com.sforce.soap._2006._04.metadata.DashboardComponentSection rightSection;

    private java.lang.String runningUser;

    private java.lang.String textColor;

    private java.lang.String title;

    private java.lang.String titleColor;

    private int titleSize;

    public Dashboard() {
    }

    public Dashboard(
           java.lang.String fullName,
           java.lang.String backgroundEndColor,
           com.sforce.soap._2006._04.metadata.ChartBackgroundDirection backgroundFadeDirection,
           java.lang.String backgroundStartColor,
           com.sforce.soap._2006._04.metadata.DashboardFilter[] dashboardFilters,
           java.lang.String dashboardResultRefreshedDate,
           java.lang.String dashboardResultRunningUser,
           com.sforce.soap._2006._04.metadata.DashboardType dashboardType,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.DashboardComponentSection leftSection,
           com.sforce.soap._2006._04.metadata.DashboardComponentSection middleSection,
           com.sforce.soap._2006._04.metadata.DashboardComponentSection rightSection,
           java.lang.String runningUser,
           java.lang.String textColor,
           java.lang.String title,
           java.lang.String titleColor,
           int titleSize) {
        super(
            fullName);
        this.backgroundEndColor = backgroundEndColor;
        this.backgroundFadeDirection = backgroundFadeDirection;
        this.backgroundStartColor = backgroundStartColor;
        this.dashboardFilters = dashboardFilters;
        this.dashboardResultRefreshedDate = dashboardResultRefreshedDate;
        this.dashboardResultRunningUser = dashboardResultRunningUser;
        this.dashboardType = dashboardType;
        this.description = description;
        this.leftSection = leftSection;
        this.middleSection = middleSection;
        this.rightSection = rightSection;
        this.runningUser = runningUser;
        this.textColor = textColor;
        this.title = title;
        this.titleColor = titleColor;
        this.titleSize = titleSize;
    }


    /**
     * Gets the backgroundEndColor value for this Dashboard.
     * 
     * @return backgroundEndColor
     */
    public java.lang.String getBackgroundEndColor() {
        return backgroundEndColor;
    }


    /**
     * Sets the backgroundEndColor value for this Dashboard.
     * 
     * @param backgroundEndColor
     */
    public void setBackgroundEndColor(java.lang.String backgroundEndColor) {
        this.backgroundEndColor = backgroundEndColor;
    }


    /**
     * Gets the backgroundFadeDirection value for this Dashboard.
     * 
     * @return backgroundFadeDirection
     */
    public com.sforce.soap._2006._04.metadata.ChartBackgroundDirection getBackgroundFadeDirection() {
        return backgroundFadeDirection;
    }


    /**
     * Sets the backgroundFadeDirection value for this Dashboard.
     * 
     * @param backgroundFadeDirection
     */
    public void setBackgroundFadeDirection(com.sforce.soap._2006._04.metadata.ChartBackgroundDirection backgroundFadeDirection) {
        this.backgroundFadeDirection = backgroundFadeDirection;
    }


    /**
     * Gets the backgroundStartColor value for this Dashboard.
     * 
     * @return backgroundStartColor
     */
    public java.lang.String getBackgroundStartColor() {
        return backgroundStartColor;
    }


    /**
     * Sets the backgroundStartColor value for this Dashboard.
     * 
     * @param backgroundStartColor
     */
    public void setBackgroundStartColor(java.lang.String backgroundStartColor) {
        this.backgroundStartColor = backgroundStartColor;
    }


    /**
     * Gets the dashboardFilters value for this Dashboard.
     * 
     * @return dashboardFilters
     */
    public com.sforce.soap._2006._04.metadata.DashboardFilter[] getDashboardFilters() {
        return dashboardFilters;
    }


    /**
     * Sets the dashboardFilters value for this Dashboard.
     * 
     * @param dashboardFilters
     */
    public void setDashboardFilters(com.sforce.soap._2006._04.metadata.DashboardFilter[] dashboardFilters) {
        this.dashboardFilters = dashboardFilters;
    }

    public com.sforce.soap._2006._04.metadata.DashboardFilter getDashboardFilters(int i) {
        return this.dashboardFilters[i];
    }

    public void setDashboardFilters(int i, com.sforce.soap._2006._04.metadata.DashboardFilter _value) {
        this.dashboardFilters[i] = _value;
    }


    /**
     * Gets the dashboardResultRefreshedDate value for this Dashboard.
     * 
     * @return dashboardResultRefreshedDate
     */
    public java.lang.String getDashboardResultRefreshedDate() {
        return dashboardResultRefreshedDate;
    }


    /**
     * Sets the dashboardResultRefreshedDate value for this Dashboard.
     * 
     * @param dashboardResultRefreshedDate
     */
    public void setDashboardResultRefreshedDate(java.lang.String dashboardResultRefreshedDate) {
        this.dashboardResultRefreshedDate = dashboardResultRefreshedDate;
    }


    /**
     * Gets the dashboardResultRunningUser value for this Dashboard.
     * 
     * @return dashboardResultRunningUser
     */
    public java.lang.String getDashboardResultRunningUser() {
        return dashboardResultRunningUser;
    }


    /**
     * Sets the dashboardResultRunningUser value for this Dashboard.
     * 
     * @param dashboardResultRunningUser
     */
    public void setDashboardResultRunningUser(java.lang.String dashboardResultRunningUser) {
        this.dashboardResultRunningUser = dashboardResultRunningUser;
    }


    /**
     * Gets the dashboardType value for this Dashboard.
     * 
     * @return dashboardType
     */
    public com.sforce.soap._2006._04.metadata.DashboardType getDashboardType() {
        return dashboardType;
    }


    /**
     * Sets the dashboardType value for this Dashboard.
     * 
     * @param dashboardType
     */
    public void setDashboardType(com.sforce.soap._2006._04.metadata.DashboardType dashboardType) {
        this.dashboardType = dashboardType;
    }


    /**
     * Gets the description value for this Dashboard.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Dashboard.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the leftSection value for this Dashboard.
     * 
     * @return leftSection
     */
    public com.sforce.soap._2006._04.metadata.DashboardComponentSection getLeftSection() {
        return leftSection;
    }


    /**
     * Sets the leftSection value for this Dashboard.
     * 
     * @param leftSection
     */
    public void setLeftSection(com.sforce.soap._2006._04.metadata.DashboardComponentSection leftSection) {
        this.leftSection = leftSection;
    }


    /**
     * Gets the middleSection value for this Dashboard.
     * 
     * @return middleSection
     */
    public com.sforce.soap._2006._04.metadata.DashboardComponentSection getMiddleSection() {
        return middleSection;
    }


    /**
     * Sets the middleSection value for this Dashboard.
     * 
     * @param middleSection
     */
    public void setMiddleSection(com.sforce.soap._2006._04.metadata.DashboardComponentSection middleSection) {
        this.middleSection = middleSection;
    }


    /**
     * Gets the rightSection value for this Dashboard.
     * 
     * @return rightSection
     */
    public com.sforce.soap._2006._04.metadata.DashboardComponentSection getRightSection() {
        return rightSection;
    }


    /**
     * Sets the rightSection value for this Dashboard.
     * 
     * @param rightSection
     */
    public void setRightSection(com.sforce.soap._2006._04.metadata.DashboardComponentSection rightSection) {
        this.rightSection = rightSection;
    }


    /**
     * Gets the runningUser value for this Dashboard.
     * 
     * @return runningUser
     */
    public java.lang.String getRunningUser() {
        return runningUser;
    }


    /**
     * Sets the runningUser value for this Dashboard.
     * 
     * @param runningUser
     */
    public void setRunningUser(java.lang.String runningUser) {
        this.runningUser = runningUser;
    }


    /**
     * Gets the textColor value for this Dashboard.
     * 
     * @return textColor
     */
    public java.lang.String getTextColor() {
        return textColor;
    }


    /**
     * Sets the textColor value for this Dashboard.
     * 
     * @param textColor
     */
    public void setTextColor(java.lang.String textColor) {
        this.textColor = textColor;
    }


    /**
     * Gets the title value for this Dashboard.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Dashboard.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the titleColor value for this Dashboard.
     * 
     * @return titleColor
     */
    public java.lang.String getTitleColor() {
        return titleColor;
    }


    /**
     * Sets the titleColor value for this Dashboard.
     * 
     * @param titleColor
     */
    public void setTitleColor(java.lang.String titleColor) {
        this.titleColor = titleColor;
    }


    /**
     * Gets the titleSize value for this Dashboard.
     * 
     * @return titleSize
     */
    public int getTitleSize() {
        return titleSize;
    }


    /**
     * Sets the titleSize value for this Dashboard.
     * 
     * @param titleSize
     */
    public void setTitleSize(int titleSize) {
        this.titleSize = titleSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dashboard)) return false;
        Dashboard other = (Dashboard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.backgroundEndColor==null && other.getBackgroundEndColor()==null) || 
             (this.backgroundEndColor!=null &&
              this.backgroundEndColor.equals(other.getBackgroundEndColor()))) &&
            ((this.backgroundFadeDirection==null && other.getBackgroundFadeDirection()==null) || 
             (this.backgroundFadeDirection!=null &&
              this.backgroundFadeDirection.equals(other.getBackgroundFadeDirection()))) &&
            ((this.backgroundStartColor==null && other.getBackgroundStartColor()==null) || 
             (this.backgroundStartColor!=null &&
              this.backgroundStartColor.equals(other.getBackgroundStartColor()))) &&
            ((this.dashboardFilters==null && other.getDashboardFilters()==null) || 
             (this.dashboardFilters!=null &&
              java.util.Arrays.equals(this.dashboardFilters, other.getDashboardFilters()))) &&
            ((this.dashboardResultRefreshedDate==null && other.getDashboardResultRefreshedDate()==null) || 
             (this.dashboardResultRefreshedDate!=null &&
              this.dashboardResultRefreshedDate.equals(other.getDashboardResultRefreshedDate()))) &&
            ((this.dashboardResultRunningUser==null && other.getDashboardResultRunningUser()==null) || 
             (this.dashboardResultRunningUser!=null &&
              this.dashboardResultRunningUser.equals(other.getDashboardResultRunningUser()))) &&
            ((this.dashboardType==null && other.getDashboardType()==null) || 
             (this.dashboardType!=null &&
              this.dashboardType.equals(other.getDashboardType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.leftSection==null && other.getLeftSection()==null) || 
             (this.leftSection!=null &&
              this.leftSection.equals(other.getLeftSection()))) &&
            ((this.middleSection==null && other.getMiddleSection()==null) || 
             (this.middleSection!=null &&
              this.middleSection.equals(other.getMiddleSection()))) &&
            ((this.rightSection==null && other.getRightSection()==null) || 
             (this.rightSection!=null &&
              this.rightSection.equals(other.getRightSection()))) &&
            ((this.runningUser==null && other.getRunningUser()==null) || 
             (this.runningUser!=null &&
              this.runningUser.equals(other.getRunningUser()))) &&
            ((this.textColor==null && other.getTextColor()==null) || 
             (this.textColor!=null &&
              this.textColor.equals(other.getTextColor()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.titleColor==null && other.getTitleColor()==null) || 
             (this.titleColor!=null &&
              this.titleColor.equals(other.getTitleColor()))) &&
            this.titleSize == other.getTitleSize();
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
        if (getBackgroundEndColor() != null) {
            _hashCode += getBackgroundEndColor().hashCode();
        }
        if (getBackgroundFadeDirection() != null) {
            _hashCode += getBackgroundFadeDirection().hashCode();
        }
        if (getBackgroundStartColor() != null) {
            _hashCode += getBackgroundStartColor().hashCode();
        }
        if (getDashboardFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDashboardFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDashboardFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDashboardResultRefreshedDate() != null) {
            _hashCode += getDashboardResultRefreshedDate().hashCode();
        }
        if (getDashboardResultRunningUser() != null) {
            _hashCode += getDashboardResultRunningUser().hashCode();
        }
        if (getDashboardType() != null) {
            _hashCode += getDashboardType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLeftSection() != null) {
            _hashCode += getLeftSection().hashCode();
        }
        if (getMiddleSection() != null) {
            _hashCode += getMiddleSection().hashCode();
        }
        if (getRightSection() != null) {
            _hashCode += getRightSection().hashCode();
        }
        if (getRunningUser() != null) {
            _hashCode += getRunningUser().hashCode();
        }
        if (getTextColor() != null) {
            _hashCode += getTextColor().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTitleColor() != null) {
            _hashCode += getTitleColor().hashCode();
        }
        _hashCode += getTitleSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dashboard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Dashboard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundEndColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "backgroundEndColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundFadeDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "backgroundFadeDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartBackgroundDirection"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundStartColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "backgroundStartColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardResultRefreshedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardResultRefreshedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardResultRunningUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardResultRunningUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dashboardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardType"));
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
        elemField.setFieldName("leftSection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "leftSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentSection"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleSection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "middleSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightSection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rightSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentSection"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "runningUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "textColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "titleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "titleSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
