/**
 * UserDateInterval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class UserDateInterval implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserDateInterval(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INTERVAL_CURRENT = "INTERVAL_CURRENT";
    public static final java.lang.String _INTERVAL_CURNEXT1 = "INTERVAL_CURNEXT1";
    public static final java.lang.String _INTERVAL_CURPREV1 = "INTERVAL_CURPREV1";
    public static final java.lang.String _INTERVAL_NEXT1 = "INTERVAL_NEXT1";
    public static final java.lang.String _INTERVAL_PREV1 = "INTERVAL_PREV1";
    public static final java.lang.String _INTERVAL_CURNEXT3 = "INTERVAL_CURNEXT3";
    public static final java.lang.String _INTERVAL_CURFY = "INTERVAL_CURFY";
    public static final java.lang.String _INTERVAL_PREVFY = "INTERVAL_PREVFY";
    public static final java.lang.String _INTERVAL_PREV2FY = "INTERVAL_PREV2FY";
    public static final java.lang.String _INTERVAL_AGO2FY = "INTERVAL_AGO2FY";
    public static final java.lang.String _INTERVAL_NEXTFY = "INTERVAL_NEXTFY";
    public static final java.lang.String _INTERVAL_PREVCURFY = "INTERVAL_PREVCURFY";
    public static final java.lang.String _INTERVAL_PREVCUR2FY = "INTERVAL_PREVCUR2FY";
    public static final java.lang.String _INTERVAL_CURNEXTFY = "INTERVAL_CURNEXTFY";
    public static final java.lang.String _INTERVAL_CUSTOM = "INTERVAL_CUSTOM";
    public static final java.lang.String _INTERVAL_YESTERDAY = "INTERVAL_YESTERDAY";
    public static final java.lang.String _INTERVAL_TODAY = "INTERVAL_TODAY";
    public static final java.lang.String _INTERVAL_TOMORROW = "INTERVAL_TOMORROW";
    public static final java.lang.String _INTERVAL_LASTWEEK = "INTERVAL_LASTWEEK";
    public static final java.lang.String _INTERVAL_THISWEEK = "INTERVAL_THISWEEK";
    public static final java.lang.String _INTERVAL_NEXTWEEK = "INTERVAL_NEXTWEEK";
    public static final java.lang.String _INTERVAL_LASTMONTH = "INTERVAL_LASTMONTH";
    public static final java.lang.String _INTERVAL_THISMONTH = "INTERVAL_THISMONTH";
    public static final java.lang.String _INTERVAL_NEXTMONTH = "INTERVAL_NEXTMONTH";
    public static final java.lang.String _INTERVAL_LASTTHISMONTH = "INTERVAL_LASTTHISMONTH";
    public static final java.lang.String _INTERVAL_THISNEXTMONTH = "INTERVAL_THISNEXTMONTH";
    public static final java.lang.String _INTERVAL_CURRENTQ = "INTERVAL_CURRENTQ";
    public static final java.lang.String _INTERVAL_CURNEXTQ = "INTERVAL_CURNEXTQ";
    public static final java.lang.String _INTERVAL_CURPREVQ = "INTERVAL_CURPREVQ";
    public static final java.lang.String _INTERVAL_NEXTQ = "INTERVAL_NEXTQ";
    public static final java.lang.String _INTERVAL_PREVQ = "INTERVAL_PREVQ";
    public static final java.lang.String _INTERVAL_CURNEXT3Q = "INTERVAL_CURNEXT3Q";
    public static final java.lang.String _INTERVAL_CURY = "INTERVAL_CURY";
    public static final java.lang.String _INTERVAL_PREVY = "INTERVAL_PREVY";
    public static final java.lang.String _INTERVAL_PREV2Y = "INTERVAL_PREV2Y";
    public static final java.lang.String _INTERVAL_AGO2Y = "INTERVAL_AGO2Y";
    public static final java.lang.String _INTERVAL_NEXTY = "INTERVAL_NEXTY";
    public static final java.lang.String _INTERVAL_PREVCURY = "INTERVAL_PREVCURY";
    public static final java.lang.String _INTERVAL_PREVCUR2Y = "INTERVAL_PREVCUR2Y";
    public static final java.lang.String _INTERVAL_CURNEXTY = "INTERVAL_CURNEXTY";
    public static final java.lang.String _INTERVAL_LAST7 = "INTERVAL_LAST7";
    public static final java.lang.String _INTERVAL_LAST30 = "INTERVAL_LAST30";
    public static final java.lang.String _INTERVAL_LAST60 = "INTERVAL_LAST60";
    public static final java.lang.String _INTERVAL_LAST90 = "INTERVAL_LAST90";
    public static final java.lang.String _INTERVAL_LAST120 = "INTERVAL_LAST120";
    public static final java.lang.String _INTERVAL_NEXT7 = "INTERVAL_NEXT7";
    public static final java.lang.String _INTERVAL_NEXT30 = "INTERVAL_NEXT30";
    public static final java.lang.String _INTERVAL_NEXT60 = "INTERVAL_NEXT60";
    public static final java.lang.String _INTERVAL_NEXT90 = "INTERVAL_NEXT90";
    public static final java.lang.String _INTERVAL_NEXT120 = "INTERVAL_NEXT120";
    public static final java.lang.String _LAST_FISCALWEEK = "LAST_FISCALWEEK";
    public static final java.lang.String _THIS_FISCALWEEK = "THIS_FISCALWEEK";
    public static final java.lang.String _NEXT_FISCALWEEK = "NEXT_FISCALWEEK";
    public static final java.lang.String _LAST_FISCALPERIOD = "LAST_FISCALPERIOD";
    public static final java.lang.String _THIS_FISCALPERIOD = "THIS_FISCALPERIOD";
    public static final java.lang.String _NEXT_FISCALPERIOD = "NEXT_FISCALPERIOD";
    public static final java.lang.String _LASTTHIS_FISCALPERIOD = "LASTTHIS_FISCALPERIOD";
    public static final java.lang.String _THISNEXT_FISCALPERIOD = "THISNEXT_FISCALPERIOD";
    public static final java.lang.String _CURRENT_ENTITLEMENT_PERIOD = "CURRENT_ENTITLEMENT_PERIOD";
    public static final java.lang.String _PREVIOUS_ENTITLEMENT_PERIOD = "PREVIOUS_ENTITLEMENT_PERIOD";
    public static final java.lang.String _PREVIOUS_TWO_ENTITLEMENT_PERIODS = "PREVIOUS_TWO_ENTITLEMENT_PERIODS";
    public static final java.lang.String _TWO_ENTITLEMENT_PERIODS_AGO = "TWO_ENTITLEMENT_PERIODS_AGO";
    public static final java.lang.String _CURRENT_AND_PREVIOUS_ENTITLEMENT_PERIOD = "CURRENT_AND_PREVIOUS_ENTITLEMENT_PERIOD";
    public static final java.lang.String _CURRENT_AND_PREVIOUS_TWO_ENTITLEMENT_PERIODS = "CURRENT_AND_PREVIOUS_TWO_ENTITLEMENT_PERIODS";
    public static final UserDateInterval INTERVAL_CURRENT = new UserDateInterval(_INTERVAL_CURRENT);
    public static final UserDateInterval INTERVAL_CURNEXT1 = new UserDateInterval(_INTERVAL_CURNEXT1);
    public static final UserDateInterval INTERVAL_CURPREV1 = new UserDateInterval(_INTERVAL_CURPREV1);
    public static final UserDateInterval INTERVAL_NEXT1 = new UserDateInterval(_INTERVAL_NEXT1);
    public static final UserDateInterval INTERVAL_PREV1 = new UserDateInterval(_INTERVAL_PREV1);
    public static final UserDateInterval INTERVAL_CURNEXT3 = new UserDateInterval(_INTERVAL_CURNEXT3);
    public static final UserDateInterval INTERVAL_CURFY = new UserDateInterval(_INTERVAL_CURFY);
    public static final UserDateInterval INTERVAL_PREVFY = new UserDateInterval(_INTERVAL_PREVFY);
    public static final UserDateInterval INTERVAL_PREV2FY = new UserDateInterval(_INTERVAL_PREV2FY);
    public static final UserDateInterval INTERVAL_AGO2FY = new UserDateInterval(_INTERVAL_AGO2FY);
    public static final UserDateInterval INTERVAL_NEXTFY = new UserDateInterval(_INTERVAL_NEXTFY);
    public static final UserDateInterval INTERVAL_PREVCURFY = new UserDateInterval(_INTERVAL_PREVCURFY);
    public static final UserDateInterval INTERVAL_PREVCUR2FY = new UserDateInterval(_INTERVAL_PREVCUR2FY);
    public static final UserDateInterval INTERVAL_CURNEXTFY = new UserDateInterval(_INTERVAL_CURNEXTFY);
    public static final UserDateInterval INTERVAL_CUSTOM = new UserDateInterval(_INTERVAL_CUSTOM);
    public static final UserDateInterval INTERVAL_YESTERDAY = new UserDateInterval(_INTERVAL_YESTERDAY);
    public static final UserDateInterval INTERVAL_TODAY = new UserDateInterval(_INTERVAL_TODAY);
    public static final UserDateInterval INTERVAL_TOMORROW = new UserDateInterval(_INTERVAL_TOMORROW);
    public static final UserDateInterval INTERVAL_LASTWEEK = new UserDateInterval(_INTERVAL_LASTWEEK);
    public static final UserDateInterval INTERVAL_THISWEEK = new UserDateInterval(_INTERVAL_THISWEEK);
    public static final UserDateInterval INTERVAL_NEXTWEEK = new UserDateInterval(_INTERVAL_NEXTWEEK);
    public static final UserDateInterval INTERVAL_LASTMONTH = new UserDateInterval(_INTERVAL_LASTMONTH);
    public static final UserDateInterval INTERVAL_THISMONTH = new UserDateInterval(_INTERVAL_THISMONTH);
    public static final UserDateInterval INTERVAL_NEXTMONTH = new UserDateInterval(_INTERVAL_NEXTMONTH);
    public static final UserDateInterval INTERVAL_LASTTHISMONTH = new UserDateInterval(_INTERVAL_LASTTHISMONTH);
    public static final UserDateInterval INTERVAL_THISNEXTMONTH = new UserDateInterval(_INTERVAL_THISNEXTMONTH);
    public static final UserDateInterval INTERVAL_CURRENTQ = new UserDateInterval(_INTERVAL_CURRENTQ);
    public static final UserDateInterval INTERVAL_CURNEXTQ = new UserDateInterval(_INTERVAL_CURNEXTQ);
    public static final UserDateInterval INTERVAL_CURPREVQ = new UserDateInterval(_INTERVAL_CURPREVQ);
    public static final UserDateInterval INTERVAL_NEXTQ = new UserDateInterval(_INTERVAL_NEXTQ);
    public static final UserDateInterval INTERVAL_PREVQ = new UserDateInterval(_INTERVAL_PREVQ);
    public static final UserDateInterval INTERVAL_CURNEXT3Q = new UserDateInterval(_INTERVAL_CURNEXT3Q);
    public static final UserDateInterval INTERVAL_CURY = new UserDateInterval(_INTERVAL_CURY);
    public static final UserDateInterval INTERVAL_PREVY = new UserDateInterval(_INTERVAL_PREVY);
    public static final UserDateInterval INTERVAL_PREV2Y = new UserDateInterval(_INTERVAL_PREV2Y);
    public static final UserDateInterval INTERVAL_AGO2Y = new UserDateInterval(_INTERVAL_AGO2Y);
    public static final UserDateInterval INTERVAL_NEXTY = new UserDateInterval(_INTERVAL_NEXTY);
    public static final UserDateInterval INTERVAL_PREVCURY = new UserDateInterval(_INTERVAL_PREVCURY);
    public static final UserDateInterval INTERVAL_PREVCUR2Y = new UserDateInterval(_INTERVAL_PREVCUR2Y);
    public static final UserDateInterval INTERVAL_CURNEXTY = new UserDateInterval(_INTERVAL_CURNEXTY);
    public static final UserDateInterval INTERVAL_LAST7 = new UserDateInterval(_INTERVAL_LAST7);
    public static final UserDateInterval INTERVAL_LAST30 = new UserDateInterval(_INTERVAL_LAST30);
    public static final UserDateInterval INTERVAL_LAST60 = new UserDateInterval(_INTERVAL_LAST60);
    public static final UserDateInterval INTERVAL_LAST90 = new UserDateInterval(_INTERVAL_LAST90);
    public static final UserDateInterval INTERVAL_LAST120 = new UserDateInterval(_INTERVAL_LAST120);
    public static final UserDateInterval INTERVAL_NEXT7 = new UserDateInterval(_INTERVAL_NEXT7);
    public static final UserDateInterval INTERVAL_NEXT30 = new UserDateInterval(_INTERVAL_NEXT30);
    public static final UserDateInterval INTERVAL_NEXT60 = new UserDateInterval(_INTERVAL_NEXT60);
    public static final UserDateInterval INTERVAL_NEXT90 = new UserDateInterval(_INTERVAL_NEXT90);
    public static final UserDateInterval INTERVAL_NEXT120 = new UserDateInterval(_INTERVAL_NEXT120);
    public static final UserDateInterval LAST_FISCALWEEK = new UserDateInterval(_LAST_FISCALWEEK);
    public static final UserDateInterval THIS_FISCALWEEK = new UserDateInterval(_THIS_FISCALWEEK);
    public static final UserDateInterval NEXT_FISCALWEEK = new UserDateInterval(_NEXT_FISCALWEEK);
    public static final UserDateInterval LAST_FISCALPERIOD = new UserDateInterval(_LAST_FISCALPERIOD);
    public static final UserDateInterval THIS_FISCALPERIOD = new UserDateInterval(_THIS_FISCALPERIOD);
    public static final UserDateInterval NEXT_FISCALPERIOD = new UserDateInterval(_NEXT_FISCALPERIOD);
    public static final UserDateInterval LASTTHIS_FISCALPERIOD = new UserDateInterval(_LASTTHIS_FISCALPERIOD);
    public static final UserDateInterval THISNEXT_FISCALPERIOD = new UserDateInterval(_THISNEXT_FISCALPERIOD);
    public static final UserDateInterval CURRENT_ENTITLEMENT_PERIOD = new UserDateInterval(_CURRENT_ENTITLEMENT_PERIOD);
    public static final UserDateInterval PREVIOUS_ENTITLEMENT_PERIOD = new UserDateInterval(_PREVIOUS_ENTITLEMENT_PERIOD);
    public static final UserDateInterval PREVIOUS_TWO_ENTITLEMENT_PERIODS = new UserDateInterval(_PREVIOUS_TWO_ENTITLEMENT_PERIODS);
    public static final UserDateInterval TWO_ENTITLEMENT_PERIODS_AGO = new UserDateInterval(_TWO_ENTITLEMENT_PERIODS_AGO);
    public static final UserDateInterval CURRENT_AND_PREVIOUS_ENTITLEMENT_PERIOD = new UserDateInterval(_CURRENT_AND_PREVIOUS_ENTITLEMENT_PERIOD);
    public static final UserDateInterval CURRENT_AND_PREVIOUS_TWO_ENTITLEMENT_PERIODS = new UserDateInterval(_CURRENT_AND_PREVIOUS_TWO_ENTITLEMENT_PERIODS);
    public java.lang.String getValue() { return _value_;}
    public static UserDateInterval fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserDateInterval enumeration = (UserDateInterval)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserDateInterval fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDateInterval.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserDateInterval"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
