/**
 * EnquiryServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.axis;

public class EnquiryServiceServiceLocator extends org.apache.axis.client.Service implements com.axis.EnquiryServiceService {

    public EnquiryServiceServiceLocator() {
    }


    public EnquiryServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EnquiryServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EnquiryService
    private java.lang.String EnquiryService_address = "http://localhost:8080/Airlinewebservice/services/EnquiryService";

    public java.lang.String getEnquiryServiceAddress() {
        return EnquiryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnquiryServiceWSDDServiceName = "EnquiryService";

    public java.lang.String getEnquiryServiceWSDDServiceName() {
        return EnquiryServiceWSDDServiceName;
    }

    public void setEnquiryServiceWSDDServiceName(java.lang.String name) {
        EnquiryServiceWSDDServiceName = name;
    }

    public com.axis.EnquiryService getEnquiryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnquiryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnquiryService(endpoint);
    }

    public com.axis.EnquiryService getEnquiryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.axis.EnquiryServiceSoapBindingStub _stub = new com.axis.EnquiryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEnquiryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnquiryServiceEndpointAddress(java.lang.String address) {
        EnquiryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.axis.EnquiryService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.axis.EnquiryServiceSoapBindingStub _stub = new com.axis.EnquiryServiceSoapBindingStub(new java.net.URL(EnquiryService_address), this);
                _stub.setPortName(getEnquiryServiceWSDDServiceName());
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
        if ("EnquiryService".equals(inputPortName)) {
            return getEnquiryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://axis.com", "EnquiryServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://axis.com", "EnquiryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EnquiryService".equals(portName)) {
            setEnquiryServiceEndpointAddress(address);
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
