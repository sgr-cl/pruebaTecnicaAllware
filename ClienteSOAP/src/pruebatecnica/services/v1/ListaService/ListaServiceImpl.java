/**
 * ListaServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pruebatecnica.services.v1.ListaService;

public interface ListaServiceImpl extends java.rmi.Remote {
    public int getSizeList(int lista) throws java.rmi.RemoteException;
    public boolean deleteN(int lista, int posicion) throws java.rmi.RemoteException;
    public boolean insertarObj(int lista, java.lang.Object obj) throws java.rmi.RemoteException;
    public boolean insertarN(int lista, int posicion, java.lang.Object obj) throws java.rmi.RemoteException;
    public java.lang.Object getObj(int lista, int posicion) throws java.rmi.RemoteException;
}
