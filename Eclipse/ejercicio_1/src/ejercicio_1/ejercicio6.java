package ejercicio_1;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		
		Scanner leer = new Scanner(System.in);
		num1 = leer.nextInt();
		if(num1<0) {
			System.out.println("ERROR");
		}else {
			System.out.println("Del numero " + num1 + " , su potencia es " + (num1*num1) + 
					" y su raiz " + Math.sqrt(num1));
		}
	}

}
