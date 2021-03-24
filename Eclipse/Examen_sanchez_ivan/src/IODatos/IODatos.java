package IODatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Dispositivos.Equipos;
import Dispositivos.Impresoras;
import Dispositivos.Ordenadores;
import Dispositivos.Servidores;

public class IODatos {
	
	public static Equipos[] cargarEquipos() {
		Equipos Equipos[]= new Equipos[10];
		int i=0;
		
		File f = new File("recursos/dispositivos.txt");
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

		try (FileInputStream fo = new FileInputStream(f);
				 ObjectInputStream leer = new ObjectInputStream(fo)){
			
			Equipos =(Equipos[]) leer.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Equipos;
		
	}
	
	
	public static void mostrarEquipos(Equipos[] Equipos) {
		for (Equipos e : Equipos) {
			if (e!=null) {
				System.out.println(e);
			}
			
		}
	}
	
	public static void mostrarUnEquipos(Equipos[] Equipos) {
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Que equipo quieres buscar?");
		System.out.println("Ordenador - Escribe: p");
		System.out.println("Servidor  - Escribe: s");
		System.out.println("Impresora - Escribe: i");
		String letra= leer.nextLine();
		letra= letra.toLowerCase();
		for (Equipos e : Equipos) {
			if(e!=null) {
				String p = e.getCod().substring(0, 1);
				p= p.toLowerCase();
				if(p.equals(letra)) {
					System.out.println(e);
				}
			}
			
		}
		
	}


	public static void anadirEquipo(Equipos[] Equipos) {
		System.out.println("¿Que equipo quieres añadir?");
		pintaMenuEquipo();
		int opc =0;
		do {
			opc=pintaMenuEquipo();
		switch (opc) {
		case 1:	
			anadirOrdena(Equipos);
			break;
		case 2:
			anadirServi(Equipos);
			break;
		case 3:
			anadirImpre(Equipos);
			break;
			
		}
		} while (opc!=4);
	}


	private static void anadirImpre(Equipos[] Equipos) {
		Scanner leer = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		String pro, cod, ubicacion, tipo;
		int coste;
		Boolean protegidos=false;
		
		System.out.println("Dime el codigo alfanumerico");
		cod=leer.nextLine();
		System.out.println("Dime la ubicacion");
		ubicacion=leer.nextLine();
		System.out.println("Dime el coste");
		coste=ler.nextInt();
		System.out.println("Dime si esta protegido");
		pro=leer.nextLine();
		System.out.println("Dime el tipo de impresora");
		tipo=leer.nextLine();
		pro = pro.toLowerCase();
		if(pro.equals("si")) {
			protegidos= true;
		}
		if(pro.equals("no")) {
			protegidos= false;
		}
		for (int i = 0; i < Equipos.length; i++) {
			if(Equipos[i]==null) {
				Equipos[i]= new Impresoras(cod, ubicacion, coste, protegidos, tipo);
			}
		}
		
	}


	private static void anadirServi(Equipos[] Equipos) {
		Scanner leer = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		String pro, cod, ubicacion, so, ano_compra;
		int coste;
		Boolean protegidos=false;
		
		System.out.println("Dime el codigo alfanumerico");
		cod=leer.nextLine();
		System.out.println("Dime la ubicacion");
		ubicacion=leer.nextLine();
		System.out.println("Dime el coste");
		coste=ler.nextInt();
		System.out.println("Dime si esta protegido");
		pro=leer.nextLine();
		System.out.println("Dime el sistema operativo");
		so=leer.nextLine();
		System.out.println("Dime el año de compra");
		ano_compra=leer.nextLine();
		pro = pro.toLowerCase();
		if(pro.equals("si")) {
			protegidos= true;
		}
		if(pro.equals("no")) {
			protegidos= false;
		}
		for (int i = 0; i < Equipos.length; i++) {
			if(Equipos[i]==null) {
				Equipos[i]= new Servidores(cod, ubicacion, coste, protegidos, so, ano_compra); 
			}
		}
		
	}


	private static void anadirOrdena(Equipos[] Equipos) {
		Scanner leer = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		String pro, cod, ubicacion, so, tipo;
		int coste;
		Boolean protegidos=false;
		
		System.out.println("Dime el codigo alfanumerico");
		cod=leer.nextLine();
		System.out.println("Dime la ubicacion");
		ubicacion=leer.nextLine();
		System.out.println("Dime el coste");
		coste=ler.nextInt();
		System.out.println("Dime si esta protegido");
		pro=leer.nextLine();
		System.out.println("Dime el sistema operativo");
		so=leer.nextLine();
		System.out.println("Dime el tipo");
		tipo=leer.nextLine();
		pro = pro.toLowerCase();
		
		if(pro.equals("si")) {
			protegidos= true;
		}
		if(pro.equals("no")) {
			protegidos= false;
		}
		for (int i = 0; i < Equipos.length; i++) {
			if(Equipos[i]==null) {
				Equipos[i]= new Ordenadores(cod, ubicacion, coste, protegidos, so, tipo);
			}
		}
	}


	private static int pintaMenuEquipo() {
		int opc;
		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("1 - Añadir nueva Ordenador");
			System.out.println("2 - Añadir nueva Servidor"); 
			System.out.println("3 - Añadir nueva Impresora");
			System.out.println("4 - Salir");

			opc = leer.nextInt();

			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				System.out.println("ERROR");
				break;
			}
		} while ((opc < 1) || (opc > 4));

		return opc;
		
	}


	
	public static void proteger(Equipos[] Equipos) {
		Scanner leer = new Scanner(System.in);
		String cod;
		System.out.println("dime un codigo");
		cod=leer.nextLine();
		for (int i = 0; i < Equipos.length; i++) {
			if(Equipos[i]!=null) {
				String p = Equipos[i].getCod();
				if (p.equals(cod)) {
					Equipos[i].setProtegidos(true);
				}
			}
		}
		
	}
	
	public static void guardarDatos(Equipos[] Equipos) {
		File f = new File("recursos/dispositivos.dat");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 ObjectOutputStream escribir = new ObjectOutputStream(fo)){
			escribir.writeObject(Equipos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Equipos> cargarEquiposDinamico() {
		File f = new File("recursos/dispositivos.dat");
		ArrayList<Equipos> Equipos = new ArrayList<>();

		if (!f.exists()) {
			try {
				f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
		try (FileInputStream fo = new FileInputStream(f); ObjectInputStream leer = new ObjectInputStream(fo)){
			while (true) {
				Equipos.add((Equipos) leer.readObject());
			}} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	return Equipos;
	}
	
	public static void borrarInformacion() {
		File f = new File("recursos/dispositivos.txt");
		
	
		
		if (f.exists()) {
			f.delete();
		}
	}
}
