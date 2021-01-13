package Noche;
import java.util.Iterator;

public class Horas {
	private String horas;
	private String min;

	public Horas(String horas) {
		this.horas = horas.substring(0,2);
		min = horas.substring(3,5);
	}

	public int getHoras() {
		int intHoras;
		intHoras=Integer.valueOf(horas)*60;
		return intHoras;
	}



	public void setHoras(String horas) {
		this.horas = horas;
	}



	public String getMin() {
		return min;
	}



	public void setMin(String min) {
		this.min = min;
	}



	@Override
	public String toString() {
		return "Horas [horas=" + horas + ", min=" + min + "]";
	}
	
}
