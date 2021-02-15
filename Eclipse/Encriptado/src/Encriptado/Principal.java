package Encriptado;

import java.util.Scanner;


public class Principal {
	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("1---Crea un archivo, te pide un mensaje y lo encripta");
			System.out.println("2---Desencripta un archivo sabiendo su nombre");
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
		Scanner leer =new Scanner(System.in);
		int opc=0;
			do {
				
				switch (pintaMenu()) {
				case 1: {
					IODatos.CrearArchivo();
					break;
				}
				case 2: {
					System.out.println("Dime el archivo que deseha desencriptar. Ejemplo (ROT4)");
					String ruta = leer.next();
					ruta= ruta.toUpperCase();
					Root.DesEncriptar(ruta);
					break;
				}
				case 3: {
					opc=3;
					break;
				}
				}
			} while (opc != 3);
	}

}
