package com.axis;

public class EnquiryServiceProxyProxy implements com.axis.EnquiryServiceProxy {
  private String _endpoint = null;
  private com.axis.EnquiryServiceProxy enquiryServiceProxy = null;
  
  public EnquiryServiceProxyProxy() {
    _initEnquiryServiceProxyProxy();
  }
  
  public EnquiryServiceProxyProxy(String endpoint) {
    _endpoint = endpoint;
    _initEnquiryServiceProxyProxy();
  }
  
  private void _initEnquiryServiceProxyProxy() {
    try {
      enquiryServiceProxy = (new com.axis.EnquiryServiceProxyServiceLocator()).getEnquiryServiceProxy();
      if (enquiryServiceProxy != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)enquiryServiceProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)enquiryServiceProxy)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (enquiryServiceProxy != null)
      ((javax.xml.rpc.Stub)enquiryServiceProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.axis.EnquiryServiceProxy getEnquiryServiceProxy() {
    if (enquiryServiceProxy == null)
      _initEnquiryServiceProxyProxy();
    return enquiryServiceProxy;
  }
  
  public java.lang.String getName(int flightNum, int seatNum) throws java.rmi.RemoteException{
    if (enquiryServiceProxy == null)
      _initEnquiryServiceProxyProxy();
    return enquiryServiceProxy.getName(flightNum, seatNum);
  }
  
  public java.lang.String getDetails(java.lang.String from, java.lang.String to) throws java.rmi.RemoteException{
    if (enquiryServiceProxy == null)
      _initEnquiryServiceProxyProxy();
    return enquiryServiceProxy.getDetails(from, to);
  }
  
  public void setEndpoint(java.lang.String endpoint) throws java.rmi.RemoteException{
    if (enquiryServiceProxy == null)
      _initEnquiryServiceProxyProxy();
    enquiryServiceProxy.setEndpoint(endpoint);
  }
  
  public java.lang.String getEndpoint() throws java.rmi.RemoteException{
    if (enquiryServiceProxy == null)
      _initEnquiryServiceProxyProxy();
    return enquiryServiceProxy.getEndpoint();
  }
  
  public java.lang.Object getEnquiryService() throws java.rmi.RemoteException{
    if (enquiryServiceProxy == null)
      _initEnquiryServiceProxyProxy();
    return enquiryServiceProxy.getEnquiryService();
  }
  
  
}