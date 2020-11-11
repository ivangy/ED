package ejercicio_1_3;

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
	public static void numerosaleatorios(int mNumeros[][]) {
		Random azar = new Random();
		for (int i = 0; i < mNumeros.length; i++) {
			for (int j = 0; j < mNumeros[i].length; j++)
				mNumeros[i][j] = azar.nextInt(9);
		}

	}
	
	public static void sinsaltar(int mNumeros[][]){
		for (int i = 0; i < mNumeros.length; i++) {
			for (int j = 0; j < mNumeros[i].length; j++) {
				System.out.print(mNumeros[i][j] + " ");
			}
			System.out.println("");	
		}
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n, m;
		System.out.println("Dime cuanta filas y columnas quieres: ");
		n = leer.nextInt();
		m = leer.nextInt();
		int mNumeros[][] = new int[n][m];
		numerosaleatorios(mNumeros);
		sinsaltar(mNumeros);
	}

}
