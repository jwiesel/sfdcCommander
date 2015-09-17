/**
 * MetadataServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MetadataServiceLocator extends org.apache.axis.client.Service implements com.sforce.soap._2006._04.metadata.MetadataService {

/**
 * Manage your Salesforce.com metadata
 */

    public MetadataServiceLocator() {
    }


    public MetadataServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MetadataServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Metadata
    private java.lang.String Metadata_address = "https://na9.salesforce.com/services/Soap/m/34.0";

    public java.lang.String getMetadataAddress() {
        return Metadata_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MetadataWSDDServiceName = "Metadata";

    public java.lang.String getMetadataWSDDServiceName() {
        return MetadataWSDDServiceName;
    }

    public void setMetadataWSDDServiceName(java.lang.String name) {
        MetadataWSDDServiceName = name;
    }

    public com.sforce.soap._2006._04.metadata.MetadataPortType getMetadata() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Metadata_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMetadata(endpoint);
    }

    public com.sforce.soap._2006._04.metadata.MetadataPortType getMetadata(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sforce.soap._2006._04.metadata.MetadataBindingStub _stub = new com.sforce.soap._2006._04.metadata.MetadataBindingStub(portAddress, this);
            _stub.setPortName(getMetadataWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMetadataEndpointAddress(java.lang.String address) {
        Metadata_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sforce.soap._2006._04.metadata.MetadataPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sforce.soap._2006._04.metadata.MetadataBindingStub _stub = new com.sforce.soap._2006._04.metadata.MetadataBindingStub(new java.net.URL(Metadata_address), this);
                _stub.setPortName(getMetadataWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Metadata".equals(inputPortName)) {
            return getMetadata();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MetadataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Metadata"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Metadata".equals(portName)) {
            setMetadataEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
