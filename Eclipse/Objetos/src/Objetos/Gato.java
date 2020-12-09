package Objetos;

public class Gato {

	private String nombre;
	private int vidas;
	private int numPatas;

	public Gato() {
		nombre = "";
		vidas = 0;
		numPatas = 0;
	}

	public String getNombre() {
		return nombre.toUpperCase();
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", vidas=" + vidas + ", numPatas=" + numPatas + "]";
	}
	
}