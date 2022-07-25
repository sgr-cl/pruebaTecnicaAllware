package pruebatecnica.services.v1.ListaService;

public class ListaServiceImplProxy implements pruebatecnica.services.v1.ListaService.ListaServiceImpl {
  private String _endpoint = null;
  private pruebatecnica.services.v1.ListaService.ListaServiceImpl listaServiceImpl = null;
  
  public ListaServiceImplProxy() {
    _initListaServiceImplProxy();
  }
  
  public ListaServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initListaServiceImplProxy();
  }
  
  private void _initListaServiceImplProxy() {
    try {
      listaServiceImpl = (new pruebatecnica.services.v1.ListaService.ListaServiceLocator()).getListaServiceImplPort();
      if (listaServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listaServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listaServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listaServiceImpl != null)
      ((javax.xml.rpc.Stub)listaServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pruebatecnica.services.v1.ListaService.ListaServiceImpl getListaServiceImpl() {
    if (listaServiceImpl == null)
      _initListaServiceImplProxy();
    return listaServiceImpl;
  }
  
  public int getSizeList(int lista) throws java.rmi.RemoteException{
    if (listaServiceImpl == null)
      _initListaServiceImplProxy();
    return listaServiceImpl.getSizeList(lista);
  }
  
  public boolean deleteN(int lista, int posicion) throws java.rmi.RemoteException{
    if (listaServiceImpl == null)
      _initListaServiceImplProxy();
    return listaServiceImpl.deleteN(lista, posicion);
  }
  
  public boolean insertarObj(int lista, java.lang.Object obj) throws java.rmi.RemoteException{
    if (listaServiceImpl == null)
      _initListaServiceImplProxy();
    return listaServiceImpl.insertarObj(lista, obj);
  }
  
  public boolean insertarN(int lista, int posicion, java.lang.Object obj) throws java.rmi.RemoteException{
    if (listaServiceImpl == null)
      _initListaServiceImplProxy();
    return listaServiceImpl.insertarN(lista, posicion, obj);
  }
  
  public java.lang.Object getObj(int lista, int posicion) throws java.rmi.RemoteException{
    if (listaServiceImpl == null)
      _initListaServiceImplProxy();
    return listaServiceImpl.getObj(lista, posicion);
  }
  
  
}