/**
 * GreetingsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class GreetingsServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.GreetingsService {

    public GreetingsServiceLocator() {
    }


    public GreetingsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GreetingsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Greetings
    private java.lang.String Greetings_address = "http://localhost:8080/WebServiceSoap/services/Greetings";

    public java.lang.String getGreetingsAddress() {
        return Greetings_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GreetingsWSDDServiceName = "Greetings";

    public java.lang.String getGreetingsWSDDServiceName() {
        return GreetingsWSDDServiceName;
    }

    public void setGreetingsWSDDServiceName(java.lang.String name) {
        GreetingsWSDDServiceName = name;
    }

    public DefaultNamespace.Greetings getGreetings() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Greetings_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGreetings(endpoint);
    }

    public DefaultNamespace.Greetings getGreetings(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.GreetingsSoapBindingStub _stub = new DefaultNamespace.GreetingsSoapBindingStub(portAddress, this);
            _stub.setPortName(getGreetingsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGreetingsEndpointAddress(java.lang.String address) {
        Greetings_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.Greetings.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.GreetingsSoapBindingStub _stub = new DefaultNamespace.GreetingsSoapBindingStub(new java.net.URL(Greetings_address), this);
                _stub.setPortName(getGreetingsWSDDServiceName());
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
        if ("Greetings".equals(inputPortName)) {
            return getGreetings();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "GreetingsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "Greetings"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Greetings".equals(portName)) {
            setGreetingsEndpointAddress(address);
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
