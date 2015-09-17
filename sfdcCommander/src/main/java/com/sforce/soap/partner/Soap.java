/**
 * Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public interface Soap extends java.rmi.Remote {

    /**
     * Login to the Salesforce.com SOAP Api
     */
    public com.sforce.soap.partner.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.LoginFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Describe an sObject
     */
    public com.sforce.soap.partner.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe a number sObjects
     */
    public com.sforce.soap.partner.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the Global state
     */
    public com.sforce.soap.partner.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe all the data category groups available for a given
     * set of types
     */
    public com.sforce.soap.partner.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the data category group structures for a given set
     * of pair of types and data category group name
     */
    public com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] pairs, boolean topCategoriesOnly) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describes your Knowledge settings, such as if knowledgeEnabled
     * is on or off, its default language and supported languages
     */
    public com.sforce.soap.partner.KnowledgeSettings describeKnowledgeSettings() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe a list of FlexiPage and their contents
     */
    public com.sforce.soap.partner.DescribeFlexiPageResult[] describeFlexiPages(java.lang.String[] flexiPages) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Describe the items in an AppMenu
     */
    public com.sforce.soap.partner.DescribeAppMenuItem[] describeAppMenu(com.sforce.soap.partner.AppMenuType appMenuType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe Gloal and Themes
     */
    public com.sforce.soap.partner.DescribeGlobalTheme describeGlobalTheme() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe Themes
     */
    public com.sforce.soap.partner.DescribeThemeItem[] describeTheme(java.lang.String[] sobjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of the given sObject or the given actionable
     * global page.
     */
    public com.sforce.soap.partner.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String layoutName, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Describe the layout of the SoftPhone
     */
    public com.sforce.soap.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the search view of an sObject
     */
    public com.sforce.soap.partner.DescribeSearchLayoutResult[] describeSearchLayouts(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe a list of objects representing the order and scope
     * of objects on a users search result page
     */
    public com.sforce.soap.partner.DescribeSearchScopeOrderResult[] describeSearchScopeOrder() throws java.rmi.RemoteException;

    /**
     * Describe the compact layouts of the given sObject
     */
    public com.sforce.soap.partner.DescribeCompactLayoutsResult describeCompactLayouts(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException;

    /**
     * Describe the approval layouts of the given sObject
     */
    public com.sforce.soap.partner.DescribeApprovalLayout[] describeApprovalLayout(java.lang.String sObjectType, java.lang.String[] approvalProcessNames) throws java.rmi.RemoteException;

    /**
     * Describe the ListViews as SOQL metadata for the generation
     * of SOQL.
     */
    public com.sforce.soap.partner.DescribeSoqlListView[] describeSoqlListViews(com.sforce.soap.partner.DescribeSoqlListViewParams[] request) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Execute the specified list view and return the presentation-ready
     * results.
     */
    public com.sforce.soap.partner.ExecuteListViewResult executeListView(com.sforce.soap.partner.ExecuteListViewRequest request) throws java.rmi.RemoteException;

    /**
     * Describe the ListViews of a SObject as SOQL metadata for the
     * generation of SOQL.
     */
    public com.sforce.soap.partner.DescribeSoqlListView[] describeSObjectListViews(java.lang.String sObjectType, boolean recentsOnly, com.sforce.soap.partner.ListViewIsSoqlCompatible isSoqlCompatible, int limit, int offset) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the tabs that appear on a users page
     */
    public com.sforce.soap.partner.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe all tabs available to a user
     */
    public com.sforce.soap.partner.DescribeTab[] describeAllTabs() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the primary compact layouts for the sObjects requested
     */
    public com.sforce.soap.partner.DescribeCompactLayout[] describePrimaryCompactLayouts(java.lang.String[] sObjectTypes) throws java.rmi.RemoteException;

    /**
     * Create a set of new sObjects
     */
    public com.sforce.soap.partner.SaveResult[] create(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Update a set of sObjects
     */
    public com.sforce.soap.partner.SaveResult[] update(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Update or insert a set of sObjects based on object id
     */
    public com.sforce.soap.partner.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Merge and update a set of sObjects based on object id
     */
    public com.sforce.soap.partner.MergeResult[] merge(com.sforce.soap.partner.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Delete a set of sObjects
     */
    public com.sforce.soap.partner.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Undelete a set of sObjects
     */
    public com.sforce.soap.partner.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Empty a set of sObjects from the recycle bin
     */
    public com.sforce.soap.partner.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get a set of sObjects
     */
    public com.sforce.soap.partner.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Submit an entity to a workflow process or process a workitem
     */
    public com.sforce.soap.partner.ProcessResult[] process(com.sforce.soap.partner.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * convert a set of leads
     */
    public com.sforce.soap.partner.LeadConvertResult[] convertLead(com.sforce.soap.partner.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Logout the current user, invalidating the current session.
     */
    public void logout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Logs out and invalidates session ids
     */
    public com.sforce.soap.partner.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for deleted sObjects
     */
    public com.sforce.soap.partner.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for updated sObjects
     */
    public com.sforce.soap.partner.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Create a Query Cursor
     */
    public com.sforce.soap.partner.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Create a Query Cursor, including deleted sObjects
     */
    public com.sforce.soap.partner.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Gets the next batch of sObjects from a query
     */
    public com.sforce.soap.partner.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.MalformedQueryFault;

    /**
     * Search for sObjects
     */
    public com.sforce.soap.partner.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.MalformedSearchFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Gets server timestamp
     */
    public com.sforce.soap.partner.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Set a user's password
     */
    public com.sforce.soap.partner.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidNewPasswordFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Reset a user's password
     */
    public com.sforce.soap.partner.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidIdFault;

    /**
     * Returns standard information relevant to the current user
     */
    public com.sforce.soap.partner.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Send existing draft EmailMessage
     */
    public com.sforce.soap.partner.SendEmailResult[] sendEmailMessage(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Send outbound email
     */
    public com.sforce.soap.partner.SendEmailResult[] sendEmail(com.sforce.soap.partner.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Perform a series of predefined actions such as quick create
     * or log a task
     */
    public com.sforce.soap.partner.PerformQuickActionResult[] performQuickActions(com.sforce.soap.partner.PerformQuickActionRequest[] quickActions) throws java.rmi.RemoteException;

    /**
     * Describe the details of a series of quick actions
     */
    public com.sforce.soap.partner.DescribeQuickActionResult[] describeQuickActions(java.lang.String[] quickActions) throws java.rmi.RemoteException;

    /**
     * Describe the details of a series of quick actions available
     * for the given contextType
     */
    public com.sforce.soap.partner.DescribeAvailableQuickActionResult[] describeAvailableQuickActions(java.lang.String contextType) throws java.rmi.RemoteException;

    /**
     * Retreive the template sobjects, if appropriate, for the given
     * quick action names in a given context
     */
    public com.sforce.soap.partner.QuickActionTemplateResult[] retrieveQuickActionTemplates(java.lang.String[] quickActionNames, java.lang.String contextId) throws java.rmi.RemoteException;

    /**
     * Return the renameable nouns from the server for use in presentation
     * using the salesforce grammar engine
     */
    public com.sforce.soap.partner.DescribeNounResult[] describeNouns(java.lang.String[] nouns, boolean onlyRenamed, boolean includeFields) throws java.rmi.RemoteException;
}
