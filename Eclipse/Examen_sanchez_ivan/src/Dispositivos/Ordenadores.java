package Dispositivos;

public class Ordenadores extends Equipos{
	private String so;
	private String tipo;
	
	public Ordenadores(String cod, String ubicacion, int coste, Boolean protegidos, String so, String tipo) {
		super(cod, ubicacion, coste, protegidos);
		this.so = so;
		this.tipo = tipo;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + so + ";" + tipo;
	}
	
	
	
}
