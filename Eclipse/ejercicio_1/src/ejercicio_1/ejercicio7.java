package ejercicio_1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ni�o, ni�a;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime cuantos niños hay");
		ni�o = leer.nextInt();
		System.out.println("Dime cuantos niñas hay");
		ni�a = leer.nextInt();
		System.out.println("Hay " + (ni�o*100/(ni�o+ni�a)) + 
				"% de niños y " + (ni�a*100/(ni�o+ni�a)) + "% de niñas");
	}

}

