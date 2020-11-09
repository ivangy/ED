package ejercicio_1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nino, nina;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime cuantos niños hay");
		nino = leer.nextInt();
		System.out.println("Dime cuantos niñas hay");
		nina = leer.nextInt();
		System.out.println("Hay " + (nino*100/(nino+nina)) + 
				"% de niños y " + (nina*100/(nino+nina)) + "% de niñas");
	}

}

