package Ejer_ficheros_texto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class IODatos {

	public static Persona[] leerArchivo() {

		String nombreFichero = "alumnos.txt";
		String nombre = "";
		String apellido = "";
		String ler = "";
		int i = 0;
		int nip = 0;

		File f = new File(nombreFichero);
		Persona per[] = new Persona[40];

		try (FileReader fr = new FileReader(f); Scanner leer = new Scanner(fr)) {

			while (leer.hasNext()) {
				ler = leer.nextLine().trim();
				int coma = ler.indexOf(",");

				nip = Integer.parseInt(ler.substring(0, 6));
				apellido = ler.substring(7, coma);
				nombre = ler.substring(coma + 2);

				per[i] = new Persona(nombre, apellido, nip);
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return per;

	}

	public static void mostrar(String nombreFichero, int longitudLinea) {
		Persona vPersona[] = leerArchivo();
		for (int i = 0; i < vPersona.length; i++) {
			if (vPersona[i] != null)
				System.out.println(vPersona[i].mostrarConpuntos(longitudLinea));
		}
	}

	public static void CrearArchivo() {
		try {
			Scanner leer = new Scanner(System.in);
			Persona vPersona[] = leerArchivo();
			System.out.println("Dime el nombre del nuevo fichero");
			String ruta = leer.next();
			ruta = ruta + ".txt";
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file, true);
			PrintWriter writer = new PrintWriter(fw);
			if (!file.exists()) {
				file.createNewFile();
			} else {
				
				for (int i = 0; i < vPersona.length; i++) {

					if (vPersona[i] != null) {

						writer.println(vPersona[i].mostrarConpuntos(100));

					}
				}
				writer.close();
				fw.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String buscar() {
		Scanner leer = new Scanner(System.in);
		Persona vPersonas[] = leerArchivo();
		boolean encontrado = false;
		String nombreEncontrado = "";
		int busqueda = 0;

		System.out.println("dime el nip que quieres buscar");
		busqueda = leer.nextInt();

		for (int i = 0; i < vPersonas.length; i++) {
			if (vPersonas[i] != null && busqueda == vPersonas[i].getNip()) {
				nombreEncontrado += ("Apellido:" + vPersonas[i].getApellido() + " Nombre:" + vPersonas[i].getNombre());
				encontrado = true;
			}
		}

		if (encontrado == false) {
			nombreEncontrado = "No se ha encontrado nadie con ese nip";
		}

		return nombreEncontrado;
	}

	public static void escribir(String nombreFichero) {

	}
}
