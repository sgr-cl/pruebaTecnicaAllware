package classes;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import clases.Lista;
import controller.ListaController;
import controllerImpl.ListaServiceImplController;
 

 
@WebService(serviceName = "ListaService", targetNamespace = "http://pruebatecnica/services/v1/ListaService")
public class ListaServiceImpl{
	
    ListaServiceImplController lsic = new ListaServiceImplController();  
    ListaController lc = new ListaController();
    private static List<Lista> listas = new ArrayList<>();    
    /*
     * Se crea una lista a partir de un Nodo o se agrega el Nodo a una lista existente
     */
    @WebMethod
    public boolean insertarObj(@WebParam(name = "lista") int l, @WebParam(name = "obj") Object obj) {
    	int linicial = listas.size();
    	System.out.println("longinicial: "+linicial);
    	List<Lista> listaNueva = new ArrayList<>();
    	listaNueva = lsic.setFirst(listas, l, obj);//linea funcional
    	int lLnew = listaNueva.size();
    	System.out.println(lLnew);
    	if(linicial < lLnew) {
    		return true;
    	}if(linicial == lLnew) {
    		System.out.println("TAMANIOS IGUALES");
    		return true;
    	}else {
    		return false;
    	}
    }
    
    /*
     * Inserta un Nodo en la enesima posición
     */
    
    @WebMethod
    public boolean insertarN(@WebParam(name = "lista") int name, @WebParam(name = "posicion") int n,
    		@WebParam(name = "obj") Object obj) {
    	
    	List<Lista> l2 = lsic.insertarN(listas, name, n, obj);
    	listas = l2;
    	return true;
    }
    
    @WebMethod
    public Object getObj(@WebParam(name = "lista") int name, @WebParam(name = "posicion") int n){
    	return lsic.getObj(listas, name, n);
    }
    
    @WebMethod
    public int getSizeList(@WebParam(name = "lista") int name) {
    	return lsic.getSizeList(listas, name);
    }
    
    @WebMethod
    public boolean deleteN(@WebParam(name = "lista") int name, @WebParam(name = "posicion") int n) {
    	return lsic.deleteN(listas, name, n);
    }

	
    
	
}