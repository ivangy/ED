package ejercicio_1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int niño, niña;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime cuantos niños hay");
		niño = leer.nextInt();
		System.out.println("Dime cuantos niñas hay");
		niña = leer.nextInt();
		System.out.println("Hay " + (niño*100/(niño+niña)) + 
				"% de niños y " + (niña*100/(niño+niña)) + "% de niñas");
	}

}

