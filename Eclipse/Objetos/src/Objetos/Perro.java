package Objetos;

public class Perro {
	private String nombre;
	private int edad;
	private boolean vacunado;

	public Perro() {
		nombre ="";
		edad = 0;
		vacunado = false;

	}
	public Perro(String nombre) {
		this.nombre = nombre;
		edad = 0;
		vacunado = false;

	}
	
	public Perro(String nombre, int edad, boolean vacunado) {
		this.nombre = nombre;
		this.edad = edad;
		this.vacunado = vacunado;

	}
	

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	
		public void cumpleAnos() {
		if (edad >= 16) {
			System.out.println(nombre + " esta muerto");
		} else {
			edad++;
		}
		}
		
		public void ponerVacuna() {
			if(vacunado==false) {
				vacunado=true;
			}else {
				System.out.println("Ya tengo vacuna");
			}
		}
		
		@Override
		public String toString() {
			return "Perro [nombre=" + nombre + ", edad=" + edad + ", vacunado=" + vacunado + "]";
		}

	

}
