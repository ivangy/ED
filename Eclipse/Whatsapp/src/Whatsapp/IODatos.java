package Whatsapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

	public static Mensaje[] leerArchivo(){
		String nombreFichero = "whatsapp.txt";
		String nombre = "";
		String mensaje = "";
		String ler = "";
		int i = 0;
	
		File f = new File(nombreFichero);
		Mensaje men[] = new Mensaje[10];
	
		try (FileReader fr = new FileReader(f); Scanner leer = new Scanner(fr)) {
	
			while (leer.hasNext()) {
				ler = leer.nextLine().trim();
				int coma = ler.indexOf(":");
	
				mensaje = ler.substring(7, coma);
				nombre = ler.substring(coma + 2);
	
				men[i] = new Mensaje(nombre, mensaje);
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return men;
	}
	
	public static void mostrar(String nombreFichero, int longitudLinea) {
		Mensaje vMensaje[] = leerArchivo();
		for (int i = 0; i < vMensaje.length; i++) {
			if (vMensaje[i] != null)
				System.out.println(vMensaje[i]);
		}
	}
	
}
