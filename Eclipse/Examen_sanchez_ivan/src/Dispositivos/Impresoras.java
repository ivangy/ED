package Dispositivos;

public class Impresoras extends Equipos{
	private String tipo;

	public Impresoras(String cod, String ubicacion, int coste, Boolean protegidos, String tipo) {
		super(cod, ubicacion, coste, protegidos);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + tipo;
	}
	
	
}
