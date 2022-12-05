/**
 * EnquiryServiceProxyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.axis;

public class EnquiryServiceProxyServiceLocator extends org.apache.axis.client.Service implements com.axis.EnquiryServiceProxyService {

    public EnquiryServiceProxyServiceLocator() {
    }


    public EnquiryServiceProxyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EnquiryServiceProxyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EnquiryServiceProxy
    private java.lang.String EnquiryServiceProxy_address = "http://localhost:8080/AirlinewebserviceClient/services/EnquiryServiceProxy";

    public java.lang.String getEnquiryServiceProxyAddress() {
        return EnquiryServiceProxy_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnquiryServiceProxyWSDDServiceName = "EnquiryServiceProxy";

    public java.lang.String getEnquiryServiceProxyWSDDServiceName() {
        return EnquiryServiceProxyWSDDServiceName;
    }

    public void setEnquiryServiceProxyWSDDServiceName(java.lang.String name) {
        EnquiryServiceProxyWSDDServiceName = name;
    }

    public com.axis.EnquiryServiceProxy getEnquiryServiceProxy() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnquiryServiceProxy_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnquiryServiceProxy(endpoint);
    }

    public com.axis.EnquiryServiceProxy getEnquiryServiceProxy(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.axis.EnquiryServiceProxySoapBindingStub _stub = new com.axis.EnquiryServiceProxySoapBindingStub(portAddress, this);
            _stub.setPortName(getEnquiryServiceProxyWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnquiryServiceProxyEndpointAddress(java.lang.String address) {
        EnquiryServiceProxy_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.axis.EnquiryServiceProxy.class.isAssignableFrom(serviceEndpointInterface)) {
                com.axis.EnquiryServiceProxySoapBindingStub _stub = new com.axis.EnquiryServiceProxySoapBindingStub(new java.net.URL(EnquiryServiceProxy_address), this);
                _stub.setPortName(getEnquiryServiceProxyWSDDServiceName());
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
        if ("EnquiryServiceProxy".equals(inputPortName)) {
            return getEnquiryServiceProxy();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://axis.com", "EnquiryServiceProxyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://axis.com", "EnquiryServiceProxy"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EnquiryServiceProxy".equals(portName)) {
            setEnquiryServiceProxyEndpointAddress(address);
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
