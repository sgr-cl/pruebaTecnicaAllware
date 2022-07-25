package clases;

public class Lista {
	
	private int nombre;
	private Nodo cabeza = null;
	private int longuitud;
	
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	public int getLonguitud() {
		return longuitud;
	}
	public void setLonguitud(int longuitud) {
		this.longuitud = longuitud;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	

}
