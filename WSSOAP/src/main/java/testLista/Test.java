package testLista;

import java.util.ArrayList;
import java.util.List;

import clases.Lista;
import clases.Nodo;
import controller.ListaController;

public class Test {
	
	private static final List<Lista> listas = new ArrayList<>();
	
	public static void main(String[] args) {
	   
	Lista l1 = new Lista();
	l1.setNombre(1);
	Object obj1 = "Hola mundo!";
	ListaController lc = new ListaController();
	lc.insertarInicio(l1, obj1);
	//System.out.println(lc.obtenerNObj(l1, 0));
	//System.out.println(lc.longuitud(l1));
	
	Object obj2 = 25;
	lc.insertarFinal(l1, obj2);
	
	
	//System.out.println(lc.obtenerNObj(l1, 0));
	//System.out.println(lc.obtenerNObj(l1, 1));
	
	Lista l2 = new Lista();
	l2.setNombre(2);
	listas.add(l1);
	listas.add(l2);
	
	Lista l3 = new Lista();
	l3.setNombre(2);
	int nombrelista = 2;
	Object obj3 = "hola mundillo";
	
	int l = listas.size();
	System.out.println("tamaño ArrayList: "+l);
	
		
	if(buscarLista(listas, nombrelista) == true) {
		for(int i = 0; i<l;i++ ) {
			if(listas.get(i).getNombre() == nombrelista ) {
				lc.insertarFinal(listas.get(i), obj3);
			}
		}
	}
	
	System.out.println(lc.obtenerNObj(l2, 0));
	
	}// main
	
	
/*
	System.out.println(lc.obtenerNObj(listas.get(0), 0));
	System.out.println(lc.obtenerNObj(listas.get(0), 1));
	System.out.println(lc.obtenerNObj(listas.get(0), 2));
*/
	
	
	
	public static boolean buscarLista(List<Lista> listas2, int name) {
		int l = listas2.size();
		for(int i = 0; i<l;i++ ) {
			if(listas2.get(i).getNombre() == name ) {
				return true;
			}
		}
		return false;
	}

}


