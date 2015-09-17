/**
 * FeedItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FeedItemType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedItemType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TrackedChange = "TrackedChange";
    public static final java.lang.String _UserStatus = "UserStatus";
    public static final java.lang.String _TextPost = "TextPost";
    public static final java.lang.String _AdvancedTextPost = "AdvancedTextPost";
    public static final java.lang.String _LinkPost = "LinkPost";
    public static final java.lang.String _ContentPost = "ContentPost";
    public static final java.lang.String _PollPost = "PollPost";
    public static final java.lang.String _RypplePost = "RypplePost";
    public static final java.lang.String _ProfileSkillPost = "ProfileSkillPost";
    public static final java.lang.String _DashboardComponentSnapshot = "DashboardComponentSnapshot";
    public static final java.lang.String _ApprovalPost = "ApprovalPost";
    public static final java.lang.String _CaseCommentPost = "CaseCommentPost";
    public static final java.lang.String _ReplyPost = "ReplyPost";
    public static final java.lang.String _EmailMessageEvent = "EmailMessageEvent";
    public static final java.lang.String _CallLogPost = "CallLogPost";
    public static final java.lang.String _ChangeStatusPost = "ChangeStatusPost";
    public static final java.lang.String _AttachArticleEvent = "AttachArticleEvent";
    public static final java.lang.String _MilestoneEvent = "MilestoneEvent";
    public static final java.lang.String _ActivityEvent = "ActivityEvent";
    public static final java.lang.String _ChatTranscriptPost = "ChatTranscriptPost";
    public static final java.lang.String _CollaborationGroupCreated = "CollaborationGroupCreated";
    public static final java.lang.String _CollaborationGroupUnarchived = "CollaborationGroupUnarchived";
    public static final java.lang.String _SocialPost = "SocialPost";
    public static final java.lang.String _QuestionPost = "QuestionPost";
    public static final java.lang.String _FacebookPost = "FacebookPost";
    public static final java.lang.String _BasicTemplateFeedItem = "BasicTemplateFeedItem";
    public static final java.lang.String _CreateRecordEvent = "CreateRecordEvent";
    public static final java.lang.String _CanvasPost = "CanvasPost";
    public static final java.lang.String _AnnouncementPost = "AnnouncementPost";
    public static final FeedItemType TrackedChange = new FeedItemType(_TrackedChange);
    public static final FeedItemType UserStatus = new FeedItemType(_UserStatus);
    public static final FeedItemType TextPost = new FeedItemType(_TextPost);
    public static final FeedItemType AdvancedTextPost = new FeedItemType(_AdvancedTextPost);
    public static final FeedItemType LinkPost = new FeedItemType(_LinkPost);
    public static final FeedItemType ContentPost = new FeedItemType(_ContentPost);
    public static final FeedItemType PollPost = new FeedItemType(_PollPost);
    public static final FeedItemType RypplePost = new FeedItemType(_RypplePost);
    public static final FeedItemType ProfileSkillPost = new FeedItemType(_ProfileSkillPost);
    public static final FeedItemType DashboardComponentSnapshot = new FeedItemType(_DashboardComponentSnapshot);
    public static final FeedItemType ApprovalPost = new FeedItemType(_ApprovalPost);
    public static final FeedItemType CaseCommentPost = new FeedItemType(_CaseCommentPost);
    public static final FeedItemType ReplyPost = new FeedItemType(_ReplyPost);
    public static final FeedItemType EmailMessageEvent = new FeedItemType(_EmailMessageEvent);
    public static final FeedItemType CallLogPost = new FeedItemType(_CallLogPost);
    public static final FeedItemType ChangeStatusPost = new FeedItemType(_ChangeStatusPost);
    public static final FeedItemType AttachArticleEvent = new FeedItemType(_AttachArticleEvent);
    public static final FeedItemType MilestoneEvent = new FeedItemType(_MilestoneEvent);
    public static final FeedItemType ActivityEvent = new FeedItemType(_ActivityEvent);
    public static final FeedItemType ChatTranscriptPost = new FeedItemType(_ChatTranscriptPost);
    public static final FeedItemType CollaborationGroupCreated = new FeedItemType(_CollaborationGroupCreated);
    public static final FeedItemType CollaborationGroupUnarchived = new FeedItemType(_CollaborationGroupUnarchived);
    public static final FeedItemType SocialPost = new FeedItemType(_SocialPost);
    public static final FeedItemType QuestionPost = new FeedItemType(_QuestionPost);
    public static final FeedItemType FacebookPost = new FeedItemType(_FacebookPost);
    public static final FeedItemType BasicTemplateFeedItem = new FeedItemType(_BasicTemplateFeedItem);
    public static final FeedItemType CreateRecordEvent = new FeedItemType(_CreateRecordEvent);
    public static final FeedItemType CanvasPost = new FeedItemType(_CanvasPost);
    public static final FeedItemType AnnouncementPost = new FeedItemType(_AnnouncementPost);
    public java.lang.String getValue() { return _value_;}
    public static FeedItemType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedItemType enumeration = (FeedItemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedItemType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedItemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FeedItemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
