package pruebatecnica.services.v1.ListaService;

import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;

public class UserClientSOAPConsola {

	public static void main(String[] args) {
		ListaServiceLocator locator = new ListaServiceLocator();
		try {
			ListaServiceImpl userService = locator.getListaServiceImplPort();
			try (Scanner reader = new Scanner(System.in);) {
				while (true) {
					int menu;
					System.out.println("Digite el número según la acción que desee realizar.");
					System.out.println("1) Crear nueva lista");
					System.out.println("2) Insertar elemento en una lista");
					System.out.println("3) Insertar elemento en una posicion N");
					System.out.println("4) Obtener elemento de una lista");
					System.out.println("5) Obtener largo de una lista");
					System.out.println("6) Borrar un elemento de una lista");
					System.out.println("10) Salir");
					menu = reader.nextInt();
					switch (menu) {
					case 1:
						System.out.println("Inserte nombre de la lista (int)");
						int name = reader.nextInt();						
						System.out.println("Inserte algun contenido (String)");
						String obj = reader.next();
						userService.insertarObj(name, obj);
						System.out.println("Lista creada con éxito");
						break;
					case 2:
						System.out.println("¿En que lista desea insertar el elemento (int)?");
						int name2 = reader.nextInt();
						System.out.println("Elemento a insertar (String): ");
						Object obj2 = reader.next();
						userService.insertarObj(name2, obj2);
						System.out.println("Elemento insertado con éxito");
						break;
					case 3:
						System.out.println("¿En que lista desea insertar el elemento (int)?");
						int name3 = reader.nextInt();
						System.out.println("¿En que posición desea insertar el elemento (int)?");
						int pos3 = reader.nextInt();
						System.out.println("Elemento a insertar (String): ");
						Object obj3 = reader.next();
						userService.insertarN(name3, pos3, obj3);
						System.out.println("Elemento insertado con éxito");
						break;
					case 4:
						System.out.println("Indique la lista del elemento a buscar");
						int l4 = reader.nextInt();
						System.out.println("Indique la posición del elemento");
						int pos4 = reader.nextInt();
						System.out.println("Elemento: "+userService.getObj(l4, pos4));
						break;
					case 5:
						System.out.println("Indique la lista que desea saber su tamaño");
						int l5 = reader.nextInt();
						System.out.println(userService.getSizeList(l5));
						break;
					case 6:
						System.out.println("¿Qué lista desea borrar un elemento (int)?");
						int l6 = reader.nextInt();
						System.out.println("Indique la posición del elemento a borrar (int)");
						int del6 = reader.nextInt();
						userService.deleteN(l6, del6);
						System.out.println("Borrado exitoso");
						break;
					case 10:
						System.exit(0);
					}
				}
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
