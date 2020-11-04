package ejercicio_1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner leer = new Scanner(System.in);
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		System.out.println("La suma es: " + (num1+num2));
		System.out.println("La resta es: " + (num1-num2));
		System.out.println("El producto es: " + (num1*num2));
		System.out.println("La division es: " + (num1/num2));
		
	}

}
