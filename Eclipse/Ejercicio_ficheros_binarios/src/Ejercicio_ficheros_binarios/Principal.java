package Ejercicio_ficheros_binarios;

import java.util.Scanner;


public class Principal {
public static int pintaMenu() {
	Scanner leer = new Scanner(System.in);
	int opc = 0;
	do {
		System.out.println("1---Escribir");
		System.out.println("2---Leer");
		System.out.println("3---Salir");
		try {
			opc = leer.nextInt();
		} catch (Exception e) {
			System.out.println("ERROR no es un numero");
			leer = new Scanner(System.in);
		}

	} while (opc < 1 || opc > 3);
	return opc;
}
	public static void main(String[] args) {
		int opc =0;
		do {
			
			switch (pintaMenu()) {
			case 1: {
				IODatos.escribirDatos();
				break;
			}
			case 2: {
				IODatos.leerDatos("ventas.dat");
				break;
			}
			case 3: {
				opc=4;
				break;
			}
			
			}
		} while (opc != 4);
		
		
	}

}
