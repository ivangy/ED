package ejercicio_1_3;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vNum[] = new int[10];
		Scanner leer = new Scanner(System.in);
		Random azar = new Random();
		int suma=0;
		
		for(int i=0; i< vNum.length; i++) {
			System.out.print("Dame el numero " + i + ": ");
			vNum[i] = leer.nextInt();
		}
		for(int i=0; i< vNum.length; i++) {
			System.out.print(vNum[i] + " - ");
			suma = suma + vNum[i];
		}
		
		System.out.println("\nLa media es: " + ((float)suma/vNum.length));

	}

}