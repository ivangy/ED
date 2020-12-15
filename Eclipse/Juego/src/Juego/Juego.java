package Juego;

public class Juego {
	private String nombre;
	private int record;
	private boolean multiplataforma;

	public Juego(String nombre) {
		this.nombre = nombre;
		record = 0;
		multiplataforma = false;
	}
	

	public Juego(String nombre, boolean multiplataforma) {
		super();
		this.nombre = nombre;
		this.multiplataforma = multiplataforma;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public boolean isMultiplataforma() {
		return multiplataforma;
	}

	public void setMultiplataforma(boolean multiplataforma) {
		this.multiplataforma = multiplataforma;
	}
	
	public void ponerRecord(int puntuacion) {
		record=puntuacion;
	}

	@Override
	public String toString() {
		return nombre + ", record= " + record + ", multiplataforma= " + multiplataforma;
	}

}
