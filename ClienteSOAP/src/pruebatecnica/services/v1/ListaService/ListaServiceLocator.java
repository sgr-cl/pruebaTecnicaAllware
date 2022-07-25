/**
 * ListaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pruebatecnica.services.v1.ListaService;

public class ListaServiceLocator extends org.apache.axis.client.Service implements pruebatecnica.services.v1.ListaService.ListaService {

    public ListaServiceLocator() {
    }


    public ListaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ListaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ListaServiceImplPort
    private java.lang.String ListaServiceImplPort_address = "http://localhost:1516/WS/PruebaTecnica";

    public java.lang.String getListaServiceImplPortAddress() {
        return ListaServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ListaServiceImplPortWSDDServiceName = "ListaServiceImplPort";

    public java.lang.String getListaServiceImplPortWSDDServiceName() {
        return ListaServiceImplPortWSDDServiceName;
    }

    public void setListaServiceImplPortWSDDServiceName(java.lang.String name) {
        ListaServiceImplPortWSDDServiceName = name;
    }

    public pruebatecnica.services.v1.ListaService.ListaServiceImpl getListaServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ListaServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListaServiceImplPort(endpoint);
    }

    public pruebatecnica.services.v1.ListaService.ListaServiceImpl getListaServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pruebatecnica.services.v1.ListaService.ListaServiceImplPortBindingStub _stub = new pruebatecnica.services.v1.ListaService.ListaServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getListaServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setListaServiceImplPortEndpointAddress(java.lang.String address) {
        ListaServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pruebatecnica.services.v1.ListaService.ListaServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                pruebatecnica.services.v1.ListaService.ListaServiceImplPortBindingStub _stub = new pruebatecnica.services.v1.ListaService.ListaServiceImplPortBindingStub(new java.net.URL(ListaServiceImplPort_address), this);
                _stub.setPortName(getListaServiceImplPortWSDDServiceName());
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
        if ("ListaServiceImplPort".equals(inputPortName)) {
            return getListaServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pruebatecnica/services/v1/ListaService", "ListaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pruebatecnica/services/v1/ListaService", "ListaServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ListaServiceImplPort".equals(portName)) {
            setListaServiceImplPortEndpointAddress(address);
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
