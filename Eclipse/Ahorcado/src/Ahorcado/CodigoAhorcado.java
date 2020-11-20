package Ahorcado;

import java.util.Scanner;

public class CodigoAhorcado {
	public static boolean hasGanado(String vAcierto[]) {

		for (int i = 0; i < vAcierto.length; i++) {
			if (vAcierto[i].equals("_ ")) {
				return false;

			}
		}
		
		for (int i = 0; i<20;i++) {
			System.out.println();
		}
		System.out.println("       +-----------+");
		System.out.println("       |gracias por|");
		System.out.println("   O <-|salbarme   |");
		System.out.println("  (|)  +-----------+ ");
		System.out.println("   |   ");
		System.out.println("  ( )  ");
		System.out.println("       ");
		System.out.println("Felicidades has ganado!!!");
		return true;
	}

	public static void inicializar(String palabra, String vAcierto[], String vFallo[], int vidas) {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}

		for (int i = 0; i < palabra.length(); i++) {
			vAcierto[i] = ("_ ");
		}

		for (int i = 0; i < vFallo.length; i++) {
			vFallo[i] = ("_ ");
		}

		for (int i = 0; i < palabra.length(); i++) {
			System.out.print(vAcierto[i]);
		}
		for (int i = 0; i < 1; i++) {
			System.out.println("");
		}
	}

	public static boolean repetida(String letra, String vFallo[]) {
		boolean repetido = false;
		
		for (int i = 0; i< vFallo.length; i++) {
			if (vFallo[i].equalsIgnoreCase(letra)) {
				repetido = true;
			}
		}
		
		return repetido;
	}
	
	public static int AciertoFallo(String letra, String palabra, String vAcierto[], String vFallo[], int vidas) {
		// comprueba los aciertos, errores y que no este repetida la letra
		boolean encontrado = false;
		
		if(repetida(letra, vFallo)==false) {
			
		for (int i = 0; i < palabra.length(); i++) {
			if (letra.equals(palabra.substring(i, i + 1))) {
				vAcierto[i] = letra + " ";
				encontrado = true;
			}
		}

		if (encontrado == false) {
			for (int i = 0; i < vFallo.length; i++) {
					if (vFallo[i].equals("_ ")) {
						vFallo[i] = letra;
						vidas = vidas - 1;
						break;
				}
			}
		}
		}
		// pinta los aciertos y errores
		for (int i = 0; i<20;i++) {
			System.out.println();
		}
		for (int i = 0; i < vAcierto.length; i++) {
			System.out.print(vAcierto[i]);
		}
		System.out.println("");
		System.out.println("Letras falladas: ");
		for (int i = 0; i < vFallo.length; i++) {
			System.out.print(vFallo[i]);
		}
		
		//información de las vidas que le queda
		if (vidas==1) {
			System.out.println("");
			System.out.println("Le quedan " + vidas + " vida");
		}else {
			System.out.println("");
			System.out.println("Le queda " + vidas + " vidas");
		}
		return vidas;
	}

	//lo he llamado muneco por q nose si java acepta la ñ
	public static void muneco(int vidas) {
		switch (vidas+1) {
		
		case 1:
			System.out.println("   +--+");
			System.out.println("   O  |");
			System.out.println("  (|) |");
			System.out.println("   |  |");
			System.out.println("      |");
			System.out.println("_______");
			break;
		case 2:
			System.out.println("   +--+");
			System.out.println("   O  |");
			System.out.println("  (|) |");
			System.out.println("   |  |");
			System.out.println("      |");
			System.out.println("_______");
			break;
		case 3:
			System.out.println("   +--+");
			System.out.println("   O  |");
			System.out.println("   |  |");
			System.out.println("   |  |");
			System.out.println("      |");
			System.out.println("_______");
			break;
		case 4:
			System.out.println("   +--+");
			System.out.println("   O  |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("_______");
			break;
		case 5:
			System.out.println("   +--+");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("_______");
			break;
		case 6:
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("_______");
			break;
		case 7:
			System.out.println("_______");
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		// Escribes la palabra y te da su silueta
		String palabra = leer.next();
		String letra;
		int vidas = 7;
		String vAcierto[], vFallo[];
		vAcierto = new String[palabra.length()];
		vFallo = new String[vidas];
		inicializar(palabra, vAcierto, vFallo, vidas);

		do {
			
			// Te pide una letra
			System.out.println("");
			System.out.println("Dime una letra");
			letra = leer.next();
			letra = letra.toLowerCase();

			
			vidas = AciertoFallo(letra, palabra, vAcierto, vFallo, vidas);
			muneco(vidas);
			//rompe el bucle si no te quedan vidas
			if (vidas==0) {
				for (int i = 0; i<20;i++) {
					System.out.println();
				}
				System.out.println("   +--+");
				System.out.println("   O  |");
				System.out.println("  (|) |");
				System.out.println("   |  |");
				System.out.println("  ( ) |");
				System.out.println("_______");
				System.out.println("Has perdido vuelve a intentarlo <3");
				break;
			}
		} while ((vidas >= 1 && hasGanado(vAcierto) == false));

	}

}