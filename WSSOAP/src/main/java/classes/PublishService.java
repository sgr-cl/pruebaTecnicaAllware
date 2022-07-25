package classes;

import javax.xml.ws.Endpoint;

import clases.Lista;

public class PublishService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Endpoint.publish("http://localhost:1516/WS/PruebaTecnica", new ListaServiceImpl());
	}
	


}
