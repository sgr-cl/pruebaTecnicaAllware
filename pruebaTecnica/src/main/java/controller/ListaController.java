package controller;

import clases.Lista;
import service.ListaServices;

public class ListaController {
	public ListaServices ls = new ListaServices();
	
	public void insertarInicio(Lista lista, Object obj) {
		ls.insertarInicio(lista, obj);
	}
	
	public void insertarFinal(Lista lista, Object obj) {
		ls.insertarFinal(lista, obj);
	} 
	
	public void insertarN(int n, Lista lista, Object obj) {
		ls.insertarN(n, lista, obj);
	}
	
	public Object obtenerNObj(Lista lista, int n) {
		return ls.obtenerNObj(lista, n);
	}
	
	public int longuitud(Lista lista) {
		return ls.longuitud(lista);
	}
	
	public boolean estaVacia(Lista lista) {
		return ls.estaVacia(lista);
	}
	
	public void eliminarInicio(Lista lista) {
		ls.eliminarInicio(lista);
	}
	
	public void eliminarUltimo(Lista lista) {
		ls.eliminarUltimo(lista);
	}
	
	public void eliminarNNodo(int n, Lista lista) {
		ls.eliminarNNodo(n, lista);
	}
	
}
