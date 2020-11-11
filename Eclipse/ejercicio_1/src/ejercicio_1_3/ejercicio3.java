package ejercicio_1_3;

import java.util.Scanner;

public class ejercicio3 {
	
	public static int[] multiplos(int num,int vmulti[]) {
		
		for(int i= 0; i<vmulti.length; i++) {
			vmulti[i]= num*i;
			
		}
		
		return vmulti;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int tam=0;
		int num =0;
		System.out.println("Dime el tamaño del vector: ");
		tam= leer.nextInt();
		int vmulti[]= new int[tam];
		
		num= leer.nextInt();
		
		vmulti = multiplos(num, vmulti);
		
		for(int i= 0; i<vmulti.length; i++) {
			System.out.println(vmulti[i]= num*i);
			
		}
		

	}

}
