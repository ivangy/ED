package Ejer_ficheros_texto;

public class Persona {

	private String nombre;
	private String apellido;
	private int nip;

	public Persona(String nombre, String apellido, int nip) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nip = nip;
	}

	public String mostrarConpuntos(int longLinea) {
		int punto;
		String añadirPunto = "";
		String nombreBn;

		punto = (longLinea - apellido.length() - nombre.length() - String.valueOf(nip).length());
		for (int i = 0; i < punto; i++) {
			añadirPunto = añadirPunto + ".";
		}
		nombreBn = (apellido + ", " + nombre + " " + añadirPunto + nip);
		return nombreBn;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nip=" + nip + "]";
	}

}
