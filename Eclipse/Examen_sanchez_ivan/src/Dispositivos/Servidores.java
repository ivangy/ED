package Dispositivos;

public class Servidores extends Equipos{
	private String so;
	private String ano_compra;
	
	public Servidores(String cod, String ubicacion, int coste, Boolean protegidos, String so, String ano_compra) {
		super(cod, ubicacion, coste, protegidos);
		this.so = so;
		this.ano_compra = ano_compra;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getAno_compra() {
		return ano_compra;
	}

	public void setAno_compra(String ano_compra) {
		this.ano_compra = ano_compra;
	}

	@Override
	public String toString() {
		return super.toString() + so + ";" + ano_compra;
	}
	
	
	
}
