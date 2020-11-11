package ejercicio_1_3;

import java.util.Scanner;

public class ejercicio5 {
	public static void nombrecompleto(String mnombre[][]) {
		
		for(int i=0; i<mnombre.length;i++) {
			System.out.println(mnombre[i][0] + " " + mnombre[i][1]);
		}
		
	}

	public static void main(String[] args) {
		int tam;
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Dime el tamaño del vector: ");
		tam= leer.nextInt();
		String mnombre[][]= new String [tam][2];
		for(int i=0; i<tam; i++) {
			System.out.println("Dime el nombre y edad del numero " + i);
			mnombre[i][0]= leer.next();
			mnombre[i][1]= leer.next();
		}
		nombrecompleto(mnombre);

	}

}