package Juego;

import java.util.Scanner;

public class Principal {

	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		do {
			// Guardar un nuevo juego
			System.out.println("1---Guardar un nuevo juego");
			// Poner puntuación a un juego
			System.out.println("2---Poner puntuación a un juego");
			// Ver todos los juegos
			System.out.println("3---Ver todos los juegos");

			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				System.out.println("ERROR no es un numero");
				leer = new Scanner(System.in);
			}

		} while (opc < 1 || opc > 3);
		return opc;
	}

	public static void verTodosJuegos(Juego vJuegos[]) {

	}

	public static void guardarJuego(Juego vJuegos[]) {
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] == null) {
				System.out.println("Dime el nombre del juego");
				String nombre = leer.next();
				String respu = " ";
				boolean multiplataforma = false;
				
				do {
				System.out.println("Es multiplataforma (si o no)");
				respu = leer.next();
				if (respu.equals("si") || respu.equals("no")) {

				if (respu.equals("si")) {
					multiplataforma = true;
				}
				if (respu.equals("no")) {
					multiplataforma = false;
				}
				}else {
					System.out.println("me tienes que decir si o no");
				}
				}while(!respu.equals("si") || respu.equals("no"));
				
				vJuegos[i] = new Juego(nombre, multiplataforma);
				break;
			}
		}
	}

	public static void ponerPuntuacionJuego(Juego vJuegos[]) {
		for (int i = 0; i < vJuegos.length; i++) {
			System.out.println(vJuegos[i]);
		}
		
	}

	public static void main(String[] args) {

		// pintaMenu();

		Juego vJuegos[] = new Juego[100];
		Juego juego1 = new Juego("csgo");
		Juego juego2 = new Juego("Los sims");
		Juego juego3 = new Juego("Fifa");

		guardarJuego(vJuegos);
		ponerPuntuacionJuego(vJuegos);
		/*
		 * vJuegos[0] = juego1; vJuegos[1] = juego2; vJuegos[2] = juego3; vJuegos[3] =
		 * new Juego("Tetris");
		 * 
		 * vJuegos[2].setMultiplataforma(true); vJuegos[2].ponerRecord(100);
		 * 
		 * for (int i = 0; i < vJuegos.length; i++) { if (vJuegos[i] != null &&
		 * vJuegos[i].isMultiplataforma() == true) { System.out.println(vJuegos[i]); } }
		 */
	}

}
