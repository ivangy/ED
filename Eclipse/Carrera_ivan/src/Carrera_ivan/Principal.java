package Carrera_ivan;

import java.util.Scanner;

public class Principal {

	public static int pintaMenu() {
		Scanner leer =new Scanner(System.in);
		int opc = 0;
		
		
		do {
			System.out.println("1---Arrancar");
			System.out.println("2---Acelerar");
			System.out.println("3---Frenar");
			System.out.println("4---Rearrancar");
			opc=leer.nextInt();
		}while (opc<1 || opc> 4);
		return opc;
	}
	
	
	public static void main(String[] args) {
		Coche f1 = new Coche("ejem", 4);
		do {
			switch(pintaMenu()) {
			case 1:
					f1.arrancar();
				break;
			case 2:
				f1.acelerar();
				break;
			case 3:
				f1.frenar();
				break;
			case 4:
				f1.rearrancar();
				break;
			}
		}while(f1.getkilomRecorridos()<=f1.getDisCarrera());

	}

}
