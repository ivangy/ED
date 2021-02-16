package Encriptado;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

	public static void crearArchivo() {
		Scanner leer = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		System.out.println("�En que rot deseha encriptar?");
		int rot = leer.nextInt();
		String ruta = "ROT" + rot + ".txt";
		File file = new File(ruta);

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Dime el mensaje que quieres encriptar");
				String mensaje;
				mensaje=ler.nextLine();
				//String mensaje="hola que tal";
				Root.Encriptar(mensaje,rot);
			} catch (IOException e) {
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			}
		} else {
			System.out.println("Ya esta creado no se puede machacar");
		}
	}
	
	
}
