package Examen_Ivan_Sanchez;

import java.util.Random;
import java.util.Scanner;


public class Ejercicios {

	public static void espacios() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}

	public static void ejer1() {
		Scanner leer = new Scanner(System.in);
		// Pide cuantos numeros quiere sumar
		System.out.println("Cuantos numeros quiere sumar");
		int numSumar = leer.nextInt();
		int[] vNumeros= new int[numSumar];
		int resultado=0;
		for (int i = 0; i < numSumar; i++) {
			System.out.println("Dime el numero: " + i);
			vNumeros[i] = leer.nextInt();
			resultado=resultado+vNumeros[i];
		}
		System.out.println("La suma de todos es" + resultado);
	}

	public static int ejer2(int num1, int num2, int num3) {
		int resultado = 0;
		if (num1 > num2 && num1 > num3) {
			resultado = num1;
		}
		if (num2 > num1 && num2 > num3) {
			resultado = num2;
		}
		if (num3 > num1 && num3 > num2) {
			resultado = num3;
		}
		return resultado;
	}

	public static void ejer3(int altura) {
		String asterisco = "*";
		
		for (int i = altura; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(asterisco);
			}
			System.out.println("");

		}

	}

	public static void ejer4(int num) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = leer.next();
		int contadorLetras = 0;
		if (num == 1) {
			for (int i = 0; i < nombre.length(); i++) {
				if (!nombre.substring(i, i + 1).equals(" ")) {
					contadorLetras = contadorLetras + 1;
				}
			}
			System.out.println("Tu nombre tiene " + contadorLetras + " letras");
		}
		if (num == 2) {
			for (int i = 0; i < nombre.length(); i++) {
				System.out.print(nombre.substring(i, i + 1).toUpperCase());
			}
		}
		if (num != 1 && num != 2) {
			System.out.println("Error el numero tiene que ser el 1 o el 2");
		}
	}

	public static void ejer5() {
		Scanner leer = new Scanner(System.in);
		Random azar=new Random();
		System.out.println("Dime cuantas filas quieres");
		int filas = leer.nextInt();
		System.out.println("Dime cuantas columnas quieres");
		int columnas = leer.nextInt();
		int [][]mNumeros = new int[filas][columnas];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(mNumeros[i][j]= azar.nextInt(10)+1);
			}
		}
		mostrarMatriz(filas, columnas);
	}

	public static void mostrarMatriz(int filas, int columnas) {

	}

	public static void ejer6(String texto) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabraBuscar= leer.nextLine();
		for (int i = 0; i < texto.length()-1; i++) {
			if(texto.substring(i, i+1).equals(palabraBuscar.substring(0, 0+1))) {
				System.out.println("");
				if(texto.substring(i, palabraBuscar.length()+1).equals(palabraBuscar.substring(0, palabraBuscar.length()+1))) {
					System.out.println("Encontrado");
				}
			}
		}
		
		
		
	}

	public static void ejer7(String nombre) {
		String nombre1=" "+nombre;
		for (int i = 0; i < nombre1.length(); i++) {
			if(nombre1.substring(i, i+1).equals(" ")) {
				if(!nombre1.substring(i+1, i+2).equals(" ")) {
					System.out.print(nombre1.substring(i, i+1));
					System.out.print(nombre1.substring(i+1, i+2).toUpperCase());
					i=i+1;
				}
			}else {
				System.out.print(nombre1.substring(i, i+1).toLowerCase());
			}
		}
	}
	
	public static void ejer8(String nombre) {
		String[] vLetras= new String[nombre.length()];
		for (int i = 0; i < vLetras.length; i++) {
			vLetras[i]=nombre.substring(i, i+1);
		}
	}

	public static void mostrarMenu() {
		Scanner leer = new Scanner(System.in);
		System.out.println("1---Ejercicio_1");
		System.out.println("2---Ejercicio_2");
		System.out.println("3---Ejercicio_3");
		System.out.println("4---Ejercicio_4");
		System.out.println("5---Ejercicio_5");
		System.out.println("6---Ejercicio_6");
		System.out.println("7---Ejercicio_7");
		System.out.println("8---Ejercicio_8");
		System.out.println("0---Salir");
		int opcion = leer.nextInt();
		if(opcion>=0 && opcion<=8) {
		do {
		switch (opcion) {
		case 1:
			ejer1();
			mostrarMenu();
			
			break;
		case 2:
			System.out.println("El numero " + Ejercicios.ejer2(5, 6, 2) + " es el mayor");
			
			mostrarMenu();
			
			break;
		case 3:
			Ejercicios.ejer3(4);
		
			mostrarMenu();
			break;
		case 4:
			Ejercicios.ejer4(2);
		
			mostrarMenu();
			break;
		case 5:
			System.out.println("No me sale");
			//ejer5();
		
			mostrarMenu();
			break;
		case 6:
			System.out.println("No me sale");
			//Ejercicios.ejer6("Hola me llamo ivan");
		
			mostrarMenu();
			break;
		case 7:
			Ejercicios.ejer7("ivan sanchez guillen");
		
			mostrarMenu();
			break;
		case 8:
			Ejercicios.ejer8("ivan");
		
			mostrarMenu();
			break;
		case 0:
	
			break;
		default:
			break;
		}
		} while (opcion!=0);
		}else {
			System.out.println("Error el numero no esta entre 0 y 8");
		}
	}
}
