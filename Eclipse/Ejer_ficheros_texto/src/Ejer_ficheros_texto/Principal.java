package Ejer_ficheros_texto;

import java.util.Scanner;

public class Principal {
	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("1---Muestra por pantala la informacion del .txt");
			System.out.println("2---Buscar un nip q pide por teclado");
			System.out.println("3---Escribir datos en un fichero");
			System.out.println("4---Salir");
			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				System.out.println("ERROR no es un numero");
				leer = new Scanner(System.in);
			}

		} while (opc < 1 || opc > 4);
		return opc;
	}

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int opc=0;
	//	Persona vPersonas[] = IODatos.leerArchivo();
		do {
			
			switch (pintaMenu()) {
			case 1: {
				IODatos.mostrar("alumnos.txt", 135);
				break;
			}
			case 2: {
				System.out.println(IODatos.buscar());
				break;
			}
			case 3: {
				IODatos.CrearArchivo();
				break;
			}
			case 4: {
				opc=4;
				break;
			}
			}
		} while (opc != 4);
		
		
	}

}
