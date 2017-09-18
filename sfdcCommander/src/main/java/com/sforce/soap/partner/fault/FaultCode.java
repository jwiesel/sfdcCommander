/**
 * FaultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner.fault;

public class FaultCode implements java.io.Serializable {
    private javax.xml.namespace.QName _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FaultCode(javax.xml.namespace.QName value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final javax.xml.namespace.QName _value1 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}APEX_TRIGGER_COUPLING_LIMIT");
    public static final javax.xml.namespace.QName _value2 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}API_CURRENTLY_DISABLED");
    public static final javax.xml.namespace.QName _value3 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}API_DISABLED_FOR_ORG");
    public static final javax.xml.namespace.QName _value4 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ARGUMENT_OBJECT_PARSE_ERROR");
    public static final javax.xml.namespace.QName _value5 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ASYNC_OPERATION_LOCATOR");
    public static final javax.xml.namespace.QName _value6 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ASYNC_QUERY_UNSUPPORTED_QUERY");
    public static final javax.xml.namespace.QName _value7 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}BATCH_PROCESSING_HALTED");
    public static final javax.xml.namespace.QName _value8 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}BIG_OBJECT_UNSUPPORTED_OPERATION");
    public static final javax.xml.namespace.QName _value9 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CANNOT_DELETE_ENTITY");
    public static final javax.xml.namespace.QName _value10 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CANNOT_DELETE_OWNER");
    public static final javax.xml.namespace.QName _value11 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY");
    public static final javax.xml.namespace.QName _value12 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY");
    public static final javax.xml.namespace.QName _value13 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CIRCULAR_OBJECT_GRAPH");
    public static final javax.xml.namespace.QName _value14 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CLIENT_NOT_ACCESSIBLE_FOR_USER");
    public static final javax.xml.namespace.QName _value15 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CLIENT_REQUIRE_UPDATE_FOR_USER");
    public static final javax.xml.namespace.QName _value16 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_CUSTOM_DOWNLOAD_EXCEPTION");
    public static final javax.xml.namespace.QName _value17 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_AUTHENTICATION_EXCEPTION");
    public static final javax.xml.namespace.QName _value18 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION");
    public static final javax.xml.namespace.QName _value19 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION");
    public static final javax.xml.namespace.QName _value20 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION");
    public static final javax.xml.namespace.QName _value21 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION");
    public static final javax.xml.namespace.QName _value22 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_INVALID_PAYLOAD");
    public static final javax.xml.namespace.QName _value23 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION");
    public static final javax.xml.namespace.QName _value24 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION");
    public static final javax.xml.namespace.QName _value25 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION");
    public static final javax.xml.namespace.QName _value26 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION");
    public static final javax.xml.namespace.QName _value27 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_SECURITY_EXCEPTION");
    public static final javax.xml.namespace.QName _value28 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_TIMEOUT_EXCEPTION");
    public static final javax.xml.namespace.QName _value29 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CONTENT_HUB_UNEXPECTED_EXCEPTION");
    public static final javax.xml.namespace.QName _value30 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CUSTOM_METADATA_LIMIT_EXCEEDED");
    public static final javax.xml.namespace.QName _value31 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}CUSTOM_SETTINGS_LIMIT_EXCEEDED");
    public static final javax.xml.namespace.QName _value32 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DATACLOUD_API_CLIENT_EXCEPTION");
    public static final javax.xml.namespace.QName _value33 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DATACLOUD_API_DISABLED_EXCEPTION");
    public static final javax.xml.namespace.QName _value34 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DATACLOUD_API_INVALID_QUERY_EXCEPTION");
    public static final javax.xml.namespace.QName _value35 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DATACLOUD_API_SERVER_BUSY_EXCEPTION");
    public static final javax.xml.namespace.QName _value36 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DATACLOUD_API_SERVER_EXCEPTION");
    public static final javax.xml.namespace.QName _value37 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DATACLOUD_API_TIMEOUT_EXCEPTION");
    public static final javax.xml.namespace.QName _value38 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DATACLOUD_API_UNAVAILABLE");
    public static final javax.xml.namespace.QName _value39 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DUPLICATE_ARGUMENT_VALUE");
    public static final javax.xml.namespace.QName _value40 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}DUPLICATE_VALUE");
    public static final javax.xml.namespace.QName _value41 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EMAIL_BATCH_SIZE_LIMIT_EXCEEDED");
    public static final javax.xml.namespace.QName _value42 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EMAIL_TO_CASE_INVALID_ROUTING");
    public static final javax.xml.namespace.QName _value43 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EMAIL_TO_CASE_LIMIT_EXCEEDED");
    public static final javax.xml.namespace.QName _value44 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EMAIL_TO_CASE_NOT_ENABLED");
    public static final javax.xml.namespace.QName _value45 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ENTITY_NOT_QUERYABLE");
    public static final javax.xml.namespace.QName _value46 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT");
    public static final javax.xml.namespace.QName _value47 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXCEEDED_ID_LIMIT");
    public static final javax.xml.namespace.QName _value48 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXCEEDED_LEAD_CONVERT_LIMIT");
    public static final javax.xml.namespace.QName _value49 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXCEEDED_MAX_SIZE_REQUEST");
    public static final javax.xml.namespace.QName _value50 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXCEEDED_MAX_SOBJECTS");
    public static final javax.xml.namespace.QName _value51 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXCEEDED_MAX_TYPES_LIMIT");
    public static final javax.xml.namespace.QName _value52 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXCEEDED_QUOTA");
    public static final javax.xml.namespace.QName _value53 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION");
    public static final javax.xml.namespace.QName _value54 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXTERNAL_OBJECT_CONNECTION_EXCEPTION");
    public static final javax.xml.namespace.QName _value55 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXTERNAL_OBJECT_EXCEPTION");
    public static final javax.xml.namespace.QName _value56 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION");
    public static final javax.xml.namespace.QName _value57 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}FEDERATED_SEARCH_ERROR");
    public static final javax.xml.namespace.QName _value58 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}FEED_NOT_ENABLED_FOR_OBJECT");
    public static final javax.xml.namespace.QName _value59 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}FUNCTIONALITY_NOT_ENABLED");
    public static final javax.xml.namespace.QName _value60 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}FUNCTIONALITY_TEMPORARILY_UNAVAILABLE");
    public static final javax.xml.namespace.QName _value61 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ILLEGAL_QUERY_PARAMETER_VALUE");
    public static final javax.xml.namespace.QName _value62 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INACTIVE_OWNER_OR_USER");
    public static final javax.xml.namespace.QName _value63 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INACTIVE_PORTAL");
    public static final javax.xml.namespace.QName _value64 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE");
    public static final javax.xml.namespace.QName _value65 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INSUFFICIENT_ACCESS");
    public static final javax.xml.namespace.QName _value66 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INTERNAL_CANVAS_ERROR");
    public static final javax.xml.namespace.QName _value67 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_ASSIGNMENT_RULE");
    public static final javax.xml.namespace.QName _value68 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_BATCH_REQUEST");
    public static final javax.xml.namespace.QName _value69 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_BATCH_SIZE");
    public static final javax.xml.namespace.QName _value70 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_CLIENT");
    public static final javax.xml.namespace.QName _value71 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_CROSS_REFERENCE_KEY");
    public static final javax.xml.namespace.QName _value72 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_DATE_FORMAT");
    public static final javax.xml.namespace.QName _value73 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_FIELD");
    public static final javax.xml.namespace.QName _value74 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_FILTER_LANGUAGE");
    public static final javax.xml.namespace.QName _value75 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_FILTER_VALUE");
    public static final javax.xml.namespace.QName _value76 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_ID_FIELD");
    public static final javax.xml.namespace.QName _value77 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_INPUT_COMBINATION");
    public static final javax.xml.namespace.QName _value78 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_LOCALE_LANGUAGE");
    public static final javax.xml.namespace.QName _value79 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_LOCATOR");
    public static final javax.xml.namespace.QName _value80 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_LOGIN");
    public static final javax.xml.namespace.QName _value81 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_MULTIPART_REQUEST");
    public static final javax.xml.namespace.QName _value82 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_NEW_PASSWORD");
    public static final javax.xml.namespace.QName _value83 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_OPERATION");
    public static final javax.xml.namespace.QName _value84 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_OPERATION_WITH_EXPIRED_PASSWORD");
    public static final javax.xml.namespace.QName _value85 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_PACKAGE_VERSION");
    public static final javax.xml.namespace.QName _value86 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_PAGING_OPTION");
    public static final javax.xml.namespace.QName _value87 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_QUERY_FILTER_OPERATOR");
    public static final javax.xml.namespace.QName _value88 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_QUERY_LOCATOR");
    public static final javax.xml.namespace.QName _value89 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_QUERY_SCOPE");
    public static final javax.xml.namespace.QName _value90 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_REPLICATION_DATE");
    public static final javax.xml.namespace.QName _value91 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_SEARCH");
    public static final javax.xml.namespace.QName _value92 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_SEARCH_SCOPE");
    public static final javax.xml.namespace.QName _value93 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_SESSION_ID");
    public static final javax.xml.namespace.QName _value94 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_SOAP_HEADER");
    public static final javax.xml.namespace.QName _value95 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_SORT_OPTION");
    public static final javax.xml.namespace.QName _value96 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_SSO_GATEWAY_URL");
    public static final javax.xml.namespace.QName _value97 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_TYPE");
    public static final javax.xml.namespace.QName _value98 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}INVALID_TYPE_FOR_OPERATION");
    public static final javax.xml.namespace.QName _value99 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}JIGSAW_ACTION_DISABLED");
    public static final javax.xml.namespace.QName _value100 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}JIGSAW_IMPORT_LIMIT_EXCEEDED");
    public static final javax.xml.namespace.QName _value101 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}JIGSAW_REQUEST_NOT_SUPPORTED");
    public static final javax.xml.namespace.QName _value102 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}JSON_PARSER_ERROR");
    public static final javax.xml.namespace.QName _value103 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}KEY_HAS_BEEN_DESTROYED");
    public static final javax.xml.namespace.QName _value104 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LICENSING_DATA_ERROR");
    public static final javax.xml.namespace.QName _value105 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LICENSING_UNKNOWN_ERROR");
    public static final javax.xml.namespace.QName _value106 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LIMIT_EXCEEDED");
    public static final javax.xml.namespace.QName _value107 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LOGIN_CHALLENGE_ISSUED");
    public static final javax.xml.namespace.QName _value108 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LOGIN_CHALLENGE_PENDING");
    public static final javax.xml.namespace.QName _value109 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LOGIN_DURING_RESTRICTED_DOMAIN");
    public static final javax.xml.namespace.QName _value110 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LOGIN_DURING_RESTRICTED_TIME");
    public static final javax.xml.namespace.QName _value111 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}LOGIN_MUST_USE_SECURITY_TOKEN");
    public static final javax.xml.namespace.QName _value112 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}MALFORMED_ID");
    public static final javax.xml.namespace.QName _value113 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}MALFORMED_QUERY");
    public static final javax.xml.namespace.QName _value114 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}MALFORMED_SEARCH");
    public static final javax.xml.namespace.QName _value115 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}MISSING_ARGUMENT");
    public static final javax.xml.namespace.QName _value116 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}MISSING_RECORD");
    public static final javax.xml.namespace.QName _value117 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}MODIFIED");
    public static final javax.xml.namespace.QName _value118 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}MUTUAL_AUTHENTICATION_FAILED");
    public static final javax.xml.namespace.QName _value119 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}NOT_ACCEPTABLE");
    public static final javax.xml.namespace.QName _value120 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}NOT_MODIFIED");
    public static final javax.xml.namespace.QName _value121 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}NO_ACTIVE_DUPLICATE_RULE");
    public static final javax.xml.namespace.QName _value122 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}NO_RECIPIENTS");
    public static final javax.xml.namespace.QName _value123 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}NO_SOFTPHONE_LAYOUT");
    public static final javax.xml.namespace.QName _value124 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}NUMBER_OUTSIDE_VALID_RANGE");
    public static final javax.xml.namespace.QName _value125 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}OPERATION_TOO_LARGE");
    public static final javax.xml.namespace.QName _value126 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ORG_IN_MAINTENANCE");
    public static final javax.xml.namespace.QName _value127 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ORG_IS_DOT_ORG");
    public static final javax.xml.namespace.QName _value128 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ORG_IS_SIGNING_UP");
    public static final javax.xml.namespace.QName _value129 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ORG_LOCKED");
    public static final javax.xml.namespace.QName _value130 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}ORG_NOT_OWNED_BY_INSTANCE");
    public static final javax.xml.namespace.QName _value131 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}PASSWORD_LOCKOUT");
    public static final javax.xml.namespace.QName _value132 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}PORTAL_NO_ACCESS");
    public static final javax.xml.namespace.QName _value133 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}POST_BODY_PARSE_ERROR");
    public static final javax.xml.namespace.QName _value134 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}QUERY_TIMEOUT");
    public static final javax.xml.namespace.QName _value135 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}QUERY_TOO_COMPLICATED");
    public static final javax.xml.namespace.QName _value136 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT");
    public static final javax.xml.namespace.QName _value137 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}REQUEST_LIMIT_EXCEEDED");
    public static final javax.xml.namespace.QName _value138 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}REQUEST_RUNNING_TOO_LONG");
    public static final javax.xml.namespace.QName _value139 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}SERVER_UNAVAILABLE");
    public static final javax.xml.namespace.QName _value140 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}SERVICE_DESK_NOT_ENABLED");
    public static final javax.xml.namespace.QName _value141 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION");
    public static final javax.xml.namespace.QName _value142 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION");
    public static final javax.xml.namespace.QName _value143 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE");
    public static final javax.xml.namespace.QName _value144 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}SSO_SERVICE_DOWN");
    public static final javax.xml.namespace.QName _value145 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}SST_ADMIN_FILE_DOWNLOAD_EXCEPTION");
    public static final javax.xml.namespace.QName _value146 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}TOO_MANY_APEX_REQUESTS");
    public static final javax.xml.namespace.QName _value147 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}TOO_MANY_RECIPIENTS");
    public static final javax.xml.namespace.QName _value148 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}TOO_MANY_RECORDS");
    public static final javax.xml.namespace.QName _value149 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}TRIAL_EXPIRED");
    public static final javax.xml.namespace.QName _value150 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}TXN_SECURITY_END_A_SESSION");
    public static final javax.xml.namespace.QName _value151 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}TXN_SECURITY_NO_ACCESS");
    public static final javax.xml.namespace.QName _value152 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}TXN_SECURITY_TWO_FA_REQUIRED");
    public static final javax.xml.namespace.QName _value153 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNABLE_TO_LOCK_ROW");
    public static final javax.xml.namespace.QName _value154 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNKNOWN_ATTACHMENT_EXCEPTION");
    public static final javax.xml.namespace.QName _value155 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNKNOWN_EXCEPTION");
    public static final javax.xml.namespace.QName _value156 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNKNOWN_ORG_SETTING");
    public static final javax.xml.namespace.QName _value157 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNSUPPORTED_API_VERSION");
    public static final javax.xml.namespace.QName _value158 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNSUPPORTED_ATTACHMENT_ENCODING");
    public static final javax.xml.namespace.QName _value159 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNSUPPORTED_CLIENT");
    public static final javax.xml.namespace.QName _value160 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}UNSUPPORTED_MEDIA_TYPE");
    public static final javax.xml.namespace.QName _value161 = javax.xml.namespace.QName.valueOf("{urn:fault.partner.soap.sforce.com}XML_PARSER_ERROR");
    public static final FaultCode value1 = new FaultCode(_value1);
    public static final FaultCode value2 = new FaultCode(_value2);
    public static final FaultCode value3 = new FaultCode(_value3);
    public static final FaultCode value4 = new FaultCode(_value4);
    public static final FaultCode value5 = new FaultCode(_value5);
    public static final FaultCode value6 = new FaultCode(_value6);
    public static final FaultCode value7 = new FaultCode(_value7);
    public static final FaultCode value8 = new FaultCode(_value8);
    public static final FaultCode value9 = new FaultCode(_value9);
    public static final FaultCode value10 = new FaultCode(_value10);
    public static final FaultCode value11 = new FaultCode(_value11);
    public static final FaultCode value12 = new FaultCode(_value12);
    public static final FaultCode value13 = new FaultCode(_value13);
    public static final FaultCode value14 = new FaultCode(_value14);
    public static final FaultCode value15 = new FaultCode(_value15);
    public static final FaultCode value16 = new FaultCode(_value16);
    public static final FaultCode value17 = new FaultCode(_value17);
    public static final FaultCode value18 = new FaultCode(_value18);
    public static final FaultCode value19 = new FaultCode(_value19);
    public static final FaultCode value20 = new FaultCode(_value20);
    public static final FaultCode value21 = new FaultCode(_value21);
    public static final FaultCode value22 = new FaultCode(_value22);
    public static final FaultCode value23 = new FaultCode(_value23);
    public static final FaultCode value24 = new FaultCode(_value24);
    public static final FaultCode value25 = new FaultCode(_value25);
    public static final FaultCode value26 = new FaultCode(_value26);
    public static final FaultCode value27 = new FaultCode(_value27);
    public static final FaultCode value28 = new FaultCode(_value28);
    public static final FaultCode value29 = new FaultCode(_value29);
    public static final FaultCode value30 = new FaultCode(_value30);
    public static final FaultCode value31 = new FaultCode(_value31);
    public static final FaultCode value32 = new FaultCode(_value32);
    public static final FaultCode value33 = new FaultCode(_value33);
    public static final FaultCode value34 = new FaultCode(_value34);
    public static final FaultCode value35 = new FaultCode(_value35);
    public static final FaultCode value36 = new FaultCode(_value36);
    public static final FaultCode value37 = new FaultCode(_value37);
    public static final FaultCode value38 = new FaultCode(_value38);
    public static final FaultCode value39 = new FaultCode(_value39);
    public static final FaultCode value40 = new FaultCode(_value40);
    public static final FaultCode value41 = new FaultCode(_value41);
    public static final FaultCode value42 = new FaultCode(_value42);
    public static final FaultCode value43 = new FaultCode(_value43);
    public static final FaultCode value44 = new FaultCode(_value44);
    public static final FaultCode value45 = new FaultCode(_value45);
    public static final FaultCode value46 = new FaultCode(_value46);
    public static final FaultCode value47 = new FaultCode(_value47);
    public static final FaultCode value48 = new FaultCode(_value48);
    public static final FaultCode value49 = new FaultCode(_value49);
    public static final FaultCode value50 = new FaultCode(_value50);
    public static final FaultCode value51 = new FaultCode(_value51);
    public static final FaultCode value52 = new FaultCode(_value52);
    public static final FaultCode value53 = new FaultCode(_value53);
    public static final FaultCode value54 = new FaultCode(_value54);
    public static final FaultCode value55 = new FaultCode(_value55);
    public static final FaultCode value56 = new FaultCode(_value56);
    public static final FaultCode value57 = new FaultCode(_value57);
    public static final FaultCode value58 = new FaultCode(_value58);
    public static final FaultCode value59 = new FaultCode(_value59);
    public static final FaultCode value60 = new FaultCode(_value60);
    public static final FaultCode value61 = new FaultCode(_value61);
    public static final FaultCode value62 = new FaultCode(_value62);
    public static final FaultCode value63 = new FaultCode(_value63);
    public static final FaultCode value64 = new FaultCode(_value64);
    public static final FaultCode value65 = new FaultCode(_value65);
    public static final FaultCode value66 = new FaultCode(_value66);
    public static final FaultCode value67 = new FaultCode(_value67);
    public static final FaultCode value68 = new FaultCode(_value68);
    public static final FaultCode value69 = new FaultCode(_value69);
    public static final FaultCode value70 = new FaultCode(_value70);
    public static final FaultCode value71 = new FaultCode(_value71);
    public static final FaultCode value72 = new FaultCode(_value72);
    public static final FaultCode value73 = new FaultCode(_value73);
    public static final FaultCode value74 = new FaultCode(_value74);
    public static final FaultCode value75 = new FaultCode(_value75);
    public static final FaultCode value76 = new FaultCode(_value76);
    public static final FaultCode value77 = new FaultCode(_value77);
    public static final FaultCode value78 = new FaultCode(_value78);
    public static final FaultCode value79 = new FaultCode(_value79);
    public static final FaultCode value80 = new FaultCode(_value80);
    public static final FaultCode value81 = new FaultCode(_value81);
    public static final FaultCode value82 = new FaultCode(_value82);
    public static final FaultCode value83 = new FaultCode(_value83);
    public static final FaultCode value84 = new FaultCode(_value84);
    public static final FaultCode value85 = new FaultCode(_value85);
    public static final FaultCode value86 = new FaultCode(_value86);
    public static final FaultCode value87 = new FaultCode(_value87);
    public static final FaultCode value88 = new FaultCode(_value88);
    public static final FaultCode value89 = new FaultCode(_value89);
    public static final FaultCode value90 = new FaultCode(_value90);
    public static final FaultCode value91 = new FaultCode(_value91);
    public static final FaultCode value92 = new FaultCode(_value92);
    public static final FaultCode value93 = new FaultCode(_value93);
    public static final FaultCode value94 = new FaultCode(_value94);
    public static final FaultCode value95 = new FaultCode(_value95);
    public static final FaultCode value96 = new FaultCode(_value96);
    public static final FaultCode value97 = new FaultCode(_value97);
    public static final FaultCode value98 = new FaultCode(_value98);
    public static final FaultCode value99 = new FaultCode(_value99);
    public static final FaultCode value100 = new FaultCode(_value100);
    public static final FaultCode value101 = new FaultCode(_value101);
    public static final FaultCode value102 = new FaultCode(_value102);
    public static final FaultCode value103 = new FaultCode(_value103);
    public static final FaultCode value104 = new FaultCode(_value104);
    public static final FaultCode value105 = new FaultCode(_value105);
    public static final FaultCode value106 = new FaultCode(_value106);
    public static final FaultCode value107 = new FaultCode(_value107);
    public static final FaultCode value108 = new FaultCode(_value108);
    public static final FaultCode value109 = new FaultCode(_value109);
    public static final FaultCode value110 = new FaultCode(_value110);
    public static final FaultCode value111 = new FaultCode(_value111);
    public static final FaultCode value112 = new FaultCode(_value112);
    public static final FaultCode value113 = new FaultCode(_value113);
    public static final FaultCode value114 = new FaultCode(_value114);
    public static final FaultCode value115 = new FaultCode(_value115);
    public static final FaultCode value116 = new FaultCode(_value116);
    public static final FaultCode value117 = new FaultCode(_value117);
    public static final FaultCode value118 = new FaultCode(_value118);
    public static final FaultCode value119 = new FaultCode(_value119);
    public static final FaultCode value120 = new FaultCode(_value120);
    public static final FaultCode value121 = new FaultCode(_value121);
    public static final FaultCode value122 = new FaultCode(_value122);
    public static final FaultCode value123 = new FaultCode(_value123);
    public static final FaultCode value124 = new FaultCode(_value124);
    public static final FaultCode value125 = new FaultCode(_value125);
    public static final FaultCode value126 = new FaultCode(_value126);
    public static final FaultCode value127 = new FaultCode(_value127);
    public static final FaultCode value128 = new FaultCode(_value128);
    public static final FaultCode value129 = new FaultCode(_value129);
    public static final FaultCode value130 = new FaultCode(_value130);
    public static final FaultCode value131 = new FaultCode(_value131);
    public static final FaultCode value132 = new FaultCode(_value132);
    public static final FaultCode value133 = new FaultCode(_value133);
    public static final FaultCode value134 = new FaultCode(_value134);
    public static final FaultCode value135 = new FaultCode(_value135);
    public static final FaultCode value136 = new FaultCode(_value136);
    public static final FaultCode value137 = new FaultCode(_value137);
    public static final FaultCode value138 = new FaultCode(_value138);
    public static final FaultCode value139 = new FaultCode(_value139);
    public static final FaultCode value140 = new FaultCode(_value140);
    public static final FaultCode value141 = new FaultCode(_value141);
    public static final FaultCode value142 = new FaultCode(_value142);
    public static final FaultCode value143 = new FaultCode(_value143);
    public static final FaultCode value144 = new FaultCode(_value144);
    public static final FaultCode value145 = new FaultCode(_value145);
    public static final FaultCode value146 = new FaultCode(_value146);
    public static final FaultCode value147 = new FaultCode(_value147);
    public static final FaultCode value148 = new FaultCode(_value148);
    public static final FaultCode value149 = new FaultCode(_value149);
    public static final FaultCode value150 = new FaultCode(_value150);
    public static final FaultCode value151 = new FaultCode(_value151);
    public static final FaultCode value152 = new FaultCode(_value152);
    public static final FaultCode value153 = new FaultCode(_value153);
    public static final FaultCode value154 = new FaultCode(_value154);
    public static final FaultCode value155 = new FaultCode(_value155);
    public static final FaultCode value156 = new FaultCode(_value156);
    public static final FaultCode value157 = new FaultCode(_value157);
    public static final FaultCode value158 = new FaultCode(_value158);
    public static final FaultCode value159 = new FaultCode(_value159);
    public static final FaultCode value160 = new FaultCode(_value160);
    public static final FaultCode value161 = new FaultCode(_value161);
    public javax.xml.namespace.QName getValue() { return _value_;}
    public static FaultCode fromValue(javax.xml.namespace.QName value)
          throws java.lang.IllegalArgumentException {
        FaultCode enumeration = (FaultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FaultCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(javax.xml.namespace.QName.valueOf(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(FaultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "FaultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
