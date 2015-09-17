package com.sforce.soap.partner;

public class SoapProxy implements com.sforce.soap.partner.Soap {
  private String _endpoint = null;
  private com.sforce.soap.partner.Soap soap = null;
  
  public SoapProxy() {
    _initSoapProxy();
  }
  
  public SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapProxy();
  }
  
  private void _initSoapProxy() {
    try {
      soap = (new com.sforce.soap.partner.SforceServiceLocator()).getSoap();
      if (soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soap != null)
      ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sforce.soap.partner.Soap getSoap() {
    if (soap == null)
      _initSoapProxy();
    return soap;
  }
  
  public com.sforce.soap.partner.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.LoginFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.login(username, password);
  }
  
  public com.sforce.soap.partner.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSObject(sObjectType);
  }
  
  public com.sforce.soap.partner.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSObjects(sObjectType);
  }
  
  public com.sforce.soap.partner.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeGlobal();
  }
  
  public com.sforce.soap.partner.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeDataCategoryGroups(sObjectType);
  }
  
  public com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] pairs, boolean topCategoriesOnly) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeDataCategoryGroupStructures(pairs, topCategoriesOnly);
  }
  
  public com.sforce.soap.partner.KnowledgeSettings describeKnowledgeSettings() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeKnowledgeSettings();
  }
  
  public com.sforce.soap.partner.DescribeFlexiPageResult[] describeFlexiPages(java.lang.String[] flexiPages) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeFlexiPages(flexiPages);
  }
  
  public com.sforce.soap.partner.DescribeAppMenuItem[] describeAppMenu(com.sforce.soap.partner.AppMenuType appMenuType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeAppMenu(appMenuType);
  }
  
  public com.sforce.soap.partner.DescribeGlobalTheme describeGlobalTheme() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeGlobalTheme();
  }
  
  public com.sforce.soap.partner.DescribeThemeItem[] describeTheme(java.lang.String[] sobjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeTheme(sobjectType);
  }
  
  public com.sforce.soap.partner.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String layoutName, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeLayout(sObjectType, layoutName, recordTypeIds);
  }
  
  public com.sforce.soap.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSoftphoneLayout();
  }
  
  public com.sforce.soap.partner.DescribeSearchLayoutResult[] describeSearchLayouts(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSearchLayouts(sObjectType);
  }
  
  public com.sforce.soap.partner.DescribeSearchScopeOrderResult[] describeSearchScopeOrder() throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSearchScopeOrder();
  }
  
  public com.sforce.soap.partner.DescribeCompactLayoutsResult describeCompactLayouts(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeCompactLayouts(sObjectType, recordTypeIds);
  }
  
  public com.sforce.soap.partner.DescribeApprovalLayout[] describeApprovalLayout(java.lang.String sObjectType, java.lang.String[] approvalProcessNames) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeApprovalLayout(sObjectType, approvalProcessNames);
  }
  
  public com.sforce.soap.partner.DescribeSoqlListView[] describeSoqlListViews(com.sforce.soap.partner.DescribeSoqlListViewParams[] request) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSoqlListViews(request);
  }
  
  public com.sforce.soap.partner.ExecuteListViewResult executeListView(com.sforce.soap.partner.ExecuteListViewRequest request) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.executeListView(request);
  }
  
  public com.sforce.soap.partner.DescribeSoqlListView[] describeSObjectListViews(java.lang.String sObjectType, boolean recentsOnly, com.sforce.soap.partner.ListViewIsSoqlCompatible isSoqlCompatible, int limit, int offset) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSObjectListViews(sObjectType, recentsOnly, isSoqlCompatible, limit, offset);
  }
  
  public com.sforce.soap.partner.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeTabs();
  }
  
  public com.sforce.soap.partner.DescribeTab[] describeAllTabs() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeAllTabs();
  }
  
  public com.sforce.soap.partner.DescribeCompactLayout[] describePrimaryCompactLayouts(java.lang.String[] sObjectTypes) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describePrimaryCompactLayouts(sObjectTypes);
  }
  
  public com.sforce.soap.partner.SaveResult[] create(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.create(sObjects);
  }
  
  public com.sforce.soap.partner.SaveResult[] update(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.update(sObjects);
  }
  
  public com.sforce.soap.partner.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.upsert(externalIDFieldName, sObjects);
  }
  
  public com.sforce.soap.partner.MergeResult[] merge(com.sforce.soap.partner.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.merge(request);
  }
  
  public com.sforce.soap.partner.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.delete(ids);
  }
  
  public com.sforce.soap.partner.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.undelete(ids);
  }
  
  public com.sforce.soap.partner.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.emptyRecycleBin(ids);
  }
  
  public com.sforce.soap.partner.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.retrieve(fieldList, sObjectType, ids);
  }
  
  public com.sforce.soap.partner.ProcessResult[] process(com.sforce.soap.partner.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.process(actions);
  }
  
  public com.sforce.soap.partner.LeadConvertResult[] convertLead(com.sforce.soap.partner.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.convertLead(leadConverts);
  }
  
  public void logout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    soap.logout();
  }
  
  public com.sforce.soap.partner.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.invalidateSessions(sessionIds);
  }
  
  public com.sforce.soap.partner.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getDeleted(sObjectType, startDate, endDate);
  }
  
  public com.sforce.soap.partner.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getUpdated(sObjectType, startDate, endDate);
  }
  
  public com.sforce.soap.partner.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.query(queryString);
  }
  
  public com.sforce.soap.partner.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.queryAll(queryString);
  }
  
  public com.sforce.soap.partner.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault{
    if (soap == null)
      _initSoapProxy();
    return soap.queryMore(queryLocator);
  }
  
  public com.sforce.soap.partner.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.MalformedSearchFault, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.search(searchString);
  }
  
  public com.sforce.soap.partner.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getServerTimestamp();
  }
  
  public com.sforce.soap.partner.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidNewPasswordFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.setPassword(userId, password);
  }
  
  public com.sforce.soap.partner.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault{
    if (soap == null)
      _initSoapProxy();
    return soap.resetPassword(userId);
  }
  
  public com.sforce.soap.partner.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getUserInfo();
  }
  
  public com.sforce.soap.partner.SendEmailResult[] sendEmailMessage(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.sendEmailMessage(ids);
  }
  
  public com.sforce.soap.partner.SendEmailResult[] sendEmail(com.sforce.soap.partner.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.sendEmail(messages);
  }
  
  public com.sforce.soap.partner.PerformQuickActionResult[] performQuickActions(com.sforce.soap.partner.PerformQuickActionRequest[] quickActions) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.performQuickActions(quickActions);
  }
  
  public com.sforce.soap.partner.DescribeQuickActionResult[] describeQuickActions(java.lang.String[] quickActions) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeQuickActions(quickActions);
  }
  
  public com.sforce.soap.partner.DescribeAvailableQuickActionResult[] describeAvailableQuickActions(java.lang.String contextType) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeAvailableQuickActions(contextType);
  }
  
  public com.sforce.soap.partner.QuickActionTemplateResult[] retrieveQuickActionTemplates(java.lang.String[] quickActionNames, java.lang.String contextId) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.retrieveQuickActionTemplates(quickActionNames, contextId);
  }
  
  public com.sforce.soap.partner.DescribeNounResult[] describeNouns(java.lang.String[] nouns, boolean onlyRenamed, boolean includeFields) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeNouns(nouns, onlyRenamed, includeFields);
  }
  
  
}