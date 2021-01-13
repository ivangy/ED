package Noche;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		Horas vHoras[] = new Horas[10];
		Scanner leer = new Scanner(System.in);
		String dato, a="00:00";
		int i=0;
		for (i = 0; i < vHoras.length; i++) {
			vHoras[i]=new Horas(a);
		}
		
		i=0;
		
		do {
			dato=leer.next();
			vHoras[i] = new Horas(dato);
			i++;
		} while (!dato.equals("00:00"));
		
		i=0;
		/*
		for (i = 0; i < vHoras.length; i++) {
			if(!(vHoras[i].getHoras()).equals("")){
				System.out.println(vHoras[i].getHoras());
			}
		}*/
		for (Horas horas : vHoras) {
			if(!(vHoras[i].getHoras()).equals("")){
			System.out.println(horas.getHoras());
			}
		}
		

	}

}
