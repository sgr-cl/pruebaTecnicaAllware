package serviceLista;

import java.util.List;

import clases.Lista;
import controller.ListaController;

public class ListaService {
	
	ListaController lc = new ListaController();

	public List<Lista> setFirst(List<Lista> listas, int name, Object obj) {
		// TODO Auto-generated method stub
		int l = listas.size();
		if(buscarLista(listas, name) == true) { //encuentra un nombre igual
			for(int i = 0; i<l;i++){
				if(listas.get(i).getNombre() == name ) {
					lc.insertarFinal(listas.get(i), obj);//inserta al final
					
				}
			}
			return listas;
		}else{ //no encuentra el nombre
			Lista newList = new Lista();
			newList.setNombre(name);
			lc.insertarInicio(newList, obj);
			listas.add(newList);
			return listas;
		}
	}
	
	public boolean buscarLista(List<Lista> listas, int name) {
		int l = listas.size();
		for(int i = 0; i<l;i++ ) {
			if(listas.get(i).getNombre() == name ) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Si entrego una posicion que no coincide con el largo, se inserta al final
	 */
	public List<Lista> insertarN(List<Lista> listas, int name, int n, Object obj) {
		if(buscarLista(listas, name) == true) {
			int l = listas.size();
			for(int i = 0; i<l;i++){
				if(listas.get(i).getNombre() == name ) {
					lc.insertarN(n, listas.get(i), obj);
					System.out.println("Nodo insertado en la posicion: "+n+" de la lista: "+listas.get(i).getNombre());
				}
			}
			return listas;
		} else {//no se encontro el nombre de la lista, se crea una nueva
			int l = listas.size();
			l++;
			Lista nl = new Lista();
			nl.setNombre(l);
			lc.insertarN(n, nl, obj);
			listas.add(nl);
			System.out.println("Nodo insertado en la posicion: "+n+" de la lista: "+nl.getNombre());
			return listas;
		}
		
	}

	public Object getObj(List<Lista> listas, int name, int n) {
		if(buscarLista(listas, name) == true) {//si lo encuentro lo retorno
			int l = listas.size();
			for(int i = 0; i<l;i++){
				if(listas.get(i).getNombre() == name ) {
					System.out.println(lc.obtenerNObj(listas.get(i), n));
					return lc.obtenerNObj(listas.get(i), n);
					
				}
			}
			return listas;
		}else {//retorno que no se encontró
			String resp = "Elemento no encontrado";
			return resp;
		}
	}

	public int getSizeList(List<Lista> listas, int name) {
		// TODO Auto-generated method stub
		if(buscarLista(listas, name) == true) {//si lo encuentro lo retorno
			int l = listas.size();
			int longitud = 0;
			for(int i = 0; i<l;i++){
				if(listas.get(i).getNombre() == name ) {
					longitud = lc.longuitud(listas.get(i));
				}
			}return longitud;
		}else {//retorno que no se encontró con un 0
			int nulo = 0;
			return nulo;
		}
	}

	public boolean deleteN(List<Lista> listas, int name, int n) {
		// TODO Auto-generated method stub
		if(buscarLista(listas, name) == true) {//si lo encuentro lo borro
			int l = listas.size();
			for(int i = 0; i<l;i++){
				if(listas.get(i).getNombre() == name ) {
					//System.out.println(lc.obtenerNObj(listas.get(i), n));
					lc.eliminarNNodo(n, listas.get(i));
					
				}
			}return true;
		}else {//retorno que no se encontró con un 0
			return false;
		}
	}
	

}
