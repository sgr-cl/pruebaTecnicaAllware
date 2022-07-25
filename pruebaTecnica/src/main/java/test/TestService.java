package test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import clases.Lista;
import controller.ListaController;

public class TestService {

	
	
	public static void main(String[] args) {
		ListaController lc = new ListaController();
		/*
		 * Crear lista e insertar primer elemento
		 * 1) Se crea un objeto, en este caso un String
		 * 2) Se crea una instancia de la clase Lista
		 * 3) Se utiliza el controlador para insertar un elemento a la lista 
		 * 4) Se imprime por Consola el elemento insertado y la longuitud de la lista
		 * para rectificar
		 */
		Object obj = "Hola Mundo!!";
		Lista lista = new Lista();
		lc.insertarInicio(lista, obj);
		System.out.println(lc.obtenerNObj(lista, 0));
		System.out.println(lc.longuitud(lista));
		
		/*
		 * Insertar elemento al final de la lista
		 * 1) Se crea un objeto esta vez un entero para insertar al final de la lista
		 * 2) Se imprime por Consola el nuevo elemento y la longitud de al lista
		 */
		Object obj2 = 25;
		lc.insertarFinal(lista, obj2);
		System.out.println(lc.obtenerNObj(lista, 1));
		System.out.println(lc.longuitud(lista));
		
		/*
		 * Insertar elemento en enesima posicion		
		 */
		
		Object obj3 = 2.65;
		lc.insertarN(10, lista, obj3);
		System.out.println(lc.obtenerNObj(lista, 2));
		System.out.println(lc.longuitud(lista));
		
		/*
		 * Verificación de la lista en caso de estar vacia
		 */
		if(lc.estaVacia(lista) == true) {
			System.out.println("Lista vacia");
		}else {
			System.out.println("Lista de largo: "+lc.longuitud(lista));
		}
		
		/*
		 * Eliminar elemento del inicio
		 */
		lc.eliminarInicio(lista);
		System.out.println("Largo de la lista tras borrar primero: "+lista.getLonguitud());
		
		/*
		 * Eliminar último elemento de la lista
		 */
		lc.eliminarUltimo(lista);
		System.out.println("Largo de la lista tras borrar ultimo: "+lista.getLonguitud());
		
		/*
		 * Eliminar elemento enesimo de la lista
		 */
		
		lc.eliminarNNodo(0, lista);
		System.out.println("Largo de la lista tras borrar enesimo: "+lista.getLonguitud());
		
	}

}
