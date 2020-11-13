package ejercicio_1_4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		String nombre, reves = " ", letra=" "; 
		int i;
		//char letra1;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime tu nombre");
		nombre = leer.next();
		for (i = 0; i < nombre.length(); i++) {
			letra= nombre.substring(i, i+1);
			//letra= String.valueOf(nombre.charAt(i));
			
			reves=letra+reves;

		}
		System.out.println(reves);
	}

}
