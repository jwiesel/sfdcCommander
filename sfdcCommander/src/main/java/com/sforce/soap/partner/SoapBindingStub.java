/**
 * SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SoapBindingStub extends org.apache.axis.client.Stub implements com.sforce.soap.partner.Soap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[52];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LoginResult"));
        oper.setReturnClass(com.sforce.soap.partner.LoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "LoginFault"),
                      "com.sforce.soap.partner.fault.LoginFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "LoginFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSObjectResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeSObjectResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSObjectResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeSObjectResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeGlobal");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeGlobalResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeGlobalResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeDataCategoryGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeDataCategoryGroupResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeDataCategoryGroupResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeDataCategoryGroupStructures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "pairs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DataCategoryGroupSobjectTypePair"), com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "topCategoriesOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeDataCategoryGroupStructureResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeKnowledgeSettings");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "KnowledgeSettings"));
        oper.setReturnClass(com.sforce.soap.partner.KnowledgeSettings.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeFlexiPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "flexiPages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeFlexiPageResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeFlexiPageResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeAppMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "appMenuType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "AppMenuType"), com.sforce.soap.partner.AppMenuType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeAppMenuResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeAppMenuItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "appMenuItems"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeGlobalTheme");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeGlobalTheme"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeGlobalTheme.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeTheme");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sobjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeThemeResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeThemeItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "themeItems"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "layoutName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeLayoutResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSoftphoneLayout");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoftphoneLayoutResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeSoftphoneLayoutResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSearchLayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchLayoutResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeSearchLayoutResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSearchScopeOrder");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchScopeOrderResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeSearchScopeOrderResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeCompactLayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayoutsResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeCompactLayoutsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeApprovalLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "approvalProcessNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeApprovalLayoutResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeApprovalLayout[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "approvalLayouts"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSoqlListViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewsRequest"), com.sforce.soap.partner.DescribeSoqlListViewParams[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "listViewParams"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeSoqlListView[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoqlListViews"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeListView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ExecuteListViewRequest"), com.sforce.soap.partner.ExecuteListViewRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ExecuteListViewResult"));
        oper.setReturnClass(com.sforce.soap.partner.ExecuteListViewResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObjectListViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recentsOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "isSoqlCompatible"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "listViewIsSoqlCompatible"), com.sforce.soap.partner.ListViewIsSoqlCompatible.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeSoqlListView[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoqlListViews"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeTabs");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeTabSetResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeTabSetResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeAllTabs");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeTab"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeTab[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describePrimaryCompactLayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayout"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeCompactLayout[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject"), com.sforce.soap.partner.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SaveResult"));
        oper.setReturnClass(com.sforce.soap.partner.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject"), com.sforce.soap.partner.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SaveResult"));
        oper.setReturnClass(com.sforce.soap.partner.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "externalIDFieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject"), com.sforce.soap.partner.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "UpsertResult"));
        oper.setReturnClass(com.sforce.soap.partner.UpsertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("merge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MergeRequest"), com.sforce.soap.partner.MergeRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MergeResult"));
        oper.setReturnClass(com.sforce.soap.partner.MergeResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DeleteResult"));
        oper.setReturnClass(com.sforce.soap.partner.DeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("undelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "UndeleteResult"));
        oper.setReturnClass(com.sforce.soap.partner.UndeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyRecycleBin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EmptyRecycleBinResult"));
        oper.setReturnClass(com.sforce.soap.partner.EmptyRecycleBinResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject"));
        oper.setReturnClass(com.sforce.soap.partner.sobject.SObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.partner.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "actions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessRequest"), com.sforce.soap.partner.ProcessRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessResult"));
        oper.setReturnClass(com.sforce.soap.partner.ProcessResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("convertLead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "leadConverts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LeadConvert"), com.sforce.soap.partner.LeadConvert[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LeadConvertResult"));
        oper.setReturnClass(com.sforce.soap.partner.LeadConvertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invalidateSessions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sessionIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "InvalidateSessionsResult"));
        oper.setReturnClass(com.sforce.soap.partner.InvalidateSessionsResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeleted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetDeletedResult"));
        oper.setReturnClass(com.sforce.soap.partner.GetDeletedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUpdated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetUpdatedResult"));
        oper.setReturnClass(com.sforce.soap.partner.GetUpdatedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QueryResult"));
        oper.setReturnClass(com.sforce.soap.partner.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.partner.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.partner.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QueryResult"));
        oper.setReturnClass(com.sforce.soap.partner.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.partner.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.partner.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryMore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryLocator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QueryLocator"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QueryResult"));
        oper.setReturnClass(com.sforce.soap.partner.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.partner.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.partner.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchResult"));
        oper.setReturnClass(com.sforce.soap.partner.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.partner.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.partner.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedSearchFault"),
                      "com.sforce.soap.partner.fault.MalformedSearchFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedSearchFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerTimestamp");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetServerTimestampResult"));
        oper.setReturnClass(com.sforce.soap.partner.GetServerTimestampResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SetPasswordResult"));
        oper.setReturnClass(com.sforce.soap.partner.SetPasswordResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidNewPasswordFault"),
                      "com.sforce.soap.partner.fault.InvalidNewPasswordFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidNewPasswordFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ResetPasswordResult"));
        oper.setReturnClass(com.sforce.soap.partner.ResetPasswordResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.partner.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInfo");
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetUserInfoResult"));
        oper.setReturnClass(com.sforce.soap.partner.GetUserInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendEmailMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SendEmailResult"));
        oper.setReturnClass(com.sforce.soap.partner.SendEmailResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "messages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Email"), com.sforce.soap.partner.Email[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SendEmailResult"));
        oper.setReturnClass(com.sforce.soap.partner.SendEmailResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.partner.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performQuickActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionRequest"), com.sforce.soap.partner.PerformQuickActionRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionResult"));
        oper.setReturnClass(com.sforce.soap.partner.PerformQuickActionResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeQuickActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeQuickActionResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeAvailableQuickActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contextType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeAvailableQuickActionResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeAvailableQuickActionResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveQuickActionTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contextId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QuickActionTemplateResult"));
        oper.setReturnClass(com.sforce.soap.partner.QuickActionTemplateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeNouns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "nouns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "onlyRenamed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "includeFields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeNounResult"));
        oper.setReturnClass(com.sforce.soap.partner.DescribeNounResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

    }

    public SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "ApiFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.ApiFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "ApiQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.ApiQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "ExceptionCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.ExceptionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "FaultCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.FaultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.InvalidFieldFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.InvalidIdFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidNewPasswordFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.InvalidNewPasswordFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.InvalidQueryLocatorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.InvalidSObjectFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "LoginFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.LoginFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.MalformedQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "MalformedSearchFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.MalformedSearchFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.fault.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">AllOrNoneHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.AllOrNoneHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">AllowFieldTruncationHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.AllowFieldTruncationHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">AssignmentRuleHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.AssignmentRuleHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">CallOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.CallOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">convertLead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LeadConvert[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LeadConvert");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "leadConverts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">convertLeadResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LeadConvertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LeadConvertResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">create");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">createResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SaveResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">DebuggingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DebuggingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">DebuggingInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DebuggingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">delete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">deleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DeleteResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeAllTabs");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAllTabs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeAllTabsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeTab[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeTab");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeAppMenu");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAppMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeAppMenuResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAppMenuResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeApprovalLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeApprovalLayoutType1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeApprovalLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeApprovalLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeAvailableQuickActions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAvailableQuickActions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeAvailableQuickActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAvailableQuickActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeAvailableQuickActionResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeCompactLayouts");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeCompactLayouts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeCompactLayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeCompactLayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeDataCategoryGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeDataCategoryGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeDataCategoryGroupResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeDataCategoryGroupResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeDataCategoryGroupStructures");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeDataCategoryGroupStructures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeDataCategoryGroupStructuresResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeDataCategoryGroupStructureResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeFlexiPages");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "flexiPages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeFlexiPagesResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeFlexiPageResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeFlexiPageResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeGlobal");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeGlobal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeGlobalResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeGlobalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeGlobalTheme");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeGlobalThemeType0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeGlobalThemeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeGlobalThemeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeKnowledgeSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeKnowledgeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeKnowledgeSettingsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeKnowledgeSettingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutType2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeNouns");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeNouns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeNounsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeNounResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeNounResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describePrimaryCompactLayouts");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectTypes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describePrimaryCompactLayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeCompactLayout[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayout");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeQuickActions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeQuickActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeQuickActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSearchLayouts");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSearchLayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSearchLayoutResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchLayoutResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSearchScopeOrder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSearchScopeOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSearchScopeOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSearchScopeOrderResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchScopeOrderResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObjectListViews");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSObjectListViews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObjectListViewsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSObjectListViewsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObjectResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSObjectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObjects");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObjectsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSObjectResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSObjectResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSoftphoneLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSoftphoneLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSoqlListViews");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoqlListViews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSoqlListViewsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoqlListViewsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeTabs");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeTabs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeTabsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeTabSetResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeTabSetResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeTheme");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sobjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeThemeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeThemeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">DisableFeedTrackingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DisableFeedTrackingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">DuplicateRuleHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DuplicateRuleHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">EmailHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.EmailHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">emptyRecycleBin");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">emptyRecycleBinResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.EmptyRecycleBinResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EmptyRecycleBinResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">executeListView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ExecuteListView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">executeListViewResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ExecuteListViewResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getDeleted");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetDeleted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getDeletedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetDeletedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getServerTimestamp");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetServerTimestamp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getServerTimestampResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetServerTimestampResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getUpdated");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetUpdated.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getUpdatedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetUpdatedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getUserInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">getUserInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetUserInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">invalidateSessions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sessionIds");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">invalidateSessionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.InvalidateSessionsResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "InvalidateSessionsResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">LimitInfoHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LimitInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LimitInfo");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "limitInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">LocaleOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LocaleOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">login");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">loginResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">LoginScopeHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LoginScopeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">logout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">logoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">merge");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MergeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MergeRequest");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "request");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">mergeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MergeResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MergeResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">MruHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MruHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">OwnerChangeOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.OwnerChangeOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">PackageVersionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PackageVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PackageVersion");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "packageVersions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">performQuickActions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PerformQuickActionRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionRequest");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">performQuickActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PerformQuickActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">process");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ProcessRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessRequest");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "actions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">processResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ProcessResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">query");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">queryAll");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QueryAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">queryAllResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QueryAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">queryMore");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QueryMore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">queryMoreResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QueryMoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">QueryOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QueryOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">queryResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">resetPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ResetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">resetPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ResetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">retrieve");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Retrieve.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">retrieveQuickActionTemplates");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.RetrieveQuickActionTemplates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">retrieveQuickActionTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QuickActionTemplateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QuickActionTemplateResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">retrieveResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">search");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Search.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">searchResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">sendEmail");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Email[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Email");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "messages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">sendEmailMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">sendEmailMessageResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SendEmailResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SendEmailResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">sendEmailResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SendEmailResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SendEmailResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">SessionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SessionHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">setPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">setPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">StreamingEnabledHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.StreamingEnabledHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">undelete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">undeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.UndeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "UndeleteResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">update");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">updateResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SaveResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">upsert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Upsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">upsertResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.UpsertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "UpsertResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">UserTerritoryDeleteHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.UserTerritoryDeleteHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ActionOverride");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ActionOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "AdditionalInformationMap");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.AdditionalInformationMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "address");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "AnalyticsCloudComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.AnalyticsCloudComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "AppMenuType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.AppMenuType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Article");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Article.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "CaseType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.CaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ChildRelationship");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ChildRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "CustomLinkComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.CustomLinkComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DataCategory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DataCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DataCategoryGroupSobjectTypePair");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DataCategoryGroupSobjectTypePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DebugLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DebugLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DeletedRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DeletedRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeAppMenuItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAppMenuItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeAppMenuResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAppMenuItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeAppMenuItem");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "appMenuItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeApprovalLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeApprovalLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeApprovalLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeApprovalLayout[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeApprovalLayout");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "approvalLayouts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeAvailableQuickActionResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeAvailableQuickActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeColor");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeColor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeCompactLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeCompactLayoutsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeCompactLayoutsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeComponentInstance");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeComponentInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeComponentInstanceProperty");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeComponentInstanceProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeDataCategoryGroupResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeDataCategoryGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeDataCategoryGroupStructureResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeFlexiPageRegion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeFlexiPageRegion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeFlexiPageResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeFlexiPageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeGlobalResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeGlobalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeGlobalSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeGlobalSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeGlobalTheme");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeGlobalTheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeIcon");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeIcon.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutButtonSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutButton[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutButton");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "detailButtons");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutFeedFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutFeedFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutFeedView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutFeedFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutFeedFilter");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "feedFilters");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutRow");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeNounResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeNounResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionDefaultValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeQuickActionDefaultValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionListItemResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeQuickActionListItemResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionListResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeQuickActionListItemResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionListItemResult");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "quickActionListItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeQuickActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeRelatedContentItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeRelatedContentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSearchLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSearchScopeOrderResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSearchScopeOrderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoftphoneLayoutCallType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneLayoutCallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoftphoneLayoutInfoField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoftphoneLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoftphoneLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoftphoneLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoftphoneScreenPopOption");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoftphoneScreenPopOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoqlListView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewParams");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoqlListViewParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoqlListView[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListView");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoqlListViews");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewsRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeSoqlListViewParams[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeSoqlListViewParams");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "listViewParams");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeTab");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeTabSetResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeTabSetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeThemeItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeThemeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeThemeResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeThemeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeThemeItem");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "themeItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "differenceType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DifferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DuplicateError");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DuplicateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DuplicateResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DuplicateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Email");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Email.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EmailFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.EmailFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EmailPriority");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.EmailPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EmptyRecycleBinResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.EmptyRecycleBinResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Error");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ExecuteListViewRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ExecuteListViewRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ExecuteListViewResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ExecuteListViewResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FeedLayoutFilterType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.FeedLayoutFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Field");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FieldComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.FieldComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FieldDiff");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.FieldDiff.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FieldLayoutComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.FieldLayoutComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "fieldType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.FieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "FilteredLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.FilteredLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Gender");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetDeletedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetDeletedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetServerTimestampResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetServerTimestampResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetUpdatedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetUpdatedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GetUserInfoResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GetUserInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "GrammaticalNumber");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.GrammaticalNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "InvalidateSessionsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.InvalidateSessionsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "KnowledgeLanguageItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.KnowledgeLanguageItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "KnowledgeSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.KnowledgeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "layoutComponentType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LayoutComponentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LeadConvert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LeadConvert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LeadConvertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LeadConvertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LimitInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LimitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ListViewColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "listViewIsSoqlCompatible");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ListViewIsSoqlCompatible.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewOrderBy");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ListViewOrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ListViewRecordColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewRecordColumn");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "columns");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ListViewRecordColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ListViewRecordColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "location");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "LoginResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MassEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MassEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MatchRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MatchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MatchResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MatchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MergeRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MergeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MergeResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.MergeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NameCaseValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.NameCaseValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NamedLayoutInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.NamedLayoutInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "NameValuePair");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.NameValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "orderByDirection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.OrderByDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "orderByNullsPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.OrderByNullsPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PackageVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PackageVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PerformQuickActionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PerformQuickActionResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PerformQuickActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PicklistEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PicklistEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "PicklistForRecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.PicklistForRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Possessive");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.Possessive.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ProcessResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessSubmitRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ProcessSubmitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ProcessWorkitemRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ProcessWorkitemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QueryLocator");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "QuickActionTemplateResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.QuickActionTemplateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RecordTypeCompactLayoutMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.RecordTypeCompactLayoutMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RecordTypeInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.RecordTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RecordTypeMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.RecordTypeMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RelatedContent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.DescribeRelatedContentItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeRelatedContentItem");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "relatedContentItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RelatedList");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.RelatedList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RelatedListColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.RelatedListColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RelatedListSort");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.RelatedListSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RelationshipReferenceTo");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "referenceTo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ReportChartComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ReportChartComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ReportChartSize");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ReportChartSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ResetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ResetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SearchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SearchSnippet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SearchSnippet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SendEmailError");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SendEmailError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SendEmailResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SendEmailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ShareAccessLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.ShareAccessLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SingleEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SingleEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "soapType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoapType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SoqlCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoqlCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SoqlConditionGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoqlConditionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "soqlConjunction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoqlConjunction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SoqlNotCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoqlNotCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "soqlOperator");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoqlOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SoqlSubQueryCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoqlSubQueryCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "SoqlWhereCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.SoqlWhereCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "StartsWith");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.StartsWith.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "TabOrderType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.TabOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "UndeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.UndeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "UpsertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.UpsertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "WebLinkPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.WebLinkPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "WebLinkType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.WebLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "WebLinkWindowType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.WebLinkWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sobject.partner.soap.sforce.com", "sObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.partner.sobject.SObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sforce.soap.partner.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.LoginFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.LoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.LoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.LoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.LoginFault) {
              throw (com.sforce.soap.partner.fault.LoginFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeSObjectResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeSObjectResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeSObjectResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeSObjectResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeSObjectResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeSObjectResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeGlobalResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeGlobalResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeGlobalResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeDataCategoryGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeDataCategoryGroupResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeDataCategoryGroupResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeDataCategoryGroupResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] pairs, boolean topCategoriesOnly) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeDataCategoryGroupStructures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pairs, new java.lang.Boolean(topCategoriesOnly)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.KnowledgeSettings describeKnowledgeSettings() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeKnowledgeSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.KnowledgeSettings) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.KnowledgeSettings) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.KnowledgeSettings.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeFlexiPageResult[] describeFlexiPages(java.lang.String[] flexiPages) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeFlexiPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {flexiPages});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeFlexiPageResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeFlexiPageResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeFlexiPageResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeAppMenuItem[] describeAppMenu(com.sforce.soap.partner.AppMenuType appMenuType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeAppMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {appMenuType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeAppMenuItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeAppMenuItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeAppMenuItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeGlobalTheme describeGlobalTheme() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobalTheme"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeGlobalTheme) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeGlobalTheme) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeGlobalTheme.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeThemeItem[] describeTheme(java.lang.String[] sobjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTheme"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sobjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeThemeItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeThemeItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeThemeItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String layoutName, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, layoutName, recordTypeIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeLayoutResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeLayoutResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeLayoutResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeSoftphoneLayoutResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeSoftphoneLayoutResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeSoftphoneLayoutResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeSearchLayoutResult[] describeSearchLayouts(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSearchLayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeSearchLayoutResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeSearchLayoutResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeSearchLayoutResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeSearchScopeOrderResult[] describeSearchScopeOrder() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSearchScopeOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeSearchScopeOrderResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeSearchScopeOrderResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeSearchScopeOrderResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeCompactLayoutsResult describeCompactLayouts(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeCompactLayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, recordTypeIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeCompactLayoutsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeCompactLayoutsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeCompactLayoutsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeApprovalLayout[] describeApprovalLayout(java.lang.String sObjectType, java.lang.String[] approvalProcessNames) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeApprovalLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, approvalProcessNames});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeApprovalLayout[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeApprovalLayout[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeApprovalLayout[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeSoqlListView[] describeSoqlListViews(com.sforce.soap.partner.DescribeSoqlListViewParams[] request) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoqlListViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeSoqlListView[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeSoqlListView[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeSoqlListView[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.ExecuteListViewResult executeListView(com.sforce.soap.partner.ExecuteListViewRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "executeListView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.ExecuteListViewResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.ExecuteListViewResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.ExecuteListViewResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeSoqlListView[] describeSObjectListViews(java.lang.String sObjectType, boolean recentsOnly, com.sforce.soap.partner.ListViewIsSoqlCompatible isSoqlCompatible, int limit, int offset) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjectListViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, new java.lang.Boolean(recentsOnly), isSoqlCompatible, new java.lang.Integer(limit), new java.lang.Integer(offset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeSoqlListView[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeSoqlListView[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeSoqlListView[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeTabSetResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeTabSetResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeTabSetResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeTab[] describeAllTabs() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeAllTabs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeTab[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeTab[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeTab[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeCompactLayout[] describePrimaryCompactLayouts(java.lang.String[] sObjectTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describePrimaryCompactLayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectTypes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeCompactLayout[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeCompactLayout[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeCompactLayout[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.SaveResult[] create(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.SaveResult[] update(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {externalIDFieldName, sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.UpsertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.UpsertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.UpsertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.MergeResult[] merge(com.sforce.soap.partner.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.MergeResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.MergeResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.MergeResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.UndeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.UndeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.UndeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.EmptyRecycleBinResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.EmptyRecycleBinResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.EmptyRecycleBinResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fieldList, sObjectType, ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.sobject.SObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.sobject.SObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.sobject.SObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.MalformedQueryFault) {
              throw (com.sforce.soap.partner.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.ProcessResult[] process(com.sforce.soap.partner.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {actions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.ProcessResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.ProcessResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.ProcessResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.LeadConvertResult[] convertLead(com.sforce.soap.partner.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {leadConverts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.LeadConvertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.LeadConvertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.LeadConvertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.InvalidateSessionsResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.InvalidateSessionsResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.InvalidateSessionsResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.GetDeletedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.GetDeletedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.GetDeletedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.GetUpdatedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.GetUpdatedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.GetUpdatedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.partner.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.MalformedQueryFault) {
              throw (com.sforce.soap.partner.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.partner.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.MalformedQueryFault) {
              throw (com.sforce.soap.partner.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryLocator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.partner.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.MalformedQueryFault) {
              throw (com.sforce.soap.partner.fault.MalformedQueryFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.MalformedSearchFault, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.partner.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidFieldFault) {
              throw (com.sforce.soap.partner.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.MalformedSearchFault) {
              throw (com.sforce.soap.partner.fault.MalformedSearchFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.GetServerTimestampResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.GetServerTimestampResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.GetServerTimestampResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidNewPasswordFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.SetPasswordResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.SetPasswordResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.SetPasswordResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidNewPasswordFault) {
              throw (com.sforce.soap.partner.fault.InvalidNewPasswordFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.ResetPasswordResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.ResetPasswordResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.ResetPasswordResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.InvalidIdFault) {
              throw (com.sforce.soap.partner.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.GetUserInfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.GetUserInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.GetUserInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.SendEmailResult[] sendEmailMessage(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmailMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.SendEmailResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.SendEmailResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.SendEmailResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.SendEmailResult[] sendEmail(com.sforce.soap.partner.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {messages});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.SendEmailResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.SendEmailResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.SendEmailResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.partner.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.partner.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.PerformQuickActionResult[] performQuickActions(com.sforce.soap.partner.PerformQuickActionRequest[] quickActions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "performQuickActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {quickActions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.PerformQuickActionResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.PerformQuickActionResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.PerformQuickActionResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeQuickActionResult[] describeQuickActions(java.lang.String[] quickActions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeQuickActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {quickActions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeQuickActionResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeQuickActionResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeQuickActionResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeAvailableQuickActionResult[] describeAvailableQuickActions(java.lang.String contextType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeAvailableQuickActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contextType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeAvailableQuickActionResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeAvailableQuickActionResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeAvailableQuickActionResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.QuickActionTemplateResult[] retrieveQuickActionTemplates(java.lang.String[] quickActionNames, java.lang.String contextId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieveQuickActionTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {quickActionNames, contextId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.QuickActionTemplateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.QuickActionTemplateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.QuickActionTemplateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.partner.DescribeNounResult[] describeNouns(java.lang.String[] nouns, boolean onlyRenamed, boolean includeFields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeNouns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nouns, new java.lang.Boolean(onlyRenamed), new java.lang.Boolean(includeFields)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.partner.DescribeNounResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.partner.DescribeNounResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.partner.DescribeNounResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
