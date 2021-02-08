package Ficheros;

import java.io.File;
import java.util.Scanner;

public class Crear {

	public static void main(String[] args) {
		String nombreCarpeta, nombreFichero;
		Scanner leer = new Scanner(System.in);

		System.out.println("Dime el nombre de la carpeta y el archivo");
		nombreCarpeta = leer.next();
		nombreFichero = leer.next();
		File d = new File(nombreCarpeta);
		if (!d.exists()) {
			d.mkdir();
		}
		String ruta = nombreCarpeta + "/" + nombreFichero;
		File f = new File(ruta);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (Exception e) {
				System.out.println("ERROR");
			}
			
		}
	}

}
