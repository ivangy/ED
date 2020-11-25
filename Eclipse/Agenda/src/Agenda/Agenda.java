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
				espacios();
				System.out.println("ERROR. El valor añadido tiene que estar entre el 1 y el 6");
			} else {
				espacios();
			}
		} while (opcion > 6 || opcion < 1);

		return opcion;
	}

	public static void espacios() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
	
	public static void añadir(String mNombre[][]) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Cuantos contactos desea añadir");
		int numAñadir = leer.nextInt();

		for (int i = 0; i < mNombre.length; i++) {
			if (mNombre[i][0].equals(" ")) {
				System.out.println("Dime el nombre ");
				mNombre[i][0] = leer.next();
				System.out.println("Dime el telefono ");
				mNombre[i][1] = leer.next();
				numAñadir--;
				if (numAñadir == 0) {
					break;
				}
			}
		}
	}

	public static void ver(String mNombre[][], int numGuardados) {
		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < numGuardados; i++) {
			if (!mNombre[i][0].equals(" ")) {
				System.out.println(mNombre[i][0] + "---" + mNombre[i][1]);
			}
		}
		System.out.println("Presione cualquier tecla y dale a enter para salir");
		String letra = leer.next();
	}

	public static void buscar(String mNombre[][]) {
		Scanner leer = new Scanner(System.in);
		System.out.println("1---Por nombre.");
		System.out.println("2---Por telefono.");
		System.out.println("Por que metodo lo deseas buscar");
		int num = leer.nextInt();
		// Buscar por nombre
		espacios();
		if (num == 1) {
			System.out.println("Dime que nombre quieres buscar");
			String nombre = leer.next();
			for (int i = 0; i < mNombre.length; i++) {
				nombre = nombre.toLowerCase();
				mNombre[i][0] = mNombre[i][0].toLowerCase();
				if (mNombre[i][0].equals(nombre)) {
					System.out.println(mNombre[i][0] + "---" + mNombre[i][1]);
				}
			}
		}
		// Buscar por tlf
		if (num == 2) {
			System.out.println("Dime que telefono quieres buscar");
			String tlf = leer.next();
			for (int i = 0; i < mNombre.length; i++) {
				if (mNombre[i][1].equals(tlf)) {
					System.out.println(mNombre[i][0] + "---" + mNombre[i][1]);
				}
			}
		}
		System.out.println("Presione cualquier tecla y dale a enter para salir");
		String letra = leer.next();
	}

	public static void borrar(String mNombre[][]) {
		Scanner leer = new Scanner(System.in);
		System.out.println("1---Por nombre.");
		System.out.println("2---Por telefono.");
		System.out.println("Por que metodo lo deseas borrar");
		int num = leer.nextInt();
		espacios();
		
		// Borra por nombre
		if(num==1) {
			System.out.println("Dime que nombre quieres borrar");
			String nombre = leer.next();
			for (int i = 0; i < mNombre.length; i++) {
				nombre = nombre.toLowerCase();
				mNombre[i][0] = mNombre[i][0].toLowerCase();
				if (mNombre[i][0].equals(nombre)) {
					espacios();
					System.out.println(mNombre[i][0] + "---" + mNombre[i][1]);
					System.out.println("¿Estas seguro que quieres borrar este nombre y telefono?(dime si o no)");
					String seguro= leer.next();
					seguro=seguro.toLowerCase();
					if(seguro.equals("si")) {
						mNombre[i][0]=" ";
						mNombre[i][1]=" ";
					}
					if(seguro.equals("no")) {
						break;
					}
				}
			}
		}
		
		// Borra por tlf
		if (num == 2) {
			System.out.println("Dime que telefono quieres borrar");
			String tlf = leer.next();
			for (int i = 0; i < mNombre.length; i++) {
				if (mNombre[i][1].equals(tlf)) {
					espacios();
					System.out.println(mNombre[i][0] + "---" + mNombre[i][1]);
					System.out.println("¿Estas seguro que quieres borrar este nombre y telefono?(dime si o no)");
					String seguro= leer.next();
					seguro=seguro.toLowerCase();
					if(seguro.equals("si")) {
						mNombre[i][0]=" ";
						mNombre[i][1]=" ";
					}
					if(seguro.equals("no")) {
						break;
					}
			}
		}
		System.out.println("Presione cualquier tecla y dale a enter para salir");
		String letra = leer.next();
	}
		
	}
	
	public static void editar(String mNombre[][]) {
		Scanner leer = new Scanner(System.in);
		System.out.println("1---Por nombre.");
		System.out.println("2---Por telefono.");
		System.out.println("Por que metodo lo deseas editar");
		int num = leer.nextInt();
		espacios();
		
			// Editar por nombre
			if(num==1) {
				System.out.println("Dime que nombre quieres editar");
				String nombre = leer.next();
				for (int i = 0; i < mNombre.length; i++) {
					nombre = nombre.toLowerCase();
					mNombre[i][0] = mNombre[i][0].toLowerCase();
					if (mNombre[i][0].equals(nombre)) {
						espacios();
						System.out.println(mNombre[i][0] + "---" + mNombre[i][1]);
						System.out.println("¿Estas seguro que quieres editar este nombre?(dime si o no)");
						String seguro= leer.next();
						seguro=seguro.toLowerCase();
						if(seguro.equals("si")) {
							espacios();
							System.out.println("Dime el nuevo nombre");
							mNombre[i][0]=leer.next();
							System.out.println("¿Quieres cambiar el telefono tambien?(dime si o no)");
							seguro= leer.next();
							seguro=seguro.toLowerCase();
							if(seguro.equals("si")) {
								System.out.println("Dime el nuevo telefono");
								mNombre[i][1]=leer.next();
							}
							if(seguro.equals("no")) {
								break;
							}
						}
						if(seguro.equals("no")) {
							break;
						}
					}
				}
			}
		
			// Editar por tlf
			if (num == 2) {
				System.out.println("Dime que telefono quieres borrar");
				String tlf = leer.next();
				for (int i = 0; i < mNombre.length; i++) {
					if (mNombre[i][1].equals(tlf)) {
						espacios();
						System.out.println(mNombre[i][0] + "---" + mNombre[i][1]);
						System.out.println("¿Estas seguro que quieres editar este telefono?(dime si o no)");
						String seguro= leer.next();
						seguro=seguro.toLowerCase();
						if(seguro.equals("si")) {
							espacios();
							System.out.println("Dime el nuevo telefono");
							mNombre[i][1]=leer.next();
							System.out.println("¿Quieres cambiar el nombre tambien?(dime si o no)");
							seguro= leer.next();
							seguro=seguro.toLowerCase();
							if(seguro.equals("si")) {
								System.out.println("Dime el nuevo nombre");
								mNombre[i][0]=leer.next();
							}
							if(seguro.equals("no")) {
								break;
							}
							
						}
						if(seguro.equals("no")) {
							break;
						}
					}
				}
			}
	}
	
	public static void main(String[] args) {
		int numGuardados = 100;
		String mNombre[][] = new String[numGuardados][2];
		for (int i = 0; i < numGuardados; i++) {
			mNombre[i][0] = " ";
			mNombre[i][1] = " ";
		}
		int opc;

		do {
			opc = pintaMenu();
			switch (opc) {
			case 1:
				// Añadir contacto
				añadir(mNombre);
				espacios();
				break;
			case 2:
				// Buscar contacto
				buscar(mNombre);
				espacios();
				break;
			case 3:
				// Borrar contacto
				borrar(mNombre);
				espacios();
				break;
			case 4:
				// Editar contacto
				editar(mNombre);
				espacios();
				break;
			case 5:
				// Ver todos los contactos
				ver(mNombre, numGuardados);
				espacios();
				break;
			case 6:
				// Salir
				break;

			default:
				break;
			}
		} while (opc != 6);

	}

}
