package Password;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;


public class IODatos {
public static void guardarDatos(String rutaFichero, Password[] datos) {
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 DataOutputStream escribir = new DataOutputStream(fo)){
			
			for (Password p : datos) {
				if (p!=null) {
					escribir.writeUTF(p.getUsuario());
					escribir.writeInt(p.getPassword());
					escribir.writeBoolean(p.isSegura());
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public static void leerDatos(String ruta) {
		Password vPassword[] = new Password[10];
		FileInputStream fis = null;
        DataInputStream entrada = null;
        String usuario;
        int password, j=0;
        boolean segura;
        try {
            fis = new FileInputStream("pass.dat");
            entrada = new DataInputStream(fis);
            while (true) {
			usuario = entrada.readUTF();                           
            password = entrada.readInt(); 
            segura = entrada.readBoolean();
            //System.out.println(usuario+" "+ password+" "+ segura);
            vPassword[j]=new Password(usuario, password, segura);
            System.out.print(vPassword[j].getUsuario()+ " ");
            System.out.print(vPassword[j].getPassword()+ " ");
            System.out.print(vPassword[j].isSegura());
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
