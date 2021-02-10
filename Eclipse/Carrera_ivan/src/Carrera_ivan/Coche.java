package Carrera_ivan;

import java.util.Random;



public class Coche {

	private String nomPiloto;
	private int dorsal;
	private int disCarrera = 5000;
	private String estadoCoche;
	private int potencia;
	private int velocidad;
	private int kilomRecorridos;

	public Coche(String nomPiloto, int dorsal) {
		this.nomPiloto = nomPiloto;
		this.dorsal = dorsal;
		this.estadoCoche = "PARADO";
		this.potencia = 50;
		this.velocidad = 0;
		this.kilomRecorridos = 0;
	}
	
	public void arrancar() {
		switch(getEstadoCoche().toUpperCase()) {
		case "MARCHA":
			System.out.println("Ya esta arrancado");
			break;
		case "PARADO":
			System.out.println("Has arrancado");
			setEstadoCoche("MARCHA");
			break;
		case "ACCIDENTADO":
			System.out.println("Debes de rearrancar para poder arrancar");
			break;
		case "TERMINADO":
			System.out.println("Ya has acabado la carrera");
			break;
		}
	}
	

	
	public void acelerar() {
		switch(getEstadoCoche()) {
		case "MARCHA":
			Random ale = new Random();
			velocidad += ale.nextInt(potencia);
			if(velocidad>200) {
				setVelocidad(0);
				setEstadoCoche("ACCIDENTADO");
				System.out.println("Has petado motor ibas a mas de 200");
			}else {
				setVelocidad(velocidad);
				setkilomRecorridos(getkilomRecorridos()+velocidad);
				System.out.println("Vas a " + velocidad + "km/h" + "cuidado de no superar los 200");
			}
			
			if(kilomRecorridos>=disCarrera){
				System.out.println("Has acabado la carrera");
				setEstadoCoche("Terminado");
			}else {
				System.out.println("Te faltan " + (getDisCarrera()-getkilomRecorridos()) + "Km para acabar");
			}
			
			break;
		case "PARADO":
			System.out.println("Tienes que arrancar para poder acelerar");
			break;
		case "ACCIDENTADO":
			System.out.println("Debes de rearrancar para poder arrancar");
			break;
		case "TERMINADO":
			System.out.println("Ya has acabado la carrera");
			break;
		}
	}
	
	public void frenar() {
		switch(getEstadoCoche()) {
		case "MARCHA":
			Random ale = new Random();
			velocidad -= ale.nextInt(potencia);
			if(velocidad<0) {
				setVelocidad(0);
				System.out.println("Vas a 0 Km/h acelera que no te estas moviendo");
				System.out.println("Te faltan " + (getDisCarrera()-getkilomRecorridos()) + "Km para acabar");
				
			}else {
				setVelocidad(velocidad);
				setkilomRecorridos(getkilomRecorridos()+velocidad);
				System.out.println("Vas a " + velocidad + "km/h" + "cuidado de no superar los 200");
				System.out.println("Te faltan " + (getDisCarrera()-getkilomRecorridos()) + "Km para acabar");
			}

			break;
		case "PARADO":
			System.out.println("Ya estas parado");
			break;
		case "ACCIDENTADO":
			System.out.println("Debes de rearrancar para poder frenar");
			break;
		case "TERMINADO":
			System.out.println("Ya has acabado la carrera");
			break;
		}
		
	}
	
	public void rearrancar() {
		switch(getEstadoCoche()) {
		case "MARCHA":
			System.out.println("Ya esta arrancado");
			break;
		case "PARADO":
			System.out.println("Solo tines que arrancar, no tienes que rearrancar");
			break;
		case "ACCIDENTADO":
			System.out.println("Ya estas en marcha, acelera");
			setEstadoCoche("MARCHA");
			break;
		case "TERMINADO":
			System.out.println("Ya has acabado la carrera");
			break;
		}
	}
	
	
	
	
	

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getDisCarrera() {
		return disCarrera;
	}

	public void setDisCarrera(int disCarrera) {
		this.disCarrera = disCarrera;
	}

	public String getEstadoCoche() {
		return estadoCoche;
	}

	public void setEstadoCoche(String estadoCoche) {
		this.estadoCoche = estadoCoche.toUpperCase();
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getkilomRecorridos() {
		return kilomRecorridos;
	}

	public void setkilomRecorridos(int kilomRecorridos) {
		this.kilomRecorridos = kilomRecorridos;
	}

	@Override
	public String toString() {
		return "Coche [nomPiloto=" + nomPiloto + ", dorsal=" + dorsal + ", disCarrera=" + disCarrera + ", estadoCoche="
				+ estadoCoche + ", potencia=" + potencia + ", velocidad=" + velocidad + ", kilomRecorridos=" + kilomRecorridos
				+ "]";
	}

}
