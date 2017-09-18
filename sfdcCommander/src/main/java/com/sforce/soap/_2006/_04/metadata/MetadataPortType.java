/**
 * MetadataPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public interface MetadataPortType extends java.rmi.Remote {

    /**
     * Cancels a metadata deploy.
     */
    public com.sforce.soap._2006._04.metadata.CancelDeployResult cancelDeploy(java.lang.String string) throws java.rmi.RemoteException;

    /**
     * Check the current status of an asyncronous deploy call.
     */
    public com.sforce.soap._2006._04.metadata.DeployResult checkDeployStatus(java.lang.String asyncProcessId, boolean includeDetails) throws java.rmi.RemoteException;

    /**
     * Check the current status of an asyncronous deploy call.
     */
    public com.sforce.soap._2006._04.metadata.RetrieveResult checkRetrieveStatus(java.lang.String asyncProcessId, boolean includeZip) throws java.rmi.RemoteException;

    /**
     * Creates metadata entries synchronously.
     */
    public com.sforce.soap._2006._04.metadata.SaveResult[] createMetadata(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException;

    /**
     * Deletes metadata entries synchronously.
     */
    public com.sforce.soap._2006._04.metadata.DeleteResult[] deleteMetadata(java.lang.String type, java.lang.String[] fullNames) throws java.rmi.RemoteException;

    /**
     * Deploys a zipfile full of metadata entries asynchronously.
     */
    public com.sforce.soap._2006._04.metadata.AsyncResult deploy(byte[] zipFile, com.sforce.soap._2006._04.metadata.DeployOptions deployOptions) throws java.rmi.RemoteException;

    /**
     * Deploys a previously validated payload without running tests.
     */
    public java.lang.String deployRecentValidation(java.lang.String validationId) throws java.rmi.RemoteException;

    /**
     * Describes features of the metadata API.
     */
    public com.sforce.soap._2006._04.metadata.DescribeMetadataResult describeMetadata(double asOfVersion) throws java.rmi.RemoteException;

    /**
     * Describe a complex value type
     */
    public com.sforce.soap._2006._04.metadata.DescribeValueTypeResult describeValueType(java.lang.String type) throws java.rmi.RemoteException;

    /**
     * Lists the available metadata components.
     */
    public com.sforce.soap._2006._04.metadata.FileProperties[] listMetadata(com.sforce.soap._2006._04.metadata.ListMetadataQuery[] queries, double asOfVersion) throws java.rmi.RemoteException;

    /**
     * Reads metadata entries synchronously.
     */
    public com.sforce.soap._2006._04.metadata.Metadata[] readMetadata(java.lang.String type, java.lang.String[] fullNames) throws java.rmi.RemoteException;

    /**
     * Renames a metadata entry synchronously.
     */
    public com.sforce.soap._2006._04.metadata.SaveResult renameMetadata(java.lang.String type, java.lang.String oldFullName, java.lang.String newFullName) throws java.rmi.RemoteException;

    /**
     * Retrieves a set of individually specified metadata entries.
     */
    public com.sforce.soap._2006._04.metadata.AsyncResult retrieve(com.sforce.soap._2006._04.metadata.RetrieveRequest retrieveRequest) throws java.rmi.RemoteException;

    /**
     * Updates metadata entries synchronously.
     */
    public com.sforce.soap._2006._04.metadata.SaveResult[] updateMetadata(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException;

    /**
     * Upserts metadata entries synchronously.
     */
    public com.sforce.soap._2006._04.metadata.UpsertResult[] upsertMetadata(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException;
}
