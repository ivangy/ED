package ejercicio_1;

public class ejercicio15 {
	public static void sumaParImpar() {
		int i, sumaPar, sumaImpar;
		sumaPar=0;
		sumaImpar=0;
		for(i = 0; i <= 100; i++ ) {
			if(i%2==0) {
				sumaPar += i;
			}else {
				sumaImpar += i;
			}
		}
		System.out.println("La suma de los pares es= " + sumaPar);
		System.out.println("La suma de los impares es= " + sumaImpar);
	}
	public static void main(String[] args) {
		sumaParImpar();
	}

}
