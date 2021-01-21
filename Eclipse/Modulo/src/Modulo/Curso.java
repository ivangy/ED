package Modulo;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {
	private String nombre;
	private String tutor;
	private Modulo vModulo[];

	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulo = new Modulo[10];
	}

	public void nuevoModulo() {
		Scanner leer = new Scanner(System.in);
		String nueModulo = "";
		String nueCodigo = "";
		int nueHoras = 0;
		// int totalHoras = 0;

		System.out.println("Dime el nombre del nuevo modulo:");
		nueModulo = leer.next();
		System.out.println("Dime el codigo del nuevo modulo:");
		nueCodigo = leer.next();
		System.out.println("Dime cuantas horas tiene el modulo:");
		nueHoras = leer.nextInt();
		for (int i = 0; i < vModulo.length; i++) {
			if (vModulo[i] == null) {
				vModulo[i] = new Modulo(nueModulo, nueCodigo, nueHoras);
				// totalHoras = totalHoras + nueHoras;
				break;
			}
		}
		for (int j = 0; j < 10; j++) {
			System.out.println("\n");
		}
	}

	public int totalHoras() {
		int suma = 0;
		for (Modulo m : vModulo) {
			if (m != null) {
				suma += m.getHoras();
			}
		}
		return suma;
	}
	
	public void elliminar() {
		
		for (Modulo m : vModulo) {
			if (m != null) {
				System.out.println(m.toString());
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public Modulo[] getvModulo() {
		return vModulo;
	}

	public void setvModulo(Modulo[] vModulo) {
		this.vModulo = vModulo;
	}

	@Override
	public String toString() {
		String dato = "";
		for (Modulo m : vModulo) {
			if (m != null) {
				dato += m.toString();

			}

		}
		return nombre + ", tutor=" + tutor + "\n" + dato + "\n";
	}

}
