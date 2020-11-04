package ejercicio_1;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		Scanner leer = new Scanner(System.in);
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();
		if(num1<0) {
			System.out.println("El producto es: " + (num1*num2*num3));
		}
		if(num1>0) {
			System.out.println("La suma es: " + (num1+num2+num3));
		}

	}

}
