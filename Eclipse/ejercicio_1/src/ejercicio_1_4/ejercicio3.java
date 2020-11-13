package ejercicio_1_4;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		String nombre, letra, vocales = "aeiou";
		int contador = 0;
		Scanner leer = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		nombre = leer.next();
		
		for (int i =0; i<vocales.length();i++) {
			vocales = vocales.substring(i, i + 1);
			for ( i = 0; i < nombre.length(); i++) {
				letra = nombre.substring(i, i + 1);
				letra = letra.toLowerCase();
				if (letra.equalsIgnoreCase(vocales)) {
					contador = contador + 1;
				}

			}
		}
		
		System.out.println("Hay " + contador + " vocales");
	}

}
