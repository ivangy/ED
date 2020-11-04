package ejercicio_1;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		Scanner leer = new Scanner(System.in);
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();
		
		if (num1>num2 && num1>num3){
			System.out.println("El mayor es " + num1);
		}
		if (num2>num1 && num2>num3){
			System.out.println("El mayor es " + num2);
		}
		if (num3>num1 && num3>num2){
			System.out.println("El mayor es " + num3);
		}
		if (num1==num2 && num1==num3){
			System.out.println("Son iguales");
		}

	}

}
