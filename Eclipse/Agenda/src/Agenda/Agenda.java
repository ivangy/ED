package Agenda;

import java.util.Scanner;

public class Agenda {

	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("1--------------Añadir contacto");
			System.out.println("2--------------Buscar contacto");
			System.out.println("3--------------Borrar contacto");
			System.out.println("4--------------Editar contacto");
			System.out.println("5--------------Ver todos los contactos");
			System.out.println("6--------------Salir");
			opcion = leer.nextInt();

			if (opcion > 6 || opcion < 1) {
				for (int i = 0; i < 20; i++) {
					System.out.println("");
				}
				System.out.println("ERROR. El valor añadido tiene que estar entre el 1 y el 6");
			} else {
				for (int i = 0; i < 20; i++) {
					System.out.println("");
				}
			}
		} while (opcion > 6 || opcion < 1);

		return opcion;
	}

	public static  String[][] añadir(String mNombre[][]) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Cuantos contactos desea añadir");
		int numAñadir= leer.nextInt();
		int i=0;
		
		if(mNombre[i][0]==" ") {
			for(int j=0;j<numAñadir;j++) {
				System.out.println("Dime el nombre " + (j+1));
				mNombre[i][0]= leer.next();
				System.out.println("Dime el telefono " + (j+1));
				mNombre[i][1]= leer.next();
				if(j==numAñadir) {
					break;
				}
			}
		}
		
		return mNombre;
	}

	public static void ver(String mNombre[][]) {
		for(int i = 0; i<100;i++) {
			if(!mNombre[i][0].equals(" ")) {
				System.out.println(mNombre[i][0] + mNombre[i][1]);
			}
		}
	}
	
	public static void main(String[] args) {
		String mNombre[][]= new String[100][2];
		for(int i = 0;i<100;i++) {
			mNombre[i][0]=" ";
		}
		
		do {
			switch (pintaMenu()) {
			case 1:
				// Añadir contacto
				añadir(mNombre);
				for (int i = 0; i < 20; i++) {
					System.out.println("");
				}
				break;
			case 2:
				// Buscar contacto
				break;
			case 3:
				// Borrar contacto
				break;
			case 4:
				// Editar contacto
				break;
			case 5:
				// Ver todos los contactos
				ver(mNombre);
				break;
			case 6:
				// Salir
				break;

			default:
				break;
			}
		} while(pintaMenu()==6);
		

	}

}
