package DefaultNamespace;

public class GreetingsProxy implements DefaultNamespace.Greetings {
  private String _endpoint = null;
  private DefaultNamespace.Greetings greetings = null;
  
  public GreetingsProxy() {
    _initGreetingsProxy();
  }
  
  public GreetingsProxy(String endpoint) {
    _endpoint = endpoint;
    _initGreetingsProxy();
  }
  
  private void _initGreetingsProxy() {
    try {
      greetings = (new DefaultNamespace.GreetingsServiceLocator()).getGreetings();
      if (greetings != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)greetings)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)greetings)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (greetings != null)
      ((javax.xml.rpc.Stub)greetings)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.Greetings getGreetings() {
    if (greetings == null)
      _initGreetingsProxy();
    return greetings;
  }
  
  public java.lang.String getMessage(java.lang.String message) throws java.rmi.RemoteException{
    if (greetings == null)
      _initGreetingsProxy();
    return greetings.getMessage(message);
  }
  
  
}