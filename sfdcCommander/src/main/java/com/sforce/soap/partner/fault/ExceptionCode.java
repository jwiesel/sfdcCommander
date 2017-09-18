/**
 * ExceptionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner.fault;

public class ExceptionCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExceptionCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _APEX_TRIGGER_COUPLING_LIMIT = "APEX_TRIGGER_COUPLING_LIMIT";
    public static final java.lang.String _API_CURRENTLY_DISABLED = "API_CURRENTLY_DISABLED";
    public static final java.lang.String _API_DISABLED_FOR_ORG = "API_DISABLED_FOR_ORG";
    public static final java.lang.String _ARGUMENT_OBJECT_PARSE_ERROR = "ARGUMENT_OBJECT_PARSE_ERROR";
    public static final java.lang.String _ASYNC_OPERATION_LOCATOR = "ASYNC_OPERATION_LOCATOR";
    public static final java.lang.String _ASYNC_QUERY_UNSUPPORTED_QUERY = "ASYNC_QUERY_UNSUPPORTED_QUERY";
    public static final java.lang.String _BATCH_PROCESSING_HALTED = "BATCH_PROCESSING_HALTED";
    public static final java.lang.String _BIG_OBJECT_UNSUPPORTED_OPERATION = "BIG_OBJECT_UNSUPPORTED_OPERATION";
    public static final java.lang.String _CANNOT_DELETE_ENTITY = "CANNOT_DELETE_ENTITY";
    public static final java.lang.String _CANNOT_DELETE_OWNER = "CANNOT_DELETE_OWNER";
    public static final java.lang.String _CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY = "CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY";
    public static final java.lang.String _CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY = "CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY";
    public static final java.lang.String _CIRCULAR_OBJECT_GRAPH = "CIRCULAR_OBJECT_GRAPH";
    public static final java.lang.String _CLIENT_NOT_ACCESSIBLE_FOR_USER = "CLIENT_NOT_ACCESSIBLE_FOR_USER";
    public static final java.lang.String _CLIENT_REQUIRE_UPDATE_FOR_USER = "CLIENT_REQUIRE_UPDATE_FOR_USER";
    public static final java.lang.String _CONTENT_CUSTOM_DOWNLOAD_EXCEPTION = "CONTENT_CUSTOM_DOWNLOAD_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_AUTHENTICATION_EXCEPTION = "CONTENT_HUB_AUTHENTICATION_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION = "CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION = "CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION = "CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION = "CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_INVALID_PAYLOAD = "CONTENT_HUB_INVALID_PAYLOAD";
    public static final java.lang.String _CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION = "CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION = "CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION = "CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION = "CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_SECURITY_EXCEPTION = "CONTENT_HUB_SECURITY_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_TIMEOUT_EXCEPTION = "CONTENT_HUB_TIMEOUT_EXCEPTION";
    public static final java.lang.String _CONTENT_HUB_UNEXPECTED_EXCEPTION = "CONTENT_HUB_UNEXPECTED_EXCEPTION";
    public static final java.lang.String _CUSTOM_METADATA_LIMIT_EXCEEDED = "CUSTOM_METADATA_LIMIT_EXCEEDED";
    public static final java.lang.String _CUSTOM_SETTINGS_LIMIT_EXCEEDED = "CUSTOM_SETTINGS_LIMIT_EXCEEDED";
    public static final java.lang.String _DATACLOUD_API_CLIENT_EXCEPTION = "DATACLOUD_API_CLIENT_EXCEPTION";
    public static final java.lang.String _DATACLOUD_API_DISABLED_EXCEPTION = "DATACLOUD_API_DISABLED_EXCEPTION";
    public static final java.lang.String _DATACLOUD_API_INVALID_QUERY_EXCEPTION = "DATACLOUD_API_INVALID_QUERY_EXCEPTION";
    public static final java.lang.String _DATACLOUD_API_SERVER_BUSY_EXCEPTION = "DATACLOUD_API_SERVER_BUSY_EXCEPTION";
    public static final java.lang.String _DATACLOUD_API_SERVER_EXCEPTION = "DATACLOUD_API_SERVER_EXCEPTION";
    public static final java.lang.String _DATACLOUD_API_TIMEOUT_EXCEPTION = "DATACLOUD_API_TIMEOUT_EXCEPTION";
    public static final java.lang.String _DATACLOUD_API_UNAVAILABLE = "DATACLOUD_API_UNAVAILABLE";
    public static final java.lang.String _DUPLICATE_ARGUMENT_VALUE = "DUPLICATE_ARGUMENT_VALUE";
    public static final java.lang.String _DUPLICATE_VALUE = "DUPLICATE_VALUE";
    public static final java.lang.String _EMAIL_BATCH_SIZE_LIMIT_EXCEEDED = "EMAIL_BATCH_SIZE_LIMIT_EXCEEDED";
    public static final java.lang.String _EMAIL_TO_CASE_INVALID_ROUTING = "EMAIL_TO_CASE_INVALID_ROUTING";
    public static final java.lang.String _EMAIL_TO_CASE_LIMIT_EXCEEDED = "EMAIL_TO_CASE_LIMIT_EXCEEDED";
    public static final java.lang.String _EMAIL_TO_CASE_NOT_ENABLED = "EMAIL_TO_CASE_NOT_ENABLED";
    public static final java.lang.String _ENTITY_NOT_QUERYABLE = "ENTITY_NOT_QUERYABLE";
    public static final java.lang.String _ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT = "ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT";
    public static final java.lang.String _EXCEEDED_ID_LIMIT = "EXCEEDED_ID_LIMIT";
    public static final java.lang.String _EXCEEDED_LEAD_CONVERT_LIMIT = "EXCEEDED_LEAD_CONVERT_LIMIT";
    public static final java.lang.String _EXCEEDED_MAX_SIZE_REQUEST = "EXCEEDED_MAX_SIZE_REQUEST";
    public static final java.lang.String _EXCEEDED_MAX_SOBJECTS = "EXCEEDED_MAX_SOBJECTS";
    public static final java.lang.String _EXCEEDED_MAX_TYPES_LIMIT = "EXCEEDED_MAX_TYPES_LIMIT";
    public static final java.lang.String _EXCEEDED_QUOTA = "EXCEEDED_QUOTA";
    public static final java.lang.String _EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION = "EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION";
    public static final java.lang.String _EXTERNAL_OBJECT_CONNECTION_EXCEPTION = "EXTERNAL_OBJECT_CONNECTION_EXCEPTION";
    public static final java.lang.String _EXTERNAL_OBJECT_EXCEPTION = "EXTERNAL_OBJECT_EXCEPTION";
    public static final java.lang.String _EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION = "EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION";
    public static final java.lang.String _FEDERATED_SEARCH_ERROR = "FEDERATED_SEARCH_ERROR";
    public static final java.lang.String _FEED_NOT_ENABLED_FOR_OBJECT = "FEED_NOT_ENABLED_FOR_OBJECT";
    public static final java.lang.String _FUNCTIONALITY_NOT_ENABLED = "FUNCTIONALITY_NOT_ENABLED";
    public static final java.lang.String _FUNCTIONALITY_TEMPORARILY_UNAVAILABLE = "FUNCTIONALITY_TEMPORARILY_UNAVAILABLE";
    public static final java.lang.String _ILLEGAL_QUERY_PARAMETER_VALUE = "ILLEGAL_QUERY_PARAMETER_VALUE";
    public static final java.lang.String _INACTIVE_OWNER_OR_USER = "INACTIVE_OWNER_OR_USER";
    public static final java.lang.String _INACTIVE_PORTAL = "INACTIVE_PORTAL";
    public static final java.lang.String _INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE = "INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE";
    public static final java.lang.String _INSUFFICIENT_ACCESS = "INSUFFICIENT_ACCESS";
    public static final java.lang.String _INTERNAL_CANVAS_ERROR = "INTERNAL_CANVAS_ERROR";
    public static final java.lang.String _INVALID_ASSIGNMENT_RULE = "INVALID_ASSIGNMENT_RULE";
    public static final java.lang.String _INVALID_BATCH_REQUEST = "INVALID_BATCH_REQUEST";
    public static final java.lang.String _INVALID_BATCH_SIZE = "INVALID_BATCH_SIZE";
    public static final java.lang.String _INVALID_CLIENT = "INVALID_CLIENT";
    public static final java.lang.String _INVALID_CROSS_REFERENCE_KEY = "INVALID_CROSS_REFERENCE_KEY";
    public static final java.lang.String _INVALID_DATE_FORMAT = "INVALID_DATE_FORMAT";
    public static final java.lang.String _INVALID_FIELD = "INVALID_FIELD";
    public static final java.lang.String _INVALID_FILTER_LANGUAGE = "INVALID_FILTER_LANGUAGE";
    public static final java.lang.String _INVALID_FILTER_VALUE = "INVALID_FILTER_VALUE";
    public static final java.lang.String _INVALID_ID_FIELD = "INVALID_ID_FIELD";
    public static final java.lang.String _INVALID_INPUT_COMBINATION = "INVALID_INPUT_COMBINATION";
    public static final java.lang.String _INVALID_LOCALE_LANGUAGE = "INVALID_LOCALE_LANGUAGE";
    public static final java.lang.String _INVALID_LOCATOR = "INVALID_LOCATOR";
    public static final java.lang.String _INVALID_LOGIN = "INVALID_LOGIN";
    public static final java.lang.String _INVALID_MULTIPART_REQUEST = "INVALID_MULTIPART_REQUEST";
    public static final java.lang.String _INVALID_NEW_PASSWORD = "INVALID_NEW_PASSWORD";
    public static final java.lang.String _INVALID_OPERATION = "INVALID_OPERATION";
    public static final java.lang.String _INVALID_OPERATION_WITH_EXPIRED_PASSWORD = "INVALID_OPERATION_WITH_EXPIRED_PASSWORD";
    public static final java.lang.String _INVALID_PACKAGE_VERSION = "INVALID_PACKAGE_VERSION";
    public static final java.lang.String _INVALID_PAGING_OPTION = "INVALID_PAGING_OPTION";
    public static final java.lang.String _INVALID_QUERY_FILTER_OPERATOR = "INVALID_QUERY_FILTER_OPERATOR";
    public static final java.lang.String _INVALID_QUERY_LOCATOR = "INVALID_QUERY_LOCATOR";
    public static final java.lang.String _INVALID_QUERY_SCOPE = "INVALID_QUERY_SCOPE";
    public static final java.lang.String _INVALID_REPLICATION_DATE = "INVALID_REPLICATION_DATE";
    public static final java.lang.String _INVALID_SEARCH = "INVALID_SEARCH";
    public static final java.lang.String _INVALID_SEARCH_SCOPE = "INVALID_SEARCH_SCOPE";
    public static final java.lang.String _INVALID_SESSION_ID = "INVALID_SESSION_ID";
    public static final java.lang.String _INVALID_SOAP_HEADER = "INVALID_SOAP_HEADER";
    public static final java.lang.String _INVALID_SORT_OPTION = "INVALID_SORT_OPTION";
    public static final java.lang.String _INVALID_SSO_GATEWAY_URL = "INVALID_SSO_GATEWAY_URL";
    public static final java.lang.String _INVALID_TYPE = "INVALID_TYPE";
    public static final java.lang.String _INVALID_TYPE_FOR_OPERATION = "INVALID_TYPE_FOR_OPERATION";
    public static final java.lang.String _JIGSAW_ACTION_DISABLED = "JIGSAW_ACTION_DISABLED";
    public static final java.lang.String _JIGSAW_IMPORT_LIMIT_EXCEEDED = "JIGSAW_IMPORT_LIMIT_EXCEEDED";
    public static final java.lang.String _JIGSAW_REQUEST_NOT_SUPPORTED = "JIGSAW_REQUEST_NOT_SUPPORTED";
    public static final java.lang.String _JSON_PARSER_ERROR = "JSON_PARSER_ERROR";
    public static final java.lang.String _KEY_HAS_BEEN_DESTROYED = "KEY_HAS_BEEN_DESTROYED";
    public static final java.lang.String _LICENSING_DATA_ERROR = "LICENSING_DATA_ERROR";
    public static final java.lang.String _LICENSING_UNKNOWN_ERROR = "LICENSING_UNKNOWN_ERROR";
    public static final java.lang.String _LIMIT_EXCEEDED = "LIMIT_EXCEEDED";
    public static final java.lang.String _LOGIN_CHALLENGE_ISSUED = "LOGIN_CHALLENGE_ISSUED";
    public static final java.lang.String _LOGIN_CHALLENGE_PENDING = "LOGIN_CHALLENGE_PENDING";
    public static final java.lang.String _LOGIN_DURING_RESTRICTED_DOMAIN = "LOGIN_DURING_RESTRICTED_DOMAIN";
    public static final java.lang.String _LOGIN_DURING_RESTRICTED_TIME = "LOGIN_DURING_RESTRICTED_TIME";
    public static final java.lang.String _LOGIN_MUST_USE_SECURITY_TOKEN = "LOGIN_MUST_USE_SECURITY_TOKEN";
    public static final java.lang.String _MALFORMED_ID = "MALFORMED_ID";
    public static final java.lang.String _MALFORMED_QUERY = "MALFORMED_QUERY";
    public static final java.lang.String _MALFORMED_SEARCH = "MALFORMED_SEARCH";
    public static final java.lang.String _MISSING_ARGUMENT = "MISSING_ARGUMENT";
    public static final java.lang.String _MISSING_RECORD = "MISSING_RECORD";
    public static final java.lang.String _MODIFIED = "MODIFIED";
    public static final java.lang.String _MUTUAL_AUTHENTICATION_FAILED = "MUTUAL_AUTHENTICATION_FAILED";
    public static final java.lang.String _NOT_ACCEPTABLE = "NOT_ACCEPTABLE";
    public static final java.lang.String _NOT_MODIFIED = "NOT_MODIFIED";
    public static final java.lang.String _NO_ACTIVE_DUPLICATE_RULE = "NO_ACTIVE_DUPLICATE_RULE";
    public static final java.lang.String _NO_RECIPIENTS = "NO_RECIPIENTS";
    public static final java.lang.String _NO_SOFTPHONE_LAYOUT = "NO_SOFTPHONE_LAYOUT";
    public static final java.lang.String _NUMBER_OUTSIDE_VALID_RANGE = "NUMBER_OUTSIDE_VALID_RANGE";
    public static final java.lang.String _OPERATION_TOO_LARGE = "OPERATION_TOO_LARGE";
    public static final java.lang.String _ORG_IN_MAINTENANCE = "ORG_IN_MAINTENANCE";
    public static final java.lang.String _ORG_IS_DOT_ORG = "ORG_IS_DOT_ORG";
    public static final java.lang.String _ORG_IS_SIGNING_UP = "ORG_IS_SIGNING_UP";
    public static final java.lang.String _ORG_LOCKED = "ORG_LOCKED";
    public static final java.lang.String _ORG_NOT_OWNED_BY_INSTANCE = "ORG_NOT_OWNED_BY_INSTANCE";
    public static final java.lang.String _PASSWORD_LOCKOUT = "PASSWORD_LOCKOUT";
    public static final java.lang.String _PORTAL_NO_ACCESS = "PORTAL_NO_ACCESS";
    public static final java.lang.String _POST_BODY_PARSE_ERROR = "POST_BODY_PARSE_ERROR";
    public static final java.lang.String _QUERY_TIMEOUT = "QUERY_TIMEOUT";
    public static final java.lang.String _QUERY_TOO_COMPLICATED = "QUERY_TOO_COMPLICATED";
    public static final java.lang.String _REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT = "REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT";
    public static final java.lang.String _REQUEST_LIMIT_EXCEEDED = "REQUEST_LIMIT_EXCEEDED";
    public static final java.lang.String _REQUEST_RUNNING_TOO_LONG = "REQUEST_RUNNING_TOO_LONG";
    public static final java.lang.String _SERVER_UNAVAILABLE = "SERVER_UNAVAILABLE";
    public static final java.lang.String _SERVICE_DESK_NOT_ENABLED = "SERVICE_DESK_NOT_ENABLED";
    public static final java.lang.String _SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION = "SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION";
    public static final java.lang.String _SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION = "SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION";
    public static final java.lang.String _SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE = "SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE";
    public static final java.lang.String _SSO_SERVICE_DOWN = "SSO_SERVICE_DOWN";
    public static final java.lang.String _SST_ADMIN_FILE_DOWNLOAD_EXCEPTION = "SST_ADMIN_FILE_DOWNLOAD_EXCEPTION";
    public static final java.lang.String _TOO_MANY_APEX_REQUESTS = "TOO_MANY_APEX_REQUESTS";
    public static final java.lang.String _TOO_MANY_RECIPIENTS = "TOO_MANY_RECIPIENTS";
    public static final java.lang.String _TOO_MANY_RECORDS = "TOO_MANY_RECORDS";
    public static final java.lang.String _TRIAL_EXPIRED = "TRIAL_EXPIRED";
    public static final java.lang.String _TXN_SECURITY_END_A_SESSION = "TXN_SECURITY_END_A_SESSION";
    public static final java.lang.String _TXN_SECURITY_NO_ACCESS = "TXN_SECURITY_NO_ACCESS";
    public static final java.lang.String _TXN_SECURITY_TWO_FA_REQUIRED = "TXN_SECURITY_TWO_FA_REQUIRED";
    public static final java.lang.String _UNABLE_TO_LOCK_ROW = "UNABLE_TO_LOCK_ROW";
    public static final java.lang.String _UNKNOWN_ATTACHMENT_EXCEPTION = "UNKNOWN_ATTACHMENT_EXCEPTION";
    public static final java.lang.String _UNKNOWN_EXCEPTION = "UNKNOWN_EXCEPTION";
    public static final java.lang.String _UNKNOWN_ORG_SETTING = "UNKNOWN_ORG_SETTING";
    public static final java.lang.String _UNSUPPORTED_API_VERSION = "UNSUPPORTED_API_VERSION";
    public static final java.lang.String _UNSUPPORTED_ATTACHMENT_ENCODING = "UNSUPPORTED_ATTACHMENT_ENCODING";
    public static final java.lang.String _UNSUPPORTED_CLIENT = "UNSUPPORTED_CLIENT";
    public static final java.lang.String _UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE";
    public static final java.lang.String _XML_PARSER_ERROR = "XML_PARSER_ERROR";
    public static final ExceptionCode APEX_TRIGGER_COUPLING_LIMIT = new ExceptionCode(_APEX_TRIGGER_COUPLING_LIMIT);
    public static final ExceptionCode API_CURRENTLY_DISABLED = new ExceptionCode(_API_CURRENTLY_DISABLED);
    public static final ExceptionCode API_DISABLED_FOR_ORG = new ExceptionCode(_API_DISABLED_FOR_ORG);
    public static final ExceptionCode ARGUMENT_OBJECT_PARSE_ERROR = new ExceptionCode(_ARGUMENT_OBJECT_PARSE_ERROR);
    public static final ExceptionCode ASYNC_OPERATION_LOCATOR = new ExceptionCode(_ASYNC_OPERATION_LOCATOR);
    public static final ExceptionCode ASYNC_QUERY_UNSUPPORTED_QUERY = new ExceptionCode(_ASYNC_QUERY_UNSUPPORTED_QUERY);
    public static final ExceptionCode BATCH_PROCESSING_HALTED = new ExceptionCode(_BATCH_PROCESSING_HALTED);
    public static final ExceptionCode BIG_OBJECT_UNSUPPORTED_OPERATION = new ExceptionCode(_BIG_OBJECT_UNSUPPORTED_OPERATION);
    public static final ExceptionCode CANNOT_DELETE_ENTITY = new ExceptionCode(_CANNOT_DELETE_ENTITY);
    public static final ExceptionCode CANNOT_DELETE_OWNER = new ExceptionCode(_CANNOT_DELETE_OWNER);
    public static final ExceptionCode CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY = new ExceptionCode(_CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY);
    public static final ExceptionCode CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY = new ExceptionCode(_CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY);
    public static final ExceptionCode CIRCULAR_OBJECT_GRAPH = new ExceptionCode(_CIRCULAR_OBJECT_GRAPH);
    public static final ExceptionCode CLIENT_NOT_ACCESSIBLE_FOR_USER = new ExceptionCode(_CLIENT_NOT_ACCESSIBLE_FOR_USER);
    public static final ExceptionCode CLIENT_REQUIRE_UPDATE_FOR_USER = new ExceptionCode(_CLIENT_REQUIRE_UPDATE_FOR_USER);
    public static final ExceptionCode CONTENT_CUSTOM_DOWNLOAD_EXCEPTION = new ExceptionCode(_CONTENT_CUSTOM_DOWNLOAD_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_AUTHENTICATION_EXCEPTION = new ExceptionCode(_CONTENT_HUB_AUTHENTICATION_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION = new ExceptionCode(_CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION = new ExceptionCode(_CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION = new ExceptionCode(_CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION = new ExceptionCode(_CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_INVALID_PAYLOAD = new ExceptionCode(_CONTENT_HUB_INVALID_PAYLOAD);
    public static final ExceptionCode CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION = new ExceptionCode(_CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION = new ExceptionCode(_CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION = new ExceptionCode(_CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION = new ExceptionCode(_CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_SECURITY_EXCEPTION = new ExceptionCode(_CONTENT_HUB_SECURITY_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_TIMEOUT_EXCEPTION = new ExceptionCode(_CONTENT_HUB_TIMEOUT_EXCEPTION);
    public static final ExceptionCode CONTENT_HUB_UNEXPECTED_EXCEPTION = new ExceptionCode(_CONTENT_HUB_UNEXPECTED_EXCEPTION);
    public static final ExceptionCode CUSTOM_METADATA_LIMIT_EXCEEDED = new ExceptionCode(_CUSTOM_METADATA_LIMIT_EXCEEDED);
    public static final ExceptionCode CUSTOM_SETTINGS_LIMIT_EXCEEDED = new ExceptionCode(_CUSTOM_SETTINGS_LIMIT_EXCEEDED);
    public static final ExceptionCode DATACLOUD_API_CLIENT_EXCEPTION = new ExceptionCode(_DATACLOUD_API_CLIENT_EXCEPTION);
    public static final ExceptionCode DATACLOUD_API_DISABLED_EXCEPTION = new ExceptionCode(_DATACLOUD_API_DISABLED_EXCEPTION);
    public static final ExceptionCode DATACLOUD_API_INVALID_QUERY_EXCEPTION = new ExceptionCode(_DATACLOUD_API_INVALID_QUERY_EXCEPTION);
    public static final ExceptionCode DATACLOUD_API_SERVER_BUSY_EXCEPTION = new ExceptionCode(_DATACLOUD_API_SERVER_BUSY_EXCEPTION);
    public static final ExceptionCode DATACLOUD_API_SERVER_EXCEPTION = new ExceptionCode(_DATACLOUD_API_SERVER_EXCEPTION);
    public static final ExceptionCode DATACLOUD_API_TIMEOUT_EXCEPTION = new ExceptionCode(_DATACLOUD_API_TIMEOUT_EXCEPTION);
    public static final ExceptionCode DATACLOUD_API_UNAVAILABLE = new ExceptionCode(_DATACLOUD_API_UNAVAILABLE);
    public static final ExceptionCode DUPLICATE_ARGUMENT_VALUE = new ExceptionCode(_DUPLICATE_ARGUMENT_VALUE);
    public static final ExceptionCode DUPLICATE_VALUE = new ExceptionCode(_DUPLICATE_VALUE);
    public static final ExceptionCode EMAIL_BATCH_SIZE_LIMIT_EXCEEDED = new ExceptionCode(_EMAIL_BATCH_SIZE_LIMIT_EXCEEDED);
    public static final ExceptionCode EMAIL_TO_CASE_INVALID_ROUTING = new ExceptionCode(_EMAIL_TO_CASE_INVALID_ROUTING);
    public static final ExceptionCode EMAIL_TO_CASE_LIMIT_EXCEEDED = new ExceptionCode(_EMAIL_TO_CASE_LIMIT_EXCEEDED);
    public static final ExceptionCode EMAIL_TO_CASE_NOT_ENABLED = new ExceptionCode(_EMAIL_TO_CASE_NOT_ENABLED);
    public static final ExceptionCode ENTITY_NOT_QUERYABLE = new ExceptionCode(_ENTITY_NOT_QUERYABLE);
    public static final ExceptionCode ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT = new ExceptionCode(_ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT);
    public static final ExceptionCode EXCEEDED_ID_LIMIT = new ExceptionCode(_EXCEEDED_ID_LIMIT);
    public static final ExceptionCode EXCEEDED_LEAD_CONVERT_LIMIT = new ExceptionCode(_EXCEEDED_LEAD_CONVERT_LIMIT);
    public static final ExceptionCode EXCEEDED_MAX_SIZE_REQUEST = new ExceptionCode(_EXCEEDED_MAX_SIZE_REQUEST);
    public static final ExceptionCode EXCEEDED_MAX_SOBJECTS = new ExceptionCode(_EXCEEDED_MAX_SOBJECTS);
    public static final ExceptionCode EXCEEDED_MAX_TYPES_LIMIT = new ExceptionCode(_EXCEEDED_MAX_TYPES_LIMIT);
    public static final ExceptionCode EXCEEDED_QUOTA = new ExceptionCode(_EXCEEDED_QUOTA);
    public static final ExceptionCode EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION = new ExceptionCode(_EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION);
    public static final ExceptionCode EXTERNAL_OBJECT_CONNECTION_EXCEPTION = new ExceptionCode(_EXTERNAL_OBJECT_CONNECTION_EXCEPTION);
    public static final ExceptionCode EXTERNAL_OBJECT_EXCEPTION = new ExceptionCode(_EXTERNAL_OBJECT_EXCEPTION);
    public static final ExceptionCode EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION = new ExceptionCode(_EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION);
    public static final ExceptionCode FEDERATED_SEARCH_ERROR = new ExceptionCode(_FEDERATED_SEARCH_ERROR);
    public static final ExceptionCode FEED_NOT_ENABLED_FOR_OBJECT = new ExceptionCode(_FEED_NOT_ENABLED_FOR_OBJECT);
    public static final ExceptionCode FUNCTIONALITY_NOT_ENABLED = new ExceptionCode(_FUNCTIONALITY_NOT_ENABLED);
    public static final ExceptionCode FUNCTIONALITY_TEMPORARILY_UNAVAILABLE = new ExceptionCode(_FUNCTIONALITY_TEMPORARILY_UNAVAILABLE);
    public static final ExceptionCode ILLEGAL_QUERY_PARAMETER_VALUE = new ExceptionCode(_ILLEGAL_QUERY_PARAMETER_VALUE);
    public static final ExceptionCode INACTIVE_OWNER_OR_USER = new ExceptionCode(_INACTIVE_OWNER_OR_USER);
    public static final ExceptionCode INACTIVE_PORTAL = new ExceptionCode(_INACTIVE_PORTAL);
    public static final ExceptionCode INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE = new ExceptionCode(_INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE);
    public static final ExceptionCode INSUFFICIENT_ACCESS = new ExceptionCode(_INSUFFICIENT_ACCESS);
    public static final ExceptionCode INTERNAL_CANVAS_ERROR = new ExceptionCode(_INTERNAL_CANVAS_ERROR);
    public static final ExceptionCode INVALID_ASSIGNMENT_RULE = new ExceptionCode(_INVALID_ASSIGNMENT_RULE);
    public static final ExceptionCode INVALID_BATCH_REQUEST = new ExceptionCode(_INVALID_BATCH_REQUEST);
    public static final ExceptionCode INVALID_BATCH_SIZE = new ExceptionCode(_INVALID_BATCH_SIZE);
    public static final ExceptionCode INVALID_CLIENT = new ExceptionCode(_INVALID_CLIENT);
    public static final ExceptionCode INVALID_CROSS_REFERENCE_KEY = new ExceptionCode(_INVALID_CROSS_REFERENCE_KEY);
    public static final ExceptionCode INVALID_DATE_FORMAT = new ExceptionCode(_INVALID_DATE_FORMAT);
    public static final ExceptionCode INVALID_FIELD = new ExceptionCode(_INVALID_FIELD);
    public static final ExceptionCode INVALID_FILTER_LANGUAGE = new ExceptionCode(_INVALID_FILTER_LANGUAGE);
    public static final ExceptionCode INVALID_FILTER_VALUE = new ExceptionCode(_INVALID_FILTER_VALUE);
    public static final ExceptionCode INVALID_ID_FIELD = new ExceptionCode(_INVALID_ID_FIELD);
    public static final ExceptionCode INVALID_INPUT_COMBINATION = new ExceptionCode(_INVALID_INPUT_COMBINATION);
    public static final ExceptionCode INVALID_LOCALE_LANGUAGE = new ExceptionCode(_INVALID_LOCALE_LANGUAGE);
    public static final ExceptionCode INVALID_LOCATOR = new ExceptionCode(_INVALID_LOCATOR);
    public static final ExceptionCode INVALID_LOGIN = new ExceptionCode(_INVALID_LOGIN);
    public static final ExceptionCode INVALID_MULTIPART_REQUEST = new ExceptionCode(_INVALID_MULTIPART_REQUEST);
    public static final ExceptionCode INVALID_NEW_PASSWORD = new ExceptionCode(_INVALID_NEW_PASSWORD);
    public static final ExceptionCode INVALID_OPERATION = new ExceptionCode(_INVALID_OPERATION);
    public static final ExceptionCode INVALID_OPERATION_WITH_EXPIRED_PASSWORD = new ExceptionCode(_INVALID_OPERATION_WITH_EXPIRED_PASSWORD);
    public static final ExceptionCode INVALID_PACKAGE_VERSION = new ExceptionCode(_INVALID_PACKAGE_VERSION);
    public static final ExceptionCode INVALID_PAGING_OPTION = new ExceptionCode(_INVALID_PAGING_OPTION);
    public static final ExceptionCode INVALID_QUERY_FILTER_OPERATOR = new ExceptionCode(_INVALID_QUERY_FILTER_OPERATOR);
    public static final ExceptionCode INVALID_QUERY_LOCATOR = new ExceptionCode(_INVALID_QUERY_LOCATOR);
    public static final ExceptionCode INVALID_QUERY_SCOPE = new ExceptionCode(_INVALID_QUERY_SCOPE);
    public static final ExceptionCode INVALID_REPLICATION_DATE = new ExceptionCode(_INVALID_REPLICATION_DATE);
    public static final ExceptionCode INVALID_SEARCH = new ExceptionCode(_INVALID_SEARCH);
    public static final ExceptionCode INVALID_SEARCH_SCOPE = new ExceptionCode(_INVALID_SEARCH_SCOPE);
    public static final ExceptionCode INVALID_SESSION_ID = new ExceptionCode(_INVALID_SESSION_ID);
    public static final ExceptionCode INVALID_SOAP_HEADER = new ExceptionCode(_INVALID_SOAP_HEADER);
    public static final ExceptionCode INVALID_SORT_OPTION = new ExceptionCode(_INVALID_SORT_OPTION);
    public static final ExceptionCode INVALID_SSO_GATEWAY_URL = new ExceptionCode(_INVALID_SSO_GATEWAY_URL);
    public static final ExceptionCode INVALID_TYPE = new ExceptionCode(_INVALID_TYPE);
    public static final ExceptionCode INVALID_TYPE_FOR_OPERATION = new ExceptionCode(_INVALID_TYPE_FOR_OPERATION);
    public static final ExceptionCode JIGSAW_ACTION_DISABLED = new ExceptionCode(_JIGSAW_ACTION_DISABLED);
    public static final ExceptionCode JIGSAW_IMPORT_LIMIT_EXCEEDED = new ExceptionCode(_JIGSAW_IMPORT_LIMIT_EXCEEDED);
    public static final ExceptionCode JIGSAW_REQUEST_NOT_SUPPORTED = new ExceptionCode(_JIGSAW_REQUEST_NOT_SUPPORTED);
    public static final ExceptionCode JSON_PARSER_ERROR = new ExceptionCode(_JSON_PARSER_ERROR);
    public static final ExceptionCode KEY_HAS_BEEN_DESTROYED = new ExceptionCode(_KEY_HAS_BEEN_DESTROYED);
    public static final ExceptionCode LICENSING_DATA_ERROR = new ExceptionCode(_LICENSING_DATA_ERROR);
    public static final ExceptionCode LICENSING_UNKNOWN_ERROR = new ExceptionCode(_LICENSING_UNKNOWN_ERROR);
    public static final ExceptionCode LIMIT_EXCEEDED = new ExceptionCode(_LIMIT_EXCEEDED);
    public static final ExceptionCode LOGIN_CHALLENGE_ISSUED = new ExceptionCode(_LOGIN_CHALLENGE_ISSUED);
    public static final ExceptionCode LOGIN_CHALLENGE_PENDING = new ExceptionCode(_LOGIN_CHALLENGE_PENDING);
    public static final ExceptionCode LOGIN_DURING_RESTRICTED_DOMAIN = new ExceptionCode(_LOGIN_DURING_RESTRICTED_DOMAIN);
    public static final ExceptionCode LOGIN_DURING_RESTRICTED_TIME = new ExceptionCode(_LOGIN_DURING_RESTRICTED_TIME);
    public static final ExceptionCode LOGIN_MUST_USE_SECURITY_TOKEN = new ExceptionCode(_LOGIN_MUST_USE_SECURITY_TOKEN);
    public static final ExceptionCode MALFORMED_ID = new ExceptionCode(_MALFORMED_ID);
    public static final ExceptionCode MALFORMED_QUERY = new ExceptionCode(_MALFORMED_QUERY);
    public static final ExceptionCode MALFORMED_SEARCH = new ExceptionCode(_MALFORMED_SEARCH);
    public static final ExceptionCode MISSING_ARGUMENT = new ExceptionCode(_MISSING_ARGUMENT);
    public static final ExceptionCode MISSING_RECORD = new ExceptionCode(_MISSING_RECORD);
    public static final ExceptionCode MODIFIED = new ExceptionCode(_MODIFIED);
    public static final ExceptionCode MUTUAL_AUTHENTICATION_FAILED = new ExceptionCode(_MUTUAL_AUTHENTICATION_FAILED);
    public static final ExceptionCode NOT_ACCEPTABLE = new ExceptionCode(_NOT_ACCEPTABLE);
    public static final ExceptionCode NOT_MODIFIED = new ExceptionCode(_NOT_MODIFIED);
    public static final ExceptionCode NO_ACTIVE_DUPLICATE_RULE = new ExceptionCode(_NO_ACTIVE_DUPLICATE_RULE);
    public static final ExceptionCode NO_RECIPIENTS = new ExceptionCode(_NO_RECIPIENTS);
    public static final ExceptionCode NO_SOFTPHONE_LAYOUT = new ExceptionCode(_NO_SOFTPHONE_LAYOUT);
    public static final ExceptionCode NUMBER_OUTSIDE_VALID_RANGE = new ExceptionCode(_NUMBER_OUTSIDE_VALID_RANGE);
    public static final ExceptionCode OPERATION_TOO_LARGE = new ExceptionCode(_OPERATION_TOO_LARGE);
    public static final ExceptionCode ORG_IN_MAINTENANCE = new ExceptionCode(_ORG_IN_MAINTENANCE);
    public static final ExceptionCode ORG_IS_DOT_ORG = new ExceptionCode(_ORG_IS_DOT_ORG);
    public static final ExceptionCode ORG_IS_SIGNING_UP = new ExceptionCode(_ORG_IS_SIGNING_UP);
    public static final ExceptionCode ORG_LOCKED = new ExceptionCode(_ORG_LOCKED);
    public static final ExceptionCode ORG_NOT_OWNED_BY_INSTANCE = new ExceptionCode(_ORG_NOT_OWNED_BY_INSTANCE);
    public static final ExceptionCode PASSWORD_LOCKOUT = new ExceptionCode(_PASSWORD_LOCKOUT);
    public static final ExceptionCode PORTAL_NO_ACCESS = new ExceptionCode(_PORTAL_NO_ACCESS);
    public static final ExceptionCode POST_BODY_PARSE_ERROR = new ExceptionCode(_POST_BODY_PARSE_ERROR);
    public static final ExceptionCode QUERY_TIMEOUT = new ExceptionCode(_QUERY_TIMEOUT);
    public static final ExceptionCode QUERY_TOO_COMPLICATED = new ExceptionCode(_QUERY_TOO_COMPLICATED);
    public static final ExceptionCode REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT = new ExceptionCode(_REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT);
    public static final ExceptionCode REQUEST_LIMIT_EXCEEDED = new ExceptionCode(_REQUEST_LIMIT_EXCEEDED);
    public static final ExceptionCode REQUEST_RUNNING_TOO_LONG = new ExceptionCode(_REQUEST_RUNNING_TOO_LONG);
    public static final ExceptionCode SERVER_UNAVAILABLE = new ExceptionCode(_SERVER_UNAVAILABLE);
    public static final ExceptionCode SERVICE_DESK_NOT_ENABLED = new ExceptionCode(_SERVICE_DESK_NOT_ENABLED);
    public static final ExceptionCode SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION = new ExceptionCode(_SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION);
    public static final ExceptionCode SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION = new ExceptionCode(_SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION);
    public static final ExceptionCode SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE = new ExceptionCode(_SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE);
    public static final ExceptionCode SSO_SERVICE_DOWN = new ExceptionCode(_SSO_SERVICE_DOWN);
    public static final ExceptionCode SST_ADMIN_FILE_DOWNLOAD_EXCEPTION = new ExceptionCode(_SST_ADMIN_FILE_DOWNLOAD_EXCEPTION);
    public static final ExceptionCode TOO_MANY_APEX_REQUESTS = new ExceptionCode(_TOO_MANY_APEX_REQUESTS);
    public static final ExceptionCode TOO_MANY_RECIPIENTS = new ExceptionCode(_TOO_MANY_RECIPIENTS);
    public static final ExceptionCode TOO_MANY_RECORDS = new ExceptionCode(_TOO_MANY_RECORDS);
    public static final ExceptionCode TRIAL_EXPIRED = new ExceptionCode(_TRIAL_EXPIRED);
    public static final ExceptionCode TXN_SECURITY_END_A_SESSION = new ExceptionCode(_TXN_SECURITY_END_A_SESSION);
    public static final ExceptionCode TXN_SECURITY_NO_ACCESS = new ExceptionCode(_TXN_SECURITY_NO_ACCESS);
    public static final ExceptionCode TXN_SECURITY_TWO_FA_REQUIRED = new ExceptionCode(_TXN_SECURITY_TWO_FA_REQUIRED);
    public static final ExceptionCode UNABLE_TO_LOCK_ROW = new ExceptionCode(_UNABLE_TO_LOCK_ROW);
    public static final ExceptionCode UNKNOWN_ATTACHMENT_EXCEPTION = new ExceptionCode(_UNKNOWN_ATTACHMENT_EXCEPTION);
    public static final ExceptionCode UNKNOWN_EXCEPTION = new ExceptionCode(_UNKNOWN_EXCEPTION);
    public static final ExceptionCode UNKNOWN_ORG_SETTING = new ExceptionCode(_UNKNOWN_ORG_SETTING);
    public static final ExceptionCode UNSUPPORTED_API_VERSION = new ExceptionCode(_UNSUPPORTED_API_VERSION);
    public static final ExceptionCode UNSUPPORTED_ATTACHMENT_ENCODING = new ExceptionCode(_UNSUPPORTED_ATTACHMENT_ENCODING);
    public static final ExceptionCode UNSUPPORTED_CLIENT = new ExceptionCode(_UNSUPPORTED_CLIENT);
    public static final ExceptionCode UNSUPPORTED_MEDIA_TYPE = new ExceptionCode(_UNSUPPORTED_MEDIA_TYPE);
    public static final ExceptionCode XML_PARSER_ERROR = new ExceptionCode(_XML_PARSER_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ExceptionCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExceptionCode enumeration = (ExceptionCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExceptionCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExceptionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "ExceptionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
