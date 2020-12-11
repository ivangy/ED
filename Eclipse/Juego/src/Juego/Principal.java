package Juego;

public class Principal {
	
	public static void main(String[] args) {

		Juego vJuegos[] = new Juego[100];
		Juego juego1 = new Juego("csgo");
		Juego juego2 = new Juego("Los sims");
		Juego juego3 = new Juego("Fifa");

		vJuegos[0] = juego1;
		vJuegos[1] = juego2;
		vJuegos[2] = juego3;
		vJuegos[3] = new Juego("Tetris");

		vJuegos[2].setMultiplataforma(true);
		vJuegos[2].ponerRecord(100);
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] != null && vJuegos[i].isMultiplataforma()==true) {
					System.out.println(vJuegos[i]);
			}
		}

	}

}
