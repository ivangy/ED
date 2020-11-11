package ejercicio_1_3;

import java.util.Scanner;

public class ejercicio4 {
	public static void nombrecompleto(String vnombre[], int vedad[]) {
		for(int i=0; i<vnombre.length;i++) {
			System.out.println(vnombre[i] + " " + vedad[i]);
		}
		
	}

	public static void main(String[] args) {
		int tam;
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Dime el tamaño del vector: ");
		tam= leer.nextInt();
		int vedad[]= new int[tam];
		String vnombre[]= new String [tam];
		for(int i=0; i<tam; i++) {
			System.out.println("Dime el nombre y edad del numero " + i);
			vnombre[i]= leer.next();
			vedad[i]= leer.nextInt();
		}
		nombrecompleto(vnombre,vedad);

	}

}
