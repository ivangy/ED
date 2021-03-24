package Dispositivos;

import java.io.Serializable;

public class Equipos implements Serializable{
	protected String cod;
	protected String ubicacion;
	protected int coste;
	protected Boolean protegidos;
	
	public Equipos(String cod, String ubicacion, int coste, Boolean protegidos) {
		this.cod = cod;
		this.ubicacion = ubicacion;
		this.coste = coste;
		this.protegidos = protegidos;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public Boolean getProtegidos() {
		return protegidos;
	}

	public void setProtegidos(Boolean protegidos) {
		this.protegidos = protegidos;
	}

	@Override
	public String toString() {
		return cod + ";" + ubicacion + ";" + coste + ";" + protegidos + ";";
	}
	
	
}
