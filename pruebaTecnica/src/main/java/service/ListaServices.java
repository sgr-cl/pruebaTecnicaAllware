package service;

import clases.Lista;
import clases.Nodo;

public class ListaServices {
	
	/*
	 * Inserta un objeto al inicio de una lista
	 */
	public void insertarInicio(Lista lista, Object obj) {
		Nodo nodo = new Nodo(obj);
		nodo.setSiguiente(lista.getCabeza());
		lista.setCabeza(nodo);
		int longitud = lista.getLonguitud();
		longitud++;
		lista.setLonguitud(longitud);
	}
	
	/*
	 * Inserta un objeto al final de una lista
	 */
	public void insertarFinal(Lista lista, Object obj) {
		Nodo nodo = new Nodo(obj);
		if(lista.getCabeza() == null) {
			lista.setCabeza(nodo);
			int l = lista.getLonguitud();
			l++;
			lista.setLonguitud(l);
		}else {
			Nodo puntero = lista.getCabeza();
			while(puntero.getSiguiente() != null) {
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(nodo);
			int l = lista.getLonguitud();
			l++;
			lista.setLonguitud(l);
		}
	}
	
	/*
	 * Inserta un objeto en la enesima posición de una lista
	 */
	public void insertarN(int n, Lista lista, Object obj) {
		Nodo nodo = new Nodo(obj);
		if(lista.getCabeza() == null) {
			lista.setCabeza(nodo);
			int l = lista.getLonguitud();
			l++;
			lista.setLonguitud(l);
		}else {
			Nodo puntero = lista.getCabeza();
			int contadorObj = 0;
			while(contadorObj < n && puntero.getSiguiente() != null) {
				puntero = puntero.getSiguiente();
				contadorObj++;
			}
			nodo.setSiguiente(puntero.getSiguiente());
			puntero.setSiguiente(nodo);
			int l = lista.getLonguitud();
			l++;
			lista.setLonguitud(l);
			
		}
	}
	
	/*
	 * Obtiene el enesimo elemento de una lista
	 */
	public Object obtenerNObj(Lista lista, int n) {
		if(lista.getCabeza() == null) {
			return null;
		}else {
			Nodo puntero = lista.getCabeza();
			int contadorObj = 0;
			while(contadorObj < n && puntero.getSiguiente() != null) {
				puntero = puntero.getSiguiente();
				contadorObj++;
			}
			if(contadorObj != n) {
				return null;//final de la lista y no se encontrao el obj
			}else {
				return puntero.getObj();
			}
		}
	}
	
	/*
	 * Obtiene la longuitud de una lista
	 */
	public int longuitud(Lista lista) {
		return lista.getLonguitud();
	}
	
	/*
	 * Retorna TRUE en caso de estar vacia
	 */
	public boolean estaVacia(Lista lista) {
		return lista.getCabeza() == null;
	}
	
	/*
	 * Elimina el primer Nodo de una lista
	 */
	public void eliminarInicio(Lista lista) {
		Nodo primero = lista.getCabeza();
		lista.setCabeza(lista.getCabeza().getSiguiente());
		primero.setSiguiente(null);
		int l = lista.getLonguitud();
		l--;
		lista.setLonguitud(l);
	}
	
	/*
	 * Elimina el ultimo Nodo de una lista
	 */
	public void eliminarUltimo(Lista lista) {
		if(lista.getCabeza() != null) {
			if(lista.getCabeza().getSiguiente() == null) {
				lista.setCabeza(null);
				int l = lista.getLonguitud();
				l--;
				lista.setLonguitud(l);
			}else {
				Nodo puntero = lista.getCabeza();
				while (puntero.getSiguiente().getSiguiente() != null) {
					puntero = puntero.getSiguiente();
				}
				puntero.setSiguiente(null);
				int l = lista.getLonguitud();
				l--;
				lista.setLonguitud(l);
				
			}			
		}
	}
	
	/*
	 * Elimina el N nodo de una lista
	 */
	public void eliminarNNodo(int n, Lista lista) {
		if (lista.getCabeza() != null) {
			if (n == 0) {
				Nodo primero = lista.getCabeza();
				lista.setCabeza(lista.getCabeza().getSiguiente());
				primero.setSiguiente(null);
				int l = lista.getLonguitud();
				l--;
				lista.setLonguitud(l);
			} else if (n < lista.getLonguitud()) {
				Nodo puntero = lista.getCabeza();
				int cont = 0;
				while (cont < (n - 1)) {
					puntero = puntero.getSiguiente();
					cont++;
				}
				Nodo temp = puntero.getSiguiente();
				puntero.setSiguiente(temp.getSiguiente());
				temp.setSiguiente(null);
				int l = lista.getLonguitud();
				l--;
				lista.setLonguitud(l);
			}
		}
	}

	/*
	 * 
	 */
}
