package test;

import clases.Lista;
import clases.Nodo;
import controller.ListaController;

public class TestLista {
	
	public static void main(String[] args) {
		
		
	Lista l1 = new Lista();
	l1.setNombre(1);
	ListaController lc = new ListaController();
	lc.insertarInicio(l1, lc);
	Nodo n1 = new Nodo("Hola mundo!");
	l1.setCabeza(n1);
	System.out.println(l1.getLonguitud());
	
	Nodo n2 = new Nodo(23);
	l1.getCabeza().setSiguiente(n2);
	
	System.out.println(l1.getCabeza().getObj());
	System.out.println(l1.getCabeza().getSiguiente().getObj());
	
	int i = l1.getLonguitud();
	System.out.println(i);
	}
}
