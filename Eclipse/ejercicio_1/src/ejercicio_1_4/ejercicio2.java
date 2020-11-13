package ejercicio_1_4;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		String nombre, reves = "", letra = "";
		int i;
		Scanner leer = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		nombre = leer.next();
		for (i = 0; i < nombre.length(); i++) {
			letra = nombre.substring(i, i + 1);
			if (i % 2 == 0) {
				reves = reves + letra.toUpperCase();
			} else {
				reves = reves + letra.toLowerCase();
			}

		}
		System.out.println(reves);
	}

}
