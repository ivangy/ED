package Ejercicio_ficheros_binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class IODatos {
	public static void escribirDatos() {
		File f = new File("ventas.dat");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}}
			
			Ventas vVentas[] = new Ventas[10];
			try (FileOutputStream fo = new FileOutputStream(f);
					DataOutputStream escribir = new DataOutputStream(fo);){
				Scanner leer= new Scanner(System.in);
				System.out.println("Dime cuantas ventas quieres añadir");
				int num=leer.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("Dime el cliente");
					String cli=leer.next();
					System.out.println("Dime el producto");
					int produc=leer.nextInt();
					System.out.println("Dime el cantidad");
					int cant=leer.nextInt();
					System.out.println("Dime el precioUnitario");
					double preUni=leer.nextDouble();
					vVentas[i]= new Ventas(cli, produc, cant, preUni);
				}

					for (int i = 0; i < vVentas.length; i++) {
						escribir.writeUTF(vVentas[i].getCliente());
						escribir.writeInt(vVentas[i].getProducto());
						escribir.writeInt(vVentas[i].getCantidad());
						escribir.writeDouble(vVentas[i].getPrecioUnitario());
					}
					
				} catch (FileNotFoundException e) {
					System.out.println("Fin de lectura del fichero"); 
				} catch (IOException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				}
		
	}
	
	public static void leerDatos(String ruta) {
		Ventas vVentas[] = new Ventas[10];
		FileInputStream fis = null;
        DataInputStream entrada = null;
        String cliente;
        int producto, cantidad, j=0;
        double precioUnitario;
        try {
            fis = new FileInputStream("ventas.dat");
            entrada = new DataInputStream(fis);
            while (true) {
            cliente = entrada.readUTF();                           
            producto = entrada.readInt(); 
            cantidad = entrada.readInt();
            precioUnitario= entrada.readDouble();
            
            vVentas[j]=new Ventas(cliente, producto, cantidad, precioUnitario);
            System.out.print(vVentas[j].getCliente()+ " ");
            System.out.print(vVentas[j].getProducto()+ " ");
            System.out.print(vVentas[j].getCantidad()+" ");
            System.out.print(vVentas[j].getPrecioUnitario()+" ");
            System.out.println(" ");
            j++;
			}
            
        } catch (FileNotFoundException e) {
			// TODO Bloque catch generado automáticamente
        	System.out.println("Fin de lectura del fichero");  
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			System.out.println("Fin de lectura del fichero");  
		}
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println("Fin de lectura del fichero");                                                       
            }
        }}
}
