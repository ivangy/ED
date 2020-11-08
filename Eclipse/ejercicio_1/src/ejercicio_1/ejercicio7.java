package ejercicio_1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int niño, niña;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime cuantos niÃ±os hay");
		niño = leer.nextInt();
		System.out.println("Dime cuantos niÃ±as hay");
		niña = leer.nextInt();
		System.out.println("Hay " + (niño*100/(niño+niña)) + 
				"% de niÃ±os y " + (niña*100/(niño+niña)) + "% de niÃ±as");
	}

}

