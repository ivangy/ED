package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import Dispositivos.Equipos;
import Dispositivos.Impresoras;
import Dispositivos.Ordenadores;
import IODatos.IODatos;

public class Principal {
	
	public static int pintaMenu() {
		int opc=0;
		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("1 - Mostrar la informacion de todos los Equipos");
			System.out.println("2 - Mostrar la informacion de un tipo determinado de Equipo"); 
			System.out.println("3 - Añadir nuevo Equipo");
			System.out.println("4 - Proteger Equipo");
			System.out.println("5 - Generar informe");
			System.out.println("6 - Guardar datos en binario");
			System.out.println("7 - Salir");
			System.out.println("Dime una opcion");

			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				System.out.println("ERROR");
				break;
			}
		} while ((opc < 1) || (opc > 7));

		return opc;

	}
	
	
	public static void main(String[] args) {
		Equipos Equipos[] = new Equipos[10];
		Equipos[0] = new Impresoras("a", "e", 0, true, "i");
		Equipos[1] = new Ordenadores("b", "b", 0, false, "b", "b");
		ArrayList<Equipos> Equipos2 = IODatos.cargarEquiposDinamico();
		
		//Equipos[] Equipos = IODatos.cargarEquipos();
		
		int opc =0;
		do {
			opc=pintaMenu();
		switch (opc) {
		case 1:	
			IODatos.mostrarEquipos(Equipos);
			break;
		case 2:
			IODatos.mostrarUnEquipos(Equipos);
			break;
		case 3:
			IODatos.anadirEquipo(Equipos);
			break;
		case 4:
			IODatos.proteger(Equipos);
			break;
		case 5:
			System.out.println("1");
			break;
		case 6:
			IODatos.guardarDatos(Equipos);
			break;
		case 7:
			
			break;
		}
		} while (opc!=7);
	}

}
