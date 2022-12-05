package org.axis;

public class CalculatorServiceProxy implements org.axis.CalculatorService {
  private String _endpoint = null;
  private org.axis.CalculatorService calculatorService = null;
  
  public CalculatorServiceProxy() {
    _initCalculatorServiceProxy();
  }
  
  public CalculatorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorServiceProxy();
  }
  
  private void _initCalculatorServiceProxy() {
    try {
      calculatorService = (new org.axis.CalculatorServiceServiceLocator()).getCalculatorService();
      if (calculatorService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorService != null)
      ((javax.xml.rpc.Stub)calculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.axis.CalculatorService getCalculatorService() {
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.add(a, b);
  }
  
  public int mul(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.mul(a, b);
  }
  
  public int sub(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.sub(a, b);
  }
  
  public int div(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.div(a, b);
  }
  
  
}