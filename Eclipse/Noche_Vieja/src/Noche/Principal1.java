package Noche;

public class Principal1 {

	public static void main(String[] args) {
		Horas vHoras[] = new Horas[10];

		String dato = "23:50";
		vHoras[0]= new Horas(dato);
		System.out.println(vHoras[0].getHoras());

	}

}
