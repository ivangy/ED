package ejercicio_1_3;


import java.util.Scanner;

public class ejercicio2 {
	public static int calcularMedia() {
		int vNum[] = new int[10];
		Scanner leer = new Scanner(System.in);
		
		int suma=0;
		int media=0;
		
		for(int i=0; i< vNum.length; i++) {
			System.out.print("Dame el numero " + i + ": ");
			vNum[i] = leer.nextInt();
		}
		for(int i=0; i< vNum.length; i++) {
			System.out.print(vNum[i] + " - ");
			suma = suma + vNum[i];
		}
		media= (suma/vNum.length);
	
		return media;
	}
	
	public static void main(String[] args) {
		System.out.println("\nLa media es: " + calcularMedia());
		
		
	}

}
