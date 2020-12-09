package Objetos;

public class Principal {

	public static void main(String[] args) {

		//Gato minusi = new Gato();
		//Gato gato1 = new Gato();
		//Gato gato2 = new Gato();
		
		Perro hola = new Perro("Pepe");		
		hola.cumpleAnos();
		hola.ponerVacuna();
		System.out.println(hola.toString());
	}

}
