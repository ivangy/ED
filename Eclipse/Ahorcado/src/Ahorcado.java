import java.util.Scanner;

public class Ahorcado {
	public static void siluetaPalabra(String palabra) {
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}

		for (int i = 0; i < palabra.length(); i++) {
			System.out.print("_ ");
		}

		for (int i = 0; i < 1; i++) {
			System.out.println("");
		}
	}

	public static String haAcertado(String letra, String palabra) {
		String vAcierto;
		vAcierto = new s[palabra.length()]
		for (int i = 0; i < palabra.length(); i++) {
			if (letra.equals(palabra.substring(i, i+1))) {
				acierto = acierto+ letra+ " ";
			}else {
				acierto = acierto+ "_" + " ";
			}
		}
		return acierto;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		// Escribes la palabra y te da su silueta
		String palabra = leer.next();
		siluetaPalabra(palabra);
		
		

		// Te pide una letra
		String letra = leer.next();
		letra = letra.toLowerCase();
		System.out.println(haAcertado(letra, palabra));
		// Si aciertas te pinta la letra en su posicion

	}

}
