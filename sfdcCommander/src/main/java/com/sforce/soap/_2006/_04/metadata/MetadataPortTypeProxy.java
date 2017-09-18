package com.sforce.soap._2006._04.metadata;

public class MetadataPortTypeProxy implements com.sforce.soap._2006._04.metadata.MetadataPortType {
  private String _endpoint = null;
  private com.sforce.soap._2006._04.metadata.MetadataPortType metadataPortType = null;
  
  public MetadataPortTypeProxy() {
    _initMetadataPortTypeProxy();
  }
  
  public MetadataPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMetadataPortTypeProxy();
  }
  
  private void _initMetadataPortTypeProxy() {
    try {
      metadataPortType = (new com.sforce.soap._2006._04.metadata.MetadataServiceLocator()).getMetadata();
      if (metadataPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)metadataPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)metadataPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (metadataPortType != null)
      ((javax.xml.rpc.Stub)metadataPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sforce.soap._2006._04.metadata.MetadataPortType getMetadataPortType() {
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType;
  }
  
  public com.sforce.soap._2006._04.metadata.CancelDeployResult cancelDeploy(java.lang.String string) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.cancelDeploy(string);
  }
  
  public com.sforce.soap._2006._04.metadata.DeployResult checkDeployStatus(java.lang.String asyncProcessId, boolean includeDetails) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.checkDeployStatus(asyncProcessId, includeDetails);
  }
  
  public com.sforce.soap._2006._04.metadata.RetrieveResult checkRetrieveStatus(java.lang.String asyncProcessId, boolean includeZip) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.checkRetrieveStatus(asyncProcessId, includeZip);
  }
  
  public com.sforce.soap._2006._04.metadata.SaveResult[] createMetadata(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.createMetadata(metadata);
  }
  
  public com.sforce.soap._2006._04.metadata.DeleteResult[] deleteMetadata(java.lang.String type, java.lang.String[] fullNames) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.deleteMetadata(type, fullNames);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult deploy(byte[] zipFile, com.sforce.soap._2006._04.metadata.DeployOptions deployOptions) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.deploy(zipFile, deployOptions);
  }
  
  public java.lang.String deployRecentValidation(java.lang.String validationId) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.deployRecentValidation(validationId);
  }
  
  public com.sforce.soap._2006._04.metadata.DescribeMetadataResult describeMetadata(double asOfVersion) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.describeMetadata(asOfVersion);
  }
  
  public com.sforce.soap._2006._04.metadata.DescribeValueTypeResult describeValueType(java.lang.String type) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.describeValueType(type);
  }
  
  public com.sforce.soap._2006._04.metadata.FileProperties[] listMetadata(com.sforce.soap._2006._04.metadata.ListMetadataQuery[] queries, double asOfVersion) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.listMetadata(queries, asOfVersion);
  }
  
  public com.sforce.soap._2006._04.metadata.Metadata[] readMetadata(java.lang.String type, java.lang.String[] fullNames) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.readMetadata(type, fullNames);
  }
  
  public com.sforce.soap._2006._04.metadata.SaveResult renameMetadata(java.lang.String type, java.lang.String oldFullName, java.lang.String newFullName) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.renameMetadata(type, oldFullName, newFullName);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult retrieve(com.sforce.soap._2006._04.metadata.RetrieveRequest retrieveRequest) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.retrieve(retrieveRequest);
  }
  
  public com.sforce.soap._2006._04.metadata.SaveResult[] updateMetadata(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.updateMetadata(metadata);
  }
  
  public com.sforce.soap._2006._04.metadata.UpsertResult[] upsertMetadata(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.upsertMetadata(metadata);
  }
  
  
}