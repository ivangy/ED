package ejercicio_1;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		String mes;
		int importe,total;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe el importe de la compra");
		importe = leer.nextInt();
		System.out.println("Introduce el mes");
		mes = leer.next();
		if(mes=="octubre") {
			System.out.println("El importe es de: " + (importe*0.85));
		}else {
			System.out.println("El importe es deee: " + importe);
		}

	}

}
