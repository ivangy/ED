package Almacen;

public class Azucarada extends Bebidas {
	private double azucar;
	private boolean promocion;

	public Azucarada(String id, double litros, double precio, String marca, double azucar, boolean promocion) {
		super(id, litros, precio, marca);
		this.azucar = azucar;
		this.promocion = promocion;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public String toString() {
		return "Azucarada [azucar=" + azucar + ", promocion=" + promocion + "]";
	}

}
