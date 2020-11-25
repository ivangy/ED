package Ahorcado;

import java.util.Random;

public class aaa {

	public static void main(String[] args) {
		Random azar = new Random();
		String[] vpalabra= {"hola","adios","perro", "gato", "hockey", "tennis", "chapa", "confeti", "azar","murcielago","humanidad","saltamontes","yegua","montaña","reproducción","especie","matrimonio","familia","cabeza","pierna","persona"};
		int i=azar.nextInt(21)+1;
		System.out.println(i);
		System.out.println(vpalabra[i]);

	}

}
