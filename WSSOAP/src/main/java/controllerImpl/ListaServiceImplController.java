package controllerImpl;

import java.util.List;

import clases.Lista;
import serviceLista.ListaService;

public class ListaServiceImplController {

	public ListaService ls = new ListaService();
	
	public List<Lista> setFirst(List<Lista> listas, int name, Object obj) {
		return ls.setFirst(listas, name, obj);
	}

	public List<Lista> insertarN(List<Lista> listas, int name, int n, Object obj) {
		return ls.insertarN(listas, name, n, obj);
		
	}

	public Object getObj(List<Lista> listas, int name, int n) {
		// TODO Auto-generated method stub
		return ls.getObj(listas, name, n);
	}

	public int getSizeList(List<Lista> listas, int name) {
		// TODO Auto-generated method stub
		return ls.getSizeList(listas, name);
	}

	public boolean deleteN(List<Lista> listas, int name, int n) {
		// TODO Auto-generated method stub
		return ls.deleteN(listas, name, n);
	}

	
}
