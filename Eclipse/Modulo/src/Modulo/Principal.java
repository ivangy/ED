package Modulo;

public class Principal {

	public static void main(String[] args) {
		Modulo vModulo[] = new Modulo[7];

		
		vModulo[0] = new Modulo("Programacion", "cod1", 100);
		vModulo[5] = new Modulo("Entornos_Desarrollo", "cod2", 90);
		for (Modulo m : vModulo) {
			if (m!=null) {
				System.out.println(m.toString());
			}
			
		}

	}

}
