package Almacen;

import java.util.Arrays;

public class Almacen {
	private String  nombre;
	private Bebidas[][] mEstanteria;
	
	public Almacen(String nombre, Bebidas[][] mEstanteria) {
		this.nombre = nombre;
		this.mEstanteria = mEstanteria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Bebidas[][] getmEstanteria() {
		return mEstanteria;
	}

	public void setmEstanteria(Bebidas[][] mEstanteria) {
		this.mEstanteria = mEstanteria;
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", mEstanteria=" + Arrays.toString(mEstanteria) + "]";
	}
	
	
	
}
