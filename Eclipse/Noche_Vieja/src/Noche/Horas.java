package Noche;
import java.util.Iterator;

public class Horas {
	private String horas;
	private String min;

	public Horas(String horas) {
		this.horas = horas.substring(0,2);
		min = horas.substring(3,5);
	}

	public String getHoras() {
		int intHoras;
		String strigHoras;
		String nada="";
		intHoras=1440-((Integer.valueOf(horas)* 60) + (Integer.valueOf(min)));
		if (horas.equals("00") && min.equals("00")) {
			return nada;
		}
		strigHoras= intHoras + "";
		return strigHoras;
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
