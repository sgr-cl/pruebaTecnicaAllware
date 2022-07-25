package pruebatecnica.services.v1.ListaService;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import clases.Lista;

public class UserClientSOAP {

	public static void main(String[] args) {
		ListaServiceLocator locator = new ListaServiceLocator();

		try {
			ListaServiceImpl userService = locator.getListaServiceImplPort();

			// insertar nueva lista
			Lista l1 = new Lista();
			l1.setNombre(0);
			Object obj1 = "Hola mundo1";
			int i1 = 10;
			double d1 = 3.14;
			userService.insertarObj(l1.getNombre(), obj1);
			userService.insertarObj(l1.getNombre(), i1);
			userService.insertarObj(l1.getNombre(), d1);
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 0));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 1));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 2));

			//insertar segunda lista
			Lista l2 = new Lista();
			l2.setNombre(1);
			Object obj2 = "Hola mundo2";
			int i2 = 234;
			userService.insertarObj(l2.getNombre(), obj2);
			userService.insertarObj(l2.getNombre(), i2);
			System.out.println("Lista "+l2.getNombre()+": "+userService.getObj(1, 0));
			System.out.println("Lista "+l2.getNombre()+": "+userService.getObj(1, 1));
			
			//insertar tercera lista
			Lista l3 = new Lista();
			l3.setNombre(2);
			Object obj3 = "Hola mundo3";
			userService.insertarObj(l3.getNombre(), obj3);
			System.out.println("Lista "+l3.getNombre()+": "+userService.getObj(2, 0));
		
			//insertar en posicion N
			Object objN = "Comentario ENE";
			userService.insertarN(l1.getNombre(), 1, objN);
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 0));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 1));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 2));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 3));
			
			//obtener un elemnto de una lista
			System.out.println("Elemento 2 de la lista "+l1.getNombre()+": "+userService.getObj(l1.getNombre(), 2));
			
			//obtener largo de una lista
			System.out.println("Largo de la lista "+l1.getNombre()+": "+userService.getSizeList(l1.getLonguitud()));
			
			//borrar elemento de una lista
			userService.deleteN(l1.getNombre(), 0);
			System.out.println("Largo de la lista "+l1.getNombre()+": "+userService.getSizeList(l1.getLonguitud()));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 0));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 1));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 2));
			System.out.println("Lista "+l1.getNombre()+": " +userService.getObj(0, 3));
			
			// Se añade nuevo usuario
			//userService.addUser(new User("Pablo", "Ruiz"));
			// Se muestra la lista de usuarios
			//System.out.println("Lista de usuarios: \n" + Arrays.toString(userService.getUsers()));

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
