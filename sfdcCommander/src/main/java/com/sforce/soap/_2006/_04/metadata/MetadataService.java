/**
 * MetadataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public interface MetadataService extends javax.xml.rpc.Service {

/**
 * Manage your Salesforce.com metadata
 */
    public java.lang.String getMetadataAddress();

    public com.sforce.soap._2006._04.metadata.MetadataPortType getMetadata() throws javax.xml.rpc.ServiceException;

    public com.sforce.soap._2006._04.metadata.MetadataPortType getMetadata(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
